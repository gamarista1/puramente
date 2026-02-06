package com.facebook.react.uimanager.events;

import B7.a;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

@a
@Deprecated
public interface RCTEventEmitter extends JavaScriptModule {
    @Deprecated
    void receiveEvent(int i10, String str, WritableMap writableMap);

    @Deprecated
    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}
