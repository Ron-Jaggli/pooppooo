package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.t1;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0039n implements InterfaceC0006b0 {
    public static final String c;
    public final u1 a;
    public final E1 b;

    static {
        byte[] bArr = {-69, 59, 109, -25, 77, -33, -122, 63, -8, 59, -41, 118};
        a(bArr, new byte[]{-53, 90, 30, -108, 46, -80, -30, 90, -89, 72, -78, 2});
        c = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public AbstractC0039n(u1 u1Var, E1 e1) {
        this.a = u1Var;
        this.b = e1;
    }

    public boolean a(boolean z) {
        this.b.a().getClass();
        this.a.a(t1.a.k, z);
        if (!z) {
            E1 e1 = this.b;
            e1.a().getClass();
            byte[] bArr = {-38, 123, 55, -8, -42, 2, 61, 25, 44, -119, 7, -34};
            a(bArr, new byte[]{-86, 26, 68, -117, -75, 109, 89, 124, 115, -6, 98, -86});
            e1.a((Integer) 1, new String(bArr, StandardCharsets.UTF_8).intern());
        }
        return z;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean b() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        return false;
    }

    public final void b(boolean z) {
        this.a.a(t1.a.k, z);
    }

    public static void a(byte[] bArr, byte[] bArr2) {
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
