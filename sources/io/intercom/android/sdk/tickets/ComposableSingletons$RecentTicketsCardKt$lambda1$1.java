package io.intercom.android.sdk.tickets;

import Y.C1500m;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$RecentTicketsCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$RecentTicketsCardKt$lambda1$1 INSTANCE = new ComposableSingletons$RecentTicketsCardKt$lambda1$1();

    ComposableSingletons$RecentTicketsCardKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i h10 = q.h(i.f23074a, 0.0f, 1, (Object) null);
            Ticket.Status status = r5;
            Ticket.Status status2 = new Ticket.Status("Waiting on you", "waiting_on_customer", (String) null, false, 0, 28, (DefaultConstructorMarker) null);
            Boolean bool = Boolean.FALSE;
            Ticket ticket = new Ticket("1", "1200", "This is a ticket title", (String) null, (String) null, (String) null, status, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (Ticket.ConversationButton) null, bool, 0, 24504, (DefaultConstructorMarker) null);
            Ticket.Status status3 = r5;
            Ticket.Status status4 = new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, (String) null, false, 0, 28, (DefaultConstructorMarker) null);
            Boolean bool2 = Boolean.TRUE;
            Ticket ticket2 = new Ticket("2", "1201", "Bug", (String) null, (String) null, (String) null, status3, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (Ticket.ConversationButton) null, bool2, 0, 24504, (DefaultConstructorMarker) null);
            Ticket.Status status5 = r20;
            Ticket.Status status6 = new Ticket.Status("In progress", "in_progress", (String) null, false, 0, 28, (DefaultConstructorMarker) null);
            Ticket ticket3 = new Ticket("3", "1202", "Feature Request", (String) null, (String) null, (String) null, status5, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (Ticket.ConversationButton) null, bool2, 0, 24504, (DefaultConstructorMarker) null);
            Ticket.Status status7 = r24;
            Ticket.Status status8 = new Ticket.Status("Resolved", "resolved", (String) null, false, 0, 28, (DefaultConstructorMarker) null);
            RecentTicketsCardKt.RecentTicketsCard(h10, "Recent tickets", C6565s.q(ticket, ticket2, ticket3, new Ticket("4", "1204", "Unresolvable", (String) null, (String) null, (String) null, status7, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (Ticket.ConversationButton) null, bool, 0, 24504, (DefaultConstructorMarker) null)), new C6317a(), mVar, 3638, 0);
            return;
        }
        mVar.I();
    }
}
