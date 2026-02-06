package io.intercom.android.sdk.helpcenter.api;

import Sg.p;
import Ug.C5585o0;
import Ug.C5600w0;
import Ug.M;
import Ug.Z;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import qf.C6658d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterApiWrapper;", "", "<init>", "()V", "", "removeHighlightTags", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "collectionRequestCallback", "Llf/M;", "fetchHelpCenterCollections", "(Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;)V", "searchTerm", "Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "searchRequestCallback", "fetchHelpCenterResultsForSearchTerm", "(Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;)V", "collectionId", "Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "collectionContentRequestCallback", "fetchHelpCenterCollection", "(Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;)V", "", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "response", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "transformSearchResponse", "(Ljava/util/List;)Ljava/util/List;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterApiWrapper {
    public static final int $stable = 0;
    public static final HelpCenterApiWrapper INSTANCE = new HelpCenterApiWrapper();

    private HelpCenterApiWrapper() {
    }

    private final String removeHighlightTags(String str) {
        return p.D(p.D(str, "<highlight>", "", false, 4, (Object) null), "</highlight>", "", false, 4, (Object) null);
    }

    public final void fetchHelpCenterCollection(MetricTracker metricTracker, String str, CollectionContentRequestCallback collectionContentRequestCallback) {
        C6496s.h(metricTracker, "metricTracker");
        C6496s.h(str, "collectionId");
        C6496s.h(collectionContentRequestCallback, "collectionContentRequestCallback");
        C5600w0 unused = C5576k.d(C5585o0.f65402a, Z.b(), (M) null, new HelpCenterApiWrapper$fetchHelpCenterCollection$1(metricTracker, str, collectionContentRequestCallback, (C6658d<? super HelpCenterApiWrapper$fetchHelpCenterCollection$1>) null), 2, (Object) null);
    }

    public final void fetchHelpCenterCollections(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback) {
        C6496s.h(metricTracker, "metricTracker");
        C6496s.h(collectionRequestCallback, "collectionRequestCallback");
        C5600w0 unused = C5576k.d(C5585o0.f65402a, Z.b(), (M) null, new HelpCenterApiWrapper$fetchHelpCenterCollections$1(metricTracker, collectionRequestCallback, (C6658d<? super HelpCenterApiWrapper$fetchHelpCenterCollections$1>) null), 2, (Object) null);
    }

    public final void fetchHelpCenterResultsForSearchTerm(MetricTracker metricTracker, String str, SearchRequestCallback searchRequestCallback) {
        C6496s.h(metricTracker, "metricTracker");
        C6496s.h(str, "searchTerm");
        C6496s.h(searchRequestCallback, "searchRequestCallback");
        C5600w0 unused = C5576k.d(C5585o0.f65402a, Z.b(), (M) null, new HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1(metricTracker, str, searchRequestCallback, (C6658d<? super HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1>) null), 2, (Object) null);
    }

    public final List<HelpCenterArticleSearchResult> transformSearchResponse(List<HelpCenterArticleSearchResponse> list) {
        String str;
        C6496s.h(list, "response");
        Iterable<HelpCenterArticleSearchResponse> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : iterable) {
            String title = helpCenterArticleSearchResponse.getHighlight().getTitle();
            if (title == null || title.length() == 0) {
                str = helpCenterArticleSearchResponse.getTitle();
            } else {
                str = helpCenterArticleSearchResponse.getHighlight().getTitle();
            }
            String summary = helpCenterArticleSearchResponse.getHighlight().getSummary();
            String str2 = "";
            if (summary == null) {
                summary = str2;
            }
            String articleId = helpCenterArticleSearchResponse.getArticleId();
            HelpCenterApiWrapper helpCenterApiWrapper = INSTANCE;
            String removeHighlightTags = helpCenterApiWrapper.removeHighlightTags(str);
            String summary2 = helpCenterArticleSearchResponse.getSummary();
            if (summary2 != null) {
                str2 = summary2;
            }
            arrayList.add(new HelpCenterArticleSearchResult(articleId, removeHighlightTags, str2, helpCenterApiWrapper.removeHighlightTags(summary)));
        }
        return arrayList;
    }
}
