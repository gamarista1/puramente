package io.intercom.android.sdk.blocks.messengercard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import com.google.gson.e;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;

public class MessengerCardWebViewPresenter {
    private final File cache;
    private final Context context;
    private final String conversationId;
    private final String fallbackUrl;
    private final e gson;
    private final boolean isHomeScreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    private final int primaryColor;
    private final CardWebView webView;

    public MessengerCardWebViewPresenter(CardWebView cardWebView, View view, String str, int i10, e eVar, MetricTracker metricTracker2, File file, String str2, boolean z10, Context context2) {
        this.webView = cardWebView;
        this.loadingView = view;
        this.fallbackUrl = str;
        this.primaryColor = i10;
        this.gson = eVar;
        this.metricTracker = metricTracker2;
        this.conversationId = str2;
        this.cache = file;
        this.isHomeScreen = z10;
        this.context = context2;
    }

    public static CardWebView createCardWebView(Context context2) {
        CardWebView cardWebView;
        try {
            cardWebView = new CardWebView(context2);
        } catch (Resources.NotFoundException unused) {
            cardWebView = new CardWebView(Injector.get().getApplication());
        }
        cardWebView.setAlpha(0.0f);
        cardWebView.setId(R.id.intercom_messenger_card_webview);
        cardWebView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return cardWebView;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void setUpWebView() {
        this.webView.setUp();
        this.webView.setBackgroundColor(0);
        this.webView.setWebViewClient(new MessengerCardWebViewClient(Uri.parse(this.fallbackUrl).getHost()));
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(-1);
        settings.setMixedContentMode(0);
        this.webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.addJavascriptInterface(new MessengerCardWebViewInterface(this.webView, this.loadingView, this.gson, this.primaryColor, this.metricTracker, this.conversationId, this.isHomeScreen, this.context), "AndroidHost");
    }
}
