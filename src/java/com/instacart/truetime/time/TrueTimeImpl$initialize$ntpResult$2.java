package com.instacart.truetime.time;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.selects.SelectBuilder;
import kotlinx.coroutines.selects.SelectBuilderImpl;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: compiled from: TrueTimeImpl.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.instacart.truetime.time.TrueTimeImpl$initialize$ntpResult$2", f = "TrueTimeImpl.kt", i = {0}, l = {168}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
final class TrueTimeImpl$initialize$ntpResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super long[]>, Object> {
    final /* synthetic */ TrueTimeParameters $params;
    final /* synthetic */ List<InetAddress> $resolvedIPs;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ TrueTimeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TrueTimeImpl$initialize$ntpResult$2(List<? extends InetAddress> list, TrueTimeImpl trueTimeImpl, TrueTimeParameters trueTimeParameters, Continuation<? super TrueTimeImpl$initialize$ntpResult$2> continuation) {
        super(2, continuation);
        this.$resolvedIPs = list;
        this.this$0 = trueTimeImpl;
        this.$params = trueTimeParameters;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<Unit> trueTimeImpl$initialize$ntpResult$2 = new TrueTimeImpl$initialize$ntpResult$2(this.$resolvedIPs, this.this$0, this.$params, continuation);
        trueTimeImpl$initialize$ntpResult$2.L$0 = obj;
        return trueTimeImpl$initialize$ntpResult$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super long[]> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            List<InetAddress> list = this.$resolvedIPs;
            TrueTimeImpl trueTimeImpl = this.this$0;
            TrueTimeParameters trueTimeParameters = this.$params;
            this.L$0 = coroutineScope2;
            this.L$1 = list;
            this.L$2 = trueTimeImpl;
            this.L$3 = trueTimeParameters;
            this.label = 1;
            Continuation continuation = (Continuation) this;
            SelectBuilder selectBuilderImpl = new SelectBuilderImpl(continuation);
            try {
                SelectBuilder selectBuilder = selectBuilderImpl;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    selectBuilder.invoke(BuildersKt.async$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new TrueTimeImpl$initialize$ntpResult$2$1$1$1(trueTimeImpl, trueTimeParameters, (InetAddress) it.next(), null), 3, (Object) null).getOnAwait(), new TrueTimeImpl$initialize$ntpResult$2$1$1$2(null));
                }
            } catch (Throwable th) {
                selectBuilderImpl.handleBuilderException(th);
            }
            Object result = selectBuilderImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            obj = result;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        JobKt.cancelChildren$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        return obj;
    }
}
