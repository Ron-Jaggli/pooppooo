package com.fingerprintjs.android.fingerprint.tools;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: IdentificationVersionExtensions.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¨\u0006\u0005"}, d2 = {"inRange", "", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "added", "removed", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IdentificationVersionExtensionsKt {
    public static final boolean inRange(Fingerprinter.Version version, Fingerprinter.Version version2, Fingerprinter.Version version3) {
        Intrinsics.checkNotNullParameter(version, "<this>");
        Intrinsics.checkNotNullParameter(version2, "added");
        return version.getIntValue$fingerprint_release() >= version2.getIntValue$fingerprint_release() && (version3 == null || version.getIntValue$fingerprint_release() < version3.getIntValue$fingerprint_release());
    }
}
