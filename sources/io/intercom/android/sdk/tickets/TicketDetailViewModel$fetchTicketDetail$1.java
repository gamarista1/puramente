package io.intercom.android.sdk.tickets;

import Ug.K;
import Xg.x;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$fetchTicketDetail$1", f = "TicketDetailViewModel.kt", l = {111}, m = "invokeSuspend")
final class TicketDetailViewModel$fetchTicketDetail$1 extends l implements p {
    final /* synthetic */ String $ticketId;
    Object L$0;
    int label;
    final /* synthetic */ TicketDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TicketDetailViewModel$fetchTicketDetail$1(TicketDetailViewModel ticketDetailViewModel, String str, C6658d<? super TicketDetailViewModel$fetchTicketDetail$1> dVar) {
        super(2, dVar);
        this.this$0 = ticketDetailViewModel;
        this.$ticketId = str;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(TicketDetailViewModel ticketDetailViewModel, String str) {
        ticketDetailViewModel.fetchTicketDetail$intercom_sdk_base_release(str);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new TicketDetailViewModel$fetchTicketDetail$1(this.this$0, this.$ticketId, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((TicketDetailViewModel$fetchTicketDetail$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        x xVar;
        Object obj2;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            x access$get_stateFlow$p = this.this$0._stateFlow;
            TicketRepository access$getRepository$p = this.this$0.repository;
            String str = this.$ticketId;
            this.L$0 = access$get_stateFlow$p;
            this.label = 1;
            Object fetchTicketDetail = access$getRepository$p.fetchTicketDetail(str, this);
            if (fetchTicketDetail == f10) {
                return f10;
            }
            xVar = access$get_stateFlow$p;
            obj = fetchTicketDetail;
        } else if (i10 == 1) {
            xVar = (x) this.L$0;
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            obj2 = new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, b.c(R.string.intercom_error_loading_ticket), 3, (DefaultConstructorMarker) null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            obj2 = new TicketDetailState.Error(new ErrorState.WithCTA(0, 0, b.c(R.string.intercom_error_loading_ticket), 0, new y(this.this$0, this.$ticketId), 11, (DefaultConstructorMarker) null));
        } else if (networkResponse instanceof NetworkResponse.Success) {
            Ticket ticket = (Ticket) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.fireMetricIfNecessary(ticket);
            this.this$0.markAsReadIfNecessary(ticket);
            this.this$0.ticketId = ticket.getId();
            obj2 = TicketDetailReducerKt.computeTicketViewState(ticket, this.this$0.user, this.this$0.getActiveAdminsAvatars(), this.this$0.launchedFrom);
        } else {
            throw new C6535s();
        }
        xVar.setValue(obj2);
        return C6514M.f71813a;
    }
}
