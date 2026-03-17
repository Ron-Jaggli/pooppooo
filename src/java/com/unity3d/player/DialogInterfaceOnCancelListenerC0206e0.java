package com.unity3d.player;

import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class DialogInterfaceOnCancelListenerC0206e0 implements DialogInterface.OnCancelListener {
    final /* synthetic */ C0212g0 a;

    DialogInterfaceOnCancelListenerC0206e0(C0212g0 c0212g0) {
        this.a = c0212g0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        J j = this.a.f;
        if (j != null) {
            ((x1) j).a();
        }
    }
}
