package com.aheaditec.talsec_security.security.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.biometric.BiometricManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.aheaditec.talsec.security.J;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.p1;
import com.aheaditec.talsec.security.y1;
import com.aheaditec.talsec.security.z1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class ThreatListener extends BroadcastReceiver {
    public static final a d;
    public static final String e;
    public static final String f;
    public static final String g;
    public final ThreatDetected a;
    public final DeviceState b;
    public final RaspExecutionState c;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BiometricState {
        public static final BiometricState ACTIVE;
        public static final BiometricState NONE_ENROLLED;
        public static final BiometricState NOT_AVAILABLE;
        public static final /* synthetic */ BiometricState[] a;
        public static final /* synthetic */ EnumEntries b;

        static {
            byte[] bArr = {-29, 18, -34, 65, 48, 37, 29, 35, 81, 42, -100, -89, -2};
            a(bArr, new byte[]{-85, -69, 111, -24, -85, 53, -100, 61, -5, -95, -97, -115, 110});
            Charset charset = StandardCharsets.UTF_8;
            BiometricState biometricState = new BiometricState(new String(bArr, charset).intern(), 0);
            NOT_AVAILABLE = biometricState;
            byte[] bArr2 = {36, 42, 45, -86, 87, -6, -19, -23, -40, 77, -54, -6, -76};
            a(bArr2, new byte[]{97, -16, 9, 119, 50, 65, -72, 65, -121, 104, 31, -97, -24});
            BiometricState biometricState2 = new BiometricState(new String(bArr2, charset).intern(), 1);
            NONE_ENROLLED = biometricState2;
            byte[] bArr3 = {91, -101, 63, 57, 59, -12};
            a(bArr3, new byte[]{108, -79, 109, -75, 27, 28, -110, 64});
            BiometricState biometricState3 = new BiometricState(new String(bArr3, charset).intern(), 2);
            ACTIVE = biometricState3;
            BiometricState[] biometricStateArr = {biometricState, biometricState2, biometricState3};
            a = biometricStateArr;
            b = EnumEntriesKt.enumEntries(biometricStateArr);
        }

        public BiometricState(String str, int i) {
        }

        public static final /* synthetic */ BiometricState[] a() {
            return new BiometricState[]{NOT_AVAILABLE, NONE_ENROLLED, ACTIVE};
        }

        public static EnumEntries<BiometricState> getEntries() {
            return b;
        }

        public static BiometricState valueOf(String str) {
            return (BiometricState) Enum.valueOf(BiometricState.class, str);
        }

        public static BiometricState[] values() {
            return (BiometricState[]) a.clone();
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
                        s2 = (short) (s2 - ((((short) ((sA << 4) + sArr[0])) ^ (((s | sA) - (((~sA) & 72) & s)) + ((sA | 72) & s))) ^ ((sA >>> 5) + sArr[1])));
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

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public interface DeviceState {
        void onADBEnabledDetected();

        void onDeveloperModeDetected();

        void onHardwareBackedKeystoreNotAvailableDetected();

        void onSystemVPNDetected();

        void onUnlockedDeviceDetected();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public static abstract class RaspExecutionState {
        public void onAllChecksFinished() {
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public interface ThreatDetected {
        void onDebuggerDetected();

        void onDeviceBindingDetected();

        void onEmulatorDetected();

        void onHookDetected();

        void onLocationSpoofingDetected();

        void onMalwareDetected(List<SuspiciousAppInfo> list);

        void onMultiInstanceDetected();

        void onObfuscationIssuesDetected();

        void onRootDetected();

        void onScreenRecordingDetected();

        void onScreenshotDetected();

        void onTamperDetected();

        void onTimeSpoofingDetected();

        void onUnsecureWifiDetected();

        void onUntrustedInstallationSourceDetected();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-62, -58, 4, 47, -89, 109, -69, -48, 59, 40, 111, 60};
        a(bArr, new byte[]{43, -11, 58, -58, 10, 9, 104, 108, -106, 91, -89, -47});
        Charset charset = StandardCharsets.UTF_8;
        g = new String(bArr, charset).intern();
        byte[] bArr2 = {86, -95, 25, 96, 69, -50, 97, 1, -74};
        a(bArr2, new byte[]{-77, -64, -51, -115, -74, -1, -110, 55, -9});
        f = new String(bArr2, charset).intern();
        byte[] bArr3 = {-63, 94, 90, -6, 73, 118, -26, 43, -123, -120, 96};
        a(bArr3, new byte[]{49, 13, -128, 15, -88, 32, 7, -57, -53, -50, 47});
        e = new String(bArr3, charset).intern();
        d = new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreatListener(ThreatDetected threatDetected) {
        this(threatDetected, null, null);
        byte[] bArr = {7, 34, 114, 5, -113, -94, 9};
        a(bArr, new byte[]{-33, 103, -106, 2, -18, -42, 122, -10});
        Intrinsics.checkNotNullParameter(threatDetected, new String(bArr, StandardCharsets.UTF_8).intern());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003f. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = null;
        int i2 = -1003175592;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
            int i6 = i2 >>> 8;
            int i7 = ~((((~i6) | (-1095531540)) | i5) - ((i6 & (-1095531540)) | i5));
            int i8 = (-1171264002) - ((i7 & 2) | ((-130029571) - i7));
            switch ((-1109882652) ^ ((~i8) + ((i8 | 1) * 2))) {
                case -1922532006:
                    int length2 = bArr4.length;
                    int i9 = 0 - length;
                    i2 = (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i9, -4, 1, length2), i9 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[L.a(0, (length2 & 2) | N.a(i9, -4, 1, length2), i9 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                    i3 = length;
                    break;
                case -1486048729:
                    int length3 = bArr.length;
                    int length4 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                    i2 = z ? z ? -1515449616 : 935800592 : -10521562;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i4 = 0;
                    break;
                case -497756741:
                    int length5 = bArr4.length;
                    int i10 = 0 - i3;
                    int i11 = ((length5 | i10) * 2) - (length5 ^ i10);
                    byte b = bArr3[i11];
                    int length6 = bArr4.length;
                    byte b2 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                    bArr3[i11] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                    i2 = 935800592;
                    break;
                case 256719606:
                    int i12 = (i4 - 1) - (i4 | (-4));
                    byte b3 = bArr3[i12];
                    int i13 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i14 = i4 + 2;
                    int i15 = i14 - (i4 & 2);
                    int i16 = bArr3[i15] & 255;
                    int i17 = i16 * ((~i16) & 65536);
                    int iA = J.a(i17, i13, 1, ((-1) - i17) | ((-1) - i13));
                    int i18 = i14 + (((-1) - i4) | (-2));
                    int i19 = bArr3[i18] & 255;
                    int i20 = i19 * ((~i19) & 256);
                    int i21 = (i20 - 1) - ((~iA) | i20);
                    int i22 = bArr3[i4] & 255;
                    int i23 = ~((i22 | ((~i21) | (-755325340))) - ((i21 & (-755325340)) | i22));
                    byte b4 = bArr4[i12];
                    int i24 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                    int i25 = bArr4[i15] & 255;
                    int i26 = i25 * ((~i25) & 65536);
                    int i27 = bArr4[i18] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = bArr4[i4] & 255;
                    int i30 = i23 << ((i23 > Double.NaN ? 1 : (i23 == Double.NaN ? 0 : -1)) >>> 31);
                    int i31 = (-659933419) - ((i24 & 2) | (1983400305 - i24));
                    int i32 = (i31 ^ (~i26)) + ((i31 | i26) * 2) + 1;
                    int i33 = (i32 ^ i29) + ((i32 & i29) * 2);
                    int i34 = ((i33 | i28) - (((-2109111237) & (~i28)) & i33)) + ((i28 | (-2109111237)) & i33);
                    int iA2 = y1.a(i30 | i34, 2, i30, i34);
                    bArr4[i4] = (byte) iA2;
                    bArr4[i18] = (byte) (iA2 >>> 8);
                    bArr4[i15] = (byte) (iA2 >>> 16);
                    bArr4[i12] = (byte) (iA2 >>> 24);
                    i4 = (i4 ^ 4) + ((i4 & 4) * 2);
                    int length7 = bArr4.length;
                    int length8 = 0 - (bArr4.length % 4);
                    int i35 = ((i4 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i4 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                    i2 = i35 != 0 ? -1515449616 : 935800592;
                    if (i35 == 0) {
                        i2 = -10521562;
                    }
                    break;
                case 1429728656:
                    length = bArr4.length % 4;
                    int i36 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i = i36 != 0 ? -1216566512 : 935800592;
                    i2 = i36 == 0 ? -1058029970 : i;
                    break;
                case 1870596681:
                    break;
                case 1879000533:
                    int length9 = bArr4.length;
                    int i37 = 0 - i3;
                    int i38 = 0 - i37;
                    int i39 = i38 | length9;
                    int i40 = (length9 ^ i38) ^ i39;
                    int i41 = i38 * 2;
                    int length10 = bArr4.length;
                    byte b5 = bArr4[(i38 ^ length10) - (((~length10) & i38) * 2)];
                    int length11 = bArr4.length;
                    byte b6 = bArr3[((i37 | length11) * 2) - (length11 ^ i37)];
                    bArr4[(i39 - i41) + i40] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
                    length = (~i3) + (i3 * 2);
                    int i42 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i42 != 0 ? -1216566512 : 935800592;
                    if (i42 == 0) {
                    }
                    break;
                default:
                    i2 = 935800592;
                    break;
            }
            return;
        }
    }

    public final BiometricState getBiometricState(Context context) {
        byte[] bArr = {4, -4, 46, -65, 31, 81, 27};
        a(bArr, new byte[]{-53, -122, -50, 85, 122, 41, 111, -32});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        int iCanAuthenticate = BiometricManager.from(context).canAuthenticate();
        return iCanAuthenticate != 0 ? iCanAuthenticate != 11 ? BiometricState.NOT_AVAILABLE : BiometricState.NONE_ENROLLED : BiometricState.ACTIVE;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        RaspExecutionState raspExecutionState;
        DeviceState deviceState;
        DeviceState deviceState2;
        DeviceState deviceState3;
        DeviceState deviceState4;
        DeviceState deviceState5;
        if (intent != null) {
            byte[] bArr = {85, 123, -15, 104, 36, -119, 58, -40, -13};
            a(bArr, new byte[]{-80, 38, 37, -124, -105, 50, -19, 110, -78});
            Charset charset = StandardCharsets.UTF_8;
            String stringExtra = intent.getStringExtra(new String(bArr, charset).intern());
            if (stringExtra == null) {
                return;
            }
            switch (stringExtra.hashCode()) {
                case -2000714514:
                    byte[] bArr2 = {-40, -85, 55, -25, -117, -54, 111, 118, -37, -23, 116, 10, 63};
                    a(bArr2, new byte[]{17, -20, -59, 61, 70, -15, -113, -85, 11, -74, -120, 15, 90});
                    if (stringExtra.equals(new String(bArr2, charset).intern())) {
                        this.a.onMultiInstanceDetected();
                        break;
                    }
                    break;
                case -1642813682:
                    byte[] bArr3 = {29, 127, 2, 77, 12, -89, -39, 55, 44, -30, -119, -51, -20, -66, -10, -79};
                    a(bArr3, new byte[]{-83, 3, 23, -50, -60, -3, 36, -12, -125, -65, -108, 64, -10, -59, 6, 115});
                    if (stringExtra.equals(new String(bArr3, charset).intern())) {
                        this.a.onLocationSpoofingDetected();
                        break;
                    }
                    break;
                case -1492991450:
                    byte[] bArr4 = {-117, 15, -74, 0, -113, -91, -30, 77, 53, -46, -13, 95};
                    a(bArr4, new byte[]{91, -108, 74, 6, 96, -29, 59, -33, -65, -42, 11, -91});
                    if (stringExtra.equals(new String(bArr4, charset).intern())) {
                        this.a.onTimeSpoofingDetected();
                        break;
                    }
                    break;
                case -1367123171:
                    byte[] bArr5 = {21, -60, -119, 48, 26, 4, -17, -121, -41, -24, 72, 121, -107, -115, 65, 49, 43};
                    a(bArr5, new byte[]{-42, -45, -99, -25, -51, -110, 1, -98, 18, -71, -44, -110, 74, 8, -58, -10, 88});
                    if (stringExtra.equals(new String(bArr5, charset).intern())) {
                        this.a.onObfuscationIssuesDetected();
                        break;
                    }
                    break;
                case -1226736817:
                    byte[] bArr6 = {-82, 90, 68, 97, -27, -40, 48, 100, -59, 15, -8, 52, 111};
                    a(bArr6, new byte[]{54, 45, -64, -86, -22, -93, -32, -81, 7, -103, 0, -7, 8});
                    if (stringExtra.equals(new String(bArr6, charset).intern())) {
                        this.a.onDeviceBindingDetected();
                        break;
                    }
                    break;
                case -881046147:
                    byte[] bArr7 = {-81, 0, 38, -69, -93, 85};
                    a(bArr7, new byte[]{39, -113, -6, 109, -58, 39, 58, 57});
                    if (stringExtra.equals(new String(bArr7, charset).intern())) {
                        this.a.onTamperDetected();
                        break;
                    }
                    break;
                case -748118530:
                    byte[] bArr8 = {108, -116, 111, -86, -84, 66, -68, -81, 44, -40, 9, 78, 46, -25, 54, 61, 20};
                    a(bArr8, new byte[]{113, 22, -115, 79, 56, 85, 77, 121, -93, -125, 18, -34, -69, -89, -64, -6, 112});
                    if (stringExtra.equals(new String(bArr8, charset).intern()) && (raspExecutionState = this.c) != null) {
                        raspExecutionState.onAllChecksFinished();
                    }
                    break;
                case -603894139:
                    byte[] bArr9 = {-22, 8, -85, 64, 40, 3, -21, -45, 8, 10, 55, -113};
                    a(bArr9, new byte[]{-5, -104, 111, -58, -81, -123, 46, 83, -5, -98, -50, -104});
                    if (stringExtra.equals(new String(bArr9, charset).intern())) {
                        this.a.onUnsecureWifiDetected();
                        break;
                    }
                    break;
                case -416447130:
                    byte[] bArr10 = {40, -17, -12, -96, 53, -60, -108, -115, 91, 68};
                    a(bArr10, new byte[]{-65, -65, 20, 102, -68, -33, 117, -104, 52, 48});
                    if (stringExtra.equals(new String(bArr10, charset).intern())) {
                        this.a.onScreenshotDetected();
                        break;
                    }
                    break;
                case -328950239:
                    byte[] bArr11 = {111, -93, -52, 127, -86, -15, 69, -109, 4, -118, 126, 18};
                    a(bArr11, new byte[]{99, -16, 77, -111, 45, -80, -45, -112, -9, 4, -107, 0});
                    if (stringExtra.equals(new String(bArr11, charset).intern()) && (deviceState = this.b) != null) {
                        deviceState.onUnlockedDeviceDetected();
                    }
                    break;
                case 3506402:
                    byte[] bArr12 = {119, -120, -19, 53};
                    a(bArr12, new byte[]{105, 25, 48, -20, -67, -82, -57, 47});
                    if (stringExtra.equals(new String(bArr12, charset).intern())) {
                        this.a.onRootDetected();
                        break;
                    }
                    break;
                case 95458899:
                    byte[] bArr13 = {-24, -30, 34, 19, -35};
                    a(bArr13, new byte[]{-24, -75, -10, 0, -70, 60, -73, 75});
                    if (stringExtra.equals(new String(bArr13, charset).intern())) {
                        this.a.onDebuggerDetected();
                        break;
                    }
                    break;
                case 99463088:
                    byte[] bArr14 = {118, 108, -4, 0, 89};
                    a(bArr14, new byte[]{114, 53, 1, 8, 42, -13, 83, 78});
                    if (stringExtra.equals(new String(bArr14, charset).intern())) {
                        this.a.onHookDetected();
                        break;
                    }
                    break;
                case 639597323:
                    byte[] bArr15 = {91, -75, -2, 11, -91, -109, -67, 27, 55, -90, -2, 42, 98, -26, 3, -51, 109, -95};
                    a(bArr15, new byte[]{-73, -11, 47, 12, 40, -30, 68, 27, -65, -52, 27, -24, 127, -89, 1, 64, 31, -60});
                    if (stringExtra.equals(new String(bArr15, charset).intern()) && (deviceState2 = this.b) != null) {
                        deviceState2.onHardwareBackedKeystoreNotAvailableDetected();
                    }
                    break;
                case 834063317:
                    byte[] bArr16 = {-39, -46, 84, -4, -86, -65, 53};
                    a(bArr16, new byte[]{16, -95, -86, 41, -53, -51, 80, -15});
                    if (stringExtra.equals(new String(bArr16, charset).intern())) {
                        byte[] bArr17 = {6, -109, 41, -100, 1, -43, -105, 84, -77, 92, 103, -84};
                        a(bArr17, new byte[]{-25, -63, -41, -87, -28, -112, 76, -24, 30, 4, -97, 65});
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(new String(bArr17, charset).intern());
                        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                            this.a.onMalwareDetected(parcelableArrayListExtra);
                            break;
                        }
                    }
                    break;
                case 1107986850:
                    byte[] bArr18 = {-2, -121, 42, -63, 127, -65, 43, -94, 22, 43};
                    a(bArr18, new byte[]{-61, 17, -2, 102, 77, -52, -1, 104, 115, 79});
                    if (stringExtra.equals(new String(bArr18, charset).intern()) && (deviceState3 = this.b) != null) {
                        deviceState3.onADBEnabledDetected();
                    }
                    break;
                case 1129117765:
                    byte[] bArr19 = {120, -121, -23, -19, 78, -75, -56, 56, -13};
                    a(bArr19, new byte[]{111, 12, 40, 36, -105, -49, 108, -53, -67});
                    if (stringExtra.equals(new String(bArr19, charset).intern()) && (deviceState4 = this.b) != null) {
                        deviceState4.onSystemVPNDetected();
                    }
                    break;
                case 1336193813:
                    byte[] bArr20 = {96, -52, 58, 105, 127, -125, 59, 7};
                    a(bArr20, new byte[]{97, -41, -39, -89, 66, 5, -62, 27});
                    if (stringExtra.equals(new String(bArr20, charset).intern())) {
                        this.a.onEmulatorDetected();
                        break;
                    }
                    break;
                case 1556684755:
                    byte[] bArr21 = {68, 41, -50, 34, 16, -100, 93, 29, 47, 120, -48, 83, -68, -44, 58, -42, -50, -101, 111, -103, -81, 89, -56, -51, 54, 27, -40};
                    a(bArr21, new byte[]{-99, 120, 52, -9, -63, -6, -69, 26, -73, 44, 44, -59, 20, -93, -64, 84, 19, -3, -120, -108, 61, 20, 85, 69, 68, 120, -67});
                    if (stringExtra.equals(new String(bArr21, charset).intern())) {
                        this.a.onUntrustedInstallationSourceDetected();
                        break;
                    }
                    break;
                case 1558978392:
                    byte[] bArr22 = {28, -22, -77, 57, -25, -121, 18};
                    a(bArr22, new byte[]{-92, -78, 83, -47, -120, -29, 119, 11});
                    if (stringExtra.equals(new String(bArr22, charset).intern()) && (deviceState5 = this.b) != null) {
                        deviceState5.onDeveloperModeDetected();
                    }
                    break;
                case 1580766949:
                    byte[] bArr23 = {-122, -107, 7, -51, 58, -35, -122, -101, -34, -77, 27, 92, 75, 103, 46};
                    a(bArr23, new byte[]{89, -32, 11, 74, -69, -92, -86, -104, -31, -50, -1, -38, 34, 9, 73});
                    if (stringExtra.equals(new String(bArr23, charset).intern())) {
                        this.a.onScreenRecordingDetected();
                        break;
                    }
                    break;
            }
        }
    }

    public final void registerListener(Context context) {
        byte[] bArr = {107, 76, 35, -10, 80, 114, 102};
        a(bArr, new byte[]{108, 85, -5, 44, 53, 10, 18, -13});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        byte[] bArr2 = {-82, 23, -116, -87, 96, -76, 11, -73, -55, 101, -98};
        a(bArr2, new byte[]{6, 68, -78, 88, 65, -31, 34, 80, -121, 35, -47});
        localBroadcastManager.registerReceiver(this, new IntentFilter(new String(bArr2, charset).intern()));
    }

    public final void unregisterListener(Context context) {
        byte[] bArr = {11, -32, -56, 19, -67, -74, -124};
        a(bArr, new byte[]{-52, -94, 84, 2, -40, -50, -16, 124});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreatListener(ThreatDetected threatDetected, DeviceState deviceState) {
        this(threatDetected, deviceState, null);
        byte[] bArr = {78, -55, -21, 127, -66, 99, -39};
        a(bArr, new byte[]{-122, -34, 47, -121, -33, 23, -86, -20});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(threatDetected, new String(bArr, charset).intern());
        byte[] bArr2 = {-79, -117, -47, -39, -128, -95, 34, -72, -21, 40, -87};
        a(bArr2, new byte[]{49, 28, 53, 85, 71, -22, -57, 110, -118, 92, -52});
        Intrinsics.checkNotNullParameter(deviceState, new String(bArr2, charset).intern());
    }

    public ThreatListener(ThreatDetected threatDetected, DeviceState deviceState, RaspExecutionState raspExecutionState) {
        byte[] bArr = {-57, 51, 82, -105, -128, -28, 19};
        a(bArr, new byte[]{31, 73, -74, -100, -31, -112, 96, 26});
        Intrinsics.checkNotNullParameter(threatDetected, new String(bArr, StandardCharsets.UTF_8).intern());
        this.a = threatDetected;
        this.b = deviceState;
        this.c = raspExecutionState;
    }
}
