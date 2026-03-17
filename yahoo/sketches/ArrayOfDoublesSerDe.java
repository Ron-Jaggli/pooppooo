package com.yahoo.sketches;

import com.yahoo.memory.Memory;
import com.yahoo.memory.WritableMemory;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class ArrayOfDoublesSerDe extends ArrayOfItemsSerDe<Double> {
    @Override // com.yahoo.sketches.ArrayOfItemsSerDe
    public byte[] serializeToByteArray(final Double[] items) {
        byte[] bArr = new byte[items.length * 8];
        WritableMemory writableMemoryWrap = WritableMemory.wrap(bArr);
        long j = 0;
        for (Double d : items) {
            writableMemoryWrap.putDouble(j, d.doubleValue());
            j += 8;
        }
        return bArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yahoo.sketches.ArrayOfItemsSerDe
    public Double[] deserializeFromMemory(final Memory mem, final int length) {
        long j = 0;
        com.yahoo.memory.Util.checkBounds(0L, 8L, mem.getCapacity());
        Double[] dArr = new Double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.valueOf(mem.getDouble(j));
            j += 8;
        }
        return dArr;
    }
}
