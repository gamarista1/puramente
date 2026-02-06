package com.dylanvann.fastimage;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeFastImageViewModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FastImageViewModule";

    public NativeFastImageViewModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clearDiskCache(Promise promise);

    @a
    @ReactMethod
    public abstract void clearMemoryCache(Promise promise);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void preload(ReadableArray readableArray);
}
