package com.oblador.storereview;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

public class d extends a0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNStoreReviewSpec.NAME, new ReactModuleInfo(NativeRNStoreReviewSpec.NAME, NativeRNStoreReviewSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNStoreReviewSpec.NAME)) {
            return new StoreReviewModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new c();
    }
}
