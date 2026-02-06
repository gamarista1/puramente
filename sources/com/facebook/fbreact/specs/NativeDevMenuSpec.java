package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevMenu";

    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void debugRemotely(boolean z10);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void reload();

    @a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void show();
}
