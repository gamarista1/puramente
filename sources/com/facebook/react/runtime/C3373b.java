package com.facebook.react.runtime;

import I7.e;
import M7.b;
import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.react.runtime.b  reason: case insensitive filesystem */
class C3373b extends ReactApplicationContext implements h {

    /* renamed from: a  reason: collision with root package name */
    private final ReactHostImpl f41288a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f41289b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    private final String f41290c = getClass().getSimpleName();

    /* renamed from: com.facebook.react.runtime.b$a */
    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final ReactHostImpl f41291a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f41292b;

        public a(ReactHostImpl reactHostImpl, Class cls) {
            this.f41291a = reactHostImpl;
            this.f41292b = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            WritableNativeArray writableNativeArray;
            if (objArr != null) {
                writableNativeArray = Arguments.fromJavaArgs(objArr);
            } else {
                writableNativeArray = new WritableNativeArray();
            }
            this.f41291a.f0(JavaScriptModuleRegistry.getJSModuleName(this.f41292b), method.getName(), writableNativeArray);
            return null;
        }
    }

    C3373b(Context context, ReactHostImpl reactHostImpl) {
        super(context);
        this.f41288a = reactHostImpl;
        if (b.r()) {
            initializeInteropModules();
        }
    }

    /* access modifiers changed from: package-private */
    public U7.b b() {
        return this.f41288a.m0();
    }

    /* access modifiers changed from: package-private */
    public e c() {
        return this.f41288a.f();
    }

    public void d(String str) {
        this.f41289b.set(str);
    }

    public void destroy() {
    }

    public void emitDeviceEvent(String str, Object obj) {
        this.f41288a.f0("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{str, obj}));
    }

    public CatalystInstance getCatalystInstance() {
        Log.w(this.f41290c, "[WARNING] Bridgeless doesn't support CatalystInstance. Accessing an API that's not part of the new architecture is not encouraged usage.");
        return new BridgelessCatalystInstance(this.f41288a);
    }

    public EventDispatcher getEventDispatcher() {
        return this.f41288a.o0();
    }

    public UIManager getFabricUIManager() {
        return this.f41288a.F0();
    }

    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f41288a.p0();
    }

    public JavaScriptModule getJSModule(Class cls) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry == null || !interopModuleRegistry.shouldReturnInteropModule(cls)) {
            return (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.f41288a, cls));
        }
        return this.mInteropModuleRegistry.getInteropModule(cls);
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f41288a.q0();
    }

    public NativeModule getNativeModule(Class cls) {
        return this.f41288a.t0(cls);
    }

    public Collection getNativeModules() {
        return this.f41288a.v0();
    }

    public String getSourceURL() {
        return (String) this.f41289b.get();
    }

    public void handleException(Exception exc) {
        this.f41288a.G0(exc);
    }

    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    public boolean hasActiveReactInstance() {
        return this.f41288a.I0();
    }

    public boolean hasCatalystInstance() {
        return false;
    }

    public boolean hasNativeModule(Class cls) {
        return this.f41288a.H0(cls);
    }

    public boolean hasReactInstance() {
        return this.f41288a.I0();
    }

    public boolean isBridgeless() {
        return true;
    }

    public void registerSegment(int i10, String str, Callback callback) {
        this.f41288a.G1(i10, str, callback);
    }

    public NativeModule getNativeModule(String str) {
        return this.f41288a.u0(str);
    }
}
