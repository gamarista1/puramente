package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1", f = "SendMessageUseCase.kt", l = {}, m = "invokeSuspend")
final class SendMessageUseCase$invoke$conversationId$1 extends l implements p {
    /* synthetic */ Object L$0;
    int label;

    SendMessageUseCase$invoke$conversationId$1(C6658d<? super SendMessageUseCase$invoke$conversationId$1> dVar) {
        super(2, dVar);
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(dVar);
        sendMessageUseCase$invoke$conversationId$1.L$0 = obj;
        return sendMessageUseCase$invoke$conversationId$1;
    }

    public final Object invoke(ConversationClientState conversationClientState, C6658d<? super Boolean> dVar) {
        return ((SendMessageUseCase$invoke$conversationId$1) create(conversationClientState, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            if (((ConversationClientState) this.L$0).getConversationId() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return b.a(z10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
