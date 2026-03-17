package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.core.app.ActivityCompat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class J1 {
    public static final boolean a(PackageInfo packageInfo, String str) {
        byte[] bArr = {-5, 79, -24, -74, 79, 50};
        a(bArr, new byte[]{-34, 11, -106, -58, 60, 12, -15, -39});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {-77, 24, -123, -3, 35, -69, -35, -29, -88, -22};
        a(bArr2, new byte[]{-38, 77, 13, 120, 97, -104, -60, 113, -57, -124});
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        String[] strArr = packageInfo.requestedPermissions;
        return strArr != null && ArraysKt.contains(strArr, str);
    }

    public static final boolean a(Context context, String str) {
        byte[] bArr = {32, 31, -76, -92, -103, 122};
        a(bArr, new byte[]{51, 59, -14, -76, -22, 68, 14, 6});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {17, -32, 104, 65, -2, -99, -73, -30, 100, 30};
        a(bArr2, new byte[]{120, 85, 48, 19, -82, -66, -38, 114, 11, 112});
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        return ActivityCompat.checkSelfPermission(context, str) == 0;
    }

    public static final boolean a(ApplicationInfo applicationInfo) {
        byte[] bArr = {-18, 67, -94, 117, -70, 88};
        a(bArr, new byte[]{-23, 7, -32, 3, -55, 102, 103, -95});
        Intrinsics.checkNotNullParameter(applicationInfo, new String(bArr, StandardCharsets.UTF_8).intern());
        int i = applicationInfo.flags;
        return (i & 1) != 0 && (i & AbstractC0023h.n) == 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr3 = null;
        int i4 = 0;
        int i5 = 0;
        int length = 0;
        int i6 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i7 = ((i6 & 16777216) * (i6 | 16777216)) + ((i6 & (-16777217)) * ((~i6) & 16777216));
            int i8 = i6 >>> 8;
            int iA = K.a(650911840 & (~i7) & i8, i8, i7, (i7 | 650911840) & i8);
            int i9 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i9) + ((i9 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i10 = 0 - i4;
                    int i11 = (length2 ^ i10) + ((length2 & i10) * 2);
                    byte b = bArr3[i11];
                    int length3 = bArr4.length;
                    int i12 = 0 - i10;
                    int i13 = i12 | length3;
                    byte b2 = bArr3[O.a(i12, 2, i13, (length3 ^ i12) ^ i13)];
                    bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - ((byte) (b2 ^ b)));
                    i3 = 0;
                    i6 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    if ((((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i3 = 0;
                        i6 = -365117735;
                    } else {
                        i6 = -458924450;
                        i3 = 0;
                    }
                    break;
                case -1399959314:
                    int iA2 = K.a((-1205100636) & i5, i5, 3, (-1205100633) & i5);
                    byte b3 = bArr3[iA2];
                    int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i15 = i5 - 1;
                    int i16 = i15 - (i5 | (-3));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int iA3 = J.a(i18, i14, 1, ((-1) - i18) | ((-1) - i14));
                    int i19 = i15 - (i5 | (-2));
                    int i20 = bArr3[i19] & 255;
                    int i21 = i20 * ((~i20) & 256);
                    int i22 = (i21 - 1) - ((~iA3) | i21);
                    int i23 = bArr3[i5] & 255;
                    int iA4 = J.a(i22, i23, 1, ((-1) - i22) | ((-1) - i23));
                    byte b4 = bArr4[iA2];
                    int i24 = ((16777216 & b4) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i25 = bArr4[i16] & 255;
                    int i26 = ((i25 * ((~i25) & 65536)) & (~i24)) + i24;
                    int i27 = bArr4[i19] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = ~((((~i28) | 911399251) | i26) - ((i28 & 911399251) | i26));
                    int i30 = bArr4[i5] & 255;
                    int i31 = ~((((~i29) | 1433568692) | i30) - ((i29 & 1433568692) | i30));
                    int i32 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i33 = (-1254002618) - ((i32 & 2) | ((-1672003491) - i32));
                    int i34 = (i33 + i31) - ((i33 & i31) * 2);
                    bArr4[i5] = (byte) i34;
                    bArr4[i19] = (byte) (i34 >>> 8);
                    bArr4[i16] = (byte) (i34 >>> 16);
                    bArr4[iA2] = (byte) (i34 >>> 24);
                    i5 = (i5 ^ 4) + ((i5 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i35 = ((i5 > L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i5 == L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    int i36 = i35 != 0 ? -1605440657 : -365117735;
                    if (i35 == 0) {
                        i6 = -169475207;
                        i3 = 0;
                    } else {
                        i6 = i36;
                        i = 0;
                        i3 = i;
                    }
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    i2 = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 <= 0 ? i3 : 1;
                    i6 = i2 != 0 ? i2 != 0 ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i5 = i3;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i37 = 0 - i4;
                    int i38 = 0 - i37;
                    int i39 = ((~length8) & i38) * 2;
                    int length9 = bArr4.length;
                    byte b5 = bArr4[((length9 | i37) * 2) - (length9 ^ i37)];
                    int length10 = bArr4.length;
                    byte b6 = bArr3[(i37 ^ length10) + ((length10 & i37) * 2)];
                    bArr4[(length8 ^ i38) - i39] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = M.a(i4, 3, (~i4) * 2, 1);
                    if ((((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i6 = -365117735;
                    } else {
                        i6 = -458924450;
                        i3 = 0;
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i40 = 0 - length;
                    i2 = (((double) ((byte) bArr3[((length11 | i40) - ((165327505 & (~i40)) & length11)) + ((i40 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i40) - ((165327505 & (~i40)) & length11)) + ((i40 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) <= -1 ? i3 : 1;
                    i6 = i2 != 0 ? -746753280 : i2 != 0 ? -365117735 : 1093626513;
                    i4 = length;
                    break;
                default:
                    i = i3;
                    i6 = -365117735;
                    i3 = i;
                    break;
            }
            return;
        }
    }
}
