package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class L0 implements Runnable {
    L0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0199c.a();
        } catch (Exception e) {
            D.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
