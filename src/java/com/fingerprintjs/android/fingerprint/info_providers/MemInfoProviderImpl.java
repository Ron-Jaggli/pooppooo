package com.fingerprintjs.android.fingerprint.info_providers;

import android.app.ActivityManager;
import android.os.StatFs;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: MemInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "activityManager", "Landroid/app/ActivityManager;", "internalStorageStats", "Landroid/os/StatFs;", "externalStorageStats", "(Landroid/app/ActivityManager;Landroid/os/StatFs;Landroid/os/StatFs;)V", "totalExternalStorageSpace", "", HardwareSignalConstantsKt.TOTAL_INTERNAL_STORAGE_SPACE_KEY, HardwareSignalConstantsKt.TOTAL_RAM_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MemInfoProviderImpl implements MemInfoProvider {
    private final ActivityManager activityManager;
    private final StatFs externalStorageStats;
    private final StatFs internalStorageStats;

    public MemInfoProviderImpl(ActivityManager activityManager, StatFs statFs, StatFs statFs2) {
        this.activityManager = activityManager;
        this.internalStorageStats = statFs;
        this.externalStorageStats = statFs2;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider
    public long totalRAM() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<Long>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.MemInfoProviderImpl.totalRAM.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Long m161invoke() {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ActivityManager activityManager = MemInfoProviderImpl.this.activityManager;
                Intrinsics.checkNotNull(activityManager);
                activityManager.getMemoryInfo(memoryInfo);
                return Long.valueOf(memoryInfo.totalMem);
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = 0L;
        }
        return ((Number) objSafeWithTimeout$default).longValue();
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider
    public long totalInternalStorageSpace() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<Long>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.MemInfoProviderImpl.totalInternalStorageSpace.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Long m160invoke() {
                StatFs statFs = MemInfoProviderImpl.this.internalStorageStats;
                Intrinsics.checkNotNull(statFs);
                return Long.valueOf(statFs.getTotalBytes());
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = 0L;
        }
        return ((Number) objSafeWithTimeout$default).longValue();
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider
    public long totalExternalStorageSpace() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<Long>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.MemInfoProviderImpl.totalExternalStorageSpace.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Long m159invoke() {
                StatFs statFs = MemInfoProviderImpl.this.externalStorageStats;
                Intrinsics.checkNotNull(statFs);
                return Long.valueOf(statFs.getTotalBytes());
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = 0L;
        }
        return ((Number) objSafeWithTimeout$default).longValue();
    }
}
