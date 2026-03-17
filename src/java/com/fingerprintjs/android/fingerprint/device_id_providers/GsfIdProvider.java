package com.fingerprintjs.android.fingerprint.device_id_providers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
 */
/* JADX INFO: compiled from: GsfIdProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getGsfAndroidId", "", "getGsfId", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GsfIdProvider {
    private final ContentResolver contentResolver;

    public GsfIdProvider(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    public final String getGsfAndroidId() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider.getGsfAndroidId.1
            {
                super(0);
            }

            public final String invoke() {
                return GsfIdProvider.this.getGsfId();
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getGsfId() {
        Uri uri = Uri.parse("content://com.google.android.gsf.gservices");
        String[] strArr = {"android_id"};
        try {
            ContentResolver contentResolver = this.contentResolver;
            Intrinsics.checkNotNull(contentResolver);
            Cursor cursorQuery = contentResolver.query(uri, null, null, strArr, null);
            Intrinsics.checkNotNull(cursorQuery);
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (!cursor2.moveToFirst() || cursor2.getColumnCount() < 2) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                String string = cursor2.getString(1);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String hexString = Long.toHexString(Long.parseLong(string));
                CloseableKt.closeFinally(cursor, (Throwable) null);
                return hexString;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
