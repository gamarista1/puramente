package io.intercom.android.sdk.tickets.list.ui;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6479a;
import qf.C6658d;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class TicketsScreenViewModel$pagerFlow$1$1 extends C6479a implements p {
    public static final TicketsScreenViewModel$pagerFlow$1$1 INSTANCE = new TicketsScreenViewModel$pagerFlow$1$1();

    TicketsScreenViewModel$pagerFlow$1$1() {
        super(2, TicketRowReducerKt.class, "reduceTicketRowData", "reduceTicketRowData(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", 5);
    }

    public final Object invoke(Ticket ticket, C6658d<? super TicketRowData> dVar) {
        return TicketRowReducerKt.reduceTicketRowData(ticket);
    }
}
