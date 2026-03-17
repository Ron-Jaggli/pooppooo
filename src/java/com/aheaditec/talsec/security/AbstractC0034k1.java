package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0034k1 extends I {
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final InterfaceC0057w0 m;
    public final C0028i1 n;
    public final U o;
    public final String p;

    static {
        byte[] bArr = {-109, 110, 1, 95, -49, 107, -17, 33, -88, 117, 10, 71, 74, 81, -96, 20, -84, 95, -120, -127};
        b(bArr, new byte[]{-101, 9, -31, -100, -34, 60, 58, -124, -69, 41, -46, -116, 65, 21, 119, -64, -69, 8, 105, 81});
        Charset charset = StandardCharsets.UTF_8;
        y = new String(bArr, charset).intern();
        byte[] bArr2 = {125, -9, -57, -57, -120, -80, -118, -1, 27, 37, -99, -78, 94};
        b(bArr2, new byte[]{122, -86, 39, 15, -123, -27, 66, 56, 13, 68, 70, 99, 48});
        x = new String(bArr2, charset).intern();
        byte[] bArr3 = {-73, -111, 51, 107, 48, 88, 92, -20, 90, -75, 102, 94, -4};
        b(bArr3, new byte[]{-96, -61, -18, -64, 56, 11, -68, 58, 87, -31, -67, -103, -114});
        w = new String(bArr3, charset).intern();
        byte[] bArr4 = {-79, -101, -124, -95, -60, -107, -69, -30, -6, 43, 95};
        b(bArr4, new byte[]{-90, -55, 89, 19, -44, -38, 93, 42, -107, 89, 50});
        v = new String(bArr4, charset).intern();
        byte[] bArr5 = {84, 73, 49, -124, -128, -44, -108, -22, -46};
        b(bArr5, new byte[]{67, 26, -44, 81, -115, -119, 116, 65, -74});
        u = new String(bArr5, charset).intern();
        byte[] bArr6 = {-97, -100, -110, -126, -29, 93, -109, -68, 121, 119, 78};
        b(bArr6, new byte[]{-124, -45, 116, 71, -17, 14, 119, 19, 24, 30, 34});
        t = new String(bArr6, charset).intern();
        byte[] bArr7 = {-84, 25, 102, 104, -79, 88};
        b(bArr7, new byte[]{-85, 79, -79, -83, -38, 43, -106, 39});
        s = new String(bArr7, charset).intern();
        byte[] bArr8 = {38, -38, 127, -76, 38, 19, -55};
        b(bArr8, new byte[]{35, -124, -99, 31, 72, 117, -90, -89});
        r = new String(bArr8, charset).intern();
        byte[] bArr9 = {-78, -37, 51, -5, -34, -63, -45, -21, 99, 48, 75};
        b(bArr9, new byte[]{-70, -120, -37, 48, -39, -110, 22, 61, 2, 68, 46});
        q = new String(bArr9, charset).intern();
    }

    public AbstractC0034k1(InterfaceC0057w0 interfaceC0057w0, C0028i1 c0028i1, U u2, String str, boolean z) {
        super(interfaceC0057w0, z);
        this.m = interfaceC0057w0;
        this.n = c0028i1;
        this.o = u2;
        this.p = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void b(byte[] bArr, byte[] bArr2) {
        int i;
        int i2 = 0;
        byte[] bArr3 = null;
        int i3 = 0;
        int i4 = 0;
        int length = 0;
        int i5 = -894652659;
        byte[] bArr4 = null;
        while (true) {
            int i6 = ((i5 & 16777216) * (i5 | 16777216)) + ((i5 & (-16777217)) * ((~i5) & 16777216));
            int i7 = i5 >>> 8;
            int i8 = (i7 + i6) - (i7 & i6);
            int i9 = (i8 ^ 1458005263) + ((i8 & 1458005263) * 2);
            switch ((i9 - 1434379843) + (((~i9) & 1434379843) * 2)) {
                case -1970406716:
                    int length2 = bArr4.length;
                    int i10 = 0 - i3;
                    int i11 = ~i10;
                    int i12 = ((length2 | i10) - ((602749225 & i11) & length2)) + ((i10 | 602749225) & length2);
                    byte b = bArr3[i12];
                    int length3 = bArr4.length;
                    byte b2 = bArr3[(length3 ^ i11) + ((i10 | length3) * 2) + 1];
                    int i13 = ((byte) 0) - b;
                    bArr3[i12] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i13))))) - ((byte) (b2 ^ i13)));
                    i5 = -34715366;
                    i2 = 0;
                    break;
                case -1882653318:
                    int i14 = (i4 - 1) - (i4 | (-4));
                    byte b3 = bArr3[i14];
                    int i15 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i16 = i4 + 3 + (((-1) - i4) | (-3));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int i19 = ~((i15 | (1169991170 | (~i18))) - ((i18 & 1169991170) | i15));
                    int iA = K.a(689061172 & i4, i4, 1, 689061173 & i4);
                    int i20 = bArr3[iA] & 255;
                    int i21 = ((~i19) & (i20 * ((~i20) & 256))) + i19;
                    int i22 = (i21 - 1) - ((~(bArr3[i4] & 255)) | i21);
                    byte b4 = bArr4[i14];
                    int i23 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i24 = bArr4[i16] & 255;
                    int i25 = i24 * ((~i24) & 65536);
                    int i26 = ~((i23 | ((~i25) | (-445685625))) - ((i25 & (-445685625)) | i23));
                    int i27 = bArr4[iA] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = (i28 + i26) - (i28 & i26);
                    int i30 = bArr4[i4] & 255;
                    int i31 = (i29 & (~i30)) + i30;
                    int i32 = i22 << ((i22 > Double.NaN ? 1 : (i22 == Double.NaN ? 0 : -1)) >>> 31);
                    int i33 = (i32 + i31) - ((i32 & i31) * 2);
                    int i34 = 659933421 - ((i33 & 2) | ((-1983400303) - i33));
                    bArr4[i4] = (byte) i34;
                    bArr4[iA] = (byte) (i34 >>> 8);
                    bArr4[i16] = (byte) (i34 >>> 16);
                    bArr4[i14] = (byte) (i34 >>> 24);
                    i4 = (i4 ^ 4) + ((i4 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i35 = ((i4 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i4 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31) & 1;
                    i5 = i35 != 0 ? 196573321 : 145880015;
                    if (i35 != 0) {
                        i5 = -826922365;
                    }
                    i2 = 0;
                    break;
                case -625567707:
                    break;
                case 172635213:
                    int length6 = bArr4.length;
                    int i36 = 0 - length;
                    i5 = ((((double) ((byte) bArr3[(length6 ^ i36) + ((length6 & i36) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i36) + ((length6 & i36) * 2)])) == Double.NaN ? 0 : -1)) <= -1 ? i2 : 1) != 0 ? -34715366 : 196573321;
                    i3 = length;
                    break;
                case 614184219:
                    int length7 = bArr4.length;
                    int i37 = 0 - i3;
                    int i38 = i37 * 3;
                    int iA2 = N.a(i37, -4, 1, length7);
                    int length8 = bArr4.length;
                    byte b5 = bArr4[(length8 ^ i37) + ((length8 & i37) * 2)];
                    int length9 = bArr4.length;
                    int i39 = 0 - i37;
                    byte b6 = bArr3[(((~i39) & length9) * 2) - (length9 ^ i39)];
                    bArr4[L.a(i2, (length7 & 2) | iA2, i38, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
                    length = ((-338014207) | i3) + (338014206 | i3);
                    int i40 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i40 != 0 ? 196573321 : 1298988808;
                    i5 = i40 == 0 ? i : -518432968;
                    break;
                case 835516413:
                    int length10 = bArr.length;
                    int length11 = 0 - (0 - (bArr.length % 4));
                    int i41 = (length10 ^ length11) - (((~length10) & length11) * 2) <= 0 ? i2 : 1;
                    i5 = i41 != 0 ? -826922365 : i41 != 0 ? 196573321 : 145880015;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i4 = i2;
                    break;
                case 1888416065:
                    length = bArr4.length % 4;
                    int i42 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i = i42 != 0 ? 196573321 : 1298988808;
                    if (i42 == 0) {
                    }
                    break;
                default:
                    i5 = 196573321;
                    break;
            }
            return;
        }
    }

    @Override // com.aheaditec.talsec.security.I
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        byte[] bArr = {-118, -11, -64, 0, 92, 89, 14};
        b(bArr, new byte[]{-113, -85, 34, -85, 50, 63, 97, -112});
        Charset charset = StandardCharsets.UTF_8;
        jSONObjectC.put(new String(bArr, charset).intern(), E.a(this.m));
        byte[] bArr2 = {117, 35, -94, -16, -109, -97, 30, 7, -34, 105, 64};
        b(bArr2, new byte[]{125, 112, 74, 59, -108, -52, -37, -47, -65, 29, 37});
        jSONObjectC.put(new String(bArr2, charset).intern(), C0033k0.a(this.n.a()));
        byte[] bArr3 = {-89, -43, 74, 57, 46, -117};
        b(bArr3, new byte[]{-96, -125, -99, -4, 69, -8, 52, 7});
        jSONObjectC.put(new String(bArr3, charset).intern(), this.o.a());
        byte[] bArr4 = {45, -52, 21, 69, -17, -119, 35, -24, -36};
        b(bArr4, new byte[]{58, -97, -16, -112, -30, -44, -61, 67, -72});
        jSONObjectC.put(new String(bArr4, charset).intern(), this.m.d());
        byte[] bArr5 = {-42, 78, 116, 13, 20, -53, 36, -3, 101, -48, 65};
        b(bArr5, new byte[]{-63, 28, -87, -65, 4, -124, -62, 53, 10, -94, 44});
        String strIntern = new String(bArr5, charset).intern();
        byte[] bArr6 = {117, -77, -116, 1, -18, -80};
        b(bArr6, new byte[]{-121, -3, 106, -54, -104, -43, 69, 22});
        jSONObjectC.put(strIntern, new String(bArr6, charset).intern());
        byte[] bArr7 = {8, 30, 83, -35, 106, 103, 46, -55, 17, -9, -2, -87, -51};
        b(bArr7, new byte[]{31, 76, -114, 118, 98, 52, -50, 31, 28, -93, 37, 110, -65});
        jSONObjectC.put(new String(bArr7, charset).intern(), this.m.a().f());
        byte[] bArr8 = {20, 93, 124, -68, 70, 107, -36, -32, 72, 48, 81};
        b(bArr8, new byte[]{15, 18, -102, 121, 74, 56, 56, 79, 41, 89, 61});
        jSONObjectC.put(new String(bArr8, charset).intern(), this.m.b());
        return jSONObjectC;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {8, 20, -69, -17, -12, -112, 42, -69, 107, -61, -69, -65, -23, -85, -31, -63};
        b(bArr, new byte[]{-1, 37, 6, 96, 25, -63, -3, 107, 115, -108, 99, 116, -32, -53, 77, 67});
        return sb.append(new String(bArr, StandardCharsets.UTF_8).intern()).append(this.m.a().f()).toString();
    }
}
