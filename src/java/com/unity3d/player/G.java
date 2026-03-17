package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class G {
    protected Runnable b;
    protected com.unity3d.player.a.e a = null;
    protected boolean c = true;

    protected G(Runnable runnable) {
        this.b = runnable;
    }

    protected void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        this.a = new F(this.b);
    }

    protected void unregisterOnBackPressedCallback() {
        this.a = null;
    }
}
