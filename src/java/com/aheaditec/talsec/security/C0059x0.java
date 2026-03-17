package com.aheaditec.talsec.security;

import android.content.Context;
import com.aheaditec.talsec.security.InterfaceC0047r0;
import com.aheaditec.talsec_security.security.api.TalsecConfig;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0059x0 implements InterfaceC0057w0 {
    public static volatile C0059x0 h;
    public final String a;
    public final C0042o0 b;
    public final String c;
    public final F d;
    public final String e;
    public final InterfaceC0021g0 f;
    public final U g = new U();

    public C0059x0(String str, C0042o0 c0042o0, String str2, F f, String str3, InterfaceC0021g0 interfaceC0021g0) {
        this.a = str;
        this.b = c0042o0;
        this.c = str2;
        this.d = f;
        this.e = str3;
        this.f = interfaceC0021g0;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public F a() {
        return this.d;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public String b() {
        return this.e;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public U c() {
        return this.g;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public String d() {
        return this.c;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public InterfaceC0021g0 e() {
        return this.f;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public String f() {
        return this.a;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0057w0
    public String g() {
        return this.b.b();
    }

    public static C0059x0 a(v1 v1Var, TalsecConfig talsecConfig, Context context, InterfaceC0047r0.a aVar) {
        if (h == null) {
            synchronized (C0059x0.class) {
                if (h == null) {
                    String strA = C0019f1.a();
                    C0024h0 c0024h0A = C0024h0.e.a(context);
                    h = new C0059x0(v1Var.b().g, v1Var.a(), strA, new F(context.getPackageName(), aVar, InterfaceC0057w0.a(context), InterfaceC0057w0.b(context)), talsecConfig.getWatcherMail(), c0024h0A);
                }
            }
        }
        return h;
    }
}
