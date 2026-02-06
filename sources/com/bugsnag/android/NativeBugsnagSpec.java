package com.bugsnag.android;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeBugsnagSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BugsnagReactNative";

    public NativeBugsnagSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addFeatureFlag(String str, String str2);

    @a
    @ReactMethod
    public abstract void addFeatureFlags(ReadableArray readableArray);

    @a
    @ReactMethod
    public abstract void addMetadata(String str, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void clearFeatureFlag(String str);

    @a
    @ReactMethod
    public abstract void clearFeatureFlags();

    @a
    @ReactMethod
    public abstract void clearMetadata(String str, String str2);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap configure(ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void configureAsync(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean dispatch(ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void dispatchAsync(ReadableMap readableMap, Promise promise);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getPayloadInfo(ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void getPayloadInfoAsync(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void leaveBreadcrumb(ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void pauseSession();

    @a
    @ReactMethod
    public abstract void resumeSession();

    @a
    @ReactMethod
    public abstract void resumeSessionOnStartup();

    @a
    @ReactMethod
    public abstract void startSession();

    @a
    @ReactMethod
    public abstract void updateCodeBundleId(String str);

    @a
    @ReactMethod
    public abstract void updateContext(String str);

    @a
    @ReactMethod
    public abstract void updateUser(String str, String str2, String str3);
}
