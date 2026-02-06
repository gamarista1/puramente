package com.reactnativecommunity.webview;

import J3.e;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.scroll.j;
import com.facebook.react.views.scroll.k;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import pd.C5137b;
import pd.C5143h;

public class f extends WebView implements LifecycleEventListener {

    /* renamed from: a  reason: collision with root package name */
    protected String f59321a;

    /* renamed from: b  reason: collision with root package name */
    protected String f59322b;

    /* renamed from: c  reason: collision with root package name */
    protected e f59323c;

    /* renamed from: d  reason: collision with root package name */
    protected e.a f59324d = null;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f59325e = true;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f59326f = true;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f59327g = false;

    /* renamed from: h  reason: collision with root package name */
    protected String f59328h;

    /* renamed from: i  reason: collision with root package name */
    protected RNCWebViewMessagingModule f59329i = ((RNCWebViewMessagingModule) ((C3415h0) getContext()).b().getJSModule(RNCWebViewMessagingModule.class));

    /* renamed from: j  reason: collision with root package name */
    protected i f59330j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f59331k = false;

    /* renamed from: l  reason: collision with root package name */
    private com.facebook.react.views.scroll.c f59332l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f59333m = false;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f59334n = false;

    /* renamed from: o  reason: collision with root package name */
    protected d f59335o = new d();

    /* renamed from: p  reason: collision with root package name */
    protected List f59336p;

    /* renamed from: q  reason: collision with root package name */
    WebChromeClient f59337q;

    /* renamed from: r  reason: collision with root package name */
    protected String f59338r = null;

    class a extends ActionMode.Callback2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActionMode.Callback f59339a;

        /* renamed from: com.reactnativecommunity.webview.f$a$a  reason: collision with other inner class name */
        class C0875a implements ValueCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MenuItem f59341a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ WritableMap f59342b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ActionMode f59343c;

            C0875a(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                this.f59341a = menuItem;
                this.f59342b = writableMap;
                this.f59343c = actionMode;
            }

