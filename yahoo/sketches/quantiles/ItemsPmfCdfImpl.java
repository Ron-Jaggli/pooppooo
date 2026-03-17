package com.yahoo.sketches.quantiles;

import java.util.Arrays;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class ItemsPmfCdfImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    ItemsPmfCdfImpl() {
    }

    static <T> double[] getPMFOrCDF(final ItemsSketch<T> sketch, final T[] splitPoints, final boolean isCDF) {
        long[] jArrInternalBuildHistogram = internalBuildHistogram(splitPoints, sketch);
        int length = jArrInternalBuildHistogram.length;
        double[] dArr = new double[length];
        double n = sketch.getN();
        int i = 0;
        if (isCDF) {
            long j = 0;
            while (i < length) {
                j += jArrInternalBuildHistogram[i];
                dArr[i] = j / n;
                i++;
            }
        } else {
            while (i < length) {
                dArr[i] = jArrInternalBuildHistogram[i] / n;
                i++;
            }
        }
        return dArr;
    }

    private static <T> long[] internalBuildHistogram(final T[] splitPoints, final ItemsSketch<T> sketch) {
        Object[] combinedBuffer = sketch.getCombinedBuffer();
        int baseBufferCount = sketch.getBaseBufferCount();
        ItemsUtil.validateValues(splitPoints, sketch.getComparator());
        int length = splitPoints.length;
        long[] jArr = new long[length + 1];
        if (length < 50) {
            bilinearTimeIncrementHistogramCounters(combinedBuffer, 0, baseBufferCount, 1L, splitPoints, jArr, sketch.getComparator());
        } else {
            Arrays.sort(combinedBuffer, 0, baseBufferCount);
            linearTimeIncrementHistogramCounters(combinedBuffer, 0, baseBufferCount, 1L, splitPoints, jArr, sketch.getComparator());
        }
        long bitPattern = sketch.getBitPattern();
        int k = sketch.getK();
        int i = 0;
        long j = bitPattern;
        long j2 = 1;
        while (j != 0) {
            long j3 = j2 + j2;
            if ((1 & j) > 0) {
                linearTimeIncrementHistogramCounters(combinedBuffer, (i + 2) * k, k, j3, splitPoints, jArr, sketch.getComparator());
            }
            i++;
            j >>>= 1;
            j2 = j3;
        }
        return jArr;
    }

    static <T> void bilinearTimeIncrementHistogramCounters(final T[] samples, final int offset, final int numSamples, final long weight, final T[] splitPoints, final long[] counters, final Comparator<? super T> comparator) {
        for (int i = 0; i < numSamples; i++) {
            T t = samples[i + offset];
            int i2 = 0;
            while (i2 < splitPoints.length && comparator.compare(t, splitPoints[i2]) >= 0) {
                i2++;
            }
            counters[i2] = counters[i2] + weight;
        }
    }

    static <T> void linearTimeIncrementHistogramCounters(final T[] samples, final int offset, final int numSamples, final long weight, final T[] splitPoints, final long[] counters, final Comparator<? super T> comparator) {
        int i = 0;
        int i2 = 0;
        while (i < numSamples && i2 < splitPoints.length) {
            if (comparator.compare(samples[i + offset], splitPoints[i2]) < 0) {
                counters[i2] = counters[i2] + weight;
                i++;
            } else {
                i2++;
            }
        }
        if (i2 == splitPoints.length) {
            counters[i2] = counters[i2] + (weight * ((long) (numSamples - i)));
        }
    }
}
