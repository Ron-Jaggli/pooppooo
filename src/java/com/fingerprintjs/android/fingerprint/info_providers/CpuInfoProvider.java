package com.fingerprintjs.android.fingerprint.info_providers;

import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CpuInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;", "", HardwareSignalConstantsKt.ABI_TYPE_KEY, "", HardwareSignalConstantsKt.CORES_COUNT_KEY, "", HardwareSignalConstantsKt.CPU_INFO_KEY, "", "cpuInfoV2", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CpuInfoProvider {
    String abiType();

    int coresCount();

    Map<String, String> cpuInfo();

    CpuInfo cpuInfoV2();
}
