package com.unity3d.player;

import android.content.Context;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class AudioVolumeHandler implements InterfaceC0238p {
    private C0241q a;

    AudioVolumeHandler(Context context) {
        C0241q c0241q = new C0241q(context);
        this.a = c0241q;
        c0241q.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override // com.unity3d.player.InterfaceC0238p
    public final native void onAudioVolumeChanged(int i);
}
