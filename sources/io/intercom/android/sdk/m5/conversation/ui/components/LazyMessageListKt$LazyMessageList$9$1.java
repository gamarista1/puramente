package io.intercom.android.sdk.m5.conversation.ui.components;

import D.A;
import Ef.m;
import Ug.K;
import Y.A1;
import Y.C1503n0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import yf.p;
import z.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$9$1", f = "LazyMessageList.kt", l = {116}, m = "invokeSuspend")
final class LazyMessageListKt$LazyMessageList$9$1 extends l implements p {
    final /* synthetic */ float $intercomBadgeOffset;
    final /* synthetic */ A1 $keyboardAsState$delegate;
    final /* synthetic */ C1503n0 $keyboardScrollOffset$delegate;
    final /* synthetic */ A $lazyListState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$9$1(float f10, A a10, A1 a12, C1503n0 n0Var, C6658d<? super LazyMessageListKt$LazyMessageList$9$1> dVar) {
        super(2, dVar);
        this.$intercomBadgeOffset = f10;
        this.$lazyListState = a10;
        this.$keyboardAsState$delegate = a12;
        this.$keyboardScrollOffset$delegate = n0Var;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$9$1(this.$intercomBadgeOffset, this.$lazyListState, this.$keyboardAsState$delegate, this.$keyboardScrollOffset$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((LazyMessageListKt$LazyMessageList$9$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$8(this.$keyboardAsState$delegate).isVisible() && !LazyMessageListKt.LazyMessageList$lambda$8(this.$keyboardAsState$delegate).isAnimating()) {
                LazyMessageListKt.LazyMessageList$lambda$11(this.$keyboardScrollOffset$delegate, m.c(((float) LazyMessageListKt.LazyMessageList$lambda$8(this.$keyboardAsState$delegate).getKeyboardHeight()) - this.$intercomBadgeOffset, 0.0f));
                A a10 = this.$lazyListState;
                float access$LazyMessageList$lambda$10 = LazyMessageListKt.LazyMessageList$lambda$10(this.$keyboardScrollOffset$delegate);
                this.label = 1;
                if (u.b(a10, access$LazyMessageList$lambda$10, (C2797i) null, this, 2, (Object) null) == f10) {
                    return f10;
                }
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
