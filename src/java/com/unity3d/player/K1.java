package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class K1 implements G1 {
    final /* synthetic */ L1 a;

    K1(L1 l1) {
        this.a = l1;
    }

    public final void a(int i) {
        this.a.h.e.lock();
        Q1 q1 = this.a.h;
        q1.g = i;
        if (i == 3 && q1.i) {
            q1.runOnUiThread(new J1(this));
        }
        if (i != 0) {
            this.a.h.d.release();
        }
        this.a.h.e.unlock();
    }
}
