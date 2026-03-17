package com.aheaditec.talsec.security;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class I1 extends AbstractC0056w {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final a o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {86, 118, 99, -85, -113, 55};
        c(bArr, new byte[]{-87, 64, -41, 30, -36, 106, 122, 82});
        Charset charset = StandardCharsets.UTF_8;
        G = new String(bArr, charset).intern();
        byte[] bArr2 = {87, 37, -50, -32, 37};
        c(bArr2, new byte[]{-88, 23, 11, 85, 120, -4, -92, -1});
        F = new String(bArr2, charset).intern();
        byte[] bArr3 = {91, 73, 113};
        c(bArr3, new byte[]{8, 8, 52, -101, -105, -48, -39, 108});
        E = new String(bArr3, charset).intern();
        byte[] bArr4 = {-102, -87, 115, -21};
        c(bArr4, new byte[]{97, -108, -64, 126, 95, -111, 78, -107});
        D = new String(bArr4, charset).intern();
        byte[] bArr5 = {-30, -85, -121, 52};
        c(bArr5, new byte[]{5, -101, 56, -122, 38, 63, 113, -65});
        C = new String(bArr5, charset).intern();
        byte[] bArr6 = {-108, 92, 99, 7};
        c(bArr6, new byte[]{111, 97, -48, -109, -100, 2, 119, 124});
        B = new String(bArr6, charset).intern();
        byte[] bArr7 = {56, 70, 58};
        c(bArr7, new byte[]{119, 17, 127, 85, -6, -27, 31, -125});
        A = new String(bArr7, charset).intern();
        byte[] bArr8 = {-112, 113, 18};
        c(bArr8, new byte[]{-62, 34, 92, -120, -114, 18, -123, -73});
        z = new String(bArr8, charset).intern();
        byte[] bArr9 = {112, -126, -62};
        c(bArr9, new byte[]{39, -46, -125, 69, 111, 108, 18, 31});
        y = new String(bArr9, charset).intern();
        byte[] bArr10 = {70, 41, -60};
        c(bArr10, new byte[]{17, 108, -108, 71, 6, 60, 106, 49});
        x = new String(bArr10, charset).intern();
        byte[] bArr11 = {-78, 51, -42, -8, 11, 77, 29, -112, 1, 80, -43};
        c(bArr11, new byte[]{73, 14, 101, 107, 8, 119, -86, 57, 64, 19, -116});
        w = new String(bArr11, charset).intern();
        byte[] bArr12 = {64, -63, 52, 32, 48, -71, 58, 11, 11, -111};
        c(bArr12, new byte[]{-69, -13, -10, -31, -64, -117, -125, -88, 72, -56});
        v = new String(bArr12, charset).intern();
        byte[] bArr13 = {-108, 94, -106, -122, 83, -94, -74, 83, 18, -10, -32};
        c(bArr13, new byte[]{103, 99, 33, 54, 80, -104, 1, -6, 83, -75, -71});
        u = new String(bArr13, charset).intern();
        byte[] bArr14 = {-62, -24, -37, -99, 108, 118, -10, 66, 18, -58, 127, -3, -40, 78};
        c(bArr14, new byte[]{59, -45, 102, 45, -97, 50, 54, -125, -30, -12, -58, 94, -101, 23});
        t = new String(bArr14, charset).intern();
        byte[] bArr15 = {85, -38, -123};
        c(bArr15, new byte[]{2, -97, -43, -95, -96, -115, 22, -65});
        s = new String(bArr15, charset).intern();
        byte[] bArr16 = {-20, 47, 55, 47};
        c(bArr16, new byte[]{31, 18, -128, -97, 42, 29, -127, 124});
        r = new String(bArr16, charset).intern();
        byte[] bArr17 = {25, 22, -60, -123, 119, -110, 51};
        c(bArr17, new byte[]{-32, 45, 121, 53, 56, -59, 125, 33});
        q = new String(bArr17, charset).intern();
        byte[] bArr18 = {-83, -18, 62, 38, -128, 86, -47, 61, -53, 92, -113, 106};
        c(bArr18, new byte[]{-70, -67, -21, -15, -106, 1, 55, -26, 51, 58, 109, -83});
        p = new String(bArr18, charset).intern();
        o = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(R0 r0, E1 e1) {
        super(r0, e1);
        byte[] bArr = {88, 87, 56, -88, -58, -74};
        c(bArr, new byte[]{72, 10, -31, 97, -93, -60, -105, -55});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {53, 121, -109, -79, 58, 7, -107, 114};
        c(bArr2, new byte[]{35, 42, 64, 116, 34, 80, 116, -94});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ec, code lost:
    
        if (kotlin.text.StringsKt.contains$default(r13, new java.lang.String(r10, r4).intern(), false, 2, (java.lang.Object) null) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x028e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13, new java.lang.String(r0, r4).intern()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.net.wifi.WifiInfo r13, android.net.wifi.WifiManager r14) {
        /*
            Method dump skipped, instruction units count: 1109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.I1.a(android.net.wifi.WifiInfo, android.net.wifi.WifiManager):boolean");
    }

    public final boolean b(Context context) {
        WifiInfo connectionInfo;
        byte[] bArr = {27, -113, 47, 75, 37, -115, -88, -98, 74, -123, -98, 108, -14, -11, -77, 108, -58, -5, 39, 29, 24, 29, -68, 40, -7, 43, 97, -105, -35, -106, 83, -40, -35, 54, -70, -7};
        c(bArr, new byte[]{30, -45, -7, -97, 54, -38, 126, 14, 94, -42, 122, -93, -1, -108, 86, -89, -43, -89, -121, -66, -1, 45, 11, -99, 14, 103, -88, 60, 55, -96, -126, 109, 37, 24, 124, 94});
        Charset charset = StandardCharsets.UTF_8;
        boolean z2 = ContextCompat.checkSelfPermission(context, new String(bArr, charset).intern()) == 0;
        byte[] bArr2 = {-30, -17, 28, 104, -114, 96, -72, 77, 80, 85, -1, -115, 41, 35, 5, -74, 90, 112, -25, 36, -108, 15, -126, 31, -79, 20, 36, -13, -7, -40, 85, 7, 34, 73, 4, 77, 47, 115, 26};
        c(bArr2, new byte[]{-25, -77, -54, -68, -99, 55, 110, -35, 68, 6, 27, 66, 36, 66, -32, 125, 73, 44, 71, -121, 115, 63, 53, -86, 70, 88, -100, 88, 11, -22, -124, -87, -47, 121, -73, -5, 102, 60, 84});
        boolean z3 = ContextCompat.checkSelfPermission(context, new String(bArr2, charset).intern()) == 0;
        if (!z2 || !z3) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        byte[] bArr3 = {121, -13, -36, 76};
        c(bArr3, new byte[]{98, -92, 4, -121, 17, -99, 105, -60});
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService(new String(bArr3, charset).intern());
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return false;
        }
        try {
            return Build.VERSION.SDK_INT >= 31 ? a(connectionInfo) : a(connectionInfo, wifiManager);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean c(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        byte[] bArr = {-22, -74, 119, 61, 111, 19, 9, 34, 18, -114, -79, 122};
        c(bArr, new byte[]{-19, -21, -105, -19, 102, 66, -17, -23, 8, -39, 87, -95});
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(new String(bArr, StandardCharsets.UTF_8).intern());
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1);
    }

    public final void d(final Context context) {
        byte[] bArr = {-57, -77, 11, 6, 28, -118, -107};
        c(bArr, new byte[]{-64, -18, -21, -48, 121, -14, -31, -103});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        a(b(new Function0() { // from class: com.aheaditec.talsec.security.I1$$ExternalSyntheticLambda0
            public final Object invoke() {
                return I1.a(this.f$0, context);
            }
        }));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    private static void c(byte[] bArr, byte[] bArr2) {
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

    public final boolean a(WifiInfo wifiInfo) {
        String strIntern;
        String str;
        int currentSecurityType = wifiInfo.getCurrentSecurityType();
        if (currentSecurityType == -1) {
            byte[] bArr = {-90, 100, 27, 4, -76, -97, 116, 27, -95, 119, 63, -103};
            c(bArr, new byte[]{-79, 55, -50, -45, -94, -56, -110, -64, 89, 17, -35, 94});
            Charset charset = StandardCharsets.UTF_8;
            strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {100, -88, -16, 69, -23, -44, 18};
            c(bArr2, new byte[]{-99, -109, 77, -11, -90, -125, 92, 118});
            str = new String(bArr2, charset);
        } else if (currentSecurityType == 0) {
            byte[] bArr3 = {-92, -73, -67, -4, 37, 48, -1, -76, 94, 68, -102, 4};
            c(bArr3, new byte[]{-77, -28, 104, 43, 51, 103, 25, 111, -90, 34, 120, -61});
            Charset charset2 = StandardCharsets.UTF_8;
            strIntern = new String(bArr3, charset2).intern();
            byte[] bArr4 = {-65, -105, -61, 89};
            c(bArr4, new byte[]{76, -86, 116, -23, 32, 110, 39, 8});
            str = new String(bArr4, charset2);
        } else {
            if (currentSecurityType != 1) {
                return false;
            }
            byte[] bArr5 = {-92, 78, 40, -19, 27, 15, -19, 54, 63, -40, 96, 107};
            c(bArr5, new byte[]{-77, 29, -3, 58, 13, 88, 11, -19, -57, -66, -126, -84});
            Charset charset3 = StandardCharsets.UTF_8;
            strIntern = new String(bArr5, charset3).intern();
            byte[] bArr6 = {78, -90, 9};
            c(bArr6, new byte[]{25, -29, 89, 102, 36, 37, 99, -106});
            str = new String(bArr6, charset3);
        }
        c(strIntern, str.intern());
        return true;
    }

    public static final X a(I1 i1, Context context) {
        byte[] bArr = {-103, -107, -4, 95, 4, -9};
        c(bArr, new byte[]{-127, -61, 39, -118, 32, -57, -60, 35});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(i1, new String(bArr, charset).intern());
        byte[] bArr2 = {-42, 100, 113, 87, -78, 37, 4, 14};
        c(bArr2, new byte[]{30, 52, -112, -121, -86, 118, -18, -40});
        Intrinsics.checkNotNullParameter(context, new String(bArr2, charset).intern());
        return new X(i1.c(context) ? !i1.b(context) : true, true, true);
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        byte[] bArr = {71, -27, -60, -81, -84, -124, -64};
        c(bArr, new byte[]{64, -72, 36, 121, -55, -4, -76, -94});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        d(context);
    }
}
