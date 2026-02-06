package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void addMenuItem(String str);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public void onFastRefresh() {
    }

    @a
    @ReactMethod
    public void openDebugger() {
    }

    @a
    @ReactMethod
    public abstract void reload();

    @a
    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d10);

    @a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void setIsDebuggingRemotely(boolean z10);

    @a
    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z10);

    @a
    @ReactMethod
    public abstract void toggleElementInspector();
}
