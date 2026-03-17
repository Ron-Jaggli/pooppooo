package com.fingerprintjs.android.fingerprint.signal_providers;

import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: Signal.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\rH&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/Signal;", "T", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toMap", "", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Signal<T> {
    private final String name;
    private final T value;

    public abstract Map<String, Object> toMap();

    public Signal(String str, T t) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.name = str;
        this.value = t;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue() {
        return this.value;
    }
}
