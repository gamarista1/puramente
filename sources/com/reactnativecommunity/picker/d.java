package com.reactnativecommunity.picker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class d extends com.facebook.react.uimanager.events.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f59285a;

    public d(int i10, int i11) {
        super(i10);
        this.f59285a = i11;
    }

    private WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f59285a);
        return createMap;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    public String getEventName() {
        return "topSelect";
    }
}
