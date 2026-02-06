package io.intercom.android.sdk.tickets;

import C.N;
import O0.g;
import Y.C1500m;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RecentTicketsCardKt$RecentTicketsCard$2 implements p {
    final /* synthetic */ C6798l $onClick;
    final /* synthetic */ List<Ticket> $tickets;

    RecentTicketsCardKt$RecentTicketsCard$2(List<Ticket> list, C6798l lVar) {
        this.$tickets = list;
        this.$onClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C6798l lVar, Ticket ticket) {
        C6496s.h(ticket, "$it");
        lVar.invoke(ticket.getId());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            C6798l lVar = this.$onClick;
            for (Ticket ticket : this.$tickets) {
                i d10 = d.d(q.h(i.f23074a, 0.0f, 1, (Object) null), false, (String) null, (g) null, new C6333m(lVar, ticket), 7, (Object) null);
                N b10 = n.b(h.j((float) 20), h.j((float) 8));
                TicketRowData reduceTicketRowData = TicketRowReducerKt.reduceTicketRowData(ticket);
                Boolean isRead = ticket.isRead();
                TicketRowKt.TicketRow(d10, reduceTicketRowData, b10, isRead != null && !isRead.booleanValue(), mVar, 0, 0);
            }
            return;
        }
        mVar.I();
    }
}
