package com.gameanalytics.sdk.logging;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GALogger {
    private static final GALogger INSTANCE = new GALogger();
    private static final String TAG = "GameAnalytics";
    private boolean debugEnabled;
    private boolean infoLogAdvancedEnabled;
    private boolean infoLogEnabled;

    private GALogger() {
    }

    private static GALogger getInstance() {
        return INSTANCE;
    }

    public static void setInfoLog(boolean enabled) {
        getInstance().infoLogEnabled = enabled;
    }

    public static void setAdvancedInfoLog(boolean enabled) {
        getInstance().infoLogAdvancedEnabled = enabled;
    }

    public static boolean getInfoLog() {
        return getInstance().infoLogEnabled;
    }

    public static boolean getAdvancedInfoLog() {
        return getInstance().infoLogAdvancedEnabled;
    }

    public static void i(final String format) {
        if (getInstance().infoLogEnabled) {
            getInstance().sendNotificationMessage("Info/GameAnalytics: " + format, EGALoggerMessageType.Info);
        }
    }

    public static void w(final String format) {
        getInstance().sendNotificationMessage("Warning/GameAnalytics: " + format, EGALoggerMessageType.Warning);
    }

    public static void e(final String format) {
        getInstance().sendNotificationMessage("Error/GameAnalytics: " + format, EGALoggerMessageType.Error);
    }

    public static void d(final String format) {
        if (getInstance().debugEnabled) {
            getInstance().sendNotificationMessage("Debug/GameAnalytics: " + format, EGALoggerMessageType.Debug);
        }
    }

    public static void ii(final String format) {
        if (getInstance().infoLogAdvancedEnabled) {
            getInstance().sendNotificationMessage("Verbose/GameAnalytics: " + format, EGALoggerMessageType.Info);
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    /* JADX INFO: renamed from: com.gameanalytics.sdk.logging.GALogger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType;

        static {
            int[] iArr = new int[EGALoggerMessageType.values().length];
            $SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType = iArr;
            try {
                iArr[EGALoggerMessageType.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType[EGALoggerMessageType.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType[EGALoggerMessageType.Debug.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType[EGALoggerMessageType.Info.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void sendNotificationMessage(final String message, EGALoggerMessageType type) {
        int i = AnonymousClass1.$SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType[type.ordinal()];
        if (i == 1) {
            Log.e("GameAnalytics", message);
            return;
        }
        if (i == 2) {
            Log.w("GameAnalytics", message);
        } else if (i == 3) {
            Log.d("GameAnalytics", message);
        } else {
            if (i != 4) {
                return;
            }
            Log.i("GameAnalytics", message);
        }
    }
}
