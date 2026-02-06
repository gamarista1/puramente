package io.intercom.android.sdk.m5.components;

import Ug.K;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
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
@f(c = "io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$1$3$1", f = "SearchBrowseCard.kt", l = {}, m = "invokeSuspend")
final class SearchBrowseCardKt$SearchBrowseCard$1$1$3$1 extends l implements p {
    final /* synthetic */ List<SuggestedArticle> $articleSuggestions;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(MetricTracker metricTracker, List<SuggestedArticle> list, C6658d<? super SearchBrowseCardKt$SearchBrowseCard$1$1$3$1> dVar) {
        super(2, dVar);
        this.$metricTracker = metricTracker;
        this.$articleSuggestions = list;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(this.$metricTracker, this.$articleSuggestions, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SearchBrowseCardKt$SearchBrowseCard$1$1$3$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            MetricTracker metricTracker = this.$metricTracker;
            Iterable<SuggestedArticle> iterable = this.$articleSuggestions;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (SuggestedArticle id2 : iterable) {
                arrayList.add(id2.getId());
            }
            metricTracker.viewedArticleSuggestions(arrayList);
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
