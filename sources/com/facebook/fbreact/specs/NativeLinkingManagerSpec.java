package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeLinkingManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "LinkingManager";

    public NativeLinkingManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void canOpenURL(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void getInitialURL(Promise promise);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void openSettings(Promise promise);

    @a
    @ReactMethod
    public abstract void openURL(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void removeListeners(double d10);
}
