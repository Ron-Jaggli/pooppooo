package com.fingerprintjs.android.fingerprint.tools;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: ExceptionSafeExecutor.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"executeSafe", "T", "code", "Lkotlin/Function0;", "defaultValue", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExceptionSafeExecutorKt {
    @Deprecated(message = DeprecationMessages.UTIL_UNINTENDED_PUBLIC_API)
    public static final <T> T executeSafe(Function0<? extends T> function0, T t) {
        Intrinsics.checkNotNullParameter(function0, "code");
        try {
            return (T) function0.invoke();
        } catch (Throwable unused) {
            return t;
        }
    }
}
