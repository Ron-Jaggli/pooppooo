package com.aheaditec.talsec.security;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class Q {
    public static final String b;
    public static final String c;
    public static final String d;
    public final String a;

    static {
        byte[] bArr = {16, 19, -16, 75, 126, 5, -83, 28, -1, 29, 87, 45, -93, -118, -68, 125, 50, -70, -27, -61, -65, -92, -77, 85, -50, 88, 4, 95, -35, -28, -101, -23, 40, -45, 95, -50, 84, -62, 123, -38, -55, 29, 64, -125};
        a(bArr, new byte[]{25, 119, 58, -3, -116, 42, 74, -124, -15, 88, -29, -22, -84, -43, 105, -56, 55, -102, 93, 12, 76, -15, 4, -110, 32, 5, -80, -4, -43, -79, 112, 33, 60, -119, -73, 87, -91, -30, -38, 96, 51, 121, -91, 28});
        Charset charset = StandardCharsets.UTF_8;
        d = new String(bArr, charset).intern();
        byte[] bArr2 = {-126, 83, 110};
        a(bArr2, new byte[]{-10, 48, 12, 21, -87, 6, 62, -97});
        c = new String(bArr2, charset).intern();
        byte[] bArr3 = {-95, -75, 31, 27, 84, -85};
        a(bArr3, new byte[]{-71, -6, -63, -50, 49, -56, -11, -99});
        b = new String(bArr3, charset).intern();
    }

    public Q(Context context) {
        String strA;
        try {
            strA = a(context);
        } catch (Exception unused) {
            strA = null;
        }
        this.a = strA;
    }

    public final byte[] a(InputStream inputStream, OutputStream outputStream) throws NoSuchAlgorithmException, IOException {
        byte[] bArr = {-12, -59, 124, 19, -93, 101, -123};
        a(bArr, new byte[]{3, -16, -49, -100, -111, 80, -77, 7});
        MessageDigest messageDigest = MessageDigest.getInstance(new String(bArr, StandardCharsets.UTF_8).intern());
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr2);
            if (i <= 0) {
                return messageDigest.digest();
            }
            outputStream.write(bArr2, 0, i);
            messageDigest.update(bArr2, 0, i);
        }
    }

    public String a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.Q.a(android.content.Context):java.lang.String");
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
                    byte b2 = bArr3[i12];
                    int length3 = bArr4.length;
                    byte b3 = bArr3[(length3 ^ i11) + ((i10 | length3) * 2) + 1];
                    int i13 = ((byte) 0) - b2;
                    bArr3[i12] = (byte) (((byte) (((byte) 2) * ((byte) (b3 & (~i13))))) - ((byte) (b3 ^ i13)));
                    i5 = -34715366;
                    i2 = 0;
                    break;
                case -1882653318:
                    int i14 = (i4 - 1) - (i4 | (-4));
                    byte b4 = bArr3[i14];
                    int i15 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i16 = i4 + 3 + (((-1) - i4) | (-3));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int i19 = ~((i15 | (1169991170 | (~i18))) - ((i18 & 1169991170) | i15));
                    int iA = K.a(689061172 & i4, i4, 1, 689061173 & i4);
                    int i20 = bArr3[iA] & 255;
                    int i21 = ((~i19) & (i20 * ((~i20) & 256))) + i19;
                    int i22 = (i21 - 1) - ((~(bArr3[i4] & 255)) | i21);
                    byte b5 = bArr4[i14];
                    int i23 = ((b5 & 16777216) * (b5 | 16777216)) + (((-16777217) & b5) * ((~b5) & 16777216));
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
                    byte b6 = bArr4[(length8 ^ i37) + ((length8 & i37) * 2)];
                    int length9 = bArr4.length;
                    int i39 = 0 - i37;
                    byte b7 = bArr3[(((~i39) & length9) * 2) - (length9 ^ i39)];
                    bArr4[L.a(i2, (length7 & 2) | iA2, i38, 1)] = (byte) (((byte) (b7 + b6)) - ((byte) (((byte) 2) * ((byte) (b7 & b6)))));
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
