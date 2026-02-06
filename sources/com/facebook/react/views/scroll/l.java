package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.jvm.internal.C6496s;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private VelocityTracker f42075a;

    /* renamed from: b  reason: collision with root package name */
    private float f42076b;

    /* renamed from: c  reason: collision with root package name */
    private float f42077c;

    public final void a(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        if (this.f42075a == null) {
            this.f42075a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f42075a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.f42076b = velocityTracker.getXVelocity();
                this.f42077c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.f42075a = null;
            }
        }
    }

    public final float b() {
        return this.f42076b;
    }

    public final float c() {
        return this.f42077c;
    }
}
