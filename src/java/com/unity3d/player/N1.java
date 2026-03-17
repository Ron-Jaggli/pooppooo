package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class N1 implements Runnable {
    final /* synthetic */ Q1 a;

    N1(Q1 q1) {
        this.a = q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q1 q1 = this.a;
        I1 i1 = q1.f;
        if (i1 != null) {
            q1.a.addViewToPlayer(i1, true);
            Q1 q12 = this.a;
            q12.i = true;
            q12.f.requestFocus();
        }
    }
}
