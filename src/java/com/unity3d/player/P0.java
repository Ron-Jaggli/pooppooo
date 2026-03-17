package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class P0 implements Runnable {
    final /* synthetic */ PermissionRequest a;
    final /* synthetic */ String[] b;
    final /* synthetic */ int[] c;

    P0(PermissionRequest permissionRequest, String[] strArr, int[] iArr) {
        this.a = permissionRequest;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.permissionResponse(this.b, this.c);
    }
}
