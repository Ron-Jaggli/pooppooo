package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class W0 extends AbstractC0034k1 {
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public final List<InterfaceC0061y0> A;
    public final List<InterfaceC0061y0> B;
    public final String z;

    static {
        byte[] bArr = {-22, -83, 76, 64, -36, 99, -29, 40, -55, 93, -100, -39, 86, -77, -108, 45, -128, 101, 36, -117, 36};
        a(bArr, new byte[]{-24, -2, -33, -42, -11, 35, 48, -33, 8, 56, 122, 85, -108, -57, 79, -9, 74, 60, -28, -120, 64});
        Charset charset = StandardCharsets.UTF_8;
        F = new String(bArr, charset).intern();
        byte[] bArr2 = {29, -117, 75, -70};
        a(bArr2, new byte[]{-88, 22, -37, 115, 9, -94, 35, 44});
        E = new String(bArr2, charset).intern();
        byte[] bArr3 = {55, -125, -78, 91};
        a(bArr3, new byte[]{-81, 9, 84, -37, -116, -52, -37, -46});
        D = new String(bArr3, charset).intern();
        byte[] bArr4 = {-74, 49, -106, -109, -11, 124, -19, 113, 65, 43, 34, 63, -43, -74};
        a(bArr4, new byte[]{51, 113, 107, -97, -3, 15, 49, -96, -73, 125, -28, -50, -89, -62});
        C = new String(bArr4, charset).intern();
    }

    public W0(InterfaceC0057w0 interfaceC0057w0, C0028i1 c0028i1, String str, List<InterfaceC0061y0> list, List<InterfaceC0061y0> list2, U u, String str2, boolean z) {
        super(interfaceC0057w0, c0028i1, u, str2, z);
        this.z = str;
        this.A = list;
        this.B = list2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = null;
        int i2 = -1003175592;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
            int i6 = i2 >>> 8;
            int i7 = ~((((~i6) | (-1095531540)) | i5) - ((i6 & (-1095531540)) | i5));
            int i8 = (-1171264002) - ((i7 & 2) | ((-130029571) - i7));
            switch ((-1109882652) ^ ((~i8) + ((i8 | 1) * 2))) {
                case -1922532006:
                    int length2 = bArr4.length;
                    int i9 = 0 - length;
                    i2 = (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i9, -4, 1, length2), i9 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i9, -4, 1, length2), i9 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                    i3 = length;
                    break;
                case -1486048729:
                    int length3 = bArr.length;
                    int length4 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                    i2 = z ? z ? -1515449616 : 935800592 : -10521562;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i4 = 0;
                    break;
                case -497756741:
                    int length5 = bArr4.length;
                    int i10 = 0 - i3;
                    int i11 = ((length5 | i10) * 2) - (length5 ^ i10);
                    byte b = bArr3[i11];
                    int length6 = bArr4.length;
                    byte b2 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                    bArr3[i11] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                    i2 = 935800592;
                    break;
                case 256719606:
                    int i12 = (i4 - 1) - (i4 | (-4));
                    byte b3 = bArr3[i12];
                    int i13 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i14 = i4 + 2;
                    int i15 = i14 - (i4 & 2);
                    int i16 = bArr3[i15] & 255;
                    int i17 = i16 * ((~i16) & 65536);
                    int iA = J.a(i17, i13, 1, ((-1) - i17) | ((-1) - i13));
                    int i18 = i14 + (((-1) - i4) | (-2));
                    int i19 = bArr3[i18] & 255;
                    int i20 = i19 * ((~i19) & 256);
                    int i21 = (i20 - 1) - ((~iA) | i20);
                    int i22 = bArr3[i4] & 255;
                    int i23 = ~((i22 | ((~i21) | (-755325340))) - ((i21 & (-755325340)) | i22));
                    byte b4 = bArr4[i12];
                    int i24 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i25 = bArr4[i15] & 255;
                    int i26 = i25 * ((~i25) & 65536);
                    int i27 = bArr4[i18] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = bArr4[i4] & 255;
                    int i30 = i23 << ((i23 > Double.NaN ? 1 : (i23 == Double.NaN ? 0 : -1)) >>> 31);
                    int i31 = (-659933419) - ((i24 & 2) | (1983400305 - i24));
                    int i32 = (i31 ^ (~i26)) + ((i31 | i26) * 2) + 1;
                    int i33 = (i32 ^ i29) + ((i32 & i29) * 2);
                    int i34 = ((i33 | i28) - (((-2109111237) & (~i28)) & i33)) + ((i28 | (-2109111237)) & i33);
                    int iA2 = y1.a(i30 | i34, 2, i30, i34);
                    bArr4[i4] = (byte) iA2;
                    bArr4[i18] = (byte) (iA2 >>> 8);
                    bArr4[i15] = (byte) (iA2 >>> 16);
                    bArr4[i12] = (byte) (iA2 >>> 24);
                    i4 = (i4 ^ 4) + ((i4 & 4) * 2);
                    int length7 = bArr4.length;
                    int length8 = 0 - (bArr4.length % 4);
                    int i35 = ((i4 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i4 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                    i2 = i35 != 0 ? -1515449616 : 935800592;
                    if (i35 == 0) {
                        i2 = -10521562;
                    }
                    break;
                case 1429728656:
                    length = bArr4.length % 4;
                    int i36 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i = i36 != 0 ? -1216566512 : 935800592;
                    i2 = i36 == 0 ? -1058029970 : i;
                    break;
                case 1870596681:
                    break;
                case 1879000533:
                    int length9 = bArr4.length;
                    int i37 = 0 - i3;
                    int i38 = 0 - i37;
                    int i39 = i38 | length9;
                    int i40 = (length9 ^ i38) ^ i39;
                    int i41 = i38 * 2;
                    int length10 = bArr4.length;
                    byte b5 = bArr4[(i38 ^ length10) - (((~length10) & i38) * 2)];
                    int length11 = bArr4.length;
                    byte b6 = bArr3[((i37 | length11) * 2) - (length11 ^ i37)];
                    bArr4[(i39 - i41) + i40] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
                    length = (~i3) + (i3 * 2);
                    int i42 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i42 != 0 ? -1216566512 : 935800592;
                    if (i42 == 0) {
                    }
                    break;
                default:
                    i2 = 935800592;
                    break;
            }
            return;
        }
    }

    @Override // com.aheaditec.talsec.security.AbstractC0034k1, com.aheaditec.talsec.security.I
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        if (this.A.isEmpty() && this.B.isEmpty()) {
            byte[] bArr = {-123, 10, -94, -126, 78, -52, 106, -31, -21, 77, 92, -21, 126, -123, -98, 26, -51, 46, -121, -19};
            a(bArr, new byte[]{107, -103, 119, -59, -109, -53, -69, 54, -30, 94, -96, 57, 2, 26, 126, 93, 59, 111, -106, 33});
            throw new JSONException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        JSONObject jSONObjectE = e();
        byte[] bArr2 = {-47, -60, -22, 106, -42, -28, -88, -97, 67, 62, 107, 83, 118, 95};
        a(bArr2, new byte[]{28, -36, 63, -92, 30, -73, 116, 118, -75, 78, -83, -38, 4, 43});
        jSONObjectC.put(new String(bArr2, StandardCharsets.UTF_8).intern(), jSONObjectE);
        return jSONObjectC;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!this.A.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (InterfaceC0061y0 interfaceC0061y0 : this.A) {
                if (interfaceC0061y0 != null) {
                    interfaceC0061y0.a(jSONObject2);
                }
            }
            byte[] bArr = {-63, -120, 109, -45};
            a(bArr, new byte[]{12, 24, -71, 90, 52, 72, 66, -41});
            jSONObject.put(new String(bArr, StandardCharsets.UTF_8).intern(), jSONObject2);
        }
        if (!this.B.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            for (InterfaceC0061y0 interfaceC0061y02 : this.B) {
                if (interfaceC0061y02 != null) {
                    interfaceC0061y02.a(jSONObject3);
                }
            }
            byte[] bArr2 = {87, -40, -87, -104, -88, 15, -57, 91, 86, -14, -94, 69, 71, 12, 121, -2, 96, -106, -69, 98, 91};
            a(bArr2, new byte[]{-99, -96, 122, -113, 57, -113, 93, -22, -97, -84, 96, -63, -123, -98, -93, 7, 106, -21, 95, -96, 63});
            jSONObject.put(new String(bArr2, StandardCharsets.UTF_8).intern(), jSONObject3);
        }
        byte[] bArr3 = {16, 83, -14, 0};
        a(bArr3, new byte[]{-64, 57, 20, 6, -43, 126, -106, -20});
        jSONObject.put(new String(bArr3, StandardCharsets.UTF_8).intern(), this.z);
        return jSONObject;
    }
}
