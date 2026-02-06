package com.facebook.react.fabric;

import B7.a;
import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.C3413g0;

@a
@SuppressLint({"MissingNativeLoadLibrary"})
public class StateWrapperImpl extends HybridClassBase implements C3413g0 {
    private static final String TAG = "StateWrapperImpl";

    static {
        FabricSoLoader.staticInit();
    }

    private StateWrapperImpl() {
        initHybrid();
    }

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private native void initHybrid();

    public void destroyState() {
        if (isValid()) {
            resetNative();
        }
    }

    public ReadableNativeMap getStateData() {
        if (isValid()) {
            return getStateDataImpl();
        }
        U5.a.m(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    public ReadableMapBuffer getStateDataMapBuffer() {
        if (isValid()) {
            return getStateMapBufferDataImpl();
        }
        U5.a.m(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    public String toString() {
        if (!isValid()) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        if (stateDataImpl == null) {
            return "<unexpected null>";
        }
        return stateDataImpl.toString();
    }

    public void updateState(WritableMap writableMap) {
        if (!isValid()) {
            U5.a.m(TAG, "Race between StateWrapperImpl destruction and updateState");
        } else {
            updateStateImpl((NativeMap) writableMap);
        }
    }

    public native void updateStateImpl(NativeMap nativeMap);
}
