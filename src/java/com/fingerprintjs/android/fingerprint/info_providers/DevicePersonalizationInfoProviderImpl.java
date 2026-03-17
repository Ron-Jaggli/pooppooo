package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: DevicePersonalizationInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "ringtoneManager", "Landroid/media/RingtoneManager;", "assetManager", "Landroid/content/res/AssetManager;", "configuration", "Landroid/content/res/Configuration;", "(Landroid/media/RingtoneManager;Landroid/content/res/AssetManager;Landroid/content/res/Configuration;)V", DeviceStateSignalsConstantsKt.AVAILABLE_LOCALES_KEY, "", "", "()[Ljava/lang/String;", DeviceStateSignalsConstantsKt.DEFAULT_LANGUAGE_KEY, DeviceStateSignalsConstantsKt.REGION_COUNTRY_KEY, DeviceStateSignalsConstantsKt.RINGTONE_SOURCE_KEY, DeviceStateSignalsConstantsKt.TIMEZONE_KEY, "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DevicePersonalizationInfoProviderImpl implements DevicePersonalizationInfoProvider {
    private final AssetManager assetManager;
    private final Configuration configuration;
    private final RingtoneManager ringtoneManager;

    public DevicePersonalizationInfoProviderImpl(RingtoneManager ringtoneManager, AssetManager assetManager, Configuration configuration) {
        this.ringtoneManager = ringtoneManager;
        this.assetManager = assetManager;
        this.configuration = configuration;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider
    public String ringtoneSource() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl.ringtoneSource.1
            {
                super(0);
            }

            public final String invoke() {
                RingtoneManager ringtoneManager = DevicePersonalizationInfoProviderImpl.this.ringtoneManager;
                Intrinsics.checkNotNull(ringtoneManager);
                Uri ringtoneUri = ringtoneManager.getRingtoneUri(0);
                Intrinsics.checkNotNull(ringtoneUri);
                String string = ringtoneUri.toString();
                Intrinsics.checkNotNull(string);
                return string;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider
    public String[] availableLocales() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String[]>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl.availableLocales.1
            {
                super(0);
            }

            public final String[] invoke() {
                AssetManager assetManager = DevicePersonalizationInfoProviderImpl.this.assetManager;
                Intrinsics.checkNotNull(assetManager);
                String[] locales = assetManager.getLocales();
                Intrinsics.checkNotNull(locales);
                ArrayList arrayList = new ArrayList(locales.length);
                for (String str : locales) {
                    arrayList.add(String.valueOf(str));
                }
                return (String[]) arrayList.toArray(new String[0]);
            }
        }, 1, null);
        String[] strArr = new String[0];
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = strArr;
        }
        return (String[]) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider
    public String regionCountry() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl.regionCountry.1
            {
                super(0);
            }

            public final String invoke() {
                Configuration configuration = DevicePersonalizationInfoProviderImpl.this.configuration;
                Intrinsics.checkNotNull(configuration);
                Locale locale = configuration.locale;
                Intrinsics.checkNotNull(locale);
                String country = locale.getCountry();
                Intrinsics.checkNotNull(country);
                return country;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider
    public String defaultLanguage() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl.defaultLanguage.1
            public final String invoke() {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNull(locale);
                String language = locale.getLanguage();
                Intrinsics.checkNotNull(language);
                return language;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider
    public String timezone() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<String>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl.timezone.1
            public final String invoke() {
                TimeZone timeZone = TimeZone.getDefault();
                Intrinsics.checkNotNull(timeZone);
                String displayName = timeZone.getDisplayName();
                Intrinsics.checkNotNull(displayName);
                return displayName;
            }
        }, 1, null);
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = "";
        }
        return (String) objSafeWithTimeout$default;
    }
}
