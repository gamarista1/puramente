package com.horcrux.svg;

import B7.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSvgViewModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSVGSvgViewModule";

    public NativeSvgViewModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @a
    @ReactMethod
    public abstract void toDataURL(Double d10, ReadableMap readableMap, Callback callback);
}
