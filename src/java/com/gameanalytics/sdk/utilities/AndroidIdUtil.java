package com.gameanalytics.sdk.utilities;

import android.content.Context;
import android.provider.Settings;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class AndroidIdUtil {
    public static String getAndroidId(final Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (SecurityException unused) {
            return null;
        }
    }
}
