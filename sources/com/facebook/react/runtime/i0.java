package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.C3425s;
import com.facebook.react.uimanager.C3426t;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.r;
import java.util.Objects;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z8.C4236a;

public final class i0 extends Z {

    /* renamed from: z  reason: collision with root package name */
    private static final a f41316z = new a((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    private final h0 f41317t;

    /* renamed from: u  reason: collision with root package name */
    private final C3426t f41318u = new C3426t(this);

    /* renamed from: v  reason: collision with root package name */
    private C3425s f41319v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f41320w;

    /* renamed from: x  reason: collision with root package name */
    private int f41321x;

    /* renamed from: y  reason: collision with root package name */
    private int f41322y;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(Context context, h0 h0Var) {
        super(context);
        C6496s.h(h0Var, "surface");
        this.f41317t = h0Var;
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f41319v = new C3425s(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    /* access modifiers changed from: protected */
    public void d(MotionEvent motionEvent, boolean z10) {
        C6496s.h(motionEvent, "event");
        if (this.f41319v != null) {
            EventDispatcher i10 = this.f41317t.i();
            if (i10 != null) {
                C3425s sVar = this.f41319v;
                if (sVar != null) {
                    sVar.k(motionEvent, i10, z10);
                    return;
                }
                return;
            }
            U5.a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
        } else if (ReactFeatureFlags.dispatchPointerEvents) {
            U5.a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        }
    }

    /* access modifiers changed from: protected */
    public void e(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "event");
        EventDispatcher i10 = this.f41317t.i();
        if (i10 != null) {
            this.f41318u.c(motionEvent, i10, this.f41317t.l().i());
        } else {
            U5.a.I("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
        }
    }

    public void f(Throwable th2) {
        C6496s.h(th2, "t");
        ReactHostImpl l10 = this.f41317t.l();
        C6496s.g(l10, "getReactHost(...)");
        String objects = Objects.toString(th2.getMessage(), "");
        C6496s.e(objects);
        l10.G0(new r(objects, this, th2));
    }

    public boolean g() {
        if (!this.f41317t.o() || this.f41317t.l().i() == null) {
            return false;
        }
        return true;
    }

    public ReactContext getCurrentReactContext() {
        if (this.f41317t.o()) {
            return this.f41317t.l().i();
        }
        return null;
    }

    public String getJSModuleName() {
        String j10 = this.f41317t.j();
        C6496s.g(j10, "<get-moduleName>(...)");
        return j10;
    }

    public int getUIManagerType() {
        return 2;
    }

    public boolean h() {
        if (!this.f41317t.o() || !this.f41317t.l().I0()) {
            return false;
        }
        return true;
    }

    public boolean m() {
        return this.f41317t.o();
    }

    public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
        C6496s.h(view, "childView");
        C6496s.h(motionEvent, "ev");
        EventDispatcher i10 = this.f41317t.i();
        if (i10 != null) {
            this.f41318u.e(motionEvent, i10);
            C3425s sVar = this.f41319v;
            if (sVar != null) {
                sVar.o();
            }
        }
    }

    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
        C3425s sVar;
        C6496s.h(motionEvent, "ev");
        EventDispatcher i10 = this.f41317t.i();
        if (i10 != null) {
            this.f41318u.f(motionEvent, i10);
            if (view != null && (sVar = this.f41319v) != null) {
                sVar.p(view, motionEvent, i10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f41320w && z10) {
            Point viewportOffset = getViewportOffset();
            this.f41317t.s(this.f41321x, this.f41322y, viewportOffset.x, viewportOffset.y);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        C4236a.c(0, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                i14 = Math.max(i14, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            i12 = i14;
        } else {
            i12 = View.MeasureSpec.getSize(i10);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int i16 = 0;
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                i16 = Math.max(i16, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            i13 = i16;
        } else {
            i13 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(i12, i13);
        this.f41320w = true;
        this.f41321x = i10;
        this.f41322y = i11;
        Point viewportOffset = getViewportOffset();
        this.f41317t.s(i10, i11, viewportOffset.x, viewportOffset.y);
        C4236a.i(0);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setIsFabric(boolean z10) {
        super.setIsFabric(true);
    }
}
