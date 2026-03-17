package com.yahoo.sketches.quantiles;

import com.yahoo.sketches.SketchesArgumentException;
import java.util.Arrays;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class ItemsMergeImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private ItemsMergeImpl() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T] */
    static <T> void mergeInto(ItemsSketch<T> itemsSketch, ItemsSketch<T> itemsSketch2) {
        int k = itemsSketch.getK();
        int k2 = itemsSketch2.getK();
        long n = itemsSketch.getN();
        long n2 = itemsSketch2.getN();
        if (k != k2) {
            downSamplingMergeInto(itemsSketch, itemsSketch2);
            return;
        }
        Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        long j = n2 + n;
        for (int i = 0; i < itemsSketch.getBaseBufferCount(); i++) {
            itemsSketch2.update(combinedBuffer[i]);
        }
        ItemsUpdateImpl.maybeGrowLevels(itemsSketch2, j);
        Object[] objArr = new Object[k2 * 2];
        int i2 = 0;
        for (long bitPattern = itemsSketch.getBitPattern(); bitPattern != 0; bitPattern >>>= 1) {
            if ((1 & bitPattern) > 0) {
                ItemsUpdateImpl.inPlacePropagateCarry(i2, combinedBuffer, (i2 + 2) * k2, objArr, 0, false, itemsSketch2);
            }
            i2++;
        }
        itemsSketch2.n_ = j;
        T maxValue = itemsSketch.getMaxValue();
        T minValue = itemsSketch.getMinValue();
        Object obj = (Object) itemsSketch2.getMaxValue();
        Object obj2 = (Object) itemsSketch2.getMinValue();
        if (maxValue != 0 && obj != null) {
            int iCompare = itemsSketch.getComparator().compare(maxValue, obj);
            ?? r0 = maxValue;
            if (iCompare <= 0) {
                r0 = (T) obj;
            }
            itemsSketch2.maxValue_ = (T) r0;
        } else if (obj == null) {
            itemsSketch2.maxValue_ = maxValue;
        }
        if (minValue == 0 || obj2 == null) {
            if (obj2 == null) {
                itemsSketch2.minValue_ = minValue;
            }
        } else {
            int iCompare2 = itemsSketch.getComparator().compare(minValue, obj2);
            ?? r1 = minValue;
            if (iCompare2 > 0) {
                r1 = (T) obj2;
            }
            itemsSketch2.minValue_ = (T) r1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T] */
    static <T> void downSamplingMergeInto(ItemsSketch<T> itemsSketch, ItemsSketch<T> itemsSketch2) {
        Object[] objArr;
        int k = itemsSketch2.getK();
        int k2 = itemsSketch.getK();
        if (k2 % k != 0) {
            throw new SketchesArgumentException("source.getK() must equal target.getK() * 2^(nonnegative integer).");
        }
        int i = k2 / k;
        com.yahoo.sketches.Util.checkIfPowerOf2(i, "source.getK()/target.getK() ratio");
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        Object[] combinedBuffer2 = itemsSketch.getCombinedBuffer();
        long n = itemsSketch2.getN() + itemsSketch.getN();
        for (int i2 = 0; i2 < itemsSketch.getBaseBufferCount(); i2++) {
            itemsSketch2.update(combinedBuffer2[i2]);
        }
        ItemsUpdateImpl.maybeGrowLevels(itemsSketch2, n);
        Object[] objArr2 = new Object[k * 2];
        Object[] objArr3 = new Object[k];
        int i3 = 0;
        long bitPattern = itemsSketch.getBitPattern();
        while (bitPattern != 0) {
            if ((bitPattern & 1) > 0) {
                justZipWithStride(combinedBuffer, (i3 + 2) * k2, objArr3, 0, k, i);
                objArr = objArr3;
                ItemsUpdateImpl.inPlacePropagateCarry(i3 + iNumberOfTrailingZeros, objArr3, 0, objArr2, 0, false, itemsSketch2);
            } else {
                objArr = objArr3;
            }
            i3++;
            bitPattern >>>= 1;
            objArr3 = objArr;
        }
        itemsSketch2.n_ = n;
        T maxValue = itemsSketch.getMaxValue();
        T minValue = itemsSketch.getMinValue();
        Object obj = (Object) itemsSketch2.getMaxValue();
        Object obj2 = (Object) itemsSketch2.getMinValue();
        if (maxValue != 0 && obj != null) {
            int iCompare = itemsSketch.getComparator().compare(maxValue, obj);
            ?? r0 = maxValue;
            if (iCompare <= 0) {
                r0 = (T) obj;
            }
            itemsSketch2.maxValue_ = (T) r0;
        } else if (obj == null) {
            itemsSketch2.maxValue_ = maxValue;
        }
        if (minValue == 0 || obj2 == null) {
            if (obj2 == null) {
                itemsSketch2.minValue_ = minValue;
            }
        } else {
            int iCompare2 = itemsSketch.getComparator().compare(minValue, obj2);
            ?? r1 = minValue;
            if (iCompare2 > 0) {
                r1 = (T) obj2;
            }
            itemsSketch2.minValue_ = (T) r1;
        }
    }

    private static <T> void justZipWithStride(final T[] bufSrc, final int startSrc, final T[] bufC, final int startC, final int kC, final int stride) {
        int i = kC + startC;
        int iNextInt = startSrc + ItemsSketch.rand.nextInt(stride);
        while (startC < i) {
            bufC[startC] = bufSrc[iNextInt];
            iNextInt += stride;
            startC++;
        }
    }

    static <T> void blockyTandemMergeSort(final T[] keyArr, final long[] valArr, final int arrLen, final int blkSize, final Comparator<? super T> comparator) {
        if (arrLen <= blkSize) {
            return;
        }
        int i = arrLen / blkSize;
        if (i * blkSize < arrLen) {
            i++;
        }
        blockyTandemMergeSortRecursion(Arrays.copyOf(keyArr, arrLen), Arrays.copyOf(valArr, arrLen), keyArr, valArr, 0, i, blkSize, arrLen, comparator);
    }

    private static <T> void blockyTandemMergeSortRecursion(final T[] keySrc, final long[] valSrc, final T[] keyDst, final long[] valDst, final int grpStart, final int grpLen, final int blkSize, final int arrLim, final Comparator<? super T> comparator) {
        if (grpLen == 1) {
            return;
        }
        int i = grpLen / 2;
        int i2 = grpLen - i;
        int i3 = grpStart + i;
        blockyTandemMergeSortRecursion(keyDst, valDst, keySrc, valSrc, grpStart, i, blkSize, arrLim, comparator);
        blockyTandemMergeSortRecursion(keyDst, valDst, keySrc, valSrc, i3, i2, blkSize, arrLim, comparator);
        int i4 = grpStart * blkSize;
        int i5 = i3 * blkSize;
        int i6 = i2 * blkSize;
        tandemMerge(keySrc, valSrc, i4, i * blkSize, i5, i5 + i6 > arrLim ? arrLim - i5 : i6, keyDst, valDst, i4, comparator);
    }

    private static <T> void tandemMerge(final T[] keySrc, final long[] valSrc, final int arrStart1, final int arrLen1, final int arrStart2, final int arrLen2, final T[] keyDst, final long[] valDst, final int arrStart3, final Comparator<? super T> comparator) {
        int i = arrLen1 + arrStart1;
        int i2 = arrLen2 + arrStart2;
        while (arrStart1 < i && arrStart2 < i2) {
            if (comparator.compare(keySrc[arrStart2], keySrc[arrStart1]) < 0) {
                keyDst[arrStart3] = keySrc[arrStart2];
                valDst[arrStart3] = valSrc[arrStart2];
                arrStart3++;
                arrStart2++;
            } else {
                keyDst[arrStart3] = keySrc[arrStart1];
                valDst[arrStart3] = valSrc[arrStart1];
                arrStart3++;
                arrStart1++;
            }
        }
        if (arrStart1 < i) {
            int i3 = i - arrStart1;
            System.arraycopy(keySrc, arrStart1, keyDst, arrStart3, i3);
            System.arraycopy(valSrc, arrStart1, valDst, arrStart3, i3);
        } else {
            int i4 = i2 - arrStart2;
            System.arraycopy(keySrc, arrStart2, keyDst, arrStart3, i4);
            System.arraycopy(valSrc, arrStart2, valDst, arrStart3, i4);
        }
    }
}
