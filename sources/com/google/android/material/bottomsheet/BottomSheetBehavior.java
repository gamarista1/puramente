package com.google.android.material.bottomsheet;

import G1.c;
import Ua.i;
import Ua.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import com.google.android.material.internal.n;
import fb.C4982c;
import ib.C5020g;
import ib.C5024k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p1.C2388d;
import s1.C2589a;
import y1.C2930A;
import y1.D;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: d0  reason: collision with root package name */
    private static final int f55545d0 = i.f52914d;

    /* renamed from: A  reason: collision with root package name */
    private ValueAnimator f55546A;

    /* renamed from: B  reason: collision with root package name */
    int f55547B;

    /* renamed from: C  reason: collision with root package name */
    int f55548C;

    /* renamed from: D  reason: collision with root package name */
    int f55549D;

    /* renamed from: E  reason: collision with root package name */
    float f55550E = 0.5f;

    /* renamed from: F  reason: collision with root package name */
    int f55551F;

    /* renamed from: G  reason: collision with root package name */
    float f55552G = -1.0f;

    /* renamed from: H  reason: collision with root package name */
    boolean f55553H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public boolean f55554I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public boolean f55555J = true;

    /* renamed from: K  reason: collision with root package name */
    int f55556K = 4;

    /* renamed from: L  reason: collision with root package name */
    int f55557L = 4;

    /* renamed from: M  reason: collision with root package name */
    G1.c f55558M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f55559N;

    /* renamed from: O  reason: collision with root package name */
    private int f55560O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f55561P;

    /* renamed from: Q  reason: collision with root package name */
    private int f55562Q;

    /* renamed from: R  reason: collision with root package name */
    int f55563R;

    /* renamed from: S  reason: collision with root package name */
    int f55564S;

    /* renamed from: T  reason: collision with root package name */
    WeakReference f55565T;

    /* renamed from: U  reason: collision with root package name */
    WeakReference f55566U;

    /* renamed from: V  reason: collision with root package name */
    private final ArrayList f55567V = new ArrayList();

    /* renamed from: W  reason: collision with root package name */
    private VelocityTracker f55568W;

    /* renamed from: X  reason: collision with root package name */
    int f55569X;

    /* renamed from: Y  reason: collision with root package name */
    private int f55570Y;

    /* renamed from: Z  reason: collision with root package name */
    boolean f55571Z;

    /* renamed from: a  reason: collision with root package name */
    private int f55572a = 0;

    /* renamed from: a0  reason: collision with root package name */
    private Map f55573a0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f55574b = true;

    /* renamed from: b0  reason: collision with root package name */
    private int f55575b0 = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55576c = false;

    /* renamed from: c0  reason: collision with root package name */
    private final c.C0041c f55577c0 = new d();

    /* renamed from: d  reason: collision with root package name */
    private float f55578d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f55579e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55580f;

    /* renamed from: g  reason: collision with root package name */
    private int f55581g;

    /* renamed from: h  reason: collision with root package name */
    private int f55582h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public C5020g f55583i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f55584j;

    /* renamed from: k  reason: collision with root package name */
    private int f55585k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f55586l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f55587m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55588n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f55589o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f55590p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f55591q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f55592r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f55593s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f55594t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f55595u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public int f55596v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int f55597w;

    /* renamed from: x  reason: collision with root package name */
    private C5024k f55598x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f55599y;

    /* renamed from: z  reason: collision with root package name */
    private final h f55600z = new h(this, (a) null);

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f55601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55602b;

        a(View view, int i10) {
            this.f55601a = view;
            this.f55602b = i10;
        }

        public void run() {
            BottomSheetBehavior.this.P0(this.f55601a, this.f55602b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f55583i != null) {
                BottomSheetBehavior.this.f55583i.X(floatValue);
            }
        }
    }

    class c implements n.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f55605a;

        c(boolean z10) {
            this.f55605a = z10;
        }

        public D0 a(View view, D0 d02, n.e eVar) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            C2388d f10 = d02.f(D0.n.h());
            C2388d f11 = d02.f(D0.n.e());
            int unused = BottomSheetBehavior.this.f55597w = f10.f25151b;
            boolean e10 = n.e(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f55589o) {
                int unused2 = BottomSheetBehavior.this.f55596v = d02.j();
                paddingBottom = eVar.f56097d + BottomSheetBehavior.this.f55596v;
            }
            if (BottomSheetBehavior.this.f55590p) {
                if (e10) {
                    i14 = eVar.f56096c;
                } else {
                    i14 = eVar.f56094a;
                }
                paddingLeft = i14 + f10.f25150a;
            }
            if (BottomSheetBehavior.this.f55591q) {
                if (e10) {
                    i13 = eVar.f56094a;
                } else {
                    i13 = eVar.f56096c;
                }
                paddingRight = i13 + f10.f25152c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (!BottomSheetBehavior.this.f55593s || marginLayoutParams.leftMargin == (i12 = f10.f25150a)) {
                z10 = false;
            } else {
                marginLayoutParams.leftMargin = i12;
                z10 = true;
            }
            if (BottomSheetBehavior.this.f55594t && marginLayoutParams.rightMargin != (i11 = f10.f25152c)) {
                marginLayoutParams.rightMargin = i11;
                z10 = true;
            }
            if (!BottomSheetBehavior.this.f55595u || marginLayoutParams.topMargin == (i10 = f10.f25151b)) {
                z11 = z10;
            } else {
                marginLayoutParams.topMargin = i10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f55605a) {
                int unused3 = BottomSheetBehavior.this.f55587m = f11.f25153d;
            }
            if (BottomSheetBehavior.this.f55589o || this.f55605a) {
                BottomSheetBehavior.this.T0(false);
            }
            return d02;
        }
    }

    class d extends c.C0041c {

        /* renamed from: a  reason: collision with root package name */
        private long f55607a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f55564S + bottomSheetBehavior.g0()) / 2) {
                return true;
            }
            return false;
        }

        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(View view, int i10, int i11) {
            int i12;
            int g02 = BottomSheetBehavior.this.g0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f55553H) {
                i12 = bottomSheetBehavior.f55564S;
            } else {
                i12 = bottomSheetBehavior.f55551F;
            }
            return C2589a.b(i10, g02, i12);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f55553H) {
                return bottomSheetBehavior.f55564S;
            }
            return bottomSheetBehavior.f55551F;
        }

        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f55555J) {
                BottomSheetBehavior.this.I0(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.d0(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r9 > r7.f55608b.f55549D) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f55608b.g0()) < java.lang.Math.abs(r8.getTop() - r7.f55608b.f55549D)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
            if (r7.f55608b.N0() == false) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - r7.f55608b.f55548C) < java.lang.Math.abs(r9 - r7.f55608b.f55551F)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
            if (r7.f55608b.N0() != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
            if (r7.f55608b.N0() == false) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r10.K0(r0, (((float) r9) * 100.0f) / ((float) r10.f55564S)) != false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                r4 = 4
                if (r1 >= 0) goto L_0x003f
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f55574b
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r2 = r3
                goto L_0x0124
            L_0x0013:
                int r9 = r8.getTop()
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r7.f55607a
                long r0 = r0 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.N0()
                if (r10 == 0) goto L_0x0037
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r10.f55564S
                float r2 = (float) r2
                float r9 = r9 / r2
                boolean r9 = r10.K0(r0, r9)
                if (r9 == 0) goto L_0x00a7
                goto L_0x0010
            L_0x0037:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f55549D
                if (r9 <= r10) goto L_0x0010
                goto L_0x0124
            L_0x003f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f55553H
                if (r5 == 0) goto L_0x008e
                boolean r1 = r1.M0(r8, r10)
                if (r1 == 0) goto L_0x008e
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x005d
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0063
            L_0x005d:
                boolean r9 = r7.n(r8)
                if (r9 == 0) goto L_0x0066
            L_0x0063:
                r2 = 5
                goto L_0x0124
            L_0x0066:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f55574b
                if (r9 == 0) goto L_0x006f
                goto L_0x0010
            L_0x006f:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.g0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f55549D
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0124
                goto L_0x0010
            L_0x008e:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00cc
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x009f
                goto L_0x00cc
            L_0x009f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f55574b
                if (r9 == 0) goto L_0x00aa
            L_0x00a7:
                r2 = r4
                goto L_0x0124
            L_0x00aa:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f55549D
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f55551F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.N0()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x00cc:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f55574b
                if (r10 == 0) goto L_0x00ef
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f55548C
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f55551F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                goto L_0x0010
            L_0x00ef:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f55549D
                if (r9 >= r0) goto L_0x010a
                int r10 = r10.f55551F
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0101
                goto L_0x0010
            L_0x0101:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.N0()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x010a:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f55551F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.N0()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x0124:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.O0()
                r9.P0(r8, r2, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i10) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f55556K;
            if (i11 == 1 || bottomSheetBehavior.f55571Z) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f55569X == i10) {
                WeakReference weakReference = bottomSheetBehavior.f55566U;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f55607a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f55565T;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    class e implements D {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55609a;

        e(int i10) {
            this.f55609a = i10;
        }

        public boolean a(View view, D.a aVar) {
            BottomSheetBehavior.this.H0(this.f55609a);
            return true;
        }
    }

    public static abstract class f {
        /* access modifiers changed from: package-private */
        public void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
    }

    private void J0(View view) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 29 || n0() || this.f55580f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f55589o || this.f55590p || this.f55591q || this.f55593s || this.f55594t || this.f55595u || z10) {
            n.a(view, new c(z10));
        }
    }

    private boolean L0() {
        if (this.f55558M == null || (!this.f55555J && this.f55556K != 1)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void P0(View view, int i10, boolean z10) {
        int l02 = l0(i10);
        G1.c cVar = this.f55558M;
        if (cVar == null || (!z10 ? !cVar.Q(view, view.getLeft(), l02) : !cVar.O(view.getLeft(), l02))) {
            I0(i10);
            return;
        }
        I0(2);
        R0(i10);
        this.f55600z.c(i10);
    }

    private void Q0() {
        View view;
        WeakReference weakReference = this.f55565T;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C1680b0.i0(view, 524288);
            C1680b0.i0(view, 262144);
            C1680b0.i0(view, 1048576);
            int i10 = this.f55575b0;
            if (i10 != -1) {
                C1680b0.i0(view, i10);
            }
            int i11 = 6;
            if (!this.f55574b && this.f55556K != 6) {
                this.f55575b0 = V(view, Ua.h.f52885a, 6);
            }
            if (this.f55553H && this.f55556K != 5) {
                r0(view, C2930A.a.f28618y, 5);
            }
            int i12 = this.f55556K;
            if (i12 == 3) {
                if (this.f55574b) {
                    i11 = 4;
                }
                r0(view, C2930A.a.f28617x, i11);
            } else if (i12 == 4) {
                if (this.f55574b) {
                    i11 = 3;
                }
                r0(view, C2930A.a.f28616w, i11);
            } else if (i12 == 6) {
                r0(view, C2930A.a.f28617x, 4);
                r0(view, C2930A.a.f28616w, 3);
            }
        }
    }

    private void R0(int i10) {
        boolean z10;
        ValueAnimator valueAnimator;
        float f10;
        if (i10 != 2) {
            if (i10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f55599y != z10) {
                this.f55599y = z10;
                if (this.f55583i != null && (valueAnimator = this.f55546A) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f55546A.reverse();
                        return;
                    }
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    this.f55546A.setFloatValues(new float[]{1.0f - f10, f10});
                    this.f55546A.start();
                }
            }
        }
    }

    private void S0(boolean z10) {
        Map map;
        WeakReference weakReference = this.f55565T;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f55573a0 == null) {
                        this.f55573a0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.f55565T.get()) {
                        if (z10) {
                            this.f55573a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f55576c) {
                                C1680b0.y0(childAt, 4);
                            }
                        } else if (this.f55576c && (map = this.f55573a0) != null && map.containsKey(childAt)) {
                            C1680b0.y0(childAt, ((Integer) this.f55573a0.get(childAt)).intValue());
                        }
                    }
                }
                if (!z10) {
                    this.f55573a0 = null;
                } else if (this.f55576c) {
                    ((View) this.f55565T.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void T0(boolean z10) {
        View view;
        if (this.f55565T != null) {
            X();
            if (this.f55556K == 4 && (view = (View) this.f55565T.get()) != null) {
                if (z10) {
                    H0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    private int V(View view, int i10, int i11) {
        return C1680b0.c(view, view.getResources().getString(i10), a0(i11));
    }

    private void X() {
        int Z10 = Z();
        if (this.f55574b) {
            this.f55551F = Math.max(this.f55564S - Z10, this.f55548C);
        } else {
            this.f55551F = this.f55564S - Z10;
        }
    }

    private void Y() {
        this.f55549D = (int) (((float) this.f55564S) * (1.0f - this.f55550E));
    }

    private int Z() {
        int i10;
        if (this.f55580f) {
            return Math.min(Math.max(this.f55581g, this.f55564S - ((this.f55563R * 9) / 16)), this.f55562Q) + this.f55596v;
        }
        if (this.f55588n || this.f55589o || (i10 = this.f55587m) <= 0) {
            return this.f55579e + this.f55596v;
        }
        return Math.max(this.f55579e, i10 + this.f55582h);
    }

    private D a0(int i10) {
        return new e(i10);
    }

    private void b0(Context context) {
        if (this.f55598x != null) {
            C5020g gVar = new C5020g(this.f55598x);
            this.f55583i = gVar;
            gVar.M(context);
            ColorStateList colorStateList = this.f55584j;
            if (colorStateList != null) {
                this.f55583i.W(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f55583i.setTint(typedValue.data);
        }
    }

    private void c0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f55546A = ofFloat;
        ofFloat.setDuration(500);
        this.f55546A.addUpdateListener(new b());
    }

    private int f0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 4) {
            return this.f55551F;
        }
        if (i10 == 5) {
            return this.f55564S;
        }
        if (i10 == 6) {
            return this.f55549D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float m0() {
        VelocityTracker velocityTracker = this.f55568W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f55578d);
        return this.f55568W.getYVelocity(this.f55569X);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !C1680b0.R(view)) {
            return false;
        }
        return true;
    }

    private void r0(View view, C2930A.a aVar, int i10) {
        C1680b0.k0(view, aVar, (CharSequence) null, a0(i10));
    }

    private void s0() {
        this.f55569X = -1;
        VelocityTracker velocityTracker = this.f55568W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f55568W = null;
        }
    }

    private void t0(g gVar) {
        int i10 = this.f55572a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f55579e = gVar.f55612d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f55574b = gVar.f55613e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f55553H = gVar.f55614f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f55554I = gVar.f55615g;
            }
        }
    }

    private void u0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f55560O = 0;
        this.f55561P = false;
        if ((i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    public void A0(boolean z10) {
        if (this.f55553H != z10) {
            this.f55553H = z10;
            if (!z10 && this.f55556K == 5) {
                H0(4);
            }
            Q0();
        }
    }

    public void B0(int i10) {
        this.f55586l = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.f55549D) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f55548C) < java.lang.Math.abs(r3 - r2.f55551F)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (N0() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f55551F)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f55549D) < java.lang.Math.abs(r3 - r2.f55551F)) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.g0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.I0(r0)
            return
        L_0x000f:
            boolean r3 = r2.p0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference r3 = r2.f55566U
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f55561P
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f55560O
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f55574b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.f55549D
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.f55553H
            if (r3 == 0) goto L_0x0049
            float r3 = r2.m0()
            boolean r3 = r2.M0(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.f55560O
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f55574b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f55548C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f55551F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f55549D
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f55551F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.N0()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f55551F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f55574b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f55549D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f55551F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.P0(r4, r0, r3)
            r2.f55561P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(int i10) {
        this.f55585k = i10;
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f55556K == 1 && actionMasked == 0) {
            return true;
        }
        if (L0()) {
            this.f55558M.F(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f55568W == null) {
            this.f55568W = VelocityTracker.obtain();
        }
        this.f55568W.addMovement(motionEvent);
        if (L0() && actionMasked == 2 && !this.f55559N && Math.abs(((float) this.f55570Y) - motionEvent.getY()) > ((float) this.f55558M.z())) {
            this.f55558M.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f55559N;
    }

    public void D0(int i10) {
        E0(i10, false);
    }

    public final void E0(int i10, boolean z10) {
        if (i10 == -1) {
            if (!this.f55580f) {
                this.f55580f = true;
            } else {
                return;
            }
        } else if (this.f55580f || this.f55579e != i10) {
            this.f55580f = false;
            this.f55579e = Math.max(0, i10);
        } else {
            return;
        }
        T0(z10);
    }

    public void F0(int i10) {
        this.f55572a = i10;
    }

    public void G0(boolean z10) {
        this.f55554I = z10;
    }

    public void H0(int i10) {
        String str;
        int i11;
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            if (i10 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb2.append(str);
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.f55553H || i10 != 5) {
            if (i10 != 6 || !this.f55574b || l0(i10) > this.f55548C) {
                i11 = i10;
            } else {
                i11 = 3;
            }
            WeakReference weakReference = this.f55565T;
            if (weakReference == null || weakReference.get() == null) {
                I0(i10);
                return;
            }
            View view = (View) this.f55565T.get();
            u0(view, new a(view, i11));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I0(int i10) {
        View view;
        if (this.f55556K != i10) {
            this.f55556K = i10;
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f55553H && i10 == 5)) {
                this.f55557L = i10;
            }
            WeakReference weakReference = this.f55565T;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    S0(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    S0(false);
                }
                R0(i10);
                for (int i11 = 0; i11 < this.f55567V.size(); i11++) {
                    ((f) this.f55567V.get(i11)).c(view, i10);
                }
                Q0();
            }
        }
    }

    public boolean K0(long j10, float f10) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean M0(View view, float f10) {
        if (this.f55554I) {
            return true;
        }
        if (view.getTop() < this.f55551F) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f55551F)) / ((float) Z()) > 0.5f) {
            return true;
        }
        return false;
    }

    public boolean N0() {
        return false;
    }

    public boolean O0() {
        return true;
    }

    public void W(f fVar) {
        if (!this.f55567V.contains(fVar)) {
            this.f55567V.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void d0(int i10) {
        float f10;
        float f11;
        View view = (View) this.f55565T.get();
        if (view != null && !this.f55567V.isEmpty()) {
            int i11 = this.f55551F;
            if (i10 > i11 || i11 == g0()) {
                int i12 = this.f55551F;
                f10 = (float) (i12 - i10);
                f11 = (float) (this.f55564S - i12);
            } else {
                int i13 = this.f55551F;
                f10 = (float) (i13 - i10);
                f11 = (float) (i13 - g0());
            }
            float f12 = f10 / f11;
            for (int i14 = 0; i14 < this.f55567V.size(); i14++) {
                ((f) this.f55567V.get(i14)).b(view, f12);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View e0(View view) {
        if (C1680b0.T(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View e02 = e0(viewGroup.getChildAt(i10));
            if (e02 != null) {
                return e02;
            }
        }
        return null;
    }

    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f55565T = null;
        this.f55558M = null;
    }

    public int g0() {
        int i10;
        if (this.f55574b) {
            return this.f55548C;
        }
        int i11 = this.f55547B;
        if (this.f55592r) {
            i10 = 0;
        } else {
            i10 = this.f55597w;
        }
        return Math.max(i11, i10);
    }

    public float h0() {
        return this.f55550E;
    }

    public int i0() {
        return this.f55586l;
    }

    public void j() {
        super.j();
        this.f55565T = null;
        this.f55558M = null;
    }

    public int j0() {
        if (this.f55580f) {
            return -1;
        }
        return this.f55579e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f55555J
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.s0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f55568W
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f55568W = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f55568W
            r3.addMovement(r12)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f55571Z = r1
            r9.f55569X = r5
            boolean r11 = r9.f55559N
            if (r11 == 0) goto L_0x007f
            r9.f55559N = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f55570Y = r7
            int r7 = r9.f55556K
            if (r7 == r4) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.f55566U
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f55570Y
            boolean r7 = r10.C(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f55569X = r7
            r9.f55571Z = r2
        L_0x006e:
            int r7 = r9.f55569X
            if (r7 != r5) goto L_0x007c
            int r5 = r9.f55570Y
            boolean r11 = r10.C(r11, r6, r5)
            if (r11 != 0) goto L_0x007c
            r11 = r2
            goto L_0x007d
        L_0x007c:
            r11 = r1
        L_0x007d:
            r9.f55559N = r11
        L_0x007f:
            boolean r11 = r9.f55559N
            if (r11 != 0) goto L_0x008e
            G1.c r11 = r9.f55558M
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.P(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference r11 = r9.f55566U
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r4) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f55559N
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f55556K
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.C(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            G1.c r10 = r9.f55558M
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f55570Y
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            G1.c r11 = r9.f55558M
            int r11 = r11.z()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = r2
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f55559N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int k0() {
        return this.f55556K;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z10;
        float f10;
        if (C1680b0.x(coordinatorLayout) && !C1680b0.x(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f55565T == null) {
            this.f55581g = coordinatorLayout.getResources().getDimensionPixelSize(Ua.c.f52773b);
            J0(view);
            this.f55565T = new WeakReference(view);
            C5020g gVar = this.f55583i;
            if (gVar != null) {
                C1680b0.s0(view, gVar);
                C5020g gVar2 = this.f55583i;
                float f11 = this.f55552G;
                if (f11 == -1.0f) {
                    f11 = C1680b0.v(view);
                }
                gVar2.V(f11);
                if (this.f55556K == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f55599y = z10;
                C5020g gVar3 = this.f55583i;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                gVar3.X(f10);
            } else {
                ColorStateList colorStateList = this.f55584j;
                if (colorStateList != null) {
                    C1680b0.t0(view, colorStateList);
                }
            }
            Q0();
            if (C1680b0.y(view) == 0) {
                C1680b0.y0(view, 1);
            }
        }
        if (this.f55558M == null) {
            this.f55558M = G1.c.o(coordinatorLayout, this.f55577c0);
        }
        int top = view.getTop();
        coordinatorLayout.K(view, i10);
        this.f55563R = coordinatorLayout.getWidth();
        this.f55564S = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f55562Q = height;
        int i11 = this.f55564S;
        int i12 = i11 - height;
        int i13 = this.f55597w;
        if (i12 < i13) {
            if (this.f55592r) {
                this.f55562Q = i11;
            } else {
                this.f55562Q = i11 - i13;
            }
        }
        this.f55548C = Math.max(0, i11 - this.f55562Q);
        Y();
        X();
        int i14 = this.f55556K;
        if (i14 == 3) {
            C1680b0.Z(view, g0());
        } else if (i14 == 6) {
            C1680b0.Z(view, this.f55549D);
        } else if (this.f55553H && i14 == 5) {
            C1680b0.Z(view, this.f55564S);
        } else if (i14 == 4) {
            C1680b0.Z(view, this.f55551F);
        } else if (i14 == 1 || i14 == 2) {
            C1680b0.Z(view, top - view.getTop());
        }
        this.f55566U = new WeakReference(e0(view));
        for (int i15 = 0; i15 < this.f55567V.size(); i15++) {
            ((f) this.f55567V.get(i15)).a(view);
        }
        return true;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(f0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f55585k, marginLayoutParams.width), f0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f55586l, marginLayoutParams.height));
        return true;
    }

    public boolean n0() {
        return this.f55588n;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        if (!p0() || (weakReference = this.f55566U) == null || view2 != weakReference.get()) {
            return false;
        }
        if (this.f55556K != 3 || super.o(coordinatorLayout, view, view2, f10, f11)) {
            return true;
        }
        return false;
    }

    public boolean p0() {
        return true;
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        View view3;
        if (i12 != 1) {
            WeakReference weakReference = this.f55566U;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (!p0() || view2 == view3) {
                int top = view.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (i13 < g0()) {
                        int g02 = top - g0();
                        iArr[1] = g02;
                        C1680b0.Z(view, -g02);
                        I0(3);
                    } else if (this.f55555J) {
                        iArr[1] = i11;
                        C1680b0.Z(view, -i11);
                        I0(1);
                    } else {
                        return;
                    }
                } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                    int i14 = this.f55551F;
                    if (i13 > i14 && !this.f55553H) {
                        int i15 = top - i14;
                        iArr[1] = i15;
                        C1680b0.Z(view, -i15);
                        I0(4);
                    } else if (this.f55555J) {
                        iArr[1] = i11;
                        C1680b0.Z(view, -i11);
                        I0(1);
                    } else {
                        return;
                    }
                }
                d0(view.getTop());
                this.f55560O = i11;
                this.f55561P = true;
            }
        }
    }

    public void q0(f fVar) {
        this.f55567V.remove(fVar);
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void v0(boolean z10) {
        this.f55555J = z10;
    }

    public void w0(int i10) {
        if (i10 >= 0) {
            this.f55547B = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.a());
        t0(gVar);
        int i10 = gVar.f55611c;
        if (i10 == 1 || i10 == 2) {
            this.f55556K = 4;
            this.f55557L = 4;
            return;
        }
        this.f55556K = i10;
        this.f55557L = i10;
    }

    public void x0(boolean z10) {
        int i10;
        if (this.f55574b != z10) {
            this.f55574b = z10;
            if (this.f55565T != null) {
                X();
            }
            if (!this.f55574b || this.f55556K != 6) {
                i10 = this.f55556K;
            } else {
                i10 = 3;
            }
            I0(i10);
            Q0();
        }
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public void y0(boolean z10) {
        this.f55588n = z10;
    }

    public void z0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f55550E = f10;
        if (this.f55565T != null) {
            Y();
        }
    }

    private class h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f55616a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f55617b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f55618c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                boolean unused = h.this.f55617b = false;
                G1.c cVar = BottomSheetBehavior.this.f55558M;
                if (cVar == null || !cVar.m(true)) {
                    h hVar = h.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f55556K == 2) {
                        bottomSheetBehavior.I0(hVar.f55616a);
                        return;
                    }
                    return;
                }
                h hVar2 = h.this;
                hVar2.c(hVar2.f55616a);
            }
        }

        private h() {
            this.f55618c = new a();
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f55565T;
            if (weakReference != null && weakReference.get() != null) {
                this.f55616a = i10;
                if (!this.f55617b) {
                    C1680b0.g0((View) BottomSheetBehavior.this.f55565T.get(), this.f55618c);
                    this.f55617b = true;
                }
            }
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class g extends F1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f55611c;

        /* renamed from: d  reason: collision with root package name */
        int f55612d;

        /* renamed from: e  reason: collision with root package name */
        boolean f55613e;

        /* renamed from: f  reason: collision with root package name */
        boolean f55614f;

        /* renamed from: g  reason: collision with root package name */
        boolean f55615g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f55611c = parcel.readInt();
            this.f55612d = parcel.readInt();
            boolean z10 = false;
            this.f55613e = parcel.readInt() == 1;
            this.f55614f = parcel.readInt() == 1;
            this.f55615g = parcel.readInt() == 1 ? true : z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f55611c);
            parcel.writeInt(this.f55612d);
            parcel.writeInt(this.f55613e ? 1 : 0);
            parcel.writeInt(this.f55614f ? 1 : 0);
            parcel.writeInt(this.f55615g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f55611c = bottomSheetBehavior.f55556K;
            this.f55612d = bottomSheetBehavior.f55579e;
            this.f55613e = bottomSheetBehavior.f55574b;
            this.f55614f = bottomSheetBehavior.f55553H;
            this.f55615g = bottomSheetBehavior.f55554I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f55582h = context.getResources().getDimensionPixelSize(Ua.c.f52765K);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f52985H);
        if (obtainStyledAttributes.hasValue(j.f53013L)) {
            this.f55584j = C4982c.a(context, obtainStyledAttributes, j.f53013L);
        }
        if (obtainStyledAttributes.hasValue(j.f53135c0)) {
            this.f55598x = C5024k.e(context, attributeSet, Ua.a.f52725c, f55545d0).m();
        }
        b0(context);
        c0();
        this.f55552G = obtainStyledAttributes.getDimension(j.f53006K, -1.0f);
        if (obtainStyledAttributes.hasValue(j.f52992I)) {
            C0(obtainStyledAttributes.getDimensionPixelSize(j.f52992I, -1));
        }
        if (obtainStyledAttributes.hasValue(j.f52999J)) {
            B0(obtainStyledAttributes.getDimensionPixelSize(j.f52999J, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(j.f53055R);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            D0(obtainStyledAttributes.getDimensionPixelSize(j.f53055R, -1));
        } else {
            D0(i10);
        }
        A0(obtainStyledAttributes.getBoolean(j.f53048Q, false));
        y0(obtainStyledAttributes.getBoolean(j.f53076U, false));
        x0(obtainStyledAttributes.getBoolean(j.f53034O, true));
        G0(obtainStyledAttributes.getBoolean(j.f53069T, false));
        v0(obtainStyledAttributes.getBoolean(j.f53020M, true));
        F0(obtainStyledAttributes.getInt(j.f53062S, 0));
        z0(obtainStyledAttributes.getFloat(j.f53041P, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(j.f53027N);
        if (peekValue2 == null || peekValue2.type != 16) {
            w0(obtainStyledAttributes.getDimensionPixelOffset(j.f53027N, 0));
        } else {
            w0(peekValue2.data);
        }
        this.f55589o = obtainStyledAttributes.getBoolean(j.f53104Y, false);
        this.f55590p = obtainStyledAttributes.getBoolean(j.f53111Z, false);
        this.f55591q = obtainStyledAttributes.getBoolean(j.f53119a0, false);
        this.f55592r = obtainStyledAttributes.getBoolean(j.f53127b0, true);
        this.f55593s = obtainStyledAttributes.getBoolean(j.f53083V, false);
        this.f55594t = obtainStyledAttributes.getBoolean(j.f53090W, false);
        this.f55595u = obtainStyledAttributes.getBoolean(j.f53097X, false);
        obtainStyledAttributes.recycle();
        this.f55578d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
