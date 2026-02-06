package io.intercom.android.sdk.ui.preview.ui;

import G.C;
import Ug.K;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$1$5$1", f = "PreviewRootScreen.kt", l = {136}, m = "invokeSuspend")
final class PreviewRootScreenKt$PreviewRootScreen$2$1$5$1 extends l implements p {
    final /* synthetic */ int $it;
    final /* synthetic */ C $pagerState;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(C c10, int i10, C6658d<? super PreviewRootScreenKt$PreviewRootScreen$2$1$5$1> dVar) {
        super(2, dVar);
        this.$pagerState = c10;
        this.$it = i10;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(this.$pagerState, this.$it, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((PreviewRootScreenKt$PreviewRootScreen$2$1$5$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C c10 = this.$pagerState;
            int i11 = this.$it;
            this.label = 1;
            if (C.n(c10, i11, 0.0f, (C2797i) null, this, 6, (Object) null) == f10) {
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
