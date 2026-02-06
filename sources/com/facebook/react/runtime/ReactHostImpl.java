package com.facebook.react.runtime;

import C7.j;
import I7.e;
import I7.h;
import I7.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.A;
import com.facebook.react.B;
import com.facebook.react.C3363i;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C3342i;
import com.facebook.react.devsupport.E;
import com.facebook.react.devsupport.I;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n7.C3863a;
import yf.C6787a;

@B7.a
public class ReactHostImpl implements A {

    /* renamed from: B  reason: collision with root package name */
    private static final AtomicInteger f41212B = new AtomicInteger(0);

    /* renamed from: A  reason: collision with root package name */
    private b8.d f41213A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f41214a;

    /* renamed from: b  reason: collision with root package name */
    private final C3377f f41215b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentFactory f41216c;

    /* renamed from: d  reason: collision with root package name */
    private I7.e f41217d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f41218e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f41219f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f41220g;

    /* renamed from: h  reason: collision with root package name */
    private final C3363i f41221h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f41222i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f41223j;

    /* renamed from: k  reason: collision with root package name */
    private final C3372a f41224k;

    /* renamed from: l  reason: collision with root package name */
    private ReactInstance f41225l;

    /* renamed from: m  reason: collision with root package name */
    private final C3372a f41226m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicReference f41227n;

    /* renamed from: o  reason: collision with root package name */
    private final AtomicReference f41228o;

    /* renamed from: p  reason: collision with root package name */
    private final C3374c f41229p;

    /* renamed from: q  reason: collision with root package name */
    private final f0 f41230q;

    /* renamed from: r  reason: collision with root package name */
    private final int f41231r;

    /* renamed from: s  reason: collision with root package name */
    private MemoryPressureListener f41232s;

    /* renamed from: t  reason: collision with root package name */
    private U7.b f41233t;

    /* renamed from: u  reason: collision with root package name */
    private final List f41234u;

    /* renamed from: v  reason: collision with root package name */
    private final List f41235v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public ReactHostInspectorTarget f41236w;

    /* renamed from: x  reason: collision with root package name */
    private volatile boolean f41237x;

    /* renamed from: y  reason: collision with root package name */
    private b8.d f41238y;

    /* renamed from: z  reason: collision with root package name */
    private b8.d f41239z;

    class a implements e.a {
        a() {
        }

        public void onResume() {
            UiThreadUtil.assertOnUiThread();
            if (ReactHostImpl.this.f41236w != null) {
                ReactHostImpl.this.f41236w.sendDebuggerResumeCommand();
            }
        }
    }

    class b implements I7.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f41241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f41242b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b8.e f41243c;

        b(String str, E e10, b8.e eVar) {
            this.f41241a = str;
            this.f41242b = e10;
            this.f41243c = eVar;
        }

        public void a(Exception exc) {
            this.f41243c.c(exc);
        }

