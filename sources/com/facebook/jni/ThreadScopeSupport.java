package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import w8.C4145a;

@DoNotStrip
public class ThreadScopeSupport {
    static {
        C4145a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j10) {
        runStdFunctionImpl(j10);
    }

    private static native void runStdFunctionImpl(long j10);
}
