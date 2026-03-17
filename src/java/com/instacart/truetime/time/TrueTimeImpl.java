package com.instacart.truetime.time;

import com.instacart.truetime.NoOpEventListener;
import com.instacart.truetime.TrueTimeEventListener;
import com.instacart.truetime.sntp.Sntp;
import com.instacart.truetime.sntp.SntpImpl;
import com.instacart.truetime.time.TrueTimeParameters;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: compiled from: TrueTimeImpl.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002J\u0012\u0010$\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/instacart/truetime/time/TrueTimeImpl;", "Lcom/instacart/truetime/time/TrueTime;", "params", "Lcom/instacart/truetime/time/TrueTimeParameters;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "listener", "Lcom/instacart/truetime/TrueTimeEventListener;", "(Lcom/instacart/truetime/time/TrueTimeParameters;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/instacart/truetime/TrueTimeEventListener;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sntp", "Lcom/instacart/truetime/sntp/Sntp;", "timeKeeper", "Lcom/instacart/truetime/time/TimeKeeper;", "hasTheTime", "", "initialize", "", "(Lcom/instacart/truetime/time/TrueTimeParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "Ljava/util/Date;", "nowSafely", "nowTrueOnly", "requestTime", "with", "ipHostAddress", "Ljava/net/InetAddress;", "resolveNtpHostToIPs", "", "ntpHostAddress", "", "sntpRequest", "sync", "Lkotlinx/coroutines/Job;", "filterLeastRoundTripDelay", "filterMedianClockOffset", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrueTimeImpl implements TrueTime {
    private final TrueTimeEventListener listener;
    private final TrueTimeParameters params;
    private final CoroutineScope scope;
    private final Sntp sntp;
    private final TimeKeeper timeKeeper;

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    /* JADX INFO: renamed from: com.instacart.truetime.time.TrueTimeImpl$initialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: TrueTimeImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.instacart.truetime.time.TrueTimeImpl", f = "TrueTimeImpl.kt", i = {0}, l = {88}, m = "initialize", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrueTimeImpl.this.initialize(null, (Continuation) this);
        }
    }

    public TrueTimeImpl() {
        this(null, null, null, 7, null);
    }

    public TrueTimeImpl(TrueTimeParameters trueTimeParameters, CoroutineDispatcher coroutineDispatcher, TrueTimeEventListener trueTimeEventListener) {
        Intrinsics.checkNotNullParameter(trueTimeParameters, "params");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(trueTimeEventListener, "listener");
        this.params = trueTimeParameters;
        this.listener = trueTimeEventListener;
        SntpImpl sntpImpl = new SntpImpl();
        this.sntp = sntpImpl;
        this.timeKeeper = new TimeKeeper(sntpImpl, trueTimeEventListener);
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus((CoroutineContext) coroutineDispatcher).plus((CoroutineExceptionHandler) new TrueTimeImpl$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this)));
    }

    public /* synthetic */ TrueTimeImpl(TrueTimeParameters trueTimeParameters, CoroutineDispatcher coroutineDispatcher, NoOpEventListener noOpEventListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TrueTimeParameters.Builder().buildParams() : trueTimeParameters, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 4) != 0 ? NoOpEventListener.INSTANCE : noOpEventListener);
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    /* JADX INFO: renamed from: com.instacart.truetime.time.TrueTimeImpl$sync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TrueTimeImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.instacart.truetime.time.TrueTimeImpl$sync$1", f = "TrueTimeImpl.kt", i = {}, l = {30, 36}, m = "invokeSuspend", n = {}, s = {})
    static final class C01921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C01921(Continuation<? super C01921> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrueTimeImpl.this.new C01921(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:14:0x0020). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: o
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at na.h.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:44)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L1d
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L1b
                goto L3b
            L1b:
                r7 = move-exception
                goto L32
            L1d:
                kotlin.ResultKt.throwOnFailure(r7)
            L20:
                com.instacart.truetime.time.TrueTimeImpl r7 = com.instacart.truetime.time.TrueTimeImpl.this     // Catch: java.lang.Exception -> L1b
                com.instacart.truetime.time.TrueTimeParameters r1 = com.instacart.truetime.time.TrueTimeImpl.access$getParams$p(r7)     // Catch: java.lang.Exception -> L1b
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L1b
                r6.label = r3     // Catch: java.lang.Exception -> L1b
                java.lang.Object r7 = com.instacart.truetime.time.TrueTimeImpl.access$initialize(r7, r1, r4)     // Catch: java.lang.Exception -> L1b
                if (r7 != r0) goto L3b
                return r0
            L32:
                com.instacart.truetime.time.TrueTimeImpl r1 = com.instacart.truetime.time.TrueTimeImpl.this
                com.instacart.truetime.TrueTimeEventListener r1 = com.instacart.truetime.time.TrueTimeImpl.access$getListener$p(r1)
                r1.initializeFailed(r7)
            L3b:
                com.instacart.truetime.time.TrueTimeImpl r7 = com.instacart.truetime.time.TrueTimeImpl.this
                com.instacart.truetime.TrueTimeEventListener r7 = com.instacart.truetime.time.TrueTimeImpl.access$getListener$p(r7)
                com.instacart.truetime.time.TrueTimeImpl r1 = com.instacart.truetime.time.TrueTimeImpl.this
                com.instacart.truetime.time.TrueTimeParameters r1 = com.instacart.truetime.time.TrueTimeImpl.access$getParams$p(r1)
                long r4 = r1.getSyncIntervalInMillis()
                r7.nextInitializeIn(r4)
                com.instacart.truetime.time.TrueTimeImpl r7 = com.instacart.truetime.time.TrueTimeImpl.this
                com.instacart.truetime.time.TrueTimeParameters r7 = com.instacart.truetime.time.TrueTimeImpl.access$getParams$p(r7)
                long r4 = r7.getSyncIntervalInMillis()
                r7 = r6
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r6.label = r2
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r7)
                if (r7 != r0) goto L20
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instacart.truetime.time.TrueTimeImpl.C01921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.instacart.truetime.time.TrueTime
    public Job sync() {
        return BuildersKt.launch$default(this.scope, new CoroutineName("TrueTime-Syncer"), (CoroutineStart) null, new C01921(null), 2, (Object) null);
    }

    @Override // com.instacart.truetime.time.TrueTime
    public boolean hasTheTime() {
        return this.timeKeeper.hasTheTime();
    }

    @Override // com.instacart.truetime.time.TrueTime
    public Date now() {
        return this.params.getReturnSafelyWhenUninitialized() ? nowSafely() : nowTrueOnly();
    }

    @Override // com.instacart.truetime.time.TrueTime
    public Date nowSafely() {
        if (this.timeKeeper.hasTheTime()) {
            return nowTrueOnly();
        }
        this.listener.returningDeviceTime();
        return new Date();
    }

    @Override // com.instacart.truetime.time.TrueTime
    public Date nowTrueOnly() {
        if (!hasTheTime()) {
            throw new IllegalStateException("TrueTime was not initialized successfully yet");
        }
        return this.timeKeeper.now();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initialize(com.instacart.truetime.time.TrueTimeParameters r8, kotlin.coroutines.Continuation<? super long[]> r9) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instacart.truetime.time.TrueTimeImpl.initialize(com.instacart.truetime.time.TrueTimeParameters, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<InetAddress> resolveNtpHostToIPs(String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(ntpHostAddress)");
        List<? extends InetAddress> list = ArraysKt.toList(allByName);
        this.listener.resolvedNtpHostToIPs(str, list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            InetAddress inetAddress = (InetAddress) obj;
            if (!this.params.getFilterIpv6Addresses() || !(inetAddress instanceof Inet6Address)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long[] requestTime(TrueTimeParameters trueTimeParameters, InetAddress inetAddress) {
        int retryCountAgainstSingleIp = trueTimeParameters.getRetryCountAgainstSingleIp() - 1;
        for (int i = 0; i < retryCountAgainstSingleIp; i++) {
            try {
                return this.sntpRequest(trueTimeParameters, inetAddress);
            } catch (Exception e) {
                this.listener.sntpRequestFailed(e);
            }
        }
        this.listener.lastSntpRequestAttempt(inetAddress);
        return this.sntpRequest(trueTimeParameters, inetAddress);
    }

    private final long[] sntpRequest(TrueTimeParameters trueTimeParameters, InetAddress inetAddress) {
        return this.sntp.requestTime(inetAddress, trueTimeParameters.getRootDelayMax(), trueTimeParameters.getRootDispersionMax(), trueTimeParameters.getServerResponseDelayMaxInMillis(), trueTimeParameters.getConnectionTimeoutInMillis(), this.listener);
    }

    private final long[] filterLeastRoundTripDelay(List<long[]> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long jRoundTripDelay = this.sntp.roundTripDelay((long[]) next);
                do {
                    Object next2 = it.next();
                    long jRoundTripDelay2 = this.sntp.roundTripDelay((long[]) next2);
                    if (jRoundTripDelay > jRoundTripDelay2) {
                        next = next2;
                        jRoundTripDelay = jRoundTripDelay2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        long[] jArr = (long[]) obj;
        if (jArr != null) {
            return jArr;
        }
        throw new IllegalStateException("Could not find any results from requestingTime");
    }

    private final long[] filterMedianClockOffset(List<long[]> list) {
        List listSortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: com.instacart.truetime.time.TrueTimeImpl$filterMedianClockOffset$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(this.this$0.sntp.clockOffset((long[]) t)), Long.valueOf(this.this$0.sntp.clockOffset((long[]) t2)));
            }
        });
        return (long[]) listSortedWith.get(listSortedWith.size() / 2);
    }
}
