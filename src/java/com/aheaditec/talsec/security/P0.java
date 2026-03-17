package com.aheaditec.talsec.security;

import android.content.Context;
import com.aheaditec.talsec.security.AbstractC0017f;
import com.aheaditec.talsec.security.C0028i1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class P0 extends AbstractC0017f implements C0028i1.b {
    public static final String p;
    public static final String q;
    public static final int r = 10;
    public static final int s = 15;
    public long l;
    public ScheduledExecutorService m;
    public ScheduledFuture<?> n;
    public final E1 o;

    static {
        byte[] bArr = {-38, -117, -111, 124, -34, 76, -111, -56, 70, -79};
        b(bArr, new byte[]{-53, -42, 113, -73, -58, 17, 117, 3, 40, -42});
        Charset charset = StandardCharsets.UTF_8;
        q = new String(bArr, charset).intern();
        byte[] bArr2 = {18, -49};
        b(bArr2, new byte[]{90, -115, -21, -111, 42, 47, 43, 60});
        p = new String(bArr2, charset).intern();
    }

    public P0(R0 r0, E1 e1) {
        super(r0);
        this.l = System.currentTimeMillis();
        this.o = e1;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
    }

    public final void a(X x) {
        byte[] bArr = {83, -40, -24, -52, 29, -105, -116, 10, -66, 126};
        b(bArr, new byte[]{66, -123, 8, 7, 5, -54, 104, -63, -48, 25});
        Charset charset = StandardCharsets.UTF_8;
        a(new String(bArr, charset).intern(), x);
        if (x.c()) {
            byte[] bArr2 = {-27, -45, -115, 103, 83, -29, 64, -16, 12, 27};
            b(bArr2, new byte[]{-12, -114, 109, -84, 75, -66, -92, 59, 98, 124});
            String strIntern = new String(bArr2, charset).intern();
            this.o.a().getClass();
            a(strIntern, (Integer) 0);
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean b() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        return false;
    }

    public final /* synthetic */ X d(String str) {
        byte[] bArr = {9, -108, -40, -120, 49, 78, -104, -64, -109, -102, -14, -63, 88, 66};
        b(bArr, new byte[]{0, -14, 15, 77, 40, 44, 67, 17, -127, -37, 20, 2, 44, 39});
        c(new String(bArr, StandardCharsets.UTF_8).intern(), str);
        return new X(false, true, true);
    }

    public final void e() {
        synchronized (this) {
            a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.P0$$ExternalSyntheticLambda1
                @Override // com.aheaditec.talsec.security.AbstractC0017f.a
                public final X run() {
                    return this.f$0.g();
                }
            }));
        }
    }

    public final boolean f() {
        long j = this.l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > jCurrentTimeMillis) {
            byte[] bArr = {116, 0};
            b(bArr, new byte[]{60, 66, -65, 83, -58, 124, -72, -17});
            Charset charset = StandardCharsets.UTF_8;
            new String(bArr, charset).intern();
            byte[] bArr2 = {17, 3, 73, -1, 44, 97, 86, -12, 118, 111, 108, 84, 22, 48, 60, -121, 18};
            b(bArr2, new byte[]{-23, 85, -106, 56, -37, 7, -74, 49, -78, 57, -119, -127, 15, 99, -100, 23, 60});
            new String(bArr2, charset).intern();
            return true;
        }
        if (jCurrentTimeMillis - j <= 10000) {
            return true;
        }
        byte[] bArr3 = {48, 58, -75, -47, -72, -65, -104, -120, 16, 4, 26, 26, 78, -46, 12, 68, 58, 1};
        b(bArr3, new byte[]{55, 103, 106, 3, -85, -29, 79, 88, 8, 50, -51, -39, 88, -80, -40, -125, 91, 117});
        Charset charset2 = StandardCharsets.UTF_8;
        String strIntern = new String(bArr3, charset2).intern();
        byte[] bArr4 = {-75, -97, 39, -66, -98, -64, -26, -114, 20, -41, 1, 82};
        b(bArr4, new byte[]{89, -80, -10, 14, 109, -127, 55, 38, -25, -107, -63, -12});
        c(strIntern, new String(bArr4, charset2).intern());
        return false;
    }

    public final /* synthetic */ X g() {
        return new X(f(), true, true);
    }

    public void h() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.m = scheduledExecutorServiceNewScheduledThreadPool;
        this.n = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: com.aheaditec.talsec.security.P0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        }, 15L, 10L, TimeUnit.SECONDS);
    }

    public void i() {
        ScheduledFuture<?> scheduledFuture = this.n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.n = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.m;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void b(byte[] bArr, byte[] bArr2) {
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

    @Override // com.aheaditec.talsec.security.C0028i1.b
    public void a(final String str) {
        new Thread(new Runnable() { // from class: com.aheaditec.talsec.security.P0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(str);
            }
        }).start();
    }

    public final /* synthetic */ void e(final String str) {
        synchronized (this) {
            a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.P0$$ExternalSyntheticLambda3
                @Override // com.aheaditec.talsec.security.AbstractC0017f.a
                public final X run() {
                    return this.f$0.d(str);
                }
            }));
        }
    }

    @Override // com.aheaditec.talsec.security.C0028i1.b
    public void a() {
        this.l = System.currentTimeMillis();
    }
}
