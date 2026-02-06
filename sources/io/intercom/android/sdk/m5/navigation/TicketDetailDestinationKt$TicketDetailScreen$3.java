package io.intercom.android.sdk.m5.navigation;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketDetailDestinationKt$TicketDetailScreen$3 implements p {
    final /* synthetic */ C6787a $onBackClicked;
    final /* synthetic */ TicketDetailState $ticketDetailState;

    TicketDetailDestinationKt$TicketDetailScreen$3(TicketDetailState ticketDetailState, C6787a aVar) {
        this.$ticketDetailState = ticketDetailState;
        this.$onBackClicked = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        String str;
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            TicketDetailState ticketDetailState = this.$ticketDetailState;
            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState : null;
            if (ticketDetailContentState == null || (str = ticketDetailContentState.getTicketName()) == null) {
                str = "";
            }
            String str2 = str;
            C6787a aVar = this.$onBackClicked;
            Integer valueOf = Integer.valueOf(R.drawable.intercom_ic_close);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TopActionBarKt.m207TopActionBarNpQZenA((i) null, str2, (String) null, (Integer) null, (List<AvatarWrapper>) null, aVar, valueOf, false, intercomTheme.getColors(mVar2, i11).m678getBackground0d7_KjU(), intercomTheme.getColors(mVar2, i11).m700getPrimaryText0d7_KjU(), 0, (C6787a) null, (q) null, mVar, 0, 0, 7325);
            return;
        }
        mVar.I();
    }
}
