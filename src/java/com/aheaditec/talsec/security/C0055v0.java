package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.aheaditec.talsec.security.AbstractC0017f;
import com.aheaditec.talsec_security.security.Natives;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.random.Random;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0055v0 extends AbstractC0029j {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final byte[] S;
    public static final byte[] T;
    public static final byte[] U;
    public static final byte[] V;
    public static final byte[] W;
    public static final byte[] X;
    public static final byte[] Y;
    public static final byte[] Z;
    public static final byte[] a0;
    public static final byte[] b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final byte[] z;

    static {
        byte[] bArr = {81, -116, -123, 2, -94, -30, -25, -27};
        c(bArr, new byte[]{120, -115, -53, 25, -87, -94, -26, -118});
        Charset charset = StandardCharsets.UTF_8;
        y = new String(bArr, charset).intern();
        byte[] bArr2 = {109, 85, -82, -118, -74, -48, 96, -54, -82, 100, 56, -122};
        c(bArr2, new byte[]{47, 11, -39, -46, -36, -117, 73, -91, -13, -35, 107, -56});
        x = new String(bArr2, charset).intern();
        byte[] bArr3 = {27, 66, -47, 108, -22, 121, -101, -14, -85, -81, 48};
        c(bArr3, new byte[]{-113, -2, -45, 6, -90, -6, 4, 104, -50, -50, 93});
        w = new String(bArr3, charset).intern();
        byte[] bArr4 = {-48, -111, -8, 23, -32, 64, 19, -51, 84, 119, -108, 2, -72, 117, 4, 104, -2, -27, 93, 127, -93, 10, 48, 18, -11, 23, 18, 60, 54, -97, 109, 20, -17, 25};
        c(bArr4, new byte[]{22, -77, -105, 75, -85, -11, -109, -55, 73, -43, 10, 87, -12, -46, -128, 1, -84, -102, 27, -10, -29, 73, 107, 93, -50, 53, -111, 63, 104, -54, 89, 101, -114, 107});
        v = new String(bArr4, charset).intern();
        byte[] bArr5 = {-7, -71, 120, -101, -3, -46, -63, -13, 11, -14, -6, 15, 67, -100, 45, 59, -37, -72, -120, -71, 3, -79, 36, 55};
        c(bArr5, new byte[]{-89, -102, 54, -46, -87, 113, -70, 126, 116, 103, -98, 99, 65, -61, 89, 97, -60, -87, -9, -68, 121, -93, 94, 57});
        u = new String(bArr5, charset).intern();
        byte[] bArr6 = {-109, 19, 107, -69, -56, -92, 76, -73, -53, -75, 116, 97, 88, -8, -23};
        c(bArr6, new byte[]{7, 76, 36, -65, -70, -78, 84, -67, -67, -96, 25, -11, 42, -109, -102});
        t = new String(bArr6, charset).intern();
        byte[] bArr7 = {-101, -128, 115, -49, 51, -7, -115, 75, 18, 121, -80, -2, -114, -61, 94, 36, -48, 45};
        c(bArr7, new byte[]{15, -71, 44, -109, 111, -121, 2, 39, -110, -33, -22, -102, 2, -120, 76, 50, -76, 94});
        s = new String(bArr7, charset).intern();
        byte[] bArr8 = {122, -109, 83, 18, 95, 93, -60, -82, -38, -48, 81, -122, -89, 68, 105, -78, -75, 21, -15, 10, -48, 100, 96, -11, -35, 57, -38, -25, 33, 104, 102, -55, -29, -98, -31, 58, 42};
        c(bArr8, new byte[]{53, -58, 61, 94, 83, -7, -84, -83, -46, 114, 74, -55, -1, -10, 24, -88, 11, 76, -85, 39, -56, -26, 40, -96, -55, 40, -44, 105, 92, -15, 29, 107, -99, -61, -92, 47, 83});
        r = new String(bArr8, charset).intern();
        byte[] bArr9 = {-39, 96, 94, -45, -66, 72, 84, 114, -55, -94, 74, -54, -45, -29, 21};
        c(bArr9, new byte[]{-47, -40, 80, -105, -20, -21, 53, -6, -63, -103, 52, -97, -78, -128, 112});
        q = new String(bArr9, charset).intern();
        p = "v0";
        z = new byte[]{-41, 9, -18, 78, -123, 19, 114, -84, -61, 106, 51, -76, 124, -95, -106, -58, 119, -28, -114, -98, -58, -91, -118, 116, -92, -54, -66, 72, -115, 27, 71, -94};
        A = new byte[]{-125, 123, -101, 11};
        B = new byte[]{-79, 72, -126, 29, -32};
        C = new byte[]{-77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 29, -54, -71, -54, 41, -31, 119, 34, -48};
        D = new byte[]{-76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5};
        E = new byte[]{-76, 102, -125, 96, -28, 125, 22, -34, -84, 3, 87, -102, 21, -49, -30, -93, 5, -118, -17, -14, -24, -54, -7, 90, -2, -77, -39, 39, -7, 126, 14, -52, -66, 125};
        F = new byte[]{-76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5, -24, -24, -39, 80, -106};
        G = new byte[]{-66, 103, -104, 33, -18, 118, 22};
        H = new byte[]{-77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 44, -44, -91, -51, 45, -23, 89, 53, -53, -77, 110, -117};
        I = new byte[]{-70, 104, -121, 32};
        J = new byte[]{-65, 104, -128, 42, -23, 118, 58, -61, -84, 1, 86, -48, 49, -60, -30, -82, 24, -128};
        K = new byte[]{-113, 121, -127, 61, -32, 119, 48, -34, -86, 14, 84, -47, 82, -53, -9, -76};
        L = new byte[]{-74};
        M = new byte[]{-75};
        N = new byte[]{-76};
        O = new byte[]{-77};
        P = new byte[]{-78};
        Q = new byte[]{-79};
        R = new byte[]{-80};
        S = new byte[]{-65};
        T = new byte[]{-66};
        U = new byte[]{-67};
        V = new byte[]{-69};
        W = new byte[]{-83};
        X = new byte[]{-82};
        Y = new byte[]{-81};
        Z = new byte[]{-92, 125, -113, 60, -15};
        a0 = new byte[]{-92, 125, -127, 62};
        b0 = new byte[]{-70};
        c0 = new byte[]{-71};
        d0 = new byte[]{-72};
    }

    public C0055v0(R0 r0, u1 u1Var, E1 e1) {
        super(r0, u1Var, e1);
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                byte[] bArr = {94, 30, 29, -62, 79, -107, -74, -61, 34, 46, -122};
                c(bArr, new byte[]{84, 66, -120, -104, 65, -106, -40, -104, 71, 79, -21});
                a(new String(bArr, StandardCharsets.UTF_8).intern(), e);
            }
        }
    }

    @Override // com.aheaditec.talsec.security.AbstractC0029j, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean b() {
        return false;
    }

    public final byte[] b(Set<String> set) {
        C0055v0 c0055v0;
        byte[] bArr = B;
        List listAsList = Arrays.asList(a(L), a(N), a(M), a(P), a(O), a(Q), a(R), a(S), a(T), a(U), a(V), a(W), a(X), a(Y), a(Z), a(a0), a(b0), a(c0), a(d0));
        for (String str : set) {
            byte[] bArr2 = {55, 98, 66, 95, -28, 97, 99, 56, -68, -18, 83, 35, -95, 36, -106, -77, -82, -42, -54, 99, 99, -121, 92, -67, -55, 57, -101, 112, -35};
            c(bArr2, new byte[]{107, -35, 68, 88, -100, -39, 27, 64, -17, 87, 61, 45, -39, -38, -9, -71, -39, 117, -59, -25, 83, -60, 79, -59, -45, 27, 8, -20, -92});
            if (str.startsWith(new String(bArr2, StandardCharsets.UTF_8).intern())) {
                try {
                    Class<?> cls = Class.forName(str);
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!listAsList.contains(method.getName()) && Modifier.isNative(method.getModifiers())) {
                            byte[] bArr3 = {51, -40, 47, 102, -27, -105, -18, -78, 118, 101, 22, 45, -72, 88, 30, 33, -88, -83};
                            c(bArr3, new byte[]{103, -128, 96, -20, -91, -87, -91, -83, 54, -29, -120, 71, -12, -4, -117, 53, -52, -34});
                            Charset charset = StandardCharsets.UTF_8;
                            String strIntern = new String(bArr3, charset).intern();
                            StringBuilder sb = new StringBuilder();
                            byte[] bArr4 = {-70, 48, -105, 75, 79, 58, 69, -84, -89, 100, 67, -103, -36, -67, 121, -126, -25, -114, -41, 14, -42, -60, 106};
                            c(bArr4, new byte[]{11, 34, -7, 9, 80, 47, 123, -79, -23, -38, 53, -44, -52, -94, 45, -119, -104, -79, -72, 71, -78, -2, 74});
                            StringBuilder sbAppend = sb.append(new String(bArr4, charset).intern()).append(cls.getCanonicalName());
                            byte[] bArr5 = {-96, -21};
                            c(bArr5, new byte[]{-115, -43, 113, -6, 51, -113, 6, -7});
                            String string = sbAppend.append(new String(bArr5, charset).intern()).append(method.getName()).toString();
                            c0055v0 = this;
                            try {
                                c0055v0.e(strIntern, string);
                                bArr = A;
                            } catch (ClassNotFoundException | NoClassDefFoundError | SecurityException e) {
                                e = e;
                                if (e.getMessage() != null) {
                                    e.getMessage();
                                    byte[] bArr6 = {85, 82, -104, -25, -83, 57, 2, 54, 82, -58, -48, -66, -114, 79, 35, 117, 46, 84};
                                    c(bArr6, new byte[]{77, 10, 19, 108, -35, 71, 121, 41, 82, -128, -53, -38, 2, 12, 97, 1, 74, 39});
                                    c0055v0.a(new String(bArr6, StandardCharsets.UTF_8).intern(), e.getMessage());
                                } else {
                                    byte[] bArr7 = {-125, -120, -76, -63, -41, -23, 124, -87, 74, 12, 95, 0, 121, 88, -78, 74, 53, 1, 104, 20, 5, -60, 82, -107, 58, -71, 95, 46, 86, -7, -31, 104, 126, 102, 104, -25, -58, -2, -54, 33, -115, 118, 89, 59, 76, -61, -51, -59, 124, -110, -74};
                                    c(bArr7, new byte[]{-9, -80, -25, -119, -45, 122, 38, -81, 80, 79, 80, 90, 86, 7, -42, -21, 107, 69, 23, 73, 119, 89, 77, -56, 105, -90, 81, 68, -115, 111, -106, -24, 41, -45, 33, -82, -56, 103, -44, 48, -60, -24, 75, 2, 56, 118, -44, -99, 29, -11, -45});
                                    new String(bArr7, StandardCharsets.UTF_8).intern();
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException | NoClassDefFoundError | SecurityException e2) {
                    e = e2;
                    c0055v0 = this;
                }
            }
        }
        return bArr;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0029j, com.aheaditec.talsec.security.InterfaceC0006b0
    public /* bridge */ /* synthetic */ boolean c() {
        return false;
    }

    public final byte[] c(Set<String> set) {
        byte[] bArr = B;
        byte[] bArrB = b(D);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArrB, charset);
        String str2 = new String(b(K), charset);
        for (String str3 : set) {
            if (str3.contains(str)) {
                byte[] bArr2 = {30, 104, 101, 50, 121, -82, -70, 123, -71, -2, -66, -101, -95, 108, -17, -28, 48, -107, -29, 82, -24, -27, -122, 69, 66, -34, 31, -91, -46, -114, -22, 48, 43, -66, -23, -30, 55};
                c(bArr2, new byte[]{-111, -35, 38, 62, 49, -86, -1, -6, -17, 92, -15, -26, 5, -33, -102, 126, -120, -53, -99, -1, -96, 103, 11, -15, 68, -113, -111, -89, -51, -105, -102, 100, 101, -93, -100, 119, 78});
                Charset charset2 = StandardCharsets.UTF_8;
                String strIntern = new String(bArr2, charset2).intern();
                StringBuilder sb = new StringBuilder();
                byte[] bArr3 = {-127, 86, -32, 21, -19, 45, 11, 80, 32, 91, -6, -13, 13, -97, -123, 78, 54, 5, -117, 118, -34, -114, 49, 113, 1, -65, -80, 46, 120, -58, 67};
                c(bArr3, new byte[]{-23, -13, -105, 77, -80, 47, -128, 11, 92, 75, -97, -126, -125, -67, -10, 17, 45, 58, -1, 3, -46, -67, 91, 56, 126, -96, -37, 39, 28, -4, 99});
                c(strIntern, sb.append(new String(bArr3, charset2).intern()).append(str3).toString());
                bArr = A;
            }
            if (str3.contains(str2)) {
                byte[] bArr4 = {-44, 49, -113, -125, 29, -102, 24, 31, -100, -65, 14, 104, -106, 71, -79, -24, -70, 92, 36, -8, -25, -104, 89, 69, -4, 21, -16, 17, -31, 127, 5, -89, -65, -6, -117, -72, -80};
                c(bArr4, new byte[]{-57, 36, 17, -50, -107, -66, 97, 94, 20, -98, -127, -13, -16, -11, -16, -126, 18, 3, 86, -103, -99, -70, 64, -16, -86, 68, -86, 91, -100, 6, -127, -47, -15, 103, -6, -79, -55});
                Charset charset3 = StandardCharsets.UTF_8;
                String strIntern2 = new String(bArr4, charset3).intern();
                StringBuilder sb2 = new StringBuilder();
                byte[] bArr5 = {-95, 6, -54, 63, -34, -17, 30, 10, -86, 75, -59};
                c(bArr5, new byte[]{16, 71, -69, 51, -46, 91, 84, 39, -21, 25, -27});
                c(strIntern2, sb2.append(new String(bArr5, charset3).intern()).append(str3).toString());
                bArr = A;
            }
        }
        return bArr;
    }

    public void d(final Context context) {
        super.a(a(new AbstractC0017f.a() { // from class: com.aheaditec.talsec.security.v0$$ExternalSyntheticLambda0
            @Override // com.aheaditec.talsec.security.AbstractC0017f.a
            public final X run() {
                return this.f$0.f(context);
            }
        }));
    }

    public final boolean e() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrG = Natives.a.g(bFirst, bFirst2);
        byte[] bArr = {22, -128, -65, -34, 89, -15, 23, 46, 99, 86, 43, -8, 39, 113, 16, 69, 28, 5, 4, 15, 84, -52, 65, 93, -27, -93, 115, 121, 77};
        c(bArr, new byte[]{-114, -62, -16, 127, 66, 104, -119, 54, 70, 15, 95, 113, 93, -45, -114, 7, -122, 17, 119, 98, 72, 127, 75, 31, -104, -80, 40, -4, 33});
        Charset charset = StandardCharsets.UTF_8;
        Boolean boolA = a(bArrG, bFirst, bFirst2, new String(bArr, charset).intern());
        if (boolA == null || !boolA.booleanValue()) {
            return false;
        }
        byte[] bArr2 = {-112, -43, -20, -128, 127, 127, 13, 90, 75, 20, -77, -101, 122, 113, 4, -116, -84, -83, -50, -40, 8, 114, 105, -55, -55};
        c(bArr2, new byte[]{8, 120, -97, -83, 36, -26, 126, 34, 30, 77, -25, -48, 50, -45, -126, -48, -10, -71, -63, -109, -124, -31, 50, -109, -83});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-123, 90, -18, 15};
        c(bArr3, new byte[]{8, -7, -80, 81, 107, -96, 70, 39});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final byte[] f() {
        byte[] bArrB = B;
        try {
            byte[] bArr = A;
            byte b = bArrB[(bArr.length + 1) - (bArrB.length * bArr.length)];
            return new byte[]{b, b, b};
        } catch (Exception e) {
            int i = 0;
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(new String(b(E), StandardCharsets.UTF_8))) {
                    i++;
                    bArrB = a(bArrB, i);
                }
                bArrB = b(c(a(bArrB, stackTraceElement), stackTraceElement), stackTraceElement);
            }
            return bArrB;
        }
    }

    public final byte[] g() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        HashSet hashSet;
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = {86, 0, 28, -127, -31, 60};
            c(bArr, new byte[]{-112, 64, -124, -43, -126, 19, 44, -88});
            Charset charset = StandardCharsets.UTF_8;
            StringBuilder sbAppend = sb.append(new String(bArr, charset).intern()).append(Process.myPid());
            byte[] bArr2 = {-126, 123, 72, -126, 119};
            c(bArr2, new byte[]{-60, -26, 62, -39, 4, 11, -90, -8});
            bufferedReader = new BufferedReader(new FileReader(sbAppend.append(new String(bArr2, charset).intern()).toString()));
            try {
                try {
                    hashSet = new HashSet();
                } catch (Exception e2) {
                    e = e2;
                    byte[] bArr3 = {26, -25, -50, -7, 126, -63, 40, 34, -66, 83, -66, -3, 43, -20, -108, -83, -69, 73, -7, 9, 29, 102, 73, -120, 20, -113, -115, -24, -44, -28, 58, -123, -24, 74, -123, -100, 59};
                    c(bArr3, new byte[]{-107, 82, -48, -125, 52, -123, -111, 49, -10, -15, -16, -128, 123, 94, 20, -58, 17, -8, -78, 42, -109, -28, 79, -85, -110, -66, -1, 116, -57, 125, 106, -81, -92, -9, -1, -43, 66});
                    a(new String(bArr3, StandardCharsets.UTF_8).intern(), e);
                    byte[] bArr4 = B;
                    a(bufferedReader);
                    return bArr4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            bufferedReader = null;
            e = e3;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                byte[] bArrC = c(hashSet);
                a(bufferedReader);
                return bArrC;
            }
            byte[] bArr5 = {59, -127, -61};
            c(bArr5, new byte[]{21, -14, -84, -116, 72, 112, 55, -65});
            Charset charset2 = StandardCharsets.UTF_8;
            if (!line.endsWith(new String(bArr5, charset2).intern())) {
                byte[] bArr6 = {-16, 124, -33, -58};
                c(bArr6, new byte[]{-11, -26, -45, -101, -104, -34, -45, -15});
                if (line.endsWith(new String(bArr6, charset2).intern())) {
                }
            }
            hashSet.add(line.substring(line.lastIndexOf(32) + 1));
            th = th2;
            a(bufferedReader);
            throw th;
        }
    }

    public final boolean h() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrE = Natives.a.e(bFirst, bFirst2);
        byte[] bArr = {56, -105, -84, 25, 73, 13, 41, 19, -116, -40, 88, 100, 88, -119, 2, 67, 83, 120, 116, -114, 26, -63, -92, -106};
        c(bArr, new byte[]{104, -76, 0, 83, 55, 57, 94, 42, 21, -120, 81, -24, 66, -54, 97, 20, 26, -38, 48, -44, 112, 112, -34, -31});
        Charset charset = StandardCharsets.UTF_8;
        Boolean boolA = a(bArrE, bFirst, bFirst2, new String(bArr, charset).intern());
        if (boolA == null || !boolA.booleanValue()) {
            return false;
        }
        byte[] bArr2 = {-104, -5, 32, 112, 12, 123, 60, -97, -2, -51, 0, -8, 68, -52, -50, -19, -118, 118, 32, -9};
        c(bArr2, new byte[]{8, 89, 124, -23, 124, -17, 114, -74, -93, 114, 121, -124, 78, -113, -99, 106, -15, -44, 100, 123});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-59, -115, 10, 109};
        c(bArr3, new byte[]{-56, -49, -107, -17, -106, -12, 26, 12});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean i() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrF = Natives.a.f(bFirst, bFirst2);
        byte[] bArr = {-5, -86, -30, 127, 64, -46, -38, -65, -7, -20, -78, -109, 80, -112, 73, -99, 124, -14, -33, 67, -113, 66, -117, -39, -6, 21};
        c(bArr, new byte[]{-87, -87, -70, -12, 64, -122, -47, -45, -77, 110, -38, -35, 57, -84, 54, -43, 31, 103, -57, 17, -8, -11, -35, -97, -106, 121});
        Charset charset = StandardCharsets.UTF_8;
        Boolean boolA = a(bArrF, bFirst, bFirst2, new String(bArr, charset).intern());
        if (boolA == null || !boolA.booleanValue()) {
            return false;
        }
        byte[] bArr2 = {30, 116, -73, 63, 31, -28, 21, -119, 103, -124, 93, 121, 96, 74, -32, -86, -88, 21, 36, 76, 125, -74};
        c(bArr2, new byte[]{-114, -41, 6, 53, -115, 80, -118, -63, 25, -58, 65, 3, 41, -42, -98, -64, -13, 64, 96, 12, 19, -47});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-122, -112, -93, 58};
        c(bArr3, new byte[]{9, -77, -20, 70, 56, 55, -13, 54});
        c(strIntern, new String(bArr3, charset).intern());
        return true;
    }

    public final boolean j() {
        try {
            ServerSocket serverSocket = new ServerSocket(27042);
            try {
                try {
                    byte[] bArr = {108, 94, 88, -41, 126, 88, 92, -91, 100};
                    c(bArr, new byte[]{23, 1, 81, -99, 41, 0, 73, -67, 16});
                    Socket socket = new Socket(new String(bArr, StandardCharsets.UTF_8).intern(), 27042);
                    try {
                        new ObjectOutputStream(socket.getOutputStream());
                        socket.close();
                        serverSocket.close();
                        return false;
                    } catch (Throwable th) {
                        try {
                            socket.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    byte[] bArr2 = {-4, 27, -101, 124, 24, 28, 85, -70, 107, 91, 119, 63, -87, -111, 100, -77, -77, -106, -108, -103, 82, 110, 50, 86, 17, -51, -15, -74, 42, -111, 76, -69, 75, 119, -88, 114, -49};
                    c(bArr2, new byte[]{-84, 56, -23, -6, -114, 71, 51, -68, 28, 14, 36, 54, -35, -75, 54, -67, -34, -61, 13, -43, 78, -38, -119, 26, -121, -119, -102, -85, 102, -107, 63, -81, 86, -18, -37, -4, -2});
                    Charset charset = StandardCharsets.UTF_8;
                    String strIntern = new String(bArr2, charset).intern();
                    byte[] bArr3 = {-30, 106, 30, -113};
                    c(bArr3, new byte[]{-83, -24, -128, -47, -23, -65, -5, 49});
                    b(strIntern, new String(bArr3, charset).intern());
                    serverSocket.close();
                    return true;
                }
            } catch (Throwable th3) {
                try {
                    serverSocket.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (BindException unused2) {
            byte[] bArr4 = {-6, 105, -93, 102, 71, -58, 33, -107, -101, -98, 65, -94, 13, 30, 62, 50, 101, -9, 120, 104, 78, 17, -2, -103, 17, 64, 23, -104, -36, 87, -86, 34, -106, -76, -21, 60, -117};
            c(bArr4, new byte[]{-86, -22, 0, -15, 63, 125, 127, -31, 12, -52, 78, -71, 121, 58, -112, 62, 40, 98, 49, 3, 66, 69, -50, -29, -121, 4, 120, -47, -48, -45, -28, 56, -7, -83, -101, 66, -71});
            Charset charset2 = StandardCharsets.UTF_8;
            String strIntern2 = new String(bArr4, charset2).intern();
            byte[] bArr5 = {-42, -61, 43, 51};
            c(bArr5, new byte[]{-71, -127, 116, 61, -58, -109, 20, -19});
            b(strIntern2, new String(bArr5, charset2).intern());
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }

    public final boolean k() {
        Random.Default r0 = Random.Default;
        byte bFirst = ArraysKt.first(r0.nextBytes(1));
        byte bFirst2 = ArraysKt.first(r0.nextBytes(1));
        byte[] bArrO = Natives.a.o(bFirst, bFirst2);
        byte[] bArr = {126, -77, 46, 97, 101, 9, 5, -125, 44, 20, -119, -39, -102, 49, -4, -29, 90, 75, 25, 35, 33, 60, 49, 85, 32, 93, 97, -80, 87, 2, -77, -23, 92, 4};
        c(bArr, new byte[]{46, -112, 124, -11, 33, 50, -126, -44, 98, 33, -3, -97, 15, 46, -81, 110, 51, -2, -115, 62, 107, 30, 106, -24, 92, -2, 42, -64, 80, 53, 6, 112, 48, 104});
        int[] iArrE = e(bArrO, bFirst, bFirst2, new String(bArr, StandardCharsets.UTF_8).intern());
        if (iArrE == null || iArrE.length <= 0) {
            return false;
        }
        a(iArrE);
        return true;
    }

    public final boolean l() {
        byte[] bArr = {-47, 84, -104, 2, -100, -43, -81, 120, -49, 63, -28, -62, 66, 30, 65, 18, 98};
        c(bArr, new byte[]{-55, 5, 2, 10, -54, 117, -13, -2, -61, -32, -97, -114, 77, 1, 75, 88, 18});
        Charset charset = StandardCharsets.UTF_8;
        String strB = C1.b(new String(bArr, charset).intern());
        if (strB != null && !strB.isEmpty()) {
            byte[] bArr2 = {-15};
            c(bArr2, new byte[]{-5, 73, -88, 36, -122, -6, 18, -113});
            for (String str : strB.split(new String(bArr2, charset).intern())) {
                String strTrim = str.trim();
                byte[] bArr3 = {95, 11};
                c(bArr3, new byte[]{44, 103, 126, -99, 88, -33, 9, 49});
                Charset charset2 = StandardCharsets.UTF_8;
                if (!strTrim.startsWith(new String(bArr3, charset2).intern()) && !str.trim().isEmpty()) {
                    String strTrim2 = str.trim();
                    byte[] bArr4 = {-55, 92, 32};
                    c(bArr4, new byte[]{-107, 47, 11, -78, 95, -21, 68, 65});
                    String[] strArrSplit = strTrim2.split(new String(bArr4, charset2).intern());
                    if (strArrSplit.length >= 10) {
                        String str2 = strArrSplit[1];
                        byte[] bArr5 = {-16};
                        c(bArr5, new byte[]{-54, 72, -122, 45, 108, -123, 6, 66});
                        String str3 = str2.split(new String(bArr5, charset2).intern())[0];
                        if (str3.isEmpty()) {
                            continue;
                        } else {
                            byte[] bArr6 = {52, 36, 123, 71, 50, 11, -77, -89};
                            c(bArr6, new byte[]{27, -27, 96, 94, 25, 11, -102, -56});
                            if (str3.equalsIgnoreCase(new String(bArr6, charset2).intern())) {
                                byte[] bArr7 = {109, 49, 63, -46, 120, -115, 120, -121, -39, 106, -8, 37, -44, -120, -58, -18, -126, 81, -97, 90, -86, 94, 11, -12};
                                c(bArr7, new byte[]{24, 18, 102, -101, 111, -63, 110, -57, -62, -33, -99, -20, -55, -54, -59, 113, -6, 76, 2, 39, -17, -8, -125, 109});
                                String strB2 = C1.b(new String(bArr7, charset2).intern());
                                if (strB2 != null && !strB2.isEmpty()) {
                                    byte[] bArr8 = {-127, 31, -94, 51, -21, 91, 121, -79, -102, 44, -88, 80, 9, 78, -14, -45, -34, 43};
                                    c(bArr8, new byte[]{9, 77, -39, 68, -60, 4, 33, -34, -1, 21, -30, 24, 113, -5, -107, -116, -69, 89});
                                    String strIntern = new String(bArr8, charset2).intern();
                                    byte[] bArr9 = {38, 125, -16, -118};
                                    c(bArr9, new byte[]{105, -33, -102, -42, 13, 43, 48, 93});
                                    b(strIntern, new String(bArr9, charset2).intern());
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public final Set<String> a(ApplicationInfo applicationInfo) {
        HashSet hashSet = new HashSet();
        try {
            DexFile dexFile = new DexFile(applicationInfo.sourceDir);
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                hashSet.add(enumerationEntries.nextElement());
            }
            dexFile.close();
        } catch (IOException e) {
            byte[] bArr = {-3, 105, -76, -41, 36, 122, -73, 110, 121, -22, 116, -8, 27, 74, -18, 7, 45, -55};
            c(bArr, new byte[]{-75, -47, -26, -101, 102, 4, -20, 1, 39, 108, 39, -100, -107, 14, -100, 79, 73, -70});
            a(new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
        return hashSet;
    }

    public final byte[] b(Context context) {
        String str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return B;
        }
        byte[] bArr = B;
        ArrayList arrayList = new ArrayList(2);
        byte[] bArrB = b(C);
        Charset charset = StandardCharsets.UTF_8;
        arrayList.add(new String(bArrB, charset));
        arrayList.add(new String(b(D), charset));
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo((String) arrayList.get(i), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo((String) arrayList.get(i), 0);
                if (applicationInfo != null) {
                    byte[] bArr2 = {55, -67, 68, -21, -49, -119, 56, 75, 48, 120, -91, -117, 84, -52, 123};
                    c(bArr2, new byte[]{107, -91, 55, 111, -69, -97, 96, 17, 116, -19, -25, -53, 38, -89, 8});
                    Charset charset2 = StandardCharsets.UTF_8;
                    String strIntern = new String(bArr2, charset2).intern();
                    StringBuilder sb = new StringBuilder();
                    if (i == 0) {
                        byte[] bArr3 = {88, -18, -76, -62, -22, -90};
                        c(bArr3, new byte[]{23, 110, -15, -104, -113, -62, -54, -125});
                        str = new String(bArr3, charset2);
                    } else {
                        byte[] bArr4 = {-72, 59, -114, -115, -68, 84, -80, 39, -99};
                        c(bArr4, new byte[]{2, 31, 2, -26, -33, -10, -26, 58, -8});
                        str = new String(bArr4, charset2);
                    }
                    StringBuilder sbAppend = sb.append(str.intern());
                    byte[] bArr5 = {85, 58, 27, -83, -11, -42, 70, -105, 116, -13, 17, 107, -62, -22, -39, -113, 96, 11, -64, -40};
                    c(bArr5, new byte[]{-116, 44, -118, -65, -78, -126, 124, -33, 49, -93, 123, -22, -66, -102, -64, -35, 42, 79, -69, -100});
                    c(strIntern, sbAppend.append(new String(bArr5, charset2).intern()).toString());
                }
                if (applicationInfo != null && arrayList.contains(applicationInfo.packageName)) {
                    bArr = A;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return bArr;
    }

    public final byte[] a(byte[] bArr, StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        byte[] bArrB = b(F);
        Charset charset = StandardCharsets.UTF_8;
        if (!className.equals(new String(bArrB, charset)) || !stackTraceElement.getMethodName().equals(new String(b(G), charset))) {
            return bArr;
        }
        byte[] bArr2 = {35, -88, 71, 99, 34, -127, 95, 12, 67, 50, -30, -99, -104, -18, 9};
        c(bArr2, new byte[]{87, -112, 56, -25, 96, -94, 65, 84, 55, 41, -52, -42, -7, -115, 108});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-124, -14, 12, 2, -10, 62, -31, -45, -33, 104, -34, 49, 5, 98, -109, 97, 87, 37, -99, 101, -117, 49};
        c(bArr3, new byte[]{3, 110, 121, 80, -86, 42, -41, -115, -61, -47, -59, 61, 60, 1, -4, -22, 59, 33, 5, -20, -1, 84});
        c(strIntern, new String(bArr3, charset).intern());
        return A;
    }

    public final byte[] e(Context context) {
        byte[] bArr = B;
        try {
            byte[] bArr2 = {-73, 105, -81, 85, 107, -59, 95, 64, 71, 84, -41, -89, 69, -16, -38, -111, 94, 85, 43, -73, 4, 19, -48, 91, -24, -89, 27, 45, -114, 82, -30, -3, -79, 51};
            c(bArr2, new byte[]{-81, -22, -21, 13, 54, 112, 72, 86, 56, -10, -53, -79, 55, 87, -53, -54, 76, 74, -119, -82, -126, 48, -53, 38, -63, -91, -120, 48, 0, 8, -30, 126, -48, 65});
            Charset charset = StandardCharsets.UTF_8;
            File file = new File(new String(bArr2, charset).intern());
            if (!file.exists()) {
                return bArr;
            }
            byte[] bArr3 = {-16, 127, -23};
            c(bArr3, new byte[]{-108, 26, -111, 4, -96, -115, 97, -22});
            Class clsLoadClass = new DexClassLoader(file.getPath(), context.getDir(new String(bArr3, charset).intern(), 0).getPath(), null, ClassLoader.getSystemClassLoader()).loadClass(new String(b(H), charset));
            byte[] bArr4 = {97, 119, 80, 28, 102, 44, 29, -73, -9, -49, -69, 70, -110, -103, 82, 76};
            c(bArr4, new byte[]{29, -30, 57, 43, 45, 19, -124, -71, -86, 105, -12, 27, -8, -64, 83, 9});
            Method declaredMethod = clsLoadClass.getDeclaredMethod(new String(bArr4, charset).intern(), new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) declaredMethod.invoke(null, new Object[0]);
            if (num == null) {
                return bArr;
            }
            byte[] bArr5 = {66, -123, 75, 7, 60, -55, -98, -87, 104, -112, 53, 108, -67, 38, -92, 85, 87, -14, -21, 68, 85, 6, -91, 106};
            c(bArr5, new byte[]{66, -58, 41, 94, 106, -118, 17, -75, 85, -59, 93, 6, -21, 25, -32, -5, 56, 99, -104, 15, 75, 52, -33, -10});
            String strIntern = new String(bArr5, charset).intern();
            StringBuilder sb = new StringBuilder();
            byte[] bArr6 = {-66, 34, -81, -117, -92, -11, 125, -85, 14, -66, -97, -25, 54, -34, -70, -4, -89, -55, -97, 97, 96};
            c(bArr6, new byte[]{15, 30, -16, -52, -41, -91, 59, -62, 120, -99, 16, 107, 45, 120, -11, 117, -21, 112, 6, -9, 64});
            c(strIntern, sb.append(new String(bArr6, charset).intern()).append(num).toString());
            return A;
        } catch (Exception e) {
            byte[] bArr7 = {-28, -23, -81, 43, -66, -91, -49, 84, 80, -77, 16, 84, -34, 59, 58, -57, -11, -9, -20, -75, -85, -122, -44, 96};
            c(bArr7, new byte[]{-92, 106, 13, 67, -24, -90, -64, 23, 29, -90, 120, 14, -50, 36, 106, 109, -102, 102, -101, -64, -31, -76, -50, -20});
            a(new String(bArr7, StandardCharsets.UTF_8).intern(), e);
            return bArr;
        }
    }

    public final /* synthetic */ X f(Context context) {
        boolean zI = (B != b(context)) | i();
        byte[] bArrE = e(context);
        byte[] bArr = A;
        return new X(!(zI | (bArrE == bArr)), !((c(context) == bArr) | (f() == bArr) | (g() == bArr)), !(l() | j() | k()));
    }

    public final void e(String str, String str2) {
        c(str, str2);
    }

    public final boolean b(boolean z2) {
        return new java.util.Random().nextInt(B.length) > 0 && !z2;
    }

    public final byte[] a(byte[] bArr, int i) {
        if (i != 2) {
            return bArr;
        }
        byte[] bArr2 = {-92, -103, 9, 115, -122, 51, 108, -126, 73, -91, 81, 9, 18, -128, 65};
        c(bArr2, new byte[]{-34, -63, -126, -9, 4, 49, 46, -54, 65, -98, 27, 98, 115, -29, 36});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {35, -40, -54, -31, 1, -12, 118, -83, -67, -115, 46, -27, 114, 98, -72, -13, 14, 42, -70};
        c(bArr3, new byte[]{-121, 125, -66, 121, -116, 86, 45, -64, -17, 125, 93, 125, 105, -45, -16, 110, 103, 92, -33});
        c(strIntern, new String(bArr3, charset).intern());
        return A;
    }

    public final byte[] c(Context context) {
        return B;
    }

    public final byte[] b(byte[] bArr, StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        byte[] bArrB = b(H);
        Charset charset = StandardCharsets.UTF_8;
        if (!className.equals(new String(bArrB, charset)) || !stackTraceElement.getMethodName().equals(new String(b(J), charset))) {
            return bArr;
        }
        byte[] bArr2 = {59, -18, 75, 15, 119, -64, 63, -128, -17, 26, 94, -39, 59, -10, 98};
        c(bArr2, new byte[]{111, 86, 68, 83, 51, 99, 97, -56, -93, 65, 32, -110, 90, -107, 7});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {52, -71, 32, 12, 9, -49, 126, 42, 15, -128, -55, 81, 88, -55, 58, -125, 77, -26, -50};
        c(bArr3, new byte[]{115, -90, 101, 78, -125, 123, 116, 70, -109, -71, -67, 29, -113, 97, 96, -45, 62, -125, -86});
        c(strIntern, new String(bArr3, charset).intern());
        return A;
    }

    public final void a(String str, Exception exc) {
        a(str, exc.getMessage() == null ? exc.getClass().getSimpleName() : exc.getMessage());
    }

    public final byte[] c(byte[] bArr, StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        byte[] bArrB = b(H);
        Charset charset = StandardCharsets.UTF_8;
        if (!className.equals(new String(bArrB, charset)) || !stackTraceElement.getMethodName().equals(new String(b(I), charset))) {
            return bArr;
        }
        byte[] bArr2 = {37, 98, -43, 111, -120, -72, 6, -79, -21, 80, -122, -66, -117, 44, 23};
        c(bArr2, new byte[]{93, -38, -59, -13, -6, -69, -120, -73, -97, 11, -24, -77, -22, 79, 114});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {-71, -76, -102, 78, -10, 21, 9, 61, -65, 91, -51, 25, -127, -40, 65, -121};
        c(bArr3, new byte[]{-8, -108, 11, 37, -86, 65, 63, 59, -29, 75, -62, 97, 12, -126, 77, -55});
        c(strIntern, new String(bArr3, charset).intern());
        return A;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0006b0
    public void a(Context context) {
        d(context);
    }

    public final String a(byte[] bArr) {
        return new String(b(bArr), StandardCharsets.UTF_8);
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte[] bArr3 = z;
            bArr2[i] = (byte) (b ^ bArr3[i % bArr3.length]);
        }
        return bArr2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    private static void c(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3 = 0;
        byte[] bArr3 = null;
        int i4 = 0;
        int i5 = 0;
        int length = 0;
        int i6 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i7 = ((i6 & 16777216) * (i6 | 16777216)) + ((i6 & (-16777217)) * ((~i6) & 16777216));
            int i8 = i6 >>> 8;
            int iA = K.a(650911840 & (~i7) & i8, i8, i7, (i7 | 650911840) & i8);
            int i9 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i9) + ((i9 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i10 = 0 - i4;
                    int i11 = (length2 ^ i10) + ((length2 & i10) * 2);
                    byte b = bArr3[i11];
                    int length3 = bArr4.length;
                    int i12 = 0 - i10;
                    int i13 = i12 | length3;
                    byte b2 = bArr3[O.a(i12, 2, i13, (length3 ^ i12) ^ i13)];
                    bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - ((byte) (b2 ^ b)));
                    i3 = 0;
                    i6 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    if ((((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i3 = 0;
                        i6 = -365117735;
                    } else {
                        i6 = -458924450;
                        i3 = 0;
                    }
                    break;
                case -1399959314:
                    int iA2 = K.a((-1205100636) & i5, i5, 3, (-1205100633) & i5);
                    byte b3 = bArr3[iA2];
                    int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i15 = i5 - 1;
                    int i16 = i15 - (i5 | (-3));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int iA3 = J.a(i18, i14, 1, ((-1) - i18) | ((-1) - i14));
                    int i19 = i15 - (i5 | (-2));
                    int i20 = bArr3[i19] & 255;
                    int i21 = i20 * ((~i20) & 256);
                    int i22 = (i21 - 1) - ((~iA3) | i21);
                    int i23 = bArr3[i5] & 255;
                    int iA4 = J.a(i22, i23, 1, ((-1) - i22) | ((-1) - i23));
                    byte b4 = bArr4[iA2];
                    int i24 = ((16777216 & b4) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i25 = bArr4[i16] & 255;
                    int i26 = ((i25 * ((~i25) & 65536)) & (~i24)) + i24;
                    int i27 = bArr4[i19] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = ~((((~i28) | 911399251) | i26) - ((i28 & 911399251) | i26));
                    int i30 = bArr4[i5] & 255;
                    int i31 = ~((((~i29) | 1433568692) | i30) - ((i29 & 1433568692) | i30));
                    int i32 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i33 = (-1254002618) - ((i32 & 2) | ((-1672003491) - i32));
                    int i34 = (i33 + i31) - ((i33 & i31) * 2);
                    bArr4[i5] = (byte) i34;
                    bArr4[i19] = (byte) (i34 >>> 8);
                    bArr4[i16] = (byte) (i34 >>> 16);
                    bArr4[iA2] = (byte) (i34 >>> 24);
                    i5 = (i5 ^ 4) + ((i5 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i35 = ((i5 > L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i5 == L.a(0, (length4 & 2) | N.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    int i36 = i35 != 0 ? -1605440657 : -365117735;
                    if (i35 == 0) {
                        i6 = -169475207;
                        i3 = 0;
                    } else {
                        i6 = i36;
                        i = 0;
                        i3 = i;
                    }
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    i2 = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 <= 0 ? i3 : 1;
                    i6 = i2 != 0 ? i2 != 0 ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i5 = i3;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i37 = 0 - i4;
                    int i38 = 0 - i37;
                    int i39 = ((~length8) & i38) * 2;
                    int length9 = bArr4.length;
                    byte b5 = bArr4[((length9 | i37) * 2) - (length9 ^ i37)];
                    int length10 = bArr4.length;
                    byte b6 = bArr3[(i37 ^ length10) + ((length10 & i37) * 2)];
                    bArr4[(length8 ^ i38) - i39] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = M.a(i4, 3, (~i4) * 2, 1);
                    if ((((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                        i6 = -365117735;
                    } else {
                        i6 = -458924450;
                        i3 = 0;
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i40 = 0 - length;
                    i2 = (((double) ((byte) bArr3[((length11 | i40) - ((165327505 & (~i40)) & length11)) + ((i40 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i40) - ((165327505 & (~i40)) & length11)) + ((i40 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) <= -1 ? i3 : 1;
                    i6 = i2 != 0 ? -746753280 : i2 != 0 ? -365117735 : 1093626513;
                    i4 = length;
                    break;
                default:
                    i = i3;
                    i6 = -365117735;
                    i3 = i;
                    break;
            }
            return;
        }
    }
}
