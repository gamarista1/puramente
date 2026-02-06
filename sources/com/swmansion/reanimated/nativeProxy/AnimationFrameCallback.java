package com.swmansion.reanimated.nativeProxy;

import B7.a;
import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;

@a
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {
    @a
    private final HybridData mHybridData;

    @a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onAnimationFrame(double d10);
}
