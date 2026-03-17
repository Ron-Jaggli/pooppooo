package com.fingerprintjs.android.fingerprint.info_providers;

import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FingerprintSensorInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "", "stringDescription", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringDescription", "()Ljava/lang/String;", "NOT_SUPPORTED", "SUPPORTED", "ENABLED", "UNKNOWN", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FingerprintSensorStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FingerprintSensorStatus[] $VALUES;
    private final String stringDescription;
    public static final FingerprintSensorStatus NOT_SUPPORTED = new FingerprintSensorStatus("NOT_SUPPORTED", 0, "not_supported");
    public static final FingerprintSensorStatus SUPPORTED = new FingerprintSensorStatus("SUPPORTED", 1, "supported");
    public static final FingerprintSensorStatus ENABLED = new FingerprintSensorStatus("ENABLED", 2, "enabled");
    public static final FingerprintSensorStatus UNKNOWN = new FingerprintSensorStatus("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ FingerprintSensorStatus[] $values() {
        return new FingerprintSensorStatus[]{NOT_SUPPORTED, SUPPORTED, ENABLED, UNKNOWN};
    }

    public static EnumEntries<FingerprintSensorStatus> getEntries() {
        return $ENTRIES;
    }

    public static FingerprintSensorStatus valueOf(String str) {
        return (FingerprintSensorStatus) Enum.valueOf(FingerprintSensorStatus.class, str);
    }

    public static FingerprintSensorStatus[] values() {
        return (FingerprintSensorStatus[]) $VALUES.clone();
    }

    private FingerprintSensorStatus(String str, int i, String str2) {
        this.stringDescription = str2;
    }

    public final String getStringDescription() {
        return this.stringDescription;
    }

    static {
        FingerprintSensorStatus[] fingerprintSensorStatusArr$values = $values();
        $VALUES = fingerprintSensorStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fingerprintSensorStatusArr$values);
    }
}
