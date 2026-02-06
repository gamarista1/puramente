package io.intercom.android.sdk.sheets;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.e;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;

public class SheetWebViewInterface {
    private static final String CLOSE_SHEET = "close";
    private static final String PAYLOAD_SHEET_TITLE = "title";
    private static final String SHEET_TITLE = "set-title";
    private static final String SUBMIT_SHEET = "submit-sheet";
    private final Api api;
    private final e gson;
    /* access modifiers changed from: private */
    public final SheetListener listener;
    private final MetricTracker metricTracker;
    private final WebView webView;

    SheetWebViewInterface(WebView webView2, e eVar, MetricTracker metricTracker2, Api api2, SheetListener sheetListener) {
        this.webView = webView2;
        this.gson = eVar;
        this.listener = sheetListener;
        this.metricTracker = metricTracker2;
        this.api = api2;
    }

    private boolean isHelpCenterMetric(String str) {
        if (HelpCenterWebViewInterface.METRIC_EVENT.equals(str) || HelpCenterWebViewInterface.TRACK_REACTION.equals(str)) {
            return true;
        }
        return false;
    }

    @JavascriptInterface
    public void handleAction(String str) {
        SheetWebViewAction sheetWebViewAction = (SheetWebViewAction) this.gson.m(str, SheetWebViewAction.class);
        String type = sheetWebViewAction.getType();
        final Map<String, Object> payload = sheetWebViewAction.getPayload();
        if (isHelpCenterMetric(type)) {
            new HelpCenterWebViewInterface(this.webView, this.gson, this.metricTracker, this.api, false).handleAction(str);
        } else if (type != null && payload != null) {
            char c10 = 65535;
            switch (type.hashCode()) {
                case -498753235:
                    if (type.equals(SHEET_TITLE)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 94756344:
                    if (type.equals(CLOSE_SHEET)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 227622762:
                    if (type.equals(SUBMIT_SHEET)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.webView.post(new Runnable() {
                        public void run() {
                            SheetWebViewInterface.this.listener.onSheetTitleAction(payload.get("title").toString());
                        }
                    });
                    return;
                case 1:
                    this.webView.post(new Runnable() {
                        public void run() {
                            SheetWebViewInterface.this.listener.onCloseSheetAction();
                        }
                    });
                    return;
                case 2:
                    this.webView.post(new Runnable() {
                        public void run() {
                            SheetWebViewInterface.this.listener.onSubmitSheetAction(payload);
                        }
                    });
                    return;
                default:
                    return;
            }
        }
    }
}
