package com.swmansion.gesturehandler.react;

import B7.a;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.soloader.SoLoader;

@a
public class RNGestureHandlerComponentsRegistry {
    @a
    private final HybridData mHybridData;

    static {
        SoLoader.t("fabricjni");
        SoLoader.t("gesturehandler");
    }

    @a
    private RNGestureHandlerComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @a
    public static RNGestureHandlerComponentsRegistry register(ComponentFactory componentFactory) {
        return new RNGestureHandlerComponentsRegistry(componentFactory);
    }
}
