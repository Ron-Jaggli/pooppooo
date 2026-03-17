package com.yahoo.sketches;

import com.aheaditec.talsec.security.p1;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final char TAB = '\t';
    public static final String LS = System.getProperty("line.separator");
    public static final double LOG2 = Math.log(2.0d);

    public static boolean isLessThanUnsigned(final long n1, final long n2) {
        return (n1 < n2) ^ (((n1 > 0L ? 1 : (n1 == 0L ? 0 : -1)) < 0) != ((n2 > 0L ? 1 : (n2 == 0L ? 0 : -1)) < 0));
    }

    public static boolean isMultipleOf8AndGT0(final long v) {
        return (7 & v) == 0 && v > 0;
    }

    public static boolean isPowerOf2(final int v) {
        return v > 0 && (v & (v + (-1))) == 0;
    }

    private Util() {
    }

    public static int bytesToInt(final byte[] arr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= (arr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public static long bytesToLong(final byte[] arr) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j |= (((long) arr[i]) & 255) << (i * 8);
        }
        return j;
    }

    public static byte[] intToBytes(int v, final byte[] arr) {
        for (int i = 0; i < 4; i++) {
            arr[i] = (byte) (v & p1.h);
            v >>>= 8;
        }
        return arr;
    }

    public static byte[] longToBytes(long v, final byte[] arr) {
        for (int i = 0; i < 8; i++) {
            arr[i] = (byte) (255 & v);
            v >>>= 8;
        }
        return arr;
    }

    public static String longToHexBytes(final long v) {
        StringBuilder sb = new StringBuilder();
        int i = 8;
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                sb.append(zeroPad(Long.toHexString((v >>> (i2 * 8)) & 255), 2)).append(" ");
                i = i2;
            } else {
                return sb.toString();
            }
        }
    }

    public static String bytesToString(final byte[] arr, final boolean signed, final boolean littleEndian, final String sep) {
        int i;
        StringBuilder sb = new StringBuilder();
        byte b = signed ? (byte) -1 : (byte) 255;
        int length = arr.length;
        int i2 = 0;
        if (littleEndian) {
            while (true) {
                i = length - 1;
                if (i2 >= i) {
                    break;
                }
                sb.append(arr[i2] & b).append(sep);
                i2++;
            }
            sb.append(arr[i] & b);
        } else {
            while (true) {
                int i3 = length - 1;
                if (length <= 1) {
                    break;
                }
                sb.append(arr[i3] & b).append(sep);
                length = i3;
            }
            sb.append(arr[0] & b);
        }
        return sb.toString();
    }

    public static String nanoSecToString(final long nS) {
        double d = nS;
        String strZeroPad = zeroPad(Long.toString((long) (d % 1000.0d)), 3);
        return String.format("%d.%3s %3s %3s", Long.valueOf((long) (d / 1.0E9d)), zeroPad(Long.toString((long) ((d / 1000000.0d) % 1000.0d)), 3), zeroPad(Long.toString((long) ((d / 1000.0d) % 1000.0d)), 3), strZeroPad);
    }

    public static String milliSecToString(final long mS) {
        double d = mS;
        String strZeroPad = zeroPad(Long.toString((long) (d % 1000.0d)), 3);
        return String.format("%d:%2s:%2s.%3s", Long.valueOf((long) (d / 3600000.0d)), zeroPad(Long.toString((long) ((d / 60000.0d) % 60.0d)), 2), zeroPad(Long.toString((long) ((d / 1000.0d) % 60.0d)), 2), strZeroPad);
    }

    public static final String zeroPad(final String s, final int fieldLength) {
        return characterPad(s, fieldLength, '0', false);
    }

    public static final String characterPad(final String s, final int fieldLength, final char padChar, final boolean postpend) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        if (length >= fieldLength) {
            return s;
        }
        char[] cArr = new char[fieldLength];
        int i = fieldLength - length;
        int i2 = 0;
        if (postpend) {
            while (i2 < length) {
                cArr[i2] = charArray[i2];
                i2++;
            }
            while (length < fieldLength) {
                cArr[length] = padChar;
                length++;
            }
        } else {
            while (i2 < i) {
                cArr[i2] = padChar;
                i2++;
            }
            for (int i3 = i; i3 < fieldLength; i3++) {
                cArr[i3] = charArray[i3 - i];
            }
        }
        return String.valueOf(cArr);
    }

    public static final short checkSeedHashes(final short seedHashA, final short seedHashB) {
        if (seedHashA == seedHashB) {
            return seedHashA;
        }
        throw new SketchesArgumentException("Incompatible Seed Hashes. " + ((int) seedHashA) + ", " + ((int) seedHashB));
    }

    public static void checkIfMultipleOf8AndGT0(final long v, final String argName) {
        if ((7 & v) != 0 || v <= 0) {
            throw new SketchesArgumentException("The value of the parameter \"" + argName + "\" must be a positive multiple of 8 and greater than zero: " + v);
        }
    }

    public static void checkIfPowerOf2(final int v, final String argName) {
        if (v <= 0 || ((v - 1) & v) != 0) {
            throw new SketchesArgumentException("The value of the parameter \"" + argName + "\" must be a positive integer-power of 2 and greater than 0: " + v);
        }
    }

    public static int toLog2(final int value, final String argName) {
        checkIfPowerOf2(value, argName);
        return Integer.numberOfTrailingZeros(value);
    }

    public static int ceilingPowerOf2(final int n) {
        if (n <= 1) {
            return 1;
        }
        if (n >= 1073741824) {
            return 1073741824;
        }
        return Integer.highestOneBit((n - 1) << 1);
    }

    public static int floorPowerOf2(final int n) {
        if (n <= 1) {
            return 1;
        }
        return Integer.highestOneBit(n);
    }

    public static double invPow2(final int e) {
        return Double.longBitsToDouble((1023 - ((long) e)) << 52);
    }

    public static int[] evenlyLgSpaced(final int lgStart, final int lgEnd, final int points) {
        if (points <= 0) {
            throw new SketchesArgumentException("points must be > 0");
        }
        if (lgEnd < 0 || lgStart < 0) {
            throw new SketchesArgumentException("lgStart and lgEnd must be >= 0.");
        }
        int[] iArr = new int[points];
        iArr[0] = 1 << lgStart;
        if (points == 1) {
            return iArr;
        }
        double d = ((double) (lgEnd - lgStart)) / (((double) points) - 1.0d);
        for (int i = 1; i < points; i++) {
            iArr[i] = (int) Math.round(Math.pow(2.0d, (((double) i) * d) + ((double) lgStart)));
        }
        return iArr;
    }

    public static final int pwr2LawNext(final int ppo, final int curPoint) {
        int iRound;
        double d = ppo;
        int iRound2 = (int) Math.round(log2(curPoint < 1 ? 1 : curPoint) * d);
        do {
            iRound2++;
            iRound = (int) Math.round(Math.pow(2.0d, ((double) iRound2) / d));
        } while (iRound <= curPoint);
        return iRound;
    }

    public static final int pwr2LawPrev(final int ppo, final int curPoint) {
        int iRound;
        if (curPoint <= 1) {
            return 0;
        }
        double d = ppo;
        int iRound2 = (int) Math.round(log2(curPoint) * d);
        do {
            iRound2--;
            iRound = (int) Math.round(Math.pow(2.0d, ((double) iRound2) / d));
            if (iRound < curPoint) {
                break;
            }
        } while (iRound > 1);
        return iRound;
    }

    public static final double log2(final double value) {
        return Math.log(value) / LOG2;
    }

    public static int simpleIntLog2(final int x) {
        return Integer.numberOfTrailingZeros(x);
    }

    public static final int startingSubMultiple(final int lgTarget, final ResizeFactor rf, final int lgMin) {
        int iLg = rf.lg();
        return lgTarget <= lgMin ? lgMin : iLg == 0 ? lgTarget : ((lgTarget - lgMin) % iLg) + lgMin;
    }

    public static void checkProbability(final double p, final String argName) {
        if (p < 0.0d || p > 1.0d) {
            throw new SketchesArgumentException("The value of the parameter \"" + argName + "\" must be between 0.0 inclusive and 1.0 inclusive: " + p);
        }
    }
}
