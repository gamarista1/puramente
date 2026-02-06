package com.reactnativecommunity.webview;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q extends a0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put(NativeRNCWebViewModuleSpec.NAME, new ReactModuleInfo(NativeRNCWebViewModuleSpec.NAME, NativeRNCWebViewModuleSpec.NAME, false, false, true, false, true));
        return hashMap;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNCWebViewManager());
        return arrayList;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeRNCWebViewModuleSpec.NAME)) {
            return new RNCWebViewModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new p();
    }
}
