package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.InputEvent;
import android.view.MotionEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class T0 extends AbstractC0017f {
    public static final String r;
    public static final String s;
    public static final long t = 5000;
    public Set<String> l;
    public final Context m;
    public final boolean n;
    public long o;
    public List<String> p;
    public boolean q;

    static {
        byte[] bArr = {-21, 8, 56, 65, 48, 117, 87, 4, 76, 123, -94, -51, 73, -85, 20, -49, -120, -22, -37, -125, -59, -24, 67, 80, 65, 49, -56, -23, -98, -84, -121, 119, 5, 35, -119, -121, -92, 116};
        b(bArr, new byte[]{-18, 84, -18, -107, 35, 34, -127, -108, 88, 40, 70, 2, 68, -54, -15, 4, -101, -74, 123, 54, 56, -88, -123, -9, -80, 125, 123, 71, 119, -109, 65, -74, -2, 21, 73, 33, -21, 35});
        Charset charset = StandardCharsets.UTF_8;
        s = new String(bArr, charset).intern();
        byte[] bArr2 = {-56, -62, -23, 5, 126, 98, 104};
        b(bArr2, new byte[]{-37, -90, 62, -47, 18, 3, 17, 45});
        r = new String(bArr2, charset).intern();
    }

    public T0(R0 r0, Context context) {
        super(r0);
        this.l = new HashSet();
        this.o = 0L;
        this.p = new ArrayList();
        this.q = true;
        this.m = context;
        this.n = r0.b();
    }

    public final String a(int i) {
        String str;
        if (a(i, 1)) {
            byte[] bArr = {122, -92, 86, -56, -100, -26, 59, -127, 25, -90, 112, 47, -115, -9, -22, -57, 100, -103, -35, -123, 114, -120, 121};
            b(bArr, new byte[]{-112, -99, -27, 97, -97, -93, -128, 49, -15, -102, -71, -18, 96, -73, 59, 118, -126, -39, 104, 50, 32, -51, 61});
            str = new String(bArr, StandardCharsets.UTF_8);
        } else {
            byte[] bArr2 = {4, -1, 54, 98, -21, 25, 108, -40, -123, 23, 50, 65, 113, -93, 33, 53, -19, 13, 84, -29, -33, -97, -101, -43, -90, 60, -49, 33, -57, -1, -27, -120, 9};
            b(bArr2, new byte[]{-18, -58, -123, -53, -24, 92, -41, 104, 109, 43, -5, -128, -100, -29, -16, -121, 8, 50, -110, 72, 58, -90, 37, 110, -91, 1, 123, -108, 32, -67, 33, 47, 77});
            str = new String(bArr2, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
    }

    public final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public final List<String> b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager == null ? new ArrayList(0) : a(packageManager.getInstalledPackages(4096));
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean b() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        return false;
    }

    public final boolean e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.o <= t) {
            return false;
        }
        this.o = jCurrentTimeMillis;
        return true;
    }

    public final boolean b(Set<String> set) {
        return this.l.equals(set);
    }

    public boolean a(InputEvent inputEvent) {
        boolean zA;
        if (inputEvent instanceof MotionEvent) {
            zA = a((MotionEvent) inputEvent);
        } else {
            byte[] bArr = {118, 65, -19, -112, -71, -73, 36, 3, 100, -116};
            b(bArr, new byte[]{123, 32, 44, 84, -82, -26, -61, -41, 1, -24});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {55, 107, 90, -86, 34, -53, -118, 108, -71, -120, -1, -3, -98, 1, -72, 17, 123, -93, 54, -35, 60, -93, -66, 36, 75, 38, -116, 27};
            b(bArr2, new byte[]{-50, 48, -121, 122, 49, -82, 106, -18, -95, -17, 29, 58, 90, 93, 96, -109, 118, -1, -44, 10, 36, -83, 105, -4, 66, 122, 106, -117});
            a(strIntern, new String(bArr2, charset).intern());
            zA = false;
        }
        X x = new X(true, !zA, true);
        byte[] bArr3 = {50, 22, -96, 118, -101, 67, -10};
        b(bArr3, new byte[]{33, 114, 119, -94, -9, 34, -113, 106});
        Charset charset2 = StandardCharsets.UTF_8;
        a(new String(bArr3, charset2).intern(), x);
        if (x.c()) {
            byte[] bArr4 = {-89, -69, -22, -117, 22, 7, 24};
            b(bArr4, new byte[]{-76, -33, 61, 95, 122, 102, 97, 2});
            c(new String(bArr4, charset2).intern());
        }
        return zA;
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

    public final boolean a(MotionEvent motionEvent) {
        if (!a(motionEvent.getFlags(), 1) && !a(motionEvent.getFlags(), 2)) {
            return false;
        }
        if (this.n) {
            if (e()) {
                this.p = b(this.m);
            }
            HashSet hashSet = new HashSet(this.p);
            if (!this.l.equals(hashSet)) {
                this.l = hashSet;
                byte[] bArr = {-94, -128, -32, 35, 14, -122, 82, 62, 15, -117, -9, 56, 117, -55, 65, -105, -69, -123, -5, 113, -11};
                b(bArr, new byte[]{-81, -31, 33, -25, 25, -41, -75, -22, 6, -39, 72, -23, 109, -98, -96, 71, 82, -26, 44, -95, -127});
                Charset charset = StandardCharsets.UTF_8;
                c(new String(bArr, charset).intern(), a(motionEvent.getFlags()));
                byte[] bArr2 = {-89, 17, -127, 102, -111, -104, 123, -121, 58, 77, 2, 32, -119, -11, 83, 125, -28, -77, 71, -78};
                b(bArr2, new byte[]{-76, 117, 86, -78, -127, -41, -112, 44, 40, 44, -28, -29, -103, -81, -124, -69, 1, -18, -91, 103});
                a(new String(bArr2, charset).intern(), this.p);
            }
        } else if (this.q) {
            this.q = false;
            byte[] bArr3 = {40, 88, 48, 9, 89, 44, 24, -43, 61, -106, 72, -93, -60, -59, 36, -121, 53, 26, -114, -66, -124};
            b(bArr3, new byte[]{37, 57, -15, -51, 78, 125, -1, 1, 52, -60, -9, 114, -36, -110, -59, 87, -36, 121, 89, 110, -16});
            c(new String(bArr3, StandardCharsets.UTF_8).intern(), a(motionEvent.getFlags()));
        }
        return true;
    }

    public final List<String> a(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList(30);
        for (PackageInfo packageInfo : list) {
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = packageInfo.requestedPermissions;
                    if (i < strArr2.length) {
                        String str = strArr2[i];
                        byte[] bArr = {58, -4, -125, 103, 1, 78, 26, 5, -6, 37, 60, -111, -107, 42, 7, 102, 29, 111, 27, 100, 23, 119, 96, 57, -103, 28, 80, -124, -112, 7, 62, -49, 107, -43, 7, -45, -38, -33};
                        b(bArr, new byte[]{63, -96, 85, -77, 18, 25, -52, -107, -18, 118, -40, 94, -104, 75, -30, -83, 14, 51, -69, -47, -22, 55, -90, -98, 104, 80, -29, 42, 121, 56, -8, 14, -112, -29, -57, 117, -107, -120});
                        if (str.equals(new String(bArr, StandardCharsets.UTF_8).intern())) {
                            int[] iArr = packageInfo.requestedPermissionsFlags;
                            if (iArr != null && (iArr[i] & 2) != 0) {
                                arrayList.add(packageInfo.packageName);
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
