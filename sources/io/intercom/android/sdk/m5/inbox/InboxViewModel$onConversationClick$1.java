package io.intercom.android.sdk.m5.inbox;

import Ug.K;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1", f = "InboxViewModel.kt", l = {80}, m = "invokeSuspend")
final class InboxViewModel$onConversationClick$1 extends l implements p {
    final /* synthetic */ Conversation $it;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InboxViewModel$onConversationClick$1(InboxViewModel inboxViewModel, Conversation conversation, C6658d<? super InboxViewModel$onConversationClick$1> dVar) {
        super(2, dVar);
        this.this$0 = inboxViewModel;
        this.$it = conversation;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new InboxViewModel$onConversationClick$1(this.this$0, this.$it, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((InboxViewModel$onConversationClick$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            Xg.w access$get_effect$p = this.this$0._effect;
            InboxUiEffects.NavigateToConversation navigateToConversation = new InboxUiEffects.NavigateToConversation(this.$it);
            this.label = 1;
            if (access$get_effect$p.emit(navigateToConversation, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
