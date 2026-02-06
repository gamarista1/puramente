package io.intercom.android.sdk.m5.conversation.ui;

import D.A;
import Ug.K;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$4$1$3$1", f = "ConversationScreen.kt", l = {738}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$31$4$1$3$1 extends l implements p {
    final /* synthetic */ A $lazyListState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$31$4$1$3$1(A a10, C6658d<? super ConversationScreenKt$ConversationScreenContent$31$4$1$3$1> dVar) {
        super(2, dVar);
        this.$lazyListState = a10;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$4$1$3$1(this.$lazyListState, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$4$1$3$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            A a10 = this.$lazyListState;
            this.label = 1;
            if (A.m(a10, a.e.API_PRIORITY_OTHER, 0, this, 2, (Object) null) == f10) {
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
