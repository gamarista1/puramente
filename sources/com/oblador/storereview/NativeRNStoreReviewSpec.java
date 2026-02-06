package com.oblador.storereview;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeRNStoreReviewSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNStoreReview";

    public NativeRNStoreReviewSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void requestReview();
}
