package com.fingerprintjs.android.fingerprint.tools;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: SignalsUtils.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\f\b\u0000\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/SignalsUtils;", "", "()V", "createSignalIfNeeded", "T", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "requiredVersion", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "requiredStabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "signalFingerprintingInfo", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "signalFactory", "Lkotlin/Function0;", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;Lkotlin/jvm/functions/Function0;)Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SignalsUtils {
    public static final SignalsUtils INSTANCE = new SignalsUtils();

    private SignalsUtils() {
    }

    public final <T extends FingerprintingSignal<?>> T createSignalIfNeeded(Fingerprinter.Version version, StabilityLevel stabilityLevel, FingerprintingSignal.Info info, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(version, "requiredVersion");
        Intrinsics.checkNotNullParameter(stabilityLevel, "requiredStabilityLevel");
        Intrinsics.checkNotNullParameter(info, "signalFingerprintingInfo");
        Intrinsics.checkNotNullParameter(function0, "signalFactory");
        if (info.getStabilityLevel().atLeastAsStableAs$fingerprint_release(stabilityLevel) && IdentificationVersionExtensionsKt.inRange(version, info.getAddedInVersion(), info.getRemovedInVersion())) {
            return (T) function0.invoke();
        }
        return null;
    }
}
