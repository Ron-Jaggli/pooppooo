package com.yahoo.sketches.quantiles;

import com.yahoo.memory.Memory;
import com.yahoo.sketches.Family;
import com.yahoo.sketches.SketchesArgumentException;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class Util {
    static final String LS = System.getProperty("line.separator");
    static final char TAB = '\t';

    static int lowestZeroBitStartingAt(final long bits, final int startingBit) {
        int i = startingBit & 63;
        long j = bits >>> i;
        while ((1 & j) != 0) {
            j >>>= 1;
            i++;
        }
        return i;
    }

    private Util() {
    }

    static void checkK(final int k) {
        if (k < 2 || k >= 65536 || !com.yahoo.sketches.Util.isPowerOf2(k)) {
            throw new SketchesArgumentException("K must be > 1 and < 65536 and Power of 2: " + k);
        }
    }

    static void checkFamilyID(final int familyID) {
        Family familyIdToFamily = Family.idToFamily(familyID);
        if (!familyIdToFamily.equals(Family.QUANTILES)) {
            throw new SketchesArgumentException("Possible corruption: Invalid Family: " + familyIdToFamily.toString());
        }
    }

    static boolean checkPreLongsFlagsCap(final int preambleLongs, final int flags, final long memCapBytes) {
        boolean z = (flags & 4) > 0;
        int minPreLongs = Family.QUANTILES.getMinPreLongs();
        int maxPreLongs = Family.QUANTILES.getMaxPreLongs();
        if ((preambleLongs != minPreLongs || !z) && (preambleLongs != maxPreLongs || z)) {
            throw new SketchesArgumentException("Possible corruption: PreambleLongs inconsistent with empty state: " + preambleLongs);
        }
        checkHeapFlags(flags);
        if (memCapBytes >= (preambleLongs << 3)) {
            return z;
        }
        throw new SketchesArgumentException("Possible corruption: Insufficient capacity for preamble: " + memCapBytes);
    }

    static void checkHeapFlags(final int flags) {
        if ((flags & (-31)) > 0) {
            throw new SketchesArgumentException("Possible corruption: Invalid flags field: " + Integer.toBinaryString(flags));
        }
    }

    static boolean checkIsCompactMemory(final Memory srcMem) {
        return (PreambleUtil.extractFlags(srcMem) & 10) > 0;
    }

    static final void validateFractions(final double[] fractions) {
        if (fractions == null) {
            throw new SketchesArgumentException("Fractions cannot be null.");
        }
        if (fractions.length == 0) {
            return;
        }
        double d = fractions[0];
        double d2 = fractions[fractions.length - 1];
        if (d < 0.0d || d2 > 1.0d) {
            throw new SketchesArgumentException("A fraction cannot be less than zero or greater than 1.0");
        }
        validateValues(fractions);
    }

    static final void validateValues(final double[] values) {
        if (values == null) {
            throw new SketchesArgumentException("Values cannot be null.");
        }
        int length = values.length - 1;
        int i = 0;
        while (i < length) {
            double d = values[i];
            i++;
            if (d >= values[i]) {
                throw new SketchesArgumentException("Values must be unique, monotonically increasing and not NaN.");
            }
        }
    }

    static int computeRetainedItems(final int k, final long n) {
        return computeBaseBufferItems(k, n) + (computeValidLevels(computeBitPattern(k, n)) * k);
    }

    static int computeCombinedBufferItemCapacity(final int k, final long n) {
        int iComputeNumLevelsNeeded = computeNumLevelsNeeded(k, n);
        return iComputeNumLevelsNeeded == 0 ? Math.max(4, com.yahoo.sketches.Util.ceilingPowerOf2(computeBaseBufferItems(k, n))) : (iComputeNumLevelsNeeded + 2) * k;
    }

    static int computeValidLevels(final long bitPattern) {
        return Long.bitCount(bitPattern);
    }

    static int computeTotalLevels(final long bitPattern) {
        return hiBitPos(bitPattern) + 1;
    }

    static int computeNumLevelsNeeded(final int k, final long n) {
        return hiBitPos(n / (((long) k) * 2)) + 1;
    }

    static int computeBaseBufferItems(final int k, final long n) {
        return (int) (n % (((long) k) * 2));
    }

    static long computeBitPattern(final int k, final long n) {
        return n / (((long) k) * 2);
    }

    static double lg(final double x) {
        return Math.log(x) / Math.log(2.0d);
    }

    static int hiBitPos(final long num) {
        return 63 - Long.numberOfLeadingZeros(num);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
     */
    static class EpsilonFromK {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final double adjustKForEps = 1.3333333333333333d;
        private static final double bracketedBinarySearchForEpsTol = 1.0E-15d;
        private static final double deltaForEps = 0.01d;

        EpsilonFromK() {
        }

        static double getAdjustedEpsilon(final int k) {
            return getTheoreticalEpsilon(k, adjustKForEps);
        }

        private static double getTheoreticalEpsilon(final int k, final double ff) {
            if (k < 2) {
                throw new SketchesArgumentException("K must be greater than one.");
            }
            return bracketedBinarySearchForEps(((double) k) * ff, 1.0E-16d, 0.9999999999999999d);
        }

        private static double kOfEpsFormula(final double eps) {
            return (1.0d / eps) * Math.sqrt(Math.log(1.0d / (eps * deltaForEps)));
        }

        private static boolean epsForKPredicate(final double eps, final double kf) {
            return kOfEpsFormula(eps) >= kf;
        }

        private static double bracketedBinarySearchForEps(final double kf, final double lo, final double hi) {
            if ((hi - lo) / lo < bracketedBinarySearchForEpsTol) {
                return lo;
            }
            double d = (lo + hi) / 2.0d;
            if (epsForKPredicate(d, kf)) {
                return bracketedBinarySearchForEps(kf, d, hi);
            }
            return bracketedBinarySearchForEps(kf, lo, d);
        }
    }
}
