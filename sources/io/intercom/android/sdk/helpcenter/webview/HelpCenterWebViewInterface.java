package io.intercom.android.sdk.helpcenter.webview;

import Le.C5477a;
import Le.C5478b;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.e;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;

public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final e gson;
    private final boolean isFromSearchBrowse;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView2, e eVar, MetricTracker metricTracker2, Api api2, boolean z10) {
        this.webView = webView2;
        this.gson = eVar;
        this.metricTracker = metricTracker2;
        this.api = api2;
        this.isFromSearchBrowse = z10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAction$0(Map map) {
        String str = (String) map.get("action");
        String str2 = (String) map.get("object");
        String str3 = (String) map.get("place");
        HashMap hashMap = new HashMap();
        if (map.get("metadata") instanceof Map) {
            hashMap.putAll((Map) map.get("metadata"));
        }
        if (this.isFromSearchBrowse) {
            hashMap.put(ConstantsKt.KEY_ARTICLE_SOURCE, "search_browse");
        }
        this.metricTracker.educateWebviewMetric(str, str2, str3, hashMap, MetricTracker.Context.FROM_HELP_CENTER_WEBVIEW);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAction$1(Map map) {
        Double d10 = (Double) map.get("article_id");
        Double d11 = (Double) map.get("article_content_id");
        Double d12 = (Double) map.get("reaction_index");
        if (d10 != null && d11 != null && d12 != null) {
            this.api.reactToLink(String.valueOf(d10.intValue()), String.valueOf(d11.intValue()), d12.intValue(), true);
        }
    }

    @JavascriptInterface
    public void handleAction(String str) {
        HelpCenterWebViewAction helpCenterWebViewAction = (HelpCenterWebViewAction) this.gson.m(str, HelpCenterWebViewAction.class);
        String type = helpCenterWebViewAction.getType();
        Map<String, Object> value = helpCenterWebViewAction.getValue();
        if (type != null && value != null) {
            if (type.equals(TRACK_REACTION)) {
                this.webView.post(new C5478b(this, value));
            } else if (type.equals(METRIC_EVENT)) {
                this.webView.post(new C5477a(this, value));
            }
        }
    }
}
