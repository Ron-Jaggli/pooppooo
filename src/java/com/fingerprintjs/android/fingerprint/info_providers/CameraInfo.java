package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CameraInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfo;", "", "cameraName", "", "cameraType", "cameraOrientation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraName", "()Ljava/lang/String;", "getCameraOrientation", "getCameraType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraInfo {
    private final String cameraName;
    private final String cameraOrientation;
    private final String cameraType;

    public static /* synthetic */ CameraInfo copy$default(CameraInfo cameraInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraInfo.cameraName;
        }
        if ((i & 2) != 0) {
            str2 = cameraInfo.cameraType;
        }
        if ((i & 4) != 0) {
            str3 = cameraInfo.cameraOrientation;
        }
        return cameraInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.cameraName;
    }

    public final String component2() {
        return this.cameraType;
    }

    public final String component3() {
        return this.cameraOrientation;
    }

    public final CameraInfo copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "cameraName");
        Intrinsics.checkNotNullParameter(str2, "cameraType");
        Intrinsics.checkNotNullParameter(str3, "cameraOrientation");
        return new CameraInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraInfo)) {
            return false;
        }
        CameraInfo cameraInfo = (CameraInfo) obj;
        return Intrinsics.areEqual(this.cameraName, cameraInfo.cameraName) && Intrinsics.areEqual(this.cameraType, cameraInfo.cameraType) && Intrinsics.areEqual(this.cameraOrientation, cameraInfo.cameraOrientation);
    }

    public int hashCode() {
        return (((this.cameraName.hashCode() * 31) + this.cameraType.hashCode()) * 31) + this.cameraOrientation.hashCode();
    }

    public String toString() {
        return "CameraInfo(cameraName=" + this.cameraName + ", cameraType=" + this.cameraType + ", cameraOrientation=" + this.cameraOrientation + ')';
    }

    public CameraInfo(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "cameraName");
        Intrinsics.checkNotNullParameter(str2, "cameraType");
        Intrinsics.checkNotNullParameter(str3, "cameraOrientation");
        this.cameraName = str;
        this.cameraType = str2;
        this.cameraOrientation = str3;
    }

    public final String getCameraName() {
        return this.cameraName;
    }

    public final String getCameraType() {
        return this.cameraType;
    }

    public final String getCameraOrientation() {
        return this.cameraOrientation;
    }
}
