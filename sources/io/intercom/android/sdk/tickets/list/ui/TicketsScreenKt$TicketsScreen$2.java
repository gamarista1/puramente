package io.intercom.android.sdk.tickets.list.ui;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketsScreenKt$TicketsScreen$2 implements p {
    final /* synthetic */ int $navIcon;
    final /* synthetic */ C6787a $onBackButtonClick;
    final /* synthetic */ TicketsScreenUiState $uiState;

    TicketsScreenKt$TicketsScreen$2(TicketsScreenUiState ticketsScreenUiState, C6787a aVar, int i10) {
        this.$uiState = ticketsScreenUiState;
        this.$onBackButtonClick = aVar;
        this.$navIcon = i10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            String screenLabel = this.$uiState.getScreenLabel();
            C6787a aVar = this.$onBackButtonClick;
            Integer valueOf = Integer.valueOf(this.$navIcon);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TopActionBarKt.m207TopActionBarNpQZenA((i) null, screenLabel, (String) null, (Integer) null, (List<AvatarWrapper>) null, aVar, valueOf, false, intercomTheme.getColors(mVar2, i11).m691getHeader0d7_KjU(), intercomTheme.getColors(mVar2, i11).m697getOnHeader0d7_KjU(), 0, (C6787a) null, (q) null, mVar, 0, 0, 7325);
            return;
        }
        mVar.I();
    }
}
