package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Clipboard";

    public NativeClipboardSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "Clipboard";
    }

    @a
    @ReactMethod
    public abstract void getString(Promise promise);

    @a
    @ReactMethod
    public abstract void setString(String str);
}
