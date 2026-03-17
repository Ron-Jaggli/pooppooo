package com.gameanalytics.sdk.errorreporter;

import androidx.core.app.JobIntentService;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class ReportingIntentService extends JobIntentService {
    private ExceptionReporter exceptionReporter;

    protected ExceptionReporter getExceptionReporter() {
        return this.exceptionReporter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        if (GAState.useErrorReporting()) {
            this.exceptionReporter = ExceptionReporter.register(this);
        }
        GALogger.d("ReportingIntentService: onCreate");
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        GALogger.d("ReportingIntentService: onDestroy");
    }
}
