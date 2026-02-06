package io.intercom.android.sdk.m5.conversation.ui;

import Ug.K;
import Xg.B;
import Xg.C5695g;
import Y.C1510r0;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6502A;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8", f = "ConversationScreen.kt", l = {164}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreen$8 extends l implements p {
    final /* synthetic */ ConversationViewModel $conversationViewModel;
    final /* synthetic */ C1510r0 $showUploadSizeLimitDialog$delegate;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreen$8(ConversationViewModel conversationViewModel, C1510r0 r0Var, C6658d<? super ConversationScreenKt$ConversationScreen$8> dVar) {
        super(2, dVar);
        this.$conversationViewModel = conversationViewModel;
        this.$showUploadSizeLimitDialog$delegate = r0Var;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreen$8(this.$conversationViewModel, this.$showUploadSizeLimitDialog$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreen$8) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            B uiEffect = this.$conversationViewModel.getUiEffect();
            final C1510r0 r0Var = this.$showUploadSizeLimitDialog$delegate;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(ConversationUiEffect conversationUiEffect, C6658d<? super C6514M> dVar) {
                    if (conversationUiEffect instanceof ConversationUiEffect.ShowUploadSizeLimitDialog) {
                        ConversationScreenKt.ConversationScreen$lambda$10(r0Var, C6502A.a(b.a(true), ((ConversationUiEffect.ShowUploadSizeLimitDialog) conversationUiEffect).getUploadSizeLimitMB()));
                        return C6514M.f71813a;
                    }
                    throw new C6535s();
                }
            };
            this.label = 1;
            if (uiEffect.collect(r12, this) == f10) {
                return f10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.b(obj);
        }
        throw new C6527k();
    }
}
