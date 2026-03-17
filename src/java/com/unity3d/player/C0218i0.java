package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0218i0 extends ContentObserver {
    private InterfaceC0215h0 a;

    public C0218i0(Handler handler, InterfaceC0215h0 interfaceC0215h0) {
        super(handler);
        this.a = interfaceC0215h0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        InterfaceC0215h0 interfaceC0215h0 = this.a;
        if (interfaceC0215h0 != null) {
            ((OrientationLockListener) interfaceC0215h0).b();
        }
    }
}
