package com.yahoo.sketches.quantiles;

import java.util.Arrays;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class ItemsUpdateImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private ItemsUpdateImpl() {
    }

    static <T> void maybeGrowLevels(final ItemsSketch<T> sketch, final long newN) {
        int i;
        int k = sketch.getK();
        int iComputeNumLevelsNeeded = Util.computeNumLevelsNeeded(k, newN);
        if (iComputeNumLevelsNeeded != 0 && (i = (iComputeNumLevelsNeeded + 2) * k) > sketch.getCombinedBufferAllocatedCount()) {
            sketch.combinedBuffer_ = Arrays.copyOf(sketch.getCombinedBuffer(), i);
            sketch.combinedBufferItemCapacity_ = i;
        }
    }

    static <T> void inPlacePropagateCarry(final int startingLevel, final T[] sizeKBuf, final int sizeKStart, final T[] size2KBuf, final int size2KStart, final boolean doUpdateVersion, final ItemsSketch<T> sketch) {
        Object[] combinedBuffer = sketch.getCombinedBuffer();
        long bitPattern = sketch.getBitPattern();
        int k = sketch.getK();
        int iLowestZeroBitStartingAt = Util.lowestZeroBitStartingAt(bitPattern, startingLevel);
        if (doUpdateVersion) {
            zipSize2KBuffer(size2KBuf, size2KStart, combinedBuffer, (iLowestZeroBitStartingAt + 2) * k, k);
        } else {
            System.arraycopy(sizeKBuf, sizeKStart, combinedBuffer, (iLowestZeroBitStartingAt + 2) * k, k);
        }
        int i = startingLevel;
        while (i < iLowestZeroBitStartingAt) {
            int i2 = (i + 2) * k;
            int i3 = (iLowestZeroBitStartingAt + 2) * k;
            int i4 = i;
            mergeTwoSizeKBuffers(combinedBuffer, i2, combinedBuffer, i3, size2KBuf, size2KStart, k, sketch.getComparator());
            zipSize2KBuffer(size2KBuf, size2KStart, combinedBuffer, i3, k);
            Arrays.fill(combinedBuffer, i2, (i4 + 3) * k, (Object) null);
            i = i4 + 1;
            iLowestZeroBitStartingAt = iLowestZeroBitStartingAt;
            bitPattern = bitPattern;
        }
        sketch.bitPattern_ = bitPattern + (1 << startingLevel);
    }

    private static void zipSize2KBuffer(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        int i4 = i3 + i2;
        int i5 = i + (ItemsSketch.rand.nextBoolean() ? 1 : 0);
        while (i2 < i4) {
            objArr2[i2] = objArr[i5];
            i5 += 2;
            i2++;
        }
    }

    private static <T> void mergeTwoSizeKBuffers(final T[] keySrc1, final int arrStart1, final T[] keySrc2, final int arrStart2, final T[] keyDst, final int arrStart3, final int k, final Comparator<? super T> comparator) {
        int i = arrStart1 + k;
        int i2 = k + arrStart2;
        while (arrStart1 < i && arrStart2 < i2) {
            if (comparator.compare(keySrc2[arrStart2], keySrc1[arrStart1]) < 0) {
                keyDst[arrStart3] = keySrc2[arrStart2];
                arrStart3++;
                arrStart2++;
            } else {
                keyDst[arrStart3] = keySrc1[arrStart1];
                arrStart3++;
                arrStart1++;
            }
        }
        if (arrStart1 < i) {
            System.arraycopy(keySrc1, arrStart1, keyDst, arrStart3, i - arrStart1);
        } else {
            System.arraycopy(keySrc1, arrStart2, keyDst, arrStart3, i2 - arrStart2);
        }
    }
}
