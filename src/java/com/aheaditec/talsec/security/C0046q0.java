package com.aheaditec.talsec.security;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class C0046q0 implements InterfaceC0061y0 {
    public final int[] a;

    public C0046q0(int[] iArr) {
        byte[] bArr = {66, -10, -54, -64, -54, 116, -100, -114, 57, 74, 111, 104, -7, 116, 33, 11, 114, -12, -44, -77, -99, 97, 117};
        a(bArr, new byte[]{72, -91, 25, 22, -45, 20, 75, 56, 48, 43, -119, -93, -21, 33, -102, -37, 117, -93, 2, 116, -13, 21, 6});
        Intrinsics.checkNotNullParameter(iArr, new String(bArr, StandardCharsets.UTF_8).intern());
        this.a = iArr;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0061y0
    public void a(JSONObject jSONObject) throws JSONException {
        byte[] bArr = {-25, 40, -22, 81};
        a(bArr, new byte[]{-23, 73, 11, -127, -91, 2, 7, -58});
        Intrinsics.checkNotNullParameter(jSONObject, new String(bArr, StandardCharsets.UTF_8).intern());
        JSONArray jSONArray = new JSONArray();
        for (int i : this.a) {
            jSONArray.put(i);
        }
        byte[] bArr2 = {-38, -33, -37, 50, 124, 44, -9, 64, -110, 68, 42, 11, -45, -84, 87, -72, -33, 64, 69, 85, 78};
        a(bArr2, new byte[]{-42, -112, 62, -102, 117, 99, 17, -105, -124, 23, -20, -52, -60, -50, -116, 104, -44, 114, -106, -125, 47});
        jSONObject.put(new String(bArr2, StandardCharsets.UTF_8).intern(), jSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0046q0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        byte[] bArr = {-41, -34, 108, -123, 46, -120, 17, 104, -94, 10, -60, -1, 64, -106, -73, 31, -122, -93, 13, -48, -105, -68, 51, -60, -22, -84, 107, -124, 115, 79, 27, -122, -40, -124, 22, -70, 59, 108, -14, -59, 85, 40, -126, -59, 114, 119, -97, -46, -57, 89, -126, 92, 93, -96, 45, 107, -121, 1, -18, -107, 42, -86, -125, -105, -79, -128, -2, -42, 22, 82, -62, 102, -56, -55, -79, 52, 115, -51, -84, -108, 102, 28, 44, -77, -91, 77, -82, -83, -100, -47, 2, 100, 14, 67, -96, -8, 25, 87, 60, -115, -47, -33, 102, -36, 35, -1, -32, 94, -114, -124, 18, -58, 73, 61, -122, 62};
        a(bArr, new byte[]{-59, -67, -78, 75, -22, -40, -62, -72, -80, 87, 34, 125, 70, -59, 37, -38, -125, -62, -21, 82, -113, -31, -95, 20, -7, -16, -12, 84, 106, 21, -59, 4, -64, -29, -12, 125, -1, 60, 19, 10, -121, 102, 88, 2, 119, 37, 68, 4, -50, 8, 34, -118, 88, -6, -56, -84, -128, 76, 11, 82, 45, -55, 103, 92, -87, -25, 94, 3, 31, 3, 37, -78, -59, -85, 90, -92, 99, -112, 117, 93, 111, 124, -116, 99, -84, 47, 71, 124, -118, -120, -94, -52, 7, 12, 70, 47, 15, 4, -6, 74, -58, -67, -67, 12, 40, -66, 55, -120, 99, -33, -57, 13, 65, 110, 102, -24});
        Intrinsics.checkNotNull(obj, new String(bArr, StandardCharsets.UTF_8).intern());
        return Arrays.equals(this.a, ((C0046q0) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    private static void a(byte[] bArr, byte[] bArr2) {
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
