package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0007b1 {
    public static volatile C0007b1 b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public final InterfaceC0051t0 a;

    static {
        byte[] bArr = {-116, -127, 102, 48, -23, -100, 107, 115, -78, -125, 113, -15, 36, 80, 89, -35, -75};
        a(bArr, new byte[]{-2, -28, 5, 95, -101, -8, 2, 29, -43, -36, 18, -98, 81, 62, 45, -72, -57});
        Charset charset = StandardCharsets.UTF_8;
        f = new String(bArr, charset).intern();
        byte[] bArr2 = {-28, -57, 7, 108, 71, -93, 0, -8, -10, 51, 49, -60, 63, -69, -52, 70, -115, -37};
        a(bArr2, new byte[]{-105, -92, 117, 9, 34, -51, 115, -112, -103, 71, 110, -89, 80, -50, -94, 50, -24, -87});
        e = new String(bArr2, charset).intern();
        byte[] bArr3 = {47, -77, 78, -66, 46, -47, -96, 15, -6, -38, 66, -96, 20, -122, 35, -55, 20, -60, -123};
        a(bArr3, new byte[]{67, -46, 61, -54, 113, -93, -59, 108, -107, -88, 38, -55, 122, -31, 124, -83, 117, -80, -32});
        d = new String(bArr3, charset).intern();
        byte[] bArr4 = {76, 21, 1, -115, -118, -49, 14, -4, -35, 81, -23, 47, -128, -1, -4, -1, -73, -44, 21, -27};
        a(bArr4, new byte[]{32, 116, 114, -7, -43, -68, 109, -114, -72, 52, -121, 92, -24, -112, -120, -96, -45, -75, 97, -128});
        c = new String(bArr4, charset).intern();
    }

    public C0007b1(InterfaceC0051t0 interfaceC0051t0) {
        this.a = interfaceC0051t0;
    }

    public static C0007b1 a(InterfaceC0051t0 interfaceC0051t0) {
        if (b == null) {
            synchronized (C0007b1.class) {
                if (b == null) {
                    b = new C0007b1(interfaceC0051t0);
                }
            }
        }
        return b;
    }

    public Long b() {
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {54, 125, 43, -27, -36, -79, 16, 101, -77, -34, -107, 22, -56, -18, -54, 121, -1, 71, 83, 89};
        a(bArr, new byte[]{90, 28, 88, -111, -125, -62, 115, 23, -42, -69, -5, 101, -96, -127, -66, 38, -101, 38, 39, 60});
        String strA = interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern());
        if (strA != null) {
            return Long.valueOf(Long.parseLong(strA));
        }
        return null;
    }

    public int c() {
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {88, -46, 14, 87, 77, -85, 70, -55, -35, 45, 127, 88, 120, -128, 94, -12, -30};
        a(bArr, new byte[]{42, -73, 109, 56, 63, -49, 47, -89, -70, 114, 28, 55, 13, -18, 42, -111, -112});
        String strA = interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern());
        if (strA != null) {
            return Integer.parseInt(strA);
        }
        return 0;
    }

    public int d() {
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {50, 41, 101, -9, -94, 98, -83, 125, -6, -48, -114, 114, 101, -72, 58, -128, 100, 26};
        a(bArr, new byte[]{65, 74, 23, -110, -57, 12, -34, 21, -107, -92, -47, 17, 10, -51, 84, -12, 1, 104});
        String strA = interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern());
        if (strA != null) {
            return Integer.parseInt(strA);
        }
        return 0;
    }

    public int e() {
        i();
        int iC = c() + 1;
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {103, 68, 1, -42, -72, 66, 101, -18, 57, 93, -48, -70, 78, -7, -126, 75, 78};
        a(bArr, new byte[]{21, 33, 98, -71, -54, 38, 12, -128, 94, 2, -77, -43, 59, -105, -10, 46, 60});
        interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern(), String.valueOf(iC));
        return iC;
    }

    public int f() {
        j();
        int iD = d() + 1;
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {-75, -76, -65, -8, -34, 107, -6, -28, 95, -46, 122, 121, 84, -60, -4, -4, 115, -72};
        a(bArr, new byte[]{-58, -41, -51, -99, -69, 5, -119, -116, 48, -90, 37, 26, 59, -79, -110, -120, 22, -54});
        interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern(), String.valueOf(iD));
        return iD;
    }

    public void g() {
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {-116, 103, 24, 80, 34, 49, -79, 122, 78, 52, -70, -98, 121, 48, -11, 0, -55};
        a(bArr, new byte[]{-2, 2, 123, 63, 80, 85, -40, 20, 41, 107, -39, -15, 12, 94, -127, 101, -69});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {47};
        a(bArr2, new byte[]{31, 12, -113, -27, 93, 73, -120, -79});
        interfaceC0051t0.a(strIntern, new String(bArr2, charset).intern());
    }

    public void h() {
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {-9, 2, 60, -3, 89, 125, -59, 48, 79, 1, 94, -113, -57, -46, 30, -100, 106, 29};
        a(bArr, new byte[]{-124, 97, 78, -104, 60, 19, -74, 88, 32, 117, 1, -20, -88, -89, 112, -24, 15, 111});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {101};
        a(bArr2, new byte[]{85, 114, 111, 2, 87, -54, -102, 43});
        interfaceC0051t0.a(strIntern, new String(bArr2, charset).intern());
    }

    public long i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {-15, 26, 48, 16, 12, -30, 82, 107, -23, -110, -107, 98, -113, 91, -19, 40, -121, 35, -101};
        a(bArr, new byte[]{-99, 123, 67, 100, 83, -112, 55, 8, -122, -32, -15, 11, -31, 60, -78, 76, -26, 87, -2});
        interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern(), String.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public long j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {89, 14, 123, -64, -57, -104, -80, 86, -91, 40, -14, -28, 125, 1, -16, -18, -42, -33, -14, 45};
        a(bArr, new byte[]{53, 111, 8, -76, -104, -21, -45, 36, -64, 77, -100, -105, 21, 110, -124, -79, -78, -66, -122, 72});
        interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern(), String.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public Long a() {
        InterfaceC0051t0 interfaceC0051t0 = this.a;
        byte[] bArr = {-8, -107, -72, 7, 0, -63, 37, 64, -75, -11, 32, 121, -54, 39, 61, 7, -87, 10, 12};
        a(bArr, new byte[]{-108, -12, -53, 115, 95, -77, 64, 35, -38, -121, 68, 16, -92, 64, 98, 99, -56, 126, 105});
        String strA = interfaceC0051t0.a(new String(bArr, StandardCharsets.UTF_8).intern());
        if (strA != null) {
            return Long.valueOf(Long.parseLong(strA));
        }
        return null;
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
