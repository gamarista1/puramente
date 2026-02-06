package com.facebook.react.fabric;

import B7.a;
import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"MissingNativeLoadLibrary"})
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0003J@\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H ¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H ¢\u0006\u0004\b\u0014\u0010\u0003J(\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001b\u0010\u001cJh\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H ¢\u0006\u0004\b'\u0010(J(\u0010,\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020$H ¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H ¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H ¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u001dH ¢\u0006\u0004\b3\u00104JX\u00105\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H ¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004H ¢\u0006\u0004\b7\u0010\u0003J\u0010\u00108\u001a\u00020\u0004H ¢\u0006\u0004\b8\u0010\u0003J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H ¢\u0006\u0004\b9\u0010/J\u001c\u0010=\u001a\u0004\u0018\u00010<2\b\u0010;\u001a\u0004\u0018\u00010:H ¢\u0006\u0004\b=\u0010>J=\u0010B\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010?\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0004¢\u0006\u0004\bD\u0010\u0003¨\u0006F"}, d2 = {"Lcom/facebook/react/fabric/FabricUIManagerBinding;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "Llf/M;", "initHybrid", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", "Lcom/facebook/react/fabric/events/EventBeatManager;", "eventBeatManager", "Lcom/facebook/react/fabric/ComponentFactory;", "componentsRegistry", "", "reactNativeConfig", "installFabricUIManager", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Ljava/lang/Object;)V", "uninstallFabricUIManager", "", "surfaceId", "", "moduleName", "Lcom/facebook/react/bridge/NativeMap;", "initialProps", "startSurface", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "offsetX", "offsetY", "", "isRTL", "doLeftAndRightSwapInRTL", "startSurfaceWithConstraints", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;FFFFFFZZ)V", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "surfaceHandler", "isMountable", "startSurfaceWithSurfaceHandler", "(ILcom/facebook/react/fabric/SurfaceHandlerBinding;Z)V", "stopSurface", "(I)V", "stopSurfaceWithSurfaceHandler", "(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V", "pointScaleFactor", "setPixelDensity", "(F)V", "setConstraints", "(IFFFFFFZZ)V", "driveCxxAnimations", "drainPreallocateViewsQueue", "reportMount", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "eventEmitterWrapper", "Lcom/facebook/react/bridge/ReadableNativeMap;", "getInspectorDataForInstance", "(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)Lcom/facebook/react/bridge/ReadableNativeMap;", "fabricUIManager", "componentFactory", "Lcom/facebook/react/fabric/ReactNativeConfig;", "register", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;)V", "unregister", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public final class FabricUIManagerBinding extends HybridClassBase {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/FabricUIManagerBinding$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
        F7.a.a();
    }

    public FabricUIManagerBinding() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, Object obj);

    private final native void uninstallFabricUIManager();

    public final native void drainPreallocateViewsQueue();

    public final native void driveCxxAnimations();

    public final native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    public final void register(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig) {
        C6496s.h(runtimeExecutor, "runtimeExecutor");
        C6496s.h(runtimeScheduler, "runtimeScheduler");
        C6496s.h(fabricUIManager, "fabricUIManager");
        C6496s.h(eventBeatManager, "eventBeatManager");
        C6496s.h(componentFactory, "componentFactory");
        C6496s.h(reactNativeConfig, "reactNativeConfig");
        fabricUIManager.setBinding(this);
        installFabricUIManager(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, componentFactory, reactNativeConfig);
        setPixelDensity(G.c());
    }

    public final native void reportMount(int i10);

    public final native void setConstraints(int i10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11);

    public final native void setPixelDensity(float f10);

    public final native void startSurface(int i10, String str, NativeMap nativeMap);

    public final native void startSurfaceWithConstraints(int i10, String str, NativeMap nativeMap, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11);

    public final native void startSurfaceWithSurfaceHandler(int i10, SurfaceHandlerBinding surfaceHandlerBinding, boolean z10);

    public final native void stopSurface(int i10);

    public final native void stopSurfaceWithSurfaceHandler(SurfaceHandlerBinding surfaceHandlerBinding);

    public final void unregister() {
        uninstallFabricUIManager();
    }
}
