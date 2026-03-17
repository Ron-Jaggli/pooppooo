package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class A0 {
    private UnityPlayer a;

    public A0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    final void a() {
        if (PlatformSupport.OREO_SUPPORT) {
            this.a.runOnUiThread(new RunnableC0262z0(this));
        }
    }

    final void b() {
        if (PlatformSupport.OREO_SUPPORT) {
            this.a.runOnUiThread(new RunnableC0260y0(this));
        }
    }
}
