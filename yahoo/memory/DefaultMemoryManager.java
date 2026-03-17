package com.yahoo.memory;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class DefaultMemoryManager implements MemoryRequestServer {
    private static final DefaultMemoryManager memMgr = new DefaultMemoryManager();

    @Override // com.yahoo.memory.MemoryRequestServer
    public void requestClose(final WritableMemory memoryToClose, final WritableMemory newMemory) {
    }

    private DefaultMemoryManager() {
    }

    static DefaultMemoryManager getInstance() {
        return memMgr;
    }

    @Override // com.yahoo.memory.MemoryRequestServer
    public WritableMemory request(final long capacityBytes) {
        WritableMemory writableMemoryAllocate = WritableMemory.allocate((int) capacityBytes);
        writableMemoryAllocate.setMemoryRequest(this);
        return writableMemoryAllocate;
    }
}
