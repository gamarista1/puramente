package O1;

import G1.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1712s;
import androidx.core.view.D0;
import java.util.ArrayList;
import java.util.List;
import p1.C2388d;
import q1.C2429a;
import y1.C2930A;
import y1.D;

public abstract class a extends ViewGroup {

    /* renamed from: h0  reason: collision with root package name */
    private static final int[] f4661h0 = {16843828};

    /* renamed from: i0  reason: collision with root package name */
    static final int[] f4662i0 = {16842931};

    /* renamed from: j0  reason: collision with root package name */
    static final boolean f4663j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    private static final boolean f4664k0 = true;

    /* renamed from: l0  reason: collision with root package name */
    private static boolean f4665l0;

    /* renamed from: A  reason: collision with root package name */
    private CharSequence f4666A;

    /* renamed from: B  reason: collision with root package name */
    private Object f4667B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f4668C;

    /* renamed from: D  reason: collision with root package name */
    private Drawable f4669D;

    /* renamed from: E  reason: collision with root package name */
    private Drawable f4670E;

    /* renamed from: F  reason: collision with root package name */
    private Drawable f4671F;

    /* renamed from: G  reason: collision with root package name */
    private Drawable f4672G;

    /* renamed from: H  reason: collision with root package name */
    private final ArrayList f4673H;

    /* renamed from: I  reason: collision with root package name */
    private Rect f4674I;

    /* renamed from: a  reason: collision with root package name */
    private final d f4675a;

    /* renamed from: b  reason: collision with root package name */
    private float f4676b;

    /* renamed from: c  reason: collision with root package name */
    private int f4677c;

    /* renamed from: d  reason: collision with root package name */
    private int f4678d;

    /* renamed from: e  reason: collision with root package name */
    private float f4679e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f4680f;

    /* renamed from: f0  reason: collision with root package name */
    private Matrix f4681f0;

    /* renamed from: g  reason: collision with root package name */
    private final G1.c f4682g;

    /* renamed from: g0  reason: collision with root package name */
    private final D f4683g0;

    /* renamed from: h  reason: collision with root package name */
    private final G1.c f4684h;

    /* renamed from: i  reason: collision with root package name */
    private final h f4685i;

    /* renamed from: j  reason: collision with root package name */
    private final h f4686j;

    /* renamed from: k  reason: collision with root package name */
    private int f4687k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4688l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4689m;

    /* renamed from: n  reason: collision with root package name */
    private int f4690n;

    /* renamed from: o  reason: collision with root package name */
    private int f4691o;

    /* renamed from: p  reason: collision with root package name */
    private int f4692p;

    /* renamed from: q  reason: collision with root package name */
    private int f4693q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4694r;

    /* renamed from: s  reason: collision with root package name */
    private e f4695s;

    /* renamed from: t  reason: collision with root package name */
    private List f4696t;

    /* renamed from: u  reason: collision with root package name */
    private float f4697u;

    /* renamed from: v  reason: collision with root package name */
    private float f4698v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f4699w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f4700x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f4701y;

    /* renamed from: z  reason: collision with root package name */
    private CharSequence f4702z;

    /* renamed from: O1.a$a  reason: collision with other inner class name */
    class C0113a implements D {
        C0113a() {
        }

