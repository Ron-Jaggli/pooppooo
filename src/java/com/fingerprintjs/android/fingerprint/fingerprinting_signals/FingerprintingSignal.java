package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
 */
/* JADX INFO: compiled from: FingerprintingSignal.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u00012\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "T", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "value", "getValue", "()Ljava/lang/Object;", "getHashableString", "", "Info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AbiTypeSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AccessibilityEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AdbEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AlarmAlertPathSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AndroidVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ApplicationsListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacitySignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacityV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryHealthSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CameraListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CodecListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CoresCountSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DataRoamingEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DateFormatSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultInputMethodSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultLanguageSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DevelopmentSettingsEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EncryptionStatusSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EndButtonBehaviourSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSensorStatusSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/GlesVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/HttpProxySignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/IsPinSecurityEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/KernelVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ManufacturerNameSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ModelNameSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RegionCountrySignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RingtoneSourceSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ScreenOffTimeoutSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SdkVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SecurityProvidersSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoPunctuateSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoReplaceEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/Time12Or24Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TimezoneSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalInternalStorageSpaceSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalRamSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TouchExplorationEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TransitionAnimationScaleSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/WindowAnimationScaleSignal;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FingerprintingSignal<T> {
    public /* synthetic */ FingerprintingSignal(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getHashableString();

    public abstract Info getInfo();

    public abstract T getValue();

    private FingerprintingSignal() {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
     */
    /* JADX INFO: compiled from: FingerprintingSignal.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "", "addedInVersion", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "removedInVersion", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;)V", "getAddedInVersion", "()Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getRemovedInVersion", "getStabilityLevel", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Info {
        private final Fingerprinter.Version addedInVersion;
        private final Fingerprinter.Version removedInVersion;
        private final StabilityLevel stabilityLevel;

        public static /* synthetic */ Info copy$default(Info info, Fingerprinter.Version version, Fingerprinter.Version version2, StabilityLevel stabilityLevel, int i, Object obj) {
            if ((i & 1) != 0) {
                version = info.addedInVersion;
            }
            if ((i & 2) != 0) {
                version2 = info.removedInVersion;
            }
            if ((i & 4) != 0) {
                stabilityLevel = info.stabilityLevel;
            }
            return info.copy(version, version2, stabilityLevel);
        }

        public final Fingerprinter.Version component1() {
            return this.addedInVersion;
        }

        public final Fingerprinter.Version component2() {
            return this.removedInVersion;
        }

        public final StabilityLevel component3() {
            return this.stabilityLevel;
        }

        public final Info copy(Fingerprinter.Version version, Fingerprinter.Version version2, StabilityLevel stabilityLevel) {
            Intrinsics.checkNotNullParameter(version, "addedInVersion");
            Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
            return new Info(version, version2, stabilityLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return this.addedInVersion == info.addedInVersion && this.removedInVersion == info.removedInVersion && this.stabilityLevel == info.stabilityLevel;
        }

        public int hashCode() {
            int iHashCode = this.addedInVersion.hashCode() * 31;
            Fingerprinter.Version version = this.removedInVersion;
            return ((iHashCode + (version == null ? 0 : version.hashCode())) * 31) + this.stabilityLevel.hashCode();
        }

        public String toString() {
            return "Info(addedInVersion=" + this.addedInVersion + ", removedInVersion=" + this.removedInVersion + ", stabilityLevel=" + this.stabilityLevel + ')';
        }

        public Info(Fingerprinter.Version version, Fingerprinter.Version version2, StabilityLevel stabilityLevel) {
            Intrinsics.checkNotNullParameter(version, "addedInVersion");
            Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
            this.addedInVersion = version;
            this.removedInVersion = version2;
            this.stabilityLevel = stabilityLevel;
        }

        public final Fingerprinter.Version getAddedInVersion() {
            return this.addedInVersion;
        }

        public final Fingerprinter.Version getRemovedInVersion() {
            return this.removedInVersion;
        }

        public final StabilityLevel getStabilityLevel() {
            return this.stabilityLevel;
        }
    }
}
