package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class PermissionRequest {
    static final int DENIED = 2;
    static final int DENIED_DONT_ASK_AGAIN = 3;
    static final int GRANTED = 1;
    private IPermissionRequestCallbacks mCallbacks;
    private String[] mPermissionNames;

    public PermissionRequest(String[] strArr, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.mPermissionNames = strArr;
        this.mCallbacks = iPermissionRequestCallbacks;
    }

    String[] getPermissionNames() {
        return this.mPermissionNames;
    }

    void permissionResponse(String[] strArr, int[] iArr) {
        IPermissionRequestCallbacks iPermissionRequestCallbacks = this.mCallbacks;
        if (iPermissionRequestCallbacks == null) {
            return;
        }
        iPermissionRequestCallbacks.onPermissionResult(strArr, iArr);
    }
}
