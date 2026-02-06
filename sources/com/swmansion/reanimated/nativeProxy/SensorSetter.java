package com.swmansion.reanimated.nativeProxy;

import B7.a;
import com.facebook.jni.HybridData;

@a
public class SensorSetter {
    @a
    private final HybridData mHybridData;

    @a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i10);
}
