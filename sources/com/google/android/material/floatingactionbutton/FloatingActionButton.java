package com.google.android.material.floatingactionbutton;

import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.C4476a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.c;
import com.google.android.material.internal.o;
import ib.n;
import java.util.List;

public abstract class FloatingActionButton extends o implements C4476a, n, CoordinatorLayout.b {

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.E(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.H(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.I(coordinatorLayout, floatingActionButton, i10);
        }

        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a  reason: collision with root package name */
        private Rect f55954a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f55955b;

        public BaseBehavior() {
            this.f55955b = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f55954a == null) {
                this.f55954a = new Rect();
            }
            Rect rect = this.f55954a;
            c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                throw null;
            }
            throw null;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            throw null;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!F(view)) {
                return false;
            } else {
                L(view, floatingActionButton);
                return false;
            }
        }

        public boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List s10 = coordinatorLayout.s(floatingActionButton);
            int size = s10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) s10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.K(floatingActionButton, i10);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            android.support.v4.media.session.c.a(view);
            return E(coordinatorLayout, (FloatingActionButton) null, rect);
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f15720h == 0) {
                fVar.f15720h = 80;
            }
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.v4.media.session.c.a(view);
            return H(coordinatorLayout, (FloatingActionButton) null, view2);
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.c.a(view);
            return I(coordinatorLayout, (FloatingActionButton) null, i10);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f52948C1);
            this.f55955b = obtainStyledAttributes.getBoolean(j.f52956D1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
