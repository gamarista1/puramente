package com.reactnativepagerview;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class c implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.n();
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.q(new PagerViewViewManager(), new LEGACY_PagerViewViewManager());
    }
}
