package com.ReactNativeBlobUtil;

import R7.a;
import com.facebook.fbreact.specs.NativeBlobUtilsSpec;
import com.facebook.react.C3328a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

public class i extends C3328a {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeBlobUtilsSpec.NAME, new ReactModuleInfo(NativeBlobUtilsSpec.NAME, NativeBlobUtilsSpec.NAME, false, false, false, true));
        return hashMap;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeBlobUtilsSpec.NAME)) {
            return new ReactNativeBlobUtil(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new h();
    }
}
