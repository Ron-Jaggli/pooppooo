package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class G0 extends AbstractC0037m {
    public static final a r;
    public static final int s = 1000;
    public static final String t;
    public static final List<String> u;
    public final LocationManager o;
    public final H0 p;
    public List<PackageInfo> q;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {25, 10, 106, 61, 69, 57, 47, 34, -101, -47, -53, -86, 12, 104, 94, -111, 75, 70, 8, -82, -6, 63, 8, -127, -35, -45, 29, 79, 16, -14, 78, 115, 126, 29, -9, -89, -105, -92, 99};
        c(bArr, new byte[]{120, 100, 14, 79, 42, 80, 75, 12, -21, -76, -71, -57, 101, 27, 45, -8, 36, 40, 38, -17, -71, 124, 77, -46, -114, -116, 80, 0, 83, -71, 17, 63, 49, 94, -74, -13, -34, -21, 45});
        Charset charset = StandardCharsets.UTF_8;
        t = new String(bArr, charset).intern();
        r = new a(null);
        byte[] bArr2 = {22, 78, -39, -119, 108, -52, -12, -14, -42, -50, -27, -25, -16, 119, -45, -1};
        c(bArr2, new byte[]{117, 33, -76, -89, 0, -87, -116, -109, -8, -88, -124, -116, -107, 16, -93, -116});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {120, 90, 16, -2, -85, 102, -60, -90, -115, -89, -9, 76, -23, 44, -81, 97, 53, 94, 69, 74, -78, 27, 59, -118, -32, 46, -71, 38, 119, -116, 81};
        c(bArr3, new byte[]{27, 53, 125, -48, -62, 8, -89, -55, -1, -41, -104, 62, -120, 88, -54, 0, 69, 46, 54, 100, -44, 122, 80, -17, -121, 94, -54, 8, 17, -2, 52});
        String strIntern2 = new String(bArr3, charset).intern();
        byte[] bArr4 = {12, 0, 37, 86, -99, -18, -96, 123, -14, 103, -46, 31, 14, -4, 30, 47, 24, 37, 42, -102, 52, -55, 48, 60, -83, -55, -22, 93, -50, 30, -79, -14, -95, -124, -77};
        c(bArr4, new byte[]{111, 111, 72, 120, -1, -126, -49, 28, -127, 23, -67, 107, 32, -110, 123, 88, 121, 85, 90, -14, 91, -69, 89, 70, -62, -89, -103, 115, -88, 127, -38, -105, -58, -12, -64});
        String strIntern3 = new String(bArr4, charset).intern();
        byte[] bArr5 = {65, 10, -45, 11, -74, 28, 46, 27, -30, -57, 24, 61, 90, 57, 76, -125, 28, -111, -1};
        c(bArr5, new byte[]{34, 101, -66, 37, -45, 106, 75, 97, -104, -88, 118, 19, 60, 88, 39, -26, 123, -31, -116});
        String strIntern4 = new String(bArr5, charset).intern();
        byte[] bArr6 = {27, 75, -34, -64, 78, -63, 31, -39, -8, -1, -37, -64, 88, -106, -10, 93, -117, 19, -125, -62, 125, 76, -115, 46, -75};
        c(bArr6, new byte[]{105, 62, -16, -89, 47, -73, 109, -80, -109, -112, -83, -18, 53, -7, -107, 54, -25, 124, -32, -93, 9, 37, -30, 64, -58});
        u = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, strIntern4, new String(bArr6, charset).intern()});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(R0 r0, E1 e1, Context context) {
        super(r0, e1);
        byte[] bArr = {-78, -101, 32, -70, 3, -9};
        c(bArr, new byte[]{-34, -12, 71, -35, 102, -123, -86, 16});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {-9, -71, 85, 32, -105, 107, 109, 85};
        c(bArr2, new byte[]{-123, -36, 52, 67, -29, 2, 2, 59});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
        byte[] bArr3 = {-49, -26, 4, 13, -116, -100, -103};
        c(bArr3, new byte[]{-84, -119, 106, 121, -23, -28, -19, 111});
        Intrinsics.checkNotNullParameter(context, new String(bArr3, charset).intern());
        byte[] bArr4 = {57, -93, -65, -46, -93, -71, 97, -28};
        c(bArr4, new byte[]{85, -52, -36, -77, -41, -48, 14, -118});
        this.o = (LocationManager) context.getSystemService(new String(bArr4, charset).intern());
        H0 h0 = new H0(context);
        h0.c();
        this.p = h0;
        PackageManager packageManager = context.getPackageManager();
        this.q = packageManager != null ? packageManager.getInstalledPackages(4096) : null;
    }

    public static final X a(G0 g0, Context context) {
        byte[] bArr = {73, -85, -60, 75, 110, -23};
        c(bArr, new byte[]{61, -61, -83, 56, 74, -39, 36, 43});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(g0, new String(bArr, charset).intern());
        byte[] bArr2 = {39, 115, 30, 90, 30, 19, -21, -48};
        c(bArr2, new byte[]{3, 16, 113, 52, 106, 118, -109, -92});
        Intrinsics.checkNotNullParameter(context, new String(bArr2, charset).intern());
        return new X(!(g0.f() | g0.c(context) | g0.e()), true, true);
    }

    public final void b(final Context context) {
        a(b(new Function0() { // from class: com.aheaditec.talsec.security.G0$$ExternalSyntheticLambda0
            public final Object invoke() {
                return G0.a(this.f$0, context);
            }
        }));
    }

    public final boolean c(Context context) {
        LocationManager locationManager;
        byte[] bArr = {125, 117, 35, -95, -127, 104, -116, -107, -22, -121, 81, 30, 104, -39, 0, -30, -53, -67, -49, 123, -15, -100, -92, 25, 85, -110, -3, -41, -49, 37, -124, -1, -12, -43, -116, -110, -127, -20, -88};
        c(bArr, new byte[]{28, 27, 71, -45, -18, 1, -24, -69, -102, -30, 35, 115, 1, -86, 115, -117, -92, -45, -31, 58, -78, -33, -31, 74, 6, -51, -69, -98, -127, 96, -37, -77, -69, -106, -51, -58, -56, -93, -26});
        Charset charset = StandardCharsets.UTF_8;
        if (J1.a(context, new String(bArr, charset).intern()) && (locationManager = this.o) != null) {
            byte[] bArr2 = {30, 51, -2};
            c(bArr2, new byte[]{121, 67, -115, 31, 59, 93, 102, 92});
            Location lastKnownLocation = locationManager.getLastKnownLocation(new String(bArr2, charset).intern());
            if (lastKnownLocation != null) {
                boolean zIsFromMockProvider = Build.VERSION.SDK_INT < 31 ? lastKnownLocation.isFromMockProvider() : lastKnownLocation.isMock();
                if (zIsFromMockProvider) {
                    byte[] bArr3 = {-34, -9, -82, 11, -99, -128, 105, -92, -120, 16, 90, 112, 127, -44, -32, -73, 69, 54, 120, 114, -1};
                    c(bArr3, new byte[]{-73, -124, -29, 100, -2, -21, 37, -53, -21, 113, 46, 25, 16, -70, -91, -39, 36, 84, 20, 23, -101});
                    String strIntern = new String(bArr3, charset).intern();
                    byte[] bArr4 = {-11, -91, 103, 96};
                    c(bArr4, new byte[]{-127, -41, 18, 5, 91, -65, 88, 37});
                    c(strIntern, new String(bArr4, charset).intern());
                }
                return zIsFromMockProvider;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.G0.e():boolean");
    }

    public final boolean f() {
        if (!this.p.b()) {
            return false;
        }
        boolean z = this.p.a() > 1000.0d;
        if (z) {
            byte[] bArr = {52, 125, -22, 67, -57, 119, -54, 95, 24, 111, -3, 7, 43, -100, -13, 72, -69, -44, 63, 101, -102, 8, 82, 43, 98};
            c(bArr, new byte[]{92, 28, -103, 16, -78, 4, -70, 54, 123, 6, -110, 114, 88, -48, -100, 43, -38, -96, 86, 10, -12, 66, 39, 70, 18});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-4, -44, -22, 88};
            c(bArr2, new byte[]{-120, -90, -97, 61, 37, 58, -98, 45});
            c(strIntern, new String(bArr2, charset).intern());
        }
        return z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void c(byte[] bArr, byte[] bArr2) {
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

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        byte[] bArr = {-47, 78, 21, 69, -83, 83, 16};
        c(bArr, new byte[]{-78, 33, 123, 49, -56, 43, 100, 15});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        b(context);
    }
}
