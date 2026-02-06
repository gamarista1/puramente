package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.intercom.android.sdk.models.AttributeType;

public class m extends d {

    /* renamed from: a  reason: collision with root package name */
    private String f42319a;

    /* renamed from: b  reason: collision with root package name */
    private int f42320b;

    public m(int i10, int i11, String str, int i12) {
        super(i10, i11);
        this.f42319a = str;
        this.f42320b = i12;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(AttributeType.TEXT, this.f42319a);
        createMap.putInt("eventCount", this.f42320b);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    public String getEventName() {
        return "topChange";
    }
}
