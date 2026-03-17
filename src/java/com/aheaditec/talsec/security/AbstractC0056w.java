package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0056w extends AbstractC0017f {
    public static final a m;
    public static final String n;
    public final E1 l;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    /* JADX INFO: renamed from: com.aheaditec.talsec.security.w$a */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {59, -23, -2, 58, -15, 115, -90, -125, 66, -36, -7, -73};
        b(bArr, new byte[]{-86, -72, 3, -8, -10, 20, 106, -125, -79, -96, 13, 115});
        n = new String(bArr, StandardCharsets.UTF_8).intern();
        m = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0056w(R0 r0, E1 e1) {
        super(r0);
        byte[] bArr = {7, -5, -12, -66, -82, -24};
        b(bArr, new byte[]{-57, -121, 1, 70, -53, -102, -81, -86});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {-74, 90, -61, -9, -125, -55, 69, 119};
        b(bArr2, new byte[]{40, 45, 84, 57, 83, -34, -40, -73});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
        this.l = e1;
    }

    public final void a(X x) {
        byte[] bArr = {112, -68, -115, 21, -78, -88};
        b(bArr, new byte[]{102, -49, -116, 2, -34, -36, -89, 127});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(x, new String(bArr, charset).intern());
        this.l.a().m();
        byte[] bArr2 = {-110, -100, 77, 1, -105, 63, -122, -48, -108, -50, 81, 36};
        b(bArr2, new byte[]{67, -28, -52, 6, 88, 88, -118, 87, 111, -43, -91, -17});
        a(new String(bArr2, charset).intern(), x);
        if (x.c()) {
            byte[] bArr3 = {-94, -66, 121, -15, 111, 27, 94, 81, 122, -112, 40, 26};
            b(bArr3, new byte[]{51, -62, -104, 54, 112, 124, -94, -42, 73, 23, -4, 21});
            a(new String(bArr3, charset).intern(), this.l.a().m());
        }
        if (x.b()) {
            E1 e1 = this.l;
            Integer numM = e1.a().m();
            byte[] bArr4 = {-82, 93, -105, 1, 42, -52, -33, -90, -68, 25, -52, -50};
            b(bArr4, new byte[]{39, 37, 122, 1, -83, -52, 35, 108, 55, 110, 88, 88});
            e1.a(numM, new String(bArr4, charset).intern());
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean b() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
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
}
