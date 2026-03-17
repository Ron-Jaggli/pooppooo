package com.aheaditec.talsec.security;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class D0 implements InterfaceC0061y0 {
    public final String a;
    public final JSONObject b;

    public D0(String str, JSONObject jSONObject) {
        this.a = str;
        if (jSONObject == null) {
            this.b = new JSONObject();
        } else {
            this.b = jSONObject;
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0061y0
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.a, this.b);
    }
}
