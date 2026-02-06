package io.intercom.android.sdk.m5.conversation.ui.components;

import B.b;
import B.c;
import B.i;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.C1510r0;
import androidx.compose.foundation.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1", f = "MessageList.kt", l = {137}, m = "invokeSuspend")
final class MessageListKt$MessageList$10$1 extends l implements p {
    final /* synthetic */ C1510r0 $hasUserScrolled$delegate;
    final /* synthetic */ o $scrollState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$10$1(o oVar, C1510r0 r0Var, C6658d<? super MessageListKt$MessageList$10$1> dVar) {
        super(2, dVar);
        this.$scrollState = oVar;
        this.$hasUserScrolled$delegate = r0Var;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new MessageListKt$MessageList$10$1(this.$scrollState, this.$hasUserScrolled$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((MessageListKt$MessageList$10$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C5694f c10 = this.$scrollState.k().c();
            final o oVar = this.$scrollState;
            final C1510r0 r0Var = this.$hasUserScrolled$delegate;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(i iVar, C6658d<? super C6514M> dVar) {
                    if (iVar instanceof b) {
                        MessageListKt.MessageList$lambda$20(r0Var, true);
                    } else if ((iVar instanceof c) && MessageListKt.isAtBottom(oVar)) {
                        MessageListKt.MessageList$lambda$20(r0Var, false);
                    }
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (c10.collect(r12, this) == f10) {
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
