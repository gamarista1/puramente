package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import yf.C6798l;

public final /* synthetic */ class c implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnswerClickData f70651a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CreateTicketViewModel f70652b;

    public /* synthetic */ c(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel) {
        this.f70651a = answerClickData;
        this.f70652b = createTicketViewModel;
    }

    public final Object invoke(Object obj) {
        return CreateTicketViewModel.onDeleteFileClicked$lambda$11(this.f70651a, this.f70652b, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
    }
}
