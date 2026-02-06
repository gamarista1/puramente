package com.dylanvann.fastimage.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

public class FastImageLoadEvent extends d {
    private final int height;
    private final int width;

    public FastImageLoadEvent(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.width = i12;
        this.height = i13;
    }

    /* access modifiers changed from: protected */
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Snapshot.WIDTH, this.width);
        createMap.putInt(Snapshot.HEIGHT, this.height);
        return createMap;
    }

    public String getEventName() {
        return "onFastImageLoad";
    }
}
