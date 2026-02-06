package com.reactnativecommunity.webview;

import C7.d;
import Q7.a;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.w0;
import com.facebook.react.views.scroll.k;
import e8.C3500a;
import java.util.Map;
import m8.C3837x;
import m8.C3838y;
import org.json.JSONException;
import org.json.JSONObject;

@a(name = "RNCWebView")
public class RNCWebViewManager extends ViewGroupManager<r> implements C3838y {
    private final w0 mDelegate = new C3837x(this);
    private final m mRNCWebViewManagerImpl = new m(true);

    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.g();
    }

    /* access modifiers changed from: protected */
    public w0 getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = d.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", d.d("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", d.d("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", d.d("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topLoadingSubResourceError", d.d("registrationName", "onLoadingSubResourceError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", d.d("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", d.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", d.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(k.b(k.SCROLL), d.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", d.d("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", d.d("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", d.d("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", d.d("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return "RNCWebView";
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    public void setAllowingReadAccessToURL(r rVar, String str) {
    }

    public void setAllowsAirPlayForMediaPlayback(r rVar, boolean z10) {
    }

    public void setAllowsBackForwardNavigationGestures(r rVar, boolean z10) {
    }

    public void setAllowsInlineMediaPlayback(r rVar, boolean z10) {
    }

    public void setAllowsLinkPreview(r rVar, boolean z10) {
    }

    public void setAllowsPictureInPictureMediaPlayback(r rVar, boolean z10) {
    }

    public void setAutoManageStatusBarEnabled(r rVar, boolean z10) {
    }

    public void setAutomaticallyAdjustContentInsets(r rVar, boolean z10) {
    }

    public void setBounces(r rVar, boolean z10) {
    }

    public void setContentInset(r rVar, ReadableMap readableMap) {
    }

    public void setContentInsetAdjustmentBehavior(r rVar, String str) {
    }

    public void setContentMode(r rVar, String str) {
    }

    public void setDataDetectorTypes(r rVar, ReadableArray readableArray) {
    }

    public void setDecelerationRate(r rVar, double d10) {
    }

    public void setDirectionalLockEnabled(r rVar, boolean z10) {
    }

    public void setEnableApplePay(r rVar, boolean z10) {
    }

    public void setFraudulentWebsiteWarningEnabled(r rVar, boolean z10) {
    }

    public void setHasOnFileDownload(r rVar, boolean z10) {
    }

    public void setHideKeyboardAccessoryView(r rVar, boolean z10) {
    }

    public void setIndicatorStyle(r rVar, String str) {
    }

    public void setKeyboardDisplayRequiresUserAction(r rVar, boolean z10) {
    }

    public void setLimitsNavigationsToAppBoundDomains(r rVar, boolean z10) {
    }

    public void setMediaCapturePermissionGrantType(r rVar, String str) {
    }

    public void setPagingEnabled(r rVar, boolean z10) {
    }

    public void setPullToRefreshEnabled(r rVar, boolean z10) {
    }

    public void setRefreshControlLightMode(r rVar, boolean z10) {
    }

    public void setScrollEnabled(r rVar, boolean z10) {
    }

    public void setSharedCookiesEnabled(r rVar, boolean z10) {
    }

    @C3500a(name = "suppressMenuItems")
    public void setSuppressMenuItems(r rVar, ReadableArray readableArray) {
    }

    public void setTextInteractionEnabled(r rVar, boolean z10) {
    }

    public void setUseSharedProcessPool(r rVar, boolean z10) {
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3415h0 h0Var, r rVar) {
        rVar.getWebView().setWebViewClient(new i());
    }

    public void clearCache(r rVar, boolean z10) {
        rVar.getWebView().clearCache(z10);
    }

    public void clearFormData(r rVar) {
        rVar.getWebView().clearFormData();
    }

    public void clearHistory(r rVar) {
        rVar.getWebView().clearHistory();
    }

    /* access modifiers changed from: protected */
    public r createViewInstance(C3415h0 h0Var) {
        return this.mRNCWebViewManagerImpl.d(h0Var);
    }

    public void goBack(r rVar) {
        rVar.getWebView().goBack();
    }

    public void goForward(r rVar) {
        rVar.getWebView().goForward();
    }

    public void injectJavaScript(r rVar, String str) {
        rVar.getWebView().h(str);
    }

    public void loadUrl(r rVar, String str) {
        rVar.getWebView().loadUrl(str);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(r rVar) {
        super.onAfterUpdateTransaction(rVar);
        this.mRNCWebViewManagerImpl.l(rVar);
    }

    public void onDropViewInstance(r rVar) {
        this.mRNCWebViewManagerImpl.m(rVar);
        super.onDropViewInstance(rVar);
    }

    public void postMessage(r rVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            f webView = rVar.getWebView();
            webView.h("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void receiveCommand(r rVar, String str, ReadableArray readableArray) {
        super.receiveCommand(rVar, str, readableArray);
    }

    public void reload(r rVar) {
        rVar.getWebView().reload();
    }

    public void requestFocus(r rVar) {
        rVar.requestFocus();
    }

    @C3500a(name = "allowFileAccess")
    public void setAllowFileAccess(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.n(rVar, z10);
    }

    @C3500a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.o(rVar, z10);
    }

    @C3500a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.p(rVar, z10);
    }

    @C3500a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.q(rVar, z10);
    }

    @C3500a(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.r(rVar, z10);
    }

    @C3500a(name = "androidLayerType")
    public void setAndroidLayerType(r rVar, String str) {
        this.mRNCWebViewManagerImpl.s(rVar, str);
    }

    @C3500a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(r rVar, String str) {
        this.mRNCWebViewManagerImpl.t(rVar, str);
    }

    @C3500a(name = "basicAuthCredential")
    public void setBasicAuthCredential(r rVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.u(rVar, readableMap);
    }

    @C3500a(name = "cacheEnabled")
    public void setCacheEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.v(rVar, z10);
    }

    @C3500a(name = "cacheMode")
    public void setCacheMode(r rVar, String str) {
        this.mRNCWebViewManagerImpl.w(rVar, str);
    }

    @C3500a(name = "domStorageEnabled")
    public void setDomStorageEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.x(rVar, z10);
    }

    @C3500a(name = "downloadingMessage")
    public void setDownloadingMessage(r rVar, String str) {
        this.mRNCWebViewManagerImpl.y(str);
    }

    @C3500a(name = "forceDarkOn")
    public void setForceDarkOn(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.z(rVar, z10);
    }

    @C3500a(name = "geolocationEnabled")
    public void setGeolocationEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.A(rVar, z10);
    }

    @C3500a(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.B(rVar, z10);
    }

    @C3500a(name = "hasOnScroll")
    public void setHasOnScroll(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.C(rVar, z10);
    }

    @C3500a(name = "incognito")
    public void setIncognito(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.D(rVar, z10);
    }

    @C3500a(name = "injectedJavaScript")
    public void setInjectedJavaScript(r rVar, String str) {
        this.mRNCWebViewManagerImpl.E(rVar, str);
    }

    @C3500a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(r rVar, String str) {
        this.mRNCWebViewManagerImpl.F(rVar, str);
    }

    @C3500a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.G(rVar, z10);
    }

    @C3500a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.H(rVar, z10);
    }

    @C3500a(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(r rVar, String str) {
        this.mRNCWebViewManagerImpl.I(rVar, str);
    }

    @C3500a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.J(rVar, z10);
    }

    @C3500a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.K(rVar, z10);
    }

    @C3500a(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(r rVar, String str) {
        this.mRNCWebViewManagerImpl.L(str);
    }

    @C3500a(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.M(rVar, z10);
    }

    @C3500a(name = "menuItems")
    public void setMenuItems(r rVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.N(rVar, readableArray);
    }

    @C3500a(name = "messagingEnabled")
    public void setMessagingEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.O(rVar, z10);
    }

    @C3500a(name = "messagingModuleName")
    public void setMessagingModuleName(r rVar, String str) {
        this.mRNCWebViewManagerImpl.P(rVar, str);
    }

    @C3500a(name = "minimumFontSize")
    public void setMinimumFontSize(r rVar, int i10) {
        this.mRNCWebViewManagerImpl.Q(rVar, i10);
    }

    @C3500a(name = "mixedContentMode")
    public void setMixedContentMode(r rVar, String str) {
        this.mRNCWebViewManagerImpl.R(rVar, str);
    }

    @C3500a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.S(rVar, z10);
    }

    @C3500a(name = "newSource")
    public void setNewSource(r rVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.c0(rVar, readableMap);
    }

    @C3500a(name = "overScrollMode")
    public void setOverScrollMode(r rVar, String str) {
        this.mRNCWebViewManagerImpl.T(rVar, str);
    }

    @C3500a(name = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.U(rVar, z10);
    }

    @C3500a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.V(rVar, z10);
    }

    @C3500a(name = "scalesPageToFit")
    public void setScalesPageToFit(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.W(rVar, z10);
    }

    @C3500a(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.X(rVar, z10);
    }

    @C3500a(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.Y(rVar, z10);
    }

    @C3500a(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.Z(rVar, z10);
    }

    @C3500a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.a0(rVar, z10);
    }

    @C3500a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.b0(rVar, z10);
    }

    @C3500a(name = "textZoom")
    public void setTextZoom(r rVar, int i10) {
        this.mRNCWebViewManagerImpl.d0(rVar, i10);
    }

    @C3500a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.e0(rVar, z10);
    }

    @C3500a(name = "userAgent")
    public void setUserAgent(r rVar, String str) {
        this.mRNCWebViewManagerImpl.f0(rVar, str);
    }

    @C3500a(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(r rVar, boolean z10) {
        this.mRNCWebViewManagerImpl.h0(rVar, z10);
    }

    public void stopLoading(r rVar) {
        rVar.getWebView().stopLoading();
    }
}
