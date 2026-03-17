package com.aheaditec.talsec.security;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class G1 extends BroadcastReceiver implements C0 {
    public static final a f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final long j = 3000;
    public final boolean a;
    public final Context b;
    public final LocalBroadcastManager c;
    public final ConcurrentHashMap<String, Runnable> d;
    public final Handler e;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {122, 123, 3, 55, -32, 96, -66, 68, 18, 15, -49, 1};
        a(bArr, new byte[]{-126, 78, -57, -112, 5, 33, 111, -15, -22, 33, 122, -84});
        Charset charset = StandardCharsets.UTF_8;
        i = new String(bArr, charset).intern();
        byte[] bArr2 = {-83, 104, -87, -92, -27, -66, 107, -2, 124};
        a(bArr2, new byte[]{64, 83, 17, 21, -26, -116, -40, 72, 61});
        h = new String(bArr2, charset).intern();
        byte[] bArr3 = {-49, -46, -27, 87, 17, 107, 47, 88, -27, -31, 93};
        a(bArr3, new byte[]{55, -4, 91, -30, -8, 91, -2, -13, -85, -89, 18});
        g = new String(bArr3, charset).intern();
        f = new a(null);
    }

    public G1(boolean z, Context context) {
        byte[] bArr = {107, 70, -24, -2, -68, -9, -120};
        a(bArr, new byte[]{108, 27, 8, 40, -39, -113, -4, 13});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        this.a = z;
        this.b = context;
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        byte[] bArr2 = {80, -87, 22, 124, 20, 33, -69, -42, -104, -84, -48, -117, 29, -2, 77, 89};
        a(bArr2, new byte[]{91, -6, -16, -41, 6, 64, 93, 21, -118, -3, 7, 1, -49, -27, -19, -46});
        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, new String(bArr2, charset).intern());
        this.c = localBroadcastManager;
        this.d = new ConcurrentHashMap<>();
        this.e = new Handler(Looper.getMainLooper());
        byte[] bArr3 = {80, -90, -68, -84, -104, -70, 77, -59, 28, 114, -28};
        a(bArr3, new byte[]{-88, -120, 2, 25, 113, -118, -100, 110, 82, 52, -85});
        localBroadcastManager.registerReceiver(this, new IntentFilter(new String(bArr3, charset).intern()));
    }

    public static /* synthetic */ void a() {
    }

    public final void b() {
        List<ActivityManager.AppTask> appTasks;
        byte[] bArr = {-47, -6, -86, -119, 92, 53, 41, -119, 82, 32, 92, 50};
        a(bArr, new byte[]{41, -49, 110, 46, -71, 116, -8, 60, -86, 14, -23, -97});
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset).intern();
        byte[] bArr2 = {-123, 1, -5, 38, 15, -70, 11, -73, 92, -4, -36, 52, -107, 70, 62, 44, 98, 91, 9, -40, 104, 37, -57, -95, 58, -51, 16, 11, -49, -47, -16, -86, -46, -23, 56, 127, 14, 27, -4, -12, 11, 88, -61};
        a(bArr2, new byte[]{105, 79, 19, -31, -53, -37, -22, 53, 83, -85, 2, -6, 81, 39, -28, -21, -90, 26, -38, 22, 127, 118, 18, 35, -46, -97, -49, -38, 11, -1, 18, 120, -62, -66, -19, -68, 22, 76, 29, 36, 42, 121, -30});
        new String(bArr2, charset).intern();
        Context context = this.b;
        byte[] bArr3 = {-110, -23, -115, -107, -119, 17, -84, 10};
        a(bArr3, new byte[]{-105, -72, 107, 94, -109, 70, 74, -47});
        Object systemService = context.getSystemService(new String(bArr3, charset).intern());
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
            Iterator<T> it = appTasks.iterator();
            while (it.hasNext()) {
                ((ActivityManager.AppTask) it.next()).finishAndRemoveTask();
            }
        }
        try {
            System.exit(0);
            byte[] bArr4 = {37, -73, -46, -30, 35, 127, 32, 44, -5, -89, -105, -24, 76, -28, -65, -15, 80, 17, 86, -89, -27, -25, 110, 121, 92, 60, -124, 81, 75, -46, -43, 67, 86, -43, 2, -31, -74, -118, 91, 101, -20, 62, -63, 103, -10, -21, 55, 90, 19, 68, -109, -96, -103, 29, 34, -33, -26, -2, -118, -33, -105, 96, 124, 66, -94};
            a(bArr4, new byte[]{-46, -47, 55, 52, 42, 36, -128, -21, -25, -16, 113, 106, 90, -73, 89, 38, 70, 77, -127, 97, 33, -68, -113, -83, 77, 115, 90, -97, 86, -56, 71, -102, 90, -126, -36, 38, 114, -36, -67, -25, -9, 113, 36, -27, -31, -120, -43, -120, 0, 37, 68, 102, 93, 124, -61, 93, -22, -79, 84, 9, 83, 87, -76, -19, -116});
            throw new RuntimeException(new String(bArr4, StandardCharsets.UTF_8).intern());
        } catch (Exception unused) {
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            Process.killProcess(Process.myPid());
            throw th;
        }
    }

    public final void c() {
        this.c.unregisterReceiver(this);
        this.e.removeCallbacksAndMessages(null);
        this.d.clear();
        byte[] bArr = {63, -51, -21, -48, 20, -126, 104, 10, 39, 41, 108, -9};
        a(bArr, new byte[]{-57, -8, 47, 119, -15, -61, -71, -65, -33, 7, -39, 90});
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset).intern();
        byte[] bArr2 = {-50, 20, 118, 92, -10, -112, 23, 1, -48, -64, 48, -104, 22, 43, -90, 24, 48, -20, -63, 49, -33, -93, 16, -118, -31, 71, 39, -17, 20, 33, 77, -41, -68, -67, 25, 36, -4, -97, -76, -106, -53, -108, -30, 70, 32, -128};
        a(bArr2, new byte[]{54, 65, -110, -101, -13, -14, -46, -41, -43, -111, -19, 26, 0, 120, 115, -33, 61, -120, 22, -27, 27, -63, -16, 94, -24, 18, -4, 58, 12, 114, -87, 16, -76, -77, -4, -13, -5, -50, 99, 67, -36, -64, 5, -120, 76, -7});
        new String(bArr2, charset).intern();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Runnable runnable;
        if (intent != null) {
            byte[] bArr = {-6, -56, -111, -59, 6, -128, -69, 80, 91};
            a(bArr, new byte[]{23, -13, 41, 116, 5, -78, 8, -26, 26});
            String stringExtra = intent.getStringExtra(new String(bArr, StandardCharsets.UTF_8).intern());
            if (stringExtra == null || (runnable = this.d.get(stringExtra)) == null) {
                return;
            }
            this.e.removeCallbacks(runnable);
            this.d.remove(stringExtra);
        }
    }

    @Override // com.aheaditec.talsec.security.C0
    public void a(final String str) {
        byte[] bArr = {-44, 26, -74, 109, -47, 48, 84, 95, 59, 1};
        a(bArr, new byte[]{-52, 76, 82, -86, -44, 82, -108, -100, 86, 100});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        Runnable runnable = new Runnable() { // from class: com.aheaditec.talsec.security.G1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                G1.a(str, this);
            }
        };
        this.d.put(str, runnable);
        this.e.postDelayed(runnable, 3000L);
    }

    public static final void a(String str, G1 g1) {
        byte[] bArr = {-81, -120, -114, -79, 2, -21, 69, -90, -79, -116, -66};
        a(bArr, new byte[]{103, -23, 84, 101, 11, -92, -93, 22, -48, -31, -37});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-81, 101, 118, -88, -127, -24};
        a(bArr2, new byte[]{-73, 51, -83, 125, -91, -40, 96, 94});
        Intrinsics.checkNotNullParameter(g1, new String(bArr2, charset).intern());
        byte[] bArr3 = {-110, -35, 115, -122, -117, 17, -17, 22, -95, -84, -103, 56};
        a(bArr3, new byte[]{106, -24, -73, 33, 110, 80, 62, -93, 89, -126, 44, -107});
        new String(bArr3, charset).intern();
        byte[] bArr4 = {-53, -119, -18, -61, -75, 27, -42, 108, 78, 22, 124, -34, 1, 84, -101, -26, -80, 60, -122, 97, 39, -36, 25, -26, 59, -8, 61, 15, -8, 37, 94, -83, -118, 110, 47, -54, -9, -26, -94, 59, -82, -82, -57, -65};
        a(bArr4, new byte[]{45, -17, 12, 0, -94, 122, 68, -86, 71, 116, -85, 27, 25, 7, 77, 101, 116, 7, 103, -29, 33, -68, -8, 37, 51, -87, -18, -38, -32, 43, -70, 106, -115, 61, -12, 18, -2, -76, 48, -13, -67, -50, 107, 61});
        String strIntern = new String(bArr4, charset).intern();
        byte[] bArr5 = {-13, -36, -124, -112, 84, -128, 107, -103, -5};
        a(bArr5, new byte[]{55, -118, 100, 18, 76, -41, -76, 94, -43});
        String str2 = strIntern + str + new String(bArr5, charset).intern();
        if (g1.a) {
            g1.b();
        }
        g1.d.remove(str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i2;
        int i3 = 0;
        byte[] bArr3 = null;
        int i4 = 0;
        int i5 = 0;
        int length = 0;
        int i6 = -894652659;
        byte[] bArr4 = null;
        while (true) {
            int i7 = ((i6 & 16777216) * (i6 | 16777216)) + ((i6 & (-16777217)) * ((~i6) & 16777216));
            int i8 = i6 >>> 8;
            int i9 = (i8 + i7) - (i8 & i7);
            int i10 = (i9 ^ 1458005263) + ((i9 & 1458005263) * 2);
            switch ((i10 - 1434379843) + (((~i10) & 1434379843) * 2)) {
                case -1970406716:
                    int length2 = bArr4.length;
                    int i11 = 0 - i4;
                    int i12 = ~i11;
                    int i13 = ((length2 | i11) - ((602749225 & i12) & length2)) + ((i11 | 602749225) & length2);
                    byte b = bArr3[i13];
                    int length3 = bArr4.length;
                    byte b2 = bArr3[(length3 ^ i12) + ((i11 | length3) * 2) + 1];
                    int i14 = ((byte) 0) - b;
                    bArr3[i13] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i14))))) - ((byte) (b2 ^ i14)));
                    i6 = -34715366;
                    i3 = 0;
                    break;
                case -1882653318:
                    int i15 = (i5 - 1) - (i5 | (-4));
                    byte b3 = bArr3[i15];
                    int i16 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i17 = i5 + 3 + (((-1) - i5) | (-3));
                    int i18 = bArr3[i17] & 255;
                    int i19 = i18 * ((~i18) & 65536);
                    int i20 = ~((i16 | (1169991170 | (~i19))) - ((i19 & 1169991170) | i16));
                    int iA = K.a(689061172 & i5, i5, 1, 689061173 & i5);
                    int i21 = bArr3[iA] & 255;
                    int i22 = ((~i20) & (i21 * ((~i21) & 256))) + i20;
                    int i23 = (i22 - 1) - ((~(bArr3[i5] & 255)) | i22);
                    byte b4 = bArr4[i15];
                    int i24 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i25 = bArr4[i17] & 255;
                    int i26 = i25 * ((~i25) & 65536);
                    int i27 = ~((i24 | ((~i26) | (-445685625))) - ((i26 & (-445685625)) | i24));
                    int i28 = bArr4[iA] & 255;
                    int i29 = i28 * ((~i28) & 256);
                    int i30 = (i29 + i27) - (i29 & i27);
                    int i31 = bArr4[i5] & 255;
                    int i32 = (i30 & (~i31)) + i31;
                    int i33 = i23 << ((i23 > Double.NaN ? 1 : (i23 == Double.NaN ? 0 : -1)) >>> 31);
                    int i34 = (i33 + i32) - ((i33 & i32) * 2);
                    int i35 = 659933421 - ((i34 & 2) | ((-1983400303) - i34));
                    bArr4[i5] = (byte) i35;
                    bArr4[iA] = (byte) (i35 >>> 8);
                    bArr4[i17] = (byte) (i35 >>> 16);
                    bArr4[i15] = (byte) (i35 >>> 24);
                    i5 = (i5 ^ 4) + ((i5 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i36 = ((i5 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i5 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31) & 1;
                    i6 = i36 != 0 ? 196573321 : 145880015;
                    if (i36 != 0) {
                        i6 = -826922365;
                    }
                    i3 = 0;
                    break;
                case -625567707:
                    break;
                case 172635213:
                    int length6 = bArr4.length;
                    int i37 = 0 - length;
                    i6 = ((((double) ((byte) bArr3[(length6 ^ i37) + ((length6 & i37) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i37) + ((length6 & i37) * 2)])) == Double.NaN ? 0 : -1)) <= -1 ? i3 : 1) != 0 ? -34715366 : 196573321;
                    i4 = length;
                    break;
                case 614184219:
                    int length7 = bArr4.length;
                    int i38 = 0 - i4;
                    int i39 = i38 * 3;
                    int iA2 = N.a(i38, -4, 1, length7);
                    int length8 = bArr4.length;
                    byte b5 = bArr4[(length8 ^ i38) + ((length8 & i38) * 2)];
                    int length9 = bArr4.length;
                    int i40 = 0 - i38;
                    byte b6 = bArr3[(((~i40) & length9) * 2) - (length9 ^ i40)];
                    bArr4[L.a(i3, (length7 & 2) | iA2, i39, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
                    length = ((-338014207) | i4) + (338014206 | i4);
                    int i41 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                    i2 = i41 != 0 ? 196573321 : 1298988808;
                    i6 = i41 == 0 ? i2 : -518432968;
                    break;
                case 835516413:
                    int length10 = bArr.length;
                    int length11 = 0 - (0 - (bArr.length % 4));
                    int i42 = (length10 ^ length11) - (((~length10) & length11) * 2) <= 0 ? i3 : 1;
                    i6 = i42 != 0 ? -826922365 : i42 != 0 ? 196573321 : 145880015;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i5 = i3;
                    break;
                case 1888416065:
                    length = bArr4.length % 4;
                    int i43 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i2 = i43 != 0 ? 196573321 : 1298988808;
                    if (i43 == 0) {
                    }
                    break;
                default:
                    i6 = 196573321;
                    break;
            }
            return;
        }
    }
}
