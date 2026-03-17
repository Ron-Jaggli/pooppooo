package com.aheaditec.talsec.security;

import com.aheaditec.talsec_security.security.api.TalsecConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class K0 implements L0 {
    public static final a b = new a(null);
    public final TalsecConfig a;

    public static final class a {
        public a() {
        }

        @JvmStatic
        public final K0 a(TalsecConfig talsecConfig) {
            String[] blacklistedHashes;
            String[][] suspiciousPermissions;
            String[] whitelistedInstallationSources;
            byte[] bArr = {-84, 20, -109, -2, 109, -66, -25, -53, -7, 23, 79, -95};
            a(bArr, new byte[]{-40, 117, -1, -115, 8, -35, -92, -92, -105, 113, 38, -58});
            Intrinsics.checkNotNullParameter(talsecConfig, new String(bArr, StandardCharsets.UTF_8).intern());
            String[] blacklistedPackageNames = talsecConfig.getBlacklistedPackageNames();
            if ((blacklistedPackageNames == null || blacklistedPackageNames.length == 0) && (((blacklistedHashes = talsecConfig.getBlacklistedHashes()) == null || blacklistedHashes.length == 0) && (((suspiciousPermissions = talsecConfig.getSuspiciousPermissions()) == null || suspiciousPermissions.length == 0) && ((whitelistedInstallationSources = talsecConfig.getWhitelistedInstallationSources()) == null || whitelistedInstallationSources.length == 0)))) {
                return null;
            }
            return new K0(talsecConfig);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
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

    public K0(TalsecConfig talsecConfig) {
        String strIntern;
        String strIntern2;
        String strIntern3;
        this.a = talsecConfig;
        StringBuilder sb = new StringBuilder();
        String[] blacklistedPackageNames = talsecConfig.getBlacklistedPackageNames();
        if (blacklistedPackageNames == null || (strIntern = ArraysKt.joinToString$default(blacklistedPackageNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)) == null) {
            byte[] bArr = {-10, 59, -126, -80};
            a(bArr, new byte[]{-127, 126, -40, -11, 45, 52, -34, 85});
            strIntern = new String(bArr, StandardCharsets.UTF_8).intern();
        }
        sb.append(strIntern);
        String[] blacklistedHashes = talsecConfig.getBlacklistedHashes();
        if (blacklistedHashes == null || (strIntern2 = ArraysKt.joinToString$default(blacklistedHashes, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)) == null) {
            byte[] bArr2 = {1, 15, -34, -119};
            a(bArr2, new byte[]{88, -86, -100, -2, 59, 0, -98, -17});
            strIntern2 = new String(bArr2, StandardCharsets.UTF_8).intern();
        }
        sb.append(strIntern2);
        String[][] suspiciousPermissions = talsecConfig.getSuspiciousPermissions();
        if (suspiciousPermissions != null) {
            for (String[] strArr : suspiciousPermissions) {
                Intrinsics.checkNotNull(strArr);
                sb.append(ArraysKt.joinToString$default(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
            }
        } else {
            byte[] bArr3 = {61, -55, -28, 98};
            a(bArr3, new byte[]{60, -20, 114, 39, -37, 90, -18, 35});
            sb.append(new String(bArr3, StandardCharsets.UTF_8).intern());
        }
        String[] whitelistedInstallationSources = this.a.getWhitelistedInstallationSources();
        if (whitelistedInstallationSources == null || (strIntern3 = ArraysKt.joinToString$default(whitelistedInstallationSources, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)) == null) {
            byte[] bArr4 = {-36, -81, -107, -83};
            a(bArr4, new byte[]{-101, 10, -28, -38, 73, -4, 111, 71});
            strIntern3 = new String(bArr4, StandardCharsets.UTF_8).intern();
        }
        sb.append(strIntern3);
        String string = sb.toString();
        byte[] bArr5 = {-74, 6, 98, 29, 121, 110, -50, 63, -124, -117, 7, -88, -67};
        a(bArr5, new byte[]{-85, -103, 27, -126, -12, 54, -118, 113, -107, -43, 19, -97, -108});
        Intrinsics.checkNotNullExpressionValue(string, new String(bArr5, StandardCharsets.UTF_8).intern());
        C0004a1 c0004a1 = C0004a1.a;
        if (c0004a1.b(string) == null) {
            c0004a1.d(string);
            c0004a1.b();
            c0004a1.a();
        }
    }

    @JvmStatic
    public static final K0 a(TalsecConfig talsecConfig) {
        return b.a(talsecConfig);
    }

    @Override // com.aheaditec.talsec.security.L0
    public List<List<String>> b() {
        String[][] suspiciousPermissions = this.a.getSuspiciousPermissions();
        if (suspiciousPermissions == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(suspiciousPermissions.length);
        for (String[] strArr : suspiciousPermissions) {
            Intrinsics.checkNotNull(strArr);
            arrayList.add(ArraysKt.asList(strArr));
        }
        return arrayList;
    }

    @Override // com.aheaditec.talsec.security.L0
    public List<String> c() {
        String[] whitelistedInstallationSources = this.a.getWhitelistedInstallationSources();
        if (whitelistedInstallationSources != null) {
            return ArraysKt.asList(whitelistedInstallationSources);
        }
        return null;
    }

    @Override // com.aheaditec.talsec.security.L0
    public List<String> d() {
        String[] blacklistedPackageNames = this.a.getBlacklistedPackageNames();
        if (blacklistedPackageNames != null) {
            return ArraysKt.asList(blacklistedPackageNames);
        }
        return null;
    }

    public /* synthetic */ K0(TalsecConfig talsecConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(talsecConfig);
    }

    @Override // com.aheaditec.talsec.security.L0
    public List<String> a() {
        String[] blacklistedHashes = this.a.getBlacklistedHashes();
        if (blacklistedHashes != null) {
            return ArraysKt.asList(blacklistedHashes);
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i;
        int i2 = 0;
        byte[] bArr3 = null;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1180709023;
        byte[] bArr4 = null;
        while (true) {
            int i6 = ((i5 & 16777216) * (i5 | 16777216)) + ((i5 & (-16777217)) * ((~i5) & 16777216));
            int i7 = i5 >>> 8;
            int iA = J.a(i7, i6, 1, ((-1) - i7) | ((-1) - i6));
            int i8 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
            switch ((i8 - 814310662) - ((i8 & (-814310662)) * 2)) {
                case -2000520841:
                    int length2 = bArr4.length;
                    int i9 = 0 - (0 - length);
                    int i10 = (((double) ((byte) bArr3[((length2 & (~i9)) * 2) - (length2 ^ i9)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i9)) * 2) - (length2 ^ i9)])) == Double.NaN ? 0 : -1)) <= -1 ? 0 : 1;
                    i5 = i10 != 0 ? i10 != 0 ? 1565752577 : 1621215041 : -1164716566;
                    i4 = length;
                    i2 = 0;
                    break;
                case -870579640:
                    int i11 = (i3 - 1) - (i3 | (-4));
                    byte b2 = bArr3[i11];
                    int i12 = ((b2 & 16777216) * (b2 | 16777216)) + ((b2 & (-16777217)) * ((~b2) & 16777216));
                    int i13 = i3 + 3 + (((-1) - i3) | (-3));
                    int i14 = bArr3[i13] & 255;
                    int i15 = i14 * ((~i14) & 65536);
                    int i16 = ~((((-1268032266) | (~i15)) | i12) - ((i15 & (-1268032266)) | i12));
                    int iA2 = K.a((-132004404) & i3, i3, 1, (-132004403) & i3);
                    int i17 = bArr3[iA2] & 255;
                    int i18 = i17 * ((~i17) & 256);
                    int i19 = (i18 + i16) - (i18 & i16);
                    int i20 = bArr3[i3] & 255;
                    int i21 = (i19 & (~i20)) + i20;
                    byte b3 = bArr4[i11];
                    int i22 = ((b3 & 16777216) * (b3 | 16777216)) + (((-16777217) & b3) * ((~b3) & 16777216));
                    int i23 = bArr4[i13] & 255;
                    int i24 = i23 * ((~i23) & 65536);
                    int i25 = ~((i22 | ((~i24) | (-1355861741))) - ((i24 & (-1355861741)) | i22));
                    int i26 = bArr4[iA2] & 255;
                    int i27 = i26 * ((~i26) & 256);
                    int iA3 = J.a(i27, i25, 1, ((-1) - i27) | ((-1) - i25));
                    int i28 = (iA3 - 1) - ((~(bArr4[i3] & 255)) | iA3);
                    int i29 = i21 << ((i21 > Double.NaN ? 1 : (i21 == Double.NaN ? 0 : -1)) >>> 31);
                    int i30 = (i29 ^ (-418000873)) + ((i29 & (-418000873)) * 2);
                    int i31 = (i30 + i28) - ((i30 & i28) * 2);
                    bArr4[i3] = (byte) i31;
                    bArr4[iA2] = (byte) (i31 >>> 8);
                    bArr4[i13] = (byte) (i31 >>> 16);
                    bArr4[i11] = (byte) (i31 >>> 24);
                    i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                    int length3 = bArr4.length;
                    int iA4 = C0001a.a(bArr4.length, 4, 0, 0);
                    if ((((i3 > (((length3 & (~iA4)) * 2) - (length3 ^ iA4)) ? 1 : (i3 == (((length3 & (~iA4)) * 2) - (length3 ^ iA4)) ? 0 : -1)) >>> 31) & 1) == 0) {
                        i2 = 0;
                        i5 = 1621215041;
                    } else {
                        i5 = 1910359311;
                        i2 = 0;
                    }
                    break;
                case -97532338:
                    length = bArr4.length % 4;
                    int i32 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i = i32 != 0 ? 986083301 : 1621215041;
                    i5 = i32 == 0 ? -1138188205 : i;
                    break;
                case 298177592:
                    int length4 = bArr4.length;
                    int i33 = 0 - i4;
                    int iA5 = L.a(i2, (length4 & 2) | N.a(i33, -4, 1, length4), i33 * 3, 1);
                    byte b4 = bArr3[iA5];
                    int length5 = bArr4.length;
                    int i34 = 0 - i33;
                    int i35 = i34 | length5;
                    byte b5 = bArr3[O.a(i34, 2, i35, (length5 ^ i34) ^ i35)];
                    bArr3[iA5] = (byte) (((byte) (b5 ^ b4)) + ((byte) (((byte) 2) * ((byte) (b5 & b4)))));
                    i5 = 1565752577;
                    break;
                case 373627814:
                    break;
                case 975213712:
                    int length6 = bArr4.length;
                    int i36 = 0 - i4;
                    int length7 = bArr4.length;
                    int i37 = ~i36;
                    byte b6 = bArr4[((length7 | i36) - (((-656070458) & i37) & length7)) + (((-656070458) | i36) & length7)];
                    int length8 = bArr4.length;
                    byte b7 = bArr3[(length8 ^ i37) + ((length8 | i36) * 2) + 1];
                    bArr4[((length6 | i36) * 2) - (length6 ^ i36)] = (byte) (((byte) (b7 - b6)) + ((byte) (((byte) 2) * ((byte) ((~b7) & b6)))));
                    length = (~i4) + (i4 * 2);
                    int i38 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i38 != 0 ? 986083301 : 1621215041;
                    if (i38 == 0) {
                    }
                    break;
                case 1548321255:
                    int length9 = bArr.length;
                    int length10 = 0 - (0 - (bArr.length % 4));
                    i5 = ((length9 & (~length10)) - ((~length9) & length10) <= 0 ? i2 : 1) != 0 ? 1910359311 : 1621215041;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i3 = i2;
                    break;
                default:
                    i5 = 1621215041;
                    break;
            }
            return;
        }
    }
}
