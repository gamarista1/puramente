package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* renamed from: com.facebook.react.uimanager.g0  reason: case insensitive filesystem */
public interface C3413g0 {
    void destroyState();

    ReadableNativeMap getStateData();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap writableMap);
}
