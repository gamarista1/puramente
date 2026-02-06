package io.intercom.android.sdk.utilities;

import U8.b;
import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.utilities.ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1", f = "ApplyStatusBarColor.kt", l = {}, m = "invokeSuspend")
final class ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1 extends l implements p {
    final /* synthetic */ boolean $darkContentEnabled;
    final /* synthetic */ b $systemUiController;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1(b bVar, boolean z10, C6658d<? super ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1> dVar) {
        super(2, dVar);
        this.$systemUiController = bVar;
        this.$darkContentEnabled = z10;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1(this.$systemUiController, this.$darkContentEnabled, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ApplyStatusBarColorKt$ApplyStatusBarContentColor$1$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            this.$systemUiController.c(this.$darkContentEnabled);
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
