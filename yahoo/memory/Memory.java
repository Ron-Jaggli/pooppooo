package com.yahoo.memory;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class Memory {
    public abstract void checkBounds(final long offsetBytes, final long length);

    public abstract int compareTo(long thisOffsetBytes, long thisLengthBytes, Memory that, long thatOffsetBytes, long thatLengthBytes);

    public abstract void copyTo(long srcOffsetBytes, WritableMemory destination, long dstOffsetBytes, long lengthBytes);

    public abstract boolean getBoolean(long offsetBytes);

    public abstract void getBooleanArray(long offsetBytes, boolean[] dstArray, int dstOffset, int length);

    public abstract byte getByte(long offsetBytes);

    public abstract void getByteArray(long offsetBytes, byte[] dstArray, int dstOffset, int length);

    public abstract long getCapacity();

    public abstract char getChar(long offsetBytes);

    public abstract void getCharArray(long offsetBytes, char[] dstArray, int dstOffset, int length);

    public abstract double getDouble(long offsetBytes);

    public abstract void getDoubleArray(long offsetBytes, double[] dstArray, int dstOffset, int length);

    public abstract float getFloat(long offsetBytes);

    public abstract void getFloatArray(long offsetBytes, float[] dstArray, int dstOffset, int length);

    public abstract int getInt(long offsetBytes);

    public abstract void getIntArray(long offsetBytes, int[] dstArray, int dstOffset, int length);

    public abstract long getLong(long offsetBytes);

    public abstract void getLongArray(long offsetBytes, long[] dstArray, int dstOffset, int length);

    public abstract ByteOrder getResourceOrder();

    public abstract short getShort(long offsetBytes);

    public abstract void getShortArray(long offsetBytes, short[] dstArray, int dstOffset, int length);

    public abstract boolean hasArray();

    public abstract boolean hasByteBuffer();

    public abstract boolean isDirect();

    public abstract boolean isResourceReadOnly();

    public abstract boolean isSameResource(Memory that);

    public abstract Memory region(long offsetBytes, long capacityBytes);

    public abstract boolean swapBytes();

    public abstract String toHexString(String header, long offsetBytes, int lengthBytes);

    public static Memory wrap(final ByteBuffer byteBuf) {
        if (byteBuf != null && byteBuf.capacity() == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(byteBuf, ByteOrder.nativeOrder());
    }

    public static Memory wrap(final byte[] arr) {
        return wrap(arr, 0, arr.length, ByteOrder.nativeOrder());
    }

    public static Memory wrap(final byte[] arr, final ByteOrder byteOrder) {
        return wrap(arr, 0, arr.length, byteOrder);
    }

    public static Memory wrap(final byte[] arr, final int offset, final int length, final ByteOrder byteOrder) {
        Util.nullCheck(arr);
        Util.nullCheck(byteOrder);
        Util.checkBounds(offset, length, arr.length);
        if (length == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(arr), byteOrder);
    }

    static String toHex(final String preamble, final long offsetBytes, final int lengthBytes, final Memory mem) {
        return WritableMemoryImpl.toHex(preamble, offsetBytes, lengthBytes, mem);
    }
}
