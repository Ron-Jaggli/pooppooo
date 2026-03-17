package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.T;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class U {
    public final Map<String, T> a = new HashMap(15);

    public synchronized JSONObject a() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, T> entry : this.a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().a());
        }
        return jSONObject;
    }

    public final void a(T t, T.a aVar, Long l) {
        if (l != null) {
            t.a(aVar, l.longValue());
        } else {
            t.a(aVar);
        }
    }

    public synchronized void a(String str, T.a aVar, Long l) {
        T t = this.a.get(str);
        if (t == null) {
            this.a.put(str, new T(aVar, l));
        } else {
            if (l != null) {
                t.a(aVar, l.longValue());
            } else {
                t.a(aVar);
            }
        }
    }
}
