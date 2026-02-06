package io.intercom.android.sdk.tickets;

import yf.C6787a;

public final /* synthetic */ class y implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TicketDetailViewModel f70781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f70782b;

    public /* synthetic */ y(TicketDetailViewModel ticketDetailViewModel, String str) {
        this.f70781a = ticketDetailViewModel;
        this.f70782b = str;
    }

    public final Object invoke() {
        return TicketDetailViewModel$fetchTicketDetail$1.invokeSuspend$lambda$0(this.f70781a, this.f70782b);
    }
}
