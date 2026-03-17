package com.fingerprintjs.android.fingerprint.info_providers;

import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: FingerprintSensorInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "fingerprintManager", "Landroidx/core/hardware/fingerprint/FingerprintManagerCompat;", "(Landroidx/core/hardware/fingerprint/FingerprintManagerCompat;)V", "getStatus", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FingerprintSensorInfoProviderImpl implements FingerprintSensorInfoProvider {
    private final FingerprintManagerCompat fingerprintManager;

    public FingerprintSensorInfoProviderImpl(FingerprintManagerCompat fingerprintManagerCompat) {
        this.fingerprintManager = fingerprintManagerCompat;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProvider
    public FingerprintSensorStatus getStatus() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<FingerprintSensorStatus>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProviderImpl.getStatus.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprintSensorStatus m156invoke() {
                FingerprintManagerCompat fingerprintManagerCompat = FingerprintSensorInfoProviderImpl.this.fingerprintManager;
                Intrinsics.checkNotNull(fingerprintManagerCompat);
                if (fingerprintManagerCompat.isHardwareDetected()) {
                    if (!FingerprintSensorInfoProviderImpl.this.fingerprintManager.hasEnrolledFingerprints()) {
                        return FingerprintSensorStatus.SUPPORTED;
                    }
                    return FingerprintSensorStatus.ENABLED;
                }
                return FingerprintSensorStatus.NOT_SUPPORTED;
            }
        }, 1, null);
        FingerprintSensorStatus fingerprintSensorStatus = FingerprintSensorStatus.UNKNOWN;
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = fingerprintSensorStatus;
        }
        return (FingerprintSensorStatus) objSafeWithTimeout$default;
    }
}
