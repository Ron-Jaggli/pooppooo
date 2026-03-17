package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.ContentResolver;
import android.provider.Settings;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: SettingsInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", DeviceStateSignalsConstantsKt.ACCESSIBILITY_ENABLED_KEY, "", DeviceStateSignalsConstantsKt.ADB_ENABLED_KEY, DeviceStateSignalsConstantsKt.ALARM_ALERT_PATH_KEY, DeviceStateSignalsConstantsKt.DATA_ROAMING_ENABLED_KEY, DeviceStateSignalsConstantsKt.DATE_FORMAT_KEY, DeviceStateSignalsConstantsKt.DEFAULT_INPUT_METHOD_KEY, DeviceStateSignalsConstantsKt.DEVELOPMENT_SETTINGS_ENABLED_KEY, DeviceStateSignalsConstantsKt.END_BUTTON_BEHAVIOUR_KEY, "extractGlobalSettingsParam", "key", "extractSecureSettingsParam", "extractSystemSettingsParam", "fontScale", DeviceStateSignalsConstantsKt.HTTP_PROXY_KEY, DeviceStateSignalsConstantsKt.RTT_CALLING_MODE_KEY, DeviceStateSignalsConstantsKt.SCREEN_OFF_TIMEOUT_KEY, DeviceStateSignalsConstantsKt.TEXT_AUTO_PUNCTUATE_KEY, DeviceStateSignalsConstantsKt.TEXT_AUTO_REPLACE_ENABLE_KEY, DeviceStateSignalsConstantsKt.TIME_12_OR_24_KEY, DeviceStateSignalsConstantsKt.TOUCH_EXPLORATION_ENABLED_KEY, DeviceStateSignalsConstantsKt.TRANSITION_ANIMATION_SCALE_KEY, DeviceStateSignalsConstantsKt.WINDOW_ANIMATION_SCALE_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SettingsDataSourceImpl implements SettingsDataSource {
    private final ContentResolver contentResolver;

    public SettingsDataSourceImpl(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String adbEnabled() {
        return extractGlobalSettingsParam("adb_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String developmentSettingsEnabled() {
        return extractGlobalSettingsParam("development_settings_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String httpProxy() {
        return extractGlobalSettingsParam("http_proxy");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String transitionAnimationScale() {
        return extractGlobalSettingsParam("transition_animation_scale");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String windowAnimationScale() {
        return extractGlobalSettingsParam("window_animation_scale");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String dataRoamingEnabled() {
        return extractGlobalSettingsParam("data_roaming");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String accessibilityEnabled() {
        return extractSecureSettingsParam("accessibility_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String defaultInputMethod() {
        return extractSecureSettingsParam("default_input_method");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String rttCallingMode() {
        return extractSecureSettingsParam("rtt_calling_mode");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String touchExplorationEnabled() {
        return extractSecureSettingsParam("touch_exploration_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String alarmAlertPath() {
        return extractSystemSettingsParam("alarm_alert");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String dateFormat() {
        return extractSystemSettingsParam("date_format");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String endButtonBehaviour() {
        return extractSystemSettingsParam("end_button_behavior");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String fontScale() {
        return extractSystemSettingsParam("font_scale");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String screenOffTimeout() {
        return extractSystemSettingsParam("screen_off_timeout");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String textAutoReplaceEnable() {
        return extractSystemSettingsParam("auto_replace");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String textAutoPunctuate() {
        return extractSystemSettingsParam("auto_punctuate");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource
    public String time12Or24() {
        return extractSystemSettingsParam("time_12_24");
    }

    private final String extractGlobalSettingsParam(final String str) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSourceImpl.extractGlobalSettingsParam.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final String invoke() {
                ContentResolver contentResolver = SettingsDataSourceImpl.this.contentResolver;
                Intrinsics.checkNotNull(contentResolver);
                String string = Settings.Global.getString(contentResolver, str);
                Intrinsics.checkNotNull(string);
                return string;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    private final String extractSecureSettingsParam(final String str) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSourceImpl.extractSecureSettingsParam.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final String invoke() {
                ContentResolver contentResolver = SettingsDataSourceImpl.this.contentResolver;
                Intrinsics.checkNotNull(contentResolver);
                String string = Settings.Secure.getString(contentResolver, str);
                Intrinsics.checkNotNull(string);
                return string;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    private final String extractSystemSettingsParam(final String str) {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSourceImpl.extractSystemSettingsParam.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final String invoke() {
                ContentResolver contentResolver = SettingsDataSourceImpl.this.contentResolver;
                Intrinsics.checkNotNull(contentResolver);
                String string = Settings.System.getString(contentResolver, str);
                Intrinsics.checkNotNull(string);
                return string;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }
}
