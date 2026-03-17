package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
abstract class SoftInputProvider {
    public static int a() {
        int iNativeGetSoftInputType = nativeGetSoftInputType();
        for (int i : com.unity3d.player.a.a.b(3)) {
            if (com.unity3d.player.a.f.a(i) == iNativeGetSoftInputType) {
                return i;
            }
        }
        return 1;
    }

    private static final native int nativeGetSoftInputType();
}
