package com.gameanalytics.sdk.errorreporter;

import android.content.Intent;
import android.util.Log;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.store.GAStore;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GameAnalyticsExceptionReportService extends ReportingIntentService {
    static final String ACTION_SAVE_REPORT = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".actionSaveReport");
    static final String EXTRA_GAME_KEY = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraGameKey");
    static final String EXTRA_SECRET_KEY = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraSecretKey");
    static final String EXTRA_WRITABLE_PATH = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraWritablePath");
    static final String EXTRA_INFO_LOG_ENABLED = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraInfoLogEnabled");
    static final String EXTRA_VERBOSE_LOG_ENABLED = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraVerboseLogEnabled");
    private static final String TAG = "GameAnalyticsExceptionReportService";

    protected void onHandleWork(Intent intent) {
        try {
            if (intent.getAction().equals(ACTION_SAVE_REPORT)) {
                saveReport(intent);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error while sending an error report: ", e);
        }
    }

    private void saveReport(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_GAME_KEY);
        String stringExtra2 = intent.getStringExtra(EXTRA_SECRET_KEY);
        String stringExtra3 = intent.getStringExtra(EXTRA_WRITABLE_PATH);
        boolean booleanExtra = intent.getBooleanExtra(EXTRA_INFO_LOG_ENABLED, false);
        boolean booleanExtra2 = intent.getBooleanExtra(EXTRA_VERBOSE_LOG_ENABLED, false);
        GALogger.setInfoLog(booleanExtra);
        GALogger.setAdvancedInfoLog(booleanExtra2);
        GALogger.ii("Got request to report error: " + intent.toString());
        GADevice.setWritableFilePath(stringExtra3);
        if (GAStore.ensureDatabase(false)) {
            GAState.setKeys(stringExtra, stringExtra2);
            GAState.setInitialized(true);
            GAEvents.processEvents("", false);
        }
    }
}
