package com.swmansion.reanimated.nativeProxy;

import B7.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;

@a
public class EventHandler implements RCTEventEmitter {
    UIManagerModule.d mCustomEventNamesResolver;
    @a
    private final HybridData mHybridData;

    @a
    private EventHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(this.mCustomEventNamesResolver.a(str), i10, writableMap);
    }

    public native void receiveEvent(String str, int i10, WritableMap writableMap);

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
    }
}
