package com.yahoo.sketches.quantiles;

import com.aheaditec.talsec.security.AbstractC0023h;
import com.yahoo.memory.Memory;
import com.yahoo.memory.WritableMemory;
import com.yahoo.sketches.ArrayOfItemsSerDe;
import com.yahoo.sketches.SketchesArgumentException;
import com.yahoo.sketches.quantiles.Util;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class ItemsSketch<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MIN_K = 2;
    static final int SER_VER = 3;
    public static final Random rand = new Random();
    int baseBufferCount_;
    long bitPattern_;
    int combinedBufferItemCapacity_;
    Object[] combinedBuffer_;
    private final Comparator<? super T> comparator_;
    final int k_;
    T maxValue_;
    T minValue_;
    long n_;

    public boolean isDirect() {
        return false;
    }

    private ItemsSketch(final int k, final Comparator<? super T> comparator) {
        Util.checkK(k);
        this.k_ = k;
        this.comparator_ = comparator;
    }

    public static <T> ItemsSketch<T> newInstance(final Comparator<? super T> comparator) {
        return newInstance(AbstractC0023h.n, comparator);
    }

    public static <T> ItemsSketch<T> newInstance(final int k, final Comparator<? super T> comparator) {
        ItemsSketch<T> itemsSketch = new ItemsSketch<>(k, comparator);
        int iMin = Math.min(2, k) * 2;
        itemsSketch.n_ = 0L;
        itemsSketch.combinedBufferItemCapacity_ = iMin;
        itemsSketch.combinedBuffer_ = new Object[iMin];
        itemsSketch.baseBufferCount_ = 0;
        itemsSketch.bitPattern_ = 0L;
        itemsSketch.minValue_ = null;
        itemsSketch.maxValue_ = null;
        return itemsSketch;
    }

    public static <T> ItemsSketch<T> heapify(final Memory srcMem, final Comparator<? super T> comparator, final ArrayOfItemsSerDe<T> serDe) {
        long capacity = srcMem.getCapacity();
        if (capacity < 8) {
            throw new SketchesArgumentException("Memory too small: " + capacity);
        }
        int iExtractPreLongs = PreambleUtil.extractPreLongs(srcMem);
        int iExtractSerVer = PreambleUtil.extractSerVer(srcMem);
        int iExtractFamilyID = PreambleUtil.extractFamilyID(srcMem);
        int iExtractFlags = PreambleUtil.extractFlags(srcMem);
        int iExtractK = PreambleUtil.extractK(srcMem);
        ItemsUtil.checkItemsSerVer(iExtractSerVer);
        if (iExtractSerVer != 3) {
            throw new SketchesArgumentException("Possible corruption: Invalid serialization version: " + iExtractSerVer);
        }
        if ((iExtractFlags & 8) == 0) {
            throw new SketchesArgumentException("Non-compact Memory images are not supported.");
        }
        boolean zCheckPreLongsFlagsCap = Util.checkPreLongsFlagsCap(iExtractPreLongs, iExtractFlags, capacity);
        Util.checkFamilyID(iExtractFamilyID);
        ItemsSketch<T> itemsSketchNewInstance = newInstance(iExtractK, comparator);
        if (zCheckPreLongsFlagsCap) {
            return itemsSketchNewInstance;
        }
        long jExtractN = PreambleUtil.extractN(srcMem);
        int iComputeRetainedItems = Util.computeRetainedItems(iExtractK, jExtractN) + 2;
        itemsSketchNewInstance.n_ = jExtractN;
        itemsSketchNewInstance.combinedBufferItemCapacity_ = Util.computeCombinedBufferItemCapacity(iExtractK, jExtractN);
        itemsSketchNewInstance.baseBufferCount_ = Util.computeBaseBufferItems(iExtractK, jExtractN);
        itemsSketchNewInstance.bitPattern_ = Util.computeBitPattern(iExtractK, jExtractN);
        itemsSketchNewInstance.combinedBuffer_ = new Object[itemsSketchNewInstance.combinedBufferItemCapacity_];
        long j = iExtractPreLongs * 8;
        itemsSketchNewInstance.itemsArrayToCombinedBuffer(serDe.deserializeFromMemory(srcMem.region(j, srcMem.getCapacity() - j), iComputeRetainedItems));
        return itemsSketchNewInstance;
    }

    static <T> ItemsSketch<T> copy(final ItemsSketch<T> sketch) {
        ItemsSketch<T> itemsSketchNewInstance = newInstance(sketch.k_, ((ItemsSketch) sketch).comparator_);
        itemsSketchNewInstance.n_ = sketch.n_;
        itemsSketchNewInstance.minValue_ = sketch.getMinValue();
        itemsSketchNewInstance.maxValue_ = sketch.getMaxValue();
        itemsSketchNewInstance.combinedBufferItemCapacity_ = sketch.getCombinedBufferAllocatedCount();
        itemsSketchNewInstance.baseBufferCount_ = sketch.getBaseBufferCount();
        itemsSketchNewInstance.bitPattern_ = sketch.getBitPattern();
        Object[] combinedBuffer = sketch.getCombinedBuffer();
        itemsSketchNewInstance.combinedBuffer_ = Arrays.copyOf(combinedBuffer, combinedBuffer.length);
        return itemsSketchNewInstance;
    }

    public void update(final T dataItem) {
        if (dataItem == null) {
            return;
        }
        T t = this.maxValue_;
        if (t == null || this.comparator_.compare(dataItem, t) > 0) {
            this.maxValue_ = dataItem;
        }
        T t2 = this.minValue_;
        if (t2 == null || this.comparator_.compare(dataItem, t2) < 0) {
            this.minValue_ = dataItem;
        }
        if (this.baseBufferCount_ + 1 > this.combinedBufferItemCapacity_) {
            growBaseBuffer(this);
        }
        Object[] objArr = this.combinedBuffer_;
        int i = this.baseBufferCount_;
        int i2 = i + 1;
        this.baseBufferCount_ = i2;
        objArr[i] = dataItem;
        this.n_++;
        if (i2 == this.k_ * 2) {
            ItemsUtil.processFullBaseBuffer(this);
        }
    }

    public T getQuantile(final double fraction) {
        if (fraction < 0.0d || fraction > 1.0d) {
            throw new SketchesArgumentException("Fraction cannot be less than zero or greater than 1.0");
        }
        if (fraction == 0.0d) {
            return this.minValue_;
        }
        if (fraction == 1.0d) {
            return this.maxValue_;
        }
        return constructAuxiliary().getQuantile(fraction);
    }

    public T[] getQuantiles(double[] dArr) {
        ItemsAuxiliary<T> itemsAuxiliaryConstructAuxiliary = null;
        if (isEmpty()) {
            return null;
        }
        Util.validateFractions(dArr);
        T[] tArr = (T[]) ((Object[]) Array.newInstance(this.minValue_.getClass(), dArr.length));
        for (int i = 0; i < dArr.length; i++) {
            double d = dArr[i];
            if (d == 0.0d) {
                tArr[i] = this.minValue_;
            } else if (d == 1.0d) {
                tArr[i] = this.maxValue_;
            } else {
                if (itemsAuxiliaryConstructAuxiliary == null) {
                    itemsAuxiliaryConstructAuxiliary = constructAuxiliary();
                }
                tArr[i] = itemsAuxiliaryConstructAuxiliary.getQuantile(d);
            }
        }
        return tArr;
    }

    public T[] getQuantiles(final int evenlySpaced) {
        if (isEmpty()) {
            return null;
        }
        return getQuantiles(getEvenlySpaced(evenlySpaced));
    }

    public double[] getPMF(final T[] splitPoints) {
        if (isEmpty()) {
            return null;
        }
        return ItemsPmfCdfImpl.getPMFOrCDF(this, splitPoints, false);
    }

    public double[] getCDF(final T[] splitPoints) {
        if (isEmpty()) {
            return null;
        }
        return ItemsPmfCdfImpl.getPMFOrCDF(this, splitPoints, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public double getRank(final T value) {
        if (isEmpty()) {
            return Double.NaN;
        }
        return getCDF(new Object[]{value})[0];
    }

    public int getK() {
        return this.k_;
    }

    public T getMinValue() {
        return this.minValue_;
    }

    public T getMaxValue() {
        return this.maxValue_;
    }

    public long getN() {
        return this.n_;
    }

    public double getNormalizedRankError() {
        return getNormalizedRankError(getK());
    }

    public static double getNormalizedRankError(final int k) {
        return Util.EpsilonFromK.getAdjustedEpsilon(k);
    }

    public boolean isEmpty() {
        return getN() == 0;
    }

    public boolean isEstimationMode() {
        return getN() >= ((long) this.k_) * 2;
    }

    public void reset() {
        this.n_ = 0L;
        int iMin = Math.min(2, this.k_) * 2;
        this.combinedBufferItemCapacity_ = iMin;
        this.combinedBuffer_ = new Object[iMin];
        this.baseBufferCount_ = 0;
        this.bitPattern_ = 0L;
        this.minValue_ = null;
        this.maxValue_ = null;
    }

    public byte[] toByteArray(final ArrayOfItemsSerDe<T> serDe) {
        return toByteArray(false, serDe);
    }

    public byte[] toByteArray(final boolean ordered, final ArrayOfItemsSerDe<T> serDe) {
        return ItemsByteArrayImpl.toByteArray(this, ordered, serDe);
    }

    public String toString() {
        return toString(true, false);
    }

    public String toString(final boolean sketchSummary, final boolean dataDetail) {
        return ItemsUtil.toString(sketchSummary, dataDetail, this);
    }

    public ItemsSketch<T> downSample(final int newK) {
        ItemsSketch<T> itemsSketchNewInstance = newInstance(newK, this.comparator_);
        ItemsMergeImpl.downSamplingMergeInto(this, itemsSketchNewInstance);
        return itemsSketchNewInstance;
    }

    public int getRetainedItems() {
        return Util.computeRetainedItems(getK(), getN());
    }

    public void putMemory(final WritableMemory dstMem, final ArrayOfItemsSerDe<T> serDe) {
        byte[] byteArray = toByteArray(serDe);
        long capacity = dstMem.getCapacity();
        if (capacity < byteArray.length) {
            throw new SketchesArgumentException("Destination Memory not large enough: " + capacity + " < " + byteArray.length);
        }
        dstMem.putByteArray(0L, byteArray, 0, byteArray.length);
    }

    int getBaseBufferCount() {
        return this.baseBufferCount_;
    }

    int getCombinedBufferAllocatedCount() {
        return this.combinedBufferItemCapacity_;
    }

    long getBitPattern() {
        return this.bitPattern_;
    }

    Object[] getCombinedBuffer() {
        return this.combinedBuffer_;
    }

    Comparator<? super T> getComparator() {
        return this.comparator_;
    }

    private void itemsArrayToCombinedBuffer(final T[] itemsArray) {
        int i = 0;
        this.minValue_ = itemsArray[0];
        this.maxValue_ = itemsArray[1];
        System.arraycopy(itemsArray, 2, this.combinedBuffer_, 0, this.baseBufferCount_);
        long j = this.bitPattern_;
        if (j > 0) {
            int i2 = this.baseBufferCount_ + 2;
            while (j != 0) {
                if ((1 & j) > 0) {
                    Object[] objArr = this.combinedBuffer_;
                    int i3 = this.k_;
                    System.arraycopy(itemsArray, i2, objArr, (i + 2) * i3, i3);
                    i2 += this.k_;
                }
                i++;
                j >>>= 1;
            }
        }
    }

    private ItemsAuxiliary<T> constructAuxiliary() {
        return new ItemsAuxiliary<>(this);
    }

    private static double[] getEvenlySpaced(final int n) {
        if (n <= 0) {
            throw new SketchesArgumentException("n must be > zero.");
        }
        double[] dArr = new double[n];
        dArr[0] = 0.0d;
        for (int i = 1; i < n; i++) {
            dArr[i] = ((double) i) / ((double) (n - 1));
        }
        if (n > 1) {
            dArr[n - 1] = 1.0d;
        }
        return dArr;
    }

    private static <T> void growBaseBuffer(final ItemsSketch<T> sketch) {
        Object[] combinedBuffer = sketch.getCombinedBuffer();
        int iMax = Math.max(Math.min(sketch.getK() * 2, sketch.getCombinedBufferAllocatedCount() * 2), 1);
        sketch.combinedBufferItemCapacity_ = iMax;
        sketch.combinedBuffer_ = Arrays.copyOf(combinedBuffer, iMax);
    }
}
