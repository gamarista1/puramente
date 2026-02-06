package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDeviceEventManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DeviceEventManager";

    public NativeDeviceEventManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "DeviceEventManager";
    }

    @a
    @ReactMethod
    public abstract void invokeDefaultBackPressHandler();
}
