package io.intercom.android.sdk.tickets;

import Y.C1500m;
import androidx.compose.foundation.b;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$TicketTimelineCardKt$lambda4$1 implements p {
    public static final ComposableSingletons$TicketTimelineCardKt$lambda4$1 INSTANCE = new ComposableSingletons$TicketTimelineCardKt$lambda4$1();

    ComposableSingletons$TicketTimelineCardKt$lambda4$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TicketTimelineCardKt.TicketTimelineCard(TicketTimelineCardState.m538copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), (List) null, (String) null, (String) null, TicketStatus.InProgress.m537getColor0d7_KjU(), C6565s.q(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)), (String) null, (Long) null, 103, (Object) null), b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), mVar, 8, 0);
            return;
        }
        mVar.I();
    }
}
