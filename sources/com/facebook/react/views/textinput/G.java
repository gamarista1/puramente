package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;

class G extends d {

    /* renamed from: a  reason: collision with root package name */
    private int f42238a;

    /* renamed from: b  reason: collision with root package name */
    private int f42239b;

    public G(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f42238a = i12;
        this.f42239b = i13;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f42239b);
        createMap2.putInt(OpsMetricTracker.START, this.f42238a);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    public String getEventName() {
        return "topSelectionChange";
    }
}
