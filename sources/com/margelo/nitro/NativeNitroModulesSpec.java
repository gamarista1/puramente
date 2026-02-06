package com.margelo.nitro;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeNitroModulesSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NitroModules";

    public NativeNitroModulesSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "NitroModules";
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String install();
}
