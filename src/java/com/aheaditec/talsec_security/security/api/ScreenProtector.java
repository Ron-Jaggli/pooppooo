package com.aheaditec.talsec_security.security.api;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.aheaditec.talsec.security.A1;
import com.aheaditec.talsec.security.B1;
import com.aheaditec.talsec.security.C0001a;
import com.aheaditec.talsec.security.J;
import com.aheaditec.talsec.security.K;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.M;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.w1;
import com.aheaditec.talsec.security.x1;
import com.aheaditec.talsec.security.y1;
import com.aheaditec.talsec.security.z1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class ScreenProtector {
    public static final ScreenProtector INSTANCE;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final boolean d;
    public static final boolean e;
    public static final Activity.ScreenCaptureCallback f;
    public static final Consumer<Integer> g;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public static final b a = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            byte[] bArr = {-58, 88, 16, -24, -35, 41, -60, 25, 70, 109, 104, -42, -22, 106, -108, 101, 121, -107, -111, -25, 101, 97, 56, 73, -79};
            a(bArr, new byte[]{-87, 54, 67, -117, -81, 76, -95, 119, 20, 8, 11, -71, -104, 14, -3, 11, 30, -47, -12, -109, 0, 2, 76, 44, -43});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-119, 85, 41, 95, 49, -111, 25, -18, -85, 39, -101, 18, 97, 92, -28, 66, 6, -29, 77, 22, -14, 106, 59, -100, -61, -63, 96, 49};
            a(bArr2, new byte[]{-26, 59, 122, 60, 67, -12, 124, -128, -7, 66, -8, 125, 19, 56, -115, 44, 97, -89, 40, 98, -105, 9, 79, -7, -89, -23, 73, 103});
            super(0, Talsec.class, strIntern, new String(bArr2, charset).intern(), 0);
        }

        public final void a() {
            Talsec.onScreenRecordingDetected();
        }

        public Object invoke() {
            Talsec.onScreenRecordingDetected();
            return Unit.INSTANCE;
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
    }

    static {
        byte[] bArr = {87, -64, -90, -121, 113, 89, -4, -124, -2, 5, 116, -68, -50, -58, 92, -35, 127, 98, 84, 44, 113};
        a(bArr, new byte[]{-20, -48, -76, 13, -3, 105, -103, 0, 117, -112, -5, -22, -121, -28, 29, -62, 3, 49, 10, 92, 3});
        Charset charset = StandardCharsets.UTF_8;
        c = new String(bArr, charset).intern();
        byte[] bArr2 = {-95, 95, -2, 57, 122, 107, -38, -127, 79, -80, 48, -3, -53};
        a(bArr2, new byte[]{-69, 108, 118, 117, 8, 53, -28, 12, 19, 3, 74, -88, -81});
        b = new String(bArr2, charset).intern();
        byte[] bArr3 = {8, 106, -14, -101, 14, -112, 119, 25, -65, 59};
        a(bArr3, new byte[]{100, 57, 106, 23, 84, 46, -17, -119, -48, 79});
        a = new String(bArr3, charset).intern();
        INSTANCE = new ScreenProtector();
        int i = Build.VERSION.SDK_INT;
        d = i < 34;
        e = i < 35;
        f = i >= 34 ? new Activity.ScreenCaptureCallback() { // from class: com.aheaditec.talsec_security.security.api.ScreenProtector$$ExternalSyntheticLambda0
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                ScreenProtector.a();
            }
        } : null;
        g = new Consumer() { // from class: com.aheaditec.talsec_security.security.api.ScreenProtector$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ScreenProtector.a((Integer) obj);
            }
        };
    }

    public final boolean a(Context context) {
        if (d) {
            ScreenProtector screenProtector = INSTANCE;
            byte[] bArr = {-106, -29, 34, 99, 62, -40, -46, 104, -60, 17};
            a(bArr, new byte[]{-50, -80, 58, 31, 68, -26, -117, 25, -85, 101});
            screenProtector.a(new String(bArr, StandardCharsets.UTF_8).intern(), 34);
            return false;
        }
        byte[] bArr2 = {23, -90, -103, 118, -94, 9, -34, 109, 21, 50, 42, 96, 96, -67, 75, 78, 67, -19, 1, -113, -75, 11, -128, -67, 93, -68, -94, 37, -55, 0, 72, -42, -42, 113, -14, 103, -30, 26, 21, 86};
        a(bArr2, new byte[]{95, -8, -25, 29, -74, -112, -92, 92, 78, -121, 66, 38, -14, -3, 34, 64, 21, -77, 25, -28, -39, -113, -81, 23, -14, 18, -36, 127, -124, 117, -9, -80, 114, 98, -99, 80, -97, 127, 49, 44});
        Charset charset = StandardCharsets.UTF_8;
        if (ContextCompat.checkSelfPermission(context, new String(bArr2, charset).intern()) == 0) {
            return true;
        }
        ScreenProtector screenProtector2 = INSTANCE;
        byte[] bArr3 = {30, -60, 32, 60, -109, -17, 71, 74, -97, -30};
        a(bArr3, new byte[]{86, -41, 60, 114, -33, -79, 30, 59, -16, -106});
        String strIntern = new String(bArr3, charset).intern();
        byte[] bArr4 = {-29, 105, -121, 22, -105, -36, 79, -29, -107, -19, -51, 102, 58, -21, 127, 63, 74, 121, -28, -79, -25, 14, -94, 121, -123, -100, 16, -84, -10, 59, 13, -62, -70, 15, 119, -42, 30, -80, -113, 23};
        a(bArr4, new byte[]{107, 55, -51, 125, -31, -27, 21, -26, -50, -72, -87, 36, 60, -56, -10, 110, 14, 71, -76, 14, -117, -118, -47, 83, -70, -13, 45, 8, -115, -82, 50, -91, -50, 124, 32, -97, 51, 21, -56, 107});
        screenProtector2.a(strIntern, new String(bArr4, charset).intern());
        return false;
    }

    public final boolean b(Context context) {
        if (e) {
            ScreenProtector screenProtector = INSTANCE;
            byte[] bArr = {71, 91, -70, 45, 18, -105, 36, 2, 51, -98, 80, -103, 111};
            a(bArr, new byte[]{29, 104, -78, 97, 96, 41, -17, -120, 63, 45, 42, 4, 11});
            screenProtector.a(new String(bArr, StandardCharsets.UTF_8).intern(), 35);
        } else {
            byte[] bArr2 = {61, 127, -33, 38, 116, -31, 7, -5, -106, -27, -39, 108, 93, -91, -15, -92, 12, 7, -104, -57, -104, -127, 16, 34, -54, 33, 52, -52, 14, 112, -26, -13, 73, 73, -50, -125, -124, 120, -29, 38, 73, -19};
            a(bArr2, new byte[]{69, 65, -91, 109, 4, -72, 77, -18, -49, -80, -107, 26, 29, 6, 109, -26, 76, -103, -96, -100, -58, 5, 64, 122, -121, -82, 81, -88, 69, 101, -115, -42, -1, 74, 117, -39, -76, 90, -111, -120, 7, -86});
            Charset charset = StandardCharsets.UTF_8;
            if (ContextCompat.checkSelfPermission(context, new String(bArr2, charset).intern()) == 0) {
                return true;
            }
            ScreenProtector screenProtector2 = INSTANCE;
            byte[] bArr3 = {108, -122, -50, 6, 111, 14, -32, 31, -35, -38, -126, -38, 26};
            a(bArr3, new byte[]{8, 21, -89, 124, -13, -113, -86, -122, -95, -23, -41, -63, 126});
            String strIntern = new String(bArr3, charset).intern();
            byte[] bArr4 = {-41, -72, 9, 20, -98, 24, -105, 49, -47, 49, 45, 30, 115, -60, -2, -24, 73, 121, -42, 15, 50, -7, 72, 53, 11, 48, 9, -76, 49, -32, 32, -24, 43, -14, -43, 65, 30, 18, -43, 4, -95, 30};
            a(bArr4, new byte[]{-97, 6, 88, 127, -38, -95, -35, 56, -118, -124, 73, -116, 3, -25, 119, -102, 15, 71, -30, 100, 96, -35, -9, -114, 72, -97, 68, 16, 76, -43, 79, -65, 93, -48, 122, 27, 58, 112, 123, 102, -17, 89});
            screenProtector2.a(strIntern, new String(bArr4, charset).intern());
        }
        return false;
    }

    public final void registerScreenCallbacks(Activity activity) {
        Activity.ScreenCaptureCallback screenCaptureCallback;
        byte[] bArr = {-97, -83, -62, 70, -125, -45, -30, -59};
        a(bArr, new byte[]{-25, -2, -96, 72, -34, -22, -128, -43});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        if (a(activity) && (screenCaptureCallback = f) != null) {
            activity.registerScreenCaptureCallback(ContextCompat.getMainExecutor(activity), screenCaptureCallback);
        }
        if (b(activity)) {
            WindowManager windowManager = activity.getWindowManager();
            Executor mainExecutor = ContextCompat.getMainExecutor(activity);
            Consumer<Integer> consumer = g;
            consumer.accept(Integer.valueOf(windowManager.addScreenRecordingCallback(mainExecutor, consumer)));
        }
    }

    public final void unregisterScreenCallbacks(Activity activity) {
        Activity.ScreenCaptureCallback screenCaptureCallback;
        byte[] bArr = {53, 111, 29, 55, 45, 67, -108, -119};
        a(bArr, new byte[]{61, 60, 83, 119, 68, 90, -54, 9});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        if (a(activity) && (screenCaptureCallback = f) != null) {
            activity.unregisterScreenCaptureCallback(screenCaptureCallback);
        }
        if (b(activity)) {
            activity.getWindowManager().removeScreenRecordingCallback(g);
        }
    }

    public final void a(String str, String str2) {
        byte[] bArr = {-17, -57, -110, -33, -22, 77, 121, -32, -28, -68, -56, -53, 105, -51, -78, 100, -20, 37, -59, -128, 38};
        a(bArr, new byte[]{-92, -42, -24, -59, 120, 94, 20, -100, 127, 9, -104, -66, 34, -17, -57, 41, 114, 118, -101, 8, 84});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {34, -39, -27, -50, 61, 112, -14, -115, 84, 66, -85, -105, -20, 77, -25, 1, -124, -112, -60};
        a(bArr2, new byte[]{77, -24, 118, -69, 65, 68, -68, 18, 36, -110, -61, 11, 116, 84, 126, -114, -31, -30, -28});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-43, 58, 27, 30, -65, 54, -52, 72, 75, -8, -118, 121, 125, 105, -79, -50, -70, -78, -42, 117};
        a(bArr3, new byte[]{-34, -119, 100, -117, -68, -124, -105, 68, 9, 6, -107, 83, -2, 59, -68, -66, -125, 11, -101, 110});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-99, -31, -41, -57, -19, 97, 71, 0, -13, 104, 14, -54, -34, -54, 62, 71, 20, 108, -6, -56, 106, -118, 49, -29, 27, -85, 6, -94, 64, -7, -99, 77, -53, 78, -61, 11, -110, 116, -120, -43, -6, 70};
        a(bArr4, new byte[]{-90, -63, -100, -50, 105, 56, 30, -116, -125, 55, 74, 3, -96, -23, 8, 57, 79, 61, 126, -43, -8, 29, -4, -94, 94, -69, 49, -27, 13, -69, -36, 61, -104, 51, -116, 126, -28, 66, -41, -65, -114, 104});
        Log.e(strIntern, strIntern2 + str + strIntern3 + str2 + new String(bArr4, charset).intern());
    }

    public final void a(String str, int i) {
        byte[] bArr = {61, -17, -76, -81, 23, 47, -126, 108, -13, 123, 107, 107, -65, -124, -1, -62, 69, -21, 122, 121, -46};
        a(bArr, new byte[]{82, -66, -62, -11, 91, 124, -69, 40, 106, 78, -8, 29, -40, 38, 123, -49, 9, -72, -8, 46, -96});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {79, -7, 112, 3, 25, 116, -124, 79, -63, 62, -119, -30, -18, 76, -25, -16, -17, 92, 10};
        a(bArr2, new byte[]{-14, -57, 3, -120, 101, 64, -114, 84, -105, 78, -27, -96, 114, 85, 126, -99, -118, 46, 42});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {54, -59, -64, 108, -46, -100, 124, 83, -52, -93, -100, 12, 89, -56, 115, 41, -30, -4, -73, 109, -23};
        a(bArr3, new byte[]{-1, -43, -117, 25, -89, 46, 8, 73, -112, -77, -98, 120, 6, -77, 22, 121, -107, -40, -127, 106, -55});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-84, 7};
        a(bArr4, new byte[]{-123, 41, 46, -88, -18, 31, -122, 28});
        Log.e(strIntern, strIntern2 + str + strIntern3 + i + new String(bArr4, charset).intern());
    }

    public static final void a() {
        a aVar = a.a;
    }

    public static final void a(Integer num) {
        byte[] bArr = {-48, -63, 77, -111, -106};
        a(bArr, new byte[]{-116, -27, 22, -2, -13, -111, 65, -51});
        Intrinsics.checkNotNullParameter(num, new String(bArr, StandardCharsets.UTF_8).intern());
        if (num.intValue() == 1) {
            b bVar = b.a;
        }
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

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        public static final a a = new a();

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            byte[] bArr = {-72, 95, -34, 92, -75, -23, 73, 62, -85, 6, 25, -36, 121, -121, 59, -23, 24, 82, 77, 36};
            a(bArr, new byte[]{56, -95, 109, -47, 60, 10, -126, -117, 82, 57, -39, -78, -25, 33, -37, -113, 125, 26, 87, -4});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-71, -86, -46, 26, -94, -50, 76, -125, -125, -80, 49, 57, -110, -114, -23, -53, -22, -32, -31, -22, -70, -25, -56};
            a(bArr2, new byte[]{-121, -98, -50, -110, -120, -114, -58, 84, -18, -41, 40, -119, -70, -98, -66, -110, 120, -18, 101, -89, 83, -9, -18});
            super(0, Talsec.class, strIntern, new String(bArr2, charset).intern(), 0);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00fb. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            int length;
            int i;
            int length2;
            int i2;
            int i3;
            int length3;
            int i4;
            int iA;
            int i5;
            int i6 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
            int length4 = (((~((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1074528264) | 1093142560)) ^ (-886298072);
            int i7 = -1;
            int iA2 = B1.a(a.class, -1);
            int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
            int length6 = ((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 36928) | 1073844225)) ^ 1350815811;
            int length7 = ((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1073973402) | (-2146202606))) ^ (-390349602);
            int i8 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-529537184)) & 457019905;
            int length8 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
            int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & 1040)) + i8);
            int length9 = ((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
            int i9 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 91711000) & (-1070824876);
            int length10 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
            int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
            short[] sArr = null;
            while (true) {
                switch (i10) {
                    case -2143294076:
                        int i11 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        if (length4 >= length5) {
                            length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1073807362) | 1116733474);
                            i = -375509041;
                            i10 = i ^ length;
                            i7 = -1;
                        } else {
                            int length11 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 268439810) | 285217280;
                            int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                            i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                            i7 = -1;
                        }
                        break;
                    case -2038999444:
                        int i13 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length12 = (((((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-2145386455)) | (-2147483476));
                        int iA4 = ((short) ((length6 << y1.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                        int i14 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length13 = length6 >>> ((((~((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | 626856794) | i14) - (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 588787984) | 36185216)) ^ 993590676);
                        short s = sArr[((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                        int i15 = -length13;
                        int i16 = i15 | s;
                        int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                        int i18 = -z1.a(i17 | (~iA4), 2, i17 - iA4, 2);
                        length7 = (short) O.a(length7, 3, -(N.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                        int i19 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-549847554)) + 1624126210;
                        int length14 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 549848649) | 67175498;
                        length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                        int i20 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-412319609)) & (-1959782776);
                        int length15 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 403838542) | 268582982;
                        int i21 = -i20;
                        int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                        iA3 = (short) x1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                        length9++;
                        length = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 150995145) | 140771329);
                        i = 1965034008;
                        i10 = i ^ length;
                        i7 = -1;
                        break;
                    case -1809249287:
                        byte b = bArr[(((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                        int length16 = ((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 546586672) | 546340912)) ^ 949273229;
                        int length17 = (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | length16) - (b | length16)) + B1.a(a.class, b) + ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & length16);
                        int length18 = ((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 786435) | 8921603)) ^ 447505026;
                        byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                        int i23 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | (-2105278367)) - (i23 | (-1545180443))) + (B1.a(a.class, 568748773 | i23) + ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-2105278367)))) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                        int i24 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 144806464) | 136645376));
                        int i25 = -length4;
                        int i26 = i25 | length19;
                        byte b3 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                        int i27 = (((-199685676) | r8) - 1591672428) - ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-180811308));
                        int length20 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 23072776) | 272636008;
                        int length21 = b3 & ((-1319036669) ^ (((length20 | i27) - (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (~i27)) & length20)) + (length20 & (i27 | "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()))));
                        int i28 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1009031633)) & 545538049;
                        int length22 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 537143360) | 10560;
                        int length23 = bArr[(545548610 ^ ((length22 & i28) + (i28 | length22))) + length4] & (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                        int length24 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                        int i29 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        iA3 = 758110381 ^ (((((-1343875612) | i29) + 311432716) - (i29 | (-1074391060))) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 273678921) | (-1069545407)));
                        int i30 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length25 = 1409942802 & ((((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (~i30)) & 91135407) + 91135407) + i30) - ((i30 | "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) & 91135407));
                        int length26 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-804257776)) | (-2094006112);
                        int i31 = -length25;
                        length9 = (-684063310) ^ (((~i31) & length26) - (i31 & (~length26)));
                        length2 = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 674768897) | 153626665);
                        i2 = 1174056570 - length2;
                        i3 = -1174056571;
                        i10 = ((length2 & i3) * 2) + i2;
                        break;
                    case -1740520186:
                        sArr = new short[((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 105907748) | 4198960)) ^ 106731121];
                        length4 = ((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 809508000) | 809603328)) ^ 2042748833;
                        int i32 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1688058452) & 872484865;
                        int length27 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 268460041;
                        length3 = ((((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) & 4218888)) + i32;
                        i4 = 434661073;
                        i10 = i4 ^ length3;
                        break;
                    case -1489518479:
                        int length28 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                        int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1343232517) | 546308360)) ^ (-191816846));
                        int i33 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int i34 = 73539736 & (((~i33) & (-1772650326)) + i33);
                        int length31 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 35664144) | 33608448;
                        int i35 = -i34;
                        byte b4 = bArr2[((107148186 ^ ((((~i35) & length31) * 2) - (i35 ^ length31))) * length4) + ((((B1.a(a.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 532546) | 1602)) ^ 67642971)];
                        int i36 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length32 = (b4 & (((663757504 & ((i36 + 1314070430) - (i36 & 1314070430))) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 834674756) | 272630796)) ^ 936388147)) << ((((B1.a(a.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                        sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                        length4++;
                        iA = ((B1.a(a.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 159661328) | (-2004872944));
                        i5 = -533943416;
                        i10 = iA ^ i5;
                        break;
                    case -473033593:
                        int i37 = -length4;
                        int i38 = -bArr.length;
                        int i39 = i38 | i37;
                        int i40 = (i39 - (i38 * 2)) + ((i38 ^ i37) ^ i39);
                        byte b5 = bArr[bArr.length - length4];
                        int length33 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        bArr[i40] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 274827331) | 556017667)) ^ 2046273635)]);
                        length4--;
                        int iA5 = (B1.a(a.class, i7) | 114408723) & 1183666176;
                        int length34 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1074544770;
                        iA = J.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                        i5 = 836032333;
                        i10 = iA ^ i5;
                        break;
                    case 766056152:
                        int i41 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-889871025)) & 1233748555;
                        int length35 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int i42 = (length35 + 84675108) - (length35 | 84675108);
                        if (length4 < (1842188139 ^ ((((~i42) & 608439588) + i42) + i41))) {
                            int i43 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1878725846) & 1912684595;
                            int length36 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 268589089) | 661640;
                            iA = M.a(i43 | length36, 2, (~i43) ^ length36, 1);
                            i5 = -717449014;
                        } else {
                            iA = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1074350177) | 1342720098);
                            i5 = -887872332;
                        }
                        i10 = iA ^ i5;
                        break;
                    case 974072829:
                        int length37 = bArr.length;
                        int i44 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1711185063) & 170281206;
                        int length38 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 251684176) | 1694512896;
                        int i45 = -i44;
                        length4 = length37 % (1864794098 ^ (((~i45) & length38) - (i45 & (~length38))));
                        iA = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-1878240248)) | 285229064);
                        i5 = -195569723;
                        i10 = iA ^ i5;
                        break;
                    case 998066383:
                        length4 = (((B1.a(a.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                        length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                        iA = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & (-1860698094)) | (-1190123008));
                        i5 = 1002689495;
                        i10 = iA ^ i5;
                        break;
                    case 1314339506:
                        break;
                    case 1734050766:
                        int i46 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        if (length4 <= 0) {
                            int length39 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & R.^attr-private.__removed0) | 553664516;
                            int i47 = -((i46 | 1510858717) & 403833600);
                            length3 = ((~i47) & length39) - (i47 & (~length39));
                            i4 = 2001041846;
                            i10 = i4 ^ length3;
                        } else {
                            int length40 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                            iA = ((i46 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                            i5 = -115901203;
                            i10 = iA ^ i5;
                        }
                        break;
                    case 1771480224:
                        bArr[(((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                        int length41 = (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                        int i48 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 367288948) & 548745488;
                        int length42 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        bArr[length41] = (byte) ((length6 >> ((i48 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 8392730) | 8525645)) ^ 1035083648));
                        int length43 = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 196644) | (-2146430752));
                        int iA6 = A1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                        int i49 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1010633609)) & 678986012;
                        int length44 = "com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int i50 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                        int i51 = -i49;
                        bArr[iA6] = (byte) ((w1.a(~i51, i50, 2, (i50 + i51) + 1) ^ 955811810) & length7);
                        int length45 = (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                        int i52 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() | 674349280) - (i52 | 1869872636)) + (B1.a(a.class, 1197735420 | i52) + ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 674349280))) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1754529808) | 1418461202)));
                        int i53 = ((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1601418652) & 1439188132;
                        int length47 = ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 545800290) | (-1442676670);
                        int i54 = -i53;
                        bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i54) & length47) - (i54 & (~length47)))));
                        length4 += 4;
                        iA = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 33562640) | 136194);
                        i5 = -1824662634;
                        i10 = iA ^ i5;
                        break;
                    case 2093236949:
                        if (length9 >= (((((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 75500825) | 537198861)) ^ 1840590653)) {
                            int i55 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                            iA = (1141965102 & ((-1207265904) + i55 + (((-i55) - 1) | 1207265904))) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 1292960864) | 150996032);
                            i5 = 612868558;
                            i10 = iA ^ i5;
                        } else {
                            length2 = (((~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 874653185) | 335552516);
                            i2 = (-1287294623) - length2;
                            i3 = 1287294622;
                            i10 = ((length2 & i3) * 2) + i2;
                        }
                        break;
                    default:
                        int i56 = ~"com.aheaditec.talsec_security.security.api.ScreenProtector$a".length();
                        int i57 = (((-313266948) | i56) + 45165696) - (i56 | (-269226756));
                        length = O.a(i57, 3, -N.a(i57, -4, 1, ("com.aheaditec.talsec_security.security.api.ScreenProtector$a".length() & 44040224) | (-1811807712)), 1);
                        i = -361272203;
                        i10 = i ^ length;
                        i7 = -1;
                        break;
                }
                return;
            }
        }

        public Object invoke() {
            Talsec.onScreenshotDetected();
            return Unit.INSTANCE;
        }

        public final void a() {
            Talsec.onScreenshotDetected();
        }
    }
}
