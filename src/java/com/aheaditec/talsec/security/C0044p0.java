package com.aheaditec.talsec.security;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class C0044p0 {
    public final List<a> a;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    /* JADX INFO: renamed from: com.aheaditec.talsec.security.p0$a */
    public static final class a {
        public static final C0000a l;
        public static final String m;
        public static final String n;
        public static final String o;
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
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public String i;
        public final int j;
        public int k;

        /* JADX WARN: Classes with same name are omitted, all sources:
          /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
          /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
         */
        /* JADX INFO: renamed from: com.aheaditec.talsec.security.p0$a$a, reason: collision with other inner class name */
        public static final class C0000a {
            public C0000a() {
            }

            public C0000a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            byte[] bArr = {71, -58, -15, -114, 21, -50, 29};
            a(bArr, new byte[]{30, -45, -121, 4, 116, -67, 120, -117});
            Charset charset = StandardCharsets.UTF_8;
            y = new String(bArr, charset).intern();
            byte[] bArr2 = {99, -92, -5, 69, 114};
            a(bArr2, new byte[]{-9, -6, -119, 57, 30, 76, 54, -65});
            x = new String(bArr2, charset).intern();
            byte[] bArr3 = {-45, 112, -8, 94, 123, 81};
            a(bArr3, new byte[]{-96, 69, 120, 80, 24, 52, 102, -36});
            w = new String(bArr3, charset).intern();
            byte[] bArr4 = {-127, -70, -52, -20, 126, -41};
            a(bArr4, new byte[]{-53, -6, -93, -58, 28, -66, -45, -2});
            v = new String(bArr4, charset).intern();
            byte[] bArr5 = {-6, -12, -44, -53, 81};
            a(bArr5, new byte[]{-127, -53, -97, -46, 53, -27, -113, 41});
            u = new String(bArr5, charset).intern();
            byte[] bArr6 = {-98, 100, 89, 13, -68, -115, 30, 93};
            a(bArr6, new byte[]{-33, 53, 21, -126, -76, 28, 87, 81});
            t = new String(bArr6, charset).intern();
            byte[] bArr7 = {-74, 63, -77, -14, -50, 26, -20};
            a(bArr7, new byte[]{-81, 125, -58, -81, -69, 121, -104, -53});
            s = new String(bArr7, charset).intern();
            byte[] bArr8 = {-22, 73, 82, 58, 24, 55, -62, -70};
            a(bArr8, new byte[]{-117, 88, 10, 119, 88, -122, -102, -8});
            r = new String(bArr8, charset).intern();
            byte[] bArr9 = {-74, 7, -18, 67, 57, 3, 68, -123, -56};
            a(bArr9, new byte[]{-87, -110, 106, 64, 63, -95, 5, 5, -84});
            q = new String(bArr9, charset).intern();
            byte[] bArr10 = {-66, -16, 85, -4, 100, -13, -111, 65, -58, 76};
            a(bArr10, new byte[]{-68, -49, 27, -78, -15, 2, -22, 57, -85, 41});
            p = new String(bArr10, charset).intern();
            byte[] bArr11 = {81, 91};
            a(bArr11, new byte[]{107, 123, -35, -118, 14, 30, 96, -11});
            o = new String(bArr11, charset).intern();
            byte[] bArr12 = {71, -65, -118, 38, 11, -32, 120, -70, 104, 5, 97, 107, -90};
            a(bArr12, new byte[]{81, -1, -30, 98, 81, -1, 5, -29, 6, -100, -7, 37, -55});
            n = new String(bArr12, charset).intern();
            byte[] bArr13 = {103, 24, -125, -93, 84, 104, 66, -107, 63};
            a(bArr13, new byte[]{-19, -105, -32, 14, 26, 54, 16, 19, 77});
            m = new String(bArr13, charset).intern();
            l = new C0000a(null);
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public final boolean a(String str) {
            try {
                String str2 = Build.BOARD;
                if (str2 != null) {
                    return StringsKt.contains$default(str2, str, false, 2, (Object) null);
                }
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {28, -126, 26, 59, 36, -18, 14, -8, -11, 105, -12, 98, -123, -95, -60, -26};
                a(bArr, new byte[]{59, 29, 52, 103, 48, -74, 50, -86, 121, 53, 122, 64, -32, 3, -106, -83});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-73, -57, 9, 26, 84, 74, 122, 107, -92, 26, 62, 76, -10, 124, 28, 75, 12, 31, 26, 4, -76, -5, 109, 55, 76, -117, 52, -71, -27, -57, 14, 77, 22, -8, -56, 70, 108, 17, -102};
                a(bArr2, new byte[]{-37, -27, 101, -114, 15, -102, -9, 27, -74, -90, 69, -123, -128, 79, 105, 71, 104, -100, 93, -125, -68, 11, 26, 91, 14, 23, 59, -80, -112, -72, 57, 56, 59, 8, -103, 72, 9, 125, -2});
                new String(bArr2, charset).intern();
            }
            return false;
        }

        public final boolean b(String str) {
            try {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr != null) {
                    return ArraysKt.contains(strArr, str);
                }
                return false;
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {45, 77, -101, 33, -88, -38, -63, -47, 53, -3, 21, 50, 36, -108, 97, 35};
                a(bArr, new byte[]{76, 82, -78, 109, -76, -30, 113, -47, 57, -63, 91, -112, 63, 22, -7, 105});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-127, 46, 109, 119, 69, -40, -125, 113, -70, 62, 99, 105, 2, 123, -72, 94, -113, 100, 34, 97, -22, -18, -65, 1, -103, 55, -113, 89, -58, -113, -117, -120, -108, 79, -82, 30, 123, -106, -65, -100, -55, 121, 68, 78, -2, -95, 110, 107};
                a(bArr2, new byte[]{-83, -116, 9, 49, 32, 40, -33, 50, -68, -126, -16, 97, 76, 72, -59, 84, -27, 71, 53, 40, 118, -2, -25, -115, -39, -117, -43, -112, 126, 10, -58, -15, -60, 77, -28, 116, 40, -7, -24, -9, 105, 90, 78, 65, -128, -12, -20, 39});
                new String(bArr2, charset).intern();
                return false;
            }
        }

        public final boolean c(String str) {
            Map<String, String> mapE = e();
            byte[] bArr = {19, 110, -116, 25, -44, -4, 100, 15};
            a(bArr, new byte[]{68, 63, -24, -106, -116, -51, 0, -125});
            Charset charset = StandardCharsets.UTF_8;
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapE;
            String str2 = (String) linkedHashMap.get(new String(bArr, charset).intern());
            if (str2 != null && StringsKt.contains$default(str2, str, false, 2, (Object) null)) {
                return true;
            }
            byte[] bArr2 = {-46, 112, 72, -65, 107, 98, 66, 79, 81, 3};
            a(bArr2, new byte[]{-88, 79, 22, -13, -16, 113, 22, 71, 60, 102});
            String str3 = (String) linkedHashMap.get(new String(bArr2, charset).intern());
            if (str3 != null && StringsKt.contains$default(str3, str, false, 2, (Object) null)) {
                return true;
            }
            byte[] bArr3 = {-58, 17, -96, -94, 117, 58, 46, -121, 55};
            a(bArr3, new byte[]{-103, -92, -72, -33, 3, 120, 91, 7, 83});
            String str4 = (String) linkedHashMap.get(new String(bArr3, charset).intern());
            return str4 != null && StringsKt.contains$default(str4, str, false, 2, (Object) null);
        }

        public final boolean d(String str) {
            try {
                return Intrinsics.areEqual(str, Build.DEVICE);
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {46, 105, -34, 111, -124, 95, -78, 110, -34, -48, 17, -105, -112, 31, 39, 23};
                a(bArr, new byte[]{73, 54, 119, 51, -48, 103, -34, 32, -92, -20, 95, -21, -53, -99, 50, 126});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-54, -90, -4, -83, 94, 13, -106, 77, -127, 96, -8, 85, 99, 108, -22, 64, -28, 58, -84, -106, 113, -119, 67, 110, 53, -101, 51, 2, 104, 85, -73, -41, -86, -41, 1, 60, -32, 122, -55, -35};
                a(bArr2, new byte[]{120, 4, 121, -37, 21, 93, -53, 62, -47, 60, -121, -114, -21, 62, 115, 62, -128, 121, -81, 17, -1, -40, -21, 51, 69, 39, 66, 69, 21, 64, -53, -73, -46, -62, 11, 115, 114, 79, -113, -46});
                new String(bArr2, charset).intern();
                return false;
            }
        }

        public final boolean e(String str) {
            try {
                String str2 = Build.HARDWARE;
                if (str2 != null) {
                    return StringsKt.contains$default(str2, str, false, 2, (Object) null);
                }
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {6, 120, -56, 18, -27, -14, 117, 40, -4, -61, 49, -104, -119, -84, -92, 118};
                a(bArr, new byte[]{49, 71, -123, -128, 111, -54, 29, 90, -126, -33, 63, -10, -28, 14, -74, 29});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-54, 115, 54, 36, 89, -96, 49, 40, -44, 5, -29, -28, -21, 46, -39, -92, -6, 50, -69, 21, -91, 99, 101, -37, -30, 5, -7, 105, 41, 76, -23, -80, 25, -99, 119, 37, 40, 1, -49, -50, 119, 3};
                a(bArr2, new byte[]{120, 49, 46, 100, 20, -80, 48, 89, -90, -103, 112, -35, 115, 125, -92, -38, 114, 113, -68, -108, -85, 115, 17, -57, 116, -103, -121, 96, 74, 61, -91, 13, 55, 12, 16, 121, -15, -106, -112, -60, 27, 103});
                new String(bArr2, charset).intern();
            }
            return false;
        }

        public final boolean f(String str) {
            try {
                return Intrinsics.areEqual(str, Build.MODEL);
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {-99, -16, -42, -54, -86, -67, 60, -84, 77, -100, 26, -2, 40, -95, 96, -124};
                a(bArr, new byte[]{-68, -49, 111, -40, -78, 5, 101, -34, 17, 32, 105, -44, 67, 3, -6, 14});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-107, -37, -92, 88, 45, -122, 63, -112, 38, -117, -61, -32, 10, 39, -67, 69, -101, 1, -81, 8, 60, -106, -8, -41, -112, 15, 38, -13, -3, -74, -22, -96, 86, 25, 19, 13, 104, -37, 70};
                a(bArr2, new byte[]{-71, -39, -64, 80, 72, -42, 50, 17, 56, 23, -111, -39, 84, 116, -56, 57, -47, -94, -80, 127, 68, -26, -92, -69, -30, -109, 44, -10, -103, 41, -103, -2, 3, 105, 95, 125, 13, -73, 34});
                new String(bArr2, charset).intern();
                return false;
            }
        }

        public final boolean g(String str) {
            try {
                String str2 = Build.PRODUCT;
                if (str2 != null) {
                    return StringsKt.contains$default(str2, str, false, 2, (Object) null);
                }
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {46, -18, 31, 77, -82, -57, -71, 82, 127, 66, -1, -90, 69, 98, 100, 111};
                a(bArr, new byte[]{73, -79, 54, 81, -74, -33, -23, 84, 3, 94, -123, -4, 32, 64, -11, 53});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-9, 28, 13, 90, -80, -108, 115, 101, 76, 63, -101, 108, -116, -50, -67, -61, -12, 78, 27, -76, 79, -107, -23, -74, -95, -18, 127, 29, -11, -60, 55, -109, 23, -70, 87, 69, 73, -108, 127, -97, -108};
                a(bArr2, new byte[]{-101, -98, 105, 78, -85, -28, -18, 37, 14, -125, -24, 101, -42, -35, -56, -65, 112, 109, 92, -13, 17, -27, -107, -36, -79, -78, 5, 76, -114, -58, 98, -16, 43, 41, -18, 125, 24, 45, 5, 12, -16});
                new String(bArr2, charset).intern();
            }
            return false;
        }

        public final boolean h(String str) {
            try {
                return Intrinsics.areEqual(Build.VERSION.RELEASE, str);
            } catch (NoSuchFieldError unused) {
                byte[] bArr = {41, 121, -27, -15, 70, 122, 52, -56, 113, -15, -22, 102, 24, 101, -98, -115};
                a(bArr, new byte[]{80, 70, -96, -99, 14, 66, 92, -70, -3, -52, 120, 60, 83, 71, -37, 24});
                Charset charset = StandardCharsets.UTF_8;
                new String(bArr, charset).intern();
                byte[] bArr2 = {-19, 20, 45, -19, -74, -28, 17, 86, -36, -37, -16, 100, 61, -65, 122, -2, 9, 2, -21, -70, 98, 105, -60, -38, -103, 64, 51, 66, 0, -77, 21, -84, 62, -69, 18, 118, 25, 46, 80, 66, -75, 94, 45, 52, 15, 95, -128, -122, 108};
                a(bArr2, new byte[]{-111, -106, 73, -101, -83, -12, 80, 87, -98, -25, 127, 93, 69, 12, 4, -76, 99, -95, 108, -19, -18, 120, 112, -56, -39, 92, 65, -123, 63, 38, 50, 24, 96, 36, 71, 113, 52, -101, 6, 32, -35, 61, 82, 45, 82, 102, -49, 3, 8});
                new String(bArr2, charset).intern();
                return false;
            }
        }

        public final String i() {
            return this.b;
        }

        public final String j() {
            return this.f;
        }

        public final String k() {
            return this.a;
        }

        public final String l() {
            return this.g;
        }

        public final JSONObject m() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.a != null) {
                    byte[] bArr = {93, 58, -62, 34, -73, 45, -50};
                    a(bArr, new byte[]{22, 120, -105, 95, -62, 78, -70, 89});
                    jSONObject.put(new String(bArr, StandardCharsets.UTF_8).intern(), this.a);
                }
                if (this.b != null) {
                    byte[] bArr2 = {97, -63, 81, 112, 99, -78, 107, -31};
                    a(bArr2, new byte[]{-14, -49, 13, 45, -3, 2, 4, -99});
                    jSONObject.put(new String(bArr2, StandardCharsets.UTF_8).intern(), this.b);
                }
                if (this.c != null) {
                    byte[] bArr3 = {-10, 91, -34, -37, -50};
                    a(bArr3, new byte[]{125, 100, -87, -62, -86, 66, -67, 104});
                    jSONObject.put(new String(bArr3, StandardCharsets.UTF_8).intern(), this.c);
                }
                if (this.d != null) {
                    byte[] bArr4 = {51, 101, -40, 121, 23, -90};
                    a(bArr4, new byte[]{57, 69, -105, 81, 117, -49, -68, -46});
                    jSONObject.put(new String(bArr4, StandardCharsets.UTF_8).intern(), this.d);
                }
                if (this.e != null) {
                    byte[] bArr5 = {103, 52, 118, 5, 54, 43};
                    a(bArr5, new byte[]{-20, -128, -22, -124, 85, 78, -8, -83});
                    jSONObject.put(new String(bArr5, StandardCharsets.UTF_8).intern(), this.e);
                }
                if (this.f != null) {
                    byte[] bArr6 = {-96, 83, 41, -41, 92};
                    a(bArr6, new byte[]{-74, 108, 55, -53, 48, -78, 39, -59});
                    jSONObject.put(new String(bArr6, StandardCharsets.UTF_8).intern(), this.f);
                }
                if (this.g != null) {
                    byte[] bArr7 = {-77, -49, -108, -93, -108, -65, 29};
                    a(bArr7, new byte[]{-86, -38, -30, -33, -11, -52, 120, 47});
                    jSONObject.put(new String(bArr7, StandardCharsets.UTF_8).intern(), this.g);
                }
                if (this.h != null) {
                    byte[] bArr8 = {-119, -2, -10, -70, -14, 118, 99, -86, 63};
                    a(bArr8, new byte[]{-45, -66, 109, 5, -128, 72, -15, -35, 77});
                    jSONObject.put(new String(bArr8, StandardCharsets.UTF_8).intern(), this.h);
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = b();
        }

        public final boolean a() {
            String str = this.a;
            if (str != null && g(str)) {
                this.k++;
            }
            String str2 = this.b;
            if (str2 != null && e(str2)) {
                this.k++;
            }
            String str3 = this.c;
            if (str3 != null && a(str3)) {
                this.k++;
            }
            String str4 = this.d;
            if (str4 != null && b(str4)) {
                this.k++;
            }
            String str5 = this.e;
            if (str5 != null && d(str5)) {
                this.k++;
            }
            String str6 = this.f;
            if (str6 != null && f(str6)) {
                this.k++;
            }
            String str7 = this.g;
            if (str7 != null && h(str7)) {
                this.k++;
            }
            String str8 = this.h;
            if (str8 != null && c(str8)) {
                this.k++;
            }
            return this.k == this.j;
        }

        public final int b() {
            int i = this.a != null ? 1 : 0;
            if (this.b != null) {
                i++;
            }
            if (this.c != null) {
                i++;
            }
            if (this.d != null) {
                i++;
            }
            if (this.e != null) {
                i++;
            }
            if (this.f != null) {
                i++;
            }
            if (this.g != null) {
                i++;
            }
            return this.h != null ? i + 1 : i;
        }

        public final String c() {
            return this.i;
        }

        public final String d() {
            return this.h;
        }

        public final Map<String, String> e() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                byte[] bArr = {91, 3, 48, 30, -127, 0, -37, -2, 11, -59, 127, -82, 11};
                a(bArr, new byte[]{93, -93, 44, -118, -53, 95, -94, -89, 103, -36, -5, -32, 100});
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File(new String(bArr, StandardCharsets.UTF_8).intern())), Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    for (String str : TextStreamsKt.lineSequence(bufferedReader)) {
                        byte[] bArr2 = {-61, 125};
                        a(bArr2, new byte[]{-7, 93, 44, -2, -16, 62, 104, 45});
                        List listSplit$default = StringsKt.split$default(str, new String[]{new String(bArr2, StandardCharsets.UTF_8).intern()}, false, 0, 6, (Object) null);
                        if (listSplit$default.size() > 1) {
                            linkedHashMap.put(StringsKt.trim((String) listSplit$default.get(0)).toString(), StringsKt.trim((String) listSplit$default.get(1)).toString());
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                } finally {
                }
            } catch (Exception unused) {
            }
            return linkedHashMap;
        }

        public final String f() {
            return this.c;
        }

        public final String g() {
            return this.d;
        }

        public final String h() {
            return this.e;
        }

        public final void i(String str) {
            this.i = str;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & AbstractC0023h.n) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
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
    }

    public C0044p0() {
        byte[] bArr = {-6, 46, -20, -8, -96, -88, -114, -66};
        a(bArr, new byte[]{-120, 115, -125, -83, -86, 12, -52, -27});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-65, 22, -3, 97, -25, 1, 118, 84, -7, -107};
        a(bArr2, new byte[]{-38, -87, 111, 90, -96, -99, 1, 70, -100, -25});
        a aVar = new a(null, null, null, null, strIntern, null, null, null, new String(bArr2, charset).intern(), 239, null);
        byte[] bArr3 = {-49, -35, 63, 97, -116, 124, -60, -123, -92, 14, -63, 31, -3, 8};
        a(bArr3, new byte[]{-111, -30, 58, 31, -55, 73, -50, -18, -74, -90, -114, -116, -35, 58});
        String strIntern2 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-6, 115, 37, 86, 48};
        a(bArr4, new byte[]{-74, -115, -2, -112, 2, -120, 71, 59});
        String strIntern3 = new String(bArr4, charset).intern();
        byte[] bArr5 = {24, 85, -47, 61, 76, -70, -15, 54, 63, -72};
        a(bArr5, new byte[]{63, 106, -109, 54, 5, 6, 123, 104, 90, -54});
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        a aVar2 = new a(strIntern2, str, str2, null, str3, null, strIntern3, str4, new String(bArr5, charset).intern(), 190, defaultConstructorMarker);
        byte[] bArr6 = {82, -22, -19, 52, -107, -49, 65, -111};
        a(bArr6, new byte[]{10, -50, 118, 95, -112, -45, 31, 13});
        String strIntern4 = new String(bArr6, charset).intern();
        byte[] bArr7 = {-25, 116, 48, -61, -35};
        a(bArr7, new byte[]{-71, -118, -21, 5, -17, 51, 65, -1});
        String strIntern5 = new String(bArr7, charset).intern();
        byte[] bArr8 = {-36, 41, -52, 99, 23, -19, -45, 31, -21, 11};
        a(bArr8, new byte[]{123, 118, -98, 92, 48, -79, -100, 127, -114, 121});
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        a aVar3 = new a(null, str5, str6, str7, strIntern4, str8, strIntern5, str9, new String(bArr8, charset).intern(), 175, defaultConstructorMarker2);
        byte[] bArr9 = {84, -14, 119};
        a(bArr9, new byte[]{44, -54, 65, 6, 99, -58, 81, 52});
        String strIntern6 = new String(bArr9, charset).intern();
        byte[] bArr10 = {-31, -109, -10, -18, -95, 115, -90, -2};
        a(bArr10, new byte[]{-101, 14, -58, -62, -127, 117, 125, -55});
        String strIntern7 = new String(bArr10, charset).intern();
        byte[] bArr11 = {-83, 63, -16, 70, -87, -38, -49, 75, -124, -95};
        a(bArr11, new byte[]{-52, -128, 114, 127, -30, -26, -104, 75, -31, -45});
        a aVar4 = new a(null, str, str2, strIntern6, str3, strIntern7, null, str4, new String(bArr11, charset).intern(), 215, defaultConstructorMarker);
        byte[] bArr12 = {-115, 56, -13, 75, 5, -111, 88, 43, -112};
        a(bArr12, new byte[]{-86, -81, -88, 127, 60, -46, 82, 52, -37});
        String strIntern8 = new String(bArr12, charset).intern();
        byte[] bArr13 = {-23, -37, 114, -108, -28};
        a(bArr13, new byte[]{-57, 37, 46, -45, -42, 16, 9, -117});
        String strIntern9 = new String(bArr13, charset).intern();
        byte[] bArr14 = {34, 26, 80, -72, -96, 29, -15, -85, 13, 37};
        a(bArr14, new byte[]{85, -91, 18, -79, -39, -95, 122, -21, 104, 87});
        String str10 = null;
        a aVar5 = new a(strIntern8, str5, str6, str7, str10, str8, strIntern9, str9, new String(bArr14, charset).intern(), 190, defaultConstructorMarker2);
        byte[] bArr15 = {-109, -6, 40, -82, -118, -100, -7, -5};
        a(bArr15, new byte[]{-83, -35, 97, 0, -93, -36, -78, -40});
        String strIntern10 = new String(bArr15, charset).intern();
        byte[] bArr16 = {-120, 59, -50, 64, 38};
        a(bArr16, new byte[]{-88, 69, -23, -121, 20, 100, -21, -113});
        String strIntern11 = new String(bArr16, charset).intern();
        byte[] bArr17 = {5, -68, 24, -39, 55, 51, 110, 59, -2, -83};
        a(bArr17, new byte[]{52, 3, 75, 18, 80, -113, -7, 90, -101, -33});
        String str11 = null;
        a aVar6 = new a(strIntern10, str, str2, str11, str3, null, strIntern11, str4, new String(bArr17, charset).intern(), 190, defaultConstructorMarker);
        byte[] bArr18 = {-122, -103, -101, 23, -30, -76, -126, -37};
        a(bArr18, new byte[]{-66, 4, -95, 105, -60, -68, -99, 4});
        String strIntern12 = new String(bArr18, charset).intern();
        byte[] bArr19 = {76, -101, 39, -20, -5};
        a(bArr19, new byte[]{100, -27, 0, -37, -55, 107, 120, -31});
        String strIntern13 = new String(bArr19, charset).intern();
        byte[] bArr20 = {81, -113, -98, -76, 53, 2, 44, 126, -64, -124};
        a(bArr20, new byte[]{8, 16, -47, -83, 78, -98, 55, 32, -91, -10});
        a aVar7 = new a(null, str5, str6, str7, str10, strIntern12, strIntern13, str9, new String(bArr20, charset).intern(), 159, defaultConstructorMarker2);
        byte[] bArr21 = {-18, -112, -88, 52, -21, 53, -20, 109};
        a(bArr21, new byte[]{-90, 13, 112, -116, -69, 50, -55, 60});
        String strIntern14 = new String(bArr21, charset).intern();
        byte[] bArr22 = {-99, 59, 112, -80, -50};
        a(bArr22, new byte[]{-109, 69, 43, -73, -4, 1, 123, -86});
        String strIntern15 = new String(bArr22, charset).intern();
        byte[] bArr23 = {6, 83, -59, 23, -52, 103, -31, -55, 66, -11};
        a(bArr23, new byte[]{49, 108, -89, 80, -123, 59, 106, -55, 39, -121});
        a aVar8 = new a(null, str, str2, str11, str3, strIntern14, strIntern15, str4, new String(bArr23, charset).intern(), 159, defaultConstructorMarker);
        byte[] bArr24 = {34, 80, -72};
        a(bArr24, new byte[]{90, 104, -114, -43, 125, -100, -79, -102});
        String strIntern16 = new String(bArr24, charset).intern();
        byte[] bArr25 = {-76, 73, -34, 95, -1, -123, -61, 113};
        a(bArr25, new byte[]{-48, 52, -35, 49, -81, -32, -32, 88});
        String strIntern17 = new String(bArr25, charset).intern();
        byte[] bArr26 = {84, -62, -101, 53, 91, -100, -86, 31, -21, -62};
        a(bArr26, new byte[]{3, -35, -51, 46, -12, 31, -74, 127, -114, -80});
        int i = 215;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str12 = null;
        String str13 = null;
        a aVar9 = new a(str5, str6, str7, strIntern16, str12, strIntern17, str9, str13, new String(bArr26, charset).intern(), i, defaultConstructorMarker3);
        byte[] bArr27 = {111, -104, 7};
        a(bArr27, new byte[]{23, -96, 49, -15, 62, 81, -47, 49});
        String strIntern18 = new String(bArr27, charset).intern();
        byte[] bArr28 = {31, -60, -101, 52, -79, -38, -107, -61};
        a(bArr28, new byte[]{53, -71, -96, -116, 113, 29, -114, -90});
        String strIntern19 = new String(bArr28, charset).intern();
        byte[] bArr29 = {95, -12, 92, -92, -62, -25, 54, -35, 42, -47};
        a(bArr29, new byte[]{-6, -54, 14, -99, 123, -69, 65, -67, 79, -93});
        int i2 = 215;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        a aVar10 = new a(str14, str15, str16, strIntern18, str17, strIntern19, str18, str19, new String(bArr29, charset).intern(), i2, defaultConstructorMarker4);
        byte[] bArr30 = {40, 27, 46};
        a(bArr30, new byte[]{80, 35, 24, -30, 59, -116, -24, -1});
        String strIntern20 = new String(bArr30, charset).intern();
        byte[] bArr31 = {55, -66, 44, -63, -5, -101, 68, -17};
        a(bArr31, new byte[]{77, 35, -20, -98, -85, -36, 93, -70});
        String strIntern21 = new String(bArr31, charset).intern();
        byte[] bArr32 = {6, 20, 3, -88, -43, 10, 111, 22, 74, 41};
        a(bArr32, new byte[]{49, -85, 101, -95, 110, -106, -8, -121, 47, 91});
        a aVar11 = new a(str5, str6, str7, strIntern20, str12, strIntern21, str9, str13, new String(bArr32, charset).intern(), i, defaultConstructorMarker3);
        byte[] bArr33 = {-44, 117, -67};
        a(bArr33, new byte[]{-84, 77, -117, -31, 5, 37, 120, -118});
        String strIntern22 = new String(bArr33, charset).intern();
        byte[] bArr34 = {22, -43, 97, -45, -28, 50, -29, -8};
        a(bArr34, new byte[]{46, -56, 54, -83, -58, 58, -59, -49});
        String strIntern23 = new String(bArr34, charset).intern();
        byte[] bArr35 = {-62, -99, -123, -81, 37, -96, -110, 65, 74, -126};
        a(bArr35, new byte[]{117, 34, -24, -88, 94, -4, -35, 81, 47, -16});
        a aVar12 = new a(str14, str15, str16, strIntern22, str17, strIntern23, str18, str19, new String(bArr35, charset).intern(), i2, defaultConstructorMarker4);
        byte[] bArr36 = {-126, 56, 102};
        a(bArr36, new byte[]{-6, 0, 80, -37, 40, 68, 27, 117});
        String strIntern24 = new String(bArr36, charset).intern();
        byte[] bArr37 = {-75, 127, -7, -61, -110, 94, -71, 82};
        a(bArr37, new byte[]{-49, 98, -66, -101, -109, -98, 118, 53});
        String strIntern25 = new String(bArr37, charset).intern();
        byte[] bArr38 = {-124, -69, -103, -80, -104, -52, 107, -63, 125, -13};
        a(bArr38, new byte[]{-81, 7, -41, -18, -76, -24, -12, -70, 22, -128});
        a aVar13 = new a(str5, str6, str7, strIntern24, str12, strIntern25, str9, str13, new String(bArr38, charset).intern(), i, defaultConstructorMarker3);
        byte[] bArr39 = {66, -99, 96};
        a(bArr39, new byte[]{58, -91, 86, -91, 33, 13, -64, 51});
        String strIntern26 = new String(bArr39, charset).intern();
        byte[] bArr40 = {-91, 47, -25, -15, -103, -19};
        a(bArr40, new byte[]{-33, -112, -76, -38, -88, -89, -6, -2});
        String strIntern27 = new String(bArr40, charset).intern();
        byte[] bArr41 = {-52, 0, 12, -125, -96, 1, -23, -66, -40, 22};
        a(bArr41, new byte[]{119, -100, 99, -1, -36, -91, 114, -10, -77, 101});
        a aVar14 = new a(str14, str15, str16, strIntern26, str17, strIntern27, str18, str19, new String(bArr41, charset).intern(), i2, defaultConstructorMarker4);
        byte[] bArr42 = {78, 85, -86};
        a(bArr42, new byte[]{54, 109, -100, -30, -8, -14, 5, 101});
        String strIntern28 = new String(bArr42, charset).intern();
        byte[] bArr43 = {-19, 40, -46, -98, -99, -31, -40, -101};
        a(bArr43, new byte[]{-89, -107, -23, -14, -115, 4, -40, -10});
        String strIntern29 = new String(bArr43, charset).intern();
        byte[] bArr44 = {107, -110, 96, -128, 72, 78, -125, 23, 84, -109};
        a(bArr44, new byte[]{18, 46, 0, -2, 4, 106, -52, -115, 63, -32});
        a aVar15 = new a(str5, str6, str7, strIntern28, str12, strIntern29, str9, str13, new String(bArr44, charset).intern(), i, defaultConstructorMarker3);
        byte[] bArr45 = {56, 52, 51};
        a(bArr45, new byte[]{64, 12, 5, -55, 11, -85, -114, 97});
        String strIntern30 = new String(bArr45, charset).intern();
        byte[] bArr46 = {-127, 40, -80, 9, -60, 118, 52, 89};
        a(bArr46, new byte[]{-69, -107, -121, 103, -26, 127, -10, 51});
        String strIntern31 = new String(bArr46, charset).intern();
        byte[] bArr47 = {127, -102, 96, -4, -122, 44, -43, -37, -16, 55};
        a(bArr47, new byte[]{38, 38, 0, -78, -66, -120, -98, -47, -101, 68});
        a aVar16 = new a(str14, str15, str16, strIntern30, str17, strIntern31, str18, str19, new String(bArr47, charset).intern(), i2, defaultConstructorMarker4);
        byte[] bArr48 = {126, -53, -26};
        a(bArr48, new byte[]{6, -13, -48, 85, -70, -127, -83, 66});
        String strIntern32 = new String(bArr48, charset).intern();
        byte[] bArr49 = {-53, 123, -118, 98, -51};
        a(bArr49, new byte[]{-127, 104, -73, 107, -1, -48, 35, 24});
        String strIntern33 = new String(bArr49, charset).intern();
        byte[] bArr50 = {67, 110, -36, 81, 121, -101, 114, -16, 91, -48};
        a(bArr50, new byte[]{-22, 49, -109, 77, 19, 31, -2, -85, 48, -93});
        a aVar17 = new a(str5, str6, str7, strIntern32, str12, strIntern33, str9, str13, new String(bArr50, charset).intern(), i, defaultConstructorMarker3);
        byte[] bArr51 = {-45, 68, 24};
        a(bArr51, new byte[]{-85, 124, 46, 53, 28, -57, -95, -67});
        String strIntern34 = new String(bArr51, charset).intern();
        byte[] bArr52 = {-92, -123, -102, 107, -65, -28, 45, -3};
        a(bArr52, new byte[]{-32, -8, -95, 69, 111, 3, 5, -40});
        String strIntern35 = new String(bArr52, charset).intern();
        byte[] bArr53 = {-9, -61, 83, -27, -99, 59, -82, 69, -42, 59};
        a(bArr53, new byte[]{-98, -33, 16, -103, -73, 127, -71, 63, -67, 72});
        a aVar18 = new a(str14, str15, str16, strIntern34, str17, strIntern35, str18, str19, new String(bArr53, charset).intern(), i2, defaultConstructorMarker4);
        byte[] bArr54 = {14, -70, -98};
        a(bArr54, new byte[]{118, -126, -88, 8, -20, 45, 106, 3});
        String strIntern36 = new String(bArr54, charset).intern();
        byte[] bArr55 = {-5, 17, 52, 70, -124, -115, 119, -15};
        a(bArr55, new byte[]{-111, -116, 3, 26, -90, -22, 46, -48});
        String strIntern37 = new String(bArr55, charset).intern();
        byte[] bArr56 = {-35, -23, -64, 21, -52, 3, 98, -38, 11, -122};
        a(bArr56, new byte[]{-120, -75, -97, -119, -120, -89, -19, -47, 96, -11});
        a aVar19 = new a(str5, str6, str7, strIntern36, str12, strIntern37, str9, str13, new String(bArr56, charset).intern(), i, defaultConstructorMarker3);
        byte[] bArr57 = {-90, 91, 15};
        a(bArr57, new byte[]{-34, 99, 57, -67, 63, -35, 22, 7});
        String strIntern38 = new String(bArr57, charset).intern();
        byte[] bArr58 = {-75, 75, 26, -53, -84, -48};
        a(bArr58, new byte[]{-25, 57, 18, 20, -100, -31, -114, -77});
        String strIntern39 = new String(bArr58, charset).intern();
        byte[] bArr59 = {-88, 30, -49, -105, -64, -14, -66, 127, -26, -105};
        a(bArr59, new byte[]{-45, -94, -92, 11, 124, -74, -55, 53, -115, -28});
        int i3 = 215;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        a aVar20 = new a(str15, str16, str20, strIntern38, str21, strIntern39, str19, str22, new String(bArr59, charset).intern(), i3, defaultConstructorMarker5);
        byte[] bArr60 = {-58, 57, 82};
        a(bArr60, new byte[]{-66, 1, 100, -111, -46, -83, 1, 58});
        String strIntern40 = new String(bArr60, charset).intern();
        byte[] bArr61 = {111, -8, -80, 71, 87, 121, -8, -42, -14, -67, 61, 91, -52};
        a(bArr61, new byte[]{9, -26, -33, 48, 4, 92, -107, 15, -100, -72, -9, -125, -4});
        String strIntern41 = new String(bArr61, charset).intern();
        byte[] bArr62 = {-73, -123, 123, -114, 100, -53, 38, 56, -102, 53};
        a(bArr62, new byte[]{-34, 25, -7, 3, 32, -17, 49, 116, -15, 70});
        int i4 = 215;
        DefaultConstructorMarker defaultConstructorMarker6 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        String str28 = null;
        a aVar21 = new a(str23, str24, str25, strIntern40, str26, strIntern41, str27, str28, new String(bArr62, charset).intern(), i4, defaultConstructorMarker6);
        byte[] bArr63 = {-7, -3, 40};
        a(bArr63, new byte[]{-127, -59, 30, -3, -8, 105, -24, -34});
        String strIntern42 = new String(bArr63, charset).intern();
        byte[] bArr64 = {-60, -17, 95, 126, -127, -96, 3, -100, 108, 104, -91, 5, -21};
        a(bArr64, new byte[]{116, -47, 4, 71, -74, 37, 59, -43, 22, -117, 127, 77, -37});
        String strIntern43 = new String(bArr64, charset).intern();
        byte[] bArr65 = {-126, -47, -73, 55, 76, 87, -28, 107, 75, -102};
        a(bArr65, new byte[]{-87, -19, -84, 107, 8, 83, 111, 33, 32, -23});
        a aVar22 = new a(str15, str16, str20, strIntern42, str21, strIntern43, str19, str22, new String(bArr65, charset).intern(), i3, defaultConstructorMarker5);
        byte[] bArr66 = {120, 46, 74};
        a(bArr66, new byte[]{0, 22, 124, -8, 124, 70, -12, 1});
        String strIntern44 = new String(bArr66, charset).intern();
        byte[] bArr67 = {60, 25, -33, 103, 22, 0, 125};
        a(bArr67, new byte[]{89, -114, -36, 72, 47, 51, 77, 117});
        String strIntern45 = new String(bArr67, charset).intern();
        byte[] bArr68 = {18, -116, 67, 40, 1, -117, -60, 28, 97, 46};
        a(bArr68, new byte[]{57, 16, 33, 102, 59, 47, -112, -104, 10, 93});
        a aVar23 = new a(str23, str24, str25, strIntern44, str26, strIntern45, str27, str28, new String(bArr68, charset).intern(), i4, defaultConstructorMarker6);
        byte[] bArr69 = {-28, 72, 1};
        a(bArr69, new byte[]{-100, 112, 55, 51, 16, -56, -1, 62});
        String strIntern46 = new String(bArr69, charset).intern();
        byte[] bArr70 = {-37, 4, 41, 97, -72, 51, -46, -117, 68, 122};
        a(bArr70, new byte[]{116, 125, 91, 61, -35, 67, -54, -60, 28, 54});
        String strIntern47 = new String(bArr70, charset).intern();
        byte[] bArr71 = {46, -61, -93, -18, -72, -100, -96, -84, 7, 94};
        a(bArr71, new byte[]{85, -33, -64, -92, -44, 24, -84, -24, 108, 45});
        a aVar24 = new a(str15, str16, str20, strIntern46, str21, strIntern47, str19, str22, new String(bArr71, charset).intern(), i3, defaultConstructorMarker5);
        byte[] bArr72 = {-22, 52, 86};
        a(bArr72, new byte[]{-110, 12, 96, -9, 95, -76, -76, -101});
        String strIntern48 = new String(bArr72, charset).intern();
        byte[] bArr73 = {-49, 68, -63, 96, -37, -106, -16, -38, 88, 110};
        a(bArr73, new byte[]{119, 71, 126, 76, 109, -4, -86, 4, 9, 42});
        String strIntern49 = new String(bArr73, charset).intern();
        byte[] bArr74 = {60, -8, -111, -11, -84, -93, -10, -19, 99, 63};
        a(bArr74, new byte[]{103, -60, -50, -87, -24, 7, -126, -89, 8, 76});
        a aVar25 = new a(str23, str24, str25, strIntern48, str26, strIntern49, str27, str28, new String(bArr74, charset).intern(), i4, defaultConstructorMarker6);
        byte[] bArr75 = {-128, -86, -127, -119};
        a(bArr75, new byte[]{-38, -7, -40, -3, 67, -31, 121, -127});
        String strIntern50 = new String(bArr75, charset).intern();
        byte[] bArr76 = {-80, 111, 21, -24, -5, 34, 34, 119, -76, -69, 69, 67};
        a(bArr76, new byte[]{-32, 58, 101, -74, 123, 124, 49, 87, -61, -1, 10, 72});
        String strIntern51 = new String(bArr76, charset).intern();
        byte[] bArr77 = {43, -18, 6, -7, 116, -41, -96, -106, -48};
        a(bArr77, new byte[]{71, -80, 76, -75, -5, -19, -72, 12, -76});
        int i5 = 125;
        String str29 = null;
        String str30 = null;
        a aVar26 = new a(str15, strIntern50, str20, str29, str21, str30, str19, strIntern51, new String(bArr77, charset).intern(), i5, defaultConstructorMarker5);
        byte[] bArr78 = {62, 122, -18, 96};
        a(bArr78, new byte[]{56, 73, 107, 38, -36, 67, 39, 12});
        String strIntern52 = new String(bArr78, charset).intern();
        byte[] bArr79 = {-114, -17, -94, -67, 42, -52, -2, -49, -63, -74, 84, 36};
        a(bArr79, new byte[]{-72, -54, -64, -18, 56, -46, 116, -65, -117, 39, 4, 121});
        String strIntern53 = new String(bArr79, charset).intern();
        byte[] bArr80 = {-46, -36, -12, -119, -85, 89, 70, 15, -48};
        a(bArr80, new byte[]{-112, -30, 122, 5, -74, 96, 18, -125, -76});
        int i6 = 125;
        String str31 = null;
        String str32 = null;
        a aVar27 = new a(str23, strIntern52, str25, str31, str26, str32, str27, strIntern53, new String(bArr80, charset).intern(), i6, defaultConstructorMarker6);
        byte[] bArr81 = {-49, 94, -83, 46, 0, -68};
        a(bArr81, new byte[]{-109, 86, -66, 89, 111, -49, 72, -62});
        String strIntern54 = new String(bArr81, charset).intern();
        byte[] bArr82 = {68, 23, 80, 55, 38, -23, -89, -39, 69, -103, -48, 108};
        a(bArr82, new byte[]{-20, -95, 40, 91, 56, -73, -84, -87, 20, 29, -96, 25});
        String strIntern55 = new String(bArr82, charset).intern();
        byte[] bArr83 = {29, 44, -59, -100, 49, -95, 31, -61, 77};
        a(bArr83, new byte[]{81, 114, -117, 18, 64, -8, 91, -65, 41});
        a aVar28 = new a(str15, strIntern54, str20, str29, str21, str30, str19, strIntern55, new String(bArr83, charset).intern(), i5, defaultConstructorMarker5);
        byte[] bArr84 = {127, -32, -34, -94, -116, 102};
        a(bArr84, new byte[]{3, -56, -111, -27, -29, 21, -13, -49});
        String strIntern56 = new String(bArr84, charset).intern();
        byte[] bArr85 = {118, -24, 36, 126, 117, 14, -36, -78, 1, 104, -88, -95};
        a(bArr85, new byte[]{32, -51, 58, 47, -7, -113, -110, -12, 75, 89, -49, -2});
        String strIntern57 = new String(bArr85, charset).intern();
        byte[] bArr86 = {-27, 63, 117, 119, 14, -16, -80, -116, 33};
        a(bArr86, new byte[]{121, -127, -5, 42, 81, -55, -56, 2, 69});
        a aVar29 = new a(str23, strIntern56, str25, str31, str26, str32, str27, strIntern57, new String(bArr86, charset).intern(), i6, defaultConstructorMarker6);
        byte[] bArr87 = {35, 64, 52, 113, -8, -28};
        a(bArr87, new byte[]{47, 104, 55, 56, -105, -105, -4, -37});
        String strIntern58 = new String(bArr87, charset).intern();
        byte[] bArr88 = {-39, 25, 62, -24, -119, -44, 5, 107, 48, -15, 47, 21};
        a(bArr88, new byte[]{-121, -84, 58, -74, -55, -22, 74, 59, 71, -75, 52, -110});
        String strIntern59 = new String(bArr88, charset).intern();
        byte[] bArr89 = {-106, 102, 112, 37, -91, 2, 117, -65, -12};
        a(bArr89, new byte[]{-52, 56, -2, 88, -84, -101, 5, -13, -112});
        a aVar30 = new a(str15, null, strIntern58, str29, str21, str30, str19, strIntern59, new String(bArr89, charset).intern(), 123, defaultConstructorMarker5);
        byte[] bArr90 = {-54, -113, 64, -97, -62, -83};
        a(bArr90, new byte[]{-104, 39, 36, 10, -83, -34, -51, -6});
        String strIntern60 = new String(bArr90, charset).intern();
        byte[] bArr91 = {-24, 35, 60, 64, 49, 66, 70, 0, -100, -105, 94, -109};
        a(bArr91, new byte[]{-110, -122, 50, 65, 61, 92, 28, -126, -24, 6, -2, -17});
        String strIntern61 = new String(bArr91, charset).intern();
        byte[] bArr92 = {-16, 115, -39, -23, 125, 82, 100, -101, -85};
        a(bArr92, new byte[]{110, 77, -89, -91, 4, 107, -12, 22, -49});
        this.a = CollectionsKt.listOf(new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, new a(null, str25, strIntern60, str26, str32, str27, null, strIntern61, new String(bArr92, charset).intern(), 123, null)});
    }

    public final List<a> a() {
        List<a> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a) obj).a()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003c. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
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
}
