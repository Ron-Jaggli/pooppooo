package com.yahoo.sketches.quantiles;

import com.aheaditec.talsec.security.AbstractC0023h;
import com.instacart.truetime.sntp.SntpImpl;
import com.yahoo.memory.Memory;
import com.yahoo.sketches.ArrayOfItemsSerDe;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class ItemsUnion<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final Comparator<? super T> comparator_;
    protected ItemsSketch<T> gadget_;
    protected final int maxK_;

    private ItemsUnion(final int maxK, final Comparator<? super T> comparator, final ItemsSketch<T> gadget) {
        this.maxK_ = maxK;
        this.comparator_ = comparator;
        this.gadget_ = gadget;
    }

    public static <T> ItemsUnion<T> newInstance(final Comparator<? super T> comparator) {
        return new ItemsUnion<>(AbstractC0023h.n, comparator, null);
    }

    public static <T> ItemsUnion<T> newInstance(final int maxK, final Comparator<? super T> comparator) {
        return new ItemsUnion<>(maxK, comparator, null);
    }

    public static <T> ItemsUnion<T> heapify(final Memory srcMem, final Comparator<? super T> comparator, final ArrayOfItemsSerDe<T> serDe) {
        ItemsSketch itemsSketchHeapify = ItemsSketch.heapify(srcMem, comparator, serDe);
        return new ItemsUnion<>(itemsSketchHeapify.getK(), itemsSketchHeapify.getComparator(), itemsSketchHeapify);
    }

    public static <T> ItemsUnion<T> newInstance(final ItemsSketch<T> sketch) {
        return new ItemsUnion<>(sketch.getK(), sketch.getComparator(), ItemsSketch.copy(sketch));
    }

    public void update(final ItemsSketch<T> sketchIn) {
        this.gadget_ = updateLogic(this.maxK_, this.comparator_, this.gadget_, sketchIn);
    }

    public void update(final Memory srcMem, final ArrayOfItemsSerDe<T> serDe) {
        this.gadget_ = updateLogic(this.maxK_, this.comparator_, this.gadget_, ItemsSketch.heapify(srcMem, this.comparator_, serDe));
    }

    public void update(final T dataItem) {
        if (dataItem == null) {
            return;
        }
        if (this.gadget_ == null) {
            this.gadget_ = ItemsSketch.newInstance(this.maxK_, this.comparator_);
        }
        this.gadget_.update(dataItem);
    }

    public ItemsSketch<T> getResult() {
        ItemsSketch<T> itemsSketch = this.gadget_;
        if (itemsSketch == null) {
            return ItemsSketch.newInstance(this.maxK_, this.comparator_);
        }
        return ItemsSketch.copy(itemsSketch);
    }

    public ItemsSketch<T> getResultAndReset() {
        ItemsSketch<T> itemsSketch = this.gadget_;
        if (itemsSketch == null) {
            return null;
        }
        this.gadget_ = null;
        return itemsSketch;
    }

    public void reset() {
        this.gadget_ = null;
    }

    public boolean isEmpty() {
        ItemsSketch<T> itemsSketch = this.gadget_;
        return itemsSketch == null || itemsSketch.isEmpty();
    }

    public boolean isDirect() {
        ItemsSketch<T> itemsSketch = this.gadget_;
        return itemsSketch != null && itemsSketch.isDirect();
    }

    public int getMaxK() {
        return this.maxK_;
    }

    public int getEffectiveK() {
        ItemsSketch<T> itemsSketch = this.gadget_;
        return itemsSketch != null ? itemsSketch.getK() : this.maxK_;
    }

    public String toString() {
        return toString(true, false);
    }

    public String toString(final boolean sketchSummary, final boolean dataDetail) {
        StringBuilder sb = new StringBuilder();
        String simpleName = getClass().getSimpleName();
        String str = String.format("%,d", Integer.valueOf(getMaxK()));
        sb.append(Util.LS).append("### Quantiles ").append(simpleName).append(com.yahoo.sketches.Util.LS);
        sb.append("   maxK                         : ").append(str);
        ItemsSketch<T> itemsSketch = this.gadget_;
        if (itemsSketch == null) {
            sb.append(ItemsSketch.newInstance(this.maxK_, this.comparator_).toString());
            return sb.toString();
        }
        sb.append(itemsSketch.toString(sketchSummary, dataDetail));
        return sb.toString();
    }

    public byte[] toByteArray(final ArrayOfItemsSerDe<T> serDe) {
        ItemsSketch<T> itemsSketch = this.gadget_;
        if (itemsSketch == null) {
            return ItemsSketch.newInstance(this.maxK_, this.comparator_).toByteArray(serDe);
        }
        return itemsSketch.toByteArray(serDe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> ItemsSketch<T> updateLogic(int i, Comparator<? super T> comparator, ItemsSketch<T> itemsSketch, ItemsSketch<T> itemsSketch2) {
        char c;
        char c2;
        char c3;
        ItemsSketch<T> itemsSketchCopy;
        int i2 = 0;
        if (itemsSketch == 0) {
            c = 0;
        } else {
            c = itemsSketch.isEmpty() ? (char) 4 : '\b';
        }
        if (itemsSketch2 == null) {
            c2 = 0;
        } else {
            c2 = itemsSketch2.isEmpty() ? (char) 1 : (char) 2;
        }
        switch (c | c2) {
            case 0:
            case 3:
            case SntpImpl.RESPONSE_INDEX_RESPONSE_TICKS /* 7 */:
            default:
                c3 = 0;
                break;
            case 1:
                c3 = 4;
                break;
            case 2:
                c3 = 2;
                break;
            case 4:
            case SntpImpl.RESPONSE_INDEX_DISPERSION /* 5 */:
            case 8:
            case 9:
                c3 = 1;
                break;
            case SntpImpl.RESPONSE_INDEX_STRATUM /* 6 */:
            case 10:
                c3 = 3;
                break;
        }
        if (c3 != 0) {
            if (c3 == 1) {
                return itemsSketch;
            }
            if (c3 != 2) {
                if (c3 != 3) {
                    if (c3 == 4) {
                        return ItemsSketch.newInstance(Math.min(i, itemsSketch2.getK()), comparator);
                    }
                } else {
                    if (!itemsSketch2.isEstimationMode()) {
                        int baseBufferCount = itemsSketch2.getBaseBufferCount();
                        Object[] combinedBuffer = itemsSketch2.getCombinedBuffer();
                        while (i2 < baseBufferCount) {
                            itemsSketch.update(combinedBuffer[i2]);
                            i2++;
                        }
                        return itemsSketch;
                    }
                    if (itemsSketch.getK() <= itemsSketch2.getK()) {
                        ItemsMergeImpl.mergeInto(itemsSketch2, itemsSketch);
                        return itemsSketch;
                    }
                    itemsSketchCopy = ItemsSketch.copy(itemsSketch2);
                    ItemsMergeImpl.mergeInto(itemsSketch, itemsSketchCopy);
                }
            } else {
                if (!itemsSketch2.isEstimationMode()) {
                    ItemsSketch<T> itemsSketch3 = (ItemsSketch<T>) ItemsSketch.newInstance(i, comparator);
                    int baseBufferCount2 = itemsSketch2.getBaseBufferCount();
                    Object[] combinedBuffer2 = itemsSketch2.getCombinedBuffer();
                    while (i2 < baseBufferCount2) {
                        itemsSketch3.update(combinedBuffer2[i2]);
                        i2++;
                    }
                    return itemsSketch3;
                }
                if (i < itemsSketch2.getK()) {
                    itemsSketchCopy = itemsSketch2.downSample(i);
                } else {
                    itemsSketchCopy = ItemsSketch.copy(itemsSketch2);
                }
            }
            return itemsSketchCopy;
        }
        return null;
    }
}
