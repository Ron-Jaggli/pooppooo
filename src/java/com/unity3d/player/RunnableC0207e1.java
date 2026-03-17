package com.unity3d.player;

import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class RunnableC0207e1 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ UnityPlayerForActivityOrService b;

    RunnableC0207e1(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EditText editText;
        W w = this.b.mSoftInput;
        if (w == null || (str = this.a) == null || (editText = w.c) == null) {
            return;
        }
        editText.setText(str);
        w.c.setSelection(str.length());
    }
}
