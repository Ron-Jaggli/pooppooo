package com.fingerprintjs.android.fingerprint.info_providers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/5.dex
 */
/* JADX INFO: compiled from: CodecInfoProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/MediaCodecInfo;", "", "name", "", "capabilities", "", "(Ljava/lang/String;Ljava/util/List;)V", "getCapabilities", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaCodecInfo {
    private final List<String> capabilities;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaCodecInfo copy$default(MediaCodecInfo mediaCodecInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaCodecInfo.name;
        }
        if ((i & 2) != 0) {
            list = mediaCodecInfo.capabilities;
        }
        return mediaCodecInfo.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.capabilities;
    }

    public final MediaCodecInfo copy(String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "capabilities");
        return new MediaCodecInfo(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaCodecInfo)) {
            return false;
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        return Intrinsics.areEqual(this.name, mediaCodecInfo.name) && Intrinsics.areEqual(this.capabilities, mediaCodecInfo.capabilities);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.capabilities.hashCode();
    }

    public String toString() {
        return "MediaCodecInfo(name=" + this.name + ", capabilities=" + this.capabilities + ')';
    }

    public MediaCodecInfo(String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "capabilities");
        this.name = str;
        this.capabilities = list;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getCapabilities() {
        return this.capabilities;
    }
}
