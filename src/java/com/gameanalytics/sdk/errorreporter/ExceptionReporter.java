package com.gameanalytics.sdk.errorreporter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import com.gameanalytics.sdk.GAErrorSeverity;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.HashMap;
import org.json.JSONException;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class ExceptionReporter {
    private static HashMap<String, Integer> ErrorTypeCountMap = new HashMap<>();
    private static final int FIXED_JOB_ID = 12345;
    private static final int MAX_ERROR_TYPE_COUNT = 20;
    private Context context;
    private Handler handler;

    public static ExceptionReporter register(Context context) {
        GALogger.d("Registering ExceptionReporter");
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof Handler) {
            Handler handler = (Handler) defaultUncaughtExceptionHandler;
            handler.errorHandler.setContext(context);
            return handler.errorHandler;
        }
        ExceptionReporter exceptionReporter = new ExceptionReporter(defaultUncaughtExceptionHandler, context);
        Thread.setDefaultUncaughtExceptionHandler(exceptionReporter.handler);
        return exceptionReporter;
    }

    private void setContext(Context context) {
        if (context.getApplicationContext() != null) {
            this.context = context.getApplicationContext();
        } else {
            this.context = context;
        }
    }

    private ExceptionReporter(Thread.UncaughtExceptionHandler defaultHandler, Context context) {
        this.handler = new Handler(defaultHandler);
        setContext(context);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
     */
    private class Handler implements Thread.UncaughtExceptionHandler {
        private ExceptionReporter errorHandler;
        private Thread.UncaughtExceptionHandler subject;

        private Handler(Thread.UncaughtExceptionHandler subject) {
            this.subject = subject;
            this.errorHandler = ExceptionReporter.this;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable ex) {
            GALogger.d("ExceptionReporter uncaughtException");
            try {
                ExceptionReporter.this.reportException(thread, ex);
            } catch (Exception e) {
                GALogger.e("Error while reporting exception: " + e.toString());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.subject;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, ex);
            }
        }
    }

    public void reportException(Thread thread, Throwable ex) {
        reportException(thread, ex, null);
    }

    public void reportException(Thread thread, Throwable ex, String extraMessage) {
        StringWriter stringWriter = new StringWriter();
        ex.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + SystemClock.elapsedRealtime()));
        intent.setAction(GameAnalyticsExceptionReportService.ACTION_SAVE_REPORT);
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_GAME_KEY, GAState.getGameKey());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_SECRET_KEY, GAState.getSecretKey());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_WRITABLE_PATH, GADevice.getWritableFilePath());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_INFO_LOG_ENABLED, GALogger.getInfoLog());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_VERBOSE_LOG_ENABLED, GALogger.getAdvancedInfoLog());
        String name = ex.getClass().getName();
        String str = (("# Type of exception: " + name + "\n") + "# Exception message: " + ex.getMessage() + "\n") + "# Thread name: " + thread.getName() + "\n";
        if (extraMessage != null) {
            str = str + "# Extra message: " + extraMessage + "\n";
        }
        String strSubstring = str + "# Stacktrace: " + string;
        if (strSubstring.length() > 8192) {
            strSubstring = strSubstring.substring(0, 8192);
        }
        String str2 = strSubstring;
        if (!ErrorTypeCountMap.containsKey(name)) {
            ErrorTypeCountMap.put(name, 0);
        }
        Integer num = ErrorTypeCountMap.get(name);
        if (num == null || num.intValue() <= MAX_ERROR_TYPE_COUNT) {
            ErrorTypeCountMap.put(name, Integer.valueOf(num.intValue() + 1));
            GAPlatform.FunctionInfo functionInfo = new GAPlatform.FunctionInfo();
            GAEvents.addErrorEvent(GAErrorSeverity.Critical, str2, null, false, functionInfo.method, functionInfo.line, functionInfo.module);
            GAEvents.cleanupEvents();
            try {
                GAEvents.fixMissingSessionEndEvents();
            } catch (JSONException unused) {
            }
            intent.setClass(this.context, GameAnalyticsExceptionReportService.class);
            GameAnalyticsExceptionReportService.enqueueWork(this.context, GameAnalyticsExceptionReportService.class, FIXED_JOB_ID, intent);
        }
    }

    private static long getAvailableBlocks(StatFs stat) {
        return getAvailableBlocks18AndAbove(stat);
    }

    private static long getAvailableBlocks18AndAbove(StatFs stat) {
        return stat.getAvailableBlocksLong();
    }

    private static long getAvailableBlocks17AndBelow(StatFs stat) {
        return stat.getAvailableBlocks();
    }

    private static long getBlockSize(StatFs stat) {
        return getBlockSize18AndAbove(stat);
    }

    private static long getBlockSize18AndAbove(StatFs stat) {
        return stat.getBlockSizeLong();
    }

    private static long getBlockSize17AndBelow(StatFs stat) {
        return stat.getBlockSize();
    }

    private static long getBlockCount(StatFs stat) {
        return getBlockCount18AndAbove(stat);
    }

    private static long getBlockCount18AndAbove(StatFs stat) {
        return stat.getBlockCountLong();
    }

    private static long getBlockCount17AndBelow(StatFs stat) {
        return stat.getBlockCount();
    }
}
