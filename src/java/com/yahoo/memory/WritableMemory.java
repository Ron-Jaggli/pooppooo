package com.yahoo.memory;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class WritableMemory extends Memory {
    public abstract void clear();

    public abstract void clear(long offsetBytes, long lengthBytes);

    public abstract void clearBits(long offsetBytes, byte bitMask);

    public abstract void fill(byte value);

    public abstract void fill(long offsetBytes, long lengthBytes, byte value);

    public abstract Object getArray();

    public abstract ByteBuffer getByteBuffer();

    public abstract MemoryRequestServer getMemoryRequestServer();

    public abstract long getRegionOffset(long offsetBytes);

    public abstract void putBoolean(long offsetBytes, boolean value);

    public abstract void putBooleanArray(long offsetBytes, boolean[] srcArray, int srcOffset, int length);

    public abstract void putByte(long offsetBytes, byte value);

    public abstract void putByteArray(long offsetBytes, byte[] srcArray, int srcOffset, int length);

    public abstract void putChar(long offsetBytes, char value);

    public abstract void putCharArray(long offsetBytes, char[] srcArray, int srcOffset, int length);

    public abstract void putDouble(long offsetBytes, double value);

    public abstract void putDoubleArray(long offsetBytes, double[] srcArray, final int srcOffset, final int length);

    public abstract void putFloat(long offsetBytes, float value);

    public abstract void putFloatArray(long offsetBytes, float[] srcArray, final int srcOffset, final int length);

    public abstract void putInt(long offsetBytes, int value);

    public abstract void putIntArray(long offsetBytes, int[] srcArray, final int srcOffset, final int length);

    public abstract void putLong(long offsetBytes, long value);

    public abstract void putLongArray(long offsetBytes, long[] srcArray, final int srcOffset, final int length);

    public abstract void putShort(long offsetBytes, short value);

    public abstract void putShortArray(long offsetBytes, short[] srcArray, final int srcOffset, final int length);

    public abstract void setBits(long offsetBytes, byte bitMask);

    public abstract void setMemoryRequest(MemoryRequestServer memReqSvr);

    public abstract WritableMemory writableDuplicate();

    public abstract WritableMemory writableRegion(long offsetBytes, long capacityBytes);

    public static WritableMemory wrap(final ByteBuffer byteBuf) {
        if (byteBuf.isReadOnly()) {
            throw new ReadOnlyException("ByteBuffer is read-only.");
        }
        if (byteBuf.capacity() == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(byteBuf, ByteOrder.nativeOrder());
    }

    public static WritableMemory allocate(final int capacityBytes) {
        if (capacityBytes == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(new byte[capacityBytes]), ByteOrder.nativeOrder());
    }

    public static WritableMemory wrap(final byte[] arr) {
        Util.nullCheck(arr);
        if (arr.length == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(arr), ByteOrder.nativeOrder());
    }

    public static WritableMemory wrap(final byte[] arr, final ByteOrder byteOrder) {
        Util.nullCheck(arr);
        if (arr.length == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(arr), byteOrder);
    }
}
