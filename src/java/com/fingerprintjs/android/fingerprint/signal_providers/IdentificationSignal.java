package com.fingerprintjs.android.fingerprint.signal_providers;

import com.fingerprintjs.android.fingerprint.info_providers.CameraInfo;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceData;
import com.fingerprintjs.android.fingerprint.info_providers.MediaCodecInfo;
import com.fingerprintjs.android.fingerprint.info_providers.SensorData;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: Signal.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u0019\u001a\u00020\tH&J \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u00172\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "T", "Lcom/fingerprintjs/android/fingerprint/signal_providers/Signal;", "addedInVersion", "", "removedInVersion", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "name", "", "displayName", "value", "(ILjava/lang/Integer;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getAddedInVersion", "()I", "getDisplayName", "()Ljava/lang/String;", "getRemovedInVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStabilityLevel", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "toMap", "", "", "toString", "wrapSignalToMap", "signal", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IdentificationSignal<T> extends Signal<T> {
    private final int addedInVersion;
    private final String displayName;
    private final Integer removedInVersion;
    private final StabilityLevel stabilityLevel;

    public abstract String toString();

    public final int getAddedInVersion() {
        return this.addedInVersion;
    }

    public final Integer getRemovedInVersion() {
        return this.removedInVersion;
    }

    public final StabilityLevel getStabilityLevel() {
        return this.stabilityLevel;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationSignal(int i, Integer num, StabilityLevel stabilityLevel, String str, String str2, T t) {
        super(str, t);
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "displayName");
        this.addedInVersion = i;
        this.removedInVersion = num;
        this.stabilityLevel = stabilityLevel;
        this.displayName = str2;
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.Signal
    public Map<String, Object> toMap() {
        return wrapSignalToMap(this);
    }

    private final Map<String, Object> wrapSignalToMap(Signal<?> signal) {
        Object objValueOf;
        Object value = signal.getValue();
        if (value == null) {
            value = MapsKt.emptyMap();
        }
        if (value instanceof String) {
            return MapsKt.mapOf(TuplesKt.to("v", value));
        }
        if (value instanceof Integer) {
            return MapsKt.mapOf(TuplesKt.to("v", value));
        }
        if (value instanceof Long) {
            return MapsKt.mapOf(TuplesKt.to("v", value));
        }
        if (value instanceof Boolean) {
            return MapsKt.mapOf(TuplesKt.to("v", value));
        }
        if (value instanceof Map) {
            return MapsKt.mapOf(TuplesKt.to("v", value));
        }
        if (value instanceof List) {
            Iterable iterable = (Iterable) value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (T t : iterable) {
                if (t instanceof MediaCodecInfo) {
                    MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) t;
                    objValueOf = MapsKt.mapOf(new Pair[]{TuplesKt.to(OsBuildSignalsConstantsKt.CODEC_NAME_KEY, mediaCodecInfo.getName()), TuplesKt.to(OsBuildSignalsConstantsKt.CODEC_CAPABILITIES_KEY, mediaCodecInfo.getCapabilities())});
                } else if (t instanceof InputDeviceData) {
                    InputDeviceData inputDeviceData = (InputDeviceData) t;
                    objValueOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("vendor", inputDeviceData.getVendor()), TuplesKt.to("name", inputDeviceData.getName())});
                } else if (t instanceof SensorData) {
                    SensorData sensorData = (SensorData) t;
                    objValueOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("sensorName", sensorData.getSensorName()), TuplesKt.to("vendorName", sensorData.getVendorName())});
                } else if (t instanceof CameraInfo) {
                    CameraInfo cameraInfo = (CameraInfo) t;
                    objValueOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("cameraName", cameraInfo.getCameraName()), TuplesKt.to("cameraType", cameraInfo.getCameraType()), TuplesKt.to("cameraOrientation", cameraInfo.getCameraOrientation())});
                } else if (t instanceof Pair) {
                    Pair pair = (Pair) t;
                    objValueOf = CollectionsKt.listOf(new String[]{String.valueOf(pair.getFirst()), String.valueOf(pair.getSecond())});
                } else {
                    objValueOf = String.valueOf(t);
                }
                arrayList.add(objValueOf);
            }
            return MapsKt.mapOf(TuplesKt.to("v", arrayList));
        }
        if (value instanceof CpuInfo) {
            CpuInfo cpuInfo = (CpuInfo) value;
            List<Pair<String, String>> commonInfo = cpuInfo.getCommonInfo();
            int size = cpuInfo.getPerProcessorInfo().size();
            List listFlatten = CollectionsKt.flatten(cpuInfo.getPerProcessorInfo());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t2 : listFlatten) {
                Pair pair2 = (Pair) t2;
                Object obj = linkedHashMap.get(pair2);
                if (obj == null) {
                    obj = (List) new ArrayList();
                    linkedHashMap.put(pair2, obj);
                }
                ((List) obj).add(t2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() == size) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList2.add((Pair) ((Map.Entry) it.next()).getKey());
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator<T> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add((String) ((Pair) it2.next()).getFirst());
            }
            Set set = CollectionsKt.toSet(arrayList5);
            List<List<Pair<String, String>>> perProcessorInfo = cpuInfo.getPerProcessorInfo();
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(perProcessorInfo, 10));
            Iterator<T> it3 = perProcessorInfo.iterator();
            while (it3.hasNext()) {
                List list = (List) it3.next();
                ArrayList arrayList7 = new ArrayList();
                for (T t3 : list) {
                    if (!set.contains(((Pair) t3).getFirst())) {
                        arrayList7.add(t3);
                    }
                }
                arrayList6.add(arrayList7);
            }
            return MapsKt.mapOf(TuplesKt.to("v", MapsKt.mapOf(new Pair[]{TuplesKt.to("commonProps", commonInfo), TuplesKt.to("repeatedProps", arrayList3), TuplesKt.to("uniquePerCpuProps", arrayList6)})));
        }
        return MapsKt.mapOf(TuplesKt.to("v", value.toString()));
    }
}
