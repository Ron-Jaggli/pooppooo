package com.aheaditec.talsec.security;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.biometric.BiometricManager;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0036l0 {
    public static final String p;
    public final BiometricManager a;
    public final I0 b;
    public final F0 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    static {
        byte[] bArr = {30, -122, 118, 71, -123};
        a(bArr, new byte[]{-89, 1, -102, -58, -9, -118, -77, 77});
        p = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0036l0(android.content.Context r4) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.C0036l0.<init>(android.content.Context):void");
    }

    public final String a(Context context) {
        String str;
        int i = -1;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {-67, -112, -16, -44, 123, 30, 5, -115, 63, 109, 30};
            a(bArr, new byte[]{0, 26, 0, 104, 122, 98, 22, -115, 83, 8, 122});
            i = Settings.Global.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), -1);
        } catch (Exception unused) {
        }
        if (i == 0) {
            byte[] bArr2 = {-103, 5, 81, -122, 108};
            a(bArr2, new byte[]{91, -110, -82, -101, 9, 59, -3, 54});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else if (i != 1) {
            byte[] bArr3 = {2, 115, 62, 115, 18, -13, -119, 111, -84};
            a(bArr3, new byte[]{-45, 14, -44, -80, -48, -119, -107, -76, -56});
            str = new String(bArr3, StandardCharsets.UTF_8);
        } else {
            byte[] bArr4 = {-85, 105, 66, -109};
            a(bArr4, new byte[]{59, 37, -63, -112, 36, -97, -82, 109});
            str = new String(bArr4, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public String b() {
        return this.h;
    }

    public String c() {
        BiometricManager biometricManager = this.a;
        if (biometricManager == null) {
            return null;
        }
        try {
            int iCanAuthenticate = biometricManager.canAuthenticate(p1.h);
            if (iCanAuthenticate == 0) {
                byte[] bArr = {-29, -93, 4, 77, -83, 0};
                a(bArr, new byte[]{-26, -14, 2, -58, -37, 101, 64, 79});
                return new String(bArr, StandardCharsets.UTF_8).intern();
            }
            if (iCanAuthenticate != 1) {
                if (iCanAuthenticate == 11) {
                    byte[] bArr2 = {28, -32, 97, -94, -90, 56, -82, -66, -93, -35, -20, -14};
                    a(bArr2, new byte[]{-82, -94, -67, 97, 15, 72, 82, 78, 43, -89, 59, 49});
                    return new String(bArr2, StandardCharsets.UTF_8).intern();
                }
                if (iCanAuthenticate != 12) {
                    byte[] bArr3 = {-65, 64, 120, 63, -71};
                    a(bArr3, new byte[]{6, 92, -104, -50, -53, 72, -111, 63});
                    return new String(bArr3, StandardCharsets.UTF_8).intern();
                }
            }
            byte[] bArr4 = {31, -22, -47, -56, -73, 27, 114, -114, -43, 40};
            a(bArr4, new byte[]{-83, -72, 11, 74, 41, 109, -109, -111, -89, 77});
            return new String(bArr4, StandardCharsets.UTF_8).intern();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public String d() {
        return this.l;
    }

    public final String e() {
        byte[] bArr = {-12, 60, -121, 79, 14, 60, -111, 1, 102, 109, -18, 48, 32, 105, 3, -95, -81, 15, -37, 18, -72, -106, -119};
        a(bArr, new byte[]{-1, 79, -115, -63, -64, 70, 115, 68, 120, 52, 78, -15, -85, 57, 1, 45, 32, -104, 32, 28, -42, -29, -15});
        return a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public String f() {
        return this.j;
    }

    public final String g() {
        byte[] bArr = {-91, -53, -27, 22, -70, 44, -8, 21, -127, 87, -39, 101, -55, -52, 13, 83, 94, -125, -56, 106, 114, 18, 124, 103};
        a(bArr, new byte[]{46, -36, 35, 9, 44, 117, 26, 88, 87, 42, 101, -86, 24, -45, 19, -47, 44, 2, 95, -95, 127, 110, -101, -79});
        return a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.c.a().toString();
    }

    public String l() {
        String str;
        I0 i0 = this.b;
        if (i0 == null) {
            byte[] bArr = {-107, -35, 99, -53, 49};
            a(bArr, new byte[]{92, -71, -89, 66, 67, 5, 37, -49});
            return new String(bArr, StandardCharsets.UTF_8).intern();
        }
        if (i0.a()) {
            byte[] bArr2 = {93, -121, 70, -20, 18, -9};
            a(bArr2, new byte[]{109, 26, -37, 37, 119, -109, 102, 112});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else {
            byte[] bArr3 = {-54, 57, 76, 65, -57, 69, 33, -22};
            a(bArr3, new byte[]{27, 73, -46, -52, 8, 88, -10, 40});
            str = new String(bArr3, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public final String m() {
        byte[] bArr = {60, 70, 53, 25, 80, 77, -107, 103, 0, 29};
        a(bArr, new byte[]{-121, 86, -45, 30, -102, 92, 104, -72, 99, 120});
        return a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public final String n() {
        return Build.VERSION.SECURITY_PATCH;
    }

    public String o() {
        return this.i;
    }

    public String p() {
        return this.n;
    }

    public String q() {
        return this.o;
    }

    public String r() {
        return this.m;
    }

    public String s() {
        return this.k;
    }

    public final String t() {
        byte[] bArr = {122, 16, 97, 122, 6, -98, -92, 99, -43, -52, 11, 99, 85, -106, -122, -91, 35, 19, -44, -68, -6, 93, 53};
        a(bArr, new byte[]{49, -115, -85, -81, -123, -19, 101, -23, 10, -33, 17, -84, -105, -10, -128, 40, -94, 110, 32, 112, -120, 62, 80});
        Charset charset = StandardCharsets.UTF_8;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(new String(bArr, charset).intern())));
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    byte[] bArr2 = {32, 20, -102, 51};
                    a(bArr2, new byte[]{-86, 110, 98, -13, -59, 123, -106, -83});
                    String strIntern = new String(bArr2, charset).intern();
                    bufferedReader.close();
                    return strIntern;
                }
                byte[] bArr3 = {127};
                a(bArr3, new byte[]{79, 83, -65, -49, 82, 37, 112, -14});
                if (line.contains(new String(bArr3, charset).intern())) {
                    byte[] bArr4 = {-83, -126, 115, 69, -38, 43, -55, -110, -101, -91};
                    a(bArr4, new byte[]{33, 21, -105, -54, 23, 106, 72, -100, -19, -64});
                    String strIntern2 = new String(bArr4, charset).intern();
                    bufferedReader.close();
                    return strIntern2;
                }
                byte[] bArr5 = {66};
                a(bArr5, new byte[]{115, 7, 78, 26, 117, 79, -58, 52});
                if (line.contains(new String(bArr5, charset).intern())) {
                    byte[] bArr6 = {-70, 23, -76, 94, -102, -120, -50, -73, 64};
                    a(bArr6, new byte[]{59, 107, 64, -82, 76, 21, 41, 116, 39});
                    String strIntern3 = new String(bArr6, charset).intern();
                    bufferedReader.close();
                    return strIntern3;
                }
                byte[] bArr7 = {-84, -33, 86, 90, -61, -123, 63};
                a(bArr7, new byte[]{37, -93, -93, -46, -84, -14, 81, -19});
                String strIntern4 = new String(bArr7, charset).intern();
                bufferedReader.close();
                return strIntern4;
            } finally {
            }
        } catch (IOException unused) {
            byte[] bArr8 = {-31, 98, -34, 69, -22};
            a(bArr8, new byte[]{-32, 34, 34, -57, -104, -13, -12, 3});
            return new String(bArr8, StandardCharsets.UTF_8).intern();
        }
    }

    public String a() {
        return this.g;
    }

    public final String b(String str) {
        String str2;
        try {
            byte[] bArr = {58, -13, -115, -43, 83, -27, 127, -31, 66, -122, -35, -108, -105, -97, -96, -55, -124, 3};
            a(bArr, new byte[]{-65, -114, -101, 69, -104, -69, -107, 109, -119, 0, 97, -92, 126, -63, 123, 66, -15, 123});
            return String.valueOf(((Boolean) Class.forName(new String(bArr, StandardCharsets.UTF_8).intern()).getMethod(str, new Class[0]).invoke(null, new Object[0])).booleanValue());
        } catch (Error unused) {
            byte[] bArr2 = {-29, 105, 47, -24, 85};
            a(bArr2, new byte[]{-30, 37, -45, 37, 39, -98, -97, -111});
            str2 = new String(bArr2, StandardCharsets.UTF_8);
            return str2.intern();
        } catch (Exception unused2) {
            byte[] bArr3 = {-123, 6, -95, 114, -112};
            a(bArr3, new byte[]{76, -122, 96, -70, -30, -90, -7, 8});
            str2 = new String(bArr3, StandardCharsets.UTF_8);
            return str2.intern();
        }
    }

    public final boolean c(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            byte[] bArr = {57, -32, 48, 8, 111, -78, 54, -113, 45, -49, 33, -113, -17, 105, -87};
            a(bArr, new byte[]{-66, -94, -49, 68, 123, -43, -55, -122, -76, -43, -67, -103, -104, 0, -51});
            return packageManager.getPackageInfo(new String(bArr, StandardCharsets.UTF_8).intern(), AbstractC0023h.n) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final String d(Context context) {
        String str;
        int i = -1;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {-40, 101, 33, -31, -89, 43, -107, -70, -84};
            a(bArr, new byte[]{29, 38, -25, 44, 20, 109, 110, 112, -55});
            i = Settings.Global.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), -1);
        } catch (Exception unused) {
        }
        if (i == 0) {
            byte[] bArr2 = {98, 99, -7, -2, 119};
            a(bArr2, new byte[]{96, 48, 7, 18, 18, -43, 35, -88});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else if (i != 1) {
            byte[] bArr3 = {-99, -128, -103, -128, 97, -105, -64, 83, -126};
            a(bArr3, new byte[]{52, 0, 111, -122, 99, -20, 92, -45, -26});
            str = new String(bArr3, StandardCharsets.UTF_8);
        } else {
            byte[] bArr4 = {111, 64, -48, -53};
            a(bArr4, new byte[]{103, 92, 55, 75, 20, 85, 96, -87});
            str = new String(bArr4, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public final String e(Context context) {
        String str;
        int i = -1;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {81, 115, 9, -100, -1, -128, -31, 79, 81, -100, 21, -93, 78, 75};
            a(bArr, new byte[]{-108, 21, 15, -111, -4, 26, 58, -33, -112, -42, -3, 106, 32, 46});
            i = Settings.Global.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), -1);
        } catch (Exception unused) {
        }
        if (i == 0) {
            byte[] bArr2 = {-82, -124, -52, 36, 103};
            a(bArr2, new byte[]{52, 19, 82, -12, 2, 76, -63, 119});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else if (i != 1) {
            byte[] bArr3 = {112, -57, -69, 105, 115, -80, -55, -44, 122};
            a(bArr3, new byte[]{97, -37, 73, -87, 113, -9, 85, 82, 30});
            str = new String(bArr3, StandardCharsets.UTF_8);
        } else {
            byte[] bArr4 = {73, -77, -8, -72};
            a(bArr4, new byte[]{-103, -46, 31, 126, 79, -100, 86, 107});
            str = new String(bArr4, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public final String a(String str) {
        String str2;
        try {
            String strC = C1.c(str);
            if (strC != null) {
                if (!strC.isEmpty()) {
                    return strC;
                }
            }
            byte[] bArr = {-98, 5, 57, -47};
            a(bArr, new byte[]{44, -100, -60, 86, 90, -44, -122, -12});
            str2 = new String(bArr, StandardCharsets.UTF_8);
        } catch (Exception unused) {
            byte[] bArr2 = {56, -87, 53, 27, 18};
            a(bArr2, new byte[]{-71, -28, -43, 18, 96, 87, 37, -37});
            str2 = new String(bArr2, StandardCharsets.UTF_8);
        }
        return str2.intern();
    }

    public final boolean b(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
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
