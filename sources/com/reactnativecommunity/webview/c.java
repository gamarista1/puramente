package com.reactnativecommunity.webview;

import U7.g;
import U7.h;
import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.reactnativecommunity.webview.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pd.C5141f;
import pd.C5144i;

public abstract class c extends WebChromeClient implements LifecycleEventListener {

    /* renamed from: n  reason: collision with root package name */
    protected static final FrameLayout.LayoutParams f59305n = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: a  reason: collision with root package name */
    protected f f59306a;

    /* renamed from: b  reason: collision with root package name */
    protected View f59307b;

    /* renamed from: c  reason: collision with root package name */
    protected WebChromeClient.CustomViewCallback f59308c;

    /* renamed from: d  reason: collision with root package name */
    protected PermissionRequest f59309d;

    /* renamed from: e  reason: collision with root package name */
    protected List f59310e;

    /* renamed from: f  reason: collision with root package name */
    protected GeolocationPermissions.Callback f59311f;

    /* renamed from: g  reason: collision with root package name */
    protected String f59312g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f59313h = false;

    /* renamed from: i  reason: collision with root package name */
    protected List f59314i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    protected f.d f59315j = null;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f59316k = false;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f59317l = false;

    /* renamed from: m  reason: collision with root package name */
    private h f59318m = new b(this);

    class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebView f59319a;

        a(WebView webView) {
            this.f59319a = webView;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("targetUrl", str);
            WebView webView2 = this.f59319a;
            ((f) webView2).g(webView2, new C5144i(r.a(this.f59319a), createMap));
            return true;
        }
    }

    public c(f fVar) {
        this.f59306a = fVar;
    }

    private g b() {
        Activity currentActivity = this.f59306a.getThemedReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof g) {
            return (g) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean d(int i10, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        List list;
        boolean z10;
        List list2;
        List list3;
        List list4;
        GeolocationPermissions.Callback callback;
        String str;
        this.f59313h = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (iArr[i11] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!str2.equals("android.permission.ACCESS_FINE_LOCATION") || (callback = this.f59311f) == null || (str = this.f59312g) == null)) {
                if (z10) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                this.f59311f = null;
                this.f59312g = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z10 && (list4 = this.f59310e) != null) {
                    list4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z11 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z10 && (list3 = this.f59310e) != null) {
                    list3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z11 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z10 && (list2 = this.f59310e) != null) {
                    list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z11 = true;
            }
        }
        if (!(!z11 || (permissionRequest = this.f59309d) == null || (list = this.f59310e) == null)) {
            permissionRequest.grant((String[]) list.toArray(new String[0]));
            this.f59309d = null;
            this.f59310e = null;
        }
        if (this.f59314i.isEmpty()) {
            return true;
        }
        e(this.f59314i);
        return false;
    }

    private synchronized void e(List list) {
        if (this.f59313h) {
            this.f59314i.addAll(list);
            return;
        }
        g b10 = b();
        this.f59313h = true;
        b10.b((String[]) list.toArray(new String[0]), 3, this.f59318m);
        this.f59314i.clear();
    }

    /* access modifiers changed from: protected */
    public ViewGroup c() {
        return (ViewGroup) this.f59306a.getThemedReactContext().getCurrentActivity().findViewById(16908290);
    }

    public void f(boolean z10) {
        this.f59316k = z10;
    }

    public void g(boolean z10) {
        this.f59317l = z10;
    }

    public void h(f.d dVar) {
        this.f59315j = dVar;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (E7.a.f30669b) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f59317l) {
            webView2.setWebViewClient(new a(webView));
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (androidx.core.content.c.checkSelfPermission(this.f59306a.getThemedReactContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            this.f59311f = callback;
            this.f59312g = str;
            e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
            return;
        }
        callback.invoke(str, true, false);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        View view = this.f59307b;
        if (view != null && view.getSystemUiVisibility() != 7942) {
            this.f59307b.setSystemUiVisibility(7942);
        }
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f59310e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        String[] resources = permissionRequest.getResources();
        int length = resources.length;
        int i10 = 0;
        while (true) {
            String str = null;
            if (i10 >= length) {
                break;
            }
            String str2 = resources[i10];
            if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                str = "android.permission.RECORD_AUDIO";
            } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                str = "android.permission.CAMERA";
            } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (this.f59316k) {
                    this.f59310e.add(str2);
                } else {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
            }
            if (str != null) {
                if (androidx.core.content.c.checkSelfPermission(this.f59306a.getThemedReactContext(), str) == 0) {
                    this.f59310e.add(str2);
                } else {
                    arrayList.add(str);
                }
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant((String[]) this.f59310e.toArray(new String[0]));
            this.f59310e = null;
            return;
        }
        this.f59309d = permissionRequest;
        e(arrayList);
    }

    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        String url = webView.getUrl();
        if (!this.f59315j.a()) {
            int a10 = r.a(webView);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) a10);
            createMap.putString(b.f37461S, webView.getTitle());
            createMap.putString("url", url);
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, (double) (((float) i10) / 100.0f));
            n0.c(this.f59306a.getThemedReactContext(), a10).h(new C5141f(a10, createMap));
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z10 = true;
        if (fileChooserParams.getMode() != 1) {
            z10 = false;
        }
        return ((RNCWebViewModule) this.f59306a.getThemedReactContext().getNativeModule(RNCWebViewModule.class)).startPhotoPickerIntent(valueCallback, acceptTypes, z10, fileChooserParams.isCaptureEnabled());
    }
}
