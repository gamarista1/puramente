package io.intercom.android.sdk.tickets.list.reducers;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"reduceTicketRowData", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketRowReducerKt {
    public static final TicketRowData reduceTicketRowData(Ticket ticket) {
        String str;
        boolean z10;
        C6496s.h(ticket, "ticket");
        String publicId = ticket.getPublicId();
        if (publicId != null) {
            str = '#' + publicId;
        } else {
            str = null;
        }
        String x02 = C6565s.x0(C6565s.s(str, ticket.getCurrentStatus().getTitle()), " • ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        TicketStatus ticketStatus = TicketDetailReducerKt.toTicketStatus(ticket.getCurrentStatus());
        String id2 = ticket.getId();
        String title = ticket.getTitle();
        Boolean isRead = ticket.isRead();
        if (isRead != null) {
            z10 = isRead.booleanValue();
        } else {
            z10 = true;
        }
        return new TicketRowData(id2, title, x02, ticketStatus, z10);
    }
}
