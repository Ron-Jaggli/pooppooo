package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class T {
    public static final String c;
    public static final String d;
    public a a;
    public Long b;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
    	at r9.i.h(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:345)
    	at r9.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:333)
    	at r9.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:374)
    	at r9.i.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:7)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            byte[] bArr = {92, 25};
            a(bArr, new byte[]{19, 82, -127, 41, 113, 79, 117, 109});
            Charset charset = StandardCharsets.UTF_8;
            a aVar = new a(new String(bArr, charset).intern(), 0);
            a = aVar;
            byte[] bArr2 = {-35, -80, 61};
            a(bArr2, new byte[]{-109, -1, 118, 48, -82, -28, 48, 28});
            a aVar2 = new a(new String(bArr2, charset).intern(), 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a(String str, int i) {
        }

        public static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            int i;
            byte[] bArr3 = null;
            int i2 = -1003175592;
            int length = 0;
            int i3 = 0;
            int i4 = 0;
            byte[] bArr4 = null;
            while (true) {
                int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
                int i6 = i2 >>> 8;
                int i7 = ~((((~i6) | (-1095531540)) | i5) - ((i6 & (-1095531540)) | i5));
                int i8 = (-1171264002) - ((i7 & 2) | ((-130029571) - i7));
                switch ((-1109882652) ^ ((~i8) + ((i8 | 1) * 2))) {
                    case -1922532006:
                        int length2 = bArr4.length;
                        int i9 = 0 - length;
                        i2 = (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i9, -4, 1, length2), i9 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i9, -4, 1, length2), i9 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                        i3 = length;
                        break;
                    case -1486048729:
                        int length3 = bArr.length;
                        int length4 = 0 - (0 - (bArr.length % 4));
                        boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                        i2 = z ? z ? -1515449616 : 935800592 : -10521562;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        i4 = 0;
                        break;
                    case -497756741:
                        int length5 = bArr4.length;
                        int i10 = 0 - i3;
                        int i11 = ((length5 | i10) * 2) - (length5 ^ i10);
                        byte b2 = bArr3[i11];
                        int length6 = bArr4.length;
                        byte b3 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                        bArr3[i11] = (byte) (((byte) (((byte) (b3 ^ (~b2))) + ((byte) (((byte) 2) * ((byte) (b3 | b2)))))) + ((byte) 1));
                        i2 = 935800592;
                        break;
                    case 256719606:
                        int i12 = (i4 - 1) - (i4 | (-4));
                        byte b4 = bArr3[i12];
                        int i13 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                        int i14 = i4 + 2;
                        int i15 = i14 - (i4 & 2);
                        int i16 = bArr3[i15] & 255;
                        int i17 = i16 * ((~i16) & 65536);
                        int iA = J.a(i17, i13, 1, ((-1) - i17) | ((-1) - i13));
                        int i18 = i14 + (((-1) - i4) | (-2));
                        int i19 = bArr3[i18] & 255;
                        int i20 = i19 * ((~i19) & 256);
                        int i21 = (i20 - 1) - ((~iA) | i20);
                        int i22 = bArr3[i4] & 255;
                        int i23 = ~((i22 | ((~i21) | (-755325340))) - ((i21 & (-755325340)) | i22));
                        byte b5 = bArr4[i12];
                        int i24 = ((b5 & 16777216) * (b5 | 16777216)) + (((-16777217) & b5) * ((~b5) & 16777216));
                        int i25 = bArr4[i15] & 255;
                        int i26 = i25 * ((~i25) & 65536);
                        int i27 = bArr4[i18] & 255;
                        int i28 = i27 * ((~i27) & 256);
                        int i29 = bArr4[i4] & 255;
                        int i30 = i23 << ((i23 > Double.NaN ? 1 : (i23 == Double.NaN ? 0 : -1)) >>> 31);
                        int i31 = (-659933419) - ((i24 & 2) | (1983400305 - i24));
                        int i32 = (i31 ^ (~i26)) + ((i31 | i26) * 2) + 1;
                        int i33 = (i32 ^ i29) + ((i32 & i29) * 2);
                        int i34 = ((i33 | i28) - (((-2109111237) & (~i28)) & i33)) + ((i28 | (-2109111237)) & i33);
                        int iA2 = y1.a(i30 | i34, 2, i30, i34);
                        bArr4[i4] = (byte) iA2;
                        bArr4[i18] = (byte) (iA2 >>> 8);
                        bArr4[i15] = (byte) (iA2 >>> 16);
                        bArr4[i12] = (byte) (iA2 >>> 24);
                        i4 = (i4 ^ 4) + ((i4 & 4) * 2);
                        int length7 = bArr4.length;
                        int length8 = 0 - (bArr4.length % 4);
                        int i35 = ((i4 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i4 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                        i2 = i35 != 0 ? -1515449616 : 935800592;
                        if (i35 == 0) {
                            i2 = -10521562;
                        }
                        break;
                    case 1429728656:
                        length = bArr4.length % 4;
                        int i36 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i = i36 != 0 ? -1216566512 : 935800592;
                        i2 = i36 == 0 ? -1058029970 : i;
                        break;
                    case 1870596681:
                        break;
                    case 1879000533:
                        int length9 = bArr4.length;
                        int i37 = 0 - i3;
                        int i38 = 0 - i37;
                        int i39 = i38 | length9;
                        int i40 = (length9 ^ i38) ^ i39;
                        int i41 = i38 * 2;
                        int length10 = bArr4.length;
                        byte b6 = bArr4[(i38 ^ length10) - (((~length10) & i38) * 2)];
                        int length11 = bArr4.length;
                        byte b7 = bArr3[((i37 | length11) * 2) - (length11 ^ i37)];
                        bArr4[(i39 - i41) + i40] = (byte) (((((byte) (~b7)) + ((byte) (((byte) 2) * ((byte) (b7 | 1))))) ^ b6) ^ 1);
                        length = (~i3) + (i3 * 2);
                        int i42 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                        i = i42 != 0 ? -1216566512 : 935800592;
                        if (i42 == 0) {
                        }
                        break;
                    default:
                        i2 = 935800592;
                        break;
                }
                return;
            }
        }
    }

    static {
        byte[] bArr = {16, 30, 37, 116, -97, 97};
        a(bArr, new byte[]{123, 71, 94, -8, -46, 18, 24, 75});
        Charset charset = StandardCharsets.UTF_8;
        d = new String(bArr, charset).intern();
        byte[] bArr2 = {59, -18, -80, -25, 9, -16};
        a(bArr2, new byte[]{95, 106, -25, 122, 124, -125, -15, 111});
        c = new String(bArr2, charset).intern();
    }

    public T(a aVar, Long l) {
        this.a = aVar;
        this.b = l;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = {-105, -104, -7, -9, 83, -27};
        a(bArr, new byte[]{-5, -68, -82, 106, 38, -106, -30, -101});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr, charset).intern(), this.a.toString());
        if (this.b != null) {
            byte[] bArr2 = {79, 0, -98, -87, -116, -90};
            a(bArr2, new byte[]{82, 57, 9, -76, -63, -43, -122, 90});
            jSONObject.put(new String(bArr2, charset).intern(), this.b);
        }
        return jSONObject;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void a(a aVar, long j) {
        this.a = aVar;
        this.b = Long.valueOf(j);
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
