package com.aheaditec.talsec.security;

import android.R;
import android.content.Context;
import android.os.Build;
import com.fingerprintjs.android.fingerprint.DeviceIdResult;
import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.FingerprinterFactory;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class C0024h0 implements InterfaceC0021g0 {
    public static final a e = new a(null);
    public static volatile C0024h0 f;
    public DeviceIdResult a;
    public String b;
    public final CountDownLatch c;
    public final ExecutorService d;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    /* JADX INFO: renamed from: com.aheaditec.talsec.security.h0$a */
    public static final class a {
        public a() {
        }

        public final C0024h0 a(Context context) {
            byte[] bArr = {18, -88, 41, 103, -2, 38, -117};
            a(bArr, new byte[]{113, -57, 71, 19, -101, 94, -1, -115});
            Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
            C0024h0 c0024h0 = C0024h0.f;
            if (c0024h0 == null) {
                synchronized (this) {
                    c0024h0 = C0024h0.f;
                    if (c0024h0 == null) {
                        c0024h0 = new C0024h0(context);
                        C0024h0.f = c0024h0;
                    }
                }
            }
            return c0024h0;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
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

    public C0024h0(final Context context) {
        this.c = new CountDownLatch(2);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.aheaditec.talsec.security.h0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C0024h0.a(context, this);
            }
        });
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00fb. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int length;
        int i;
        int length2;
        int i2;
        int i3;
        int length3;
        int i4;
        int iA;
        int i5;
        int i6 = ~"com.aheaditec.talsec.security.h0".length();
        int length4 = (((~((("com.aheaditec.talsec.security.h0".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.h0".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.h0".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i7 = -1;
        int iA2 = B1.a(C0024h0.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.h0".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.h0".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.h0".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.h0".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.h0".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i8 = ((~"com.aheaditec.talsec.security.h0".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.h0".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & 1040)) + i8);
        int length9 = ((((~"com.aheaditec.talsec.security.h0".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.h0".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i9 = ((~"com.aheaditec.talsec.security.h0".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.h0".length();
        int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i10) {
                case -2143294076:
                    int i11 = ~"com.aheaditec.talsec.security.h0".length();
                    if (length4 >= length5) {
                        length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.h0".length() & 1073807362) | 1116733474);
                        i = -375509041;
                        i10 = i ^ length;
                        i7 = -1;
                    } else {
                        int length11 = ("com.aheaditec.talsec.security.h0".length() & 268439810) | 285217280;
                        int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                        i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                        i7 = -1;
                    }
                    break;
                case -2038999444:
                    int i13 = ~"com.aheaditec.talsec.security.h0".length();
                    int length12 = (((((("com.aheaditec.talsec.security.h0".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.h0".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.h0".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << y1.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.h0".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.h0".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i14 = ~"com.aheaditec.talsec.security.h0".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.h0".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.h0".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.h0".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.h0".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.h0".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i15 = -length13;
                    int i16 = i15 | s;
                    int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                    int i18 = -z1.a(i17 | (~iA4), 2, i17 - iA4, 2);
                    length7 = (short) O.a(length7, 3, -(N.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                    int i19 = ((~"com.aheaditec.talsec.security.h0".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.h0".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.h0".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.h0".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.h0".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.h0".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.h0".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.h0".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.h0".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.h0".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i20 = ((~"com.aheaditec.talsec.security.h0".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.h0".length() & 403838542) | 268582982;
                    int i21 = -i20;
                    int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                    iA3 = (short) x1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.h0".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.h0".length() & 150995145) | 140771329);
                    i = 1965034008;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
                case -1809249287:
                    byte b = bArr[(((((~"com.aheaditec.talsec.security.h0".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.h0".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.h0".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.h0".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.h0".length() | length16) - (b | length16)) + B1.a(C0024h0.class, b) + ("com.aheaditec.talsec.security.h0".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.h0".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.h0".length() & 786435) | 8921603)) ^ 447505026;
                    byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i23 = ~"com.aheaditec.talsec.security.h0".length();
                    length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.h0".length() | (-2105278367)) - (i23 | (-1545180443))) + (B1.a(C0024h0.class, 568748773 | i23) + ("com.aheaditec.talsec.security.h0".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.h0".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.h0".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.h0".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i24 = ~"com.aheaditec.talsec.security.h0".length();
                    int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.h0".length() & 144806464) | 136645376));
                    int i25 = -length4;
                    int i26 = i25 | length19;
                    byte b3 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                    int i27 = (((-199685676) | r8) - 1591672428) - ((~"com.aheaditec.talsec.security.h0".length()) | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.h0".length() & 23072776) | 272636008;
                    int length21 = b3 & ((-1319036669) ^ (((length20 | i27) - (("com.aheaditec.talsec.security.h0".length() & (~i27)) & length20)) + (length20 & (i27 | "com.aheaditec.talsec.security.h0".length()))));
                    int i28 = ((~"com.aheaditec.talsec.security.h0".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.h0".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i28) + (i28 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.h0".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.h0".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.h0".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.h0".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i29 = ~"com.aheaditec.talsec.security.h0".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i29) + 311432716) - (i29 | (-1074391060))) + (("com.aheaditec.talsec.security.h0".length() & 273678921) | (-1069545407)));
                    int i30 = ~"com.aheaditec.talsec.security.h0".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.h0".length() & (~i30)) & 91135407) + 91135407) + i30) - ((i30 | "com.aheaditec.talsec.security.h0".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.h0".length() & (-804257776)) | (-2094006112);
                    int i31 = -length25;
                    length9 = (-684063310) ^ (((~i31) & length26) - (i31 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.h0".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.h0".length() & 674768897) | 153626665);
                    i2 = 1174056570 - length2;
                    i3 = -1174056571;
                    i10 = ((length2 & i3) * 2) + i2;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.h0".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.h0".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.h0".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.h0".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i32 = ((~"com.aheaditec.talsec.security.h0".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.h0".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.h0".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.h0".length()) & 4218888)) + i32;
                    i4 = 434661073;
                    i10 = i4 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.h0".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.h0".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.h0".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.h0".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i33 = ~"com.aheaditec.talsec.security.h0".length();
                    int i34 = 73539736 & (((~i33) & (-1772650326)) + i33);
                    int length31 = ("com.aheaditec.talsec.security.h0".length() & 35664144) | 33608448;
                    int i35 = -i34;
                    byte b4 = bArr2[((107148186 ^ ((((~i35) & length31) * 2) - (i35 ^ length31))) * length4) + ((((B1.a(C0024h0.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.h0".length() & 532546) | 1602)) ^ 67642971)];
                    int i36 = ~"com.aheaditec.talsec.security.h0".length();
                    int length32 = (b4 & (((663757504 & ((i36 + 1314070430) - (i36 & 1314070430))) + (("com.aheaditec.talsec.security.h0".length() & 834674756) | 272630796)) ^ 936388147)) << ((((B1.a(C0024h0.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.h0".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((B1.a(C0024h0.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.h0".length() & 159661328) | (-2004872944));
                    i5 = -533943416;
                    i10 = iA ^ i5;
                    break;
                case -473033593:
                    int i37 = -length4;
                    int i38 = -bArr.length;
                    int i39 = i38 | i37;
                    int i40 = (i39 - (i38 * 2)) + ((i38 ^ i37) ^ i39);
                    byte b5 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.h0".length();
                    bArr[i40] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.h0".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (B1.a(C0024h0.class, i7) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.h0".length() & 1074544770;
                    iA = J.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i5 = 836032333;
                    i10 = iA ^ i5;
                    break;
                case 766056152:
                    int i41 = ((~"com.aheaditec.talsec.security.h0".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.h0".length();
                    int i42 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i42) & 608439588) + i42) + i41))) {
                        int i43 = ((~"com.aheaditec.talsec.security.h0".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.h0".length() & 268589089) | 661640;
                        iA = M.a(i43 | length36, 2, (~i43) ^ length36, 1);
                        i5 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.h0".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.h0".length() & 1074350177) | 1342720098);
                        i5 = -887872332;
                    }
                    i10 = iA ^ i5;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i44 = ((~"com.aheaditec.talsec.security.h0".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.h0".length() & 251684176) | 1694512896;
                    int i45 = -i44;
                    length4 = length37 % (1864794098 ^ (((~i45) & length38) - (i45 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.h0".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.h0".length() & (-1878240248)) | 285229064);
                    i5 = -195569723;
                    i10 = iA ^ i5;
                    break;
                case 998066383:
                    length4 = (((B1.a(C0024h0.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.h0".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.h0".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.h0".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.h0".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.h0".length() & (-1860698094)) | (-1190123008));
                    i5 = 1002689495;
                    i10 = iA ^ i5;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i46 = ~"com.aheaditec.talsec.security.h0".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.h0".length() & R.^attr-private.__removed0) | 553664516;
                        int i47 = -((i46 | 1510858717) & 403833600);
                        length3 = ((~i47) & length39) - (i47 & (~length39));
                        i4 = 2001041846;
                        i10 = i4 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.h0".length();
                        iA = ((i46 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i5 = -115901203;
                        i10 = iA ^ i5;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.h0".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.h0".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.h0".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.h0".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.h0".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.h0".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i48 = ((~"com.aheaditec.talsec.security.h0".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.h0".length();
                    bArr[length41] = (byte) ((length6 >> ((i48 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.h0".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.h0".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.h0".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.h0".length() & 196644) | (-2146430752));
                    int iA6 = A1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i49 = ((~"com.aheaditec.talsec.security.h0".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.h0".length();
                    int i50 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i51 = -i49;
                    bArr[iA6] = (byte) ((w1.a(~i51, i50, 2, (i50 + i51) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.h0".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.h0".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i52 = ~"com.aheaditec.talsec.security.h0".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.h0".length() | 674349280) - (i52 | 1869872636)) + (B1.a(C0024h0.class, 1197735420 | i52) + ("com.aheaditec.talsec.security.h0".length() & 674349280))) + (("com.aheaditec.talsec.security.h0".length() & 1754529808) | 1418461202)));
                    int i53 = ((~"com.aheaditec.talsec.security.h0".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.h0".length() & 545800290) | (-1442676670);
                    int i54 = -i53;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i54) & length47) - (i54 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.h0".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.h0".length() & 33562640) | 136194);
                    i5 = -1824662634;
                    i10 = iA ^ i5;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.h0".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.h0".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i55 = ~"com.aheaditec.talsec.security.h0".length();
                        iA = (1141965102 & ((-1207265904) + i55 + (((-i55) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.h0".length() & 1292960864) | 150996032);
                        i5 = 612868558;
                        i10 = iA ^ i5;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.h0".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.h0".length() & 874653185) | 335552516);
                        i2 = (-1287294623) - length2;
                        i3 = 1287294622;
                        i10 = ((length2 & i3) * 2) + i2;
                    }
                    break;
                default:
                    int i56 = ~"com.aheaditec.talsec.security.h0".length();
                    int i57 = (((-313266948) | i56) + 45165696) - (i56 | (-269226756));
                    length = O.a(i57, 3, -N.a(i57, -4, 1, ("com.aheaditec.talsec.security.h0".length() & 44040224) | (-1811807712)), 1);
                    i = -361272203;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
            }
            return;
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0021g0
    public String b() throws InterruptedException {
        if (this.a == null) {
            this.c.await();
        }
        DeviceIdResult deviceIdResult = this.a;
        if (deviceIdResult != null) {
            return deviceIdResult.getMediaDrmId();
        }
        return null;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0021g0
    public String c() throws InterruptedException {
        String str = Build.BOARD;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        String str4 = Build.DEVICE;
        String strB = b();
        if (strB == null) {
            return null;
        }
        byte[] bArr = {-37};
        a(bArr, new byte[]{-44, -89, 100, -98, 19, -44, -15, 12});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-20};
        a(bArr2, new byte[]{114, -112, -122, 38, -123, -67, 48, -39});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {65};
        a(bArr3, new byte[]{-77, 61, 74, -106, -116, -115, 58, 104});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-63};
        a(bArr4, new byte[]{0, -98, 39, 60, -128, -1, 80, 53});
        return str2 + strIntern + str3 + strIntern2 + str4 + strIntern3 + str + new String(bArr4, charset).intern() + strB;
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0021g0
    public String d() throws InterruptedException {
        if (this.b == null) {
            this.c.await();
        }
        return this.b;
    }

    public String toString() throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {-43, -53, 96, -100, -13, -33, -126, 4, 58, 120, -82, -86, 45, -73, -49, 1, -106, -95, 116, -88, -113, 100, 78, 57, -66, 28, -38, 127, -99, -23, -8, -51};
        a(bArr, new byte[]{-58, 0, 25, 51, 49, -65, 62, 65, 34, -32, 36, 77, 90, 113, 64, 6, -68, 121, -43, 10, -56, -55, 53, 63, -54, -83, 11, 92, -16, -61, 26, -20});
        Charset charset = StandardCharsets.UTF_8;
        sb.append(new String(bArr, charset).intern());
        String strA = a();
        if (strA == null) {
            byte[] bArr2 = {-43};
            a(bArr2, new byte[]{56, -8, -23, 104, -32, 16, -26, -38});
            strA = new String(bArr2, charset).intern();
        }
        sb.append(strA);
        byte[] bArr3 = {-10, -57, -93, 55, -106, 56, 39, 104, -126, -57, 72, -65, -76, 124, 86, -97, 73, -43, 51, 17, -13};
        a(bArr3, new byte[]{-57, -47, -43, 7, -27, 84, 41, -89, 44, 59, 43, -30, -74, -15, -23, 34, 106, -20, -105, -38, -75});
        sb.append(new String(bArr3, charset).intern());
        String strB = b();
        if (strB == null) {
            byte[] bArr4 = {79};
            a(bArr4, new byte[]{-111, 98, -107, 88, 19, -86, 62, 32});
            strB = new String(bArr4, charset).intern();
        }
        sb.append(strB);
        byte[] bArr5 = {70, -13, 99, 45, 63, -41, -12, -3, -51, 70, 105, 104, 79, -112, 54, 115, -1, 93, -128, 22, 34, -109, -93, -28, -39, -12};
        a(bArr5, new byte[]{-122, -42, -29, -56, 104, 51, 114, 93, -90, -22, -87, 98, -91, -85, 92, -119, -65, -13, -48, -119, -67, -16, 80, -6, 25, 17});
        sb.append(new String(bArr5, charset).intern());
        String strD = d();
        if (strD == null) {
            byte[] bArr6 = {54};
            a(bArr6, new byte[]{42, 27, 50, 123, 25, -102, -33, 85});
            strD = new String(bArr6, charset).intern();
        }
        sb.append(strD);
        byte[] bArr7 = {-21, 110};
        a(bArr7, new byte[]{-118, 100, -55, -124, 33, -81, 94, -103});
        sb.append(new String(bArr7, charset).intern());
        String string = sb.toString();
        byte[] bArr8 = {-42, 5, 101, -108, -94, 17, -49, -86, 60, -44, 33, 80, 121};
        a(bArr8, new byte[]{-91, 80, 26, 19, -120, -62, -8, -113, -36, 65, 36, 46, 65});
        Intrinsics.checkNotNullExpressionValue(string, new String(bArr8, charset).intern());
        return string;
    }

    public /* synthetic */ C0024h0(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void b(Fingerprinter fingerprinter) {
        FingerprintingSignalsProvider fingerprintingSignalsProvider = fingerprinter.getFingerprintingSignalsProvider();
        if (fingerprintingSignalsProvider == null) {
            byte[] bArr = {-95, -6, 88, 83, 54, -115, 112, 120, -106, 59, 52, 102, 119, -121, 82, 61, 42, -82, 116, 31, 123, -38, 30, 10, 13, -47, -121, 108, -91};
            a(bArr, new byte[]{42, -55, 63, -96, 105, 105, -82, 49, 74, 75, -90, 71, -97, -66, -36, 91, 113, 32, -15, 126, 47, 4, -113, -32, 8, 88, -67, 45, -53});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new FingerprintingSignal[]{fingerprintingSignalsProvider.getManufacturerNameSignal(), fingerprintingSignalsProvider.getModelNameSignal(), fingerprintingSignalsProvider.getTotalRamSignal(), fingerprintingSignalsProvider.getTotalInternalStorageSpaceSignal(), fingerprintingSignalsProvider.getProcCpuInfoSignal(), fingerprintingSignalsProvider.getSensorsSignal(), fingerprintingSignalsProvider.getInputDevicesSignal(), fingerprintingSignalsProvider.getBatteryHealthSignal(), fingerprintingSignalsProvider.getGlesVersionSignal(), fingerprintingSignalsProvider.getAbiTypeSignal(), fingerprintingSignalsProvider.getCoresCountSignal(), fingerprintingSignalsProvider.getCameraListSignal(), fingerprintingSignalsProvider.getAndroidVersionSignal(), fingerprintingSignalsProvider.getSdkVersionSignal(), fingerprintingSignalsProvider.getKernelVersionSignal(), fingerprintingSignalsProvider.getEncryptionStatusSignal(), fingerprintingSignalsProvider.getSecurityProvidersSignal(), fingerprintingSignalsProvider.getCodecListSignal(), fingerprintingSignalsProvider.getAdbEnabledSignal(), fingerprintingSignalsProvider.getDevelopmentSettingsEnabledSignal(), fingerprintingSignalsProvider.getTransitionAnimationScaleSignal(), fingerprintingSignalsProvider.getWindowAnimationScaleSignal(), fingerprintingSignalsProvider.getAccessibilityEnabledSignal(), fingerprintingSignalsProvider.getDefaultInputMethodSignal(), fingerprintingSignalsProvider.getTouchExplorationEnabledSignal(), fingerprintingSignalsProvider.getAlarmAlertPathSignal(), fingerprintingSignalsProvider.getDateFormatSignal(), fingerprintingSignalsProvider.getEndButtonBehaviourSignal(), fingerprintingSignalsProvider.getFontScaleSignal(), fingerprintingSignalsProvider.getScreenOffTimeoutSignal(), fingerprintingSignalsProvider.getTime12Or24Signal(), fingerprintingSignalsProvider.isPinSecurityEnabledSignal(), fingerprintingSignalsProvider.getFingerprintSensorStatusSignal(), fingerprintingSignalsProvider.getRingtoneSourceSignal(), fingerprintingSignalsProvider.getAvailableLocalesSignal(), fingerprintingSignalsProvider.getRegionCountrySignal(), fingerprintingSignalsProvider.getTimezoneSignal(), fingerprintingSignalsProvider.getDefaultLanguageSignal()});
        arrayListArrayListOf.add(fingerprintingSignalsProvider.getSystemApplicationsListSignal());
        this.b = Fingerprinter.getFingerprint$default(fingerprinter, arrayListArrayListOf, (Hasher) null, 2, (Object) null);
        this.c.countDown();
    }

    public static final void a(Context context, C0024h0 c0024h0) {
        byte[] bArr = {-44, 49, 20, -102, 127, -23, 20, -15};
        a(bArr, new byte[]{30, 111, -118, 42, 125, -48, 122, 109});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {67, -106, 93, 16, 3, -99};
        a(bArr2, new byte[]{34, -83, 39, -109, 61, -30, -67, -110});
        Intrinsics.checkNotNullParameter(c0024h0, new String(bArr2, charset).intern());
        try {
            try {
                Fingerprinter fingerprinterCreate = FingerprinterFactory.create(context);
                c0024h0.a(fingerprinterCreate);
                c0024h0.b(fingerprinterCreate);
            } catch (Exception unused) {
                byte[] bArr3 = {-4, -8, -32, -24, -35, -97, -55, -28, 6, -87, 49, -17, -60, 68, -101, -3, 85};
                a(bArr3, new byte[]{-61, 38, -74, 79, 9, -80, 94, -102, -33, -29, -96, -73, -80, -125, -120, 95, 89});
                Charset charset2 = StandardCharsets.UTF_8;
                new String(bArr3, charset2).intern();
                byte[] bArr4 = {-88, 109, 108, 84, 119, -29, -74, 85, -75, -108, -73, -36, -62, 59, -4, 79, 51, -40, 11, 98, -71, 127, 55, -9, -86, 11, -80, 64, -54, 14, -29, 109, 96, 40, 82, -99, 56};
                a(bArr4, new byte[]{68, 22, -33, -46, 3, -119, -125, 39, 13, -4, -108, 69, -33, -108, 122, -124, 44, -42, -113, -23, 57, -105, -60, -33, 55, 16, 60, 63, 1, 93, 59, 88, 102, 93, 109, -125, -85});
                new String(bArr4, charset2).intern();
                long count = c0024h0.c.getCount();
                long j = 0;
                if (0 <= count) {
                    while (true) {
                        c0024h0.c.countDown();
                        if (j == count) {
                            break;
                        } else {
                            j++;
                        }
                    }
                }
            }
        } finally {
            c0024h0.d.shutdown();
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0021g0
    public String a() throws InterruptedException {
        if (this.a == null) {
            this.c.await();
        }
        DeviceIdResult deviceIdResult = this.a;
        if (deviceIdResult != null) {
            return deviceIdResult.getAndroidId();
        }
        return null;
    }

    public final void a(Fingerprinter fingerprinter) {
        fingerprinter.getDeviceId(Fingerprinter.Version.V_3, new Function1() { // from class: com.aheaditec.talsec.security.h0$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return C0024h0.a(this.f$0, (DeviceIdResult) obj);
            }
        });
    }

    public static final Unit a(C0024h0 c0024h0, DeviceIdResult deviceIdResult) {
        byte[] bArr = {-110, -78, 101, 37, 89, 5};
        a(bArr, new byte[]{-47, 53, 125, -32, 84, 41, -61, 116});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(c0024h0, new String(bArr, charset).intern());
        byte[] bArr2 = {-46, -74, -5, -71, 66, -12};
        a(bArr2, new byte[]{117, -128, 46, 10, -39, -126, 36, -41});
        Intrinsics.checkNotNullParameter(deviceIdResult, new String(bArr2, charset).intern());
        c0024h0.a = deviceIdResult;
        c0024h0.c.countDown();
        return Unit.INSTANCE;
    }
}
