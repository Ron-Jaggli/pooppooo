package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class Camera2Wrapper implements com.unity3d.player.a.b {
    private Context a;
    private C0255w b = null;

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    protected void closeCamera2() {
        C0255w c0255w = this.b;
        if (c0255w != null) {
            c0255w.a();
        }
        this.b = null;
    }

    protected int getCamera2Count() {
        return C0255w.getCameraIds(this.a).length;
    }

    protected int getCamera2FocalLengthEquivalent(int i) {
        return C0255w.a(this.a, i);
    }

    protected int[] getCamera2Resolutions(int i) {
        return C0255w.b(this.a, i);
    }

    protected int getCamera2SensorOrientation(int i) {
        return C0255w.c(this.a, i);
    }

    protected Rect getFrameSizeCamera2() {
        C0255w c0255w = this.b;
        return c0255w != null ? c0255w.c() : new Rect();
    }

    protected boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        int i6 = C0255w.E;
        C0255w c0261z = PlatformSupport.QUINCE_TART_SUPPORT ? new C0261z(this) : new C0255w(this);
        this.b = c0261z;
        return c0261z.a(this.a, i, i2, i3, i4, i5, surface);
    }

    protected boolean isCamera2AutoFocusPointSupported(int i) {
        return C0255w.d(this.a, i);
    }

    protected boolean isCamera2FrontFacing(int i) {
        return C0255w.e(this.a, i);
    }

    protected void pauseCamera2() {
        C0255w c0255w = this.b;
        if (c0255w != null) {
            c0255w.d();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f2) {
        C0255w c0255w = this.b;
        if (c0255w != null) {
            return c0255w.a(f, f2);
        }
        return false;
    }

    protected void startCamera2() {
        C0255w c0255w = this.b;
        if (c0255w != null) {
            c0255w.h();
        }
    }

    protected void stopCamera2() {
        C0255w c0255w = this.b;
        if (c0255w != null) {
            c0255w.i();
        }
    }
}
