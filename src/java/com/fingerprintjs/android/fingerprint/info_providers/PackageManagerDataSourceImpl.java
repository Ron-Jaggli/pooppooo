package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.aheaditec.talsec.security.AbstractC0023h;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: PackageManagerInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;", "packageManager", "Landroid/content/pm/PackageManager;", "(Landroid/content/pm/PackageManager;)V", "getApplicationsList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "getSystemApplicationsList", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PackageManagerDataSourceImpl implements PackageManagerDataSource {
    private final PackageManager packageManager;

    public PackageManagerDataSourceImpl(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource
    public List<PackageInfo> getApplicationsList() {
        Object objSafeWithTimeout = SafeKt.safeWithTimeout(3000L, new Function0<List<? extends PackageInfo>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSourceImpl.getApplicationsList.1
            {
                super(0);
            }

            public final List<PackageInfo> invoke() {
                PackageManager packageManager = PackageManagerDataSourceImpl.this.packageManager;
                Intrinsics.checkNotNull(packageManager);
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(AbstractC0023h.n);
                Intrinsics.checkNotNullExpressionValue(installedApplications, "getInstalledApplications(...)");
                List<ApplicationInfo> list = installedApplications;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ApplicationInfo applicationInfo : list) {
                    Intrinsics.checkNotNull(applicationInfo);
                    String str = applicationInfo.packageName;
                    Intrinsics.checkNotNull(str);
                    arrayList.add(new PackageInfo(str));
                }
                return arrayList;
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.isFailure-impl(objSafeWithTimeout)) {
            objSafeWithTimeout = listEmptyList;
        }
        return (List) objSafeWithTimeout;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource
    public List<PackageInfo> getSystemApplicationsList() {
        Object objSafeWithTimeout = SafeKt.safeWithTimeout(3000L, new Function0<List<? extends PackageInfo>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSourceImpl.getSystemApplicationsList.1
            {
                super(0);
            }

            public final List<PackageInfo> invoke() {
                PackageManager packageManager = PackageManagerDataSourceImpl.this.packageManager;
                Intrinsics.checkNotNull(packageManager);
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(AbstractC0023h.n);
                Intrinsics.checkNotNullExpressionValue(installedApplications, "getInstalledApplications(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : installedApplications) {
                    ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                    Intrinsics.checkNotNull(applicationInfo);
                    String str = applicationInfo.sourceDir;
                    Intrinsics.checkNotNull(str);
                    if (StringsKt.contains$default(str, "/system/", false, 2, (Object) null)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<ApplicationInfo> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (ApplicationInfo applicationInfo2 : arrayList2) {
                    Intrinsics.checkNotNull(applicationInfo2);
                    String str2 = applicationInfo2.packageName;
                    Intrinsics.checkNotNull(str2);
                    arrayList3.add(new PackageInfo(str2));
                }
                return arrayList3;
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.isFailure-impl(objSafeWithTimeout)) {
            objSafeWithTimeout = listEmptyList;
        }
        return (List) objSafeWithTimeout;
    }
}
