package io.intercom.android.sdk.tickets.create.ui;

import C.N;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CreateTicketContentScreenKt$CreateTicketScreen$2 implements q {
    final /* synthetic */ C6798l $onAnswerClick;
    final /* synthetic */ C6798l $onAnswerUpdated;
    final /* synthetic */ C6787a $onCancel;
    final /* synthetic */ C6787a $onCreateTicket;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState $uiState;

    CreateTicketContentScreenKt$CreateTicketScreen$2(CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState, C6787a aVar, C6787a aVar2, C6798l lVar, C6798l lVar2) {
        this.$uiState = createTicketFormUiState;
        this.$onCreateTicket = aVar;
        this.$onCancel = aVar2;
        this.$onAnswerUpdated = lVar;
        this.$onAnswerClick = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(N n10, C1500m mVar, int i10) {
        C6496s.h(n10, "contentPadding");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(n10) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = this.$uiState;
            if (C6496s.c(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE)) {
                mVar.T(-1277613046);
                mVar.M();
            } else if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content) {
                mVar.T(-1277572622);
                CreateTicketContentScreenKt.CreateTicketContentScreen(n.h(i.f23074a, n10), (CreateTicketViewModel.CreateTicketFormUiState.Content) this.$uiState, this.$onCreateTicket, this.$onCancel, this.$onAnswerUpdated, this.$onAnswerClick, mVar, 64, 0);
                mVar.M();
            } else if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Error) {
                mVar.T(-1277133631);
                IntercomErrorScreenKt.IntercomErrorScreen(((CreateTicketViewModel.CreateTicketFormUiState.Error) this.$uiState).getErrorState(), n.h(i.f23074a, n10), mVar, 0, 0);
                mVar.M();
            } else if (C6496s.c(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Loading.INSTANCE)) {
                mVar.T(97356214);
                LoadingScreenKt.LoadingScreen(n.h(i.f23074a, n10), R.drawable.intercom_content_loading, mVar, 0, 0);
                mVar.M();
            } else {
                mVar.T(97332199);
                mVar.M();
                throw new C6535s();
            }
        } else {
            mVar.I();
        }
    }
}
