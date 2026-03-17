package com.aheaditec.talsec.security;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.aheaditec.talsec.security.AbstractC0017f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class K1 extends AbstractC0058x {
    public K1(R0 r0, E1 e1) {
        super(r0, e1);
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        b(context);
    }

    @Override // com.aheaditec.talsec.security.AbstractC0058x, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean b() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0058x, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean c() {
        return false;
    }

    public final /* synthetic */ X d(Context context) {
        return new X(!c(context), true, true);
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

    public void b(final Context context) {
        super.a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.K1$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.d(context);
            }
        }));
    }

    public final boolean c(Context context) {
        Network activeNetwork;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                byte[] bArr = {72, 78, 124, -44, 101, -20, -1, 13, 89, 73, 12, -35};
                a(bArr, new byte[]{33, 61, 42, -92, 11, -66, -118, 99, 55, 32, 98, -70});
                Charset charset = StandardCharsets.UTF_8;
                String strIntern = new String(bArr, charset).intern();
                byte[] bArr2 = {52, -124, -88, -36};
                a(bArr2, new byte[]{64, -10, -35, -71, 110, 40, 105, -68});
                c(strIntern, new String(bArr2, charset).intern());
                return true;
            }
        } catch (Exception e) {
            byte[] bArr3 = {17, -80, 23, -32, 13, -67, 67, 63, -68, -64, 91};
            a(bArr3, new byte[]{71, -64, 121, -92, 104, -55, 38, 92, -56, -81, 41});
            Charset charset2 = StandardCharsets.UTF_8;
            new String(bArr3, charset2).intern();
            byte[] bArr4 = {-125, 2, 84, -82, 105, 75, -79, -48, 127, 90, -90, 86, 25, 28, -90, 38, 84, 125, 51, -104, -76, -68, -8, 115, -72, -6};
            a(bArr4, new byte[]{-28, 103, 32, -32, 12, 63, -58, -65, 13, 49, -27, 55, 105, 125, -60, 79, 56, 20, 71, -15, -47, -49, -48, 90, -126, -38});
            new String(bArr4, charset2).intern();
            e.toString();
        }
        return false;
    }
}
