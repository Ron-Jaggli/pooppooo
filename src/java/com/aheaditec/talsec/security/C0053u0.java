package com.aheaditec.talsec.security;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0053u0 extends C0022g1 implements InterfaceC0051t0 {
    public static final String e;
    public static final String[] f;

    static {
        byte[] bArr = {-36, -29, 48, 35, 107, 33, -37, 40, -110, 119, 124, 71, 95, -71, -87, -44, -127, -2, -87, -12, 94, 54, 93, -62, -113, 90, 88, -82, -106, 49, -117, -90, -38, -108, -14, -34, -95, -38, 73, 17, -75, -75, -26, 53};
        b(bArr, new byte[]{-63, -103, -32, -19, 102, 88, 20, -57, 69, 47, -85, -5, 71, -58, 89, 15, 85, -85, 89, 48, 116, 116, -117, 103, 6, 0, -117, 37, 77, 52, -115, 94, 7, -15, 28, 20, 0, -121, -45, 66, 58, -47, 96, -91});
        Charset charset = StandardCharsets.UTF_8;
        e = new String(bArr, charset).intern();
        byte[] bArr2 = {64, 96, 42, -28};
        b(bArr2, new byte[]{-121, 34, -15, 119, -53, 20, 109, -113});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-128, -56, -30, 43};
        b(bArr3, new byte[]{103, -39, 57, -65, 64, -127, 35, 70});
        String strIntern2 = new String(bArr3, charset).intern();
        byte[] bArr4 = {49, 117, -50, 93};
        b(bArr4, new byte[]{-74, 45, 45, -15, 33, -38, -33, -98});
        String strIntern3 = new String(bArr4, charset).intern();
        byte[] bArr5 = {-23, 94, -53, -116};
        b(bArr5, new byte[]{-50, 3, 80, -34, -128, -71, -107, 1});
        String strIntern4 = new String(bArr5, charset).intern();
        byte[] bArr6 = {21, 23, 24, 32};
        b(bArr6, new byte[]{-38, 107, -57, -77, -68, 30, -59, -123});
        String strIntern5 = new String(bArr6, charset).intern();
        byte[] bArr7 = {20, -93, -104, -62};
        b(bArr7, new byte[]{-5, -1, 71, 20, 98, 66, 20, -53});
        String strIntern6 = new String(bArr7, charset).intern();
        byte[] bArr8 = {109, -10, -78, -117};
        b(bArr8, new byte[]{114, -85, 105, -33, 98, 100, -123, -46});
        String strIntern7 = new String(bArr8, charset).intern();
        byte[] bArr9 = {-37, -46, -78, -118};
        b(bArr9, new byte[]{60, -113, 105, -36, 76, -29, -98, -80});
        String strIntern8 = new String(bArr9, charset).intern();
        byte[] bArr10 = {74, -103, 42, -3};
        b(bArr10, new byte[]{-83, -55, -47, 110, 25, -29, 94, -13});
        String strIntern9 = new String(bArr10, charset).intern();
        byte[] bArr11 = {47, 114, -97, 82};
        b(bArr11, new byte[]{-80, 48, 124, -121, -53, -72, 9, 52});
        String strIntern10 = new String(bArr11, charset).intern();
        byte[] bArr12 = {15, -5, -80, -45};
        b(bArr12, new byte[]{-16, -121, 79, 4, -57, -109, -100, -66});
        String strIntern11 = new String(bArr12, charset).intern();
        byte[] bArr13 = {100, -79, 35, -38};
        b(bArr13, new byte[]{107, -48, -8, 14, -123, 104, -66, -86});
        String strIntern12 = new String(bArr13, charset).intern();
        byte[] bArr14 = {126, 37, 49, 2};
        b(bArr14, new byte[]{97, 92, -50, 86, -56, 0, 88, -57});
        String strIntern13 = new String(bArr14, charset).intern();
        byte[] bArr15 = {109, -111, -99, 114};
        b(bArr15, new byte[]{114, 16, 66, -25, -113, -52, -111, 35});
        String strIntern14 = new String(bArr15, charset).intern();
        byte[] bArr16 = {4, 86, 17, -97};
        b(bArr16, new byte[]{-21, 44, -50, 51, -24, -44, 14, 101});
        String strIntern15 = new String(bArr16, charset).intern();
        byte[] bArr17 = {4, -98, 86, 55};
        b(bArr17, new byte[]{-53, -60, -123, -85, 7, -93, 49, -49});
        String strIntern16 = new String(bArr17, charset).intern();
        byte[] bArr18 = {95, 120, 27, -20};
        b(bArr18, new byte[]{64, 41, -64, 124, 127, 29, 84, -89});
        String strIntern17 = new String(bArr18, charset).intern();
        byte[] bArr19 = {-79, -113, -91, -63};
        b(bArr19, new byte[]{22, 50, 90, 22, -4, 39, -105, -23});
        String strIntern18 = new String(bArr19, charset).intern();
        byte[] bArr20 = {52, -113, -112, 116};
        b(bArr20, new byte[]{-69, 19, 111, -28, -86, 78, -74, 45});
        String strIntern19 = new String(bArr20, charset).intern();
        byte[] bArr21 = {-125, -97, 44, -47};
        b(bArr21, new byte[]{100, -30, -13, 0, 5, 15, 92, 107});
        String strIntern20 = new String(bArr21, charset).intern();
        byte[] bArr22 = {-74, -41, 62, -43};
        b(bArr22, new byte[]{57, -118, -35, 4, -48, 96, -75, 25});
        String strIntern21 = new String(bArr22, charset).intern();
        byte[] bArr23 = {102, 91, -52, -78};
        b(bArr23, new byte[]{73, 6, 83, 38, 29, 103, -3, 69});
        String strIntern22 = new String(bArr23, charset).intern();
        byte[] bArr24 = {-79, -118, 27, -56};
        b(bArr24, new byte[]{54, 23, -64, 25, -16, 100, -2, 121});
        String strIntern23 = new String(bArr24, charset).intern();
        byte[] bArr25 = {126, 25, 77, -88};
        b(bArr25, new byte[]{97, 104, -14, 57, -97, 94, 7, -106});
        String strIntern24 = new String(bArr25, charset).intern();
        byte[] bArr26 = {26, 50, -33, -55};
        b(bArr26, new byte[]{-35, 80, 28, 31, 118, -63, 5, 9});
        String strIntern25 = new String(bArr26, charset).intern();
        byte[] bArr27 = {86, -37, 1, -110};
        b(bArr27, new byte[]{-71, -121, 62, -57, 112, -18, 58, 18});
        String strIntern26 = new String(bArr27, charset).intern();
        byte[] bArr28 = {-32, -93, -112, 59};
        b(bArr28, new byte[]{-57, -34, 79, -83, -128, 123, 104, -122});
        String strIntern27 = new String(bArr28, charset).intern();
        byte[] bArr29 = {25, -7, 110, -66};
        b(bArr29, new byte[]{-34, -119, -115, 20, -65, -6, -75, 32});
        String strIntern28 = new String(bArr29, charset).intern();
        byte[] bArr30 = {54, 106, -118, -89};
        b(bArr30, new byte[]{-103, 56, -111, 61, -33, -112, -116, 2});
        String strIntern29 = new String(bArr30, charset).intern();
        byte[] bArr31 = {61, -77, 36, 88};
        b(bArr31, new byte[]{-126, -17, -5, -114, -29, -60, 99, -49});
        String strIntern30 = new String(bArr31, charset).intern();
        byte[] bArr32 = {-21, 99, -42, 117};
        b(bArr32, new byte[]{-52, 30, 37, -20, 52, 5, -11, -74});
        String strIntern31 = new String(bArr32, charset).intern();
        byte[] bArr33 = {-20, 67, -98, 93};
        b(bArr33, new byte[]{-13, 94, 93, -12, 57, 109, 64, 33});
        String strIntern32 = new String(bArr33, charset).intern();
        byte[] bArr34 = {-47, -3, 118, -80};
        b(bArr34, new byte[]{54, -124, -91, 38, -6, -16, -17, -40});
        String strIntern33 = new String(bArr34, charset).intern();
        byte[] bArr35 = {20, -59, 85, 74};
        b(bArr35, new byte[]{-37, -3, -118, -104, 21, 13, 122, 118});
        String strIntern34 = new String(bArr35, charset).intern();
        byte[] bArr36 = {-46, -9, 63, -124};
        b(bArr36, new byte[]{53, -86, -4, -46, 98, 43, 51, -123});
        String strIntern35 = new String(bArr36, charset).intern();
        byte[] bArr37 = {-98, -103, 68, -115};
        b(bArr37, new byte[]{1, -56, -5, -37, 35, 112, 77, -123});
        f = new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, strIntern7, strIntern8, strIntern9, strIntern10, strIntern11, strIntern12, strIntern13, strIntern14, strIntern15, strIntern16, strIntern17, strIntern18, strIntern19, strIntern20, strIntern21, strIntern22, strIntern23, strIntern24, strIntern25, strIntern26, strIntern27, strIntern28, strIntern29, strIntern30, strIntern31, strIntern32, strIntern33, strIntern34, strIntern35, new String(bArr37, charset).intern()};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0053u0(Context context) {
        byte[] bArr = {-12, -60, -95, -85, 70, -113, -120, 32, 77, 25, 33, -63, -27, -1, -53, 126, 89, -115, 4, 84, 105, -46, -36, 39, 46, 37, 15, 42, -20, 17, -74, 20, -25, -27, 119, -65, -43, 92, -6, 4, 84, -77, -40, -5};
        b(bArr, new byte[]{-39, -6, 81, 102, -125, 43, -93, -50, -126, 76, -42, 113, -51, -116, 127, -39, -115, 61, 52, -47, 123, -112, 10, -55, -25, 90, -64, -71, -25, -44, 87, 33, -14, -96, -111, 116, 60, 5, 4, 86, -101, -46, 114, 99});
        super(context, new String(bArr, StandardCharsets.UTF_8).intern(), f);
    }

    public static String d(String str) {
        try {
            byte[] bArr = {50, -48, -82, 13, -66, 93, 48};
            b(bArr, new byte[]{-123, -11, 97, 93, -116, 104, 6, 67});
            return Base64.encodeToString(MessageDigest.getInstance(new String(bArr, StandardCharsets.UTF_8).intern()).digest(str.getBytes(Charsets.UTF_8)), 2);
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // com.aheaditec.talsec.security.C0022g1
    public void a() {
        super.a();
    }

    @Override // com.aheaditec.talsec.security.C0022g1
    public boolean b(String str) {
        return a(str) != null;
    }

    @Override // com.aheaditec.talsec.security.C0022g1
    public void c(String str) {
        super.c(str);
    }

    public C0053u0(Context context, String str, String[] strArr) {
        super(context, str, strArr);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    public static void b(byte[] bArr, byte[] bArr2) {
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

    @Override // com.aheaditec.talsec.security.C0022g1, com.aheaditec.talsec.security.InterfaceC0051t0
    public String a(String str) {
        String strD = d(str);
        return this.a.contains(strD) ? this.a.getString(strD, null) : this.a.getString(str, null);
    }

    @Override // com.aheaditec.talsec.security.C0022g1, com.aheaditec.talsec.security.InterfaceC0051t0
    public void a(String str, String str2) {
        super.a(d(str), str2);
    }
}
