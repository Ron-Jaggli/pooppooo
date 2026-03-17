package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0011d implements InterfaceC0061y0 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;

    static {
        byte[] bArr = {104, -95, 82, 3, 111, -119, 127, 8, 94};
        a(bArr, new byte[]{127, -62, -122, -49, 102, -40, -103, -93, 58});
        Charset charset = StandardCharsets.UTF_8;
        g = new String(bArr, charset).intern();
        byte[] bArr2 = {-111, 65, -34, -18, -33, -93, -119, -86, -51, -123, 89, 104, -50, -21, -62, -51, 18, 108, 55, -82, 38, 8, -26};
        a(bArr2, new byte[]{-122, 34, 10, 34, -42, -14, 111, 9, -35, -25, -114, -68, -36, -92, 36, 6, 8, 63, -9, 109, 75, 109, -107});
        f = new String(bArr2, charset).intern();
        byte[] bArr3 = {-4, 3, -109, -25, 102, -93, 30};
        a(bArr3, new byte[]{-21, 96, 71, 43, 3, -64, 106, -128});
        e = new String(bArr3, charset).intern();
        byte[] bArr4 = {113, 115, 35, -49, -36, 86};
        a(bArr4, new byte[]{102, 32, -57, 4, -67, 58, -14, -82});
        d = new String(bArr4, charset).intern();
        byte[] bArr5 = {104, -121, 71, -71, -127, -22, 17, 49};
        a(bArr5, new byte[]{101, -26, -94, 110, -120, -118, -86, -9});
        c = new String(bArr5, charset).intern();
        byte[] bArr6 = {98, 85, 12, 23, -107, 113, -96, 40, 125, 103, 58, 30, 53, 127, -29, -119, 117, -125, -64, -51, 70, 19};
        a(bArr6, new byte[]{111, 52, -23, -64, -100, 17, 19, -26, 101, 52, -34, -50, 48, 29, 56, 81, 124, -65, 19, 2, 35, 96});
        b = new String(bArr6, charset).intern();
        byte[] bArr7 = {27, 13, 31, 4, -28, -2};
        a(bArr7, new byte[]{22, 108, -6, -45, -127, -116, 31, 82});
        a = new String(bArr7, charset).intern();
    }

    public JSONObject a(X509Certificate x509Certificate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (x509Certificate.getIssuerDN() != null) {
            byte[] bArr = {32, 19, -31, -91, -17, -40};
            a(bArr, new byte[]{45, 114, 4, 114, -118, -86, -36, -27});
            jSONObject.put(new String(bArr, StandardCharsets.UTF_8).intern(), x509Certificate.getIssuerDN().getName());
        }
        byte[] bArr2 = {60, -34, -16, 35, 0, 10, 39, 54, -81, 55, -39, 40, -65, 74, -113, -125, 126, -71, -82, 69, 28, 75};
        a(bArr2, new byte[]{49, -65, 21, -12, 9, 106, -108, -8, -73, 100, 61, -8, -70, 40, 84, 91, 119, -123, 125, -118, 121, 56});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr2, charset).intern(), b(x509Certificate));
        byte[] bArr3 = {-30, 84, 26, 14, -99, 48, 27, 75};
        a(bArr3, new byte[]{-17, 53, -1, -39, -108, 80, -96, -115});
        jSONObject.put(new String(bArr3, charset).intern(), a(x509Certificate.getIssuerUniqueID()));
        byte[] bArr4 = {53, 107, -71, 74, -34, 20};
        a(bArr4, new byte[]{34, 56, 93, -127, -65, 120, -69, -10});
        jSONObject.put(new String(bArr4, charset).intern(), x509Certificate.getSerialNumber());
        if (x509Certificate.getSubjectDN() != null) {
            byte[] bArr5 = {115, -10, -117, 43, -122, -119, 31};
            a(bArr5, new byte[]{100, -107, 95, -25, -29, -22, 107, 42});
            jSONObject.put(new String(bArr5, charset).intern(), x509Certificate.getSubjectDN().getName());
        }
        byte[] bArr6 = {-15, 41, -88, 99, -86, 30, 61, -104, 49, -80, -35, -51, 103, -12, -92, 40, -33, -33, 27, -116, 69, 32, -78};
        a(bArr6, new byte[]{-26, 74, 124, -81, -93, 79, -37, 59, 33, -46, 10, 25, 117, -69, 66, -29, -59, -116, -37, 79, 40, 69, -63});
        jSONObject.put(new String(bArr6, charset).intern(), c(x509Certificate));
        byte[] bArr7 = {44, 28, -61, -40, 19, -73, 66, -112, -34};
        a(bArr7, new byte[]{59, 127, 23, 20, 26, -26, -92, 59, -70});
        jSONObject.put(new String(bArr7, charset).intern(), a(x509Certificate.getSubjectUniqueID()));
        return jSONObject;
    }

    public final JSONArray b(X509Certificate x509Certificate) {
        try {
            return a(x509Certificate.getIssuerAlternativeNames());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public final JSONArray c(X509Certificate x509Certificate) {
        try {
            return a(x509Certificate.getSubjectAlternativeNames());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public final JSONArray a(Collection<List<?>> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection == null) {
            return jSONArray;
        }
        Iterator<List<?>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray;
    }

    public final String a(boolean[] zArr) {
        String str;
        if (zArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            if (z) {
                byte[] bArr = {-114};
                a(bArr, new byte[]{-65, -123, 40, -76, 26, -93, 108, 77});
                str = new String(bArr, StandardCharsets.UTF_8);
            } else {
                byte[] bArr2 = {87};
                a(bArr2, new byte[]{103, -79, -12, -3, 110, -51, -19, -112});
                str = new String(bArr2, StandardCharsets.UTF_8);
            }
            sb.append(str.intern());
        }
        return sb.toString();
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
