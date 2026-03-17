package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class J1 implements Runnable {
    final /* synthetic */ K1 a;

    J1(K1 k1) {
        this.a = k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q1 q1 = this.a.a.h;
        I1 i1 = q1.f;
        if (i1 != null) {
            q1.a.removeViewFromPlayer(i1);
            q1.i = false;
            q1.f.destroyPlayer();
            q1.f = null;
            P1 p1 = q1.c;
            if (p1 != null) {
                ((R0) p1).a();
            }
        }
        this.a.a.h.a.onResume();
    }
}
