package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.aheaditec.talsec.security.AbstractC0023h;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class UnityPermissions {
    private static final String SKIP_DIALOG_METADATA_NAME = "unityplayer.SkipPermissionsDialog";

    private static boolean checkInfoForMetadata(PackageItemInfo packageItemInfo) {
        try {
            return packageItemInfo.metaData.getBoolean(SKIP_DIALOG_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean hasUserAuthorizedPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestUserPermissions(Activity activity, String[] strArr, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        if (activity == 0 || strArr == null || strArr.length == 0) {
            return;
        }
        if (activity instanceof IUnityPermissionRequestSupport) {
            ((IUnityPermissionRequestSupport) activity).requestPermissions(new PermissionRequest(strArr, iPermissionRequestCallbacks));
        } else {
            activity.requestPermissions(strArr, 96489);
        }
    }

    static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static boolean skipPermissionsDialog(Activity activity) {
        try {
            PackageManager packageManager = activity.getPackageManager();
            ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), AbstractC0023h.n);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(activity.getPackageName(), AbstractC0023h.n);
            if (checkInfoForMetadata(activityInfo)) {
                return true;
            }
            return checkInfoForMetadata(applicationInfo);
        } catch (Exception unused) {
            return false;
        }
    }
}
