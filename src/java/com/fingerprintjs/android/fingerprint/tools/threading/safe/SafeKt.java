package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import com.fingerprintjs.android.fingerprint.tools.threading.SharedExecutorKt;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: compiled from: Safe.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"safe", "Lkotlin/Result;", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "safeWithTimeout", "timeoutMs", "", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SafeKt {
    public static final <T> Object safe(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    public static /* synthetic */ Object safeWithTimeout$default(long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return safeWithTimeout(j, function0);
    }

    public static final <T> Object safeWithTimeout(long j, final Function0<? extends T> function0) {
        Object obj;
        Object obj2;
        StackTraceElement[] stackTrace;
        Intrinsics.checkNotNullParameter(function0, "block");
        List listFilterNotNull = null;
        final AtomicReference atomicReference = new AtomicReference(null);
        if (Safe.INSTANCE.getInsideSafeWithTimeout$fingerprint_release()) {
            Safe.INSTANCE.logIllegalSafeWithTimeoutUsage$fingerprint_release();
        }
        try {
            Result.Companion companion = Result.Companion;
            Future<T> futureSubmit = SharedExecutorKt.getSharedExecutor().submit(new Callable() { // from class: com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return SafeKt.safeWithTimeout$lambda$1$lambda$0(atomicReference, function0);
                }
            });
            Intrinsics.checkNotNull(futureSubmit);
            obj = Result.constructor-impl(futureSubmit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th2));
        }
        Future future = (Future) obj;
        try {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(future.get(j, TimeUnit.MILLISECONDS));
        } catch (Throwable th3) {
            Result.Companion companion5 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj2);
        if (th4 != null) {
            try {
                Result.Companion companion6 = Result.Companion;
                if (th4 instanceof TimeoutException) {
                    TimeoutException timeoutException = (TimeoutException) th4;
                    Thread thread = (Thread) atomicReference.get();
                    if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                        Intrinsics.checkNotNull(stackTrace);
                        listFilterNotNull = ArraysKt.filterNotNull(stackTrace);
                    }
                    throw new ExecutionTimeoutException(timeoutException, listFilterNotNull);
                }
                throw th4;
            } catch (Throwable th5) {
                Result.Companion companion7 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th5));
            }
        }
        if (Result.exceptionOrNull-impl(obj2) != null) {
            try {
                Result.Companion companion8 = Result.Companion;
                Result.constructor-impl(Boolean.valueOf(future.cancel(true)));
            } catch (Throwable th6) {
                Result.Companion companion9 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th6));
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object safeWithTimeout$lambda$1$lambda$0(AtomicReference atomicReference, Function0 function0) {
        Intrinsics.checkNotNullParameter(atomicReference, "$executionThread");
        Intrinsics.checkNotNullParameter(function0, "$block");
        Safe.INSTANCE.markInsideSafeWithTimeout$fingerprint_release();
        atomicReference.set(Thread.currentThread());
        try {
            return function0.invoke();
        } finally {
            Safe.INSTANCE.clearInsideSafeWithTimeout$fingerprint_release();
        }
    }
}
