package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a  reason: collision with root package name */
    private int f55518a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f55519b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f55520c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f55521d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f55521d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f55521d = view.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        if (this.f55519b == 1) {
            return true;
        }
        return false;
    }

    public boolean H() {
        if (this.f55519b == 2) {
            return true;
        }
        return false;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (!G()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f55521d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f55519b = 1;
            int i10 = this.f55518a + this.f55520c;
            if (z10) {
                F(view, i10, 175, Va.a.f53420c);
                return;
            }
            view.setTranslationY((float) i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (!H()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f55521d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f55519b = 2;
            if (z10) {
                F(view, 0, 225, Va.a.f53421d);
                return;
            }
            view.setTranslationY((float) 0);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f55518a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i10);
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
