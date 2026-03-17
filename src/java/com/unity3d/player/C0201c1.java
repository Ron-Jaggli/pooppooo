package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0201c1 implements K {
    final /* synthetic */ RunnableC0204d1 a;

    C0201c1(RunnableC0204d1 runnableC0204d1) {
        this.a = runnableC0204d1;
    }

    public final void a() {
        RunnableC0204d1 runnableC0204d1 = this.a;
        runnableC0204d1.a = true;
        if (runnableC0204d1.b) {
            runnableC0204d1.c.release();
        }
    }
}
