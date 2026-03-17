package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: FingerprintingSignals.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "", "value", "(Ljava/lang/String;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Ljava/lang/String;", "getHashableString", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RttCallingModeSignal extends FingerprintingSignal<String> {
    public static final Companion Companion = new Companion(null);
    private static final FingerprintingSignal.Info info = new FingerprintingSignal.Info(Fingerprinter.Version.V_1, Fingerprinter.Version.V_2, StabilityLevel.OPTIMAL);
    private final String value;

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public String getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RttCallingModeSignal(String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "value");
        this.value = str;
    }

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public FingerprintingSignal.Info getInfo() {
        return info;
    }

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public String getHashableString() {
        return getValue();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
     */
    /* JADX INFO: compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal$Companion;", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FingerprintingSignal.Info getInfo() {
            return RttCallingModeSignal.info;
        }
    }
}
