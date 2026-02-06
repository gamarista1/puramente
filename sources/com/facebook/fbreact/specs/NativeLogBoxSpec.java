package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLogBoxSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LogBox";

    public NativeLogBoxSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "LogBox";
    }

    @a
    @ReactMethod
    public abstract void hide();

    @a
    @ReactMethod
    public abstract void show();
}
