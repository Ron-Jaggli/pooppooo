package com.fingerprintjs.android.fingerprint.info_providers;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: DeviceSecurityInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r0\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "devicePolicyManager", "Landroid/app/admin/DevicePolicyManager;", "keyguardManager", "Landroid/app/KeyguardManager;", "(Landroid/app/admin/DevicePolicyManager;Landroid/app/KeyguardManager;)V", OsBuildSignalsConstantsKt.ENCRYPTION_STATUS_KEY, "", DeviceStateSignalsConstantsKt.IS_PIN_SECURITY_ENABLED_KEY, "", "securityProvidersData", "", "Lkotlin/Pair;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceSecurityInfoProviderImpl implements DeviceSecurityInfoProvider {
    private final DevicePolicyManager devicePolicyManager;
    private final KeyguardManager keyguardManager;

    public DeviceSecurityInfoProviderImpl(DevicePolicyManager devicePolicyManager, KeyguardManager keyguardManager) {
        this.devicePolicyManager = devicePolicyManager;
        this.keyguardManager = keyguardManager;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider
    public String encryptionStatus() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProviderImpl.encryptionStatus.1
            {
                super(0);
            }

            public final String invoke() {
                DevicePolicyManager devicePolicyManager = DeviceSecurityInfoProviderImpl.this.devicePolicyManager;
                Intrinsics.checkNotNull(devicePolicyManager);
                return DeviceSecurityInfoProviderKt.stringDescriptionForEncryptionStatus(devicePolicyManager.getStorageEncryptionStatus());
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider
    public List<Pair<String, String>> securityProvidersData() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<List<? extends Pair<? extends String, ? extends String>>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProviderImpl.securityProvidersData.1
            public final List<Pair<String, String>> invoke() {
                Provider[] providers = Security.getProviders();
                Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                Provider[] providerArr = providers;
                ArrayList arrayList = new ArrayList(providerArr.length);
                for (Provider provider : providerArr) {
                    Intrinsics.checkNotNull(provider);
                    String name = provider.getName();
                    Intrinsics.checkNotNull(name);
                    String info = provider.getInfo();
                    if (info == null) {
                        info = "";
                    } else {
                        Intrinsics.checkNotNull(info);
                    }
                    arrayList.add(new Pair(name, info));
                }
                return arrayList;
            }
        }, 1, null);
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = listEmptyList;
        }
        return (List) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider
    public boolean isPinSecurityEnabled() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<Boolean>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProviderImpl.isPinSecurityEnabled.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m154invoke() {
                KeyguardManager keyguardManager = DeviceSecurityInfoProviderImpl.this.keyguardManager;
                Intrinsics.checkNotNull(keyguardManager);
                return Boolean.valueOf(keyguardManager.isKeyguardSecure());
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = false;
        }
        return ((Boolean) objSafeWithTimeout$default).booleanValue();
    }
}
