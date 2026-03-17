package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: compiled from: Fingerprinter.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "", "deviceId", "", DeviceIdConstantsKt.GSF_ID_NAME, DeviceIdConstantsKt.ANDROID_ID_NAME, "mediaDrmId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidId", "()Ljava/lang/String;", "getDeviceId", "getGsfId", "getMediaDrmId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceIdResult {
    private final String androidId;
    private final String deviceId;
    private final String gsfId;
    private final String mediaDrmId;

    public static /* synthetic */ DeviceIdResult copy$default(DeviceIdResult deviceIdResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceIdResult.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = deviceIdResult.gsfId;
        }
        if ((i & 4) != 0) {
            str3 = deviceIdResult.androidId;
        }
        if ((i & 8) != 0) {
            str4 = deviceIdResult.mediaDrmId;
        }
        return deviceIdResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.gsfId;
    }

    public final String component3() {
        return this.androidId;
    }

    public final String component4() {
        return this.mediaDrmId;
    }

    public final DeviceIdResult copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, DeviceIdConstantsKt.GSF_ID_NAME);
        Intrinsics.checkNotNullParameter(str3, DeviceIdConstantsKt.ANDROID_ID_NAME);
        Intrinsics.checkNotNullParameter(str4, "mediaDrmId");
        return new DeviceIdResult(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceIdResult)) {
            return false;
        }
        DeviceIdResult deviceIdResult = (DeviceIdResult) obj;
        return Intrinsics.areEqual(this.deviceId, deviceIdResult.deviceId) && Intrinsics.areEqual(this.gsfId, deviceIdResult.gsfId) && Intrinsics.areEqual(this.androidId, deviceIdResult.androidId) && Intrinsics.areEqual(this.mediaDrmId, deviceIdResult.mediaDrmId);
    }

    public int hashCode() {
        return (((((this.deviceId.hashCode() * 31) + this.gsfId.hashCode()) * 31) + this.androidId.hashCode()) * 31) + this.mediaDrmId.hashCode();
    }

    public String toString() {
        return "DeviceIdResult(deviceId=" + this.deviceId + ", gsfId=" + this.gsfId + ", androidId=" + this.androidId + ", mediaDrmId=" + this.mediaDrmId + ')';
    }

    public DeviceIdResult(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, DeviceIdConstantsKt.GSF_ID_NAME);
        Intrinsics.checkNotNullParameter(str3, DeviceIdConstantsKt.ANDROID_ID_NAME);
        Intrinsics.checkNotNullParameter(str4, "mediaDrmId");
        this.deviceId = str;
        this.gsfId = str2;
        this.androidId = str3;
        this.mediaDrmId = str4;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getGsfId() {
        return this.gsfId;
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getMediaDrmId() {
        return this.mediaDrmId;
    }
}
