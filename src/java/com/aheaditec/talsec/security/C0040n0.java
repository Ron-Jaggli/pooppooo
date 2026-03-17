package com.aheaditec.talsec.security;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.aheaditec.talsec.security.AbstractC0017f;
import com.aheaditec.talsec.security.C0044p0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0040n0 extends AbstractC0026i {
    public C0040n0(R0 r0, u1 u1Var, E1 e1) {
        super(r0, u1Var, e1);
    }

    public final boolean a(String str, String[] strArr, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {18, 52, -74, -117, 74, -29, -13, 31};
        c(bArr, new byte[]{-47, 68, 92, -98, -100, -65, 21, -94});
        String strB = C1.b(sb.append(new String(bArr, StandardCharsets.UTF_8).intern()).append(str).toString());
        if (strB == null) {
            return false;
        }
        for (String str3 : strArr) {
            if (strB.equalsIgnoreCase(str3)) {
                if (z) {
                    b(str2, str3);
                    return true;
                }
                c(str2, str3);
                return true;
            }
        }
        return false;
    }

    public final boolean b(U0 u0, String str) {
        if (str.isEmpty()) {
            return false;
        }
        byte[] bArr = {-79, -82, 20, -123, -16, 50, 82, -11, -71, -119, -19, -45, -119, -94, -31, -29, 71, 44, -108, -65, 75, -58, -82, -5, 76, -70, 111, -75, -63, 87, 117, 39, 107, -11};
        c(bArr, new byte[]{54, -12, -29, -124, -1, 112, -74, 56, 45, 18, 45, 66, 84, -57, 59, 47, -120, 113, 79, 81, -96, -35, 76, 39, -65, -55, -92, 122, 16, 41, -122, -3, 4, -121});
        c(new String(bArr, StandardCharsets.UTF_8).intern(), u0.a);
        return true;
    }

    public final TelephonyManager c(Context context) {
        return null;
    }

    public final boolean c(TelephonyManager telephonyManager) {
        String subscriberId = telephonyManager.getSubscriberId();
        byte[] bArr = {42, 43, -116, -75, -61, -47, 114, 73, 8, -117, 63, 75, -55, 32, -83};
        c(bArr, new byte[]{-3, 41, -50, 37, 81, -113, -44, -101, -100, 72, -127, -99, -7, 16, -99});
        Charset charset = StandardCharsets.UTF_8;
        if (!(subscriberId == null ? false : subscriberId.contains(new String(bArr, charset).intern()))) {
            return false;
        }
        byte[] bArr2 = {-28, 120, -37, 102, -61, -82, 123, 72, -30, 121, -120, -117, 35, 121, 72, -55};
        c(bArr2, new byte[]{-21, 14, 40, -86, 12, -49, -104, -56, -11, 21, -109, -113, -94, 20, -13, 79});
        c(new String(bArr2, charset).intern(), telephonyManager.getSubscriberId());
        return true;
    }

    public final boolean d(TelephonyManager telephonyManager) {
        String voiceMailNumber = telephonyManager.getVoiceMailNumber();
        byte[] bArr = {-51, 107, 25, -123, -54, 5, 12, -76, -84, -52, -48};
        c(bArr, new byte[]{64, 108, -66, -46, 92, -62, 74, 35, -100, -8, -23});
        Charset charset = StandardCharsets.UTF_8;
        if (!(voiceMailNumber == null ? false : voiceMailNumber.contains(new String(bArr, charset).intern()))) {
            return false;
        }
        byte[] bArr2 = {-90, -105, -28, -14, 123, 36, -96, 63, 121, 27, -15, -110, -3, 11, -108, 33, 16, -27, -30, -42};
        c(bArr2, new byte[]{41, -19, 51, 54, 116, 68, 125, -53, 126, 108, 46, -108, -56, -107, 75, -15, -39, -80, 49, 75});
        c(new String(bArr2, charset).intern(), telephonyManager.getVoiceMailNumber());
        return true;
    }

    public final boolean e() {
        byte[] bArr = {23, 14, -111, -68, -52, 13, -26, -63, 78, -63, 18, 35, -114, -79, -114, -104, 38};
        c(bArr, new byte[]{-108, -117, 112, 112, 19, -44, 36, 65, -98, -56, -85, -26, 85, -19, 111, -114, 86});
        Charset charset = StandardCharsets.UTF_8;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new String(bArr, charset).intern()));
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    byte[] bArr2 = {98, 30, 36, -88, 57, -128, -93, -80, -53};
                    c(bArr2, new byte[]{60, 97, -13, 103, -78, 31, 108, 41, -28});
                    if (line.contains(new String(bArr2, charset).intern())) {
                        byte[] bArr3 = {67, -109, 40, 47, 123, -59, -117, -69, -117, -43, 29, 118, 114, -3, -98, -93, -69};
                        c(bArr3, new byte[]{-124, -24, -1, -14, 116, -16, -110, 115, 91, -79, -32, -76, 81, -103, 127, 115, -53});
                        String strIntern = new String(bArr3, charset).intern();
                        byte[] bArr4 = {-118, 120, -24, -72};
                        c(bArr4, new byte[]{90, 20, 47, 126, -56, 81, -2, 6});
                        b(strIntern, new String(bArr4, charset).intern());
                        bufferedReader.close();
                        return true;
                    }
                }
                bufferedReader.close();
                return false;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean f() {
        byte[] bArr = {-28, 8, -111, -30, -86, 26, -107, -91, -124, -78, -87, 126, 61};
        c(bArr, new byte[]{-89, -122, 112, 42, 45, 39, 100, 120, 93, -55, 117, -121, 82});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {37, 92, 28, -126, 23, -113, 18, 100, 107, -64, -106, 31};
        c(bArr2, new byte[]{-86, 33, -21, -121, -48, 63, -12, -77, 70, -64, 110, -19});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {20, 32, 96, -29, 12, -49, -112, -22, 16, 82};
        c(bArr3, new byte[]{-48, 116, -94, 32, -62, -54, 107, 62, 127, 32});
        return a(strIntern, strIntern2, new String(bArr3, charset).intern());
    }

    public final boolean g() {
        byte[] bArr = {118, 94, -107, -122, -103, 64, 97, -109, -40, -114, 52, 50, -53, 6, 16, -6, 13, -76, -13, 27, 89, -104};
        c(bArr, new byte[]{104, 35, 41, -103, 79, 65, -73, -128, 31, 8, -120, -9, 31, -127, -81, 61, -45, -56, 9, 23, 42, -20});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        String[] strArr = C0038m0.E;
        byte[] bArr2 = {-34, -65, -122, -53, -37, -67, -97, 5, 118, 6, -6, 33, -103, 0, 6, -128};
        c(bArr2, new byte[]{-31, -59, -99, 78, 20, -18, 124, 29, 118, -107, 31, -21, 79, -81, 21, -117});
        return a(strIntern, strArr, new String(bArr2, charset).intern(), true);
    }

    public final boolean h() {
        byte[] bArr = {-10, 10, 46, -40, 12, -124, 36, -68, -69, -62, 117, -43, 86, 72, 86, -94, -59, 19, -32, -51};
        c(bArr, new byte[]{-24, -105, -79, 94, -47, 29, -32, 119, 52, -98, -111, 90, -44, 92, -69, 101, 71, 96, 32, 93});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-4, 104, 109};
        c(bArr2, new byte[]{-124, 80, 91, 33, -58, 74, 84, -35});
        String[] strArr = {new String(bArr2, charset).intern()};
        byte[] bArr3 = {-40, 44, 45, 82, -18, 38, -109, 104, 96, 37, 48, 75, 88, -103, 27, 43};
        c(bArr3, new byte[]{31, 114, -6, -41, -7, 81, 104, -66, 104, 114, -42, -62, -114, -57, -1, -32});
        return a(strIntern, strArr, new String(bArr3, charset).intern(), true);
    }

    public final boolean i() {
        byte[] bArr = {29, -10, 55, 119, 61, 90, -85, -55, -116, 118, -116, -19, 40, 111, -98, -25, 99, 4, -31, -61, 68, -50};
        c(bArr, new byte[]{-77, -116, -121, -67, -128, 43, 107, 69, 91, 74, -120, 34, -30, 53, 99, 43, 41, -109, 32, 75, 114, -6});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {87, -125, 13, -49, 71, 111};
        c(bArr2, new byte[]{-125, 72, 73, 110, 113, 91, -128, 101});
        String[] strArr = {new String(bArr2, charset).intern()};
        byte[] bArr3 = {82, -118, 55, -42, -12, -17, -115, -100, -67, -66, -90, -81, 35, 44, 0, -98, -109, 40};
        c(bArr3, new byte[]{-107, 31, -52, 91, -13, -104, -110, -117, 13, -51, 108, 125, -75, 88, 0, 109, -91, 28});
        return a(strIntern, strArr, new String(bArr3, charset).intern(), true);
    }

    public final boolean j() {
        String str = Build.BOARD;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        byte[] bArr = {20, 89, 73};
        c(bArr, new byte[]{122, 54, 49, -9, -66, 38, 82, -29});
        Charset charset = StandardCharsets.UTF_8;
        if (!lowerCase.contains(new String(bArr, charset).intern())) {
            return false;
        }
        byte[] bArr2 = {-70, -38, -85, -29, 65, -36, 10, -126, -41, -13, -17, 19, -101, -49, -107, 7, -15, -60};
        c(bArr2, new byte[]{61, -96, 120, 37, -114, -116, 17, -111, 23, -128, 21, 25, 77, -1, 104, 11, -125, -96});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {125, -31, -34};
        c(bArr3, new byte[]{19, -114, -90, -104, 100, 96, 48, -54});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean k() {
        String str = Build.BOOTLOADER;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        byte[] bArr = {74, -25, -6};
        c(bArr, new byte[]{36, -120, -126, -74, 62, 78, -119, 9});
        Charset charset = StandardCharsets.UTF_8;
        if (!lowerCase.contains(new String(bArr, charset).intern())) {
            return false;
        }
        byte[] bArr2 = {116, 88, -47, -37, 32, 64, 3, -53, -23, -117, -35, -1, -77, -47, 91, -57, 23, -75, 13, 9, 108, 78, -18};
        c(bArr2, new byte[]{123, 46, 38, 93, -81, 104, 24, 88, -31, 24, 59, 13, 37, -3, -94, 70, -49, -50, 16, 10, 8, 43, -100});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {28, 27, -27};
        c(bArr3, new byte[]{114, 116, -99, -75, 37, 7, 108, -2});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean l() {
        for (String str : C0038m0.B) {
            if (Build.BRAND.contains(str)) {
                byte[] bArr = {29, -36, -126, -119, 123, -96, -2, -34, -34, 21, 76, -57, 40, -4, -51, -105, -46, 20};
                c(bArr, new byte[]{-94, -95, -111, -120, 116, -53, 29, 52, -18, 98, -54, 70, -66, -85, 77, -101, -68, 112});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        for (String str : C0038m0.F) {
            if (Build.DEVICE.contains(str)) {
                byte[] bArr = {74, -77, -30, -98, -66, 125, -105, -79, -80, 48, -126, -68, 56, 16, 63, 44, -42, 26, 1};
                c(bArr, new byte[]{-115, -56, 49, 98, 9, 46, 100, 97, 56, 127, -128, 113, -82, -71, -43, -8, -65, 121, 100});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        for (String str : C0038m0.I) {
            if (Build.FINGERPRINT.contains(str)) {
                byte[] bArr = {86, 99, 72, -84, -126, -102, -30, 106, -48, -7, -1, 37, 35, 120, 123, 122, -115, 120, 22, 84, -64, -116, 4, -74};
                c(bArr, new byte[]{-103, 56, -33, 109, 77, -51, 57, -72, 24, -122, 5, -25, -75, 35, -124, -78, 86, 3, -6, -58, 22, 19, 24, 108});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        byte[] bArr = {39, 30, 53, 122, -100, 98, 27, 91, -59, 123, -28, 125, -116, 59, 118};
        c(bArr, new byte[]{-71, 100, -119, -66, 53, 57, -31, -39, 71, 15, 58, -127, -6, 84, 4});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        String[] strArr = C0038m0.C;
        byte[] bArr2 = {101, 9, 46, -88, -33, 15, -89, -55, 127, 112, 6, -1, 57, -119, 46, -118, -92, 0, -91};
        c(bArr2, new byte[]{106, -97, -6, 105, -24, -72, 117, 89, 79, 63, 12, 14, -81, 48, -52, -115, -46, 111, -41});
        return a(strIntern, strArr, new String(bArr2, charset).intern(), false);
    }

    public final boolean p() {
        for (String str : C0038m0.H) {
            if (Build.HARDWARE.contains(str)) {
                byte[] bArr = {-18, -80, -59, 39, -51, 37, 73, 112, 116, 117, -8, -107, 21, 42, -128, 97, -116, -60, -99, -88, -98};
                c(bArr, new byte[]{-15, -10, 82, -23, 26, 86, -42, -89, 116, 2, 30, -105, -53, 95, -109, -79, 84, -59, 110, 121, -5});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        for (String str : C0038m0.A) {
            if (Build.MANUFACTURER.contains(str)) {
                byte[] bArr = {-11, 73, -36, -108, 53, 93, 38, -102, -107, -34, 98, 32, -13, 69, -11, 1, -124, 110, -10, 109, -43, -36, 84, 85, -108};
                c(bArr, new byte[]{-6, 95, 43, -108, -78, 15, -11, -119, 85, -83, -96, -19, -27, 126, 6, 10, 93, 58, 9, -77, 13, -65, -76, -46, -26});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        for (String str : C0038m0.G) {
            if (Build.MODEL.contains(str)) {
                byte[] bArr = {0, 31, 59, 33, -120, -110, -87, -20, -110, 13, 114, 78, -92, 61, -116, -128, 52, 16};
                c(bArr, new byte[]{-57, 100, -56, -32, 71, -59, 118, 58, 90, -102, -105, -33, 58, 102, -111, -122, 81, 124});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        byte[] bArr = {13, -114, -16, -3, -32, 20, 51, 17, 56, -60, 36, 29, -26, 77, -21, 22, 52};
        c(bArr, new byte[]{-61, 20, 76, 2, -21, 99, -41, 23, -14, -63, -6, 30, -2, 93, 50, 11, 89});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {94, -121, 42};
        c(bArr2, new byte[]{48, -24, 82, -115, 62, 114, 88, -74});
        String[] strArr = {new String(bArr2, charset).intern()};
        byte[] bArr3 = {61, -63, -97, -90, 69, -35, -19, -108, 33, -56, -63, -87, 92, -97, -5, -43, 23, -109, -128, 107, -10};
        c(bArr3, new byte[]{-126, -58, 116, 106, -126, -113, 50, -126, -87, -44, 71, 99, 114, -35, 1, 89, -49, -26, -99, -65, -101});
        return a(strIntern, strArr, new String(bArr3, charset).intern(), false);
    }

    public final boolean t() {
        for (String str : C0038m0.z) {
            String str2 = Build.PRODUCT;
            if (str2 != null && str2.contains(str)) {
                byte[] bArr = {107, -103, -13, -62, -36, 48, -35, -125, 115, 56, 5, -111, -2, 125, -42, -87, 62, -104, -58, -15};
                c(bArr, new byte[]{108, -17, 0, 70, -21, 91, 34, -109, 123, 71, 3, -100, -48, 59, 58, 99, -122, -16, 91, 32});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean u() {
        boolean zB = false;
        for (U0 u0 : C0038m0.J) {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = {-109, 104, 119, -117, -91, 43, 40, -80};
            c(bArr, new byte[]{80, 51, -99, -99, 59, 118, -22, 50});
            String strB = C1.b(sb.append(new String(bArr, StandardCharsets.UTF_8).intern()).append(u0.a).toString());
            if (strB != null) {
                zB |= u0.b == null ? b(u0, strB) : a(u0, strB);
            }
        }
        return zB;
    }

    public final boolean v() {
        if (Build.getRadioVersion() == null) {
            return false;
        }
        String radioVersion = Build.getRadioVersion();
        byte[] bArr = {-22, -48, 105, -50, -62, 114, 47};
        c(bArr, new byte[]{-65, -112, -21, 30, -14, 92, 31, 6});
        Charset charset = StandardCharsets.UTF_8;
        if (!radioVersion.equalsIgnoreCase(new String(bArr, charset).intern())) {
            return false;
        }
        byte[] bArr2 = {88, 44, 69, 48, -42, 81, 103, 5, -39, 82, -81, -34, -2, -46, 88, -128, -82, 37};
        c(bArr2, new byte[]{-97, 113, -46, -15, 17, 122, -76, 18, 17, 33, 85, 46, -48, -110, -85, -122, -57, 74});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-71, 37, -120, -110, 8, -32, 2};
        c(bArr3, new byte[]{108, 61, -54, -38, 56, -50, 50, 20});
        b(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean w() {
        String str = Build.SERIAL;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        byte[] bArr = {95, 127, 117};
        c(bArr, new byte[]{49, 16, 13, 40, 96, -84, -77, 54});
        Charset charset = StandardCharsets.UTF_8;
        if (!lowerCase.contains(new String(bArr, charset).intern())) {
            return false;
        }
        byte[] bArr2 = {-39, 66, -106, 8, 77, 126, -38, 29, -112, 2, 112, 20, 33, 74, -63, -1, -52, 92, -120};
        c(bArr2, new byte[]{30, 88, 109, 8, -102, 46, 33, -11, 88, -111, -107, 25, -73, 100, 86, 16, -91, 61, -28});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-22, 9, -41};
        c(bArr3, new byte[]{-124, 102, -81, -89, -108, 82, -57, -114});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean x() {
        ArrayList arrayList = (ArrayList) new C0044p0().a();
        if (arrayList.isEmpty()) {
            return false;
        }
        byte[] bArr = {-19, 120, -110, -115, 111, 95, -70, 53, 40, 34, -21, -74, -77, 6, -39, -76, 45, -96};
        c(bArr, new byte[]{-14, 14, 97, -109, 120, 8, 65, -19, -96, 110, 41, 118, 37, -74, 56, 118, 67, -60});
        Charset charset = StandardCharsets.UTF_8;
        c(new String(bArr, charset).intern(), ((C0044p0.a) arrayList.get(0)).i);
        byte[] bArr2 = {-86, 115, 89, 123, -121, -102, 118, 122, 77, -43, -14, -62, -122, -54, 17, -62, 95};
        c(bArr2, new byte[]{40, 0, -96, -72, 111, -19, -98, -75, -110, -89, 52, 87, 69, -34, -22, 72, 58});
        a(new String(bArr2, charset).intern(), ((C0044p0.a) arrayList.get(0)).m());
        return true;
    }

    public final boolean y() {
        byte[] bArr = {2, -65, 26, 122, 35, 127, 8, 1, 25, 10, 66, -38};
        c(bArr, new byte[]{-119, -36, -2, -77, -92, 67, 23, 12, -56, -103, -57, 79});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-54, -56, 124, -51, -33, 92, 20, 26, -19, 57, -104};
        c(bArr2, new byte[]{13, -34, -117, 76, -24, 7, -23, 9, -125, 77, -21});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {30, 64, -79, 76, 102, 98};
        c(bArr3, new byte[]{-76, 79, 76, -41, 21, 4, -15, -17});
        return a(strIntern, strIntern2, new String(bArr3, charset).intern());
    }

    public final boolean z() {
        for (String str : C0038m0.K) {
            File file = new File(str);
            try {
                if (file.exists() && file.isDirectory()) {
                    byte[] bArr = {-61, 127, -52, -115, 104, -88, 47, 9, -93, 104, -118, 53, 3, 50, -7, 71, 63, 65, 74, -104};
                    c(bArr, new byte[]{4, 5, 91, -109, 103, -45, -52, 30, 43, 55, -120, -8, -43, 79, 25, -59, -121, 91, -33, -114});
                    Charset charset = StandardCharsets.UTF_8;
                    String strIntern = new String(bArr, charset).intern();
                    byte[] bArr2 = {-110, -74, -13, 19, -89, -70, 115, -111, 90, -40};
                    c(bArr2, new byte[]{116, -56, 16, 19, 24, -36, -124, -112, 49, -85});
                    c(strIntern, new String(bArr2, charset).intern());
                    return true;
                }
            } catch (SecurityException unused) {
            }
        }
        return false;
    }

    public final boolean a(U0 u0, String str) {
        String[] strArr = u0.b;
        if (strArr == null) {
            return false;
        }
        boolean z = false;
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                byte[] bArr = {-111, 14, 2, -51, -25, 40, 29, -83, -127, -15, 13, 13, 87, 125, -36, 30, 9, -27, -54, 7, 46, 127, 31, -37, -23, -56, 113};
                c(bArr, new byte[]{86, -108, 22, 76, -32, 83, -30, 122, 73, -66, 11, 0, -119, 58, 60, -18, -35, -73, 78, 30, -85, 58, -16, 81, -100, -83, 2});
                Charset charset = StandardCharsets.UTF_8;
                String strIntern = new String(bArr, charset).intern();
                StringBuilder sbAppend = new StringBuilder().append(u0.a);
                byte[] bArr2 = {104, 121, 91};
                c(bArr2, new byte[]{72, 67, 123, -47, 93, -96, -77, 50});
                c(strIntern, sbAppend.append(new String(bArr2, charset).intern()).append(str).toString());
                z = true;
            }
        }
        return z;
    }

    public final boolean e(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.contains(str2);
    }

    public final boolean b(TelephonyManager telephonyManager) {
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        byte[] bArr = {3, -5, 58, 75, 7, -108, -85, -34, -62, -57, -67, 112, 30, -21, 37, 113, -37, -55, -8, 121};
        c(bArr, new byte[]{-97, -47, -100, -100, -97, -80, 45, 114, 84, -124, 30, -30, -13, -32, -94, -30, 79, -128, 88, -20});
        Charset charset = StandardCharsets.UTF_8;
        if (!(simSerialNumber == null ? false : simSerialNumber.contains(new String(bArr, charset).intern()))) {
            return false;
        }
        byte[] bArr2 = {-83, 79, 118, 29, 71, 50, 3, -26, -102, -41, -28, 54, -50, -13};
        c(bArr2, new byte[]{50, 85, -115, 28, -128, 76, 28, 37, 109, -96, 36, -16, -81, -97});
        c(new String(bArr2, charset).intern(), telephonyManager.getSimSerialNumber());
        return true;
    }

    public void d(final Context context) {
        a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.n0$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.e(context);
            }
        }));
    }

    public final /* synthetic */ X e(Context context) {
        return new X(!(t() | q() | l() | m() | r() | p() | n() | z() | x() | j() | k() | w() | o() | s() | y() | f()), !b(context), !(e() | u() | v() | g() | h() | i()));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    public static void c(byte[] bArr, byte[] bArr2) {
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

    public final boolean b(Context context) {
        TelephonyManager telephonyManagerC = c(context);
        if (telephonyManagerC == null) {
            return false;
        }
        return a(telephonyManagerC) || c(telephonyManagerC) || b(telephonyManagerC) || d(telephonyManagerC);
    }

    public final boolean a(String str, String str2, String str3) {
        BufferedReader bufferedReader;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Exception unused) {
            return false;
        }
        do {
            try {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return false;
                }
            } finally {
            }
            return false;
        } while (!line.toLowerCase(Locale.ENGLISH).contains(str3));
        c(str2, str3);
        bufferedReader.close();
        return true;
    }

    public final boolean a(TelephonyManager telephonyManager) {
        String line1Number = telephonyManager.getLine1Number();
        byte[] bArr = {-37, 108, -3, -48, -53, 98, 64, 89, -62};
        c(bArr, new byte[]{78, 111, 90, 6, 90, 98, -125, -114, -9});
        Charset charset = StandardCharsets.UTF_8;
        if (!(line1Number == null ? false : line1Number.contains(new String(bArr, charset).intern()))) {
            return false;
        }
        byte[] bArr2 = {91, 116, 36, 75, -110, 56, -117, -106, -103, -14, -52, -112, -62, 3, 78, 45};
        c(bArr2, new byte[]{-100, 9, -13, -50, 93, 106, -108, -106, 88, -47, 112, -122, 11, -109, -38, -3});
        c(new String(bArr2, charset).intern(), telephonyManager.getLine1Number());
        return true;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        d(context);
    }
}
