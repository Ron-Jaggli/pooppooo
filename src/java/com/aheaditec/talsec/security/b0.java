package com.aheaditec.talsec.security;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class B0 extends C0053u0 {
    public static final String i;
    public static final String j;
    public final String g;
    public final Q h;

    static {
        byte[] bArr = {64, -14, -13, -58, -73};
        c(bArr, new byte[]{15, -50, 124, -70, -60, -33, -34, 59});
        Charset charset = StandardCharsets.UTF_8;
        j = new String(bArr, charset).intern();
        byte[] bArr2 = {-29, 80, 121, -117, -41, 4, 101, -12, 42, 9};
        c(bArr2, new byte[]{115, 110, -12, 23, -97, -102, -16, -87, 99, 109});
        i = new String(bArr2, charset).intern();
    }

    public B0(Context context) {
        super(context);
        byte[] bArr = {42, 7, 76, 53, 121, -60, -120, 14, 99, 22};
        c(bArr, new byte[]{44, -103, 41, 90, 1, -38, -43, -124, 42, 114});
        Charset charset = StandardCharsets.UTF_8;
        String strA = a(new String(bArr, charset).intern());
        if (strA == null) {
            String string = UUID.randomUUID().toString();
            this.g = string;
            byte[] bArr2 = {-124, 105, 63, -79, 50, 23, 23, -64, -123, 105};
            c(bArr2, new byte[]{-42, 55, 54, -34, 60, -87, 94, -66, -52, 13});
            a(new String(bArr2, charset).intern(), string);
        } else {
            this.g = strA;
        }
        this.h = new Q(context);
    }

    public void a(byte[] bArr) {
        byte[] bArr2 = {-34, -98, -112, 18, 42};
        c(bArr2, new byte[]{-95, 34, -36, -114, 89, -41, -4, -103});
        a(new String(bArr2, StandardCharsets.UTF_8).intern(), Base64.encodeToString(bArr, 2));
    }

    public String b() {
        return this.h.a();
    }

    public String c() {
        return this.g;
    }

    public byte[] d() {
        byte[] bArr = {120, -5, -13, -14, 4};
        c(bArr, new byte[]{7, -57, 124, -82, 119, 15, -33, -118});
        Charset charset = StandardCharsets.UTF_8;
        if (!b(new String(bArr, charset).intern())) {
            return new byte[2];
        }
        byte[] bArr2 = {35, 91, -16, -102, 113};
        c(bArr2, new byte[]{46, 103, 123, 22, 2, -13, -111, -109});
        return Base64.decode(a(new String(bArr2, charset).intern()), 2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    public static void c(byte[] bArr, byte[] bArr2) {
        int i2;
        int i3 = 0;
        byte[] bArr3 = null;
        int length = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1180709023;
        byte[] bArr4 = null;
        while (true) {
            int i7 = ((i6 & 16777216) * (i6 | 16777216)) + ((i6 & (-16777217)) * ((~i6) & 16777216));
            int i8 = i6 >>> 8;
            int iA = J.a(i8, i7, 1, ((-1) - i8) | ((-1) - i7));
            int i9 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
            switch ((i9 - 814310662) - ((i9 & (-814310662)) * 2)) {
                case -2000520841:
                    int length2 = bArr4.length;
                    int i10 = 0 - (0 - length);
                    int i11 = (((double) ((byte) bArr3[((length2 & (~i10)) * 2) - (length2 ^ i10)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i10)) * 2) - (length2 ^ i10)])) == Double.NaN ? 0 : -1)) <= -1 ? 0 : 1;
                    i6 = i11 != 0 ? i11 != 0 ? 1565752577 : 1621215041 : -1164716566;
                    i5 = length;
                    i3 = 0;
                    break;
                case -870579640:
                    int i12 = (i4 - 1) - (i4 | (-4));
                    byte b = bArr3[i12];
                    int i13 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
                    int i14 = i4 + 3 + (((-1) - i4) | (-3));
                    int i15 = bArr3[i14] & 255;
                    int i16 = i15 * ((~i15) & 65536);
                    int i17 = ~((((-1268032266) | (~i16)) | i13) - ((i16 & (-1268032266)) | i13));
                    int iA2 = K.a((-132004404) & i4, i4, 1, (-132004403) & i4);
                    int i18 = bArr3[iA2] & 255;
                    int i19 = i18 * ((~i18) & 256);
                    int i20 = (i19 + i17) - (i19 & i17);
                    int i21 = bArr3[i4] & 255;
                    int i22 = (i20 & (~i21)) + i21;
                    byte b2 = bArr4[i12];
                    int i23 = ((b2 & 16777216) * (b2 | 16777216)) + (((-16777217) & b2) * ((~b2) & 16777216));
                    int i24 = bArr4[i14] & 255;
                    int i25 = i24 * ((~i24) & 65536);
                    int i26 = ~((i23 | ((~i25) | (-1355861741))) - ((i25 & (-1355861741)) | i23));
                    int i27 = bArr4[iA2] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int iA3 = J.a(i28, i26, 1, ((-1) - i28) | ((-1) - i26));
                    int i29 = (iA3 - 1) - ((~(bArr4[i4] & 255)) | iA3);
                    int i30 = i22 << ((i22 > Double.NaN ? 1 : (i22 == Double.NaN ? 0 : -1)) >>> 31);
                    int i31 = (i30 ^ (-418000873)) + ((i30 & (-418000873)) * 2);
                    int i32 = (i31 + i29) - ((i31 & i29) * 2);
                    bArr4[i4] = (byte) i32;
                    bArr4[iA2] = (byte) (i32 >>> 8);
                    bArr4[i14] = (byte) (i32 >>> 16);
                    bArr4[i12] = (byte) (i32 >>> 24);
                    i4 = (i4 ^ 4) + ((i4 & 4) * 2);
                    int length3 = bArr4.length;
                    int iA4 = C0001a.a(bArr4.length, 4, 0, 0);
                    if ((((i4 > (((length3 & (~iA4)) * 2) - (length3 ^ iA4)) ? 1 : (i4 == (((length3 & (~iA4)) * 2) - (length3 ^ iA4)) ? 0 : -1)) >>> 31) & 1) == 0) {
                        i3 = 0;
                        i6 = 1621215041;
                    } else {
                        i6 = 1910359311;
                        i3 = 0;
                    }
                    break;
                case -97532338:
                    length = bArr4.length % 4;
                    int i33 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i2 = i33 != 0 ? 986083301 : 1621215041;
                    i6 = i33 == 0 ? -1138188205 : i2;
                    break;
                case 298177592:
                    int length4 = bArr4.length;
                    int i34 = 0 - i5;
                    int iA5 = L.a(i3, (length4 & 2) | N.a(i34, -4, 1, length4), i34 * 3, 1);
                    byte b3 = bArr3[iA5];
                    int length5 = bArr4.length;
                    int i35 = 0 - i34;
                    int i36 = i35 | length5;
                    byte b4 = bArr3[O.a(i35, 2, i36, (length5 ^ i35) ^ i36)];
                    bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                    i6 = 1565752577;
                    break;
                case 373627814:
                    break;
                case 975213712:
                    int length6 = bArr4.length;
                    int i37 = 0 - i5;
                    int length7 = bArr4.length;
                    int i38 = ~i37;
                    byte b5 = bArr4[((length7 | i37) - (((-656070458) & i38) & length7)) + (((-656070458) | i37) & length7)];
                    int length8 = bArr4.length;
                    byte b6 = bArr3[(length8 ^ i38) + ((length8 | i37) * 2) + 1];
                    bArr4[((length6 | i37) * 2) - (length6 ^ i37)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = (~i5) + (i5 * 2);
                    int i39 = ((i5 > 2 ? 1 : (i5 == 2 ? 0 : -1)) >>> 31) & 1;
                    i2 = i39 != 0 ? 986083301 : 1621215041;
                    if (i39 == 0) {
                    }
                    break;
                case 1548321255:
                    int length9 = bArr.length;
                    int length10 = 0 - (0 - (bArr.length % 4));
                    i6 = ((length9 & (~length10)) - ((~length9) & length10) <= 0 ? i3 : 1) != 0 ? 1910359311 : 1621215041;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i4 = i3;
                    break;
                default:
                    i6 = 1621215041;
                    break;
            }
            return;
        }
    }
}
