package io.intercom.android.sdk.tickets.list.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import m3.L;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.tickets.list.data.TicketsPagingSource", f = "TicketsPagingSource.kt", l = {14}, m = "load")
final class TicketsPagingSource$load$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TicketsPagingSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TicketsPagingSource$load$1(TicketsPagingSource ticketsPagingSource, C6658d<? super TicketsPagingSource$load$1> dVar) {
        super(dVar);
        this.this$0 = ticketsPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load((L.a) null, this);
    }
}
