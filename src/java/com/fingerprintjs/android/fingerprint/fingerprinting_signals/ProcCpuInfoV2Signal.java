package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: FingerprintingSignals.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "value", "(Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getHashableString", "", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProcCpuInfoV2Signal extends FingerprintingSignal<CpuInfo> {
    private final CpuInfo value;
    public static final Companion Companion = new Companion(null);
    private static final FingerprintingSignal.Info info = new FingerprintingSignal.Info(Fingerprinter.Version.V_4, null, StabilityLevel.STABLE);
    private static final Set<String> CPUINFO_IGNORED_COMMON_PROPS = SetsKt.setOf("processor");
    private static final Set<String> CPUINFO_IGNORED_PER_PROC_PROPS = SetsKt.setOf(new String[]{"bogomips", "cpu mhz"});

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcCpuInfoV2Signal(CpuInfo cpuInfo) {
        super(null);
        Intrinsics.checkNotNullParameter(cpuInfo, "value");
        List<Pair<String, String>> commonInfo = cpuInfo.getCommonInfo();
        ArrayList arrayList = new ArrayList();
        for (Object obj : commonInfo) {
            Set<String> set = CPUINFO_IGNORED_COMMON_PROPS;
            String lowerCase = ((String) ((Pair) obj).getFirst()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!set.contains(lowerCase)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        List<List<Pair<String, String>>> perProcessorInfo = cpuInfo.getPerProcessorInfo();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(perProcessorInfo, 10));
        Iterator<T> it = perProcessorInfo.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                Set<String> set2 = CPUINFO_IGNORED_PER_PROC_PROPS;
                String lowerCase2 = ((String) ((Pair) obj2).getFirst()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!set2.contains(lowerCase2)) {
                    arrayList4.add(obj2);
                }
            }
            arrayList3.add(arrayList4);
        }
        this.value = cpuInfo.copy(arrayList2, arrayList3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public CpuInfo getValue() {
        return this.value;
    }

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public FingerprintingSignal.Info getInfo() {
        return info;
    }

    @Override // com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal
    public String getHashableString() {
        return new StringBuilder().append(getValue().getCommonInfo()).append(getValue().getPerProcessorInfo()).toString();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
     */
    /* JADX INFO: compiled from: FingerprintingSignals.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal$Companion;", "", "()V", "CPUINFO_IGNORED_COMMON_PROPS", "", "", "CPUINFO_IGNORED_PER_PROC_PROPS", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FingerprintingSignal.Info getInfo() {
            return ProcCpuInfoV2Signal.info;
        }
    }
}
