package q4;

import Sg.p;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.C6496s;
import p4.h;

/* renamed from: q4.b  reason: case insensitive filesystem */
public final class C3944b extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final h.a f47601a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47602b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f47603c = new Handler();

    public C3944b(h.a aVar, String str) {
        C6496s.h(aVar, "attempt");
        C6496s.h(str, "javascriptToInject");
        this.f47601a = aVar;
        this.f47602b = str;
    }

    /* access modifiers changed from: private */
    public static final void b(WebView webView, C3944b bVar) {
        if (webView != null) {
            webView.stopLoading();
        }
        if (webView != null) {
            String str = bVar.f47602b;
            webView.loadUrl("javascript:" + str);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null) {
            str = webResourceRequest.getMethod();
        } else {
            str = null;
        }
        if (C6496s.c(str, "POST")) {
            String uri = webResourceRequest.getUrl().toString();
            C6496s.g(uri, "toString(...)");
            if (p.O(uri, this.f47601a.b(), false, 2, (Object) null)) {
                try {
                    Thread.currentThread().interrupt();
                } catch (Exception unused) {
                }
                this.f47603c.post(new C3943a(webView, this));
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
