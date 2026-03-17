package com.unity3d.player;

import android.content.Context;
import android.provider.Settings;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class OrientationLockListener implements InterfaceC0215h0 {
    private C0221j0 a;
    private Context b;

    OrientationLockListener(Context context) {
        this.b = context;
        this.a = new C0221j0(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        this.a.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    public final void b() {
        nativeUpdateOrientationLockState(Settings.System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
    }

    public final native void nativeUpdateOrientationLockState(int i);
}
