package io.intercom.android.sdk.m5.conversation;

import Ug.K;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$onInputChange$1", f = "ConversationViewModel.kt", l = {}, m = "invokeSuspend")
final class ConversationViewModel$onInputChange$1 extends l implements p {
    final /* synthetic */ ComposerInputType $inputType;
    int label;
    final /* synthetic */ ConversationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationViewModel$onInputChange$1(ConversationViewModel conversationViewModel, ComposerInputType composerInputType, C6658d<? super ConversationViewModel$onInputChange$1> dVar) {
        super(2, dVar);
        this.this$0 = conversationViewModel;
        this.$inputType = composerInputType;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationViewModel$onInputChange$1(this.this$0, this.$inputType, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationViewModel$onInputChange$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            this.this$0.changeInputUseCase.invoke(this.this$0.clientState, this.$inputType);
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
