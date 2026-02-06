package io.intercom.android.sdk.helpcenter.search;

import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "LXg/g;", "it", "Llf/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ArticleSearchViewModel.kt", l = {216, 189}, m = "invokeSuspend")
public final class ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends l implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(C6658d dVar, ArticleSearchViewModel articleSearchViewModel) {
        super(3, dVar);
        this.this$0 = articleSearchViewModel;
    }

    public final Object invoke(C5695g gVar, String str, C6658d<? super C6514M> dVar) {
        ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(dVar, this.this$0);
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = gVar;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C5695g gVar;
        String str;
        String str2;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C5695g gVar2 = (C5695g) this.L$0;
            str = (String) this.L$1;
            HelpCenterApi access$getHelpCenterApi$p = this.this$0.helpCenterApi;
            if (this.this$0.isFromSearchBrowse) {
                str2 = "search_browse";
            } else {
                str2 = null;
            }
            this.L$0 = gVar2;
            this.L$1 = str;
            this.label = 1;
            Object searchForArticles$default = HelpCenterApi.DefaultImpls.searchForArticles$default(access$getHelpCenterApi$p, str, str2, (Map) null, this, 4, (Object) null);
            if (searchForArticles$default == f10) {
                return f10;
            }
            Object obj2 = searchForArticles$default;
            gVar = gVar2;
            obj = obj2;
        } else if (i10 == 1) {
            str = (String) this.L$1;
            gVar = (C5695g) this.L$0;
            w.b(obj);
        } else if (i10 == 2) {
            w.b(obj);
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C5694f A10 = C5696h.A(new Pair(obj, str));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (C5696h.r(gVar, A10, this) == f10) {
            return f10;
        }
        return C6514M.f71813a;
    }
}
