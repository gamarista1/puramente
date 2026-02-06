package com.facebook.react.runtime;

import I7.e;
import android.content.res.AssetManager;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.C3360f;
import com.facebook.react.P;
import com.facebook.react.V;
import com.facebook.react.b0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.devsupport.l0;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.FabricUIManagerBinding;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C0;
import com.facebook.react.uimanager.C3408e;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.r;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import n7.C3863a;
import z8.C4236a;

final class ReactInstance {

    /* renamed from: h  reason: collision with root package name */
    private static final String f41248h = "ReactInstance";

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f41249i;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C3373b f41250a;

    /* renamed from: b  reason: collision with root package name */
    private final ReactQueueConfiguration f41251b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final TurboModuleManager f41252c;

    /* renamed from: d  reason: collision with root package name */
    private final FabricUIManager f41253d;

    /* renamed from: e  reason: collision with root package name */
    private final JavaTimerManager f41254e;

    /* renamed from: f  reason: collision with root package name */
    private final b f41255f;

    /* renamed from: g  reason: collision with root package name */
    private final JavaScriptContextHolder f41256g;
    @B7.a
    private final HybridData mHybridData;

    class a implements JSBundleLoaderDelegate {
        a() {
        }

        public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z10) {
            ReactInstance.this.f41250a.d(str);
            ReactInstance.this.loadJSBundleFromAssets(assetManager, str);
        }

        public void loadScriptFromFile(String str, String str2, boolean z10) {
            ReactInstance.this.f41250a.d(str2);
            ReactInstance.this.loadJSBundleFromFile(str, str2);
        }

        public void loadSplitBundleFromFile(String str, String str2) {
            ReactInstance.this.loadJSBundleFromFile(str, str2);
        }

