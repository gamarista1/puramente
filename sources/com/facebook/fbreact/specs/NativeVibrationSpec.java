package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeVibrationSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Vibration";

    public NativeVibrationSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void cancel();

    public String getName() {
        return "Vibration";
    }

    @a
    @ReactMethod
    public abstract void vibrate(double d10);

    @a
    @ReactMethod
    public abstract void vibrateByPattern(ReadableArray readableArray, double d10);
}
