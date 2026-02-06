package com.facebook.react.runtime;

import B7.a;
import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u001dJ\u000f\u0010+\u001a\u00020\bH\u0017¢\u0006\u0004\b+\u0010\u001dJ)\u00100\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u000f\"\b\b\u0000\u0010-*\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b4\u00105J)\u00106\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0016¢\u0006\u0004\b6\u00107J\u0019\u00106\u001a\u0004\u0018\u0001022\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u00109J\u0017\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u001f\u0010E\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\b2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0017¢\u0006\u0004\bI\u0010\u0018J\u0017\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020NH\u0017¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020NH\u0017¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u001fR\u0014\u0010Z\u001a\u00020W8WX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010_\u001a\u00020[8WX\u0004¢\u0006\f\u0012\u0004\b^\u0010\u001d\u001a\u0004\b\\\u0010]R\u0014\u0010c\u001a\u00020`8VX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u0002020d8VX\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8VX\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010s\u001a\u0004\u0018\u00010p8VX\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lcom/facebook/react/runtime/BridgelessCatalystInstance;", "Lcom/facebook/react/bridge/CatalystInstance;", "Lcom/facebook/react/runtime/ReactHostImpl;", "reactHost", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", "", "level", "Llf/M;", "handleMemoryPressure", "(I)V", "Landroid/content/res/AssetManager;", "assetManager", "", "assetURL", "", "loadSynchronously", "loadScriptFromAssets", "(Landroid/content/res/AssetManager;Ljava/lang/String;Z)V", "fileName", "sourceURL", "loadScriptFromFile", "(Ljava/lang/String;Ljava/lang/String;Z)V", "loadSplitBundleFromFile", "(Ljava/lang/String;Ljava/lang/String;)V", "deviceURL", "remoteURL", "setSourceURLs", "runJSBundle", "()V", "hasRunJSBundle", "()Z", "callbackID", "Lcom/facebook/react/bridge/NativeArrayInterface;", "arguments", "invokeCallback", "(ILcom/facebook/react/bridge/NativeArrayInterface;)V", "module", "method", "Lcom/facebook/react/bridge/NativeArray;", "callFunction", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V", "destroy", "initialize", "Lcom/facebook/react/bridge/JavaScriptModule;", "T", "Ljava/lang/Class;", "jsInterface", "getJSModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;", "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "hasNativeModule", "(Ljava/lang/Class;)Z", "getNativeModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "moduleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/NativeModuleRegistry;", "modules", "extendNativeModules", "(Lcom/facebook/react/bridge/NativeModuleRegistry;)V", "Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;", "listener", "addBridgeIdleDebugListener", "(Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;)V", "removeBridgeIdleDebugListener", "segmentId", "path", "registerSegment", "(ILjava/lang/String;)V", "propName", "jsonValue", "setGlobalVariable", "Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;", "turboModuleRegistry", "setTurboModuleRegistry", "(Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;)V", "Lcom/facebook/react/bridge/UIManager;", "fabricUIManager", "setFabricUIManager", "(Lcom/facebook/react/bridge/UIManager;)V", "getFabricUIManager", "()Lcom/facebook/react/bridge/UIManager;", "a", "Lcom/facebook/react/runtime/ReactHostImpl;", "isDestroyed", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJSCallInvokerHolder$annotations", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "getNativeMethodCallInvokerHolder", "()Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;", "nativeMethodCallInvokerHolder", "", "getNativeModules", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "getRuntimeScheduler", "()Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "getSourceURL", "()Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
@C6521e
public final class BridgelessCatalystInstance implements CatalystInstance {

    /* renamed from: a  reason: collision with root package name */
    private final ReactHostImpl f41185a;

    public BridgelessCatalystInstance(ReactHostImpl reactHostImpl) {
        C6496s.h(reactHostImpl, "reactHost");
        this.f41185a = reactHostImpl;
    }

    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        C6496s.h(notThreadSafeBridgeIdleDebugListener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    public void callFunction(String str, String str2, NativeArray nativeArray) {
        C6496s.h(str, "module");
        C6496s.h(str2, "method");
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    public void destroy() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        C6496s.h(nativeModuleRegistry, "modules");
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    public UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    public CallInvokerHolder getJSCallInvokerHolder() {
        CallInvokerHolder p02 = this.f41185a.p0();
        C6496s.e(p02);
        return p02;
    }

    public JavaScriptModule getJSModule(Class cls) {
        C6496s.h(cls, "jsInterface");
        ReactContext i10 = this.f41185a.i();
        if (i10 != null) {
            return i10.getJSModule(cls);
        }
        return null;
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        JavaScriptContextHolder q02 = this.f41185a.q0();
        C6496s.e(q02);
        return q02;
    }

    public NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    public NativeModule getNativeModule(Class cls) {
        C6496s.h(cls, "nativeModuleInterface");
        return this.f41185a.t0(cls);
    }

    public Collection getNativeModules() {
        Collection v02 = this.f41185a.v0();
        C6496s.g(v02, "getNativeModules(...)");
        return v02;
    }

    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactQueueConfiguration D02 = this.f41185a.D0();
        C6496s.e(D02);
        return D02;
    }

    public RuntimeExecutor getRuntimeExecutor() {
        return this.f41185a.E0();
    }

    public RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    public String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    public void handleMemoryPressure(int i10) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    public boolean hasNativeModule(Class cls) {
        C6496s.h(cls, "nativeModuleInterface");
        return this.f41185a.H0(cls);
    }

    public boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    public void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @a
    public void invokeCallback(int i10, NativeArrayInterface nativeArrayInterface) {
        C6496s.h(nativeArrayInterface, "arguments");
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    public boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z10) {
        C6496s.h(assetManager, "assetManager");
        C6496s.h(str, "assetURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    public void loadScriptFromFile(String str, String str2, boolean z10) {
        C6496s.h(str, "fileName");
        C6496s.h(str2, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    public void loadSplitBundleFromFile(String str, String str2) {
        C6496s.h(str, "fileName");
        C6496s.h(str2, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    public void registerSegment(int i10, String str) {
        C6496s.h(str, "path");
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        C6496s.h(notThreadSafeBridgeIdleDebugListener, "listener");
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    public void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    public void setFabricUIManager(UIManager uIManager) {
        C6496s.h(uIManager, "fabricUIManager");
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    public void setGlobalVariable(String str, String str2) {
        C6496s.h(str, "propName");
        C6496s.h(str2, "jsonValue");
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    public void setSourceURLs(String str, String str2) {
        C6496s.h(str, "deviceURL");
        C6496s.h(str2, "remoteURL");
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        C6496s.h(turboModuleRegistry, "turboModuleRegistry");
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }

    public NativeModule getNativeModule(String str) {
        C6496s.h(str, "moduleName");
        return this.f41185a.u0(str);
    }
}
