package com.fingerprintjs.android.fingerprint.signal_providers;

import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: SignalGroupProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0012\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\r\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "T", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "", "version", "", "(I)V", "getVersion", "()I", "combineSignals", "", "signals", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", OsBuildSignalsConstantsKt.FINGERPRINT_KEY, "rawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SignalGroupProvider<T extends RawData> {
    private final int version;

    public abstract String fingerprint(StabilityLevel stabilityLevel);

    public abstract T rawData();

    public SignalGroupProvider(int i) {
        this.version = i;
    }

    public final int getVersion() {
        return this.version;
    }

    public static /* synthetic */ String fingerprint$default(SignalGroupProvider signalGroupProvider, StabilityLevel stabilityLevel, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fingerprint");
        }
        if ((i & 1) != 0) {
            stabilityLevel = StabilityLevel.OPTIMAL;
        }
        return signalGroupProvider.fingerprint(stabilityLevel);
    }

    protected final String combineSignals(List<? extends IdentificationSignal<?>> list, StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter(list, "signals");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = RawDataKt.filterByStabilityLevel(list, stabilityLevel).iterator();
        while (it.hasNext()) {
            sb.append(((IdentificationSignal) it.next()).toString());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
