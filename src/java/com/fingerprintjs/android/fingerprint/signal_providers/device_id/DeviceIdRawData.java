package com.fingerprintjs.android.fingerprint.signal_providers.device_id;

import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: DeviceIdRawData.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", DeviceIdConstantsKt.ANDROID_ID_NAME, "", DeviceIdConstantsKt.GSF_ID_NAME, "mediaDrmId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "signals", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceIdRawData extends RawData {
    private final String androidId;
    private final String gsfId;
    private final String mediaDrmId;

    public DeviceIdRawData(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, DeviceIdConstantsKt.ANDROID_ID_NAME);
        this.androidId = str;
        this.gsfId = str2;
        this.mediaDrmId = str3;
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.RawData
    public List<IdentificationSignal<String>> signals() {
        return CollectionsKt.listOf(new IdentificationSignal[]{gsfId(), androidId(), mediaDrmId()});
    }

    public final IdentificationSignal<String> gsfId() {
        StabilityLevel stabilityLevel = StabilityLevel.STABLE;
        String str = this.gsfId;
        if (str == null) {
            str = "";
        }
        return new IdentificationSignal<String>(stabilityLevel, str) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdRawData.gsfId.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                String str2 = DeviceIdRawData.this.gsfId;
                return str2 == null ? "" : str2;
            }
        };
    }

    public final IdentificationSignal<String> androidId() {
        return new IdentificationSignal<String>(StabilityLevel.STABLE, this.androidId) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdRawData.androidId.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceIdRawData.this.androidId;
            }
        };
    }

    public final IdentificationSignal<String> mediaDrmId() {
        StabilityLevel stabilityLevel = StabilityLevel.STABLE;
        String str = this.mediaDrmId;
        if (str == null) {
            str = "";
        }
        return new IdentificationSignal<String>(stabilityLevel, str) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdRawData.mediaDrmId.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                String str2 = DeviceIdRawData.this.mediaDrmId;
                return str2 == null ? "" : str2;
            }
        };
    }
}
