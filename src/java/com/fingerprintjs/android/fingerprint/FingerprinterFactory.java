package com.fingerprintjs.android.fingerprint;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.Environment;
import android.os.StatFs;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.InputDevicesDataSourceImpl;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSourceImpl;
import com.fingerprintjs.android.fingerprint.info_providers.SensorDataSourceImpl;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSourceImpl;
import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
 */
/* JADX INFO: compiled from: FingerprinterFactory.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010/\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u0002072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010>\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/FingerprinterFactory;", "", "()V", "configuration", "Lcom/fingerprintjs/android/fingerprint/Configuration;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "instance", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter;", "create", "context", "Landroid/content/Context;", "createAndroidIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "createBatteryInfoDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProviderImpl;", "createCameraInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "createCodecInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProviderImpl;", "createCpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProviderImpl;", "createDeviceIdProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "createDeviceIdSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;", "createDevicePersonalizationDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProviderImpl;", "createDeviceSecurityProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProviderImpl;", "createDeviceStateSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "createFingerprintSensorStatusProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProviderImpl;", "createFingerprinter", "createFingerprintingSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "createGpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProviderImpl;", "createGsfIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "createHardwareSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "createInputDevicesDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDevicesDataSourceImpl;", "createInstalledApplicationsSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "createLegacyFingerprinter", "createMediaDrmProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "createMemoryInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "createOsBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProviderImpl;", "createOsBuildInfoSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "createPackageManagerDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSourceImpl;", "createSensorDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSourceImpl;", "createSettingsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSourceImpl;", "getInstance", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FingerprinterFactory {
    public static final FingerprinterFactory INSTANCE = new FingerprinterFactory();
    private static Configuration configuration = new Configuration(Fingerprinter.Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release().getIntValue$fingerprint_release(), null, 2, null);
    private static Hasher hasher = new MurMur3x64x128Hasher();
    private static Fingerprinter instance;

    private FingerprinterFactory() {
    }

    @Deprecated(message = "\n        This method has been deprecated in favor of create(context) method. Check out method doc for details.\n    ")
    @JvmStatic
    public static final Fingerprinter getInstance(Context context, Configuration configuration2) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        if (configuration2.getVersion() > Fingerprinter.Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release().getIntValue$fingerprint_release()) {
            throw new IllegalArgumentException("Version must be in " + Fingerprinter.Version.V_1.getIntValue$fingerprint_release() + " .. " + Fingerprinter.Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release().getIntValue$fingerprint_release() + " range");
        }
        if (!Intrinsics.areEqual(configuration, configuration2)) {
            instance = null;
        }
        if (instance == null) {
            synchronized (FingerprinterFactory.class) {
                if (instance == null) {
                    instance = INSTANCE.createLegacyFingerprinter(context, configuration2);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        Fingerprinter fingerprinter = instance;
        Intrinsics.checkNotNull(fingerprinter);
        return fingerprinter;
    }

    @JvmStatic
    public static final Fingerprinter create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.createFingerprinter(context);
    }

    private final Fingerprinter createLegacyFingerprinter(final Context context, final Configuration configuration2) {
        configuration = configuration2;
        hasher = configuration2.getHasher();
        return new Fingerprinter(new Function0<FingerprinterImpl>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createLegacyFingerprinter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprinterImpl m22invoke() {
                return new FingerprinterImpl(new Fingerprinter.LegacyArgs(FingerprinterFactory.INSTANCE.createHardwareSignalGroupProvider(context), FingerprinterFactory.INSTANCE.createOsBuildInfoSignalGroupProvider(context), FingerprinterFactory.INSTANCE.createDeviceIdProvider(context), FingerprinterFactory.INSTANCE.createInstalledApplicationsSignalGroupProvider(context), FingerprinterFactory.INSTANCE.createDeviceStateSignalGroupProvider(context), configuration2), FingerprinterFactory.INSTANCE.createFingerprintingSignalsProvider(context), FingerprinterFactory.INSTANCE.createDeviceIdSignalsProvider(context));
            }
        }, true);
    }

    private final Fingerprinter createFingerprinter(final Context context) {
        return new Fingerprinter(new Function0<FingerprinterImpl>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createFingerprinter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprinterImpl m18invoke() {
                return new FingerprinterImpl(null, FingerprinterFactory.INSTANCE.createFingerprintingSignalsProvider(context), FingerprinterFactory.INSTANCE.createDeviceIdSignalsProvider(context));
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HardwareSignalGroupProvider createHardwareSignalGroupProvider(Context context) {
        return new HardwareSignalGroupProvider(createCpuInfoProvider(), createMemoryInfoProvider(context), createOsBuildInfoProvider(), createSensorDataSource(context), createInputDevicesDataSource(context), createBatteryInfoDataSource(context), createCameraInfoProvider(), createGpuInfoProvider(context), hasher, configuration.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OsBuildSignalGroupProvider createOsBuildInfoSignalGroupProvider(Context context) {
        return new OsBuildSignalGroupProvider(createOsBuildInfoProvider(), createCodecInfoProvider(), createDeviceSecurityProvider(context), hasher, configuration.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstalledAppsSignalGroupProvider createInstalledApplicationsSignalGroupProvider(Context context) {
        return new InstalledAppsSignalGroupProvider(createPackageManagerDataSource(context), hasher, configuration.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceStateSignalGroupProvider createDeviceStateSignalGroupProvider(Context context) {
        return new DeviceStateSignalGroupProvider(createSettingsDataSource(context), createDevicePersonalizationDataSource(context), createDeviceSecurityProvider(context), createFingerprintSensorStatusProvider(context), hasher, configuration.getVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceIdProvider createDeviceIdProvider(Context context) {
        return new DeviceIdProvider(createGsfIdProvider(context), createAndroidIdProvider(context), createMediaDrmProvider(), configuration.getVersion());
    }

    private final CpuInfoProviderImpl createCpuInfoProvider() {
        return new CpuInfoProviderImpl();
    }

    private final MemInfoProvider createMemoryInfoProvider(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<ActivityManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createMemoryInfoProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ActivityManager m23invoke() {
                Object systemService = context.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                return (ActivityManager) systemService;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = null;
        }
        ActivityManager activityManager = (ActivityManager) objSafeWithTimeout$default;
        Object objSafeWithTimeout$default2 = SafeKt.safeWithTimeout$default(0L, new Function0<StatFs>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createMemoryInfoProvider.2
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final StatFs m24invoke() {
                File rootDirectory = Environment.getRootDirectory();
                Intrinsics.checkNotNull(rootDirectory);
                String absolutePath = rootDirectory.getAbsolutePath();
                Intrinsics.checkNotNull(absolutePath);
                return new StatFs(absolutePath);
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default2)) {
            objSafeWithTimeout$default2 = null;
        }
        StatFs statFs = (StatFs) objSafeWithTimeout$default2;
        Object objSafeWithTimeout$default3 = SafeKt.safeWithTimeout$default(0L, new Function0<StatFs>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createMemoryInfoProvider.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final StatFs m25invoke() {
                StatFs statFs2 = null;
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    if (!externalFilesDir.canRead()) {
                        externalFilesDir = null;
                    }
                    if (externalFilesDir != null) {
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        Intrinsics.checkNotNull(absolutePath);
                        statFs2 = new StatFs(absolutePath);
                    }
                }
                Intrinsics.checkNotNull(statFs2);
                return statFs2;
            }
        }, 1, null);
        return new MemInfoProviderImpl(activityManager, statFs, (StatFs) (Result.isFailure-impl(objSafeWithTimeout$default3) ? null : objSafeWithTimeout$default3));
    }

    private final OsBuildInfoProviderImpl createOsBuildInfoProvider() {
        return new OsBuildInfoProviderImpl();
    }

    private final GsfIdProvider createGsfIdProvider(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<ContentResolver>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createGsfIdProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ContentResolver m20invoke() {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNull(contentResolver);
                return contentResolver;
            }
        }, 1, null);
        return new GsfIdProvider((ContentResolver) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final MediaDrmIdProvider createMediaDrmProvider() {
        return new MediaDrmIdProvider();
    }

    private final AndroidIdProvider createAndroidIdProvider(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<ContentResolver>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createAndroidIdProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ContentResolver m10invoke() {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNull(contentResolver);
                return contentResolver;
            }
        }, 1, null);
        return new AndroidIdProvider((ContentResolver) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final SensorDataSourceImpl createSensorDataSource(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<SensorManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createSensorDataSource.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SensorManager m27invoke() {
                Object systemService = context.getSystemService("sensor");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                return (SensorManager) systemService;
            }
        }, 1, null);
        return new SensorDataSourceImpl((SensorManager) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final InputDevicesDataSourceImpl createInputDevicesDataSource(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<InputManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createInputDevicesDataSource.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InputManager m21invoke() {
                Object systemService = context.getSystemService("input");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.input.InputManager");
                return (InputManager) systemService;
            }
        }, 1, null);
        return new InputDevicesDataSourceImpl((InputManager) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final PackageManagerDataSourceImpl createPackageManagerDataSource(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<PackageManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createPackageManagerDataSource.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final PackageManager m26invoke() {
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNull(packageManager);
                return packageManager;
            }
        }, 1, null);
        return new PackageManagerDataSourceImpl((PackageManager) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final SettingsDataSourceImpl createSettingsDataSource(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<ContentResolver>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createSettingsDataSource.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ContentResolver m28invoke() {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNull(contentResolver);
                return contentResolver;
            }
        }, 1, null);
        return new SettingsDataSourceImpl((ContentResolver) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final DevicePersonalizationInfoProviderImpl createDevicePersonalizationDataSource(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<RingtoneManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createDevicePersonalizationDataSource.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RingtoneManager m12invoke() {
                return new RingtoneManager(context);
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = null;
        }
        RingtoneManager ringtoneManager = (RingtoneManager) objSafeWithTimeout$default;
        Object objSafeWithTimeout$default2 = SafeKt.safeWithTimeout$default(0L, new Function0<AssetManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createDevicePersonalizationDataSource.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AssetManager m13invoke() {
                AssetManager assets = context.getAssets();
                Intrinsics.checkNotNull(assets);
                return assets;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default2)) {
            objSafeWithTimeout$default2 = null;
        }
        AssetManager assetManager = (AssetManager) objSafeWithTimeout$default2;
        Object objSafeWithTimeout$default3 = SafeKt.safeWithTimeout$default(0L, new Function0<android.content.res.Configuration>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createDevicePersonalizationDataSource.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final android.content.res.Configuration m14invoke() {
                Resources resources = context.getResources();
                Intrinsics.checkNotNull(resources);
                android.content.res.Configuration configuration2 = resources.getConfiguration();
                Intrinsics.checkNotNull(configuration2);
                return configuration2;
            }
        }, 1, null);
        return new DevicePersonalizationInfoProviderImpl(ringtoneManager, assetManager, (android.content.res.Configuration) (Result.isFailure-impl(objSafeWithTimeout$default3) ? null : objSafeWithTimeout$default3));
    }

    private final FingerprintSensorInfoProviderImpl createFingerprintSensorStatusProvider(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<FingerprintManagerCompat>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createFingerprintSensorStatusProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprintManagerCompat m17invoke() {
                FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(context);
                Intrinsics.checkNotNull(fingerprintManagerCompatFrom);
                return fingerprintManagerCompatFrom;
            }
        }, 1, null);
        return new FingerprintSensorInfoProviderImpl((FingerprintManagerCompat) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final DeviceSecurityInfoProviderImpl createDeviceSecurityProvider(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<DevicePolicyManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createDeviceSecurityProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DevicePolicyManager m15invoke() {
                Object systemService = context.getSystemService("device_policy");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
                return (DevicePolicyManager) systemService;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = null;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) objSafeWithTimeout$default;
        Object objSafeWithTimeout$default2 = SafeKt.safeWithTimeout$default(0L, new Function0<KeyguardManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createDeviceSecurityProvider.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final KeyguardManager m16invoke() {
                Object systemService = context.getSystemService("keyguard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
                return (KeyguardManager) systemService;
            }
        }, 1, null);
        return new DeviceSecurityInfoProviderImpl(devicePolicyManager, (KeyguardManager) (Result.isFailure-impl(objSafeWithTimeout$default2) ? null : objSafeWithTimeout$default2));
    }

    private final CodecInfoProviderImpl createCodecInfoProvider() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<MediaCodecList>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createCodecInfoProvider.1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final MediaCodecList m11invoke() {
                return new MediaCodecList(1);
            }
        }, 1, null);
        return new CodecInfoProviderImpl((MediaCodecList) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    private final BatteryInfoProviderImpl createBatteryInfoDataSource(Context context) {
        return new BatteryInfoProviderImpl(context);
    }

    private final CameraInfoProvider createCameraInfoProvider() {
        return new CameraInfoProviderImpl();
    }

    private final GpuInfoProviderImpl createGpuInfoProvider(final Context context) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<ActivityManager>() { // from class: com.fingerprintjs.android.fingerprint.FingerprinterFactory.createGpuInfoProvider.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ActivityManager m19invoke() {
                Object systemService = context.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                return (ActivityManager) systemService;
            }
        }, 1, null);
        return new GpuInfoProviderImpl((ActivityManager) (Result.isFailure-impl(objSafeWithTimeout$default) ? null : objSafeWithTimeout$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FingerprintingSignalsProvider createFingerprintingSignalsProvider(Context context) {
        return new FingerprintingSignalsProvider(createCpuInfoProvider(), createMemoryInfoProvider(context), createSensorDataSource(context), createInputDevicesDataSource(context), createBatteryInfoDataSource(context), createCameraInfoProvider(), createGpuInfoProvider(context), createOsBuildInfoProvider(), createCodecInfoProvider(), createDeviceSecurityProvider(context), createPackageManagerDataSource(context), createSettingsDataSource(context), createDevicePersonalizationDataSource(context), createFingerprintSensorStatusProvider(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceIdSignalsProvider createDeviceIdSignalsProvider(Context context) {
        return new DeviceIdSignalsProvider(createGsfIdProvider(context), createAndroidIdProvider(context), createMediaDrmProvider());
    }
}
