package io.intercom.android.sdk.tickets.create.model;

import Ug.K;
import Xg.x;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt;
import java.util.List;
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
@f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1", f = "CreateTicketViewModel.kt", l = {105}, m = "invokeSuspend")
final class CreateTicketViewModel$fetchTicketType$1 extends l implements p {
    final /* synthetic */ List<TicketAttributeRequest> $attributes;
    Object L$0;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$fetchTicketType$1(CreateTicketViewModel createTicketViewModel, List<TicketAttributeRequest> list, C6658d<? super CreateTicketViewModel$fetchTicketType$1> dVar) {
        super(2, dVar);
        this.this$0 = createTicketViewModel;
        this.$attributes = list;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(CreateTicketViewModel createTicketViewModel, List list) {
        createTicketViewModel.fetchTicketType(list);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new CreateTicketViewModel$fetchTicketType$1(this.this$0, this.$attributes, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((CreateTicketViewModel$fetchTicketType$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        x xVar;
        Object obj2;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            x access$get_uiState$p = this.this$0._uiState;
            TicketRepository access$getTicketRepository$p = this.this$0.ticketRepository;
            int access$getTicketTypeId$p = this.this$0.ticketTypeId;
            List<TicketAttributeRequest> list = this.$attributes;
            this.L$0 = access$get_uiState$p;
            this.label = 1;
            Object fetchTicketType = access$getTicketRepository$p.fetchTicketType(access$getTicketTypeId$p, list, this);
            if (fetchTicketType == f10) {
                return f10;
            }
            xVar = access$get_uiState$p;
            obj = fetchTicketType;
        } else if (i10 == 1) {
            xVar = (x) this.L$0;
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.Success) {
            TicketTypeV2 ticketTypeV2 = (TicketTypeV2) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.currentTicketType = ticketTypeV2;
            obj2 = CreateTicketReducerKt.convertToTicketFormUiState(ticketTypeV2, this.this$0.userIdentity, this.this$0.config, this.this$0.getLastKnownContent());
        } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            obj2 = new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithoutCTA(0, 0, b.c(R.string.intercom_error_loading_ticket), 3, (DefaultConstructorMarker) null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            obj2 = new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, b.c(R.string.intercom_error_loading_ticket), 0, new j(this.this$0, this.$attributes), 11, (DefaultConstructorMarker) null));
        } else {
            throw new C6535s();
        }
        xVar.setValue(obj2);
        return C6514M.f71813a;
    }
}
