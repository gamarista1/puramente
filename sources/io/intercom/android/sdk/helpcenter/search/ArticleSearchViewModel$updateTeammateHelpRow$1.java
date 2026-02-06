package io.intercom.android.sdk.helpcenter.search;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {152}, m = "updateTeammateHelpRow")
final class ArticleSearchViewModel$updateTeammateHelpRow$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$updateTeammateHelpRow$1(ArticleSearchViewModel articleSearchViewModel, C6658d<? super ArticleSearchViewModel$updateTeammateHelpRow$1> dVar) {
        super(dVar);
        this.this$0 = articleSearchViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateTeammateHelpRow(this);
    }
}
