package io.intercom.android.sdk.helpcenter.search;

import Ug.K;
import Ug.V;
import Xg.x;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1", f = "ArticleSearchViewModel.kt", l = {183, 185}, m = "invokeSuspend")
final class ArticleSearchViewModel$addTeammateHelpRow$1 extends l implements p {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$addTeammateHelpRow$1(ArticleSearchViewModel articleSearchViewModel, C6658d<? super ArticleSearchViewModel$addTeammateHelpRow$1> dVar) {
        super(2, dVar);
        this.this$0 = articleSearchViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ArticleSearchViewModel$addTeammateHelpRow$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ArticleSearchViewModel$addTeammateHelpRow$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        x xVar;
        ArticleSearchState.Content content;
        Collection collection;
        ArticleSearchState articleSearchState;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            this.this$0.hasClickedAtLeastOneArticle = true;
            if (this.this$0.shouldAddSendMessageRow()) {
                articleSearchState = (ArticleSearchState) this.this$0._state.getValue();
                if (articleSearchState instanceof ArticleSearchState.Content) {
                    Iterable searchResults = ((ArticleSearchState.Content) articleSearchState).getSearchResults();
                    if (!(searchResults instanceof Collection) || !((Collection) searchResults).isEmpty()) {
                        Iterator it = searchResults.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    this.L$0 = articleSearchState;
                    this.label = 1;
                    if (V.a(2000, this) == f10) {
                        return f10;
                    }
                }
            }
            return C6514M.f71813a;
        } else if (i10 == 1) {
            articleSearchState = (ArticleSearchState) this.L$0;
            w.b(obj);
        } else if (i10 == 2) {
            collection = (Collection) this.L$2;
            content = (ArticleSearchState.Content) this.L$1;
            xVar = (x) this.L$0;
            w.b(obj);
            xVar.setValue(content.copy(C6565s.L0(collection, obj)));
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x access$get_state$p = this.this$0._state;
        content = (ArticleSearchState.Content) articleSearchState;
        Collection searchResults2 = content.getSearchResults();
        ArticleSearchViewModel articleSearchViewModel = this.this$0;
        this.L$0 = access$get_state$p;
        this.L$1 = content;
        this.L$2 = searchResults2;
        this.label = 2;
        Object access$teammateHelpRow = articleSearchViewModel.teammateHelpRow(this);
        if (access$teammateHelpRow == f10) {
            return f10;
        }
        collection = searchResults2;
        Object obj2 = access$teammateHelpRow;
        xVar = access$get_state$p;
        obj = obj2;
        xVar.setValue(content.copy(C6565s.L0(collection, obj)));
        return C6514M.f71813a;
    }
}
