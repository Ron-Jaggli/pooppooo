package com.unity3d.player;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0261z extends C0255w {
    private static HashMap G;
    private String F;

    protected C0261z(com.unity3d.player.a.b bVar) {
        super(bVar);
        this.F = null;
    }

    public static String[] a(Context context) throws CameraAccessException {
        String[] cameraIdList = C0255w.getCameraManager(context).getCameraIdList();
        ArrayList arrayList = new ArrayList();
        G = new HashMap();
        for (String str : cameraIdList) {
            arrayList.add(str);
            G.put(str, str);
        }
        for (String str2 : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = C0255w.getCameraManager(context).getCameraCharacteristics(str2);
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    D.Log(4, String.format("Camera2 %s is a simple camera", str2));
                    break;
                }
                if (iArr[i] == 11) {
                    D.Log(4, String.format("Camera2 %s is a logical camera backed by two or more physical cameras", str2));
                    for (String str3 : cameraCharacteristics.getPhysicalCameraIds()) {
                        if (arrayList.indexOf(str3) == -1) {
                            arrayList.add(str3);
                            G.put(str3, str2);
                        }
                        D.Log(4, String.format("Physical camera2 found : %s", str3));
                    }
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.unity3d.player.C0255w
    protected void createCaptureSession(CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
        OutputConfiguration outputConfiguration = new OutputConfiguration(this.w);
        String str = this.F;
        if (str != null) {
            outputConfiguration.setPhysicalCameraId(str);
        }
        this.b.createCaptureSession(new SessionConfiguration(0, Collections.singletonList(outputConfiguration), new ExecutorC0259y(this.d), stateCallback));
    }

    @Override // com.unity3d.player.C0255w
    protected String getCameraIdToOpen(Context context, int i) {
        String str = C0255w.getCameraIds(context)[i];
        String str2 = (String) G.get(str);
        if (str2.equals(str)) {
            this.F = null;
            return str;
        }
        this.F = str;
        return str2;
    }

    @Override // com.unity3d.player.C0255w
    protected CameraCaptureSession.CaptureCallback getCaptureCallback() {
        if (this.s == null) {
            this.s = new C0257x(this);
        }
        return this.s;
    }
}
