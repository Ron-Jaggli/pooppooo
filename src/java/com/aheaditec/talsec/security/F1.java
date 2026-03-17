package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.aheaditec.talsec.security.C0028i1;
import com.aheaditec.talsec.security.InterfaceC0047r0;
import com.aheaditec.talsec_security.security.api.SuspiciousAppInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class F1 implements E1 {
    public static final a e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final InterfaceC0047r0.f a;
    public final C0028i1.c b;
    public final G1 c;
    public final LocalBroadcastManager d;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {91, 55, 85, -108, 104, -12, 84, 27, 112, -65, 12, 76, 109, -63, -30, 64, -85};
        a(bArr, new byte[]{58, 91, 57, -41, 0, -111, 55, 112, 3, -7, 101, 34, 4, -78, -118, 37, -49});
        Charset charset = StandardCharsets.UTF_8;
        i = new String(bArr, charset).intern();
        byte[] bArr2 = {125, -57, -59, -59, 14, 90, 66, 41, 54};
        a(bArr2, new byte[]{52, -119, -125, -118, 81, 30, 3, 125, 119});
        h = new String(bArr2, charset).intern();
        byte[] bArr3 = {126, 68, -106, -104, 11, 70, 99, -92, -61, 119, 11};
        a(bArr3, new byte[]{42, 5, -38, -53, 78, 5, 60, -19, -115, 49, 68});
        g = new String(bArr3, charset).intern();
        byte[] bArr4 = {-127, 27, 6, -92, -69, 77, 97, -101, -56, -29, -71, 117};
        a(bArr4, new byte[]{-52, 90, 74, -13, -6, 31, 36, -60, -127, -83, -1, 58});
        f = new String(bArr4, charset).intern();
        e = new a(null);
    }

    public F1(Context context, InterfaceC0047r0.f fVar, C0028i1.c cVar, G1 g1) {
        byte[] bArr = {119, 30, 98, -24, -19, -103, -11};
        a(bArr, new byte[]{20, 113, 12, -100, -120, -31, -127, -3});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {-52, 97, 45, -126, -51, 72, 31, -117, 35, -50, 30, -111, -110, 62};
        a(bArr2, new byte[]{-66, 4, 76, -31, -71, 33, 112, -27, 96, -95, 112, -9, -5, 89});
        Intrinsics.checkNotNullParameter(fVar, new String(bArr2, charset).intern());
        byte[] bArr3 = {117, 65, 100, -8, 72, 10, 84, 117, 31, 109, 108};
        a(bArr3, new byte[]{1, 41, 22, -99, 41, 126, 7, 1, 126, 14, 7});
        Intrinsics.checkNotNullParameter(g1, new String(bArr3, charset).intern());
        this.a = fVar;
        this.b = cVar;
        this.c = g1;
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        byte[] bArr4 = {-63, -57, 77, -32, -56, -98, -113, 99, -60, -97, 33, 5, -1, 106, 16, -101};
        a(bArr4, new byte[]{-90, -94, 57, -87, -90, -19, -5, 2, -86, -4, 68, 45, -47, 68, 62, -78});
        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, new String(bArr4, charset).intern());
        this.d = localBroadcastManager;
    }

    public static /* synthetic */ void d() {
    }

    @Override // com.aheaditec.talsec.security.E1
    public void a(Integer num) {
    }

    @Override // com.aheaditec.talsec.security.E1
    public C0028i1.c b() {
        return this.b;
    }

    @Override // com.aheaditec.talsec.security.E1
    public void c() {
        byte[] bArr = {-76, -65, -126, -27, -127, 78, 65, 108, -126, -107, -110, 29, 57, -49, -50, -36, -90};
        a(bArr, new byte[]{-43, -45, -18, -90, -23, 43, 34, 7, -15, -45, -5, 115, 80, -68, -90, -71, -62});
        a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    @Override // com.aheaditec.talsec.security.E1
    public InterfaceC0047r0.f a() {
        return this.a;
    }

    public final void b(String str, ArrayList<SuspiciousAppInfo> arrayList) {
        this.c.a(str);
        byte[] bArr = {47, -29, 120, 65, -106, 72, 117, 56, -78, -63, 23};
        a(bArr, new byte[]{123, -94, 52, 18, -45, 11, 42, 113, -4, -121, 88});
        Charset charset = StandardCharsets.UTF_8;
        Intent intent = new Intent(new String(bArr, charset).intern());
        byte[] bArr2 = {82, -29, 67, -117, -78, 32, -57, 16, 123};
        a(bArr2, new byte[]{27, -83, 5, -60, -19, 100, -122, 68, 58});
        intent.putExtra(new String(bArr2, charset).intern(), str);
        byte[] bArr3 = {106, -8, 5, 89, -6, -93, -4, -69, -53, -93, -17, -81};
        a(bArr3, new byte[]{39, -71, 73, 14, -69, -15, -71, -28, -126, -19, -87, -32});
        intent.putParcelableArrayListExtra(new String(bArr3, charset).intern(), arrayList);
        this.d.sendBroadcast(intent);
    }

    @Override // com.aheaditec.talsec.security.E1
    public void a(String str, ArrayList<SuspiciousAppInfo> arrayList) {
        byte[] bArr = {24, 69, 118, -83};
        a(bArr, new byte[]{113, 43, 16, -62, 67, -28, -52, -76});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-63, -31, 50, 27};
        a(bArr2, new byte[]{-91, -128, 70, 122, -70, -112, 96, -10});
        Intrinsics.checkNotNullParameter(arrayList, new String(bArr2, charset).intern());
        b(str, arrayList);
    }

    @Override // com.aheaditec.talsec.security.E1
    public void a(Integer num, String str) {
        byte[] bArr = {-27, -119, 91, -87};
        a(bArr, new byte[]{-116, -25, 61, -58, -9, 89, -19, 39});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        if (num == null || num.intValue() == 1) {
            a(str);
            return;
        }
        if (num.intValue() != 0) {
            byte[] bArr2 = {18, 12, -111, 123, 33, 46, 48, -48};
            a(bArr2, new byte[]{116, 126, -12, 30, 115, 111, 99, -128});
            new String(bArr2, charset).intern();
            byte[] bArr3 = {-47, -40, 25, 24, -55, -125, 118, -71, -120, 110, -28, 124, -24, 114, -72, -102, -32, 43, 43, 121, -67, -53};
            a(bArr3, new byte[]{-124, -74, 114, 118, -90, -12, 24, -103, -6, 11, -123, 31, -100, 27, -41, -12, -64, 95, 82, 9, -40, -27});
            new String(bArr3, charset).intern();
        }
    }

    public final void a(String str) {
        this.c.a(str);
        byte[] bArr = {55, -89, 109, -112, 0, 86, -31, -20, 68, -101, -4};
        a(bArr, new byte[]{99, -26, 33, -61, 69, 21, -66, -91, 10, -35, -77});
        Charset charset = StandardCharsets.UTF_8;
        Intent intent = new Intent(new String(bArr, charset).intern());
        byte[] bArr2 = {-76, -63, -40, -108, -77, -120, 125, -29, -84};
        a(bArr2, new byte[]{-3, -113, -98, -37, -20, -52, 60, -73, -19});
        intent.putExtra(new String(bArr2, charset).intern(), str);
        this.d.sendBroadcast(intent);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] bArr3 = null;
        int i3 = -585497720;
        int i4 = 0;
        int i5 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i6 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
            int i7 = i3 >>> 8;
            int i8 = ~((((~i7) | (-238348293)) | i6) - ((i7 & (-238348293)) | i6));
            int i9 = (-1081514022) - ((i8 & 2) | ((-10362931) - i8));
            int iA = y1.a(i9 | (-428181225), 2, i9, -428181225);
            int i10 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i11 = 0 - i4;
                    int length3 = bArr3.length;
                    int i12 = 0 - i11;
                    byte b = bArr3[(length3 & (~i12)) - ((~length3) & i12)];
                    int length4 = bArr3.length;
                    byte b2 = bArr4[((length4 | i11) - (((-1678010279) & (~i11)) & length4)) + ((i11 | (-1678010279)) & length4)];
                    bArr3[((length2 | i11) * 2) - (length2 ^ i11)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - b2)) - b);
                    length = 4 - ((5 - i4) | (i4 & 2));
                    int i13 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                    int i14 = i13 != 0 ? 2100390411 : -897645243;
                    if (i13 == 0) {
                        i2 = -2079636786;
                        i3 = i2;
                    } else {
                        i3 = i14;
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i2 = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i5 = 0;
                    i3 = i2;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i15 = 0 - i4;
                    int i16 = ((length7 | i15) - (((-515406864) & (~i15)) & length7)) + ((i15 | (-515406864)) & length7);
                    byte b3 = bArr4[i16];
                    int length8 = bArr3.length;
                    byte b4 = bArr4[((i15 | length8) * 2) - (length8 ^ i15)];
                    int i17 = ((byte) 0) - b3;
                    int i18 = i17 | b4;
                    bArr4[i16] = (byte) (((byte) (((byte) i18) - ((byte) (((byte) 2) * ((byte) i17))))) + ((byte) ((b4 ^ i17) ^ i18)));
                    i3 = i10;
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i19 = i5 + 4 + (((-1) - i5) | (-4));
                    byte b5 = bArr4[i19];
                    int i20 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i21 = i5 & 2;
                    int i22 = (i5 + 2) - i21;
                    int i23 = bArr4[i22] & 255;
                    int i24 = i23 * ((~i23) & 65536);
                    int i25 = ~(((467314697 | (~i24)) | i20) - ((i24 & 467314697) | i20));
                    int i26 = (i5 + 1) - (i5 & 1);
                    int i27 = bArr4[i26] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = ~((i25 | ((~i28) | 1328859631)) - ((i28 & 1328859631) | i25));
                    int i30 = bArr4[i5] & 255;
                    int iA2 = J.a(i29, i30, 1, ((-1) - i29) | ((-1) - i30));
                    byte b6 = bArr3[i19];
                    int i31 = ((b6 & 16777216) * (b6 | 16777216)) + (((-16777217) & b6) * ((~b6) & 16777216));
                    int i32 = bArr3[i22] & 255;
                    int i33 = i32 * ((~i32) & 65536);
                    int iA3 = K.a((~i31) & 1647046022 & i33, i33, i31, (1647046022 | i31) & i33);
                    int i34 = bArr3[i26] & 255;
                    int i35 = i34 * ((~i34) & 256);
                    int i36 = ~((iA3 | ((~i35) | (-2059442874))) - (((-2059442874) & i35) | iA3));
                    int i37 = bArr3[i5] & 255;
                    int iA4 = J.a(i36, i37, 1, ((-1) - i36) | ((-1) - i37));
                    int i38 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i39 = (i38 + iA4) - ((i38 & iA4) * 2);
                    bArr3[i5] = (byte) i39;
                    bArr3[i26] = (byte) (i39 >>> 8);
                    bArr3[i22] = (byte) (i39 >>> 16);
                    bArr3[i19] = (byte) (i39 >>> 24);
                    i5 = (-11) - (((-15) - i5) | i21);
                    int length9 = bArr3.length;
                    int iA5 = C0001a.a(bArr3.length, 4, 0, 0);
                    int i40 = ((i5 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i5 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i3 = i40 != 0 ? -897645243 : 1251644638;
                    if (i40 != 0) {
                        i3 = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i41 = 0 - length;
                    i3 = (((double) ((byte) bArr4[((length10 | i41) - (((~i41) & 822835569) & length10)) + ((822835569 | i41) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i41) - (((~i41) & 822835569) & length10)) + ((822835569 | i41) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i4 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i42 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i10 = i42 != 0 ? 2100390411 : -897645243;
                    if (i42 == 0) {
                        i2 = -2079636786;
                        i3 = i2;
                    } else {
                        i3 = i10;
                    }
                    break;
                default:
                    i3 = -897645243;
                    break;
            }
            return;
        }
    }
}
