package com.fingerprintjs.android.fingerprint.device_id_providers;

import android.media.MediaDrm;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
 */
/* JADX INFO: compiled from: MediaDrmIdProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "", "()V", "getMediaDrmId", "", "mediaDrmId", "releaseMediaDRM", "", "drmObject", "Landroid/media/MediaDrm;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaDrmIdProvider {
    public final String getMediaDrmId() {
        Object objSafeWithTimeout = SafeKt.safeWithTimeout(MediaDrmIdProviderKt.MEDIA_DRM_ID_TIMEOUT_MS, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider.getMediaDrmId.1
            {
                super(0);
            }

            public final String invoke() {
                return MediaDrmIdProvider.this.mediaDrmId();
            }
        });
        if (Result.isFailure-impl(objSafeWithTimeout)) {
            objSafeWithTimeout = null;
        }
        return (String) objSafeWithTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String mediaDrmId() throws NoSuchAlgorithmException {
        MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
        byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
        Intrinsics.checkNotNullExpressionValue(propertyByteArray, "getPropertyByteArray(...)");
        releaseMediaDRM(mediaDrm);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        messageDigest.update(propertyByteArray);
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return MediaDrmIdProviderKt.toHexString(bArrDigest);
    }

    private final void releaseMediaDRM(MediaDrm mediaDrm) {
        mediaDrm.close();
    }
}
