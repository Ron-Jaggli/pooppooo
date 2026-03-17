package com.aheaditec.talsec.security;

import android.content.Context;
import com.aheaditec.talsec.security.F0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class E0 extends AbstractC0035l {
    public final F0 e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[F0.a.values().length];
            try {
                iArr[F0.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F0.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F0.a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F0.a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(Context context, u1 u1Var, E1 e1) {
        super(u1Var, e1);
        byte[] bArr = {-89, 81, 83, 75, -14, 88, -41};
        b(bArr, new byte[]{-83, 110, 39, 88, -105, 32, -93, -15});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {69, 92, 90, 8, -19, -75};
        b(bArr2, new byte[]{9, 104, 29, -107, -126, -57, 111, -65});
        Intrinsics.checkNotNullParameter(u1Var, new String(bArr2, charset).intern());
        byte[] bArr3 = {-88, 9, 26, -58, 84, 13, 112, -8};
        b(bArr3, new byte[]{-61, -100, 101, -66, 9, -108, 9, -81});
        Intrinsics.checkNotNullParameter(e1, new String(bArr3, charset).intern());
        this.e = new F0(context);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    public static void b(byte[] bArr, byte[] bArr2) {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a() throws NoWhenBranchMatchedException {
        int i = a.a[this.e.a().ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        a(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) throws NoWhenBranchMatchedException {
        byte[] bArr = {-38, 78, -31, 56, -50, 8, -121};
        b(bArr, new byte[]{-94, 81, 121, 101, -85, 112, -13, 121});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        a();
    }
}
