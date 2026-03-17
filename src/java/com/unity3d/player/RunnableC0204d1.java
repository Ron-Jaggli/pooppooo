package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class RunnableC0204d1 implements Runnable {
    boolean a = false;
    boolean b = false;
    final /* synthetic */ Semaphore c;
    final /* synthetic */ UnityPlayerForActivityOrService d;
    final /* synthetic */ UnityPlayerForActivityOrService e;

    RunnableC0204d1(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.e = unityPlayerForActivityOrService;
        this.c = semaphore;
        this.d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.mSoftInput != null) {
            this.d.setOnHandleFocusListener(new C0198b1(this));
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.e;
            unityPlayerForActivityOrService.mSoftInput.g = new C0201c1(this);
            unityPlayerForActivityOrService.dismissSoftInput();
        }
    }
}
