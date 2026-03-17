package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;
import com.unity3d.player.E;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class d extends E {
    private int b;
    private final ConnectivityManager.NetworkCallback c;

    public d(Context context) {
        super(context);
        this.b = 0;
        c cVar = new c(this);
        this.c = cVar;
        if (this.a == null) {
            return;
        }
        this.b = super.b();
        this.a.registerDefaultNetworkCallback(cVar);
    }

    @Override // com.unity3d.player.E
    public final void a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }

    @Override // com.unity3d.player.E
    public final int b() {
        return this.b;
    }
}
