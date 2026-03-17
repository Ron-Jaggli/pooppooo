package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.info_providers.PackageInfo;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: FingerprintingSignals.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "value", "(Ljava/util/List;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Ljava/util/List;", "getHashableString", "", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SystemApplicationsListSignal extends FingerprintingSignal<List<? extends PackageInfo>> {
    public static final Companion Companion = new Companion(null);
    private static final FingerprintingSignal.Info info = new FingerprintingSignal.Info(Fingerprinter.Version.V_2, null, StabilityLevel.OPTIMAL);
    private final List<PackageInfo> value;

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public List<? extends PackageInfo> getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemApplicationsListSignal(List<PackageInfo> list) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "value");
        this.value = list;
    }

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public FingerprintingSignal.Info getInfo() {
        return info;
    }

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public String getHashableString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = CollectionsKt.sortedWith(getValue(), new Comparator() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.SystemApplicationsListSignal$getHashableString$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((PackageInfo) t).getPackageName(), ((PackageInfo) t2).getPackageName());
            }
        }).iterator();
        while (it.hasNext()) {
            sb.append(((PackageInfo) it.next()).getPackageName());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
     */
    /* JADX INFO: compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal$Companion;", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FingerprintingSignal.Info getInfo() {
            return SystemApplicationsListSignal.info;
        }
    }
}
