package com.fingerprintjs.android.fingerprint.info_providers;

import android.hardware.Camera;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CameraInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "()V", "extractInfo", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfo;", "getCameraInfo", "stringDescriptionForType", "", "type", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraInfoProviderImpl implements CameraInfoProvider {
    @Override // com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProvider
    public List<CameraInfo> getCameraInfo() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<List<? extends CameraInfo>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProviderImpl.getCameraInfo.1
            {
                super(0);
            }

            public final List<CameraInfo> invoke() {
                return CameraInfoProviderImpl.this.extractInfo();
            }
        }, 1, null);
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = listEmptyList;
        }
        return (List) objSafeWithTimeout$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> extractInfo() {
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            linkedList.add(new CameraInfo(String.valueOf(i), stringDescriptionForType(cameraInfo.facing), String.valueOf(cameraInfo.orientation)));
        }
        return linkedList;
    }

    private final String stringDescriptionForType(int i) {
        if (i == 0) {
            return "back";
        }
        if (i == 1) {
            return "front";
        }
        return "";
    }
}
