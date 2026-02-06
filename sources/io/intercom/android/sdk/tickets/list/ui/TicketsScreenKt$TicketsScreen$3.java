package io.intercom.android.sdk.tickets.list.ui;

import C.N;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import n3.C2331a;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketsScreenKt$TicketsScreen$3 implements q {
    final /* synthetic */ C6798l $onTicketClick;
    final /* synthetic */ TicketsScreenUiState $uiState;

    TicketsScreenKt$TicketsScreen$3(TicketsScreenUiState ticketsScreenUiState, C6798l lVar) {
        this.$uiState = ticketsScreenUiState;
        this.$onTicketClick = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(N n10, C1500m mVar, int i10) {
        C6496s.h(n10, "paddingValues");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(n10) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            TicketsScreenUiState ticketsScreenUiState = this.$uiState;
            if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                mVar.T(1161791623);
                TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) this.$uiState, n10, this.$onTicketClick, mVar, C2331a.f24669f | ((i10 << 3) & 112), 0);
                mVar.M();
            } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Empty) {
                mVar.T(1161993371);
                TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) this.$uiState).getEmptyState(), n.h(i.f23074a, n10), mVar, 0, 0);
                mVar.M();
            } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                mVar.T(1162175744);
                TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) this.$uiState).getErrorState(), n.h(i.f23074a, n10), mVar, 0, 0);
                mVar.M();
            } else if ((ticketsScreenUiState instanceof TicketsScreenUiState.Initial) || (ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                mVar.T(2115705652);
                TicketsLoadingScreenKt.TicketsLoadingScreen(n.h(i.f23074a, n10), mVar, 0, 0);
                mVar.M();
            } else {
                mVar.T(2115686198);
                mVar.M();
                throw new C6535s();
            }
        } else {
            mVar.I();
        }
    }
}
