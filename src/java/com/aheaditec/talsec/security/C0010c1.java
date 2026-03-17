package com.aheaditec.talsec.security;

import android.content.Context;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0010c1 extends AbstractC0048s {
    public static final String o;
    public static final long p = 86400000;
    public static final int q = 10;
    public final C0007b1 n;

    static {
        byte[] bArr = {109, 31, -119, -36, 27, -6, -48, -55};
        a(bArr, new byte[]{9, 122, -3, -71, 120, -114, -75, -83});
        o = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public C0010c1(R0 r0, E1 e1, C0007b1 c0007b1) {
        super(r0, e1);
        this.n = c0007b1;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
    }

    public void e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lA = this.n.a();
        if (lA != null && jCurrentTimeMillis - lA.longValue() > 86400000) {
            this.n.g();
        }
        if (this.n.c() < 10) {
            this.n.e();
            byte[] bArr = {-77, -117, 41, 5, -43, -61, 115, 86};
            a(bArr, new byte[]{-41, -18, 93, 96, -74, -73, 22, 50});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-117, 33, -114, -85};
            a(bArr2, new byte[]{-1, 83, -5, -50, 97, -17, -33, -111});
            c(strIntern, new String(bArr2, charset).intern());
        }
        super.a(new X(false, true, true));
    }

    private static void a(byte[] bArr, byte[] bArr2) {
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
