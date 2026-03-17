package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: compiled from: ExecutionTimeoutException.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/threading/safe/ExecutionTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "timeoutException", "Ljava/util/concurrent/TimeoutException;", "executionThreadStackTrace", "", "Ljava/lang/StackTraceElement;", "(Ljava/util/concurrent/TimeoutException;Ljava/util/List;)V", "getExecutionThreadStackTrace", "()Ljava/util/List;", "message", "", "getMessage", "()Ljava/lang/String;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExecutionTimeoutException extends Exception {
    private final List<StackTraceElement> executionThreadStackTrace;

    public final List<StackTraceElement> getExecutionThreadStackTrace() {
        return this.executionThreadStackTrace;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutionTimeoutException(TimeoutException timeoutException, List<StackTraceElement> list) {
        super(timeoutException);
        Intrinsics.checkNotNullParameter(timeoutException, "timeoutException");
        this.executionThreadStackTrace = list;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sbAppend = new StringBuilder("The execution took too long to complete. Original exception: ").append(getCause()).append(", execution thread stacktrace: ");
        List<StackTraceElement> list = this.executionThreadStackTrace;
        return sbAppend.append(list != null ? CollectionsKt.joinToString$default(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<StackTraceElement, CharSequence>() { // from class: com.fingerprintjs.android.fingerprint.tools.threading.safe.ExecutionTimeoutException$message$1
            public final CharSequence invoke(StackTraceElement stackTraceElement) {
                Intrinsics.checkNotNullParameter(stackTraceElement, "it");
                String string = stackTraceElement.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        }, 31, (Object) null) : null).append('.').toString();
    }
}
