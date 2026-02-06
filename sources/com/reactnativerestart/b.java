package com.reactnativerestart;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class b implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RestartModule(reactApplicationContext));
        return arrayList;
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }
}
