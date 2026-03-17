package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/Configuration;", "", "version", "", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "(ILcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)V", "getHasher", "()Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Configuration {
    private final Hasher hasher;
    private final int version;

    /* JADX WARN: Illegal instructions before constructor call */
    public Configuration(int i) {
        Hasher hasher = null;
        this(i, hasher, 2, hasher);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, int i, Hasher hasher, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = configuration.version;
        }
        if ((i2 & 2) != 0) {
            hasher = configuration.hasher;
        }
        return configuration.copy(i, hasher);
    }

    public final int component1() {
        return this.version;
    }

    public final Hasher component2() {
        return this.hasher;
    }

    public final Configuration copy(int i, Hasher hasher) {
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        return new Configuration(i, hasher);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.version == configuration.version && Intrinsics.areEqual(this.hasher, configuration.hasher);
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.hasher.hashCode();
    }

    public String toString() {
        return "Configuration(version=" + this.version + ", hasher=" + this.hasher + ')';
    }

    public Configuration(int i, Hasher hasher) {
        Intrinsics.checkNotNullParameter(hasher, "hasher");
        this.version = i;
        this.hasher = hasher;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ Configuration(int i, MurMur3x64x128Hasher murMur3x64x128Hasher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new MurMur3x64x128Hasher() : murMur3x64x128Hasher);
    }

    public final Hasher getHasher() {
        return this.hasher;
    }
}
