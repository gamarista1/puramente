package com.facebook.react;

import C7.j;
import I7.e;
import I7.g;
import I7.h;
import I7.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1680b0;
import com.facebook.react.V;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.I;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.e0;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C3408e;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.n0;
import com.facebook.soloader.SoLoader;
import g6.C3538a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n7.C3863a;
import z8.C4236a;
import z8.C4237b;

public class J {

    /* renamed from: E  reason: collision with root package name */
    private static final String f40223E = "J";

    /* renamed from: A  reason: collision with root package name */
    private final V.a f40224A;

    /* renamed from: B  reason: collision with root package name */
    private List f40225B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public boolean f40226C = true;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public volatile boolean f40227D = false;

    /* renamed from: a  reason: collision with root package name */
    private final Set f40228a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b  reason: collision with root package name */
    private volatile LifecycleState f40229b;

    /* renamed from: c  reason: collision with root package name */
    private f f40230c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Thread f40231d;

    /* renamed from: e  reason: collision with root package name */
    private final JavaScriptExecutorFactory f40232e;

    /* renamed from: f  reason: collision with root package name */
    private Collection f40233f = null;

    /* renamed from: g  reason: collision with root package name */
    private final JSBundleLoader f40234g;

    /* renamed from: h  reason: collision with root package name */
    private final String f40235h;

    /* renamed from: i  reason: collision with root package name */
    private final List f40236i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final I7.e f40237j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f40238k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f40239l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f40240m;

    /* renamed from: n  reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f40241n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f40242o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private volatile ReactContext f40243p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Context f40244q;

    /* renamed from: r  reason: collision with root package name */
    private U7.b f40245r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public Activity f40246s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public ReactInstanceManagerInspectorTarget f40247t;

    /* renamed from: u  reason: collision with root package name */
    private final Collection f40248u = Collections.synchronizedList(new ArrayList());

    /* renamed from: v  reason: collision with root package name */
    private volatile boolean f40249v = false;

    /* renamed from: w  reason: collision with root package name */
    private volatile Boolean f40250w = Boolean.FALSE;

    /* renamed from: x  reason: collision with root package name */
    private final C3363i f40251x;

    /* renamed from: y  reason: collision with root package name */
    private final JSExceptionHandler f40252y;

    /* renamed from: z  reason: collision with root package name */
    private final UIManagerProvider f40253z;

    class a implements U7.b {
        a() {
        }

        public void a() {
            J.this.M();
        }
    }

    class b implements e0 {
        b() {
        }

        public Activity a() {
            return J.this.f40246s;
        }

        public JavaScriptExecutorFactory b() {
            return J.this.F();
        }

        public View c(String str) {
            Activity a10 = a();
            if (a10 == null) {
                return null;
            }
            Z z10 = new Z(a10);
            z10.setIsFabric(M7.b.i());
            z10.s(J.this, str, new Bundle());
            return z10;
        }

        public void d(String str) {
        }

        public void f(View view) {
            if (view instanceof Z) {
                ((Z) view).t();
            }
        }

        public void h() {
            J.this.x0();
        }
    }

    class c implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ V7.a f40256a;

        c(V7.a aVar) {
            this.f40256a = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(boolean z10, V7.a aVar) {
            if (!J.this.f40227D) {
                if (z10) {
                    J.this.f40237j.z();
                } else if (!J.this.f40237j.C() || aVar.m() || J.this.f40226C) {
                    aVar.k(false);
                    J.this.p0();
                } else {
                    J.this.h0();
                }
            }
        }

        public void a(boolean z10) {
            UiThreadUtil.runOnUiThread(new K(this, z10, this.f40256a));
        }
    }

    class d implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f40258a;

