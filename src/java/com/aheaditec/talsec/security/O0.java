package com.aheaditec.talsec.security;

import android.R;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class O0 implements InterfaceC0061y0 {
    public final Set<N0> a;

    public O0(Set<N0> set) {
        this.a = set;
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
        int i6 = ~"com.aheaditec.talsec.security.O0".length();
        int length4 = (((~((("com.aheaditec.talsec.security.O0".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.O0".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.O0".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i7 = -1;
        int iA2 = B1.a(O0.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.O0".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.O0".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.O0".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.O0".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.O0".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i8 = ((~"com.aheaditec.talsec.security.O0".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.O0".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & 1040)) + i8);
        int length9 = ((((~"com.aheaditec.talsec.security.O0".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.O0".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i9 = ((~"com.aheaditec.talsec.security.O0".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.O0".length();
        int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i10) {
                case -2143294076:
                    int i11 = ~"com.aheaditec.talsec.security.O0".length();
                    if (length4 >= length5) {
                        length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.O0".length() & 1073807362) | 1116733474);
                        i = -375509041;
                        i10 = i ^ length;
                        i7 = -1;
                    } else {
                        int length11 = ("com.aheaditec.talsec.security.O0".length() & 268439810) | 285217280;
                        int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                        i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                        i7 = -1;
                    }
                    break;
                case -2038999444:
                    int i13 = ~"com.aheaditec.talsec.security.O0".length();
                    int length12 = (((((("com.aheaditec.talsec.security.O0".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.O0".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.O0".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << y1.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.O0".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.O0".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i14 = ~"com.aheaditec.talsec.security.O0".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.O0".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.O0".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.O0".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.O0".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.O0".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i15 = -length13;
                    int i16 = i15 | s;
                    int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                    int i18 = -z1.a(i17 | (~iA4), 2, i17 - iA4, 2);
                    length7 = (short) O.a(length7, 3, -(N.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                    int i19 = ((~"com.aheaditec.talsec.security.O0".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.O0".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.O0".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.O0".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.O0".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.O0".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.O0".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.O0".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.O0".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.O0".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i20 = ((~"com.aheaditec.talsec.security.O0".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.O0".length() & 403838542) | 268582982;
                    int i21 = -i20;
                    int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                    iA3 = (short) x1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.O0".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.O0".length() & 150995145) | 140771329);
                    i = 1965034008;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
                case -1809249287:
                    byte b = bArr[(((((~"com.aheaditec.talsec.security.O0".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.O0".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.O0".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.O0".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.O0".length() | length16) - (b | length16)) + B1.a(O0.class, b) + ("com.aheaditec.talsec.security.O0".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.O0".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.O0".length() & 786435) | 8921603)) ^ 447505026;
                    byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i23 = ~"com.aheaditec.talsec.security.O0".length();
                    length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.O0".length() | (-2105278367)) - (i23 | (-1545180443))) + (B1.a(O0.class, 568748773 | i23) + ("com.aheaditec.talsec.security.O0".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.O0".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.O0".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.O0".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i24 = ~"com.aheaditec.talsec.security.O0".length();
                    int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.O0".length() & 144806464) | 136645376));
                    int i25 = -length4;
                    int i26 = i25 | length19;
                    byte b3 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                    int i27 = (((-199685676) | r8) - 1591672428) - ((~"com.aheaditec.talsec.security.O0".length()) | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.O0".length() & 23072776) | 272636008;
                    int length21 = b3 & ((-1319036669) ^ (((length20 | i27) - (("com.aheaditec.talsec.security.O0".length() & (~i27)) & length20)) + (length20 & (i27 | "com.aheaditec.talsec.security.O0".length()))));
                    int i28 = ((~"com.aheaditec.talsec.security.O0".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.O0".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i28) + (i28 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.O0".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.O0".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.O0".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.O0".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i29 = ~"com.aheaditec.talsec.security.O0".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i29) + 311432716) - (i29 | (-1074391060))) + (("com.aheaditec.talsec.security.O0".length() & 273678921) | (-1069545407)));
                    int i30 = ~"com.aheaditec.talsec.security.O0".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.O0".length() & (~i30)) & 91135407) + 91135407) + i30) - ((i30 | "com.aheaditec.talsec.security.O0".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.O0".length() & (-804257776)) | (-2094006112);
                    int i31 = -length25;
                    length9 = (-684063310) ^ (((~i31) & length26) - (i31 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.O0".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.O0".length() & 674768897) | 153626665);
                    i2 = 1174056570 - length2;
                    i3 = -1174056571;
                    i10 = ((length2 & i3) * 2) + i2;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.O0".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.O0".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.O0".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.O0".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i32 = ((~"com.aheaditec.talsec.security.O0".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.O0".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.O0".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.O0".length()) & 4218888)) + i32;
                    i4 = 434661073;
                    i10 = i4 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.O0".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.O0".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.O0".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.O0".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i33 = ~"com.aheaditec.talsec.security.O0".length();
                    int i34 = 73539736 & (((~i33) & (-1772650326)) + i33);
                    int length31 = ("com.aheaditec.talsec.security.O0".length() & 35664144) | 33608448;
                    int i35 = -i34;
                    byte b4 = bArr2[((107148186 ^ ((((~i35) & length31) * 2) - (i35 ^ length31))) * length4) + ((((B1.a(O0.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.O0".length() & 532546) | 1602)) ^ 67642971)];
                    int i36 = ~"com.aheaditec.talsec.security.O0".length();
                    int length32 = (b4 & (((663757504 & ((i36 + 1314070430) - (i36 & 1314070430))) + (("com.aheaditec.talsec.security.O0".length() & 834674756) | 272630796)) ^ 936388147)) << ((((B1.a(O0.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.O0".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((B1.a(O0.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.O0".length() & 159661328) | (-2004872944));
                    i5 = -533943416;
                    i10 = iA ^ i5;
                    break;
                case -473033593:
                    int i37 = -length4;
                    int i38 = -bArr.length;
                    int i39 = i38 | i37;
                    int i40 = (i39 - (i38 * 2)) + ((i38 ^ i37) ^ i39);
                    byte b5 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.O0".length();
                    bArr[i40] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.O0".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (B1.a(O0.class, i7) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.O0".length() & 1074544770;
                    iA = J.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i5 = 836032333;
                    i10 = iA ^ i5;
                    break;
                case 766056152:
                    int i41 = ((~"com.aheaditec.talsec.security.O0".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.O0".length();
                    int i42 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i42) & 608439588) + i42) + i41))) {
                        int i43 = ((~"com.aheaditec.talsec.security.O0".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.O0".length() & 268589089) | 661640;
                        iA = M.a(i43 | length36, 2, (~i43) ^ length36, 1);
                        i5 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.O0".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.O0".length() & 1074350177) | 1342720098);
                        i5 = -887872332;
                    }
                    i10 = iA ^ i5;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i44 = ((~"com.aheaditec.talsec.security.O0".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.O0".length() & 251684176) | 1694512896;
                    int i45 = -i44;
                    length4 = length37 % (1864794098 ^ (((~i45) & length38) - (i45 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.O0".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.O0".length() & (-1878240248)) | 285229064);
                    i5 = -195569723;
                    i10 = iA ^ i5;
                    break;
                case 998066383:
                    length4 = (((B1.a(O0.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.O0".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.O0".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.O0".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.O0".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.O0".length() & (-1860698094)) | (-1190123008));
                    i5 = 1002689495;
                    i10 = iA ^ i5;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i46 = ~"com.aheaditec.talsec.security.O0".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.O0".length() & R.^attr-private.__removed0) | 553664516;
                        int i47 = -((i46 | 1510858717) & 403833600);
                        length3 = ((~i47) & length39) - (i47 & (~length39));
                        i4 = 2001041846;
                        i10 = i4 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.O0".length();
                        iA = ((i46 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i5 = -115901203;
                        i10 = iA ^ i5;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.O0".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.O0".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.O0".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.O0".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.O0".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.O0".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i48 = ((~"com.aheaditec.talsec.security.O0".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.O0".length();
                    bArr[length41] = (byte) ((length6 >> ((i48 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.O0".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.O0".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.O0".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.O0".length() & 196644) | (-2146430752));
                    int iA6 = A1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i49 = ((~"com.aheaditec.talsec.security.O0".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.O0".length();
                    int i50 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i51 = -i49;
                    bArr[iA6] = (byte) ((w1.a(~i51, i50, 2, (i50 + i51) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.O0".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.O0".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i52 = ~"com.aheaditec.talsec.security.O0".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.O0".length() | 674349280) - (i52 | 1869872636)) + (B1.a(O0.class, 1197735420 | i52) + ("com.aheaditec.talsec.security.O0".length() & 674349280))) + (("com.aheaditec.talsec.security.O0".length() & 1754529808) | 1418461202)));
                    int i53 = ((~"com.aheaditec.talsec.security.O0".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.O0".length() & 545800290) | (-1442676670);
                    int i54 = -i53;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i54) & length47) - (i54 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.O0".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.O0".length() & 33562640) | 136194);
                    i5 = -1824662634;
                    i10 = iA ^ i5;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.O0".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.O0".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i55 = ~"com.aheaditec.talsec.security.O0".length();
                        iA = (1141965102 & ((-1207265904) + i55 + (((-i55) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.O0".length() & 1292960864) | 150996032);
                        i5 = 612868558;
                        i10 = iA ^ i5;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.O0".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.O0".length() & 874653185) | 335552516);
                        i2 = (-1287294623) - length2;
                        i3 = 1287294622;
                        i10 = ((length2 & i3) * 2) + i2;
                    }
                    break;
                default:
                    int i56 = ~"com.aheaditec.talsec.security.O0".length();
                    int i57 = (((-313266948) | i56) + 45165696) - (i56 | (-269226756));
                    length = O.a(i57, 3, -N.a(i57, -4, 1, ("com.aheaditec.talsec.security.O0".length() & 44040224) | (-1811807712)), 1);
                    i = -361272203;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
            }
            return;
        }
    }

    @Override // com.aheaditec.talsec.security.InterfaceC0061y0
    public void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB;
        byte[] bArr = {-46, -106, 120, -40};
        a(bArr, new byte[]{-9, -110, -115, 54, -43, -55, 115, -121});
        Intrinsics.checkNotNullParameter(jSONObject, new String(bArr, StandardCharsets.UTF_8).intern());
        JSONArray jSONArray = new JSONArray();
        Set<N0> set = this.a;
        if (set != null) {
            for (N0 n0 : set) {
                if (n0 != null && (jSONObjectB = n0.b()) != null) {
                    jSONArray.put(jSONObjectB);
                }
            }
        }
        byte[] bArr2 = {-89, -21, -73, -17, -26, 108, 61, 26, 119, -86, 10, 31, -115, 93, -1};
        a(bArr2, new byte[]{121, -116, 56, -22, 114, 97, -62, 126, -109, 15, 106, 5, -77, 89, 29});
        jSONObject.put(new String(bArr2, StandardCharsets.UTF_8).intern(), jSONArray);
    }
}
