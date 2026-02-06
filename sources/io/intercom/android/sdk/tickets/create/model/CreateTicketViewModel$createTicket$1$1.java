package io.intercom.android.sdk.tickets.create.model;

import Ug.K;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1", f = "CreateTicketViewModel.kt", l = {160, 167}, m = "invokeSuspend")
final class CreateTicketViewModel$createTicket$1$1 extends l implements p {
    final /* synthetic */ K $compositionAwareScope;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$createTicket$1$1(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, K k10, C6658d<? super CreateTicketViewModel$createTicket$1$1> dVar) {
        super(2, dVar);
        this.$content = content;
        this.this$0 = createTicketViewModel;
        this.$compositionAwareScope = k10;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$5(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, (String) null, (List) null, true, false, 11, (Object) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$6(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, (String) null, (List) null, false, false, 11, (Object) null));
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new CreateTicketViewModel$createTicket$1$1(this.$content, this.this$0, this.$compositionAwareScope, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((CreateTicketViewModel$createTicket$1$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            for (QuestionState validate : this.$content.getQuestions()) {
                validate.validate();
            }
            Iterable<QuestionState> questions = this.$content.getQuestions();
            if (!(questions instanceof Collection) || !((Collection) questions).isEmpty()) {
                for (QuestionState validationError : questions) {
                    if (!(validationError.getValidationError() instanceof ValidationError.NoValidationError)) {
                        for (QuestionState questionState : this.$content.getQuestions()) {
                            if (!(questionState.getValidationError() instanceof ValidationError.NoValidationError)) {
                                K k10 = this.$compositionAwareScope;
                                if (k10 != null) {
                                    questionState.bringIntoView(k10);
                                }
                                return C6514M.f71813a;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
            CreateTicketViewModel createTicketViewModel = this.this$0;
            createTicketViewModel.withState(new h(createTicketViewModel));
            TicketRepository access$getTicketRepository$p = this.this$0.ticketRepository;
            String access$getConversationId$p = this.this$0.conversationId;
            int access$getTicketTypeId$p = this.this$0.ticketTypeId;
            List access$getAttributeRequest = this.this$0.getAttributeRequest();
            this.label = 1;
            obj = access$getTicketRepository$p.createTicket(access$getConversationId$p, access$getTicketTypeId$p, access$getAttributeRequest, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else if (i10 == 2) {
            w.b(obj);
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((NetworkResponse) obj) instanceof NetworkResponse.Success) {
            Xg.w access$get_effect$p = this.this$0._effect;
            CreateTicketViewModel.TicketSideEffect.Finish finish = CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE;
            this.label = 2;
            if (access$get_effect$p.emit(finish, this) == f10) {
                return f10;
            }
        } else {
            CreateTicketViewModel createTicketViewModel2 = this.this$0;
            createTicketViewModel2.withState(new i(createTicketViewModel2));
        }
        return C6514M.f71813a;
    }
}
