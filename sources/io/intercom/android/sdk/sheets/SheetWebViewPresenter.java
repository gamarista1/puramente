package io.intercom.android.sdk.sheets;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.conversation.JavascriptRunner;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class SheetWebViewPresenter {
    private final Injector injector;
    private final JavascriptRunner jsRunner;
    private final SheetListener listener;
    private final String sheetUrl;
    private final WebView webView;

    public SheetWebViewPresenter(WebView webView2, JavascriptRunner javascriptRunner, String str, SheetListener sheetListener, Injector injector2) {
        this.webView = webView2;
        this.jsRunner = javascriptRunner;
        this.sheetUrl = str;
        this.listener = sheetListener;
        this.injector = injector2;
    }

    public void loadBundle(String str) {
        this.jsRunner.reset();
        try {
            this.webView.postUrl(this.sheetUrl, ("intercom_data=" + URLEncoder.encode(str, Constants.ENCODING)).getBytes());
        } catch (UnsupportedEncodingException unused) {
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void setUpWebView() {
        this.webView.setVerticalScrollBarEnabled(false);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUserAgentString("IntercomMobileWebView");
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(1);
        this.webView.addJavascriptInterface(new SheetWebViewInterface(this.webView, this.injector.getGson(), this.injector.getMetricTracker(), this.injector.getApi(), this.listener), "AndroidHost");
        this.webView.setWebViewClient(new SheetWebViewClient(this.listener));
    }
}
