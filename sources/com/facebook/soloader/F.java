package com.facebook.soloader;

import android.os.StrictMode;

public class F extends E {
    public String c() {
        return "SystemLoadWrapperSoSource";
    }

    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e10) {
            p.c("SoLoader", "Error loading library: " + str, e10);
            return 0;
        }
    }

    public String toString() {
        return c() + "[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }
}
