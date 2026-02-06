package com.reactnativecommunity.picker;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class h implements P {
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactDialogPickerManager());
        arrayList.add(new ReactDropdownPickerManager());
        return arrayList;
    }
}
