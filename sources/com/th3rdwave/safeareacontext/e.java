package com.th3rdwave.safeareacontext;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class e extends a0 {
    /* access modifiers changed from: private */
    public static final Map d(Map map) {
        return map;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "reactContext");
        return C6565s.q(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        C6496s.h(str, "name");
        C6496s.h(reactApplicationContext, "reactContext");
        if (C6496s.c(str, "RNCSafeAreaContext")) {
            return new SafeAreaContextModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        HashMap hashMap = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
        if (aVar != null) {
            String name = aVar.name();
            String name2 = aVar.name();
            String name3 = cls.getName();
            C6496s.g(name3, "getName(...)");
            hashMap.put(name, new ReactModuleInfo(name2, name3, true, aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), true));
        }
        return new d(hashMap);
    }
}
