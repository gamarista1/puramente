package io.intercom.android.sdk.ui.component;

import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2760D;
import w.C2782a;
import w.C2798j;
import w.q0;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$1", f = "PulsatingBox.kt", l = {36}, m = "invokeSuspend")
final class PulsatingBoxKt$PulsatingBox$1 extends l implements p {
    final /* synthetic */ C2782a $animatedScale;
    final /* synthetic */ float $pulseSize;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PulsatingBoxKt$PulsatingBox$1(C2782a aVar, float f10, C6658d<? super PulsatingBoxKt$PulsatingBox$1> dVar) {
        super(2, dVar);
        this.$animatedScale = aVar;
        this.$pulseSize = f10;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new PulsatingBoxKt$PulsatingBox$1(this.$animatedScale, this.$pulseSize, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((PulsatingBoxKt$PulsatingBox$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C2782a aVar = this.$animatedScale;
            Float b10 = b.b(this.$pulseSize);
            q0 j10 = C2798j.j(100, 0, (C2760D) null, 6, (Object) null);
            this.label = 1;
            if (C2782a.f(aVar, b10, j10, (Object) null, (C6798l) null, this, 12, (Object) null) == f10) {
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
