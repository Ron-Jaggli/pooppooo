package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class UnityCoreAssetPacksStatusCallbacks implements IAssetPackManagerDownloadStatusCallback, IAssetPackManagerStatusQueryCallback {
    private final native void nativeStatusQueryResult(String str, int i, int i2);

    @Override // com.unity3d.player.IAssetPackManagerStatusQueryCallback
    public void onStatusResult(long j, String[] strArr, int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr.length; i++) {
            nativeStatusQueryResult(strArr[i], iArr[i], iArr2[i]);
        }
    }

    @Override // com.unity3d.player.IAssetPackManagerDownloadStatusCallback
    public void onStatusUpdate(String str, int i, long j, long j2, int i2, int i3) {
        nativeStatusQueryResult(str, i, i3);
    }
}
