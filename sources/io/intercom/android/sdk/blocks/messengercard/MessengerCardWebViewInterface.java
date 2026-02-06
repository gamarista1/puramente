package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.c;
import com.google.gson.e;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class MessengerCardWebViewInterface {
    private static final String HEIGHT_CHANGE_EVENT = "HEIGHT_CHANGE_EVENT";
    private static final String INPUT_TEXT = "INPUT_TEXT";
    /* access modifiers changed from: private */
    public static final Double MESSENGER_APP_ID_ARTICLE_SEARCH = Double.valueOf(27.0d);
    private static final String METRIC_EVENT = "METRIC_EVENT";
    private static final String OPEN_SHEET = "OPEN_SHEET";
    private static final String OPEN_URL = "OPEN_URL";
    /* access modifiers changed from: private */
    public final Context context;
    private final String conversationId;
    private final e gson;
    /* access modifiers changed from: private */
    public final Boolean isHomescreen;
    /* access modifiers changed from: private */
    public final View loadingView;
    /* access modifiers changed from: private */
    public final MetricTracker metricTracker;
    private final int primaryColor;
    /* access modifiers changed from: private */
    public final WebView webView;

    MessengerCardWebViewInterface(WebView webView2, View view, e eVar, int i10, MetricTracker metricTracker2, String str, boolean z10, Context context2) {
        this.webView = webView2;
        this.loadingView = view;
        this.gson = eVar;
        this.primaryColor = i10;
        this.metricTracker = metricTracker2;
        this.conversationId = str;
        this.isHomescreen = Boolean.valueOf(z10);
        this.context = context2;
    }

    private void displayArticle(String str, Context context2) {
        String str2;
        if (this.isHomescreen.booleanValue()) {
            str2 = MetricTracker.Place.MESSENGER_HOME_APP;
        } else {
            str2 = "conversation";
        }
        context2.startActivity(ArticleActivity.buildIntent(context2, new ArticleActivity.ArticleActivityArguments(str, str2, false, !this.isHomescreen.booleanValue())));
    }

    private String getStringFromMap(Map<String, Object> map, String str) {
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        return "";
    }

    /* access modifiers changed from: private */
    public void openSheet(Map<String, Object> map, Context context2) {
        Map map2;
        String str = (String) map.get("url");
        if (map.containsKey(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS)) {
            map2 = (Map) map.get(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        } else {
            map2 = new HashMap();
        }
        String stringFromMap = getStringFromMap(map2, "uri");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(stringFromMap)) {
            if ("article-link".equals(getStringFromMap(map2, "action_id")) && map2.containsKey("values")) {
                String stringFromMap2 = getStringFromMap((Map) map2.get("values"), "article_id");
                if (!TextUtils.isEmpty(stringFromMap2)) {
                    displayArticle(stringFromMap2, context2);
                    return;
                }
            }
            context2.startActivity(IntercomSheetActivity.buildIntent(context2, str, map2, stringFromMap, this.conversationId));
        }
    }

    /* access modifiers changed from: private */
    public void openUrl(Map<String, Object> map, Context context2) {
        context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) map.get("url"))));
    }

    /* access modifiers changed from: private */
    public void showTextInputDialog(Map<String, Object> map, Context context2) {
        c create = new MessengerCardAlertDialogBuilder(context2, map, this.primaryColor, this.webView).create();
        create.show();
        create.getWindow().setSoftInputMode(5);
        create.j(-2).setTextColor(this.primaryColor);
        create.j(-1).setTextColor(this.primaryColor);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        final MessengerCardWebViewAction messengerCardWebViewAction = (MessengerCardWebViewAction) this.gson.m(str, MessengerCardWebViewAction.class);
        final Map<String, Object> payload = messengerCardWebViewAction.getPayload();
        String type = messengerCardWebViewAction.getType();
        if (type != null && payload != null) {
            char c10 = 65535;
            switch (type.hashCode()) {
                case 279273946:
                    if (type.equals(OPEN_URL)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 387980611:
                    if (type.equals(HEIGHT_CHANGE_EVENT)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 899662635:
                    if (type.equals("METRIC_EVENT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1901318306:
                    if (type.equals(INPUT_TEXT)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2092140298:
                    if (type.equals(OPEN_SHEET)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.webView.post(new Runnable() {
                        public void run() {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                            messengerCardWebViewInterface.openUrl(payload, messengerCardWebViewInterface.context);
                        }
                    });
                    return;
                case 1:
                    if (this.loadingView.getVisibility() == 0) {
                        this.webView.post(new Runnable() {
                            public void run() {
                                MessengerCardWebViewInterface.this.loadingView.setVisibility(8);
                                MessengerCardWebViewInterface.this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                            }
                        });
                        return;
                    }
                    return;
                case 2:
                    this.webView.post(new Runnable() {
                        public void run() {
                            Map map;
                            Map<String, Object> payload = messengerCardWebViewAction.getPayload();
                            String str = (String) payload.get("action");
                            String str2 = (String) payload.get("object");
                            String str3 = (String) payload.get("place");
                            if (payload.get("metadata") instanceof Map) {
                                map = (Map) payload.get("metadata");
                            } else {
                                map = null;
                            }
                            MessengerCardWebViewInterface.this.metricTracker.messengerCardWebViewEvent(str, str2, str3, map, MessengerCardWebViewInterface.this.isHomescreen.booleanValue());
                        }
                    });
                    return;
                case 3:
                    this.webView.post(new Runnable() {
                        public void run() {
                            if (MessengerCardWebViewInterface.MESSENGER_APP_ID_ARTICLE_SEARCH.equals((Double) payload.get("messengerAppId"))) {
                                IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(MessengerCardWebViewInterface.this.webView.getContext(), Collections.emptyList(), MetricTracker.Place.LEGACY_ARTICLE_SEARCH_APP);
                                return;
                            }
                            MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                            messengerCardWebViewInterface.showTextInputDialog(payload, messengerCardWebViewInterface.context);
                        }
                    });
                    return;
                case 4:
                    this.webView.post(new Runnable() {
                        public void run() {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = MessengerCardWebViewInterface.this;
                            messengerCardWebViewInterface.openSheet(payload, messengerCardWebViewInterface.context);
                        }
                    });
                    return;
                default:
                    return;
            }
        }
    }
}
