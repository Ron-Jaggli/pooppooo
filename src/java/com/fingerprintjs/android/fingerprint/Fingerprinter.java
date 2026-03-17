package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.tools.DummyResults;
import com.fingerprintjs.android.fingerprint.tools.ResultExtensionsKt;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import com.fingerprintjs.android.fingerprint.tools.logs.Logger;
import com.fingerprintjs.android.fingerprint.tools.logs.MessagesKt;
import com.fingerprintjs.android.fingerprint.tools.threading.AnotherThreadKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: compiled from: Fingerprinter.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002)*B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0082\bJ\u001c\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012J8\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J&\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J$\u0010\u0016\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007J\n\u0010 \u001a\u0004\u0018\u00010!H\u0007J\\\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010#2\u0014\b\u0004\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0\u00122\u0014\b\u0004\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u00020\u000f0\u00122\u001f\b\u0004\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\t0\u0012¢\u0006\u0002\b(H\u0082\bR'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8BX\u0082\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter;", "", "implFactory", "Lkotlin/Function0;", "Lcom/fingerprintjs/android/fingerprint/FingerprinterImpl;", "isLegacyFactory", "", "(Lkotlin/jvm/functions/Function0;Z)V", "impl", "Lkotlin/Result;", "getImpl-d1pmJ48", "()Ljava/lang/Object;", "impl$delegate", "Lkotlin/Lazy;", "checkThisLegacyMethodSupported", "", "getDeviceId", "listener", "Lkotlin/Function1;", "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getFingerprint", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "", "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "fingerprintingSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "getFingerprintingSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "runFingerprinterImplOnAnotherThread", "T", "onError", "", "onSuccess", "call", "Lkotlin/ExtensionFunctionType;", "LegacyArgs", "Version", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Fingerprinter {
    private final Lazy impl$delegate;
    private final Function0<FingerprinterImpl> implFactory;
    private final boolean isLegacyFactory;

    public final String getFingerprint(List<? extends FingerprintingSignal<?>> list) {
        Intrinsics.checkNotNullParameter(list, "fingerprintingSignals");
        return getFingerprint$default(this, list, (Hasher) null, 2, (Object) null);
    }

    public final void getFingerprint(Version version, StabilityLevel stabilityLevel, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(function1, "listener");
        getFingerprint$default(this, version, stabilityLevel, null, function1, 4, null);
    }

    public final void getFingerprint(Version version, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(function1, "listener");
        getFingerprint$default(this, version, null, null, function1, 6, null);
    }

    @Deprecated(message = "\n        This method is deprecated in favor of getFingerprint(version,stabilityLevel, hasher, listener)\n        overload. Check out method doc for details.\n        ")
    public final void getFingerprint(Function1<? super FingerprintResult, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(function1, "listener");
        getFingerprint$default(this, (StabilityLevel) null, function1, 1, (Object) null);
    }

    public Fingerprinter(Function0<FingerprinterImpl> function0, boolean z) {
        Intrinsics.checkNotNullParameter(function0, "implFactory");
        this.implFactory = function0;
        this.isLegacyFactory = z;
        this.impl$delegate = LazyKt.lazy(new Function0<Result<? extends FingerprinterImpl>>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$impl$2
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return Result.box-impl(m8invoked1pmJ48());
            }

            /* JADX INFO: renamed from: invoke-d1pmJ48, reason: not valid java name */
            public final Object m8invoked1pmJ48() {
                Fingerprinter fingerprinter = this.this$0;
                try {
                    Result.Companion companion = Result.Companion;
                    return Result.constructor-impl((FingerprinterImpl) fingerprinter.implFactory.invoke());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    return Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getImpl-d1pmJ48, reason: not valid java name */
    public final Object m3getImpld1pmJ48() {
        return ((Result) this.impl$delegate.getValue()).unbox-impl();
    }

    public static /* synthetic */ void getFingerprint$default(Fingerprinter fingerprinter, StabilityLevel stabilityLevel, Function1 function1, int i, Object obj) throws IllegalStateException {
        if ((i & 1) != 0) {
            stabilityLevel = StabilityLevel.OPTIMAL;
        }
        fingerprinter.getFingerprint(stabilityLevel, (Function1<? super FingerprintResult, Unit>) function1);
    }

    public static /* synthetic */ void getFingerprint$default(Fingerprinter fingerprinter, Version version, StabilityLevel stabilityLevel, Hasher hasher, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            stabilityLevel = StabilityLevel.OPTIMAL;
        }
        if ((i & 4) != 0) {
            hasher = new MurMur3x64x128Hasher();
        }
        fingerprinter.getFingerprint(version, stabilityLevel, hasher, function1);
    }

    public static /* synthetic */ String getFingerprint$default(Fingerprinter fingerprinter, List list, Hasher hasher, int i, Object obj) {
        if ((i & 2) != 0) {
            hasher = new MurMur3x64x128Hasher();
        }
        return fingerprinter.getFingerprint((List<? extends FingerprintingSignal<?>>) list, hasher);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String getFingerprint(List<? extends FingerprintingSignal<?>> list, Hasher hasher) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(list, "fingerprintingSignals");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        Object objM3getImpld1pmJ48 = m3getImpld1pmJ48();
        if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
            Result.Companion companion = Result.Companion;
            objM3getImpld1pmJ48 = Result.box-impl(((FingerprinterImpl) objM3getImpld1pmJ48).m33getFingerprintgIAlus(list, hasher));
        }
        Object objFlatten = ResultExtensionsKt.flatten(Result.constructor-impl(objM3getImpld1pmJ48));
        Throwable th = Result.exceptionOrNull-impl(objFlatten);
        if (th != null) {
            MessagesKt.ePleaseReport(Logger.INSTANCE, th);
        }
        if (Result.isFailure-impl(objFlatten)) {
            objFlatten = "";
        }
        return (String) objFlatten;
    }

    public final FingerprintingSignalsProvider getFingerprintingSignalsProvider() {
        Object objM3getImpld1pmJ48 = m3getImpld1pmJ48();
        if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
            Result.Companion companion = Result.Companion;
            objM3getImpld1pmJ48 = ((FingerprinterImpl) objM3getImpld1pmJ48).getFingerprintingSignalsProvider$fingerprint_release();
        }
        Object obj = Result.constructor-impl(objM3getImpld1pmJ48);
        Throwable th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            MessagesKt.ePleaseReport(Logger.INSTANCE, th);
        }
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        return (FingerprintingSignalsProvider) obj;
    }

    private final void checkThisLegacyMethodSupported() {
        if (!this.isLegacyFactory) {
            throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
        }
    }

    private final <T> void runFingerprinterImplOnAnotherThread(final Function1<? super Throwable, Unit> function1, final Function1<? super T, Unit> function12, final Function1<? super FingerprinterImpl, ? extends Result<? extends T>> function13) {
        Throwable th = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter.runFingerprinterImplOnAnotherThread.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                m9invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m9invoke() throws NoWhenBranchMatchedException {
                Object objM3getImpld1pmJ48 = Fingerprinter.this.m3getImpld1pmJ48();
                Function1<FingerprinterImpl, Result<T>> function14 = function13;
                if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
                    Result.Companion companion = Result.Companion;
                    objM3getImpld1pmJ48 = Result.box-impl(((Result) function14.invoke((FingerprinterImpl) objM3getImpld1pmJ48)).unbox-impl());
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.constructor-impl(objM3getImpld1pmJ48));
                Function1<T, Unit> function15 = function12;
                Function1<Throwable, Unit> function16 = function1;
                Throwable th2 = Result.exceptionOrNull-impl(objFlatten);
                if (th2 != null) {
                    function16.invoke(th2);
                } else {
                    function15.invoke(objFlatten);
                }
            }
        }));
        if (th != null) {
            function1.invoke(th);
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "", "intValue", "", "(Ljava/lang/String;II)V", "getIntValue$fingerprint_release", "()I", "V_1", "V_2", "V_3", "V_4", "V_5", "V_6", "Companion", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Version {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Version[] $VALUES;
        public static final Companion Companion;
        public static final Version V_1 = new Version("V_1", 0, 1);
        public static final Version V_2 = new Version("V_2", 1, 2);
        public static final Version V_3 = new Version("V_3", 2, 3);
        public static final Version V_4 = new Version("V_4", 3, 4);
        public static final Version V_5 = new Version("V_5", 4, 5);
        public static final Version V_6 = new Version("V_6", 5, 6);
        private final int intValue;

        private static final /* synthetic */ Version[] $values() {
            return new Version[]{V_1, V_2, V_3, V_4, V_5, V_6};
        }

        public static EnumEntries<Version> getEntries() {
            return $ENTRIES;
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) $VALUES.clone();
        }

        private Version(String str, int i, int i2) {
            this.intValue = i2;
        }

        public final int getIntValue$fingerprint_release() {
            return this.intValue;
        }

        static {
            Version[] versionArr$values = $values();
            $VALUES = versionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(versionArr$values);
            Companion = new Companion(null);
        }

        /* JADX WARN: Classes with same name are omitted, all sources:
          /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
          /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
         */
        /* JADX INFO: compiled from: Fingerprinter.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version$Companion;", "", "()V", "fingerprintingFlattenedSignalsFirstVersion", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release", "()Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "fingerprintingGroupedSignalsLastVersion", "getFingerprintingGroupedSignalsLastVersion$fingerprint_release", "latest", "getLatest", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Version getLatest() {
                return (Version) ArraysKt.last(Version.values());
            }

            public final Version getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release() {
                return Version.V_5;
            }

            public final Version getFingerprintingGroupedSignalsLastVersion$fingerprint_release() {
                return Version.V_4;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
     */
    /* JADX INFO: compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;", "", "hardwareSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "osBuildSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "deviceIdProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "installedAppsSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "deviceStateSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "configuration", "Lcom/fingerprintjs/android/fingerprint/Configuration;", "(Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/Configuration;)V", "getConfiguration", "()Lcom/fingerprintjs/android/fingerprint/Configuration;", "getDeviceIdProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "getDeviceStateSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "getHardwareSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "getInstalledAppsSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "getOsBuildSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LegacyArgs {
        private final Configuration configuration;
        private final DeviceIdProvider deviceIdProvider;
        private final DeviceStateSignalGroupProvider deviceStateSignalProvider;
        private final HardwareSignalGroupProvider hardwareSignalProvider;
        private final InstalledAppsSignalGroupProvider installedAppsSignalProvider;
        private final OsBuildSignalGroupProvider osBuildSignalProvider;

        public static /* synthetic */ LegacyArgs copy$default(LegacyArgs legacyArgs, HardwareSignalGroupProvider hardwareSignalGroupProvider, OsBuildSignalGroupProvider osBuildSignalGroupProvider, DeviceIdProvider deviceIdProvider, InstalledAppsSignalGroupProvider installedAppsSignalGroupProvider, DeviceStateSignalGroupProvider deviceStateSignalGroupProvider, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                hardwareSignalGroupProvider = legacyArgs.hardwareSignalProvider;
            }
            if ((i & 2) != 0) {
                osBuildSignalGroupProvider = legacyArgs.osBuildSignalProvider;
            }
            OsBuildSignalGroupProvider osBuildSignalGroupProvider2 = osBuildSignalGroupProvider;
            if ((i & 4) != 0) {
                deviceIdProvider = legacyArgs.deviceIdProvider;
            }
            DeviceIdProvider deviceIdProvider2 = deviceIdProvider;
            if ((i & 8) != 0) {
                installedAppsSignalGroupProvider = legacyArgs.installedAppsSignalProvider;
            }
            InstalledAppsSignalGroupProvider installedAppsSignalGroupProvider2 = installedAppsSignalGroupProvider;
            if ((i & 16) != 0) {
                deviceStateSignalGroupProvider = legacyArgs.deviceStateSignalProvider;
            }
            DeviceStateSignalGroupProvider deviceStateSignalGroupProvider2 = deviceStateSignalGroupProvider;
            if ((i & 32) != 0) {
                configuration = legacyArgs.configuration;
            }
            return legacyArgs.copy(hardwareSignalGroupProvider, osBuildSignalGroupProvider2, deviceIdProvider2, installedAppsSignalGroupProvider2, deviceStateSignalGroupProvider2, configuration);
        }

        public final HardwareSignalGroupProvider component1() {
            return this.hardwareSignalProvider;
        }

        public final OsBuildSignalGroupProvider component2() {
            return this.osBuildSignalProvider;
        }

        public final DeviceIdProvider component3() {
            return this.deviceIdProvider;
        }

        public final InstalledAppsSignalGroupProvider component4() {
            return this.installedAppsSignalProvider;
        }

        public final DeviceStateSignalGroupProvider component5() {
            return this.deviceStateSignalProvider;
        }

        public final Configuration component6() {
            return this.configuration;
        }

        public final LegacyArgs copy(HardwareSignalGroupProvider hardwareSignalGroupProvider, OsBuildSignalGroupProvider osBuildSignalGroupProvider, DeviceIdProvider deviceIdProvider, InstalledAppsSignalGroupProvider installedAppsSignalGroupProvider, DeviceStateSignalGroupProvider deviceStateSignalGroupProvider, Configuration configuration) {
            Intrinsics.checkNotNullParameter(hardwareSignalGroupProvider, "hardwareSignalProvider");
            Intrinsics.checkNotNullParameter(osBuildSignalGroupProvider, "osBuildSignalProvider");
            Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
            Intrinsics.checkNotNullParameter(installedAppsSignalGroupProvider, "installedAppsSignalProvider");
            Intrinsics.checkNotNullParameter(deviceStateSignalGroupProvider, "deviceStateSignalProvider");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new LegacyArgs(hardwareSignalGroupProvider, osBuildSignalGroupProvider, deviceIdProvider, installedAppsSignalGroupProvider, deviceStateSignalGroupProvider, configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegacyArgs)) {
                return false;
            }
            LegacyArgs legacyArgs = (LegacyArgs) obj;
            return Intrinsics.areEqual(this.hardwareSignalProvider, legacyArgs.hardwareSignalProvider) && Intrinsics.areEqual(this.osBuildSignalProvider, legacyArgs.osBuildSignalProvider) && Intrinsics.areEqual(this.deviceIdProvider, legacyArgs.deviceIdProvider) && Intrinsics.areEqual(this.installedAppsSignalProvider, legacyArgs.installedAppsSignalProvider) && Intrinsics.areEqual(this.deviceStateSignalProvider, legacyArgs.deviceStateSignalProvider) && Intrinsics.areEqual(this.configuration, legacyArgs.configuration);
        }

        public int hashCode() {
            return (((((((((this.hardwareSignalProvider.hashCode() * 31) + this.osBuildSignalProvider.hashCode()) * 31) + this.deviceIdProvider.hashCode()) * 31) + this.installedAppsSignalProvider.hashCode()) * 31) + this.deviceStateSignalProvider.hashCode()) * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "LegacyArgs(hardwareSignalProvider=" + this.hardwareSignalProvider + ", osBuildSignalProvider=" + this.osBuildSignalProvider + ", deviceIdProvider=" + this.deviceIdProvider + ", installedAppsSignalProvider=" + this.installedAppsSignalProvider + ", deviceStateSignalProvider=" + this.deviceStateSignalProvider + ", configuration=" + this.configuration + ')';
        }

        public LegacyArgs(HardwareSignalGroupProvider hardwareSignalGroupProvider, OsBuildSignalGroupProvider osBuildSignalGroupProvider, DeviceIdProvider deviceIdProvider, InstalledAppsSignalGroupProvider installedAppsSignalGroupProvider, DeviceStateSignalGroupProvider deviceStateSignalGroupProvider, Configuration configuration) {
            Intrinsics.checkNotNullParameter(hardwareSignalGroupProvider, "hardwareSignalProvider");
            Intrinsics.checkNotNullParameter(osBuildSignalGroupProvider, "osBuildSignalProvider");
            Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
            Intrinsics.checkNotNullParameter(installedAppsSignalGroupProvider, "installedAppsSignalProvider");
            Intrinsics.checkNotNullParameter(deviceStateSignalGroupProvider, "deviceStateSignalProvider");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.hardwareSignalProvider = hardwareSignalGroupProvider;
            this.osBuildSignalProvider = osBuildSignalGroupProvider;
            this.deviceIdProvider = deviceIdProvider;
            this.installedAppsSignalProvider = installedAppsSignalGroupProvider;
            this.deviceStateSignalProvider = deviceStateSignalGroupProvider;
            this.configuration = configuration;
        }

        public final HardwareSignalGroupProvider getHardwareSignalProvider() {
            return this.hardwareSignalProvider;
        }

        public final OsBuildSignalGroupProvider getOsBuildSignalProvider() {
            return this.osBuildSignalProvider;
        }

        public final DeviceIdProvider getDeviceIdProvider() {
            return this.deviceIdProvider;
        }

        public final InstalledAppsSignalGroupProvider getInstalledAppsSignalProvider() {
            return this.installedAppsSignalProvider;
        }

        public final DeviceStateSignalGroupProvider getDeviceStateSignalProvider() {
            return this.deviceStateSignalProvider;
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }
    }

    @Deprecated(message = "\n        This method has been deprecated in favor of getDeviceId(version, listener) overload. Check out method doc for details.\n    ")
    public final void getDeviceId(final Function1<? super DeviceIdResult, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(function1, "listener");
        if (!this.isLegacyFactory) {
            throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
        }
        Throwable th = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                m4invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4invoke() throws NoWhenBranchMatchedException {
                Object objM3getImpld1pmJ48 = this.this$0.m3getImpld1pmJ48();
                if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
                    Result.Companion companion = Result.Companion;
                    objM3getImpld1pmJ48 = Result.box-impl(((FingerprinterImpl) objM3getImpld1pmJ48).m30getDeviceIdd1pmJ48());
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.constructor-impl(objM3getImpld1pmJ48));
                Function1 function12 = function1;
                Throwable th2 = Result.exceptionOrNull-impl(objFlatten);
                if (th2 == null) {
                    function12.invoke(objFlatten);
                } else {
                    function1.invoke(DummyResults.INSTANCE.getDeviceIdResult());
                    MessagesKt.ePleaseReport(Logger.INSTANCE, th2);
                }
            }
        }));
        if (th != null) {
            function1.invoke(DummyResults.INSTANCE.getDeviceIdResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, th);
        }
    }

    public final void getDeviceId(final Version version, final Function1<? super DeviceIdResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(function1, "listener");
        Throwable th = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                m5invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5invoke() throws NoWhenBranchMatchedException {
                Object objM3getImpld1pmJ48 = this.this$0.m3getImpld1pmJ48();
                if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
                    Result.Companion companion = Result.Companion;
                    objM3getImpld1pmJ48 = Result.box-impl(((FingerprinterImpl) objM3getImpld1pmJ48).m29getDeviceIdIoAF18A(version));
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.constructor-impl(objM3getImpld1pmJ48));
                Function1 function12 = function1;
                Throwable th2 = Result.exceptionOrNull-impl(objFlatten);
                if (th2 == null) {
                    function12.invoke(objFlatten);
                } else {
                    function1.invoke(DummyResults.INSTANCE.getDeviceIdResult());
                    MessagesKt.ePleaseReport(Logger.INSTANCE, th2);
                }
            }
        }));
        if (th != null) {
            function1.invoke(DummyResults.INSTANCE.getDeviceIdResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, th);
        }
    }

    @Deprecated(message = "\n        This method is deprecated in favor of getFingerprint(version,stabilityLevel, hasher, listener)\n        overload. Check out method doc for details.\n        ")
    public final void getFingerprint(final StabilityLevel stabilityLevel, final Function1<? super FingerprintResult, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(function1, "listener");
        if (!this.isLegacyFactory) {
            throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
        }
        Throwable th = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                m6invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m6invoke() throws NoWhenBranchMatchedException {
                Object objM3getImpld1pmJ48 = this.this$0.m3getImpld1pmJ48();
                if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
                    Result.Companion companion = Result.Companion;
                    objM3getImpld1pmJ48 = Result.box-impl(((FingerprinterImpl) objM3getImpld1pmJ48).m32getFingerprintIoAF18A(stabilityLevel));
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.constructor-impl(objM3getImpld1pmJ48));
                Function1 function12 = function1;
                Throwable th2 = Result.exceptionOrNull-impl(objFlatten);
                if (th2 == null) {
                    function12.invoke(objFlatten);
                } else {
                    function1.invoke(DummyResults.INSTANCE.getFingerprintResult());
                    MessagesKt.ePleaseReport(Logger.INSTANCE, th2);
                }
            }
        }));
        if (th != null) {
            function1.invoke(DummyResults.INSTANCE.getFingerprintResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, th);
        }
    }

    public final void getFingerprint(final Version version, final StabilityLevel stabilityLevel, final Hasher hasher, final Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        Intrinsics.checkNotNullParameter(function1, "listener");
        Throwable th = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread(new Function0<Unit>() { // from class: com.fingerprintjs.android.fingerprint.Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public /* bridge */ /* synthetic */ Object invoke() throws NoWhenBranchMatchedException {
                m7invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7invoke() throws NoWhenBranchMatchedException {
                Object objM3getImpld1pmJ48 = this.this$0.m3getImpld1pmJ48();
                if (Result.isSuccess-impl(objM3getImpld1pmJ48)) {
                    Result.Companion companion = Result.Companion;
                    objM3getImpld1pmJ48 = Result.box-impl(((FingerprinterImpl) objM3getImpld1pmJ48).m31getFingerprint0E7RQCE(version, stabilityLevel, hasher));
                }
                Object objFlatten = ResultExtensionsKt.flatten(Result.constructor-impl(objM3getImpld1pmJ48));
                Function1 function12 = function1;
                Throwable th2 = Result.exceptionOrNull-impl(objFlatten);
                if (th2 == null) {
                    function12.invoke(objFlatten);
                } else {
                    function1.invoke("");
                    MessagesKt.ePleaseReport(Logger.INSTANCE, th2);
                }
            }
        }));
        if (th != null) {
            function1.invoke("");
            MessagesKt.ePleaseReport(Logger.INSTANCE, th);
        }
    }
}
