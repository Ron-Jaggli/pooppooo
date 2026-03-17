package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0058x extends AbstractC0017f {
    public static final String m;
    public final E1 l;

    static {
        byte[] bArr = {-107, -19, 42, -36, -120, -34, -3, -45, 70};
        a(bArr, new byte[]{-26, -108, 89, -88, -19, -77, -85, -125, 8});
        m = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public AbstractC0058x(R0 r0, E1 e1) {
        super(r0);
        this.l = e1;
    }

    public void a(X x) {
        this.l.a().getClass();
        byte[] bArr = {-78, 116, 105, -103, -79, 74, -43, 32, 37};
        a(bArr, new byte[]{-63, 13, 26, -19, -44, 39, -125, 112, 107});
        Charset charset = StandardCharsets.UTF_8;
        a(new String(bArr, charset).intern(), x);
        if (x.c()) {
            byte[] bArr2 = {-128, -93, 38, -35, -28, -21, 93, 68, 90};
            a(bArr2, new byte[]{-13, -38, 85, -87, -127, -122, 11, 20, 20});
            String strIntern = new String(bArr2, charset).intern();
            this.l.a().getClass();
            a(strIntern, (Integer) 1);
        }
        if (x.b()) {
            E1 e1 = this.l;
            e1.a().getClass();
            byte[] bArr3 = {90, 49, -99, -124, 55, 99, 77, 61, 79};
            a(bArr3, new byte[]{41, 72, -18, -16, 82, 14, 27, 109, 1});
            e1.a((Integer) 1, new String(bArr3, charset).intern());
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
