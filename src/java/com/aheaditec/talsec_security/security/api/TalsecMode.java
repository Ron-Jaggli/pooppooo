package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.p1;
import com.aheaditec.talsec.security.z1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class TalsecMode {
    public static final TalsecMode BACKGROUND;
    public static final TalsecMode FOREGROUND;
    public static final /* synthetic */ TalsecMode[] a;
    public static final /* synthetic */ EnumEntries b;

    static {
        byte[] bArr = {-122, 12, -92, -88, 61, -88, -10, -23, -81, -15};
        a(bArr, new byte[]{113, -75, -31, -126, 127, 35, 72, -52, -39, -89});
        Charset charset = StandardCharsets.UTF_8;
        TalsecMode talsecMode = new TalsecMode(new String(bArr, charset).intern(), 0);
        FOREGROUND = talsecMode;
        byte[] bArr2 = {-111, 27, 95, -115, -93, -97, -56, 45, 91, 66};
        a(bArr2, new byte[]{-8, 6, 21, 99, -87, 18, 97, 96, -31, 90});
        TalsecMode talsecMode2 = new TalsecMode(new String(bArr2, charset).intern(), 1);
        BACKGROUND = talsecMode2;
        TalsecMode[] talsecModeArr = {talsecMode, talsecMode2};
        a = talsecModeArr;
        b = EnumEntriesKt.enumEntries(talsecModeArr);
    }

    public TalsecMode(String str, int i) {
    }

    public static final /* synthetic */ TalsecMode[] a() {
        return new TalsecMode[]{FOREGROUND, BACKGROUND};
    }

    public static EnumEntries<TalsecMode> getEntries() {
        return b;
    }

    public static TalsecMode valueOf(String str) {
        return (TalsecMode) Enum.valueOf(TalsecMode.class, str);
    }

    public static TalsecMode[] values() {
        return (TalsecMode[]) a.clone();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        short[] sArr = null;
        byte b2 = -1740520186;
        int length = 0;
        int length2 = 0;
        short s = 0;
        short s2 = 0;
        short sA = 0;
        int i = 0;
        while (true) {
            switch (b2) {
                case -2143294076:
                    b2 = length < length2 ? (byte) -1809249287 : (byte) 974072829;
                    break;
                case -2038999444:
                    int i2 = ((short) ((s2 << 4) + sArr[2])) ^ (s2 + s);
                    short s3 = sArr[3];
                    int i3 = -(s2 >>> 5);
                    int i4 = i3 | s3;
                    int i5 = (i4 - (i3 * 2)) + ((i3 ^ s3) ^ i4);
                    int i6 = -z1.a(i5 | (~i2), 2, i5 - i2, 2);
                    sA = (short) O.a(sA, 3, -(N.a(sA, -4, 1, i6) | (i6 & 2)), 1);
                    s2 = (short) (s2 - ((((short) ((sA << 4) + sArr[0])) ^ (((s | sA) - (((~sA) & 53) & s)) + ((sA | 53) & s))) ^ ((sA >>> 5) + sArr[1])));
                    s = (short) (s - 40503);
                    i++;
                    b2 = 2093236949;
                    break;
                case -1809249287:
                    byte b3 = bArr[length];
                    s2 = (short) (((bArr[((length & 1) * 2) + (length ^ 1)] & 255) << 8) | ((255 - (b3 | 255)) + b3));
                    int i7 = -length;
                    int i8 = i7 | 2;
                    sA = (short) ((bArr[(i8 - (i7 * 2)) + ((i7 ^ 2) ^ i8)] & 255) | ((bArr[length + 3] & 255) << 8));
                    s = -14624;
                    i = 0;
                    b2 = 2093236949;
                    break;
                case -1740520186:
                    sArr = new short[4];
                    length = 0;
                    b2 = 766056152;
                    break;
                case -1489518479:
                    sArr[length] = (short) ((bArr2[((2 & (~length)) * (length & (-3))) + ((length & 2) * (length | 2))] & 255) ^ ((bArr2[(length * 2) + 1] & 255) << 8));
                    length++;
                    b2 = 766056152;
                    break;
                case -473033593:
                    int i9 = -length;
                    int i10 = -bArr.length;
                    int i11 = i10 | i9;
                    bArr[(i11 - (i10 * 2)) + ((i10 ^ i9) ^ i11)] = (byte) (bArr[bArr.length - length] ^ bArr2[length % 8]);
                    length--;
                    b2 = 1734050766;
                    break;
                case 766056152:
                    b2 = length < 4 ? (byte) -1489518479 : (byte) 998066383;
                    break;
                case 974072829:
                    length = bArr.length % 4;
                    b2 = 1734050766;
                    break;
                case 998066383:
                    length2 = bArr.length - (bArr.length % 4);
                    length = 0;
                    b2 = -2143294076;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    b2 = length > 0 ? (byte) -473033593 : (byte) 1314339506;
                    break;
                case 1771480224:
                    bArr[length] = (byte) (s2 & 255);
                    bArr[length + 1] = (byte) ((s2 >> 8) & p1.h);
                    bArr[length + 2] = (byte) (sA & 255);
                    bArr[length + 3] = (byte) ((sA >> 8) & p1.h);
                    length += 4;
                    b2 = -2143294076;
                    break;
                case 2093236949:
                    b2 = i < 32 ? (byte) -2038999444 : (byte) 1771480224;
                    break;
                default:
                    b2 = 2093236949;
                    break;
            }
            return;
        }
    }
}
