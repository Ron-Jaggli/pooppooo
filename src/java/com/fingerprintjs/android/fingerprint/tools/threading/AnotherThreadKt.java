package com.fingerprintjs.android.fingerprint.tools.threading;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: compiled from: AnotherThread.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"runOnAnotherThread", "Lkotlin/Result;", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnotherThreadKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnAnotherThread$lambda$1$lambda$0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$block");
        function0.invoke();
    }

    public static final Object runOnAnotherThread(final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            SharedExecutorKt.getSharedExecutor().submit(new Runnable() { // from class: com.fingerprintjs.android.fingerprint.tools.threading.AnotherThreadKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AnotherThreadKt.runOnAnotherThread$lambda$1$lambda$0(function0);
                }
            });
            return Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
