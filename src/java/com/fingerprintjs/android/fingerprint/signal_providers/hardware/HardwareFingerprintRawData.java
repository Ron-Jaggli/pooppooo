package com.fingerprintjs.android.fingerprint.signal_providers.hardware;

import com.fingerprintjs.android.fingerprint.info_providers.CameraInfo;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceData;
import com.fingerprintjs.android.fingerprint.info_providers.SensorData;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: HardwareFingerprintRawData.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030.J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030.J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030.J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0.J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\rHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0018HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180.J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030.J\t\u0010B\u001a\u00020\u0018HÖ\u0001J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0.J\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0.J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030.J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030.J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t0.J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0.J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0.J\u0016\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020A0.0\rH\u0016J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060.J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060.R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,¨\u0006G"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareFingerprintRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", HardwareSignalConstantsKt.MANUFACTURER_NAME_KEY, "", HardwareSignalConstantsKt.MODEL_NAME_KEY, HardwareSignalConstantsKt.TOTAL_RAM_KEY, "", HardwareSignalConstantsKt.TOTAL_INTERNAL_STORAGE_SPACE_KEY, "procCpuInfo", "", "procCpuInfoV2", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", HardwareSignalConstantsKt.SENSORS_INFO_KEY, "", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", HardwareSignalConstantsKt.INPUT_DEVICES_KEY, "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceData;", HardwareSignalConstantsKt.BATTERY_HEALTH_KEY, HardwareSignalConstantsKt.BATTERY_FULL_CAPACITY_KEY, "cameraList", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfo;", HardwareSignalConstantsKt.GLES_VERSION_KEY, HardwareSignalConstantsKt.ABI_TYPE_KEY, HardwareSignalConstantsKt.CORES_COUNT_KEY, "", "(Ljava/lang/String;Ljava/lang/String;JJLjava/util/Map;Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "getAbiType", "()Ljava/lang/String;", "getBatteryFullCapacity", "getBatteryHealth", "getCameraList", "()Ljava/util/List;", "getCoresCount", "()I", "getGlesVersion", "getInputDevices", "getManufacturerName", "getModelName", "getProcCpuInfo", "()Ljava/util/Map;", "getProcCpuInfoV2", "()Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getSensors", "getTotalInternalStorageSpace", "()J", "getTotalRAM", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "inputDevicesV2", "signals", "toString", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HardwareFingerprintRawData extends RawData {
    private final String abiType;
    private final String batteryFullCapacity;
    private final String batteryHealth;
    private final List<CameraInfo> cameraList;
    private final int coresCount;
    private final String glesVersion;
    private final List<InputDeviceData> inputDevices;
    private final String manufacturerName;
    private final String modelName;
    private final Map<String, String> procCpuInfo;
    private final CpuInfo procCpuInfoV2;
    private final List<SensorData> sensors;
    private final long totalInternalStorageSpace;
    private final long totalRAM;
    private static final Companion Companion = new Companion(null);
    private static final Set<String> CPUINFO_IGNORED_COMMON_PROPS = SetsKt.setOf("processor");
    private static final Set<String> CPUINFO_IGNORED_PER_PROC_PROPS = SetsKt.setOf(new String[]{"bogomips", "cpu mhz"});

    public final String component1() {
        return this.manufacturerName;
    }

    public final String component10() {
        return this.batteryFullCapacity;
    }

    public final List<CameraInfo> component11() {
        return this.cameraList;
    }

    public final String component12() {
        return this.glesVersion;
    }

    public final String component13() {
        return this.abiType;
    }

    public final int component14() {
        return this.coresCount;
    }

    public final String component2() {
        return this.modelName;
    }

    public final long component3() {
        return this.totalRAM;
    }

    public final long component4() {
        return this.totalInternalStorageSpace;
    }

    public final Map<String, String> component5() {
        return this.procCpuInfo;
    }

    public final CpuInfo component6() {
        return this.procCpuInfoV2;
    }

    public final List<SensorData> component7() {
        return this.sensors;
    }

    public final List<InputDeviceData> component8() {
        return this.inputDevices;
    }

    public final String component9() {
        return this.batteryHealth;
    }

    public final HardwareFingerprintRawData copy(String str, String str2, long j, long j2, Map<String, String> map, CpuInfo cpuInfo, List<SensorData> list, List<InputDeviceData> list2, String str3, String str4, List<CameraInfo> list3, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, HardwareSignalConstantsKt.MANUFACTURER_NAME_KEY);
        Intrinsics.checkNotNullParameter(str2, HardwareSignalConstantsKt.MODEL_NAME_KEY);
        Intrinsics.checkNotNullParameter(map, "procCpuInfo");
        Intrinsics.checkNotNullParameter(cpuInfo, "procCpuInfoV2");
        Intrinsics.checkNotNullParameter(list, HardwareSignalConstantsKt.SENSORS_INFO_KEY);
        Intrinsics.checkNotNullParameter(list2, HardwareSignalConstantsKt.INPUT_DEVICES_KEY);
        Intrinsics.checkNotNullParameter(str3, HardwareSignalConstantsKt.BATTERY_HEALTH_KEY);
        Intrinsics.checkNotNullParameter(str4, HardwareSignalConstantsKt.BATTERY_FULL_CAPACITY_KEY);
        Intrinsics.checkNotNullParameter(list3, "cameraList");
        Intrinsics.checkNotNullParameter(str5, HardwareSignalConstantsKt.GLES_VERSION_KEY);
        Intrinsics.checkNotNullParameter(str6, HardwareSignalConstantsKt.ABI_TYPE_KEY);
        return new HardwareFingerprintRawData(str, str2, j, j2, map, cpuInfo, list, list2, str3, str4, list3, str5, str6, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HardwareFingerprintRawData)) {
            return false;
        }
        HardwareFingerprintRawData hardwareFingerprintRawData = (HardwareFingerprintRawData) obj;
        return Intrinsics.areEqual(this.manufacturerName, hardwareFingerprintRawData.manufacturerName) && Intrinsics.areEqual(this.modelName, hardwareFingerprintRawData.modelName) && this.totalRAM == hardwareFingerprintRawData.totalRAM && this.totalInternalStorageSpace == hardwareFingerprintRawData.totalInternalStorageSpace && Intrinsics.areEqual(this.procCpuInfo, hardwareFingerprintRawData.procCpuInfo) && Intrinsics.areEqual(this.procCpuInfoV2, hardwareFingerprintRawData.procCpuInfoV2) && Intrinsics.areEqual(this.sensors, hardwareFingerprintRawData.sensors) && Intrinsics.areEqual(this.inputDevices, hardwareFingerprintRawData.inputDevices) && Intrinsics.areEqual(this.batteryHealth, hardwareFingerprintRawData.batteryHealth) && Intrinsics.areEqual(this.batteryFullCapacity, hardwareFingerprintRawData.batteryFullCapacity) && Intrinsics.areEqual(this.cameraList, hardwareFingerprintRawData.cameraList) && Intrinsics.areEqual(this.glesVersion, hardwareFingerprintRawData.glesVersion) && Intrinsics.areEqual(this.abiType, hardwareFingerprintRawData.abiType) && this.coresCount == hardwareFingerprintRawData.coresCount;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.manufacturerName.hashCode() * 31) + this.modelName.hashCode()) * 31) + Long.hashCode(this.totalRAM)) * 31) + Long.hashCode(this.totalInternalStorageSpace)) * 31) + this.procCpuInfo.hashCode()) * 31) + this.procCpuInfoV2.hashCode()) * 31) + this.sensors.hashCode()) * 31) + this.inputDevices.hashCode()) * 31) + this.batteryHealth.hashCode()) * 31) + this.batteryFullCapacity.hashCode()) * 31) + this.cameraList.hashCode()) * 31) + this.glesVersion.hashCode()) * 31) + this.abiType.hashCode()) * 31) + Integer.hashCode(this.coresCount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HardwareFingerprintRawData(manufacturerName=");
        sb.append(this.manufacturerName).append(", modelName=").append(this.modelName).append(", totalRAM=").append(this.totalRAM).append(", totalInternalStorageSpace=").append(this.totalInternalStorageSpace).append(", procCpuInfo=").append(this.procCpuInfo).append(", procCpuInfoV2=").append(this.procCpuInfoV2).append(", sensors=").append(this.sensors).append(", inputDevices=").append(this.inputDevices).append(", batteryHealth=").append(this.batteryHealth).append(", batteryFullCapacity=").append(this.batteryFullCapacity).append(", cameraList=").append(this.cameraList).append(", glesVersion=");
        sb.append(this.glesVersion).append(", abiType=").append(this.abiType).append(", coresCount=").append(this.coresCount).append(')');
        return sb.toString();
    }

    public final String getManufacturerName() {
        return this.manufacturerName;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final long getTotalRAM() {
        return this.totalRAM;
    }

    public final long getTotalInternalStorageSpace() {
        return this.totalInternalStorageSpace;
    }

    public final Map<String, String> getProcCpuInfo() {
        return this.procCpuInfo;
    }

    public final CpuInfo getProcCpuInfoV2() {
        return this.procCpuInfoV2;
    }

    public final List<SensorData> getSensors() {
        return this.sensors;
    }

    public final List<InputDeviceData> getInputDevices() {
        return this.inputDevices;
    }

    public final String getBatteryHealth() {
        return this.batteryHealth;
    }

    public final String getBatteryFullCapacity() {
        return this.batteryFullCapacity;
    }

    public final List<CameraInfo> getCameraList() {
        return this.cameraList;
    }

    public final String getGlesVersion() {
        return this.glesVersion;
    }

    public final String getAbiType() {
        return this.abiType;
    }

    public final int getCoresCount() {
        return this.coresCount;
    }

    public HardwareFingerprintRawData(String str, String str2, long j, long j2, Map<String, String> map, CpuInfo cpuInfo, List<SensorData> list, List<InputDeviceData> list2, String str3, String str4, List<CameraInfo> list3, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, HardwareSignalConstantsKt.MANUFACTURER_NAME_KEY);
        Intrinsics.checkNotNullParameter(str2, HardwareSignalConstantsKt.MODEL_NAME_KEY);
        Intrinsics.checkNotNullParameter(map, "procCpuInfo");
        Intrinsics.checkNotNullParameter(cpuInfo, "procCpuInfoV2");
        Intrinsics.checkNotNullParameter(list, HardwareSignalConstantsKt.SENSORS_INFO_KEY);
        Intrinsics.checkNotNullParameter(list2, HardwareSignalConstantsKt.INPUT_DEVICES_KEY);
        Intrinsics.checkNotNullParameter(str3, HardwareSignalConstantsKt.BATTERY_HEALTH_KEY);
        Intrinsics.checkNotNullParameter(str4, HardwareSignalConstantsKt.BATTERY_FULL_CAPACITY_KEY);
        Intrinsics.checkNotNullParameter(list3, "cameraList");
        Intrinsics.checkNotNullParameter(str5, HardwareSignalConstantsKt.GLES_VERSION_KEY);
        Intrinsics.checkNotNullParameter(str6, HardwareSignalConstantsKt.ABI_TYPE_KEY);
        this.manufacturerName = str;
        this.modelName = str2;
        this.totalRAM = j;
        this.totalInternalStorageSpace = j2;
        this.procCpuInfo = map;
        this.procCpuInfoV2 = cpuInfo;
        this.sensors = list;
        this.inputDevices = list2;
        this.batteryHealth = str3;
        this.batteryFullCapacity = str4;
        this.cameraList = list3;
        this.glesVersion = str5;
        this.abiType = str6;
        this.coresCount = i;
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.RawData
    public List<IdentificationSignal<? extends Object>> signals() {
        return CollectionsKt.listOf(new IdentificationSignal[]{manufacturerName(), modelName(), totalRAM(), totalInternalStorageSpace(), procCpuInfo(), procCpuInfoV2(), sensors(), inputDevices(), inputDevicesV2(), batteryHealth(), batteryFullCapacity(), cameraList(), glesVersion(), abiType(), coresCount()});
    }

    public final IdentificationSignal<String> manufacturerName() {
        return new IdentificationSignal<String>(StabilityLevel.STABLE, this.manufacturerName) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.manufacturerName.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return HardwareFingerprintRawData.this.getManufacturerName();
            }
        };
    }

    public final IdentificationSignal<String> modelName() {
        return new IdentificationSignal<String>(StabilityLevel.STABLE, this.modelName) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.modelName.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return HardwareFingerprintRawData.this.getModelName();
            }
        };
    }

    public final IdentificationSignal<Long> totalRAM() {
        return new IdentificationSignal<Long>(StabilityLevel.STABLE, this.totalRAM) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.totalRAM.1
            {
                Long lValueOf = Long.valueOf(j);
            }

            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return String.valueOf(HardwareFingerprintRawData.this.getTotalRAM());
            }
        };
    }

    public final IdentificationSignal<Long> totalInternalStorageSpace() {
        return new IdentificationSignal<Long>(StabilityLevel.STABLE, this.totalInternalStorageSpace) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.totalInternalStorageSpace.1
            {
                Long lValueOf = Long.valueOf(j);
            }

            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return String.valueOf(HardwareFingerprintRawData.this.getTotalInternalStorageSpace());
            }
        };
    }

    public final IdentificationSignal<Map<String, String>> procCpuInfo() {
        return (IdentificationSignal) new IdentificationSignal<Map<String, ? extends String>>(StabilityLevel.STABLE, this.procCpuInfo) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.procCpuInfo.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = HardwareFingerprintRawData.this.getProcCpuInfo().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sb.append((String) entry.getKey()).append((String) entry.getValue());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<CpuInfo> procCpuInfoV2() {
        StabilityLevel stabilityLevel = StabilityLevel.STABLE;
        CpuInfo cpuInfo = this.procCpuInfoV2;
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
        List<List<Pair<String, String>>> perProcessorInfo = this.procCpuInfoV2.getPerProcessorInfo();
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
        return new IdentificationSignal<CpuInfo>(stabilityLevel, cpuInfo.copy(arrayList2, arrayList3)) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.procCpuInfoV2.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return new StringBuilder().append(getValue().getCommonInfo()).append(getValue().getPerProcessorInfo()).toString();
            }
        };
    }

    public final IdentificationSignal<List<SensorData>> sensors() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends SensorData>>(StabilityLevel.STABLE, this.sensors) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.sensors.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (SensorData sensorData : HardwareFingerprintRawData.this.getSensors()) {
                    sb.append(sensorData.getSensorName()).append(sensorData.getVendorName());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<List<InputDeviceData>> inputDevices() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends InputDeviceData>>(StabilityLevel.STABLE, this.inputDevices) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.inputDevices.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (InputDeviceData inputDeviceData : getValue()) {
                    sb.append(inputDeviceData.getName()).append(inputDeviceData.getVendor());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<List<InputDeviceData>> inputDevicesV2() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends InputDeviceData>>(StabilityLevel.STABLE, this.inputDevices) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.inputDevicesV2.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                List<? extends InputDeviceData> value = getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                for (InputDeviceData inputDeviceData : value) {
                    arrayList.add(inputDeviceData.getName() + inputDeviceData.getVendor());
                }
                Iterator it = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData$inputDevicesV2$1$toString$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((String) t, (String) t2);
                    }
                }).iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<String> batteryHealth() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.batteryHealth) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.batteryHealth.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return HardwareFingerprintRawData.this.getBatteryHealth();
            }
        };
    }

    public final IdentificationSignal<String> batteryFullCapacity() {
        return new IdentificationSignal<String>(StabilityLevel.STABLE, this.batteryFullCapacity) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.batteryFullCapacity.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return HardwareFingerprintRawData.this.getBatteryFullCapacity();
            }
        };
    }

    public final IdentificationSignal<List<CameraInfo>> cameraList() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends CameraInfo>>(StabilityLevel.STABLE, this.cameraList) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.cameraList.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (CameraInfo cameraInfo : HardwareFingerprintRawData.this.getCameraList()) {
                    sb.append(cameraInfo.getCameraName()).append(cameraInfo.getCameraType()).append(cameraInfo.getCameraOrientation());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<String> glesVersion() {
        return new IdentificationSignal<String>(StabilityLevel.STABLE, this.glesVersion) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.glesVersion.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return HardwareFingerprintRawData.this.getGlesVersion();
            }
        };
    }

    public final IdentificationSignal<String> abiType() {
        return new IdentificationSignal<String>(StabilityLevel.STABLE, this.abiType) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.abiType.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return HardwareFingerprintRawData.this.getAbiType();
            }
        };
    }

    public final IdentificationSignal<Integer> coresCount() {
        return new IdentificationSignal<Integer>(StabilityLevel.STABLE, this.coresCount) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareFingerprintRawData.coresCount.1
            {
                Integer numValueOf = Integer.valueOf(i);
            }

            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return String.valueOf(HardwareFingerprintRawData.this.getCoresCount());
            }
        };
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
     */
    /* JADX INFO: compiled from: HardwareFingerprintRawData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareFingerprintRawData$Companion;", "", "()V", "CPUINFO_IGNORED_COMMON_PROPS", "", "", "CPUINFO_IGNORED_PER_PROC_PROPS", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
