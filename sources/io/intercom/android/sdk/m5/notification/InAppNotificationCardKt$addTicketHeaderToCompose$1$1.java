package io.intercom.android.sdk.m5.notification;

import V.B0;
import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InAppNotificationCardKt$addTicketHeaderToCompose$1$1 implements p {
    final /* synthetic */ Conversation $conversation;

    InAppNotificationCardKt$addTicketHeaderToCompose$1$1(Conversation conversation) {
        this.$conversation = conversation;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final Conversation conversation = this.$conversation;
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-1860903769, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) == 2 && mVar.i()) {
                        mVar.I();
                    } else if (conversation.getTicket() != null) {
                        TicketHeaderKt.TicketHeader((i) null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? V0.p.f8210b.c() : V0.p.f8210b.d()), mVar, 0, 1);
                    }
                }
            }, mVar, 54), mVar, 3072, 7);
            return;
        }
        mVar.I();
    }
}
