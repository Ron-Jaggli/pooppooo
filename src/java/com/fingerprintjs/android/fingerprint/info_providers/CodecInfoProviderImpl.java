package com.fingerprintjs.android.fingerprint.info_providers;

import android.media.MediaCodecList;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalsConstantsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CodecInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;", "codecList", "Landroid/media/MediaCodecList;", "(Landroid/media/MediaCodecList;)V", OsBuildSignalsConstantsKt.CODEC_LIST_KEY, "", "Lcom/fingerprintjs/android/fingerprint/info_providers/MediaCodecInfo;", "extractCodecInfo", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CodecInfoProviderImpl implements CodecInfoProvider {
    private final MediaCodecList codecList;

    public CodecInfoProviderImpl(MediaCodecList mediaCodecList) {
        this.codecList = mediaCodecList;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProvider
    public List<MediaCodecInfo> codecsList() {
        Object objSafeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, new Function0<List<? extends MediaCodecInfo>>() { // from class: com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProviderImpl.codecsList.1
            {
                super(0);
            }

            public final List<MediaCodecInfo> invoke() {
                return CodecInfoProviderImpl.this.extractCodecInfo();
            }
        }, 1, null);
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.isFailure-impl(objSafeWithTimeout$default)) {
            objSafeWithTimeout$default = listEmptyList;
        }
        return (List) objSafeWithTimeout$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MediaCodecInfo> extractCodecInfo() {
        MediaCodecList mediaCodecList = this.codecList;
        Intrinsics.checkNotNull(mediaCodecList);
        android.media.MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
        android.media.MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
        ArrayList arrayList = new ArrayList(mediaCodecInfoArr.length);
        for (android.media.MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
            Intrinsics.checkNotNull(mediaCodecInfo);
            String name = mediaCodecInfo.getName();
            Intrinsics.checkNotNull(name);
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            Intrinsics.checkNotNull(supportedTypes);
            ArrayList arrayList2 = new ArrayList(supportedTypes.length);
            for (String str : supportedTypes) {
                arrayList2.add(String.valueOf(str));
            }
            arrayList.add(new MediaCodecInfo(name, arrayList2));
        }
        return arrayList;
    }
}
