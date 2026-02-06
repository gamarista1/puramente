package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeImageEditorSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageEditingManager";

    public NativeImageEditorSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2);

    public String getName() {
        return NAME;
    }
}
