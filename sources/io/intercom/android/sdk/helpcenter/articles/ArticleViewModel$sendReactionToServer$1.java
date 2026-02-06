package io.intercom.android.sdk.helpcenter.articles;

import Ug.K;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1", f = "ArticleViewModel.kt", l = {255}, m = "invokeSuspend")
final class ArticleViewModel$sendReactionToServer$1 extends l implements p {
    final /* synthetic */ String $articleContentId;
    final /* synthetic */ String $articleId;
    final /* synthetic */ int $reactionIndex;
    int label;
    final /* synthetic */ ArticleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleViewModel$sendReactionToServer$1(ArticleViewModel articleViewModel, String str, int i10, String str2, C6658d<? super ArticleViewModel$sendReactionToServer$1> dVar) {
        super(2, dVar);
        this.this$0 = articleViewModel;
        this.$articleId = str;
        this.$reactionIndex = i10;
        this.$articleContentId = str2;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ArticleViewModel$sendReactionToServer$1(this.this$0, this.$articleId, this.$reactionIndex, this.$articleContentId, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ArticleViewModel$sendReactionToServer$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            HelpCenterApi access$getHelpCenterApi$p = this.this$0.helpCenterApi;
            String str2 = this.$articleId;
            int i11 = this.$reactionIndex;
            String str3 = this.$articleContentId;
            if (this.this$0.isFromSearchBrowse) {
                str = "search_browse";
            } else {
                str = null;
            }
            String str4 = str;
            this.label = 1;
            if (HelpCenterApi.DefaultImpls.reactToArticle$default(access$getHelpCenterApi$p, str2, i11, str3, false, str4, (Map) null, this, 40, (Object) null) == f10) {
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
