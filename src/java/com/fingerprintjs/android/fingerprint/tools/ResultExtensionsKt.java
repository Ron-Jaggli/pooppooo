package com.fingerprintjs.android.fingerprint.tools;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: ResultExtensions.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"flatten", "Lkotlin/Result;", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ResultExtensionsKt {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final <V> Object flatten(Object obj) throws NoWhenBranchMatchedException {
        boolean z = Result.isSuccess-impl(obj);
        if (z) {
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).unbox-impl();
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Companion companion = Result.Companion;
        Throwable th = Result.exceptionOrNull-impl(obj);
        Intrinsics.checkNotNull(th);
        return Result.constructor-impl(ResultKt.createFailure(th));
    }
}
