package com.swmansion.gesturehandler;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void attachGestureHandler(double d10, double d11, double d12);

    @a
    @ReactMethod
    public abstract void createGestureHandler(String str, double d10, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void dropGestureHandler(double d10);

    @a
    @ReactMethod
    public abstract void flushOperations();

    public String getName() {
        return "RNGestureHandlerModule";
    }

    @a
    @ReactMethod
    public abstract void handleClearJSResponder();

    @a
    @ReactMethod
    public abstract void handleSetJSResponder(double d10, boolean z10);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean install();

    @a
    @ReactMethod
    public abstract void updateGestureHandler(double d10, ReadableMap readableMap);
}
