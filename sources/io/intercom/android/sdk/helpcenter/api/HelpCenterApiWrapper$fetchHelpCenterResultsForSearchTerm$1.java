package io.intercom.android.sdk.helpcenter.api;

import Ug.C5572i;
import Ug.I0;
import Ug.K;
import Ug.Z;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1", f = "HelpCenterApiWrapper.kt", l = {59, 60}, m = "invokeSuspend")
final class HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1 extends l implements p {
    final /* synthetic */ MetricTracker $metricTracker;
    final /* synthetic */ SearchRequestCallback $searchRequestCallback;
    final /* synthetic */ String $searchTerm;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(networkResponse, metricTracker, searchRequestCallback, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                NetworkResponse<List<HelpCenterArticleSearchResponse>> networkResponse = networkResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.SEARCH_RESULTS, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    searchRequestCallback.onError(((NetworkResponse.ServerError) networkResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.SEARCH_RESULTS, (String) null, false);
                    searchRequestCallback.onFailure();
                } else if (networkResponse instanceof NetworkResponse.Success) {
                    searchRequestCallback.onComplete(HelpCenterApiWrapper.INSTANCE.transformSearchResponse((List) ((NetworkResponse.Success) networkResponse).getBody()));
                } else {
                    throw new C6535s();
                }
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1(MetricTracker metricTracker, String str, SearchRequestCallback searchRequestCallback, C6658d<? super HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1> dVar) {
        super(2, dVar);
        this.$metricTracker = metricTracker;
        this.$searchTerm = str;
        this.$searchRequestCallback = searchRequestCallback;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1(this.$metricTracker, this.$searchTerm, this.$searchRequestCallback, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.SEARCH_RESULTS);
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            String str = this.$searchTerm;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.searchForArticles$default(helpCenterApi, str, (String) null, (Map) null, this, 6, (Object) null);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else if (i10 == 2) {
            w.b(obj);
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final NetworkResponse networkResponse = (NetworkResponse) obj;
        I0 c10 = Z.c();
        final MetricTracker metricTracker = this.$metricTracker;
        final SearchRequestCallback searchRequestCallback = this.$searchRequestCallback;
        AnonymousClass1 r32 = new AnonymousClass1((C6658d<? super AnonymousClass1>) null);
        this.label = 2;
        if (C5572i.g(c10, r32, this) == f10) {
            return f10;
        }
        return C6514M.f71813a;
    }
}
