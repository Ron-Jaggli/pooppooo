package com.gameanalytics.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.errorreporter.ExceptionReporter;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.utilities.Reflection;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAPlatform {
    private static String activityId = "";
    private static WeakReference<Activity> activityRef;
    private static Context appContext;
    private static boolean initialized;
    private static boolean registered;
    private static boolean usedResumed;
    private static boolean usedStopped;

    static boolean isInitialized() {
        return initialized;
    }

    public static Context getApplicationContext() {
        return appContext;
    }

    public static void initialize(Activity activity) {
        String path;
        if (initialized) {
            return;
        }
        if (activity == null) {
            GALogger.w("Cannot initialize as activity is null");
            return;
        }
        initialized = true;
        activityId = activity.getClass().getCanonicalName();
        Context applicationContext = activity.getApplicationContext();
        appContext = applicationContext;
        checkReadAndWriteExternalPermission(applicationContext);
        if (appContext.getExternalCacheDir() != null && !isInstantApp(appContext)) {
            GALogger.d("Using getExternalCacheDir()");
            path = appContext.getExternalCacheDir().getPath();
        } else if (appContext.getCacheDir() != null) {
            GALogger.d("Using getCacheDir()");
            path = appContext.getCacheDir().getPath();
        } else {
            GALogger.d("Using getFilesDir()");
            path = appContext.getFilesDir().getPath();
        }
        GameAnalytics.configureWritableFilePath(path);
        GameAnalytics.configureIsHacked(isDeviceRooted());
        updateAppSignature();
        updateChannelId();
        GameAnalytics.setConnectionType(getConnectionType());
        final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.gameanalytics.sdk.GAPlatform.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                GameAnalytics.setConnectionType(GAPlatform.getConnectionType());
            }
        };
        if (!registered) {
            appContext.registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            registered = true;
        }
        activity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.gameanalytics.sdk.GAPlatform.2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity2, Bundle savedInstanceState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity2, Bundle outState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity2) {
                String canonicalName = activity2.getClass().getCanonicalName();
                boolean unused = GAPlatform.usedResumed = true;
                GALogger.d("onActivityResumed: " + canonicalName + ", usedResumed=" + GAPlatform.usedResumed + ", usedStopped=" + GAPlatform.usedStopped);
                if (GAPlatform.usedStopped) {
                    GAPlatform.onActivityResumed(activity2);
                }
                boolean unused2 = GAPlatform.usedStopped = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity2) {
                GALogger.d("onActivityPaused: " + activity2.getClass().getCanonicalName());
                boolean unused = GAPlatform.usedResumed = false;
                boolean unused2 = GAPlatform.usedStopped = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity2) {
                String canonicalName = activity2.getClass().getCanonicalName();
                boolean unused = GAPlatform.usedStopped = true;
                GALogger.d("onActivityStopped: " + canonicalName + ", usedResumed=" + GAPlatform.usedResumed + ", usedStopped=" + GAPlatform.usedStopped);
                if (GAPlatform.usedResumed) {
                    return;
                }
                GAPlatform.onActivityStopped(activity2);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity2) {
                String canonicalName = activity2.getClass().getCanonicalName();
                GALogger.d("onActivityDestroyed: " + canonicalName + " -- " + GAPlatform.activityId);
                if (canonicalName.equals(GAPlatform.activityId)) {
                    if (GAPlatform.registered) {
                        GAPlatform.appContext.unregisterReceiver(broadcastReceiver);
                        boolean unused = GAPlatform.registered = false;
                    }
                    GALogger.d("onActivityDestroyed: " + activity2);
                    GAPlatform.onActivityStopped(activity2);
                }
            }
        });
        GameAnalytics.setBundleIdentifier(getBundleIdentifier());
        GameAnalytics.setAppVersion(getAppVersion());
        GameAnalytics.setAppBuild(getAppBuild());
        if (GAState.useErrorReporting()) {
            ExceptionReporter.register(appContext);
        }
        activityRef = new WeakReference<>(activity);
    }

    private static boolean isInstantApp(Context context) {
        Boolean boolIsInstantApp = Reflection.isInstantApp(context);
        return boolIsInstantApp != null && boolIsInstantApp.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onActivityResumed(Activity activity) {
        if (!GAState.useManualSessionHandling()) {
            GameAnalytics.onResume();
        } else {
            GALogger.i("onActivityResumed: Not calling GameAnalytics.onResume() as using manual session handling");
        }
        GAState.setInForeground(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onActivityStopped(Activity activity) {
        if (!GAState.useManualSessionHandling()) {
            GameAnalytics.onStop();
        } else {
            GALogger.i("onActivityStopped: Not calling GameAnalytics.onStop() as using manual session handling");
        }
        GAState.setInForeground(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getConnectionType() {
        return getConnectionType28AndAbove();
    }

    private static String getConnectionType28AndAbove() {
        ConnectivityManager connectivityManager = (ConnectivityManager) appContext.getSystemService("connectivity");
        if (connectivityManager != null) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    return "wwan";
                }
            }
        }
        return "offline";
    }

    private static String getConnectionType23AndAbove() {
        ConnectivityManager connectivityManager = (ConnectivityManager) appContext.getSystemService("connectivity");
        if (connectivityManager != null) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    return "wwan";
                }
            }
        }
        return "offline";
    }

    private static String getConnectionType22AndBelow() {
        ConnectivityManager connectivityManager = (ConnectivityManager) appContext.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "offline";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo != null && networkInfo.isConnected()) {
            return "wifi";
        }
        if (networkInfo2 == null || !networkInfo2.isConnected()) {
            return "offline";
        }
        return "wwan";
    }

    private static String getBundleIdentifier() {
        String packageName = appContext.getPackageName();
        return (packageName == null || packageName.isEmpty()) ? "unassigned" : packageName;
    }

    private static String getAppVersion() {
        try {
            return appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int getAppBuild() {
        try {
            return getVersionCode(appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 0));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static int getVersionCode(PackageInfo info) {
        return getVersionCode28AndAbove(info);
    }

    private static int getVersionCode28AndAbove(PackageInfo info) {
        return (int) info.getLongVersionCode();
    }

    private static int getVersionCode27AndBelow(PackageInfo info) {
        return info.versionCode;
    }

    public static boolean isReadPhoneStatePermissionPresentInManifest(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr = packageInfo != null ? packageInfo.requestedPermissions : null;
            if (strArr == null || strArr.length <= 0) {
                return false;
            }
            for (String str : strArr) {
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void updateAppSignature() {
        updateAppSignature28AndAbove();
    }

    private static void updateAppSignature28AndAbove() {
        try {
            Signature[] apkContentsSigners = appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 134217728).signingInfo.getApkContentsSigners();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            if (apkContentsSigners.length > 0) {
                messageDigest.update(apkContentsSigners[0].toByteArray());
                GADevice.setAppSignature(new String(bytesToHex(messageDigest.digest())));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | Exception unused) {
        }
    }

    private static void updateAppSignature27AndBelow() {
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 64);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr.length > 0) {
                messageDigest.update(signatureArr[0].toByteArray());
                GADevice.setAppSignature(new String(bytesToHex(messageDigest.digest())));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | Exception unused) {
        }
    }

    private static void updateChannelId() {
        PackageManager packageManager = appContext.getPackageManager();
        try {
            GADevice.setChannelId(packageManager.getInstallerPackageName(packageManager.getApplicationInfo(appContext.getPackageName(), 0).packageName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void setLimitAdTrackingEnabled(boolean limitedAdTracking) {
        GameAnalytics.configureIsLimitedAdTracking(limitedAdTracking);
    }

    private static boolean isDeviceRooted() {
        return checkRootMethod1() || checkRootMethod2() || checkRootMethod3() || checkRootMethod4();
    }

    private static boolean checkRootMethod1() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean checkRootMethod2() {
        return new File("/system/app/Superuser.apk").exists();
    }

    private static boolean checkRootMethod3() {
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i = 0; i < 8; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRootMethod4() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                if (processExec != null) {
                    processExec.destroy();
                }
                return true;
            }
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    private static String bytesToHex(byte[] bytes) {
        if (bytes.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(String.format("%02x", Byte.valueOf(bytes[0])));
        for (int i = 1; i < bytes.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bytes[i])));
        }
        return sb.toString();
    }

    public static boolean checkReadAndWriteExternalPermission(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0 && context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private static boolean checkReadPhoneStatePermission() {
        return appContext.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
     */
    public static class FunctionInfo {
        static final int UNKNOWN_LINE = -1;
        public boolean appendModuleClassToMethodName = true;
        public String javaClass;
        public int line;
        public String method;
        public String module;

        public FunctionInfo() {
            this.module = "";
            this.method = "";
            this.javaClass = "";
            this.line = UNKNOWN_LINE;
            try {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int i = 3;
                while (i < stackTrace.length && stackTrace[i].toString().contains("com.gameanalytics.sdk")) {
                    i++;
                }
                this.method = stackTrace[i].getMethodName();
                this.line = stackTrace[i].getLineNumber();
                this.javaClass = stackTrace[i].getClassName();
                this.module = Class.forName(stackTrace[i].getClassName()).getPackage().getName();
                if (!this.appendModuleClassToMethodName || this.method == null || this.javaClass == null) {
                    return;
                }
                this.method = this.javaClass + '.' + this.method;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
