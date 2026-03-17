package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0244r extends CameraCaptureSession.StateCallback {
    final /* synthetic */ C0255w a;

    C0244r(C0255w c0255w) {
        this.a = c0255w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.A = 3;
        D.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        StringBuilder sbAppend;
        C0255w c0255w = this.a;
        if (c0255w.b == null) {
            return;
        }
        synchronized (c0255w.t) {
            C0255w c0255w2 = this.a;
            c0255w2.r = cameraCaptureSession;
            try {
                c0255w2.q = c0255w2.b.createCaptureRequest(1);
                C0255w c0255w3 = this.a;
                c0255w3.q.addTarget(c0255w3.w);
                C0255w c0255w4 = this.a;
                c0255w4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0255w4.n);
                this.a.g();
            } catch (CameraAccessException e) {
                sbAppend = new StringBuilder("Camera2: CameraAccessException ").append(e);
                D.Log(6, sbAppend.toString());
            } catch (IllegalStateException e2) {
                sbAppend = new StringBuilder("Camera2: IllegalStateException ").append(e2);
                D.Log(6, sbAppend.toString());
            }
        }
    }
}
