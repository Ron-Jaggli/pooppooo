package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class X implements Runnable {
    final /* synthetic */ Y a;

    X(Y y) {
        this.a = y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W w = this.a.d;
        w.a(w.a(), true);
    }
}
