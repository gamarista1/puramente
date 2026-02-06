package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.react.uimanager.c0  reason: case insensitive filesystem */
public interface C3405c0 {
    void onChildEndedNativeGesture(View view, MotionEvent motionEvent);

    void onChildStartedNativeGesture(MotionEvent motionEvent) {
        onChildStartedNativeGesture((View) null, motionEvent);
    }

    void onChildStartedNativeGesture(View view, MotionEvent motionEvent);
}
