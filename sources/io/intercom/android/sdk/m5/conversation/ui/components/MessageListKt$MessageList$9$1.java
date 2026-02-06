package io.intercom.android.sdk.m5.conversation.ui.components;

import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.C1510r0;
import Y.p1;
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
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$9$1", f = "MessageList.kt", l = {122}, m = "invokeSuspend")
final class MessageListKt$MessageList$9$1 extends l implements p {
    final /* synthetic */ C1510r0 $autoScrollEnabled$delegate;
    final /* synthetic */ C1510r0 $hasUserScrolled$delegate;
    final /* synthetic */ o $scrollState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$9$1(o oVar, C1510r0 r0Var, C1510r0 r0Var2, C6658d<? super MessageListKt$MessageList$9$1> dVar) {
        super(2, dVar);
        this.$scrollState = oVar;
        this.$autoScrollEnabled$delegate = r0Var;
        this.$hasUserScrolled$delegate = r0Var2;
    }

    /* access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(o oVar) {
        return oVar.n();
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new MessageListKt$MessageList$9$1(this.$scrollState, this.$autoScrollEnabled$delegate, this.$hasUserScrolled$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((MessageListKt$MessageList$9$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C5694f p10 = p1.p(new w0(this.$scrollState));
            final o oVar = this.$scrollState;
            final C1510r0 r0Var = this.$autoScrollEnabled$delegate;
            final C1510r0 r0Var2 = this.$hasUserScrolled$delegate;
            AnonymousClass2 r12 = new C5695g() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                    return emit(((Number) obj).intValue(), (C6658d<? super C6514M>) dVar);
                }

                public final Object emit(int i10, C6658d<? super C6514M> dVar) {
                    MessageListKt.MessageList$lambda$17(r0Var, i10 == oVar.m());
                    if (MessageListKt.MessageList$lambda$19(r0Var2) && i10 == oVar.m()) {
                        MessageListKt.MessageList$lambda$20(r0Var2, false);
                    }
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (p10.collect(r12, this) == f10) {
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
