package Ke;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewClient;

/* renamed from: Ke.a  reason: case insensitive filesystem */
public final /* synthetic */ class C5476a implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArticleWebViewClient f63851a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WebView f63852b;

    public /* synthetic */ C5476a(ArticleWebViewClient articleWebViewClient, WebView webView) {
        this.f63851a = articleWebViewClient;
        this.f63852b = webView;
    }

    public final void onReceiveValue(Object obj) {
        this.f63851a.lambda$scrollToAnchorIfNeeded$0(this.f63852b, (String) obj);
    }
}
