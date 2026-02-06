package com.google.android.material.behavior;

import G1.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import y1.C2930A;
import y1.D;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a  reason: collision with root package name */
    G1.c f55523a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55524b;

    /* renamed from: c  reason: collision with root package name */
    private float f55525c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f55526d;

    /* renamed from: e  reason: collision with root package name */
    int f55527e = 2;

    /* renamed from: f  reason: collision with root package name */
    float f55528f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    float f55529g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    float f55530h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    private final c.C0041c f55531i = new a();

    class a extends c.C0041c {

        /* renamed from: a  reason: collision with root package name */
        private int f55532a;

        /* renamed from: b  reason: collision with root package name */
        private int f55533b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            boolean z10;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (C1680b0.A(view) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i11 = SwipeDismissBehavior.this.f55527e;
                if (i11 == 2) {
                    return true;
                }
                if (i11 == 0) {
                    if (z10) {
                        if (f10 >= 0.0f) {
                            return false;
                        }
                    } else if (i10 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i11 != 1) {
                    return false;
                } else {
                    if (z10) {
                        if (i10 <= 0) {
                            return false;
                        }
                    } else if (f10 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f55532a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f55528f)) {
                    return true;
                }
                return false;
            }
        }

        public int a(View view, int i10, int i11) {
            boolean z10;
            int i12;
            int i13;
            int width;
            if (C1680b0.A(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = SwipeDismissBehavior.this.f55527e;
            if (i14 != 0) {
                if (i14 != 1) {
                    i12 = this.f55532a - view.getWidth();
                    i13 = view.getWidth() + this.f55532a;
                } else if (z10) {
                    i12 = this.f55532a;
                    width = view.getWidth();
                } else {
                    i12 = this.f55532a - view.getWidth();
                    i13 = this.f55532a;
                }
                return SwipeDismissBehavior.G(i12, i10, i13);
            } else if (z10) {
                i12 = this.f55532a - view.getWidth();
                i13 = this.f55532a;
                return SwipeDismissBehavior.G(i12, i10, i13);
            } else {
                i12 = this.f55532a;
                width = view.getWidth();
            }
            i13 = width + i12;
            return SwipeDismissBehavior.G(i12, i10, i13);
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i10) {
            this.f55533b = i10;
            this.f55532a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = ((float) this.f55532a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f55529g);
            float width2 = ((float) this.f55532a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f55530h);
            float f10 = (float) i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        public void l(View view, float f10, float f11) {
            boolean z10;
            int i10;
            this.f55533b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f55532a;
                if (left < i11) {
                    i10 = i11 - width;
                } else {
                    i10 = i11 + width;
                }
                z10 = true;
            } else {
                i10 = this.f55532a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f55523a.O(i10, view.getTop())) {
                C1680b0.g0(view, new c(view, z10));
            } else if (z10) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        public boolean m(View view, int i10) {
            int i11 = this.f55533b;
            if ((i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view)) {
                return true;
            }
            return false;
        }
    }

    class b implements D {
        b() {
        }

        public boolean a(View view, D.a aVar) {
            int i10;
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            if (C1680b0.A(view) == 1) {
                z10 = true;
            }
            int i11 = SwipeDismissBehavior.this.f55527e;
            if ((i11 != 0 || !z10) && (i11 != 1 || z10)) {
                i10 = view.getWidth();
            } else {
                i10 = -view.getWidth();
            }
            C1680b0.Y(view, i10);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f55536a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f55537b;

        c(View view, boolean z10) {
            this.f55536a = view;
            this.f55537b = z10;
        }

        public void run() {
            G1.c cVar = SwipeDismissBehavior.this.f55523a;
            if (cVar != null && cVar.m(true)) {
                C1680b0.g0(this.f55536a, this);
            } else if (this.f55537b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        G1.c cVar;
        if (this.f55523a == null) {
            if (this.f55526d) {
                cVar = G1.c.n(viewGroup, this.f55525c, this.f55531i);
            } else {
                cVar = G1.c.o(viewGroup, this.f55531i);
            }
            this.f55523a = cVar;
        }
    }

    static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void M(View view) {
        C1680b0.i0(view, 1048576);
        if (E(view)) {
            C1680b0.k0(view, C2930A.a.f28618y, (CharSequence) null, new b());
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        G1.c cVar = this.f55523a;
        if (cVar == null) {
            return false;
        }
        cVar.F(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f10) {
        this.f55530h = F(0.0f, f10, 1.0f);
    }

    public void K(float f10) {
        this.f55529g = F(0.0f, f10, 1.0f);
    }

    public void L(int i10) {
        this.f55527e = i10;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f55524b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f55524b = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f55524b = false;
        }
        if (!z10) {
            return false;
        }
        H(coordinatorLayout);
        return this.f55523a.P(motionEvent);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean l10 = super.l(coordinatorLayout, view, i10);
        if (C1680b0.y(view) == 0) {
            C1680b0.y0(view, 1);
            M(view);
        }
        return l10;
    }
}
