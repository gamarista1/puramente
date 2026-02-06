package com.BV.LinearGradient;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

public class a implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new LinearGradientManager());
    }
}
