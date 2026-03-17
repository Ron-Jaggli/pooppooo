package com.fingerprintjs.android.fingerprint.info_providers;

import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: DevicePersonalizationInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "", DeviceStateSignalsConstantsKt.AVAILABLE_LOCALES_KEY, "", "", "()[Ljava/lang/String;", DeviceStateSignalsConstantsKt.DEFAULT_LANGUAGE_KEY, DeviceStateSignalsConstantsKt.REGION_COUNTRY_KEY, DeviceStateSignalsConstantsKt.RINGTONE_SOURCE_KEY, DeviceStateSignalsConstantsKt.TIMEZONE_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DevicePersonalizationInfoProvider {
    String[] availableLocales();

    String defaultLanguage();

    String regionCountry();

    String ringtoneSource();

    String timezone();
}
