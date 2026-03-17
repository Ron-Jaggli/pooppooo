package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class U0 {
    public final String a;
    public final String[] b;

    public U0(String str, String[] strArr) {
        byte[] bArr = {-58, -44, -70, -105};
        a(bArr, new byte[]{-44, -101, 101, 80, -2, 60, 123, 89});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        this.a = str;
        this.b = strArr;
    }

    public final String a() {
        return this.a;
    }

    public final String[] b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String[] d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(U0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        byte[] bArr = {-9, 71, 123, -81, -1, -50, 119, 117, 82, 123, 18, 32, 79, 62, 123, 4, 100, -4, -71, -24, -101, 117, 75, -94, -107, -12, 3, -93, -120, -93, -62, -75, 39, -86, -126, 52, 101, 63, -6, 119, -5, -25, 94, 34, 96, 37, 1, -6, -116, -30, -47, 78, 40, 85, 95, -65, 116, -58, 7, -58, 69, 120, 41, 33, -59, 0, 125, 116, -17, -81, 72, 3, 95, 123, 92, -43, -93, 35, -28, -128, 97, 25, -52, -48, 37, 121, -84, -124, 92, -47, -67, -105, 123};
        a(bArr, new byte[]{-27, 36, -91, 97, 59, -98, -92, -91, 64, 38, -12, -94, 73, 109, -23, -63, 97, -99, 95, 106, -125, 40, -39, 114, -122, -88, -100, 115, -111, -7, 28, 55, 63, -51, 96, -13, -95, 111, 27, -72, 41, -87, -124, -27, 101, 119, -38, 44, -123, -77, 113, -104, 45, 15, -70, 120, 115, -117, -30, 1, 66, 27, -51, -22, -35, 103, -35, -95, -26, -2, -81, -41, 82, 25, -73, 69, -86, 120, 3, 78, 100, 123, 45, 4, -9, 68, 72, 85, 72, -126, 89, 65, 2});
        Intrinsics.checkNotNull(obj, new String(bArr, StandardCharsets.UTF_8).intern());
        U0 u0 = (U0) obj;
        if (!Intrinsics.areEqual(this.a, u0.a)) {
            return false;
        }
        String[] strArr = this.b;
        if (strArr != null) {
            String[] strArr2 = u0.b;
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (u0.b != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String[] strArr = this.b;
        return iHashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public String toString() {
        String str = this.a;
        String string = Arrays.toString(this.b);
        byte[] bArr = {66, 58, -21, -112, 39, -61, 84, -118, 20, -30, -113, -27, 108, 115};
        a(bArr, new byte[]{-74, 101, 10, 66, 46, -93, -78, 81, -40, -71, 92, 42, 9, 78});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {94, 120, 44, 126, -125, 84, 18, -57};
        a(bArr2, new byte[]{-114, 117, -60, -67, -109, 55, -59, 88});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-91};
        a(bArr3, new byte[]{-116, 32, 121, 74, -67, -53, 42, -55});
        return strIntern + str + strIntern2 + string + new String(bArr3, charset).intern();
    }

    public final U0 a(String str, String[] strArr) {
        byte[] bArr = {-118, 28, 96, -34};
        a(bArr, new byte[]{-104, 83, -65, 25, 18, 22, 39, 16});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        return new U0(str, strArr);
    }

    public static /* synthetic */ U0 a(U0 u0, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = u0.a;
        }
        if ((i & 2) != 0) {
            strArr = u0.b;
        }
        return u0.a(str, strArr);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
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
