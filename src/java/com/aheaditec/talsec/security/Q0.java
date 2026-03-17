package com.aheaditec.talsec.security;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class Q0 extends AbstractC0043p {
    public static final a o = new a(null);
    public static final List<String> p;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-1, -32, 90, -84, 112, -24, -121, -10, 111, -120, -108, -93, -90, -91, 17, -119, -52, 88, 68, 6, 44};
        c(bArr, new byte[]{-64, -95, -95, 32, 120, -76, -100, 118, 99, 23, 116, 103, 38, -1, -26, -121, 94, 47, -40, 28, 64});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {93, 57, -100, -21, -62, 56, -19, -36, -8, 20, 91, -110, -47, 106, 88, -34};
        c(bArr2, new byte[]{98, 72, 99, 96, 10, 68, 58, 17, -20, 99, -65, -107, 25, 52, -81, 44});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {79, -12, 42, -65, -84, -76, 24, 57, 32, 60, -28, 54, 82, 102, -92, 124, 95, -43, -43, -65, 9, 115, 41};
        c(bArr3, new byte[]{-112, -114, -15, 15, 32, -61, -8, -6, -88, 69, 51, -11, -40, 32, 102, -66, 96, -90, 105, 78, 96, 7, 76});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {96, -39, -102, 12, 29, -80, 25, -43, 89, 124, -52, 59, -86, 64, 56, -70, -33, -113, -32, -40, 82, 4, -63, -115, -33, 91, -98};
        c(bArr4, new byte[]{103, -88, 97, 65, -91, -24, -22, 91, -114, 25, 95, -3, 43, 0, -57, 105, -17, 9, 59, 90, -107, -110, 93, -123, -79, 47, -19});
        String strIntern4 = new String(bArr4, charset).intern();
        byte[] bArr5 = {-33, 112, -22, 24, -63, -34, -114, -92, -32, -122, 96, 32, 25, -123, 67, -13, 35, -82, 91, -35};
        c(bArr5, new byte[]{-32, 49, 49, 85, 10, -83, 115, 110, -9, 18, -73, -20, -38, 92, -36, 38, -85, -6, -93, 91});
        String strIntern5 = new String(bArr5, charset).intern();
        byte[] bArr6 = {-5, 64, -36, 91, 61, -67, -90, -117, 32, -97, 68, -32, 127, 47, -123, -100, 124, 40, -71, 79, -84, -97, 89, 85};
        c(bArr6, new byte[]{-4, 65, 35, -112, -124, -46, 123, -117, -91, -30, -104, 50, 66, 111, -106, -110, 76, 115, 71, -63, 32, -20, -88, -46});
        String strIntern6 = new String(bArr6, charset).intern();
        byte[] bArr7 = {85, 85, 10, -95, -92, 106, 105, 40, -31, 93, -64, 30, -39, -32, 14, -1, 14, -80, 5};
        c(bArr7, new byte[]{-112, 44, 82, 98, 38, 60, -87, -27, -20, 47, 28, -15, 28, -68, -31, 13, 98, -43, 105});
        p = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, strIntern6, new String(bArr7, charset).intern()});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r0, E1 e1) {
        super(r0, e1);
        byte[] bArr = {-55, 117, 89, 18, 89, 58};
        c(bArr, new byte[]{1, 12, -84, 19, 60, 72, 7, 16});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        byte[] bArr2 = {124, 34, -64, -29, -98, -98, -14, -48};
        c(bArr2, new byte[]{82, 117, 83, 37, 54, -27, 11, 93});
        Intrinsics.checkNotNullParameter(e1, new String(bArr2, charset).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.aheaditec.talsec.security.X a(com.aheaditec.talsec.security.Q0 r5, android.content.Context r6) {
        /*
            java.lang.String r0 = new java.lang.String
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0074: FILL_ARRAY_DATA , data: [49, 38, 59, 68, 58, 19} // fill-array
            r2 = 8
            byte[] r3 = new byte[r2]
            r3 = {x007c: FILL_ARRAY_DATA , data: [-95, 123, -60, -43, 30, 35, -96, 51} // fill-array
            c(r1, r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r1, r3)
            java.lang.String r0 = r0.intern()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = new java.lang.String
            byte[] r1 = new byte[r2]
            r1 = {x0084: FILL_ARRAY_DATA , data: [87, -10, 68, -15, -39, -91, -104, -2} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x008c: FILL_ARRAY_DATA , data: [-33, -128, -39, 61, 9, -10, 114, 21} // fill-array
            c(r1, r2)
            r0.<init>(r1, r3)
            java.lang.String r0 = r0.intern()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.b(r6)
            r1 = 1
            if (r0 != 0) goto L6c
            boolean r0 = r5.e()
            if (r0 != 0) goto L6c
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r0 = new java.lang.String
            r2 = 19
            byte[] r4 = new byte[r2]
            r4 = {x0094: FILL_ARRAY_DATA , data: [38, -55, -88, 6, -48, 85, -106, -47, 22, -89, -68, 106, 48, 79, -22, -6, 125, 29, -52} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x00a2: FILL_ARRAY_DATA , data: [-83, -45, 110, 57, 21, 32, 99, 85, -35, -15, 96, -84, -71, 89, 116, 115, 83, 51, -27} // fill-array
            c(r4, r2)
            r0.<init>(r4, r3)
            java.lang.String r0 = r0.intern()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            boolean r5 = r5.d(r6)
            if (r5 == 0) goto L6a
            goto L6c
        L6a:
            r5 = 0
            goto L6d
        L6c:
            r5 = r1
        L6d:
            com.aheaditec.talsec.security.X r6 = new com.aheaditec.talsec.security.X
            r5 = r5 ^ r1
            r6.<init>(r5, r1, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.Q0.a(com.aheaditec.talsec.security.Q0, android.content.Context):com.aheaditec.talsec.security.X");
    }

    public final boolean b(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        byte[] bArr = {100, -69, 42, -119, -80, 49, -24, -30, -59, -86, 98, 12, -35, -23, 23, 16, -29, -103, 56, 7};
        c(bArr, new byte[]{111, -52, -24, -86, 54, 108, 53, 41, 28, -20, -79, 62, -32, -93, -31, 90, -87, -87, -124, 64});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(absolutePath, new String(bArr, charset).intern());
        String lowerCase = absolutePath.toLowerCase(Locale.ROOT);
        byte[] bArr2 = {32, -101, -8, 30, -12, 75, 100, 100, -22, -60, -24, 76, 4, -122, 83, 24};
        c(bArr2, new byte[]{-80, -25, 38, -18, -17, 92, -92, -123, -17, -63, 63, -121, -122, 93, -21, 83});
        Intrinsics.checkNotNullExpressionValue(lowerCase, new String(bArr2, charset).intern());
        List<String> list = p;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (StringsKt.contains$default(lowerCase, (String) it.next(), false, 2, (Object) null)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            byte[] bArr3 = {-70, -37, 91, -79, -120, -71, 76, 102, 89, 71, 42, -11, -69, 114, 100, -21, 94, 124};
            c(bArr3, new byte[]{45, -68, -66, 99, 69, -60, -41, -89, -120, 71, -38, 62, 51, 5, -91, 9, 55, 14});
            c(new String(bArr3, StandardCharsets.UTF_8).intern(), lowerCase);
        }
        return z;
    }

    public final void c(final Context context) {
        a(b(new Function0() { // from class: com.aheaditec.talsec.security.Q0$$ExternalSyntheticLambda0
            public final Object invoke() {
                return Q0.a(this.f$0, context);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.Q0.d(java.lang.String):boolean");
    }

    public final boolean e() {
        String str;
        Object next;
        try {
            byte[] bArr = {105, 23, -83, -91, -10, -109, -76, -19, 76, 75, 113, 39, 18, -96, -15};
            c(bArr, new byte[]{34, 117, 109, 103, -7, -82, 85, 53, -100, 94, -52, -28, 115, -48, -126});
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new String(bArr, StandardCharsets.UTF_8).intern()));
            try {
                Iterator it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    String str2 = (String) it.next();
                    Iterator<T> it2 = p.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (StringsKt.contains$default(str2, (String) next, false, 2, (Object) null)) {
                            break;
                        }
                    }
                    str = (String) next;
                    if (str != null) {
                        break;
                    }
                }
                if (str != null) {
                    byte[] bArr2 = {49, 29, -100, 8, -104, 104, -20, 123, -34, -46, -63, -11, 0, 30, -117, 102};
                    c(bArr2, new byte[]{-91, 120, 97, 8, 111, 51, 50, -72, -49, -95, 67, 43, -9, 104, -100, -90});
                    c(new String(bArr2, StandardCharsets.UTF_8).intern(), String.valueOf(p.indexOf(str)));
                }
                boolean z = str != null;
                CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                return z;
            } finally {
            }
        } catch (Exception e) {
            byte[] bArr3 = {93, 41, 104, 115, 13, -67, 87, -113, 125, 115, -67, 56, 54, -66, -32, -21, -55, -12, -70, 122, -34};
            c(bArr3, new byte[]{76, 98, -74, -95, -40, -29, -89, -126, 85, 0, 65, -8, -65, -17, 55, 58, 8, -127, 88, -78, -84});
            new String(bArr3, StandardCharsets.UTF_8).intern();
            e.toString();
            return false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    private static void c(byte[] bArr, byte[] bArr2) {
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
                    byte b = bArr3[i11];
                    int length6 = bArr4.length;
                    byte b2 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                    bArr3[i11] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                    i2 = 935800592;
                    break;
                case 256719606:
                    int i12 = (i4 - 1) - (i4 | (-4));
                    byte b3 = bArr3[i12];
                    int i13 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
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
                    byte b4 = bArr4[i12];
                    int i24 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
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
                    byte b5 = bArr4[(i38 ^ length10) - (((~length10) & i38) * 2)];
                    int length11 = bArr4.length;
                    byte b6 = bArr3[((i37 | length11) * 2) - (length11 ^ i37)];
                    bArr4[(i39 - i41) + i40] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
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

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        byte[] bArr = {105, -34, 106, -24, 0, -110, 61};
        c(bArr, new byte[]{110, -93, -78, 62, 101, -22, 73, -40});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        c(context);
    }
}
