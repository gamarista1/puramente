package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import com.google.android.gms.common.api.a;

abstract class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f55493d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f55494e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55495f;

    /* renamed from: g  reason: collision with root package name */
    private int f55496g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f55497h;

    /* renamed from: i  reason: collision with root package name */
    private int f55498i = -1;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f55499j;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f55500a;

        /* renamed from: b  reason: collision with root package name */
        private final View f55501b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f55500a = coordinatorLayout;
            this.f55501b = view;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f55501b != null && (overScroller = b.this.f55494e) != null) {
                if (overScroller.computeScrollOffset()) {
                    b bVar = b.this;
                    bVar.P(this.f55500a, this.f55501b, bVar.f55494e.getCurrY());
                    C1680b0.g0(this.f55501b, this);
                    return;
                }
                b.this.N(this.f55500a, this.f55501b);
            }
        }
    }

    public b() {
    }

    private void I() {
        if (this.f55499j == null) {
            this.f55499j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f55496g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f55497h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f55496g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f55497h
            int r7 = r1 - r0
            r11.f55497h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f55499j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f55499j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f55499j
            int r4 = r11.f55496g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f55495f = r3
            r11.f55496g = r1
            android.view.VelocityTracker r13 = r11.f55499j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f55499j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f55499j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f55495f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.b.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean H(View view);

    /* access modifiers changed from: package-private */
    public final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        View view2 = view;
        Runnable runnable = this.f55493d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f55493d = null;
        }
        if (this.f55494e == null) {
            this.f55494e = new OverScroller(view.getContext());
        }
        this.f55494e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f55494e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            a aVar = new a(coordinatorLayout, view);
            this.f55493d = aVar;
            C1680b0.g0(view, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        N(coordinatorLayout, view);
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract int K(View view);

    /* access modifiers changed from: package-private */
    public abstract int L(View view);

    /* access modifiers changed from: package-private */
    public abstract int M();

    /* access modifiers changed from: package-private */
    public abstract void N(CoordinatorLayout coordinatorLayout, View view);

    /* access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: package-private */
    public abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f55498i < 0) {
            this.f55498i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f55495f) {
            int i10 = this.f55496g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f55497h) > this.f55498i) {
                this.f55497h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f55496g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (!H(view) || !coordinatorLayout.C(view, x10, y11)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f55495f = z10;
            if (z10) {
                this.f55497h = y11;
                this.f55496g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f55494e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f55494e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f55499j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
