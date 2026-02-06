package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.intercom.android.sdk.models.AttributeType;

class I extends d {

    /* renamed from: a  reason: collision with root package name */
    private String f42245a;

    public I(int i10, int i11, String str) {
        super(i10, i11);
        this.f42245a = str;
    }

    public boolean canCoalesce() {
        return false;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putString(AttributeType.TEXT, this.f42245a);
        return createMap;
    }

    public String getEventName() {
        return "topSubmitEditing";
    }
}
