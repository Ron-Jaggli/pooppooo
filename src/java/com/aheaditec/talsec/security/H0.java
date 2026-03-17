package com.aheaditec.talsec.security;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class H0 {
    public static final a e = new a(null);
    public static final double f = 1000.0d;
    public static final double g = 3.6d;
    public final Context a;
    public final LocationManager b;
    public Location c;
    public long d;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public H0(Context context) {
        byte[] bArr = {0, 22, 79, -62, 124, -77, -61};
        a(bArr, new byte[]{122, 73, 55, -99, 25, -53, -73, -38});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        this.a = context;
        byte[] bArr2 = {-78, 115, 43, 101, -64, 61, -64, 44};
        a(bArr2, new byte[]{-11, -20, 93, -21, -53, 36, -59, 41});
        this.b = (LocationManager) context.getSystemService(new String(bArr2, charset).intern());
    }

    public final double a() {
        Location location;
        Context context = this.a;
        byte[] bArr = {42, -68, 79, -31, -40, -122, 25, 72, -18, -18, -94, -70, 7, 101, 51, -72, 10, 42, -115, 83, 106, 79, -84, 20, 83, -86, -77, -37, -1, -54, 96, -83, -27, 7, 24, 114, -19, -9, 30};
        a(bArr, new byte[]{98, -94, 65, 122, -50, -65, -109, 77, -75, 91, -26, -66, -123, -26, 85, -72, 124, 20, -71, -7, 64, -36, -2, 46, 23, -59, 11, 122, -56, 95, 85, -56, -63, 20, 111, 13, -92, -72, 80});
        Charset charset = StandardCharsets.UTF_8;
        if (!J1.a(context, new String(bArr, charset).intern()) || (location = this.c) == null) {
            return 0.0d;
        }
        long j = this.d;
        LocationManager locationManager = this.b;
        if (locationManager != null) {
            byte[] bArr2 = {-59, 52, -64};
            a(bArr2, new byte[]{-94, 68, -77, 36, 122, -40, -97, 110});
            Location lastKnownLocation = locationManager.getLastKnownLocation(new String(bArr2, charset).intern());
            if (lastKnownLocation != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fDistanceTo = location.distanceTo(lastKnownLocation);
                double d = (jCurrentTimeMillis - j) / 1000.0d;
                this.c = lastKnownLocation;
                this.d = System.currentTimeMillis();
                if (d <= 0.0d) {
                    return 0.0d;
                }
                return (((double) fDistanceTo) / d) * 3.6d;
            }
        }
        return 0.0d;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final void c() {
        Location lastKnownLocation;
        Context context = this.a;
        byte[] bArr = {63, -69, -44, 0, 105, -89, -102, -30, 86, 25, 26, -87, 8, 105, -1, -94, 41, 45, 34, 103, 121, 93, 16, 19, -98, 119, 0, -120, 65, -36, -35, -16, 97, -71, -18, 20, 99, -94, -106};
        a(bArr, new byte[]{117, -91, -58, 89, 29, -98, 20, -76, 61, 76, 126, -85, 120, -22, -95, -78, 93, 19, 34, 13, 81, -18, 106, 39, -28, -8, 91, -88, 38, 105, -104, -93, 69, -54, -59, 39, 42, -19, -40});
        Charset charset = StandardCharsets.UTF_8;
        if (J1.a(context, new String(bArr, charset).intern())) {
            LocationManager locationManager = this.b;
            if (locationManager != null) {
                byte[] bArr2 = {-91, 94, -58};
                a(bArr2, new byte[]{-62, 46, -75, -12, -95, -90, 25, 26});
                lastKnownLocation = locationManager.getLastKnownLocation(new String(bArr2, charset).intern());
            } else {
                lastKnownLocation = null;
            }
            this.c = lastKnownLocation;
            this.d = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr3 = null;
        int i4 = 0;
        int i5 = 0;
        int length = 0;
        int i6 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i7 = ((i6 & 16777216) * (i6 | 16777216)) + ((i6 & (-16777217)) * ((~i6) & 16777216));
            int i8 = i6 >>> 8;
            int iA = K.a(650911840 & (~i7) & i8, i8, i7, (i7 | 650911840) & i8);
            int i9 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i9) + ((i9 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i10 = 0 - i4;
                    int i11 = (length2 ^ i10) + ((length2 & i10) * 2);
                    byte b = bArr3[i11];
                    int length3 = bArr4.length;
                    int i12 = 0 - i10;
                    int i13 = i12 | length3;
                    byte b2 = bArr3[O.a(i12, 2, i13, (length3 ^ i12) ^ i13)];
                    bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - ((byte) (b2 ^ b)));
                    i3 = 0;
                    i6 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    if ((((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i3 = 0;
                        i6 = -365117735;
                    } else {
                        i6 = -458924450;
                        i3 = 0;
                    }
                    break;
                case -1399959314:
                    int iA2 = K.a((-1205100636) & i5, i5, 3, (-1205100633) & i5);
                    byte b3 = bArr3[iA2];
                    int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i15 = i5 - 1;
                    int i16 = i15 - (i5 | (-3));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int iA3 = J.a(i18, i14, 1, ((-1) - i18) | ((-1) - i14));
                    int i19 = i15 - (i5 | (-2));
                    int i20 = bArr3[i19] & 255;
                    int i21 = i20 * ((~i20) & 256);
                    int i22 = (i21 - 1) - ((~iA3) | i21);
                    int i23 = bArr3[i5] & 255;
                    int iA4 = J.a(i22, i23, 1, ((-1) - i22) | ((-1) - i23));
                    byte b4 = bArr4[iA2];
                    int i24 = ((16777216 & b4) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i25 = bArr4[i16] & 255;
                    int i26 = ((i25 * ((~i25) & 65536)) & (~i24)) + i24;
                    int i27 = bArr4[i19] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = ~((((~i28) | 911399251) | i26) - ((i28 & 911399251) | i26));
                    int i30 = bArr4[i5] & 255;
                    int i31 = ~((((~i29) | 1433568692) | i30) - ((i29 & 1433568692) | i30));
                    int i32 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i33 = (-1254002618) - ((i32 & 2) | ((-1672003491) - i32));
                    int i34 = (i33 + i31) - ((i33 & i31) * 2);
                    bArr4[i5] = (byte) i34;
                    bArr4[i19] = (byte) (i34 >>> 8);
                    bArr4[i16] = (byte) (i34 >>> 16);
                    bArr4[iA2] = (byte) (i34 >>> 24);
                    i5 = (i5 ^ 4) + ((i5 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i35 = ((i5 > L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i5 == L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    int i36 = i35 != 0 ? -1605440657 : -365117735;
                    if (i35 == 0) {
                        i6 = -169475207;
                        i3 = 0;
                    } else {
                        i6 = i36;
                        i = 0;
                        i3 = i;
                    }
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    i2 = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 <= 0 ? i3 : 1;
                    i6 = i2 != 0 ? i2 != 0 ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i5 = i3;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i37 = 0 - i4;
                    int i38 = 0 - i37;
                    int i39 = ((~length8) & i38) * 2;
                    int length9 = bArr4.length;
                    byte b5 = bArr4[((length9 | i37) * 2) - (length9 ^ i37)];
                    int length10 = bArr4.length;
                    byte b6 = bArr3[(i37 ^ length10) + ((length10 & i37) * 2)];
                    bArr4[(length8 ^ i38) - i39] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = M.a(i4, 3, (~i4) * 2, 1);
                    if ((((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i6 = -365117735;
                    } else {
                        i6 = -458924450;
                        i3 = 0;
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i40 = 0 - length;
                    i2 = (((double) ((byte) bArr3[((length11 | i40) - ((165327505 & (~i40)) & length11)) + ((i40 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i40) - ((165327505 & (~i40)) & length11)) + ((i40 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) <= -1 ? i3 : 1;
                    i6 = i2 != 0 ? -746753280 : i2 != 0 ? -365117735 : 1093626513;
                    i4 = length;
                    break;
                default:
                    i = i3;
                    i6 = -365117735;
                    i3 = i;
                    break;
            }
            return;
        }
    }
}
