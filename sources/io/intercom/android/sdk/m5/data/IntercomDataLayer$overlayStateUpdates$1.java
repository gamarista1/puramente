package io.intercom.android.sdk.m5.data;

import Ug.K;
import Xg.C5696h;
import Xg.L;
import io.intercom.android.sdk.models.OverlayState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1", f = "IntercomDataLayer.kt", l = {374}, m = "invokeSuspend")
final class IntercomDataLayer$overlayStateUpdates$1 extends l implements p {
    final /* synthetic */ C6798l $onNewOverlyState;
    int label;
    final /* synthetic */ IntercomDataLayer this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/intercom/android/sdk/models/OverlayState;", "it", "Llf/M;", "<anonymous>", "(Lio/intercom/android/sdk/models/OverlayState;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$overlayStateUpdates$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        /* synthetic */ Object L$0;
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            AnonymousClass1 r02 = new AnonymousClass1(lVar, dVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(OverlayState overlayState, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(overlayState, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                lVar.invoke((OverlayState) this.L$0);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IntercomDataLayer$overlayStateUpdates$1(IntercomDataLayer intercomDataLayer, C6798l lVar, C6658d<? super IntercomDataLayer$overlayStateUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = intercomDataLayer;
        this.$onNewOverlyState = lVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new IntercomDataLayer$overlayStateUpdates$1(this.this$0, this.$onNewOverlyState, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((IntercomDataLayer$overlayStateUpdates$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            L overlayState = this.this$0.getOverlayState();
            final C6798l lVar = this.$onNewOverlyState;
            AnonymousClass1 r12 = new AnonymousClass1((C6658d<? super AnonymousClass1>) null);
            this.label = 1;
            if (C5696h.i(overlayState, r12, this) == f10) {
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
