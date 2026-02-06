package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeReactDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsSettingsManager";

    public NativeReactDevToolsSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getGlobalHookSettings();

    public String getName() {
        return "ReactDevToolsSettingsManager";
    }

    @a
    @ReactMethod
    public abstract void setGlobalHookSettings(String str);
}
