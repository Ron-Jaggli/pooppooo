package com.aheaditec.talsec.security;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.util.Date;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0062z implements InterfaceC0060y {
    public static final String c;
    public final a a;
    public final KeyStore b;

    /* JADX INFO: renamed from: com.aheaditec.talsec.security.z$a */
    public static class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    static {
        byte[] bArr = {67, -60, -107, -110, -61, 107, -49, -118, -27, -61, 106, -48, 40, 110, -79};
        a(bArr, new byte[]{2, -86, -15, -32, -84, 2, -85, -63, -128, -70, 57, -92, 71, 28, -44});
        c = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public AbstractC0062z(a aVar, KeyStore keyStore) {
        this.a = aVar;
        if (a(keyStore)) {
            this.b = keyStore;
        } else {
            byte[] bArr = {-73, 45, 113, -70, 26, -123, -79, 28, -60, -104, 62, -9, 86, 42, -126, 94, -59, -15, 58, -39, -54, 25, -96, -37, -61, -125, -79};
            a(bArr, new byte[]{-25, 76, 2, -55, 127, -31, -111, 105, -86, -21, 75, -121, 38, 69, -16, 42, -96, -107, 26, -78, -81, 96, -45, -81, -84, -15, -44});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
    }

    public final C0031j1 a(String str, Exception exc) {
        return new C0031j1(C0031j1.b, str, exc);
    }

    public abstract Key a(KeyStore.Entry entry);

    public abstract KeyStore.Entry a(Date date) throws C0031j1;

    public C0031j1 b(Exception exc) {
        byte[] bArr = {-113, 75, 84, -115, 71, 102, -122, -67, -51, -63, -113, 23, -24, 53, 58, -13, -51, -91, -56, -18, 99, -12, 60, 75, 3, 2, 68, -94, -67, -71, 100, -67, 32, -28, -26, -80, -28, -49, 2, -57, 89, -36, 11, 11, 32, -72, 110, 101, 80, -126, -21, 52, -103, 44};
        a(bArr, new byte[]{-54, 57, 38, -30, 53, 70, -23, -34, -82, -76, -3, 101, -115, 81, 26, -124, -91, -52, -92, -117, 67, -122, 89, 63, 113, 107, 33, -44, -44, -41, 3, -99, 75, -127, -97, -112, -115, -95, 100, -88, 121, -70, 121, 100, 77, -104, 5, 0, 41, -15, -97, 91, -21, 73});
        return new C0031j1(C0031j1.c, new String(bArr, StandardCharsets.UTF_8).intern(), exc);
    }

    public abstract KeyStore.ProtectionParameter b(Date date) throws C0031j1;

    public abstract void b(Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException;

    @Override // com.aheaditec.talsec.security.InterfaceC0060y
    public boolean c() throws C0031j1 {
        return e();
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0060y
    public Key d() throws C0031j1 {
        if (!e()) {
            throw a((Exception) null);
        }
        Key keyA = a(i());
        a(keyA);
        return keyA;
    }

    public final boolean e() throws C0031j1 {
        try {
            return f();
        } catch (NullPointerException e) {
            byte[] bArr = {57, -19, 83, -51, 121, 74, 60, 43, 37, 72, -90, 60, 73, 124, 63, 29, 35, -21, -89, -19, -21, 24, -21, -20, -121, 127, 95, -77, 116, 40, 85, -102, -95, 16, -118, -46, -122, -7, -75, 78, -66, -84, 46, 99};
            a(bArr, new byte[]{124, -97, 33, -94, 11, 106, 83, 72, 70, 61, -44, 78, 44, 24, 31, 106, 75, -126, -53, -120, -53, 123, -125, -119, -28, 20, 54, -35, 19, 8, 62, -1, -40, 99, -2, -67, -12, -100, -107, 47, -46, -59, 79, 16});
            throw new C0031j1(C0031j1.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        } catch (KeyStoreException e2) {
            byte[] bArr2 = {-33, -3, -93, 41, 35, 104, -44, 113, -80, -58, -49, 61, 82, 68, 115, -127, -68, -49, -67, -29, 61, -49, -67, -74, 23, -77, 81, -67, 2, 50, 79, -11, 70, -97, -66, 57, -36, -83, 87, 15, 119, -8, -63, -63, 10, -102, 52, 79, 84, 15};
            a(bArr2, new byte[]{-102, -113, -47, 70, 81, 72, -69, 18, -45, -77, -67, 79, 55, 32, 83, -10, -44, -90, -47, -122, 29, -67, -40, -62, 101, -38, 52, -53, 107, 92, 40, -43, 34, -2, -54, 88, -4, -53, 37, 96, 26, -40, -86, -92, 115, -23, 64, 32, 38, 106});
            throw new C0031j1(C0031j1.b, new String(bArr2, StandardCharsets.UTF_8).intern(), e2);
        }
    }

    public boolean f() throws KeyStoreException, NullPointerException {
        return this.b.containsAlias(this.a.b()) && this.b.entryInstanceOf(this.a.b(), KeyStore.SecretKeyEntry.class);
    }

    public abstract Class<? extends KeyStore.Entry> g();

    public C0031j1 h() {
        return new C0031j1(C0031j1.f, null);
    }

    public KeyStore.Entry i() throws C0031j1 {
        try {
            return j();
        } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
            byte[] bArr = {-25, 95, 78, -47, 63, 27, 16, 26, -1, 127, -92, 109, -95, -79, -38, 3, 115, 30, 24, -118, -65, 33, -84, 57, -4, 51, 67, -20, 106, -78, -57, -107, 56, -43, -57, 85, -66, -70, 59, 107, 6, 79, -115, 100, 119, -14, -22, -108, -83, -6};
            a(bArr, new byte[]{-94, 45, 60, -66, 77, 59, 127, 121, -100, 10, -42, 31, -60, -43, -6, 116, 27, 119, 116, -17, -97, 83, -55, 77, -114, 90, 38, -102, 3, -36, -96, -75, 92, -76, -77, 52, -98, -36, 73, 4, 107, 111, -26, 1, 14, -127, -98, -5, -33, -97});
            throw new C0031j1(C0031j1.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public KeyStore.Entry j() throws C0031j1, UnsupportedOperationException, NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        KeyStore.Entry entry = this.b.getEntry(this.a.b(), null);
        if (entry != null) {
            return entry;
        }
        throw a((Exception) null);
    }

    public final void k() throws KeyStoreException {
        this.b.deleteEntry(this.a.b());
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0060y
    public void remove() throws C0031j1 {
        try {
            this.b.deleteEntry(this.a.b());
        } catch (KeyStoreException e) {
            byte[] bArr = {98, -117, 126, -86, -80, 48, -21, 92, -35, 123, 37, 9, 37, 12, 4, -80, 83, -25, 122, 45, 99, 11, -6, -103, -22, -99, -87, 40, 2, -112, -95, -4, -24, 2, 58, 114, 110, -22, -31, -59, -84, 75, -61, 60, 53, -108, -86, 47};
            a(bArr, new byte[]{39, -7, 12, -59, -62, 16, -124, 63, -66, 14, 87, 123, 64, 104, 36, -57, 59, -114, 22, 72, 67, 121, -97, -12, -123, -21, -64, 70, 101, -80, -59, -99, -100, 99, 26, 20, 28, -123, -116, -27, -57, 46, -70, 79, 65, -5, -40, 74});
            throw new C0031j1(C0031j1.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public C0031j1 a(Exception exc) {
        byte[] bArr = {-81, -119, 31, 1, -124, 106, 42, 69, 50, -95, -7, -114, -56, 25, 123, -110, 65, 33, 29, 14, 127, -76, 105, 82, 37, -103, -66, -65, 7, -75, -76, 70, 99, 81, 78, -39, 25, 42, -97, 81, 112, -74, 24, -4, 11, 116, 95, -9, 50, 47};
        a(bArr, new byte[]{-22, -5, 109, 110, -10, 74, 69, 38, 81, -44, -117, -4, -83, 125, 91, -27, 41, 72, 113, 107, 95, -58, 12, 38, 87, -16, -37, -55, 110, -37, -45, 102, 7, 48, 58, -72, 57, 76, -19, 62, 29, -106, 115, -103, 114, 7, 43, -104, 64, 74});
        return new C0031j1(C0031j1.e, new String(bArr, StandardCharsets.UTF_8).intern(), exc);
    }

    public final boolean a(KeyStore keyStore) {
        byte[] bArr = {-46, -65, 35, 19, 125, -32, -23, -55, 6, 42, -67, -65, 69, 88, -73};
        a(bArr, new byte[]{-109, -47, 71, 97, 18, -119, -115, -126, 99, 83, -18, -53, 42, 42, -46});
        return new String(bArr, StandardCharsets.UTF_8).intern().equals(keyStore.getProvider().getName());
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0060y
    public void a() throws C0031j1 {
        Date date = new Date();
        a(a(date), b(date));
    }

    public final void a(KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws C0031j1 {
        try {
            this.b.setEntry(this.a.b(), entry, protectionParameter);
        } catch (KeyStoreException e) {
            byte[] bArr = {-32, 39, 46, -36, 41, 14, -63, 121, -87, -2, -126, 3, 81, 112, 13, 104, -17, 87, 58, -39, 91, 71, -103, 42, 118, 91, -110, -38, -56, 101, -94, -22, 103, -120, 27, -82, 12, 117, 55, -92, 66, -101, 77, 75, -101};
            a(bArr, new byte[]{-91, 85, 92, -77, 91, 46, -82, 26, -54, -117, -16, 113, 52, 20, 45, 31, -121, 62, 86, -68, 123, 52, -19, 69, 4, 50, -4, -67, -24, 1, -61, -98, 6, -88, 111, -63, 44, 30, 82, -35, 49, -17, 34, 57, -2});
            throw new C0031j1(C0031j1.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public final void a(Key key) throws C0031j1 {
        try {
            b(key);
        } catch (InvalidKeyException e) {
            if (e instanceof UserNotAuthenticatedException) {
                return;
            }
            if (e instanceof KeyPermanentlyInvalidatedException) {
                throw h();
            }
            byte[] bArr = {-58, 92, 102, -57, 35, 56, 114, 43, -121, 123, -102, 9, -26, 17, -30, 77, -97, -69, 64, 1, 18, 54, 74, -15, -92, -85, -21, -83, 46, -35, -111, -94, 48, 113, 93, -106, -92, -69, 74, 113, -98, 29, 28, -44, -40, 14, -109, -66, -36, 53};
            a(bArr, new byte[]{-125, 46, 20, -88, 81, 24, 29, 72, -28, 14, -24, 123, -125, 117, -62, 58, -9, -46, 44, 100, 50, 64, 43, -99, -51, -49, -118, -39, 71, -77, -10, -126, 84, 16, 41, -9, -124, -35, 37, 3, -13, 61, 119, -79, -95, 125, -25, -47, -82, 80});
            throw new C0031j1(C0031j1.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw b(e2);
        }
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
