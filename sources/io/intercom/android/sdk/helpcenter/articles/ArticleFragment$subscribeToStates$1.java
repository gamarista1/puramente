package io.intercom.android.sdk.helpcenter.articles;

import Ug.K;
import Xg.C5695g;
import Xg.L;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleFragment$subscribeToStates$1", f = "ArticleFragment.kt", l = {60}, m = "invokeSuspend")
final class ArticleFragment$subscribeToStates$1 extends l implements p {
    int label;
    final /* synthetic */ ArticleFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleFragment$subscribeToStates$1(ArticleFragment articleFragment, C6658d<? super ArticleFragment$subscribeToStates$1> dVar) {
        super(2, dVar);
        this.this$0 = articleFragment;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ArticleFragment$subscribeToStates$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ArticleFragment$subscribeToStates$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            L state = this.this$0.getViewModel().getState();
            final ArticleFragment articleFragment = this.this$0;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(ArticleViewState articleViewState, C6658d<? super C6514M> dVar) {
                    if (!C6496s.c(articleViewState, ArticleViewState.Initial.INSTANCE)) {
                        if (articleViewState instanceof ArticleViewState.Content) {
                            articleFragment.renderContent((ArticleViewState.Content) articleViewState);
                        } else if (articleViewState instanceof ArticleViewState.Error) {
                            articleFragment.renderErrors((ArticleViewState.Error) articleViewState);
                        } else {
                            throw new C6535s();
                        }
                    }
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (state.collect(r12, this) == f10) {
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
