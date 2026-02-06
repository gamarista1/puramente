package com.facebook.react.modules.devloading;

import I7.c;
import W7.b;
import com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.E;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Q7.a(name = "DevLoadingView")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/modules/devloading/DevLoadingModule;", "Lcom/facebook/fbreact/specs/NativeDevLoadingViewSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "message", "", "color", "backgroundColor", "Llf/M;", "showMessage", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "hide", "()V", "Lcom/facebook/react/bridge/JSExceptionHandler;", "jsExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "LI7/c;", "devLoadingViewManager", "LI7/c;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DevLoadingModule extends NativeDevLoadingViewSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    public static final String NAME = "DevLoadingView";
    private c devLoadingViewManager;
    private final JSExceptionHandler jsExceptionHandler;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevLoadingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
        JSExceptionHandler jSExceptionHandler = reactApplicationContext.getJSExceptionHandler();
        this.jsExceptionHandler = jSExceptionHandler;
        if (jSExceptionHandler != null && (jSExceptionHandler instanceof E)) {
            this.devLoadingViewManager = ((E) jSExceptionHandler).h0();
        }
    }

    /* access modifiers changed from: private */
    public static final void hide$lambda$1(DevLoadingModule devLoadingModule) {
        c cVar = devLoadingModule.devLoadingViewManager;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: private */
    public static final void showMessage$lambda$0(DevLoadingModule devLoadingModule, String str) {
        c cVar = devLoadingModule.devLoadingViewManager;
        if (cVar != null) {
            cVar.b(str);
        }
    }

    public void hide() {
        UiThreadUtil.runOnUiThread(new W7.a(this));
    }

    public void showMessage(String str, Double d10, Double d11) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        UiThreadUtil.runOnUiThread(new b(this, str));
    }
}
