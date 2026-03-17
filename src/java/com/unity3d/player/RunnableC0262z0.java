package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class RunnableC0262z0 implements Runnable {
    final /* synthetic */ A0 a;

    RunnableC0262z0(A0 a0) {
        this.a = a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().releasePointerCapture();
    }
}
