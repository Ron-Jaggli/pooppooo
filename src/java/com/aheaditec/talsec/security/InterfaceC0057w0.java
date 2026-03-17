package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public interface InterfaceC0057w0 {
    static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Build.VERSION.SDK_INT < 30 ? context.getPackageManager().getInstallerPackageName(packageName) : context.getPackageManager().getInstallSourceInfo(packageName).getInitiatingPackageName();
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            return null;
        }
    }

    static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            return null;
        }
    }

    F a();

    String b();

    U c();

    String d();

    InterfaceC0021g0 e();

    String f();

    String g();
}
