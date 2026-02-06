package com.facebook.react.uimanager;

import M7.b;
import U5.a;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.o;
import com.facebook.react.uimanager.events.p;
import com.facebook.react.uimanager.events.q;
import n7.C3863a;

/* renamed from: com.facebook.react.uimanager.t  reason: case insensitive filesystem */
public class C3426t {

    /* renamed from: a  reason: collision with root package name */
    private int f41813a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f41814b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    private boolean f41815c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f41816d = Long.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f41817e;

    /* renamed from: f  reason: collision with root package name */
    private final p f41818f = new p();

    public C3426t(ViewGroup viewGroup) {
        this.f41817e = viewGroup;
    }

    private void a(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f41813a == -1) {
            a.I("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        C3863a.b(!this.f41815c, "Expected to not have already sent a cancel for this gesture");
        int f10 = n0.f(this.f41817e);
        int i10 = this.f41813a;
        q qVar = q.CANCEL;
        long j10 = this.f41816d;
        float[] fArr = this.f41814b;
        ((EventDispatcher) C3863a.c(eventDispatcher)).h(o.h(f10, i10, qVar, motionEvent, j10, fArr[0], fArr[1], this.f41818f));
    }

    private int b(MotionEvent motionEvent) {
        return i0.c(motionEvent.getX(), motionEvent.getY(), this.f41817e, this.f41814b, (int[]) null);
    }

    private void d(int i10, int i11, ReactContext reactContext) {
        UIManager g10;
        if (b.g() && reactContext != null && (g10 = n0.g(reactContext, 2)) != null) {
            g10.markActiveTouchForTag(i10, i11);
        }
    }

    private void g(int i10, int i11, ReactContext reactContext) {
        UIManager g10;
        if (b.g() && reactContext != null && (g10 = n0.g(reactContext, 2)) != null) {
            g10.sweepActiveTouchForTag(i10, i11);
        }
    }

    public void c(MotionEvent motionEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        EventDispatcher eventDispatcher2 = eventDispatcher;
        ReactContext reactContext2 = reactContext;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f41813a != -1) {
                a.m("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f41815c = false;
            this.f41816d = motionEvent.getEventTime();
            this.f41813a = b(motionEvent);
            d(n0.f(this.f41817e), this.f41813a, reactContext2);
            int f10 = n0.f(this.f41817e);
            int i10 = this.f41813a;
            q qVar = q.START;
            long j10 = this.f41816d;
            float[] fArr = this.f41814b;
            eventDispatcher2.h(o.h(f10, i10, qVar, motionEvent, j10, fArr[0], fArr[1], this.f41818f));
        } else if (!this.f41815c) {
            if (this.f41813a == -1) {
                a.m("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                b(motionEvent);
                int f11 = n0.f(this.f41817e);
                int i11 = this.f41813a;
                q qVar2 = q.END;
                long j11 = this.f41816d;
                float[] fArr2 = this.f41814b;
                eventDispatcher2.h(o.h(f11, i11, qVar2, motionEvent, j11, fArr2[0], fArr2[1], this.f41818f));
                g(f11, this.f41813a, reactContext2);
                this.f41813a = -1;
                this.f41816d = Long.MIN_VALUE;
            } else if (action == 2) {
                b(motionEvent);
                int f12 = n0.f(this.f41817e);
                int i12 = this.f41813a;
                q qVar3 = q.MOVE;
                long j12 = this.f41816d;
                float[] fArr3 = this.f41814b;
                eventDispatcher2.h(o.h(f12, i12, qVar3, motionEvent, j12, fArr3[0], fArr3[1], this.f41818f));
            } else if (action == 5) {
                int f13 = n0.f(this.f41817e);
                int i13 = this.f41813a;
                q qVar4 = q.START;
                long j13 = this.f41816d;
                float[] fArr4 = this.f41814b;
                eventDispatcher2.h(o.h(f13, i13, qVar4, motionEvent, j13, fArr4[0], fArr4[1], this.f41818f));
            } else if (action == 6) {
                int f14 = n0.f(this.f41817e);
                int i14 = this.f41813a;
                q qVar5 = q.END;
                long j14 = this.f41816d;
                float[] fArr5 = this.f41814b;
                eventDispatcher2.h(o.h(f14, i14, qVar5, motionEvent, j14, fArr5[0], fArr5[1], this.f41818f));
            } else if (action == 3) {
                if (this.f41818f.c(motionEvent.getDownTime())) {
                    a(motionEvent, eventDispatcher);
                } else {
                    a.m("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                g(n0.f(this.f41817e), this.f41813a, reactContext2);
                this.f41813a = -1;
                this.f41816d = Long.MIN_VALUE;
            } else {
                a.I("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f41813a);
            }
        }
    }

    public void e(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        this.f41815c = false;
    }

    public void f(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (!this.f41815c) {
            a(motionEvent, eventDispatcher);
            this.f41815c = true;
            this.f41813a = -1;
        }
    }
}
