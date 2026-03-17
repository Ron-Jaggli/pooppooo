package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class E {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        byte[] bArr = {93, -57, 87, 120, -101, -91, -104, -108, -51, -117};
        a(bArr, new byte[]{60, -73, 39, 46, -2, -41, -21, -3, -94, -27});
        Charset charset = StandardCharsets.UTF_8;
        e = new String(bArr, charset).intern();
        byte[] bArr2 = {-61, 124, 86, 6, 33, 1, 1, 19, -93, 16, 120, -125, -118, 45, 15, -50, -95, -24};
        a(bArr2, new byte[]{-86, 18, 37, 114, 64, 109, 109, 114, -41, 121, 23, -19, -39, 66, 122, -68, -62, -115});
        d = new String(bArr2, charset).intern();
        byte[] bArr3 = {15, -85, 87, 79, -73, 57, 23, -43, 68, -68, -117, 73, -91, -115, 101, -32, 40, 71, 87, -53, 49};
        a(bArr3, new byte[]{110, -57, 35, 42, -59, 87, 118, -95, 45, -54, -18, 10, -64, -1, 17, -88, 73, 52, 63, -82, 66});
        c = new String(bArr3, charset).intern();
        byte[] bArr4 = {68, -69, 17, -50, 35, -104, 2, 10};
        a(bArr4, new byte[]{39, -34, 99, -70, 107, -7, 113, 98});
        b = new String(bArr4, charset).intern();
        byte[] bArr5 = {42, -38, -102, -93, 76, 126, -54, -68, -78, 108, 73, 5, -123};
        a(bArr5, new byte[]{75, -86, -22, -22, 40, 27, -92, -56, -37, 10, 32, 96, -9});
        a = new String(bArr5, charset).intern();
    }

    public static JSONObject a(InterfaceC0057w0 interfaceC0057w0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = {108, 27, -51, 40, 27, -11, 117, -100, -9, 110, -41, -52, -114};
        a(bArr, new byte[]{13, 107, -67, 97, 127, -112, 27, -24, -98, 8, -66, -87, -4});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr, charset).intern(), interfaceC0057w0.a().e());
        String[] strArrA = interfaceC0057w0.a().a();
        if (strArrA.length >= 1) {
            byte[] bArr2 = {107, -15, 68, 38, -127, 120, 8, 11};
            a(bArr2, new byte[]{8, -108, 54, 82, -55, 25, 123, 99});
            jSONObject.put(new String(bArr2, charset).intern(), strArrA[0]);
            if (strArrA.length > 1) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 1; i < strArrA.length; i++) {
                    jSONArray.put(strArrA[i]);
                }
                byte[] bArr3 = {-38, 101, 100, 83, 122, 63, 48, -33, 74, 13, 111, 31, 7, 84, 79, -112, 22, -36, 112, -92, -46};
                a(bArr3, new byte[]{-69, 9, 16, 54, 8, 81, 81, -85, 35, 123, 10, 92, 98, 38, 59, -40, 119, -81, 24, -63, -95});
                jSONObject.put(new String(bArr3, StandardCharsets.UTF_8).intern(), jSONArray);
            }
        }
        String strD = interfaceC0057w0.a().d();
        if (strD == null) {
            strD = "";
        }
        byte[] bArr4 = {-24, 24, 58, -126, -21, 43, 21, 65, -65, -72};
        a(bArr4, new byte[]{-119, 104, 74, -44, -114, 89, 102, 40, -48, -42});
        Charset charset2 = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr4, charset2).intern(), strD);
        String strG = interfaceC0057w0.a().g();
        if (strG == null) {
            byte[] bArr5 = {-49, 52, 78};
            a(bArr5, new byte[]{-82, 80, 44, -40, -118, 23, -54, -44});
            strG = new String(bArr5, charset2).intern();
        }
        byte[] bArr6 = {121, -63, 102, 95, 111, 107, -4, 102, -127, 13, 11, 81, 5, -65, -112, -3, 88, 20};
        a(bArr6, new byte[]{16, -81, 21, 43, 14, 7, -112, 7, -11, 100, 100, 63, 86, -48, -27, -113, 59, 113});
        jSONObject.put(new String(bArr6, charset2).intern(), strG);
        return jSONObject;
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
                    byte b2 = bArr3[i];
                    int i8 = ((byte) 0) - b2;
                    bArr3[i] = (byte) (((byte) (b2 & (~i8))) - ((byte) ((~b2) & i8)));
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
                    byte b3 = bArr4[i];
                    byte b4 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b4 + b3)) - ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
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
