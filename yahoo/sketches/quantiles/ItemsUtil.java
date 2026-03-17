package com.yahoo.sketches.quantiles;

import com.yahoo.sketches.SketchesArgumentException;
import com.yahoo.sketches.quantiles.Util;
import java.util.Arrays;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class ItemsUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ITEMS_SER_VER = 3;
    static final int PRIOR_ITEMS_SER_VER = 2;

    private ItemsUtil() {
    }

    static void checkItemsSerVer(final int serVer) {
        if (serVer != 3 && serVer != 2) {
            throw new SketchesArgumentException("Possible corruption: Invalid Serialization Version: " + serVer);
        }
    }

    static final <T> void validateValues(final T[] values, final Comparator<? super T> comparator) {
        T t;
        int length = values.length - 1;
        int i = 0;
        while (i < length) {
            T t2 = values[i];
            if (t2 == null || (t = values[(i = i + 1)]) == null || comparator.compare(t2, t) >= 0) {
                throw new SketchesArgumentException("Values must be unique, monotonically increasing and not null.");
            }
        }
    }

    static <T> void processFullBaseBuffer(final ItemsSketch<T> sketch) {
        int baseBufferCount = sketch.getBaseBufferCount();
        ItemsUpdateImpl.maybeGrowLevels(sketch, sketch.getN());
        Object[] combinedBuffer = sketch.getCombinedBuffer();
        Arrays.sort(combinedBuffer, 0, baseBufferCount);
        ItemsUpdateImpl.inPlacePropagateCarry(0, null, 0, combinedBuffer, 0, true, sketch);
        sketch.baseBufferCount_ = 0;
        Arrays.fill(combinedBuffer, 0, sketch.getK() * 2, (Object) null);
    }

    static <T> String toString(final boolean sketchSummary, final boolean dataDetail, final ItemsSketch<T> sketch) {
        StringBuilder sb = new StringBuilder();
        String simpleName = sketch.getClass().getSimpleName();
        int baseBufferCount = sketch.getBaseBufferCount();
        int combinedBufferAllocatedCount = sketch.getCombinedBufferAllocatedCount();
        int k = sketch.getK();
        long bitPattern = sketch.getBitPattern();
        if (dataDetail) {
            sb.append(Util.LS).append("### ").append(simpleName).append(" DATA DETAIL: ").append(Util.LS);
            Object[] combinedBuffer = sketch.getCombinedBuffer();
            sb.append("   BaseBuffer   :");
            if (baseBufferCount > 0) {
                for (int i = 0; i < baseBufferCount; i++) {
                    sb.append(' ').append(combinedBuffer[i]);
                }
            }
            sb.append(Util.LS);
            int i2 = k * 2;
            if (combinedBufferAllocatedCount > i2) {
                sb.append("   Valid | Level");
                int i3 = i2;
                while (i3 < combinedBufferAllocatedCount) {
                    if (i3 % k == 0) {
                        int i4 = i3 > i2 ? (i3 - i2) / k : 0;
                        sb.append(Util.LS).append("   ").append(((1 << i4) & bitPattern) > 0 ? "    T  " : "    F  ").append(" ").append(String.format("%5d", Integer.valueOf(i4))).append(":");
                    }
                    sb.append(' ').append(combinedBuffer[i3]);
                    i3++;
                }
                sb.append(Util.LS);
            }
            sb.append("### END DATA DETAIL").append(Util.LS);
        }
        if (sketchSummary) {
            long n = sketch.getN();
            String str = String.format("%,d", Long.valueOf(n));
            int iComputeNumLevelsNeeded = Util.computeNumLevelsNeeded(k, n);
            String str2 = String.format("%,d", Integer.valueOf(combinedBufferAllocatedCount));
            int i5 = sketch.isEmpty() ? 8 : 16;
            String str3 = String.format("%.3f%%", Double.valueOf(Util.EpsilonFromK.getAdjustedEpsilon(k) * 100.0d));
            String str4 = String.format("%,d", Integer.valueOf(sketch.getRetainedItems()));
            sb.append(Util.LS).append("### ").append(simpleName).append(" SUMMARY: ").append(Util.LS);
            sb.append("   K                            : ").append(k).append(Util.LS);
            sb.append("   N                            : ").append(str).append(Util.LS);
            sb.append("   BaseBufferCount              : ").append(baseBufferCount).append(Util.LS);
            sb.append("   CombinedBufferAllocatedCount : ").append(str2).append(Util.LS);
            sb.append("   Total Levels                 : ").append(iComputeNumLevelsNeeded).append(Util.LS);
            sb.append("   Valid Levels                 : ").append(Util.computeValidLevels(bitPattern)).append(Util.LS);
            sb.append("   Level Bit Pattern            : ").append(Long.toBinaryString(bitPattern)).append(Util.LS);
            sb.append("   Valid Samples                : ").append(str4).append(Util.LS);
            sb.append("   Preamble Bytes               : ").append(i5).append(Util.LS);
            sb.append("   Normalized Rank Error        : ").append(str3).append(Util.LS);
            sb.append("   Min Value                    : ").append(sketch.getMinValue()).append(Util.LS);
            sb.append("   Max Value                    : ").append(sketch.getMaxValue()).append(Util.LS);
            sb.append("### END SKETCH SUMMARY").append(Util.LS);
        }
        return sb.toString();
    }
}
