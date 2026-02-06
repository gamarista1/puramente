package io.intercom.android.sdk.helpcenter.api;

import Ug.C5572i;
import Ug.I0;
import Ug.K;
import Ug.Z;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
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
@f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1", f = "HelpCenterApiWrapper.kt", l = {23, 24}, m = "invokeSuspend")
final class HelpCenterApiWrapper$fetchHelpCenterCollections$1 extends l implements p {
    final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(networkResponse, metricTracker, collectionRequestCallback, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                NetworkResponse<List<HelpCenterCollection>> networkResponse = networkResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    collectionRequestCallback.onError(((NetworkResponse.ServerError) networkResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, (String) null, false);
                    collectionRequestCallback.onFailure();
                } else if (networkResponse instanceof NetworkResponse.Success) {
                    collectionRequestCallback.onComplete((List) ((NetworkResponse.Success) networkResponse).getBody());
                } else {
                    throw new C6535s();
                }
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterApiWrapper$fetchHelpCenterCollections$1(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, C6658d<? super HelpCenterApiWrapper$fetchHelpCenterCollections$1> dVar) {
        super(2, dVar);
        this.$metricTracker = metricTracker;
        this.$collectionRequestCallback = collectionRequestCallback;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterApiWrapper$fetchHelpCenterCollections$1(this.$metricTracker, this.$collectionRequestCallback, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterApiWrapper$fetchHelpCenterCollections$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            this.$metricTracker.requestedHelpCenterData(MetricTracker.Place.COLLECTION_LIST);
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollections$default(helpCenterApi, (Map) null, this, 1, (Object) null);
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
        final CollectionRequestCallback collectionRequestCallback = this.$collectionRequestCallback;
        AnonymousClass1 r42 = new AnonymousClass1((C6658d<? super AnonymousClass1>) null);
        this.label = 2;
        if (C5572i.g(c10, r42, this) == f10) {
            return f10;
        }
        return C6514M.f71813a;
    }
}
