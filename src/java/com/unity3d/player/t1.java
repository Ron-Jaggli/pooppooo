package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class t1 implements Runnable {
    final /* synthetic */ UnityPlayerForActivityOrService a;

    t1(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.a;
        if (unityPlayerForActivityOrService.mMainDisplayOverride) {
            unityPlayerForActivityOrService.getFrameLayout().removeView(this.a.getView());
        } else if (unityPlayerForActivityOrService.getView().getParent() == null) {
            this.a.getFrameLayout().addView(this.a.getView());
        } else {
            D.Log(5, "Couldn't add view, because it's already assigned to another parent");
        }
    }
}
