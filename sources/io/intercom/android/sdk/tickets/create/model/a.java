package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import yf.C6798l;

public final /* synthetic */ class a implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CreateTicketViewModel f70647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AnswerClickData f70648b;

    public /* synthetic */ a(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData) {
        this.f70647a = createTicketViewModel;
        this.f70648b = answerClickData;
    }

    public final Object invoke(Object obj) {
        return CreateTicketViewModel.onRetryFileClicked$lambda$9(this.f70647a, this.f70648b, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
    }
}
