package com.reactnativecommunity.webview;

import J3.d;
import J3.f;
import Sg.C5541d;
import Sg.p;
import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.C3415h0;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m {

    /* renamed from: C  reason: collision with root package name */
    public static final a f59362C = new a((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private final int f59363A = ErrorCodes.SERVER_RETRY_IN;

    /* renamed from: B  reason: collision with root package name */
    private final int f59364B = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f59365a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59366b = "RNCWebViewManagerImpl";

    /* renamed from: c  reason: collision with root package name */
    private j f59367c = new k();

    /* renamed from: d  reason: collision with root package name */
    private boolean f59368d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59369e;

    /* renamed from: f  reason: collision with root package name */
    private String f59370f;

    /* renamed from: g  reason: collision with root package name */
    private String f59371g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f59372h;

    /* renamed from: i  reason: collision with root package name */
    private ReadableMap f59373i;

    /* renamed from: j  reason: collision with root package name */
    private String f59374j;

    /* renamed from: k  reason: collision with root package name */
    private String f59375k;

    /* renamed from: l  reason: collision with root package name */
    private final String f59376l = Constants.ENCODING;

    /* renamed from: m  reason: collision with root package name */
    private final String f59377m = "text/html";

    /* renamed from: n  reason: collision with root package name */
    private final String f59378n = "POST";

    /* renamed from: o  reason: collision with root package name */
    private final String f59379o = "about:blank";

    /* renamed from: p  reason: collision with root package name */
    private final String f59380p = "Downloading";

    /* renamed from: q  reason: collision with root package name */
    private final String f59381q = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";

    /* renamed from: r  reason: collision with root package name */
    private final int f59382r = 1;

    /* renamed from: s  reason: collision with root package name */
    private final int f59383s = 2;

    /* renamed from: t  reason: collision with root package name */
    private final int f59384t = 3;

    /* renamed from: u  reason: collision with root package name */
    private final int f59385u = 4;

    /* renamed from: v  reason: collision with root package name */
    private final int f59386v = 5;

    /* renamed from: w  reason: collision with root package name */
    private final int f59387w = 6;

    /* renamed from: x  reason: collision with root package name */
    private final int f59388x = 7;

    /* renamed from: y  reason: collision with root package name */
    private final int f59389y = 8;

    /* renamed from: z  reason: collision with root package name */
    private final int f59390z = 1000;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends c {
        b(f fVar) {
            super(fVar);
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class c extends c {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Activity f59391o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f59392p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, Activity activity, int i10) {
            super(fVar);
            this.f59391o = activity;
            this.f59392p = i10;
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        public void onHideCustomView() {
            if (this.f59307b != null) {
                ViewGroup c10 = c();
                if (c10.getRootView() != this.f59306a.getRootView()) {
                    this.f59306a.getRootView().setVisibility(0);
                } else {
                    this.f59306a.setVisibility(0);
                }
                this.f59391o.getWindow().clearFlags(512);
                c10.removeView(this.f59307b);
                this.f59308c.onCustomViewHidden();
                this.f59307b = null;
                this.f59308c = null;
                this.f59391o.setRequestedOrientation(this.f59392p);
                this.f59306a.getThemedReactContext().removeLifecycleEventListener(this);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            C6496s.h(view, "view");
            C6496s.h(customViewCallback, "callback");
            if (this.f59307b != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f59307b = view;
            this.f59308c = customViewCallback;
            this.f59391o.setRequestedOrientation(-1);
            this.f59307b.setSystemUiVisibility(7942);
            this.f59391o.getWindow().setFlags(512, 512);
            this.f59307b.setBackgroundColor(-16777216);
            ViewGroup c10 = c();
            c10.addView(this.f59307b, c.f59305n);
            if (c10.getRootView() != this.f59306a.getRootView()) {
                this.f59306a.getRootView().setVisibility(8);
            } else {
                this.f59306a.setVisibility(8);
            }
            this.f59306a.getThemedReactContext().addLifecycleEventListener(this);
        }
    }

    public m(boolean z10) {
        this.f59365a = z10;
    }

    /* access modifiers changed from: private */
    public static final void f(f fVar, m mVar, String str, String str2, String str3, String str4, long j10) {
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) fVar.getReactApplicationContext().getNativeModule(RNCWebViewModule.class);
        if (rNCWebViewModule != null) {
            try {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String a10 = s.a(str, str3, str4);
                C6496s.e(a10);
                String e10 = n.a().e(a10, "_");
                String str5 = "Downloading " + e10;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                } catch (MalformedURLException e11) {
                    Log.w(mVar.f59366b, "Error getting cookie for DownloadManager", e11);
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(e10);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, e10);
                rNCWebViewModule.setDownloadRequest(request);
                if (rNCWebViewModule.grantFileDownloaderPermissions(mVar.h(), mVar.i())) {
                    rNCWebViewModule.downloadFile(mVar.h());
                }
            } catch (IllegalArgumentException e12) {
                Log.w(mVar.f59366b, "Unsupported URI, aborting download", e12);
            }
        }
    }

    private final void g0(r rVar) {
        f webView = rVar.getWebView();
        if (this.f59374j != null) {
            webView.getSettings().setUserAgentString(this.f59374j);
        } else if (this.f59375k != null) {
            webView.getSettings().setUserAgentString(this.f59375k);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    private final String h() {
        String str = this.f59370f;
        if (str == null) {
            return this.f59380p;
        }
        return str;
    }

    private final String i() {
        String str = this.f59371g;
        if (str == null) {
            return this.f59381q;
        }
        return str;
    }

    private final void i0(f fVar) {
        Activity currentActivity = fVar.getThemedReactContext().getCurrentActivity();
        if (!this.f59368d || currentActivity == null) {
            c cVar = (c) fVar.getWebChromeClient();
            if (cVar != null) {
                cVar.onHideCustomView();
            }
            b bVar = new b(fVar);
            bVar.f(this.f59369e);
            bVar.g(this.f59372h);
            fVar.setWebChromeClient(bVar);
            return;
        }
        c cVar2 = new c(fVar, currentActivity, currentActivity.getRequestedOrientation());
        cVar2.f(this.f59369e);
        cVar2.g(this.f59372h);
        fVar.setWebChromeClient(cVar2);
    }

    private final void j(r rVar, ReadableMap readableMap) {
        byte[] bArr;
        String str;
        f webView = rVar.getWebView();
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                if (readableMap.hasKey("baseUrl")) {
                    str = readableMap.getString("baseUrl");
                } else {
                    str = "";
                }
                C6496s.e(string);
                webView.loadDataWithBaseURL(str, string, this.f59377m, this.f59376l, (String) null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string2 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url != null && C6496s.c(url, string2)) {
                    return;
                }
                if (!readableMap.hasKey("method") || !p.v(readableMap.getString("method"), this.f59378n, true)) {
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        if (this.f59365a) {
                            ReadableArray array = readableMap.getArray("headers");
                            C6496s.e(array);
                            Iterator<Object> it = array.toArrayList().iterator();
                            C6496s.g(it, "iterator(...)");
                            while (it.hasNext()) {
                                Object next = it.next();
                                C6496s.f(next, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                                HashMap hashMap2 = (HashMap) next;
                                String str2 = (String) hashMap2.get("name");
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = (String) hashMap2.get("value");
                                if (str3 == null) {
                                    str3 = "";
                                }
                                Locale locale = Locale.ENGLISH;
                                C6496s.g(locale, "ENGLISH");
                                String lowerCase = str2.toLowerCase(locale);
                                C6496s.g(lowerCase, "toLowerCase(...)");
                                if (C6496s.c("user-agent", lowerCase)) {
                                    webView.getSettings().setUserAgentString(str3);
                                } else {
                                    hashMap.put(str2, str3);
                                }
                            }
                        } else {
                            ReadableMap map = readableMap.getMap("headers");
                            C6496s.e(map);
                            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                            while (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                Locale locale2 = Locale.ENGLISH;
                                C6496s.g(locale2, "ENGLISH");
                                String lowerCase2 = nextKey.toLowerCase(locale2);
                                C6496s.g(lowerCase2, "toLowerCase(...)");
                                if (C6496s.c("user-agent", lowerCase2)) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                } else {
                                    hashMap.put(nextKey, map.getString(nextKey));
                                }
                            }
                        }
                    }
                    C6496s.e(string2);
                    webView.loadUrl(string2, hashMap);
                    return;
                }
                if (readableMap.hasKey("body")) {
                    String string3 = readableMap.getString("body");
                    try {
                        C6496s.e(string3);
                        Charset forName = Charset.forName(Constants.ENCODING);
                        C6496s.g(forName, "forName(...)");
                        bArr = string3.getBytes(forName);
                        C6496s.g(bArr, "getBytes(...)");
                    } catch (UnsupportedEncodingException unused) {
                        C6496s.e(string3);
                        bArr = string3.getBytes(C5541d.f65029b);
                        C6496s.g(bArr, "getBytes(...)");
                    }
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    bArr = new byte[0];
                }
                C6496s.e(string2);
                webView.postUrl(string2, bArr);
                return;
            }
        }
        webView.loadUrl(this.f59379o);
    }

    /* access modifiers changed from: private */
    public static final void k(WebView webView) {
    }

    public final void A(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setGeolocationEnabled(z10);
    }

    public final void B(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        this.f59372h = z10;
        i0(webView);
    }

    public final void C(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().setHasScrollEvent(z10);
    }

    public final void D(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        if (z10) {
            CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    public final void E(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().f59321a = str;
    }

    public final void F(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().f59322b = str;
    }

    public final void G(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().f59326f = z10;
    }

    public final void H(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().f59325e = z10;
    }

    public final void I(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().setInjectedJavaScriptObject(str);
    }

    public final void J(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
    }

    public final void K(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setJavaScriptEnabled(z10);
    }

    public final void L(String str) {
        this.f59371g = str;
    }

    public final void M(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setMediaPlaybackRequiresUserGesture(z10);
    }

    public final void N(r rVar, ReadableArray readableArray) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        if (readableArray == null) {
            webView.setMenuCustomItems((List<Map<String, String>>) null);
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        C6496s.f(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>");
        webView.setMenuCustomItems(arrayList);
    }

    public final void O(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().setMessagingEnabled(z10);
    }

    public final void P(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().f59328h = str;
    }

    public final void Q(r rVar, int i10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setMinimumFontSize(i10);
    }

    public final void R(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        if (str == null || C6496s.c("never", str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (C6496s.c("always", str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if (C6496s.c("compatibility", str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    public final void S(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().f59334n = z10;
    }

    public final void T(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        int i10 = 0;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -1414557169) {
                boolean equals = str.equals("always");
            } else if (hashCode != 104712844) {
                if (hashCode == 951530617 && str.equals("content")) {
                    i10 = 1;
                }
            } else if (str.equals("never")) {
                i10 = 2;
            }
        }
        webView.setOverScrollMode(i10);
    }

    public final void U(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        if (f.a("PAYMENT_REQUEST")) {
            d.d(webView.getSettings(), z10);
        }
    }

    public final void V(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setSaveFormData(!z10);
    }

    public final void W(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        webView.getSettings().setLoadWithOverviewMode(z10);
        webView.getSettings().setUseWideViewPort(z10);
    }

    public final void X(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setBuiltInZoomControls(z10);
    }

    public final void Y(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setDisplayZoomControls(z10);
    }

    public final void Z(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setSupportMultipleWindows(z10);
    }

    public final void a0(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().setHorizontalScrollBarEnabled(z10);
    }

    public final void b0(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().setVerticalScrollBarEnabled(z10);
    }

    public final f c(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return new f(h0Var);
    }

    public final void c0(r rVar, ReadableMap readableMap) {
        C6496s.h(rVar, "viewWrapper");
        this.f59373i = readableMap;
    }

    public final r d(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        return e(h0Var, c(h0Var));
    }

    public final void d0(r rVar, int i10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setTextZoom(i10);
    }

    public final r e(C3415h0 h0Var, f fVar) {
        C6496s.h(h0Var, "context");
        C6496s.h(fVar, "webView");
        i0(fVar);
        h0Var.addLifecycleEventListener(fVar);
        this.f59367c.a(fVar);
        WebSettings settings = fVar.getSettings();
        C6496s.g(settings, "getSettings(...)");
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (E7.a.f30669b) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        fVar.setDownloadListener(new l(fVar, this));
        return new r(h0Var, fVar);
    }

    public final void e0(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        CookieManager.getInstance().setAcceptThirdPartyCookies(rVar.getWebView(), z10);
    }

    public final void f0(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        this.f59374j = str;
        g0(rVar);
    }

    public final Map g() {
        return C7.d.a().b("goBack", Integer.valueOf(this.f59382r)).b("goForward", Integer.valueOf(this.f59383s)).b("reload", Integer.valueOf(this.f59384t)).b("stopLoading", Integer.valueOf(this.f59385u)).b("postMessage", Integer.valueOf(this.f59386v)).b("injectJavaScript", Integer.valueOf(this.f59387w)).b("loadUrl", Integer.valueOf(this.f59388x)).b("requestFocus", Integer.valueOf(this.f59389y)).b("clearFormData", Integer.valueOf(this.f59390z)).b("clearCache", Integer.valueOf(this.f59363A)).b("clearHistory", Integer.valueOf(this.f59364B)).a();
    }

    public final void h0(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        WebView.setWebContentsDebuggingEnabled(z10);
    }

    public final void l(r rVar) {
        C6496s.h(rVar, "viewWrapper");
        ReadableMap readableMap = this.f59373i;
        if (readableMap != null) {
            j(rVar, readableMap);
        }
        this.f59373i = null;
    }

    public final void m(r rVar) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        webView.getThemedReactContext().removeLifecycleEventListener(webView);
        webView.c();
        webView.f59337q = null;
    }

    public final void n(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setAllowFileAccess(z10);
    }

    public final void o(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setAllowFileAccessFromFileURLs(z10);
    }

    public final void p(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setAllowUniversalAccessFromFileURLs(z10);
    }

    public final void q(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        this.f59368d = z10;
        i0(webView);
    }

    public final void r(r rVar, boolean z10) {
        WebChromeClient webChromeClient;
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        this.f59369e = z10;
        if (Build.VERSION.SDK_INT >= 26 && (webChromeClient = webView.getWebChromeClient()) != null && (webChromeClient instanceof c)) {
            ((c) webChromeClient).f(z10);
        }
    }

    public final void s(r rVar, String str) {
        int i10;
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        if (C6496s.c(str, "hardware")) {
            i10 = 2;
        } else if (C6496s.c(str, "software")) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        webView.setLayerType(i10, (Paint) null);
    }

    public final void t(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        if (str != null) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(rVar.getWebView().getContext());
            this.f59375k = defaultUserAgent + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
        } else {
            this.f59375k = null;
        }
        g0(rVar);
    }

    public final void u(r rVar, ReadableMap readableMap) {
        a aVar;
        C6496s.h(rVar, "viewWrapper");
        if (readableMap == null || !readableMap.hasKey("username") || !readableMap.hasKey("password")) {
            aVar = null;
        } else {
            aVar = new a(readableMap.getString("username"), readableMap.getString("password"));
        }
        rVar.getWebView().setBasicAuthCredential(aVar);
    }

    public final void v(r rVar, boolean z10) {
        int i10;
        C6496s.h(rVar, "viewWrapper");
        WebSettings settings = rVar.getWebView().getSettings();
        if (z10) {
            i10 = -1;
        } else {
            i10 = 2;
        }
        settings.setCacheMode(i10);
    }

    public final void w(r rVar, String str) {
        C6496s.h(rVar, "viewWrapper");
        WebSettings settings = rVar.getWebView().getSettings();
        int i10 = -1;
        if (str != null) {
            switch (str.hashCode()) {
                case -2059164003:
                    if (str.equals("LOAD_NO_CACHE")) {
                        i10 = 2;
                        break;
                    }
                    break;
                case -1215135800:
                    boolean equals = str.equals("LOAD_DEFAULT");
                    break;
                case -873877826:
                    if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 1548620642:
                    if (str.equals("LOAD_CACHE_ONLY")) {
                        i10 = 3;
                        break;
                    }
                    break;
            }
        }
        settings.setCacheMode(i10);
    }

    public final void x(r rVar, boolean z10) {
        C6496s.h(rVar, "viewWrapper");
        rVar.getWebView().getSettings().setDomStorageEnabled(z10);
    }

    public final void y(String str) {
        this.f59370f = str;
    }

    public final void z(r rVar, boolean z10) {
        int i10;
        C6496s.h(rVar, "viewWrapper");
        f webView = rVar.getWebView();
        if (Build.VERSION.SDK_INT > 28) {
            if (f.a("FORCE_DARK")) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                d.b(webView.getSettings(), i10);
            }
            if (z10 && f.a("FORCE_DARK_STRATEGY")) {
                d.c(webView.getSettings(), 2);
            }
        }
    }
}
