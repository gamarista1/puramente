package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public NativeHeadlessJsTaskSupportSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void notifyTaskFinished(double d10);

    @a
    @ReactMethod
    public abstract void notifyTaskRetry(double d10, Promise promise);
}
