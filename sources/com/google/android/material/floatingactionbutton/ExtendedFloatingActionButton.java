package com.google.android.material.floatingactionbutton;

import Ua.i;
import Ua.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;

public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: t  reason: collision with root package name */
    private static final int f55946t = i.f52923m;

    /* renamed from: u  reason: collision with root package name */
    static final Property f55947u;

    /* renamed from: v  reason: collision with root package name */
    static final Property f55948v;

    /* renamed from: w  reason: collision with root package name */
    static final Property f55949w;

    /* renamed from: x  reason: collision with root package name */
    static final Property f55950x;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C1680b0.F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            C1680b0.D0(view, f10.intValue(), view.getPaddingTop(), C1680b0.E(view), view.getPaddingBottom());
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C1680b0.E(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            C1680b0.D0(view, C1680b0.F(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    static {
        Class<Float> cls = Float.class;
        f55947u = new a(cls, Snapshot.WIDTH);
        f55948v = new b(cls, Snapshot.HEIGHT);
        f55949w = new c(cls, "paddingStart");
        f55950x = new d(cls, "paddingEnd");
    }

    static /* synthetic */ a j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ a k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ void l(ExtendedFloatingActionButton extendedFloatingActionButton, a aVar, e eVar) {
        throw null;
    }

    static /* synthetic */ a m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    static /* synthetic */ a n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        throw null;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a  reason: collision with root package name */
        private Rect f55951a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f55952b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f55953c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f55952b = false;
            this.f55953c = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f55951a == null) {
                this.f55951a = new Rect();
            }
            Rect rect = this.f55951a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f55953c) {
                ExtendedFloatingActionButton.m(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.n(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, (a) null, (e) null);
        }

        public boolean F(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!G(view)) {
                return false;
            } else {
                M(view, extendedFloatingActionButton);
                return false;
            }
        }

        public boolean I(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List s10 = coordinatorLayout.s(extendedFloatingActionButton);
            int size = s10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) s10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.K(extendedFloatingActionButton, i10);
            return true;
        }

        /* access modifiers changed from: protected */
        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f55953c) {
                ExtendedFloatingActionButton.j(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.l(extendedFloatingActionButton, (a) null, (e) null);
        }

        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            android.support.v4.media.session.c.a(view);
            return F(coordinatorLayout, (ExtendedFloatingActionButton) null, rect);
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f15720h == 0) {
                fVar.f15720h = 80;
            }
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            android.support.v4.media.session.c.a(view);
            return H(coordinatorLayout, (ExtendedFloatingActionButton) null, view2);
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.c.a(view);
            return I(coordinatorLayout, (ExtendedFloatingActionButton) null, i10);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53312y1);
            this.f55952b = obtainStyledAttributes.getBoolean(j.f53320z1, false);
            this.f55953c = obtainStyledAttributes.getBoolean(j.f52932A1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
