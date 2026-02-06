package io.intercom.android.sdk.m5.conversation.ui;

import C.C1088f;
import Ug.K;
import androidx.compose.foundation.o;
import c1.d;
import c1.h;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$4$1$2$2", f = "ConversationScreen.kt", l = {694, 699}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$31$4$1$2$2 extends l implements p {
    final /* synthetic */ d $density;
    final /* synthetic */ o $scrollState;
    final /* synthetic */ C1088f $this_BoxWithConstraints;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$31$4$1$2$2(ConversationUiState conversationUiState, o oVar, C1088f fVar, d dVar, C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$2$2> dVar2) {
        super(2, dVar2);
        this.$uiState = conversationUiState;
        this.$scrollState = oVar;
        this.$this_BoxWithConstraints = fVar;
        this.$density = dVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$4$1$2$2(this.$uiState, this.$scrollState, this.$this_BoxWithConstraints, this.$density, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$4$1$2$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            int scrollToPosition = ((FloatingIndicatorState.JumpToBottomIndicator) ((ConversationUiState.Content) this.$uiState).getFloatingIndicatorState()).getJumpToBottomButtonState().getScrollToPosition();
            o oVar = this.$scrollState;
            C1088f fVar = this.$this_BoxWithConstraints;
            d dVar = this.$density;
            if (scrollToPosition == -1) {
                int m10 = oVar.m();
                this.label = 1;
                obj = oVar.o(m10, this);
                if (obj == f10) {
                    return f10;
                }
            } else {
                this.label = 2;
                obj = oVar.o(scrollToPosition + dVar.E0(h.j(h.j(fVar.g() - MessageComposerKt.getComposerHalfSize()) - ConversationScreenKt.JumpToBottomNewMessagesTopOffset)), this);
                if (obj == f10) {
                    return f10;
                }
                ((Number) obj).floatValue();
                return C6514M.f71813a;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else if (i10 == 2) {
            w.b(obj);
            ((Number) obj).floatValue();
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((Number) obj).floatValue();
        return C6514M.f71813a;
    }
}
