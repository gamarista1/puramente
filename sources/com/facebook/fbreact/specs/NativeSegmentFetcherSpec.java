package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSegmentFetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SegmentFetcher";

    public NativeSegmentFetcherSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void fetchSegment(double d10, ReadableMap readableMap, Callback callback);

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public void getSegment(double d10, ReadableMap readableMap, Callback callback) {
    }
}
