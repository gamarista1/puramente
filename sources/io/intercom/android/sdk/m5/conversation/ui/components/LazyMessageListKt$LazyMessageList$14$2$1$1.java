package io.intercom.android.sdk.m5.conversation.ui.components;

import D.A;
import Ug.K;
import Y.C1505o0;
import Y.C1510r0;
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
@f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$1$1", f = "LazyMessageList.kt", l = {259}, m = "invokeSuspend")
final class LazyMessageListKt$LazyMessageList$14$2$1$1 extends l implements p {
    final /* synthetic */ C1505o0 $firstVisibleItemIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ C1510r0 $isListAtTheBottom$delegate;
    final /* synthetic */ A $lazyListState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$14$2$1$1(int i10, A a10, C1510r0 r0Var, C1505o0 o0Var, C6658d<? super LazyMessageListKt$LazyMessageList$14$2$1$1> dVar) {
        super(2, dVar);
        this.$index = i10;
        this.$lazyListState = a10;
        this.$isListAtTheBottom$delegate = r0Var;
        this.$firstVisibleItemIndex$delegate = o0Var;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$14$2$1$1(this.$index, this.$lazyListState, this.$isListAtTheBottom$delegate, this.$firstVisibleItemIndex$delegate, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((LazyMessageListKt$LazyMessageList$14$2$1$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$17(this.$isListAtTheBottom$delegate) && LazyMessageListKt.LazyMessageList$lambda$14(this.$firstVisibleItemIndex$delegate) < this.$index) {
                A a10 = this.$lazyListState;
                this.label = 1;
                if (A.m(a10, a.e.API_PRIORITY_OTHER, 0, this, 2, (Object) null) == f10) {
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
