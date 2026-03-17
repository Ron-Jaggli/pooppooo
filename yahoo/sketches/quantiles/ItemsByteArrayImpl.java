package com.yahoo.sketches.quantiles;

import com.yahoo.memory.WritableMemory;
import com.yahoo.sketches.ArrayOfItemsSerDe;
import com.yahoo.sketches.Family;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class ItemsByteArrayImpl {
    private ItemsByteArrayImpl() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> byte[] toByteArray(final ItemsSketch<T> sketch, final boolean ordered, final ArrayOfItemsSerDe<T> serDe) {
        boolean zIsEmpty = sketch.isEmpty();
        int i = (ordered ? 16 : 0) | (zIsEmpty ? 4 : 0) | 8;
        if (zIsEmpty) {
            byte[] bArr = new byte[8];
            insertPre0(WritableMemory.wrap(bArr), 1, i, sketch.getK());
            return bArr;
        }
        byte[] bArrSerializeToByteArray = serDe.serializeToByteArray(combinedBufferToItemsArray(sketch, ordered));
        byte[] bArr2 = new byte[bArrSerializeToByteArray.length + 16];
        WritableMemory writableMemoryWrap = WritableMemory.wrap(bArr2);
        insertPre0(writableMemoryWrap, 2, i, sketch.getK());
        PreambleUtil.insertN(writableMemoryWrap, sketch.getN());
        writableMemoryWrap.putByteArray(16L, bArrSerializeToByteArray, 0, bArrSerializeToByteArray.length);
        return bArr2;
    }

    private static <T> T[] combinedBufferToItemsArray(ItemsSketch<T> itemsSketch, boolean z) {
        int retainedItems = itemsSketch.getRetainedItems();
        T minValue = itemsSketch.getMinValue();
        T[] tArr = (T[]) ((Object[]) Array.newInstance(minValue.getClass(), retainedItems + 2));
        int i = 0;
        tArr[0] = minValue;
        tArr[1] = itemsSketch.getMaxValue();
        int baseBufferCount = itemsSketch.getBaseBufferCount();
        Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        System.arraycopy(combinedBuffer, 0, tArr, 2, baseBufferCount);
        long bitPattern = itemsSketch.getBitPattern();
        if (bitPattern > 0) {
            int k = itemsSketch.getK();
            int i2 = baseBufferCount + 2;
            while (bitPattern != 0) {
                if ((1 & bitPattern) > 0) {
                    System.arraycopy(combinedBuffer, (i + 2) * k, tArr, i2, k);
                    i2 += k;
                }
                i++;
                bitPattern >>>= 1;
            }
        }
        if (z) {
            Arrays.sort(tArr, 2, baseBufferCount + 2, itemsSketch.getComparator());
        }
        return tArr;
    }

    private static void insertPre0(final WritableMemory wmem, final int preLongs, final int flags, final int k) {
        PreambleUtil.insertPreLongs(wmem, preLongs);
        PreambleUtil.insertSerVer(wmem, 3);
        PreambleUtil.insertFamilyID(wmem, Family.QUANTILES.getID());
        PreambleUtil.insertFlags(wmem, flags);
        PreambleUtil.insertK(wmem, k);
    }
}
