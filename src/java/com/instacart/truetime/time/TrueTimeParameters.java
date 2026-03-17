package com.instacart.truetime.time;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: compiled from: TrueTimeParameters.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001#Bg\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/instacart/truetime/time/TrueTimeParameters;", "", "connectionTimeoutInMillis", "", "ntpHostPool", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "retryCountAgainstSingleIp", "rootDelayMax", "", "rootDispersionMax", "serverResponseDelayMaxInMillis", "syncIntervalInMillis", "", "returnSafelyWhenUninitialized", "", "filterIpv6Addresses", "strictNtpMode", "(ILjava/util/ArrayList;IFFIJZZZ)V", "getConnectionTimeoutInMillis", "()I", "getFilterIpv6Addresses", "()Z", "getNtpHostPool", "()Ljava/util/ArrayList;", "getRetryCountAgainstSingleIp", "getReturnSafelyWhenUninitialized", "getRootDelayMax", "()F", "getRootDispersionMax", "getServerResponseDelayMaxInMillis", "getStrictNtpMode", "getSyncIntervalInMillis", "()J", "Builder", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrueTimeParameters {
    private final int connectionTimeoutInMillis;
    private final boolean filterIpv6Addresses;
    private final ArrayList<String> ntpHostPool;
    private final int retryCountAgainstSingleIp;
    private final boolean returnSafelyWhenUninitialized;
    private final float rootDelayMax;
    private final float rootDispersionMax;
    private final int serverResponseDelayMaxInMillis;
    private final boolean strictNtpMode;
    private final long syncIntervalInMillis;

    public /* synthetic */ TrueTimeParameters(int i, ArrayList arrayList, int i2, float f, float f2, int i3, long j, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, arrayList, i2, f, f2, i3, j, z, z2, z3);
    }

    private TrueTimeParameters(int i, ArrayList<String> arrayList, int i2, float f, float f2, int i3, long j, boolean z, boolean z2, boolean z3) {
        this.connectionTimeoutInMillis = i;
        this.ntpHostPool = arrayList;
        this.retryCountAgainstSingleIp = i2;
        this.rootDelayMax = f;
        this.rootDispersionMax = f2;
        this.serverResponseDelayMaxInMillis = i3;
        this.syncIntervalInMillis = j;
        this.returnSafelyWhenUninitialized = z;
        this.filterIpv6Addresses = z2;
        this.strictNtpMode = z3;
    }

    public final int getConnectionTimeoutInMillis() {
        return this.connectionTimeoutInMillis;
    }

    public final ArrayList<String> getNtpHostPool() {
        return this.ntpHostPool;
    }

    public final int getRetryCountAgainstSingleIp() {
        return this.retryCountAgainstSingleIp;
    }

    public final float getRootDelayMax() {
        return this.rootDelayMax;
    }

    public final float getRootDispersionMax() {
        return this.rootDispersionMax;
    }

    public final int getServerResponseDelayMaxInMillis() {
        return this.serverResponseDelayMaxInMillis;
    }

    public final long getSyncIntervalInMillis() {
        return this.syncIntervalInMillis;
    }

    public final boolean getReturnSafelyWhenUninitialized() {
        return this.returnSafelyWhenUninitialized;
    }

    public final boolean getFilterIpv6Addresses() {
        return this.filterIpv6Addresses;
    }

    public final boolean getStrictNtpMode() {
        return this.strictNtpMode;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    /* JADX INFO: compiled from: TrueTimeParameters.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00002\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/instacart/truetime/time/TrueTimeParameters$Builder;", "", "()V", "connectionTimeoutInMillis", "", "filterIpv6Addresses", "", "ntpHostPool", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "retryCountAgainstSingleIp", "returnSafelyWhenUninitialized", "rootDelayMax", "", "rootDispersionMax", "serverResponseDelayMaxInMillis", "strictNtpMode", "syncIntervalInMillis", "", "buildParams", "Lcom/instacart/truetime/time/TrueTimeParameters;", "value", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private int connectionTimeoutInMillis = 30000;
        private ArrayList<String> ntpHostPool = CollectionsKt.arrayListOf(new String[]{"time.google.com"});
        private int retryCountAgainstSingleIp = 50;
        private float rootDelayMax = 100.0f;
        private float rootDispersionMax = 100.0f;
        private int serverResponseDelayMaxInMillis = 750;
        private long syncIntervalInMillis = 3600000;
        private boolean returnSafelyWhenUninitialized = true;
        private boolean filterIpv6Addresses = true;
        private boolean strictNtpMode = true;

        public final Builder connectionTimeoutInMillis(int i) {
            this.connectionTimeoutInMillis = i;
            return this;
        }

        public final Builder ntpHostPool(ArrayList<String> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "value");
            this.ntpHostPool = arrayList;
            return this;
        }

        public final Builder retryCountAgainstSingleIp(int i) {
            this.retryCountAgainstSingleIp = i;
            return this;
        }

        public final Builder rootDelayMax(float f) {
            this.rootDelayMax = f;
            return this;
        }

        public final Builder rootDispersionMax(float f) {
            this.rootDispersionMax = f;
            return this;
        }

        public final Builder serverResponseDelayMaxInMillis(int i) {
            this.serverResponseDelayMaxInMillis = i;
            return this;
        }

        public final Builder syncIntervalInMillis(long j) {
            this.syncIntervalInMillis = j;
            return this;
        }

        public final Builder returnSafelyWhenUninitialized(boolean z) {
            this.returnSafelyWhenUninitialized = z;
            return this;
        }

        public final Builder filterIpv6Addresses(boolean z) {
            this.filterIpv6Addresses = z;
            return this;
        }

        public final Builder strictNtpMode(boolean z) {
            this.strictNtpMode = z;
            return this;
        }

        public final TrueTimeParameters buildParams() {
            return new TrueTimeParameters(this.connectionTimeoutInMillis, this.ntpHostPool, this.retryCountAgainstSingleIp, this.rootDelayMax, this.rootDispersionMax, this.serverResponseDelayMaxInMillis, this.syncIntervalInMillis, this.returnSafelyWhenUninitialized, this.filterIpv6Addresses, this.strictNtpMode, null);
        }
    }
}
