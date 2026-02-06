package com.reactcommunity.rndatetimepicker;

import R7.a;
import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

public class l extends a0 {
    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("RNCDatePicker", new ReactModuleInfo("RNCDatePicker", "RNCDatePicker", false, false, false, false, true));
        hashMap.put("RNCTimePicker", new ReactModuleInfo("RNCTimePicker", "RNCTimePicker", false, false, false, false, true));
        return hashMap;
    }

    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNCDatePicker")) {
            return new DatePickerModule(reactApplicationContext);
        }
        if (str.equals("RNCTimePicker")) {
            return new TimePickerModule(reactApplicationContext);
        }
        return null;
    }

    public a getReactModuleInfoProvider() {
        return new k();
    }
}
