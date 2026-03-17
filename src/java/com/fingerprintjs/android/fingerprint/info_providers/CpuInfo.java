package com.fingerprintjs.android.fingerprint.info_providers;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CpuInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B?\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J!\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003HÆ\u0003JG\u0010\r\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "", "commonInfo", "", "Lkotlin/Pair;", "", "perProcessorInfo", "(Ljava/util/List;Ljava/util/List;)V", "getCommonInfo", "()Ljava/util/List;", "getPerProcessorInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CpuInfo {
    public static final Companion Companion = new Companion(null);
    private static final CpuInfo EMPTY = new CpuInfo(CollectionsKt.emptyList(), CollectionsKt.emptyList());
    private final List<Pair<String, String>> commonInfo;
    private final List<List<Pair<String, String>>> perProcessorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CpuInfo copy$default(CpuInfo cpuInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cpuInfo.commonInfo;
        }
        if ((i & 2) != 0) {
            list2 = cpuInfo.perProcessorInfo;
        }
        return cpuInfo.copy(list, list2);
    }

    public final List<Pair<String, String>> component1() {
        return this.commonInfo;
    }

    public final List<List<Pair<String, String>>> component2() {
        return this.perProcessorInfo;
    }

    public final CpuInfo copy(List<Pair<String, String>> list, List<? extends List<Pair<String, String>>> list2) {
        Intrinsics.checkNotNullParameter(list, "commonInfo");
        Intrinsics.checkNotNullParameter(list2, "perProcessorInfo");
        return new CpuInfo(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpuInfo)) {
            return false;
        }
        CpuInfo cpuInfo = (CpuInfo) obj;
        return Intrinsics.areEqual(this.commonInfo, cpuInfo.commonInfo) && Intrinsics.areEqual(this.perProcessorInfo, cpuInfo.perProcessorInfo);
    }

    public int hashCode() {
        return (this.commonInfo.hashCode() * 31) + this.perProcessorInfo.hashCode();
    }

    public String toString() {
        return "CpuInfo(commonInfo=" + this.commonInfo + ", perProcessorInfo=" + this.perProcessorInfo + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CpuInfo(List<Pair<String, String>> list, List<? extends List<Pair<String, String>>> list2) {
        Intrinsics.checkNotNullParameter(list, "commonInfo");
        Intrinsics.checkNotNullParameter(list2, "perProcessorInfo");
        this.commonInfo = list;
        this.perProcessorInfo = list2;
    }

    public final List<Pair<String, String>> getCommonInfo() {
        return this.commonInfo;
    }

    public final List<List<Pair<String, String>>> getPerProcessorInfo() {
        return this.perProcessorInfo;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
     */
    /* JADX INFO: compiled from: CpuInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo$Companion;", "", "()V", "EMPTY", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getEMPTY", "()Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CpuInfo getEMPTY() {
            return CpuInfo.EMPTY;
        }
    }
}
