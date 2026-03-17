package com.fingerprintjs.android.fingerprint.tools.logs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"ePleaseReport", "", "Lcom/fingerprintjs/android/fingerprint/tools/logs/Logger;", "throwable", "", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MessagesKt {
    public static final void ePleaseReport(Logger logger, Throwable th) {
        Intrinsics.checkNotNullParameter(logger, "<this>");
        logger.e("Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", th);
    }
}
