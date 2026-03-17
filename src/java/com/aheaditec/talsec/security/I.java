package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class I {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final InterfaceC0057w0 a;
    public final boolean b;

    static {
        byte[] bArr = {29, -94, 27, -61, 85, 37, 79, 110, -107, -8, -71, 38, -57, 103, 80, -96, -128, 36, 54, -92, 23, -126, 87, 45, -119, -116, -92, -107, 59};
        a(bArr, new byte[]{-72, -10, -12, 92, -44, 95, -116, -3, 93, -126, 12, -35, 76, 29, -118, 56, 73, 127, -110, 117, -56, 65, -102, -36, 126, 41, 69, -85, 97});
        Charset charset = StandardCharsets.UTF_8;
        l = new String(bArr, charset).intern();
        byte[] bArr2 = {37, 126, -8, -10, -62, 91, -28, -52, 4, 114, 111, -98, 41, -62, -113, -31, 24};
        a(bArr2, new byte[]{-91, 4, 13, 62, 15, 39, 49, 124, -37, 51, -79, 105, -93, -63, 104, 42, 127});
        k = new String(bArr2, charset).intern();
        byte[] bArr3 = {118, -115, -124, 27, -101, -107, 113};
        a(bArr3, new byte[]{127, 13, -109, 19, -17, -36, 21, -49});
        j = new String(bArr3, charset).intern();
        byte[] bArr4 = {-95, -53, 0, -62, -123, -18, 0, -104, 14, 93};
        a(bArr4, new byte[]{32, -63, 6, 65, 91, -78, 19, -106, 71, 57});
        i = new String(bArr4, charset).intern();
        byte[] bArr5 = {124, -98, -77, -114, -14, -90, 27, 118, -38};
        a(bArr5, new byte[]{79, -17, 70, -124, -28, -15, -29, -69, -65});
        h = new String(bArr5, charset).intern();
        byte[] bArr6 = {-32, -116, -68, 115, 96, -88, 20, 94};
        a(bArr6, new byte[]{-12, 22, 79, -94, 98, -7, -12, -83});
        g = new String(bArr6, charset).intern();
        byte[] bArr7 = {-12, -7, 80, 62, 42, 58, 44, -107};
        a(bArr7, new byte[]{-4, -126, -76, -55, -83, 66, -41, -109});
        f = new String(bArr7, charset).intern();
        byte[] bArr8 = {2, -16, -30, 51, 126, -108, 119, 26, -123, 53};
        a(bArr8, new byte[]{-62, -72, 34, -1, 65, -25, -96, 18, -29, 90});
        e = new String(bArr8, charset).intern();
        byte[] bArr9 = {64, -68, 42, -72, 81, -18, 107, -90, -105, -100};
        a(bArr9, new byte[]{-105, -51, -9, 76, -112, -87, -82, 97, -8, -14});
        d = new String(bArr9, charset).intern();
        byte[] bArr10 = {63, 104, 96, 80, -94, 106, -109, -108, -11, 81};
        a(bArr10, new byte[]{-118, 59, -95, -58, 39, 54, 102, -110, -68, 53});
        c = new String(bArr10, charset).intern();
    }

    public I(InterfaceC0057w0 interfaceC0057w0, boolean z) {
        this.a = interfaceC0057w0;
        this.b = z;
    }

    public final String a() {
        Calendar calendar = Calendar.getInstance();
        byte[] bArr = {-81, 6, -12, 16, 22, -40, 37, -36, -99, -110, 112, 121, 108, -38, -16, 37, -119, -25, -28, -92, 18, 55, 84, 54, 21, -77, 124, 93, -47};
        a(bArr, new byte[]{42, -115, 28, 10, -105, -120, -38, 19, 37, -28, -59, -113, 55, -128, 42, -78, 64, -72, 108, 116, -59, 10, -107, -53, -22, -13, -67, -20, -117});
        return new SimpleDateFormat(new String(bArr, StandardCharsets.UTF_8).intern(), Locale.ENGLISH).format(calendar.getTime());
    }

    public final String b() {
        byte[] bArr = {-34, 115, -39, 97, -118, 24, 106, 100, -71, 86, 119, -111, 21, -29, 21, -102, 116, 61, 48, -79, -70, -94, 18, 20, 59, -24, -113, -16, 119};
        a(bArr, new byte[]{-5, 24, 50, -67, 3, 75, -111, -21, 57, 32, -50, -89, -98, -104, -49, -58, 117, 70, -104, 96, 45, -66, -41, 37, -116, -122, 82, 0, 45});
        return DateTimeFormatter.ofPattern(new String(bArr, StandardCharsets.UTF_8).intern()).withLocale(Locale.ENGLISH).withZone(ZoneId.systemDefault()).format(Instant.now());
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = {127, 4, 83, 110, 102, -27, 30, -90, -94, -113};
        a(bArr, new byte[]{74, -100, -73, -92, 107, -67, -13, 109, -21, -21});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr, charset).intern(), this.a.f());
        byte[] bArr2 = {55, 2, 2, 55, -116, -120, -58, -5, -39, 120};
        a(bArr2, new byte[]{-88, -117, 24, -49, 85, 4, 75, 55, -74, 22});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {120, -40, -92, -112, -73, 35};
        a(bArr3, new byte[]{45, -15, 56, -61, -103, 19, 62, 94});
        jSONObject.put(strIntern, new String(bArr3, charset).intern());
        byte[] bArr4 = {-36, -79, 126, 90, 64, -89, 40, 45};
        a(bArr4, new byte[]{-16, -13, -111, -56, -126, -5, -24, -30});
        String strIntern2 = new String(bArr4, charset).intern();
        byte[] bArr5 = {-11, -13, -29, 26, 41, 124, -75};
        a(bArr5, new byte[]{-40, -113, 49, 15, 70, 21, -47, -104});
        jSONObject.put(strIntern2, new String(bArr5, charset).intern());
        byte[] bArr6 = {-52, -106, -97, -52, -70, -88, -59, -119, -11, -17};
        a(bArr6, new byte[]{20, -31, 103, 70, 61, -13, 126, -126, -109, -128});
        jSONObject.put(new String(bArr6, charset).intern(), new C0027i0().a());
        byte[] bArr7 = {127, 64, 50, 24, 8, 101, -111, -8};
        a(bArr7, new byte[]{71, 75, -46, 19, -49, 55, 74, 63});
        jSONObject.put(new String(bArr7, charset).intern(), new C0018f0(this.a.e()).a());
        byte[] bArr8 = {62, 105, -101, -91, -37, -19, -41, 100, -52, -35, 1, -41, 42, 33, 13, -20, 38};
        a(bArr8, new byte[]{-114, 57, 106, 111, 22, -75, 46, -108, 3, -89, 35, 80, -96, 96, 22, 32, 65});
        jSONObject.put(new String(bArr8, charset).intern(), this.b);
        byte[] bArr9 = {48, -28, 41, 100, -29, -73, -29};
        a(bArr9, new byte[]{-79, -89, -2, -88, -105, -2, -121, 4});
        jSONObject.put(new String(bArr9, charset).intern(), UUID.randomUUID().toString());
        String strG = this.a.g();
        if (strG != null) {
            byte[] bArr10 = {-44, 57, -91, -115, -44, 25, 9, -73, 51, -62};
            a(bArr10, new byte[]{29, 95, 99, -107, 10, 105, 26, 117, 122, -90});
            jSONObject.put(new String(bArr10, charset).intern(), strG);
        }
        byte[] bArr11 = {-42, -103, -19, 50, 23, -64, 73, -87, -35};
        a(bArr11, new byte[]{21, -28, 60, -32, -55, -56, -43, 104, -72});
        jSONObject.put(new String(bArr11, charset).intern(), b());
        return jSONObject;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    private static void a(byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] bArr3 = null;
        int i3 = -1003175592;
        int length = 0;
        int i4 = 0;
        int i5 = 0;
        byte[] bArr4 = null;
        while (true) {
            int i6 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
            int i7 = i3 >>> 8;
            int i8 = ~((((~i7) | (-1095531540)) | i6) - ((i7 & (-1095531540)) | i6));
            int i9 = (-1171264002) - ((i8 & 2) | ((-130029571) - i8));
            switch ((-1109882652) ^ ((~i9) + ((i9 | 1) * 2))) {
                case -1922532006:
                    int length2 = bArr4.length;
                    int i10 = 0 - length;
                    i3 = (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i10, -4, 1, length2), i10 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i10, -4, 1, length2), i10 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                    i4 = length;
                    break;
                case -1486048729:
                    int length3 = bArr.length;
                    int length4 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                    i3 = z ? z ? -1515449616 : 935800592 : -10521562;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i5 = 0;
                    break;
                case -497756741:
                    int length5 = bArr4.length;
                    int i11 = 0 - i4;
                    int i12 = ((length5 | i11) * 2) - (length5 ^ i11);
                    byte b = bArr3[i12];
                    int length6 = bArr4.length;
                    byte b2 = bArr3[((i11 | length6) - ((1163302289 & (~i11)) & length6)) + ((i11 | 1163302289) & length6)];
                    bArr3[i12] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                    i3 = 935800592;
                    break;
                case 256719606:
                    int i13 = (i5 - 1) - (i5 | (-4));
                    byte b3 = bArr3[i13];
                    int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i15 = i5 + 2;
                    int i16 = i15 - (i5 & 2);
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int iA = J.a(i18, i14, 1, ((-1) - i18) | ((-1) - i14));
                    int i19 = i15 + (((-1) - i5) | (-2));
                    int i20 = bArr3[i19] & 255;
                    int i21 = i20 * ((~i20) & 256);
                    int i22 = (i21 - 1) - ((~iA) | i21);
                    int i23 = bArr3[i5] & 255;
                    int i24 = ~((i23 | ((~i22) | (-755325340))) - ((i22 & (-755325340)) | i23));
                    byte b4 = bArr4[i13];
                    int i25 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i26 = bArr4[i16] & 255;
                    int i27 = i26 * ((~i26) & 65536);
                    int i28 = bArr4[i19] & 255;
                    int i29 = i28 * ((~i28) & 256);
                    int i30 = bArr4[i5] & 255;
                    int i31 = i24 << ((i24 > Double.NaN ? 1 : (i24 == Double.NaN ? 0 : -1)) >>> 31);
                    int i32 = (-659933419) - ((i25 & 2) | (1983400305 - i25));
                    int i33 = (i32 ^ (~i27)) + ((i32 | i27) * 2) + 1;
                    int i34 = (i33 ^ i30) + ((i33 & i30) * 2);
                    int i35 = ((i34 | i29) - (((-2109111237) & (~i29)) & i34)) + ((i29 | (-2109111237)) & i34);
                    int iA2 = y1.a(i31 | i35, 2, i31, i35);
                    bArr4[i5] = (byte) iA2;
                    bArr4[i19] = (byte) (iA2 >>> 8);
                    bArr4[i16] = (byte) (iA2 >>> 16);
                    bArr4[i13] = (byte) (iA2 >>> 24);
                    i5 = (i5 ^ 4) + ((i5 & 4) * 2);
                    int length7 = bArr4.length;
                    int length8 = 0 - (bArr4.length % 4);
                    int i36 = ((i5 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i5 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                    i3 = i36 != 0 ? -1515449616 : 935800592;
                    if (i36 == 0) {
                        i3 = -10521562;
                    }
                    break;
                case 1429728656:
                    length = bArr4.length % 4;
                    int i37 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i2 = i37 != 0 ? -1216566512 : 935800592;
                    i3 = i37 == 0 ? -1058029970 : i2;
                    break;
                case 1870596681:
                    break;
                case 1879000533:
                    int length9 = bArr4.length;
                    int i38 = 0 - i4;
                    int i39 = 0 - i38;
                    int i40 = i39 | length9;
                    int i41 = (length9 ^ i39) ^ i40;
                    int i42 = i39 * 2;
                    int length10 = bArr4.length;
                    byte b5 = bArr4[(i39 ^ length10) - (((~length10) & i39) * 2)];
                    int length11 = bArr4.length;
                    byte b6 = bArr3[((i38 | length11) * 2) - (length11 ^ i38)];
                    bArr4[(i40 - i42) + i41] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
                    length = (~i4) + (i4 * 2);
                    int i43 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                    i2 = i43 != 0 ? -1216566512 : 935800592;
                    if (i43 == 0) {
                    }
                    break;
                default:
                    i3 = 935800592;
                    break;
            }
            return;
        }
    }
}
