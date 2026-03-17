package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import java.util.List;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class ApplicationExitInfoProvider {
    ApplicationExitInfoProvider() {
    }

    public static ApplicationExitInfoBase[] getHistoricalProcessExitReasons(Activity activity, String str, int i, int i2) {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(ActivityManager.class);
        if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            D.Log(5, "ApplicationExitInfoProvider: ApplicationExitInfo is only available from api 30 (Android 11)");
            return null;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(str, i, i2);
        int size = historicalProcessExitReasons.size();
        ApplicationExitInfoBase[] applicationExitInfoBaseArr = new ApplicationExitInfoBase[size];
        for (int i3 = 0; i3 < size; i3++) {
            applicationExitInfoBaseArr[i3] = new ApplicationExitInfoWrapper(historicalProcessExitReasons.get(i3));
        }
        return applicationExitInfoBaseArr;
    }

    public static void setProcessStateSummary(Activity activity, byte[] bArr) {
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            ((ActivityManager) activity.getSystemService(ActivityManager.class)).setProcessStateSummary(bArr);
        }
    }
}
