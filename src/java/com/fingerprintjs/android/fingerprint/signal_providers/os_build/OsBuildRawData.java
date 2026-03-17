package com.fingerprintjs.android.fingerprint.signal_providers.os_build;

import com.fingerprintjs.android.fingerprint.info_providers.MediaCodecInfo;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: OsBuildRawData.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\b¢\u0006\u0002\u0010\rJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\bHÆ\u0003Jg\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\bHÆ\u0001J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\t\u0010$\u001a\u00020%HÖ\u0001J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u001e\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\b0\u0017J\u0016\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0\u00170\bH\u0016J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006)"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, "", OsBuildSignalsConstantsKt.ANDROID_VERSION_KEY, OsBuildSignalsConstantsKt.SDK_VERSION_KEY, OsBuildSignalsConstantsKt.KERNEL_VERSION_KEY, "codecList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/MediaCodecInfo;", OsBuildSignalsConstantsKt.ENCRYPTION_STATUS_KEY, "securityProvidersData", "Lkotlin/Pair;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getAndroidVersion", "()Ljava/lang/String;", "getCodecList", "()Ljava/util/List;", "getEncryptionStatus", "getFingerprint", "getKernelVersion", "getSdkVersion", "getSecurityProvidersData", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", OsBuildSignalsConstantsKt.SECURITY_PROVIDERS_DATA_KEY, "signals", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OsBuildRawData extends RawData {
    private final String androidVersion;
    private final List<MediaCodecInfo> codecList;
    private final String encryptionStatus;
    private final String fingerprint;
    private final String kernelVersion;
    private final String sdkVersion;
    private final List<Pair<String, String>> securityProvidersData;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OsBuildRawData copy$default(OsBuildRawData osBuildRawData, String str, String str2, String str3, String str4, List list, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = osBuildRawData.fingerprint;
        }
        if ((i & 2) != 0) {
            str2 = osBuildRawData.androidVersion;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = osBuildRawData.sdkVersion;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = osBuildRawData.kernelVersion;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = osBuildRawData.codecList;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            str5 = osBuildRawData.encryptionStatus;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            list2 = osBuildRawData.securityProvidersData;
        }
        return osBuildRawData.copy(str, str6, str7, str8, list3, str9, list2);
    }

    public final String component1() {
        return this.fingerprint;
    }

    public final String component2() {
        return this.androidVersion;
    }

    public final String component3() {
        return this.sdkVersion;
    }

    public final String component4() {
        return this.kernelVersion;
    }

    public final List<MediaCodecInfo> component5() {
        return this.codecList;
    }

    public final String component6() {
        return this.encryptionStatus;
    }

    public final List<Pair<String, String>> component7() {
        return this.securityProvidersData;
    }

    public final OsBuildRawData copy(String str, String str2, String str3, String str4, List<MediaCodecInfo> list, String str5, List<Pair<String, String>> list2) {
        Intrinsics.checkNotNullParameter(str, OsBuildSignalsConstantsKt.FINGERPRINT_KEY);
        Intrinsics.checkNotNullParameter(str2, OsBuildSignalsConstantsKt.ANDROID_VERSION_KEY);
        Intrinsics.checkNotNullParameter(str3, OsBuildSignalsConstantsKt.SDK_VERSION_KEY);
        Intrinsics.checkNotNullParameter(str4, OsBuildSignalsConstantsKt.KERNEL_VERSION_KEY);
        Intrinsics.checkNotNullParameter(list, "codecList");
        Intrinsics.checkNotNullParameter(str5, OsBuildSignalsConstantsKt.ENCRYPTION_STATUS_KEY);
        Intrinsics.checkNotNullParameter(list2, "securityProvidersData");
        return new OsBuildRawData(str, str2, str3, str4, list, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OsBuildRawData)) {
            return false;
        }
        OsBuildRawData osBuildRawData = (OsBuildRawData) obj;
        return Intrinsics.areEqual(this.fingerprint, osBuildRawData.fingerprint) && Intrinsics.areEqual(this.androidVersion, osBuildRawData.androidVersion) && Intrinsics.areEqual(this.sdkVersion, osBuildRawData.sdkVersion) && Intrinsics.areEqual(this.kernelVersion, osBuildRawData.kernelVersion) && Intrinsics.areEqual(this.codecList, osBuildRawData.codecList) && Intrinsics.areEqual(this.encryptionStatus, osBuildRawData.encryptionStatus) && Intrinsics.areEqual(this.securityProvidersData, osBuildRawData.securityProvidersData);
    }

    public int hashCode() {
        return (((((((((((this.fingerprint.hashCode() * 31) + this.androidVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.kernelVersion.hashCode()) * 31) + this.codecList.hashCode()) * 31) + this.encryptionStatus.hashCode()) * 31) + this.securityProvidersData.hashCode();
    }

    public String toString() {
        return "OsBuildRawData(fingerprint=" + this.fingerprint + ", androidVersion=" + this.androidVersion + ", sdkVersion=" + this.sdkVersion + ", kernelVersion=" + this.kernelVersion + ", codecList=" + this.codecList + ", encryptionStatus=" + this.encryptionStatus + ", securityProvidersData=" + this.securityProvidersData + ')';
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getKernelVersion() {
        return this.kernelVersion;
    }

    public final List<MediaCodecInfo> getCodecList() {
        return this.codecList;
    }

    public final String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    public final List<Pair<String, String>> getSecurityProvidersData() {
        return this.securityProvidersData;
    }

    public OsBuildRawData(String str, String str2, String str3, String str4, List<MediaCodecInfo> list, String str5, List<Pair<String, String>> list2) {
        Intrinsics.checkNotNullParameter(str, OsBuildSignalsConstantsKt.FINGERPRINT_KEY);
        Intrinsics.checkNotNullParameter(str2, OsBuildSignalsConstantsKt.ANDROID_VERSION_KEY);
        Intrinsics.checkNotNullParameter(str3, OsBuildSignalsConstantsKt.SDK_VERSION_KEY);
        Intrinsics.checkNotNullParameter(str4, OsBuildSignalsConstantsKt.KERNEL_VERSION_KEY);
        Intrinsics.checkNotNullParameter(list, "codecList");
        Intrinsics.checkNotNullParameter(str5, OsBuildSignalsConstantsKt.ENCRYPTION_STATUS_KEY);
        Intrinsics.checkNotNullParameter(list2, "securityProvidersData");
        this.fingerprint = str;
        this.androidVersion = str2;
        this.sdkVersion = str3;
        this.kernelVersion = str4;
        this.codecList = list;
        this.encryptionStatus = str5;
        this.securityProvidersData = list2;
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.RawData
    public List<IdentificationSignal<? extends Object>> signals() {
        return CollectionsKt.listOf(new IdentificationSignal[]{fingerprint(), androidVersion(), sdkVersion(), kernelVersion(), codecList(), encryptionStatus(), securityProviders()});
    }

    public final IdentificationSignal<String> fingerprint() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.fingerprint) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.fingerprint.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return OsBuildRawData.this.getFingerprint();
            }
        };
    }

    public final IdentificationSignal<String> androidVersion() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.androidVersion) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.androidVersion.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return OsBuildRawData.this.getAndroidVersion();
            }
        };
    }

    public final IdentificationSignal<String> sdkVersion() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.sdkVersion) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.sdkVersion.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return OsBuildRawData.this.getSdkVersion();
            }
        };
    }

    public final IdentificationSignal<String> kernelVersion() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.kernelVersion) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.kernelVersion.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return OsBuildRawData.this.getKernelVersion();
            }
        };
    }

    public final IdentificationSignal<String> encryptionStatus() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.encryptionStatus) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.encryptionStatus.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return OsBuildRawData.this.getEncryptionStatus();
            }
        };
    }

    public final IdentificationSignal<List<MediaCodecInfo>> codecList() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends MediaCodecInfo>>(StabilityLevel.OPTIMAL, this.codecList) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.codecList.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (MediaCodecInfo mediaCodecInfo : OsBuildRawData.this.getCodecList()) {
                    sb.append(mediaCodecInfo.getName());
                    Iterator<T> it = mediaCodecInfo.getCapabilities().iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<List<Pair<String, String>>> securityProviders() {
        return new IdentificationSignal<List<? extends Pair<? extends String, ? extends String>>>(StabilityLevel.OPTIMAL, this.securityProvidersData) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildRawData.securityProviders.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = OsBuildRawData.this.getSecurityProvidersData().iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    sb.append((String) pair.getFirst()).append((String) pair.getSecond());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }
}
