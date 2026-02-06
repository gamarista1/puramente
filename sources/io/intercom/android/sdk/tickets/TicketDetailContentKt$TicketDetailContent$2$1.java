package io.intercom.android.sdk.tickets;

import Ug.K;
import Ug.V;
import Y.C1510r0;
import c1.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1", f = "TicketDetailContent.kt", l = {81}, m = "invokeSuspend")
final class TicketDetailContentKt$TicketDetailContent$2$1 extends l implements p {
    final /* synthetic */ C1510r0 $cardState$delegate;
    final /* synthetic */ C1510r0 $submissionCardAlpha$delegate;
    final /* synthetic */ C1510r0 $submissionCardOffset$delegate;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TicketDetailContentKt$TicketDetailContent$2$1(C1510r0 r0Var, C1510r0 r0Var2, C1510r0 r0Var3, C6658d<? super TicketDetailContentKt$TicketDetailContent$2$1> dVar) {
        super(2, dVar);
        this.$submissionCardOffset$delegate = r0Var;
        this.$submissionCardAlpha$delegate = r0Var2;
        this.$cardState$delegate = r0Var3;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new TicketDetailContentKt$TicketDetailContent$2$1(this.$submissionCardOffset$delegate, this.$submissionCardAlpha$delegate, this.$cardState$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((TicketDetailContentKt$TicketDetailContent$2$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            TicketDetailContentKt.TicketDetailContent$lambda$7(this.$submissionCardOffset$delegate, h.j((float) 0));
            TicketDetailContentKt.TicketDetailContent$lambda$10(this.$submissionCardAlpha$delegate, 1.0f);
            this.label = 1;
            if (V.a(5000, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TicketDetailContentKt.TicketDetailContent$lambda$4(this.$cardState$delegate, CardState.TimelineCard);
        return C6514M.f71813a;
    }
}
