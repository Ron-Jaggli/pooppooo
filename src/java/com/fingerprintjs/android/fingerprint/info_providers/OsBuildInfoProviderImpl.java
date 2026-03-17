package com.fingerprintjs.android.fingerprint.info_providers;

import android.os.Build;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: OsBuildInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "()V", OsBuildSignalsConstantsKt.ANDROID_VERSION_KEY, "", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, OsBuildSignalsConstantsKt.KERNEL_VERSION_KEY, HardwareSignalConstantsKt.MANUFACTURER_NAME_KEY, HardwareSignalConstantsKt.MODEL_NAME_KEY, OsBuildSignalsConstantsKt.SDK_VERSION_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OsBuildInfoProviderImpl implements OsBuildInfoProvider {
    @Override // com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider
    public String modelName() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl.modelName.1
            public final String invoke() {
                String str = Build.MODEL;
                Intrinsics.checkNotNull(str);
                return str;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider
    public String manufacturerName() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl.manufacturerName.1
            public final String invoke() {
                String str = Build.MANUFACTURER;
                Intrinsics.checkNotNull(str);
                return str;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider
    public String androidVersion() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl.androidVersion.1
            public final String invoke() {
                String str = Build.VERSION.RELEASE;
                Intrinsics.checkNotNull(str);
                return str;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider
    public String sdkVersion() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl.sdkVersion.1
            public final String invoke() {
                return String.valueOf(Build.VERSION.SDK_INT);
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider
    public String kernelVersion() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl.kernelVersion.1
            public final String invoke() {
                String property = System.getProperty("os.version");
                Intrinsics.checkNotNull(property);
                return property;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider
    public String fingerprint() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl.fingerprint.1
            public final String invoke() {
                String str = Build.FINGERPRINT;
                Intrinsics.checkNotNull(str);
                return str;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }
}
