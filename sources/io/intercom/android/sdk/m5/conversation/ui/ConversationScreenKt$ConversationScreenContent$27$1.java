package io.intercom.android.sdk.m5.conversation.ui;

import Ug.K;
import androidx.compose.foundation.o;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$27$1", f = "ConversationScreen.kt", l = {}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$27$1 extends l implements p {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $jumToBottomScrollOffset;
    final /* synthetic */ C6798l $onConversationScrolled;
    final /* synthetic */ o $scrollState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$27$1(o oVar, float f10, C6798l lVar, boolean z10, boolean z11, C6658d<? super ConversationScreenKt$ConversationScreenContent$27$1> dVar) {
        super(2, dVar);
        this.$scrollState = oVar;
        this.$jumToBottomScrollOffset = f10;
        this.$onConversationScrolled = lVar;
        this.$isLandscape = z10;
        this.$isLargeFont = z11;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$27$1(this.$scrollState, this.$jumToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$27$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            if (((float) (this.$scrollState.m() - this.$scrollState.n())) > this.$jumToBottomScrollOffset) {
                this.$onConversationScrolled.invoke(new ConversationScrolledState(true, this.$scrollState.m(), this.$isLandscape, this.$isLargeFont, 0));
            } else {
                this.$onConversationScrolled.invoke(new ConversationScrolledState(false, this.$scrollState.m(), this.$isLandscape, this.$isLargeFont, 0));
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
