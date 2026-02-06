package com.facebook.react;

import C7.i;
import C7.j;
import I7.c;
import I7.h;
import L7.b;
import android.app.Application;
import com.facebook.react.V;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.I;
import java.util.List;
import n7.C3863a;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    private final Application f40298a;

    /* renamed from: b  reason: collision with root package name */
    private J f40299b;

    class a implements j {
        a() {
        }

        public i e(String str) {
            return null;
        }
    }

    protected O(Application application) {
        this.f40298a = application;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ UIManager h(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public synchronized J c() {
        try {
            if (this.f40299b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.f40299b = createReactInstanceManager();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f40299b;
    }

    /* access modifiers changed from: protected */
    public J createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        M baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return baseReactInstanceManagerBuilder.b();
    }

    public boolean d() {
        return true;
    }

    public j e() {
        return new a();
    }

    public abstract boolean f();

    public synchronized boolean g() {
        boolean z10;
        if (this.f40299b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public final Application getApplication() {
        return this.f40298a;
    }

    /* access modifiers changed from: protected */
    public M getBaseReactInstanceManagerBuilder() {
        M p10 = J.v().d(this.f40298a).n(getJSMainModuleName()).w(f()).h(getDevSupportManagerFactory()).g(getDevLoadingViewManager()).t(d()).u(e()).m(getJSExceptionHandler()).p(b());
        getRedBoxHandler();
        M q10 = p10.s((I7.i) null).o(getJavaScriptExecutorFactory()).v(getUIManagerProvider()).i(LifecycleState.BEFORE_CREATE).r(getReactPackageTurboModuleManagerDelegateBuilder()).l(getJSEngineResolutionAlgorithm()).f(getChoreographerProvider()).q(getPausedInDebuggerOverlayManager());
        for (P a10 : getPackages()) {
            q10.a(a10);
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            q10.j(jSBundleFile);
        } else {
            q10.e((String) C3863a.c(getBundleAssetName()));
        }
        return q10;
    }

    /* access modifiers changed from: protected */
    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    /* access modifiers changed from: protected */
    public b getChoreographerProvider() {
        return null;
    }

    /* access modifiers changed from: protected */
    public c getDevLoadingViewManager() {
        return null;
    }

    /* access modifiers changed from: protected */
    public I getDevSupportManagerFactory() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getJSBundleFile() {
        return null;
    }

    /* access modifiers changed from: protected */
    public C3362h getJSEngineResolutionAlgorithm() {
        return null;
    }

    /* access modifiers changed from: protected */
    public JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getJSMainModuleName() {
        return "index.android";
    }

    /* access modifiers changed from: protected */
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract List<P> getPackages();

    /* access modifiers changed from: protected */
    public h getPausedInDebuggerOverlayManager() {
        return null;
    }

    /* access modifiers changed from: protected */
    public V.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    /* access modifiers changed from: protected */
    public I7.i getRedBoxHandler() {
        return null;
    }

    /* access modifiers changed from: protected */
    public UIManagerProvider getUIManagerProvider() {
        return new N();
    }
}
