package com.fingerprintjs.android.fingerprint.info_providers;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: SensorsInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;", "sensorManager", "Landroid/hardware/SensorManager;", "(Landroid/hardware/SensorManager;)V", HardwareSignalConstantsKt.SENSORS_INFO_KEY, "", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SensorDataSourceImpl implements SensorDataSource {
    private final SensorManager sensorManager;

    public SensorDataSourceImpl(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SensorDataSource
    public List<SensorData> sensors() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<List<? extends SensorData>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.SensorDataSourceImpl.sensors.1
            {
                super(0);
            }

            public final List<SensorData> invoke() {
                SensorManager sensorManager = SensorDataSourceImpl.this.sensorManager;
                Intrinsics.checkNotNull(sensorManager);
                List<Sensor> sensorList = sensorManager.getSensorList(-1);
                Intrinsics.checkNotNull(sensorList);
                List<Sensor> list = sensorList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Sensor sensor : list) {
                    Intrinsics.checkNotNull(sensor);
                    String name = sensor.getName();
                    Intrinsics.checkNotNull(name);
                    String vendor = sensor.getVendor();
                    Intrinsics.checkNotNull(vendor);
                    arrayList.add(new SensorData(name, vendor));
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
}
