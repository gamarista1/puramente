package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TicketLinksCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$TicketLinksCardKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketLinksCardKt$lambda1$1();

    ComposableSingletons$TicketLinksCardKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(TicketType ticketType) {
        C6496s.h(ticketType, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            TicketType.Companion companion = TicketType.Companion;
            TicketLinksCardKt.TicketLinksCard(new HomeCards.HomeTicketLinksData("Create a ticket", HomeCardType.TICKET_LINKS, C6565s.q(new TicketLink(1, "Billing issue", "", 0, companion.getNULL()), new TicketLink(2, "Bug", "", 1, companion.getNULL()))), new e(), mVar, 56);
            return;
        }
        mVar.I();
    }
}
