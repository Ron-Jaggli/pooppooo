package com.fingerprintjs.android.fingerprint.device_id_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/3.dex
 */
/* JADX INFO: compiled from: DeviceIdSignalsProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;", "", "gsfIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "androidIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "mediaDrmIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "(Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;)V", "androidIdSignal", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/AndroidIdSignal;", "getAndroidIdSignal", "()Lcom/fingerprintjs/android/fingerprint/device_id_signals/AndroidIdSignal;", "androidIdSignal$delegate", "Lkotlin/Lazy;", "gsfIdSignal", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/GsfIdSignal;", "getGsfIdSignal", "()Lcom/fingerprintjs/android/fingerprint/device_id_signals/GsfIdSignal;", "gsfIdSignal$delegate", "mediaDrmIdSignal", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/MediaDrmIdSignal;", "getMediaDrmIdSignal", "()Lcom/fingerprintjs/android/fingerprint/device_id_signals/MediaDrmIdSignal;", "mediaDrmIdSignal$delegate", "getSignalMatching", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignal;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceIdSignalsProvider {
    private final AndroidIdProvider androidIdProvider;
    private final Lazy androidIdSignal$delegate;
    private final GsfIdProvider gsfIdProvider;
    private final Lazy gsfIdSignal$delegate;
    private final MediaDrmIdProvider mediaDrmIdProvider;
    private final Lazy mediaDrmIdSignal$delegate;

    public DeviceIdSignalsProvider(GsfIdProvider gsfIdProvider, AndroidIdProvider androidIdProvider, MediaDrmIdProvider mediaDrmIdProvider) {
        Intrinsics.checkNotNullParameter(gsfIdProvider, "gsfIdProvider");
        Intrinsics.checkNotNullParameter(androidIdProvider, "androidIdProvider");
        Intrinsics.checkNotNullParameter(mediaDrmIdProvider, "mediaDrmIdProvider");
        this.gsfIdProvider = gsfIdProvider;
        this.androidIdProvider = androidIdProvider;
        this.mediaDrmIdProvider = mediaDrmIdProvider;
        this.gsfIdSignal$delegate = LazyKt.lazy(new Function0<GsfIdSignal>() { // from class: com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider$gsfIdSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final GsfIdSignal m38invoke() {
                String gsfAndroidId = this.this$0.gsfIdProvider.getGsfAndroidId();
                if (gsfAndroidId == null) {
                    gsfAndroidId = "";
                }
                return new GsfIdSignal(gsfAndroidId);
            }
        });
        this.androidIdSignal$delegate = LazyKt.lazy(new Function0<AndroidIdSignal>() { // from class: com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider$androidIdSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AndroidIdSignal m37invoke() {
                return new AndroidIdSignal(this.this$0.androidIdProvider.getAndroidId());
            }
        });
        this.mediaDrmIdSignal$delegate = LazyKt.lazy(new Function0<MediaDrmIdSignal>() { // from class: com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider$mediaDrmIdSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final MediaDrmIdSignal m39invoke() {
                String mediaDrmId = this.this$0.mediaDrmIdProvider.getMediaDrmId();
                if (mediaDrmId == null) {
                    mediaDrmId = "";
                }
                return new MediaDrmIdSignal(mediaDrmId);
            }
        });
    }

    public final DeviceIdSignal<?> getSignalMatching(Fingerprinter.Version version) {
        GsfIdSignal gsfIdSignal;
        Intrinsics.checkNotNullParameter(version, "version");
        Fingerprinter.Version version2 = Fingerprinter.Version.V_1;
        if (version.compareTo((Object) Fingerprinter.Version.V_2) <= 0 && version.compareTo((Object) version2) >= 0) {
            GsfIdSignal gsfIdSignal2 = getGsfIdSignal();
            gsfIdSignal = gsfIdSignal2.getValue().length() > 0 ? gsfIdSignal2 : null;
            return gsfIdSignal != null ? gsfIdSignal : getAndroidIdSignal();
        }
        GsfIdSignal gsfIdSignal3 = getGsfIdSignal();
        if (gsfIdSignal3.getValue().length() <= 0) {
            gsfIdSignal3 = null;
        }
        if (gsfIdSignal3 != null) {
            return gsfIdSignal3;
        }
        MediaDrmIdSignal mediaDrmIdSignal = getMediaDrmIdSignal();
        gsfIdSignal = mediaDrmIdSignal.getValue().length() > 0 ? mediaDrmIdSignal : null;
        if (gsfIdSignal != null) {
            return gsfIdSignal;
        }
        return getAndroidIdSignal();
    }

    public final GsfIdSignal getGsfIdSignal() {
        return (GsfIdSignal) this.gsfIdSignal$delegate.getValue();
    }

    public final AndroidIdSignal getAndroidIdSignal() {
        return (AndroidIdSignal) this.androidIdSignal$delegate.getValue();
    }

    public final MediaDrmIdSignal getMediaDrmIdSignal() {
        return (MediaDrmIdSignal) this.mediaDrmIdSignal$delegate.getValue();
    }
}
