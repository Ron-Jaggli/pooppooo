package com.aheaditec.talsec.security;

import android.app.ActivityManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.aheaditec.talsec.security.AbstractC0017f;
import com.aheaditec.talsec_security.security.Natives;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.random.Random;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class Y0 extends r {
    public final Integer q;
    public final boolean r;
    public final Z0 s;
    public X t;

    public Y0(R0 r0, u1 u1Var, E1 e1, Z0 z0) {
        super(r0, u1Var, e1);
        this.q = e1.a().b();
        this.r = r0.b();
        this.s = z0;
    }

    public final boolean a(PackageManager packageManager, String str) {
        ApplicationInfo applicationInfo;
        ServiceInfo[] serviceInfoArr;
        ActivityInfo[] activityInfoArr;
        ProviderInfo[] providerInfoArr;
        String strIntern;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4111);
            if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 0) {
                return false;
            }
            ActivityInfo[] activityInfoArr2 = packageInfo.activities;
            if (activityInfoArr2 != null && (serviceInfoArr = packageInfo.services) != null && (activityInfoArr = packageInfo.receivers) != null && (providerInfoArr = packageInfo.providers) != null) {
                if (activityInfoArr2.length == 2 && ((serviceInfoArr.length == 2 || serviceInfoArr.length == 1) && activityInfoArr.length == 1 && providerInfoArr.length == 1)) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null && strArr.length >= 8) {
                        try {
                            byte[] bArr = {-22, 41, 53, 106, -114, 45, 30, 89, -52, 74, 63, 74, 110, -81, -102, -55, 0, -14, -105, 94, 66, -71, -23, 89, 36, -12, -51};
                            a(bArr, new byte[]{-117, 71, 81, 24, -31, 68, 122, 119, -68, 47, 77, 39, 7, -36, -23, -96, 111, -100, -71, 23, 12, -19, -84, 11, 106, -79, -103});
                            Charset charset = StandardCharsets.UTF_8;
                            String strIntern2 = new String(bArr, charset).intern();
                            byte[] bArr2 = {106, 97, 70, -5, 120, 37, -128, -127, -99, -86, -34, 52, 0, 126, 120, -41, -36, 119, -49, 38, -117, 51, 37, -63, 84, 53, -12, 127, -87, -41, 112, -53, -84, -107, 20, 126, -80};
                            a(bArr2, new byte[]{11, 15, 34, -119, 23, 76, -28, -81, -19, -49, -84, 89, 105, 13, 11, -66, -77, 25, -31, 96, -60, 97, 96, -122, 6, 122, -95, 49, -19, -120, 35, -114, -2, -61, 93, 61, -11});
                            String strIntern3 = new String(bArr2, charset).intern();
                            byte[] bArr3 = {-2, 53, -14, -27, -42, 2, -73, 88, -28, 40, 56, 71, -18, -122, -111, -126, -127, 96, 112, 22, 75, -20, -122, -111, -19, 115, -15, 112, 50, -89, 85, 7, 87, 86, 11, -61, 22};
                            a(bArr3, new byte[]{-97, 91, -106, -105, -71, 107, -45, 118, -108, 77, 74, 42, -121, -11, -30, -21, -18, 14, 94, 71, 30, -87, -44, -56, -78, 50, -67, 60, 109, -9, 20, 68, 28, 23, 76, -122, 69});
                            String strIntern4 = new String(bArr3, charset).intern();
                            byte[] bArr4 = {-77, 7, 106, 64, 45, 45, -77, -45, -87, 4, 88, 76, 65, 82, -90, 2, 70, -20, 50, 117, -44, -4, 52, -35, 92, -38, 111, 73, 104, -40, -49, 113, -86, -56, -123, 58, -79, 76, -82};
                            a(bArr4, new byte[]{-46, 105, 14, 50, 66, 68, -41, -3, -39, 97, 42, 33, 40, 33, -43, 107, 41, -126, 28, 52, -105, -65, 113, -114, 15, -123, 33, 12, 60, -113, -128, 35, -31, -105, -42, 110, -16, 24, -21});
                            String strIntern5 = new String(bArr4, charset).intern();
                            byte[] bArr5 = {53, 55, 68, 1, -38, -85, -106, 41, -6, 77, -43, -12, 44, -83, -64, 13, 93, -107, -35, -64, 11, -50, -48, 8, 72, -97, -1, -17, 40, -97, 19, -44, -114, -74, 74, 48, -106, 45, 103};
                            a(bArr5, new byte[]{84, 89, 32, 115, -75, -62, -14, 7, -118, 40, -89, -103, 69, -34, -77, 100, 50, -5, -13, -120, 66, -118, -107, 87, 7, -55, -70, -67, 100, -34, 74, -117, -39, -1, 4, 116, -39, 122, 52});
                            String strIntern6 = new String(bArr5, charset).intern();
                            byte[] bArr6 = {102, 123, -24, -12, 24, -30, -16, 121, -26, -42, 62, -37, 126, -86, -45, -67, 124, -67, 25, -57, 49, 76, -23, 117, -1, -114, -1, -70, -37, 62, 102, -116, -66, -2, 31, -26, 64};
                            a(bArr6, new byte[]{7, 21, -116, -122, 119, -117, -108, 87, -106, -77, 76, -74, 23, -39, -96, -44, 19, -45, 55, -105, 126, 31, -67, 42, -79, -63, -85, -13, -99, 119, 37, -51, -22, -73, 80, -88, 19});
                            String strIntern7 = new String(bArr6, charset).intern();
                            byte[] bArr7 = {-44, 76, 28, -125, 78, -69, 100, -35, -36, -84, -123, -18, 69, -87, 110, 19, 104, -66, 18, -126, 38, -45, -94, 102, -74, 6, -72, -23, 64, 46, 63, -37, -66, -93, 88, 116, 72, -68, -86, -44, -92, -110, 18, 121, -35, 28, -33, -114, 63, -59, 73, 81, -25, -34};
                            a(bArr7, new byte[]{-75, 34, 120, -15, 33, -46, 0, -13, -84, -55, -9, -125, 44, -38, 29, 122, 7, -48, 60, -41, 118, -105, -29, 50, -13, 89, -24, -88, 3, 101, 126, -100, -5, -16, 7, 35, 1, -24, -30, -101, -15, -58, 77, 44, -114, 89, -115, -47, 126, -122, 29, 24, -88, -112});
                            String strIntern8 = new String(bArr7, charset).intern();
                            byte[] bArr8 = {34, 35, 108, -99, 106, 68, 67, -96, -89, 101, 27, 114, 22, -92, 24, -29, -127, -13, 4, 126, -108, 53, 37, -8, 34, 115, -52, 102, -22, 51, -109, 51, -119, -43, 23, -26, 52, -39, 35, 116, 70, -18, 79};
                            a(bArr8, new byte[]{67, 77, 8, -17, 5, 45, 39, -114, -41, 0, 105, 31, 127, -41, 107, -118, -18, -99, 42, 44, -47, 100, 112, -67, 113, 39, -109, 47, -92, 96, -57, 114, -59, -103, 72, -74, 117, -102, 104, 53, 1, -85, 28});
                            String strIntern9 = new String(bArr8, charset).intern();
                            byte[] bArr9 = {-40, -6, 8, 32, -6, -38, 122, 97, 68, -108, 10, -2, 41, 24, 18, -50, 97, 17, 49, 79, -68, 102, 61, -84, -62, -26, -47, 40, 33, 46, 18, 11};
                            a(bArr9, new byte[]{-71, -108, 108, 82, -107, -77, 30, 79, 52, -15, 120, -109, 64, 107, 97, -89, 14, 127, 31, 26, -17, 35, 98, -18, -117, -87, -100, 109, 117, 124, 91, 72});
                            String strIntern10 = new String(bArr9, charset).intern();
                            byte[] bArr10 = {-2, -96, 21, 102, 35, -90, -30, 31, -55, 6, 36, 102, -47, -109, -79, 125, -15, 89, -49, -125, -22, 19, 92, 83, -68, -59, -5, -22, -115, -94, -117, -42, -59, -99};
                            a(bArr10, new byte[]{-97, -50, 113, 20, 76, -49, -122, 49, -71, 99, 86, 11, -72, -32, -62, 20, -98, 55, -31, -42, -71, 86, 3, 21, -11, -117, -68, -81, -33, -14, -39, -97, -117, -55});
                            String strIntern11 = new String(bArr10, charset).intern();
                            String[] strArr2 = new String[9];
                            boolean z = false;
                            try {
                                strArr2[0] = strIntern2;
                                strArr2[1] = strIntern3;
                                strArr2[2] = strIntern10;
                                strArr2[3] = strIntern4;
                                strArr2[4] = strIntern5;
                                strArr2[5] = strIntern6;
                                strArr2[6] = strIntern11;
                                strArr2[7] = strIntern8;
                                strArr2[8] = strIntern9;
                                HashSet hashSet = new HashSet(Arrays.asList(strArr2));
                                byte[] bArr11 = {-113, 13, -119, -49, -98, -10, 113, -127, -35, 86, -20, -71, -24, -91, -75, 72, -127, 123, -34, -6, 121, 14, -22, 26, 106, 107, 107, 20, -39, -121, 22, -54, -10, -61, -18, -94, -66, 102, 110, -101, -101, -93, 31, -7, 87, 87, 62};
                                a(bArr11, new byte[]{-18, 99, -19, -67, -15, -97, 21, -81, -83, 51, -98, -44, -127, -42, -58, 33, -18, 21, -16, -68, 54, 92, -81, 93, 56, 36, 62, 90, -99, -40, 69, -113, -92, -107, -89, -31, -5, 57, 42, -38, -49, -30, 64, -86, 14, 25, 125});
                                String strIntern12 = new String(bArr11, charset).intern();
                                String[] strArr3 = new String[9];
                                z = false;
                                strArr3[0] = strIntern2;
                                strArr3[1] = strIntern3;
                                strArr3[2] = strIntern12;
                                strArr3[3] = strIntern4;
                                strArr3[4] = strIntern5;
                                strArr3[5] = strIntern6;
                                strArr3[6] = strIntern7;
                                strArr3[7] = strIntern8;
                                strArr3[8] = strIntern9;
                                HashSet hashSet2 = new HashSet(Arrays.asList(strArr3));
                                byte[] bArr12 = {-116, 86, -115, 80, 37, -26, 83, -32, -69, -43, -63, 126, 107, -72, 39, -110, -59, -40, 36, 80, -19, 70, -105, -95, 109, -24, 127, 55, -59, 85, 16, -32, -36, -107, 101, 30, -29, -97, 19, 118, 122, 79};
                                a(bArr12, new byte[]{-19, 56, -23, 34, 74, -113, 55, -50, -53, -80, -77, 19, 2, -53, 84, -5, -86, -74, 10, 2, -72, 8, -56, -12, 62, -83, 45, 104, -116, 27, 89, -76, -107, -44, 49, 91, -89, -64, 89, 57, 56, 28});
                                String strIntern13 = new String(bArr12, charset).intern();
                                String[] strArr4 = new String[8];
                                try {
                                    strArr4[0] = strIntern2;
                                    strArr4[1] = strIntern5;
                                    strArr4[2] = strIntern9;
                                    strArr4[3] = strIntern6;
                                    strArr4[4] = strIntern8;
                                    strArr4[5] = strIntern7;
                                    strArr4[6] = strIntern13;
                                    strArr4[7] = strIntern4;
                                    HashSet hashSet3 = new HashSet(Arrays.asList(strArr4));
                                    HashSet hashSet4 = new HashSet(Arrays.asList(packageInfo.requestedPermissions));
                                    boolean zContainsAll = hashSet4.containsAll(hashSet);
                                    boolean zContainsAll2 = hashSet4.containsAll(hashSet2);
                                    boolean zContainsAll3 = hashSet4.containsAll(hashSet3);
                                    if (!zContainsAll && !zContainsAll2 && !zContainsAll3) {
                                        return false;
                                    }
                                    long length = new File(applicationInfo.sourceDir).length() / 1024;
                                    if ((length >= 20 && length <= 40) || (length >= 9216 && length <= 20480)) {
                                        String strValueOf = zContainsAll ? String.valueOf(1) : zContainsAll2 ? String.valueOf(2) : String.valueOf(3);
                                        byte[] bArr13 = {-127, -121, 108, 82, -61, -103, -52, -121, 78, 48, 111, 103, 10, -118, 2, 93, 127};
                                        a(bArr13, new byte[]{-23, -26, 31, 31, -94, -2, -91, -12, 37, 99, 27, 18, 104, -61, 108, 59, 16});
                                        c(new String(bArr13, charset).intern(), strValueOf);
                                        byte[] bArr14 = {-24, 52, 91, 65, 44, 49, 113, 26, 94, -96, -91, -23, -85};
                                        a(bArr14, new byte[]{-128, 85, 40, 12, 77, 86, 24, 105, 53, -13, -47, -100, -55});
                                        String strIntern14 = new String(bArr14, charset).intern();
                                        if (this.r) {
                                            strIntern = str;
                                        } else {
                                            byte[] bArr15 = {91, 93, -14, -97};
                                            a(bArr15, new byte[]{47, 47, -121, -6, 23, 77, -28, 122});
                                            strIntern = new String(bArr15, charset).intern();
                                        }
                                        c(strIntern14, strIntern);
                                        return true;
                                    }
                                    return false;
                                } catch (Exception unused) {
                                    return false;
                                }
                            } catch (Exception unused2) {
                                return z;
                            }
                        } catch (Exception unused3) {
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception unused4) {
            return false;
        }
    }

    @Override // com.aheaditec.talsec.security.r, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean b() {
        return true;
    }

    public final boolean b(Context context) {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        Natives natives = Natives.a;
        byte[] bArrB = natives.b(bFirst, bFirst2);
        byte[] bArr = {-73, -36, -99, -74, 6, -18, -92, 13, -111, 81, -79, 46, -97, 23, -18, 52, -88, -16, 108, -112, 64, -102, 102, -120, -77};
        a(bArr, new byte[]{-42, -82, -8, -9, 118, -123, -41, 76, -25, 48, -40, 66, -2, 117, -126, 81, -18, -103, 30, -29, 52, -39, 7, -28, -33});
        Charset charset = StandardCharsets.UTF_8;
        String[] strArrG = g(bArrB, bFirst, bFirst2, new String(bArr, charset).intern());
        if (strArrG == null) {
            return false;
        }
        byte[] bArrC = natives.c(a(a(context, strArrG), bFirst, bFirst2), bFirst, bFirst2);
        byte[] bArr2 = {-109, -53, 58, -84, 117, -50, 78, 113, 1, 119, -38, 94, -55, 66, -88, 34, 59, -15, -49, -54, 88, 80, 124, 54, 3, 32};
        a(bArr2, new byte[]{-14, -71, 95, -19, 5, -91, 61, 48, 119, 22, -77, 50, -88, 32, -60, 71, 104, -108, -84, -91, 54, 52, 63, 87, 111, 76});
        Boolean boolA = a(bArrC, bFirst, bFirst2, new String(bArr2, charset).intern());
        if (boolA == null || !boolA.booleanValue()) {
            return false;
        }
        byte[] bArr3 = {45, 115, 87, -88, 96, 52, 50, 82, -57, 20, -7, -47, 4, -80, 59, 104};
        a(bArr3, new byte[]{76, 1, 50, -23, 16, 95, 65, 19, -79, 117, -112, -67, 101, -46, 87, 13});
        String strIntern = new String(bArr3, charset).intern();
        byte[] bArr4 = {-2, 114, -74, -53, -115, -93};
        a(bArr4, new byte[]{-112, 19, -62, -94, -5, -58, -87, -8});
        c(strIntern, new String(bArr4, charset).intern());
        return true;
    }

    public final boolean c(Context context) {
        Intent intent = new Intent();
        byte[] bArr = {34, 109, 124, 56, -9, 45, 120, 76, 13, 113, 13, -85, 51, 110, -2, 33, 16, -77, 124, 57, -10, 64};
        a(bArr, new byte[]{65, 2, 17, 22, -125, 94, 22, 43, 35, 25, 100, -49, 86, 3, -121, 64, 96, -61, 16, 80, -123, 52});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-72, 55, -57, -57, 61, 58, -82, 83, 106, -99, 36, 27, -98, 46, 4, -97, -110, -54, -108, 16, -120, 108, -36, 48, -116, 111, 106, -73, -98, 46, -9, -100, 56, 79, -115, -47, 77, 9, 0, 124, 71, 80, -47};
        a(bArr2, new byte[]{-37, 88, -86, -23, 73, 73, -64, 52, 68, -11, 77, 127, -5, 67, 125, -2, -30, -70, -8, 121, -5, 24, -14, 125, -19, 6, 4, -10, -3, 90, -98, -22, 81, 59, -12, -99, 44, 124, 110, 31, 47, 53, -93});
        intent.setClassName(strIntern, new String(bArr2, charset).intern());
        try {
            context.startActivity(intent);
            byte[] bArr3 = {-8, -89, -119, 68, 47, -94, -31, -84, 39, -85, 39, -37, 54, 64, 58, -72, -12, -110, 103};
            a(bArr3, new byte[]{-98, -50, -25, 32, 125, -51, -114, -40, 102, -37, 87, -103, 79, 9, 84, -52, -111, -4, 19});
            String strIntern2 = new String(bArr3, charset).intern();
            byte[] bArr4 = {-113, 126, 20, 49};
            a(bArr4, new byte[]{-5, 12, 97, 84, 124, -68, 72, 30});
            b(strIntern2, new String(bArr4, charset).intern());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean d(String str) {
        boolean zG = g(str);
        if (zG) {
            byte[] bArr = {-30, 59, -82, 22, -79, 88, 118, 6, -89, 20, 103, -117, 106, 17, 101, -95, -3};
            a(bArr, new byte[]{-127, 90, -64, 83, -55, 61, 21, 115, -45, 113, 36, -28, 7, 124, 4, -49, -103});
            c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
        }
        return zG;
    }

    public final boolean e() {
        for (String str : X0.g) {
            if (f(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        for (String str : X0.i) {
            if (new File(str).exists()) {
                byte[] bArr = {48, 2, -106, -66, -30, 63, 0, 0, 57, -17, 51, -36, 121, -92, -118};
                a(bArr, new byte[]{81, 112, -13, -8, -117, 83, 101, 115, 105, -99, 86, -81, 28, -54, -2});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        for (String str : X0.k) {
            if (new File(str).canWrite()) {
                byte[] bArr = {-102, 31, -30, 28, 77, -30, 91, 74, -60, 8, -105, 19, 112, 10, 42, 6, -40, -107};
                a(bArr, new byte[]{-5, 109, -121, 90, 34, -114, 63, 47, -74, 123, -64, 97, 25, 126, 75, 100, -76, -16});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        byte[] bArr = {-23, 13, 9, 85, 44, -55, 124, -91, -103, 59, -80, -55, -95, -55, 103, -58, -7, -97, 5};
        a(bArr, new byte[]{-128, 99, 96, 33, 2, -70, 10, -58, -73, 86, -47, -82, -56, -70, 12, -103, -119, -7, 118});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {21, -74, 30, -7, -5, 112, -51};
        a(bArr2, new byte[]{102, -62, 113, -119, -117, 21, -87, 13});
        if (e(strIntern, new String(bArr2, charset).intern())) {
            return true;
        }
        byte[] bArr3 = {93, -25, -107, -46, 53, -87, 44, -95, 37, -53, 16, -9, -82, -127, 115, 47, -68, 116, 119, 43};
        a(bArr3, new byte[]{52, -119, -4, -90, 27, -38, 90, -62, 11, -90, 113, -112, -57, -14, 24, 112, -52, 18, 4, 79});
        String strIntern2 = new String(bArr3, charset).intern();
        byte[] bArr4 = {121, -62, 49, 74, 59, -75, -28};
        a(bArr4, new byte[]{10, -74, 94, 58, 75, -48, -128, 17});
        if (e(strIntern2, new String(bArr4, charset).intern())) {
            return true;
        }
        byte[] bArr5 = {-99, 68, 27, -49, 66, -106, 1, -114, -99, 78, -92, -53, 88, 126, -55, 72, 64, 56, 11, 27, 71, -62, -22};
        a(bArr5, new byte[]{-12, 42, 114, -69, 108, -27, 119, -19, -77, 35, -59, -84, 49, 13, -94, 23, 51, 93, 121, 109, 46, -95, -113});
        String strIntern3 = new String(bArr5, charset).intern();
        byte[] bArr6 = {-64, -8, -24, 71, 4, 71, -125};
        a(bArr6, new byte[]{-77, -116, -121, 55, 116, 34, -25, -115});
        if (e(strIntern3, new String(bArr6, charset).intern())) {
            return true;
        }
        byte[] bArr7 = {-60, -23, 81, 65, -14, 113, -51, -95, -80, -75, -36, -32, -33, -28, -63, -28, 36, -119, -89};
        a(bArr7, new byte[]{-76, -116, 35, 50, -101, 2, -71, -113, -35, -44, -69, -119, -84, -113, -17, -116, 77, -19, -62});
        String strIntern4 = new String(bArr7, charset).intern();
        byte[] bArr8 = {-1};
        a(bArr8, new byte[]{-50, -30, 99, -90, -24, -127, 79, 49});
        return e(strIntern4, new String(bArr8, charset).intern());
    }

    public boolean i() {
        byte[] bArr = {57, 19, -58, 71, 84, 44, -98, -48, -112, 95, 24, -76, -5, 98, 11, 32, 45, 25, -51, -69, 0, 66, 41, 59, 73, 111, -25, -3, -16, 121, 104, 22, 1, -12, 63, 96, -36, -55, 94, 114, 4, 99, -45, 46};
        a(bArr, new byte[]{94, 118, -78, 55, 38, 67, -18, -16, -32, 58, 106, -57, -110, 17, 127, 14, 94, 96, -66, -107, 118, 45, 69, 95, 22, 14, -105, -115, -81, 12, 6, 123, 110, -127, 81, 20, -125, -84, 48, 19, 102, 15, -74, 74});
        Charset charset = StandardCharsets.UTF_8;
        String strB = C1.b(new String(bArr, charset).intern());
        if (strB != null) {
            byte[] bArr2 = {75};
            a(bArr2, new byte[]{122, 70, -7, 127, -109, 55, 72, -52});
            if (strB.equals(new String(bArr2, charset).intern())) {
                byte[] bArr3 = {-89, 73, 10, 22, 120, -110, -96, -110, -90, 16, -84, 68, 127, -2, 62, 113, 62, 82, 68};
                a(bArr3, new byte[]{-60, 33, 111, 117, 19, -57, -50, -1, -55, 101, -62, 48, 58, -112, 95, 19, 82, 55, 32});
                String strIntern = new String(bArr3, charset).intern();
                byte[] bArr4 = {-46, -43, -95, -70};
                a(bArr4, new byte[]{-90, -89, -44, -33, -105, -68, 31, -106});
                b(strIntern, new String(bArr4, charset).intern());
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        byte[] bArr = {124, 108, 90, 86, 20, 3, -6, 16, 16, -15, -10, -70, 86, -86, 37, -16, -78, -41, -70, 77, 70, 92, 16, 44, -127, 57, -36, 64, 59, 9, 102, 93, -96};
        a(bArr, new byte[]{27, 9, 46, 38, 102, 108, -118, 48, 98, -98, -40, -40, 57, -59, 81, -34, -60, -78, -56, 36, 32, 53, 117, 72, -29, 86, -77, 52, 72, 125, 7, 41, -59});
        Charset charset = StandardCharsets.UTF_8;
        String strB = C1.b(new String(bArr, charset).intern());
        if (strB == null) {
            return false;
        }
        byte[] bArr2 = {-93, 41, 8, 60, -91, -91};
        a(bArr2, new byte[]{-38, 76, 100, 80, -54, -46, 56, -96});
        if (!strB.equals(new String(bArr2, charset).intern())) {
            byte[] bArr3 = {-82, 116, -125, -74, 30, 1};
            a(bArr3, new byte[]{-63, 6, -30, -40, 121, 100, -65, 60});
            if (!strB.equals(new String(bArr3, charset).intern())) {
                byte[] bArr4 = {-101, -35, -107};
                a(bArr4, new byte[]{-23, -72, -15, 99, 20, -109, 32, -40});
                if (!strB.equals(new String(bArr4, charset).intern())) {
                    return false;
                }
            }
        }
        byte[] bArr5 = {18, 36, 116, 42, 126, 122, 71, -17, 102, -125, 1, -128, 0, 119, 121, 107, -98, -46, 63, -100, -106, -92, 32, -81, 114, 103, 74, -35};
        a(bArr5, new byte[]{113, 76, 17, 73, 21, 44, 34, -99, 15, -27, 104, -27, 100, 53, 22, 4, -22, -66, 80, -3, -14, -63, 82, -4, 6, 6, 62, -72});
        b(new String(bArr5, charset).intern(), strB);
        return true;
    }

    public final boolean k() {
        byte[] bArr = {30, 54, 40, -23, -95, -76, -72, 31, -101, 86, 118, 86, -65, 49, 10, 118};
        a(bArr, new byte[]{109, 83, 90, -97, -56, -41, -35, 49, -6, 50, 20, 120, -51, 94, 101, 2});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        Integer numValueOf = Integer.valueOf(C1.d(strIntern));
        if (!numValueOf.equals(1)) {
            return false;
        }
        byte[] bArr2 = {-51, 41, -21, -54, -40, 97, 94, -78, -7, -101, 37, 67, -63, -11, 60, 112, -23, 121, 108, 5, 113, 102, -24};
        a(bArr2, new byte[]{-92, 90, -72, -77, -85, 21, 59, -33, -87, -23, 74, 51, -92, -121, 72, 9, -84, 8, 25, 100, 29, 50, -121});
        String strIntern2 = new String(bArr2, charset).intern();
        StringBuilder sbAppend = new StringBuilder().append(strIntern);
        byte[] bArr3 = {73, 17, 51};
        a(bArr3, new byte[]{105, 43, 19, 22, -28, 97, 125, 105});
        c(strIntern2, sbAppend.append(new String(bArr3, charset).intern()).append(numValueOf).toString());
        return true;
    }

    public final boolean l() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrL = Natives.a.l(bFirst, bFirst2);
        byte[] bArr = {115, 48, -17, 14, 39, 120, -80, 21, -126, -94, 13, 11, -68, 41, -27, 20, -97, -110, 0, -50, 3, -50, -90, -51, 6, -76, -3, -116, -83, -2, -73, -1};
        a(bArr, new byte[]{26, 67, -85, 107, 81, 17, -45, 112, -48, -51, 98, 127, -39, 77, -93, 113, -2, -26, 117, -68, 102, -102, -61, -66, 114, -35, -109, -21, -18, -97, -37, -109});
        int[] iArrE = e(bArrL, bFirst, bFirst2, new String(bArr, StandardCharsets.UTF_8).intern());
        if (iArrE == null || iArrE.length <= 0) {
            return false;
        }
        a(iArrE);
        return true;
    }

    public final boolean m() {
        byte[] bArr = {-76, -58, 117, 100, -14, 48, -24, -76, -61, -29, 34, 87, 69, 119, -75, 27, -10, -13, -1, -127, -64, -22, -11, -92, 121, -81};
        a(bArr, new byte[]{-101, -93, 1, 7, -35, 67, -115, -41, -74, -111, 75, 35, 60, 88, -38, 111, -105, -112, -102, -13, -76, -103, -37, -34, 16, -33});
        Charset charset = StandardCharsets.UTF_8;
        boolean zExists = new File(new String(bArr, charset).intern()).exists();
        boolean z = !zExists;
        if (!zExists) {
            byte[] bArr2 = {17, 87, -102, -43, 98, -25, 55, -26, -15, -16, 125, -62, 94, -34, 122, 36, 102, 83, -21, 105, 2, 56, 105};
            a(bArr2, new byte[]{120, 36, -43, -95, 3, -92, 82, -108, -123, -103, 27, -85, 61, -65, 14, 65, 43, 58, -104, 26, 107, 86, 14});
            String strIntern = new String(bArr2, charset).intern();
            byte[] bArr3 = {113, 65, 40, -67, -118, -37, -103, 8, -64, -81, -12, -90, -81, -39, 36, -31, -43, 91, -72, -29, -12, -99, -46, -71, -89, -43};
            a(bArr3, new byte[]{94, 36, 92, -34, -91, -88, -4, 107, -75, -35, -99, -46, -42, -10, 75, -107, -76, 56, -35, -111, -128, -18, -4, -61, -50, -91});
            c(strIntern, new String(bArr3, charset).intern());
        }
        return z;
    }

    public final boolean n() {
        byte[] bArr = {64, -63, 101, 10, 25, 72, -79, 61, 72, 10, 109, -72, 102};
        a(bArr, new byte[]{50, -82, 75, 110, 124, 42, -60, 90, 47, 107, 15, -44, 3});
        Charset charset = StandardCharsets.UTF_8;
        if (!Integer.valueOf(C1.d(new String(bArr, charset).intern())).equals(1)) {
            return false;
        }
        byte[] bArr2 = {-45, 92, 21, -110, 69, -89, 95, -66, 68, -89, 37, 65, -32, -78, 45, -114, 51, 62, 59, 50, 67, 100, -29};
        a(bArr2, new byte[]{-80, 52, 112, -15, 46, -9, 45, -47, 52, -62, 87, 53, -103, -10, 72, -20, 70, 89, 92, 83, 33, 8, -122});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-21, -47, 68, -31};
        a(bArr3, new byte[]{-97, -93, 49, -124, -28, -34, 89, 53});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean o() {
        byte[] bArr = {-63, -75, -70, -85};
        a(bArr, new byte[]{-111, -12, -18, -29, 45, 105, 78, -8});
        Charset charset = StandardCharsets.UTF_8;
        String str = System.getenv(new String(bArr, charset).intern());
        if (str != null) {
            byte[] bArr2 = {-10};
            a(bArr2, new byte[]{-52, 37, -21, 100, 26, 58, 54, 60});
            for (String str2 : str.split(new String(bArr2, charset).intern())) {
                byte[] bArr3 = {-83, -66};
                a(bArr3, new byte[]{-34, -53, -7, -81, -63, 95, -69, 28});
                Charset charset2 = StandardCharsets.UTF_8;
                if (new File(str2, new String(bArr3, charset2).intern()).exists()) {
                    byte[] bArr4 = {-84, -99, -106, -40, 71, 93, -3, 101, 127, 68};
                    a(bArr4, new byte[]{-59, -18, -59, -83, 8, 51, -83, 4, 11, 44});
                    c(new String(bArr4, charset2).intern(), str2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            r5 = this;
            java.lang.String r0 = android.os.Build.TAGS
            if (r0 == 0) goto L26
            java.lang.String r1 = new java.lang.String
            r2 = 9
            byte[] r3 = new byte[r2]
            r3 = {x0048: FILL_ARRAY_DATA , data: [-13, 91, 47, -49, -108, -25, 0, -92, 47} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0052: FILL_ARRAY_DATA , data: [-121, 62, 92, -69, -71, -116, 101, -35, 92} // fill-array
            a(r3, r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r3, r2)
            java.lang.String r1 = r1.intern()
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L46
            java.lang.String r2 = new java.lang.String
            r3 = 18
            byte[] r4 = new byte[r3]
            r4 = {x005c: FILL_ARRAY_DATA , data: [-22, 73, 24, -64, 112, -73, 32, 91, 8, 111, -127, -113, -80, 109, -97, 30, 10, -40} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x006a: FILL_ARRAY_DATA , data: [-117, 59, 125, -108, 21, -60, 84, 16, 109, 22, -14, -54, -34, 12, -3, 114, 111, -68} // fill-array
            a(r4, r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r4, r3)
            java.lang.String r2 = r2.intern()
            r5.c(r2, r0)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.Y0.p():boolean");
    }

    public final boolean q() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrQ = Natives.a.q(bFirst, bFirst2);
        byte[] bArr = {-82, 114, 108, -19, -87, 5, -116, 86, 117, -56, 17, -24, -82, -82, -98, 59, 19, -78, 90, 49, 1, -100, -93, 123, -76, -38, -94, 33, 5, -19, -96, -14, 28, 20};
        a(bArr, new byte[]{-57, 1, 54, -108, -50, 108, -1, 61, 49, -83, 101, -115, -51, -38, -5, 95, 85, -41, 59, 69, 116, -18, -58, 47, -47, -87, -42, 72, 107, -118, -29, -109, 112, 120});
        int[] iArrE = e(bArrQ, bFirst, bFirst2, new String(bArr, StandardCharsets.UTF_8).intern());
        if (iArrE == null || iArrE.length <= 0) {
            return false;
        }
        a(iArrE);
        return true;
    }

    public final boolean r() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrA = Natives.a.a(bFirst, bFirst2);
        byte[] bArr = {-93, 89, -88, -96, -91, -74, 115, 47, -49, 63, -64, -51, 57, 55};
        a(bArr, new byte[]{-47, 54, -57, -44, -21, -41, 7, 70, -71, 90, -125, -84, 85, 91});
        Charset charset = StandardCharsets.UTF_8;
        Boolean boolA = a(bArrA, bFirst, bFirst2, new String(bArr, charset).intern());
        if (boolA == null || !boolA.booleanValue()) {
            return false;
        }
        byte[] bArr2 = {-7, -24, 123, -30, 81, 25, -56, -121, -111, 126};
        a(bArr2, new byte[]{-117, -121, 20, -106, 31, 120, -68, -18, -25, 27});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-36, 126, -51, 45};
        a(bArr3, new byte[]{-88, 12, -72, 72, 45, -12, 81, -22});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean s() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrM = Natives.a.m(bFirst, bFirst2);
        byte[] bArr = {-34, -77, 57, -106, -53, -53, -58, 82, 58, 105, -43, -3, 17, -48, 4, 98, -107, -67, -59, -71, 79, -56};
        a(bArr, new byte[]{-83, -37, 88, -5, -94, -96, -87, 26, 83, 13, -80, -113, 95, -79, 112, 11, -29, -40, -122, -40, 35, -92});
        Charset charset = StandardCharsets.UTF_8;
        Boolean boolA = a(bArrM, bFirst, bFirst2, new String(bArr, charset).intern());
        if (boolA == null || !boolA.booleanValue()) {
            return false;
        }
        byte[] bArr2 = {-93, -121, -87, -72, -21, -58, 16, 120, 121, 97, 0, 31, 86, 119, 18, 6, -89, 46};
        a(bArr2, new byte[]{-48, -17, -56, -43, -126, -83, 127, 48, 16, 5, 101, 109, 24, 22, 102, 111, -47, 75});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {99, -11, -112, 72};
        a(bArr3, new byte[]{23, -121, -27, 45, 68, 14, 12, 99});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final String[] a(Context context, String[] strArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            ApplicationInfo applicationInfoA = a(context, str2);
            if (applicationInfoA != null && (str = applicationInfoA.sourceDir) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.aheaditec.talsec.security.r, com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        this.m.a().b();
        return false;
    }

    public void d(final Context context) {
        X xA = a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.Y0$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.f(context);
            }
        });
        this.t = xA;
        super.a(xA);
    }

    public final boolean e(String str) {
        for (String str2 : X0.h) {
            StringBuilder sbAppend = new StringBuilder().append(str2);
            byte[] bArr = {-75};
            a(bArr, new byte[]{-107, 119, -125, -34, -91, 18, -18, -54});
            Charset charset = StandardCharsets.UTF_8;
            if (C1.b(sbAppend.append(new String(bArr, charset).intern()).append(str).toString()) != null) {
                byte[] bArr2 = {-111, 75, 11, 109, -103, -6, 92, -70, -13, -100, 0, 73, -74, 97, -78, -73, -33, -4, -72, 38, -101, -5, 83, 82, 43, 10, -113};
                a(bArr2, new byte[]{-14, 42, 101, 40, -31, -97, 63, -49, -121, -7, 67, 38, -37, 12, -45, -39, -69, -87, -53, 79, -11, -100, 4, 58, 66, 105, -25});
                String strIntern = new String(bArr2, charset).intern();
                StringBuilder sbAppend2 = new StringBuilder().append(str2);
                byte[] bArr3 = {110};
                a(bArr3, new byte[]{78, 107, 70, -115, 73, 20, -113, 90});
                c(strIntern, sbAppend2.append(new String(bArr3, charset).intern()).append(str).toString());
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        for (String str2 : X0.j) {
            if (new File(str2 + str).exists()) {
                byte[] bArr = {-115, 107, 120, 6, -41, -124, 122, 26, 49, 37, -76, -121, -56, -88, 111, 12, -50, 47};
                a(bArr, new byte[]{-20, 25, 29, 68, -66, -22, 27, 104, 88, 64, -57, -41, -70, -51, 28, 105, -96, 91});
                c(new String(bArr, StandardCharsets.UTF_8).intern(), str2 + str);
                return true;
            }
        }
        return false;
    }

    public final boolean g(String str) {
        try {
            return C1.a(str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public final ApplicationInfo a(Context context, String str) {
        ApplicationInfo applicationInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return applicationInfo;
    }

    public final boolean b(PackageManager packageManager) {
        if (packageManager == null) {
            return false;
        }
        String strA = this.s.a();
        if (strA != null) {
            if (a(packageManager, strA)) {
                return true;
            }
            this.s.b();
        }
        return a(packageManager);
    }

    public final boolean c(Context context, boolean z) {
        byte[] bArr = {32, -41, 80, 38, 83, 125, 28, -118, 92, -38, 81, -13, -72, 59, -17, -60, -93, 6, 109, -19, 110, -61, -39, -68, 30, -85, -28, 9, 2, 34, 85, 97};
        a(bArr, new byte[]{73, -92, 2, 83, 61, 19, 117, -28, 59, -119, 36, -93, -54, 84, -116, -95, -48, 117, 8, -98, 61, -73, -72, -56, 109, -26, -123, 103, 99, 69, 48, 19});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {90, -64, -5, -54, -102, 6, 50, -100, -46, -123};
        a(bArr2, new byte[]{47, -77, -102, -83, -1, 117, 70, -3, -90, -10});
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService(new String(bArr2, charset).intern());
        if (usageStatsManager == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(0, jCurrentTimeMillis - 100000000, jCurrentTimeMillis);
        if (listQueryUsageStats == null) {
            return false;
        }
        Iterator<UsageStats> it = listQueryUsageStats.iterator();
        while (it.hasNext()) {
            String packageName = it.next().getPackageName();
            if (packageName != null) {
                if (z) {
                    for (String str : X0.m) {
                        if (packageName.contains(str)) {
                            if (!this.r) {
                                byte[] bArr3 = {64, 43, -27, -97};
                                a(bArr3, new byte[]{52, 89, -112, -6, -8, 71, -90, -9});
                                packageName = new String(bArr3, StandardCharsets.UTF_8).intern();
                            }
                            b(strIntern, packageName);
                            return true;
                        }
                    }
                }
                for (String str2 : X0.l) {
                    if (packageName.contains(str2)) {
                        if (!this.r) {
                            byte[] bArr4 = {-38, 64, -53, 78};
                            a(bArr4, new byte[]{-82, 50, -66, 43, 127, 24, 94, -57});
                            packageName = new String(bArr4, StandardCharsets.UTF_8).intern();
                        }
                        c(strIntern, packageName);
                        return true;
                    }
                }
                byte[] bArr5 = {-100, 118, 11, 76, 66, 65};
                a(bArr5, new byte[]{-15, 23, 108, 37, 49, 42, -53, -33});
                Charset charset2 = StandardCharsets.UTF_8;
                if (packageName.contains(new String(bArr5, charset2).intern())) {
                    if (!this.r) {
                        byte[] bArr6 = {-35, 49, -87, -21};
                        a(bArr6, new byte[]{-87, 67, -36, -114, -21, -32, -128, -60});
                        packageName = new String(bArr6, charset2).intern();
                    }
                    c(strIntern, packageName);
                    return true;
                }
            }
        }
        return false;
    }

    public void e(final Context context) {
        X x = this.t;
        if (x == null || !x.b()) {
            super.a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.Y0$$ExternalSyntheticLambda1
                @Override // com.aheaditec.talsec.security.AbstractC0017f.a
                public final X run() {
                    return this.f$0.g(context);
                }
            }));
        }
    }

    public final /* synthetic */ X f(Context context) {
        boolean zP = p() | b(context);
        byte[] bArr = {93, 117, 127, -83, -66, 117, 6, 74, 69};
        a(bArr, new byte[]{47, 26, 81, -34, -37, 22, 115, 56, 32});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-12};
        a(bArr2, new byte[]{-60, 81, 35, -1, -104, 107, -120, 76});
        boolean zE = zP | e(strIntern, new String(bArr2, charset).intern()) | f() | e() | o();
        Integer num = this.q;
        if (num != null && (num.intValue() == 2 || this.q.intValue() == 3)) {
            byte[] bArr3 = {-75, -119};
            a(bArr3, new byte[]{-58, -4, -30, -106, -58, -55, -29, 44});
            zE |= d(new String(bArr3, charset).intern());
        }
        boolean zM = zE | m() | g() | b(context, false) | b(false) | a(context, false) | c(context, false) | s() | k();
        boolean zR = r();
        byte[] bArr4 = {-121, 29};
        a(bArr4, new byte[]{-12, 104, -78, 42, -84, -104, 13, -14});
        boolean zE2 = zR | e(new String(bArr4, charset).intern()) | h();
        byte[] bArr5 = {-124, -107, -94, -123, -26, 117, -106};
        a(bArr5, new byte[]{-26, -32, -47, -4, -124, 26, -18, -99});
        boolean zF = f(new String(bArr5, charset).intern());
        byte[] bArr6 = {117, 31, -45, 3, 70, 16, -59};
        a(bArr6, new byte[]{23, 106, -96, 122, 36, 127, -67, 67});
        boolean zD = zF | d(new String(bArr6, charset).intern());
        a(new byte[]{-61, -69, -102, -78, -119, 19, 108}, new byte[]{-95, -50, -23, -53, -21, 124, 20, -68});
        return new X(!zM, !zE2, !(c(context) | e(new String(r5, charset).intern()) | zD | n() | l() | q() | i() | j()));
    }

    public final /* synthetic */ X g(Context context) {
        return new X(!b(context.getPackageManager()), true, true);
    }

    public final boolean a(PackageManager packageManager) {
        String str;
        try {
            byte[] bArr = {109, 65, -80, -5, 50, -22, 20, 93, -5, 18, -36, 91, -21, -22, -68, 119, -113, -118, -58, -23, -97, 81, 51, -125, 84, 118};
            a(bArr, new byte[]{12, 47, -44, -119, 93, -125, 112, 115, -110, 124, -88, 62, -123, -98, -110, 22, -20, -2, -81, -122, -15, 127, 126, -62, 29, 56});
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(new String(bArr, StandardCharsets.UTF_8).intern()), 131072).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (str = activityInfo.packageName) != null && a(packageManager, str)) {
                    this.s.a(str);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {-1, 80, -21, -31, 93, 4, 47, 24};
        a(bArr, new byte[]{-104, 53, -97, -111, 47, 107, 95, 56});
        Charset charset = StandardCharsets.UTF_8;
        String strB = C1.b(sb.append(new String(bArr, charset).intern()).append(str).toString());
        boolean z = strB != null && strB.equals(str2);
        if (z) {
            byte[] bArr2 = {-112, -94, 2, 97, 49, -13, 126, 110, -99, 3, -104, -92, 95, 32, -53, -22, -103, -7, -69, -99, 44, 18, -67};
            a(bArr2, new byte[]{-7, -47, 81, 24, 66, -121, 27, 3, -51, 113, -9, -44, 58, 82, -65, -109, -36, -120, -50, -4, 64, 70, -46});
            String strIntern = new String(bArr2, charset).intern();
            StringBuilder sbAppend = new StringBuilder().append(str);
            byte[] bArr3 = {87, 96, -44};
            a(bArr3, new byte[]{119, 90, -12, -108, 3, -47, -31, 31});
            c(strIntern, sbAppend.append(new String(bArr3, charset).intern()).append(str2).toString());
        }
        return z;
    }

    public final boolean a(Context context, boolean z) {
        byte[] bArr = {-42, 38, 90, -120, -89, 103, -84, -45, -45, -42, -21, 85, -68, 112, -69, -75, 14, -120, -71, 31, 55, 126, 13, 1, -104, -113, 29};
        a(bArr, new byte[]{-66, 71, 41, -38, -56, 8, -40, -70, -67, -79, -69, 52, -33, 27, -38, -46, 107, -5, -16, 113, 68, 10, 108, 109, -12, -22, 121});
        String strIntern = new String(bArr, StandardCharsets.UTF_8).intern();
        if (z) {
            for (String strIntern2 : X0.m) {
                if (a(context, strIntern2) != null) {
                    if (!this.r) {
                        byte[] bArr2 = {-105, -73, 0, -74};
                        a(bArr2, new byte[]{-29, -59, 117, -45, -125, -16, -71, -16});
                        strIntern2 = new String(bArr2, StandardCharsets.UTF_8).intern();
                    }
                    b(strIntern, strIntern2);
                    return true;
                }
            }
        }
        for (String strIntern3 : X0.l) {
            if (a(context, strIntern3) != null) {
                if (!this.r) {
                    byte[] bArr3 = {29, 48, -125, 122};
                    a(bArr3, new byte[]{105, 66, -10, 31, -113, 7, 73, -35});
                    strIntern3 = new String(bArr3, StandardCharsets.UTF_8).intern();
                }
                c(strIntern, strIntern3);
                return true;
            }
        }
        return false;
    }

    public final boolean b(Context context, boolean z) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        byte[] bArr = {31, -91, 0, -61, 108, -95, 65, 92, 35, -124, -48, -11, 121, 19, -8, 114, -107, 77, -62, -45, -39, 104, 36, -12, 60, 57, -125, 59, 65, -45, 118, 69, -13, -46, -126};
        a(bArr, new byte[]{118, -42, 82, -74, 2, -49, 40, 50, 68, -41, -91, -91, 11, 124, -101, 23, -26, 62, -89, -96, -104, 11, 80, -99, 74, 80, -9, 66, 12, -78, 24, 36, -108, -73, -16});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-80, -123, -36, 118, 40, -56, 24, -43};
        a(bArr2, new byte[]{-47, -26, -88, 31, 94, -95, 108, -84});
        ActivityManager activityManager = (ActivityManager) context.getSystemService(new String(bArr2, charset).intern());
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            String strIntern2 = it.next().processName;
            if (strIntern2 != null) {
                if (z) {
                    for (String str : X0.m) {
                        if (strIntern2.contains(str)) {
                            if (!this.r) {
                                byte[] bArr3 = {68, -105, -68, -9};
                                a(bArr3, new byte[]{48, -27, -55, -110, -39, -60, 34, -38});
                                strIntern2 = new String(bArr3, StandardCharsets.UTF_8).intern();
                            }
                            b(strIntern, strIntern2);
                            return true;
                        }
                    }
                }
                for (String str2 : X0.l) {
                    if (strIntern2.contains(str2)) {
                        if (!this.r) {
                            byte[] bArr4 = {-123, 61, 62, 86};
                            a(bArr4, new byte[]{-15, 79, 75, 51, -37, -22, -22, 20});
                            strIntern2 = new String(bArr4, StandardCharsets.UTF_8).intern();
                        }
                        c(strIntern, strIntern2);
                        return true;
                    }
                }
                byte[] bArr5 = {-119, -64, -5, -124, 54, 96};
                a(bArr5, new byte[]{-28, -95, -100, -19, 69, 11, -89, 37});
                Charset charset2 = StandardCharsets.UTF_8;
                if (strIntern2.contains(new String(bArr5, charset2).intern())) {
                    if (!this.r) {
                        byte[] bArr6 = {-94, -43, -121, 123};
                        a(bArr6, new byte[]{-42, -89, -14, 30, -88, -112, -22, -118});
                        strIntern2 = new String(bArr6, charset2).intern();
                    }
                    c(strIntern, strIntern2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        d(context);
    }

    public final boolean b(boolean z) {
        byte[] bArr = {26, -18, 84, 73, 93, -66, 118, 98, 82, -122, -38, -46, -103, 8, 8, -111, -66, -127, -103, 56, 126, 93};
        a(bArr, new byte[]{115, -99, 6, 60, 51, -48, 31, 12, 53, -43, -81, -126, -21, 103, 107, -12, -51, -14, -4, 75, 46, 14});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-31, -28};
        a(bArr2, new byte[]{-111, -105, 105, -67, -100, -128, -1, -59});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-15, -53, -108, -27, -122};
        a(bArr3, new byte[]{-127, -72, -76, -56, -57, -35, 21, 12});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {32, -109, -68, 6, 110};
        a(bArr4, new byte[]{80, -32, -100, 43, 11, -105, -61, -128});
        String[] strArr = {strIntern2, strIntern3, new String(bArr4, charset).intern()};
        for (int i = 0; i < 3; i++) {
            String string = strArr[i];
            String strB = C1.b(string);
            if (strB != null) {
                if (z) {
                    for (String str : X0.m) {
                        if (strB.contains(str)) {
                            if (this.r) {
                                StringBuilder sbAppend = new StringBuilder().append(string);
                                byte[] bArr5 = {-42};
                                a(bArr5, new byte[]{-10, 26, 33, -96, 55, 77, 27, 8});
                                string = sbAppend.append(new String(bArr5, StandardCharsets.UTF_8).intern()).append(str).toString();
                            }
                            b(strIntern, string);
                            return true;
                        }
                    }
                }
                for (String str2 : X0.l) {
                    if (strB.contains(str2)) {
                        if (this.r) {
                            StringBuilder sbAppend2 = new StringBuilder().append(string);
                            byte[] bArr6 = {21};
                            a(bArr6, new byte[]{53, -92, 117, -119, -62, 31, 11, 75});
                            string = sbAppend2.append(new String(bArr6, StandardCharsets.UTF_8).intern()).append(str2).toString();
                        }
                        c(strIntern, string);
                        return true;
                    }
                }
                byte[] bArr7 = {-19, -17, 86, 45, 24, 51};
                a(bArr7, new byte[]{-128, -114, 49, 68, 107, 88, -59, -49});
                Charset charset2 = StandardCharsets.UTF_8;
                if (strB.contains(new String(bArr7, charset2).intern())) {
                    if (this.r) {
                        StringBuilder sbAppend3 = new StringBuilder().append(string);
                        byte[] bArr8 = {-123};
                        a(bArr8, new byte[]{-91, -84, -52, 104, -23, 95, -47, -95});
                        StringBuilder sbAppend4 = sbAppend3.append(new String(bArr8, charset2).intern());
                        byte[] bArr9 = {99, -57, -38, -107, -10, 33};
                        a(bArr9, new byte[]{14, -90, -67, -4, -123, 74, 64, 72});
                        string = sbAppend4.append(new String(bArr9, charset2).intern()).toString();
                    }
                    c(strIntern, string);
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(byte[] bArr, byte[] bArr2) {
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
