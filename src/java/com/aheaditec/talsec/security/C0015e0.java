package com.aheaditec.talsec.security;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0015e0 {
    public static final String b;
    public static final String c;
    public static final String d;
    public final C0053u0 a;

    static {
        byte[] bArr = {23, 83, -125, 31, -10, -66, -38, 43, -18, 99, 21, -112, -16, 19, 102, 54, 118, 122, 85, 63};
        a(bArr, new byte[]{117, 58, -19, 123, -97, -48, -67, 116, -115, 12, 120, -32, -97, 96, 15, 66, 19, 37, 60, 91});
        Charset charset = StandardCharsets.UTF_8;
        d = new String(bArr, charset).intern();
        byte[] bArr2 = {-125, -17, -18, 18, -118, 108, 68, 111, -61, 31, -65, 99, -41, -78, -115, -30, 75, 53};
        a(bArr2, new byte[]{-31, -122, -128, 118, -29, 2, 35, 48, -77, 106, -35, 15, -66, -47, -46, -119, 46, 76});
        c = new String(bArr2, charset).intern();
        byte[] bArr3 = {44, -85, 17, -75, -70, -108, 118, 71, -63, -30, 93, 104, 22, -26, 5, -56, -115, 68};
        a(bArr3, new byte[]{78, -62, 127, -47, -45, -6, 17, 24, -96, -116, 57, 26, 121, -113, 97, -105, -28, 32});
        b = new String(bArr3, charset).intern();
    }

    public C0015e0(Context context) {
        this.a = new C0053u0(context);
    }

    public boolean a() {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {73, 19, -121, -90, -61, 87, -61, -39, -49, -97, -108, 37, 66, 25, 82, 63, 28, 20};
        a(bArr, new byte[]{43, 122, -23, -62, -86, 57, -92, -122, -82, -15, -16, 87, 45, 112, 54, 96, 117, 112});
        return c0053u0.b(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public boolean b() {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {39, -4, 27, 54, 113, -68, 113, -24, -102, 32, 118, 23, 37, 102, -35, -64, 1, -127, -88, 1};
        a(bArr, new byte[]{69, -107, 117, 82, 24, -46, 22, -73, -7, 79, 27, 103, 74, 21, -76, -76, 100, -34, -63, 101});
        return c0053u0.b(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public String c() {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {-106, 2, 123, 17, -75, 121, 78, -65, -128, 127, -36, -24, -25, 102, -32, 88, 90, 94};
        a(bArr, new byte[]{-12, 107, 21, 117, -36, 23, 41, -32, -31, 17, -72, -102, -120, 15, -124, 7, 51, 58});
        Charset charset = StandardCharsets.UTF_8;
        if (!c0053u0.b(new String(bArr, charset).intern())) {
            return null;
        }
        C0053u0 c0053u02 = this.a;
        byte[] bArr2 = {21, 93, 89, 80, -38, 34, 53, 99, -40, 37, 88, 86, 8, -28, -96, 98, 81, 14};
        a(bArr2, new byte[]{119, 52, 55, 52, -77, 76, 82, 60, -71, 75, 60, 36, 103, -115, -60, 61, 56, 106});
        return c0053u02.a(new String(bArr2, charset).intern());
    }

    public String d() {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {66, 22, -24, -63, 51, 7, -8, 69, 102, -13, -54, -127, -30, -109, -64, 0, -57, -91, 13, 7};
        a(bArr, new byte[]{32, 127, -122, -91, 90, 105, -97, 26, 5, -100, -89, -15, -115, -32, -87, 116, -94, -6, 100, 99});
        Charset charset = StandardCharsets.UTF_8;
        if (!c0053u0.b(new String(bArr, charset).intern())) {
            return null;
        }
        C0053u0 c0053u02 = this.a;
        byte[] bArr2 = {-71, -16, -9, -97, 105, 124, 21, -106, 118, 76, 48, 13, -50, 77, -28, -34, 120, -12, -84, -117};
        a(bArr2, new byte[]{-37, -103, -103, -5, 0, 18, 114, -55, 21, 35, 93, 125, -95, 62, -115, -86, 29, -85, -59, -17});
        return c0053u02.a(new String(bArr2, charset).intern());
    }

    public PublicKey e() {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {118, -97, 127, -117, 12, 77, -128, -122, -63, 105, 29, 108, -58, -13, -75, 4, -44, 106};
        a(bArr, new byte[]{20, -10, 17, -17, 101, 35, -25, -39, -79, 28, 127, 0, -81, -112, -22, 111, -79, 19});
        Charset charset = StandardCharsets.UTF_8;
        if (!c0053u0.b(new String(bArr, charset).intern())) {
            return null;
        }
        C0053u0 c0053u02 = this.a;
        byte[] bArr2 = {-118, -89, 8, -94, 66, -28, -128, 12, -102, -116, -103, 76, -33, -10, -8, 54, -26, -43};
        a(bArr2, new byte[]{-24, -50, 102, -58, 43, -118, -25, 83, -22, -7, -5, 32, -74, -107, -89, 93, -125, -84});
        byte[] bArrDecode = Base64.decode(c0053u02.a(new String(bArr2, charset).intern()), 2);
        try {
            byte[] bArr3 = {37, 117, -97};
            a(bArr3, new byte[]{119, 38, -34, 91, -1, 34, 94, -48});
            return KeyFactory.getInstance(new String(bArr3, charset).intern()).generatePublic(new X509EncodedKeySpec(bArrDecode));
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str) {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {-115, 25, -83, 57, -17, -47, -11, -16, -40, -32, 96, 125, -8, -63, -88, -42, -61, 101};
        a(bArr, new byte[]{-17, 112, -61, 93, -122, -65, -110, -81, -71, -114, 4, 15, -105, -88, -52, -119, -86, 1});
        c0053u0.a(new String(bArr, StandardCharsets.UTF_8).intern(), str);
    }

    public void b(String str) {
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {-80, -99, -8, -57, 48, -127, -56, -67, -7, 106, -94, 34, 94, -31, 68, -73, -74, -10, 99, 88};
        a(bArr, new byte[]{-46, -12, -106, -93, 89, -17, -81, -30, -102, 5, -49, 82, 49, -110, 45, -61, -45, -87, 10, 60});
        c0053u0.a(new String(bArr, StandardCharsets.UTF_8).intern(), str);
    }

    public void a(PublicKey publicKey) {
        String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 2);
        C0053u0 c0053u0 = this.a;
        byte[] bArr = {-18, -2, 64, -75, -64, 119, 118, -51, 50, -12, -126, 1, 106, 22, -10, -72, 1, -111};
        a(bArr, new byte[]{-116, -105, 46, -47, -87, 25, 17, -110, 66, -127, -32, 109, 3, 117, -87, -45, 100, -24});
        c0053u0.a(new String(bArr, StandardCharsets.UTF_8).intern(), strEncodeToString);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = null;
        int i2 = -585497720;
        int i3 = 0;
        int i4 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
            int i6 = i2 >>> 8;
            int i7 = ~((((~i6) | (-238348293)) | i5) - ((i6 & (-238348293)) | i5));
            int i8 = (-1081514022) - ((i7 & 2) | ((-10362931) - i7));
            int iA = y1.a(i8 | (-428181225), 2, i8, -428181225);
            int i9 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i10 = 0 - i3;
                    int length3 = bArr3.length;
                    int i11 = 0 - i10;
                    byte b2 = bArr3[(length3 & (~i11)) - ((~length3) & i11)];
                    int length4 = bArr3.length;
                    byte b3 = bArr4[((length4 | i10) - (((-1678010279) & (~i10)) & length4)) + ((i10 | (-1678010279)) & length4)];
                    bArr3[((length2 | i10) * 2) - (length2 ^ i10)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - b3)) - b2);
                    length = 4 - ((5 - i3) | (i3 & 2));
                    int i12 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    int i13 = i12 != 0 ? 2100390411 : -897645243;
                    if (i12 == 0) {
                        i = -2079636786;
                        i2 = i;
                    } else {
                        i2 = i13;
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i4 = 0;
                    i2 = i;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i14 = 0 - i3;
                    int i15 = ((length7 | i14) - (((-515406864) & (~i14)) & length7)) + ((i14 | (-515406864)) & length7);
                    byte b4 = bArr4[i15];
                    int length8 = bArr3.length;
                    byte b5 = bArr4[((i14 | length8) * 2) - (length8 ^ i14)];
                    int i16 = ((byte) 0) - b4;
                    int i17 = i16 | b5;
                    bArr4[i15] = (byte) (((byte) (((byte) i17) - ((byte) (((byte) 2) * ((byte) i16))))) + ((byte) ((b5 ^ i16) ^ i17)));
                    i2 = i9;
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i18 = i4 + 4 + (((-1) - i4) | (-4));
                    byte b6 = bArr4[i18];
                    int i19 = ((b6 & 16777216) * (b6 | 16777216)) + ((b6 & (-16777217)) * ((~b6) & 16777216));
                    int i20 = i4 & 2;
                    int i21 = (i4 + 2) - i20;
                    int i22 = bArr4[i21] & 255;
                    int i23 = i22 * ((~i22) & 65536);
                    int i24 = ~(((467314697 | (~i23)) | i19) - ((i23 & 467314697) | i19));
                    int i25 = (i4 + 1) - (i4 & 1);
                    int i26 = bArr4[i25] & 255;
                    int i27 = i26 * ((~i26) & 256);
                    int i28 = ~((i24 | ((~i27) | 1328859631)) - ((i27 & 1328859631) | i24));
                    int i29 = bArr4[i4] & 255;
                    int iA2 = J.a(i28, i29, 1, ((-1) - i28) | ((-1) - i29));
                    byte b7 = bArr3[i18];
                    int i30 = ((b7 & 16777216) * (b7 | 16777216)) + (((-16777217) & b7) * ((~b7) & 16777216));
                    int i31 = bArr3[i21] & 255;
                    int i32 = i31 * ((~i31) & 65536);
                    int iA3 = K.a((~i30) & 1647046022 & i32, i32, i30, (1647046022 | i30) & i32);
                    int i33 = bArr3[i25] & 255;
                    int i34 = i33 * ((~i33) & 256);
                    int i35 = ~((iA3 | ((~i34) | (-2059442874))) - (((-2059442874) & i34) | iA3));
                    int i36 = bArr3[i4] & 255;
                    int iA4 = J.a(i35, i36, 1, ((-1) - i35) | ((-1) - i36));
                    int i37 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i38 = (i37 + iA4) - ((i37 & iA4) * 2);
                    bArr3[i4] = (byte) i38;
                    bArr3[i25] = (byte) (i38 >>> 8);
                    bArr3[i21] = (byte) (i38 >>> 16);
                    bArr3[i18] = (byte) (i38 >>> 24);
                    i4 = (-11) - (((-15) - i4) | i20);
                    int length9 = bArr3.length;
                    int iA5 = C0001a.a(bArr3.length, 4, 0, 0);
                    int i39 = ((i4 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i4 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i2 = i39 != 0 ? -897645243 : 1251644638;
                    if (i39 != 0) {
                        i2 = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i40 = 0 - length;
                    i2 = (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i3 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i41 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i9 = i41 != 0 ? 2100390411 : -897645243;
                    if (i41 == 0) {
                        i = -2079636786;
                        i2 = i;
                    } else {
                        i2 = i9;
                    }
                    break;
                default:
                    i2 = -897645243;
                    break;
            }
            return;
        }
    }
}
