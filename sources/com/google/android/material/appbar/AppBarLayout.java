package com.google.android.material.appbar;

import Ua.f;
import Ua.i;
import Ua.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.core.view.I;
import ib.C5020g;
import ib.C5021h;
import j.C2115a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import q1.C2429a;
import s1.C2589a;
import y1.C2930A;
import y1.D;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: t  reason: collision with root package name */
    private static final int f55437t = i.f52913c;

    /* renamed from: a  reason: collision with root package name */
    private int f55438a;

    /* renamed from: b  reason: collision with root package name */
    private int f55439b;

    /* renamed from: c  reason: collision with root package name */
    private int f55440c;

    /* renamed from: d  reason: collision with root package name */
    private int f55441d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f55442e;

    /* renamed from: f  reason: collision with root package name */
    private int f55443f;

    /* renamed from: g  reason: collision with root package name */
    private D0 f55444g;

    /* renamed from: h  reason: collision with root package name */
    private List f55445h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55446i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f55447j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f55448k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f55449l;

    /* renamed from: m  reason: collision with root package name */
    private int f55450m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference f55451n;

    /* renamed from: o  reason: collision with root package name */
    private ValueAnimator f55452o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final List f55453p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f55454q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public Drawable f55455r;

    /* renamed from: s  reason: collision with root package name */
    private Behavior f55456s;

    protected static class BaseBehavior<T extends AppBarLayout> extends b {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f55457k;

        /* renamed from: l  reason: collision with root package name */
        private int f55458l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f55459m;

        /* renamed from: n  reason: collision with root package name */
        private d f55460n;

        /* renamed from: o  reason: collision with root package name */
        private WeakReference f55461o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f55462a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f55463b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f55462a = coordinatorLayout;
                this.f55463b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f55462a, this.f55463b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b implements D {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f55465a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f55466b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f55467c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f55468d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f55465a = coordinatorLayout;
                this.f55466b = appBarLayout;
                this.f55467c = view;
                this.f55468d = i10;
            }

            public boolean a(View view, D.a aVar) {
                BaseBehavior.this.q(this.f55465a, this.f55466b, this.f55467c, 0, this.f55468d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class c implements D {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f55470a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f55471b;

            c(AppBarLayout appBarLayout, boolean z10) {
                this.f55470a = appBarLayout;
                this.f55471b = z10;
            }

            public boolean a(View view, D.a aVar) {
                this.f55470a.setExpanded(this.f55471b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (M() != (-appBarLayout.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, appBarLayout, C2930A.a.f28610q, false);
            }
            if (M() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i10 = -appBarLayout.getDownNestedPreScrollRange();
                if (i10 != 0) {
                    C1680b0.k0(coordinatorLayout, C2930A.a.f28611r, (CharSequence) null, new b(coordinatorLayout, appBarLayout, view, i10));
                    return;
                }
                return;
            }
            T(coordinatorLayout, appBarLayout, C2930A.a.f28611r, true);
        }

        private void T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C2930A.a aVar, boolean z10) {
            C1680b0.k0(coordinatorLayout, aVar, (CharSequence) null, new c(appBarLayout, z10));
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int i11;
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                i11 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i11 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            V(coordinatorLayout, appBarLayout, i10, i11);
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int M10 = M();
            if (M10 == i10) {
                ValueAnimator valueAnimator = this.f55459m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f55459m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f55459m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f55459m = valueAnimator3;
                valueAnimator3.setInterpolator(Va.a.f53422e);
                this.f55459m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f55459m.setDuration((long) Math.min(i11, 600));
            this.f55459m.setIntValues(new int[]{M10, i10});
            this.f55459m.start();
        }

        private int W(int i10, int i11, int i12) {
            if (i10 < (i11 + i12) / 2) {
                return i11;
            }
            return i12;
        }

        private boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (!appBarLayout.j() || coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) {
                return false;
            }
            return true;
        }

        private static boolean Z(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private View a0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof androidx.core.view.D) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View b0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int c0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (Z(eVar.c(), 32)) {
                    top -= eVar.topMargin;
                    bottom += eVar.bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private int f0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = eVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = childAt.getHeight() + eVar.topMargin + eVar.bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= C1680b0.B(childAt);
                        }
                    }
                    if (C1680b0.x(childAt)) {
                        i11 -= appBarLayout.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = (float) i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation(((float) (abs - childAt.getTop())) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean s0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List t10 = coordinatorLayout.t(appBarLayout);
            int size = t10.size();
            int i10 = 0;
            while (i10 < size) {
                CoordinatorLayout.c e10 = ((CoordinatorLayout.f) ((View) t10.get(i10)).getLayoutParams()).e();
                if (!(e10 instanceof ScrollingViewBehavior)) {
                    i10++;
                } else if (((ScrollingViewBehavior) e10).K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        private void t0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int M10 = M() - topInset;
            int c02 = c0(appBarLayout, M10);
            if (c02 >= 0) {
                View childAt = appBarLayout.getChildAt(c02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (c02 == 0 && C1680b0.x(appBarLayout) && C1680b0.x(childAt)) {
                        i10 -= appBarLayout.getTopInset();
                    }
                    if (Z(c10, 2)) {
                        i11 += C1680b0.B(childAt);
                    } else if (Z(c10, 5)) {
                        int B10 = C1680b0.B(childAt) + i11;
                        if (M10 < B10) {
                            i10 = B10;
                        } else {
                            i11 = B10;
                        }
                    }
                    if (Z(c10, 32)) {
                        i10 += eVar.topMargin;
                        i11 -= eVar.bottomMargin;
                    }
                    U(coordinatorLayout, appBarLayout, C2589a.b(W(M10, i11, i10) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void u0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            C1680b0.i0(coordinatorLayout, C2930A.a.f28610q.b());
            C1680b0.i0(coordinatorLayout, C2930A.a.f28611r.b());
            View a02 = a0(coordinatorLayout);
            if (a02 != null && appBarLayout.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) a02.getLayoutParams()).e() instanceof ScrollingViewBehavior)) {
                S(coordinatorLayout, appBarLayout, a02);
            }
        }

        private void v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View b02 = b0(appBarLayout, i10);
            boolean z11 = false;
            if (b02 != null) {
                int c10 = ((e) b02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int B10 = C1680b0.B(b02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (b02.getBottom() - B10) - appBarLayout.getTopInset()) : (-i10) >= (b02.getBottom() - B10) - appBarLayout.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (appBarLayout.l()) {
                z11 = appBarLayout.v(a0(coordinatorLayout));
            }
            boolean s10 = appBarLayout.s(z11);
            if (z10 || (s10 && s0(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        /* access modifiers changed from: package-private */
        public int M() {
            return E() + this.f55457k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f55461o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public int K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e0 */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g0 */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            t0(coordinatorLayout, appBarLayout);
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(a0(coordinatorLayout)));
            }
        }

        /* renamed from: h0 */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean z10;
            int round;
            boolean l10 = super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f55460n;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    if ((pendingAction & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            U(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            U(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (dVar.f55473c) {
                P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (dVar.f55474d) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(dVar.f55475e);
                int i12 = -childAt.getBottom();
                if (this.f55460n.f55477g) {
                    round = C1680b0.B(childAt) + appBarLayout.getTopInset();
                } else {
                    round = Math.round(((float) childAt.getHeight()) * this.f55460n.f55476f);
                }
                P(coordinatorLayout, appBarLayout, i12 + round);
            }
            appBarLayout.o();
            this.f55460n = null;
            G(C2589a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            v0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.m(E());
            u0(coordinatorLayout, appBarLayout);
            return l10;
        }

        /* renamed from: i0 */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.L(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* renamed from: j0 */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    i14 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    iArr[1] = O(coordinatorLayout, appBarLayout, i11, i15, i16);
                }
            }
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(view));
            }
        }

        /* renamed from: k0 */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, appBarLayout, i13, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                u0(coordinatorLayout, appBarLayout);
            }
        }

        /* renamed from: l0 */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof d) {
                p0((d) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f55460n.a());
                return;
            }
            super.x(coordinatorLayout, appBarLayout, parcelable);
            this.f55460n = null;
        }

        /* renamed from: m0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y10 = super.y(coordinatorLayout, appBarLayout);
            d q02 = q0(y10, appBarLayout);
            if (q02 == null) {
                return y10;
            }
            return q02;
        }

        /* renamed from: n0 */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            boolean z10;
            ValueAnimator valueAnimator;
            if ((i10 & 2) == 0 || (!appBarLayout.l() && !Y(coordinatorLayout, appBarLayout, view))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && (valueAnimator = this.f55459m) != null) {
                valueAnimator.cancel();
            }
            this.f55461o = null;
            this.f55458l = i11;
            return z10;
        }

        /* renamed from: o0 */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f55458l == 0 || i10 == 1) {
                t0(coordinatorLayout, appBarLayout);
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
            this.f55461o = new WeakReference(view);
        }

        /* access modifiers changed from: package-private */
        public void p0(d dVar, boolean z10) {
            if (this.f55460n == null || z10) {
                this.f55460n = dVar;
            }
        }

        /* access modifiers changed from: package-private */
        public d q0(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z10;
            boolean z11;
            int E10 = E();
            int childCount = appBarLayout.getChildCount();
            boolean z12 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + E10;
                if (childAt.getTop() + E10 > 0 || bottom < 0) {
                    i10++;
                } else {
                    if (parcelable == null) {
                        parcelable = F1.a.f2127b;
                    }
                    d dVar = new d(parcelable);
                    if (E10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar.f55474d = z10;
                    if (z10 || (-E10) < appBarLayout.getTotalScrollRange()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dVar.f55473c = z11;
                    dVar.f55475e = i10;
                    if (bottom == C1680b0.B(childAt) + appBarLayout.getTopInset()) {
                        z12 = true;
                    }
                    dVar.f55477g = z12;
                    dVar.f55476f = ((float) bottom) / ((float) childAt.getHeight());
                    return dVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r0 */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int i13;
            int M10 = M();
            int i14 = 0;
            if (i11 == 0 || M10 < i11 || M10 > i12) {
                this.f55457k = 0;
            } else {
                int b10 = C2589a.b(i10, i11, i12);
                if (M10 != b10) {
                    if (appBarLayout.h()) {
                        i13 = f0(appBarLayout, b10);
                    } else {
                        i13 = b10;
                    }
                    boolean G10 = G(i13);
                    int i15 = M10 - b10;
                    this.f55457k = b10 - i13;
                    int i16 = 1;
                    if (G10) {
                        while (i14 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i14).getLayoutParams();
                            c b11 = eVar.b();
                            if (!(b11 == null || (eVar.c() & 1) == 0)) {
                                b11.a(appBarLayout, appBarLayout.getChildAt(i14), (float) E());
                            }
                            i14++;
                        }
                    }
                    if (!G10 && appBarLayout.h()) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.m(E());
                    if (b10 < M10) {
                        i16 = -1;
                    }
                    v0(coordinatorLayout, appBarLayout, b10, i16, false);
                    i14 = i15;
                }
            }
            u0(coordinatorLayout, appBarLayout);
            return i14;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class d extends F1.a {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            boolean f55473c;

            /* renamed from: d  reason: collision with root package name */
            boolean f55474d;

            /* renamed from: e  reason: collision with root package name */
            int f55475e;

            /* renamed from: f  reason: collision with root package name */
            float f55476f;

            /* renamed from: g  reason: collision with root package name */
            boolean f55477g;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                /* renamed from: a */
                public d createFromParcel(Parcel parcel) {
                    return new d(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new d(parcel, classLoader);
                }

                /* renamed from: c */
                public d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            public d(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = false;
                this.f55473c = parcel.readByte() != 0;
                this.f55474d = parcel.readByte() != 0;
                this.f55475e = parcel.readInt();
                this.f55476f = parcel.readFloat();
                this.f55477g = parcel.readByte() != 0 ? true : z10;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f55473c ? (byte) 1 : 0);
                parcel.writeByte(this.f55474d ? (byte) 1 : 0);
                parcel.writeInt(this.f55475e);
                parcel.writeFloat(this.f55476f);
                parcel.writeByte(this.f55477g ? (byte) 1 : 0);
            }

            public d(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        public /* bridge */ /* synthetic */ boolean h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ void k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        public /* bridge */ /* synthetic */ void l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends c {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c e10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (e10 instanceof BaseBehavior) {
                return ((BaseBehavior) e10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c e10 = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (e10 instanceof BaseBehavior) {
                C1680b0.Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e10).f55457k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R10 = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R10 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R10) / ((float) i10)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1680b0.i0(coordinatorLayout, C2930A.a.f28610q.b());
                C1680b0.i0(coordinatorLayout, C2930A.a.f28611r.b());
            }
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout Q10 = H(coordinatorLayout.s(view));
            if (Q10 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f55503d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q10.p(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53171g4);
            O(obtainStyledAttributes.getDimensionPixelSize(j.f53179h4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements I {
        a() {
        }

        public D0 i(View view, D0 d02) {
            return AppBarLayout.this.n(d02);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5020g f55479a;

        b(C5020g gVar) {
            this.f55479a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f55479a.V(floatValue);
            if (AppBarLayout.this.f55455r instanceof C5020g) {
                ((C5020g) AppBarLayout.this.f55455r).V(floatValue);
            }
            Iterator it = AppBarLayout.this.f55453p.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                this.f55479a.z();
                throw null;
            }
        }
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f55481a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f55482b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f55481a, appBarLayout, view);
            float abs = ((float) this.f55481a.top) - Math.abs(f10);
            if (abs <= 0.0f) {
                float a10 = 1.0f - C2589a.a(Math.abs(abs / ((float) this.f55481a.height())), 0.0f, 1.0f);
                float height = (-abs) - ((((float) this.f55481a.height()) * 0.3f) * (1.0f - (a10 * a10)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f55482b);
                this.f55482b.offset(0, (int) (-height));
                C1680b0.v0(view, this.f55482b);
                return;
            }
            C1680b0.v0(view, (Rect) null);
            view.setTranslationY(0.0f);
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void c() {
        WeakReference weakReference = this.f55451n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f55451n = null;
    }

    private View d(View view) {
        int i10;
        View view2;
        if (this.f55451n == null && (i10 = this.f55450m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f55450m);
            }
            if (view2 != null) {
                this.f55451n = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f55451n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        BaseBehavior.d dVar;
        Behavior behavior = this.f55456s;
        if (behavior == null || this.f55439b == -1 || this.f55443f != 0) {
            dVar = null;
        } else {
            dVar = behavior.q0(F1.a.f2127b, this);
        }
        this.f55439b = -1;
        this.f55440c = -1;
        this.f55441d = -1;
        if (dVar != null) {
            this.f55456s.p0(dVar, false);
        }
    }

    private void q(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int i12 = 0;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i10 | i11;
        if (z12) {
            i12 = 8;
        }
        this.f55443f = i13 | i12;
        requestLayout();
    }

    private boolean r(boolean z10) {
        if (this.f55447j == z10) {
            return false;
        }
        this.f55447j = z10;
        refreshDrawableState();
        return true;
    }

    private boolean u() {
        if (this.f55455r == null || getTopInset() <= 0) {
            return false;
        }
        return true;
    }

    private boolean w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C1680b0.x(childAt)) {
            return false;
        }
        return true;
    }

    private void x(C5020g gVar, boolean z10) {
        float f10;
        float dimension = getResources().getDimension(Ua.c.f52772a);
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = dimension;
        }
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f55452o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, dimension});
        this.f55452o = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(f.f52855a));
        this.f55452o.setInterpolator(Va.a.f53418a);
        this.f55452o.addUpdateListener(new b(gVar));
        this.f55452o.start();
    }

    private void y() {
        setWillNotDraw(!u());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f55438a));
            this.f55455r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f55455r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    /* renamed from: f */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f55456s = behavior;
        return behavior;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i10;
        int B10;
        int i11 = this.f55440c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f55483a;
            if ((i13 & 5) == 5) {
                int i14 = eVar.topMargin + eVar.bottomMargin;
                if ((i13 & 8) != 0) {
                    B10 = C1680b0.B(childAt);
                } else if ((i13 & 2) != 0) {
                    B10 = measuredHeight - C1680b0.B(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && C1680b0.x(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + B10;
                i10 = Math.min(i10, measuredHeight - getTopInset());
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f55440c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i10 = this.f55441d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin;
            int i13 = eVar.f55483a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= C1680b0.B(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f55441d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f55450m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int B10 = C1680b0.B(this);
        if (B10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                B10 = C1680b0.B(getChildAt(childCount - 1));
            } else {
                B10 = 0;
            }
            if (B10 == 0) {
                return getHeight() / 3;
            }
        }
        return (B10 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f55443f;
    }

    public Drawable getStatusBarForeground() {
        return this.f55455r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        D0 d02 = this.f55444g;
        if (d02 != null) {
            return d02.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f55439b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f55483a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + eVar.topMargin + eVar.bottomMargin;
            if (i11 == 0 && C1680b0.x(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= C1680b0.B(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f55439b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f55442e;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.f55449l;
    }

    /* access modifiers changed from: package-private */
    public void m(int i10) {
        this.f55438a = i10;
        if (!willNotDraw()) {
            C1680b0.f0(this);
        }
        List list = this.f55445h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                android.support.v4.media.session.c.a(this.f55445h.get(i11));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public D0 n(D0 d02) {
        D0 d03;
        if (C1680b0.x(this)) {
            d03 = d02;
        } else {
            d03 = null;
        }
        if (!x1.c.a(this.f55444g, d03)) {
            this.f55444g = d03;
            y();
            requestLayout();
        }
        return d02;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f55443f = 0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5021h.e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        if (this.f55454q == null) {
            this.f55454q = new int[4];
        }
        int[] iArr = this.f55454q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f55447j;
        int i13 = Ua.a.f52717E;
        if (!z10) {
            i13 = -i13;
        }
        iArr[0] = i13;
        if (!z10 || !this.f55448k) {
            i11 = -Ua.a.f52718F;
        } else {
            i11 = Ua.a.f52718F;
        }
        iArr[1] = i11;
        int i14 = Ua.a.f52716D;
        if (!z10) {
            i14 = -i14;
        }
        iArr[2] = i14;
        if (!z10 || !this.f55448k) {
            i12 = -Ua.a.f52715C;
        } else {
            i12 = Ua.a.f52715C;
        }
        iArr[3] = i12;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (C1680b0.x(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1680b0.Z(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f55442e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f55442e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f55455r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f55446i) {
            if (!this.f55449l && !i()) {
                z11 = false;
            }
            r(z11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && C1680b0.x(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C2589a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z10, boolean z11) {
        q(z10, z11, true);
    }

    /* access modifiers changed from: package-private */
    public boolean s(boolean z10) {
        return t(z10, !this.f55446i);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        C5021h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        p(z10, C1680b0.S(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f55449l = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f55450m = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f55446i = z10;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f55455r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f55455r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f55455r.setState(getDrawableState());
                }
                C2429a.g(this.f55455r, C1680b0.A(this));
                Drawable drawable4 = this.f55455r;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.f55455r.setCallback(this);
            }
            y();
            C1680b0.f0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C2115a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        f.b(this, f10);
    }

    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f55455r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t(boolean z10, boolean z11) {
        if (!z11 || this.f55448k == z10) {
            return false;
        }
        this.f55448k = z10;
        refreshDrawableState();
        if (!this.f55449l || !(getBackground() instanceof C5020g)) {
            return true;
        }
        x((C5020g) getBackground(), z10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean v(View view) {
        View d10 = d(view);
        if (d10 != null) {
            view = d10;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f55455r) {
            return true;
        }
        return false;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Ua.a.f52723a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f55437t
            android.content.Context r10 = jb.C5041a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f55439b = r10
            r9.f55440c = r10
            r9.f55441d = r10
            r6 = 0
            r9.f55443f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f55453p = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.google.android.material.appbar.f.a(r9)
        L_0x002f:
            com.google.android.material.appbar.f.c(r9, r11, r12, r4)
            int[] r2 = Ua.j.f53198k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.l.h(r0, r1, r2, r3, r4, r5)
            int r12 = Ua.j.f53206l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.C1680b0.s0(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            ib.g r0 = new ib.g
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.W(r12)
            r0.M(r7)
            androidx.core.view.C1680b0.s0(r9, r0)
        L_0x006a:
            int r12 = Ua.j.f53238p
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x007b
            int r12 = Ua.j.f53238p
            boolean r12 = r11.getBoolean(r12, r6)
            r9.q(r12, r6, r6)
        L_0x007b:
            int r12 = Ua.j.f53230o
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x008d
            int r12 = Ua.j.f53230o
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.f.b(r9, r12)
        L_0x008d:
            r12 = 26
            if (r8 < r12) goto L_0x00b3
            int r12 = Ua.j.f53222n
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x00a2
            int r12 = Ua.j.f53222n
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x00a2:
            int r12 = Ua.j.f53214m
            boolean r12 = r11.hasValue(r12)
            if (r12 == 0) goto L_0x00b3
            int r12 = Ua.j.f53214m
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00b3:
            int r12 = Ua.j.f53246q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f55449l = r12
            int r12 = Ua.j.f53254r
            int r10 = r11.getResourceId(r12, r10)
            r9.f55450m = r10
            int r10 = Ua.j.f53262s
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.C1680b0.C0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f55483a = 1;

        /* renamed from: b  reason: collision with root package name */
        private c f55484b;

        /* renamed from: c  reason: collision with root package name */
        Interpolator f55485c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f53278u);
            this.f55483a = obtainStyledAttributes.getInt(j.f53294w, 0);
            f(a(obtainStyledAttributes.getInt(j.f53286v, 0)));
            if (obtainStyledAttributes.hasValue(j.f53302x)) {
                this.f55485c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(j.f53302x, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f55484b;
        }

        public int c() {
            return this.f55483a;
        }

        public Interpolator d() {
            return this.f55485c;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            int i10 = this.f55483a;
            if ((i10 & 1) != 1 || (i10 & 10) == 0) {
                return false;
            }
            return true;
        }

        public void f(c cVar) {
            this.f55484b = cVar;
        }

        public void g(int i10) {
            this.f55483a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
