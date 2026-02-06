package com.reactnativepagerview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.f;
import kotlin.jvm.internal.C6496s;

public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Integer f59438a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f59439b;

    /* renamed from: c  reason: collision with root package name */
    private int f59440c = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: d  reason: collision with root package name */
    private float f59441d;

    /* renamed from: e  reason: collision with root package name */
    private float f59442e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        C6496s.h(context, "context");
    }

    private final boolean a(int i10, float f10) {
        int i11 = -((int) Math.signum(f10));
        if (i10 == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i11);
            }
            return false;
        } else if (i10 == 1) {
            View child2 = getChild();
            if (child2 != null) {
                return child2.canScrollVertically(i11);
            }
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private final void b(MotionEvent motionEvent) {
        boolean z10;
        float f10;
        boolean z11;
        f parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            float f11 = 1.0f;
            if (!a(orientation, -1.0f) && !a(orientation, 1.0f)) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                this.f59441d = motionEvent.getX();
                this.f59442e = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.f59441d;
                float y10 = motionEvent.getY() - this.f59442e;
                if (orientation == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float abs = Math.abs(x10);
                if (z10) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                float f12 = abs * f10;
                float abs2 = Math.abs(y10);
                if (!z10) {
                    f11 = 0.5f;
                }
                float f13 = abs2 * f11;
                int i10 = this.f59440c;
                if (f12 > ((float) i10) || f13 > ((float) i10)) {
                    if (f13 > f12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 == z11) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    if (!z10) {
                        x10 = y10;
                    }
                    if (a(orientation, x10)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[EDGE_INSN: B:13:0x001e->B:10:0x001e ?: BREAK  
    EDGE_INSN: B:15:0x001e->B:10:0x001e ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.viewpager2.widget.f getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x000c
            android.view.View r0 = (android.view.View) r0
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0 instanceof androidx.viewpager2.widget.f
            if (r1 != 0) goto L_0x001e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x000c
            android.view.View r0 = (android.view.View) r0
            goto L_0x000d
        L_0x001e:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.f
            if (r1 == 0) goto L_0x0025
            r2 = r0
            androidx.viewpager2.widget.f r2 = (androidx.viewpager2.widget.f) r2
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.b.getParentViewPager():androidx.viewpager2.widget.f");
    }

    public final boolean getDidSetInitialIndex() {
        return this.f59439b;
    }

    public final Integer getInitialIndex() {
        return this.f59438a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "e");
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setDidSetInitialIndex(boolean z10) {
        this.f59439b = z10;
    }

    public final void setInitialIndex(Integer num) {
        this.f59438a = num;
    }
}
