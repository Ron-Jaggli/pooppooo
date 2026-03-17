package com.aheaditec.talsec.security;

import android.security.keystore.KeyInfo;
import android.security.keystore.KeyProtection;
import com.aheaditec.talsec.security.AbstractC0062z;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class A extends AbstractC0062z {
    public final a d;

    public static class a extends AbstractC0062z.a {
        public final int c;
        public final int d;
        public final String e;
        public final String f;

        public a(String str, int i, String str2, int i2, String str3, String str4) {
            super(str, str2);
            if (i <= 0) {
                byte[] bArr = {93, -37, 53, 60, -83, -53, 0, 12, 104, -16, -124, -91, -69, 81, -92, -73, 3, -95, -32, -121, -122, 117, 72, 32, -69, -51, 44, -80, 99, -96, 1, 45, -66, 114, 22};
                a(bArr, new byte[]{109, -84, -55, -7, 37, -47, 82, 30, 109, -84, -105, 106, 127, 82, 99, 105, -45, -82, 48, -113, 10, 4, -56, -25, 62, -49, -5, 96, 39, -6, 27, -18, -48, 82, 38});
                throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            this.c = i;
            this.d = i2;
            this.e = str3;
            this.f = str4;
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

        public String c() {
            return this.e;
        }

        public int d() {
            return this.c;
        }

        public String e() {
            return this.f;
        }

        public int f() {
            return this.d;
        }
    }

    public A(a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
        this.d = aVar;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z
    public KeyStore.Entry a(Date date) {
        return new KeyStore.SecretKeyEntry(new SecretKeySpec(new byte[this.d.d()], this.d.a()));
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z
    public KeyStore.ProtectionParameter b(Date date) throws C0031j1 {
        try {
            return new KeyProtection.Builder(this.d.f()).setBlockModes(this.d.c()).setEncryptionPaddings(this.d.e()).setUserAuthenticationRequired(false).setUserAuthenticationValidityDurationSeconds(Integer.MAX_VALUE).build();
        } catch (NoSuchMethodError unused) {
            byte[] bArr = {-37, -33, 34, 122, -81, 73, -61, -101, 125, -126, 44, 42, 2, -23, -103, 54, 80, 35, -48, 96, 35, -26, -79, 8, 12, 0, 113, -20, 95, 114, 75, 93, -57, -71, -126, -70, 5, -31, -93, -77, 59, -13, 120, -30};
            b(bArr, new byte[]{-127, -18, 54, 45, -87, 109, -51, 17, -8, 22, 56, 119, 80, -7, -68, 108, 18, -96, -114, 40, 58, -77, 123, -111, 103, -97, -17, -95, 37, 54, 12, 75, -110, -55, -36, -12, 96, -80, -72, -17, 56, -58, -12, -28});
            throw new C0031j1(C0031j1.g, new String(bArr, StandardCharsets.UTF_8).intern());
        }
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z
    public Class<? extends KeyStore.Entry> g() {
        return KeyStore.SecretKeyEntry.class;
    }

    public KeyInfo l() throws C0031j1 {
        Key keyD = d();
        KeyInfo keyInfoA = a((SecretKey) keyD);
        a(keyD, keyInfoA);
        return keyInfoA;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z
    public Key a(KeyStore.Entry entry) {
        return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0060y
    public boolean b() throws C0031j1 {
        return l().isInsideSecureHardware();
    }

    public final KeyInfo a(SecretKey secretKey) throws C0031j1 {
        try {
            String algorithm = secretKey.getAlgorithm();
            byte[] bArr = {-79, -58, -10, -61, -32, -112, -17, 27, -20, 101, -112, -13, -67, 68, -36};
            b(bArr, new byte[]{-39, -40, 124, -54, 120, 41, 118, 105, 114, 76, -83, -96, -46, 54, -71});
            return (KeyInfo) SecretKeyFactory.getInstance(algorithm, new String(bArr, StandardCharsets.UTF_8).intern()).getKeySpec(secretKey, KeyInfo.class);
        } catch (NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            throw super.b(e);
        } catch (InvalidKeySpecException e2) {
            throw super.a(e2);
        }
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z
    public void b(Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr = {-80, -115, -127, -29, -122, 72, -56, -81, -45, -103, -62, 44, -21, -23, 29, 84, -11};
        b(bArr, new byte[]{-38, -8, -68, -27, -82, 58, 117, -103, -122, 38, 125, 102, 120, -67, 94, 83, -110});
        Cipher cipher = Cipher.getInstance(new String(bArr, StandardCharsets.UTF_8).intern());
        cipher.init(1, key);
        try {
            cipher.doFinal(new byte[0]);
        } catch (Exception unused) {
        }
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

    public final void a(Key key, KeyInfo keyInfo) throws C0031j1 {
        int purposes = keyInfo.getPurposes();
        int keySize = keyInfo.getKeySize() / 8;
        String algorithm = key.getAlgorithm();
        if (purposes != this.d.f() || keySize != this.d.d() || !this.d.a().equals(algorithm)) {
            throw new C0031j1(C0031j1.f, null);
        }
    }
}