        public void onSuccess() {
            ReactHostImpl.this.A1("loadJSBundleFromMetro()", "Creating BundleLoader");
            this.f41243c.d(JSBundleLoader.createCachedBundleFromNetworkLoader(this.f41241a, this.f41242b.l()));
        }
    }

    private static class c {
        /* access modifiers changed from: package-private */

        /* renamed from: a  reason: collision with root package name */
        public final ReactInstance f41245a;

        /* renamed from: b  reason: collision with root package name */
        final ReactContext f41246b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f41247c;

        private c(ReactInstance reactInstance, ReactContext reactContext, boolean z10) {
            this.f41245a = reactInstance;
            this.f41246b = reactContext;
            this.f41247c = z10;
        }
    }

    private interface d {
        void a(ReactInstance reactInstance);
    }

    private interface e {
        ReactInstance a(b8.d dVar, String str);
    }

    public ReactHostImpl(Context context, C3377f fVar, ComponentFactory componentFactory, boolean z10, boolean z11) {
        this(context, fVar, componentFactory, Executors.newSingleThreadExecutor(), b8.d.f36261j, z10, z11);
    }

    private b8.d A0() {
        z1("getOrCreateReactInstanceTask()");
        return (b8.d) this.f41224k.d(new A(this));
    }

    /* access modifiers changed from: private */
    public void A1(String str, String str2) {
        C3374c cVar = this.f41229p;
        cVar.a("ReactHost{" + this.f41231r + "}." + str + ": " + str2);
    }

    private b8.d B0(String str) {
        b8.d dVar;
        z1("getOrCreateReloadTask()");
        E1("getOrCreateReloadTask()", str);
        e i02 = i0("Reload", "getOrCreateReloadTask()", str);
        if (this.f41239z == null) {
            if (M7.b.c()) {
                dVar = (b8.d) this.f41224k.b();
            } else {
                dVar = (b8.d) this.f41224k.a();
            }
            this.f41239z = dVar.k(new C3383l(this, i02, str), this.f41219f).k(new C3384m(this, i02), this.f41218e).k(new C3385n(this, i02), this.f41219f).k(new C3386o(this, i02), this.f41218e).k(new C3387p(this, i02), this.f41218e).k(new C3388q(this, str), this.f41218e);
        }
        return this.f41239z;
    }

    private void B1(boolean z10) {
        if (this.f41223j) {
            this.f41217d.r(z10);
        }
    }

    /* access modifiers changed from: private */
    public b8.d C0() {
        if (this.f41238y == null) {
            A1("getOrCreateStartTask()", "Schedule");
            if (E7.a.f30669b) {
                C3863a.b(M7.b.e(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
                C3863a.b(M7.b.i(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
                C3863a.b(M7.b.x(), "useTurboModules FeatureFlag must be set to start ReactNative.");
            }
            this.f41238y = N1().k(new C3380i(this), this.f41218e);
        }
        return this.f41238y;
    }

    private void C1(ReactContext reactContext) {
        this.f41230q.b(reactContext);
        H1((Activity) null);
    }

    private void E1(String str, String str2) {
        F1(str, str2, (Throwable) null);
    }

    private void F1(String str, String str2, Throwable th2) {
        String str3 = "raiseSoftException(" + str + ")";
        A1(str3, str2);
        ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(str3 + ": " + str2, th2));
    }

    private void H1(Activity activity) {
        this.f41227n.set(activity);
        if (activity != null) {
            this.f41228o.set(new WeakReference(activity));
        }
    }

    private void I1(String str, ReactInstance reactInstance) {
        A1(str, "Restarting previously running React Native Surfaces");
        synchronized (this.f41220g) {
            try {
                for (h0 C10 : this.f41220g) {
                    reactInstance.C(C10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private b8.d J0() {
        z1("isMetroRunning()");
        b8.e eVar = new b8.e();
        f().A(new L(this, eVar));
        return eVar.a();
    }

    private void K1(String str, ReactInstance reactInstance) {
        A1(str, "Stopping all React Native surfaces");
        synchronized (this.f41220g) {
            try {
                for (h0 h0Var : this.f41220g) {
                    reactInstance.D(h0Var);
                    h0Var.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object L0(String str, d dVar, b8.d dVar2) {
        ReactInstance reactInstance;
        if (M7.b.c()) {
            reactInstance = (ReactInstance) dVar2.o();
        } else {
            reactInstance = this.f41225l;
        }
        if (reactInstance == null) {
            E1(str, "Execute: reactInstance is null. Dropping work.");
            return null;
        }
        dVar.a(reactInstance);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void M0(b8.d dVar) {
        if (!dVar.s()) {
            return null;
        }
        G0(dVar.n());
        return null;
    }

    private void M1(ReactInstance reactInstance) {
        boolean z10;
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.f41236w;
                if (reactHostInspectorTarget == null || !reactHostInspectorTarget.isValid()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                C3863a.b(z10, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    /* access modifiers changed from: private */
    public b8.d N1() {
        return O1(0, 4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean O0(String str, d dVar, b8.d dVar2) {
        ReactInstance reactInstance;
        if (M7.b.c()) {
            reactInstance = (ReactInstance) dVar2.o();
        } else {
            reactInstance = this.f41225l;
        }
        if (reactInstance == null) {
            E1(str, "Execute: reactInstance is null. Dropping work.");
            return Boolean.FALSE;
        }
        dVar.a(reactInstance);
        return Boolean.TRUE;
    }

    private b8.d O1(int i10, int i11) {
        if (this.f41239z != null) {
            A1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return this.f41239z;
        }
        if (this.f41213A != null) {
            if (i10 < i11) {
                A1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i10 + ").");
                return this.f41213A.v(new C3382k(this, i10, i11), this.f41218e);
            }
            E1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.");
        }
        return A0();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void P0(WeakReference weakReference, int i10) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.r(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q0(WeakReference weakReference, int i10) {
        this.f41218e.execute(new O(weakReference, i10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ReactInstance R0(String str, String str2, String str3, b8.d dVar, String str4) {
        ReactInstance reactInstance = (ReactInstance) dVar.o();
        ReactInstance reactInstance2 = this.f41225l;
        String str5 = "Stage: " + str4;
        String str6 = str + " reason: " + str2;
        if (dVar.s()) {
            Exception n10 = dVar.n();
            E1(str3, str + ": ReactInstance task faulted. " + str5 + ". " + ("Fault reason: " + n10.getMessage()) + ". " + str6);
            return reactInstance2;
        } else if (dVar.q()) {
            E1(str3, str + ": ReactInstance task cancelled. " + str5 + ". " + str6);
            return reactInstance2;
        } else if (reactInstance == null) {
            E1(str3, str + ": ReactInstance task returned null. " + str5 + ". " + str6);
            return reactInstance2;
        } else {
            if (!(reactInstance2 == null || reactInstance == reactInstance2)) {
                E1(str3, str + ": Detected two different ReactInstances. Returning old. " + str5 + ". " + str6);
            }
            return reactInstance;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d S0(String str, Exception exc, b8.d dVar) {
        return w0(str, exc);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d T0(String str, Exception exc) {
        if (this.f41239z == null) {
            return w0(str, exc);
        }
        A1("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return this.f41239z.k(new V(this, str, exc), this.f41218e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U0() {
        UiThreadUtil.assertOnUiThread();
        U7.b bVar = this.f41233t;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d V0(b8.d dVar) {
        if (((Boolean) dVar.o()).booleanValue()) {
            return y1();
        }
        return b8.d.m(this.f41215b.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ JSBundleLoader W0() {
        return this.f41215b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d X0(e eVar, String str, b8.d dVar) {
        ReactHostInspectorTarget reactHostInspectorTarget;
        A1("getOrCreateDestroyTask()", "Starting React Native destruction");
        ReactInstance a10 = eVar.a(dVar, "1: Starting destroy");
        M1(a10);
        if (this.f41237x && (reactHostInspectorTarget = this.f41236w) != null) {
            reactHostInspectorTarget.close();
            this.f41236w = null;
        }
        if (this.f41223j) {
            A1("getOrCreateDestroyTask()", "DevSupportManager cleanup");
            this.f41217d.n();
        }
        ReactContext reactContext = (ReactContext) this.f41226m.c();
        if (reactContext == null) {
            E1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        A1("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
        this.f41230q.b(reactContext);
        return b8.d.m(a10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d Y0(e eVar, b8.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "2: Stopping surfaces");
        if (a10 == null) {
            E1("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null");
            return dVar;
        }
        K1("getOrCreateDestroyTask()", a10);
        synchronized (this.f41220g) {
            this.f41220g.clear();
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d Z0(e eVar, String str, b8.d dVar) {
        eVar.a(dVar, "3: Destroying ReactContext");
        for (C6787a invoke : this.f41235v) {
            invoke.invoke();
        }
        ReactContext reactContext = (ReactContext) this.f41226m.c();
        if (reactContext == null) {
            E1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        A1("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
        this.f41221h.b(this.f41214a);
        if (reactContext != null) {
            A1("getOrCreateDestroyTask()", "Resetting ReactContext ref");
            this.f41226m.e();
            A1("getOrCreateDestroyTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        H1((Activity) null);
        q8.c.d().c();
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d a1(e eVar, b8.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "4: Destroying ReactInstance");
        if (a10 == null) {
            E1("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            A1("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
            this.f41225l = null;
            A1("getOrCreateDestroyTask()", "Destroying ReactInstance");
            a10.j();
        }
        if (!M7.b.c()) {
            A1("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
            this.f41224k.e();
        }
        A1("getOrCreateDestroyTask()", "Resetting start task ref");
        this.f41238y = null;
        A1("getOrCreateDestroyTask()", "Resetting destroy task ref");
        this.f41213A = null;
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void b1(String str, b8.d dVar) {
        if (dVar.s()) {
            Exception n10 = dVar.n();
            F1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task faulted. Fault reason: " + n10.getMessage() + ". Destroy reason: " + str, dVar.n());
        }
        if (!dVar.q()) {
            return null;
        }
        E1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C3373b c1() {
        A1("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new C3373b(this.f41214a, this);
    }

    private b8.d e0(String str, d dVar, Executor executor) {
        String str2 = "callAfterGetOrCreateReactInstance(" + str + ")";
        if (executor == null) {
            executor = n0();
        }
        return z0().u(new T(this, str2, dVar), executor).h(new U(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ c e1(b8.d dVar) {
        boolean z10;
        C3373b x02 = x0();
        I7.e f10 = f();
        x02.setJSExceptionHandler(f10);
        A1("getOrCreateReactInstanceTask()", "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(x02, this.f41215b, this.f41216c, f10, new H(this), this.f41223j, y0());
        this.f41225l = reactInstance;
        MemoryPressureListener h02 = h0(reactInstance);
        this.f41232s = h02;
        this.f41221h.a(h02);
        reactInstance.t();
        A1("getOrCreateReactInstanceTask()", "Loading JS Bundle");
        reactInstance.z((JSBundleLoader) dVar.o());
        A1("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        f10.y(x02);
        x02.runOnJSQueueThread(new I());
        if (this.f41239z != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new c(reactInstance, x02, z10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ReactInstance f1(b8.d dVar) {
        boolean z10;
        ReactInstance reactInstance = ((c) dVar.o()).f41245a;
        ReactContext reactContext = ((c) dVar.o()).f41246b;
        boolean z11 = ((c) dVar.o()).f41247c;
        if (this.f41230q.a() == LifecycleState.RESUMED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z11 || z10) {
            this.f41230q.e(reactContext, l0());
        } else {
            this.f41230q.d(reactContext, l0());
        }
        A1("getOrCreateReactInstanceTask()", "Executing ReactInstanceEventListeners");
        for (B b10 : this.f41234u) {
            if (b10 != null) {
                b10.a(reactContext);
            }
        }
        return reactInstance;
    }

    private b8.d g0(String str, d dVar, Executor executor) {
        String str2 = "callWithExistingReactInstance(" + str + ")";
        if (executor == null) {
            executor = n0();
        }
        return ((b8.d) this.f41224k.a()).u(new C3389s(this, str2, dVar), executor);
    }

    @B7.a
    private Map<String, String> getHostMetadata() {
        return com.facebook.react.modules.systeminfo.a.e(this.f41214a);
    }

    private MemoryPressureListener h0(ReactInstance reactInstance) {
        return new K(this, new WeakReference(reactInstance));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d h1() {
        A1("getOrCreateReactInstanceTask()", "Start");
        C3863a.b(!this.f41237x, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        b8.d u10 = r0().u(new B(this), this.f41218e);
        D d10 = new D(this);
        if (!M7.b.c()) {
            return u10.u(d10, this.f41219f);
        }
        u10.u(d10, this.f41219f);
        return u10.u(new E(), b8.d.f36260i);
    }

    private e i0(String str, String str2, String str3) {
        return new C3396z(this, str, str3, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d i1(e eVar, String str, b8.d dVar) {
        A1("getOrCreateReloadTask()", "Starting React Native reload");
        ReactInstance a10 = eVar.a(dVar, "1: Starting reload");
        M1(a10);
        ReactContext reactContext = (ReactContext) this.f41226m.c();
        if (reactContext == null) {
            E1("getOrCreateReloadTask()", "ReactContext is null. Reload reason: " + str);
        }
        if (reactContext != null && this.f41230q.a() == LifecycleState.RESUMED) {
            A1("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
            reactContext.onHostPause();
        }
        return b8.d.m(a10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d j1(e eVar, b8.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "2: Surface shutdown");
        if (a10 == null) {
            E1("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null");
            return dVar;
        }
        K1("getOrCreateReloadTask()", a10);
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d k1(e eVar, b8.d dVar) {
        eVar.a(dVar, "3: Destroying ReactContext");
        for (C6787a invoke : this.f41235v) {
            invoke.invoke();
        }
        if (this.f41232s != null) {
            A1("getOrCreateReloadTask()", "Removing memory pressure listener");
            this.f41221h.d(this.f41232s);
        }
        ReactContext reactContext = (ReactContext) this.f41226m.c();
        if (reactContext != null) {
            A1("getOrCreateReloadTask()", "Resetting ReactContext ref");
            this.f41226m.e();
            A1("getOrCreateReloadTask()", "Destroying ReactContext");
            reactContext.destroy();
        }
        if (this.f41223j && reactContext != null) {
            A1("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            this.f41217d.E(reactContext);
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d l1(e eVar, b8.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "4: Destroying ReactInstance");
        if (a10 == null) {
            E1("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            A1("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
            this.f41225l = null;
            A1("getOrCreateReloadTask()", "Destroying ReactInstance");
            a10.j();
        }
        if (!M7.b.c()) {
            A1("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
            this.f41224k.e();
        }
        A1("getOrCreateReloadTask()", "Resetting start task ref");
        this.f41238y = null;
        return A0();
    }

    @B7.a
    private void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        H7.a.a(str, inspectorNetworkRequestListener);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d m1(e eVar, b8.d dVar) {
        ReactInstance a10 = eVar.a(dVar, "5: Restarting surfaces");
        if (a10 == null) {
            E1("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null");
            return dVar;
        }
        I1("getOrCreateReloadTask()", a10);
        return dVar;
    }

    private Executor n0() {
        if (M7.b.s()) {
            return b8.d.f36260i;
        }
        return this.f41218e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d n1(String str, b8.d dVar) {
        if (dVar.s()) {
            Exception n10 = dVar.n();
            F1("getOrCreateReloadTask()", "Error during reload. ReactInstance task faulted. Fault reason: " + n10.getMessage() + ". Reload reason: " + str, dVar.n());
        }
        if (dVar.q()) {
            E1("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: " + str);
        }
        A1("getOrCreateReloadTask()", "Resetting reload task ref");
        this.f41239z = null;
        return dVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d p1(b8.d dVar) {
        if (!dVar.s()) {
            return dVar.t();
        }
        Exception n10 = dVar.n();
        if (this.f41223j) {
            this.f41217d.handleException(n10);
        } else {
            this.f41215b.f(n10);
        }
        return w0("getOrCreateStartTask() failure: " + dVar.n().getMessage(), dVar.n()).j(new C3395y(dVar)).t();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q1(b8.e eVar, boolean z10) {
        A1("isMetroRunning()", "Async result = " + z10);
        eVar.d(Boolean.valueOf(z10));
    }

    private b8.d r0() {
        z1("getJSBundleLoader()");
        if (this.f41223j && this.f41222i) {
            return J0().v(new F(this), this.f41218e);
        }
        if (E7.a.f30669b) {
            U5.a.b("ReactHost", "Packager server access is disabled in this environment");
        }
        return b8.d.c(new G(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r1(String str, int i10, String str2, Callback callback, ReactInstance reactInstance) {
        A1(str, "Execute");
        reactInstance.B(i10, str2);
        ((Callback) C3863a.c(callback)).invoke(new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d s1(String str, b8.d dVar) {
        return B0(str);
    }

    @B7.a
    private void setPausedInDebuggerMessage(String str) {
        if (str == null) {
            this.f41217d.g();
        } else {
            this.f41217d.b(str, new a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d t1(b8.d dVar) {
        if (!dVar.s()) {
            return dVar;
        }
        Exception n10 = dVar.n();
        if (this.f41223j) {
            this.f41217d.handleException(n10);
        } else {
            this.f41215b.f(n10);
        }
        return w0("Reload failed", n10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d u1(String str) {
        b8.d dVar;
        if (this.f41213A != null) {
            A1("reload()", "Waiting for destroy to finish, before reloading React Native.");
            dVar = this.f41213A.k(new X(this, str), this.f41218e).t();
        } else {
            dVar = B0(str).t();
        }
        return dVar.k(new C3379h(this), this.f41218e);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v1(String str, h0 h0Var, ReactInstance reactInstance) {
        A1(str, "Execute");
        reactInstance.C(h0Var);
    }

    private b8.d w0(String str, Exception exc) {
        b8.d dVar;
        z1("getOrCreateDestroyTask()");
        F1("getOrCreateDestroyTask()", str, exc);
        e i02 = i0("Destroy", "getOrCreateDestroyTask()", str);
        if (this.f41213A == null) {
            if (M7.b.c()) {
                dVar = (b8.d) this.f41224k.b();
            } else {
                dVar = (b8.d) this.f41224k.a();
            }
            this.f41213A = dVar.k(new C3390t(this, i02, str), this.f41219f).k(new C3391u(this, i02), this.f41218e).k(new C3392v(this, i02, str), this.f41219f).k(new C3393w(this, i02), this.f41218e).h(new C3394x(this, str));
        }
        return this.f41213A;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w1(String str, h0 h0Var, ReactInstance reactInstance) {
        A1(str, "Execute");
        reactInstance.D(h0Var);
    }

    private C3373b x0() {
        return (C3373b) this.f41226m.d(new J(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b8.d x1(int i10, int i11, b8.d dVar) {
        return O1(i10 + 1, i11);
    }

    private ReactHostInspectorTarget y0() {
        if (this.f41236w == null && InspectorFlags.getFuseboxEnabled()) {
            this.f41236w = new ReactHostInspectorTarget(this);
        }
        return this.f41236w;
    }

    private b8.d y1() {
        z1("loadJSBundleFromMetro()");
        b8.e eVar = new b8.e();
        E e10 = (E) f();
        String r10 = e10.i0().r((String) C3863a.c(e10.j0()));
        e10.I0(r10, new b(r10, e10, eVar));
        return eVar.a();
    }

    private b8.d z0() {
        return b8.d.d(new C3381j(this), this.f41218e).j(new r());
    }

    private void z1(String str) {
        C3374c cVar = this.f41229p;
        cVar.a("ReactHost{" + this.f41231r + "}." + str);
    }

    public ReactQueueConfiguration D0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.p();
        }
        return null;
    }

    public void D1(Activity activity) {
        z1("onHostResume(activity)");
        H1(activity);
        ReactContext i10 = i();
        B1(true);
        this.f41230q.d(i10, l0());
    }

    /* access modifiers changed from: package-private */
    public RuntimeExecutor E0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        E1("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready");
        return null;
    }

    /* access modifiers changed from: package-private */
    public FabricUIManager F0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance == null) {
            return null;
        }
        return reactInstance.q();
    }

    /* access modifiers changed from: package-private */
    public void G0(Exception exc) {
        String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        z1(str);
        if (this.f41223j) {
            this.f41217d.handleException(exc);
        } else {
            this.f41215b.f(exc);
        }
        j0(str, exc);
    }

    /* access modifiers changed from: package-private */
    public b8.d G1(int i10, String str, Callback callback) {
        String str2 = "registerSegment(segmentId = \"" + i10 + "\", path = \"" + str + "\")";
        A1(str2, "Schedule");
        return g0(str2, new P(this, str2, i10, str, callback), (Executor) null);
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Class cls) {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.s(cls);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean I0() {
        if (this.f41225l != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public J7.a J1(h0 h0Var) {
        String str = "startSurface(surfaceId = " + h0Var.n() + ")";
        A1(str, "Schedule");
        d0(h0Var);
        return e0(str, new C(this, str, h0Var), this.f41218e);
    }

    /* access modifiers changed from: package-private */
    public boolean K0(String str) {
        synchronized (this.f41220g) {
            try {
                for (h0 j10 : this.f41220g) {
                    if (j10.j().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public J7.a L1(h0 h0Var) {
        String str = "stopSurface(surfaceId = " + h0Var.n() + ")";
        A1(str, "Schedule");
        k0(h0Var);
        return g0(str, new W(this, str, h0Var), this.f41218e).t();
    }

    public J7.a d(String str) {
        return b8.d.d(new C3378g(this, str), this.f41218e).j(new r());
    }

    /* access modifiers changed from: package-private */
    public void d0(h0 h0Var) {
        z1("attachSurface(surfaceId = " + h0Var.n() + ")");
        synchronized (this.f41220g) {
            this.f41220g.add(h0Var);
        }
    }

    public K7.a e(Context context, String str, Bundle bundle) {
        h0 h0Var = new h0(context, str, bundle);
        i0 i0Var = new i0(context, h0Var);
        i0Var.setShouldLogContentAppeared(true);
        h0Var.d(i0Var);
        h0Var.c(this);
        return h0Var;
    }

    public I7.e f() {
        return (I7.e) C3863a.c(this.f41217d);
    }

    /* access modifiers changed from: package-private */
    public b8.d f0(String str, String str2, NativeArray nativeArray) {
        return g0("callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")", new Q(str, str2, nativeArray), (Executor) null);
    }

    public void g(Activity activity, U7.b bVar) {
        this.f41233t = bVar;
        D1(activity);
    }

    public boolean h() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.m(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    public ReactContext i() {
        return (ReactContext) this.f41226m.c();
    }

    public void j(B b10) {
        this.f41234u.add(b10);
    }

    public J7.a j0(String str, Exception exc) {
        return b8.d.d(new N(this, str, exc), this.f41218e).j(new r());
    }

    public void k(Context context) {
        AppearanceModule appearanceModule;
        ReactContext i10 = i();
        if (i10 != null && (appearanceModule = (AppearanceModule) i10.getNativeModule(AppearanceModule.class)) != null) {
            appearanceModule.onConfigurationChanged(context);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(h0 h0Var) {
        z1("detachSurface(surfaceId = " + h0Var.n() + ")");
        synchronized (this.f41220g) {
            this.f41220g.remove(h0Var);
        }
    }

    public void l(Activity activity) {
        String str;
        boolean z10;
        z1("onHostPause(activity)");
        ReactContext i10 = i();
        Activity l02 = l0();
        if (l02 != null) {
            String simpleName = l02.getClass().getSimpleName();
            if (activity == null) {
                str = "null";
            } else {
                str = activity.getClass().getSimpleName();
            }
            if (activity == l02) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3863a.b(z10, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + str);
        }
        B1(false);
        this.f41233t = null;
        this.f41230q.c(i10, l02);
    }

    /* access modifiers changed from: package-private */
    public Activity l0() {
        return (Activity) this.f41227n.get();
    }

    public void m(B b10) {
        this.f41234u.remove(b10);
    }

    /* access modifiers changed from: package-private */
    public U7.b m0() {
        return new M(this);
    }

    public void n(Activity activity) {
        z1("onHostDestroy(activity)");
        if (l0() == activity) {
            B1(false);
            C1(i());
        }
    }

    public void o(Activity activity) {
        z1("onUserLeaveHint(activity)");
        ReactContext i10 = i();
        if (i10 != null) {
            i10.onUserLeaveHint(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public EventDispatcher o0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance == null) {
            return com.facebook.react.uimanager.events.b.l();
        }
        return reactInstance.k();
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i10 + "\", resultCode = \"" + i11 + "\", data = \"" + intent + "\")";
        ReactContext i12 = i();
        if (i12 != null) {
            i12.onActivityResult(activity, i10, i11, intent);
        } else {
            E1(str, "Tried to access onActivityResult while context is not ready");
        }
    }

    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        String str = "onNewIntent(intent = \"" + intent + "\")";
        ReactContext i10 = i();
        if (i10 != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) i10.getNativeModule(DeviceEventManagerModule.class)) != null)) {
                deviceEventManagerModule.emitNewIntentReceived(data);
            }
            i10.onNewIntent(l0(), intent);
            return;
        }
        E1(str, "Tried to access onNewIntent while context is not ready");
    }

    public void onWindowFocusChange(boolean z10) {
        String str = "onWindowFocusChange(hasFocus = \"" + z10 + "\")";
        ReactContext i10 = i();
        if (i10 != null) {
            i10.onWindowFocusChange(z10);
        } else {
            E1(str, "Tried to access onWindowFocusChange while context is not ready");
        }
    }

    /* access modifiers changed from: package-private */
    public CallInvokerHolder p0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        E1("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready");
        return null;
    }

    /* access modifiers changed from: package-private */
    public JavaScriptContextHolder q0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.l();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Activity s0() {
        WeakReference weakReference = (WeakReference) this.f41228o.get();
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public J7.a start() {
        return b8.d.d(new S(this), this.f41218e).j(new r());
    }

    /* access modifiers changed from: package-private */
    public NativeModule t0(Class cls) {
        if (cls == UIManagerModule.class) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose("ReactHost", new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.m(cls);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public NativeModule u0(String str) {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.n(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Collection v0() {
        ReactInstance reactInstance = this.f41225l;
        if (reactInstance != null) {
            return reactInstance.o();
        }
        return new ArrayList();
    }

    public ReactHostImpl(Context context, C3377f fVar, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z10, boolean z11) {
        this(context, fVar, componentFactory, executor, executor2, z10, z11, (I) null);
    }

    public ReactHostImpl(Context context, C3377f fVar, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z10, boolean z11, I i10) {
        Context context2 = context;
        this.f41220g = new HashSet();
        this.f41224k = new C3372a(b8.d.m((Object) null));
        this.f41226m = new C3372a();
        this.f41227n = new AtomicReference();
        this.f41228o = new AtomicReference(new WeakReference((Object) null));
        C3374c cVar = new C3374c(E7.a.f30669b);
        this.f41229p = cVar;
        this.f41230q = new f0(cVar);
        this.f41231r = f41212B.getAndIncrement();
        this.f41234u = new CopyOnWriteArrayList();
        this.f41235v = new CopyOnWriteArrayList();
        boolean z12 = false;
        this.f41237x = false;
        this.f41238y = null;
        this.f41239z = null;
        this.f41213A = null;
        this.f41214a = context2;
        this.f41215b = fVar;
        this.f41216c = componentFactory;
        this.f41218e = executor;
        this.f41219f = executor2;
        this.f41221h = new C3363i(context2);
        this.f41222i = z10;
        boolean z13 = (z11 || E7.a.f30671d) ? true : z12;
        this.f41223j = z13;
        this.f41217d = (i10 == null ? new C3342i() : i10).b(context.getApplicationContext(), new Z(this), fVar.d(), true, (i) null, (I7.b) null, 2, (Map) null, (j) null, (I7.c) null, (h) null, z13);
    }
}
