package com.aheaditec.talsec.security;

import android.R;
import android.content.Context;
import com.aheaditec.talsec.security.InterfaceC0047r0;
import com.aheaditec.talsec_security.security.api.Talsec;
import com.aheaditec.talsec_security.security.api.TalsecConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class s1 implements Z {
    public static final b h = new b(null);
    public final CoroutineScope a;
    public C0028i1 b;
    public R0 c;
    public E1 d;
    public l1 e;
    public G1 f;
    public ScheduledFuture<?> g;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    @DebugMetadata(c = "com.aheaditec.talsec_security.security.runner.TalsecScheduler$initiateMalwareScanningAsync$1", f = "TalsecScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ s1 c;
        public final /* synthetic */ TalsecConfig d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, s1 s1Var, TalsecConfig talsecConfig, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = s1Var;
            this.d = talsecConfig;
        }

        public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        public Object invoke(Object obj, Object obj2) {
            return create((CoroutineScope) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                byte[] bArr = {49, 92, 102, 15, 26, 117, -10, 67, 29, -120, -23, 94, 115, 74, 47, 93, -107, 48, 23, 36, -120, 119, 3, -17, 10, -29, -105, -122, -15, -70, -58, 99, -64, 103, 42, 21, -73, 103, -92, 72, 7, -16, 95, -83, -28, -14, 96};
                a(bArr, new byte[]{82, 61, 10, 99, 58, 1, -103, 99, 58, -6, -116, 45, 6, 39, 74, 122, -75, 82, 114, 66, -25, 5, 102, -49, 45, -118, -7, -16, -98, -47, -93, 68, -32, 16, 67, 97, -33, 71, -57, 39, 117, -97, 42, -39, -115, -100, 5});
                throw new IllegalStateException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            ResultKt.throwOnFailure(obj);
            C0004a1.a.a(this.b);
            l1 l1Var = this.c.e;
            l1 l1Var2 = null;
            if (l1Var == null) {
                byte[] bArr2 = {105, 114, 35, 25, -110, 73, -28, 80, -36};
                a(bArr2, new byte[]{13, 23, 87, 124, -15, 61, -117, 34, -81});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, StandardCharsets.UTF_8).intern());
                l1Var = null;
            }
            l1Var.a(K0.b.a(this.d), null);
            l1 l1Var3 = this.c.e;
            if (l1Var3 == null) {
                byte[] bArr3 = {5, -104, -10, -120, 98, 113, -20, 87, 32};
                a(bArr3, new byte[]{97, -3, -126, -19, 1, 5, -125, 37, 83});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, StandardCharsets.UTF_8).intern());
            } else {
                l1Var2 = l1Var3;
            }
            M0 m0 = l1Var2.u;
            if (m0 != null) {
                m0.a(this.b);
            }
            return Unit.INSTANCE;
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

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    @DebugMetadata(c = "com.aheaditec.talsec_security.security.runner.TalsecScheduler$runNonCriticalChecksAsync$1", f = "TalsecScheduler.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, long j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = j;
        }

        public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s1.this.new d(this.c, this.d, continuation);
        }

        public Object invoke(Object obj, Object obj2) {
            return create((CoroutineScope) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            R0 r0 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                l1 l1Var = s1.this.e;
                if (l1Var == null) {
                    byte[] bArr = {-36, 114, 43, -51, -82, -30, 91, -74, 23};
                    a(bArr, new byte[]{-72, 23, 95, -88, -51, -106, 52, -60, 100});
                    Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
                    l1Var = null;
                }
                List<InterfaceC0006b0> listC = l1Var.c();
                byte[] bArr2 = {92, 30, 53, 28, -39, -20, 8, 11, -66, -42, 92, 108, 37, -128, 59, 83, -37};
                a(bArr2, new byte[]{59, 123, 65, 88, -68, -104, 109, 104, -54, -71, 46, 31, 13, -82, 21, 125, -14});
                Intrinsics.checkNotNullExpressionValue(listC, new String(bArr2, StandardCharsets.UTF_8).intern());
                Context context = this.c;
                for (InterfaceC0006b0 interfaceC0006b0 : (ArrayList) listC) {
                    if (interfaceC0006b0 != null) {
                        interfaceC0006b0.a(context);
                    }
                }
                s1.this.d();
                l1 l1Var2 = s1.this.e;
                if (l1Var2 == null) {
                    byte[] bArr3 = {-21, -15, 44, -1, 45, -105, 87, 47, 82};
                    a(bArr3, new byte[]{-113, -108, 88, -102, 78, -29, 56, 93, 33});
                    Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, StandardCharsets.UTF_8).intern());
                    l1Var2 = null;
                }
                l1Var2.a.e(this.c);
                E1 e1 = s1.this.d;
                if (e1 == null) {
                    byte[] bArr4 = {-7, -31, 109, -20, 21, 57, -66, -72};
                    a(bArr4, new byte[]{-117, -124, 12, -113, 97, 80, -47, -42});
                    Intrinsics.throwUninitializedPropertyAccessException(new String(bArr4, StandardCharsets.UTF_8).intern());
                    e1 = null;
                }
                e1.c();
                s1 s1Var = s1.this;
                Context context2 = this.c;
                long j = this.d;
                this.a = 1;
                if (s1Var.a(context2, j, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    byte[] bArr5 = {-16, -55, 10, 83, 124, -65, -38, -11, -27, 107, 0, 64, 3, 56, -105, 28, -84, -30, 73, 41, -64, 85, -29, -63, 122, 82, -88, 2, 112, -56, 97, -30, -112, 51, 114, -9, -103, -101, -14, 109, 6, -17, -48, 65, -92, -128, -38};
                    a(bArr5, new byte[]{-109, -88, 102, 63, 92, -53, -75, -43, -62, 25, 101, 51, 118, 85, -14, 59, -116, -128, 44, 79, -81, 39, -122, -31, 93, 59, -58, 116, 31, -93, 4, -59, -80, 68, 27, -125, -15, -69, -111, 2, 116, -128, -91, 53, -51, -18, -65});
                    throw new IllegalStateException(new String(bArr5, StandardCharsets.UTF_8).intern());
                }
                ResultKt.throwOnFailure(obj);
            }
            R0 r02 = s1.this.c;
            if (r02 == null) {
                byte[] bArr6 = {104, 7, -64, -50, -23, 66};
                a(bArr6, new byte[]{4, 104, -89, -87, -116, 48, -42, 99});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr6, StandardCharsets.UTF_8).intern());
            } else {
                r0 = r02;
            }
            r0.a(this.c);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            int i;
            byte[] bArr3 = null;
            int i2 = -585497720;
            int i3 = 0;
            int i4 = 0;
            int length = 0;
            byte[] bArr4 = null;
            while (true) {
                int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
                int i6 = i2 >>> 8;
                int i7 = ~((((~i6) | (-238348293)) | i5) - ((i6 & (-238348293)) | i5));
                int i8 = (-1081514022) - ((i7 & 2) | ((-10362931) - i7));
                int iA = y1.a(i8 | (-428181225), 2, i8, -428181225);
                int i9 = -1057239115;
                switch (iA) {
                    case -1819084085:
                        int length2 = bArr3.length;
                        int i10 = 0 - i3;
                        int length3 = bArr3.length;
                        int i11 = 0 - i10;
                        byte b = bArr3[(length3 & (~i11)) - ((~length3) & i11)];
                        int length4 = bArr3.length;
                        byte b2 = bArr4[((length4 | i10) - (((-1678010279) & (~i10)) & length4)) + ((i10 | (-1678010279)) & length4)];
                        bArr3[((length2 | i10) * 2) - (length2 ^ i10)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - b2)) - b);
                        length = 4 - ((5 - i3) | (i3 & 2));
                        int i12 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                        int i13 = i12 != 0 ? 2100390411 : -897645243;
                        if (i12 == 0) {
                            i = -2079636786;
                            i2 = i;
                        } else {
                            i2 = i13;
                        }
                        break;
                    case -1350640889:
                        int length5 = bArr.length;
                        int length6 = 0 - (bArr.length % 4);
                        boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                        i = z ? -1469476344 : z ? -897645243 : 1251644638;
                        bArr4 = bArr2;
                        bArr3 = bArr;
                        i4 = 0;
                        i2 = i;
                        break;
                    case -477594107:
                        int length7 = bArr3.length;
                        int i14 = 0 - i3;
                        int i15 = ((length7 | i14) - (((-515406864) & (~i14)) & length7)) + ((i14 | (-515406864)) & length7);
                        byte b3 = bArr4[i15];
                        int length8 = bArr3.length;
                        byte b4 = bArr4[((i14 | length8) * 2) - (length8 ^ i14)];
                        int i16 = ((byte) 0) - b3;
                        int i17 = i16 | b4;
                        bArr4[i15] = (byte) (((byte) (((byte) i17) - ((byte) (((byte) 2) * ((byte) i16))))) + ((byte) ((b4 ^ i16) ^ i17)));
                        i2 = i9;
                        break;
                    case 769572960:
                        break;
                    case 783648904:
                        int i18 = i4 + 4 + (((-1) - i4) | (-4));
                        byte b5 = bArr4[i18];
                        int i19 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                        int i20 = i4 & 2;
                        int i21 = (i4 + 2) - i20;
                        int i22 = bArr4[i21] & 255;
                        int i23 = i22 * ((~i22) & 65536);
                        int i24 = ~(((467314697 | (~i23)) | i19) - ((i23 & 467314697) | i19));
                        int i25 = (i4 + 1) - (i4 & 1);
                        int i26 = bArr4[i25] & 255;
                        int i27 = i26 * ((~i26) & 256);
                        int i28 = ~((i24 | ((~i27) | 1328859631)) - ((i27 & 1328859631) | i24));
                        int i29 = bArr4[i4] & 255;
                        int iA2 = J.a(i28, i29, 1, ((-1) - i28) | ((-1) - i29));
                        byte b6 = bArr3[i18];
                        int i30 = ((b6 & 16777216) * (b6 | 16777216)) + (((-16777217) & b6) * ((~b6) & 16777216));
                        int i31 = bArr3[i21] & 255;
                        int i32 = i31 * ((~i31) & 65536);
                        int iA3 = K.a((~i30) & 1647046022 & i32, i32, i30, (1647046022 | i30) & i32);
                        int i33 = bArr3[i25] & 255;
                        int i34 = i33 * ((~i33) & 256);
                        int i35 = ~((iA3 | ((~i34) | (-2059442874))) - (((-2059442874) & i34) | iA3));
                        int i36 = bArr3[i4] & 255;
                        int iA4 = J.a(i35, i36, 1, ((-1) - i35) | ((-1) - i36));
                        int i37 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                        int i38 = (i37 + iA4) - ((i37 & iA4) * 2);
                        bArr3[i4] = (byte) i38;
                        bArr3[i25] = (byte) (i38 >>> 8);
                        bArr3[i21] = (byte) (i38 >>> 16);
                        bArr3[i18] = (byte) (i38 >>> 24);
                        i4 = (-11) - (((-15) - i4) | i20);
                        int length9 = bArr3.length;
                        int iA5 = C0001a.a(bArr3.length, 4, 0, 0);
                        int i39 = ((i4 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i4 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                        i2 = i39 != 0 ? -897645243 : 1251644638;
                        if (i39 != 0) {
                            i2 = -1469476344;
                        }
                        break;
                    case 1758587480:
                        int length10 = bArr3.length;
                        int i40 = 0 - length;
                        i2 = (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                        i3 = length;
                        break;
                    case 2013813686:
                        length = bArr3.length % 4;
                        int i41 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i9 = i41 != 0 ? 2100390411 : -897645243;
                        if (i41 == 0) {
                            i = -2079636786;
                            i2 = i;
                        } else {
                            i2 = i9;
                        }
                        break;
                    default:
                        i2 = -897645243;
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
    @DebugMetadata(c = "com.aheaditec.talsec_security.security.runner.TalsecScheduler$schedulePeriodicTask$2", f = "TalsecScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, long j, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = j;
        }

        public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s1.this.new e(this.c, this.d, continuation);
        }

        public Object invoke(Object obj, Object obj2) {
            return create((CoroutineScope) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                byte[] bArr = {-23, 9, -78, 64, 121, 22, 119, -85, 114, 45, -15, 80, 96, -65, 103, -33, -3, 37, -109, -20, -66, -5, -73, -47, 66, 1, 8, -105, -117, 22, 32, -91, -26, -7, -56, 19, -5, -53, 65, -69, 10, -16, 2, 12, -34, 123, 89};
                a(bArr, new byte[]{115, -104, -56, 69, 66, -110, 2, -92, 62, -113, 126, 60, -2, 1, -19, 16, -58, 119, -32, -93, -70, -71, -68, 10, 78, -104, 80, -6, -51, -83, 47, -101, -81, -66, -117, -128, 124, 27, 13, -19, 97, -49, 97, -111, -73, 21, 60});
                throw new IllegalStateException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            ResultKt.throwOnFailure(obj);
            Runnable runnableA = s1.this.a(this.c);
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            s1 s1Var = s1.this;
            long j = this.d;
            s1Var.g = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(runnableA, j, j, TimeUnit.SECONDS);
            return Unit.INSTANCE;
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

    static {
        byte[] bArr = {81, -54, 91, -67, 126, 2, 97, 67};
        a(bArr, new byte[]{16, -103, -66, -34, -60, 90, 33, 100});
        System.loadLibrary(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public s1(Context context, u1 u1Var, String str, InterfaceC0057w0 interfaceC0057w0, InterfaceC0047r0 interfaceC0047r0, TalsecConfig talsecConfig, CoroutineScope coroutineScope) {
        byte[] bArr = {-32, -76, -29, -112, -123, 109, 2};
        a(bArr, new byte[]{72, 118, 21, -32, 32, 120, -77, -52});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {126, -93, 87, -78, -90, -77};
        a(bArr2, new byte[]{96, -63, -55, -3, -58, -107, 15, -118});
        Intrinsics.checkNotNullParameter(u1Var, new String(bArr2, charset).intern());
        byte[] bArr3 = {-27, 36, -57, -10, -16, 124, -31, -100, -14, 126, -108};
        a(bArr3, new byte[]{93, -25, 12, -105, 110, -23, 14, -97, 25, 122, -17});
        Intrinsics.checkNotNullParameter(interfaceC0057w0, new String(bArr3, charset).intern());
        byte[] bArr4 = {-45, 125, 105, 100, 26, -7, 86, -44, 117, -6, -84};
        a(bArr4, new byte[]{-115, -53, -109, 19, -114, 18, -7, 124, -19, -70, -58});
        Intrinsics.checkNotNullParameter(interfaceC0047r0, new String(bArr4, charset).intern());
        byte[] bArr5 = {-46, 28, 86, -15, -89, -47, -105, -63, 79, -85, -61, -119};
        a(bArr5, new byte[]{30, 31, 109, 51, -69, 0, -107, 37, 27, -74, -24, 58});
        Intrinsics.checkNotNullParameter(talsecConfig, new String(bArr5, charset).intern());
        byte[] bArr6 = {-70, 10, -101, -28, 56};
        a(bArr6, new byte[]{125, 93, 4, -32, -19, -70, 47, -58});
        Intrinsics.checkNotNullParameter(coroutineScope, new String(bArr6, charset).intern());
        this.a = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new a(context, interfaceC0057w0, str, interfaceC0047r0, talsecConfig, u1Var, null), 3, (Object) null);
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
        int i6 = ~"com.aheaditec.talsec.security.s1".length();
        int length4 = (((~((("com.aheaditec.talsec.security.s1".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.s1".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.s1".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i7 = -1;
        int iA2 = B1.a(s1.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.s1".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.s1".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.s1".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.s1".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.s1".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i8 = ((~"com.aheaditec.talsec.security.s1".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.s1".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & 1040)) + i8);
        int length9 = ((((~"com.aheaditec.talsec.security.s1".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.s1".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i9 = ((~"com.aheaditec.talsec.security.s1".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.s1".length();
        int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i10) {
                case -2143294076:
                    int i11 = ~"com.aheaditec.talsec.security.s1".length();
                    if (length4 >= length5) {
                        length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.s1".length() & 1073807362) | 1116733474);
                        i = -375509041;
                        i10 = i ^ length;
                        i7 = -1;
                    } else {
                        int length11 = ("com.aheaditec.talsec.security.s1".length() & 268439810) | 285217280;
                        int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                        i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                        i7 = -1;
                    }
                    break;
                case -2038999444:
                    int i13 = ~"com.aheaditec.talsec.security.s1".length();
                    int length12 = (((((("com.aheaditec.talsec.security.s1".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.s1".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.s1".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << y1.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.s1".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.s1".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i14 = ~"com.aheaditec.talsec.security.s1".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.s1".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.s1".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.s1".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.s1".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.s1".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i15 = -length13;
                    int i16 = i15 | s;
                    int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                    int i18 = -z1.a(i17 | (~iA4), 2, i17 - iA4, 2);
                    length7 = (short) O.a(length7, 3, -(N.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                    int i19 = ((~"com.aheaditec.talsec.security.s1".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.s1".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.s1".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.s1".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.s1".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.s1".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.s1".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.s1".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.s1".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.s1".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i20 = ((~"com.aheaditec.talsec.security.s1".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.s1".length() & 403838542) | 268582982;
                    int i21 = -i20;
                    int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                    iA3 = (short) x1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.s1".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.s1".length() & 150995145) | 140771329);
                    i = 1965034008;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
                case -1809249287:
                    byte b2 = bArr[(((((~"com.aheaditec.talsec.security.s1".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.s1".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.s1".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.s1".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.s1".length() | length16) - (b2 | length16)) + B1.a(s1.class, b2) + ("com.aheaditec.talsec.security.s1".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.s1".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.s1".length() & 786435) | 8921603)) ^ 447505026;
                    byte b3 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i23 = ~"com.aheaditec.talsec.security.s1".length();
                    length6 = (short) (((b3 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.s1".length() | (-2105278367)) - (i23 | (-1545180443))) + (B1.a(s1.class, 568748773 | i23) + ("com.aheaditec.talsec.security.s1".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.s1".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.s1".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.s1".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i24 = ~"com.aheaditec.talsec.security.s1".length();
                    int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.s1".length() & 144806464) | 136645376));
                    int i25 = -length4;
                    int i26 = i25 | length19;
                    byte b4 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                    int i27 = (((-199685676) | r8) - 1591672428) - ((~"com.aheaditec.talsec.security.s1".length()) | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.s1".length() & 23072776) | 272636008;
                    int length21 = b4 & ((-1319036669) ^ (((length20 | i27) - (("com.aheaditec.talsec.security.s1".length() & (~i27)) & length20)) + (length20 & (i27 | "com.aheaditec.talsec.security.s1".length()))));
                    int i28 = ((~"com.aheaditec.talsec.security.s1".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.s1".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i28) + (i28 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.s1".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.s1".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.s1".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.s1".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i29 = ~"com.aheaditec.talsec.security.s1".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i29) + 311432716) - (i29 | (-1074391060))) + (("com.aheaditec.talsec.security.s1".length() & 273678921) | (-1069545407)));
                    int i30 = ~"com.aheaditec.talsec.security.s1".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.s1".length() & (~i30)) & 91135407) + 91135407) + i30) - ((i30 | "com.aheaditec.talsec.security.s1".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.s1".length() & (-804257776)) | (-2094006112);
                    int i31 = -length25;
                    length9 = (-684063310) ^ (((~i31) & length26) - (i31 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.s1".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.s1".length() & 674768897) | 153626665);
                    i2 = 1174056570 - length2;
                    i3 = -1174056571;
                    i10 = ((length2 & i3) * 2) + i2;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.s1".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.s1".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.s1".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.s1".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i32 = ((~"com.aheaditec.talsec.security.s1".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.s1".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.s1".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.s1".length()) & 4218888)) + i32;
                    i4 = 434661073;
                    i10 = i4 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.s1".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.s1".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.s1".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.s1".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i33 = ~"com.aheaditec.talsec.security.s1".length();
                    int i34 = 73539736 & (((~i33) & (-1772650326)) + i33);
                    int length31 = ("com.aheaditec.talsec.security.s1".length() & 35664144) | 33608448;
                    int i35 = -i34;
                    byte b5 = bArr2[((107148186 ^ ((((~i35) & length31) * 2) - (i35 ^ length31))) * length4) + ((((B1.a(s1.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.s1".length() & 532546) | 1602)) ^ 67642971)];
                    int i36 = ~"com.aheaditec.talsec.security.s1".length();
                    int length32 = (b5 & (((663757504 & ((i36 + 1314070430) - (i36 & 1314070430))) + (("com.aheaditec.talsec.security.s1".length() & 834674756) | 272630796)) ^ 936388147)) << ((((B1.a(s1.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.s1".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((B1.a(s1.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.s1".length() & 159661328) | (-2004872944));
                    i5 = -533943416;
                    i10 = iA ^ i5;
                    break;
                case -473033593:
                    int i37 = -length4;
                    int i38 = -bArr.length;
                    int i39 = i38 | i37;
                    int i40 = (i39 - (i38 * 2)) + ((i38 ^ i37) ^ i39);
                    byte b6 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.s1".length();
                    bArr[i40] = (byte) (b6 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.s1".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (B1.a(s1.class, i7) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.s1".length() & 1074544770;
                    iA = J.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i5 = 836032333;
                    i10 = iA ^ i5;
                    break;
                case 766056152:
                    int i41 = ((~"com.aheaditec.talsec.security.s1".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.s1".length();
                    int i42 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i42) & 608439588) + i42) + i41))) {
                        int i43 = ((~"com.aheaditec.talsec.security.s1".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.s1".length() & 268589089) | 661640;
                        iA = M.a(i43 | length36, 2, (~i43) ^ length36, 1);
                        i5 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.s1".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.s1".length() & 1074350177) | 1342720098);
                        i5 = -887872332;
                    }
                    i10 = iA ^ i5;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i44 = ((~"com.aheaditec.talsec.security.s1".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.s1".length() & 251684176) | 1694512896;
                    int i45 = -i44;
                    length4 = length37 % (1864794098 ^ (((~i45) & length38) - (i45 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.s1".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.s1".length() & (-1878240248)) | 285229064);
                    i5 = -195569723;
                    i10 = iA ^ i5;
                    break;
                case 998066383:
                    length4 = (((B1.a(s1.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.s1".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.s1".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.s1".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.s1".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.s1".length() & (-1860698094)) | (-1190123008));
                    i5 = 1002689495;
                    i10 = iA ^ i5;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i46 = ~"com.aheaditec.talsec.security.s1".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.s1".length() & R.^attr-private.__removed0) | 553664516;
                        int i47 = -((i46 | 1510858717) & 403833600);
                        length3 = ((~i47) & length39) - (i47 & (~length39));
                        i4 = 2001041846;
                        i10 = i4 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.s1".length();
                        iA = ((i46 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i5 = -115901203;
                        i10 = iA ^ i5;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.s1".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.s1".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.s1".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.s1".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.s1".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.s1".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i48 = ((~"com.aheaditec.talsec.security.s1".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.s1".length();
                    bArr[length41] = (byte) ((length6 >> ((i48 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.s1".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.s1".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.s1".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.s1".length() & 196644) | (-2146430752));
                    int iA6 = A1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i49 = ((~"com.aheaditec.talsec.security.s1".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.s1".length();
                    int i50 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i51 = -i49;
                    bArr[iA6] = (byte) ((w1.a(~i51, i50, 2, (i50 + i51) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.s1".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.s1".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i52 = ~"com.aheaditec.talsec.security.s1".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.s1".length() | 674349280) - (i52 | 1869872636)) + (B1.a(s1.class, 1197735420 | i52) + ("com.aheaditec.talsec.security.s1".length() & 674349280))) + (("com.aheaditec.talsec.security.s1".length() & 1754529808) | 1418461202)));
                    int i53 = ((~"com.aheaditec.talsec.security.s1".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.s1".length() & 545800290) | (-1442676670);
                    int i54 = -i53;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i54) & length47) - (i54 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.s1".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.s1".length() & 33562640) | 136194);
                    i5 = -1824662634;
                    i10 = iA ^ i5;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.s1".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.s1".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i55 = ~"com.aheaditec.talsec.security.s1".length();
                        iA = (1141965102 & ((-1207265904) + i55 + (((-i55) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.s1".length() & 1292960864) | 150996032);
                        i5 = 612868558;
                        i10 = iA ^ i5;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.s1".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.s1".length() & 874653185) | 335552516);
                        i2 = (-1287294623) - length2;
                        i3 = 1287294622;
                        i10 = ((length2 & i3) * 2) + i2;
                    }
                    break;
                default:
                    int i56 = ~"com.aheaditec.talsec.security.s1".length();
                    int i57 = (((-313266948) | i56) + 45165696) - (i56 | (-269226756));
                    length = O.a(i57, 3, -N.a(i57, -4, 1, ("com.aheaditec.talsec.security.s1".length() & 44040224) | (-1811807712)), 1);
                    i = -361272203;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
            }
            return;
        }
    }

    public final void b() {
        l1 l1Var = this.e;
        if (l1Var == null) {
            byte[] bArr = {65, 47, 2, -58, -112, -123, 30, -23, 92};
            a(bArr, new byte[]{-10, 47, 4, 110, -80, -64, -85, 77, -96});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            l1Var = null;
        }
        l1Var.m.e();
    }

    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        G1 g1 = this.f;
        if (g1 != null) {
            if (g1 == null) {
                byte[] bArr = {103, -51, -4, -89, -82, -57, -24, 104, -69, -105, -60};
                a(bArr, new byte[]{-98, -81, -12, -38, 49, -104, -78, -125, -74, 118, 4});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
                g1 = null;
            }
            g1.c();
        }
    }

    public final void d() {
        if (Talsec.isScreenshotIncidentCached()) {
            b();
        }
        if (Talsec.isScreenRecordingIncidentCached()) {
            a();
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    @DebugMetadata(c = "com.aheaditec.talsec_security.security.runner.TalsecScheduler$1", f = "TalsecScheduler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ InterfaceC0057w0 d;
        public final /* synthetic */ String e;
        public final /* synthetic */ InterfaceC0047r0 f;
        public final /* synthetic */ TalsecConfig g;
        public final /* synthetic */ u1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC0057w0 interfaceC0057w0, String str, InterfaceC0047r0 interfaceC0047r0, TalsecConfig talsecConfig, u1 u1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = interfaceC0057w0;
            this.e = str;
            this.f = interfaceC0047r0;
            this.g = talsecConfig;
            this.h = u1Var;
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
            int i6 = ~"com.aheaditec.talsec.security.s1$a".length();
            int length4 = (((~((("com.aheaditec.talsec.security.s1$a".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.s1$a".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.s1$a".length() & 1074528264) | 1093142560)) ^ (-886298072);
            int i7 = -1;
            int iA2 = B1.a(a.class, -1);
            int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.s1$a".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
            int length6 = ((((~"com.aheaditec.talsec.security.s1$a".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.s1$a".length() & 36928) | 1073844225)) ^ 1350815811;
            int length7 = ((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.s1$a".length() & 1073973402) | (-2146202606))) ^ (-390349602);
            int i8 = ((~"com.aheaditec.talsec.security.s1$a".length()) | (-529537184)) & 457019905;
            int length8 = "com.aheaditec.talsec.security.s1$a".length();
            int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & 1040)) + i8);
            int length9 = ((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.s1$a".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
            int i9 = ((~"com.aheaditec.talsec.security.s1$a".length()) | 91711000) & (-1070824876);
            int length10 = "com.aheaditec.talsec.security.s1$a".length();
            int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
            short[] sArr = null;
            while (true) {
                switch (i10) {
                    case -2143294076:
                        int i11 = ~"com.aheaditec.talsec.security.s1$a".length();
                        if (length4 >= length5) {
                            length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.s1$a".length() & 1073807362) | 1116733474);
                            i = -375509041;
                            i10 = i ^ length;
                            i7 = -1;
                        } else {
                            int length11 = ("com.aheaditec.talsec.security.s1$a".length() & 268439810) | 285217280;
                            int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                            i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                            i7 = -1;
                        }
                        break;
                    case -2038999444:
                        int i13 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int length12 = (((((("com.aheaditec.talsec.security.s1$a".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.s1$a".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.s1$a".length() & (-2145386455)) | (-2147483476));
                        int iA4 = ((short) ((length6 << y1.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.s1$a".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                        int i14 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.s1$a".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.s1$a".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.s1$a".length() & 588787984) | 36185216)) ^ 993590676);
                        short s = sArr[((((~"com.aheaditec.talsec.security.s1$a".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.s1$a".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                        int i15 = -length13;
                        int i16 = i15 | s;
                        int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                        int i18 = -z1.a(i17 | (~iA4), 2, i17 - iA4, 2);
                        length7 = (short) O.a(length7, 3, -(N.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                        int i19 = ((~"com.aheaditec.talsec.security.s1$a".length()) | (-549847554)) + 1624126210;
                        int length14 = ("com.aheaditec.talsec.security.s1$a".length() & 549848649) | 67175498;
                        length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.s1$a".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.s1$a".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.s1$a".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.s1$a".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.s1$a".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.s1$a".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.s1$a".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                        int i20 = ((~"com.aheaditec.talsec.security.s1$a".length()) | (-412319609)) & (-1959782776);
                        int length15 = ("com.aheaditec.talsec.security.s1$a".length() & 403838542) | 268582982;
                        int i21 = -i20;
                        int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                        iA3 = (short) x1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                        length9++;
                        length = (((~"com.aheaditec.talsec.security.s1$a".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.s1$a".length() & 150995145) | 140771329);
                        i = 1965034008;
                        i10 = i ^ length;
                        i7 = -1;
                        break;
                    case -1809249287:
                        byte b = bArr[(((((~"com.aheaditec.talsec.security.s1$a".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.s1$a".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                        int length16 = ((((~"com.aheaditec.talsec.security.s1$a".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.s1$a".length() & 546586672) | 546340912)) ^ 949273229;
                        int length17 = (("com.aheaditec.talsec.security.s1$a".length() | length16) - (b | length16)) + B1.a(a.class, b) + ("com.aheaditec.talsec.security.s1$a".length() & length16);
                        int length18 = ((((~"com.aheaditec.talsec.security.s1$a".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.s1$a".length() & 786435) | 8921603)) ^ 447505026;
                        byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                        int i23 = ~"com.aheaditec.talsec.security.s1$a".length();
                        length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.s1$a".length() | (-2105278367)) - (i23 | (-1545180443))) + (B1.a(a.class, 568748773 | i23) + ("com.aheaditec.talsec.security.s1$a".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.s1$a".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.s1$a".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                        int i24 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.s1$a".length() & 144806464) | 136645376));
                        int i25 = -length4;
                        int i26 = i25 | length19;
                        byte b3 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                        int i27 = (((-199685676) | r8) - 1591672428) - ((~"com.aheaditec.talsec.security.s1$a".length()) | (-180811308));
                        int length20 = ("com.aheaditec.talsec.security.s1$a".length() & 23072776) | 272636008;
                        int length21 = b3 & ((-1319036669) ^ (((length20 | i27) - (("com.aheaditec.talsec.security.s1$a".length() & (~i27)) & length20)) + (length20 & (i27 | "com.aheaditec.talsec.security.s1$a".length()))));
                        int i28 = ((~"com.aheaditec.talsec.security.s1$a".length()) | (-1009031633)) & 545538049;
                        int length22 = ("com.aheaditec.talsec.security.s1$a".length() & 537143360) | 10560;
                        int length23 = bArr[(545548610 ^ ((length22 & i28) + (i28 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.s1$a".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.s1$a".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                        int length24 = "com.aheaditec.talsec.security.s1$a".length();
                        length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.s1$a".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                        int i29 = ~"com.aheaditec.talsec.security.s1$a".length();
                        iA3 = 758110381 ^ (((((-1343875612) | i29) + 311432716) - (i29 | (-1074391060))) + (("com.aheaditec.talsec.security.s1$a".length() & 273678921) | (-1069545407)));
                        int i30 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.s1$a".length() & (~i30)) & 91135407) + 91135407) + i30) - ((i30 | "com.aheaditec.talsec.security.s1$a".length()) & 91135407));
                        int length26 = ("com.aheaditec.talsec.security.s1$a".length() & (-804257776)) | (-2094006112);
                        int i31 = -length25;
                        length9 = (-684063310) ^ (((~i31) & length26) - (i31 & (~length26)));
                        length2 = (((~"com.aheaditec.talsec.security.s1$a".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.s1$a".length() & 674768897) | 153626665);
                        i2 = 1174056570 - length2;
                        i3 = -1174056571;
                        i10 = ((length2 & i3) * 2) + i2;
                        break;
                    case -1740520186:
                        sArr = new short[((((~"com.aheaditec.talsec.security.s1$a".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.s1$a".length() & 105907748) | 4198960)) ^ 106731121];
                        length4 = ((((~"com.aheaditec.talsec.security.s1$a".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.s1$a".length() & 809508000) | 809603328)) ^ 2042748833;
                        int i32 = ((~"com.aheaditec.talsec.security.s1$a".length()) | 1688058452) & 872484865;
                        int length27 = "com.aheaditec.talsec.security.s1$a".length() & 268460041;
                        length3 = ((((("com.aheaditec.talsec.security.s1$a".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.s1$a".length()) & 4218888)) + i32;
                        i4 = 434661073;
                        i10 = i4 ^ length3;
                        break;
                    case -1489518479:
                        int length28 = "com.aheaditec.talsec.security.s1$a".length();
                        int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.s1$a".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                        int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.s1$a".length() & 1343232517) | 546308360)) ^ (-191816846));
                        int i33 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int i34 = 73539736 & (((~i33) & (-1772650326)) + i33);
                        int length31 = ("com.aheaditec.talsec.security.s1$a".length() & 35664144) | 33608448;
                        int i35 = -i34;
                        byte b4 = bArr2[((107148186 ^ ((((~i35) & length31) * 2) - (i35 ^ length31))) * length4) + ((((B1.a(a.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.s1$a".length() & 532546) | 1602)) ^ 67642971)];
                        int i36 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int length32 = (b4 & (((663757504 & ((i36 + 1314070430) - (i36 & 1314070430))) + (("com.aheaditec.talsec.security.s1$a".length() & 834674756) | 272630796)) ^ 936388147)) << ((((B1.a(a.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.s1$a".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                        sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                        length4++;
                        iA = ((B1.a(a.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.s1$a".length() & 159661328) | (-2004872944));
                        i5 = -533943416;
                        i10 = iA ^ i5;
                        break;
                    case -473033593:
                        int i37 = -length4;
                        int i38 = -bArr.length;
                        int i39 = i38 | i37;
                        int i40 = (i39 - (i38 * 2)) + ((i38 ^ i37) ^ i39);
                        byte b5 = bArr[bArr.length - length4];
                        int length33 = "com.aheaditec.talsec.security.s1$a".length();
                        bArr[i40] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.s1$a".length() & 274827331) | 556017667)) ^ 2046273635)]);
                        length4--;
                        int iA5 = (B1.a(a.class, i7) | 114408723) & 1183666176;
                        int length34 = "com.aheaditec.talsec.security.s1$a".length() & 1074544770;
                        iA = J.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                        i5 = 836032333;
                        i10 = iA ^ i5;
                        break;
                    case 766056152:
                        int i41 = ((~"com.aheaditec.talsec.security.s1$a".length()) | (-889871025)) & 1233748555;
                        int length35 = "com.aheaditec.talsec.security.s1$a".length();
                        int i42 = (length35 + 84675108) - (length35 | 84675108);
                        if (length4 < (1842188139 ^ ((((~i42) & 608439588) + i42) + i41))) {
                            int i43 = ((~"com.aheaditec.talsec.security.s1$a".length()) | 1878725846) & 1912684595;
                            int length36 = ("com.aheaditec.talsec.security.s1$a".length() & 268589089) | 661640;
                            iA = M.a(i43 | length36, 2, (~i43) ^ length36, 1);
                            i5 = -717449014;
                        } else {
                            iA = (((~"com.aheaditec.talsec.security.s1$a".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.s1$a".length() & 1074350177) | 1342720098);
                            i5 = -887872332;
                        }
                        i10 = iA ^ i5;
                        break;
                    case 974072829:
                        int length37 = bArr.length;
                        int i44 = ((~"com.aheaditec.talsec.security.s1$a".length()) | 1711185063) & 170281206;
                        int length38 = ("com.aheaditec.talsec.security.s1$a".length() & 251684176) | 1694512896;
                        int i45 = -i44;
                        length4 = length37 % (1864794098 ^ (((~i45) & length38) - (i45 & (~length38))));
                        iA = (((~"com.aheaditec.talsec.security.s1$a".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.s1$a".length() & (-1878240248)) | 285229064);
                        i5 = -195569723;
                        i10 = iA ^ i5;
                        break;
                    case 998066383:
                        length4 = (((B1.a(a.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.s1$a".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                        length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.s1$a".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.s1$a".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                        iA = (((~"com.aheaditec.talsec.security.s1$a".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.s1$a".length() & (-1860698094)) | (-1190123008));
                        i5 = 1002689495;
                        i10 = iA ^ i5;
                        break;
                    case 1314339506:
                        break;
                    case 1734050766:
                        int i46 = ~"com.aheaditec.talsec.security.s1$a".length();
                        if (length4 <= 0) {
                            int length39 = ("com.aheaditec.talsec.security.s1$a".length() & R.^attr-private.__removed0) | 553664516;
                            int i47 = -((i46 | 1510858717) & 403833600);
                            length3 = ((~i47) & length39) - (i47 & (~length39));
                            i4 = 2001041846;
                            i10 = i4 ^ length3;
                        } else {
                            int length40 = "com.aheaditec.talsec.security.s1$a".length();
                            iA = ((i46 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                            i5 = -115901203;
                            i10 = iA ^ i5;
                        }
                        break;
                    case 1771480224:
                        bArr[(((((~"com.aheaditec.talsec.security.s1$a".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.s1$a".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.s1$a".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.s1$a".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                        int length41 = (((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.s1$a".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                        int i48 = ((~"com.aheaditec.talsec.security.s1$a".length()) | 367288948) & 548745488;
                        int length42 = "com.aheaditec.talsec.security.s1$a".length();
                        bArr[length41] = (byte) ((length6 >> ((i48 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.s1$a".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.s1$a".length() & 8392730) | 8525645)) ^ 1035083648));
                        int length43 = (((~"com.aheaditec.talsec.security.s1$a".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.s1$a".length() & 196644) | (-2146430752));
                        int iA6 = A1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                        int i49 = ((~"com.aheaditec.talsec.security.s1$a".length()) | (-1010633609)) & 678986012;
                        int length44 = "com.aheaditec.talsec.security.s1$a".length();
                        int i50 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                        int i51 = -i49;
                        bArr[iA6] = (byte) ((w1.a(~i51, i50, 2, (i50 + i51) + 1) ^ 955811810) & length7);
                        int length45 = (((((~"com.aheaditec.talsec.security.s1$a".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.s1$a".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                        int i52 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.s1$a".length() | 674349280) - (i52 | 1869872636)) + (B1.a(a.class, 1197735420 | i52) + ("com.aheaditec.talsec.security.s1$a".length() & 674349280))) + (("com.aheaditec.talsec.security.s1$a".length() & 1754529808) | 1418461202)));
                        int i53 = ((~"com.aheaditec.talsec.security.s1$a".length()) | 1601418652) & 1439188132;
                        int length47 = ("com.aheaditec.talsec.security.s1$a".length() & 545800290) | (-1442676670);
                        int i54 = -i53;
                        bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i54) & length47) - (i54 & (~length47)))));
                        length4 += 4;
                        iA = (((~"com.aheaditec.talsec.security.s1$a".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.s1$a".length() & 33562640) | 136194);
                        i5 = -1824662634;
                        i10 = iA ^ i5;
                        break;
                    case 2093236949:
                        if (length9 >= (((((~"com.aheaditec.talsec.security.s1$a".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.s1$a".length() & 75500825) | 537198861)) ^ 1840590653)) {
                            int i55 = ~"com.aheaditec.talsec.security.s1$a".length();
                            iA = (1141965102 & ((-1207265904) + i55 + (((-i55) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.s1$a".length() & 1292960864) | 150996032);
                            i5 = 612868558;
                            i10 = iA ^ i5;
                        } else {
                            length2 = (((~"com.aheaditec.talsec.security.s1$a".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.s1$a".length() & 874653185) | 335552516);
                            i2 = (-1287294623) - length2;
                            i3 = 1287294622;
                            i10 = ((length2 & i3) * 2) + i2;
                        }
                        break;
                    default:
                        int i56 = ~"com.aheaditec.talsec.security.s1$a".length();
                        int i57 = (((-313266948) | i56) + 45165696) - (i56 | (-269226756));
                        length = O.a(i57, 3, -N.a(i57, -4, 1, ("com.aheaditec.talsec.security.s1$a".length() & 44040224) | (-1811807712)), 1);
                        i = -361272203;
                        i10 = i ^ length;
                        i7 = -1;
                        break;
                }
                return;
            }
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s1.this.new a(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        public Object invoke(Object obj, Object obj2) {
            return create((CoroutineScope) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C0028i1 c0028i1;
            R0 r0;
            E1 e1;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                byte[] bArr = {-20, 61, -52, -93, 90, 34, 23, 114, -123, 62, -57, 53, -54, -12, -97, -11, 80, 55, -116, -23, -13, -3, -87, 28, -111, -97, 29, -24, 114, -30, 48, 64, -13, 14, -103, 73, 8, -78, -91, -109, 101, -94, 126, 42, -85, 90, 10};
                a(bArr, new byte[]{30, 111, 52, -62, -112, 89, 124, 37, -77, -52, -55, 27, -55, 100, 69, -1, -99, 39, -61, -100, 90, 59, 2, 12, 24, 2, -24, -112, -101, 73, 4, 90, 69, 58, -32, 11, 22, -26, -103, 55, 38, -11, -85, 72, 127, -29, -56});
                throw new IllegalStateException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            ResultKt.throwOnFailure(obj);
            s1.this.b = new C0028i1(new C0036l0(this.c), null);
            s1 s1Var = s1.this;
            InterfaceC0057w0 interfaceC0057w0 = this.d;
            C0028i1 c0028i12 = s1Var.b;
            if (c0028i12 == null) {
                byte[] bArr2 = {46, 48, -97, 44, 9, -120, -5};
                a(bArr2, new byte[]{-116, -119, -19, 110, -30, 55, 94, 101});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, StandardCharsets.UTF_8).intern());
                c0028i1 = null;
            } else {
                c0028i1 = c0028i12;
            }
            s1Var.c = new R0(interfaceC0057w0, c0028i1, this.e, this.f, s1.this);
            s1.this.f = new G1(this.g.getKillOnBypass(), this.c);
            s1 s1Var2 = s1.this;
            Context context = this.c;
            InterfaceC0047r0.f fVarA = this.f.a();
            G1 g1 = s1.this.f;
            if (g1 == null) {
                byte[] bArr3 = {70, 35, 20, 117, -3, 18, -16, -21, 76, -87, 22};
                a(bArr3, new byte[]{4, 125, -54, 45, -103, -3, -104, 74, -9, -54, 9});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, StandardCharsets.UTF_8).intern());
                g1 = null;
            }
            s1Var2.d = new F1(context, fVarA, null, g1);
            s1 s1Var3 = s1.this;
            Context context2 = this.c;
            u1 u1Var = this.h;
            R0 r02 = s1Var3.c;
            if (r02 == null) {
                byte[] bArr4 = {51, -58, 117, 22, 96, -5};
                a(bArr4, new byte[]{-94, -119, 5, 58, -73, 19, -34, 121});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr4, StandardCharsets.UTF_8).intern());
                r0 = null;
            } else {
                r0 = r02;
            }
            InterfaceC0057w0 interfaceC0057w02 = this.d;
            InterfaceC0047r0 interfaceC0047r0 = this.f;
            E1 e12 = s1.this.d;
            if (e12 == null) {
                byte[] bArr5 = {-116, -9, 0, 43, -75, 95, 53, -48};
                a(bArr5, new byte[]{-84, -58, -21, -1, 115, 69, 33, 85});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr5, StandardCharsets.UTF_8).intern());
                e1 = null;
            } else {
                e1 = e12;
            }
            s1Var3.e = new l1(context2, u1Var, r0, interfaceC0057w02, interfaceC0047r0, e1);
            s1.this.a(this.c, this.g);
            s1 s1Var4 = s1.this;
            Context context3 = this.c;
            this.f.getClass();
            s1Var4.a(context3, 60L);
            return Unit.INSTANCE;
        }

        public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void a() {
        l1 l1Var = this.e;
        if (l1Var == null) {
            byte[] bArr = {120, 14, -62, 53, -35, 116, -93, -34, 15};
            a(bArr, new byte[]{-76, 124, 11, -39, -26, 60, -29, 44, -93});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            l1Var = null;
        }
        l1Var.n.e();
    }

    @Override // com.aheaditec.talsec.security.Z
    public String a(String str) {
        byte[] bArr = {-41, 10, -21, 65, 121};
        a(bArr, new byte[]{109, 28, -38, 90, 31, -82, -8, 116});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        return null;
    }

    public final Runnable a(Context context) {
        l1 l1Var = this.e;
        if (l1Var == null) {
            byte[] bArr = {-28, -102, 48, 80, 27, 102, 76, -9, -43};
            a(bArr, new byte[]{-29, -90, 72, -2, -11, 64, -113, 48, 22});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            l1Var = null;
        }
        return new q1(l1Var, context);
    }

    public final void a(Context context, TalsecConfig talsecConfig) {
        BuildersKt.launch$default(this.a, Dispatchers.getDefault(), (CoroutineStart) null, new c(context, this, talsecConfig, null), 2, (Object) null);
    }

    public final void a(Context context, long j) {
        BuildersKt.launch$default(this.a, Dispatchers.getDefault(), (CoroutineStart) null, new d(context, j, null), 2, (Object) null);
    }

    public final Object a(Context context, long j, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new e(context, j, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
