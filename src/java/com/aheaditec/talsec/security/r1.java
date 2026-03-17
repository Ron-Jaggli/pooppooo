package com.aheaditec.talsec.security;

import android.R;
import android.content.Context;
import com.aheaditec.talsec_security.security.api.TalsecConfig;
import com.aheaditec.talsec_security.security.api.TalsecMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class r1 {
    public static final b g = new b(null);
    public static r1 h;
    public v1 a;
    public C0049s0 b;
    public t1 c;
    public C0059x0 d;
    public s1 e;
    public final CoroutineScope f;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    @DebugMetadata(c = "com.aheaditec.talsec_security.security.runner.TalsecRunner$1", f = "TalsecRunner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Context d;
        public final /* synthetic */ TalsecConfig e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, TalsecConfig talsecConfig, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = context;
            this.e = talsecConfig;
        }

        public final Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = r1.this.new a(this.d, this.e, continuation);
            aVar.b = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return create((CoroutineScope) obj, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C0059x0 c0059x0;
            C0049s0 c0049s0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                byte[] bArr = {-18, 124, -35, 8, 37, -128, 108, 48, -33, -3, -34, 91, -49, -99, 15, 67, -39, 76, 79, 110, -37, -66, -123, 20, -39, -18, 107, -91, 34, 41, 125, 67, -46, 88, -21, -38, -112, -69, -12, -43, 52, 108, 119, -25, 56, -80, 60};
                a(bArr, new byte[]{-115, 29, -79, 100, 5, -12, 3, 16, -8, -113, -69, 40, -70, -16, 106, 100, -7, 46, 42, 8, -76, -52, -32, 52, -2, -121, 5, -45, 77, 66, 24, 100, -14, 47, -126, -82, -8, -101, -105, -70, 70, 3, 2, -109, 81, -34, 89});
                throw new IllegalStateException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            r1.this.a = new v1(this.d);
            r1.this.b = C0049s0.g.a(this.e);
            r1 r1Var = r1.this;
            v1 v1Var = r1Var.a;
            if (v1Var == null) {
                byte[] bArr2 = {19, 65, 75, -8, 103, -112, 51};
                a(bArr2, new byte[]{96, 53, 36, -118, 6, -9, 86, 121});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, StandardCharsets.UTF_8).intern());
                v1Var = null;
            }
            r1Var.c = new t1(v1Var.b());
            r1 r1Var2 = r1.this;
            v1 v1Var2 = r1Var2.a;
            if (v1Var2 == null) {
                byte[] bArr3 = {-62, -104, -121, -57, 120, 53, 75};
                a(bArr3, new byte[]{-79, -20, -24, -75, 25, 82, 46, -51});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, StandardCharsets.UTF_8).intern());
                v1Var2 = null;
            }
            TalsecConfig talsecConfig = this.e;
            Context context = this.d;
            C0049s0 c0049s02 = r1.this.b;
            if (c0049s02 == null) {
                byte[] bArr4 = {104, -86, -23, -89, -52, 77, -88, 97, -83, -110, 28};
                a(bArr4, new byte[]{15, -58, -100, -62, -88, 14, -57, 15, -53, -5, 123});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr4, StandardCharsets.UTF_8).intern());
                c0049s02 = null;
            }
            r1Var2.d = C0059x0.a(v1Var2, talsecConfig, context, c0049s02.e);
            r1 r1Var3 = r1.this;
            Context context2 = this.d;
            t1 t1Var = r1.this.c;
            if (t1Var == null) {
                byte[] bArr5 = {21, 124, -83, 4, -17, 22, 29, -72, -6, -77, -94};
                a(bArr5, new byte[]{97, 29, -63, 119, -118, 117, 91, -44, -101, -44, -47});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr5, StandardCharsets.UTF_8).intern());
                t1Var = null;
            }
            u1 u1VarB = t1Var.b();
            byte[] bArr6 = {-112, -115, -40, -27, -41, 86, -79, 33, -43, -109, 100, 120, 123, -24};
            a(bArr6, new byte[]{-9, -24, -84, -96, -77, 63, -59, 78, -89, -69, 74, 86, 85, -63});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(u1VarB, new String(bArr6, charset).intern());
            v1 v1Var3 = r1.this.a;
            if (v1Var3 == null) {
                byte[] bArr7 = {-60, -120, -88, 38, 56, 124, -106};
                a(bArr7, new byte[]{-73, -4, -57, 84, 89, 27, -13, -55});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr7, charset).intern());
                v1Var3 = null;
            }
            String strA = v1Var3.b().h.a();
            C0059x0 c0059x02 = r1.this.d;
            if (c0059x02 == null) {
                byte[] bArr8 = {-1, -96, -61, 114, -77, 55, -68, 41, 101, 59, -23};
                a(bArr8, new byte[]{-106, -60, -90, 28, -57, 94, -38, 64, 0, 73, -102});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr8, charset).intern());
                c0059x0 = null;
            } else {
                c0059x0 = c0059x02;
            }
            C0049s0 c0049s03 = r1.this.b;
            if (c0049s03 == null) {
                byte[] bArr9 = {121, -54, 31, 98, 60, 93, 75, -108, -6, -96, -58};
                a(bArr9, new byte[]{30, -90, 106, 7, 88, 30, 36, -6, -100, -55, -95});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr9, charset).intern());
                c0049s0 = null;
            } else {
                c0049s0 = c0049s03;
            }
            r1Var3.e = new s1(context2, u1VarB, strA, c0059x0, c0049s0, this.e, CoroutineScopeKt.CoroutineScope(coroutineScope.getCoroutineContext()));
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
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    public static final class b {
        public b() {
        }

        public final synchronized r1 a(Context context, TalsecConfig talsecConfig, TalsecMode talsecMode) {
            r1 r1Var;
            byte[] bArr = {52, 3, 87, -118, 21, 82, 93};
            a(bArr, new byte[]{51, 94, -73, 92, 112, 42, 41, 110});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
            byte[] bArr2 = {84, -70, 14, 97, 85, -9};
            a(bArr2, new byte[]{83, -25, -18, -87, 60, -112, -44, 25});
            Intrinsics.checkNotNullParameter(talsecConfig, new String(bArr2, charset).intern());
            byte[] bArr3 = {-64, 110, 18, -46};
            a(bArr3, new byte[]{-47, 51, -60, 21, -32, -54, -100, 79});
            Intrinsics.checkNotNullParameter(talsecMode, new String(bArr3, charset).intern());
            if (r1.h == null) {
                r1.h = new r1(context, talsecConfig, talsecMode);
            }
            r1Var = r1.h;
            if (r1Var == null) {
                byte[] bArr4 = {-17, 125, -101, -121, 31, -77, 103, -101};
                a(bArr4, new byte[]{-30, 33, 126, 81, 26, -17, -78, 92});
                Intrinsics.throwUninitializedPropertyAccessException(new String(bArr4, charset).intern());
                r1Var = null;
            }
            return r1Var;
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            int i;
            int i2 = 0;
            byte[] bArr3 = null;
            int i3 = 0;
            int i4 = 0;
            int length = 0;
            int i5 = -894652659;
            byte[] bArr4 = null;
            while (true) {
                int i6 = ((i5 & 16777216) * (i5 | 16777216)) + ((i5 & (-16777217)) * ((~i5) & 16777216));
                int i7 = i5 >>> 8;
                int i8 = (i7 + i6) - (i7 & i6);
                int i9 = (i8 ^ 1458005263) + ((i8 & 1458005263) * 2);
                switch ((i9 - 1434379843) + (((~i9) & 1434379843) * 2)) {
                    case -1970406716:
                        int length2 = bArr4.length;
                        int i10 = 0 - i3;
                        int i11 = ~i10;
                        int i12 = ((length2 | i10) - ((602749225 & i11) & length2)) + ((i10 | 602749225) & length2);
                        byte b = bArr3[i12];
                        int length3 = bArr4.length;
                        byte b2 = bArr3[(length3 ^ i11) + ((i10 | length3) * 2) + 1];
                        int i13 = ((byte) 0) - b;
                        bArr3[i12] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i13))))) - ((byte) (b2 ^ i13)));
                        i5 = -34715366;
                        i2 = 0;
                        break;
                    case -1882653318:
                        int i14 = (i4 - 1) - (i4 | (-4));
                        byte b3 = bArr3[i14];
                        int i15 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                        int i16 = i4 + 3 + (((-1) - i4) | (-3));
                        int i17 = bArr3[i16] & 255;
                        int i18 = i17 * ((~i17) & 65536);
                        int i19 = ~((i15 | (1169991170 | (~i18))) - ((i18 & 1169991170) | i15));
                        int iA = K.a(689061172 & i4, i4, 1, 689061173 & i4);
                        int i20 = bArr3[iA] & 255;
                        int i21 = ((~i19) & (i20 * ((~i20) & 256))) + i19;
                        int i22 = (i21 - 1) - ((~(bArr3[i4] & 255)) | i21);
                        byte b4 = bArr4[i14];
                        int i23 = ((b4 & 16777216) * (b4 | 16777216)) + (((-16777217) & b4) * ((~b4) & 16777216));
                        int i24 = bArr4[i16] & 255;
                        int i25 = i24 * ((~i24) & 65536);
                        int i26 = ~((i23 | ((~i25) | (-445685625))) - ((i25 & (-445685625)) | i23));
                        int i27 = bArr4[iA] & 255;
                        int i28 = i27 * ((~i27) & 256);
                        int i29 = (i28 + i26) - (i28 & i26);
                        int i30 = bArr4[i4] & 255;
                        int i31 = (i29 & (~i30)) + i30;
                        int i32 = i22 << ((i22 > Double.NaN ? 1 : (i22 == Double.NaN ? 0 : -1)) >>> 31);
                        int i33 = (i32 + i31) - ((i32 & i31) * 2);
                        int i34 = 659933421 - ((i33 & 2) | ((-1983400303) - i33));
                        bArr4[i4] = (byte) i34;
                        bArr4[iA] = (byte) (i34 >>> 8);
                        bArr4[i16] = (byte) (i34 >>> 16);
                        bArr4[i14] = (byte) (i34 >>> 24);
                        i4 = (i4 ^ 4) + ((i4 & 4) * 2);
                        int length4 = bArr4.length;
                        int length5 = 0 - (bArr4.length % 4);
                        int i35 = ((i4 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i4 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31) & 1;
                        i5 = i35 != 0 ? 196573321 : 145880015;
                        if (i35 != 0) {
                            i5 = -826922365;
                        }
                        i2 = 0;
                        break;
                    case -625567707:
                        break;
                    case 172635213:
                        int length6 = bArr4.length;
                        int i36 = 0 - length;
                        i5 = ((((double) ((byte) bArr3[(length6 ^ i36) + ((length6 & i36) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i36) + ((length6 & i36) * 2)])) == Double.NaN ? 0 : -1)) <= -1 ? i2 : 1) != 0 ? -34715366 : 196573321;
                        i3 = length;
                        break;
                    case 614184219:
                        int length7 = bArr4.length;
                        int i37 = 0 - i3;
                        int i38 = i37 * 3;
                        int iA2 = N.a(i37, -4, 1, length7);
                        int length8 = bArr4.length;
                        byte b5 = bArr4[(length8 ^ i37) + ((length8 & i37) * 2)];
                        int length9 = bArr4.length;
                        int i39 = 0 - i37;
                        byte b6 = bArr3[(((~i39) & length9) * 2) - (length9 ^ i39)];
                        bArr4[L.a(i2, (length7 & 2) | iA2, i38, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
                        length = ((-338014207) | i3) + (338014206 | i3);
                        int i40 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                        i = i40 != 0 ? 196573321 : 1298988808;
                        i5 = i40 == 0 ? i : -518432968;
                        break;
                    case 835516413:
                        int length10 = bArr.length;
                        int length11 = 0 - (0 - (bArr.length % 4));
                        int i41 = (length10 ^ length11) - (((~length10) & length11) * 2) <= 0 ? i2 : 1;
                        i5 = i41 != 0 ? -826922365 : i41 != 0 ? 196573321 : 145880015;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        i4 = i2;
                        break;
                    case 1888416065:
                        length = bArr4.length % 4;
                        int i42 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i = i42 != 0 ? 196573321 : 1298988808;
                        if (i42 == 0) {
                        }
                        break;
                    default:
                        i5 = 196573321;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
     */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TalsecMode.values().length];
            try {
                iArr[TalsecMode.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TalsecMode.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public r1(Context context, TalsecConfig talsecConfig, TalsecMode talsecMode) throws NoWhenBranchMatchedException {
        CoroutineDispatcher main;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        int i = c.a[talsecMode.ordinal()];
        if (i == 1) {
            main = Dispatchers.getMain();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            main = Dispatchers.getDefault();
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(main));
        this.f = CoroutineScope;
        BuildersKt.launch$default(CoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new a(context, talsecConfig, null), 3, (Object) null);
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
        int i6 = ~"com.aheaditec.talsec.security.r1".length();
        int length4 = (((~((("com.aheaditec.talsec.security.r1".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.r1".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.r1".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i7 = -1;
        int iA2 = B1.a(r1.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.r1".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.r1".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.r1".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.r1".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.r1".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i8 = ((~"com.aheaditec.talsec.security.r1".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.r1".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & 1040)) + i8);
        int length9 = ((((~"com.aheaditec.talsec.security.r1".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.r1".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i9 = ((~"com.aheaditec.talsec.security.r1".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.r1".length();
        int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i10) {
                case -2143294076:
                    int i11 = ~"com.aheaditec.talsec.security.r1".length();
                    if (length4 >= length5) {
                        length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.r1".length() & 1073807362) | 1116733474);
                        i = -375509041;
                        i10 = i ^ length;
                        i7 = -1;
                    } else {
                        int length11 = ("com.aheaditec.talsec.security.r1".length() & 268439810) | 285217280;
                        int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                        i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                        i7 = -1;
                    }
                    break;
                case -2038999444:
                    int i13 = ~"com.aheaditec.talsec.security.r1".length();
                    int length12 = (((((("com.aheaditec.talsec.security.r1".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.r1".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.r1".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << y1.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.r1".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.r1".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i14 = ~"com.aheaditec.talsec.security.r1".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.r1".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.r1".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.r1".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.r1".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.r1".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i15 = -length13;
                    int i16 = i15 | s;
                    int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                    int i18 = -z1.a(i17 | (~iA4), 2, i17 - iA4, 2);
                    length7 = (short) O.a(length7, 3, -(N.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                    int i19 = ((~"com.aheaditec.talsec.security.r1".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.r1".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.r1".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.r1".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.r1".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.r1".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.r1".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.r1".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.r1".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.r1".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i20 = ((~"com.aheaditec.talsec.security.r1".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.r1".length() & 403838542) | 268582982;
                    int i21 = -i20;
                    int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                    iA3 = (short) x1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.r1".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.r1".length() & 150995145) | 140771329);
                    i = 1965034008;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
                case -1809249287:
                    byte b2 = bArr[(((((~"com.aheaditec.talsec.security.r1".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.r1".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.r1".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.r1".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.r1".length() | length16) - (b2 | length16)) + B1.a(r1.class, b2) + ("com.aheaditec.talsec.security.r1".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.r1".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.r1".length() & 786435) | 8921603)) ^ 447505026;
                    byte b3 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i23 = ~"com.aheaditec.talsec.security.r1".length();
                    length6 = (short) (((b3 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.r1".length() | (-2105278367)) - (i23 | (-1545180443))) + (B1.a(r1.class, 568748773 | i23) + ("com.aheaditec.talsec.security.r1".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.r1".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.r1".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.r1".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i24 = ~"com.aheaditec.talsec.security.r1".length();
                    int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.r1".length() & 144806464) | 136645376));
                    int i25 = -length4;
                    int i26 = i25 | length19;
                    byte b4 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                    int i27 = (((-199685676) | r8) - 1591672428) - ((~"com.aheaditec.talsec.security.r1".length()) | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.r1".length() & 23072776) | 272636008;
                    int length21 = b4 & ((-1319036669) ^ (((length20 | i27) - (("com.aheaditec.talsec.security.r1".length() & (~i27)) & length20)) + (length20 & (i27 | "com.aheaditec.talsec.security.r1".length()))));
                    int i28 = ((~"com.aheaditec.talsec.security.r1".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.r1".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i28) + (i28 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.r1".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.r1".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.r1".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.r1".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i29 = ~"com.aheaditec.talsec.security.r1".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i29) + 311432716) - (i29 | (-1074391060))) + (("com.aheaditec.talsec.security.r1".length() & 273678921) | (-1069545407)));
                    int i30 = ~"com.aheaditec.talsec.security.r1".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.r1".length() & (~i30)) & 91135407) + 91135407) + i30) - ((i30 | "com.aheaditec.talsec.security.r1".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.r1".length() & (-804257776)) | (-2094006112);
                    int i31 = -length25;
                    length9 = (-684063310) ^ (((~i31) & length26) - (i31 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.r1".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.r1".length() & 674768897) | 153626665);
                    i2 = 1174056570 - length2;
                    i3 = -1174056571;
                    i10 = ((length2 & i3) * 2) + i2;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.r1".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.r1".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.r1".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.r1".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i32 = ((~"com.aheaditec.talsec.security.r1".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.r1".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.r1".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.r1".length()) & 4218888)) + i32;
                    i4 = 434661073;
                    i10 = i4 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.r1".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.r1".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.r1".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.r1".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i33 = ~"com.aheaditec.talsec.security.r1".length();
                    int i34 = 73539736 & (((~i33) & (-1772650326)) + i33);
                    int length31 = ("com.aheaditec.talsec.security.r1".length() & 35664144) | 33608448;
                    int i35 = -i34;
                    byte b5 = bArr2[((107148186 ^ ((((~i35) & length31) * 2) - (i35 ^ length31))) * length4) + ((((B1.a(r1.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.r1".length() & 532546) | 1602)) ^ 67642971)];
                    int i36 = ~"com.aheaditec.talsec.security.r1".length();
                    int length32 = (b5 & (((663757504 & ((i36 + 1314070430) - (i36 & 1314070430))) + (("com.aheaditec.talsec.security.r1".length() & 834674756) | 272630796)) ^ 936388147)) << ((((B1.a(r1.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.r1".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((B1.a(r1.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.r1".length() & 159661328) | (-2004872944));
                    i5 = -533943416;
                    i10 = iA ^ i5;
                    break;
                case -473033593:
                    int i37 = -length4;
                    int i38 = -bArr.length;
                    int i39 = i38 | i37;
                    int i40 = (i39 - (i38 * 2)) + ((i38 ^ i37) ^ i39);
                    byte b6 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.r1".length();
                    bArr[i40] = (byte) (b6 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.r1".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (B1.a(r1.class, i7) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.r1".length() & 1074544770;
                    iA = J.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i5 = 836032333;
                    i10 = iA ^ i5;
                    break;
                case 766056152:
                    int i41 = ((~"com.aheaditec.talsec.security.r1".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.r1".length();
                    int i42 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i42) & 608439588) + i42) + i41))) {
                        int i43 = ((~"com.aheaditec.talsec.security.r1".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.r1".length() & 268589089) | 661640;
                        iA = M.a(i43 | length36, 2, (~i43) ^ length36, 1);
                        i5 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.r1".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.r1".length() & 1074350177) | 1342720098);
                        i5 = -887872332;
                    }
                    i10 = iA ^ i5;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i44 = ((~"com.aheaditec.talsec.security.r1".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.r1".length() & 251684176) | 1694512896;
                    int i45 = -i44;
                    length4 = length37 % (1864794098 ^ (((~i45) & length38) - (i45 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.r1".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.r1".length() & (-1878240248)) | 285229064);
                    i5 = -195569723;
                    i10 = iA ^ i5;
                    break;
                case 998066383:
                    length4 = (((B1.a(r1.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.r1".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.r1".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.r1".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.r1".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.r1".length() & (-1860698094)) | (-1190123008));
                    i5 = 1002689495;
                    i10 = iA ^ i5;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i46 = ~"com.aheaditec.talsec.security.r1".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.r1".length() & R.^attr-private.__removed0) | 553664516;
                        int i47 = -((i46 | 1510858717) & 403833600);
                        length3 = ((~i47) & length39) - (i47 & (~length39));
                        i4 = 2001041846;
                        i10 = i4 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.r1".length();
                        iA = ((i46 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i5 = -115901203;
                        i10 = iA ^ i5;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.r1".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.r1".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.r1".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.r1".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.r1".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.r1".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i48 = ((~"com.aheaditec.talsec.security.r1".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.r1".length();
                    bArr[length41] = (byte) ((length6 >> ((i48 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.r1".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.r1".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.r1".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.r1".length() & 196644) | (-2146430752));
                    int iA6 = A1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i49 = ((~"com.aheaditec.talsec.security.r1".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.r1".length();
                    int i50 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i51 = -i49;
                    bArr[iA6] = (byte) ((w1.a(~i51, i50, 2, (i50 + i51) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.r1".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.r1".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i52 = ~"com.aheaditec.talsec.security.r1".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.r1".length() | 674349280) - (i52 | 1869872636)) + (B1.a(r1.class, 1197735420 | i52) + ("com.aheaditec.talsec.security.r1".length() & 674349280))) + (("com.aheaditec.talsec.security.r1".length() & 1754529808) | 1418461202)));
                    int i53 = ((~"com.aheaditec.talsec.security.r1".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.r1".length() & 545800290) | (-1442676670);
                    int i54 = -i53;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i54) & length47) - (i54 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.r1".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.r1".length() & 33562640) | 136194);
                    i5 = -1824662634;
                    i10 = iA ^ i5;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.r1".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.r1".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i55 = ~"com.aheaditec.talsec.security.r1".length();
                        iA = (1141965102 & ((-1207265904) + i55 + (((-i55) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.r1".length() & 1292960864) | 150996032);
                        i5 = 612868558;
                        i10 = iA ^ i5;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.r1".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.r1".length() & 874653185) | 335552516);
                        i2 = (-1287294623) - length2;
                        i3 = 1287294622;
                        i10 = ((length2 & i3) * 2) + i2;
                    }
                    break;
                default:
                    int i56 = ~"com.aheaditec.talsec.security.r1".length();
                    int i57 = (((-313266948) | i56) + 45165696) - (i56 | (-269226756));
                    length = O.a(i57, 3, -N.a(i57, -4, 1, ("com.aheaditec.talsec.security.r1".length() & 44040224) | (-1811807712)), 1);
                    i = -361272203;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
            }
            return;
        }
    }

    public /* synthetic */ r1(Context context, TalsecConfig talsecConfig, TalsecMode talsecMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, talsecConfig, talsecMode);
    }

    public final void b() {
        s1 s1Var = this.e;
        if (s1Var == null) {
            byte[] bArr = {74, -65, 38, -90, -47, -15, -66, -95, 64};
            a(bArr, new byte[]{110, 50, 107, -16, -41, -14, -99, -70, 90});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            s1Var = null;
        }
        s1Var.a();
    }

    public final void c() {
        s1 s1Var = this.e;
        if (s1Var == null) {
            byte[] bArr = {44, 26, -35, -102, -85, -125, 126, -25, -127};
            a(bArr, new byte[]{-16, -13, -7, -80, 118, 113, -1, -101, -6});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            s1Var = null;
        }
        s1Var.b();
    }

    public final ByteBuffer d() {
        t1 t1Var = this.c;
        if (t1Var == null) {
            byte[] bArr = {-29, 56, 36, 89, -12, -102, 116, 25, 86, 56, -82};
            a(bArr, new byte[]{-21, -35, 95, 55, 40, 104, -48, -6, -62, -55, 123});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            t1Var = null;
        }
        ByteBuffer byteBufferA = t1Var.a();
        byte[] bArr2 = {117, -66, 38, -36, 64, -34, -88, -5, 56, 111, 120, 17, -122, 80, 81, 95};
        a(bArr2, new byte[]{113, -114, -61, -75, -43, 47, 111, -82, 33, 53, 46, -52, 57, 84, 65, 123});
        Intrinsics.checkNotNullExpressionValue(byteBufferA, new String(bArr2, StandardCharsets.UTF_8).intern());
        return byteBufferA;
    }

    public final void e() {
        s1 s1Var = this.e;
        if (s1Var == null) {
            byte[] bArr = {3, -13, 32, 2, -65, -107, -16, -50, 65};
            a(bArr, new byte[]{42, 51, 13, 71, -38, 78, 9, 99, -67});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            s1Var = null;
        }
        s1Var.c();
        CoroutineScopeKt.cancel$default(this.f, (CancellationException) null, 1, (Object) null);
    }
}
