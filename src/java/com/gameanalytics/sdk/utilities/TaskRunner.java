package com.gameanalytics.sdk.utilities;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class TaskRunner {
    private static final Executor executor = Executors.newSingleThreadExecutor();
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    public interface Callback<R> {
        void onComplete(R result);
    }

    public static <R> void executeAsync(final Callable<R> callable, final Callback<R> callback) {
        executor.execute(new Runnable() { // from class: com.gameanalytics.sdk.utilities.TaskRunner$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunner.lambda$executeAsync$1(callable, callback);
            }
        });
    }

    static /* synthetic */ void lambda$executeAsync$1(Callable callable, final Callback callback) {
        final Object objCall;
        try {
            objCall = callable.call();
        } catch (Exception e) {
            e.printStackTrace();
            objCall = null;
        }
        handler.post(new Runnable() { // from class: com.gameanalytics.sdk.utilities.TaskRunner$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TaskRunner.lambda$executeAsync$0(callback, objCall);
            }
        });
    }

    static /* synthetic */ void lambda$executeAsync$0(Callback callback, Object obj) {
        if (callback != null) {
            callback.onComplete(obj);
        }
    }
}
