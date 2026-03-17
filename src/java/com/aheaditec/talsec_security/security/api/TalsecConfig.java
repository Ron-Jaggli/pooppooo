package com.aheaditec.talsec_security.security.api;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class TalsecConfig {
    public final String a;
    public final String[] b;
    public final String c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final String[][] g;
    public final String[] h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public static class Builder {
        public final String a;
        public final String[] b;
        public String c;
        public String[] d;
        public String[] e;
        public String[] f;
        public String[][] g;
        public String[] h;
        public boolean i = true;
        public boolean j = false;

        public Builder(String str, String[] strArr) {
            if (str == null) {
                byte[] bArr = {-39, 0, -127, 78, 78, 61, 84, -51, -13, 109, -111, -32, -76, 10, -46, -110, -103, 70, 26, 65, 39, -52, 96, 16, 21, -20, -70, -35};
                a(bArr, new byte[]{-100, 120, -15, 43, 45, 73, 49, -87, -93, 12, -14, -117, -43, 109, -73, -36, -8, 43, 127, 97, 78, -65, 64, 126, 96, -128, -42, -13});
                throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            a(strArr);
            this.a = str;
            this.b = strArr;
        }

        public static void a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                byte[] bArr = {-118, -111, 14, 56, -56, 92, -90, 57, -126, 50, 80, 68, 19, -31, 111, -69, -39, 45, -3, 109, -57, 113, 2, -33, -65, -55, -87, 28, -27, -51, 72, -79, 12, 102, 66, 110, -21, 101, -27, 115, -13, -37, -28, 10, -79, 81, 118, -128, 106, 76, -41, -103, 123, 90, -84, 41, -87, -74, -33, -42, -15, 93, -96, 51, 28, -19, -51};
                a(bArr, new byte[]{-49, -23, 126, 93, -85, 40, -61, 93, -94, 97, 57, 35, 125, -120, 1, -36, -7, 110, -104, 31, -77, 24, 100, -74, -36, -88, -35, 121, -59, -123, 41, -62, 100, 3, 49, 78, -118, 23, -128, 83, -99, -76, -112, 42, -43, 52, 16, -23, 4, 41, -77, -71, 18, 52, -116, 125, -56, -38, -84, -77, -110, 30, -49, 93, 122, -124, -86});
                throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            for (String str : strArr) {
                try {
                    if (Base64.decode(str, 2).length != 32) {
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr2 = {-105, 22, 6, -9, 58, 1, 27, 78, -118, 1, 82, -67, 74, 75, -13, 48, 79, -128, 87, -128, -37, -17, 30, 81, -23, 66, 87, 97, 61, 14, 59, -126, -25, 118, 50, -19, 127, 76, 94, 86, 92, -121, -25, -106, 5, -37, -25, -98, -25, -17, 64, -12, 54, 78, 95, -8, 38, -4, -25, 53, -99, -31, -116, -124, -69, -1};
                        a(bArr2, new byte[]{-46, 110, 118, -110, 89, 117, 126, 42, -86, 82, 59, -38, 36, 34, -99, 87, 111, -61, 50, -14, -81, -122, 120, 56, -118, 35, 35, 4, 29, 70, 90, -15, -113, 19, 65, -51, 28, 35, 48, 34, 61, -18, -119, -74, 108, -75, -111, -1, -117, -122, 36, -44, 83, 32, 43, -118, 95, -46, -57, 112, -13, -107, -2, -3, -101, -61});
                        Charset charset = StandardCharsets.UTF_8;
                        StringBuilder sbAppend = sb.append(new String(bArr2, charset).intern()).append(str);
                        byte[] bArr3 = {-100, 58, -36, 12, 76, -115, 105, -116, -85, -101, 45, 34, 117, -32, 127, -123, -71, 38, 58, -31, -35, 105, -36, -118, -64, -125, 35, 117, 74, -80, -105, -91, -68, -9, 119, 40, 88, -60, -13, -51, 123, -10, -94, -85, -43, 31, -96, 103, 73, 84, 15, 40, -86, -69, 114, -61, -127, 111, 64, 88, -22, 61, 102, 82, 44, 18, 111, 127, -22};
                        a(bArr3, new byte[]{-94, 26, -75, 127, 108, -29, 6, -8, -117, -56, 101, 99, 88, -46, 74, -77, -103, 84, 95, -111, -81, 12, -81, -17, -82, -9, 66, 1, 35, -33, -7, -123, -45, -111, 87, 92, 48, -95, -45, -66, 18, -111, -52, -62, -69, 120, -128, 4, 44, 38, 123, 65, -52, -46, 17, -94, -11, 10, 96, 49, -124, 29, 36, 51, 95, 119, 89, 75, -60});
                        throw new IllegalArgumentException(sbAppend.append(new String(bArr3, charset).intern()).toString());
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb2 = new StringBuilder();
                    byte[] bArr4 = {101, -99, -67, 0, -67, -59, 11, 1, 41, 106, 11, -116, -31, -4, -83, 38, 124, -23, 35, -95, -111, 31, -14, 25, -38, 89, 40, 24, 98, -117, -91, -77, 36, 10, -126, -2, -81, -72, -24, -46, -120, -107, -123, -128, 123, -7, -28, 123, -33, 54, -31, 59, -7, 92, 25, -65, -36, -76, 93, -77, -38, -10, -44, -25, -119, 41};
                    a(bArr4, new byte[]{32, -27, -51, 101, -34, -79, 110, 101, 9, 57, 98, -21, -113, -107, -61, 65, 92, -86, 70, -45, -27, 118, -108, 112, -71, 56, 92, 125, 66, -61, -60, -64, 76, 111, -15, -34, -52, -41, -122, -90, -23, -4, -21, -96, 18, -105, -110, 26, -77, 95, -123, 27, -100, 50, 109, -51, -91, -102, 125, -10, -76, -126, -90, -98, -87, 21});
                    Charset charset2 = StandardCharsets.UTF_8;
                    StringBuilder sbAppend2 = sb2.append(new String(bArr4, charset2).intern()).append(str);
                    byte[] bArr5 = {10, -67, -109, 83, 38, 31, 69, -105, 87, 109, -103, 24, -116, 96, -49, -75, -87, -15, -68, -10, 47, -101, 25, 80};
                    a(bArr5, new byte[]{52, -99, -6, 32, 6, 113, 42, -29, 119, 4, -9, 56, -50, 1, -68, -48, -97, -59, -100, -112, 64, -23, 116, 126});
                    throw new IllegalArgumentException(sbAppend2.append(new String(bArr5, charset2).intern()).toString(), e);
                }
            }
        }

        public String[] b() {
            return this.e;
        }

        public Builder blacklistedHashes(String[] strArr) {
            this.f = strArr;
            return this;
        }

        public Builder blacklistedPackageNames(String[] strArr) {
            this.e = strArr;
            return this;
        }

        public TalsecConfig build() {
            return new TalsecConfig(this);
        }

        public String c() {
            return this.a;
        }

        public String[] d() {
            return this.b;
        }

        public boolean e() {
            return this.i;
        }

        public boolean f() {
            return this.j;
        }

        public String[] g() {
            return this.d;
        }

        public String[][] h() {
            return this.g;
        }

        public String i() {
            return this.c;
        }

        public String[] j() {
            return this.h;
        }

        public Builder killOnBypass(boolean z) {
            this.j = z;
            return this;
        }

        public Builder prod(boolean z) {
            this.i = z;
            return this;
        }

        public Builder supportedAlternativeStores(String[] strArr) {
            this.d = strArr;
            return this;
        }

        public Builder suspiciousPermissions(String[][] strArr) {
            this.g = strArr;
            return this;
        }

        public Builder watcherMail(String str) {
            this.c = str;
            return this;
        }

        public Builder whitelistedInstallationSources(String[] strArr) {
            this.h = strArr;
            return this;
        }

        public String[] a() {
            return this.f;
        }

        public static void a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = null;
            int i = 0;
            int i2 = 0;
            int i3 = -1850458006;
            byte[] bArr4 = null;
            while (true) {
                int i4 = ((16777216 & i3) * (i3 | 16777216)) + (((-16777217) & i3) * ((~i3) & 16777216));
                int i5 = i3 >>> 8;
                int i6 = (i5 - 1) - ((~i4) | i5);
                int i7 = (-1700147435) - ((i6 & 2) | (2028104049 - i6));
                switch ((-1363443157) ^ ((~i7) + ((i7 | 1) * 2))) {
                    case -1940167324:
                        byte b = bArr3[i];
                        int i8 = ((byte) 0) - b;
                        bArr3[i] = (byte) (((byte) (b & (~i8))) - ((byte) ((~b) & i8)));
                        i3 = 614229416;
                        continue;
                    case -360299937:
                        boolean z = (((double) ((byte) bArr3[i2])) > Double.NaN ? 1 : (((double) ((byte) bArr3[i2])) == Double.NaN ? 0 : -1)) > -1;
                        i3 = z ? 614229416 : z ? -1396193641 : 427928065;
                        i = i2;
                        continue;
                    case 399486784:
                        return;
                    case 585276366:
                        i3 = bArr.length > 0 ? 1985663266 : -1396193641;
                        bArr4 = bArr;
                        bArr3 = bArr2;
                        i2 = 0;
                        continue;
                    case 1733787683:
                        byte b2 = bArr4[i];
                        byte b3 = bArr3[i];
                        bArr4[i] = (byte) (((byte) (b3 + b2)) - ((byte) (((byte) 2) * ((byte) (b3 & b2)))));
                        i2 = (i ^ 1) + ((i & 1) * 2);
                        if ((((i2 > bArr4.length ? 1 : (i2 == bArr4.length ? 0 : -1)) >>> 31) & 1) != 0) {
                            i3 = 1985663266;
                        }
                        break;
                }
                i3 = -1396193641;
            }
        }
    }

    public TalsecConfig(Builder builder) {
        this.a = builder.c();
        this.b = builder.d();
        this.c = builder.i();
        this.d = builder.g();
        this.e = builder.b();
        this.f = builder.a();
        this.g = builder.h();
        this.h = builder.j();
        this.i = builder.e();
        this.j = builder.f();
    }

    public String[] getBlacklistedHashes() {
        return this.f;
    }

    public String[] getBlacklistedPackageNames() {
        return this.e;
    }

    public String getExpectedPackageName() {
        return this.a;
    }

    public String[] getExpectedSigningCertificateHashes() {
        return this.b;
    }

    public boolean getKillOnBypass() {
        return this.j;
    }

    public String[] getSupportedAlternativeStores() {
        return this.d;
    }

    public String[][] getSuspiciousPermissions() {
        return this.g;
    }

    public String getWatcherMail() {
        return this.c;
    }

    public String[] getWhitelistedInstallationSources() {
        return this.h;
    }

    public boolean isProd() {
        return this.i;
    }
}
