package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
 */
/* JADX INFO: compiled from: FingerprinterImpl.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0005H\u0000¢\u0006\u0002\b%J\u001e\u0010&\u001a\u00020\u0016*\u00020\u001a2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/FingerprinterImpl;", "", "legacyArgs", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;", "fpSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "deviceIdSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;)V", "deviceIdResult", "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "fingerprintResult", "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "getDeviceId", "Lkotlin/Result;", "getDeviceId-d1pmJ48", "()Ljava/lang/Object;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getDeviceId-IoAF18A", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;)Ljava/lang/Object;", "getFingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "getFingerprint-0E7RQCE", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)Ljava/lang/Object;", "getFingerprint-IoAF18A", "(Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;)Ljava/lang/Object;", "fingerprintingSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "getFingerprint-gIAlu-s", "(Ljava/util/List;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)Ljava/lang/Object;", "getFingerprintingSignalsProvider", "getFingerprintingSignalsProvider$fingerprint_release", "hash", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FingerprinterImpl {
    private volatile DeviceIdResult deviceIdResult;
    private final DeviceIdSignalsProvider deviceIdSignalsProvider;
    private volatile FingerprintResult fingerprintResult;
    private final FingerprintingSignalsProvider fpSignalsProvider;
    private final Fingerprinter.LegacyArgs legacyArgs;

    public FingerprinterImpl(Fingerprinter.LegacyArgs legacyArgs, FingerprintingSignalsProvider fingerprintingSignalsProvider, DeviceIdSignalsProvider deviceIdSignalsProvider) {
        Intrinsics.checkNotNullParameter(fingerprintingSignalsProvider, "fpSignalsProvider");
        Intrinsics.checkNotNullParameter(deviceIdSignalsProvider, "deviceIdSignalsProvider");
        this.legacyArgs = legacyArgs;
        this.fpSignalsProvider = fingerprintingSignalsProvider;
        this.deviceIdSignalsProvider = deviceIdSignalsProvider;
    }

    @Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
    /* JADX INFO: renamed from: getDeviceId-d1pmJ48, reason: not valid java name */
    public final Object m30getDeviceIdd1pmJ48() {
        if (this.legacyArgs == null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        try {
            Result.Companion companion = Result.Companion;
            DeviceIdResult deviceIdResult = this.deviceIdResult;
            if (deviceIdResult == null) {
                deviceIdResult = new DeviceIdResult(SignalGroupProvider.fingerprint$default(this.legacyArgs.getDeviceIdProvider(), null, 1, null), this.legacyArgs.getDeviceIdProvider().rawData().gsfId().getValue(), this.legacyArgs.getDeviceIdProvider().rawData().androidId().getValue(), this.legacyArgs.getDeviceIdProvider().rawData().mediaDrmId().getValue());
                this.deviceIdResult = deviceIdResult;
            }
            return Result.constructor-impl(deviceIdResult);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
    /* JADX INFO: renamed from: getFingerprint-IoAF18A, reason: not valid java name */
    public final Object m32getFingerprintIoAF18A(StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        if (this.legacyArgs == null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        try {
            Result.Companion companion = Result.Companion;
            FingerprintResult fingerprintResult = this.fingerprintResult;
            if (fingerprintResult == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.legacyArgs.getHardwareSignalProvider().fingerprint(stabilityLevel));
                sb.append(this.legacyArgs.getOsBuildSignalProvider().fingerprint(stabilityLevel));
                sb.append(this.legacyArgs.getDeviceStateSignalProvider().fingerprint(stabilityLevel));
                sb.append(this.legacyArgs.getInstalledAppsSignalProvider().fingerprint(stabilityLevel));
                fingerprintResult = new FingerprintResult(sb) { // from class: com.fingerprintjs.android.fingerprint.FingerprinterImpl$getFingerprint$1$3
                    private final String fingerprint;

                    {
                        Hasher hasher = this.this$0.legacyArgs.getConfiguration().getHasher();
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        this.fingerprint = hasher.hash(string);
                    }

                    @Override // com.fingerprintjs.android.fingerprint.FingerprintResult
                    public String getFingerprint() {
                        return this.fingerprint;
                    }

                    @Override // com.fingerprintjs.android.fingerprint.FingerprintResult
                    public <T extends SignalGroupProvider<?>> T getSignalProvider(Class<T> cls) {
                        DeviceIdProvider osBuildSignalProvider;
                        Intrinsics.checkNotNullParameter(cls, "clazz");
                        if (Intrinsics.areEqual(cls, HardwareSignalGroupProvider.class)) {
                            osBuildSignalProvider = this.this$0.legacyArgs.getHardwareSignalProvider();
                        } else {
                            osBuildSignalProvider = Intrinsics.areEqual(cls, OsBuildSignalGroupProvider.class) ? this.this$0.legacyArgs.getOsBuildSignalProvider() : Intrinsics.areEqual(cls, DeviceStateSignalGroupProvider.class) ? this.this$0.legacyArgs.getDeviceStateSignalProvider() : Intrinsics.areEqual(cls, InstalledAppsSignalGroupProvider.class) ? this.this$0.legacyArgs.getInstalledAppsSignalProvider() : Intrinsics.areEqual(cls, DeviceIdProvider.class) ? this.this$0.legacyArgs.getDeviceIdProvider() : null;
                        }
                        if (osBuildSignalProvider instanceof SignalGroupProvider) {
                            return (T) osBuildSignalProvider;
                        }
                        return null;
                    }
                };
            }
            return Result.constructor-impl(fingerprintResult);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: renamed from: getFingerprint-0E7RQCE, reason: not valid java name */
    public final Object m31getFingerprint0E7RQCE(Fingerprinter.Version version, StabilityLevel stabilityLevel, Hasher hasher) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        if (version.compareTo(Fingerprinter.Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) >= 0) {
            return m33getFingerprintgIAlus(this.fpSignalsProvider.getSignalsMatching(version, stabilityLevel), hasher);
        }
        try {
            Result.Companion companion = Result.Companion;
            FingerprintingLegacySchemeSupportExtensions fingerprintingLegacySchemeSupportExtensions = FingerprintingLegacySchemeSupportExtensions.INSTANCE;
            return Result.constructor-impl(hasher.hash(CollectionsKt.joinToString$default(CollectionsKt.listOf(new String[]{hash(hasher, fingerprintingLegacySchemeSupportExtensions.getHardwareSignals(this.fpSignalsProvider, version, stabilityLevel)), hash(hasher, fingerprintingLegacySchemeSupportExtensions.getOsBuildSignals(this.fpSignalsProvider, version, stabilityLevel)), hash(hasher, fingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals(this.fpSignalsProvider, version, stabilityLevel)), hash(hasher, fingerprintingLegacySchemeSupportExtensions.getInstalledAppsSignals(this.fpSignalsProvider, version, stabilityLevel))}), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public final FingerprintingSignalsProvider getFingerprintingSignalsProvider$fingerprint_release() {
        return this.fpSignalsProvider;
    }

    private final String hash(Hasher hasher, List<? extends FingerprintingSignal<?>> list) {
        return hasher.hash(CollectionsKt.joinToString$default(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<FingerprintingSignal<?>, CharSequence>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterImpl$hash$joinedString$1
            public final CharSequence invoke(FingerprintingSignal<?> fingerprintingSignal) {
                Intrinsics.checkNotNullParameter(fingerprintingSignal, "it");
                return fingerprintingSignal.getHashableString();
            }
        }, 30, (Object) null));
    }

    /* JADX INFO: renamed from: getDeviceId-IoAF18A, reason: not valid java name */
    public final Object m29getDeviceIdIoAF18A(Fingerprinter.Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        try {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(new DeviceIdResult(this.deviceIdSignalsProvider.getSignalMatching(version).getIdString(), this.deviceIdSignalsProvider.getGsfIdSignal().getIdString(), this.deviceIdSignalsProvider.getAndroidIdSignal().getIdString(), this.deviceIdSignalsProvider.getMediaDrmIdSignal().getIdString()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: renamed from: getFingerprint-gIAlu-s, reason: not valid java name */
    public final Object m33getFingerprintgIAlus(List<? extends FingerprintingSignal<?>> list, Hasher hasher) {
        Intrinsics.checkNotNullParameter(list, "fingerprintingSignals");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        try {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(hash(hasher, list));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
