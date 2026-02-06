package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "WebSocketModule";

    public NativeWebSocketModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void close(double d10, String str, double d11);

    @a
    @ReactMethod
    public abstract void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d10);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void ping(double d10);

    @a
    @ReactMethod
    public abstract void removeListeners(double d10);

    @a
    @ReactMethod
    public abstract void send(String str, double d10);

    @a
    @ReactMethod
    public abstract void sendBinary(String str, double d10);
}
