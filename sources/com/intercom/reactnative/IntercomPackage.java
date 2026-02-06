package com.intercom.reactnative;

import com.facebook.react.P;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntercomPackage implements P {
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntercomModule(reactApplicationContext));
        arrayList.add(new IntercomEventEmitter(reactApplicationContext));
        return arrayList;
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return super.getModule(str, reactApplicationContext);
    }
}
