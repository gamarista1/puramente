package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public interface P {
    List createNativeModules(ReactApplicationContext reactApplicationContext);

    List createViewManagers(ReactApplicationContext reactApplicationContext);

    NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        C6496s.h(str, "name");
        C6496s.h(reactApplicationContext, "reactContext");
        return null;
    }
}
