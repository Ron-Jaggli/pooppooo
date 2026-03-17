package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.C0028i1;
import com.aheaditec.talsec.security.t1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0032k extends AbstractC0017f {
    public static final String n;
    public static final String o;
    public static final int p = 32;
    public final u1 l;
    public final E1 m;

    static {
        byte[] bArr = {108, 96, 115, 78, -83, 49, -74, -55, -78, -20, -124, -101, -108, 41, 11};
        b(bArr, new byte[]{101, 32, -118, -42, 55, 118, 75, 69, 55, -74, -91, -119, -5, 91, 110});
        Charset charset = StandardCharsets.UTF_8;
        o = new String(bArr, charset).intern();
        byte[] bArr2 = {24, -74, -60, -31, -11, -125, 96, -97, 89, 11, 39, -115, -67, -85, -34, -17, -15, 10, -32, -91, -2, 55, -80, -42, 98, 52, -68};
        b(bArr2, new byte[]{-55, -51, 66, 54, -20, 2, -90, 100, -103, -79, -10, -100, 21, -8, 60, 62, -12, -116, 56, 103, -52, 118, 77, 76, 16, 87, -39});
        n = new String(bArr2, charset).intern();
    }

    public AbstractC0032k(R0 r0, u1 u1Var, E1 e1) {
        super(r0);
        this.l = u1Var;
        this.m = e1;
    }

    public void a(X x) {
        C0028i1.c cVarB = this.m.b();
        if (cVarB != null) {
            cVarB.a(32);
        }
        this.m.a().f();
        byte[] bArr = {-58, 5, 51, 83, 24, 75, 38, -24, 39, -58, -76, -85, 0, 30, -68};
        b(bArr, new byte[]{31, -99, -53, -45, -38, 81, -5, 35, -86, -33, 117, 122, 111, 108, -39});
        Charset charset = StandardCharsets.UTF_8;
        a(new String(bArr, charset).intern(), x);
        if (x.c()) {
            byte[] bArr2 = {-59, 20, -50, 15, -66, -37, 32, -17, 97, 93, -18, 0, -33, 56, 29};
            b(bArr2, new byte[]{28, 108, 47, 20, 4, -96, -15, 56, 100, 39, 51, 23, -80, 74, 120});
            b(new String(bArr2, charset).intern(), this.m.a().f());
        }
        if (x.b()) {
            E1 e1 = this.m;
            Integer numF = e1.a().f();
            byte[] bArr3 = {-103, 6, 97, 92, 104, -67, 87, 46, 115, -105, -56, -119, -97, 30, 42, -12, -45, -67, -100, -127, 33, -12, -66, -56, -17, -23, -120};
            b(bArr3, new byte[]{72, -102, -90, -52, 121, -40, -67, -11, 115, -52, 84, -97, 55, 109, -16, 58, 22, -33, 103, -117, -85, -78, 95, 94, -99, -118, -19});
            e1.a(numF, new String(bArr3, charset).intern());
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean b() {
        return true;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        this.m.a().f();
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    private static void b(byte[] bArr, byte[] bArr2) {
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

    public void a(boolean z) {
        this.l.a(t1.a.f, z);
    }
}
