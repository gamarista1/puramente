package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Networking";

    public NativeNetworkingAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void abortRequest(double d10);

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void clearCookies(Callback callback);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d10);

    @a
    @ReactMethod
    public abstract void sendRequest(String str, String str2, double d10, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z10, double d11, boolean z11);
}
