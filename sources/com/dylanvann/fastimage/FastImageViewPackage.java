package com.dylanvann.fastimage;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FastImageViewPackage extends a0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeFastImageViewModuleSpec.NAME, new ReactModuleInfo(NativeFastImageViewModuleSpec.NAME, NativeFastImageViewModuleSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewManager());
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeFastImageViewModuleSpec.NAME)) {
            return new FastImageViewModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new d();
    }
}
