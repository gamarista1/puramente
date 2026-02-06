package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDevLoadingViewSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevLoadingView";

    public NativeDevLoadingViewSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "DevLoadingView";
    }

    @a
    @ReactMethod
    public abstract void hide();

    @a
    @ReactMethod
    public abstract void showMessage(String str, Double d10, Double d11);
}
