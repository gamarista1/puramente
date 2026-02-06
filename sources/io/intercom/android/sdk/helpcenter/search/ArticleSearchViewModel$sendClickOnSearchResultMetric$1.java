package io.intercom.android.sdk.helpcenter.search;

import Ug.K;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1", f = "ArticleSearchViewModel.kt", l = {}, m = "invokeSuspend")
final class ArticleSearchViewModel$sendClickOnSearchResultMetric$1 extends l implements p {
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$sendClickOnSearchResultMetric$1(ArticleSearchViewModel articleSearchViewModel, C6658d<? super ArticleSearchViewModel$sendClickOnSearchResultMetric$1> dVar) {
        super(2, dVar);
        this.this$0 = articleSearchViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ArticleSearchViewModel$sendClickOnSearchResultMetric$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ArticleSearchViewModel$sendClickOnSearchResultMetric$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            if (this.this$0._state.getValue() instanceof ArticleSearchState.Content) {
                this.this$0.metricTracker.openedNativeHelpCenterSearchResult(this.this$0.isFromSearchBrowse, this.this$0.lastSearchedInput);
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
