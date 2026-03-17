package com.fingerprintjs.android.fingerprint.info_providers;

import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: SettingsInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "", DeviceStateSignalsConstantsKt.ACCESSIBILITY_ENABLED_KEY, "", DeviceStateSignalsConstantsKt.ADB_ENABLED_KEY, DeviceStateSignalsConstantsKt.ALARM_ALERT_PATH_KEY, DeviceStateSignalsConstantsKt.DATA_ROAMING_ENABLED_KEY, DeviceStateSignalsConstantsKt.DATE_FORMAT_KEY, DeviceStateSignalsConstantsKt.DEFAULT_INPUT_METHOD_KEY, DeviceStateSignalsConstantsKt.DEVELOPMENT_SETTINGS_ENABLED_KEY, DeviceStateSignalsConstantsKt.END_BUTTON_BEHAVIOUR_KEY, "fontScale", DeviceStateSignalsConstantsKt.HTTP_PROXY_KEY, DeviceStateSignalsConstantsKt.RTT_CALLING_MODE_KEY, DeviceStateSignalsConstantsKt.SCREEN_OFF_TIMEOUT_KEY, DeviceStateSignalsConstantsKt.TEXT_AUTO_PUNCTUATE_KEY, DeviceStateSignalsConstantsKt.TEXT_AUTO_REPLACE_ENABLE_KEY, DeviceStateSignalsConstantsKt.TIME_12_OR_24_KEY, DeviceStateSignalsConstantsKt.TOUCH_EXPLORATION_ENABLED_KEY, DeviceStateSignalsConstantsKt.TRANSITION_ANIMATION_SCALE_KEY, DeviceStateSignalsConstantsKt.WINDOW_ANIMATION_SCALE_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SettingsDataSource {
    String accessibilityEnabled();

    String adbEnabled();

    String alarmAlertPath();

    String dataRoamingEnabled();

    String dateFormat();

    String defaultInputMethod();

    String developmentSettingsEnabled();

    String endButtonBehaviour();

    String fontScale();

    String httpProxy();

    String rttCallingMode();

    String screenOffTimeout();

    String textAutoPunctuate();

    String textAutoReplaceEnable();

    String time12Or24();

    String touchExplorationEnabled();

    String transitionAnimationScale();

    String windowAnimationScale();
}
