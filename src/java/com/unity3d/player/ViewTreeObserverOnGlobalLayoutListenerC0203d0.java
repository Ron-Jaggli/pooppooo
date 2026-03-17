package com.unity3d.player;

import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC0203d0 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ C0212g0 a;

    ViewTreeObserverOnGlobalLayoutListenerC0203d0(C0212g0 c0212g0) {
        this.a = c0212g0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
        this.a.h.b();
    }
}
