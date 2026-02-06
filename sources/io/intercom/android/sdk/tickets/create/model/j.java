package io.intercom.android.sdk.tickets.create.model;

import java.util.List;
import yf.C6787a;

public final /* synthetic */ class j implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CreateTicketViewModel f70660a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f70661b;

    public /* synthetic */ j(CreateTicketViewModel createTicketViewModel, List list) {
        this.f70660a = createTicketViewModel;
        this.f70661b = list;
    }

    public final Object invoke() {
        return CreateTicketViewModel$fetchTicketType$1.invokeSuspend$lambda$0(this.f70660a, this.f70661b);
    }
}
