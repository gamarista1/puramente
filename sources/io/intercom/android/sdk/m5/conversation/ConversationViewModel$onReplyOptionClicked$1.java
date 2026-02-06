package io.intercom.android.sdk.m5.conversation;

import Ug.K;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onReplyOptionClicked$1", f = "ConversationViewModel.kt", l = {384}, m = "invokeSuspend")
final class ConversationViewModel$onReplyOptionClicked$1 extends l implements p {
    final /* synthetic */ ReplyOption $replyOption;
    int label;
    final /* synthetic */ ConversationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationViewModel$onReplyOptionClicked$1(ConversationViewModel conversationViewModel, ReplyOption replyOption, C6658d<? super ConversationViewModel$onReplyOptionClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = conversationViewModel;
        this.$replyOption = replyOption;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationViewModel$onReplyOptionClicked$1(this.this$0, this.$replyOption, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationViewModel$onReplyOptionClicked$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            Conversation conversation = ((ConversationClientState) this.this$0.clientState.getValue()).getConversation();
            if (conversation != null) {
                ConversationViewModel conversationViewModel = this.this$0;
                ReplyOption replyOption = this.$replyOption;
                this.label = 1;
                if (conversationViewModel.sendQuickReplyUseCase.invoke(conversationViewModel.clientState, replyOption, (Part) C6565s.z0(conversation.parts()), this) == f10) {
                    return f10;
                }
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
