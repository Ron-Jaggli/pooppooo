package com.instacart.truetime.time;

import android.os.SystemClock;
import com.instacart.truetime.TimeKeeperListener;
import com.instacart.truetime.sntp.Sntp;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: compiled from: TimeKeeper.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/instacart/truetime/time/TimeKeeper;", "", "sntp", "Lcom/instacart/truetime/sntp/Sntp;", "listener", "Lcom/instacart/truetime/TimeKeeperListener;", "(Lcom/instacart/truetime/sntp/Sntp;Lcom/instacart/truetime/TimeKeeperListener;)V", "ttResult", "Ljava/util/concurrent/atomic/AtomicReference;", "", "hasTheTime", "", "now", "Ljava/util/Date;", "save", "", "ntpResult", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimeKeeper {
    private final TimeKeeperListener listener;
    private final Sntp sntp;
    private AtomicReference<long[]> ttResult;

    public TimeKeeper(Sntp sntp, TimeKeeperListener timeKeeperListener) {
        Intrinsics.checkNotNullParameter(sntp, "sntp");
        Intrinsics.checkNotNullParameter(timeKeeperListener, "listener");
        this.sntp = sntp;
        this.listener = timeKeeperListener;
        this.ttResult = new AtomicReference<>();
    }

    public final boolean hasTheTime() {
        return this.ttResult.get() != null;
    }

    public final void save(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "ntpResult");
        this.listener.storingTrueTime(jArr);
        this.ttResult.set(jArr);
    }

    public final Date now() {
        long[] jArr = this.ttResult.get();
        Sntp sntp = this.sntp;
        Intrinsics.checkNotNullExpressionValue(jArr, "ntpResult");
        Date date = new Date(sntp.trueTime(jArr) + (SystemClock.elapsedRealtime() - this.sntp.timeSinceBoot(jArr)));
        this.listener.returningTrueTime(date);
        return date;
    }
}
