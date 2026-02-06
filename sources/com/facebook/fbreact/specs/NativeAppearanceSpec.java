package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Appearance";

    public NativeAppearanceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getColorScheme();

    public String getName() {
        return "Appearance";
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d10);

    @a
    @ReactMethod
    public abstract void setColorScheme(String str);
}
