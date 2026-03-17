package com.fingerprintjs.android.fingerprint.signal_providers.device_state;

import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: DeviceStateRawData.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030:J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0:J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0016HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u0089\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030:J\u0013\u0010U\u001a\u00020\u00162\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030:J\t\u0010X\u001a\u00020YHÖ\u0001J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160:J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030:J\u0016\u0010Z\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020W0:0\u001aH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030:J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030:R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010.R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006\\"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", DeviceStateSignalsConstantsKt.ADB_ENABLED_KEY, "", DeviceStateSignalsConstantsKt.DEVELOPMENT_SETTINGS_ENABLED_KEY, DeviceStateSignalsConstantsKt.HTTP_PROXY_KEY, DeviceStateSignalsConstantsKt.TRANSITION_ANIMATION_SCALE_KEY, DeviceStateSignalsConstantsKt.WINDOW_ANIMATION_SCALE_KEY, DeviceStateSignalsConstantsKt.DATA_ROAMING_ENABLED_KEY, DeviceStateSignalsConstantsKt.ACCESSIBILITY_ENABLED_KEY, DeviceStateSignalsConstantsKt.DEFAULT_INPUT_METHOD_KEY, DeviceStateSignalsConstantsKt.RTT_CALLING_MODE_KEY, DeviceStateSignalsConstantsKt.TOUCH_EXPLORATION_ENABLED_KEY, DeviceStateSignalsConstantsKt.ALARM_ALERT_PATH_KEY, DeviceStateSignalsConstantsKt.DATE_FORMAT_KEY, DeviceStateSignalsConstantsKt.END_BUTTON_BEHAVIOUR_KEY, "fontScale", DeviceStateSignalsConstantsKt.SCREEN_OFF_TIMEOUT_KEY, DeviceStateSignalsConstantsKt.TEXT_AUTO_REPLACE_ENABLE_KEY, DeviceStateSignalsConstantsKt.TEXT_AUTO_PUNCTUATE_KEY, DeviceStateSignalsConstantsKt.TIME_12_OR_24_KEY, DeviceStateSignalsConstantsKt.IS_PIN_SECURITY_ENABLED_KEY, "", DeviceStateSignalsConstantsKt.FINGERPRINT_SENSOR_STATUS_KEY, DeviceStateSignalsConstantsKt.RINGTONE_SOURCE_KEY, DeviceStateSignalsConstantsKt.AVAILABLE_LOCALES_KEY, "", DeviceStateSignalsConstantsKt.REGION_COUNTRY_KEY, DeviceStateSignalsConstantsKt.DEFAULT_LANGUAGE_KEY, DeviceStateSignalsConstantsKt.TIMEZONE_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessibilityEnabled", "()Ljava/lang/String;", "getAdbEnabled", "getAlarmAlertPath", "getAvailableLocales", "()Ljava/util/List;", "getDataRoamingEnabled", "getDateFormat", "getDefaultInputMethod", "getDefaultLanguage", "getDevelopmentSettingsEnabled", "getEndButtonBehaviour", "getFingerprintSensorStatus", "getFontScale", "getHttpProxy", "()Z", "getRegionCountry", "getRingtoneSource", "getRttCallingMode", "getScreenOffTimeout", "getTextAutoPunctuate", "getTextAutoReplaceEnable", "getTime12Or24", "getTimezone", "getTouchExplorationEnabled", "getTransitionAnimationScale", "getWindowAnimationScale", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "signals", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceStateRawData extends RawData {
    private final String accessibilityEnabled;
    private final String adbEnabled;
    private final String alarmAlertPath;
    private final List<String> availableLocales;
    private final String dataRoamingEnabled;
    private final String dateFormat;
    private final String defaultInputMethod;
    private final String defaultLanguage;
    private final String developmentSettingsEnabled;
    private final String endButtonBehaviour;
    private final String fingerprintSensorStatus;
    private final String fontScale;
    private final String httpProxy;
    private final boolean isPinSecurityEnabled;
    private final String regionCountry;
    private final String ringtoneSource;
    private final String rttCallingMode;
    private final String screenOffTimeout;
    private final String textAutoPunctuate;
    private final String textAutoReplaceEnable;
    private final String time12Or24;
    private final String timezone;
    private final String touchExplorationEnabled;
    private final String transitionAnimationScale;
    private final String windowAnimationScale;

    public final String component1() {
        return this.adbEnabled;
    }

    public final String component10() {
        return this.touchExplorationEnabled;
    }

    public final String component11() {
        return this.alarmAlertPath;
    }

    public final String component12() {
        return this.dateFormat;
    }

    public final String component13() {
        return this.endButtonBehaviour;
    }

    public final String component14() {
        return this.fontScale;
    }

    public final String component15() {
        return this.screenOffTimeout;
    }

    public final String component16() {
        return this.textAutoReplaceEnable;
    }

    public final String component17() {
        return this.textAutoPunctuate;
    }

    public final String component18() {
        return this.time12Or24;
    }

    public final boolean component19() {
        return this.isPinSecurityEnabled;
    }

    public final String component2() {
        return this.developmentSettingsEnabled;
    }

    public final String component20() {
        return this.fingerprintSensorStatus;
    }

    public final String component21() {
        return this.ringtoneSource;
    }

    public final List<String> component22() {
        return this.availableLocales;
    }

    public final String component23() {
        return this.regionCountry;
    }

    public final String component24() {
        return this.defaultLanguage;
    }

    public final String component25() {
        return this.timezone;
    }

    public final String component3() {
        return this.httpProxy;
    }

    public final String component4() {
        return this.transitionAnimationScale;
    }

    public final String component5() {
        return this.windowAnimationScale;
    }

    public final String component6() {
        return this.dataRoamingEnabled;
    }

    public final String component7() {
        return this.accessibilityEnabled;
    }

    public final String component8() {
        return this.defaultInputMethod;
    }

    public final String component9() {
        return this.rttCallingMode;
    }

    public final DeviceStateRawData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, List<String> list, String str21, String str22, String str23) {
        Intrinsics.checkNotNullParameter(str, DeviceStateSignalsConstantsKt.ADB_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str2, DeviceStateSignalsConstantsKt.DEVELOPMENT_SETTINGS_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str3, DeviceStateSignalsConstantsKt.HTTP_PROXY_KEY);
        Intrinsics.checkNotNullParameter(str4, DeviceStateSignalsConstantsKt.TRANSITION_ANIMATION_SCALE_KEY);
        Intrinsics.checkNotNullParameter(str5, DeviceStateSignalsConstantsKt.WINDOW_ANIMATION_SCALE_KEY);
        Intrinsics.checkNotNullParameter(str6, DeviceStateSignalsConstantsKt.DATA_ROAMING_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str7, DeviceStateSignalsConstantsKt.ACCESSIBILITY_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str8, DeviceStateSignalsConstantsKt.DEFAULT_INPUT_METHOD_KEY);
        Intrinsics.checkNotNullParameter(str9, DeviceStateSignalsConstantsKt.RTT_CALLING_MODE_KEY);
        Intrinsics.checkNotNullParameter(str10, DeviceStateSignalsConstantsKt.TOUCH_EXPLORATION_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str11, DeviceStateSignalsConstantsKt.ALARM_ALERT_PATH_KEY);
        Intrinsics.checkNotNullParameter(str12, DeviceStateSignalsConstantsKt.DATE_FORMAT_KEY);
        Intrinsics.checkNotNullParameter(str13, DeviceStateSignalsConstantsKt.END_BUTTON_BEHAVIOUR_KEY);
        Intrinsics.checkNotNullParameter(str14, "fontScale");
        Intrinsics.checkNotNullParameter(str15, DeviceStateSignalsConstantsKt.SCREEN_OFF_TIMEOUT_KEY);
        Intrinsics.checkNotNullParameter(str16, DeviceStateSignalsConstantsKt.TEXT_AUTO_REPLACE_ENABLE_KEY);
        Intrinsics.checkNotNullParameter(str17, DeviceStateSignalsConstantsKt.TEXT_AUTO_PUNCTUATE_KEY);
        Intrinsics.checkNotNullParameter(str18, DeviceStateSignalsConstantsKt.TIME_12_OR_24_KEY);
        Intrinsics.checkNotNullParameter(str19, DeviceStateSignalsConstantsKt.FINGERPRINT_SENSOR_STATUS_KEY);
        Intrinsics.checkNotNullParameter(str20, DeviceStateSignalsConstantsKt.RINGTONE_SOURCE_KEY);
        Intrinsics.checkNotNullParameter(list, DeviceStateSignalsConstantsKt.AVAILABLE_LOCALES_KEY);
        Intrinsics.checkNotNullParameter(str21, DeviceStateSignalsConstantsKt.REGION_COUNTRY_KEY);
        Intrinsics.checkNotNullParameter(str22, DeviceStateSignalsConstantsKt.DEFAULT_LANGUAGE_KEY);
        Intrinsics.checkNotNullParameter(str23, DeviceStateSignalsConstantsKt.TIMEZONE_KEY);
        return new DeviceStateRawData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, z, str19, str20, list, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceStateRawData)) {
            return false;
        }
        DeviceStateRawData deviceStateRawData = (DeviceStateRawData) obj;
        return Intrinsics.areEqual(this.adbEnabled, deviceStateRawData.adbEnabled) && Intrinsics.areEqual(this.developmentSettingsEnabled, deviceStateRawData.developmentSettingsEnabled) && Intrinsics.areEqual(this.httpProxy, deviceStateRawData.httpProxy) && Intrinsics.areEqual(this.transitionAnimationScale, deviceStateRawData.transitionAnimationScale) && Intrinsics.areEqual(this.windowAnimationScale, deviceStateRawData.windowAnimationScale) && Intrinsics.areEqual(this.dataRoamingEnabled, deviceStateRawData.dataRoamingEnabled) && Intrinsics.areEqual(this.accessibilityEnabled, deviceStateRawData.accessibilityEnabled) && Intrinsics.areEqual(this.defaultInputMethod, deviceStateRawData.defaultInputMethod) && Intrinsics.areEqual(this.rttCallingMode, deviceStateRawData.rttCallingMode) && Intrinsics.areEqual(this.touchExplorationEnabled, deviceStateRawData.touchExplorationEnabled) && Intrinsics.areEqual(this.alarmAlertPath, deviceStateRawData.alarmAlertPath) && Intrinsics.areEqual(this.dateFormat, deviceStateRawData.dateFormat) && Intrinsics.areEqual(this.endButtonBehaviour, deviceStateRawData.endButtonBehaviour) && Intrinsics.areEqual(this.fontScale, deviceStateRawData.fontScale) && Intrinsics.areEqual(this.screenOffTimeout, deviceStateRawData.screenOffTimeout) && Intrinsics.areEqual(this.textAutoReplaceEnable, deviceStateRawData.textAutoReplaceEnable) && Intrinsics.areEqual(this.textAutoPunctuate, deviceStateRawData.textAutoPunctuate) && Intrinsics.areEqual(this.time12Or24, deviceStateRawData.time12Or24) && this.isPinSecurityEnabled == deviceStateRawData.isPinSecurityEnabled && Intrinsics.areEqual(this.fingerprintSensorStatus, deviceStateRawData.fingerprintSensorStatus) && Intrinsics.areEqual(this.ringtoneSource, deviceStateRawData.ringtoneSource) && Intrinsics.areEqual(this.availableLocales, deviceStateRawData.availableLocales) && Intrinsics.areEqual(this.regionCountry, deviceStateRawData.regionCountry) && Intrinsics.areEqual(this.defaultLanguage, deviceStateRawData.defaultLanguage) && Intrinsics.areEqual(this.timezone, deviceStateRawData.timezone);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.adbEnabled.hashCode() * 31) + this.developmentSettingsEnabled.hashCode()) * 31) + this.httpProxy.hashCode()) * 31) + this.transitionAnimationScale.hashCode()) * 31) + this.windowAnimationScale.hashCode()) * 31) + this.dataRoamingEnabled.hashCode()) * 31) + this.accessibilityEnabled.hashCode()) * 31) + this.defaultInputMethod.hashCode()) * 31) + this.rttCallingMode.hashCode()) * 31) + this.touchExplorationEnabled.hashCode()) * 31) + this.alarmAlertPath.hashCode()) * 31) + this.dateFormat.hashCode()) * 31) + this.endButtonBehaviour.hashCode()) * 31) + this.fontScale.hashCode()) * 31) + this.screenOffTimeout.hashCode()) * 31) + this.textAutoReplaceEnable.hashCode()) * 31) + this.textAutoPunctuate.hashCode()) * 31) + this.time12Or24.hashCode()) * 31) + Boolean.hashCode(this.isPinSecurityEnabled)) * 31) + this.fingerprintSensorStatus.hashCode()) * 31) + this.ringtoneSource.hashCode()) * 31) + this.availableLocales.hashCode()) * 31) + this.regionCountry.hashCode()) * 31) + this.defaultLanguage.hashCode()) * 31) + this.timezone.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceStateRawData(adbEnabled=");
        sb.append(this.adbEnabled).append(", developmentSettingsEnabled=").append(this.developmentSettingsEnabled).append(", httpProxy=").append(this.httpProxy).append(", transitionAnimationScale=").append(this.transitionAnimationScale).append(", windowAnimationScale=").append(this.windowAnimationScale).append(", dataRoamingEnabled=").append(this.dataRoamingEnabled).append(", accessibilityEnabled=").append(this.accessibilityEnabled).append(", defaultInputMethod=").append(this.defaultInputMethod).append(", rttCallingMode=").append(this.rttCallingMode).append(", touchExplorationEnabled=").append(this.touchExplorationEnabled).append(", alarmAlertPath=").append(this.alarmAlertPath).append(", dateFormat=");
        sb.append(this.dateFormat).append(", endButtonBehaviour=").append(this.endButtonBehaviour).append(", fontScale=").append(this.fontScale).append(", screenOffTimeout=").append(this.screenOffTimeout).append(", textAutoReplaceEnable=").append(this.textAutoReplaceEnable).append(", textAutoPunctuate=").append(this.textAutoPunctuate).append(", time12Or24=").append(this.time12Or24).append(", isPinSecurityEnabled=").append(this.isPinSecurityEnabled).append(", fingerprintSensorStatus=").append(this.fingerprintSensorStatus).append(", ringtoneSource=").append(this.ringtoneSource).append(", availableLocales=").append(this.availableLocales).append(", regionCountry=").append(this.regionCountry);
        sb.append(", defaultLanguage=").append(this.defaultLanguage).append(", timezone=").append(this.timezone).append(')');
        return sb.toString();
    }

    public final String getAdbEnabled() {
        return this.adbEnabled;
    }

    public final String getDevelopmentSettingsEnabled() {
        return this.developmentSettingsEnabled;
    }

    public final String getHttpProxy() {
        return this.httpProxy;
    }

    public final String getTransitionAnimationScale() {
        return this.transitionAnimationScale;
    }

    public final String getWindowAnimationScale() {
        return this.windowAnimationScale;
    }

    public final String getDataRoamingEnabled() {
        return this.dataRoamingEnabled;
    }

    public final String getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    public final String getDefaultInputMethod() {
        return this.defaultInputMethod;
    }

    public final String getRttCallingMode() {
        return this.rttCallingMode;
    }

    public final String getTouchExplorationEnabled() {
        return this.touchExplorationEnabled;
    }

    public final String getAlarmAlertPath() {
        return this.alarmAlertPath;
    }

    public final String getDateFormat() {
        return this.dateFormat;
    }

    public final String getEndButtonBehaviour() {
        return this.endButtonBehaviour;
    }

    public final String getFontScale() {
        return this.fontScale;
    }

    public final String getScreenOffTimeout() {
        return this.screenOffTimeout;
    }

    public final String getTextAutoReplaceEnable() {
        return this.textAutoReplaceEnable;
    }

    public final String getTextAutoPunctuate() {
        return this.textAutoPunctuate;
    }

    public final String getTime12Or24() {
        return this.time12Or24;
    }

    /* JADX INFO: renamed from: isPinSecurityEnabled, reason: collision with other method in class */
    public final boolean m175isPinSecurityEnabled() {
        return this.isPinSecurityEnabled;
    }

    public final String getFingerprintSensorStatus() {
        return this.fingerprintSensorStatus;
    }

    public final String getRingtoneSource() {
        return this.ringtoneSource;
    }

    public final List<String> getAvailableLocales() {
        return this.availableLocales;
    }

    public final String getRegionCountry() {
        return this.regionCountry;
    }

    public final String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public DeviceStateRawData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z, String str19, String str20, List<String> list, String str21, String str22, String str23) {
        Intrinsics.checkNotNullParameter(str, DeviceStateSignalsConstantsKt.ADB_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str2, DeviceStateSignalsConstantsKt.DEVELOPMENT_SETTINGS_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str3, DeviceStateSignalsConstantsKt.HTTP_PROXY_KEY);
        Intrinsics.checkNotNullParameter(str4, DeviceStateSignalsConstantsKt.TRANSITION_ANIMATION_SCALE_KEY);
        Intrinsics.checkNotNullParameter(str5, DeviceStateSignalsConstantsKt.WINDOW_ANIMATION_SCALE_KEY);
        Intrinsics.checkNotNullParameter(str6, DeviceStateSignalsConstantsKt.DATA_ROAMING_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str7, DeviceStateSignalsConstantsKt.ACCESSIBILITY_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str8, DeviceStateSignalsConstantsKt.DEFAULT_INPUT_METHOD_KEY);
        Intrinsics.checkNotNullParameter(str9, DeviceStateSignalsConstantsKt.RTT_CALLING_MODE_KEY);
        Intrinsics.checkNotNullParameter(str10, DeviceStateSignalsConstantsKt.TOUCH_EXPLORATION_ENABLED_KEY);
        Intrinsics.checkNotNullParameter(str11, DeviceStateSignalsConstantsKt.ALARM_ALERT_PATH_KEY);
        Intrinsics.checkNotNullParameter(str12, DeviceStateSignalsConstantsKt.DATE_FORMAT_KEY);
        Intrinsics.checkNotNullParameter(str13, DeviceStateSignalsConstantsKt.END_BUTTON_BEHAVIOUR_KEY);
        Intrinsics.checkNotNullParameter(str14, "fontScale");
        Intrinsics.checkNotNullParameter(str15, DeviceStateSignalsConstantsKt.SCREEN_OFF_TIMEOUT_KEY);
        Intrinsics.checkNotNullParameter(str16, DeviceStateSignalsConstantsKt.TEXT_AUTO_REPLACE_ENABLE_KEY);
        Intrinsics.checkNotNullParameter(str17, DeviceStateSignalsConstantsKt.TEXT_AUTO_PUNCTUATE_KEY);
        Intrinsics.checkNotNullParameter(str18, DeviceStateSignalsConstantsKt.TIME_12_OR_24_KEY);
        Intrinsics.checkNotNullParameter(str19, DeviceStateSignalsConstantsKt.FINGERPRINT_SENSOR_STATUS_KEY);
        Intrinsics.checkNotNullParameter(str20, DeviceStateSignalsConstantsKt.RINGTONE_SOURCE_KEY);
        Intrinsics.checkNotNullParameter(list, DeviceStateSignalsConstantsKt.AVAILABLE_LOCALES_KEY);
        Intrinsics.checkNotNullParameter(str21, DeviceStateSignalsConstantsKt.REGION_COUNTRY_KEY);
        Intrinsics.checkNotNullParameter(str22, DeviceStateSignalsConstantsKt.DEFAULT_LANGUAGE_KEY);
        Intrinsics.checkNotNullParameter(str23, DeviceStateSignalsConstantsKt.TIMEZONE_KEY);
        this.adbEnabled = str;
        this.developmentSettingsEnabled = str2;
        this.httpProxy = str3;
        this.transitionAnimationScale = str4;
        this.windowAnimationScale = str5;
        this.dataRoamingEnabled = str6;
        this.accessibilityEnabled = str7;
        this.defaultInputMethod = str8;
        this.rttCallingMode = str9;
        this.touchExplorationEnabled = str10;
        this.alarmAlertPath = str11;
        this.dateFormat = str12;
        this.endButtonBehaviour = str13;
        this.fontScale = str14;
        this.screenOffTimeout = str15;
        this.textAutoReplaceEnable = str16;
        this.textAutoPunctuate = str17;
        this.time12Or24 = str18;
        this.isPinSecurityEnabled = z;
        this.fingerprintSensorStatus = str19;
        this.ringtoneSource = str20;
        this.availableLocales = list;
        this.regionCountry = str21;
        this.defaultLanguage = str22;
        this.timezone = str23;
    }

    @Override // com.fingerprintjs.android.fingerprint.signal_providers.RawData
    public List<IdentificationSignal<? extends Object>> signals() {
        return CollectionsKt.listOf(new IdentificationSignal[]{adbEnabled(), developmentSettingsEnabled(), httpProxy(), transitionAnimationScale(), windowAnimationScale(), dataRoamingEnabled(), accessibilityEnabled(), defaultInputMethod(), rttCallingMode(), touchExplorationEnabled(), alarmAlertPath(), dateFormat(), endButtonBehaviour(), fontScale(), screenOffTimeout(), textAutoReplaceEnable(), textAutoPunctuate(), time12Or24(), isPinSecurityEnabled(), fingerprintSensorStatus(), ringtoneSource(), availableLocales(), regionCountry(), defaultLanguage(), timezone()});
    }

    public final IdentificationSignal<String> adbEnabled() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.adbEnabled) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.adbEnabled.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getAdbEnabled();
            }
        };
    }

    public final IdentificationSignal<String> developmentSettingsEnabled() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.developmentSettingsEnabled) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.developmentSettingsEnabled.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getDevelopmentSettingsEnabled();
            }
        };
    }

    public final IdentificationSignal<String> httpProxy() {
        return new IdentificationSignal<String>(StabilityLevel.UNIQUE, this.httpProxy) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.httpProxy.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getHttpProxy();
            }
        };
    }

    public final IdentificationSignal<String> transitionAnimationScale() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.transitionAnimationScale) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.transitionAnimationScale.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getTransitionAnimationScale();
            }
        };
    }

    public final IdentificationSignal<String> windowAnimationScale() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.windowAnimationScale) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.windowAnimationScale.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getWindowAnimationScale();
            }
        };
    }

    public final IdentificationSignal<String> dataRoamingEnabled() {
        return new IdentificationSignal<String>(StabilityLevel.UNIQUE, this.dataRoamingEnabled) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.dataRoamingEnabled.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getDataRoamingEnabled();
            }
        };
    }

    public final IdentificationSignal<String> accessibilityEnabled() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.accessibilityEnabled) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.accessibilityEnabled.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getAccessibilityEnabled();
            }
        };
    }

    public final IdentificationSignal<String> defaultInputMethod() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.defaultInputMethod) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.defaultInputMethod.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getDefaultInputMethod();
            }
        };
    }

    public final IdentificationSignal<String> rttCallingMode() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.rttCallingMode) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.rttCallingMode.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getRttCallingMode();
            }
        };
    }

    public final IdentificationSignal<String> touchExplorationEnabled() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.touchExplorationEnabled) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.touchExplorationEnabled.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getTouchExplorationEnabled();
            }
        };
    }

    public final IdentificationSignal<String> alarmAlertPath() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.alarmAlertPath) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.alarmAlertPath.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getAlarmAlertPath();
            }
        };
    }

    public final IdentificationSignal<String> dateFormat() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.dateFormat) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.dateFormat.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getDateFormat();
            }
        };
    }

    public final IdentificationSignal<String> endButtonBehaviour() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.endButtonBehaviour) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.endButtonBehaviour.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getEndButtonBehaviour();
            }
        };
    }

    public final IdentificationSignal<String> fontScale() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.fontScale) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.fontScale.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getFontScale();
            }
        };
    }

    public final IdentificationSignal<String> screenOffTimeout() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.screenOffTimeout) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.screenOffTimeout.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getScreenOffTimeout();
            }
        };
    }

    public final IdentificationSignal<String> textAutoReplaceEnable() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.textAutoReplaceEnable) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.textAutoReplaceEnable.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getTextAutoReplaceEnable();
            }
        };
    }

    public final IdentificationSignal<String> textAutoPunctuate() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.textAutoPunctuate) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.textAutoPunctuate.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getTextAutoPunctuate();
            }
        };
    }

    public final IdentificationSignal<String> time12Or24() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.time12Or24) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.time12Or24.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getTime12Or24();
            }
        };
    }

    public final IdentificationSignal<Boolean> isPinSecurityEnabled() {
        return new IdentificationSignal<Boolean>(StabilityLevel.OPTIMAL, this.isPinSecurityEnabled) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.isPinSecurityEnabled.1
            {
                Boolean boolValueOf = Boolean.valueOf(z);
            }

            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return String.valueOf(DeviceStateRawData.this.m175isPinSecurityEnabled());
            }
        };
    }

    public final IdentificationSignal<String> fingerprintSensorStatus() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.fingerprintSensorStatus) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.fingerprintSensorStatus.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getFingerprintSensorStatus();
            }
        };
    }

    public final IdentificationSignal<String> ringtoneSource() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.ringtoneSource) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.ringtoneSource.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getRingtoneSource();
            }
        };
    }

    public final IdentificationSignal<List<String>> availableLocales() {
        return (IdentificationSignal) new IdentificationSignal<List<? extends String>>(StabilityLevel.OPTIMAL, this.availableLocales) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.availableLocales.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = DeviceStateRawData.this.getAvailableLocales().iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        };
    }

    public final IdentificationSignal<String> regionCountry() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.regionCountry) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.regionCountry.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getRegionCountry();
            }
        };
    }

    public final IdentificationSignal<String> defaultLanguage() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.defaultLanguage) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.defaultLanguage.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getDefaultLanguage();
            }
        };
    }

    public final IdentificationSignal<String> timezone() {
        return new IdentificationSignal<String>(StabilityLevel.OPTIMAL, this.timezone) { // from class: com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateRawData.timezone.1
            @Override // com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal
            public String toString() {
                return DeviceStateRawData.this.getTimezone();
            }
        };
    }
}
