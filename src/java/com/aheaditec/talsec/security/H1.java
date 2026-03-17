package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.instacart.truetime.time.TrueTime;
import com.instacart.truetime.time.TrueTimeImpl;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class H1 extends AbstractC0054v {
    public static final a r = new a(null);
    public static final long s = 60000;
    public long o;
    public long p;
    public TrueTime q;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(R0 r0, E1 e1) {
        super(r0, e1);
        byte[] bArr = {79, 81, 28, 1, 13, -110};
        b(bArr, new byte[]{95, 12, -59, -56, 104, -32, 127, 86});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {-33, -70, -12, 24, 18, 122, -104, -94};
        b(bArr2, new byte[]{-55, -23, 39, -35, 10, 45, 121, 114});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
        this.o = System.currentTimeMillis();
        this.p = SystemClock.elapsedRealtime();
    }

    public static final X a(H1 h1, Context context) {
        byte[] bArr = {-28, -58, -61, 114, -108, 17};
        b(bArr, new byte[]{-4, -112, 24, -89, -80, 33, -112, 82});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(h1, new String(bArr, charset).intern());
        byte[] bArr2 = {-111, -7, -72, 54, -126, 30, -120, 26};
        b(bArr2, new byte[]{89, -87, 89, -26, -102, 77, 98, -52});
        Intrinsics.checkNotNullParameter(context, new String(bArr2, charset).intern());
        return new X(!(h1.e() | h1.b(context) | h1.f()), true, true);
    }

    public final boolean b(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) != null) {
                long j = packageInfo.firstInstallTime;
                long j2 = packageInfo.lastUpdateTime;
                long j3 = Build.TIME;
                long j4 = this.o;
                boolean z = j3 > j4 || j > j4 || j2 > j4;
                if (z) {
                    byte[] bArr = {-24, -22, 119, 14, 69, 69, 9, -90, -11, 26, 34, 5, 78, -30, -62, -113, -106, -17, 60};
                    b(bArr, new byte[]{-27, -117, -61, -39, 72, 31, -33, 16, -8, 65, -11, -82, 92, -42, 37, 89, -29, -99, 89});
                    Charset charset = StandardCharsets.UTF_8;
                    String strIntern = new String(bArr, charset).intern();
                    byte[] bArr2 = {-35, -17, -13, -99};
                    b(bArr2, new byte[]{-59, -113, 20, 90, -108, 112, -117, -54});
                    c(strIntern, new String(bArr2, charset).intern());
                }
                return z;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final synchronized void c(final Context context) {
        if (this.q == null) {
            try {
                TrueTimeImpl trueTimeImpl = new TrueTimeImpl(null, null, null, 7, null);
                this.q = trueTimeImpl;
                trueTimeImpl.sync();
            } catch (Exception unused) {
            }
        }
        a(b(new Function0() { // from class: com.aheaditec.talsec.security.H1$$ExternalSyntheticLambda0
            public final Object invoke() {
                return H1.a(this.f$0, context);
            }
        }));
    }

    public final boolean e() {
        TrueTime trueTime = this.q;
        TrueTime trueTime2 = null;
        if (trueTime == null) {
            byte[] bArr = {80, -2, 14, 59, 61, 103, -59, -101, -72, 46};
            b(bArr, new byte[]{72, -87, -47, -4, -38, 62, 30, 92, -42, 90});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            trueTime = null;
        }
        if (!trueTime.hasTheTime()) {
            try {
                Thread thread = Looper.getMainLooper().getThread();
                Looper looperMyLooper = Looper.myLooper();
                if (!Intrinsics.areEqual(thread, looperMyLooper != null ? looperMyLooper.getThread() : null)) {
                    Thread.sleep(4000L);
                }
            } catch (Exception unused) {
            }
            TrueTime trueTime3 = this.q;
            if (trueTime3 == null) {
                byte[] bArr2 = {84, -53, -69, -83, 0, -90, -92, -114, 31, -127};
                b(bArr2, new byte[]{76, -100, 100, 106, -25, -1, 127, 73, 113, -11});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, StandardCharsets.UTF_8).intern());
                trueTime3 = null;
            }
            if (!trueTime3.hasTheTime()) {
                return false;
            }
        }
        try {
            TrueTime trueTime4 = this.q;
            if (trueTime4 == null) {
                byte[] bArr3 = {-14, 1, -104, -93, -55, -37, -92, 108, 23, -93};
                b(bArr3, new byte[]{-22, 86, 71, 100, 46, -126, 127, -85, 121, -41});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, StandardCharsets.UTF_8).intern());
            } else {
                trueTime2 = trueTime4;
            }
            long jAbs = Math.abs(System.currentTimeMillis() - trueTime2.nowTrueOnly().getTime());
            if (jAbs > s) {
                byte[] bArr4 = {-19, -110, 119, 6, 107, 31, -65, 30, -108, -64, 120, 121, -43, 82, 6, 21, -66, 38, 42};
                b(bArr4, new byte[]{-22, -60, -96, -61, 100, 93, 100, -47, -99, -14, -93, -79, -33, 1, -30, -46, -48, 69, 79});
                c(new String(bArr4, StandardCharsets.UTF_8).intern(), String.valueOf(jAbs));
                return true;
            }
        } catch (IllegalStateException unused2) {
        }
        return false;
    }

    public final boolean f() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.p;
        if (jCurrentTimeMillis < 0 || jElapsedRealtime < 0) {
            byte[] bArr = {20, 110, -111, -63, -108, -85, 44, -84, -6, -46, 4, 32, -22, 116};
            b(bArr, new byte[]{24, 33, 116, 119, -103, -16, -5, 10, -20, -123, -36, -10, -113, 16});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {22, -19, -45, -79};
            b(bArr2, new byte[]{14, -115, 52, 118, -60, 13, 127, -99});
            c(strIntern, new String(bArr2, charset).intern());
            return true;
        }
        boolean z = Math.abs(jCurrentTimeMillis - jElapsedRealtime) > s;
        if (z) {
            byte[] bArr3 = {-34, 123, 119, -121, -90, 21, 81, 120, 87, -122, -14, -110, -52, -28};
            b(bArr3, new byte[]{-46, 52, -110, 49, -85, 78, -122, -34, 65, -47, 42, 68, -87, -128});
            Charset charset2 = StandardCharsets.UTF_8;
            String strIntern2 = new String(bArr3, charset2).intern();
            byte[] bArr4 = {-107, 85, -27, 106};
            b(bArr4, new byte[]{-115, 53, 2, -83, -109, 49, -115, -117});
            c(strIntern2, new String(bArr4, charset2).intern());
        }
        this.o = System.currentTimeMillis();
        this.p = SystemClock.elapsedRealtime();
        return z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    private static void b(byte[] bArr, byte[] bArr2) {
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

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        byte[] bArr = {-45, 16, 94, 113, 59, -90, 8};
        b(bArr, new byte[]{-44, 77, -66, -89, 94, -34, 124, -7});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        c(context);
    }
}
