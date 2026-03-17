package com.yahoo.sketches.quantiles;

import java.util.Arrays;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class ItemsAuxiliary<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final long[] auxCumWtsArr_;
    final long auxN_;
    final Object[] auxSamplesArr_;

    ItemsAuxiliary(final ItemsSketch<T> qs) {
        int k = qs.getK();
        long n = qs.getN();
        long bitPattern = qs.getBitPattern();
        Object[] combinedBuffer = qs.getCombinedBuffer();
        int baseBufferCount = qs.getBaseBufferCount();
        int retainedItems = qs.getRetainedItems();
        Object[] objArr = new Object[retainedItems];
        int i = retainedItems + 1;
        long[] jArr = new long[i];
        populateFromItemsSketch(k, n, bitPattern, combinedBuffer, baseBufferCount, retainedItems, objArr, jArr, qs.getComparator());
        ItemsMergeImpl.blockyTandemMergeSort(objArr, jArr, retainedItems, k, qs.getComparator());
        long j = 0;
        int i2 = 0;
        while (i2 < i) {
            long j2 = jArr[i2] + j;
            jArr[i2] = j;
            i2++;
            j = j2;
        }
        this.auxN_ = n;
        this.auxSamplesArr_ = objArr;
        this.auxCumWtsArr_ = jArr;
    }

    T getQuantile(final double phi) {
        long j = this.auxN_;
        if (j <= 0) {
            return null;
        }
        return approximatelyAnswerPositionalQuery(posOfPhi(phi, j));
    }

    static long posOfPhi(final double phi, final long n) {
        long jFloor = (long) Math.floor(phi * n);
        return jFloor == n ? n - 1 : jFloor;
    }

    private T approximatelyAnswerPositionalQuery(long j) {
        return (T) this.auxSamplesArr_[chunkContainingPos(this.auxCumWtsArr_, j)];
    }

    private static final <T> void populateFromItemsSketch(final int k, final long n, final long bitPattern, final T[] combinedBuffer, final int baseBufferCount, final int numSamples, final T[] itemsArr, final long[] cumWtsArr, final Comparator<? super T> comparator) {
        long j = 1;
        int i = 0;
        int i2 = 0;
        for (long j2 = bitPattern; j2 != 0; j2 >>>= 1) {
            j *= 2;
            if ((j2 & 1) > 0) {
                int i3 = (i2 + 2) * k;
                for (int i4 = 0; i4 < k; i4++) {
                    itemsArr[i] = combinedBuffer[i4 + i3];
                    cumWtsArr[i] = j;
                    i++;
                }
            }
            i2++;
        }
        int i5 = i;
        for (int i6 = 0; i6 < baseBufferCount; i6++) {
            itemsArr[i5] = combinedBuffer[i6];
            cumWtsArr[i5] = 1;
            i5++;
        }
        Arrays.sort(itemsArr, i, numSamples, comparator);
        cumWtsArr[numSamples] = 0;
    }

    static int chunkContainingPos(final long[] arr, final long pos) {
        int length = arr.length - 1;
        long j = arr[length];
        return searchForChunkContainingPos(arr, pos, 0, length);
    }

    private static int searchForChunkContainingPos(final long[] arr, final long pos, final int l, final int r) {
        if (l + 1 == r) {
            return l;
        }
        int i = ((r - l) / 2) + l;
        if (arr[i] <= pos) {
            return searchForChunkContainingPos(arr, pos, i, r);
        }
        return searchForChunkContainingPos(arr, pos, l, i);
    }
}
