package com.fingerprintjs.android.fingerprint.info_providers;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: GpuInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;", "activityManager", "Landroid/app/ActivityManager;", "(Landroid/app/ActivityManager;)V", HardwareSignalConstantsKt.GLES_VERSION_KEY, "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GpuInfoProviderImpl implements GpuInfoProvider {
    private final ActivityManager activityManager;

    public GpuInfoProviderImpl(ActivityManager activityManager) {
        this.activityManager = activityManager;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProvider
    public String glesVersion() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProviderImpl.glesVersion.1
            {
                super(0);
            }

            public final String invoke() {
                ActivityManager activityManager = GpuInfoProviderImpl.this.activityManager;
                Intrinsics.checkNotNull(activityManager);
                ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
                Intrinsics.checkNotNull(deviceConfigurationInfo);
                String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
                Intrinsics.checkNotNull(glEsVersion);
                return glEsVersion;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }
}
