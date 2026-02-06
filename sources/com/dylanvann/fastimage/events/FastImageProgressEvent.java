package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.intercom.android.sdk.metrics.MetricTracker;

public class FastImageProgressEvent extends d {
    private final int mBytesRead;
    private final int mExpectedLength;

    public FastImageProgressEvent(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.mBytesRead = i12;
        this.mExpectedLength = i13;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(MetricTracker.Action.LOADED, this.mBytesRead);
        createMap.putInt("total", this.mExpectedLength);
        return createMap;
    }

    public String getEventName() {
        return "onFastImageProgress";
    }
}