            /* renamed from: a */
            public void onReceiveValue(String str) {
                String str2;
                Map map = (Map) f.this.f59336p.get(this.f59341a.getItemId());
                this.f59342b.putString("label", (String) map.get("label"));
                this.f59342b.putString(SubscriberAttributeKt.JSON_NAME_KEY, (String) map.get(SubscriberAttributeKt.JSON_NAME_KEY));
                try {
                    str2 = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    str2 = "";
                }
                this.f59342b.putString("selectedText", str2);
                f fVar = f.this;
                fVar.g(fVar, new C5137b(r.a(f.this), this.f59342b));
                this.f59343c.finish();
            }
        }

        a(ActionMode.Callback callback) {
            this.f59339a = callback;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            f.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new C0875a(menuItem, Arguments.createMap(), actionMode));
            return true;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i10 = 0; i10 < f.this.f59336p.size(); i10++) {
                menu.add(0, i10, i10, (CharSequence) ((Map) f.this.f59336p.get(i10)).get("label"));
            }
            return true;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = this.f59339a;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    class b implements e.a {
        b() {
        }

        public void a(WebView webView, J3.b bVar, Uri uri, boolean z10, J3.a aVar) {
            f.this.j(bVar.b(), uri.toString());
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f59346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f59347b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f59348c;

        c(WebView webView, String str, String str2) {
            this.f59346a = webView;
            this.f59347b = str;
            this.f59348c = str2;
        }

        public void run() {
            i iVar = f.this.f59330j;
            if (iVar != null) {
                WritableMap a10 = iVar.a(this.f59346a, this.f59347b);
                a10.putString("data", this.f59348c);
                f fVar = f.this;
                if (fVar.f59329i != null) {
                    fVar.e(a10);
                } else {
                    fVar.g(this.f59346a, new C5143h(r.a(this.f59346a), a10));
                }
            }
        }
    }

    protected static class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f59350a = false;

        protected d() {
        }

        public boolean a() {
            return this.f59350a;
        }

        public void b(boolean z10) {
            this.f59350a = z10;
        }
    }

    protected class e {

        /* renamed from: a  reason: collision with root package name */
        private String f59351a = "RNCWebViewBridge";

        /* renamed from: b  reason: collision with root package name */
        f f59352b;

        e(f fVar) {
            this.f59352b = fVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            f fVar = this.f59352b;
            fVar.j(str, fVar.getUrl());
        }

        @JavascriptInterface
        public void postMessage(String str) {
            if (this.f59352b.getMessagingEnabled()) {
                this.f59352b.post(new g(this, str));
            } else {
                U5.a.I(this.f59351a, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public f(C3415h0 h0Var) {
        super(h0Var);
    }

    private void i() {
        String str;
        if (getSettings().getJavaScriptEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return ");
            if (this.f59338r == null) {
                str = null;
            } else {
                str = "`" + this.f59338r + "`";
            }
            sb2.append(str);
            sb2.append("; };\n})();");
            h(sb2.toString());
        }
    }

    public void a() {
        String str;
        if (getSettings().getJavaScriptEnabled() && (str = this.f59321a) != null && !TextUtils.isEmpty(str)) {
            h("(function() {\n" + this.f59321a + ";\n})();");
            i();
        }
    }

    public void b() {
        String str;
        if (getSettings().getJavaScriptEnabled() && (str = this.f59322b) != null && !TextUtils.isEmpty(str)) {
            h("(function() {\n" + this.f59322b + ";\n})();");
            i();
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        setWebViewClient((WebViewClient) null);
        destroy();
    }

    /* access modifiers changed from: protected */
    public void d(f fVar) {
        if (J3.f.a("WEB_MESSAGE_LISTENER")) {
            if (this.f59324d == null) {
                this.f59324d = new b();
                J3.e.a(fVar, "ReactNativeWebView", e.a(new Object[]{"*"}), this.f59324d);
            }
        } else if (this.f59323c == null) {
            e eVar = new e(fVar);
            this.f59323c = eVar;
            addJavascriptInterface(eVar, "ReactNativeWebView");
        }
        i();
    }

    public void destroy() {
        WebChromeClient webChromeClient = this.f59337q;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    /* access modifiers changed from: protected */
    public void e(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f59328h);
        this.f59329i.onMessage(writableNativeMap);
    }

    /* access modifiers changed from: protected */
    public boolean f(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.f59328h);
        this.f59329i.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    /* access modifiers changed from: protected */
    public void g(WebView webView, com.facebook.react.uimanager.events.d dVar) {
        n0.c(getThemedReactContext(), r.a(webView)).h(dVar);
    }

    public boolean getMessagingEnabled() {
        return this.f59327g;
    }

    public i getRNCWebViewClient() {
        return this.f59330j;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().b();
    }

    public C3415h0 getThemedReactContext() {
        return (C3415h0) getContext();
    }

    public WebChromeClient getWebChromeClient() {
        return this.f59337q;
    }

    /* access modifiers changed from: protected */
    public void h(String str) {
        evaluateJavascript(str, (ValueCallback) null);
    }

    public void j(String str, String str2) {
        getThemedReactContext();
        if (this.f59330j != null) {
            post(new c(this, str2, str));
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", str);
        if (this.f59329i != null) {
            e(createMap);
        } else {
            g(this, new C5143h(r.a(this), createMap));
        }
    }

    public void onHostDestroy() {
        c();
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f59333m) {
            if (this.f59332l == null) {
                this.f59332l = new com.facebook.react.views.scroll.c();
            }
            if (this.f59332l.c(i10, i11)) {
                g(this, j.e(r.a(this), k.SCROLL, (float) i10, (float) i11, this.f59332l.a(), this.f59332l.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f59331k) {
            g(this, new com.facebook.react.uimanager.events.c(r.a(this), i10, i11));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f59334n) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(a aVar) {
        this.f59330j.d(aVar);
    }

    public void setHasScrollEvent(boolean z10) {
        this.f59333m = z10;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.f59338r = str;
        i();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.f59336p = list;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void setMessagingEnabled(boolean z10) {
        if (this.f59327g != z10) {
            this.f59327g = z10;
            if (z10) {
                d(this);
            }
        }
    }

    public void setNestedScrollEnabled(boolean z10) {
        this.f59334n = z10;
    }

    public void setSendContentSizeChangeEvents(boolean z10) {
        this.f59331k = z10;
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f59337q = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof c) {
            ((c) webChromeClient).h(this.f59335o);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof i) {
            i iVar = (i) webViewClient;
            this.f59330j = iVar;
            iVar.e(this.f59335o);
        }
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        if (this.f59336p == null) {
            return super.startActionMode(callback, i10);
        }
        return super.startActionMode(new a(callback), i10);
    }
}
