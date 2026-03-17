package com.unity3d.player;

import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class RunnableC0216h1 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ UnityPlayerForActivityOrService c;

    RunnableC0216h1(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i, int i2) {
        this.c = unityPlayerForActivityOrService;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        W w = this.c.mSoftInput;
        if (w != null) {
            int i2 = this.a;
            int i3 = this.b;
            EditText editText = w.c;
            if (editText == null || editText.getText().length() < (i = i3 + i2)) {
                return;
            }
            w.c.setSelection(i2, i);
        }
    }
}
