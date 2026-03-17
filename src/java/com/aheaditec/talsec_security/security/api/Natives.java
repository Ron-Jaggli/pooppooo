package com.aheaditec.talsec_security.security.api;

import android.content.Context;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.p1;
import com.aheaditec.talsec.security.z1;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class Natives {
    public static final Natives INSTANCE = new Natives();

    static {
        byte[] bArr = {-59, 111, 103, -118, -53};
        a(bArr, new byte[]{-81, -87, 20, 55, 116, -25, 49, 12});
        System.loadLibrary(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        short[] sArr = null;
        byte b = -1740520186;
        int length = 0;
        int length2 = 0;
        short s = 0;
        short s2 = 0;
        short sA = 0;
        int i = 0;
        while (true) {
            switch (b) {
                case -2143294076:
                    b = length < length2 ? (byte) -1809249287 : (byte) 974072829;
                    break;
                case -2038999444:
                    int i2 = ((short) ((s2 << 4) + sArr[2])) ^ (s2 + s);
                    short s3 = sArr[3];
                    int i3 = -(s2 >>> 5);
                    int i4 = i3 | s3;
                    int i5 = (i4 - (i3 * 2)) + ((i3 ^ s3) ^ i4);
                    int i6 = -z1.a(i5 | (~i2), 2, i5 - i2, 2);
                    sA = (short) O.a(sA, 3, -(N.a(sA, -4, 1, i6) | (i6 & 2)), 1);
                    s2 = (short) (s2 - ((((short) ((sA << 4) + sArr[0])) ^ (((s | sA) - (((~sA) & 50) & s)) + ((sA | 50) & s))) ^ ((sA >>> 5) + sArr[1])));
                    s = (short) (s - 40503);
                    i++;
                    b = 2093236949;
                    break;
                case -1809249287:
                    byte b2 = bArr[length];
                    s2 = (short) (((bArr[((length & 1) * 2) + (length ^ 1)] & 255) << 8) | ((255 - (b2 | 255)) + b2));
                    int i7 = -length;
                    int i8 = i7 | 2;
                    sA = (short) ((bArr[(i8 - (i7 * 2)) + ((i7 ^ 2) ^ i8)] & 255) | ((bArr[length + 3] & 255) << 8));
                    s = -14624;
                    i = 0;
                    b = 2093236949;
                    break;
                case -1740520186:
                    sArr = new short[4];
                    length = 0;
                    b = 766056152;
                    break;
                case -1489518479:
                    sArr[length] = (short) ((bArr2[((2 & (~length)) * (length & (-3))) + ((length & 2) * (length | 2))] & 255) ^ ((bArr2[(length * 2) + 1] & 255) << 8));
                    length++;
                    b = 766056152;
                    break;
                case -473033593:
                    int i9 = -length;
                    int i10 = -bArr.length;
                    int i11 = i10 | i9;
                    bArr[(i11 - (i10 * 2)) + ((i10 ^ i9) ^ i11)] = (byte) (bArr[bArr.length - length] ^ bArr2[length % 8]);
                    length--;
                    b = 1734050766;
                    break;
                case 766056152:
                    b = length < 4 ? (byte) -1489518479 : (byte) 998066383;
                    break;
                case 974072829:
                    length = bArr.length % 4;
                    b = 1734050766;
                    break;
                case 998066383:
                    length2 = bArr.length - (bArr.length % 4);
                    length = 0;
                    b = -2143294076;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    b = length > 0 ? (byte) -473033593 : (byte) 1314339506;
                    break;
                case 1771480224:
                    bArr[length] = (byte) (s2 & 255);
                    bArr[length + 1] = (byte) ((s2 >> 8) & p1.h);
                    bArr[length + 2] = (byte) (sA & 255);
                    bArr[length + 3] = (byte) ((sA >> 8) & p1.h);
                    length += 4;
                    b = -2143294076;
                    break;
                case 2093236949:
                    b = i < 32 ? (byte) -2038999444 : (byte) 1771480224;
                    break;
                default:
                    b = 2093236949;
                    break;
            }
            return;
        }
    }

    public final void start(Context context) {
        byte[] bArr = {-26, -1, 8, 2, 83, -1, 83};
        a(bArr, new byte[]{-101, 39, -121, 54, -36, -115, 35, -36});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        start(context, false);
    }

    public final native void start(Context context, boolean z);

    public final native void stop();
}
