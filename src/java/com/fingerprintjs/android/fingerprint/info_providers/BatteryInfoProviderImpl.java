package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import com.instacart.truetime.sntp.SntpImpl;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: BatteryInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", HardwareSignalConstantsKt.BATTERY_HEALTH_KEY, "", "batteryHealthStringDescription", "", "batteryTotalCapacity", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BatteryInfoProviderImpl implements BatteryInfoProvider {
    private final Context applicationContext;

    public BatteryInfoProviderImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        this.applicationContext = context;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProvider
    public String batteryHealth() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProviderImpl.batteryHealth.1
            {
                super(0);
            }

            public final String invoke() {
                Intent intentRegisterReceiver = BatteryInfoProviderImpl.this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                Intrinsics.checkNotNull(intentRegisterReceiver);
                int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
                if (intExtra != -1) {
                    return BatteryInfoProviderImpl.this.batteryHealthStringDescription(intExtra);
                }
                return "";
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProvider
    public String batteryTotalCapacity() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProviderImpl.batteryTotalCapacity.1
            {
                super(0);
            }

            public final String invoke() throws IllegalAccessException, InvocationTargetException {
                Object objInvoke = Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(BatteryInfoProviderImpl.this.applicationContext), new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Double");
                return String.valueOf(((Double) objInvoke).doubleValue());
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String batteryHealthStringDescription(int i) {
        switch (i) {
            case 2:
                return "good";
            case 3:
                return "overheat";
            case 4:
                return "dead";
            case SntpImpl.RESPONSE_INDEX_DISPERSION /* 5 */:
                return "over voltage";
            case SntpImpl.RESPONSE_INDEX_STRATUM /* 6 */:
                return "unspecified failure";
            case SntpImpl.RESPONSE_INDEX_RESPONSE_TICKS /* 7 */:
                return "cold";
            default:
                return "unknown";
        }
    }
}
