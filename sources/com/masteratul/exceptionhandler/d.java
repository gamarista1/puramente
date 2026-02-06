package com.masteratul.exceptionhandler;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new ReactNativeExceptionHandlerModule(reactApplicationContext)});
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
