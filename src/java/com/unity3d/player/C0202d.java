package com.unity3d.player;

import android.window.OnBackInvokedCallback;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0202d implements OnBackInvokedCallback {
    final /* synthetic */ com.unity3d.player.a.e a;

    C0202d(com.unity3d.player.a.e eVar) {
        this.a = eVar;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = ((F) this.a).a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
