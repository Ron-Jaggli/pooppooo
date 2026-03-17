package com.fingerprintjs.android.fingerprint.signal_providers.device_state;

import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource;
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
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: DeviceStateSignalGroupProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b0\u001aH\u0002J\u0016\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b0\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateRawData;", "settingsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "devicePersonalizationInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "deviceSecurityInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "fingerprintSensorInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateRawData;", "rawData$delegate", "Lkotlin/Lazy;", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "", "v2", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceStateSignalGroupProvider extends SignalGroupProvider<DeviceStateRawData> {
    private final Hasher hasher;
    private final Lazy rawData$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceStateSignalGroupProvider(final SettingsDataSource settingsDataSource, final DevicePersonalizationInfoProvider devicePersonalizationInfoProvider, final DeviceSecurityInfoProvider deviceSecurityInfoProvider, final FingerprintSensorInfoProvider fingerprintSensorInfoProvider, Hasher hasher, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(settingsDataSource, "settingsDataSource");
        Intrinsics.checkNotNullParameter(devicePersonalizationInfoProvider, "devicePersonalizationInfoProvider");
        Intrinsics.checkNotNullParameter(deviceSecurityInfoProvider, "deviceSecurityInfoProvider");
        Intrinsics.checkNotNullParameter(fingerprintSensorInfoProvider, "fingerprintSensorInfoProvider");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy(new Function0<DeviceStateRawData>() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider.rawData.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DeviceStateRawData m176invoke() {
                return new DeviceStateRawData(settingsDataSource.adbEnabled(), settingsDataSource.developmentSettingsEnabled(), settingsDataSource.httpProxy(), settingsDataSource.transitionAnimationScale(), settingsDataSource.windowAnimationScale(), settingsDataSource.dataRoamingEnabled(), settingsDataSource.accessibilityEnabled(), settingsDataSource.defaultInputMethod(), settingsDataSource.rttCallingMode(), settingsDataSource.touchExplorationEnabled(), settingsDataSource.alarmAlertPath(), settingsDataSource.dateFormat(), settingsDataSource.endButtonBehaviour(), settingsDataSource.fontScale(), settingsDataSource.screenOffTimeout(), settingsDataSource.textAutoReplaceEnable(), settingsDataSource.textAutoPunctuate(), settingsDataSource.time12Or24(), deviceSecurityInfoProvider.isPinSecurityEnabled(), fingerprintSensorInfoProvider.getStatus().getStringDescription(), devicePersonalizationInfoProvider.ringtoneSource(), ArraysKt.toList(devicePersonalizationInfoProvider.availableLocales()), devicePersonalizationInfoProvider.regionCountry(), devicePersonalizationInfoProvider.defaultLanguage(), devicePersonalizationInfoProvider.timezone());
            }
        });
    }

    private final DeviceStateRawData getRawData() {
        return (DeviceStateRawData) this.rawData$delegate.getValue();
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
    public DeviceStateRawData rawData() {
        return getRawData();
    }

    private final List<IdentificationSignal<? extends Object>> v1() {
        return CollectionsKt.listOf(new IdentificationSignal[]{getRawData().adbEnabled(), getRawData().developmentSettingsEnabled(), getRawData().httpProxy(), getRawData().transitionAnimationScale(), getRawData().windowAnimationScale(), getRawData().dataRoamingEnabled(), getRawData().accessibilityEnabled(), getRawData().defaultInputMethod(), getRawData().rttCallingMode(), getRawData().touchExplorationEnabled(), getRawData().alarmAlertPath(), getRawData().dateFormat(), getRawData().endButtonBehaviour(), getRawData().fontScale(), getRawData().screenOffTimeout(), getRawData().textAutoReplaceEnable(), getRawData().textAutoPunctuate(), getRawData().time12Or24(), getRawData().isPinSecurityEnabled(), getRawData().fingerprintSensorStatus(), getRawData().ringtoneSource(), getRawData().availableLocales()});
    }

    private final List<IdentificationSignal<? extends Object>> v2() {
        return CollectionsKt.listOf(new IdentificationSignal[]{getRawData().adbEnabled(), getRawData().developmentSettingsEnabled(), getRawData().httpProxy(), getRawData().transitionAnimationScale(), getRawData().windowAnimationScale(), getRawData().dataRoamingEnabled(), getRawData().accessibilityEnabled(), getRawData().defaultInputMethod(), getRawData().touchExplorationEnabled(), getRawData().alarmAlertPath(), getRawData().dateFormat(), getRawData().endButtonBehaviour(), getRawData().fontScale(), getRawData().screenOffTimeout(), getRawData().time12Or24(), getRawData().isPinSecurityEnabled(), getRawData().fingerprintSensorStatus(), getRawData().ringtoneSource(), getRawData().availableLocales(), getRawData().regionCountry(), getRawData().timezone(), getRawData().defaultLanguage()});
    }
}
