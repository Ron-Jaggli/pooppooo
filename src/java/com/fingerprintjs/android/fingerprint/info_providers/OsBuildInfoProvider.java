package com.fingerprintjs.android.fingerprint.info_providers;

import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: OsBuildInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "", OsBuildSignalsConstantsKt.ANDROID_VERSION_KEY, "", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, OsBuildSignalsConstantsKt.KERNEL_VERSION_KEY, HardwareSignalConstantsKt.MANUFACTURER_NAME_KEY, HardwareSignalConstantsKt.MODEL_NAME_KEY, OsBuildSignalsConstantsKt.SDK_VERSION_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OsBuildInfoProvider {
    String androidVersion();

    String fingerprint();

    String kernelVersion();

    String manufacturerName();

    String modelName();

    String sdkVersion();
}
