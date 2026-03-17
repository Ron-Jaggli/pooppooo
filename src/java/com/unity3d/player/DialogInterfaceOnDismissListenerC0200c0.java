package com.unity3d.player;

import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class DialogInterfaceOnDismissListenerC0200c0 implements DialogInterface.OnDismissListener {
    final /* synthetic */ C0212g0 a;

    DialogInterfaceOnDismissListenerC0200c0(C0212g0 c0212g0) {
        this.a = c0212g0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
