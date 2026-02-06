package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.C6496s;

public abstract class a {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter a(ReactContext reactContext) {
        C6496s.h(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        C6496s.g(jSModule, "getJSModule(...)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    public static final UIManagerModule b(ReactContext reactContext) {
        C6496s.h(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        C6496s.e(nativeModule);
        return (UIManagerModule) nativeModule;
    }

    public static final boolean c(Context context) {
        C6496s.h(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isTouchExplorationEnabled();
    }
}
