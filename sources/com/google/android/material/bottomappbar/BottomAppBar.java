package com.google.android.material.bottomappbar;

import Ua.i;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.c;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f55539a = i.f52917g;

    static /* synthetic */ void w(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View x(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        private final Rect f55540e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public WeakReference f55541f;

        /* renamed from: g  reason: collision with root package name */
        private int f55542g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f55543h = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                c.a(Behavior.this.f55541f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            c.a(view);
            return O(coordinatorLayout, (BottomAppBar) null, view2, view3, i10, i11);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f55541f = new WeakReference(bottomAppBar);
            View x10 = BottomAppBar.x(bottomAppBar);
            if (x10 != null && !C1680b0.S(x10)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) x10.getLayoutParams();
                fVar.f15716d = 49;
                this.f55542g = fVar.bottomMargin;
                BottomAppBar.w(bottomAppBar);
            }
            coordinatorLayout.K(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            c.a(view);
            return N(coordinatorLayout, (BottomAppBar) null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
