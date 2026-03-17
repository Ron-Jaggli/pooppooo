package com.fingerprintjs.android.fingerprint.info_providers;

import android.os.Build;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.parsers.CpuInfoParserKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CpuInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002¨\u0006\r"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;", "()V", HardwareSignalConstantsKt.ABI_TYPE_KEY, "", HardwareSignalConstantsKt.CORES_COUNT_KEY, "", HardwareSignalConstantsKt.CPU_INFO_KEY, "", "cpuInfoV2", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getCpuInfo", "getCpuInfoV2", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CpuInfoProviderImpl implements CpuInfoProvider {
    @Override // com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider
    public Map<String, String> cpuInfo() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<Map<String, ? extends String>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProviderImpl.cpuInfo.1
            {
                super(0);
            }

            public final Map<String, String> invoke() {
                return CpuInfoProviderImpl.this.getCpuInfo();
            }
        }, 1, null);
        Map mapEmptyMap = MapsKt.emptyMap();
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = mapEmptyMap;
        }
        return (Map) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider
    public CpuInfo cpuInfoV2() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<CpuInfo>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProviderImpl.cpuInfoV2.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CpuInfo m147invoke() {
                return CpuInfoProviderImpl.this.getCpuInfoV2();
            }
        }, 1, null);
        CpuInfo empty = CpuInfo.Companion.getEMPTY();
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = empty;
        }
        return (CpuInfo) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider
    public String abiType() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProviderImpl.abiType.1
            public final String invoke() {
                String str = Build.SUPPORTED_ABIS[0];
                Intrinsics.checkNotNull(str);
                return str;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider
    public int coresCount() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<Integer>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProviderImpl.coresCount.1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Integer m145invoke() {
                Runtime runtime = Runtime.getRuntime();
                Intrinsics.checkNotNull(runtime);
                return Integer.valueOf(runtime.availableProcessors());
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = 0;
        }
        return ((Number) objSafeWithTimeout$default).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getCpuInfo() {
        HashMap map = new HashMap();
        Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
        try {
            Scanner scanner2 = scanner;
            while (scanner2.hasNextLine()) {
                String strNextLine = scanner2.nextLine();
                Intrinsics.checkNotNull(strNextLine);
                List listSplit$default = StringsKt.split$default(strNextLine, new String[]{": "}, false, 0, 6, (Object) null);
                if (listSplit$default.size() > 1) {
                    String str = (String) listSplit$default.get(0);
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare(str.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    String string = str.subSequence(i, length + 1).toString();
                    String str2 = (String) listSplit$default.get(1);
                    int length2 = str2.length() - 1;
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 <= length2) {
                        boolean z4 = Intrinsics.compare(str2.charAt(!z3 ? i2 : length2), 32) <= 0;
                        if (z3) {
                            if (!z4) {
                                break;
                            }
                            length2--;
                        } else if (z4) {
                            i2++;
                        } else {
                            z3 = true;
                        }
                    }
                    map.put(string, str2.subSequence(i2, length2 + 1).toString());
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(scanner, (Throwable) null);
            return map;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CpuInfo getCpuInfoV2() {
        return CpuInfoParserKt.parseCpuInfo(FilesKt.readText$default(new File("/proc/cpuinfo"), (Charset) null, 1, (Object) null));
    }
}
