package com.aheaditec.talsec.security;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.util.Base64;
import com.aheaditec.talsec.security.AbstractC0017f;
import com.aheaditec.talsec.security.t1;
import com.aheaditec.talsec_security.security.Natives;
import com.aheaditec.talsec_security.security.api.MemoryRewrite;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.random.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class D1 extends AbstractC0052u {
    public final F q;
    public final InterfaceC0047r0 r;

    public D1(R0 r0, u1 u1Var, E1 e1, F f, InterfaceC0047r0 interfaceC0047r0) {
        super(r0, u1Var, e1);
        this.q = f;
        this.r = interfaceC0047r0;
    }

    public final boolean a(List<String> list) {
        for (String str : list) {
            for (String str2 : this.q.a()) {
                if (str.equals(str2)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0052u, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean b() {
        return true;
    }

    public final boolean b(List<String> list) {
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            for (String str : this.q.a()) {
                if (next.equals(str)) {
                    return true;
                }
            }
        }
    }

    public final boolean c(Context context) {
        String message;
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrN = Natives.a.n(a(context.getPackageResourcePath(), bFirst, bFirst2), bFirst, bFirst2);
        byte[] bArr = {92, -107, 83, 119, 122, 93, -56, 39, -54, 88, 72, -51, -51, -85, -60, 90, 119, -73, 59, 88, -59};
        c(bArr, new byte[]{40, 45, 33, 45, -6, 61, -88, 93, -126, 97, 25, -68, -107, 15, -100, 65, -5, 35, 69, 77, -87});
        Charset charset = StandardCharsets.UTF_8;
        Integer numD = d(bArrN, bFirst, bFirst2, new String(bArr, charset).intern());
        if (numD == null) {
            return false;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(numD.intValue());
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(parcelFileDescriptorAdoptFd.getFileDescriptor()));
                try {
                    byte[] bArr2 = {26, -126, 92, -45, 3, -6, -37, -15, 26, 3, -53, 46, -64, -121, 5, -85, 10, 86, 61, 27, 113, 8, 126, -94, 116, 95, -87};
                    c(bArr2, new byte[]{27, -1, 3, -96, 43, 7, 125, -40, 69, 92, -49, 29, -46, 11, 22, -100, 65, 53, 102, -128, 30, -117, 41, -9, 49, 28, -128});
                    new String(bArr2, charset).intern();
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            zipInputStream.close();
                            parcelFileDescriptorAdoptFd.close();
                            byte[] bArr3 = {-70, 113, -95, -57, 84, -88, 81, 92, -80, -53, 89, 17, 45, -117, -32, 13, -51};
                            c(bArr3, new byte[]{-62, 73, -82, -67, 40, 43, 18, 88, -52, -46, 40, -104, 53, 47, -128, -104, -88});
                            Charset charset2 = StandardCharsets.UTF_8;
                            String strIntern = new String(bArr3, charset2).intern();
                            byte[] bArr4 = {-2, -10, 35, -121, -78};
                            c(bArr4, new byte[]{-127, -57, 57, 13, -41, -11, -102, -94});
                            b(strIntern, new String(bArr4, charset2).intern());
                            return false;
                        }
                        String name = nextEntry.getName();
                        byte[] bArr5 = {-112, -54, -116, -24, 6, 120, -41, -45, -56, -94, 88, -8, 58, -9, 72, 16, 117, 82, -58, -103, 96, 25, 49, -24, 58, 89, 76};
                        c(bArr5, new byte[]{-95, -73, -77, -43, 48, -123, -120, -74, 119, -67, 96, -21, -4, -38, 80, 81, 16, 49, 113, -2, 13, 122, 90, -83, 127, 26, 101});
                        Charset charset3 = StandardCharsets.UTF_8;
                        if (name.matches(new String(bArr5, charset3).intern())) {
                            byte[] bArr6 = {78, -122, 42, 80};
                            c(bArr6, new byte[]{-1, -30, 4, -126, 65, 61, 34, -35});
                            String str = new String(Base64.encode(a(((X509Certificate) CertificateFactory.getInstance(new String(bArr6, charset3).intern()).generateCertificate(zipInputStream)).getEncoded()), 2), charset3);
                            for (String str2 : this.q.a()) {
                                if (str2.equals(str)) {
                                    zipInputStream.close();
                                    parcelFileDescriptorAdoptFd.close();
                                    return true;
                                }
                            }
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            byte[] bArr7 = {-116, -38, -58, 37, 80, -54, -53, 12, 116, 47, 123, 10, -122, 102, 58, -67, 30, -24, 9, -65, 55, -95};
            c(bArr7, new byte[]{-40, -30, -115, 95, 36, -55, -89, -120, 16, 118, 6, 125, -48, 66, 57, -24, 100, -35, 101, -26, 88, -45});
            Charset charset4 = StandardCharsets.UTF_8;
            String strIntern2 = new String(bArr7, charset4).intern();
            if (e.getMessage() == null) {
                byte[] bArr8 = {49, 98, -45, 29};
                c(bArr8, new byte[]{72, 71, -87, -118, 111, 31, -53, -74});
                message = new String(bArr8, charset4).intern();
            } else {
                message = e.getMessage();
            }
            b(strIntern2, message);
            return false;
        }
    }

    public final int d(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {26, 101, -80, -1, -106, 46, 61, -96, 82, 0, 64, -106, -1, 110, 27, -60, -69, 110, -92, 93, 5, 61, -63};
            c(bArr, new byte[]{92, 59, -83, -92, -32, 114, 59, 24, 37, -97, 24, -30, 123, 63, 83, -56, -57, 74, -27, 85, 117, 77, -78});
            return Settings.Secure.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final Signature[] e(Context context) {
        try {
            return f(context);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Signature[0];
        }
    }

    public final Signature[] f(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfoA = a(context, 64);
        if (packageInfoA == null) {
            return new Signature[0];
        }
        Signature[] signatureArr = packageInfoA.signatures;
        return signatureArr != null ? signatureArr : new Signature[0];
    }

    public final boolean g(Context context) {
        return a(e(context));
    }

    public final boolean h(Context context) {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrJ = Natives.a.j(context, a(this.q.a(), bFirst, bFirst2), bFirst, bFirst2);
        byte[] bArr = {-24, -93, -39, 45, -70, 50, 29, -64, 36, 113, -121, -60, 31, -96, 49, 57, -66, -113, -111, 3, 79, 122, 113, 84, -35, -68, 87, -91, -3, 97, -116, -73, -86, -23, -22};
        c(bArr, new byte[]{105, -14, -108, 125, -67, 116, 102, -59, 54, 69, -66, -58, 97, -2, 58, 102, -76, 45, -33, 96, 15, 77, -2, 63, -110, 34, 33, -22, 125, 71, -45, 13, -53, -123, -122});
        Charset charset = StandardCharsets.UTF_8;
        Pair<String, X509Certificate> pairC = c(bArrJ, bFirst, bFirst2, new String(bArr, charset).intern());
        if (pairC == null) {
            return false;
        }
        if (pairC.component1() != null) {
            byte[] bArr2 = {-10, -60, -87, -87, 96, -73, 6, 48, -22, 126, -50, -63, 52, -22, -78, 54, -38, -108, 39, -20, -114, 110, -110, 28, -59, -18, -103, 15, -75, -118, 116};
            c(bArr2, new byte[]{-121, -43, -60, -7, -9, -16, 81, 117, 108, 74, -121, -63, 60, -76, -67, 91, -104, 22, 45, -63, -48, 57, -31, -120, -102, -48, -30, -108, -36, -4, 17});
            c(new String(bArr2, charset).intern(), (String) pairC.component1());
        }
        if (pairC.component2() != null) {
            byte[] bArr3 = {-23, -3, 103, -79, 6, 8, -86, -39, 53, -22, 36, 32, -89, 119, 69};
            c(bArr3, new byte[]{115, -56, -1, -35, 88, -98, -83, -45, 61, -50, 43, -126, -55, 17, 42});
            a(new String(bArr3, charset).intern(), (X509Certificate) pairC.component2());
        }
        return true;
    }

    public final boolean i(Context context) {
        return d(context) == 1;
    }

    public final boolean j(Context context) {
        return a(context, context.getPackageName());
    }

    public final boolean k(Context context) {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrH = Natives.a.h(context, a(this.q.b(), bFirst, bFirst2), bFirst, bFirst2);
        byte[] bArr = {9, -93, 72, -57, 73, 14, -26, -124, 40, 73, -101, -12, 0, 127, -36, 86, 40, 80, 115, 103, -25, -11, 120, 61, 7, 124, -58, -59, 12, 93};
        c(bArr, new byte[]{73, -3, 21, -63, 36, -84, 109, 0, 69, 73, -28, -80, 84, 78, -91, 76, 79, 97, 8, 27, -110, -60, -10, 108, 90, 73, 111, -67, 96, 49});
        Charset charset = StandardCharsets.UTF_8;
        String strF = f(bArrH, bFirst, bFirst2, new String(bArr, charset).intern());
        if (strF == null) {
            return false;
        }
        byte[] bArr2 = {-10, -32, 107, -59, 2, -30, 52, 0, -84, -108, 88, -124, -91, 125, -60, -110, 57, -39, -83, -30, 91, 118, -44, -78, 44, -94};
        c(bArr2, new byte[]{-120, -66, -14, -62, 89, -64, 59, 124, -63, -12, 35, 0, -73, 76, -115, 16, 96, -24, -86, -96, -2, 70, -118, -12, 90, -57});
        c(new String(bArr2, charset).intern(), strF);
        return true;
    }

    public final boolean l(Context context) {
        return false;
    }

    public final boolean m(Context context) throws PackageManager.NameNotFoundException {
        SigningInfo signingInfo;
        String strIntern;
        String str;
        String message;
        String message2;
        PackageInfo packageInfoA = a(context, 134217728);
        if (packageInfoA == null || (signingInfo = packageInfoA.signingInfo) == null) {
            return true;
        }
        if (signingInfo.hasMultipleSigners()) {
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null && apkContentsSigners.length != 0) {
                try {
                    List<String> listB = b(apkContentsSigners);
                    if (a(listB)) {
                        return true;
                    }
                    byte[] bArr = {53};
                    c(bArr, new byte[]{4, 62, -8, 81, 64, 31, 53, -78});
                    a(new String(bArr, StandardCharsets.UTF_8).intern(), apkContentsSigners, listB);
                    return false;
                } catch (Y e) {
                    byte[] bArr2 = {124, -112, 94, -80, -87, -20, 84, -58, -7, -10, 21, -85, 114, -30, 31, 70, 27, 20, -118, 6, -78, 102};
                    c(bArr2, new byte[]{6, 16, 25, 18, -80, -56, 27, -70, 116, -49, 75, -21, 26, -70, 100, 62, 89, -127, -30, -115, -35, 20});
                    Charset charset = StandardCharsets.UTF_8;
                    String strIntern2 = new String(bArr2, charset).intern();
                    if (e.getMessage() == null) {
                        byte[] bArr3 = {61, -21, -64, -42};
                        c(bArr3, new byte[]{60, -50, -106, -45, -62, 126, 8, -109});
                        message2 = new String(bArr3, charset).intern();
                    } else {
                        message2 = e.getMessage();
                    }
                    b(strIntern2, message2);
                    return false;
                }
            }
            byte[] bArr4 = {36, 114, -56, 6, 111, -125, 123, 42, 15, 107, -112, -6, -53, 11, 9, -18, -18, 84, -118, 111, 124, -13};
            c(bArr4, new byte[]{46, 50, -94, 104, -22, 38, 9, 102, 102, 50, -50, -100, 113, -109, 86, -90, 110, 65, -30, 54, 19, -127});
            Charset charset2 = StandardCharsets.UTF_8;
            strIntern = new String(bArr4, charset2).intern();
            byte[] bArr5 = {-36, -16, 30, -82, 9, 91, -116, -3, 55, 78, -31, 120, -6, -55, -45, 105, -11, -126, 28, 2, 106, -25, 11, -126, 101, -16, -40, -55, 124, 91, 13, -63, 53, -83, 75, -63};
            c(bArr5, new byte[]{114, -50, 105, -27, 78, 110, -106, -94, 65, -98, 125, 54, 119, -21, -92, 37, 108, 23, 39, -120, 8, -69, 105, 4, -2, -53, -89, 2, -8, 97, 84, -56, 57, 15, 35, 8});
            str = new String(bArr5, charset2);
        } else {
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory != null && signingCertificateHistory.length != 0) {
                try {
                    List<String> listB2 = b(signingCertificateHistory);
                    if (b(listB2)) {
                        return true;
                    }
                    byte[] bArr6 = {70};
                    c(bArr6, new byte[]{116, -3, 73, 61, 67, 49, -115, 91});
                    a(new String(bArr6, StandardCharsets.UTF_8).intern(), signingCertificateHistory, listB2);
                    return false;
                } catch (Y e2) {
                    byte[] bArr7 = {-75, -128, -2, -19, 4, 95, -45, -70, -22, -16, 47, 96, -58, -63, -104, -110, 77, 101, -72, -22, -104, 31};
                    c(bArr7, new byte[]{-67, 32, 121, -67, 83, 91, -96, -10, -127, -55, 69, 50, 110, -39, -25, 10, 15, 80, -76, -79, -9, 109});
                    Charset charset3 = StandardCharsets.UTF_8;
                    String strIntern3 = new String(bArr7, charset3).intern();
                    if (e2.getMessage() == null) {
                        byte[] bArr8 = {67, -25, 71, -42};
                        c(bArr8, new byte[]{22, -62, 21, -45, -110, 115, 65, 35});
                        message = new String(bArr8, charset3).intern();
                    } else {
                        message = e2.getMessage();
                    }
                    b(strIntern3, message);
                    return false;
                }
            }
            byte[] bArr9 = {116, 21, 110, -119, -128, 11, -20, 2, 2, -25, -4, 72, -72, 125, -4, 107, 66, -24, -23, 14, 0, -81};
            c(bArr9, new byte[]{-2, -108, 8, -39, -41, -81, 115, 126, 89, -66, 114, 74, -28, 69, -125, 33, 18, -35, -123, -107, 111, -35});
            Charset charset4 = StandardCharsets.UTF_8;
            strIntern = new String(bArr9, charset4).intern();
            byte[] bArr10 = {70, 43, -75, -12, -84, -75, -45, 13, -69, 108, -20, -40, 7, 46, 81, 10, -28, 45, 50, -19, 91, -27, -45, 21, -3, -103, -69, 83, 126, -70, -72, -71, 106, 29, -103, 27, 61, -61, 100};
            c(bArr10, new byte[]{-4, 116, -66, -81, -87, 0, -34, -110, -67, 124, -120, -42, 92, -116, 34, -120, 123, 120, -4, -90, 39, -57, -111, -107, -124, 32, -61, 75, -13, 14, -125, -22, -20, -99, -41, -115, 79, -70, 74});
            str = new String(bArr10, charset4);
        }
        b(strIntern, str.intern());
        return false;
    }

    public final boolean n(Context context) throws PackageManager.NameNotFoundException {
        String message;
        PackageInfo packageInfoA = a(context, 64);
        if (packageInfoA == null) {
            return true;
        }
        Signature[] signatureArr = packageInfoA.signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            byte[] bArr = {-71, 99, 106, -8, 38, -18, -35, 51, 86, 43, 18, -31, -92, 38, 110, 124, -27, -23, -78, -19, 92, 117};
            c(bArr, new byte[]{-63, 67, 4, -54, 49, -54, -94, 109, 13, 114, 80, -79, -48, 126, -11, 55, 119, -36, -86, -72, 51, 7});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-63, 67, 32, 105, -21, 38, 47, -109, -81, 107, -50, -40, -68, 39, -48, -115, 57, -119, 111, -31, -74, -62, 33, -112, 21, -10, -113, 123, -116};
            c(bArr2, new byte[]{125, 93, 43, 36, 112, 115, -7, -1, -87, 123, -90, -42, -79, -123, -93, 1, 56, 28, 58, -85, -56, -43, 57, 10, 74, -77, -25, 55, -94});
            b(strIntern, new String(bArr2, charset).intern());
            return false;
        }
        try {
            List<String> listB = b(signatureArr);
            if (a(listB)) {
                return true;
            }
            a("", signatureArr, listB);
            return false;
        } catch (Y e) {
            byte[] bArr3 = {-81, 64, -121, 89, -64, -16, 28, -109, 58, 50, -73, 127, -2, -10, -119, 68, 75, 105, -71, -48, 24, 91};
            c(bArr3, new byte[]{-73, 96, -31, 41, -105, -76, 99, 13, 49, -117, -83, 31, -90, -50, -42, 64, 9, 92, -75, -69, 119, 41});
            Charset charset2 = StandardCharsets.UTF_8;
            String strIntern2 = new String(bArr3, charset2).intern();
            if (e.getMessage() == null) {
                byte[] bArr4 = {-14, -45, -48, 116};
                c(bArr4, new byte[]{-123, -42, -90, 49, 125, -25, 46, 80});
                message = new String(bArr4, charset2).intern();
            } else {
                message = e.getMessage();
            }
            b(strIntern2, message);
            return false;
        }
    }

    public final X o(Context context) {
        this.l.a(t1.a.g, l(context));
        boolean zA = a(e(context));
        this.l.a(t1.a.h, zA);
        boolean zA2 = zA | a(context, context.getPackageName());
        boolean zK = k(context) | h(context);
        this.r.getClass();
        return new X(!zA2, !zK, !b(context));
    }

    public void p(final Context context) {
        a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.D1$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.o(context);
            }
        }));
    }

    public final boolean a(Context context, String str) {
        for (String str2 : this.q.b()) {
            if (str2.equals(str)) {
                return false;
            }
        }
        byte[] bArr = {-27, 93, 57, 98, 80, 115, 104, -108, 36, -53, -65, 15, -53, -125, 34, 121, -8, -42, 68, 80};
        c(bArr, new byte[]{117, 99, 68, 38, 11, 49, -9, 15, 57, -53, -56, -123, -119, 18, 48, 53, -97, -25, 19, 78});
        c(new String(bArr, StandardCharsets.UTF_8).intern(), context.getPackageName());
        return true;
    }

    public final boolean b(Context context) {
        String message;
        try {
            return m(context);
        } catch (PackageManager.NameNotFoundException e) {
            byte[] bArr = {-119, 95, -63, 42, 109, -45, 42, -30, 123, 117, -119, -12, 124, 5, -97, -29, -72, 15, 125, -98, -57, 29};
            c(bArr, new byte[]{-47, 95, -101, 124, -20, -42, 57, -98, -14, 75, -25, -90, 40, -99, -28, -103, -68, 122, -7, 4, -88, 111});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            if (e.getMessage() == null) {
                byte[] bArr2 = {-59, -51, 111, 85};
                c(bArr2, new byte[]{-108, -24, -19, 81, -41, -86, -110, -101});
                message = new String(bArr2, charset).intern();
            } else {
                message = e.getMessage();
            }
            this.b(strIntern, message);
            return false;
        }
    }

    public final boolean d(Signature signature) throws Y {
        String strA = a(signature);
        for (String str : this.q.a()) {
            if (str.equals(strA)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        this.r.getClass();
        return false;
    }

    public final boolean a(Signature[] signatureArr) {
        String strIntern;
        String str;
        String message;
        if (signatureArr.length == 0) {
            byte[] bArr = {-27, -65, -13, -42, -36, 58, 88, 99, 100, 119, 107, -88, -34, -86, -46, 61, 119, 50, 43, -52, -54, 122};
            c(bArr, new byte[]{109, -1, 109, -72, -101, 126, 39, 29, -1, 77, 9, -22, -122, -14, -95, 119, 5, -89, 67, -41, -91, 8});
            Charset charset = StandardCharsets.UTF_8;
            strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {81, 63, 15, 92, 111, 8, 30, -60, -16, 2, 55, 22, -114, 76, -60, -126, 101, -31, 17, 123, -112, 78, 74, -54, 82, -75, 54, 111, -12};
            c(bArr2, new byte[]{-19, -128, 88, 87, -20, -100, 40, -55, -120, 82, 47, -116, -29, 110, -105, 0, -4, -77, 27, 33, -30, 89, 14, -60, 15, -16, 46, 35, -38});
            str = new String(bArr2, charset);
        } else {
            if (signatureArr.length == 1) {
                if (c(signatureArr[0])) {
                    return false;
                }
                try {
                    byte[] bArr3 = {-48, -33, 20, 121, 27, 64, 73, 48, 89, -86, -33, 86, 78, 18, 18, 101, 100, -57, 103, 67, 55, 87, -106, 60, 79};
                    c(bArr3, new byte[]{-95, -18, 81, 73, 94, 102, 18, 117, 25, -2, 118, 88, 18, -84, 93, 42, -6, -28, -20, 31, 71, 96, -35, 104, 59});
                    Charset charset2 = StandardCharsets.UTF_8;
                    c(new String(bArr3, charset2).intern(), a(signatureArr[0]));
                    byte[] bArr4 = {54, 58, -12, 30, -101, 69, 39, 60, 86, 107, -17, -51, -66, 55, -20};
                    c(bArr4, new byte[]{62, -113, 112, -125, -37, 83, 56, 120, 32, 79, 116, -99, -48, 81, -125});
                    a(new String(bArr4, charset2).intern(), b(signatureArr[0]));
                } catch (Exception e) {
                    byte[] bArr5 = {58, 77, 71, -91, 37, -76, 76, 51, -80, -22, -95, -67, 47, 43, 57, 48, -126, -25, 36, -13, -104, 9};
                    c(bArr5, new byte[]{68, 109, 33, 5, 52, -16, 19, 109, -85, -77, -65, -35, 85, 115, 70, 108, -46, -46, 64, -102, -9, 123});
                    Charset charset3 = StandardCharsets.UTF_8;
                    String strIntern2 = new String(bArr5, charset3).intern();
                    if (e.getMessage() == null) {
                        byte[] bArr6 = {50, 27, 0, -47};
                        c(bArr6, new byte[]{69, -98, 86, -42, 83, -106, 52, 117});
                        message = new String(bArr6, charset3).intern();
                    } else {
                        message = e.getMessage();
                    }
                    c(strIntern2, message);
                }
                return true;
            }
            byte[] bArr7 = {127, -14, 47, 114, -126, -3, 110, 33, -51, -37, -54, 2, -45, 102, -32, -20, -128, -114, -82, -111, -6};
            c(bArr7, new byte[]{0, -61, 70, 88, -32, -63, 4, 97, -90, -25, -103, 106, -93, 49, 120, -90, -35, 43, -57, 13, -119});
            Charset charset4 = StandardCharsets.UTF_8;
            strIntern = new String(bArr7, charset4).intern();
            byte[] bArr8 = {97, -102, -31, 86};
            c(bArr8, new byte[]{-2, 23, 127, 76, 7, 19, -122, -69});
            str = new String(bArr8, charset4);
        }
        c(strIntern, str.intern());
        return true;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0052u, com.aheaditec.talsec.security.InterfaceC0006b0
    public boolean c() {
        this.m.a().r();
        return false;
    }

    public static X509Certificate b(Signature signature) throws CertificateException {
        byte[] bArr = {68, -7, 104, 117};
        c(bArr, new byte[]{5, -4, 66, 101, -55, 115, -113, 11});
        return (X509Certificate) CertificateFactory.getInstance(new String(bArr, StandardCharsets.UTF_8).intern()).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
    }

    public final PackageInfo a(Context context, int i) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageName == null) {
            return null;
        }
        return packageManager.getPackageInfo(packageName, i);
    }

    public final boolean c(Signature signature) {
        String message;
        try {
            return d(signature);
        } catch (Y e) {
            byte[] bArr = {-57, 25, -67, 103, 76, -75, 112, -69, -55, 125, 81, 91, -13, -11, 28, -5, 58, -33, -70, -25, -123, 19};
            c(bArr, new byte[]{-113, -103, -73, 71, 11, -15, -1, -12, -92, 68, 15, 59, -103, -51, 99, -79, 58, -54, -78, -82, -22, 97});
            String strIntern = new String(bArr, StandardCharsets.UTF_8).intern();
            if (e.getMessage() == null) {
                byte[] bArr2 = {-73, 63, -56, -49};
                c(bArr2, new byte[]{-62, 122, -114, -68, 55, -118, -46, 53});
                message = new String(bArr2, StandardCharsets.UTF_8).intern();
            } else {
                message = e.getMessage();
            }
            this.c(strIntern, message);
            return false;
        }
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

    public final String a(Signature signature) throws Y {
        byte[] bArrA = a(signature.toByteArray());
        String strEncodeToString = Base64.encodeToString(bArrA, 2);
        MemoryRewrite.rewriteWithRandomness(bArrA);
        return strEncodeToString;
    }

    public final List<String> b(Signature[] signatureArr) throws Y {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(a(signature));
        }
        return arrayList;
    }

    public final void a(String str, Signature[] signatureArr, List<String> list) {
        String message;
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = {44, -12, 19, -124, -23, 11, 9, 124, -50, 82, -111, -84, -13, 28, -97, -30, 45, 123, 85, 57, 49, 110, -98, 57, 126, -96};
            c(bArr, new byte[]{46, -54, 79, -2, 110, -110, 87, 72, -112, 101, -23, -26, 112, -103, -41, -96, 82, 66, 28, 117, 43, 74, -68, 105, 13, -44});
            c(sb.append(new String(bArr, StandardCharsets.UTF_8).intern()).append(str).toString(), list);
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(b(signature));
            }
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr2 = {46, 17, 98, 49, -41, 11, -110, 3, 124, 6, 37, -104, -53, 6, -54, -8, -76, 101, 123, -89, 50, -49, -58, -4, -20, 91};
            c(bArr2, new byte[]{48, -81, -2, 104, -92, -110, -32, 89, 2, -92, 59, 10, -106, -97, -109, -78, -87, 48, 28, -30, 61, -48, 116, -82, -97, 47});
            b(sb2.append(new String(bArr2, StandardCharsets.UTF_8).intern()).append(str).toString(), arrayList);
        } catch (Exception e) {
            byte[] bArr3 = {-20, 119, 81, 10, -9, 114, 106, 45, -123, 88, 97, 39, -96, -24, -66, 127, 4, 6, -49, -42, 40, -98};
            c(bArr3, new byte[]{118, 55, 11, 92, -126, 54, -7, 98, -32, 97, -1, 118, -52, -80, -59, 53, 88, 115, -89, -67, 71, -20});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr3, charset).intern();
            if (e.getMessage() == null) {
                byte[] bArr4 = {-72, 46, -22, -111};
                c(bArr4, new byte[]{-65, -117, 112, 22, -108, -16, 121, -112});
                message = new String(bArr4, charset).intern();
            } else {
                message = e.getMessage();
            }
            b(strIntern, message);
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        p(context);
    }

    public static byte[] a(byte[] bArr) throws Y {
        try {
            byte[] bArr2 = {106, -10, 82, 49, 4, -78, 53};
            c(bArr2, new byte[]{34, -18, -3, 52, 54, -121, 3, -10});
            return MessageDigest.getInstance(new String(bArr2, StandardCharsets.UTF_8).intern()).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            byte[] bArr3 = {-74, 62, 29, -17, -71, 68, 80, -48, -41, -41, 13, -12, 16, 81, 42, 21, -66, -71, -69, 26, -88, 117, -99, -80, -16};
            c(bArr3, new byte[]{-36, 124, 89, -103, -76, -108, 17, -47, -89, -21, 82, -19, 97, 96, 67, -106, -64, 7, -57, 83, -75, 68, -45, -22, -34});
            throw new Y(Y.b, new String(bArr3, StandardCharsets.UTF_8).intern(), e);
        }
    }
}
