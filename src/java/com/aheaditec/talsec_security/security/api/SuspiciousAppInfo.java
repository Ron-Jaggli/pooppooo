package com.aheaditec.talsec_security.security.api;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.aheaditec.talsec.security.C0001a;
import com.aheaditec.talsec.security.J;
import com.aheaditec.talsec.security.K;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.O;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class SuspiciousAppInfo implements Parcelable {
    public static final Parcelable.Creator<SuspiciousAppInfo> CREATOR = new Creator();
    public final PackageInfo a;
    public final String b;
    public final Set<String> c;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public static final class Creator implements Parcelable.Creator<SuspiciousAppInfo> {
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
                        byte b = bArr3[i11];
                        int i12 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
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
                        byte b2 = bArr4[i11];
                        int i22 = ((b2 & 16777216) * (b2 | 16777216)) + (((-16777217) & b2) * ((~b2) & 16777216));
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
                        byte b3 = bArr3[iA5];
                        int length5 = bArr4.length;
                        int i34 = 0 - i33;
                        int i35 = i34 | length5;
                        byte b4 = bArr3[O.a(i34, 2, i35, (length5 ^ i34) ^ i35)];
                        bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                        i5 = 1565752577;
                        break;
                    case 373627814:
                        break;
                    case 975213712:
                        int length6 = bArr4.length;
                        int i36 = 0 - i4;
                        int length7 = bArr4.length;
                        int i37 = ~i36;
                        byte b5 = bArr4[((length7 | i36) - (((-656070458) & i37) & length7)) + (((-656070458) | i36) & length7)];
                        int length8 = bArr4.length;
                        byte b6 = bArr3[(length8 ^ i37) + ((length8 | i36) * 2) + 1];
                        bArr4[((length6 | i36) * 2) - (length6 ^ i36)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspiciousAppInfo createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            byte[] bArr = {-13, -27, 3, -112, 40, 14};
            a(bArr, new byte[]{108, -76, 91, 12, 77, 98, -33, -45});
            Intrinsics.checkNotNullParameter(parcel, new String(bArr, StandardCharsets.UTF_8).intern());
            PackageInfo packageInfo = (PackageInfo) parcel.readParcelable(SuspiciousAppInfo.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet2.add(parcel.readString());
                }
                linkedHashSet = linkedHashSet2;
            }
            return new SuspiciousAppInfo(packageInfo, string, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspiciousAppInfo[] newArray(int i) {
            return new SuspiciousAppInfo[i];
        }
    }

    public SuspiciousAppInfo(PackageInfo packageInfo, String str, Set<String> set) {
        byte[] bArr = {119, 74, -44, -94, 8, 34, -68, 29, 79, 117, -46};
        a(bArr, new byte[]{-16, 90, -95, -30, 82, 117, -61, 109, 33, 19, -67});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {-49, 84, -62, 12, -14, 73};
        a(bArr2, new byte[]{-90, 97, -115, -104, -99, 39, -56, -99});
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        this.a = packageInfo;
        this.b = str;
        this.c = set;
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
                    byte b = bArr3[i11];
                    int i12 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
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
                    byte b2 = bArr4[i11];
                    int i22 = ((b2 & 16777216) * (b2 | 16777216)) + (((-16777217) & b2) * ((~b2) & 16777216));
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
                    byte b3 = bArr3[iA5];
                    int length5 = bArr4.length;
                    int i34 = 0 - i33;
                    int i35 = i34 | length5;
                    byte b4 = bArr3[O.a(i34, 2, i35, (length5 ^ i34) ^ i35)];
                    bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                    i5 = 1565752577;
                    break;
                case 373627814:
                    break;
                case 975213712:
                    int length6 = bArr4.length;
                    int i36 = 0 - i4;
                    int length7 = bArr4.length;
                    int i37 = ~i36;
                    byte b5 = bArr4[((length7 | i36) - (((-656070458) & i37) & length7)) + (((-656070458) | i36) & length7)];
                    int length8 = bArr4.length;
                    byte b6 = bArr3[(length8 ^ i37) + ((length8 | i36) * 2) + 1];
                    bArr4[((length6 | i36) * 2) - (length6 ^ i36)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuspiciousAppInfo copy$default(SuspiciousAppInfo suspiciousAppInfo, PackageInfo packageInfo, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            packageInfo = suspiciousAppInfo.a;
        }
        if ((i & 2) != 0) {
            str = suspiciousAppInfo.b;
        }
        if ((i & 4) != 0) {
            set = suspiciousAppInfo.c;
        }
        return suspiciousAppInfo.copy(packageInfo, str, set);
    }

    public final PackageInfo component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final Set<String> component3() {
        return this.c;
    }

    public final SuspiciousAppInfo copy(PackageInfo packageInfo, String str, Set<String> set) {
        byte[] bArr = {62, -44, -76, 95, -113, -16, -96, 51, -70, 63, 58};
        a(bArr, new byte[]{55, -27, -63, 77, -41, -57, -81, -109, -44, 89, 85});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {-23, -119, -63, -6, -97, -59};
        a(bArr2, new byte[]{-124, 28, -117, -94, -16, -85, 78, 4});
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        return new SuspiciousAppInfo(packageInfo, str, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(SuspiciousAppInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        byte[] bArr = {28, -25, -123, -87, -30, 46, -95, -110, 59, 78, 12, -97, 16, -56, 16, -68, -77, 14, -111, 86, -19, 3, -41, -25, 86, 43, -26, 110, -15, -121, 25, -108, -114, -79, -31, -73, 9, -3, 24, -16, 82, 104, 106, -64, 63, 68, 65, -56, -26, -88, 19, -105, -118, -64, 84, -58, 108, -27, -15, 110, -6, -20, 32, 46, -25, -10, -65, -89, -44, -119, -14, -49, -100, -8, -1, -31, -32, -22, 51, 119, -21, -108, 96, -103, -128, 6, 6, 94, 76, 27, 117, -56, -120, -107, 64, 96, -80};
        a(bArr, new byte[]{91, -62, -45, -34, -85, 125, -86, 21, 62, 81, 98, -40, 91, -35, 26, -8, -69, -83, -49, -113, -126, -100, -31, -94, 34, 117, -75, 25, 109, 27, 96, -51, -29, -8, 123, -21, 18, -50, 97, -74, 101, 57, -20, -67, 71, 80, 18, -43, 108, -5, 39, -4, -44, -36, 17, -68, -8, -23, 108, 36, -126, -55, 60, 96, 124, -65, 123, -19, -102, 26, 114, -42, -34, -68, 112, -24, 106, -54, 68, 114, -95, 17, -2, 1, -46, -107, 89, 74, 34, -104, 30, -47, -31, 12, 25, 31, -33});
        Intrinsics.checkNotNull(obj, new String(bArr, StandardCharsets.UTF_8).intern());
        SuspiciousAppInfo suspiciousAppInfo = (SuspiciousAppInfo) obj;
        return Intrinsics.areEqual(this.a, suspiciousAppInfo.a) && Intrinsics.areEqual(this.b, suspiciousAppInfo.b) && Intrinsics.areEqual(this.c, suspiciousAppInfo.c);
    }

    public final PackageInfo getPackageInfo() {
        return this.a;
    }

    public final Set<String> getPermissions() {
        return this.c;
    }

    public final String getReason() {
        return this.b;
    }

    public int hashCode() {
        return this.a.packageName.hashCode();
    }

    public String toString() {
        PackageInfo packageInfo = this.a;
        String str = this.b;
        Set<String> set = this.c;
        byte[] bArr = {101, 37, -43, -84, -92, 33, -11, -25, 26, -96, 83, -104, 108, -57, 3, 92, -29, 60, 36, -115, -62, -17, 118, 114, 119, 101, -40, 33, -110, 100};
        a(bArr, new byte[]{31, -128, -112, -11, -74, 114, -122, -95, 88, 3, -3, 0, 5, -66, 87, 83, 117, 68, 62, 5, -118, -76, 1, 46, -5, 91, -96, 96, -3, 89});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {113, 79, 56, -65, 85, 3, 90, 32, -26};
        a(bArr2, new byte[]{70, -97, 52, -13, 29, -96, 31, 103, -37});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-74, 97, 74, -9, 71, -81, 35, 42, -114, -36, 110, -95, 10, 31};
        a(bArr3, new byte[]{-125, 113, 36, -85, 30, -14, 52, 114, -26, -27, -21, -25, 121, 34});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-108};
        a(bArr4, new byte[]{-67, 119, 64, 115, 6, 89, 106, -47});
        return strIntern + packageInfo + strIntern2 + str + strIntern3 + set + new String(bArr4, charset).intern();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = {76, 97, 56, 96};
        a(bArr, new byte[]{17, 52, 53, 45, -14, 80, -23, -25});
        Intrinsics.checkNotNullParameter(parcel, new String(bArr, StandardCharsets.UTF_8).intern());
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Set<String> set = this.c;
        if (set == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }
}
