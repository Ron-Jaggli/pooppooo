package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0239p0 extends Z0 {
    final /* synthetic */ int b;
    final /* synthetic */ C0248s0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0239p0(C0248s0 c0248s0, UnityPlayer unityPlayer, int i) {
        super(unityPlayer);
        this.c = c0248s0;
        this.b = i;
    }

    @Override // com.unity3d.player.Z0
    public final void a() {
        if (UnityAccessibilityDelegate.onNodeSelected(this.b)) {
            this.c.a.sendEventForVirtualViewId(this.b, 1);
        }
    }
}
