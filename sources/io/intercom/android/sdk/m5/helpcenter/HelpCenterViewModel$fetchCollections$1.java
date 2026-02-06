package io.intercom.android.sdk.m5.helpcenter;

import Ug.K;
import Xg.x;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1", f = "HelpCenterViewModel.kt", l = {126, 165, 175, 198}, m = "invokeSuspend")
final class HelpCenterViewModel$fetchCollections$1 extends l implements p {
    final /* synthetic */ Set<String> $collectionIds;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$fetchCollections$1(HelpCenterViewModel helpCenterViewModel, Set<String> set, C6658d<? super HelpCenterViewModel$fetchCollections$1> dVar) {
        super(2, dVar);
        this.this$0 = helpCenterViewModel;
        this.$collectionIds = set;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, Set set) {
        helpCenterViewModel.fetchCollections(set);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterViewModel$fetchCollections$1(this.this$0, this.$collectionIds, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterViewModel$fetchCollections$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        x xVar;
        List list;
        List list2;
        List list3;
        boolean z10;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            if (this.this$0.getCollectionsState().getValue() instanceof CollectionsUiState.Content) {
                return C6514M.f71813a;
            }
            this.this$0._collectionsState.setValue(CollectionsUiState.Loading.INSTANCE);
            HelpCenterApi access$getHelpCenterApi$p = this.this$0.helpCenterApi;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollections$default(access$getHelpCenterApi$p, (Map) null, this, 1, (Object) null);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else if (i10 == 2) {
            x xVar2 = (x) this.L$0;
            w.b(obj);
            return C6514M.f71813a;
        } else if (i10 == 3) {
            x xVar3 = (x) this.L$0;
            w.b(obj);
            return C6514M.f71813a;
        } else if (i10 == 4) {
            list3 = (List) this.L$2;
            xVar = (x) this.L$1;
            list2 = (List) this.L$0;
            w.b(obj);
            list3.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
            list = list2;
            obj2 = new CollectionsUiState.Content(list);
            xVar.setValue(obj2);
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        xVar = this.this$0._collectionsState;
        if (networkResponse instanceof NetworkResponse.ServerError) {
            NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
            this.this$0.sendFailedCollectionListMetric(b.c(serverError.getCode()));
            if (serverError.getCode() == 404) {
                obj2 = new CollectionsUiState.Error(this.this$0.notFoundError);
            } else {
                obj2 = new CollectionsUiState.Error(this.this$0.genericError);
            }
        } else if (networkResponse instanceof NetworkResponse.ClientError) {
            HelpCenterViewModel.sendFailedCollectionListMetric$default(this.this$0, (Integer) null, 1, (Object) null);
            obj2 = new CollectionsUiState.Error(this.this$0.genericError);
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            HelpCenterViewModel.sendFailedCollectionListMetric$default(this.this$0, (Integer) null, 1, (Object) null);
            HelpCenterViewModel helpCenterViewModel = this.this$0;
            obj2 = new CollectionsUiState.Error(helpCenterViewModel.errorWithRetry(new c(helpCenterViewModel, this.$collectionIds)));
        } else if (networkResponse instanceof NetworkResponse.Success) {
            List list4 = (List) ((NetworkResponse.Success) networkResponse).getBody();
            Set<String> set = this.$collectionIds;
            ArrayList arrayList = new ArrayList();
            for (Object next : list4) {
                if (set.contains(((HelpCenterCollection) next).getId())) {
                    arrayList.add(next);
                }
            }
            HelpCenterViewModel helpCenterViewModel2 = this.this$0;
            if (arrayList.size() >= list4.size() || arrayList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            helpCenterViewModel2.isPartialHelpCenterLoaded = z10;
            this.this$0.metricTracker.viewedNativeHelpCenter(MetricTracker.Place.COLLECTION_LIST, b.a(this.this$0.isPartialHelpCenterLoaded), this.this$0.isFromSearchBrowse());
            if (arrayList.size() == 1) {
                Xg.w access$get_effect$p = this.this$0._effect;
                CollectionsUiEffects.NavigateToCollectionContent navigateToCollectionContent = new CollectionsUiEffects.NavigateToCollectionContent(((HelpCenterCollection) C6565s.o0(arrayList)).getId());
                this.L$0 = xVar;
                this.label = 2;
                if (access$get_effect$p.emit(navigateToCollectionContent, this) == f10) {
                    return f10;
                }
                return C6514M.f71813a;
            } else if (list4.size() == 1) {
                Xg.w access$get_effect$p2 = this.this$0._effect;
                CollectionsUiEffects.NavigateToCollectionContent navigateToCollectionContent2 = new CollectionsUiEffects.NavigateToCollectionContent(((HelpCenterCollection) C6565s.o0(list4)).getId());
                this.L$0 = xVar;
                this.label = 3;
                if (access$get_effect$p2.emit(navigateToCollectionContent2, this) == f10) {
                    return f10;
                }
                return C6514M.f71813a;
            } else {
                boolean isEmpty = arrayList.isEmpty();
                if (!arrayList.isEmpty()) {
                    list4 = arrayList;
                }
                if (!list4.isEmpty()) {
                    list = C6565s.h1(this.this$0.transformToUiModel((List<HelpCenterCollection>) list4));
                    if (!isEmpty) {
                        list.add(CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE);
                    } else if (this.this$0.isPartialHelpCenterLoaded) {
                        list.add(CollectionsRow.FullHelpCenterRow.INSTANCE);
                    }
                    if (this.this$0.shouldAddSendMessageRow()) {
                        HelpCenterViewModel helpCenterViewModel3 = this.this$0;
                        this.L$0 = list;
                        this.L$1 = xVar;
                        this.L$2 = list;
                        this.label = 4;
                        Object access$getCtaData = helpCenterViewModel3.getCtaData(this);
                        if (access$getCtaData == f10) {
                            return f10;
                        }
                        list3 = list;
                        obj = access$getCtaData;
                        list2 = list3;
                        list3.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                        list = list2;
                    }
                    obj2 = new CollectionsUiState.Content(list);
                } else {
                    obj2 = new CollectionsUiState.Error(this.this$0.genericError);
                }
            }
        } else {
            throw new C6535s();
        }
        xVar.setValue(obj2);
        return C6514M.f71813a;
    }
}