        public boolean a(View view, D.a aVar) {
            if (!a.this.C(view) || a.this.r(view) == 2) {
                return false;
            }
            a.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z10;
            a aVar = (a) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.Q(windowInsets, z10);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends C1677a {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f4705a = new Rect();

        c() {
        }

        private void c(C2930A a10, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (a.A(childAt)) {
                    a10.c(childAt);
                }
            }
        }

        private void d(C2930A a10, C2930A a11) {
            Rect rect = this.f4705a;
            a11.n(rect);
            a10.q0(rect);
            a10.j1(a11.e0());
            a10.N0(a11.B());
            a10.t0(a11.q());
            a10.x0(a11.u());
            a10.A0(a11.R());
            a10.D0(a11.U());
            a10.m0(a11.M());
            a10.W0(a11.b0());
            a10.a(a11.k());
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s10;
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View p10 = a.this.p();
            if (p10 == null || (s10 = a.this.s(a.this.t(p10))) == null) {
                return true;
            }
            text.add(s10);
            return true;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            if (a.f4663j0) {
                super.onInitializeAccessibilityNodeInfo(view, a10);
            } else {
                C2930A h02 = C2930A.h0(a10);
                super.onInitializeAccessibilityNodeInfo(view, h02);
                a10.Y0(view);
                ViewParent G10 = C1680b0.G(view);
                if (G10 instanceof View) {
                    a10.P0((View) G10);
                }
                d(a10, h02);
                h02.j0();
                c(a10, (ViewGroup) view);
            }
            a10.t0("androidx.drawerlayout.widget.DrawerLayout");
            a10.C0(false);
            a10.D0(false);
            a10.k0(C2930A.a.f28598e);
            a10.k0(C2930A.a.f28599f);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.f4663j0 || a.A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends C1677a {
        d() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(view, a10);
            if (!a.A(view)) {
                a10.P0((View) null);
            }
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    private class h extends c.C0041c {

        /* renamed from: a  reason: collision with root package name */
        private final int f4716a;

        /* renamed from: b  reason: collision with root package name */
        private G1.c f4717b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f4718c = new C0115a();

        /* renamed from: O1.a$h$a  reason: collision with other inner class name */
        class C0115a implements Runnable {
            C0115a() {
            }

            public void run() {
                h.this.o();
            }
        }

        h(int i10) {
            this.f4716a = i10;
        }

        private void n() {
            int i10 = 3;
            if (this.f4716a == 3) {
                i10 = 5;
            }
            View n10 = a.this.n(i10);
            if (n10 != null) {
                a.this.f(n10);
            }
        }

        public int a(View view, int i10, int i11) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            if (a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i10, int i11) {
            View view;
            if ((i10 & 1) == 1) {
                view = a.this.n(3);
            } else {
                view = a.this.n(5);
            }
            if (view != null && a.this.r(view) == 0) {
                this.f4717b.b(view, i11);
            }
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
            a.this.postDelayed(this.f4718c, 160);
        }

        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f4709c = false;
            n();
        }

        public void j(int i10) {
            a.this.V(i10, this.f4717b.v());
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            float width;
            int i14;
            int width2 = view.getWidth();
            if (a.this.c(view, 3)) {
                width = (float) (i10 + width2);
            } else {
                width = (float) (a.this.getWidth() - i10);
            }
            float f10 = width / ((float) width2);
            a.this.S(view, f10);
            if (f10 == 0.0f) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            view.setVisibility(i14);
            a.this.invalidate();
        }

        public void l(View view, float f10, float f11) {
            int i10;
            float u10 = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 > 0 || (i11 == 0 && u10 > 0.5f)) {
                    i10 = 0;
                } else {
                    i10 = -width;
                }
            } else {
                int width2 = a.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && u10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f4717b.O(i10, view.getTop());
            a.this.invalidate();
        }

        public boolean m(View view, int i10) {
            if (!a.this.D(view) || !a.this.c(view, this.f4716a) || a.this.r(view) != 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            boolean z10;
            View view;
            int i10;
            int x10 = this.f4717b.x();
            int i11 = 0;
            if (this.f4716a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                view = a.this.n(3);
                if (view != null) {
                    i11 = -view.getWidth();
                }
                i10 = i11 + x10;
            } else {
                view = a.this.n(5);
                i10 = a.this.getWidth() - x10;
            }
            if (view == null) {
                return;
            }
            if (((z10 && view.getLeft() < i10) || (!z10 && view.getLeft() > i10)) && a.this.r(view) == 0) {
                this.f4717b.Q(view, i10, view.getTop());
                ((f) view.getLayoutParams()).f4709c = true;
                a.this.invalidate();
                n();
                a.this.b();
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f4718c);
        }

        public void q(G1.c cVar) {
            this.f4717b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 < 29) {
            z10 = false;
        }
        f4665l0 = z10;
    }

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    static boolean A(View view) {
        if (C1680b0.y(view) == 4 || C1680b0.y(view) == 2) {
            return false;
        }
        return true;
    }

    private boolean F(float f10, float f11, View view) {
        if (this.f4674I == null) {
            this.f4674I = new Rect();
        }
        view.getHitRect(this.f4674I);
        return this.f4674I.contains((int) f10, (int) f11);
    }

    private void G(Drawable drawable, int i10) {
        if (drawable != null && C2429a.c(drawable)) {
            C2429a.g(drawable, i10);
        }
    }

    private Drawable N() {
        int A10 = C1680b0.A(this);
        if (A10 == 0) {
            Drawable drawable = this.f4669D;
            if (drawable != null) {
                G(drawable, A10);
                return this.f4669D;
            }
        } else {
            Drawable drawable2 = this.f4670E;
            if (drawable2 != null) {
                G(drawable2, A10);
                return this.f4670E;
            }
        }
        return this.f4671F;
    }

    private Drawable O() {
        int A10 = C1680b0.A(this);
        if (A10 == 0) {
            Drawable drawable = this.f4670E;
            if (drawable != null) {
                G(drawable, A10);
                return this.f4670E;
            }
        } else {
            Drawable drawable2 = this.f4669D;
            if (drawable2 != null) {
                G(drawable2, A10);
                return this.f4669D;
            }
        }
        return this.f4672G;
    }

    private void P() {
        if (!f4664k0) {
            this.f4700x = N();
            this.f4701y = O();
        }
    }

    private void T(View view) {
        C2930A.a aVar = C2930A.a.f28618y;
        C1680b0.i0(view, aVar.b());
        if (C(view) && r(view) != 2) {
            C1680b0.k0(view, aVar, (CharSequence) null, this.f4683g0);
        }
    }

    private void U(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || D(childAt)) && (!z10 || childAt != view)) {
                C1680b0.y0(childAt, 4);
            } else {
                C1680b0.y0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v10 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v10);
            v10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f4681f0 == null) {
                this.f4681f0 = new Matrix();
            }
            matrix.invert(this.f4681f0);
            obtain.transform(this.f4681f0);
        }
        return obtain;
    }

    static String w(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        if ((i10 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f4709c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean B(View view) {
        if (((f) view.getLayoutParams()).f4707a == 0) {
            return true;
        }
        return false;
    }

    public boolean C(View view) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((f) view.getLayoutParams()).f4710d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D(View view) {
        int b10 = C1712s.b(((f) view.getLayoutParams()).f4707a, C1680b0.A(view));
        if ((b10 & 3) == 0 && (b10 & 5) == 0) {
            return false;
        }
        return true;
    }

    public boolean E(View view) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((f) view.getLayoutParams()).f4708b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void H(View view, float f10) {
        float u10 = u(view);
        float width = (float) view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (u10 * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        S(view, f10);
    }

    public void I(int i10) {
        J(i10, true);
    }

    public void J(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            L(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (D(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f4689m) {
                fVar.f4708b = 1.0f;
                fVar.f4710d = 1;
                U(view, true);
                T(view);
            } else if (z10) {
                fVar.f4710d |= 2;
                if (c(view, 3)) {
                    this.f4682g.Q(view, 0, view.getTop());
                } else {
                    this.f4684h.Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                H(view, 1.0f);
                V(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void M(e eVar) {
        List list;
        if (eVar != null && (list = this.f4696t) != null) {
            list.remove(eVar);
        }
    }

    public void Q(Object obj, boolean z10) {
        boolean z11;
        this.f4667B = obj;
        this.f4668C = z10;
        if (z10 || getBackground() != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        setWillNotDraw(z11);
        requestLayout();
    }

    public void R(int i10, int i11) {
        View n10;
        G1.c cVar;
        int b10 = C1712s.b(i11, C1680b0.A(this));
        if (i11 == 3) {
            this.f4690n = i10;
        } else if (i11 == 5) {
            this.f4691o = i10;
        } else if (i11 == 8388611) {
            this.f4692p = i10;
        } else if (i11 == 8388613) {
            this.f4693q = i10;
        }
        if (i10 != 0) {
            if (b10 == 3) {
                cVar = this.f4682g;
            } else {
                cVar = this.f4684h;
            }
            cVar.a();
        }
        if (i10 == 1) {
            View n11 = n(b10);
            if (n11 != null) {
                f(n11);
            }
        } else if (i10 == 2 && (n10 = n(b10)) != null) {
            K(n10);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 != fVar.f4708b) {
            fVar.f4708b = f10;
            l(view, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, View view) {
        int i11;
        int A10 = this.f4682g.A();
        int A11 = this.f4684h.A();
        if (A10 == 1 || A11 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (!(A10 == 2 || A11 == 2)) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f4708b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f4687k) {
            this.f4687k = i11;
            List list = this.f4696t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f4696t.get(size)).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar != null) {
            if (this.f4696t == null) {
                this.f4696t = new ArrayList();
            }
            this.f4696t.add(eVar);
        }
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!D(childAt)) {
                    this.f4673H.add(childAt);
                } else if (C(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            }
            if (!z10) {
                int size = this.f4673H.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = (View) this.f4673H.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.f4673H.clear();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || D(view)) {
            C1680b0.y0(view, 4);
        } else {
            C1680b0.y0(view, 1);
        }
        if (!f4663j0) {
            C1680b0.o0(view, this.f4675a);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.f4694r) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f4694r = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view, int i10) {
        if ((t(view) & i10) == i10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof f) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f4708b);
        }
        this.f4679e = f10;
        boolean m10 = this.f4682g.m(true);
        boolean m11 = this.f4684h.m(true);
        if (m10 || m11) {
            C1680b0.f0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4679e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (F(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B10 = B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (B10) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view2 && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f4679e;
        if (f10 > 0.0f && B10) {
            int i13 = this.f4678d;
            this.f4680f.setColor((i13 & 16777215) | (((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.f4680f);
        } else if (this.f4700x != null && c(view2, 3)) {
            int intrinsicWidth = this.f4700x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f4682g.x()), 1.0f));
            this.f4700x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f4700x.setAlpha((int) (max * 255.0f));
            this.f4700x.draw(canvas);
        } else if (this.f4701y != null && c(view2, 5)) {
            int intrinsicWidth2 = this.f4701y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f4684h.x()), 1.0f));
            this.f4701y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f4701y.setAlpha((int) (max2 * 255.0f));
            this.f4701y.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            g(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (D(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f4689m) {
                fVar.f4708b = 0.0f;
                fVar.f4710d = 0;
            } else if (z10) {
                fVar.f4710d |= 4;
                if (c(view, 3)) {
                    this.f4682g.Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.f4684h.Q(view, getWidth(), view.getTop());
                }
            } else {
                H(view, 0.0f);
                V(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f4664k0) {
            return this.f4676b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4699w;
    }

    public void h() {
        i(false);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z10) {
        boolean Q10;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z10 || fVar.f4709c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    Q10 = this.f4682g.Q(childAt, -width, childAt.getTop());
                } else {
                    Q10 = this.f4684h.Q(childAt, getWidth(), childAt.getTop());
                }
                z11 |= Q10;
                fVar.f4709c = false;
            }
        }
        this.f4685i.p();
        this.f4686j.p();
        if (z11) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f4710d & 1) == 1) {
            fVar.f4710d = 0;
            List list = this.f4696t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f4696t.get(size)).b(view);
                }
            }
            U(view, false);
            T(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f4710d & 1) == 0) {
            fVar.f4710d = 1;
            List list = this.f4696t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f4696t.get(size)).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(View view, float f10) {
        List list = this.f4696t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f4696t.get(size)).d(view, f10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View n(int i10) {
        int b10 = C1712s.b(i10, C1680b0.A(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f4710d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4689m = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4689m = true;
    }

    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f4668C && this.f4699w != null) {
            Object obj = this.f4667B;
            if (obj != null) {
                i10 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f4699w.setBounds(0, 0, getWidth(), i10);
                this.f4699w.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            G1.c r1 = r6.f4682g
            boolean r1 = r1.P(r7)
            G1.c r2 = r6.f4684h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            G1.c r7 = r6.f4682g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L_0x0036
            O1.a$h r7 = r6.f4685i
            r7.p()
            O1.a$h r7 = r6.f4686j
            r7.p()
            goto L_0x0036
        L_0x0031:
            r6.i(r2)
            r6.f4694r = r3
        L_0x0036:
            r7 = r3
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4697u = r0
            r6.f4698v = r7
            float r4 = r6.f4679e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            G1.c r4 = r6.f4682g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = r2
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            r6.f4694r = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f4694r
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View p10 = p();
        if (p10 != null && r(p10) == 0) {
            h();
        }
        if (p10 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11;
        int i15;
        boolean z12 = true;
        this.f4688l = true;
        int i16 = i12 - i10;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i18 = fVar.leftMargin;
                    childAt.layout(i18, fVar.topMargin, childAt.getMeasuredWidth() + i18, fVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f4708b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i19 = i16 - ((int) (fVar.f4708b * f12));
                        f10 = ((float) (i16 - i19)) / f12;
                        i14 = i19;
                    }
                    if (f10 != fVar.f4708b) {
                        z11 = z12;
                    } else {
                        z11 = false;
                    }
                    int i20 = fVar.f4707a & 112;
                    if (i20 == 16) {
                        int i21 = i13 - i11;
                        int i22 = (i21 - measuredHeight) / 2;
                        int i23 = fVar.topMargin;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = i22 + measuredHeight;
                            int i25 = fVar.bottomMargin;
                            if (i24 > i21 - i25) {
                                i22 = (i21 - i25) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i22, measuredWidth + i14, measuredHeight + i22);
                    } else if (i20 != 80) {
                        int i26 = fVar.topMargin;
                        childAt.layout(i14, i26, measuredWidth + i14, measuredHeight + i26);
                    } else {
                        int i27 = i13 - i11;
                        childAt.layout(i14, (i27 - fVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i27 - fVar.bottomMargin);
                    }
                    if (z11) {
                        S(childAt, f10);
                    }
                    if (fVar.f4708b > 0.0f) {
                        i15 = 0;
                    } else {
                        i15 = 4;
                    }
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (f4665l0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C2388d i28 = D0.y(rootWindowInsets).i();
            G1.c cVar = this.f4682g;
            cVar.L(Math.max(cVar.w(), i28.f25150a));
            G1.c cVar2 = this.f4684h;
            cVar2.L(Math.max(cVar2.w(), i28.f25152c));
        }
        this.f4688l = false;
        this.f4689m = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f4667B == null || !C1680b0.x(this)) {
            z10 = false;
        } else {
            z10 = true;
        }
        int A10 = C1680b0.A(this);
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int b10 = C1712s.b(fVar.f4707a, A10);
                    if (C1680b0.x(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f4667B;
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f4667B;
                        if (b10 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        fVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        fVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        fVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        fVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - fVar.leftMargin) - fVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - fVar.topMargin) - fVar.bottomMargin, 1073741824));
                } else if (D(childAt)) {
                    if (f4664k0) {
                        float v10 = C1680b0.v(childAt);
                        float f10 = this.f4676b;
                        if (v10 != f10) {
                            C1680b0.w0(childAt, f10);
                        }
                    }
                    int t10 = t(childAt) & 7;
                    if (t10 == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((!z11 || !z12) && (z11 || !z13)) {
                        if (z11) {
                            z12 = true;
                        } else {
                            z13 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f4677c + fVar.leftMargin + fVar.rightMargin, fVar.width), ViewGroup.getChildMeasureSpec(i11, fVar.topMargin + fVar.bottomMargin, fVar.height));
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t10) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i13 = i10;
            int i14 = i11;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n10;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i10 = gVar.f4711c;
        if (!(i10 == 0 || (n10 = n(i10)) == null)) {
            K(n10);
        }
        int i11 = gVar.f4712d;
        if (i11 != 3) {
            R(i11, 3);
        }
        int i12 = gVar.f4713e;
        if (i12 != 3) {
            R(i12, 5);
        }
        int i13 = gVar.f4714f;
        if (i13 != 3) {
            R(i13, 8388611);
        }
        int i14 = gVar.f4715g;
        if (i14 != 3) {
            R(i14, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        P();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z10;
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f4710d;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                gVar.f4711c = fVar.f4707a;
            } else {
                i10++;
            }
        }
        gVar.f4712d = this.f4690n;
        gVar.f4713e = this.f4691o;
        gVar.f4714f = this.f4692p;
        gVar.f4715g = this.f4693q;
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r(r7) != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            G1.c r0 = r6.f4682g
            r0.F(r7)
            G1.c r0 = r6.f4684h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006d
        L_0x001a:
            r6.i(r2)
            r6.f4694r = r1
            goto L_0x006d
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            G1.c r3 = r6.f4682g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L_0x005a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L_0x005a
            float r3 = r6.f4697u
            float r0 = r0 - r3
            float r3 = r6.f4698v
            float r7 = r7 - r3
            G1.c r3 = r6.f4682g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L_0x005a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            r6.i(r1)
            goto L_0x006d
        L_0x005f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f4697u = r0
            r6.f4698v = r7
            r6.f4694r = r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int A10 = C1680b0.A(this);
        if (i10 == 3) {
            int i15 = this.f4690n;
            if (i15 != 3) {
                return i15;
            }
            if (A10 == 0) {
                i11 = this.f4692p;
            } else {
                i11 = this.f4693q;
            }
            if (i11 != 3) {
                return i11;
            }
            return 0;
        } else if (i10 == 5) {
            int i16 = this.f4691o;
            if (i16 != 3) {
                return i16;
            }
            if (A10 == 0) {
                i12 = this.f4693q;
            } else {
                i12 = this.f4692p;
            }
            if (i12 != 3) {
                return i12;
            }
            return 0;
        } else if (i10 == 8388611) {
            int i17 = this.f4692p;
            if (i17 != 3) {
                return i17;
            }
            if (A10 == 0) {
                i13 = this.f4690n;
            } else {
                i13 = this.f4691o;
            }
            if (i13 != 3) {
                return i13;
            }
            return 0;
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i18 = this.f4693q;
            if (i18 != 3) {
                return i18;
            }
            if (A10 == 0) {
                i14 = this.f4691o;
            } else {
                i14 = this.f4690n;
            }
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f4707a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.f4688l) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i10) {
        int b10 = C1712s.b(i10, C1680b0.A(this));
        if (b10 == 3) {
            return this.f4702z;
        }
        if (b10 == 5) {
            return this.f4666A;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f4676b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt)) {
                C1680b0.w0(childAt, this.f4676b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f4695s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f4695s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        R(i10, 3);
        R(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f4678d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4699w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f4699w = new ColorDrawable(i10);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public int t(View view) {
        return C1712s.b(((f) view.getLayoutParams()).f4707a, C1680b0.A(this));
    }

    /* access modifiers changed from: package-private */
    public float u(View view) {
        return ((f) view.getLayoutParams()).f4708b;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, N1.a.f4381a);
    }

    /* JADX INFO: finally extract failed */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4675a = new d();
        this.f4678d = -1728053248;
        this.f4680f = new Paint();
        this.f4689m = true;
        this.f4690n = 3;
        this.f4691o = 3;
        this.f4692p = 3;
        this.f4693q = 3;
        this.f4669D = null;
        this.f4670E = null;
        this.f4671F = null;
        this.f4672G = null;
        this.f4683g0 = new C0113a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f4677c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f4685i = hVar;
        h hVar2 = new h(5);
        this.f4686j = hVar2;
        G1.c n10 = G1.c.n(this, 1.0f, hVar);
        this.f4682g = n10;
        n10.M(1);
        n10.N(f11);
        hVar.q(n10);
        G1.c n11 = G1.c.n(this, 1.0f, hVar2);
        this.f4684h = n11;
        n11.M(2);
        n11.N(f11);
        hVar2.q(n11);
        setFocusableInTouchMode(true);
        C1680b0.y0(this, 1);
        C1680b0.o0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (C1680b0.x(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4661h0);
            try {
                this.f4699w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, N1.c.f4384b, i10, 0);
        try {
            if (obtainStyledAttributes2.hasValue(N1.c.f4385c)) {
                this.f4676b = obtainStyledAttributes2.getDimension(N1.c.f4385c, 0.0f);
            } else {
                this.f4676b = getResources().getDimension(N1.b.f4382a);
            }
            obtainStyledAttributes2.recycle();
            this.f4673H = new ArrayList();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f4699w = i10 != 0 ? androidx.core.content.c.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f4707a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f4708b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4709c;

        /* renamed from: d  reason: collision with root package name */
        int f4710d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4662i0);
            this.f4707a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
        }

        public f(f fVar) {
            super(fVar);
            this.f4707a = fVar.f4707a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class g extends F1.a {
        public static final Parcelable.Creator<g> CREATOR = new C0114a();

        /* renamed from: c  reason: collision with root package name */
        int f4711c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f4712d;

        /* renamed from: e  reason: collision with root package name */
        int f4713e;

        /* renamed from: f  reason: collision with root package name */
        int f4714f;

        /* renamed from: g  reason: collision with root package name */
        int f4715g;

        /* renamed from: O1.a$g$a  reason: collision with other inner class name */
        class C0114a implements Parcelable.ClassLoaderCreator {
            C0114a() {
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
            this.f4711c = parcel.readInt();
            this.f4712d = parcel.readInt();
            this.f4713e = parcel.readInt();
            this.f4714f = parcel.readInt();
            this.f4715g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4711c);
            parcel.writeInt(this.f4712d);
            parcel.writeInt(this.f4713e);
            parcel.writeInt(this.f4714f);
            parcel.writeInt(this.f4715g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