        d(View view) {
            this.f40258a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f40258a.removeOnAttachStateChangeListener(this);
            J.this.f40237j.r(true);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    private static class e implements ReactInstanceManagerInspectorTarget.TargetDelegate {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f40260a;

        class a implements e.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ J f40261a;

            a(J j10) {
                this.f40261a = j10;
            }

            public void onResume() {
                UiThreadUtil.assertOnUiThread();
                if (this.f40261a.f40247t != null) {
                    this.f40261a.f40247t.sendDebuggerResumeCommand();
                }
            }
        }

        public e(J j10) {
            this.f40260a = new WeakReference(j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            J j10 = (J) this.f40260a.get();
            if (j10 != null) {
                j10.f40237j.z();
            }
        }

        public Map getMetadata() {
            Context context;
            J j10 = (J) this.f40260a.get();
            if (j10 != null) {
                context = j10.f40244q;
            } else {
                context = null;
            }
            return com.facebook.react.modules.systeminfo.a.e(context);
        }

        public void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            H7.a.a(str, inspectorNetworkRequestListener);
        }

        public void onReload() {
            UiThreadUtil.runOnUiThread(new L(this));
        }

        public void onSetPausedInDebuggerMessage(String str) {
            J j10 = (J) this.f40260a.get();
            if (j10 != null) {
                if (str == null) {
                    j10.f40237j.g();
                } else {
                    j10.f40237j.b(str, new a(j10));
                }
            }
        }
    }

    private class f {

        /* renamed from: a  reason: collision with root package name */
        private final JavaScriptExecutorFactory f40263a;

        /* renamed from: b  reason: collision with root package name */
        private final JSBundleLoader f40264b;

        public f(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f40263a = (JavaScriptExecutorFactory) C3863a.c(javaScriptExecutorFactory);
            this.f40264b = (JSBundleLoader) C3863a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f40264b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f40263a;
        }
    }

