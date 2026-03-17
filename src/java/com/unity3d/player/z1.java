package com.unity3d.player;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class z1 implements SurfaceHolder.Callback {
    final /* synthetic */ UnityPlayerForGameActivity a;

    z1(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        O o = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        N n = o.b;
        if (n == null || n.getParent() != null) {
            return;
        }
        frameLayout.addView(o.b);
        frameLayout.bringChildToFront(o.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        O o = unityPlayerForGameActivity.m_PersistentUnitySurface;
        SurfaceView surfaceView = unityPlayerForGameActivity.m_SurfaceView;
        o.getClass();
        if (!PlatformSupport.NOUGAT_SUPPORT || o.a == null) {
            return;
        }
        if (o.b == null) {
            o.b = new N(o, o.a);
        }
        o.b.a(surfaceView);
    }
}
