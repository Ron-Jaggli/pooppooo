package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class V implements TextView.OnEditorActionListener {
    final /* synthetic */ W a;

    V(W w) {
        this.a = w;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            W w = this.a;
            w.a(w.a(), false);
        }
        return false;
    }
}
