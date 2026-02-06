package com.horcrux.svg;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSVGRenderableModule";

    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getBBox(Double d10, ReadableMap readableMap);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCTM(Double d10);

    public String getName() {
        return "RNSVGRenderableModule";
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getPointAtLength(Double d10, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void getRawResource(String str, Promise promise);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getScreenCTM(Double d10);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getTotalLength(Double d10);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isPointInFill(Double d10, ReadableMap readableMap);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isPointInStroke(Double d10, ReadableMap readableMap);
}
