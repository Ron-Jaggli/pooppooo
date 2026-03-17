package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class M implements PixelCopy.OnPixelCopyFinishedListener {
    final /* synthetic */ Semaphore a;
    final /* synthetic */ N b;

    M(N n, Semaphore semaphore) {
        this.b = n;
        this.a = semaphore;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        this.a.release();
        if (i == 0) {
            Context context = this.b.b.a;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new L(this));
            }
        }
    }
}
