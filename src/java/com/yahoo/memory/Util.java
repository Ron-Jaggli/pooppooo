package com.yahoo.memory;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BOOLEAN_SHIFT = 0;
    public static final int BYTE_SHIFT = 0;
    public static final int CHAR_SHIFT = 1;
    public static final int DOUBLE_SHIFT = 3;
    public static final int FLOAT_SHIFT = 2;
    public static final int INT_SHIFT = 2;
    public static final int LONG_SHIFT = 3;
    static final String LS = System.getProperty("line.separator");
    public static final int SHORT_SHIFT = 1;

    public static void assertBounds(final long reqOff, final long reqLen, final long allocSize) {
    }

    public static void checkBounds(final long reqOff, final long reqLen, final long allocSize) {
        long j = reqOff | reqLen;
        long j2 = reqLen + reqOff;
        if ((j | j2 | (allocSize - j2)) < 0) {
            throw new IllegalArgumentException("reqOffset: " + reqOff + ", reqLength: , (reqOff + reqLen): " + j2 + ", allocSize: " + allocSize);
        }
    }

    public static boolean checkOverlap(final long srcOff, final long dstOff, final long length) {
        return Math.min(srcOff, dstOff) + length <= Math.max(srcOff, dstOff);
    }

    static final void nullCheck(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("An input argument is null.");
        }
    }
}
