package com.fingerprintjs.android.fingerprint.tools;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AbiTypeSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AccessibilityEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AdbEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AlarmAlertPathSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AndroidVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ApplicationsListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AvailableLocalesSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.BatteryFullCapacitySignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.BatteryHealthSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.CameraListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.CodecListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.CoresCountSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DataRoamingEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DateFormatSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DefaultInputMethodSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DefaultLanguageSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DevelopmentSettingsEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.EncryptionStatusSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.EndButtonBehaviourSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintSensorStatusSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FontScaleSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.GlesVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.HttpProxySignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.InputDevicesSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.InputDevicesV2Signal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.IsPinSecurityEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.KernelVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ManufacturerNameSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ModelNameSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ProcCpuInfoSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ProcCpuInfoV2Signal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.RegionCountrySignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.RingtoneSourceSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.RttCallingModeSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ScreenOffTimeoutSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SdkVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SecurityProvidersSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SensorsSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SystemApplicationsListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TextAutoPunctuateSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TextAutoReplaceEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.Time12Or24Signal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TimezoneSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TotalInternalStorageSpaceSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TotalRamSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TouchExplorationEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TransitionAnimationScaleSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.WindowAnimationScaleSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: FingerprintingLegacySchemeSupportExtensions.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/FingerprintingLegacySchemeSupportExtensions;", "", "()V", "getDeviceStateSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "getHardwareSignals", "getInstalledAppsSignals", "getOsBuildSignals", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FingerprintingLegacySchemeSupportExtensions {
    public static final FingerprintingLegacySchemeSupportExtensions INSTANCE = new FingerprintingLegacySchemeSupportExtensions();

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
     */
    /* JADX INFO: compiled from: FingerprintingLegacySchemeSupportExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Fingerprinter.Version.values().length];
            try {
                iArr[Fingerprinter.Version.V_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FingerprintingLegacySchemeSupportExtensions() {
    }

    public final List<FingerprintingSignal<?>> getHardwareSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, Fingerprinter.Version version, StabilityLevel stabilityLevel) {
        List<Pair> listListOf;
        Intrinsics.checkNotNullParameter(fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        if (version.compareTo(Fingerprinter.Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) >= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (WhenMappings.$EnumSwitchMapping$0[version.ordinal()] == 1) {
            listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(ManufacturerNameSignal.Companion.getInfo(), new Function0<ManufacturerNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ManufacturerNameSignal m224invoke() {
                    return fingerprintingSignalsProvider.getManufacturerNameSignal();
                }
            }), TuplesKt.to(ModelNameSignal.Companion.getInfo(), new Function0<ModelNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.2
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ModelNameSignal m235invoke() {
                    return fingerprintingSignalsProvider.getModelNameSignal();
                }
            }), TuplesKt.to(TotalRamSignal.Companion.getInfo(), new Function0<TotalRamSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TotalRamSignal m246invoke() {
                    return fingerprintingSignalsProvider.getTotalRamSignal();
                }
            }), TuplesKt.to(TotalInternalStorageSpaceSignal.Companion.getInfo(), new Function0<TotalInternalStorageSpaceSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.4
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TotalInternalStorageSpaceSignal m253invoke() {
                    return fingerprintingSignalsProvider.getTotalInternalStorageSpaceSignal();
                }
            }), TuplesKt.to(ProcCpuInfoSignal.Companion.getInfo(), new Function0<ProcCpuInfoSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.5
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ProcCpuInfoSignal m254invoke() {
                    return fingerprintingSignalsProvider.getProcCpuInfoSignal();
                }
            }), TuplesKt.to(SensorsSignal.Companion.getInfo(), new Function0<SensorsSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.6
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SensorsSignal m255invoke() {
                    return fingerprintingSignalsProvider.getSensorsSignal();
                }
            }), TuplesKt.to(InputDevicesSignal.Companion.getInfo(), new Function0<InputDevicesSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.7
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final InputDevicesSignal m256invoke() {
                    return fingerprintingSignalsProvider.getInputDevicesSignal();
                }
            })});
        } else {
            Fingerprinter.Version version2 = Fingerprinter.Version.V_2;
            if (version.compareTo((Object) Fingerprinter.Version.V_3) <= 0 && version.compareTo((Object) version2) >= 0) {
                listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(ManufacturerNameSignal.Companion.getInfo(), new Function0<ManufacturerNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.8
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ManufacturerNameSignal m257invoke() {
                        return fingerprintingSignalsProvider.getManufacturerNameSignal();
                    }
                }), TuplesKt.to(ModelNameSignal.Companion.getInfo(), new Function0<ModelNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.9
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ModelNameSignal m258invoke() {
                        return fingerprintingSignalsProvider.getModelNameSignal();
                    }
                }), TuplesKt.to(TotalRamSignal.Companion.getInfo(), new Function0<TotalRamSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.10
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TotalRamSignal m225invoke() {
                        return fingerprintingSignalsProvider.getTotalRamSignal();
                    }
                }), TuplesKt.to(TotalInternalStorageSpaceSignal.Companion.getInfo(), new Function0<TotalInternalStorageSpaceSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.11
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TotalInternalStorageSpaceSignal m226invoke() {
                        return fingerprintingSignalsProvider.getTotalInternalStorageSpaceSignal();
                    }
                }), TuplesKt.to(ProcCpuInfoSignal.Companion.getInfo(), new Function0<ProcCpuInfoSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.12
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ProcCpuInfoSignal m227invoke() {
                        return fingerprintingSignalsProvider.getProcCpuInfoSignal();
                    }
                }), TuplesKt.to(SensorsSignal.Companion.getInfo(), new Function0<SensorsSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.13
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SensorsSignal m228invoke() {
                        return fingerprintingSignalsProvider.getSensorsSignal();
                    }
                }), TuplesKt.to(InputDevicesSignal.Companion.getInfo(), new Function0<InputDevicesSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.14
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InputDevicesSignal m229invoke() {
                        return fingerprintingSignalsProvider.getInputDevicesSignal();
                    }
                }), TuplesKt.to(BatteryFullCapacitySignal.Companion.getInfo(), new Function0<BatteryFullCapacitySignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.15
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final BatteryFullCapacitySignal m230invoke() {
                        return fingerprintingSignalsProvider.getBatteryFullCapacitySignal();
                    }
                }), TuplesKt.to(BatteryHealthSignal.Companion.getInfo(), new Function0<BatteryHealthSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.16
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final BatteryHealthSignal m231invoke() {
                        return fingerprintingSignalsProvider.getBatteryHealthSignal();
                    }
                }), TuplesKt.to(GlesVersionSignal.Companion.getInfo(), new Function0<GlesVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.17
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GlesVersionSignal m232invoke() {
                        return fingerprintingSignalsProvider.getGlesVersionSignal();
                    }
                }), TuplesKt.to(AbiTypeSignal.Companion.getInfo(), new Function0<AbiTypeSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.18
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AbiTypeSignal m233invoke() {
                        return fingerprintingSignalsProvider.getAbiTypeSignal();
                    }
                }), TuplesKt.to(CoresCountSignal.Companion.getInfo(), new Function0<CoresCountSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.19
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CoresCountSignal m234invoke() {
                        return fingerprintingSignalsProvider.getCoresCountSignal();
                    }
                }), TuplesKt.to(CameraListSignal.Companion.getInfo(), new Function0<CameraListSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.20
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CameraListSignal m236invoke() {
                        return fingerprintingSignalsProvider.getCameraListSignal();
                    }
                })});
            } else {
                listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(ManufacturerNameSignal.Companion.getInfo(), new Function0<ManufacturerNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.21
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ManufacturerNameSignal m237invoke() {
                        return fingerprintingSignalsProvider.getManufacturerNameSignal();
                    }
                }), TuplesKt.to(ModelNameSignal.Companion.getInfo(), new Function0<ModelNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.22
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ModelNameSignal m238invoke() {
                        return fingerprintingSignalsProvider.getModelNameSignal();
                    }
                }), TuplesKt.to(TotalRamSignal.Companion.getInfo(), new Function0<TotalRamSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.23
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TotalRamSignal m239invoke() {
                        return fingerprintingSignalsProvider.getTotalRamSignal();
                    }
                }), TuplesKt.to(TotalInternalStorageSpaceSignal.Companion.getInfo(), new Function0<TotalInternalStorageSpaceSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.24
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final TotalInternalStorageSpaceSignal m240invoke() {
                        return fingerprintingSignalsProvider.getTotalInternalStorageSpaceSignal();
                    }
                }), TuplesKt.to(ProcCpuInfoSignal.Companion.getInfo(), new Function0<ProcCpuInfoSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.25
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ProcCpuInfoSignal m241invoke() {
                        return fingerprintingSignalsProvider.getProcCpuInfoSignal();
                    }
                }), TuplesKt.to(ProcCpuInfoV2Signal.Companion.getInfo(), new Function0<ProcCpuInfoV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.26
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final ProcCpuInfoV2Signal m242invoke() {
                        return fingerprintingSignalsProvider.getProcCpuInfoV2Signal();
                    }
                }), TuplesKt.to(SensorsSignal.Companion.getInfo(), new Function0<SensorsSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.27
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final SensorsSignal m243invoke() {
                        return fingerprintingSignalsProvider.getSensorsSignal();
                    }
                }), TuplesKt.to(InputDevicesSignal.Companion.getInfo(), new Function0<InputDevicesSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.28
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InputDevicesSignal m244invoke() {
                        return fingerprintingSignalsProvider.getInputDevicesSignal();
                    }
                }), TuplesKt.to(InputDevicesV2Signal.Companion.getInfo(), new Function0<InputDevicesV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.29
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final InputDevicesV2Signal m245invoke() {
                        return fingerprintingSignalsProvider.getInputDevicesV2Signal();
                    }
                }), TuplesKt.to(BatteryHealthSignal.Companion.getInfo(), new Function0<BatteryHealthSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.30
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final BatteryHealthSignal m247invoke() {
                        return fingerprintingSignalsProvider.getBatteryHealthSignal();
                    }
                }), TuplesKt.to(BatteryFullCapacitySignal.Companion.getInfo(), new Function0<BatteryFullCapacitySignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.31
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final BatteryFullCapacitySignal m248invoke() {
                        return fingerprintingSignalsProvider.getBatteryFullCapacitySignal();
                    }
                }), TuplesKt.to(CameraListSignal.Companion.getInfo(), new Function0<CameraListSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.32
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CameraListSignal m249invoke() {
                        return fingerprintingSignalsProvider.getCameraListSignal();
                    }
                }), TuplesKt.to(GlesVersionSignal.Companion.getInfo(), new Function0<GlesVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.33
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final GlesVersionSignal m250invoke() {
                        return fingerprintingSignalsProvider.getGlesVersionSignal();
                    }
                }), TuplesKt.to(AbiTypeSignal.Companion.getInfo(), new Function0<AbiTypeSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.34
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final AbiTypeSignal m251invoke() {
                        return fingerprintingSignalsProvider.getAbiTypeSignal();
                    }
                }), TuplesKt.to(CoresCountSignal.Companion.getInfo(), new Function0<CoresCountSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getHardwareSignals.35
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final CoresCountSignal m252invoke() {
                        return fingerprintingSignalsProvider.getCoresCountSignal();
                    }
                })});
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listListOf) {
            FingerprintingSignal fingerprintingSignalCreateSignalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(version, stabilityLevel, (FingerprintingSignal.Info) pair.getFirst(), (Function0) pair.getSecond());
            if (fingerprintingSignalCreateSignalIfNeeded != null) {
                arrayList.add(fingerprintingSignalCreateSignalIfNeeded);
            }
        }
        return arrayList;
    }

    public final List<FingerprintingSignal<?>> getOsBuildSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, Fingerprinter.Version version, StabilityLevel stabilityLevel) {
        List<Pair> listListOf;
        Intrinsics.checkNotNullParameter(fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        if (version.compareTo(Fingerprinter.Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) >= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (WhenMappings.$EnumSwitchMapping$0[version.ordinal()] == 1) {
            listListOf = CollectionsKt.listOf(TuplesKt.to(FingerprintSignal.Companion.getInfo(), new Function0<FingerprintSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final FingerprintSignal m262invoke() {
                    return fingerprintingSignalsProvider.getFingerprintSignal();
                }
            }));
        } else {
            listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(AndroidVersionSignal.Companion.getInfo(), new Function0<AndroidVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.2
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AndroidVersionSignal m263invoke() {
                    return fingerprintingSignalsProvider.getAndroidVersionSignal();
                }
            }), TuplesKt.to(SdkVersionSignal.Companion.getInfo(), new Function0<SdkVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SdkVersionSignal m264invoke() {
                    return fingerprintingSignalsProvider.getSdkVersionSignal();
                }
            }), TuplesKt.to(KernelVersionSignal.Companion.getInfo(), new Function0<KernelVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.4
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final KernelVersionSignal m265invoke() {
                    return fingerprintingSignalsProvider.getKernelVersionSignal();
                }
            }), TuplesKt.to(EncryptionStatusSignal.Companion.getInfo(), new Function0<EncryptionStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.5
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final EncryptionStatusSignal m266invoke() {
                    return fingerprintingSignalsProvider.getEncryptionStatusSignal();
                }
            }), TuplesKt.to(SecurityProvidersSignal.Companion.getInfo(), new Function0<SecurityProvidersSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.6
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SecurityProvidersSignal m267invoke() {
                    return fingerprintingSignalsProvider.getSecurityProvidersSignal();
                }
            }), TuplesKt.to(CodecListSignal.Companion.getInfo(), new Function0<CodecListSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getOsBuildSignals.7
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final CodecListSignal m268invoke() {
                    return fingerprintingSignalsProvider.getCodecListSignal();
                }
            })});
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listListOf) {
            FingerprintingSignal fingerprintingSignalCreateSignalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(version, stabilityLevel, (FingerprintingSignal.Info) pair.getFirst(), (Function0) pair.getSecond());
            if (fingerprintingSignalCreateSignalIfNeeded != null) {
                arrayList.add(fingerprintingSignalCreateSignalIfNeeded);
            }
        }
        return arrayList;
    }

    public final List<FingerprintingSignal<?>> getDeviceStateSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, Fingerprinter.Version version, StabilityLevel stabilityLevel) {
        List<Pair> listListOf;
        Intrinsics.checkNotNullParameter(fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        if (version.compareTo(Fingerprinter.Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) >= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        StabilityLevel stabilityLevel2 = WhenMappings.$EnumSwitchMapping$0[version.ordinal()] == 1 ? StabilityLevel.UNIQUE : stabilityLevel;
        if (WhenMappings.$EnumSwitchMapping$0[version.ordinal()] == 1) {
            listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(AdbEnabledSignal.Companion.getInfo(), new Function0<AdbEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AdbEnabledSignal m180invoke() {
                    return fingerprintingSignalsProvider.getAdbEnabledSignal();
                }
            }), TuplesKt.to(DevelopmentSettingsEnabledSignal.Companion.getInfo(), new Function0<DevelopmentSettingsEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.2
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DevelopmentSettingsEnabledSignal m191invoke() {
                    return fingerprintingSignalsProvider.getDevelopmentSettingsEnabledSignal();
                }
            }), TuplesKt.to(HttpProxySignal.Companion.getInfo(), new Function0<HttpProxySignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final HttpProxySignal m202invoke() {
                    return fingerprintingSignalsProvider.getHttpProxySignal();
                }
            }), TuplesKt.to(TransitionAnimationScaleSignal.Companion.getInfo(), new Function0<TransitionAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.4
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TransitionAnimationScaleSignal m213invoke() {
                    return fingerprintingSignalsProvider.getTransitionAnimationScaleSignal();
                }
            }), TuplesKt.to(WindowAnimationScaleSignal.Companion.getInfo(), new Function0<WindowAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.5
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final WindowAnimationScaleSignal m219invoke() {
                    return fingerprintingSignalsProvider.getWindowAnimationScaleSignal();
                }
            }), TuplesKt.to(DataRoamingEnabledSignal.Companion.getInfo(), new Function0<DataRoamingEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.6
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DataRoamingEnabledSignal m220invoke() {
                    return fingerprintingSignalsProvider.getDataRoamingEnabledSignal();
                }
            }), TuplesKt.to(AccessibilityEnabledSignal.Companion.getInfo(), new Function0<AccessibilityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.7
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AccessibilityEnabledSignal m221invoke() {
                    return fingerprintingSignalsProvider.getAccessibilityEnabledSignal();
                }
            }), TuplesKt.to(DefaultInputMethodSignal.Companion.getInfo(), new Function0<DefaultInputMethodSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.8
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DefaultInputMethodSignal m222invoke() {
                    return fingerprintingSignalsProvider.getDefaultInputMethodSignal();
                }
            }), TuplesKt.to(RttCallingModeSignal.Companion.getInfo(), new Function0<RttCallingModeSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.9
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final RttCallingModeSignal m223invoke() {
                    return fingerprintingSignalsProvider.getRttCallingModeSignal();
                }
            }), TuplesKt.to(TouchExplorationEnabledSignal.Companion.getInfo(), new Function0<TouchExplorationEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.10
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TouchExplorationEnabledSignal m181invoke() {
                    return fingerprintingSignalsProvider.getTouchExplorationEnabledSignal();
                }
            }), TuplesKt.to(AlarmAlertPathSignal.Companion.getInfo(), new Function0<AlarmAlertPathSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.11
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AlarmAlertPathSignal m182invoke() {
                    return fingerprintingSignalsProvider.getAlarmAlertPathSignal();
                }
            }), TuplesKt.to(DateFormatSignal.Companion.getInfo(), new Function0<DateFormatSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.12
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DateFormatSignal m183invoke() {
                    return fingerprintingSignalsProvider.getDateFormatSignal();
                }
            }), TuplesKt.to(EndButtonBehaviourSignal.Companion.getInfo(), new Function0<EndButtonBehaviourSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.13
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final EndButtonBehaviourSignal m184invoke() {
                    return fingerprintingSignalsProvider.getEndButtonBehaviourSignal();
                }
            }), TuplesKt.to(FontScaleSignal.Companion.getInfo(), new Function0<FontScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.14
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final FontScaleSignal m185invoke() {
                    return fingerprintingSignalsProvider.getFontScaleSignal();
                }
            }), TuplesKt.to(ScreenOffTimeoutSignal.Companion.getInfo(), new Function0<ScreenOffTimeoutSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.15
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ScreenOffTimeoutSignal m186invoke() {
                    return fingerprintingSignalsProvider.getScreenOffTimeoutSignal();
                }
            }), TuplesKt.to(TextAutoReplaceEnabledSignal.Companion.getInfo(), new Function0<TextAutoReplaceEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.16
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TextAutoReplaceEnabledSignal m187invoke() {
                    return fingerprintingSignalsProvider.getTextAutoReplaceEnabledSignal();
                }
            }), TuplesKt.to(TextAutoPunctuateSignal.Companion.getInfo(), new Function0<TextAutoPunctuateSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.17
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TextAutoPunctuateSignal m188invoke() {
                    return fingerprintingSignalsProvider.getTextAutoPunctuateSignal();
                }
            }), TuplesKt.to(Time12Or24Signal.Companion.getInfo(), new Function0<Time12Or24Signal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.18
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Time12Or24Signal m189invoke() {
                    return fingerprintingSignalsProvider.getTime12Or24Signal();
                }
            }), TuplesKt.to(IsPinSecurityEnabledSignal.Companion.getInfo(), new Function0<IsPinSecurityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.19
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final IsPinSecurityEnabledSignal m190invoke() {
                    return fingerprintingSignalsProvider.isPinSecurityEnabledSignal();
                }
            }), TuplesKt.to(FingerprintSensorStatusSignal.Companion.getInfo(), new Function0<FingerprintSensorStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.20
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final FingerprintSensorStatusSignal m192invoke() {
                    return fingerprintingSignalsProvider.getFingerprintSensorStatusSignal();
                }
            }), TuplesKt.to(RingtoneSourceSignal.Companion.getInfo(), new Function0<RingtoneSourceSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.21
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final RingtoneSourceSignal m193invoke() {
                    return fingerprintingSignalsProvider.getRingtoneSourceSignal();
                }
            }), TuplesKt.to(AvailableLocalesSignal.Companion.getInfo(), new Function0<AvailableLocalesSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.22
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AvailableLocalesSignal m194invoke() {
                    return fingerprintingSignalsProvider.getAvailableLocalesSignal();
                }
            })});
        } else {
            listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(AdbEnabledSignal.Companion.getInfo(), new Function0<AdbEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.23
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AdbEnabledSignal m195invoke() {
                    return fingerprintingSignalsProvider.getAdbEnabledSignal();
                }
            }), TuplesKt.to(DevelopmentSettingsEnabledSignal.Companion.getInfo(), new Function0<DevelopmentSettingsEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.24
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DevelopmentSettingsEnabledSignal m196invoke() {
                    return fingerprintingSignalsProvider.getDevelopmentSettingsEnabledSignal();
                }
            }), TuplesKt.to(HttpProxySignal.Companion.getInfo(), new Function0<HttpProxySignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.25
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final HttpProxySignal m197invoke() {
                    return fingerprintingSignalsProvider.getHttpProxySignal();
                }
            }), TuplesKt.to(TransitionAnimationScaleSignal.Companion.getInfo(), new Function0<TransitionAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.26
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TransitionAnimationScaleSignal m198invoke() {
                    return fingerprintingSignalsProvider.getTransitionAnimationScaleSignal();
                }
            }), TuplesKt.to(WindowAnimationScaleSignal.Companion.getInfo(), new Function0<WindowAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.27
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final WindowAnimationScaleSignal m199invoke() {
                    return fingerprintingSignalsProvider.getWindowAnimationScaleSignal();
                }
            }), TuplesKt.to(DataRoamingEnabledSignal.Companion.getInfo(), new Function0<DataRoamingEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.28
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DataRoamingEnabledSignal m200invoke() {
                    return fingerprintingSignalsProvider.getDataRoamingEnabledSignal();
                }
            }), TuplesKt.to(AccessibilityEnabledSignal.Companion.getInfo(), new Function0<AccessibilityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.29
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AccessibilityEnabledSignal m201invoke() {
                    return fingerprintingSignalsProvider.getAccessibilityEnabledSignal();
                }
            }), TuplesKt.to(DefaultInputMethodSignal.Companion.getInfo(), new Function0<DefaultInputMethodSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.30
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DefaultInputMethodSignal m203invoke() {
                    return fingerprintingSignalsProvider.getDefaultInputMethodSignal();
                }
            }), TuplesKt.to(TouchExplorationEnabledSignal.Companion.getInfo(), new Function0<TouchExplorationEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.31
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TouchExplorationEnabledSignal m204invoke() {
                    return fingerprintingSignalsProvider.getTouchExplorationEnabledSignal();
                }
            }), TuplesKt.to(AlarmAlertPathSignal.Companion.getInfo(), new Function0<AlarmAlertPathSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.32
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AlarmAlertPathSignal m205invoke() {
                    return fingerprintingSignalsProvider.getAlarmAlertPathSignal();
                }
            }), TuplesKt.to(DateFormatSignal.Companion.getInfo(), new Function0<DateFormatSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.33
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DateFormatSignal m206invoke() {
                    return fingerprintingSignalsProvider.getDateFormatSignal();
                }
            }), TuplesKt.to(EndButtonBehaviourSignal.Companion.getInfo(), new Function0<EndButtonBehaviourSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.34
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final EndButtonBehaviourSignal m207invoke() {
                    return fingerprintingSignalsProvider.getEndButtonBehaviourSignal();
                }
            }), TuplesKt.to(FontScaleSignal.Companion.getInfo(), new Function0<FontScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.35
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final FontScaleSignal m208invoke() {
                    return fingerprintingSignalsProvider.getFontScaleSignal();
                }
            }), TuplesKt.to(ScreenOffTimeoutSignal.Companion.getInfo(), new Function0<ScreenOffTimeoutSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.36
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ScreenOffTimeoutSignal m209invoke() {
                    return fingerprintingSignalsProvider.getScreenOffTimeoutSignal();
                }
            }), TuplesKt.to(Time12Or24Signal.Companion.getInfo(), new Function0<Time12Or24Signal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.37
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Time12Or24Signal m210invoke() {
                    return fingerprintingSignalsProvider.getTime12Or24Signal();
                }
            }), TuplesKt.to(IsPinSecurityEnabledSignal.Companion.getInfo(), new Function0<IsPinSecurityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.38
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final IsPinSecurityEnabledSignal m211invoke() {
                    return fingerprintingSignalsProvider.isPinSecurityEnabledSignal();
                }
            }), TuplesKt.to(FingerprintSensorStatusSignal.Companion.getInfo(), new Function0<FingerprintSensorStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.39
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final FingerprintSensorStatusSignal m212invoke() {
                    return fingerprintingSignalsProvider.getFingerprintSensorStatusSignal();
                }
            }), TuplesKt.to(RingtoneSourceSignal.Companion.getInfo(), new Function0<RingtoneSourceSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.40
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final RingtoneSourceSignal m214invoke() {
                    return fingerprintingSignalsProvider.getRingtoneSourceSignal();
                }
            }), TuplesKt.to(AvailableLocalesSignal.Companion.getInfo(), new Function0<AvailableLocalesSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.41
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final AvailableLocalesSignal m215invoke() {
                    return fingerprintingSignalsProvider.getAvailableLocalesSignal();
                }
            }), TuplesKt.to(RegionCountrySignal.Companion.getInfo(), new Function0<RegionCountrySignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.42
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final RegionCountrySignal m216invoke() {
                    return fingerprintingSignalsProvider.getRegionCountrySignal();
                }
            }), TuplesKt.to(TimezoneSignal.Companion.getInfo(), new Function0<TimezoneSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.43
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final TimezoneSignal m217invoke() {
                    return fingerprintingSignalsProvider.getTimezoneSignal();
                }
            }), TuplesKt.to(DefaultLanguageSignal.Companion.getInfo(), new Function0<DefaultLanguageSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getDeviceStateSignals.44
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final DefaultLanguageSignal m218invoke() {
                    return fingerprintingSignalsProvider.getDefaultLanguageSignal();
                }
            })});
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listListOf) {
            FingerprintingSignal fingerprintingSignalCreateSignalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(version, stabilityLevel2, (FingerprintingSignal.Info) pair.getFirst(), (Function0) pair.getSecond());
            if (fingerprintingSignalCreateSignalIfNeeded != null) {
                arrayList.add(fingerprintingSignalCreateSignalIfNeeded);
            }
        }
        return arrayList;
    }

    public final List<FingerprintingSignal<?>> getInstalledAppsSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, Fingerprinter.Version version, StabilityLevel stabilityLevel) {
        List<Pair> listListOf;
        Intrinsics.checkNotNullParameter(fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        if (version.compareTo(Fingerprinter.Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) >= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (WhenMappings.$EnumSwitchMapping$0[version.ordinal()] == 1) {
            stabilityLevel = StabilityLevel.UNIQUE;
        }
        if (WhenMappings.$EnumSwitchMapping$0[version.ordinal()] == 1) {
            listListOf = CollectionsKt.listOf(TuplesKt.to(ApplicationsListSignal.Companion.getInfo(), new Function0<ApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getInstalledAppsSignals.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ApplicationsListSignal m259invoke() {
                    return fingerprintingSignalsProvider.getApplicationsListSignal();
                }
            }));
        } else {
            listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(ApplicationsListSignal.Companion.getInfo(), new Function0<ApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getInstalledAppsSignals.2
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final ApplicationsListSignal m260invoke() {
                    return fingerprintingSignalsProvider.getApplicationsListSignal();
                }
            }), TuplesKt.to(SystemApplicationsListSignal.Companion.getInfo(), new Function0<SystemApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions.getInstalledAppsSignals.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SystemApplicationsListSignal m261invoke() {
                    return fingerprintingSignalsProvider.getSystemApplicationsListSignal();
                }
            })});
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listListOf) {
            FingerprintingSignal fingerprintingSignalCreateSignalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(version, stabilityLevel, (FingerprintingSignal.Info) pair.getFirst(), (Function0) pair.getSecond());
            if (fingerprintingSignalCreateSignalIfNeeded != null) {
                arrayList.add(fingerprintingSignalCreateSignalIfNeeded);
            }
        }
        return arrayList;
    }
}
