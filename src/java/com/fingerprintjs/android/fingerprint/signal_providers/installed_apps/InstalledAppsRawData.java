package com.fingerprintjs.android.fingerprint.signal_providers.installed_apps;

import com.fingerprintjs.android.fingerprint.info_providers.PackageInfo;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: InstalledAppsRawData.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b0\u0003H\u0016J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bJ\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "applicationsNamesList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "systemApplicationsList", "(Ljava/util/List;Ljava/util/List;)V", "getApplicationsNamesList", "()Ljava/util/List;", "getSystemApplicationsList", "applicationsList", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "signals", "toString", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstalledAppsRawData extends RawData {
    private final List<PackageInfo> applicationsNamesList;
    private final List<PackageInfo> systemApplicationsList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstalledAppsRawData copy$default(InstalledAppsRawData installedAppsRawData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = installedAppsRawData.applicationsNamesList;
        }
        if ((i & 2) != 0) {
            list2 = installedAppsRawData.systemApplicationsList;
        }
        return installedAppsRawData.copy(list, list2);
    }

    public final List<PackageInfo> component1() {
        return this.applicationsNamesList;
    }

    public final List<PackageInfo> component2() {
        return this.systemApplicationsList;
    }

    public final InstalledAppsRawData copy(List<PackageInfo> list, List<PackageInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "applicationsNamesList");
        Intrinsics.checkNotNullParameter(list2, "systemApplicationsList");
        return new InstalledAppsRawData(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledAppsRawData)) {
            return false;
        }
        InstalledAppsRawData installedAppsRawData = (InstalledAppsRawData) obj;
        return Intrinsics.areEqual(this.applicationsNamesList, installedAppsRawData.applicationsNamesList) && Intrinsics.areEqual(this.systemApplicationsList, installedAppsRawData.systemApplicationsList);
    }

    public int hashCode() {
        return (this.applicationsNamesList.hashCode() * 31) + this.systemApplicationsList.hashCode();
    }

    public String toString() {
        return "InstalledAppsRawData(applicationsNamesList=" + this.applicationsNamesList + ", systemApplicationsList=" + this.systemApplicationsList + ')';
    }

    public final List<PackageInfo> getApplicationsNamesList() {
        return this.applicationsNamesList;
    }

    public final List<PackageInfo> getSystemApplicationsList() {
        return this.systemApplicationsList;
    }

    public InstalledAppsRawData(List<PackageInfo> list, List<PackageInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "applicationsNamesList");
        Intrinsics.checkNotNullParameter(list2, "systemApplicationsList");
        this.applicationsNamesList = list;
        this.systemApplicationsList = list2;
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.RawData
    public List<IdentificationSignal<List<PackageInfo>>> signals() {
        return CollectionsKt.listOf(new IdentificationSignal[]{applicationsList(), systemApplicationsList()});
    }

    public final IdentificationSignal<List<PackageInfo>> applicationsList() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends PackageInfo>>(StabilityLevel.UNIQUE, this.applicationsNamesList) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsRawData.applicationsList.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                Iterator it = CollectionsKt.sortedWith(InstalledAppsRawData.this.getApplicationsNamesList(), new Comparator() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsRawData$applicationsList$1$toString$$inlined$sortedBy$1
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
        };
    }

    public final IdentificationSignal<List<PackageInfo>> systemApplicationsList() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends PackageInfo>>(StabilityLevel.OPTIMAL, this.systemApplicationsList) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsRawData.systemApplicationsList.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                Iterator it = CollectionsKt.sortedWith(InstalledAppsRawData.this.getSystemApplicationsList(), new Comparator() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsRawData$systemApplicationsList$1$toString$$inlined$sortedBy$1
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
        };
    }
}
