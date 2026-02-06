package com.swmansion.reanimated;

import R7.a;
import com.facebook.react.C3446x;
import com.facebook.react.J;
import com.facebook.react.P;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import z8.C4236a;

public class ReanimatedPackage extends a0 implements P {
    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C4236a.c(0, "createUIManagerModule");
        try {
            return ReanimatedUIManagerFactory.create(reactApplicationContext, getReactInstanceManager(reactApplicationContext).H(reactApplicationContext), -1);
        } finally {
            C4236a.i(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0(Map map) {
        return map;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeReanimatedModuleSpec.NAME)) {
            return new ReanimatedModule(reactApplicationContext);
        }
        if (str.equals(UIManagerModule.NAME)) {
            return createUIManager(reactApplicationContext);
        }
        return null;
    }

    public J getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((C3446x) reactApplicationContext.getApplicationContext()).a().c();
    }

    public a getReactModuleInfoProvider() {
        Class[] clsArr = {ReanimatedModule.class, ReanimatedUIManager.class};
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            Class cls = clsArr[i10];
            Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
            Objects.requireNonNull(aVar);
            Q7.a aVar2 = aVar;
            hashMap.put(aVar2.name(), new ReactModuleInfo(aVar2.name(), cls.getName(), true, aVar2.needsEagerInit(), aVar2.isCxxModule(), true));
        }
        return new h(hashMap);
    }
}
