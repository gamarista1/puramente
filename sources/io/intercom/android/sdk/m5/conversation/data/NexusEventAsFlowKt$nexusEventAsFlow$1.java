package io.intercom.android.sdk.m5.conversation.data;

import Wg.r;
import io.intercom.android.nexus.NexusClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWg/r;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "Llf/M;", "<anonymous>", "(LWg/r;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1", f = "NexusEventAsFlow.kt", l = {50}, m = "invokeSuspend")
final class NexusEventAsFlowKt$nexusEventAsFlow$1 extends l implements p {
    final /* synthetic */ NexusClient $nexusClient;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NexusEventAsFlowKt$nexusEventAsFlow$1(NexusClient nexusClient, C6658d<? super NexusEventAsFlowKt$nexusEventAsFlow$1> dVar) {
        super(2, dVar);
        this.$nexusClient = nexusClient;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(NexusClient nexusClient, NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1) {
        nexusClient.removeEventListener(nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        NexusEventAsFlowKt$nexusEventAsFlow$1 nexusEventAsFlowKt$nexusEventAsFlow$1 = new NexusEventAsFlowKt$nexusEventAsFlow$1(this.$nexusClient, dVar);
        nexusEventAsFlowKt$nexusEventAsFlow$1.L$0 = obj;
        return nexusEventAsFlowKt$nexusEventAsFlow$1;
    }

    public final Object invoke(r rVar, C6658d<? super C6514M> dVar) {
        return ((NexusEventAsFlowKt$nexusEventAsFlow$1) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            r rVar = (r) this.L$0;
            NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 = new NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1(rVar);
            this.$nexusClient.addEventListener(nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
            b bVar = new b(this.$nexusClient, nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
            this.label = 1;
            if (Wg.p.a(rVar, bVar, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
