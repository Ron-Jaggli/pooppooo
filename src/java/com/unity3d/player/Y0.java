package com.unity3d.player;

import android.telephony.PhoneStateListener;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class Y0 extends PhoneStateListener {
    final /* synthetic */ UnityPlayer a;

    private Y0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        this.a.nativeMuteMasterAudio(i == 1);
    }
}
