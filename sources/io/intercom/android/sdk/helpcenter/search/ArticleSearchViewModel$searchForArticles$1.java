package io.intercom.android.sdk.helpcenter.search;

import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
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
@f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1", f = "ArticleSearchViewModel.kt", l = {136}, m = "invokeSuspend")
final class ArticleSearchViewModel$searchForArticles$1 extends l implements p {
    final /* synthetic */ C5694f $textChanged;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXg/g;", "", "Llf/M;", "<anonymous>", "(LXg/g;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1", f = "ArticleSearchViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(articleSearchViewModel, dVar);
        }

        public final Object invoke(C5695g gVar, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                articleSearchViewModel.metricTracker.searchedNativeHelpCenter(articleSearchViewModel.isFromSearchBrowse);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$searchForArticles$1(C5694f fVar, ArticleSearchViewModel articleSearchViewModel, C6658d<? super ArticleSearchViewModel$searchForArticles$1> dVar) {
        super(2, dVar);
        this.$textChanged = fVar;
        this.this$0 = articleSearchViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new ArticleSearchViewModel$searchForArticles$1(this.$textChanged, this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((ArticleSearchViewModel$searchForArticles$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            C5694f l10 = C5696h.l(this.$textChanged, 400);
            final ArticleSearchViewModel articleSearchViewModel = this.this$0;
            C5694f H10 = C5696h.H(l10, new AnonymousClass1((C6658d<? super AnonymousClass1>) null));
            final ArticleSearchViewModel articleSearchViewModel2 = this.this$0;
            AnonymousClass2 r12 = new C5695g() {
                public final Object emit(String str, C6658d<? super C6514M> dVar) {
                    if (str.length() == 0) {
                        articleSearchViewModel2._state.setValue(ArticleSearchState.Initial.INSTANCE);
                        return C6514M.f71813a;
                    }
                    articleSearchViewModel2._state.setValue(ArticleSearchState.Loading.INSTANCE);
                    Object emit = articleSearchViewModel2.searchInput.emit(str, dVar);
                    return emit == C6680b.f() ? emit : C6514M.f71813a;
                }
            };
            this.label = 1;
            if (H10.collect(r12, this) == f10) {
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
