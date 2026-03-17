package com.aheaditec.talsec_security.security.api;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.aheaditec.talsec.security.C0001a;
import com.aheaditec.talsec.security.C0004a1;
import com.aheaditec.talsec.security.C0042o0;
import com.aheaditec.talsec.security.J;
import com.aheaditec.talsec.security.K;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.r1;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class Talsec extends TalsecBridge {
    public static boolean b;
    public static boolean c;
    public static boolean d;

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

    public static void addToWhitelist(Context context, String str) {
        if (str == null) {
            byte[] bArr = {-85, -55, 114, -63, 90, 48, 60, 29, 46, -39, 40, 10, 63, 6, 96, 17, 57, -63, -24, -14, -128, -68, 59, -13, -97, -14, 55};
            a(bArr, new byte[]{-28, -40, -5, -62, 36, -121, 67, 108, 56, -28, 55, 67, 69, -105, -8, -105, 63, -27, -78, -87, -50, -52, 63, -97, -13, -98, 25});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        C0004a1 c0004a1 = C0004a1.a;
        c0004a1.a(context);
        c0004a1.a(str);
    }

    public static void blockScreenCapture(Activity activity, boolean z) {
        boolean z2;
        if (activity.getWindow() == null) {
            byte[] bArr = {22, -74, 101, -125, -70, -39, -99, 90, 32, -64, -23, 92, -49, 111, 72, 86, -49, -118, -23, -87, -80, -122, 65, -83, -62, -102, 8, -70, 105, -9, -57, -96, -8};
            a(bArr, new byte[]{64, 5, -4, 2, -75, -32, -45, 60, -23, -26, 106, 75, -108, 48, 41, -113, -113, 41, -76, -32, -56, 34, 76, -27, -99, 43, 76, -17, -15, -60, -107, -34, -42});
            throw new IllegalStateException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        Window window = activity.getWindow();
        if (z) {
            window.setFlags(8192, 8192);
            z2 = true;
        } else {
            window.clearFlags(8192);
            z2 = false;
        }
        d = z2;
    }

    public static boolean isScreenCaptureBlocked() {
        return d;
    }

    public static boolean isScreenRecordingIncidentCached() {
        return b;
    }

    public static boolean isScreenshotIncidentCached() {
        return c;
    }

    public static void onScreenRecordingDetected() {
        r1 r1Var = TalsecBridge.a;
        if (r1Var != null) {
            r1Var.b();
        } else {
            b = true;
        }
    }

    public static void onScreenshotDetected() {
        r1 r1Var = TalsecBridge.a;
        if (r1Var != null) {
            r1Var.c();
        } else {
            c = true;
        }
    }

    public static void removeExternalId(Context context) {
        if (context != null) {
            new C0042o0(context).c();
        } else {
            byte[] bArr = {13, -56, -76, -61, -108, -63, 50, 46, 71, 43, 115, -14, 30, -123, -96, 114, 122, -108, 44, -88, 84, 90, -8};
            a(bArr, new byte[]{55, -41, -60, -48, -38, -23, 48, 39, 13, 122, 7, -75, 90, 33, 107, 41, 8, -28, 44, -10, 56, 54, -42});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
    }

    public static void start(Context context, TalsecConfig talsecConfig) {
        start(context, talsecConfig, TalsecMode.BACKGROUND);
    }

    public static void stop() {
        r1 r1Var = TalsecBridge.a;
        if (r1Var == null) {
            return;
        }
        r1Var.e();
        TalsecBridge.a = null;
        Natives.INSTANCE.stop();
    }

    public static void storeExternalId(Context context, String str) {
        if (context != null && str != null) {
            new C0042o0(context).d(str);
        } else {
            byte[] bArr = {-39, 74, -81, -112, -34, 101, -12, 50, 96, -50, -60, -116, -2, -122, -94, -43, 47, -60, 0, -10, 30, 58, 86, 75, -30, -63, -31, -67, 33, -54, 17, -33, -32, -80, -25, 39, -63};
            a(bArr, new byte[]{-125, 85, -85, -3, -92, 77, 106, 43, -8, -21, -50, 2, 111, 34, -78, -64, 42, -43, 86, -40, 99, 74, 31, 67, 117, -33, 120, -30, -22, -41, 94, 24, 119, -11, 117, 100, -17});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
    }

    public static void start(Context context, TalsecConfig talsecConfig, TalsecMode talsecMode) {
        if (context == null) {
            byte[] bArr = {29, 5, -41, -89, -126, -109, 79, 68, 40, 106, -6, -24, 55, 52, -94, -35, -89, -21, -18, -101, -20, -53, 66};
            a(bArr, new byte[]{71, -102, -93, -20, -48, 27, 38, 125, 52, 59, 126, -97, 65, 112, 108, -40, -85, -5, 106, 7, -128, -89, 108});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        if (TalsecBridge.a == null && talsecConfig == null) {
            byte[] bArr2 = {83, 103, 48, -2, -68, -92, 41, -89, 101, -109, -105, -54, 10, 14, -28, 26, 107, 94, -3, 109, -22, 64, -80, 4, 106, -91, 29, -117, 5};
            a(bArr2, new byte[]{-16, 53, 70, -90, -62, -9, -13, -4, -13, 44, -36, -68, 86, 94, 113, -108, -18, 95, 124, 50, -77, 82, -65, 61, -19, -1, 91, 0, 43});
            throw new IllegalArgumentException(new String(bArr2, StandardCharsets.UTF_8).intern());
        }
        if (talsecMode != null) {
            TalsecBridge.a = r1.g.a(context, talsecConfig, talsecMode);
        } else {
            byte[] bArr3 = {-75, -79, 12, 24, -26, 107, -119, -14, -23, 119, 110, -12, -18, -6, 97, 26, -88, -3, 120, -12, -72, -57, -77, 7, 68, -11, -66};
            a(bArr3, new byte[]{-54, 0, 75, -124, 108, 56, -109, -40, 111, 67, -11, -20, 118, -53, -7, -116, -80, -71, 66, -81, -58, 23, -56, -117, 40, -103, -112});
            throw new IllegalArgumentException(new String(bArr3, StandardCharsets.UTF_8).intern());
        }
    }
}
