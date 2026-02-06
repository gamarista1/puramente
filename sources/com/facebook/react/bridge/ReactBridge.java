package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import z8.C4236a;

public class ReactBridge {
    private static volatile boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (!sDidInit) {
                sLoadStartTime = SystemClock.uptimeMillis();
                C4236a.c(0, "ReactBridge.staticInit::load:reactnativejni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
                SoLoader.t("reactnativejni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
                C4236a.i(0);
                sLoadEndTime = SystemClock.uptimeMillis();
                sDidInit = true;
            }
        }
    }
}
