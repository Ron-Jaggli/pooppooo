package com.aheaditec.talsec.security;

import android.content.Context;
import com.aheaditec.talsec.security.AbstractC0017f;
import com.aheaditec.talsec_security.security.Natives;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.collections.ArraysKt;
import kotlin.random.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class A0 extends AbstractC0032k {
    public static final String r;
    public static final String s;
    public final F q;

    static {
        byte[] bArr = {-85, 90, 103, -21, -27, 75, -88, 66, 115, -99, 124, -111, 123, -86, 39, -128, -125, 125, -36, 104};
        c(bArr, new byte[]{-79, 101, -12, -35, 118, 110, -77, 78, -1, 35, 61, 9, -12, 9, 53, -6, -38, 70, -93, 53});
        Charset charset = StandardCharsets.UTF_8;
        s = new String(bArr, charset).intern();
        byte[] bArr2 = {22, -56, 106, 10, -58, 21, 26, -66, -25, 71, -73, -111, -13, -122, 53, -21, 80, 71, -46};
        c(bArr2, new byte[]{94, -41, -15, 60, -112, -85, 104, -27, 113, 94, -67, -40, 110, 19, 70, -88, 57, 41, -75});
        r = new String(bArr2, charset).intern();
    }

    public A0(R0 r0, u1 u1Var, E1 e1, F f) {
        super(r0, u1Var, e1);
        this.q = f;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        c(context);
    }

    @Override // com.aheaditec.talsec.security.AbstractC0032k, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean b() {
        return true;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0032k, com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        this.m.a().f();
        return false;
    }

    public final boolean d(String str) {
        if (str == null) {
            byte[] bArr = {60, -47, -8};
            c(bArr, new byte[]{93, -75, -102, -44, 41, 85, 114, -117});
            str = new String(bArr, StandardCharsets.UTF_8).intern();
        }
        byte[] bArr2 = {-40, -103, -101, 50, 48, 5, 14, 85, -20, 38, -92, 69, 80, -79, -4, -37, -111, -105, -116};
        c(bArr2, new byte[]{-92, 38, -31, 53, 58, -101, 84, 64, 108, 127, -86, -124, 15, 4, 125, -40, -8, -7, -21});
        Charset charset = StandardCharsets.UTF_8;
        boolean zStartsWith = str.startsWith(new String(bArr2, charset).intern());
        byte[] bArr3 = {-18, -7, -15, -26, 43, -50, 116, 39, 71, -103, -72, 99, -116, 35, 71, 24, -111, -44, -16, -70};
        c(bArr3, new byte[]{118, -58, -122, -31, 44, -21, -1, 104, 11, 32, -127, 27, -27, -125, 20, -110, -52, -17, 127, -25});
        boolean zStartsWith2 = str.startsWith(new String(bArr3, charset).intern());
        boolean zStartsWith3 = false;
        for (String str2 : this.q.c()) {
            zStartsWith3 |= str.startsWith(str2);
        }
        boolean z = zStartsWith2 || zStartsWith || zStartsWith3;
        if (!z) {
            byte[] bArr4 = {119, 127, -123, -17, 111, 35, -13, 126, 110, -43, 2, 61, -33, -59, -9, -112, 88, -23, -14, -45, -128, -101, 13, 100, -94, -70, -78, 35};
            c(bArr4, new byte[]{-21, 64, -44, -94, -14, 121, 122, 48, -8, -24, 53, 108, -107, -31, -128, 21, 29, -72, 112, -45, -40, 37, 73, 36, -64, -8, -69, 95});
            c(new String(bArr4, StandardCharsets.UTF_8).intern(), str);
        }
        return z;
    }

    public final boolean e() {
        return d(this.q.g());
    }

    public final boolean b(Context context) {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrI = Natives.a.i(context, a(this.q.c(), bFirst, bFirst2), bFirst, bFirst2);
        byte[] bArr = {-40, -21, -6, -33, 52, 113, -110, 96, 38, 86, -34, 2, 45, 20, -61, -108, 30, 115, -75, -124, -52, -104, -68, -107, 34, -120, -71, -35, 116, -13, -80, -28, 120, 112, 69, -12, -42, 10};
        c(bArr, new byte[]{-106, -75, 127, -46, 59, 72, -37, 34, 48, 106, -127, -123, 71, -112, -116, 17, 91, 66, -85, 6, -116, 38, -38, 19, 64, 42, -59, -47, 35, -62, -82, -90, -9, 68, -16, -83, -70, 102});
        Charset charset = StandardCharsets.UTF_8;
        String strF = f(bArrI, bFirst, bFirst2, new String(bArr, charset).intern());
        if (strF == null) {
            return true;
        }
        byte[] bArr2 = {-115, -53, -65, -104, -32, 118, 121, -44, 2, -89, -85, -26, -12, -48, 19, -76, 62, -78, -46, 76, -73, 112, -49, -52, 10, 32, -88, 35, -90, -94, -17, -29, 80, 76};
        c(bArr2, new byte[]{-31, -43, -70, 23, 111, 79, 4, -42, 76, -5, -52, -95, 112, -44, 92, -15, 59, 3, -111, 62, -63, 78, -122, -68, 104, -126, -75, 95, -47, -13, -123, -93, 38, 41});
        c(new String(bArr2, charset).intern(), strF);
        return false;
    }

    public void c(final Context context) {
        super.a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.A0$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.d(context);
            }
        }));
    }

    public final boolean e(String str, String str2) {
        return str.startsWith(str2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    private static void c(byte[] bArr, byte[] bArr2) {
        int i;
        int i2 = 0;
        byte[] bArr3 = null;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1180709023;
        byte[] bArr4 = null;
        while (true) {
            int i6 = ((i5 & 16777216) * (i5 | 16777216)) + ((i5 & (-16777217)) * ((~i5) & 16777216));
            int i7 = i5 >>> 8;
            int iA = J.a(i7, i6, 1, ((-1) - i7) | ((-1) - i6));
            int i8 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
            switch ((i8 - 814310662) - ((i8 & (-814310662)) * 2)) {
                case -2000520841:
                    int length2 = bArr4.length;
                    int i9 = 0 - (0 - length);
                    int i10 = (((double) ((byte) bArr3[((length2 & (~i9)) * 2) - (length2 ^ i9)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i9)) * 2) - (length2 ^ i9)])) == Double.NaN ? 0 : -1)) <= -1 ? 0 : 1;
                    i5 = i10 != 0 ? i10 != 0 ? 1565752577 : 1621215041 : -1164716566;
                    i4 = length;
                    i2 = 0;
                    break;
                case -870579640:
                    int i11 = (i3 - 1) - (i3 | (-4));
                    byte b = bArr3[i11];
                    int i12 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
                    int i13 = i3 + 3 + (((-1) - i3) | (-3));
                    int i14 = bArr3[i13] & 255;
                    int i15 = i14 * ((~i14) & 65536);
                    int i16 = ~((((-1268032266) | (~i15)) | i12) - ((i15 & (-1268032266)) | i12));
                    int iA2 = K.a((-132004404) & i3, i3, 1, (-132004403) & i3);
                    int i17 = bArr3[iA2] & 255;
                    int i18 = i17 * ((~i17) & 256);
                    int i19 = (i18 + i16) - (i18 & i16);
                    int i20 = bArr3[i3] & 255;
                    int i21 = (i19 & (~i20)) + i20;
                    byte b2 = bArr4[i11];
                    int i22 = ((b2 & 16777216) * (b2 | 16777216)) + (((-16777217) & b2) * ((~b2) & 16777216));
                    int i23 = bArr4[i13] & 255;
                    int i24 = i23 * ((~i23) & 65536);
                    int i25 = ~((i22 | ((~i24) | (-1355861741))) - ((i24 & (-1355861741)) | i22));
                    int i26 = bArr4[iA2] & 255;
                    int i27 = i26 * ((~i26) & 256);
                    int iA3 = J.a(i27, i25, 1, ((-1) - i27) | ((-1) - i25));
                    int i28 = (iA3 - 1) - ((~(bArr4[i3] & 255)) | iA3);
                    int i29 = i21 << ((i21 > Double.NaN ? 1 : (i21 == Double.NaN ? 0 : -1)) >>> 31);
                    int i30 = (i29 ^ (-418000873)) + ((i29 & (-418000873)) * 2);
                    int i31 = (i30 + i28) - ((i30 & i28) * 2);
                    bArr4[i3] = (byte) i31;
                    bArr4[iA2] = (byte) (i31 >>> 8);
                    bArr4[i13] = (byte) (i31 >>> 16);
                    bArr4[i11] = (byte) (i31 >>> 24);
                    i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                    int length3 = bArr4.length;
                    int iA4 = C0001a.a(bArr4.length, 4, 0, 0);
                    if ((((i3 > (((length3 & (~iA4)) * 2) - (length3 ^ iA4)) ? 1 : (i3 == (((length3 & (~iA4)) * 2) - (length3 ^ iA4)) ? 0 : -1)) >>> 31) & 1) == 0) {
                        i2 = 0;
                        i5 = 1621215041;
                    } else {
                        i5 = 1910359311;
                        i2 = 0;
                    }
                    break;
                case -97532338:
                    length = bArr4.length % 4;
                    int i32 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i = i32 != 0 ? 986083301 : 1621215041;
                    i5 = i32 == 0 ? -1138188205 : i;
                    break;
                case 298177592:
                    int length4 = bArr4.length;
                    int i33 = 0 - i4;
                    int iA5 = L.a(i2, (length4 & 2) | N.a(i33, -4, 1, length4), i33 * 3, 1);
                    byte b3 = bArr3[iA5];
                    int length5 = bArr4.length;
                    int i34 = 0 - i33;
                    int i35 = i34 | length5;
                    byte b4 = bArr3[O.a(i34, 2, i35, (length5 ^ i34) ^ i35)];
                    bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                    i5 = 1565752577;
                    break;
                case 373627814:
                    break;
                case 975213712:
                    int length6 = bArr4.length;
                    int i36 = 0 - i4;
                    int length7 = bArr4.length;
                    int i37 = ~i36;
                    byte b5 = bArr4[((length7 | i36) - (((-656070458) & i37) & length7)) + (((-656070458) | i36) & length7)];
                    int length8 = bArr4.length;
                    byte b6 = bArr3[(length8 ^ i37) + ((length8 | i36) * 2) + 1];
                    bArr4[((length6 | i36) * 2) - (length6 ^ i36)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = (~i4) + (i4 * 2);
                    int i38 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i38 != 0 ? 986083301 : 1621215041;
                    if (i38 == 0) {
                    }
                    break;
                case 1548321255:
                    int length9 = bArr.length;
                    int length10 = 0 - (0 - (bArr.length % 4));
                    i5 = ((length9 & (~length10)) - ((~length9) & length10) <= 0 ? i2 : 1) != 0 ? 1910359311 : 1621215041;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i3 = i2;
                    break;
                default:
                    i5 = 1621215041;
                    break;
            }
            return;
        }
    }

    public final X d(Context context) {
        boolean zD = d(this.q.g());
        a(zD);
        return new X(zD, b(context), true);
    }
}
