package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Metadata;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: DeviceSecurityInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"ACTIVATING", "", "ACTIVE", "ACTIVE_PER_USER", "INACTIVE", "UNSUPPORTED", "stringDescriptionForEncryptionStatus", "status", "", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DeviceSecurityInfoProviderKt {
    private static final String ACTIVATING = "activating";
    private static final String ACTIVE = "active";
    private static final String ACTIVE_PER_USER = "active_per_user";
    private static final String INACTIVE = "inactive";
    private static final String UNSUPPORTED = "unsupported";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String stringDescriptionForEncryptionStatus(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i == 1) {
            return INACTIVE;
        }
        if (i == 2) {
            return ACTIVATING;
        }
        if (i == 3) {
            return ACTIVE;
        }
        if (i == 5) {
            return ACTIVE_PER_USER;
        }
        return "";
    }
}
