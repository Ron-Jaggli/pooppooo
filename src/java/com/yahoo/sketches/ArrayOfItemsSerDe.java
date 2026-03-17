package com.yahoo.sketches;

import com.yahoo.memory.Memory;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class ArrayOfItemsSerDe<T> {
    public abstract T[] deserializeFromMemory(Memory mem, int numItems);

    public abstract byte[] serializeToByteArray(T[] items);
}
