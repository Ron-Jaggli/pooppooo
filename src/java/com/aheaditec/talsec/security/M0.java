package com.aheaditec.talsec.security;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.aheaditec.talsec_security.security.api.SuspiciousAppInfo;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class M0 extends AbstractC0041o {
    public final L0 o;
    public final V0 p;
    public AppOpsManager q;

    public static final class a {
        public final String a;
        public final Set<String> b;

        public a(String str, Set<String> set) {
            byte[] bArr = {46, -102, -74, -27, 54, 114};
            a(bArr, new byte[]{56, -55, 101, 48, 89, 28, 108, 57});
            Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
            this.a = str;
            this.b = set;
        }

        public final String a() {
            return this.a;
        }

        public final Set<String> b() {
            return this.b;
        }

        public final Set<String> c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Set<String> set = this.b;
            return iHashCode + (set == null ? 0 : set.hashCode());
        }

        public String toString() {
            String str = this.a;
            Set<String> set = this.b;
            byte[] bArr = {40, -51, 95, 81, -107, -19, 30, 20, 95, 73, -40, -91, -64, -48, -20, 85, -76, 13, 63, 30, -33, -61, -70, 48, 25, 109, 45, -67, 32, 11};
            a(bArr, new byte[]{-33, -81, -70, -125, -104, -68, -59, -59, 70, 40, 28, 98, -59, -79, 13, -123, 66, 95, -38, -55, -49, -95, 32, -28, 16, 34, -56, 108, 78, 54});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {77, -121, 106, 7, -11, 97, 38, 65, 88, -50, 92, -85, 40, -88};
            a(bArr2, new byte[]{-99, -118, -120, -64, -29, 58, -3, -108, 79, -103, -67, 123, 91, -107});
            String strIntern2 = new String(bArr2, charset).intern();
            byte[] bArr3 = {39};
            a(bArr3, new byte[]{14, 41, -20, 33, -4, 7, 55, -11});
            return strIntern + str + strIntern2 + set + new String(bArr3, charset).intern();
        }

        public /* synthetic */ a(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : set);
        }

        public final a a(String str, Set<String> set) {
            byte[] bArr = {26, 117, 35, 23, -115, 119};
            a(bArr, new byte[]{12, 38, -16, -62, -30, 25, -72, -33});
            Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
            return new a(str, set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a a(a aVar, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                set = aVar.b;
            }
            return aVar.a(str, (Set<String>) set);
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
                        byte b = bArr3[i12];
                        int length3 = bArr4.length;
                        byte b2 = bArr3[(length3 ^ i11) + ((i10 | length3) * 2) + 1];
                        int i13 = ((byte) 0) - b;
                        bArr3[i12] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i13))))) - ((byte) (b2 ^ i13)));
                        i5 = -34715366;
                        i2 = 0;
                        break;
                    case -1882653318:
                        int i14 = (i4 - 1) - (i4 | (-4));
                        byte b3 = bArr3[i14];
                        int i15 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                        int i16 = i4 + 3 + (((-1) - i4) | (-3));
                        int i17 = bArr3[i16] & 255;
                        int i18 = i17 * ((~i17) & 65536);
                        int i19 = ~((i15 | (1169991170 | (~i18))) - ((i18 & 1169991170) | i15));
                        int iA = K.a(689061172 & i4, i4, 1, 689061173 & i4);
                        int i20 = bArr3[iA] & 255;
                        int i21 = ((~i19) & (i20 * ((~i20) & 256))) + i19;
                        int i22 = (i21 - 1) - ((~(bArr3[i4] & 255)) | i21);
                        byte b4 = bArr4[i14];
                        int i23 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
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
                        byte b5 = bArr4[(length8 ^ i37) + ((length8 & i37) * 2)];
                        int length9 = bArr4.length;
                        int i39 = 0 - i37;
                        byte b6 = bArr3[(((~i39) & length9) * 2) - (length9 ^ i39)];
                        bArr4[L.a(i2, (length7 & 2) | iA2, i38, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(R0 r0, E1 e1, L0 l0, V0 v0) {
        super(r0, e1);
        byte[] bArr = {16, 10, -109, -113, -125, -121};
        c(bArr, new byte[]{124, 101, -12, -24, -26, -11, -12, 37});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {-126, -66, 66, 54, -59, 52, 124, 123};
        c(bArr2, new byte[]{-16, -37, 35, 85, -79, 93, 19, 21});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
        this.o = l0;
        this.p = v0;
    }

    public final String a(File file) {
        MessageDigest messageDigest;
        FileInputStream fileInputStream;
        byte[] bArr;
        try {
            byte[] bArr2 = {-58, 5, 86, -122, -20, -76, -112};
            c(bArr2, new byte[]{-107, 77, 23, -85, -34, -127, -90, 36});
            messageDigest = MessageDigest.getInstance(new String(bArr2, StandardCharsets.UTF_8).intern());
            fileInputStream = new FileInputStream(file);
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                byte[] bArrDigest = messageDigest.digest();
                byte[] bArr3 = {-114, 122, -4, 11, -93, -123, -17, -97, -124, 6, 10};
                c(bArr3, new byte[]{-22, 19, -101, 110, -48, -15, -57, -79, -86, 40, 35});
                Intrinsics.checkNotNullExpressionValue(bArrDigest, new String(bArr3, StandardCharsets.UTF_8).intern());
                return a(bArrDigest);
            }
            messageDigest.update(bArr, 0, i);
            return null;
        }
    }

    public final void b(Context context) {
        if (this.q == null) {
            byte[] bArr = {56, 85, 4, 104, -86, -124};
            c(bArr, new byte[]{89, 37, 116, 7, -38, -9, 58, -2});
            this.q = (AppOpsManager) context.getSystemService(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        if (this.o == null) {
            return;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        final PackageManager packageManager = context.getPackageManager();
        a(b(new Function0() { // from class: com.aheaditec.talsec.security.M0$$ExternalSyntheticLambda1
            public final Object invoke() {
                return M0.a(packageManager, this, linkedHashSet, linkedHashSet2);
            }
        }), new ArrayList<>(linkedHashSet2));
    }

    public final boolean c(PackageInfo packageInfo, N0 n0) {
        int iIndexOf;
        L0 l0 = this.o;
        List<String> listD = l0 != null ? l0.d() : null;
        if (listD == null || listD.isEmpty() || (iIndexOf = listD.indexOf(packageInfo.packageName)) < 0) {
            return false;
        }
        byte[] bArr = {-52, 56, 5, -68, 16, 11, 68, 97, 6, -6, 110, -109, -88, -108, -50, -93, 19, -100, -8, -126, 62, 50, 38, -2, -20, -17, -47};
        c(bArr, new byte[]{-95, 89, 105, -53, 113, 121, 33, 49, 103, -103, 5, -14, -49, -15, -128, -62, 126, -7, -70, -18, 95, 81, 77, -110, -123, -100, -91});
        n0.a(new C0025h1(new String(bArr, StandardCharsets.UTF_8).intern(), String.valueOf(iIndexOf)));
        return true;
    }

    public final boolean d(String str) {
        List<String> listC;
        byte[] bArr = {9, 72, 28, 122, 92};
        c(bArr, new byte[]{108, 58, 110, 21, 46, 26, 80, 26});
        if (Intrinsics.areEqual(str, new String(bArr, StandardCharsets.UTF_8).intern())) {
            return false;
        }
        L0 l0 = this.o;
        return !((l0 == null || (listC = l0.c()) == null) ? false : CollectionsKt.contains(listC, str));
    }

    public final a a(PackageManager packageManager, PackageInfo packageInfo, N0 n0) {
        a aVar;
        int i = 2;
        Set set = null;
        if (c(packageInfo, n0) || b(packageInfo, n0)) {
            byte[] bArr = {-25, -27, 122, -38, -38, 112, 11, -67, 101};
            c(bArr, new byte[]{-123, -119, 27, -71, -79, 28, 98, -50, 17});
            aVar = new a(new String(bArr, StandardCharsets.UTF_8).intern(), set, i, set);
        } else {
            boolean zB = b(packageManager, packageInfo, n0);
            Set<String> setA = a(packageInfo, n0);
            if (zB && setA != null) {
                byte[] bArr2 = {77, 117, 111, -28, -13, 36, -44, 127, 19, -40, -34, -106, 68, 1, 20, -113, 54, -50, -75, -106};
                c(bArr2, new byte[]{62, 0, 28, -108, -102, 71, -67, 16, 102, -85, -114, -13, 54, 108, 125, -4, 69, -89, -38, -8});
                return new a(new String(bArr2, StandardCharsets.UTF_8).intern(), setA);
            }
            if (!zB) {
                return null;
            }
            byte[] bArr3 = {-36, -2, -26, -69, 77, -54, 41, -65, 52, 76, -39, -53, 61};
            c(bArr3, new byte[]{-75, -112, -107, -49, 44, -90, 69, -20, 91, 57, -85, -88, 88});
            aVar = new a(new String(bArr3, StandardCharsets.UTF_8).intern(), set, i, set);
        }
        return aVar;
    }

    public final boolean b(PackageInfo packageInfo, N0 n0) {
        ApplicationInfo applicationInfo;
        String str;
        L0 l0 = this.o;
        List<String> listA = l0 != null ? l0.a() : null;
        if (listA != null && !listA.isEmpty() && (applicationInfo = packageInfo.applicationInfo) != null && (str = applicationInfo.sourceDir) != null) {
            String strA = a(new File(str));
            if (CollectionsKt.contains(listA, strA)) {
                byte[] bArr = {-91, 72, -8, -65, -73, -17, -72, 21, 118, 116, -70, -68, -51, 86, 116, 35, -19, -26, -26, 3};
                c(bArr, new byte[]{-56, 41, -108, -56, -42, -99, -35, 93, 23, 7, -46, -2, -95, 55, 23, 72, -127, -113, -107, 119});
                n0.a(new C0025h1(new String(bArr, StandardCharsets.UTF_8).intern(), strA));
                return true;
            }
        }
        return false;
    }

    public final boolean c(PackageInfo packageInfo) {
        boolean zStartsWith$default;
        boolean zStartsWith$default2;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String str = applicationInfo != null ? applicationInfo.sourceDir : null;
        if (str != null) {
            byte[] bArr = {-50, -69, 117, 14, 118, -80, -12, 108, -66, 27, -92, 11};
            c(bArr, new byte[]{-31, -56, 12, 125, 2, -43, -103, 67, -33, 107, -44, 36});
            zStartsWith$default = StringsKt.startsWith$default(str, new String(bArr, StandardCharsets.UTF_8).intern(), false, 2, (Object) null);
        } else {
            zStartsWith$default = false;
        }
        if (!zStartsWith$default) {
            if (str != null) {
                byte[] bArr2 = {-70, 66, 125, 35, 66, -52, -80, -41, -56, -40, 51, -43, -42, -45, 46, -24, 117};
                c(bArr2, new byte[]{-107, 49, 4, 80, 54, -87, -35, -8, -72, -86, 90, -93, -5, -78, 94, -104, 90});
                zStartsWith$default2 = StringsKt.startsWith$default(str, new String(bArr2, StandardCharsets.UTF_8).intern(), false, 2, (Object) null);
            } else {
                zStartsWith$default2 = false;
            }
            if (!zStartsWith$default2) {
                return false;
            }
        }
        return true;
    }

    public static final X a(PackageManager packageManager, M0 m0, Set set, Set set2) {
        byte[] bArr = {84, 10, 31, 44, 37, -114};
        c(bArr, new byte[]{32, 98, 118, 95, 1, -66, -79, 16});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(m0, new String(bArr, charset).intern());
        byte[] bArr2 = {-24, -88, 24, -68, 14, 16, -54, -112, 70, 69, 74, 117, 14, -100, -2, 58, 117, -47, -56, -80, -111, 0};
        c(bArr2, new byte[]{-52, -37, 125, -56, 65, 118, -121, -15, 42, 50, 43, 7, 107, -43, -112, 89, 28, -75, -83, -34, -27, 115});
        Intrinsics.checkNotNullParameter(set, new String(bArr2, charset).intern());
        byte[] bArr3 = {-103, -41, -15, -63, -69, -126, -20, 9, 92, 73, 22, 30, 73, 112, -114};
        c(bArr3, new byte[]{-67, -92, -124, -78, -53, -21, -113, 96, 51, 60, 101, 95, 57, 0, -3});
        Intrinsics.checkNotNullParameter(set2, new String(bArr3, charset).intern());
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(4224);
        byte[] bArr4 = {54, -16, 49, -125, 25, -61, -23, -84, -115, 107, 40, 94, 32, 112, -87, -10, -124, 8, 37, -42, 114, 107, 123, -99, -35};
        c(bArr4, new byte[]{81, -107, 69, -54, 119, -80, -99, -51, -31, 7, 77, 58, 112, 17, -54, -99, -27, 111, 64, -91, 90, 69, 85, -77, -12});
        Intrinsics.checkNotNullExpressionValue(installedPackages, new String(bArr4, charset).intern());
        V0 v0 = m0.p;
        if (v0 != null && v0.a()) {
            C0004a1 c0004a1 = C0004a1.a;
            c0004a1.a();
            c0004a1.b();
        }
        for (PackageInfo packageInfo : installedPackages) {
            String str = packageInfo.packageName;
            byte[] bArr5 = {54, -89, -44, 1, 50, 114, 92, -120, -28, 98, -31};
            c(bArr5, new byte[]{70, -58, -73, 106, 83, 21, 57, -58, -123, 15, -124});
            Intrinsics.checkNotNullExpressionValue(str, new String(bArr5, StandardCharsets.UTF_8).intern());
            C0004a1 c0004a12 = C0004a1.a;
            if (!c0004a12.c(str) && !c0004a12.b(str, packageInfo.lastUpdateTime)) {
                N0 n0 = new N0();
                Intrinsics.checkNotNull(packageManager);
                Intrinsics.checkNotNull(packageInfo);
                a aVarA = m0.a(packageManager, packageInfo, n0);
                if (aVarA != null) {
                    if (!n0.a.isEmpty()) {
                        set.add(n0);
                    }
                    set2.add(new SuspiciousAppInfo(packageInfo, aVarA.a, aVarA.b));
                } else {
                    c0004a12.a(str, packageInfo.lastUpdateTime);
                }
            }
        }
        if (!set.isEmpty()) {
            m0.a((Set<N0>) set);
        }
        return new X(set2.isEmpty(), true, true);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    private static void c(byte[] bArr, byte[] bArr2) {
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
                    byte b = bArr3[(length3 & (~i11)) - ((~length3) & i11)];
                    int length4 = bArr3.length;
                    byte b2 = bArr4[((length4 | i10) - (((-1678010279) & (~i10)) & length4)) + ((i10 | (-1678010279)) & length4)];
                    bArr3[((length2 | i10) * 2) - (length2 ^ i10)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - b2)) - b);
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
                    byte b3 = bArr4[i15];
                    int length8 = bArr3.length;
                    byte b4 = bArr4[((i14 | length8) * 2) - (length8 ^ i14)];
                    int i16 = ((byte) 0) - b3;
                    int i17 = i16 | b4;
                    bArr4[i15] = (byte) (((byte) (((byte) i17) - ((byte) (((byte) 2) * ((byte) i16))))) + ((byte) ((b4 ^ i16) ^ i17)));
                    i2 = i9;
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i18 = i4 + 4 + (((-1) - i4) | (-4));
                    byte b5 = bArr4[i18];
                    int i19 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
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
                    byte b6 = bArr3[i18];
                    int i30 = ((b6 & 16777216) * (b6 | 16777216)) + (((-16777217) & b6) * ((~b6) & 16777216));
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

    public final boolean b(PackageManager packageManager, PackageInfo packageInfo, N0 n0) {
        String strIntern;
        String str;
        if (a(packageInfo)) {
            return false;
        }
        String str2 = packageInfo.packageName;
        byte[] bArr = {-61, 31, -100, 81, 79, 115, -27, 81, -52, 47, 31};
        c(bArr, new byte[]{-77, 126, -1, 58, 46, 20, -128, 31, -83, 66, 122});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(str2, new String(bArr, charset).intern());
        try {
            if (Build.VERSION.SDK_INT < 30) {
                strIntern = packageManager.getInstallerPackageName(str2);
                if (strIntern == null) {
                    byte[] bArr2 = {-6, 3, 7, -109, -118, -77, 114};
                    c(bArr2, new byte[]{-113, 109, 108, -3, -27, -60, 28, 127});
                    str = new String(bArr2, charset);
                    strIntern = str.intern();
                }
            } else {
                strIntern = packageManager.getInstallSourceInfo(str2).getInitiatingPackageName();
                if (strIntern == null) {
                    byte[] bArr3 = {111, 38, -16, 21, 39, 79, 1};
                    c(bArr3, new byte[]{26, 72, -101, 123, 72, 56, 111, -41});
                    str = new String(bArr3, charset);
                    strIntern = str.intern();
                }
            }
        } catch (Exception unused) {
            byte[] bArr4 = {12, -4, 67, 1, -120};
            c(bArr4, new byte[]{105, -114, 49, 110, -6, -67, 102, 115});
            strIntern = new String(bArr4, StandardCharsets.UTF_8).intern();
        }
        if (!d(strIntern)) {
            return false;
        }
        byte[] bArr5 = {-101, -16, -127, -51, -115, 33, 127, 60, -20, 72, 114, -6, 22, -46, 3, 109, -44, 68, 89, 78, 127, -4, 88, 82, 124, -24, -74, 39};
        c(bArr5, new byte[]{-24, -123, -14, -67, -28, 66, 22, 83, -103, 59, 59, -108, 101, -90, 98, 1, -72, 37, 45, 39, 16, -110, 11, 61, 9, -102, -43, 66});
        n0.a(new C0025h1(new String(bArr5, StandardCharsets.UTF_8).intern(), strIntern));
        return true;
    }

    public final boolean b(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        return (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
    }

    public final int a(ApplicationInfo applicationInfo, String str) throws IllegalAccessException, InvocationTargetException {
        byte[] bArr = {18, -75, 13, -73, 87, -40, -84, -121, -41, -2, 112, 118, 99, 92};
        c(bArr, new byte[]{113, -35, 104, -44, 60, -105, -36, -55, -72, -86, 24, 4, 12, 43});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        Class cls = Integer.TYPE;
        Object objInvoke = AppOpsManager.class.getMethod(strIntern, cls, cls, String.class).invoke(this.q, 66, Integer.valueOf(applicationInfo.uid), str);
        byte[] bArr2 = {107, 19, -10, 42, -58, -111, 83, -126, -59, 25, -48, -27, 42, -31, 122, -59, 73, -1, 61, -64, 91, 126, -82, -98, -124, 76, -12, -7, -12, 49, 97, 93, -49, -3, -58, -41, 32, -121, 71, 3, 6, 118, 101, -78, 20, -7, 51};
        c(bArr2, new byte[]{5, 102, -102, 70, -26, -14, 50, -20, -85, 118, -92, -59, 72, -124, 90, -90, 40, -116, 73, -32, 47, 17, -114, -16, -21, 34, -39, -105, -127, 93, 13, 125, -69, -124, -74, -78, 0, -20, 40, 119, 106, 31, 11, -100, 93, -105, 71});
        Intrinsics.checkNotNull(objInvoke, new String(bArr2, charset).intern());
        return ((Integer) objInvoke).intValue();
    }

    public final Set<String> a(PackageInfo packageInfo, N0 n0) {
        Integer numValueOf;
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        L0 l0 = this.o;
        List<List<String>> listB = l0 != null ? l0.b() : null;
        if (listB != null && !listB.isEmpty() && strArr != null && iArr != null) {
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                int i3 = i + 1;
                if ((iArr[i] & 2) != 0) {
                    arrayList.add(str);
                }
                i2++;
                i = i3;
            }
            Set set = CollectionsKt.toSet(arrayList);
            for (List<String> list : listB) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    byte[] bArr = {-49, 127, 62, 52, 47, 126, -104, -73, 47, 14, 76, 112, 41, -22, -103, 20, 49, 93, 104, 34, -76, -42, 62, -32, -97, -57, 92, -34, 121, 99, -95, 11, 96, -123, 53, -69, -64, -82, 124, -43, -107, -77, -45};
                    c(bArr, new byte[]{-82, 17, 90, 70, 64, 23, -4, -103, 95, 107, 62, 29, 64, -103, -22, 125, 94, 51, 70, 112, -15, -121, 107, -91, -52, -109, 3, -105, 55, 48, -11, 74, 44, -55, 106, -21, -127, -19, 55, -108, -46, -10, -128});
                    Charset charset = StandardCharsets.UTF_8;
                    if (ArraysKt.contains(strArr, new String(bArr, charset).intern()) && !list.isEmpty()) {
                        byte[] bArr2 = {46, -5, 77, -2, 64, -5, -86, 111, -17, -114, 22, 40, -35, -5, -24, 85, 71, -53, 25, -9, 2, -127, 116, 61, -104, 109, -80, -117, -72, 97, -34, 123, -39, 30, -46, -3, -86, 89, 48, 8, -120, -87, -67};
                        c(bArr2, new byte[]{79, -107, 41, -116, 47, -110, -50, 65, -97, -21, 100, 69, -76, -120, -101, 60, 40, -91, 55, -91, 71, -48, 33, 120, -53, 57, -17, -62, -10, 50, -118, 58, -107, 82, -115, -83, -21, 26, 123, 73, -49, -20, -18});
                        if (list.contains(new String(bArr2, charset).intern())) {
                            try {
                                AppOpsManager appOpsManager = this.q;
                                if (appOpsManager != null) {
                                    byte[] bArr3 = {-28, -24, 32, -18, 121, 38, 58, -84, -59, 15, 116, -7, -53, 105, 118, 116, -90, 126, -13, -50, -65, -4, 14, 74, 103, -93, 20, -103, -63, 13, 1, -115};
                                    c(bArr3, new byte[]{-123, -122, 68, -100, 22, 79, 94, -106, -73, 106, 5, -116, -82, 26, 2, 43, -49, 16, -128, -70, -34, -112, 98, 21, 23, -62, 119, -14, -96, 106, 100, -2});
                                    numValueOf = Integer.valueOf(appOpsManager.unsafeCheckOpNoThrow(new String(bArr3, charset).intern(), applicationInfo.uid, packageInfo.packageName));
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null && numValueOf.intValue() == 0) {
                                    byte[] bArr4 = {-14, -29, -52, -67, -56, -37, 91, 89, 94, -117, 77, 47, -111, -97, 77, -24, -120, -31, 31, -31, -20, 32, -84, 97, 63, 27, 89};
                                    c(bArr4, new byte[]{-127, -106, -65, -51, -95, -72, 50, 54, 43, -8, 29, 74, -29, -14, 36, -101, -5, -120, 112, -113, -85, 82, -51, 15, 75, 126, 61});
                                    n0.a(new W(new String(bArr4, charset).intern(), list));
                                    return CollectionsKt.toSet(list);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (!list.isEmpty()) {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (!set.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    byte[] bArr5 = {-26, 67, -60, 113, -7, -7, 23, 45, -117, -19, -39, 86, 96, 124, -84, 60, -35, 11, -61, -36, -44, 50, -66, 124, -19, -46, 9};
                    c(bArr5, new byte[]{-107, 54, -73, 1, -112, -102, 126, 66, -2, -98, -119, 51, 18, 17, -59, 79, -82, 98, -84, -78, -109, 64, -33, 18, -103, -73, 109});
                    n0.a(new W(new String(bArr5, StandardCharsets.UTF_8).intern(), list));
                    return CollectionsKt.toSet(list);
                }
            }
        }
        return null;
    }

    public final boolean a(PackageInfo packageInfo) {
        return b(packageInfo) || c(packageInfo);
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        byte[] bArr = {61, 15, -103, 85, -7, 78, 35};
        c(bArr, new byte[]{94, 96, -9, 33, -100, 54, 87, 66});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        b(context);
    }

    public final String a(byte[] bArr) {
        return ArraysKt.joinToString$default(bArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.aheaditec.talsec.security.M0$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return M0.a(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    public static final CharSequence a(byte b) {
        byte[] bArr = {-79, -12, -62, 32};
        c(bArr, new byte[]{-108, -60, -16, 88, -19, -91, 48, 41});
        Charset charset = StandardCharsets.UTF_8;
        String str = String.format(new String(bArr, charset).intern(), Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        byte[] bArr2 = {-119, -107, 64, -89, 37, 121, 81, -100, -90, 87, 21};
        c(bArr2, new byte[]{-17, -6, 50, -54, 68, 13, 121, -78, -120, 121, 60});
        Intrinsics.checkNotNullExpressionValue(str, new String(bArr2, charset).intern());
        return str;
    }
}
