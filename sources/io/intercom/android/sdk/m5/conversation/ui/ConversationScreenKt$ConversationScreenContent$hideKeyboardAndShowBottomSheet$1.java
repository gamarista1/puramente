package io.intercom.android.sdk.m5.conversation.ui;

import Ug.K;
import Ug.V;
import Y.A1;
import Y.C1510r0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1", f = "ConversationScreen.kt", l = {400}, m = "invokeSuspend")
final class ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1 extends l implements p {
    final /* synthetic */ A1 $keyboardAsState$delegate;
    final /* synthetic */ C1510r0 $openBottomSheet;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(C1510r0 r0Var, A1 a12, C6658d<? super ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1> dVar) {
        super(2, dVar);
        this.$openBottomSheet = r0Var;
        this.$keyboardAsState$delegate = a12;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(this.$openBottomSheet, this.$keyboardAsState$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            if (ConversationScreenKt.ConversationScreenContent$lambda$71(this.$keyboardAsState$delegate).isVisible()) {
                this.label = 1;
                if (V.a(200, this) == f10) {
                    return f10;
                }
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$openBottomSheet.setValue(b.a(true));
        return C6514M.f71813a;
    }
}
