package com.aheaditec.talsec.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.aheaditec.talsec.security.C0028i1;
import com.aheaditec.talsec_security.security.LifecycleObserver;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class o1 extends BroadcastReceiver implements LifecycleObserver.b {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final IntentFilter j;
    public final P0 a;
    public final C0028i1.a b;
    public final Context c;
    public boolean d = false;

    static {
        byte[] bArr = {116, -35, -56, -109, 1, 110, 106, -114, -39, 3, -122, 109};
        a(bArr, new byte[]{89, -120, 110, -65, -22, 21, -125, -93, 41, -80, -93, -118});
        Charset charset = StandardCharsets.UTF_8;
        i = new String(bArr, charset).intern();
        byte[] bArr2 = {-45, -31, -28, -98, 116, -74, 92, -23, 70, 29, -75};
        a(bArr2, new byte[]{54, -116, 2, 72, 87, -22, -111, 14, 30, 88, -10});
        h = new String(bArr2, charset).intern();
        byte[] bArr3 = {74, -128, -128, 59, -101, -37, 86, -54, -98};
        a(bArr3, new byte[]{-81, 46, -90, -44, 112, -121, -105, 100, -36});
        g = new String(bArr3, charset).intern();
        byte[] bArr4 = {-119, 53, 62, 60, -24, -120, 68, 88, -64, 127, -44, -52, -102, 87, -67, -97, 57, 87, -124, -9, -99, -60, 56, -113, 74, 33, -67, -49, 60, 124};
        a(bArr4, new byte[]{78, 76, -35, -80, -21, 25, -39, -35, 8, 8, 104, 97, 81, 49, 70, 100, -76, 39, -105, 45, 40, -35, -60, -94, -117, 124, 89, 91, 95, 25});
        f = new String(bArr4, charset).intern();
        byte[] bArr5 = {-126, 18};
        a(bArr5, new byte[]{-54, 80, 124, -39, -106, 64, -31, 97});
        e = new String(bArr5, charset).intern();
        byte[] bArr6 = {118, -110, -32, 43, 73, -17, -54, 77, -26, -41, 54, 53, 64, -4, 123, -83, 102, -20, -88, 29, -118, -54, -79, -49, -119, -30, 35, -16, 12, 100};
        a(bArr6, new byte[]{121, -17, 63, -96, -118, -77, 83, -41, -26, -96, -122, -39, -117, -99, -124, 105, 99, -71, 123, -12, 71, -41, 77, 97, 72, -94, -29, 59, 111, 1});
        j = new IntentFilter(new String(bArr6, charset).intern());
    }

    public o1(Context context, P0 p0, C0028i1.a aVar) {
        this.c = context;
        this.a = p0;
        this.b = aVar;
    }

    @Override // com.aheaditec.talsec_security.security.LifecycleObserver.b
    public void a() {
        this.b.c();
        a(this.c);
    }

    @Override // com.aheaditec.talsec_security.security.LifecycleObserver.b
    public void b() {
        b(this.c);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            byte[] bArr = {49, 16, 61, -104, -94, 90, -38, -89, 64};
            a(bArr, new byte[]{-108, -66, -6, -77, 9, 6, 19, 66, 2});
            Charset charset = StandardCharsets.UTF_8;
            if (intent.hasExtra(new String(bArr, charset).intern())) {
                byte[] bArr2 = {74, 103, -121, -61, 48, -105, 28, 69, -15};
                a(bArr2, new byte[]{-81, 23, -83, 108, -101, -54, -47, -17, -77});
                String stringExtra = intent.getStringExtra(new String(bArr2, charset).intern());
                if (stringExtra != null) {
                    a(stringExtra);
                    return;
                }
                return;
            }
            byte[] bArr3 = {-86, -125, 86, 32, 46, -39, 118, -50, 115, 111, 94};
            a(bArr3, new byte[]{15, 50, -100, -53, -99, -120, -73, 117, 43, 42, 29});
            if (intent.hasExtra(new String(bArr3, charset).intern())) {
                byte[] bArr4 = {-16, 61, -89, 11, 105, 80, -37, -118, 106, -111, -63};
                a(bArr4, new byte[]{-43, 104, 77, 39, 66, 112, 18, -88, 50, -44, -126});
                String stringExtra2 = intent.getStringExtra(new String(bArr4, charset).intern());
                if (stringExtra2 != null) {
                    this.a.a(stringExtra2);
                    return;
                }
                return;
            }
            byte[] bArr5 = {-50, -18, -89, 30, -92, 91, 52, -127, 53, 102, -25, 84};
            a(bArr5, new byte[]{51, -97, 77, -56, 7, 7, -7, -80, -115, 18, 13, -14});
            if (intent.hasExtra(new String(bArr5, charset).intern())) {
                byte[] bArr6 = {106, -42, -19, -38, 76, 115, -46, -85, 48, 90, -104, -66};
                a(bArr6, new byte[]{79, -121, 11, 116, -65, 46, 27, 93, -128, 6, 94, 100});
                String stringExtra3 = intent.getStringExtra(new String(bArr6, charset).intern());
                if (stringExtra3 != null) {
                    byte[] bArr7 = {46, -76};
                    a(bArr7, new byte[]{108, -13, -44, -48, -21, 9, -76, 74});
                    if (stringExtra3.equals(new String(bArr7, charset).intern())) {
                        b(context);
                    }
                }
            }
        }
    }

    public final void a(String str) {
        byte[] bArr = {28, 57};
        a(bArr, new byte[]{84, 123, -41, -100, 10, -108, 118, 79});
        Charset charset = StandardCharsets.UTF_8;
        if (str.equals(new String(bArr, charset).intern())) {
            this.a.a();
            return;
        }
        byte[] bArr2 = {-54, 1};
        a(bArr2, new byte[]{-126, 67, -124, -93, -48, -111, -117, 25});
        new String(bArr2, charset).intern();
        byte[] bArr3 = {66, 29, -25, 60, 28, -119, 93, 116, 100, 20, 14, -95, 43, 54, -29, 94, 35, -28, -122, -115, -126, -54, -47, -26, -54, -88, -14, -70, 110, 51};
        a(bArr3, new byte[]{-77, 100, 50, -15, -81, 1, -95, -10, 64, 64, -96, 110, -86, 80, 38, -96, -96, -76, -40, -99, 67, -37, 38, 32, 24, -13, 0, 51, 64, 29});
        new String(bArr3, charset).intern();
    }

    public synchronized void b(Context context) {
        Context applicationContext;
        if (context != null) {
            if (this.d && (applicationContext = context.getApplicationContext()) != null) {
                applicationContext.unregisterReceiver(this);
                this.d = false;
            }
            this.a.i();
        } else {
            this.a.i();
        }
    }

    public final synchronized void a(Context context) {
        Context applicationContext;
        if (!this.d && (applicationContext = context.getApplicationContext()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationContext.registerReceiver(this, j, 4);
            } else {
                applicationContext.registerReceiver(this, j);
            }
            this.d = true;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] bArr3 = null;
        int i3 = -1003175592;
        int length = 0;
        int i4 = 0;
        int i5 = 0;
        byte[] bArr4 = null;
        while (true) {
            int i6 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
            int i7 = i3 >>> 8;
            int i8 = ~((((~i7) | (-1095531540)) | i6) - ((i7 & (-1095531540)) | i6));
            int i9 = (-1171264002) - ((i8 & 2) | ((-130029571) - i8));
            switch ((-1109882652) ^ ((~i9) + ((i9 | 1) * 2))) {
                case -1922532006:
                    int length2 = bArr4.length;
                    int i10 = 0 - length;
                    i3 = (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i10, -4, 1, length2), i10 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i10, -4, 1, length2), i10 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                    i4 = length;
                    break;
                case -1486048729:
                    int length3 = bArr.length;
                    int length4 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                    i3 = z ? z ? -1515449616 : 935800592 : -10521562;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i5 = 0;
                    break;
                case -497756741:
                    int length5 = bArr4.length;
                    int i11 = 0 - i4;
                    int i12 = ((length5 | i11) * 2) - (length5 ^ i11);
                    byte b = bArr3[i12];
                    int length6 = bArr4.length;
                    byte b2 = bArr3[((i11 | length6) - ((1163302289 & (~i11)) & length6)) + ((i11 | 1163302289) & length6)];
                    bArr3[i12] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                    i3 = 935800592;
                    break;
                case 256719606:
                    int i13 = (i5 - 1) - (i5 | (-4));
                    byte b3 = bArr3[i13];
                    int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i15 = i5 + 2;
                    int i16 = i15 - (i5 & 2);
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int iA = J.a(i18, i14, 1, ((-1) - i18) | ((-1) - i14));
                    int i19 = i15 + (((-1) - i5) | (-2));
                    int i20 = bArr3[i19] & 255;
                    int i21 = i20 * ((~i20) & 256);
                    int i22 = (i21 - 1) - ((~iA) | i21);
                    int i23 = bArr3[i5] & 255;
                    int i24 = ~((i23 | ((~i22) | (-755325340))) - ((i22 & (-755325340)) | i23));
                    byte b4 = bArr4[i13];
                    int i25 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i26 = bArr4[i16] & 255;
                    int i27 = i26 * ((~i26) & 65536);
                    int i28 = bArr4[i19] & 255;
                    int i29 = i28 * ((~i28) & 256);
                    int i30 = bArr4[i5] & 255;
                    int i31 = i24 << ((i24 > Double.NaN ? 1 : (i24 == Double.NaN ? 0 : -1)) >>> 31);
                    int i32 = (-659933419) - ((i25 & 2) | (1983400305 - i25));
                    int i33 = (i32 ^ (~i27)) + ((i32 | i27) * 2) + 1;
                    int i34 = (i33 ^ i30) + ((i33 & i30) * 2);
                    int i35 = ((i34 | i29) - (((-2109111237) & (~i29)) & i34)) + ((i29 | (-2109111237)) & i34);
                    int iA2 = y1.a(i31 | i35, 2, i31, i35);
                    bArr4[i5] = (byte) iA2;
                    bArr4[i19] = (byte) (iA2 >>> 8);
                    bArr4[i16] = (byte) (iA2 >>> 16);
                    bArr4[i13] = (byte) (iA2 >>> 24);
                    i5 = (i5 ^ 4) + ((i5 & 4) * 2);
                    int length7 = bArr4.length;
                    int length8 = 0 - (bArr4.length % 4);
                    int i36 = ((i5 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i5 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                    i3 = i36 != 0 ? -1515449616 : 935800592;
                    if (i36 == 0) {
                        i3 = -10521562;
                    }
                    break;
                case 1429728656:
                    length = bArr4.length % 4;
                    int i37 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i2 = i37 != 0 ? -1216566512 : 935800592;
                    i3 = i37 == 0 ? -1058029970 : i2;
                    break;
                case 1870596681:
                    break;
                case 1879000533:
                    int length9 = bArr4.length;
                    int i38 = 0 - i4;
                    int i39 = 0 - i38;
                    int i40 = i39 | length9;
                    int i41 = (length9 ^ i39) ^ i40;
                    int i42 = i39 * 2;
                    int length10 = bArr4.length;
                    byte b5 = bArr4[(i39 ^ length10) - (((~length10) & i39) * 2)];
                    int length11 = bArr4.length;
                    byte b6 = bArr3[((i38 | length11) * 2) - (length11 ^ i38)];
                    bArr4[(i40 - i42) + i41] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
                    length = (~i4) + (i4 * 2);
                    int i43 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                    i2 = i43 != 0 ? -1216566512 : 935800592;
                    if (i43 == 0) {
                    }
                    break;
                default:
                    i3 = 935800592;
                    break;
            }
            return;
        }
    }
}