    J(Context context, Activity activity, U7.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z10, I i10, boolean z11, boolean z12, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, i iVar, boolean z13, I7.b bVar2, int i11, int i12, UIManagerProvider uIManagerProvider, Map map, V.a aVar, j jVar, I7.c cVar, L7.b bVar3, h hVar) {
        L7.b bVar4;
        Context context2 = context;
        boolean z14 = z10;
        U5.a.b(f40223E, "ReactInstanceManager.ctor()");
        L(context);
        C3408e.g(context);
        this.f40244q = context2;
        this.f40246s = activity;
        this.f40245r = bVar;
        this.f40232e = javaScriptExecutorFactory;
        this.f40234g = jSBundleLoader;
        String str2 = str;
        this.f40235h = str2;
        ArrayList arrayList = new ArrayList();
        this.f40236i = arrayList;
        this.f40238k = z14;
        this.f40239l = z11;
        this.f40240m = z12;
        C4236a.c(0, "ReactInstanceManager.initDevSupportManager");
        I7.e a10 = i10.a(context, x(), str2, z10, iVar, bVar2, i11, map, jVar, cVar, hVar);
        this.f40237j = a10;
        C4236a.i(0);
        this.f40241n = notThreadSafeBridgeIdleDebugListener;
        this.f40229b = lifecycleState;
        this.f40251x = new C3363i(context2);
        this.f40252y = jSExceptionHandler;
        this.f40224A = aVar;
        synchronized (arrayList) {
            try {
                f6.c.a().c(C3538a.f43658d, "RNCore: Use Split Packages");
                arrayList.add(new C3332c(this, new a(), z13, i12));
                if (z14) {
                    arrayList.add(new C3360f());
                }
                arrayList.addAll(list);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f40253z = uIManagerProvider;
        if (bVar3 != null) {
            bVar4 = bVar3;
        } else {
            bVar4 = L7.a.b();
        }
        com.facebook.react.modules.core.b.i(bVar4);
        if (z14) {
            a10.w();
        }
        r0();
    }

    private void C(S s10, ReactContext reactContext) {
        U5.a.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (s10.getState().compareAndSet(1, 0)) {
            int uIManagerType = s10.getUIManagerType();
            if (uIManagerType == 2) {
                int rootViewTag = s10.getRootViewTag();
                if (rootViewTag != -1) {
                    UIManager g10 = n0.g(reactContext, uIManagerType);
                    if (g10 != null) {
                        g10.stopSurface(rootViewTag);
                    } else {
                        U5.a.I("ReactNative", "Failed to stop surface, UIManager has already gone away");
                    }
                } else {
                    ReactSoftExceptionLogger.logSoftException(f40223E, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
            } else {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(s10.getRootViewTag());
            }
            w(s10);
        }
    }

    /* access modifiers changed from: private */
    public JavaScriptExecutorFactory F() {
        return this.f40232e;
    }

    private ReactInstanceManagerInspectorTarget G() {
        if (this.f40247t == null && InspectorFlags.getFuseboxEnabled()) {
            this.f40247t = new ReactInstanceManagerInspectorTarget(new e(this));
        }
        return this.f40247t;
    }

    static void L(Context context) {
        SoLoader.m(context, false);
    }

    /* access modifiers changed from: private */
    public void M() {
        UiThreadUtil.assertOnUiThread();
        U7.b bVar = this.f40245r;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void N(int i10, S s10) {
        C4236a.g(0, "pre_rootView.onAttachedToReactInstance", i10);
        s10.a(101);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O() {
        f fVar = this.f40230c;
        if (fVar != null) {
            t0(fVar);
            this.f40230c = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P(ReactApplicationContext reactApplicationContext) {
        try {
            u0(reactApplicationContext);
        } catch (Exception e10) {
            this.f40237j.handleException(e10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0008 A[LOOP:0: B:2:0x0008->B:23:0x0008, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void Q(com.facebook.react.J.f r3) {
        /*
            r2 = this;
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.REACT_CONTEXT_THREAD_END
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r0)
            java.lang.Boolean r0 = r2.f40250w
            monitor-enter(r0)
        L_0x0008:
            java.lang.Boolean r1 = r2.f40250w     // Catch:{ all -> 0x0016 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0018
            java.lang.Boolean r1 = r2.f40250w     // Catch:{ InterruptedException -> 0x0008 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0008
        L_0x0016:
            r3 = move-exception
            goto L_0x0061
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r0 = 1
            r2.f40249v = r0
            r0 = -4
            r1 = 0
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x0055 }
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.VM_INIT     // Catch:{ Exception -> 0x0055 }
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r0)     // Catch:{ Exception -> 0x0055 }
            com.facebook.react.bridge.JavaScriptExecutorFactory r0 = r3.b()     // Catch:{ Exception -> 0x0055 }
            com.facebook.react.bridge.JavaScriptExecutor r0 = r0.create()     // Catch:{ Exception -> 0x0055 }
            com.facebook.react.bridge.JSBundleLoader r3 = r3.a()     // Catch:{ Exception -> 0x0055 }
            com.facebook.react.bridge.ReactApplicationContext r3 = r2.y(r0, r3)     // Catch:{ Exception -> 0x0055 }
            r2.f40231d = r1     // Catch:{ Exception -> 0x004e }
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START     // Catch:{ Exception -> 0x004e }
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r0)     // Catch:{ Exception -> 0x004e }
            com.facebook.react.E r0 = new com.facebook.react.E     // Catch:{ Exception -> 0x004e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x004e }
            com.facebook.react.F r1 = new com.facebook.react.F     // Catch:{ Exception -> 0x004e }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x004e }
            r3.runOnNativeModulesQueueThread(r1)     // Catch:{ Exception -> 0x004e }
            com.facebook.react.bridge.UiThreadUtil.runOnUiThread(r0)     // Catch:{ Exception -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r3 = move-exception
            I7.e r0 = r2.f40237j
            r0.handleException(r3)
        L_0x0054:
            return
        L_0x0055:
            r3 = move-exception
            r0 = 0
            r2.f40249v = r0
            r2.f40231d = r1
            I7.e r0 = r2.f40237j
            r0.handleException(r3)
            return
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.J.Q(com.facebook.react.J$f):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R(B[] bArr, ReactApplicationContext reactApplicationContext) {
        U();
        for (B b10 : bArr) {
            if (b10 != null) {
                b10.a(reactApplicationContext);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void S() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    private synchronized void U() {
        if (this.f40229b == LifecycleState.RESUMED) {
            X(true);
        }
    }

    private synchronized void V() {
        try {
            ReactContext D10 = D();
            if (D10 != null) {
                if (this.f40229b == LifecycleState.RESUMED) {
                    D10.onHostPause();
                    this.f40229b = LifecycleState.BEFORE_RESUME;
                }
                if (this.f40229b == LifecycleState.BEFORE_RESUME) {
                    D10.onHostDestroy(this.f40240m);
                }
            }
            this.f40229b = LifecycleState.BEFORE_CREATE;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private synchronized void W() {
        try {
            ReactContext D10 = D();
            if (D10 != null) {
                if (this.f40229b == LifecycleState.BEFORE_CREATE) {
                    D10.onHostResume(this.f40246s);
                    D10.onHostPause();
                } else if (this.f40229b == LifecycleState.RESUMED) {
                    D10.onHostPause();
                }
            }
            this.f40229b = LifecycleState.BEFORE_RESUME;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private synchronized void X(boolean z10) {
        try {
            ReactContext D10 = D();
            if (D10 != null) {
                if (!z10 && this.f40229b != LifecycleState.BEFORE_RESUME) {
                    if (this.f40229b == LifecycleState.BEFORE_CREATE) {
                    }
                }
                D10.onHostResume(this.f40246s);
            }
            this.f40229b = LifecycleState.RESUMED;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public void h0() {
        U5.a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        o0(this.f40232e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f40237j.u(), this.f40237j.l()));
    }

    private void l0(P p10, C3364j jVar) {
        C4237b.a(0, "processPackage").b("className", p10.getClass().getSimpleName()).c();
        boolean z10 = p10 instanceof S;
        if (z10) {
            ((S) p10).b();
        }
        jVar.b(p10);
        if (z10) {
            ((S) p10).a();
        }
        C4237b.b(0).c();
    }

    private NativeModuleRegistry m0(ReactApplicationContext reactApplicationContext, List list) {
        C3364j jVar = new C3364j(reactApplicationContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f40236i) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    P p10 = (P) it.next();
                    C4236a.c(0, "createAndProcessCustomReactPackage");
                    l0(p10, jVar);
                    C4236a.i(0);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        C4236a.c(0, "buildNativeModuleRegistry");
        try {
            return jVar.a();
        } finally {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void o0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        U5.a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        f fVar = new f(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f40231d == null) {
            t0(fVar);
        } else {
            this.f40230c = fVar;
        }
    }

    /* access modifiers changed from: private */
    public void p0() {
        U5.a.b(f40223E, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        f6.c.a().c(C3538a.f43658d, "RNCore: load from BundleLoader");
        o0(this.f40232e, this.f40234g);
    }

    private void q0() {
        U5.a.b(f40223E, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        f6.c.a().c(C3538a.f43658d, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f40238k && this.f40235h != null) {
            V7.a B10 = this.f40237j.B();
            if (!C4236a.j(0)) {
                if (this.f40234g == null) {
                    this.f40237j.z();
                    return;
                } else {
                    this.f40237j.A(new c(B10));
                    return;
                }
            }
        }
        p0();
    }

    private void r0() {
        Method method;
        try {
            method = J.class.getMethod(f40223E, new Class[]{Exception.class});
        } catch (NoSuchMethodException e10) {
            U5.a.n("ReactInstanceHolder", "Failed to set cxx error handler function", e10);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    private void t0(f fVar) {
        U5.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        C3863a.b(!this.f40227D, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f40228a) {
            synchronized (this.f40242o) {
                try {
                    if (this.f40243p != null) {
                        w0(this.f40243p);
                        this.f40243p = null;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
        this.f40231d = new Thread((ThreadGroup) null, new D(this, fVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f40231d.start();
    }

    private void u(S s10) {
        int i10;
        WritableMap writableMap;
        WritableMap fromBundle;
        U5.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (s10.getState().compareAndSet(0, 1)) {
            C4236a.c(0, "attachRootViewToInstance");
            UIManager g10 = n0.g(this.f40243p, s10.getUIManagerType());
            if (g10 != null) {
                Bundle appProperties = s10.getAppProperties();
                if (s10.getUIManagerType() == 2) {
                    ViewGroup rootViewGroup = s10.getRootViewGroup();
                    String jSModuleName = s10.getJSModuleName();
                    if (appProperties == null) {
                        fromBundle = new WritableNativeMap();
                    } else {
                        fromBundle = Arguments.fromBundle(appProperties);
                    }
                    i10 = g10.startSurface(rootViewGroup, jSModuleName, fromBundle, s10.getWidthMeasureSpec(), s10.getHeightMeasureSpec());
                    s10.setShouldLogContentAppeared(true);
                } else {
                    ViewGroup rootViewGroup2 = s10.getRootViewGroup();
                    if (appProperties == null) {
                        writableMap = new WritableNativeMap();
                    } else {
                        writableMap = Arguments.fromBundle(appProperties);
                    }
                    i10 = g10.addRootView(rootViewGroup2, writableMap);
                    s10.setRootViewTag(i10);
                    s10.b();
                }
                C4236a.a(0, "pre_rootView.onAttachedToReactInstance", i10);
                UiThreadUtil.runOnUiThread(new C(i10, s10));
                C4236a.i(0);
                return;
            }
            throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
        }
    }

    private void u0(ReactApplicationContext reactApplicationContext) {
        U5.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        C4236a.c(0, "setupReactContext");
        synchronized (this.f40228a) {
            try {
                synchronized (this.f40242o) {
                    this.f40243p = (ReactContext) C3863a.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) C3863a.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.f40237j.y(reactApplicationContext);
                this.f40251x.a(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                for (S u10 : this.f40228a) {
                    u(u10);
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        UiThreadUtil.runOnUiThread(new G(this, (B[]) this.f40248u.toArray(new B[this.f40248u.size()]), reactApplicationContext));
        reactApplicationContext.runOnJSQueueThread(new H());
        reactApplicationContext.runOnNativeModulesQueueThread(new I());
        C4236a.i(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    public static M v() {
        return new M();
    }

    private void w(S s10) {
        UiThreadUtil.assertOnUiThread();
        s10.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = s10.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private void w0(ReactContext reactContext) {
        U5.a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f40229b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f40228a) {
            try {
                for (S C10 : this.f40228a) {
                    C(C10, reactContext);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f40251x.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f40237j.E(reactContext);
    }

    private e0 x() {
        return new b();
    }

    /* access modifiers changed from: private */
    public void x0() {
        ReactContext D10 = D();
        if (D10 == null || !D10.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f40223E, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            D10.emitDeviceEvent("toggleElementInspector");
        }
    }

    /* JADX INFO: finally extract failed */
    private ReactApplicationContext y(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager createUIManager;
        V.a aVar;
        U5.a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f40244q);
        JSExceptionHandler jSExceptionHandler = this.f40252y;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f40237j;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        CatalystInstanceImpl.Builder inspectorTarget = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(m0(bridgeReactContext, this.f40236i)).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler).setInspectorTarget(G());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        C4236a.c(0, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = inspectorTarget.build();
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            bridgeReactContext.initializeWithInstance(build);
            build.getRuntimeScheduler();
            if (M7.b.x() && (aVar = this.f40224A) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(build.getRuntimeExecutor(), aVar.c(this.f40236i).d(bridgeReactContext).a(), build.getJSCallInvokerHolder(), build.getNativeMethodCallInvokerHolder());
                build.setTurboModuleRegistry(turboModuleManager);
                for (String module : turboModuleManager.getEagerInitModuleNames()) {
                    turboModuleManager.getModule(module);
                }
            }
            UIManagerProvider uIManagerProvider = this.f40253z;
            if (!(uIManagerProvider == null || (createUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) == null)) {
                build.setFabricUIManager(createUIManager);
                createUIManager.initialize();
                build.setFabricUIManager(createUIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f40241n;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (C4236a.j(0)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", com.amazon.a.a.o.b.f37475af);
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            C4236a.c(0, "runJSBundle");
            build.runJSBundle();
            C4236a.i(0);
            return bridgeReactContext;
        } catch (Throwable th2) {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.f40236i.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4 = (com.facebook.react.P) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 instanceof com.facebook.react.b0) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4 = ((com.facebook.react.b0) r4).createViewManager(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r6.f40236i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.uimanager.ViewManager A(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f40242o
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r1 = r6.D()     // Catch:{ all -> 0x003d }
            com.facebook.react.bridge.ReactApplicationContext r1 = (com.facebook.react.bridge.ReactApplicationContext) r1     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r1 == 0) goto L_0x003f
            boolean r3 = r1.hasActiveReactInstance()     // Catch:{ all -> 0x003d }
            if (r3 != 0) goto L_0x0013
            goto L_0x003f
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            java.util.List r3 = r6.f40236i
            monitor-enter(r3)
            java.util.List r0 = r6.f40236i     // Catch:{ all -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0037 }
        L_0x001d:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0037 }
            com.facebook.react.P r4 = (com.facebook.react.P) r4     // Catch:{ all -> 0x0037 }
            boolean r5 = r4 instanceof com.facebook.react.b0     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x001d
            com.facebook.react.b0 r4 = (com.facebook.react.b0) r4     // Catch:{ all -> 0x0037 }
            com.facebook.react.uimanager.ViewManager r4 = r4.createViewManager(r1, r7)     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return r4
        L_0x0037:
            r7 = move-exception
            goto L_0x003b
        L_0x0039:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return r2
        L_0x003b:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r7
        L_0x003d:
            r7 = move-exception
            goto L_0x0041
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r2
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.J.A(java.lang.String):com.facebook.react.uimanager.ViewManager");
    }

    public void B(S s10) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.f40228a.remove(s10) && (reactContext = this.f40243p) != null && reactContext.hasActiveReactInstance()) {
            C(s10, reactContext);
        }
    }

    public ReactContext D() {
        ReactContext reactContext;
        synchronized (this.f40242o) {
            reactContext = this.f40243p;
        }
        return reactContext;
    }

    public I7.e E() {
        return this.f40237j;
    }

    public List H(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        C4236a.c(0, "createAllViewManagers");
        try {
            if (this.f40225B == null) {
                synchronized (this.f40236i) {
                    if (this.f40225B == null) {
                        ArrayList arrayList = new ArrayList();
                        for (P createViewManagers : this.f40236i) {
                            arrayList.addAll(createViewManagers.createViewManagers(reactApplicationContext));
                        }
                        this.f40225B = arrayList;
                        C4236a.i(0);
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                        return arrayList;
                    }
                }
            }
            List list = this.f40225B;
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th2) {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r10.f40236i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0027, code lost:
        if (r10.f40233f != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        r4 = new java.util.HashSet();
        r5 = r10.f40236i.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r5.hasNext() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r6 = (com.facebook.react.P) r5.next();
        z8.C4237b.a(0, "ReactInstanceManager.getViewManagerName").b("Package", r6.getClass().getSimpleName()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if ((r6 instanceof com.facebook.react.b0) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r6 = ((com.facebook.react.b0) r6).getViewManagerNames(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r6 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        r4.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        U5.a.K("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", r6.getClass().getSimpleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        z8.C4236a.i(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r10.f40233f = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        r3 = r10.f40233f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        z8.C4236a.i(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection I() {
        /*
            r10 = this;
            java.lang.String r0 = "ReactInstanceManager.getViewManagerNames"
            r1 = 0
            z8.C4236a.c(r1, r0)
            java.util.Collection r0 = r10.f40233f     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000f
            z8.C4236a.i(r1)
            return r0
        L_0x000f:
            java.lang.Object r0 = r10.f40242o     // Catch:{ all -> 0x008b }
            monitor-enter(r0)     // Catch:{ all -> 0x008b }
            com.facebook.react.bridge.ReactContext r3 = r10.D()     // Catch:{ all -> 0x008d }
            com.facebook.react.bridge.ReactApplicationContext r3 = (com.facebook.react.bridge.ReactApplicationContext) r3     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x008f
            boolean r4 = r3.hasActiveReactInstance()     // Catch:{ all -> 0x008d }
            if (r4 != 0) goto L_0x0021
            goto L_0x008f
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            java.util.List r0 = r10.f40236i     // Catch:{ all -> 0x008b }
            monitor-enter(r0)     // Catch:{ all -> 0x008b }
            java.util.Collection r4 = r10.f40233f     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x0082
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.util.List r5 = r10.f40236i     // Catch:{ all -> 0x0067 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0067 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x0080
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0067 }
            com.facebook.react.P r6 = (com.facebook.react.P) r6     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "ReactInstanceManager.getViewManagerName"
            z8.b$a r7 = z8.C4237b.a(r1, r7)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "Package"
            java.lang.Class r9 = r6.getClass()     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x0067 }
            z8.b$a r7 = r7.b(r8, r9)     // Catch:{ all -> 0x0067 }
            r7.c()     // Catch:{ all -> 0x0067 }
            boolean r7 = r6 instanceof com.facebook.react.b0     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0069
            com.facebook.react.b0 r6 = (com.facebook.react.b0) r6     // Catch:{ all -> 0x0067 }
            java.util.Collection r6 = r6.getViewManagerNames(r3)     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x007c
            r4.addAll(r6)     // Catch:{ all -> 0x0067 }
            goto L_0x007c
        L_0x0067:
            r3 = move-exception
            goto L_0x0089
        L_0x0069:
            java.lang.String r7 = "ReactNative"
            java.lang.String r8 = "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded"
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0067 }
            U5.a.K(r7, r8, r6)     // Catch:{ all -> 0x0067 }
        L_0x007c:
            z8.C4236a.i(r1)     // Catch:{ all -> 0x0067 }
            goto L_0x0034
        L_0x0080:
            r10.f40233f = r4     // Catch:{ all -> 0x0067 }
        L_0x0082:
            java.util.Collection r3 = r10.f40233f     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            z8.C4236a.i(r1)
            return r3
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r3     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            goto L_0x00a1
        L_0x008d:
            r3 = move-exception
            goto L_0x009f
        L_0x008f:
            java.lang.String r3 = "ReactNative"
            java.lang.String r4 = "Calling getViewManagerNames without active context"
            U5.a.I(r3, r4)     // Catch:{ all -> 0x008d }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            z8.C4236a.i(r1)
            return r3
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008b }
        L_0x00a1:
            z8.C4236a.i(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.J.I():java.util.Collection");
    }

    public void J(Exception exc) {
        this.f40237j.handleException(exc);
    }

    public boolean K() {
        return this.f40249v;
    }

    public void Y(Activity activity, int i10, int i11, Intent intent) {
        ReactContext D10 = D();
        if (D10 != null) {
            D10.onActivityResult(activity, i10, i11, intent);
        }
    }

    public void Z() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f40243p;
        if (reactContext == null) {
            U5.a.I(f40223E, "Instance detached from instance manager");
            M();
            return;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
        if (deviceEventManagerModule != null) {
            deviceEventManagerModule.emitHardwareBackPressed();
        }
    }

    public void a0(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 != null && (appearanceModule = (AppearanceModule) D10.getNativeModule(AppearanceModule.class)) != null) {
            appearanceModule.onConfigurationChanged(context);
        }
    }

    public void b0() {
        UiThreadUtil.assertOnUiThread();
        if (this.f40238k) {
            this.f40237j.r(false);
        }
        V();
        if (!this.f40240m) {
            this.f40246s = null;
        }
    }

    public void c0(Activity activity) {
        if (activity == this.f40246s) {
            b0();
        }
    }

    public void d0() {
        UiThreadUtil.assertOnUiThread();
        this.f40245r = null;
        if (this.f40238k) {
            this.f40237j.r(false);
        }
        W();
    }

    public void e0(Activity activity) {
        boolean z10;
        boolean z11 = false;
        if (this.f40239l) {
            if (this.f40246s != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3863a.a(z10);
        }
        Activity activity2 = this.f40246s;
        if (activity2 != null) {
            if (activity == activity2) {
                z11 = true;
            }
            C3863a.b(z11, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f40246s.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        d0();
    }

    public void f0(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f40246s = activity;
        if (this.f40238k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (!C1680b0.R(decorView)) {
                    decorView.addOnAttachStateChangeListener(new d(decorView));
                } else {
                    this.f40237j.r(true);
                }
            } else if (!this.f40239l) {
                this.f40237j.r(true);
            }
        }
        X(false);
    }

    public void g0(Activity activity, U7.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.f40245r = bVar;
        f0(activity);
    }

    public void i0(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 == null) {
            U5.a.I(f40223E, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) D10.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        D10.onNewIntent(this.f40246s, intent);
    }

    public void j0(Activity activity) {
        Activity activity2 = this.f40246s;
        if (activity2 != null && activity == activity2) {
            UiThreadUtil.assertOnUiThread();
            ReactContext D10 = D();
            if (D10 != null) {
                D10.onUserLeaveHint(activity);
            }
        }
    }

    public void k0(boolean z10) {
        UiThreadUtil.assertOnUiThread();
        ReactContext D10 = D();
        if (D10 != null) {
            D10.onWindowFocusChange(z10);
        }
    }

    public void n0() {
        C3863a.b(this.f40249v, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        q0();
    }

    public void s(B b10) {
        this.f40248u.add(b10);
    }

    public void s0(B b10) {
        this.f40248u.remove(b10);
    }

    public void t(S s10) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f40228a) {
            try {
                if (this.f40228a.add(s10)) {
                    w(s10);
                } else {
                    U5.a.m("ReactNative", "ReactRoot was attached multiple times");
                }
                ReactContext D10 = D();
                if (this.f40231d == null && D10 != null) {
                    u(s10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void v0() {
        UiThreadUtil.assertOnUiThread();
        this.f40237j.D();
    }

    public void z() {
        U5.a.b(f40223E, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (!this.f40249v) {
            this.f40249v = true;
            q0();
        }
    }
}
