package com.aheaditec.talsec.security;

import android.content.Context;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class q1 implements Runnable {
    public final l1 a;
    public final Context b;

    public q1(l1 l1Var, Context context) {
        this.a = l1Var;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a.d(this.b);
        this.a.b.c(this.b);
        this.a.d.d(this.b);
        C0030j0 c0030j0 = this.a.s;
        if (c0030j0 != null) {
            c0030j0.a(c0030j0.d.a());
        }
        this.a.j.b(this.b);
        this.a.k.b(this.b);
        this.a.l.b(this.b);
        this.a.p.a(this.b);
        this.a.q.a(this.b);
        this.a.r.d(this.b);
    }
}
