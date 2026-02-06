package com.zoontek.rnpermissions;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

public class c extends a0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNPermissionsSpec.NAME, new ReactModuleInfo(NativeRNPermissionsSpec.NAME, NativeRNPermissionsSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNPermissionsSpec.NAME)) {
            return new RNPermissionsModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new b();
    }
}
