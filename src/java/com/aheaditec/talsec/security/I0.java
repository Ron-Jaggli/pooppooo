package com.aheaditec.talsec.security;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class I0 {
    public final KeyguardManager a;

    public I0(KeyguardManager keyguardManager) {
        this.a = keyguardManager;
    }

    public boolean a() {
        return this.a.isDeviceSecure();
    }

    public static I0 a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        if (keyguardManager != null) {
            return new I0(keyguardManager);
        }
        return null;
    }
}
