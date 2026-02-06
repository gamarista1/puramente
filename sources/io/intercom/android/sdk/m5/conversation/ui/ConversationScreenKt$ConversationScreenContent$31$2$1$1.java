package io.intercom.android.sdk.m5.conversation.ui;

import Ug.K;
import androidx.compose.foundation.o;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;
import z.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$2$1$1", f = "ConversationScreen.kt", l = {575}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$31$2$1$1 extends l implements p {
    final /* synthetic */ String $message;
    final /* synthetic */ p $onSendMessage;
    final /* synthetic */ o $scrollState;
    final /* synthetic */ TextInputSource $textInputSource;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$31$2$1$1(o oVar, p pVar, String str, TextInputSource textInputSource, C6658d<? super ConversationScreenKt$ConversationScreenContent$31$2$1$1> dVar) {
        super(2, dVar);
        this.$scrollState = oVar;
        this.$onSendMessage = pVar;
        this.$message = str;
        this.$textInputSource = textInputSource;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$2$1$1(this.$scrollState, this.$onSendMessage, this.$message, this.$textInputSource, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$2$1$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            o oVar = this.$scrollState;
            this.label = 1;
            if (u.c(oVar, Float.MAX_VALUE, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$onSendMessage.invoke(this.$message, this.$textInputSource);
        return C6514M.f71813a;
    }
}
