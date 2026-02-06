package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import io.intercom.android.sdk.tickets.ConversationButtonState;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BigTicketCardKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$BigTicketCardKt$lambda2$1 implements p {
    public static final ComposableSingletons$BigTicketCardKt$lambda2$1 INSTANCE = new ComposableSingletons$BigTicketCardKt$lambda2$1();

    ComposableSingletons$BigTicketCardKt$lambda2$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            BigTicketCardKt.BigTicketCard(TicketDetailState.TicketDetailContentState.copy$default(TicketDetailContentKt.getSampleTicketDetailState(), (String) null, TicketTimelineCardState.m538copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), (List) null, (String) null, (String) null, TicketStatus.WaitingOnCustomer.m537getColor0d7_KjU(), C6565s.q(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)), "Waiting on you", Long.valueOf(System.currentTimeMillis()), 7, (Object) null), (List) null, (String) null, (String) null, (ConversationButtonState) null, 61, (Object) null), new C6156x(), true, (i) null, mVar, 440, 8);
        } else {
            mVar.I();
        }
    }
}
