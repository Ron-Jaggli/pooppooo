package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.aheaditec.talsec.security.C0028i1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class p1 implements C0028i1.c, C0028i1.a {
    public static final int g = 4500;
    public static final int h = 255;
    public ScheduledExecutorService b;
    public ScheduledFuture<?> c;
    public final Context f;
    public final SecureRandom a = new SecureRandom();
    public int d = 0;
    public Long e = null;

    public p1(Context context) {
        this.f = context;
    }

    @Override // com.aheaditec.talsec.security.C0028i1.c
    public String a() {
        return a(System.currentTimeMillis());
    }

    @Override // com.aheaditec.talsec.security.C0028i1.c
    public String b() {
        StringBuilder sb;
        String str;
        if (this.d == 255) {
            sb = new StringBuilder();
            byte[] bArr = {-1, 16, 127, 95, -90, -99, -103};
            a(bArr, new byte[]{-69, 127, 17, 58, -122, -80, -71, -61});
            str = new String(bArr, StandardCharsets.UTF_8);
        } else {
            sb = new StringBuilder();
            byte[] bArr2 = {15, 18, -115, 84, 75, -12, -110, 38, -41, 92};
            a(bArr2, new byte[]{93, 103, -29, 58, 34, -102, -11, 6, -6, 124});
            str = new String(bArr2, StandardCharsets.UTF_8);
        }
        return sb.append(str.intern()).append(this.d).toString();
    }

    @Override // com.aheaditec.talsec.security.C0028i1.a
    public void c() {
        byte[] bArr = {-9, -117, 46, -76, 1, 73, 26, 85, 79, -13, 42, 33, -58, -105, 7, -30, 116, -51, -80, -45, 66, 105, -119, -41, 83, -38, 83, 19, 117, 80, 12, 108, 38, 112, 31};
        a(bArr, new byte[]{-79, -22, 71, -40, 100, 45, 58, 33, 32, -45, 75, 77, -86, -8, 100, -125, 0, -88, -112, -79, 55, 15, -17, -78, 33, -6, 126, 51, 69, 40, 41, 92, 23, 70, 103});
        Charset charset = StandardCharsets.UTF_8;
        String str = String.format(new String(bArr, charset).intern(), Integer.valueOf(this.d));
        byte[] bArr2 = {-72, -91, 49, 74, -52};
        a(bArr2, new byte[]{-5, -55, 80, 36, -85, -9, 32, -90});
        Log.v(new String(bArr2, charset).intern(), str);
        StringBuilder sb = new StringBuilder();
        byte[] bArr3 = {17, -10, -44, 100, -67, 108, 23};
        a(bArr3, new byte[]{84, -82, -111, 39, -99, 65, 55, -24});
        a(sb.append(new String(bArr3, charset).intern()).append(this.d).toString());
        e();
    }

    public final /* synthetic */ void d() {
        f();
        e();
    }

    public final void e() {
        String strIntern;
        String str;
        int iNextInt = this.a.nextInt(4);
        if (iNextInt == 0) {
            byte[] bArr = {-22, -69, -6, 48, 44, -52};
            a(bArr, new byte[]{-71, -62, -119, 68, 73, -95, 44, 31});
            Charset charset = StandardCharsets.UTF_8;
            strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-34, 89, 122, 39, -12, -41, 62, -96, -112, -84, 81, -50, 79, -71, 24, -72, -81, -20, -101, 109, -31, 68, 72, 105, 28, 73, 91, -75, -95, 42, 105, -80, -38, -82};
            a(bArr2, new byte[]{-97, 121, 8, 66, -121, -72, 75, -46, -13, -55, 113, -88, 46, -48, 116, -35, -53, -52, -17, 2, -63, 39, 41, 5, 112, 105, 56, -39, -50, 89, 12, -98, -6, -114});
            str = new String(bArr2, charset);
        } else if (iNextInt == 1) {
            byte[] bArr3 = {-23, -111, 35, 8, -76, -67};
            a(bArr3, new byte[]{-71, -16, 81, 107, -47, -47, 28, -45});
            Charset charset2 = StandardCharsets.UTF_8;
            strIntern = new String(bArr3, charset2).intern();
            byte[] bArr4 = {-89, -11, 60, 66, -21, -94, 16, -75, -8, -10, 25, 64, 57, -13, 41, -77, -69, 70, -110, 92, 14, -51, 96, 118, -114, -5, 127, 116, -76, -98, -106, -9};
            a(bArr4, new byte[]{-30, -115, 76, 39, -120, -42, 121, -37, -97, -42, 123, 41, 87, -105, 76, -63, -101, 36, -25, 40, 46, -86, 15, 2, -82, -107, 10, 24, -40, -65, -74, -41});
            str = new String(bArr4, charset2);
        } else {
            if (iNextInt == 2) {
                byte[] bArr5 = {-16, -122, -83, 120, 103, 37};
                a(bArr5, new byte[]{-93, -1, -34, 12, 2, 72, 95, -46});
                Charset charset3 = StandardCharsets.UTF_8;
                String strIntern2 = new String(bArr5, charset3).intern();
                byte[] bArr6 = {12, -102, -35, 8, -89, -88, 31, 74, -125, 82, -115, 98, -34, -50, -24, -13, 2};
                a(bArr6, new byte[]{73, -12, -87, 122, -34, -120, 113, 37, -9, 114, -21, 13, -85, -96, -116, -45, 34});
                Log.d(strIntern2, new String(bArr6, charset3).intern());
                byte[] bArr7 = {56, 73};
                a(bArr7, new byte[]{112, 11, 107, -85, 54, 69, 77, 54});
                a(new String(bArr7, StandardCharsets.UTF_8).intern());
                this.e = Long.valueOf(System.currentTimeMillis());
            }
            if (iNextInt != 3) {
                byte[] bArr8 = {-94, -80, 36, -103, 109, 95};
                a(bArr8, new byte[]{-15, -55, 87, -19, 8, 50, -39, 100});
                Charset charset4 = StandardCharsets.UTF_8;
                strIntern = new String(bArr8, charset4).intern();
                byte[] bArr9 = {21, 76, -76, -93, -77, 74, -7, 32, 68, -75, 69, 89, 61, -88, 53, -96, 29, -112, -38, -100, 48, -128, -79, 118, -52, -51, -122, -63, 62, -44, -74, 36, 7, -61};
                a(bArr9, new byte[]{91, 35, -108, -48, -42, 56, -113, 73, 39, -48, 101, 41, 72, -54, 89, -55, 110, -8, -65, -8, 16, -26, -34, 4, -10, -19, -13, -88, 83, -69, -46, 65, 39, -29});
                str = new String(bArr9, charset4);
            } else {
                byte[] bArr10 = {109, -120, 77, -3, -43, 94};
                a(bArr10, new byte[]{62, -15, 62, -119, -80, 51, 37, 4});
                Charset charset5 = StandardCharsets.UTF_8;
                strIntern = new String(bArr10, charset5).intern();
                byte[] bArr11 = {104, 105, -47, -121, 87, 103, -15, 34, -55, -112, 35, 119, -9, 2, 62, 117, -24, 7, -14, -3, 58, 110, 48, -11, 83, 97, 14, 105, 29, -56, 71, -34, -79, -46, 59, -63, 23, 57, -43, -124, -19, -37, 83, 62, -65, 117, 113, 71, 65};
                a(bArr11, new byte[]{41, 73, -93, -30, 36, 8, -124, 80, -86, -11, 3, 17, -106, 107, 82, 16, -116, 39, -122, -110, 26, 13, 81, -103, 63, 65, 70, 8, 111, -84, 48, -65, -61, -73, 121, -76, 113, 95, -80, -10, -61, -72, 63, 81, -52, 16, 95, 103, 97});
                str = new String(bArr11, charset5);
            }
        }
        Log.w(strIntern, str.intern());
        byte[] bArr72 = {56, 73};
        a(bArr72, new byte[]{112, 11, 107, -85, 54, 69, 77, 54});
        a(new String(bArr72, StandardCharsets.UTF_8).intern());
        this.e = Long.valueOf(System.currentTimeMillis());
    }

    public final void f() {
        try {
            Thread.sleep(this.a.nextInt(3500) + G0.s);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void g() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.b = scheduledExecutorServiceNewScheduledThreadPool;
        this.c = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: com.aheaditec.talsec.security.p1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        }, 0L, 5L, TimeUnit.SECONDS);
    }

    public void h() {
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public final void a(String str) {
        byte[] bArr = {36, 97, 15, -88, 15, -2, -6, 93, 70, 63, 85, 0, 58, 66, 77, 26, 22, -41, -76, 97, -69, 97, 15, 99, -83, 48, -98, 5, -111, -65, -123, 0, 58, -101, -73, -24, -77, 110, 61, -6, 19, 61, 57, 86, -12, 40, -82, 122, -51, 53, -104, 11, 55, 114, -20, 18, -9, -42, 69, -90, 111, 78, 56, -121};
        a(bArr, new byte[]{16, 82, 107, -54, 63, -99, -104, 104, 114, 8, 51, 55, 10, 112, 46, 45, 114, -29, -115, 89, -116, 82, 60, 90, -52, 82, -4, 97, -94, -36, -80, 56, 2, -93, -45, -47, -117, 92, 13, -61, 39, 11, 91, 102, -106, 78, -99, 30, -11, 5, -84, 110, 7, 70, -33, 39, -58, -30, 125, -112, 9, 45, 1, -77});
        Charset charset = StandardCharsets.UTF_8;
        Intent intent = new Intent(new String(bArr, charset).intern());
        intent.setPackage(this.f.getPackageName());
        byte[] bArr2 = {-120, 86, 102, -58};
        a(bArr2, new byte[]{-20, 55, 18, -89, 79, 11, -27, 34});
        intent.putExtra(new String(bArr2, charset).intern(), str);
        this.f.sendBroadcast(intent);
    }

    public final String a(long j) {
        String str;
        Long l = this.e;
        if (l == null) {
            byte[] bArr = {-2, 79, 126, 41, 107, -127, 89, -46, 10, 100, -123, -126};
            a(bArr, new byte[]{-73, 33, 23, 93, 2, -32, 53, -69, 112, 13, -21, -27});
            str = new String(bArr, StandardCharsets.UTF_8);
        } else {
            long jLongValue = j - l.longValue();
            if (jLongValue < 0) {
                byte[] bArr2 = {112, 123, 82, 90, 92, 110, 47, -36, -110, 48, -76, -66, 68};
                a(bArr2, new byte[]{36, 18, 63, 63, 15, 23, 65, -65, -41, 66, -58, -47, 54});
                str = new String(bArr2, StandardCharsets.UTF_8);
            } else if (jLongValue < 10000) {
                byte[] bArr3 = {31, 94, 83, -69, -33, 77};
                a(bArr3, new byte[]{94, 61, 39, -46, -87, 40, -32, 123});
                str = new String(bArr3, StandardCharsets.UTF_8);
            } else {
                byte[] bArr4 = {15, 64, -127, 68, 41, -92, 87, -100, 33, 111};
                a(bArr4, new byte[]{65, 47, -11, 22, 92, -54, 57, -11, 79, 8});
                str = new String(bArr4, StandardCharsets.UTF_8);
            }
        }
        return str.intern();
    }

    @Override // com.aheaditec.talsec.security.C0028i1.c
    public void a(int i) {
        int i2 = this.d;
        if ((i2 & i) == i) {
            return;
        }
        this.d = i2 + i;
        byte[] bArr = {-110, -47, -47, 50, 44, 96, -29, 54, -42, 116, 58, 14, 72, 95, -91, -30, -98, 20, -74, 74, 99, -35, -23, 13, 55, 86, 119, -82, 112, 45, -98, -83, -78, 75, -110};
        a(bArr, new byte[]{-44, -80, -72, 94, 73, 4, -61, 66, -71, 84, 91, 98, 36, 48, -58, -125, -22, 113, -106, 40, 22, -69, -113, 104, 69, 118, 90, -114, 64, 85, -69, -99, -125, 125, -22});
        Charset charset = StandardCharsets.UTF_8;
        String str = String.format(new String(bArr, charset).intern(), Integer.valueOf(this.d));
        byte[] bArr2 = {9, 114, -94, 1, -26};
        a(bArr2, new byte[]{74, 30, -61, 111, -127, 121, -9, -109});
        Log.v(new String(bArr2, charset).intern(), str);
        StringBuilder sb = new StringBuilder();
        byte[] bArr3 = {1, -50, 91, 97, -45, -103, -63};
        a(bArr3, new byte[]{68, -106, 30, 34, -13, -76, -31, -18});
        a(sb.append(new String(bArr3, charset).intern()).append(this.d).toString());
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
