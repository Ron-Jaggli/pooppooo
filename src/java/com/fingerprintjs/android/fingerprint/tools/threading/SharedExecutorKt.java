package com.fingerprintjs.android.fingerprint.tools.threading;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: compiled from: SharedExecutor.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0001\"$\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0001@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<set-?>", "Ljava/util/concurrent/ThreadPoolExecutor;", "sharedExecutor", "getSharedExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setSharedExecutor", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "createSharedExecutor", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SharedExecutorKt {
    private static ThreadPoolExecutor sharedExecutor = createSharedExecutor();

    public static final ThreadPoolExecutor getSharedExecutor() {
        return sharedExecutor;
    }

    public static final void setSharedExecutor(ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "<set-?>");
        sharedExecutor = threadPoolExecutor;
    }

    public static final ThreadPoolExecutor createSharedExecutor() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }
}
