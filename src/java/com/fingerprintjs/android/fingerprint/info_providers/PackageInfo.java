package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: PackageManagerInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "", "packageName", "", "(Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PackageInfo {
    private final String packageName;

    public static /* synthetic */ PackageInfo copy$default(PackageInfo packageInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packageInfo.packageName;
        }
        return packageInfo.copy(str);
    }

    public final String component1() {
        return this.packageName;
    }

    public final PackageInfo copy(String str) {
        Intrinsics.checkNotNullParameter(str, "packageName");
        return new PackageInfo(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PackageInfo) && Intrinsics.areEqual(this.packageName, ((PackageInfo) obj).packageName);
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    public PackageInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "packageName");
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public String toString() {
        return this.packageName;
    }
}
