package com.facebook.react.bridge;

import B7.a;
import com.facebook.jni.HybridData;

@a
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    protected JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    public abstract String getName();
}
