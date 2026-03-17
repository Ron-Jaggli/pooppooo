package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class P {
    public static final Integer A;
    public static final Integer B;
    public static final Integer C;
    public static final Integer D;
    public static final Integer E;
    public static final Integer F;
    public static final Integer G;
    public static final boolean a = false;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final boolean f = true;
    public static final boolean g = true;
    public static final boolean h = true;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 0;
    public static final int l = 3;
    public static final boolean m = false;
    public static final boolean n = false;
    public static final String o;
    public static final String p;
    public static final Integer q;
    public static final Integer r;
    public static final Integer s;
    public static final Integer t;
    public static final Integer u;
    public static final Integer v;
    public static final Integer w;
    public static final Integer x;
    public static final Integer y;
    public static final Integer z;

    static {
        byte[] bArr = {-56, -24, 113, 126, 60, -33};
        a(bArr, new byte[]{16, -80, 117, 53, 18, -17, 117, -5});
        Charset charset = StandardCharsets.UTF_8;
        p = new String(bArr, charset).intern();
        byte[] bArr2 = {86, -29, -40, -48, -71, 44};
        a(bArr2, new byte[]{47, 82, -62, -96, -49, 73, -24, -5});
        o = new String(bArr2, charset).intern();
        byte[] bArr3 = {105, 48, -125, 99};
        a(bArr3, new byte[]{30, 21, 5, -9, -128, 127, -41, -3});
        e = new String(bArr3, charset).intern();
        byte[] bArr4 = {36, 20, 124, -48, -72};
        a(bArr4, new byte[]{93, 69, 37, -96, -37, 40, 38, 2});
        d = new String(bArr4, charset).intern();
        byte[] bArr5 = {1, 10, -106, 35, -30, -33, -58};
        a(bArr5, new byte[]{-118, 63, 16, 46, -125, -84, -93, 24});
        c = new String(bArr5, charset).intern();
        byte[] bArr6 = {84, 127, 4, 89, 23, 90, -50, -104, 109, -5, -68, -58, 32, -43, 30, -34, -46, -5, -108, -15, 80, 22, -37, -75, -83, -84, 17, -127, 94};
        a(bArr6, new byte[]{78, -32, 126, 94, -115, 2, -63, -32, 32, 98, -34, -118, 90, -53, -128, -90, -43, 88, 7, 122, 38, 53, -44, -67, -17, -82, -114, -36, 39});
        b = new String(bArr6, charset).intern();
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i2;
        int i3;
        int i4 = 0;
        byte[] bArr3 = null;
        int i5 = 0;
        int i6 = 0;
        int length = 0;
        int i7 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i8 = ((i7 & 16777216) * (i7 | 16777216)) + ((i7 & (-16777217)) * ((~i7) & 16777216));
            int i9 = i7 >>> 8;
            int iA = K.a(650911840 & (~i8) & i9, i9, i8, (i8 | 650911840) & i9);
            int i10 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i10) + ((i10 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i11 = 0 - i5;
                    int i12 = (length2 ^ i11) + ((length2 & i11) * 2);
                    byte b2 = bArr3[i12];
                    int length3 = bArr4.length;
                    int i13 = 0 - i11;
                    int i14 = i13 | length3;
                    byte b3 = bArr3[O.a(i13, 2, i14, (length3 ^ i13) ^ i14)];
                    bArr3[i12] = (byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - ((byte) (b3 ^ b2)));
                    i4 = 0;
                    i7 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    if ((((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i4 = 0;
                        i7 = -365117735;
                    } else {
                        i7 = -458924450;
                        i4 = 0;
                    }
                    break;
                case -1399959314:
                    int iA2 = K.a((-1205100636) & i6, i6, 3, (-1205100633) & i6);
                    byte b4 = bArr3[iA2];
                    int i15 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i16 = i6 - 1;
                    int i17 = i16 - (i6 | (-3));
                    int i18 = bArr3[i17] & 255;
                    int i19 = i18 * ((~i18) & 65536);
                    int iA3 = J.a(i19, i15, 1, ((-1) - i19) | ((-1) - i15));
                    int i20 = i16 - (i6 | (-2));
                    int i21 = bArr3[i20] & 255;
                    int i22 = i21 * ((~i21) & 256);
                    int i23 = (i22 - 1) - ((~iA3) | i22);
                    int i24 = bArr3[i6] & 255;
                    int iA4 = J.a(i23, i24, 1, ((-1) - i23) | ((-1) - i24));
                    byte b5 = bArr4[iA2];
                    int i25 = ((16777216 & b5) * (b5 | 16777216)) + (((-16777217) & b5) * ((~b5) & 16777216));
                    int i26 = bArr4[i17] & 255;
                    int i27 = ((i26 * ((~i26) & 65536)) & (~i25)) + i25;
                    int i28 = bArr4[i20] & 255;
                    int i29 = i28 * ((~i28) & 256);
                    int i30 = ~((((~i29) | 911399251) | i27) - ((i29 & 911399251) | i27));
                    int i31 = bArr4[i6] & 255;
                    int i32 = ~((((~i30) | 1433568692) | i31) - ((i30 & 1433568692) | i31));
                    int i33 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i34 = (-1254002618) - ((i33 & 2) | ((-1672003491) - i33));
                    int i35 = (i34 + i32) - ((i34 & i32) * 2);
                    bArr4[i6] = (byte) i35;
                    bArr4[i20] = (byte) (i35 >>> 8);
                    bArr4[i17] = (byte) (i35 >>> 16);
                    bArr4[iA2] = (byte) (i35 >>> 24);
                    i6 = (i6 ^ 4) + ((i6 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i36 = ((i6 > L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i6 == L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    int i37 = i36 != 0 ? -1605440657 : -365117735;
                    if (i36 == 0) {
                        i7 = -169475207;
                        i4 = 0;
                    } else {
                        i7 = i37;
                        i2 = 0;
                        i4 = i2;
                    }
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    i3 = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 <= 0 ? i4 : 1;
                    i7 = i3 != 0 ? i3 != 0 ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i6 = i4;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i38 = 0 - i5;
                    int i39 = 0 - i38;
                    int i40 = ((~length8) & i39) * 2;
                    int length9 = bArr4.length;
                    byte b6 = bArr4[((length9 | i38) * 2) - (length9 ^ i38)];
                    int length10 = bArr4.length;
                    byte b7 = bArr3[(i38 ^ length10) + ((length10 & i38) * 2)];
                    bArr4[(length8 ^ i39) - i40] = (byte) (((byte) (b7 - b6)) + ((byte) (((byte) 2) * ((byte) ((~b7) & b6)))));
                    length = M.a(i5, 3, (~i5) * 2, 1);
                    if ((((i5 > 2 ? 1 : (i5 == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i7 = -365117735;
                    } else {
                        i7 = -458924450;
                        i4 = 0;
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i41 = 0 - length;
                    i3 = (((double) ((byte) bArr3[((length11 | i41) - ((165327505 & (~i41)) & length11)) + ((i41 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i41) - ((165327505 & (~i41)) & length11)) + ((i41 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) <= -1 ? i4 : 1;
                    i7 = i3 != 0 ? -746753280 : i3 != 0 ? -365117735 : 1093626513;
                    i5 = length;
                    break;
                default:
                    i2 = i4;
                    i7 = -365117735;
                    i4 = i2;
                    break;
            }
            return;
        }
    }
}
