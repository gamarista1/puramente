package com.facebook.react.fabric.events;

import B7.a;
import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;

@a
@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper extends HybridClassBase {
    static {
        FabricSoLoader.staticInit();
    }

    @a
    private EventEmitterWrapper() {
    }

    private native void dispatchEvent(String str, NativeMap nativeMap, int i10);

    private native void dispatchEventSynchronously(String str, NativeMap nativeMap);

    private native void dispatchUniqueEvent(String str, NativeMap nativeMap);

    public synchronized void destroy() {
        if (isValid()) {
            resetNative();
        }
    }

    public synchronized void dispatch(String str, WritableMap writableMap, int i10) {
        if (isValid()) {
            dispatchEvent(str, (NativeMap) writableMap, i10);
        }
    }

    public synchronized void dispatchEventSynchronously(String str, WritableMap writableMap) {
        if (isValid()) {
            dispatchEventSynchronously(str, (NativeMap) writableMap);
        }
    }

    public synchronized void dispatchUnique(String str, WritableMap writableMap) {
        if (isValid()) {
            dispatchUniqueEvent(str, (NativeMap) writableMap);
        }
    }
}
