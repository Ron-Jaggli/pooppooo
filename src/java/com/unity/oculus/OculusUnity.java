package com.unity.oculus;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.aheaditec.talsec.security.AbstractC0023h;
import com.unity3d.player.UnityPlayer;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class OculusUnity implements SurfaceHolder.Callback {
    Activity activity;
    SurfaceView glView;

    private native void surfaceCreated(Surface surface);

    public void pauseOculus() {
    }

    public void resumeOculus() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void initOculus() {
        Log.d("Unity", "initOculus Java!");
        Activity activity = UnityPlayer.currentActivity;
        this.activity = activity;
        activity.runOnUiThread(new Runnable() { // from class: com.unity.oculus.OculusUnity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m270lambda$initOculus$0$comunityoculusOculusUnity();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initOculus$0$com-unity-oculus-OculusUnity, reason: not valid java name */
    /* synthetic */ void m270lambda$initOculus$0$comunityoculusOculusUnity() {
        this.glView = null;
        int identifier = this.activity.getResources().getIdentifier("unitySurfaceView", "id", this.activity.getPackageName());
        if (identifier == 0) {
            Log.e("Unity", "Failed to find SurfaceView Identifier!");
        } else {
            SurfaceView surfaceView = (SurfaceView) this.activity.findViewById(identifier);
            if (surfaceView != null && (surfaceView instanceof SurfaceView)) {
                this.glView = surfaceView;
                surfaceView.getHolder().addCallback(this);
            }
        }
        if (this.glView == null) {
            Log.e("Unity", "Failed to find GlView!");
        }
        Log.d("Unity", "Oculus UI thread done.");
        surfaceCreated(this.glView.getHolder().getSurface());
    }

    public void destroyOculus() {
        SurfaceView surfaceView = this.glView;
        if (surfaceView != null) {
            surfaceView.getHolder().removeCallback(this);
        }
    }

    public static void loadLibrary(String str) {
        Log.d("Unity", "loading library " + str);
        System.loadLibrary(str);
    }

    public static boolean getManifestSetting(String str) {
        try {
            Activity activity = UnityPlayer.currentActivity;
            return activity.getPackageManager().getApplicationInfo(activity.getPackageName(), AbstractC0023h.n).metaData.getBoolean(str);
        } catch (Exception unused) {
            Log.d("Unity", "Oculus XR Plugin init error");
            return false;
        }
    }

    public static boolean getLateLatching() {
        return getManifestSetting("com.unity.xr.oculus.LateLatching");
    }

    public static boolean getLateLatchingDebug() {
        return getManifestSetting("com.unity.xr.oculus.LateLatchingDebug");
    }

    public static boolean getLowOverheadMode() {
        return getManifestSetting("com.unity.xr.oculus.LowOverheadMode");
    }

    public static boolean getIsOnOculusHardware() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains("oculus");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceCreated(surfaceHolder.getSurface());
    }
}
