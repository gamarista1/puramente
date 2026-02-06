package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import androidx.core.view.C1712s;
import androidx.core.view.D0;
import java.util.List;
import s1.C2589a;

abstract class c extends d {

    /* renamed from: d  reason: collision with root package name */
    final Rect f55503d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f55504e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f55505f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f55506g;

    public c() {
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View H10 = H(coordinatorLayout.s(view));
        if (H10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f55503d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H10.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H10.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            D0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1680b0.x(coordinatorLayout) && !C1680b0.x(view)) {
                rect.left += lastWindowInsets.k();
                rect.right -= lastWindowInsets.l();
            }
            Rect rect2 = this.f55504e;
            C1712s.a(N(fVar.f15715c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I10 = I(H10);
            view.layout(rect2.left, rect2.top - I10, rect2.right, rect2.bottom - I10);
            this.f55505f = rect2.top - H10.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i10);
        this.f55505f = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View H(List list);

    /* access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.f55506g == 0) {
            return 0;
        }
        float J10 = J(view);
        int i10 = this.f55506g;
        return C2589a.b((int) (J10 * ((float) i10)), 0, i10);
    }

    /* access modifiers changed from: package-private */
    public abstract float J(View view);

    public final int K() {
        return this.f55506g;
    }

    /* access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int M() {
        return this.f55505f;
    }

    public final void O(int i10) {
        this.f55506g = i10;
    }

    /* access modifiers changed from: protected */
    public boolean P() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H10;
        int i14;
        D0 lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 != -1 && i15 != -2) || (H10 = H(coordinatorLayout.s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C1680b0.x(H10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int L10 = size + L(H10);
        int measuredHeight = H10.getMeasuredHeight();
        if (P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L10 -= measuredHeight;
        }
        if (i15 == -1) {
            i14 = 1073741824;
        } else {
            i14 = Integer.MIN_VALUE;
        }
        coordinatorLayout.L(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L10, i14), i13);
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
