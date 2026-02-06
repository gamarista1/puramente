package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.uimanager.o  reason: case insensitive filesystem */
public abstract class C3422o implements Choreographer.FrameCallback {
    private final ReactContext reactContext;

    protected C3422o(ReactContext reactContext2) {
        C6496s.h(reactContext2, "reactContext");
        this.reactContext = reactContext2;
    }

    public void doFrame(long j10) {
        try {
            doFrameGuarded(j10);
        } catch (RuntimeException e10) {
            this.reactContext.handleException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void doFrameGuarded(long j10);
}
