package q4;

import android.webkit.WebView;

/* renamed from: q4.a  reason: case insensitive filesystem */
public final /* synthetic */ class C3943a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f47599a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3944b f47600b;

    public /* synthetic */ C3943a(WebView webView, C3944b bVar) {
        this.f47599a = webView;
        this.f47600b = bVar;
    }

    public final void run() {
        C3944b.b(this.f47599a, this.f47600b);
    }
}
