package com.facebook.react.views.drawer;

import O1.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import com.facebook.react.C3367m;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.events.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y1.C2930A;

public final class a extends O1.a {

    /* renamed from: p0  reason: collision with root package name */
    public static final b f41859p0 = new b((DefaultConstructorMarker) null);

    /* renamed from: m0  reason: collision with root package name */
    private int f41860m0 = 8388611;

    /* renamed from: n0  reason: collision with root package name */
    private int f41861n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f41862o0;

    /* renamed from: com.facebook.react.views.drawer.a$a  reason: collision with other inner class name */
    public static final class C0647a extends C1677a {
        C0647a() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C6496s.h(view, "host");
            C6496s.h(accessibilityEvent, "event");
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            Object tag = view.getTag(C3367m.f40931g);
            if (tag instanceof I.e) {
                accessibilityEvent.setClassName(I.e.f((I.e) tag));
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            C6496s.h(view, "host");
            C6496s.h(a10, "info");
            super.onInitializeAccessibilityNodeInfo(view, a10);
            I.e e10 = I.e.e(view);
            if (e10 != null) {
                a10.t0(I.e.f(e10));
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        C6496s.h(reactContext, "reactContext");
        C1680b0.o0(this, new C0647a());
    }

    public final void W() {
        d(this.f41860m0);
    }

    public final void X() {
        I(this.f41860m0);
    }

    public final void Y() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C6496s.f(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            a.f fVar = (a.f) layoutParams;
            fVar.f4707a = this.f41860m0;
            fVar.width = this.f41861n0;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            k.b(this, motionEvent);
            this.f41862o0 = true;
            return true;
        } catch (IllegalArgumentException e10) {
            U5.a.J("ReactNative", "Error intercepting touch event.", e10);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 1 && this.f41862o0) {
            k.a(this, motionEvent);
            this.f41862o0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDrawerPosition$ReactAndroid_release(int i10) {
        this.f41860m0 = i10;
        Y();
    }

    public final void setDrawerWidth$ReactAndroid_release(int i10) {
        this.f41861n0 = i10;
        Y();
    }
}
