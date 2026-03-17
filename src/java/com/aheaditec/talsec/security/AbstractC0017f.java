package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.C0028i1;
import com.aheaditec.talsec.security.T;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.aheaditec.talsec.security.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class AbstractC0017f implements InterfaceC0006b0 {
    public static final b j;
    public static final String k;
    public final R0 a;
    public final U b;
    public final H c;
    public final List<InterfaceC0061y0> d;
    public final List<InterfaceC0061y0> e;
    public List<InterfaceC0061y0> f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    /* JADX INFO: renamed from: com.aheaditec.talsec.security.f$a */
    public interface a {
        X run();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    /* JADX INFO: renamed from: com.aheaditec.talsec.security.f$b */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-97, -76, -94, 98, 114, 121, -110, 64, -45, -5, 87};
        a(bArr, new byte[]{-42, -38, -63, 11, 22, 28, -4, 52, -97, -108, 48});
        k = new String(bArr, StandardCharsets.UTF_8).intern();
        j = new b(null);
    }

    public AbstractC0017f(R0 r0) {
        byte[] bArr = {2, 37, -84, -95, 15, -77};
        a(bArr, new byte[]{110, 74, -53, -58, 106, -63, -75, 76});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(r0, new String(bArr, charset).intern());
        this.a = r0;
        U uA = r0.a();
        byte[] bArr2 = {51, 117, -75, 22, 28, 11, -12, -98, 25, 71, 114, -40, 37, -93};
        a(bArr2, new byte[]{84, 16, -63, 85, 116, 110, -105, -11, 106, 111, 92, -10, 11, -118});
        Intrinsics.checkNotNullExpressionValue(uA, new String(bArr2, charset).intern());
        this.b = uA;
        this.c = new H();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = new byte[]{0, 0, 0, 0, 0};
        this.h = new byte[]{1, 1, 1, 1, 1};
        this.i = new byte[]{-1, -1, -1, -1, -1};
    }

    public final void a(Function0<Unit> function0) {
    }

    public final boolean a(Integer num) {
        return false;
    }

    public final byte d() {
        return ArraysKt.first(Random.Default.nextBytes(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] e(byte[] r8, byte r9, byte r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.AbstractC0017f.e(byte[], byte, byte, java.lang.String):int[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(byte[] r8, byte r9, byte r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.AbstractC0017f.f(byte[], byte, byte, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] g(byte[] r12, byte r13, byte r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.AbstractC0017f.g(byte[], byte, byte, java.lang.String):java.lang.String[]");
    }

    public final void b(String str, List<? extends X509Certificate> list) {
        byte[] bArr = {-81, 122, 8, 73, 90, -125, 85, -60, 93};
        a(bArr, new byte[]{-52, 18, 109, 42, 49, -51, 52, -87, 56});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-38, 45, -62, -78, 27, 84, 105, 61, 64, -61, -30, -12};
        a(bArr2, new byte[]{-71, 72, -80, -58, 114, 50, 0, 94, 33, -73, -121, -121});
        Intrinsics.checkNotNullParameter(list, new String(bArr2, charset).intern());
        this.e.add(new V(str, list));
    }

    public final void c(String str, List<String> list) {
        byte[] bArr = {101, -34, -85, 106, -70, 39, -32, 58, -99};
        a(bArr, new byte[]{6, -74, -50, 9, -47, 105, -127, 87, -8});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {115, 29, -112, 71};
        a(bArr2, new byte[]{26, 115, -10, 40, 98, 64, 56, -119});
        Intrinsics.checkNotNullParameter(list, new String(bArr2, charset).intern());
        this.e.add(new W(str, list));
    }

    public final void d(String str, String str2) {
        b(str, str2);
    }

    public final void a(String str, X509Certificate x509Certificate) {
        byte[] bArr = {-108, -79, 72, -66, -120, -95, -91, 121, -103};
        a(bArr, new byte[]{-9, -39, 45, -35, -29, -17, -60, 20, -4});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-26, -119, -80, -31, 40, -7, 9, 46, -96, -9, -79};
        a(bArr2, new byte[]{-123, -20, -62, -107, 65, -97, 96, 77, -63, -125, -44});
        Intrinsics.checkNotNullParameter(x509Certificate, new String(bArr2, charset).intern());
        this.d.add(new S(str, x509Certificate));
    }

    public final void b(String str, String str2) {
        byte[] bArr = {119, -92, -69, -5, 107, -111, -39, 4, 41};
        a(bArr, new byte[]{20, -52, -34, -104, 0, -33, -72, 105, 76});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-20, 75, 78, 100};
        a(bArr2, new byte[]{-123, 37, 40, 11, 61, -124, 110, 30});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        this.e.add(new C0025h1(str, str2));
    }

    public final void c(String str, String str2) {
        byte[] bArr = {-76, -8, -83, 31, -20, 66, -111, -8, 119};
        a(bArr, new byte[]{-41, -112, -56, 124, -121, 12, -16, -107, 18});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {4, 117, 11, -24};
        a(bArr2, new byte[]{109, 27, 109, -121, 110, 118, -92, -34});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        this.d.add(new C0025h1(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer d(byte[] r8, byte r9, byte r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.AbstractC0017f.d(byte[], byte, byte, java.lang.String):java.lang.Integer");
    }

    public final void a(String str, List<String> list) {
        byte[] bArr = {-12, -43, -4, -96, 98, -98, 104, -4, -60};
        a(bArr, new byte[]{-105, -67, -103, -61, 9, -48, 9, -111, -95});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {96, 79, 63, 119};
        a(bArr2, new byte[]{9, 33, 89, 24, 117, -53, -71, -15});
        Intrinsics.checkNotNullParameter(list, new String(bArr2, charset).intern());
        this.d.add(new W(str, list));
    }

    public final X b(Function0<? extends X> function0) {
        byte[] bArr = {88, -58, 48, -118, 46, -94, 43, -72, 96};
        a(bArr, new byte[]{55, -74, 85, -8, 79, -42, 66, -41, 14});
        Intrinsics.checkNotNullParameter(function0, new String(bArr, StandardCharsets.UTF_8).intern());
        long j2 = 1000000;
        long jNanoTime = System.nanoTime() / j2;
        X x = (X) function0.invoke();
        x.a((System.nanoTime() / j2) - jNanoTime);
        return x;
    }

    public final void c(String str) {
        byte[] bArr = {17, 58, -28, -115};
        a(bArr, new byte[]{101, 67, -108, -24, 82, 97, 5, 92});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        if (this.d.isEmpty() && this.e.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.e);
        this.a.b(str, arrayList, arrayList2);
        this.d.clear();
        this.e.clear();
    }

    public final void a(String str, String str2) {
        byte[] bArr = {100, -3, 35, -82, 6, -28, 120, -95, 92};
        a(bArr, new byte[]{7, -107, 70, -51, 109, -86, 25, -52, 57});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-31, 7, 88, 74, 15};
        a(bArr2, new byte[]{-124, 117, 42, 37, 125, -120, -36, -6});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
    }

    public final void b(String str) {
        if (this.d.isEmpty() && this.e.isEmpty()) {
            return;
        }
        this.a.a(str, this.d, this.e);
        this.d.clear();
        this.e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<java.lang.String, java.security.cert.X509Certificate> c(byte[] r9, byte r10, byte r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.String r0 = "getInstance(...)"
            java.lang.String r1 = "checkName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L11
            java.lang.String r9 = "nativeApiNullDetected"
            r8.b(r12, r9)
            goto L70
        L11:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r9.length
            r3.<init>(r4)
            int r4 = r9.length
            r5 = 0
            r6 = r5
        L1a:
            if (r6 >= r4) goto L2a
            r7 = r9[r6]
            r7 = r7 ^ r11
            byte r7 = (byte) r7
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            r3.add(r7)
            int r6 = r6 + 1
            goto L1a
        L2a:
            java.util.List r11 = kotlin.collections.CollectionsKt.dropLast(r3, r1)
            byte[] r11 = kotlin.collections.CollectionsKt.toByteArray(r11)
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            int r9 = r9.length
            if (r9 != r1) goto L40
            goto L4a
        L40:
            int r9 = r11.length
        L41:
            if (r5 >= r9) goto L4a
            r4 = r11[r5]
            r10 = r10 ^ r4
            byte r10 = (byte) r10
            int r5 = r5 + 1
            goto L41
        L4a:
            if (r3 == r10) goto L4f
            java.lang.String r9 = "nativeApiExternHookDetected"
            goto L64
        L4f:
            byte[] r9 = r8.h
            boolean r9 = java.util.Arrays.equals(r11, r9)
            if (r9 == 0) goto L5a
            java.lang.String r9 = "nativeApiHookDetected"
            goto L64
        L5a:
            byte[] r9 = r8.i
            boolean r9 = java.util.Arrays.equals(r11, r9)
            if (r9 == 0) goto L68
            java.lang.String r9 = "nativeApiErrorDetected"
        L64:
            r8.b(r12, r9)
            goto L70
        L68:
            byte[] r8 = r8.g
            boolean r8 = java.util.Arrays.equals(r11, r8)
            if (r8 == 0) goto L71
        L70:
            r11 = r2
        L71:
            if (r11 != 0) goto L74
            return r2
        L74:
            java.lang.String r8 = "SHA-256"
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r8)     // Catch: java.lang.Exception -> Lc6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)     // Catch: java.lang.Exception -> Lc6
            byte[] r8 = r8.digest(r11)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r9 = "digest(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Exception -> Lc6
            r9 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r9)     // Catch: java.lang.Exception -> Lc6
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> Lc0
            r9.<init>(r11)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r10 = "X509"
            java.security.cert.CertificateFactory r10 = java.security.cert.CertificateFactory.getInstance(r10)     // Catch: java.lang.Throwable -> Lb3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Throwable -> Lb3
            java.security.cert.Certificate r10 = r10.generateCertificate(r9)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)     // Catch: java.lang.Throwable -> Lb3
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch: java.lang.Throwable -> Lb3
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Exception -> Lc0
            kotlin.io.CloseableKt.closeFinally(r9, r2)     // Catch: java.lang.Exception -> Lc0
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Exception -> Lc0
            kotlin.Pair r9 = new kotlin.Pair     // Catch: java.lang.Exception -> Lc0
            r9.<init>(r8, r10)     // Catch: java.lang.Exception -> Lc0
            goto Lc5
        Lb3:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r11 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Exception -> Lc0
            kotlin.io.CloseableKt.closeFinally(r9, r10)     // Catch: java.lang.Exception -> Lc0
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Exception -> Lc0
            throw r11     // Catch: java.lang.Exception -> Lc0
        Lc0:
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r8, r2)
        Lc5:
            return r9
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.AbstractC0017f.c(byte[], byte, byte, java.lang.String):kotlin.Pair");
    }

    public final void a(int[] iArr) {
        byte[] bArr = {28, 16, 31, 97, -37, -58, 15, -128, -111, -97, -48, 71, 90, -14, -28, -78, -93, 7, -70, -102, -45, -46, 115, 93, -82, -10, -1};
        a(bArr, new byte[]{122, 117, 126, 21, -82, -76, 106, -44, -12, -20, -92, 46, 52, -107, -83, -36, -64, 110, -34, -1, -67, -90, 0, 25, -49, -126, -98});
        Intrinsics.checkNotNullParameter(iArr, new String(bArr, StandardCharsets.UTF_8).intern());
        this.e.add(new C0046q0(iArr));
    }

    public final void b(String str, Integer num) {
        byte[] bArr = {-84, -55, 72, -24};
        a(bArr, new byte[]{-40, -80, 56, -115, 82, 75, 60, -115});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        b(str, num, false);
    }

    public final void a(String str, JSONObject jSONObject) {
        byte[] bArr = {-118, 21, 84, 112, 21, -71, 108, 114, 125};
        a(bArr, new byte[]{-23, 125, 49, 19, 126, -9, 13, 31, 24});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-77, 37, 113, 74};
        a(bArr2, new byte[]{-38, 75, 23, 37, 73, -29, -31, 79});
        Intrinsics.checkNotNullParameter(jSONObject, new String(bArr2, charset).intern());
        this.d.add(new D0(str, jSONObject));
    }

    public final void b(String str, Integer num, boolean z) {
        byte[] bArr = {-117, 29, -28, -114};
        a(bArr, new byte[]{-1, 100, -108, -21, -89, 87, 68, 97});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        b(str);
    }

    public final void a(Set<N0> set) {
        byte[] bArr = {-31, -36, 64, -21, -42, 21, 44, 60, -35, 82, -6, 19, -48, 21, 41, -109};
        a(bArr, new byte[]{-116, -67, 44, -100, -73, 103, 73, 117, -77, 49, -109, 119, -75, 123, 93, -32});
        Intrinsics.checkNotNullParameter(set, new String(bArr, StandardCharsets.UTF_8).intern());
        this.d.add(new O0(set));
    }

    public final byte[] b(byte[] bArr, byte b2, byte b3, String str) {
        String strIntern;
        byte[] bArr2 = {-115, -2, -35, 105, -112, -62, -84, -118, 108};
        a(bArr2, new byte[]{-18, -106, -72, 10, -5, -116, -51, -25, 9});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        if (bArr == null) {
            byte[] bArr3 = {33, -35, -95, 113, -60, 47, -96, -110, -37, -118, -20, 84, 5, 37, -95, -31, 48, -21, -23, -88, -43};
            a(bArr3, new byte[]{79, -68, -43, 24, -78, 74, -31, -30, -78, -60, -103, 56, 105, 97, -60, -107, 85, -120, -99, -51, -79});
            b(str, new String(bArr3, charset).intern());
            return null;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b4 : bArr) {
            arrayList.add(Byte.valueOf((byte) (b4 ^ b3)));
        }
        byte[] byteArray = CollectionsKt.toByteArray(CollectionsKt.dropLast(arrayList, 1));
        byte bByteValue = ((Number) CollectionsKt.last(arrayList)).byteValue();
        if (bArr.length != 1) {
            for (byte b5 : byteArray) {
                b2 = (byte) (b2 ^ b5);
            }
        }
        if (bByteValue != b2) {
            byte[] bArr4 = {-97, -47, 8, 27, -50, 41, 43, 27, -126, 49, 73, -34, 103, 80, 25, 124, 116, 90, -22, 56, -3, 95, -30, 41, 22, 93, -15};
            a(bArr4, new byte[]{-15, -80, 124, 114, -72, 76, 106, 107, -21, 116, 49, -86, 2, 34, 119, 52, 27, 53, -127, 124, -104, 43, -121, 74, 98, 56, -107});
            strIntern = new String(bArr4, StandardCharsets.UTF_8).intern();
        } else if (Arrays.equals(byteArray, this.h)) {
            byte[] bArr5 = {35, -3, -19, 67, -24, 106, -89, -34, 24, -32, 13, 15, 89, 41, 91, 35, -54, -44, -35, 77, 5};
            a(bArr5, new byte[]{77, -100, -103, 42, -98, 15, -26, -82, 113, -88, 98, 96, 50, 109, 62, 87, -81, -73, -87, 40, 97});
            strIntern = new String(bArr5, StandardCharsets.UTF_8).intern();
        } else {
            if (!Arrays.equals(byteArray, this.i)) {
                if (Arrays.equals(byteArray, this.g)) {
                    return null;
                }
                return byteArray;
            }
            byte[] bArr6 = {25, -17, 72, 41, -81, -6, -74, -55, 99, 64, 115, 114, 60, -16, -81, 101, -34, 106, -41, -50, -88, -108};
            a(bArr6, new byte[]{119, -114, 60, 64, -39, -97, -9, -71, 10, 5, 1, 0, 83, -126, -21, 0, -86, 15, -76, -70, -51, -16});
            strIntern = new String(bArr6, StandardCharsets.UTF_8).intern();
        }
        b(str, strIntern);
        return null;
    }

    public final void a(String str, Integer num) {
        byte[] bArr = {-15, 120, 72, 68};
        a(bArr, new byte[]{-123, 1, 56, 33, -87, 26, 125, -70});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        a(str, num, false);
    }

    public final void a(String str, Integer num, boolean z) {
        List<InterfaceC0061y0> list;
        byte[] bArr = {63, 8, 30, 92};
        a(bArr, new byte[]{75, 113, 110, 57, 14, -44, 37, 78});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        arrayList.addAll(this.e);
        List<InterfaceC0061y0> list2 = this.f;
        if (list2 == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            this.f = arrayList2;
            b(str, num, z);
            return;
        }
        if (list2 == null || list2.size() != arrayList.size() || (list = this.f) == null || !list.containsAll(arrayList)) {
            this.f = arrayList;
            b(str, num, z);
        } else {
            this.d.clear();
            this.e.clear();
        }
    }

    public final X a(a aVar) {
        byte[] bArr = {-15, 45, -94, -3, 116, 63, 36, -86, -78};
        a(bArr, new byte[]{-98, 93, -57, -113, 21, 75, 77, -59, -36});
        Intrinsics.checkNotNullParameter(aVar, new String(bArr, StandardCharsets.UTF_8).intern());
        long j2 = 1000000;
        long jNanoTime = System.nanoTime() / j2;
        X xRun = aVar.run();
        xRun.a((System.nanoTime() / j2) - jNanoTime);
        return xRun;
    }

    public final void a(String str, X x) {
        byte[] bArr = {-12, -122, 77, -19};
        a(bArr, new byte[]{-102, -25, 32, -120, -50, 103, 124, 84});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {54, -76, 103, 33, 101, 22};
        a(bArr2, new byte[]{68, -47, 20, 84, 9, 98, -20, -104});
        Intrinsics.checkNotNullParameter(x, new String(bArr2, charset).intern());
        this.b.a(str, x.b() ? T.a.b : T.a.a, x.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean a(byte[] r9, byte r10, byte r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aheaditec.talsec.security.AbstractC0017f.a(byte[], byte, byte, java.lang.String):java.lang.Boolean");
    }

    public final byte[] a(int i, byte b2, byte b3) {
        byte[] bArrArray = ByteBuffer.allocate(4).putInt(i).array();
        byte[] bArr = {-4, 67, 4, 24, 119, 62, 95, 64, 21, 98};
        a(bArr, new byte[]{-99, 49, 118, 121, 14, 22, 113, 110, 59, 75});
        Intrinsics.checkNotNullExpressionValue(bArrArray, new String(bArr, StandardCharsets.UTF_8).intern());
        for (byte b4 : bArrArray) {
            b2 = (byte) (b2 ^ b4);
        }
        byte[] bArrPlus = ArraysKt.plus(bArrArray, b2);
        ArrayList arrayList = new ArrayList(bArrPlus.length);
        for (byte b5 : bArrPlus) {
            arrayList.add(Byte.valueOf((byte) (b5 ^ b3)));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    public final byte[] a(String str, byte b2, byte b3) {
        ArrayList arrayList;
        int i = 0;
        if (str == null) {
            byte[] bArr = this.g;
            for (byte b4 : bArr) {
                b2 = (byte) (b2 ^ b4);
            }
            byte[] bArrPlus = ArraysKt.plus(bArr, b2);
            arrayList = new ArrayList(bArrPlus.length);
            int length = bArrPlus.length;
            while (i < length) {
                arrayList.add(Byte.valueOf((byte) (bArrPlus[i] ^ b3)));
                i++;
            }
        } else {
            byte[] bArrEncodeToByteArray = StringsKt.encodeToByteArray(str);
            for (byte b5 : bArrEncodeToByteArray) {
                b2 = (byte) (b2 ^ b5);
            }
            byte[] bArrPlus2 = ArraysKt.plus(bArrEncodeToByteArray, b2);
            arrayList = new ArrayList(bArrPlus2.length);
            int length2 = bArrPlus2.length;
            while (i < length2) {
                arrayList.add(Byte.valueOf((byte) (bArrPlus2[i] ^ b3)));
                i++;
            }
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    public final byte[] a(boolean z, byte b2, byte b3) {
        byte[] bArr = {z ? (byte) 1 : (byte) 0};
        byte[] bArrPlus = ArraysKt.plus(bArr, (byte) (bArr[0] ^ b2));
        ArrayList arrayList = new ArrayList(bArrPlus.length);
        for (byte b4 : bArrPlus) {
            arrayList.add(Byte.valueOf((byte) (b4 ^ b3)));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    public final byte[] a(byte[] bArr, byte b2, byte b3) {
        byte[] bArr2 = {53, 50, 31, -21, 49, -61};
        a(bArr2, new byte[]{9, 70, 119, -126, 66, -3, 121, 37});
        Intrinsics.checkNotNullParameter(bArr, new String(bArr2, StandardCharsets.UTF_8).intern());
        for (byte b4 : bArr) {
            b2 = (byte) (b2 ^ b4);
        }
        byte[] bArrPlus = ArraysKt.plus(bArr, b2);
        ArrayList arrayList = new ArrayList(bArrPlus.length);
        for (byte b5 : bArrPlus) {
            arrayList.add(Byte.valueOf((byte) (b5 ^ b3)));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    public final byte[] a(int[] iArr, byte b2, byte b3) {
        byte[] bArr = {103, 16, -111, -64, 44, 51};
        a(bArr, new byte[]{91, 100, -7, -87, 95, 13, 92, -100});
        Intrinsics.checkNotNullParameter(iArr, new String(bArr, StandardCharsets.UTF_8).intern());
        int length = iArr.length * 4;
        byte[] bArr2 = new byte[length];
        int length2 = iArr.length;
        for (int i = 0; i < length2; i++) {
            byte[] bArrArray = ByteBuffer.allocate(4).putInt(iArr[i]).array();
            byte[] bArr3 = {-126, -124, 25, 9, -73, 116, -62, 79, 95, -117};
            a(bArr3, new byte[]{-29, -10, 107, 104, -50, 92, -20, 97, 113, -94});
            Intrinsics.checkNotNullExpressionValue(bArrArray, new String(bArr3, StandardCharsets.UTF_8).intern());
            for (int i2 = 0; i2 < 4; i2++) {
                bArr2[(i * 4) + i2] = bArrArray[i2];
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            b2 = (byte) (b2 ^ bArr2[i3]);
        }
        byte[] bArrPlus = ArraysKt.plus(bArr2, b2);
        ArrayList arrayList = new ArrayList(bArrPlus.length);
        for (byte b4 : bArrPlus) {
            arrayList.add(Byte.valueOf((byte) (b4 ^ b3)));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    public final byte[] a(String[] strArr, byte b2, byte b3) {
        byte[] bArr = {-38, -101, -41, -65, -12, -22};
        a(bArr, new byte[]{-26, -17, -65, -42, -121, -44, 11, -61});
        Intrinsics.checkNotNullParameter(strArr, new String(bArr, StandardCharsets.UTF_8).intern());
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(',');
        }
        String string = sb.toString();
        byte[] bArr2 = {107, 25, -69, -76, -48, 33, -76, 0, 23, -24, -31, 89, -77};
        a(bArr2, new byte[]{31, 118, -24, -64, -94, 72, -38, 103, 63, -58, -49, 119, -102});
        Intrinsics.checkNotNullExpressionValue(string, new String(bArr2, StandardCharsets.UTF_8).intern());
        byte[] bArrEncodeToByteArray = StringsKt.encodeToByteArray(string);
        for (byte b4 : bArrEncodeToByteArray) {
            b2 = (byte) (b2 ^ b4);
        }
        byte[] bArrPlus = ArraysKt.plus(bArrEncodeToByteArray, b2);
        ArrayList arrayList = new ArrayList(bArrPlus.length);
        for (byte b5 : bArrPlus) {
            arrayList.add(Byte.valueOf((byte) (b5 ^ b3)));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    public final void a(C0028i1.c cVar, int i) {
        if (cVar != null) {
            cVar.a(i);
        }
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
                    byte b2 = bArr3[i];
                    int i8 = ((byte) 0) - b2;
                    bArr3[i] = (byte) (((byte) (b2 & (~i8))) - ((byte) ((~b2) & i8)));
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
                    byte b3 = bArr4[i];
                    byte b4 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b4 + b3)) - ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
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
