package com.facebook.fbreact.specs;

import B7.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeSoundManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SoundManager";

    public NativeSoundManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return "SoundManager";
    }

    @a
    @ReactMethod
    public abstract void playTouchSound();
}
