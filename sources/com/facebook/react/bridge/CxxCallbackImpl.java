package com.facebook.react.bridge;

import B7.a;
import com.facebook.jni.HybridClassBase;

@a
public class CxxCallbackImpl extends HybridClassBase implements Callback {
    @a
    private CxxCallbackImpl() {
    }

    private native void nativeInvoke(NativeArray nativeArray);

    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
