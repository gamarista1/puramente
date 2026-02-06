package io.intercom.android.sdk.tickets.create.ui;

import Y.C1500m;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CreateTicketContentScreenKt$CreateTicketScreen$1 implements p {
    final /* synthetic */ C6787a $onBackClick;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState $uiState;

    CreateTicketContentScreenKt$CreateTicketScreen$1(CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState, C6787a aVar) {
        this.$uiState = createTicketFormUiState;
        this.$onBackClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = this.$uiState;
            TopActionBarKt.m207TopActionBarNpQZenA((i) null, createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content ? ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState).getTitle() : "", (String) null, (Integer) null, (List<AvatarWrapper>) null, this.$onBackClick, (Integer) null, false, 0, 0, 0, (C6787a) null, (q) null, mVar, 0, 0, 8157);
            return;
        }
        mVar.I();
    }
}
