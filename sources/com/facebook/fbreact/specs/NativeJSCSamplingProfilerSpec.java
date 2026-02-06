package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "JSCSamplingProfiler";

    public NativeJSCSamplingProfilerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void operationComplete(double d10, String str, String str2);
}
