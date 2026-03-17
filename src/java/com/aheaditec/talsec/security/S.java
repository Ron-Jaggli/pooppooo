package com.aheaditec.talsec.security;

import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class S extends AbstractC0011d {
    public final String h;
    public final X509Certificate i;

    public S(String str, X509Certificate x509Certificate) {
        this.h = str;
        this.i = x509Certificate;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0011d
    public /* bridge */ /* synthetic */ JSONObject a(X509Certificate x509Certificate) throws JSONException {
        return super.a(x509Certificate);
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0061y0
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.h, a(this.i));
    }
}
