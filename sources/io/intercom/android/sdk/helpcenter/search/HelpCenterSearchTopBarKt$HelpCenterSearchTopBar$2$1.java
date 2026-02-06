package io.intercom.android.sdk.helpcenter.search;

import Ug.K;
import androidx.compose.ui.focus.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1", f = "HelpCenterSearchTopBar.kt", l = {}, m = "invokeSuspend")
final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1 extends l implements p {
    final /* synthetic */ o $focusRequester;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1(o oVar, C6658d<? super HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1> dVar) {
        super(2, dVar);
        this.$focusRequester = oVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1(this.$focusRequester, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            this.$focusRequester.f();
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
