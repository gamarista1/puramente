package io.intercom.android.sdk.m5.data;

import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$emitEvent$2", f = "IntercomDataLayer.kt", l = {399}, m = "invokeSuspend")
final class IntercomDataLayer$emitEvent$2 extends l implements p {
    final /* synthetic */ IntercomEvent $event;
    int label;
    final /* synthetic */ IntercomDataLayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IntercomDataLayer$emitEvent$2(IntercomDataLayer intercomDataLayer, IntercomEvent intercomEvent, C6658d<? super IntercomDataLayer$emitEvent$2> dVar) {
        super(2, dVar);
        this.this$0 = intercomDataLayer;
        this.$event = intercomEvent;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new IntercomDataLayer$emitEvent$2(this.this$0, this.$event, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((IntercomDataLayer$emitEvent$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            IntercomDataLayer intercomDataLayer = this.this$0;
            IntercomEvent intercomEvent = this.$event;
            this.label = 1;
            if (intercomDataLayer.emitEvent(intercomEvent, (C6658d<? super C6514M>) this) == f10) {
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
