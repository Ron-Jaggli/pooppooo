package com.aheaditec.talsec.security;

import android.security.keystore.KeyInfo;
import com.aheaditec.talsec.security.A;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C extends B {
    public C(A.a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z, com.aheaditec.talsec.security.InterfaceC0060y
    public /* bridge */ /* synthetic */ void a() throws C0031j1 {
        super.a();
    }

    @Override // com.aheaditec.talsec.security.A, com.aheaditec.talsec.security.InterfaceC0060y
    public boolean b() throws C0031j1 {
        Key keyD = d();
        KeyInfo keyInfoA = a((SecretKey) keyD);
        a(keyD, keyInfoA);
        int securityLevel = keyInfoA.getSecurityLevel();
        return securityLevel == -1 || securityLevel == 1 || securityLevel == 2;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z, com.aheaditec.talsec.security.InterfaceC0060y
    public boolean c() throws C0031j1 {
        return e();
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z, com.aheaditec.talsec.security.InterfaceC0060y
    public /* bridge */ /* synthetic */ Key d() throws C0031j1 {
        return super.d();
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z, com.aheaditec.talsec.security.InterfaceC0060y
    public /* bridge */ /* synthetic */ void remove() throws C0031j1 {
        super.remove();
    }
}
