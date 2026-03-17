package com.aheaditec.talsec.security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class W implements InterfaceC0061y0 {
    public final String a;
    public final List<String> b;

    public W(String str, List<String> list) {
        this.a = str;
        if (list == null) {
            this.b = new ArrayList();
        } else {
            this.b = list;
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0061y0
    public void a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put(this.a, jSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        W w = (W) obj;
        return Objects.equals(this.a, w.a) && Objects.equals(this.b, w.b);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
