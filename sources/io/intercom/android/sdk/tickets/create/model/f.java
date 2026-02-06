package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import yf.C6798l;

public final /* synthetic */ class f implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f70655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CreateTicketViewModel f70656b;

    public /* synthetic */ f(String str, CreateTicketViewModel createTicketViewModel) {
        this.f70655a = str;
        this.f70656b = createTicketViewModel;
    }

    public final Object invoke(Object obj) {
        return CreateTicketViewModel.onAnswerUpdated$lambda$3(this.f70655a, this.f70656b, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
    }
}
