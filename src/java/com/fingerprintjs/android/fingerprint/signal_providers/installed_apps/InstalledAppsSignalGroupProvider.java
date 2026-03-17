package com.fingerprintjs.android.fingerprint.signal_providers.installed_apps;

import com.fingerprintjs.android.fingerprint.info_providers.PackageInfo;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: InstalledAppsSignalGroupProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00140\u00150\u0014H\u0002J\u001a\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00140\u00150\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsRawData;", "packageManagerDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsRawData;", "rawData$delegate", "Lkotlin/Lazy;", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "v2", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstalledAppsSignalGroupProvider extends SignalGroupProvider<InstalledAppsRawData> {
    private final Hasher hasher;
    private final Lazy rawData$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsSignalGroupProvider(final PackageManagerDataSource packageManagerDataSource, Hasher hasher, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(packageManagerDataSource, "packageManagerDataSource");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy(new Function0<InstalledAppsRawData>() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider.rawData.2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InstalledAppsRawData m178invoke() {
                return new InstalledAppsRawData(packageManagerDataSource.getApplicationsList(), packageManagerDataSource.getSystemApplicationsList());
            }
        });
    }

    private final InstalledAppsRawData getRawData() {
        return (InstalledAppsRawData) this.rawData$delegate.getValue();
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider
    public String fingerprint(StabilityLevel stabilityLevel) {
        String strCombineSignals;
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Hasher hasher = this.hasher;
        int version = getVersion();
        if (version == 1) {
            strCombineSignals = combineSignals(v1(), StabilityLevel.UNIQUE);
        } else if (version == 2) {
            strCombineSignals = combineSignals(v2(), stabilityLevel);
        } else {
            strCombineSignals = combineSignals(v2(), stabilityLevel);
        }
        return hasher.hash(strCombineSignals);
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider
    public InstalledAppsRawData rawData() {
        return getRawData();
    }

    private final List<IdentificationSignal<List<PackageInfo>>> v1() {
        return CollectionsKt.listOf(getRawData().applicationsList());
    }

    private final List<IdentificationSignal<List<PackageInfo>>> v2() {
        return CollectionsKt.listOf(new IdentificationSignal[]{getRawData().applicationsList(), getRawData().systemApplicationsList()});
    }
}
