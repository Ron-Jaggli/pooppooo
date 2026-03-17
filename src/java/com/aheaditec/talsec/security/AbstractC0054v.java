package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0054v extends AbstractC0017f {
    public static final a m;
    public static final String n;
    public final E1 l;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    /* JADX INFO: renamed from: com.aheaditec.talsec.security.v$a */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-106, -36, -115, -34, 59, 86, 23, -50, -120, -10, -70, 50};
        b(bArr, new byte[]{-114, -117, 82, 25, -52, 11, -10, 31, -126, -95, 90, -5});
        n = new String(bArr, StandardCharsets.UTF_8).intern();
        m = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0054v(R0 r0, E1 e1) {
        super(r0);
        byte[] bArr = {-33, 53, -68, -45, 38, 66};
        b(bArr, new byte[]{-49, 104, 101, 26, 67, 48, 36, 119});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {44, -87, -73, -96, 85, -88, -49, -98};
        b(bArr2, new byte[]{58, -6, 100, 101, 77, -1, 46, 78});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
        this.l = e1;
    }

    public final void a(X x) {
        byte[] bArr = {-37, -105, -104, -16, 83, -34};
        b(bArr, new byte[]{-51, -60, 125, 39, 63, -86, -31, -91});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(x, new String(bArr, charset).intern());
        this.l.a().l();
        byte[] bArr2 = {44, 31, 2, -125, -86, 100, 54, 42, 121, -81, 51, 79};
        b(bArr2, new byte[]{52, 72, -35, 68, 93, 57, -41, -5, 115, -8, -45, -122});
        a(new String(bArr2, charset).intern(), x);
        if (x.c()) {
            byte[] bArr3 = {-67, -59, -28, 120, 8, 79, 87, -94, -38, -57, 0, -75};
            b(bArr3, new byte[]{-91, -110, 59, -65, -1, 18, -74, 115, -48, -112, -32, 124});
            a(new String(bArr3, charset).intern(), this.l.a().l());
        }
        if (x.b()) {
            E1 e1 = this.l;
            Integer numL = e1.a().l();
            byte[] bArr4 = {-25, 101, -46, 91, 88, -122, -45, 10, -42, -9, 23, 15};
            b(bArr4, new byte[]{-1, 50, 13, -100, -81, -37, 50, -37, -36, -96, -9, -58});
            e1.a(numL, new String(bArr4, charset).intern());
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

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    private static void b(byte[] bArr, byte[] bArr2) {
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
}
