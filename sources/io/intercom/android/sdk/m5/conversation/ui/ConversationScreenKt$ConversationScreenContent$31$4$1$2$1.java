package io.intercom.android.sdk.m5.conversation.ui;

import D.A;
import D.k;
import Ug.K;
import c1.d;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$4$1$2$1", f = "ConversationScreen.kt", l = {681, 684}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$31$4$1$2$1 extends l implements p {
    final /* synthetic */ d $density;
    final /* synthetic */ A $lazyListState;
    final /* synthetic */ p $onJumpToBottomButtonClicked;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$31$4$1$2$1(ConversationUiState conversationUiState, A a10, d dVar, p pVar, C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$2$1> dVar2) {
        super(2, dVar2);
        this.$uiState = conversationUiState;
        this.$lazyListState = a10;
        this.$density = dVar;
        this.$onJumpToBottomButtonClicked = pVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$4$1$2$1(this.$uiState, this.$lazyListState, this.$density, this.$onJumpToBottomButtonClicked, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$4$1$2$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        Object f10 = C6680b.f();
        int i12 = this.label;
        if (i12 == 0) {
            w.b(obj);
            Iterator<ContentRow> it = ((ConversationUiState.Content) this.$uiState).getContentRows().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (Sg.p.J(it.next().getKey(), ConversationUiStateKt.NewMessagesRowKey, false, 2, (Object) null)) {
                    break;
                } else {
                    i13++;
                }
            }
            int lastSeenItemIndex = ((FloatingIndicatorState.JumpToBottomIndicator) ((ConversationUiState.Content) this.$uiState).getFloatingIndicatorState()).getJumpToBottomButtonState().getLastSeenItemIndex();
            k kVar = (k) C6565s.B0(this.$lazyListState.x().k());
            if (kVar != null) {
                i11 = kVar.getIndex();
            } else {
                i11 = 0;
            }
            int E02 = this.$density.E0(ConversationScreenKt.JumpToBottomNewMessagesTopOffset);
            if (i13 > lastSeenItemIndex) {
                this.label = 1;
                if (this.$lazyListState.l(i13, -E02, this) == f10) {
                    return f10;
                }
            } else {
                int max = Math.max(lastSeenItemIndex, i11);
                this.label = 2;
                if (this.$lazyListState.l(max + 1, -E02, this) == f10) {
                    return f10;
                }
            }
        } else if (i12 == 1 || i12 == 2) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar2 = (k) C6565s.B0(this.$lazyListState.x().k());
        if (kVar2 != null) {
            i10 = kVar2.getIndex();
        } else {
            i10 = 0;
        }
        this.$onJumpToBottomButtonClicked.invoke(b.c(0), b.c(i10));
        return C6514M.f71813a;
    }
}