        public void setSourceURLs(String str, String str2) {
            ReactInstance.this.f41250a.d(str);
        }
    }

    private static class b implements C0 {

        /* renamed from: a  reason: collision with root package name */
        private final List f41258a;

        /* renamed from: b  reason: collision with root package name */
        private final C3373b f41259b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f41260c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private Map f41261d = null;

        public b(List list, C3373b bVar) {
            this.f41258a = list;
            this.f41259b = bVar;
        }

        private ViewManager d(String str) {
            ViewManager createViewManager;
            if (this.f41260c.containsKey(str)) {
                return (ViewManager) this.f41260c.get(str);
            }
            for (P p10 : this.f41258a) {
                if ((p10 instanceof b0) && (createViewManager = ((b0) p10).createViewManager(this.f41259b, str)) != null) {
                    this.f41260c.put(str, createViewManager);
                    return createViewManager;
                }
            }
            return null;
        }

        public synchronized Collection a() {
            HashSet hashSet;
            hashSet = new HashSet();
            hashSet.addAll(e());
            hashSet.addAll(c().keySet());
            return hashSet;
        }

        public synchronized ViewManager b(String str) {
            ViewManager d10 = d(str);
            if (d10 != null) {
                return d10;
            }
            return (ViewManager) c().get(str);
        }

        public synchronized Map c() {
            try {
                Map map = this.f41261d;
                if (map != null) {
                    return map;
                }
                HashMap hashMap = new HashMap();
                for (P p10 : this.f41258a) {
                    if (!(p10 instanceof b0)) {
                        for (ViewManager viewManager : p10.createViewManagers(this.f41259b)) {
                            hashMap.put(viewManager.getName(), viewManager);
                        }
                    }
                }
                this.f41261d = hashMap;
                return hashMap;
            } finally {
                while (true) {
                }
            }
        }

        public synchronized Collection e() {
            HashSet hashSet;
            Collection viewManagerNames;
            hashSet = new HashSet();
            for (P p10 : this.f41258a) {
                if ((p10 instanceof b0) && (viewManagerNames = ((b0) p10).getViewManagerNames(this.f41259b)) != null) {
                    hashSet.addAll(viewManagerNames);
                }
            }
            return hashSet;
        }
    }

    private class c implements ReactJsExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        private final QueueThreadExceptionHandler f41262a;

        c(QueueThreadExceptionHandler queueThreadExceptionHandler) {
            this.f41262a = queueThreadExceptionHandler;
        }

        public void reportJsException(ReactJsExceptionHandler.ParsedError parsedError) {
            try {
                ((NativeExceptionsManagerSpec) C3863a.c(ReactInstance.this.f41252c.getModule(NativeExceptionsManagerSpec.NAME))).reportException(l0.b(parsedError));
            } catch (Exception e10) {
                this.f41262a.handleException(e10);
            }
        }
    }

    static {
        A();
    }

    ReactInstance(C3373b bVar, C3377f fVar, ComponentFactory componentFactory, e eVar, QueueThreadExceptionHandler queueThreadExceptionHandler, boolean z10, ReactHostInspectorTarget reactHostInspectorTarget) {
        C3373b bVar2 = bVar;
        QueueThreadExceptionHandler queueThreadExceptionHandler2 = queueThreadExceptionHandler;
        this.f41250a = bVar2;
        C4236a.c(0, "ReactInstance.initialize");
        ReactQueueConfigurationImpl create = ReactQueueConfigurationImpl.create(new ReactQueueConfigurationSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("v_native"), MessageQueueThreadSpec.newBackgroundThreadSpec("v_js")), queueThreadExceptionHandler2);
        this.f41251b = create;
        U5.a.b(f41248h, "Calling initializeMessageQueueThreads()");
        bVar2.initializeMessageQueueThreads(create);
        MessageQueueThread jSQueueThread = create.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = create.getNativeModulesQueueThread();
        com.facebook.react.modules.core.b.i(L7.a.b());
        if (z10) {
            eVar.w();
        }
        JSTimerExecutor createJSTimerExecutor = createJSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(bVar2, createJSTimerExecutor, com.facebook.react.modules.core.b.h(), eVar);
        this.f41254e = javaTimerManager;
        JSRuntimeFactory a10 = fVar.a();
        BindingsInstaller bindingsInstaller = fVar.getBindingsInstaller();
        boolean j10 = C4236a.j(0);
        this.mHybridData = initHybrid(a10, jSQueueThread, nativeModulesQueueThread, javaTimerManager, createJSTimerExecutor, new c(queueThreadExceptionHandler2), bindingsInstaller, j10, reactHostInspectorTarget);
        this.f41256g = new JavaScriptContextHolder(getJavaScriptContext());
        C4236a.c(0, "ReactInstance.initialize#initTurboModules");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3376e(bVar.c(), bVar.b()));
        if (z10) {
            arrayList.add(new C3360f());
        }
        arrayList.addAll(fVar.e());
        V a11 = fVar.g().c(arrayList).d(bVar2).a();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.f41252c = new TurboModuleManager(unbufferedRuntimeExecutor, a11, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        C4236a.i(0);
        C4236a.c(0, "ReactInstance.initialize#initFabric");
        b bVar3 = new b(arrayList, bVar2);
        this.f41255f = bVar3;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new b0(this));
        if (M7.b.t()) {
            HashMap hashMap = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new c0(), new d0(this, hashMap), new e0(this, hashMap));
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(bVar2, new B0((C0) bVar3), eventBeatManager);
        this.f41253d = fabricUIManager;
        C3408e.g(bVar);
        new FabricUIManagerBinding().register(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory, fVar.b());
        fabricUIManager.initialize();
        C4236a.i(0);
        C4236a.i(0);
    }

    private static synchronized void A() {
        synchronized (ReactInstance.class) {
            if (!f41249i) {
                SoLoader.t("rninstance");
                f41249i = true;
            }
        }
    }

    @B7.a
    private static native JSTimerExecutor createJSTimerExecutor();

    private native long getJavaScriptContext();

    private native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private native RuntimeScheduler getRuntimeScheduler();

    private native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private native void handleMemoryPressureJs(int i10);

    @B7.a
    private native HybridData initHybrid(JSRuntimeFactory jSRuntimeFactory, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, JavaTimerManager javaTimerManager, JSTimerExecutor jSTimerExecutor, ReactJsExceptionHandler reactJsExceptionHandler, BindingsInstaller bindingsInstaller, boolean z10, ReactHostInspectorTarget reactHostInspectorTarget);

    @B7.a
    private native void installGlobals(boolean z10);

    /* access modifiers changed from: private */
    public native void loadJSBundleFromAssets(AssetManager assetManager, String str);

    /* access modifiers changed from: private */
    public native void loadJSBundleFromFile(String str, String str2);

    private native void registerSegmentNative(int i10, String str);

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        C4236a.c(0, "initializeEagerTurboModules");
        for (String module : this.f41252c.getEagerInitModuleNames()) {
            this.f41252c.getModule(module);
        }
        C4236a.i(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String[] v() {
        Collection a10 = this.f41255f.a();
        if (a10.size() >= 1) {
            return (String[]) a10.toArray(new String[0]);
        }
        U5.a.m(f41248h, "No ViewManager names found");
        return new String[0];
    }

    /* access modifiers changed from: private */
    public /* synthetic */ NativeMap x(Map map, String str) {
        ViewManager b10 = this.f41255f.b(str);
        if (b10 == null) {
            return null;
        }
        return (NativeMap) UIManagerModule.getConstantsForViewManager(b10, map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ NativeMap y(Map map) {
        Map<String, Object> createConstants = UIManagerModule.createConstants(new ArrayList(this.f41255f.c().values()), (Map<String, Object>) null, map);
        Collection e10 = this.f41255f.e();
        if (e10.size() > 0) {
            createConstants.put("ViewManagerNames", new ArrayList(e10));
            createConstants.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap(createConstants);
    }

    public void B(int i10, String str) {
        registerSegmentNative(i10, str);
    }

    /* access modifiers changed from: package-private */
    public void C(h0 h0Var) {
        String str = f41248h;
        U5.a.b(str, "startSurface() is called with surface: " + h0Var.n());
        C4236a.c(0, "ReactInstance.startSurface");
        ViewGroup a10 = h0Var.a();
        if (a10 != null) {
            if (a10.getId() != -1) {
                ReactSoftExceptionLogger.logSoftException(str, new r("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
                a10.setId(-1);
            }
            if (h0Var.q()) {
                this.f41253d.attachRootView(h0Var.m(), a10);
            } else {
                this.f41253d.startSurface(h0Var.m(), h0Var.h(), a10);
            }
            C4236a.i(0);
            return;
        }
        throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
    }

    /* access modifiers changed from: package-private */
    public void D(h0 h0Var) {
        String str = f41248h;
        U5.a.b(str, "stopSurface() is called with surface: " + h0Var.n());
        this.f41253d.stopSurface(h0Var.m());
    }

    /* access modifiers changed from: package-private */
    public native void callFunctionOnModule(String str, String str2, NativeArray nativeArray);

    /* access modifiers changed from: package-private */
    public native RuntimeExecutor getBufferedRuntimeExecutor();

    /* access modifiers changed from: package-private */
    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    /* access modifiers changed from: package-private */
    public void j() {
        U5.a.b(f41248h, "ReactInstance.destroy() is called.");
        this.f41251b.destroy();
        this.f41252c.invalidate();
        this.f41253d.invalidate();
        this.f41254e.x();
        this.mHybridData.resetNative();
        this.f41256g.clear();
    }

    /* access modifiers changed from: package-private */
    public EventDispatcher k() {
        return this.f41253d.getEventDispatcher();
    }

    /* access modifiers changed from: package-private */
    public JavaScriptContextHolder l() {
        return this.f41256g;
    }

    public NativeModule m(Class cls) {
        Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
        if (aVar != null) {
            return n(aVar.name());
        }
        return null;
    }

    public NativeModule n(String str) {
        NativeModule module;
        synchronized (this.f41252c) {
            module = this.f41252c.getModule(str);
        }
        return module;
    }

    public Collection o() {
        return new ArrayList(this.f41252c.getModules());
    }

    public ReactQueueConfiguration p() {
        return this.f41251b;
    }

    /* access modifiers changed from: package-private */
    public FabricUIManager q() {
        return this.f41253d;
    }

    public void r(int i10) {
        try {
            handleMemoryPressureJs(i10);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(f41248h, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public boolean s(Class cls) {
        Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
        if (aVar != null) {
            return this.f41252c.hasModule(aVar.name());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        a0 a0Var = new a0(this);
        if (M7.b.n()) {
            this.f41251b.getNativeModulesQueueThread().runOnQueue(a0Var);
        } else {
            a0Var.run();
        }
    }

    /* access modifiers changed from: package-private */
    public native void unregisterFromInspector();

    public void z(JSBundleLoader jSBundleLoader) {
        C4236a.c(0, "ReactInstance.loadJSBundle");
        jSBundleLoader.loadScript(new a());
        C4236a.i(0);
    }
}
