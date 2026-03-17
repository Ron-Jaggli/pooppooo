package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.InterfaceC0047r0;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class F {
    public final String a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String e;
    public final String f;
    public final String g;

    public F(String str, InterfaceC0047r0.a aVar, String str2, String str3) {
        this.a = str;
        this.b = aVar.a();
        this.e = str2;
        String[] strArrC = aVar.c();
        this.c = strArrC;
        this.d = aVar.b() == null ? new String[0] : aVar.b();
        this.f = str3;
        this.g = strArrC.length > 0 ? strArrC[0] : null;
    }

    public String[] a() {
        return this.b;
    }

    public String[] b() {
        return this.c;
    }

    public String[] c() {
        return this.d;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.e;
    }
}
