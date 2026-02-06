package com.reactcommunity.rndatetimepicker;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeModuleDatePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCDatePicker";

    public NativeModuleDatePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void dismiss(Promise promise);

    public String getName() {
        return "RNCDatePicker";
    }

    @a
    @ReactMethod
    public abstract void open(ReadableMap readableMap, Promise promise);
}
