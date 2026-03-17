package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.A;
import com.aheaditec.talsec.security.AbstractC0062z;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class B extends A {
    public final AbstractC0062z.a e;
    public final KeyStore f;

    public B(A.a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
        this.e = aVar;
        this.f = keyStore;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void c(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = null;
        int i2 = -585497720;
        int i3 = 0;
        int i4 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
            int i6 = i2 >>> 8;
            int i7 = ~((((~i6) | (-238348293)) | i5) - ((i6 & (-238348293)) | i5));
            int i8 = (-1081514022) - ((i7 & 2) | ((-10362931) - i7));
            int iA = y1.a(i8 | (-428181225), 2, i8, -428181225);
            int i9 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i10 = 0 - i3;
                    int length3 = bArr3.length;
                    int i11 = 0 - i10;
                    byte b = bArr3[(length3 & (~i11)) - ((~length3) & i11)];
                    int length4 = bArr3.length;
                    byte b2 = bArr4[((length4 | i10) - (((-1678010279) & (~i10)) & length4)) + ((i10 | (-1678010279)) & length4)];
                    bArr3[((length2 | i10) * 2) - (length2 ^ i10)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - b2)) - b);
                    length = 4 - ((5 - i3) | (i3 & 2));
                    int i12 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    int i13 = i12 != 0 ? 2100390411 : -897645243;
                    if (i12 == 0) {
                        i = -2079636786;
                        i2 = i;
                    } else {
                        i2 = i13;
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i4 = 0;
                    i2 = i;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i14 = 0 - i3;
                    int i15 = ((length7 | i14) - (((-515406864) & (~i14)) & length7)) + ((i14 | (-515406864)) & length7);
                    byte b3 = bArr4[i15];
                    int length8 = bArr3.length;
                    byte b4 = bArr4[((i14 | length8) * 2) - (length8 ^ i14)];
                    int i16 = ((byte) 0) - b3;
                    int i17 = i16 | b4;
                    bArr4[i15] = (byte) (((byte) (((byte) i17) - ((byte) (((byte) 2) * ((byte) i16))))) + ((byte) ((b4 ^ i16) ^ i17)));
                    i2 = i9;
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i18 = i4 + 4 + (((-1) - i4) | (-4));
                    byte b5 = bArr4[i18];
                    int i19 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i20 = i4 & 2;
                    int i21 = (i4 + 2) - i20;
                    int i22 = bArr4[i21] & 255;
                    int i23 = i22 * ((~i22) & 65536);
                    int i24 = ~(((467314697 | (~i23)) | i19) - ((i23 & 467314697) | i19));
                    int i25 = (i4 + 1) - (i4 & 1);
                    int i26 = bArr4[i25] & 255;
                    int i27 = i26 * ((~i26) & 256);
                    int i28 = ~((i24 | ((~i27) | 1328859631)) - ((i27 & 1328859631) | i24));
                    int i29 = bArr4[i4] & 255;
                    int iA2 = J.a(i28, i29, 1, ((-1) - i28) | ((-1) - i29));
                    byte b6 = bArr3[i18];
                    int i30 = ((b6 & 16777216) * (b6 | 16777216)) + (((-16777217) & b6) * ((~b6) & 16777216));
                    int i31 = bArr3[i21] & 255;
                    int i32 = i31 * ((~i31) & 65536);
                    int iA3 = K.a((~i30) & 1647046022 & i32, i32, i30, (1647046022 | i30) & i32);
                    int i33 = bArr3[i25] & 255;
                    int i34 = i33 * ((~i33) & 256);
                    int i35 = ~((iA3 | ((~i34) | (-2059442874))) - (((-2059442874) & i34) | iA3));
                    int i36 = bArr3[i4] & 255;
                    int iA4 = J.a(i35, i36, 1, ((-1) - i35) | ((-1) - i36));
                    int i37 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i38 = (i37 + iA4) - ((i37 & iA4) * 2);
                    bArr3[i4] = (byte) i38;
                    bArr3[i25] = (byte) (i38 >>> 8);
                    bArr3[i21] = (byte) (i38 >>> 16);
                    bArr3[i18] = (byte) (i38 >>> 24);
                    i4 = (-11) - (((-15) - i4) | i20);
                    int length9 = bArr3.length;
                    int iA5 = C0001a.a(bArr3.length, 4, 0, 0);
                    int i39 = ((i4 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i4 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i2 = i39 != 0 ? -897645243 : 1251644638;
                    if (i39 != 0) {
                        i2 = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i40 = 0 - length;
                    i2 = (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i3 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i41 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i9 = i41 != 0 ? 2100390411 : -897645243;
                    if (i41 == 0) {
                        i = -2079636786;
                        i2 = i;
                    } else {
                        i2 = i9;
                    }
                    break;
                default:
                    i2 = -897645243;
                    break;
            }
            return;
        }
    }

    @Override // com.aheaditec.talsec.security.AbstractC0062z
    public boolean f() throws KeyStoreException, NullPointerException {
        if (!this.f.containsAlias(this.e.b())) {
            return false;
        }
        try {
            return this.f.getEntry(this.e.b(), null).getClass() == KeyStore.SecretKeyEntry.class;
        } catch (NullPointerException e) {
            byte[] bArr = {-40, -62, -89, -97, -70, 96, 11, -89, 54, 55, -29, -84, -109, 58, -18, -119, 73, -113, -126, 41, 39, -88, 47, 70, 112, 123, -84, -118, 101, 85, 62, 15, -36, 97, -49, -26, -81, 53, 68, 4, -108, -52, 112, -118, -115, -114, -32};
            c(bArr, new byte[]{-111, -84, -45, -6, -56, 14, 106, -53, 22, 94, -112, -33, -26, 95, -50, -32, 39, -81, -10, 65, 66, -120, 68, 35, 9, 8, -40, -27, 23, 48, 30, 109, -75, 15, -85, -125, -35, 21, 32, 97, -32, -87, 19, -2, -24, -22, -50});
            throw new KeyStoreException(new String(bArr, StandardCharsets.UTF_8).intern(), e);
        } catch (UnsupportedOperationException | NoSuchAlgorithmException | UnrecoverableEntryException unused) {
            byte[] bArr2 = {-75, -43, 91, 25, 67, 28, -24, 60, -101, 62, -22, -46, -72, -23, 16, -77, 29, 103, 74, -79, -31, 115, -25, 38, -83, 24, -40, 75, 85, 29, 94, -10, 41, 97, -38, 88, -68, 93, 21, 15, 40, 36, 2, -7, 82, 48, -29, 104, 121, 125, 21, -17, -128, 43, -68, -55, -123};
            c(bArr2, new byte[]{-16, -89, 41, 118, 49, 60, -121, 95, -8, 75, -104, -96, -35, -115, 48, -60, 117, 14, 38, -44, -63, 16, -113, 67, -50, 115, -79, 37, 50, 61, 55, -112, 9, 10, -65, 33, -49, 41, 122, 125, 77, 4, 97, -106, 60, 68, -126, 1, 23, 14, 53, -118, -18, 95, -50, -80, -85});
            throw new KeyStoreException(new String(bArr2, StandardCharsets.UTF_8).intern());
        }
    }
}
