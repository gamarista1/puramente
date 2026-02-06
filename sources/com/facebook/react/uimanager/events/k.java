package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.C3405c0;
import com.facebook.react.uimanager.C3407d0;
import kotlin.jvm.internal.C6496s;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f41615a = new k();

    private k() {
    }

    public static final void a(View view, MotionEvent motionEvent) {
        C6496s.h(view, "view");
        C6496s.h(motionEvent, "event");
        C3405c0 a10 = C3407d0.a(view);
        if (a10 != null) {
            a10.onChildEndedNativeGesture(view, motionEvent);
        }
    }

    public static final void b(View view, MotionEvent motionEvent) {
        C6496s.h(view, "view");
        C6496s.h(motionEvent, "event");
        C3405c0 a10 = C3407d0.a(view);
        if (a10 != null) {
            a10.onChildStartedNativeGesture(view, motionEvent);
        }
    }
}
