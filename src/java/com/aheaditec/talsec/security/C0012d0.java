package com.aheaditec.talsec.security;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.aheaditec.talsec.security.AbstractC0017f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.util.UUID;
import javax.crypto.Cipher;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0012d0 extends AbstractC0023h {
    public static final String q;
    public static final String r;
    public static final String s;
    public final C0015e0 o;
    public final InterfaceC0021g0 p;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    /* JADX INFO: renamed from: com.aheaditec.talsec.security.d0$a */
    public static class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public boolean a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    static {
        byte[] bArr = {-112, 58, -22, -117, -36, -33, 71, 76, -121, -7, 70, -113, 68, -115, -14, -84, 121, 89, -69, -51};
        c(bArr, new byte[]{-85, -103, -107, -67, -126, -52, -17, 123, -64, -30, -17, -12, 94, 13, 126, -31, 6, 96, -65, -61});
        Charset charset = StandardCharsets.UTF_8;
        s = new String(bArr, charset).intern();
        byte[] bArr2 = {92, -81, 106, 126, -6, 76, 24, 67, 44, -38, -115, 11, 32, 91, 21};
        c(bArr2, new byte[]{6, -15, -8, 36, 126, 85, 102, 33, 50, -45, -56, -104, 79, 41, 112});
        r = new String(bArr2, charset).intern();
        byte[] bArr3 = {55, -76, 125, 83, 72, -8, 94, 43, 63, 31, -6, -24, 89};
        c(bArr3, new byte[]{76, 5, -4, 56, 22, -53, 6, 91, 58, -85, 125, -97, 62});
        q = new String(bArr3, charset).intern();
    }

    public C0012d0(R0 r0, E1 e1, Context context, InterfaceC0021g0 interfaceC0021g0) {
        super(r0, e1);
        this.o = new C0015e0(context);
        this.p = interfaceC0021g0;
    }

    public final boolean a(PublicKey publicKey, KeyStore.PrivateKeyEntry privateKeyEntry, String str) {
        try {
            byte[] bArr = {39, -67, 109, -116, 74, 32, -99, -113, -111, 78, -68, -6, -116, -110, 74, -91, 66, 100, -15, -78};
            c(bArr, new byte[]{94, 30, 23, -68, -8, -110, -55, -71, -86, 53, -23, -62, -90, -14, 21, -38, 15, 61, -119, -18});
            Charset charset = StandardCharsets.UTF_8;
            Cipher cipher = Cipher.getInstance(new String(bArr, charset).intern());
            cipher.init(1, publicKey);
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(charset));
            byte[] bArr2 = {-78, 23, -42, 103, -34, -33, 119, 84, 61, -106, -127, 110, 126, -83, 101, 39, -88, -28, -47, 14};
            c(bArr2, new byte[]{-55, 116, -127, 97, -124, -52, 31, -108, 86, 13, -83, 86, 56, 45, -17, 91, -75, -67, -87, -126});
            Cipher cipher2 = Cipher.getInstance(new String(bArr2, charset).intern());
            cipher2.init(2, privateKeyEntry.getPrivateKey());
            return str.equals(new String(cipher2.doFinal(bArrDoFinal), charset));
        } catch (Exception unused) {
            return true;
        }
    }

    public final KeyStore.PrivateKeyEntry b(KeyStore keyStore) {
        try {
            byte[] bArr = {90, -18, 115, -85, -3, 117, -24, -43, -112, 46, -42, 8, -10};
            c(bArr, new byte[]{-9, -66, 9, -15, -127, 70, -108, -43, -25, 122, -87, 127, -111});
            KeyStore.Entry entry = keyStore.getEntry(new String(bArr, StandardCharsets.UTF_8).intern(), null);
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return (KeyStore.PrivateKeyEntry) entry;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0023h, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean b() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0023h, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean c() {
        return false;
    }

    public final boolean e() {
        String strA = this.p.a();
        if (strA == null) {
            return false;
        }
        if (this.o.a()) {
            String strC = this.o.c();
            if (!strA.equals(strC)) {
                byte[] bArr = {-21, 69, -60, 104, -1, -105, 121, 23, -28, -9, 112, 76, -84, 6, -36, -125, -123, -97};
                c(bArr, new byte[]{120, 92, -118, 66, 122, 35, -10, -112, 118, -61, 35, 65, -40, -98, -89, 6, -30, -6});
                Charset charset = StandardCharsets.UTF_8;
                String strIntern = new String(bArr, charset).intern();
                StringBuilder sb = new StringBuilder();
                byte[] bArr2 = {103, 115, -125, -99, 18};
                c(bArr2, new byte[]{17, 79, -47, -64, 50, 97, 5, 47});
                StringBuilder sbAppend = sb.append(new String(bArr2, charset).intern()).append(strC);
                byte[] bArr3 = {-83, 71, -97, 114, 112, -36, 120};
                c(bArr3, new byte[]{106, -105, -37, 48, 7, -26, 88, 32});
                c(strIntern, sbAppend.append(new String(bArr3, charset).intern()).append(strA).toString());
                return true;
            }
        } else {
            this.o.a(strA);
        }
        return false;
    }

    public final boolean f() {
        String strC = this.p.c();
        if (strC == null) {
            return false;
        }
        if (this.o.b()) {
            String strD = this.o.d();
            if (!strC.equals(strD)) {
                byte[] bArr = {-50, -79, -26, 27, -7, -39, 106, -105, 64, -79, 23, 13, -127, -121, -2, 30, -73, -127, -118, 80};
                c(bArr, new byte[]{-109, 8, 109, 113, 127, -28, 4, 17, 28, 8, 78, -127, -79, 19, -88, -113, -65, 31, -40, 78});
                Charset charset = StandardCharsets.UTF_8;
                String strIntern = new String(bArr, charset).intern();
                StringBuilder sb = new StringBuilder();
                byte[] bArr2 = {10, -99, 37, -78, -48};
                c(bArr2, new byte[]{46, 33, 44, -95, -16, 51, 46, -75});
                StringBuilder sbAppend = sb.append(new String(bArr2, charset).intern()).append(strD);
                byte[] bArr3 = {-116, -86, -83, 50, -81, -95, -16};
                c(bArr3, new byte[]{-119, -70, -83, 112, -40, -101, -48, -42});
                b(strIntern, sbAppend.append(new String(bArr3, charset).intern()).append(strC).toString());
                return true;
            }
        } else {
            this.o.b(strC);
        }
        return false;
    }

    public final a g() {
        try {
            byte[] bArr = {114, 105, 50, -99, -96, -93, -63, -108, 72, 38, 43, 52, 62, 29, -24};
            c(bArr, new byte[]{28, 55, 64, 8, -72, -6, -113, -8, 22, -113, 98, 89, 81, 111, -115});
            Charset charset = StandardCharsets.UTF_8;
            KeyStore keyStore = KeyStore.getInstance(new String(bArr, charset).intern());
            keyStore.load(null);
            PublicKey publicKeyE = this.o.e();
            if (publicKeyE != null) {
                byte[] bArr2 = {15, 9, -128, 97, -38, 82, 104, 77, 43, 71, -91, -27, -60};
                c(bArr2, new byte[]{68, -104, -42, 43, -88, 97, 20, 61, 46, 83, -74, -92, -93});
                if (!keyStore.containsAlias(new String(bArr2, charset).intern())) {
                    byte[] bArr3 = {-2, -79, -98, -98, 52, -11, -51, -8, -62, 36, -1, 2, 86, -33, -21, 6, -42};
                    c(bArr3, new byte[]{-125, 8, -27, -18, 58, -68, -120, -91, -106, -122, -124, 90, 39, -18, 111, 122, -77});
                    String strIntern = new String(bArr3, charset).intern();
                    byte[] bArr4 = {-99, -126, -46, -64, -68, 24, 33, -73, 42, -62, 14, 27, 3, -93, -120};
                    c(bArr4, new byte[]{-27, 30, -90, -70, -72, 104, 57, -15, 71, 18, 83, -115, 118, -51, -20});
                    c(strIntern, new String(bArr4, charset).intern());
                    a(keyStore);
                    return new a(false, true);
                }
                KeyStore.PrivateKeyEntry privateKeyEntryB = b(keyStore);
                if (privateKeyEntryB != null) {
                    if (a(publicKeyE, privateKeyEntryB, UUID.randomUUID().toString())) {
                        return new a(false, false);
                    }
                    byte[] bArr5 = {-52, 90, -55, 82, 92, -62, -97, -78, 11, 85, -47, -40, -62, 87, 7, 85, 115};
                    c(bArr5, new byte[]{-111, 99, -105, 50, 34, -21, -74, -33, 77, 87, -98, -76, -109, 102, 83, 75, 22});
                    String strIntern2 = new String(bArr5, charset).intern();
                    byte[] bArr6 = {22, 95, -84, 104, -53, 1, 20, -58, -62, 51, 4, 0, 89, -17, 33, 90};
                    c(bArr6, new byte[]{102, 106, -65, 49, -109, -104, 80, -1, -104, -118, 97, -122, 33, -53, 44, 75});
                    c(strIntern2, new String(bArr6, charset).intern());
                    return new a(true, false);
                }
            }
            a(keyStore);
            return new a(false, false);
        } catch (Exception unused) {
            return new a(false, false);
        }
    }

    public void h() {
        super.a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.d0$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.i();
            }
        }));
    }

    public final X i() {
        return new X(!e(), !r2.a, (g().b || f()) ? false : true);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    private static void c(byte[] bArr, byte[] bArr2) {
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

    public final void a(KeyStore keyStore) {
        try {
            byte[] bArr = {47, -69, 62, -2, 85, 33, -49, -111, 66, -52, -36, 0, -57};
            c(bArr, new byte[]{100, 10, 61, -90, 25, 114, 119, 17, 21, -40, -97, -121, -96});
            Charset charset = StandardCharsets.UTF_8;
            if (keyStore.containsAlias(new String(bArr, charset).intern())) {
                byte[] bArr2 = {101, 46, 6, 47, -107, 102, 58, 31, -42, -90, -123, 14, -47};
                c(bArr2, new byte[]{26, 127, 84, 117, -39, 53, 98, -113, -95, -14, -42, 121, -74});
                keyStore.deleteEntry(new String(bArr2, charset).intern());
            }
            byte[] bArr3 = {119, -121, 101};
            c(bArr3, new byte[]{37, -44, 36, -63, -80, 107, 29, -78});
            String strIntern = new String(bArr3, charset).intern();
            byte[] bArr4 = {38, 93, 48, -14, -80, 68, 16, 10, -4, -111, 1, -81, 48, 57, -32};
            c(bArr4, new byte[]{80, 99, 62, -103, -56, 93, 94, 90, -126, 24, 61, -12, 95, 75, -123});
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(strIntern, new String(bArr4, charset).intern());
            byte[] bArr5 = {-95, -126, 115, -112, 45, 28, -116, -93, 22, -76, 36, 86, -114};
            c(bArr5, new byte[]{-34, 19, 10, -4, 49, -81, -72, -29, 97, 0, 56, 81, -23});
            KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(new String(bArr5, charset).intern(), 3).setKeySize(2048);
            byte[] bArr6 = {9, -3, -34, 61, -4, 24, -2, -45, 107, 50, 121, 51};
            c(bArr6, new byte[]{66, -26, -121, -121, -74, 120, -119, -48, -8, -118, 1, 109});
            keyPairGenerator.initialize(keySize.setEncryptionPaddings(new String(bArr6, charset).intern()).setUserAuthenticationRequired(false).build());
            PublicKey publicKey = keyPairGenerator.generateKeyPair().getPublic();
            byte[] bArr7 = {-82, -101, 34, 104, -56, 75, -107, -80, -49, -41, -56, -57, 32};
            c(bArr7, new byte[]{-29, 42, 57, 52, -106, 88, -63, -14, -118, -29, -117, -62, 71});
            if (keyStore.containsAlias(new String(bArr7, charset).intern())) {
                this.o.a(publicKey);
            }
        } catch (Exception | NoSuchMethodError unused) {
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        h();
    }
}
