package com.fingerprintjs.android.fingerprint.signal_providers.device_id;

import com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: DeviceIdProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdRawData;", "gsfIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "androidIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "mediaDrmIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdRawData;", "rawData$delegate", "Lkotlin/Lazy;", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "v3", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceIdProvider extends SignalGroupProvider<DeviceIdRawData> {
    private final Lazy rawData$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdProvider(final GsfIdProvider gsfIdProvider, final AndroidIdProvider androidIdProvider, final MediaDrmIdProvider mediaDrmIdProvider, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(gsfIdProvider, "gsfIdProvider");
        Intrinsics.checkNotNullParameter(androidIdProvider, "androidIdProvider");
        Intrinsics.checkNotNullParameter(mediaDrmIdProvider, "mediaDrmIdProvider");
        this.rawData$delegate = LazyKt.lazy(new Function0<DeviceIdRawData>() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider.rawData.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DeviceIdRawData m174invoke() {
                return new DeviceIdRawData(androidIdProvider.getAndroidId(), gsfIdProvider.getGsfAndroidId(), mediaDrmIdProvider.getMediaDrmId());
            }
        });
    }

    private final DeviceIdRawData getRawData() {
        return (DeviceIdRawData) this.rawData$delegate.getValue();
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider
    public DeviceIdRawData rawData() {
        return getRawData();
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider
    public String fingerprint(StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        int version = getVersion();
        if (version == 1) {
            return v1();
        }
        if (version == 2) {
            return v1();
        }
        if (version == 3) {
            return v3();
        }
        return v3();
    }

    private final String v1() {
        IdentificationSignal<String> identificationSignalGsfId;
        if (getRawData().gsfId().getValue().length() == 0) {
            identificationSignalGsfId = getRawData().androidId();
        } else {
            identificationSignalGsfId = getRawData().gsfId();
        }
        return identificationSignalGsfId.getValue();
    }

    private final String v3() {
        String value = getRawData().gsfId().getValue().length() == 0 ? null : getRawData().gsfId().getValue();
        String value2 = getRawData().mediaDrmId().getValue().length() != 0 ? getRawData().mediaDrmId().getValue() : null;
        return value == null ? value2 == null ? getRawData().androidId().getValue() : value2 : value;
    }
}
