package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRedBoxSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RedBox";

    public NativeRedBoxSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void dismiss();

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void setExtraData(ReadableMap readableMap, String str);
}
