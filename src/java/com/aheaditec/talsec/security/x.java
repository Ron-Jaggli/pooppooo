package com.aheaditec.talsec.security;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class X {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public Long d = null;

    public X(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public Long a() {
        return this.d;
    }

    public boolean b() {
        return !this.a;
    }

    public boolean c() {
        return (this.a && this.b && this.c) ? false : true;
    }

    public void a(long j) {
        this.d = Long.valueOf(j);
    }
}
