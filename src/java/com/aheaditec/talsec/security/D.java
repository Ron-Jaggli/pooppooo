package com.aheaditec.talsec.security;

import android.os.Build;
import com.aheaditec.talsec.security.A;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class D {
    public static final D a;
    public static final String b;
    public static final int c = 16;
    public static final String d;

    static {
        byte[] bArr = {28, -80, 82};
        a(bArr, new byte[]{93, -11, 1, 46, 13, -21, -68, -5});
        Charset charset = StandardCharsets.UTF_8;
        d = new String(bArr, charset).intern();
        byte[] bArr2 = {-44, -17, -92, -17, 19, 68, 40, -98, 106, 111, 14, -96, 122, -114, -18, -93, -47, 102, 78, 27, -114, 2, -79, -86, 40, 119, 97, 105, 101, -21, 15, -72, 48, -4, 39, -17, -77, 66, 96, -96, -118, -19, -36, -8, 89, -77, 69, 41, 46, 74, 8, -124, -67, -58, -58, -117, 88, -32, -113, 107, -55, 40, -49, -108};
        a(bArr2, new byte[]{-25, -34, -57, -118, 36, 118, 78, -81, 12, 90, 104, -111, 77, -21, -118, -64, -23, 86, 124, 34, -74, 51, -120, -49, 24, 17, 0, 11, 92, -36, 55, -117, 83, -97, 23, -33, -124, 122, 88, -103, -24, -43, -18, -102, 104, -123, 125, 24, 31, 115, 49, -75, -116, -2, -93, -19, 108, -122, -67, 94, -4, 29, -5, -89});
        b = new String(bArr2, charset).intern();
        a = new D();
    }

    public final InterfaceC0060y a(String str, KeyStore keyStore) {
        return new A(a(str), keyStore);
    }

    public final InterfaceC0060y b(String str, KeyStore keyStore) {
        return new B(a(str), keyStore);
    }

    public final InterfaceC0060y c(String str, KeyStore keyStore) {
        return new C(a(str), keyStore);
    }

    public final InterfaceC0060y a() throws C0031j1 {
        KeyStore keyStoreB = b();
        if (Build.VERSION.SDK_INT >= 31) {
            byte[] bArr = {11, -68, 62, -15, -13, 42, 39, -93, -46, -88, 125, 33, 62, -77, -124, 49, 60, 11, -51, 56, -115, -76, 102, 5, 41, 66, 65, 105, -98, 38, 12, 102, -93, 37, 22, -51, -51, -78, 116, -48, -121, -24, 30, -128, 61, -38, -85, -69, 53, 55, -124, -91, 121, 60, 122, -97, -117, 23, 87, -60, 46, 59, -33, 117};
            a(bArr, new byte[]{56, -115, 93, -108, -60, 24, 65, -110, -76, -99, 27, 16, 9, -42, -32, 82, 4, 59, -1, 1, -75, -123, 95, 96, 25, 36, 32, 11, -89, 17, 52, 85, -64, 70, 38, -3, -6, -118, 76, -23, -27, -48, 44, -30, 12, -20, -109, -118, 4, 14, -67, -108, 72, 4, 31, -7, -65, 113, 101, -15, 27, 14, -21, 70});
            return new C(a(new String(bArr, StandardCharsets.UTF_8).intern()), keyStoreB);
        }
        byte[] bArr2 = {-122, -104, 3, 103, -106, -35, -114, 114, -31, 110, -46, 104, 48, -93, 90, 120, -89, 123, -107, 72, -54, -105, 55, -93, 97, 13, -54, 123, -84, -61, -32, 124, -81, 11, 27, 111, -28, -108, -96, -9, -20, -68, -33, -40, -64, -49, 22, 33, -29, -69, -106, -12, -119, -83, 81, -65, 89, 69, -107, -25, 121, -120, -110, 126};
        a(bArr2, new byte[]{-75, -87, 96, 2, -95, -17, -24, 67, -121, 91, -76, 89, 7, -58, 62, 27, -97, 75, -89, 113, -14, -90, 14, -58, 81, 107, -85, 25, -107, -12, -40, 79, -52, 104, 43, 95, -45, -84, -104, -50, -114, -124, -19, -70, -15, -7, 46, 16, -46, -126, -81, -59, -72, -107, 52, -39, 109, 35, -89, -46, 76, -67, -90, 77});
        return new B(a(new String(bArr2, StandardCharsets.UTF_8).intern()), keyStoreB);
    }

    public final KeyStore b() throws C0031j1 {
        try {
            byte[] bArr = {-119, 125, 6, 25, 107, 123, -14, 17, 73, -12, 123, -84, -2, -27, 94};
            a(bArr, new byte[]{-56, 19, 98, 107, 4, 18, -106, 90, 44, -115, 40, -40, -111, -105, 59});
            KeyStore keyStore = KeyStore.getInstance(new String(bArr, StandardCharsets.UTF_8).intern());
            keyStore.load(null);
            Intrinsics.checkNotNull(keyStore);
            return keyStore;
        } catch (IOException e) {
            byte[] bArr2 = {-103, -43, -79, 109, -31, -93, -107, -62, -124, 96, -70, -122, -72, 119, 21, 70, 80, -106, 53, -11, -13, 11, -117};
            a(bArr2, new byte[]{-36, -89, -61, 2, -109, -125, -30, -86, -19, 12, -33, -90, -44, 24, 116, 34, 57, -8, 82, -43, -78, 64, -40});
            throw new C0031j1(C0031j1.b, new String(bArr2, StandardCharsets.UTF_8).intern(), e);
        } catch (KeyStoreException e2) {
            byte[] bArr3 = {-125, -44, -49, 97, 92, -105, -56, -38, -93, -114, -124, -98, -3, -25, 60, -110, 97, -4, 35, 32, 90, 25, -122};
            a(bArr3, new byte[]{-58, -90, -67, 14, 46, -73, -65, -78, -54, -30, -31, -66, -111, -120, 93, -10, 8, -110, 68, 0, 27, 82, -43});
            throw new C0031j1(C0031j1.b, new String(bArr3, StandardCharsets.UTF_8).intern(), e2);
        } catch (NoSuchAlgorithmException e3) {
            byte[] bArr4 = {64, 92, -30, -126, 102, -25, 73, -91, -80, 48, -110, 125, 14, 84, 95, -44, 61, -43, -41, 46, -29, 70, -128};
            a(bArr4, new byte[]{5, 46, -112, -19, 20, -57, 62, -51, -39, 92, -9, 93, 98, 59, 62, -80, 84, -69, -80, 14, -94, 13, -45});
            throw new C0031j1(C0031j1.b, new String(bArr4, StandardCharsets.UTF_8).intern(), e3);
        } catch (CertificateException e4) {
            byte[] bArr5 = {106, -84, 7, -81, -116, 70, -18, 105, 85, 124, -99, 17, -73, 118, -20, 127, -106, 3, 32, 82, -106, 12, -105};
            a(bArr5, new byte[]{47, -34, 117, -64, -2, 102, -103, 1, 60, 16, -8, 49, -37, 25, -115, 27, -1, 109, 71, 114, -41, 71, -60});
            throw new C0031j1(C0031j1.b, new String(bArr5, StandardCharsets.UTF_8).intern(), e4);
        }
    }

    public final A.a a(String str) {
        byte[] bArr = {-45, 77, 65};
        a(bArr, new byte[]{-110, 8, 18, 47, 102, -79, 100, 27});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {81, -24, -90};
        a(bArr2, new byte[]{18, -86, -27, -35, 99, -109, 42, -61});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {28, 112, -111, 22, 118, 34, 33, -82, 15};
        a(bArr3, new byte[]{82, 31, -63, 119, 18, 70, 72, -64, 104});
        return new A.a(str, 16, strIntern, 1, strIntern2, new String(bArr3, charset).intern());
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
                    byte b2 = bArr3[i];
                    int i8 = ((byte) 0) - b2;
                    bArr3[i] = (byte) (((byte) (b2 & (~i8))) - ((byte) ((~b2) & i8)));
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
                    byte b3 = bArr4[i];
                    byte b4 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b4 + b3)) - ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
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
