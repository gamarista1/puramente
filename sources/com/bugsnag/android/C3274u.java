package com.bugsnag.android;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.bugsnag.android.u  reason: case insensitive filesystem */
public class C3274u extends a0 {

    /* renamed from: com.bugsnag.android.u$a */
    class a implements R7.a {
        a() {
        }

        public Map a() {
            return Collections.singletonMap(NativeBugsnagSpec.NAME, new ReactModuleInfo(NativeBugsnagSpec.NAME, NativeBugsnagSpec.NAME, false, true, false, false, true));
        }
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeBugsnagSpec.NAME)) {
            return new NativeBugsnagImpl(reactApplicationContext);
        }
        return null;
    }

    public R7.a getReactModuleInfoProvider() {
        return new a();
    }
}
