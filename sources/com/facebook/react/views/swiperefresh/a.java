package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.swiperefreshlayout.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a extends c {

    /* renamed from: u0  reason: collision with root package name */
    private static final C0652a f42078u0 = new C0652a((DefaultConstructorMarker) null);

    /* renamed from: n0  reason: collision with root package name */
    private boolean f42079n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f42080o0;

    /* renamed from: p0  reason: collision with root package name */
    private float f42081p0;

    /* renamed from: q0  reason: collision with root package name */
    private final int f42082q0;

    /* renamed from: r0  reason: collision with root package name */
    private float f42083r0;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f42084s0;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f42085t0;

    /* renamed from: com.facebook.react.views.swiperefresh.a$a  reason: collision with other inner class name */
    private static final class C0652a {
        public /* synthetic */ C0652a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0652a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        C6496s.h(reactContext, "reactContext");
        this.f42082q0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f42083r0 = motionEvent.getX();
            this.f42084s0 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f42083r0);
            if (this.f42084s0 || abs > ((float) this.f42082q0)) {
                this.f42084s0 = true;
                return false;
            }
        }
        return true;
    }

    public boolean c() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.canScrollVertically(-1);
        }
        return super.c();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        if (!B(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        k.b(this, motionEvent);
        this.f42085t0 = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f42079n0) {
            this.f42079n0 = true;
            setProgressViewOffset(this.f42081p0);
            setRefreshing(this.f42080o0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 1 && this.f42085t0) {
            k.a(this, motionEvent);
            this.f42085t0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void setProgressViewOffset(float f10) {
        this.f42081p0 = f10;
        if (this.f42079n0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(G.h(f10)) - progressCircleDiameter, Math.round(G.h(f10 + 64.0f)) - progressCircleDiameter);
        }
    }

    public void setRefreshing(boolean z10) {
        this.f42080o0 = z10;
        if (this.f42079n0) {
            super.setRefreshing(z10);
        }
    }
}
