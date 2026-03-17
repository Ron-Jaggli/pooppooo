package com.gameanalytics.sdk.utilities;

import android.content.Context;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.logging.GALogger;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class Reflection {
    private static Object getAdvertisingInfoObject(String packageName, Context context) throws Exception {
        return invokeStaticMethod(packageName + ".AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    public static String getAdId(String packageName, Context context) {
        if (GADevice.doTrackGAID) {
            try {
                return (String) invokeInstanceMethod(getAdvertisingInfoObject(packageName, context), "getId", null, new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static Boolean isLimitAdTrackingEnabled(String packageName, Context context) {
        try {
            return (Boolean) invokeInstanceMethod(getAdvertisingInfoObject(packageName, context), "isLimitAdTrackingEnabled", null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean isInstantApp(Context context) {
        try {
            return (Boolean) invokeStaticMethod("com.google.android.instantapps.InstantApps", "isInstantApp", new Class[]{Context.class}, context);
        } catch (Throwable th) {
            GALogger.d("Could not find 'com.google.android.instantapps.InstantApps' class with 'isInstantApp' method: " + th.toString());
            return null;
        }
    }

    public static Object invokeStaticMethod(String className, String methodName, Class[] cArgs, Object... args) throws Exception {
        return invokeMethod(Class.forName(className), methodName, null, cArgs, args);
    }

    public static Object invokeInstanceMethod(Object instance, String methodName, Class[] cArgs, Object... args) throws Exception {
        return invokeMethod(instance.getClass(), methodName, instance, cArgs, args);
    }

    public static Object invokeMethod(Class classObject, String methodName, Object instance, Class[] cArgs, Object... args) throws Exception {
        Method method = classObject.getMethod(methodName, cArgs);
        if (method == null) {
            return null;
        }
        return method.invoke(instance, args);
    }
}
