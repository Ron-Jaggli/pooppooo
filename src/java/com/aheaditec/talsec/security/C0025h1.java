package com.aheaditec.talsec.security;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0025h1 implements InterfaceC0061y0 {
    public final String a;
    public final String b;

    public C0025h1(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        byte[] bArr = {47, -99, -102, 96};
        a(bArr, new byte[]{65, -24, -10, 12, -1, 114, -68, 69});
        this.b = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0061y0
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.a, this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0025h1 c0025h1 = (C0025h1) obj;
        return Objects.equals(this.a, c0025h1.a) && Objects.equals(this.b, c0025h1.b);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1850458006;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((16777216 & i3) * (i3 | 16777216)) + (((-16777217) & i3) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int i6 = (i5 - 1) - ((~i4) | i5);
            int i7 = (-1700147435) - ((i6 & 2) | (2028104049 - i6));
            switch ((-1363443157) ^ ((~i7) + ((i7 | 1) * 2))) {
                case -1940167324:
                    byte b = bArr3[i];
                    int i8 = ((byte) 0) - b;
                    bArr3[i] = (byte) (((byte) (b & (~i8))) - ((byte) ((~b) & i8)));
                    i3 = 614229416;
                    continue;
                case -360299937:
                    boolean z = (((double) ((byte) bArr3[i2])) > Double.NaN ? 1 : (((double) ((byte) bArr3[i2])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? 614229416 : z ? -1396193641 : 427928065;
                    i = i2;
                    continue;
                case 399486784:
                    return;
                case 585276366:
                    i3 = bArr.length > 0 ? 1985663266 : -1396193641;
                    bArr4 = bArr;
                    bArr3 = bArr2;
                    i2 = 0;
                    continue;
                case 1733787683:
                    byte b2 = bArr4[i];
                    byte b3 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b3 + b2)) - ((byte) (((byte) 2) * ((byte) (b3 & b2)))));
                    i2 = (i ^ 1) + ((i & 1) * 2);
                    if ((((i2 > bArr4.length ? 1 : (i2 == bArr4.length ? 0 : -1)) >>> 31) & 1) != 0) {
                        i3 = 1985663266;
                    }
                    break;
            }
            i3 = -1396193641;
        }
    }
}
