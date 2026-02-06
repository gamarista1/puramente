package com.reactnativecommunity.asyncstorage;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i extends a0 {

    class a implements R7.a {
        a() {
        }

        public Map a() {
            HashMap hashMap = new HashMap();
            Class cls = new Class[]{AsyncStorageModule.class}[0];
            Q7.a aVar = (Q7.a) cls.getAnnotation(Q7.a.class);
            hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), true));
            return hashMap;
        }
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (!str.equals("RNCAsyncStorage")) {
            return null;
        }
        return new AsyncStorageModule(reactApplicationContext);
    }

    public R7.a getReactModuleInfoProvider() {
        try {
            return (R7.a) Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (IllegalAccessException | InstantiationException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e10);
        }
    }
}
