package com.reactnativecommunity.asyncstorage;

import B7.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAsyncStorageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCAsyncStorage";

    public NativeAsyncStorageModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clear(Callback callback);

    @a
    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    public String getName() {
        return "RNCAsyncStorage";
    }

    @a
    @ReactMethod
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @a
    @ReactMethod
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @a
    @ReactMethod
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @a
    @ReactMethod
    public abstract void multiSet(ReadableArray readableArray, Callback callback);
}
