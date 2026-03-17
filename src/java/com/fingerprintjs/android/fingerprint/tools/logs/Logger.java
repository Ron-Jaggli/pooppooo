package com.fingerprintjs.android.fingerprint.tools.logs;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/logs/Logger;", "", "()V", "LOG_TAG", "", "e", "", "msg", "throwable", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Logger {
    public static final Logger INSTANCE = new Logger();
    private static final String LOG_TAG = "FingerprintJS";

    private Logger() {
    }

    public static /* synthetic */ void e$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            th = null;
        }
        logger.e(str, th);
    }

    public final void e(String str, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "msg");
        if (th == null) {
            Log.e(LOG_TAG, str);
        } else {
            Log.e(LOG_TAG, str, th);
        }
    }
}
