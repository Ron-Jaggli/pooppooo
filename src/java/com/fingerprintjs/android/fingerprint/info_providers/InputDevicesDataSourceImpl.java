package com.fingerprintjs.android.fingerprint.info_providers;

import android.hardware.input.InputManager;
import android.view.InputDevice;
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
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: InputDevicesInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/InputDevicesDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;", "inputDeviceManager", "Landroid/hardware/input/InputManager;", "(Landroid/hardware/input/InputManager;)V", "getInputDeviceData", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceData;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InputDevicesDataSourceImpl implements InputDeviceDataSource {
    private final InputManager inputDeviceManager;

    public InputDevicesDataSourceImpl(InputManager inputManager) {
        this.inputDeviceManager = inputManager;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.InputDeviceDataSource
    public List<InputDeviceData> getInputDeviceData() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<List<? extends InputDeviceData>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.InputDevicesDataSourceImpl.getInputDeviceData.1
            {
                super(0);
            }

            public final List<InputDeviceData> invoke() {
                InputManager inputManager = InputDevicesDataSourceImpl.this.inputDeviceManager;
                Intrinsics.checkNotNull(inputManager);
                int[] inputDeviceIds = inputManager.getInputDeviceIds();
                Intrinsics.checkNotNull(inputDeviceIds);
                InputDevicesDataSourceImpl inputDevicesDataSourceImpl = InputDevicesDataSourceImpl.this;
                ArrayList arrayList = new ArrayList(inputDeviceIds.length);
                for (int i : inputDeviceIds) {
                    InputDevice inputDevice = inputDevicesDataSourceImpl.inputDeviceManager.getInputDevice(i);
                    Intrinsics.checkNotNull(inputDevice);
                    String strValueOf = String.valueOf(inputDevice.getVendorId());
                    String name = inputDevice.getName();
                    Intrinsics.checkNotNull(name);
                    arrayList.add(new InputDeviceData(name, strValueOf));
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
