package com.fingerprintjs.android.fingerprint.signal_providers.os_build;

import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.MediaCodecInfo;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: OsBuildSignalGroupProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\u0018H\u0002J\u0016\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00190\u0018H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildRawData;", "osBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "codecInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;", "deviceSecurityInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildRawData;", "rawData$delegate", "Lkotlin/Lazy;", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "v2", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OsBuildSignalGroupProvider extends SignalGroupProvider<OsBuildRawData> {
    private final Hasher hasher;
    private final Lazy rawData$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OsBuildSignalGroupProvider(final OsBuildInfoProvider osBuildInfoProvider, final CodecInfoProvider codecInfoProvider, final DeviceSecurityInfoProvider deviceSecurityInfoProvider, Hasher hasher, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(osBuildInfoProvider, "osBuildInfoProvider");
        Intrinsics.checkNotNullParameter(deviceSecurityInfoProvider, "deviceSecurityInfoProvider");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy(new Function0<OsBuildRawData>() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider.rawData.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final OsBuildRawData m179invoke() {
                List<MediaCodecInfo> listEmptyList;
                String strFingerprint = osBuildInfoProvider.fingerprint();
                String strAndroidVersion = osBuildInfoProvider.androidVersion();
                String strSdkVersion = osBuildInfoProvider.sdkVersion();
                String strKernelVersion = osBuildInfoProvider.kernelVersion();
                CodecInfoProvider codecInfoProvider2 = codecInfoProvider;
                if (codecInfoProvider2 == null || (listEmptyList = codecInfoProvider2.codecsList()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                return new OsBuildRawData(strFingerprint, strAndroidVersion, strSdkVersion, strKernelVersion, listEmptyList, deviceSecurityInfoProvider.encryptionStatus(), deviceSecurityInfoProvider.securityProvidersData());
            }
        });
    }

    private final OsBuildRawData getRawData() {
        return (OsBuildRawData) this.rawData$delegate.getValue();
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider
    public String fingerprint(StabilityLevel stabilityLevel) {
        List<? extends IdentificationSignal<?>> listV1;
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Hasher hasher = this.hasher;
        int version = getVersion();
        if (version == 1) {
            listV1 = v1();
        } else if (version == 2) {
            listV1 = v2();
        } else {
            listV1 = v2();
        }
        return hasher.hash(combineSignals(listV1, stabilityLevel));
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider
    public OsBuildRawData rawData() {
        return getRawData();
    }

    private final List<IdentificationSignal<String>> v1() {
        return CollectionsKt.listOf(getRawData().fingerprint());
    }

    private final List<IdentificationSignal<? extends Object>> v2() {
        return CollectionsKt.listOf(new IdentificationSignal[]{getRawData().androidVersion(), getRawData().sdkVersion(), getRawData().kernelVersion(), getRawData().encryptionStatus(), getRawData().securityProviders(), getRawData().codecList()});
    }
}
