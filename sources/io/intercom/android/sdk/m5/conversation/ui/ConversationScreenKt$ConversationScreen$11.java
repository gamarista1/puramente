package io.intercom.android.sdk.m5.conversation.ui;

import Ug.K;
import V.K0;
import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11", f = "ConversationScreen.kt", l = {200}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreen$11 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ ConversationUiState $conversationUiState;
    final /* synthetic */ ConversationViewModel $conversationViewModel;
    final /* synthetic */ K0 $snackbarHostState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreen$11(ConversationUiState conversationUiState, K0 k02, Context context, ConversationViewModel conversationViewModel, C6658d<? super ConversationScreenKt$ConversationScreen$11> dVar) {
        super(2, dVar);
        this.$conversationUiState = conversationUiState;
        this.$snackbarHostState = k02;
        this.$context = context;
        this.$conversationViewModel = conversationViewModel;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(ConversationViewModel conversationViewModel) {
        conversationViewModel.onNetworkMessageDismissed();
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreen$11(this.$conversationUiState, this.$snackbarHostState, this.$context, this.$conversationViewModel, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreen$11) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            NetworkState networkState = ((ConversationUiState.Content) this.$conversationUiState).getNetworkState();
            K0 k02 = this.$snackbarHostState;
            Context context = this.$context;
            r0 r0Var = new r0(this.$conversationViewModel);
            this.label = 1;
            if (ConversationScreenKt.showNetworkMessage(networkState, k02, context, r0Var, this) == f10) {
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
