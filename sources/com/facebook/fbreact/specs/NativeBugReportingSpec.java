package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeBugReportingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BugReporting";

    public NativeBugReportingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void setExtraData(ReadableMap readableMap, ReadableMap readableMap2);

    @a
    @ReactMethod
    public abstract void startReportAProblemFlow();
}
