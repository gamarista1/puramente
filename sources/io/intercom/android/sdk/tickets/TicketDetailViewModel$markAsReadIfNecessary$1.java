package io.intercom.android.sdk.tickets;

import Ug.K;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1", f = "TicketDetailViewModel.kt", l = {95}, m = "invokeSuspend")
final class TicketDetailViewModel$markAsReadIfNecessary$1 extends l implements p {
    final /* synthetic */ Ticket $ticket;
    int label;
    final /* synthetic */ TicketDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TicketDetailViewModel$markAsReadIfNecessary$1(TicketDetailViewModel ticketDetailViewModel, Ticket ticket, C6658d<? super TicketDetailViewModel$markAsReadIfNecessary$1> dVar) {
        super(2, dVar);
        this.this$0 = ticketDetailViewModel;
        this.$ticket = ticket;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new TicketDetailViewModel$markAsReadIfNecessary$1(this.this$0, this.$ticket, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((TicketDetailViewModel$markAsReadIfNecessary$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            TicketRepository access$getRepository$p = this.this$0.repository;
            String id2 = this.$ticket.getId();
            this.label = 1;
            if (access$getRepository$p.markAsRead(id2, this) == f10) {
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
