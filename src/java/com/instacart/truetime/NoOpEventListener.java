package com.instacart.truetime;

import com.instacart.truetime.time.TrueTimeParameters;
import java.net.InetAddress;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: compiled from: TrueTimeEventListener.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u001c\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00102\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0014\u0010\u001f\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0016¨\u0006%"}, d2 = {"Lcom/instacart/truetime/NoOpEventListener;", "Lcom/instacart/truetime/TrueTimeEventListener;", "()V", "initialize", "", "params", "Lcom/instacart/truetime/time/TrueTimeParameters;", "initializeFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initializeSuccess", "ntpResult", "", "lastSntpRequestAttempt", "ipHost", "Ljava/net/InetAddress;", "nextInitializeIn", "delayInMillis", "", "resolvedNtpHostToIPs", "ntpHost", "", "ipList", "", "returningDeviceTime", "returningTrueTime", "trueTime", "Ljava/util/Date;", "sntpRequest", "address", "sntpRequestFailed", "sntpRequestSuccessful", "storingTrueTime", "syncDispatcherException", "t", "", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NoOpEventListener implements TrueTimeEventListener {
    public static final NoOpEventListener INSTANCE = new NoOpEventListener();

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void initialize(TrueTimeParameters trueTimeParameters) {
        Intrinsics.checkNotNullParameter(trueTimeParameters, "params");
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void initializeFailed(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void initializeSuccess(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "ntpResult");
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void lastSntpRequestAttempt(InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter(inetAddress, "ipHost");
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void nextInitializeIn(long j) {
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void resolvedNtpHostToIPs(String str, List<? extends InetAddress> list) {
        Intrinsics.checkNotNullParameter(str, "ntpHost");
        Intrinsics.checkNotNullParameter(list, "ipList");
    }

    @Override // com.instacart.truetime.TimeKeeperListener
    public void returningDeviceTime() {
    }

    @Override // com.instacart.truetime.TimeKeeperListener
    public void returningTrueTime(Date date) {
        Intrinsics.checkNotNullParameter(date, "trueTime");
    }

    @Override // com.instacart.truetime.SntpEventListener
    public void sntpRequest(InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter(inetAddress, "address");
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void sntpRequestFailed(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
    }

    @Override // com.instacart.truetime.SntpEventListener
    public void sntpRequestFailed(InetAddress inetAddress, Exception exc) {
        Intrinsics.checkNotNullParameter(inetAddress, "address");
        Intrinsics.checkNotNullParameter(exc, "e");
    }

    @Override // com.instacart.truetime.SntpEventListener
    public void sntpRequestSuccessful(InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter(inetAddress, "address");
    }

    @Override // com.instacart.truetime.TimeKeeperListener
    public void storingTrueTime(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "ntpResult");
    }

    @Override // com.instacart.truetime.TrueTimeEventListener
    public void syncDispatcherException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "t");
    }

    private NoOpEventListener() {
    }
}
