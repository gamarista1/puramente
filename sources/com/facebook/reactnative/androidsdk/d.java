package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.WritableMap;

public class d extends com.facebook.react.uimanager.events.d {

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f42384a;

    public d(int i10, int i11, WritableMap writableMap) {
        super(i10, i11);
        this.f42384a = writableMap;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        return this.f42384a;
    }

    public String getEventName() {
        return "topChange";
    }
}
