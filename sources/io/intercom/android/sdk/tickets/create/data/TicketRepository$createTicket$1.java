package io.intercom.android.sdk.tickets.create.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.tickets.create.data.TicketRepository", f = "TicketRepository.kt", l = {32}, m = "createTicket")
final class TicketRepository$createTicket$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TicketRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TicketRepository$createTicket$1(TicketRepository ticketRepository, C6658d<? super TicketRepository$createTicket$1> dVar) {
        super(dVar);
        this.this$0 = ticketRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createTicket((String) null, 0, (List<TicketAttributeRequest>) null, this);
    }
}
