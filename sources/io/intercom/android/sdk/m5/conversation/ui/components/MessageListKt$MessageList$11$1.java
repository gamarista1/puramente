package io.intercom.android.sdk.m5.conversation.ui.components;

import Ug.K;
import Y.A1;
import Y.C1510r0;
import androidx.compose.foundation.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import q0.C2427m;
import qf.C6658d;
import rf.C6680b;
import yf.p;
import z.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1", f = "MessageList.kt", l = {159, 161, 167}, m = "invokeSuspend")
final class MessageListKt$MessageList$11$1 extends l implements p {
    final /* synthetic */ C1510r0 $autoScrollEnabled$delegate;
    final /* synthetic */ C1510r0 $currentBounds$delegate;
    final /* synthetic */ C1510r0 $hasUserScrolled$delegate;
    final /* synthetic */ A1 $keyboardAsState$delegate;
    final /* synthetic */ C1510r0 $oldBounds$delegate;
    final /* synthetic */ o $scrollState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$11$1(o oVar, C1510r0 r0Var, C1510r0 r0Var2, A1 a12, C1510r0 r0Var3, C1510r0 r0Var4, C6658d<? super MessageListKt$MessageList$11$1> dVar) {
        super(2, dVar);
        this.$scrollState = oVar;
        this.$oldBounds$delegate = r0Var;
        this.$currentBounds$delegate = r0Var2;
        this.$keyboardAsState$delegate = a12;
        this.$hasUserScrolled$delegate = r0Var3;
        this.$autoScrollEnabled$delegate = r0Var4;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new MessageListKt$MessageList$11$1(this.$scrollState, this.$oldBounds$delegate, this.$currentBounds$delegate, this.$keyboardAsState$delegate, this.$hasUserScrolled$delegate, this.$autoScrollEnabled$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((MessageListKt$MessageList$11$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            if (!MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).isZero() && !MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).isZero() && !C6496s.c(MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).getBoundsInParent(), MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).getBoundsInParent())) {
                float e10 = MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).getBoundsInParent().e() - MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).getBoundsInParent().e();
                if (e10 > 0.0f) {
                    o oVar = this.$scrollState;
                    this.label = 1;
                    if (u.c(oVar, e10, this) == f10) {
                        return f10;
                    }
                } else if (MessageListKt.MessageList$lambda$8(this.$keyboardAsState$delegate).isAnimating() && MessageListKt.MessageList$lambda$19(this.$hasUserScrolled$delegate)) {
                    o oVar2 = this.$scrollState;
                    this.label = 2;
                    if (u.c(oVar2, e10, this) == f10) {
                        return f10;
                    }
                }
            } else if (!C2427m.h(MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).m256getSizeNHjbRc(), MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).m256getSizeNHjbRc()) && MessageListKt.MessageList$lambda$16(this.$autoScrollEnabled$delegate) && !MessageListKt.MessageList$lambda$19(this.$hasUserScrolled$delegate)) {
                float i11 = C2427m.i(MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).m256getSizeNHjbRc()) - C2427m.i(MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).m256getSizeNHjbRc());
                if (i11 > 0.0f) {
                    o oVar3 = this.$scrollState;
                    this.label = 3;
                    if (u.c(oVar3, i11, this) == f10) {
                        return f10;
                    }
                }
            }
        } else if (i10 == 1 || i10 == 2 || i10 == 3) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MessageListKt.MessageList$lambda$11(this.$oldBounds$delegate, MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate));
        return C6514M.f71813a;
    }
}
