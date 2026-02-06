package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import io.branch.rnbranch.RNBranchModule;

public class FastImageErrorEvent extends d {
    private final ReadableMap mSource;

    public FastImageErrorEvent(int i10, int i11, ReadableMap readableMap) {
        super(i10, i11);
        this.mSource = readableMap;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        if (this.mSource != null) {
            createMap.putString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, "Invalid source prop:" + this.mSource);
        }
        return createMap;
    }

    public String getEventName() {
        return "onFastImageError";
    }
}
