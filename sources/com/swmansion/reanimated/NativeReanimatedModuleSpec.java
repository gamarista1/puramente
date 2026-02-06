package com.swmansion.reanimated;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeReanimatedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReanimatedModule";

    public NativeReanimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean installTurboModule(String str);
}
