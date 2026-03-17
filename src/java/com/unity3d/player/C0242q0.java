package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0242q0 extends Z0 {
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ C0248s0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0242q0(C0248s0 c0248s0, UnityPlayer unityPlayer, int i, int i2) {
        super(unityPlayer);
        this.d = c0248s0;
        this.b = i;
        this.c = i2;
    }

    @Override // com.unity3d.player.Z0
    public final void a() {
        if (this.b == 4096) {
            UnityAccessibilityDelegate.onNodeIncremented(this.c);
        } else {
            UnityAccessibilityDelegate.onNodeDecremented(this.c);
        }
        this.d.a.sendEventForVirtualViewId(this.c, 4);
    }
}
