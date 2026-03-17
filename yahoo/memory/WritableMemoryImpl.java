package com.yahoo.memory;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class WritableMemoryImpl extends WritableMemory {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final WritableMemoryImpl ZERO_SIZE_MEMORY = new WritableMemoryImpl(ByteBuffer.wrap(new byte[0]), ByteOrder.nativeOrder());
    private final ByteBuffer byteBuf;
    private final int capacity;
    private final int offset;

    @Override // com.yahoo.memory.Memory
    public boolean hasByteBuffer() {
        return true;
    }

    @Override // com.yahoo.memory.WritableMemory
    public void setMemoryRequest(final MemoryRequestServer memReqSvr) {
    }

    WritableMemoryImpl(final ByteBuffer bb, final ByteOrder byteOrder) {
        this.byteBuf = bb;
        this.capacity = bb.capacity();
        this.offset = 0;
        bb.order(byteOrder);
    }

    private WritableMemoryImpl(final ByteBuffer bb, final int offsetBytes, final int capacityBytes, final ByteOrder byteOrder) {
        this.byteBuf = bb;
        this.capacity = capacityBytes;
        this.offset = offsetBytes;
        bb.order(byteOrder);
    }

    @Override // com.yahoo.memory.WritableMemory
    public WritableMemory writableDuplicate() {
        return writableRegion(0L, this.capacity);
    }

    @Override // com.yahoo.memory.Memory
    public Memory region(final long offsetBytes, final long capacityBytes) {
        return writableRegion(offsetBytes, capacityBytes);
    }

    @Override // com.yahoo.memory.WritableMemory
    public WritableMemory writableRegion(final long offsetBytes, final long capacityBytes) {
        Util.checkBounds(offsetBytes, capacityBytes, this.capacity);
        ByteBuffer byteBuffer = this.byteBuf;
        return new WritableMemoryImpl(byteBuffer, this.offset + ((int) offsetBytes), (int) capacityBytes, byteBuffer.order());
    }

    @Override // com.yahoo.memory.Memory
    public boolean getBoolean(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 1L, this.capacity);
        return this.byteBuf.get(this.offset + ((int) offsetBytes)) != 0;
    }

    @Override // com.yahoo.memory.Memory
    public void getBooleanArray(final long offsetBytes, final boolean[] dstArray, final int dstOffset, final int lengthBooleans) {
        Util.checkBounds(offsetBytes, lengthBooleans, this.capacity);
        Util.checkBounds(dstOffset, lengthBooleans, dstArray.length);
        int i = (int) (((long) this.offset) + offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthBooleans) {
            dstArray[i2] = this.byteBuf.get(i) != 0;
            i2++;
            i++;
        }
    }

    @Override // com.yahoo.memory.Memory
    public byte getByte(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 1L, this.capacity);
        return this.byteBuf.get(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getByteArray(final long offsetBytes, final byte[] dstArray, final int dstOffset, final int lengthBytes) {
        Util.checkBounds(offsetBytes, lengthBytes, this.capacity);
        Util.checkBounds(dstOffset, lengthBytes, dstArray.length);
        if (this.byteBuf.hasArray()) {
            System.arraycopy(this.byteBuf.array(), this.offset + ((int) offsetBytes), dstArray, dstOffset, lengthBytes);
            return;
        }
        int i = (int) (((long) this.offset) + offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthBytes) {
            dstArray[i2] = this.byteBuf.get(i);
            i2++;
            i++;
        }
    }

    @Override // com.yahoo.memory.Memory
    public char getChar(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 2L, this.capacity);
        return this.byteBuf.getChar(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getCharArray(final long offsetBytes, final char[] dstArray, final int dstOffset, final int lengthChars) {
        Util.checkBounds(offsetBytes, lengthChars << 1, this.capacity);
        Util.checkBounds(dstOffset, lengthChars, dstArray.length);
        int i = this.offset + ((int) offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthChars) {
            dstArray[i2] = this.byteBuf.getChar(i);
            i2++;
            i += 2;
        }
    }

    @Override // com.yahoo.memory.Memory
    public double getDouble(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 8L, this.capacity);
        return this.byteBuf.getDouble(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getDoubleArray(final long offsetBytes, final double[] dstArray, final int dstOffset, final int lengthDoubles) {
        Util.checkBounds(offsetBytes, lengthDoubles << 3, this.capacity);
        Util.checkBounds(dstOffset, lengthDoubles, dstArray.length);
        int i = this.offset + ((int) offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthDoubles) {
            dstArray[i2] = this.byteBuf.getDouble(i);
            i2++;
            i += 8;
        }
    }

    @Override // com.yahoo.memory.Memory
    public float getFloat(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 4L, this.capacity);
        return this.byteBuf.getFloat(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getFloatArray(final long offsetBytes, final float[] dstArray, final int dstOffset, final int lengthFloats) {
        Util.checkBounds(offsetBytes, lengthFloats << 2, this.capacity);
        Util.checkBounds(dstOffset, lengthFloats, dstArray.length);
        int i = this.offset + ((int) offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthFloats) {
            dstArray[i2] = this.byteBuf.getFloat(i);
            i2++;
            i += 4;
        }
    }

    @Override // com.yahoo.memory.Memory
    public int getInt(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 4L, this.capacity);
        return this.byteBuf.getInt(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getIntArray(final long offsetBytes, final int[] dstArray, final int dstOffset, final int lengthInts) {
        Util.checkBounds(offsetBytes, lengthInts << 2, this.capacity);
        Util.checkBounds(dstOffset, lengthInts, dstArray.length);
        int i = this.offset + ((int) offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthInts) {
            dstArray[i2] = this.byteBuf.getInt(i);
            i2++;
            i += 4;
        }
    }

    @Override // com.yahoo.memory.Memory
    public long getLong(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 8L, this.capacity);
        return this.byteBuf.getLong(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getLongArray(final long offsetBytes, final long[] dstArray, final int dstOffset, final int lengthLongs) {
        Util.checkBounds(offsetBytes, lengthLongs << 3, this.capacity);
        Util.checkBounds(dstOffset, lengthLongs, dstArray.length);
        int i = this.offset + ((int) offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthLongs) {
            dstArray[i2] = this.byteBuf.getLong(i);
            i2++;
            i += 8;
        }
    }

    @Override // com.yahoo.memory.Memory
    public short getShort(final long offsetBytes) {
        Util.assertBounds(offsetBytes, 2L, this.capacity);
        return this.byteBuf.getShort(this.offset + ((int) offsetBytes));
    }

    @Override // com.yahoo.memory.Memory
    public void getShortArray(final long offsetBytes, final short[] dstArray, final int dstOffset, final int lengthShorts) {
        Util.checkBounds(offsetBytes, lengthShorts << 1, this.capacity);
        Util.checkBounds(dstOffset, lengthShorts, dstArray.length);
        int i = this.offset + ((int) offsetBytes);
        int i2 = dstOffset;
        while (i2 < dstOffset + lengthShorts) {
            dstArray[i2] = this.byteBuf.getShort(i);
            i2++;
            i += 2;
        }
    }

    @Override // com.yahoo.memory.Memory
    public int compareTo(final long thisOffsetBytes, final long thisLengthBytes, final Memory that, final long thatOffsetBytes, final long thatLengthBytes) {
        Util.checkBounds(thisOffsetBytes, thisLengthBytes, this.capacity);
        Util.checkBounds(thatOffsetBytes, thatLengthBytes, that.getCapacity());
        if (thisLengthBytes < thatLengthBytes) {
            return -1;
        }
        if (thisLengthBytes > thatLengthBytes) {
            return 1;
        }
        int regionOffset = (int) getRegionOffset(thisOffsetBytes);
        WritableMemoryImpl writableMemoryImpl = (WritableMemoryImpl) that;
        int regionOffset2 = (int) writableMemoryImpl.getRegionOffset(thatOffsetBytes);
        int i = ((int) thisLengthBytes) + regionOffset;
        while (regionOffset < i) {
            byte b = this.byteBuf.get(regionOffset);
            byte b2 = writableMemoryImpl.byteBuf.get(regionOffset2);
            if (b < b2) {
                return -1;
            }
            if (b > b2) {
                return 1;
            }
            regionOffset++;
            regionOffset2++;
        }
        return 0;
    }

    @Override // com.yahoo.memory.Memory
    public void copyTo(final long srcOffsetBytes, final WritableMemory destination, final long dstOffsetBytes, final long lengthBytes) {
        Util.checkBounds(srcOffsetBytes, lengthBytes, this.capacity);
        Util.checkBounds(dstOffsetBytes, lengthBytes, destination.getCapacity());
        if (isSameResource(destination) && srcOffsetBytes == dstOffsetBytes) {
            return;
        }
        int i = (int) lengthBytes;
        byte[] bArr = new byte[i];
        getByteArray(srcOffsetBytes, bArr, 0, i);
        destination.putByteArray(dstOffsetBytes, bArr, 0, i);
    }

    @Override // com.yahoo.memory.Memory
    public long getCapacity() {
        return this.capacity;
    }

    @Override // com.yahoo.memory.Memory
    public void checkBounds(final long offsetBytes, final long length) {
        Util.checkBounds(offsetBytes, length, this.capacity);
    }

    @Override // com.yahoo.memory.WritableMemory
    public long getRegionOffset(final long offsetBytes) {
        return ((long) this.offset) + offsetBytes;
    }

    @Override // com.yahoo.memory.Memory
    public ByteOrder getResourceOrder() {
        return this.byteBuf.order();
    }

    @Override // com.yahoo.memory.Memory
    public boolean hasArray() {
        return this.byteBuf.hasArray();
    }

    @Override // com.yahoo.memory.Memory
    public boolean isDirect() {
        return this.byteBuf.isDirect();
    }

    @Override // com.yahoo.memory.Memory
    public boolean isResourceReadOnly() {
        return this.byteBuf.isReadOnly();
    }

    @Override // com.yahoo.memory.Memory
    public boolean isSameResource(final Memory that) {
        if (that == null || isDirect() || that.isDirect()) {
            return false;
        }
        WritableMemoryImpl writableMemoryImpl = (WritableMemoryImpl) that;
        if (!hasArray() || !that.hasArray()) {
            return false;
        }
        ByteBuffer byteBuffer = this.byteBuf;
        return (byteBuffer == writableMemoryImpl.byteBuf || byteBuffer.array() == writableMemoryImpl.byteBuf.array()) && this.capacity == writableMemoryImpl.capacity && this.offset == writableMemoryImpl.offset;
    }

    @Override // com.yahoo.memory.Memory
    public boolean swapBytes() {
        return this.byteBuf.order() != ByteOrder.nativeOrder();
    }

    @Override // com.yahoo.memory.Memory
    public String toHexString(final String header, final long offsetBytes, final int lengthBytes) {
        String simpleName = getClass().getSimpleName();
        String str = ".toHexString" + String.format("(..., %d, %d)", Long.valueOf(offsetBytes), Integer.valueOf(lengthBytes)) + ", hashCode: " + (((long) hashCode()) & 4294967295L);
        StringBuilder sb = new StringBuilder("### ");
        sb.append(simpleName).append(" SUMMARY ###").append(Util.LS);
        sb.append("Header Comment      : ").append(header).append(Util.LS);
        sb.append("Call Params         : ").append(str);
        return toHex(sb.toString(), offsetBytes, lengthBytes, this);
    }

    static String toHex(final String preamble, final long offsetBytes, final int lengthBytes, final Memory mem) {
        long j = lengthBytes;
        Util.checkBounds(offsetBytes, j, mem.getCapacity());
        WritableMemoryImpl writableMemoryImpl = (WritableMemoryImpl) mem;
        StringBuilder sb = new StringBuilder();
        String str = writableMemoryImpl.byteBuf == null ? "null" : writableMemoryImpl.byteBuf.getClass().getSimpleName() + ", " + (((long) writableMemoryImpl.byteBuf.hashCode()) & 4294967295L);
        MemoryRequestServer memoryRequestServer = writableMemoryImpl.getMemoryRequestServer();
        String str2 = memoryRequestServer != null ? memoryRequestServer.getClass().getSimpleName() + ", " + (4294967295L & ((long) memoryRequestServer.hashCode())) : "null";
        sb.append(preamble).append(Util.LS);
        sb.append("ByteBuf, hashCode   : ").append(str).append(Util.LS);
        sb.append("RegionOffset        : ").append(writableMemoryImpl.getRegionOffset(0L)).append(Util.LS);
        sb.append("Capacity            : ").append(mem.getCapacity()).append(Util.LS);
        sb.append("MemReq, hashCode    : ").append(str2).append(Util.LS);
        sb.append("Resource Read Only  : ").append(mem.isResourceReadOnly()).append(Util.LS);
        sb.append("Resource Endianness : ").append(writableMemoryImpl.byteBuf.order().toString()).append(Util.LS);
        sb.append("Data, littleEndian  :  0  1  2  3  4  5  6  7");
        for (long j2 = 0; j2 < j; j2++) {
            long j3 = offsetBytes + j2;
            int i = mem.getByte(j3) & 255;
            if (j2 % 8 == 0) {
                sb.append(String.format("%n%20s: ", Long.valueOf(j3)));
            }
            sb.append(String.format("%02x ", Integer.valueOf(i)));
        }
        sb.append(Util.LS);
        return sb.toString();
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putBoolean(long j, boolean z) {
        Util.assertBounds(j, 1L, this.capacity);
        this.byteBuf.put(this.offset + ((int) j), z ? (byte) 1 : (byte) 0);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putBooleanArray(long j, boolean[] zArr, int i, int i2) {
        Util.checkBounds(i, i2, zArr.length);
        Util.checkBounds(j, i2, this.capacity);
        int i3 = this.offset + ((int) j);
        int i4 = i;
        while (i4 < i + i2) {
            this.byteBuf.put(i3, zArr[i4] ? (byte) 1 : (byte) 0);
            i4++;
            i3++;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putByte(final long offsetBytes, final byte value) {
        Util.assertBounds(offsetBytes, 1L, this.capacity);
        this.byteBuf.put(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putByteArray(final long offsetBytes, final byte[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length, this.capacity);
        if (this.byteBuf.hasArray()) {
            System.arraycopy(srcArray, srcOffset, this.byteBuf.array(), this.offset + ((int) offsetBytes), length);
            return;
        }
        int i = this.offset + ((int) offsetBytes);
        int i2 = srcOffset;
        while (i2 < srcOffset + length) {
            this.byteBuf.put(i, srcArray[i2]);
            i2++;
            i++;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putChar(final long offsetBytes, final char value) {
        Util.assertBounds(offsetBytes, 2L, this.capacity);
        this.byteBuf.putChar(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putCharArray(final long offsetBytes, final char[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length << 1, this.capacity);
        int i = this.offset + ((int) offsetBytes);
        int i2 = srcOffset;
        while (i2 < srcOffset + length) {
            this.byteBuf.putChar(i, srcArray[i2]);
            i2++;
            i += 2;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putDouble(final long offsetBytes, final double value) {
        Util.assertBounds(offsetBytes, 8L, this.capacity);
        this.byteBuf.putDouble(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putDoubleArray(final long offsetBytes, final double[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length << 3, this.capacity);
        int i = this.offset + ((int) offsetBytes);
        int i2 = srcOffset;
        while (i2 < srcOffset + length) {
            this.byteBuf.putDouble(i, srcArray[i2]);
            i2++;
            i += 8;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putFloat(final long offsetBytes, final float value) {
        Util.assertBounds(offsetBytes, 4L, this.capacity);
        this.byteBuf.putFloat(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putFloatArray(final long offsetBytes, final float[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length << 2, this.capacity);
        int i = this.offset + ((int) offsetBytes);
        int i2 = srcOffset;
        while (i2 < srcOffset + length) {
            this.byteBuf.putFloat(i, srcArray[i2]);
            i2++;
            i += 4;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putInt(final long offsetBytes, final int value) {
        Util.assertBounds(offsetBytes, 4L, this.capacity);
        this.byteBuf.putInt(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putIntArray(final long offsetBytes, final int[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length << 2, this.capacity);
        int i = this.offset + ((int) offsetBytes);
        int i2 = srcOffset;
        while (i2 < srcOffset + length) {
            this.byteBuf.putInt(i, srcArray[i2]);
            i2++;
            i += 4;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putLong(final long offsetBytes, final long value) {
        Util.assertBounds(offsetBytes, 8L, this.capacity);
        this.byteBuf.putLong(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putLongArray(final long offsetBytes, final long[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length << 3, this.capacity);
        int i = this.offset + ((int) offsetBytes);
        int i2 = srcOffset;
        while (i2 < srcOffset + length) {
            this.byteBuf.putLong(i, srcArray[i2]);
            i2++;
            i += 8;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putShort(final long offsetBytes, final short value) {
        Util.assertBounds(offsetBytes, 2L, this.capacity);
        this.byteBuf.putShort(this.offset + ((int) offsetBytes), value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void putShortArray(final long offsetBytes, final short[] srcArray, final int srcOffset, final int length) {
        Util.checkBounds(srcOffset, length, srcArray.length);
        Util.checkBounds(offsetBytes, length << 1, this.capacity);
        for (int i = srcOffset; i < srcOffset + length; i++) {
            this.byteBuf.putShort(srcArray[i]);
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public Object getArray() {
        return this.byteBuf.array();
    }

    @Override // com.yahoo.memory.WritableMemory
    public ByteBuffer getByteBuffer() {
        return this.byteBuf;
    }

    @Override // com.yahoo.memory.WritableMemory
    public void clear() {
        fill(0L, this.capacity, (byte) 0);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void clear(final long offsetBytes, final long lengthBytes) {
        fill(offsetBytes, lengthBytes, (byte) 0);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void clearBits(final long offsetBytes, final byte bitMask) {
        Util.assertBounds(offsetBytes, 1L, this.capacity);
        int i = (int) (((long) this.offset) + offsetBytes);
        this.byteBuf.put(i, (byte) (this.byteBuf.get(i) & 255 & (~bitMask)));
    }

    @Override // com.yahoo.memory.WritableMemory
    public void fill(final byte value) {
        fill(0L, this.capacity, value);
    }

    @Override // com.yahoo.memory.WritableMemory
    public void fill(final long offsetBytes, final long lengthBytes, final byte value) {
        int i = (int) offsetBytes;
        int i2 = (int) lengthBytes;
        Util.checkBounds(i, i2, this.capacity);
        int i3 = this.offset + i;
        int i4 = i2 + i3;
        while (i3 < i4) {
            this.byteBuf.put(i3, value);
            i3++;
        }
    }

    @Override // com.yahoo.memory.WritableMemory
    public void setBits(final long offsetBytes, final byte bitMask) {
        Util.assertBounds(offsetBytes, 1L, this.capacity);
        int i = this.offset + ((int) offsetBytes);
        this.byteBuf.put(i, (byte) (this.byteBuf.get(i) | bitMask));
    }

    @Override // com.yahoo.memory.WritableMemory
    public MemoryRequestServer getMemoryRequestServer() {
        return DefaultMemoryManager.getInstance();
    }
}
