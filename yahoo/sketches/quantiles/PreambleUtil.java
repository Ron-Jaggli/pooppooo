package com.yahoo.sketches.quantiles;

import com.yahoo.memory.Memory;
import com.yahoo.memory.WritableMemory;
import com.yahoo.sketches.Family;
import java.nio.ByteOrder;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class PreambleUtil {
    static final int BIG_ENDIAN_FLAG_MASK = 1;
    static final int COMBINED_BUFFER = 32;
    static final int COMPACT_FLAG_MASK = 8;
    static final int DEFAULT_K = 128;
    static final int EMPTY_FLAG_MASK = 4;
    static final int FAMILY_BYTE = 2;
    static final int FLAGS_BYTE = 3;
    static final int K_SHORT = 4;
    static final int MAX_DOUBLE = 24;
    static final int MIN_DOUBLE = 16;
    static final boolean NATIVE_ORDER_IS_BIG_ENDIAN;
    static final int N_LONG = 8;
    static final int ORDERED_FLAG_MASK = 16;
    static final int PREAMBLE_LONGS_BYTE = 0;
    static final int READ_ONLY_FLAG_MASK = 2;
    static final int SER_VER_BYTE = 1;

    private PreambleUtil() {
    }

    static {
        NATIVE_ORDER_IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static String toString(final byte[] byteArr, final boolean isDoublesSketch) {
        return toString(Memory.wrap(byteArr), isDoublesSketch);
    }

    static String toString(final Memory mem, final boolean isDoublesSketch) {
        return memoryToString(mem, isDoublesSketch);
    }

    private static String memoryToString(final Memory srcMem, final boolean isDoublesSketch) {
        double dExtractMinDouble;
        double dExtractMaxDouble;
        int iExtractPreLongs = extractPreLongs(srcMem);
        int iExtractSerVer = extractSerVer(srcMem);
        String string = Family.idToFamily(extractFamilyID(srcMem)).toString();
        int iExtractFlags = extractFlags(srcMem);
        boolean z = (iExtractFlags & 1) > 0;
        String string2 = ByteOrder.nativeOrder().toString();
        boolean z2 = (iExtractFlags & 2) > 0;
        boolean z3 = (iExtractFlags & 4) > 0;
        boolean z4 = (iExtractFlags & 8) > 0;
        boolean z5 = (iExtractFlags & 16) > 0;
        int iExtractK = extractK(srcMem);
        long jExtractN = iExtractPreLongs == 1 ? 0L : extractN(srcMem);
        if (iExtractPreLongs <= 1 || !isDoublesSketch) {
            dExtractMinDouble = Double.NaN;
            dExtractMaxDouble = Double.NaN;
        } else {
            dExtractMinDouble = extractMinDouble(srcMem);
            dExtractMaxDouble = extractMaxDouble(srcMem);
        }
        StringBuilder sb = new StringBuilder();
        double d = dExtractMinDouble;
        sb.append(Util.LS);
        sb.append("### QUANTILES SKETCH PREAMBLE SUMMARY:").append(Util.LS);
        sb.append("Byte  0: Preamble Longs       : ").append(iExtractPreLongs).append(Util.LS);
        sb.append("Byte  1: Serialization Version: ").append(iExtractSerVer).append(Util.LS);
        sb.append("Byte  2: Family               : ").append(string).append(Util.LS);
        sb.append("Byte  3: Flags Field          : ").append(String.format("%02o", Integer.valueOf(iExtractFlags))).append(Util.LS);
        sb.append("  BIG ENDIAN                  : ").append(z).append(Util.LS);
        sb.append("  (Native Byte Order)         : ").append(string2).append(Util.LS);
        sb.append("  READ ONLY                   : ").append(z2).append(Util.LS);
        sb.append("  EMPTY                       : ").append(z3).append(Util.LS);
        sb.append("  COMPACT                     : ").append(z4).append(Util.LS);
        sb.append("  ORDERED                     : ").append(z5).append(Util.LS);
        sb.append("Bytes  4-5  : K               : ").append(iExtractK).append(Util.LS);
        if (iExtractPreLongs == 1) {
            sb.append(" --ABSENT, ASSUMED:").append(Util.LS);
        }
        sb.append("Bytes  8-15 : N                : ").append(jExtractN).append(Util.LS);
        if (isDoublesSketch) {
            sb.append("MinDouble                      : ").append(d).append(Util.LS);
            sb.append("MaxDouble                      : ").append(dExtractMaxDouble).append(Util.LS);
        }
        sb.append("Retained Items                 : ").append(Util.computeRetainedItems(iExtractK, jExtractN)).append(Util.LS);
        sb.append("Total Bytes                    : ").append(srcMem.getCapacity()).append(Util.LS);
        sb.append("### END SKETCH PREAMBLE SUMMARY").append(Util.LS);
        return sb.toString();
    }

    static int extractPreLongs(final Memory mem) {
        return mem.getByte(0L) & 255;
    }

    static int extractSerVer(final Memory mem) {
        return mem.getByte(1L) & 255;
    }

    static int extractFamilyID(final Memory mem) {
        return mem.getByte(2L) & 255;
    }

    static int extractFlags(final Memory mem) {
        return mem.getByte(3L) & 255;
    }

    static int extractK(final Memory mem) {
        return mem.getShort(4L) & 65535;
    }

    static long extractN(final Memory mem) {
        return mem.getLong(8L);
    }

    static double extractMinDouble(final Memory mem) {
        return mem.getDouble(16L);
    }

    static double extractMaxDouble(final Memory mem) {
        return mem.getDouble(24L);
    }

    static void insertPreLongs(final WritableMemory wmem, final int value) {
        wmem.putByte(0L, (byte) value);
    }

    static void insertSerVer(final WritableMemory wmem, final int value) {
        wmem.putByte(1L, (byte) value);
    }

    static void insertFamilyID(final WritableMemory wmem, final int value) {
        wmem.putByte(2L, (byte) value);
    }

    static void insertFlags(final WritableMemory wmem, final int value) {
        wmem.putByte(3L, (byte) value);
    }

    static void insertK(final WritableMemory wmem, final int value) {
        wmem.putShort(4L, (short) value);
    }

    static void insertN(final WritableMemory wmem, final long value) {
        wmem.putLong(8L, value);
    }

    static void insertMinDouble(final WritableMemory wmem, final double value) {
        wmem.putDouble(16L, value);
    }

    static void insertMaxDouble(final WritableMemory wmem, final double value) {
        wmem.putDouble(24L, value);
    }
}
