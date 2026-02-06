package com.facebook.react.fabric;

import K7.b;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;

public class SurfaceHandlerBinding extends HybridClassBase implements b {
    public static final int DISPLAY_MODE_HIDDEN = 2;
    public static final int DISPLAY_MODE_SUSPENDED = 1;
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String str) {
        initHybrid(0, str);
    }

    private native void initHybrid(int i10, String str);

    private native void setDisplayMode(int i10);

    private native void setLayoutConstraintsNative(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, float f16);

    public native String getModuleName();

    public native int getSurfaceId();

    public native boolean isRunning();

    public void setLayoutConstraints(int i10, int i11, int i12, int i13, boolean z10, boolean z11, float f10) {
        setLayoutConstraintsNative(LayoutMetricsConversions.getMinSize(i10) / f10, LayoutMetricsConversions.getMaxSize(i10) / f10, LayoutMetricsConversions.getMinSize(i11) / f10, LayoutMetricsConversions.getMaxSize(i11) / f10, ((float) i12) / f10, ((float) i13) / f10, z10, z11, f10);
    }

    public void setMountable(boolean z10) {
        setDisplayMode(z10 ^ true ? 1 : 0);
    }

    public native void setProps(NativeMap nativeMap);
}
