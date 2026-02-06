package io.intercom.android.sdk.helpcenter.search;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {226}, m = "transformToUiModel")
final class ArticleSearchViewModel$transformToUiModel$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$transformToUiModel$1(ArticleSearchViewModel articleSearchViewModel, C6658d<? super ArticleSearchViewModel$transformToUiModel$1> dVar) {
        super(dVar);
        this.this$0 = articleSearchViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.transformToUiModel((List<HelpCenterArticleSearchResponse>) null, this);
    }
}
