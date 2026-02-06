package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.C1686e0;
import androidx.core.widget.d;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.a;
import com.revenuecat.purchases.common.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t3.C2661a;
import t3.C2662b;
import t3.C2663c;
import y1.C2930A;
import y1.C2932b;

public class RecyclerView extends ViewGroup implements androidx.core.view.D {

    /* renamed from: U0  reason: collision with root package name */
    static boolean f17937U0 = false;

    /* renamed from: V0  reason: collision with root package name */
    static boolean f17938V0 = false;

    /* renamed from: W0  reason: collision with root package name */
    private static final int[] f17939W0 = {16843830};

    /* renamed from: X0  reason: collision with root package name */
    private static final float f17940X0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: Y0  reason: collision with root package name */
    static final boolean f17941Y0 = false;

    /* renamed from: Z0  reason: collision with root package name */
    static final boolean f17942Z0 = true;

    /* renamed from: a1  reason: collision with root package name */
    static final boolean f17943a1 = true;

    /* renamed from: b1  reason: collision with root package name */
    static final boolean f17944b1 = true;

    /* renamed from: c1  reason: collision with root package name */
    private static final boolean f17945c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    private static final boolean f17946d1 = false;

    /* renamed from: e1  reason: collision with root package name */
    private static final Class[] f17947e1;

    /* renamed from: f1  reason: collision with root package name */
    static final Interpolator f17948f1 = new C1830c();

    /* renamed from: g1  reason: collision with root package name */
    static final C f17949g1 = new C();

    /* renamed from: A  reason: collision with root package name */
    private int f17950A;

    /* renamed from: A0  reason: collision with root package name */
    e.b f17951A0;

    /* renamed from: B  reason: collision with root package name */
    boolean f17952B;

    /* renamed from: B0  reason: collision with root package name */
    final B f17953B0;

    /* renamed from: C  reason: collision with root package name */
    private final AccessibilityManager f17954C;

    /* renamed from: C0  reason: collision with root package name */
    private u f17955C0;

    /* renamed from: D  reason: collision with root package name */
    private List f17956D;

    /* renamed from: D0  reason: collision with root package name */
    private List f17957D0;

    /* renamed from: E  reason: collision with root package name */
    boolean f17958E;

    /* renamed from: E0  reason: collision with root package name */
    boolean f17959E0;

    /* renamed from: F  reason: collision with root package name */
    boolean f17960F;

    /* renamed from: F0  reason: collision with root package name */
    boolean f17961F0;

    /* renamed from: G  reason: collision with root package name */
    private int f17962G;

    /* renamed from: G0  reason: collision with root package name */
    private m.a f17963G0;

    /* renamed from: H  reason: collision with root package name */
    private int f17964H;

    /* renamed from: H0  reason: collision with root package name */
    boolean f17965H0;

    /* renamed from: I  reason: collision with root package name */
    private l f17966I;

    /* renamed from: I0  reason: collision with root package name */
    k f17967I0;

    /* renamed from: J0  reason: collision with root package name */
    private final int[] f17968J0;

    /* renamed from: K0  reason: collision with root package name */
    private androidx.core.view.E f17969K0;

    /* renamed from: L0  reason: collision with root package name */
    private final int[] f17970L0;

    /* renamed from: M0  reason: collision with root package name */
    private final int[] f17971M0;

    /* renamed from: N0  reason: collision with root package name */
    final int[] f17972N0;

    /* renamed from: O0  reason: collision with root package name */
    final List f17973O0;

    /* renamed from: P0  reason: collision with root package name */
    private Runnable f17974P0;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f17975Q0;

    /* renamed from: R0  reason: collision with root package name */
    private int f17976R0;

    /* renamed from: S0  reason: collision with root package name */
    private int f17977S0;

    /* renamed from: T0  reason: collision with root package name */
    private final p.b f17978T0;

    /* renamed from: a  reason: collision with root package name */
    private final float f17979a;

    /* renamed from: b  reason: collision with root package name */
    private final y f17980b;

    /* renamed from: c  reason: collision with root package name */
    final w f17981c;

    /* renamed from: d  reason: collision with root package name */
    z f17982d;

    /* renamed from: e  reason: collision with root package name */
    a f17983e;

    /* renamed from: f  reason: collision with root package name */
    b f17984f;

    /* renamed from: f0  reason: collision with root package name */
    private EdgeEffect f17985f0;

    /* renamed from: g  reason: collision with root package name */
    final p f17986g;

    /* renamed from: g0  reason: collision with root package name */
    private EdgeEffect f17987g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f17988h;

    /* renamed from: h0  reason: collision with root package name */
    private EdgeEffect f17989h0;

    /* renamed from: i  reason: collision with root package name */
    final Runnable f17990i;

    /* renamed from: i0  reason: collision with root package name */
    private EdgeEffect f17991i0;

    /* renamed from: j  reason: collision with root package name */
    final Rect f17992j;

    /* renamed from: j0  reason: collision with root package name */
    m f17993j0;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f17994k;

    /* renamed from: k0  reason: collision with root package name */
    private int f17995k0;

    /* renamed from: l  reason: collision with root package name */
    final RectF f17996l;

    /* renamed from: l0  reason: collision with root package name */
    private int f17997l0;

    /* renamed from: m  reason: collision with root package name */
    h f17998m;

    /* renamed from: m0  reason: collision with root package name */
    private VelocityTracker f17999m0;

    /* renamed from: n  reason: collision with root package name */
    p f18000n;

    /* renamed from: n0  reason: collision with root package name */
    private int f18001n0;

    /* renamed from: o  reason: collision with root package name */
    final List f18002o;

    /* renamed from: o0  reason: collision with root package name */
    private int f18003o0;

    /* renamed from: p  reason: collision with root package name */
    final ArrayList f18004p;

    /* renamed from: p0  reason: collision with root package name */
    private int f18005p0;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList f18006q;

    /* renamed from: q0  reason: collision with root package name */
    private int f18007q0;

    /* renamed from: r  reason: collision with root package name */
    private t f18008r;

    /* renamed from: r0  reason: collision with root package name */
    private int f18009r0;

    /* renamed from: s  reason: collision with root package name */
    boolean f18010s;

    /* renamed from: s0  reason: collision with root package name */
    private s f18011s0;

    /* renamed from: t  reason: collision with root package name */
    boolean f18012t;

    /* renamed from: t0  reason: collision with root package name */
    private final int f18013t0;

    /* renamed from: u  reason: collision with root package name */
    boolean f18014u;

    /* renamed from: u0  reason: collision with root package name */
    private final int f18015u0;

    /* renamed from: v  reason: collision with root package name */
    boolean f18016v;

    /* renamed from: v0  reason: collision with root package name */
    private float f18017v0;

    /* renamed from: w  reason: collision with root package name */
    private int f18018w;

    /* renamed from: w0  reason: collision with root package name */
    private float f18019w0;

    /* renamed from: x  reason: collision with root package name */
    boolean f18020x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f18021x0;

    /* renamed from: y  reason: collision with root package name */
    boolean f18022y;

    /* renamed from: y0  reason: collision with root package name */
    final E f18023y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f18024z;

    /* renamed from: z0  reason: collision with root package name */
    e f18025z0;

    public static abstract class A {

        /* renamed from: a  reason: collision with root package name */
        private int f18026a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f18027b;

        /* renamed from: c  reason: collision with root package name */
        private p f18028c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f18029d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f18030e;

        /* renamed from: f  reason: collision with root package name */
        private View f18031f;

        /* renamed from: g  reason: collision with root package name */
        private final a f18032g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f18033h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f18034a;

            /* renamed from: b  reason: collision with root package name */
            private int f18035b;

            /* renamed from: c  reason: collision with root package name */
            private int f18036c;

            /* renamed from: d  reason: collision with root package name */
            private int f18037d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f18038e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f18039f;

            /* renamed from: g  reason: collision with root package name */
            private int f18040g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }

            private void e() {
                if (this.f18038e != null && this.f18036c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f18036c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                if (this.f18037d >= 0) {
                    return true;
                }
                return false;
            }

            public void b(int i10) {
                this.f18037d = i10;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i10 = this.f18037d;
                if (i10 >= 0) {
                    this.f18037d = -1;
                    recyclerView.D0(i10);
                    this.f18039f = false;
                } else if (this.f18039f) {
                    e();
                    recyclerView.f18023y0.e(this.f18034a, this.f18035b, this.f18036c, this.f18038e);
                    int i11 = this.f18040g + 1;
                    this.f18040g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f18039f = false;
                } else {
                    this.f18040g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f18034a = i10;
                this.f18035b = i11;
                this.f18036c = i12;
                this.f18038e = interpolator;
                this.f18039f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f18037d = -1;
                this.f18039f = false;
                this.f18040g = 0;
                this.f18034a = i10;
                this.f18035b = i11;
                this.f18036c = i12;
                this.f18038e = interpolator;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            p e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f18027b.f18000n.C(i10);
        }

        public int c() {
            return this.f18027b.f18000n.J();
        }

        public int d(View view) {
            return this.f18027b.k0(view);
        }

        public p e() {
            return this.f18028c;
        }

        public int f() {
            return this.f18026a;
        }

        public boolean g() {
            return this.f18029d;
        }

        public boolean h() {
            return this.f18030e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f18027b;
            if (this.f18026a == -1 || recyclerView == null) {
                r();
            }
            if (this.f18029d && this.f18031f == null && this.f18028c != null && (a10 = a(this.f18026a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.q1((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            this.f18029d = false;
            View view = this.f18031f;
            if (view != null) {
                if (d(view) == this.f18026a) {
                    o(this.f18031f, recyclerView.f17953B0, this.f18032g);
                    this.f18032g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f18031f = null;
                }
            }
            if (this.f18030e) {
                l(i10, i11, recyclerView.f17953B0, this.f18032g);
                boolean a11 = this.f18032g.a();
                this.f18032g.c(recyclerView);
                if (a11 && this.f18030e) {
                    this.f18029d = true;
                    recyclerView.f18023y0.d();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f18031f = view;
                if (RecyclerView.f17938V0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i10, int i11, B b10, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, B b10, a aVar);

        public void p(int i10) {
            this.f18026a = i10;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f18023y0.f();
            if (this.f18033h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f18027b = recyclerView;
            this.f18028c = pVar;
            int i10 = this.f18026a;
            if (i10 != -1) {
                recyclerView.f17953B0.f18041a = i10;
                this.f18030e = true;
                this.f18029d = true;
                this.f18031f = b(f());
                m();
                this.f18027b.f18023y0.d();
                this.f18033h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f18030e) {
                this.f18030e = false;
                n();
                this.f18027b.f17953B0.f18041a = -1;
                this.f18031f = null;
                this.f18026a = -1;
                this.f18029d = false;
                this.f18028c.f1(this);
                this.f18028c = null;
                this.f18027b = null;
            }
        }
    }

    public static class B {

        /* renamed from: a  reason: collision with root package name */
        int f18041a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f18042b;

        /* renamed from: c  reason: collision with root package name */
        int f18043c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f18044d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f18045e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f18046f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f18047g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f18048h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f18049i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f18050j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f18051k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f18052l = false;

        /* renamed from: m  reason: collision with root package name */
        int f18053m;

        /* renamed from: n  reason: collision with root package name */
        long f18054n;

        /* renamed from: o  reason: collision with root package name */
        int f18055o;

        /* renamed from: p  reason: collision with root package name */
        int f18056p;

        /* renamed from: q  reason: collision with root package name */
        int f18057q;

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            if ((this.f18045e & i10) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f18045e));
            }
        }

        public int b() {
            if (this.f18048h) {
                return this.f18043c - this.f18044d;
            }
            return this.f18046f;
        }

        public int c() {
            return this.f18041a;
        }

        public boolean d() {
            if (this.f18041a != -1) {
                return true;
            }
            return false;
        }

        public boolean e() {
            return this.f18048h;
        }

        /* access modifiers changed from: package-private */
        public void f(h hVar) {
            this.f18045e = 1;
            this.f18046f = hVar.e();
            this.f18048h = false;
            this.f18049i = false;
            this.f18050j = false;
        }

        public boolean g() {
            return this.f18052l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f18041a + ", mData=" + this.f18042b + ", mItemCount=" + this.f18046f + ", mIsMeasuring=" + this.f18050j + ", mPreviousLayoutItemCount=" + this.f18043c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f18044d + ", mStructureChanged=" + this.f18047g + ", mInPreLayout=" + this.f18048h + ", mRunSimpleAnimations=" + this.f18051k + ", mRunPredictiveAnimations=" + this.f18052l + '}';
        }
    }

    static class C extends l {
        C() {
        }

        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class D {
    }

    class E implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f18058a;

        /* renamed from: b  reason: collision with root package name */
        private int f18059b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f18060c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f18061d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f18062e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f18063f = false;

        E() {
            Interpolator interpolator = RecyclerView.f17948f1;
            this.f18061d = interpolator;
            this.f18060c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            boolean z10;
            int i12;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z10) {
                i12 = recyclerView.getWidth();
            } else {
                i12 = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) i12)) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            C1680b0.g0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f18059b = 0;
            this.f18058a = 0;
            Interpolator interpolator = this.f18061d;
            Interpolator interpolator2 = RecyclerView.f17948f1;
            if (interpolator != interpolator2) {
                this.f18061d = interpolator2;
                this.f18060c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f18060c.fling(0, 0, i10, i11, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
            d();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f18062e) {
                this.f18063f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f17948f1;
            }
            if (this.f18061d != interpolator) {
                this.f18061d = interpolator;
                this.f18060c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f18059b = 0;
            this.f18058a = 0;
            RecyclerView.this.setScrollState(2);
            this.f18060c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f18060c.abortAnimation();
        }

        public void run() {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f18000n == null) {
                f();
                return;
            }
            this.f18063f = false;
            this.f18062e = true;
            recyclerView.A();
            OverScroller overScroller = this.f18060c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f18058a;
                int i14 = currY - this.f18059b;
                this.f18058a = currX;
                this.f18059b = currY;
                int x10 = RecyclerView.this.x(i13);
                int z13 = RecyclerView.this.z(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f17972N0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x10, z13, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f17972N0;
                    x10 -= iArr2[0];
                    z13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x10, z13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f17998m != null) {
                    int[] iArr3 = recyclerView3.f17972N0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.q1(x10, z13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f17972N0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    x10 -= i10;
                    z13 -= i11;
                    A a10 = recyclerView4.f18000n.f18115g;
                    if (a10 != null && !a10.g() && a10.h()) {
                        int b10 = RecyclerView.this.f17953B0.b();
                        if (b10 == 0) {
                            a10.r();
                        } else if (a10.f() >= b10) {
                            a10.p(b10 - 1);
                            a10.j(i10, i11);
                        } else {
                            a10.j(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f18004p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f17972N0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i10, i11, x10, z13, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f17972N0;
                int i15 = x10 - iArr6[0];
                int i16 = z13 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (overScroller.isFinished() || ((z10 || i15 != 0) && (z11 || i16 != 0))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                A a11 = RecyclerView.this.f18000n.f18115g;
                if ((a11 == null || !a11.g()) && z12) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else if (i15 > 0) {
                            i12 = currVelocity;
                        } else {
                            i12 = 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i12, currVelocity);
                    }
                    if (RecyclerView.f17944b1) {
                        RecyclerView.this.f17951A0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.f18025z0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            A a12 = RecyclerView.this.f18000n.f18115g;
            if (a12 != null && a12.g()) {
                a12.j(0, 0);
            }
            this.f18062e = false;
            if (this.f18063f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.F1(1);
        }
    }

    public static abstract class F {

        /* renamed from: t  reason: collision with root package name */
        private static final List f18065t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f18066a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference f18067b;

        /* renamed from: c  reason: collision with root package name */
        int f18068c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f18069d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f18070e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f18071f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f18072g = -1;

        /* renamed from: h  reason: collision with root package name */
        F f18073h = null;

        /* renamed from: i  reason: collision with root package name */
        F f18074i = null;

        /* renamed from: j  reason: collision with root package name */
        int f18075j;

        /* renamed from: k  reason: collision with root package name */
        List f18076k = null;

        /* renamed from: l  reason: collision with root package name */
        List f18077l = null;

        /* renamed from: m  reason: collision with root package name */
        private int f18078m = 0;

        /* renamed from: n  reason: collision with root package name */
        w f18079n = null;

        /* renamed from: o  reason: collision with root package name */
        boolean f18080o = false;

        /* renamed from: p  reason: collision with root package name */
        private int f18081p = 0;

        /* renamed from: q  reason: collision with root package name */
        int f18082q = -1;

        /* renamed from: r  reason: collision with root package name */
        RecyclerView f18083r;

        /* renamed from: s  reason: collision with root package name */
        h f18084s;

        public F(View view) {
            if (view != null) {
                this.f18066a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.f18076k == null) {
                ArrayList arrayList = new ArrayList();
                this.f18076k = arrayList;
                this.f18077l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean A() {
            if ((this.f18075j & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void B(int i10, boolean z10) {
            if (this.f18069d == -1) {
                this.f18069d = this.f18068c;
            }
            if (this.f18072g == -1) {
                this.f18072g = this.f18068c;
            }
            if (z10) {
                this.f18072g += i10;
            }
            this.f18068c += i10;
            if (this.f18066a.getLayoutParams() != null) {
                ((q) this.f18066a.getLayoutParams()).f18135c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void C(RecyclerView recyclerView) {
            int i10 = this.f18082q;
            if (i10 != -1) {
                this.f18081p = i10;
            } else {
                this.f18081p = C1680b0.y(this.f18066a);
            }
            recyclerView.t1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void D(RecyclerView recyclerView) {
            recyclerView.t1(this, this.f18081p);
            this.f18081p = 0;
        }

        /* access modifiers changed from: package-private */
        public void E() {
            if (!RecyclerView.f17937U0 || !y()) {
                this.f18075j = 0;
                this.f18068c = -1;
                this.f18069d = -1;
                this.f18070e = -1;
                this.f18072g = -1;
                this.f18078m = 0;
                this.f18073h = null;
                this.f18074i = null;
                d();
                this.f18081p = 0;
                this.f18082q = -1;
                RecyclerView.u(this);
                return;
            }
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }

        /* access modifiers changed from: package-private */
        public void F() {
            if (this.f18069d == -1) {
                this.f18069d = this.f18068c;
            }
        }

        /* access modifiers changed from: package-private */
        public void G(int i10, int i11) {
            this.f18075j = (i10 & i11) | (this.f18075j & (~i11));
        }

        public final void H(boolean z10) {
            int i10;
            int i11 = this.f18078m;
            if (z10) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.f18078m = i10;
            if (i10 < 0) {
                this.f18078m = 0;
                if (!RecyclerView.f17937U0) {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z10 && i10 == 1) {
                this.f18075j |= 16;
            } else if (z10 && i10 == 0) {
                this.f18075j &= -17;
            }
            if (RecyclerView.f17938V0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this);
            }
        }

        /* access modifiers changed from: package-private */
        public void I(w wVar, boolean z10) {
            this.f18079n = wVar;
            this.f18080o = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean J() {
            if ((this.f18075j & 16) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean K() {
            if ((this.f18075j & 128) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void L() {
            this.f18079n.O(this);
        }

        /* access modifiers changed from: package-private */
        public boolean M() {
            if ((this.f18075j & 32) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f18075j) == 0) {
                g();
                this.f18076k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            this.f18075j = i10 | this.f18075j;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f18069d = -1;
            this.f18072g = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List list = this.f18076k;
            if (list != null) {
                list.clear();
            }
            this.f18075j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f18075j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f18075j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            if ((this.f18075j & 16) != 0 || !C1680b0.P(this.f18066a)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void i(int i10, int i11, boolean z10) {
            b(8);
            B(i11, z10);
            this.f18068c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f18083r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.h0(this);
        }

        public final int k() {
            RecyclerView recyclerView;
            h adapter;
            int h02;
            if (this.f18084s == null || (recyclerView = this.f18083r) == null || (adapter = recyclerView.getAdapter()) == null || (h02 = this.f18083r.h0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f18084s, this, h02);
        }

        public final long l() {
            return this.f18070e;
        }

        public final int m() {
            return this.f18071f;
        }

        public final int n() {
            int i10 = this.f18072g;
            if (i10 == -1) {
                return this.f18068c;
            }
            return i10;
        }

        public final int o() {
            return this.f18069d;
        }

        /* access modifiers changed from: package-private */
        public List p() {
            if ((this.f18075j & 1024) != 0) {
                return f18065t;
            }
            List list = this.f18076k;
            if (list == null || list.size() == 0) {
                return f18065t;
            }
            return this.f18077l;
        }

        /* access modifiers changed from: package-private */
        public boolean q(int i10) {
            if ((i10 & this.f18075j) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean r() {
            if ((this.f18075j & 512) != 0 || u()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            if (this.f18066a.getParent() == null || this.f18066a.getParent() == this.f18083r) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            if ((this.f18075j & 1) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.f18068c + " id=" + this.f18070e + ", oldPos=" + this.f18069d + ", pLpos:" + this.f18072g);
            if (x()) {
                sb2.append(" scrap ");
                if (this.f18080o) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb2.append(str2);
            }
            if (u()) {
                sb2.append(" invalid");
            }
            if (!t()) {
                sb2.append(" unbound");
            }
            if (A()) {
                sb2.append(" update");
            }
            if (w()) {
                sb2.append(" removed");
            }
            if (K()) {
                sb2.append(" ignored");
            }
            if (y()) {
                sb2.append(" tmpDetached");
            }
            if (!v()) {
                sb2.append(" not recyclable(" + this.f18078m + ")");
            }
            if (r()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f18066a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean u() {
            if ((this.f18075j & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean v() {
            if ((this.f18075j & 16) != 0 || C1680b0.P(this.f18066a)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            if ((this.f18075j & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            if (this.f18079n != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean y() {
            if ((this.f18075j & 256) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            if ((this.f18075j & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a  reason: case insensitive filesystem */
    class C1828a implements Runnable {
        C1828a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f18016v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f18010s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f18022y) {
                    recyclerView2.f18020x = true;
                } else {
                    recyclerView2.A();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b  reason: case insensitive filesystem */
    class C1829b implements Runnable {
        C1829b() {
        }

        public void run() {
            m mVar = RecyclerView.this.f17993j0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f17965H0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: case insensitive filesystem */
    class C1830c implements Interpolator {
        C1830c() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d  reason: case insensitive filesystem */
    class C1831d implements p.b {
        C1831d() {
        }

        public void a(F f10, m.b bVar, m.b bVar2) {
            RecyclerView.this.o(f10, bVar, bVar2);
        }

        public void b(F f10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f18000n.m1(f10.f18066a, recyclerView.f17981c);
        }

        public void c(F f10, m.b bVar, m.b bVar2) {
            RecyclerView.this.f17981c.O(f10);
            RecyclerView.this.q(f10, bVar, bVar2);
        }

        public void d(F f10, m.b bVar, m.b bVar2) {
            f10.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f17958E) {
                if (recyclerView.f17993j0.b(f10, f10, bVar, bVar2)) {
                    RecyclerView.this.U0();
                }
            } else if (recyclerView.f17993j0.d(f10, bVar, bVar2)) {
                RecyclerView.this.U0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e  reason: case insensitive filesystem */
    class C1832e implements b.C0313b {
        C1832e() {
        }

        public void a(View view) {
            F m02 = RecyclerView.m0(view);
            if (m02 != null) {
                m02.C(RecyclerView.this);
            }
        }

        public F b(View view) {
            return RecyclerView.m0(view);
        }

        public void c(int i10) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                F m02 = RecyclerView.m0(childAt);
                if (m02 != null) {
                    if (!m02.y() || m02.K()) {
                        if (RecyclerView.f17938V0) {
                            Log.d("RecyclerView", "tmpDetach " + m02);
                        }
                        m02.b(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + m02 + RecyclerView.this.V());
                    }
                }
            } else if (RecyclerView.f17937U0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        public void d(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        public void e() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public void g(View view) {
            F m02 = RecyclerView.m0(view);
            if (m02 != null) {
                m02.D(RecyclerView.this);
            }
        }

        public View getChildAt(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        public void i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            F m02 = RecyclerView.m0(view);
            if (m02 != null) {
                if (m02.y() || m02.K()) {
                    if (RecyclerView.f17938V0) {
                        Log.d("RecyclerView", "reAttach " + m02);
                    }
                    m02.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m02 + RecyclerView.this.V());
                }
            } else if (RecyclerView.f17937U0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f  reason: case insensitive filesystem */
    class C1833f implements a.C0312a {
        C1833f() {
        }

        public void a(int i10, int i11) {
            RecyclerView.this.K0(i10, i11);
            RecyclerView.this.f17959E0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(a.b bVar) {
            i(bVar);
        }

        public void d(int i10, int i11) {
            RecyclerView.this.L0(i10, i11, false);
            RecyclerView.this.f17959E0 = true;
        }

        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.I1(i10, i11, obj);
            RecyclerView.this.f17961F0 = true;
        }

        public F f(int i10) {
            F f02 = RecyclerView.this.f0(i10, true);
            if (f02 == null) {
                return null;
            }
            if (!RecyclerView.this.f17984f.n(f02.f18066a)) {
                return f02;
            }
            if (RecyclerView.f17938V0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        public void g(int i10, int i11) {
            RecyclerView.this.J0(i10, i11);
            RecyclerView.this.f17959E0 = true;
        }

        public void h(int i10, int i11) {
            RecyclerView.this.L0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17959E0 = true;
            recyclerView.f17953B0.f18044d += i11;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i10 = bVar.f18218a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f18000n.R0(recyclerView, bVar.f18219b, bVar.f18221d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f18000n.U0(recyclerView2, bVar.f18219b, bVar.f18221d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f18000n.W0(recyclerView3, bVar.f18219b, bVar.f18221d, bVar.f18220c);
            } else if (i10 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f18000n.T0(recyclerView4, bVar.f18219b, bVar.f18221d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18090a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18090a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.h.a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18090a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.h.a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g.<clinit>():void");
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        private final i f18091a = new i();

        /* renamed from: b  reason: collision with root package name */
        private boolean f18092b = false;

        /* renamed from: c  reason: collision with root package name */
        private a f18093c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(F f10, int i10) {
            boolean z10;
            if (f10.f18084s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10.f18068c = i10;
                if (i()) {
                    f10.f18070e = f(i10);
                }
                f10.G(1, 519);
                u1.o.a("RV OnBindView");
            }
            f10.f18084s = this;
            if (RecyclerView.f17937U0) {
                if (f10.f18066a.getParent() == null && C1680b0.R(f10.f18066a) != f10.y()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f10.y() + ", attached to window: " + C1680b0.R(f10.f18066a) + ", holder: " + f10);
                } else if (f10.f18066a.getParent() == null && C1680b0.R(f10.f18066a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f10);
                }
            }
            p(f10, i10, f10.p());
            if (z10) {
                f10.d();
                ViewGroup.LayoutParams layoutParams = f10.f18066a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f18135c = true;
                }
                u1.o.b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = g.f18090a[this.f18093c.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return true;
            }
            if (e() > 0) {
                return true;
            }
            return false;
        }

        public final F c(ViewGroup viewGroup, int i10) {
            try {
                u1.o.a("RV CreateView");
                F q10 = q(viewGroup, i10);
                if (q10.f18066a.getParent() == null) {
                    q10.f18071f = i10;
                    return q10;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                u1.o.b();
            }
        }

        public int d(h hVar, F f10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f18091a.a();
        }

        public final boolean i() {
            return this.f18092b;
        }

        public final void j() {
            this.f18091a.b();
        }

        public final void k(int i10) {
            this.f18091a.c(i10, 1);
        }

        public final void l(int i10, int i11) {
            this.f18091a.d(i10, i11);
        }

        public final void m(int i10) {
            this.f18091a.d(i10, 1);
        }

        public void n(RecyclerView recyclerView) {
        }

        public abstract void o(F f10, int i10);

        public void p(F f10, int i10, List list) {
            o(f10, i10);
        }

        public abstract F q(ViewGroup viewGroup, int i10);

        public void r(RecyclerView recyclerView) {
        }

        public boolean s(F f10) {
            return false;
        }

        public void t(F f10) {
        }

        public void u(F f10) {
        }

        public void v(F f10) {
        }

        public void w(j jVar) {
            this.f18091a.registerObserver(jVar);
        }

        public void x(boolean z10) {
            if (!h()) {
                this.f18092b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void y(j jVar) {
            this.f18091a.unregisterObserver(jVar);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).b(i10, i11);
            }
        }

        public void d(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((j) this.mObservers.get(size)).c(i10, i11);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public abstract void b(int i10, int i11);

        public abstract void c(int i10, int i11);
    }

    public interface k {
    }

    public static class l {
        /* access modifiers changed from: protected */
        public abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        private a f18098a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList f18099b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private long f18100c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f18101d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f18102e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f18103f = 250;

        interface a {
            void a(F f10);
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f18104a;

            /* renamed from: b  reason: collision with root package name */
            public int f18105b;

            /* renamed from: c  reason: collision with root package name */
            public int f18106c;

            /* renamed from: d  reason: collision with root package name */
            public int f18107d;

            public b a(F f10) {
                return b(f10, 0);
            }

            public b b(F f10, int i10) {
                View view = f10.f18066a;
                this.f18104a = view.getLeft();
                this.f18105b = view.getTop();
                this.f18106c = view.getRight();
                this.f18107d = view.getBottom();
                return this;
            }
        }

        static int e(F f10) {
            int i10 = f10.f18075j;
            int i11 = i10 & 14;
            if (f10.u()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i11;
            }
            int o10 = f10.o();
            int j10 = f10.j();
            if (o10 == -1 || j10 == -1 || o10 == j10) {
                return i11;
            }
            return i11 | 2048;
        }

        public abstract boolean a(F f10, b bVar, b bVar2);

        public abstract boolean b(F f10, F f11, b bVar, b bVar2);

        public abstract boolean c(F f10, b bVar, b bVar2);

        public abstract boolean d(F f10, b bVar, b bVar2);

        public abstract boolean f(F f10);

        public boolean g(F f10, List list) {
            return f(f10);
        }

        public final void h(F f10) {
            r(f10);
            a aVar = this.f18098a;
            if (aVar != null) {
                aVar.a(f10);
            }
        }

        public final void i() {
            if (this.f18099b.size() <= 0) {
                this.f18099b.clear();
            } else {
                c.a(this.f18099b.get(0));
                throw null;
            }
        }

        public abstract void j(F f10);

        public abstract void k();

        public long l() {
            return this.f18100c;
        }

        public long m() {
            return this.f18103f;
        }

        public long n() {
            return this.f18102e;
        }

        public long o() {
            return this.f18101d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(F f10) {
        }

        public b s(B b10, F f10) {
            return q().a(f10);
        }

        public b t(B b10, F f10, int i10, List list) {
            return q().a(f10);
        }

        public abstract void u();

        /* access modifiers changed from: package-private */
        public void v(a aVar) {
            this.f18098a = aVar;
        }
    }

    private class n implements m.a {
        n() {
        }

        public void a(F f10) {
            f10.H(true);
            if (f10.f18073h != null && f10.f18074i == null) {
                f10.f18073h = null;
            }
            f10.f18074i = null;
            if (!f10.J() && !RecyclerView.this.f1(f10.f18066a) && f10.y()) {
                RecyclerView.this.removeDetachedView(f10.f18066a, false);
            }
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, B b10) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public abstract void b(RecyclerView recyclerView, int i10, int i11);
    }

    public static class v {

        /* renamed from: a  reason: collision with root package name */
        SparseArray f18137a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        int f18138b = 0;

        /* renamed from: c  reason: collision with root package name */
        Set f18139c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList f18140a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            int f18141b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f18142c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f18143d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = (a) this.f18137a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f18137a.put(i10, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f18138b++;
        }

        /* access modifiers changed from: package-private */
        public void b(h hVar) {
            this.f18139c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f18137a.size(); i10++) {
                a aVar = (a) this.f18137a.valueAt(i10);
                Iterator it = aVar.f18140a.iterator();
                while (it.hasNext()) {
                    E1.a.b(((F) it.next()).f18066a);
                }
                aVar.f18140a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f18138b--;
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, boolean z10) {
            this.f18139c.remove(hVar);
            if (this.f18139c.size() == 0 && !z10) {
                for (int i10 = 0; i10 < this.f18137a.size(); i10++) {
                    SparseArray sparseArray = this.f18137a;
                    ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f18140a;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        E1.a.b(((F) arrayList.get(i11)).f18066a);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10, long j10) {
            a i11 = i(i10);
            i11.f18143d = l(i11.f18143d, j10);
        }

        /* access modifiers changed from: package-private */
        public void g(int i10, long j10) {
            a i11 = i(i10);
            i11.f18142c = l(i11.f18142c, j10);
        }

        public F h(int i10) {
            a aVar = (a) this.f18137a.get(i10);
            if (aVar == null || aVar.f18140a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f18140a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((F) arrayList.get(size)).s()) {
                    return (F) arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f18138b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(F f10) {
            int m10 = f10.m();
            ArrayList arrayList = i(m10).f18140a;
            if (((a) this.f18137a.get(m10)).f18141b <= arrayList.size()) {
                E1.a.b(f10.f18066a);
            } else if (!RecyclerView.f17937U0 || !arrayList.contains(f10)) {
                f10.E();
                arrayList.add(f10);
            } else {
                throw new IllegalArgumentException("this scrap item already exists");
            }
        }

        /* access modifiers changed from: package-private */
        public long l(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return ((j10 / 4) * 3) + (j11 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f18143d;
            if (j12 == 0 || j10 + j12 < j11) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f18142c;
            if (j12 == 0 || j10 + j12 < j11) {
                return true;
            }
            return false;
        }
    }

    public final class w {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList f18144a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f18145b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList f18146c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f18147d;

        /* renamed from: e  reason: collision with root package name */
        private int f18148e;

        /* renamed from: f  reason: collision with root package name */
        int f18149f;

        /* renamed from: g  reason: collision with root package name */
        v f18150g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f18144a = arrayList;
            this.f18147d = Collections.unmodifiableList(arrayList);
            this.f18148e = 2;
            this.f18149f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z10) {
            v vVar = this.f18150g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private boolean M(F f10, int i10, int i11, long j10) {
            f10.f18084s = null;
            f10.f18083r = RecyclerView.this;
            int m10 = f10.m();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f18150g.m(m10, nanoTime, j10)) {
                return false;
            }
            if (f10.y()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f10.f18066a, recyclerView.getChildCount(), f10.f18066a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f17998m.a(f10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f10.f18066a);
            }
            this.f18150g.f(f10.m(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f10);
            if (RecyclerView.this.f17953B0.e()) {
                f10.f18072g = i11;
            }
            return true;
        }

        private void b(F f10) {
            if (RecyclerView.this.A0()) {
                View view = f10.f18066a;
                if (C1680b0.y(view) == 0) {
                    C1680b0.y0(view, 1);
                }
                k kVar = RecyclerView.this.f17967I0;
                if (kVar != null) {
                    C1677a c10 = kVar.c();
                    if (c10 instanceof k.a) {
                        ((k.a) c10).d(view);
                    }
                    C1680b0.o0(view, c10);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(F f10) {
            View view = f10.f18066a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f18150g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17998m != null && recyclerView.isAttachedToWindow()) {
                    this.f18150g.b(RecyclerView.this.f17998m);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void A() {
            for (int i10 = 0; i10 < this.f18146c.size(); i10++) {
                E1.a.b(((F) this.f18146c.get(i10)).f18066a);
            }
            B(RecyclerView.this.f17998m);
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            F m02 = RecyclerView.m0(view);
            m02.f18079n = null;
            m02.f18080o = false;
            m02.e();
            H(m02);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            for (int size = this.f18146c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f18146c.clear();
            if (RecyclerView.f17944b1) {
                RecyclerView.this.f17951A0.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(int i10) {
            if (RecyclerView.f17938V0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            F f10 = (F) this.f18146c.get(i10);
            if (RecyclerView.f17938V0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f10);
            }
            a(f10, true);
            this.f18146c.remove(i10);
        }

        public void G(View view) {
            F m02 = RecyclerView.m0(view);
            if (m02.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m02.x()) {
                m02.L();
            } else if (m02.M()) {
                m02.e();
            }
            H(m02);
            if (RecyclerView.this.f17993j0 != null && !m02.v()) {
                RecyclerView.this.f17993j0.j(m02);
            }
        }

        /* access modifiers changed from: package-private */
        public void H(F f10) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            boolean z13 = true;
            if (f10.x() || f10.f18066a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f10.x());
                sb2.append(" isAttached:");
                if (f10.f18066a.getParent() != null) {
                    z12 = true;
                }
                sb2.append(z12);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            } else if (f10.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f10 + RecyclerView.this.V());
            } else if (!f10.K()) {
                boolean h10 = f10.h();
                h hVar = RecyclerView.this.f17998m;
                if (hVar == null || !h10 || !hVar.s(f10)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!RecyclerView.f17937U0 || !this.f18146c.contains(f10)) {
                    if (z10 || f10.v()) {
                        if (this.f18149f <= 0 || f10.q(526)) {
                            z11 = false;
                        } else {
                            int size = this.f18146c.size();
                            if (size >= this.f18149f && size > 0) {
                                F(0);
                                size--;
                            }
                            if (RecyclerView.f17944b1 && size > 0 && !RecyclerView.this.f17951A0.d(f10.f18068c)) {
                                int i10 = size - 1;
                                while (i10 >= 0) {
                                    if (!RecyclerView.this.f17951A0.d(((F) this.f18146c.get(i10)).f18068c)) {
                                        break;
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            }
                            this.f18146c.add(size, f10);
                            z11 = true;
                        }
                        if (!z11) {
                            a(f10, true);
                        } else {
                            z13 = false;
                        }
                        z12 = z11;
                    } else {
                        if (RecyclerView.f17938V0) {
                            Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                        }
                        z13 = false;
                    }
                    RecyclerView.this.f17986g.q(f10);
                    if (!z12 && !z13 && h10) {
                        E1.a.b(f10.f18066a);
                        f10.f18084s = null;
                        f10.f18083r = null;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("cached view received recycle internal? " + f10 + RecyclerView.this.V());
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
        }

        /* access modifiers changed from: package-private */
        public void I(View view) {
            F m02 = RecyclerView.m0(view);
            if (!m02.q(12) && m02.z() && !RecyclerView.this.s(m02)) {
                if (this.f18145b == null) {
                    this.f18145b = new ArrayList();
                }
                m02.I(this, true);
                this.f18145b.add(m02);
            } else if (!m02.u() || m02.w() || RecyclerView.this.f17998m.i()) {
                m02.I(this, false);
                this.f18144a.add(m02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        /* access modifiers changed from: package-private */
        public void J(v vVar) {
            B(RecyclerView.this.f17998m);
            v vVar2 = this.f18150g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f18150g = vVar;
            if (!(vVar == null || RecyclerView.this.getAdapter() == null)) {
                this.f18150g.a();
            }
            u();
        }

        /* access modifiers changed from: package-private */
        public void K(D d10) {
        }

        public void L(int i10) {
            this.f18148e = i10;
            P();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0175  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x020a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.F N(int r19, boolean r20, long r21) {
            /*
                r18 = this;
                r6 = r18
                r3 = r19
                r0 = r20
                if (r3 < 0) goto L_0x022d
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r1 = r1.f17953B0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x022d
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r1 = r1.f17953B0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$F r1 = r18.h(r19)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$F r1 = r18.m(r19, r20)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.Q(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.x()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f18066a
                r5.removeDetachedView(r9, r8)
                r1.L()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.M()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.H(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x011b
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f17983e
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x011e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f17998m
                int r9 = r9.e()
                if (r5 >= r9) goto L_0x011e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f17998m
                int r9 = r9.g(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f17998m
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f17998m
                long r10 = r1.f(r5)
                androidx.recyclerview.widget.RecyclerView$F r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f18068c = r5
                r4 = r7
            L_0x0096:
                java.lang.String r0 = "RecyclerView"
                if (r1 != 0) goto L_0x00cb
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f17938V0
                if (r1 == 0) goto L_0x00b7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "tryGetViewHolderForPositionByDeadline("
                r1.append(r5)
                r1.append(r3)
                java.lang.String r5 = ") fetching from shared pool"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r0, r1)
            L_0x00b7:
                androidx.recyclerview.widget.RecyclerView$v r1 = r18.i()
                androidx.recyclerview.widget.RecyclerView$F r1 = r1.h(r9)
                if (r1 == 0) goto L_0x00cb
                r1.E()
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f17941Y0
                if (r5 == 0) goto L_0x00cb
                r6.r(r1)
            L_0x00cb:
                if (r1 != 0) goto L_0x011b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r16 = r1.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r21 > r10 ? 1 : (r21 == r10 ? 0 : -1))
                if (r1 == 0) goto L_0x00ea
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f18150g
                r11 = r9
                r12 = r16
                r14 = r21
                boolean r1 = r10.n(r11, r12, r14)
                if (r1 != 0) goto L_0x00ea
                return r2
            L_0x00ea:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r2 = r1.f17998m
                androidx.recyclerview.widget.RecyclerView$F r1 = r2.c(r1, r9)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.f17944b1
                if (r2 == 0) goto L_0x0105
                android.view.View r2 = r1.f18066a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.b0(r2)
                if (r2 == 0) goto L_0x0105
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                r5.<init>(r2)
                r1.f18067b = r5
            L_0x0105:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r2 = r6.f18150g
                long r10 = r10 - r16
                r2.g(r9, r10)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.f17938V0
                if (r2 == 0) goto L_0x011b
                java.lang.String r2 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
                android.util.Log.d(r0, r2)
            L_0x011b:
                r9 = r1
                r10 = r4
                goto L_0x0156
            L_0x011e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r2 = r2.f17953B0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0156:
                if (r10 == 0) goto L_0x018e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r0 = r0.f17953B0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x018e
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.q(r0)
                if (r1 == 0) goto L_0x018e
                r9.G(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r0 = r0.f17953B0
                boolean r0 = r0.f18051k
                if (r0 == 0) goto L_0x018e
                int r0 = androidx.recyclerview.widget.RecyclerView.m.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.f17993j0
                androidx.recyclerview.widget.RecyclerView$B r1 = r1.f17953B0
                java.util.List r4 = r9.p()
                androidx.recyclerview.widget.RecyclerView$m$b r0 = r2.t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.Z0(r9, r0)
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r0 = r0.f17953B0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x01a1
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01a1
                r9.f18072g = r3
                goto L_0x01b4
            L_0x01a1:
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01b6
                boolean r0 = r9.A()
                if (r0 != 0) goto L_0x01b6
                boolean r0 = r9.u()
                if (r0 == 0) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                r0 = r8
                goto L_0x01f4
            L_0x01b6:
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f17937U0
                if (r0 == 0) goto L_0x01e1
                boolean r0 = r9.w()
                if (r0 != 0) goto L_0x01c1
                goto L_0x01e1
            L_0x01c1:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
                r1.append(r2)
                r1.append(r9)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x01e1:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f17983e
                int r2 = r0.m(r3)
                r0 = r18
                r1 = r9
                r3 = r19
                r4 = r21
                boolean r0 = r0.M(r1, r2, r3, r4)
            L_0x01f4:
                android.view.View r1 = r9.f18066a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020a
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.q) r1
                android.view.View r2 = r9.f18066a
                r2.setLayoutParams(r1)
                goto L_0x0222
            L_0x020a:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0220
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.q) r1
                android.view.View r2 = r9.f18066a
                r2.setLayoutParams(r1)
                goto L_0x0222
            L_0x0220:
                androidx.recyclerview.widget.RecyclerView$q r1 = (androidx.recyclerview.widget.RecyclerView.q) r1
            L_0x0222:
                r1.f18133a = r9
                if (r10 == 0) goto L_0x0229
                if (r0 == 0) goto L_0x0229
                goto L_0x022a
            L_0x0229:
                r7 = r8
            L_0x022a:
                r1.f18136d = r7
                return r9
            L_0x022d:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$B r2 = r2.f17953B0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.V()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$F");
        }

        /* access modifiers changed from: package-private */
        public void O(F f10) {
            if (f10.f18080o) {
                this.f18145b.remove(f10);
            } else {
                this.f18144a.remove(f10);
            }
            f10.f18079n = null;
            f10.f18080o = false;
            f10.e();
        }

        /* access modifiers changed from: package-private */
        public void P() {
            int i10;
            p pVar = RecyclerView.this.f18000n;
            if (pVar != null) {
                i10 = pVar.f18121m;
            } else {
                i10 = 0;
            }
            this.f18149f = this.f18148e + i10;
            for (int size = this.f18146c.size() - 1; size >= 0 && this.f18146c.size() > this.f18149f; size--) {
                F(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean Q(F f10) {
            if (!f10.w()) {
                int i10 = f10.f18068c;
                if (i10 < 0 || i10 >= RecyclerView.this.f17998m.e()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f10 + RecyclerView.this.V());
                } else if (!RecyclerView.this.f17953B0.e() && RecyclerView.this.f17998m.g(f10.f18068c) != f10.m()) {
                    return false;
                } else {
                    if (!RecyclerView.this.f17998m.i()) {
                        return true;
                    }
                    if (f10.l() == RecyclerView.this.f17998m.f(f10.f18068c)) {
                        return true;
                    }
                    return false;
                }
            } else if (!RecyclerView.f17937U0 || RecyclerView.this.f17953B0.e()) {
                return RecyclerView.this.f17953B0.e();
            } else {
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
        }

        /* access modifiers changed from: package-private */
        public void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f18146c.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f18146c.get(size);
                if (f10 != null && (i12 = f10.f18068c) >= i10 && i12 < i13) {
                    f10.b(2);
                    F(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(F f10, boolean z10) {
            C1677a aVar;
            RecyclerView.u(f10);
            View view = f10.f18066a;
            k kVar = RecyclerView.this.f17967I0;
            if (kVar != null) {
                C1677a c10 = kVar.c();
                if (c10 instanceof k.a) {
                    aVar = ((k.a) c10).c(view);
                } else {
                    aVar = null;
                }
                C1680b0.o0(view, aVar);
            }
            if (z10) {
                g(f10);
            }
            f10.f18084s = null;
            f10.f18083r = null;
            i().k(f10);
        }

        public void c() {
            this.f18144a.clear();
            E();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f18146c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F) this.f18146c.get(i10)).c();
            }
            int size2 = this.f18144a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((F) this.f18144a.get(i11)).c();
            }
            ArrayList arrayList = this.f18145b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((F) this.f18145b.get(i12)).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f18144a.clear();
            ArrayList arrayList = this.f18145b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 < 0 || i10 >= RecyclerView.this.f17953B0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f17953B0.b() + RecyclerView.this.V());
            } else if (!RecyclerView.this.f17953B0.e()) {
                return i10;
            } else {
                return RecyclerView.this.f17983e.m(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(F f10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f18002o.size() <= 0) {
                h hVar = RecyclerView.this.f17998m;
                if (hVar != null) {
                    hVar.v(f10);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f17953B0 != null) {
                    recyclerView.f17986g.q(f10);
                }
                if (RecyclerView.f17938V0) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + f10);
                    return;
                }
                return;
            }
            c.a(RecyclerView.this.f18002o.get(0));
            throw null;
        }

        /* access modifiers changed from: package-private */
        public F h(int i10) {
            int size;
            int m10;
            ArrayList arrayList = this.f18145b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    F f10 = (F) this.f18145b.get(i12);
                    if (f10.M() || f10.n() != i10) {
                        i12++;
                    } else {
                        f10.b(32);
                        return f10;
                    }
                }
                if (RecyclerView.this.f17998m.i() && (m10 = RecyclerView.this.f17983e.m(i10)) > 0 && m10 < RecyclerView.this.f17998m.e()) {
                    long f11 = RecyclerView.this.f17998m.f(m10);
                    while (i11 < size) {
                        F f12 = (F) this.f18145b.get(i11);
                        if (f12.M() || f12.l() != f11) {
                            i11++;
                        } else {
                            f12.b(32);
                            return f12;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public v i() {
            if (this.f18150g == null) {
                this.f18150g = new v();
                u();
            }
            return this.f18150g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f18144a.size();
        }

        public List k() {
            return this.f18147d;
        }

        /* access modifiers changed from: package-private */
        public F l(long j10, int i10, boolean z10) {
            for (int size = this.f18144a.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f18144a.get(size);
                if (f10.l() == j10 && !f10.M()) {
                    if (i10 == f10.m()) {
                        f10.b(32);
                        if (f10.w() && !RecyclerView.this.f17953B0.e()) {
                            f10.G(2, 14);
                        }
                        return f10;
                    } else if (!z10) {
                        this.f18144a.remove(size);
                        RecyclerView.this.removeDetachedView(f10.f18066a, false);
                        D(f10.f18066a);
                    }
                }
            }
            int size2 = this.f18146c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f11 = (F) this.f18146c.get(size2);
                if (f11.l() == j10 && !f11.s()) {
                    if (i10 == f11.m()) {
                        if (!z10) {
                            this.f18146c.remove(size2);
                        }
                        return f11;
                    } else if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public F m(int i10, boolean z10) {
            View e10;
            int size = this.f18144a.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                F f10 = (F) this.f18144a.get(i12);
                if (f10.M() || f10.n() != i10 || f10.u() || (!RecyclerView.this.f17953B0.f18048h && f10.w())) {
                    i12++;
                } else {
                    f10.b(32);
                    return f10;
                }
            }
            if (z10 || (e10 = RecyclerView.this.f17984f.e(i10)) == null) {
                int size2 = this.f18146c.size();
                while (i11 < size2) {
                    F f11 = (F) this.f18146c.get(i11);
                    if (f11.u() || f11.n() != i10 || f11.s()) {
                        i11++;
                    } else {
                        if (!z10) {
                            this.f18146c.remove(i11);
                        }
                        if (RecyclerView.f17938V0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f11);
                        }
                        return f11;
                    }
                }
                return null;
            }
            F m02 = RecyclerView.m0(e10);
            RecyclerView.this.f17984f.s(e10);
            int m10 = RecyclerView.this.f17984f.m(e10);
            if (m10 != -1) {
                RecyclerView.this.f17984f.d(m10);
                I(e10);
                m02.b(8224);
                return m02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m02 + RecyclerView.this.V());
        }

        /* access modifiers changed from: package-private */
        public View n(int i10) {
            return ((F) this.f18144a.get(i10)).f18066a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f18066a;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f18146c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((F) this.f18146c.get(i10)).f18066a.getLayoutParams();
                if (qVar != null) {
                    qVar.f18135c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f18146c.size();
            for (int i10 = 0; i10 < size; i10++) {
                F f10 = (F) this.f18146c.get(i10);
                if (f10 != null) {
                    f10.b(6);
                    f10.a((Object) null);
                }
            }
            h hVar = RecyclerView.this.f17998m;
            if (hVar == null || !hVar.i()) {
                E();
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i10, int i11) {
            int size = this.f18146c.size();
            for (int i12 = 0; i12 < size; i12++) {
                F f10 = (F) this.f18146c.get(i12);
                if (f10 != null && f10.f18068c >= i10) {
                    if (RecyclerView.f17938V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + f10 + " now at position " + (f10.f18068c + i11));
                    }
                    f10.B(i11, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i14 = -1;
                i13 = i10;
                i12 = i11;
            } else {
                i14 = 1;
                i12 = i10;
                i13 = i11;
            }
            int size = this.f18146c.size();
            for (int i16 = 0; i16 < size; i16++) {
                F f10 = (F) this.f18146c.get(i16);
                if (f10 != null && (i15 = f10.f18068c) >= i13 && i15 <= i12) {
                    if (i15 == i10) {
                        f10.B(i11 - i10, false);
                    } else {
                        f10.B(i14, false);
                    }
                    if (RecyclerView.f17938V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + f10);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f18146c.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f18146c.get(size);
                if (f10 != null) {
                    int i13 = f10.f18068c;
                    if (i13 >= i12) {
                        if (RecyclerView.f17938V0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f10 + " now at position " + (f10.f18068c - i11));
                        }
                        f10.B(-i11, z10);
                    } else if (i13 >= i10) {
                        f10.b(8);
                        F(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        /* access modifiers changed from: package-private */
        public void z() {
            u();
        }
    }

    public interface x {
    }

    private class y extends j {
        y() {
        }

        public void a() {
            RecyclerView.this.r((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f17953B0.f18047g = true;
            recyclerView.X0(true);
            if (!RecyclerView.this.f17983e.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void b(int i10, int i11) {
            RecyclerView.this.r((String) null);
            if (RecyclerView.this.f17983e.r(i10, i11)) {
                d();
            }
        }

        public void c(int i10, int i11) {
            RecyclerView.this.r((String) null);
            if (RecyclerView.this.f17983e.s(i10, i11)) {
                d();
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (RecyclerView.f17943a1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f18012t && recyclerView.f18010s) {
                    C1680b0.g0(recyclerView, recyclerView.f17990i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f17952B = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f17947e1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String p02 = p0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(p02, false, classLoader).asSubclass(p.class);
                    try {
                        constructor = asSubclass.getConstructor(f17947e1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        objArr = null;
                        constructor = asSubclass.getConstructor((Class[]) null);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(e10);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + p02, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + p02, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p02, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p02, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + p02, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + p02, e16);
                }
            }
        }
    }

    private boolean C0(View view, View view2, int i10) {
        int i11;
        int i12;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f17992j.set(0, 0, view.getWidth(), view.getHeight());
        this.f17994k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f17992j);
        offsetDescendantRectToMyCoords(view2, this.f17994k);
        char c10 = 65535;
        if (this.f18000n.Z() == 1) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        Rect rect = this.f17992j;
        int i13 = rect.left;
        Rect rect2 = this.f17994k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            if ((i15 > i16 || i13 >= i16) && i13 > i14) {
                i12 = -1;
            } else {
                i12 = 0;
            }
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i10 + V());
                            } else if (c10 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i12 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c10 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i12 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c10 > 0 || (c10 == 0 && i12 * i11 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c10 < 0 || (c10 == 0 && i12 * i11 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean D(int i10, int i11) {
        a0(this.f17968J0);
        int[] iArr = this.f17968J0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return false;
        }
        return true;
    }

    private boolean D1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f17985f0;
        if (edgeEffect == null || d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            d.d(this.f17985f0, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f17989h0;
        if (!(edgeEffect2 == null || d.b(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
            d.d(this.f17989h0, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f17987g0;
        if (!(edgeEffect3 == null || d.b(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
            d.d(this.f17987g0, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f17991i0;
        if (edgeEffect4 == null || d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        d.d(this.f17991i0, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void G() {
        int i10 = this.f17950A;
        this.f17950A = 0;
        if (i10 != 0 && A0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C2932b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void G0(int i10, int i11, MotionEvent motionEvent, int i12) {
        boolean z10;
        float f10;
        float f11;
        int i13;
        int i14;
        int i15;
        p pVar = this.f18000n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f18022y) {
            int[] iArr = this.f17972N0;
            int i16 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean k10 = pVar.k();
            boolean l10 = this.f18000n.l();
            if (l10) {
                z10 = k10 | true;
            } else {
                z10 = k10;
            }
            if (motionEvent == null) {
                f10 = ((float) getHeight()) / 2.0f;
            } else {
                f10 = motionEvent.getY();
            }
            if (motionEvent == null) {
                f11 = ((float) getWidth()) / 2.0f;
            } else {
                f11 = motionEvent.getX();
            }
            int c12 = i10 - c1(i10, f10);
            int d12 = i11 - d1(i11, f11);
            C1(z10 ? 1 : 0, i12);
            if (k10) {
                i13 = c12;
            } else {
                i13 = 0;
            }
            if (l10) {
                i14 = d12;
            } else {
                i14 = 0;
            }
            if (L(i13, i14, this.f17972N0, this.f17970L0, i12)) {
                int[] iArr2 = this.f17972N0;
                c12 -= iArr2[0];
                d12 -= iArr2[1];
            }
            if (k10) {
                i15 = c12;
            } else {
                i15 = 0;
            }
            if (l10) {
                i16 = d12;
            }
            p1(i15, i16, motionEvent, i12);
            e eVar = this.f18025z0;
            if (!(eVar == null || (c12 == 0 && d12 == 0))) {
                eVar.f(this, c12, d12);
            }
            F1(i12);
        }
    }

    private void H1() {
        this.f18023y0.f();
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.K1();
        }
    }

    private void I() {
        boolean z10 = true;
        this.f17953B0.a(1);
        W(this.f17953B0);
        this.f17953B0.f18050j = false;
        B1();
        this.f17986g.f();
        O0();
        W0();
        n1();
        B b10 = this.f17953B0;
        if (!b10.f18051k || !this.f17961F0) {
            z10 = false;
        }
        b10.f18049i = z10;
        this.f17961F0 = false;
        this.f17959E0 = false;
        b10.f18048h = b10.f18052l;
        b10.f18046f = this.f17998m.e();
        a0(this.f17968J0);
        if (this.f17953B0.f18051k) {
            int g10 = this.f17984f.g();
            for (int i10 = 0; i10 < g10; i10++) {
                F m02 = m0(this.f17984f.f(i10));
                if (!m02.K() && (!m02.u() || this.f17998m.i())) {
                    this.f17986g.e(m02, this.f17993j0.t(this.f17953B0, m02, m.e(m02), m02.p()));
                    if (this.f17953B0.f18049i && m02.z() && !m02.w() && !m02.K() && !m02.u()) {
                        this.f17986g.c(i0(m02), m02);
                    }
                }
            }
        }
        if (this.f17953B0.f18052l) {
            o1();
            B b11 = this.f17953B0;
            boolean z11 = b11.f18047g;
            b11.f18047g = false;
            this.f18000n.X0(this.f17981c, b11);
            this.f17953B0.f18047g = z11;
            for (int i11 = 0; i11 < this.f17984f.g(); i11++) {
                F m03 = m0(this.f17984f.f(i11));
                if (!m03.K() && !this.f17986g.i(m03)) {
                    int e10 = m.e(m03);
                    boolean q10 = m03.q(8192);
                    if (!q10) {
                        e10 |= 4096;
                    }
                    m.b t10 = this.f17993j0.t(this.f17953B0, m03, e10, m03.p());
                    if (q10) {
                        Z0(m03, t10);
                    } else {
                        this.f17986g.a(m03, t10);
                    }
                }
            }
            v();
        } else {
            v();
        }
        P0();
        E1(false);
        this.f17953B0.f18045e = 2;
    }

    private void J() {
        boolean z10;
        B1();
        O0();
        this.f17953B0.a(6);
        this.f17983e.j();
        this.f17953B0.f18046f = this.f17998m.e();
        this.f17953B0.f18044d = 0;
        if (this.f17982d != null && this.f17998m.b()) {
            Parcelable parcelable = this.f17982d.f18153c;
            if (parcelable != null) {
                this.f18000n.c1(parcelable);
            }
            this.f17982d = null;
        }
        B b10 = this.f17953B0;
        b10.f18048h = false;
        this.f18000n.X0(this.f17981c, b10);
        B b11 = this.f17953B0;
        b11.f18047g = false;
        if (!b11.f18051k || this.f17993j0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        b11.f18051k = z10;
        b11.f18045e = 4;
        P0();
        E1(false);
    }

    private void K() {
        this.f17953B0.a(4);
        B1();
        O0();
        B b10 = this.f17953B0;
        b10.f18045e = 1;
        if (b10.f18051k) {
            for (int g10 = this.f17984f.g() - 1; g10 >= 0; g10--) {
                F m02 = m0(this.f17984f.f(g10));
                if (!m02.K()) {
                    long i02 = i0(m02);
                    m.b s10 = this.f17993j0.s(this.f17953B0, m02);
                    F g11 = this.f17986g.g(i02);
                    if (g11 == null || g11.K()) {
                        this.f17986g.d(m02, s10);
                    } else {
                        boolean h10 = this.f17986g.h(g11);
                        boolean h11 = this.f17986g.h(m02);
                        if (!h10 || g11 != m02) {
                            m.b n10 = this.f17986g.n(g11);
                            this.f17986g.d(m02, s10);
                            m.b m10 = this.f17986g.m(m02);
                            if (n10 == null) {
                                s0(i02, m02, g11);
                            } else {
                                p(g11, m02, n10, m10, h10, h11);
                            }
                        } else {
                            this.f17986g.d(m02, s10);
                        }
                    }
                }
            }
            this.f17986g.o(this.f17978T0);
        }
        this.f18000n.l1(this.f17981c);
        B b11 = this.f17953B0;
        b11.f18043c = b11.f18046f;
        this.f17958E = false;
        this.f17960F = false;
        b11.f18051k = false;
        b11.f18052l = false;
        this.f18000n.f18116h = false;
        ArrayList arrayList = this.f17981c.f18145b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.f18000n;
        if (pVar.f18122n) {
            pVar.f18121m = 0;
            pVar.f18122n = false;
            this.f17981c.P();
        }
        this.f18000n.Y0(this.f17953B0);
        P0();
        E1(false);
        this.f17986g.f();
        int[] iArr = this.f17968J0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        a1();
        l1();
    }

    private boolean Q(MotionEvent motionEvent) {
        t tVar = this.f18008r;
        if (tVar != null) {
            tVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f18008r = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return Z(motionEvent);
        }
    }

    private void R0(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17997l0) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f17997l0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f18005p0 = x10;
            this.f18001n0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f18007q0 = y10;
            this.f18003o0 = y10;
        }
    }

    private boolean V0() {
        if (this.f17993j0 == null || !this.f18000n.L1()) {
            return false;
        }
        return true;
    }

    private void W0() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f17958E) {
            this.f17983e.w();
            if (this.f17960F) {
                this.f18000n.S0(this);
            }
        }
        if (V0()) {
            this.f17983e.u();
        } else {
            this.f17983e.j();
        }
        boolean z13 = true;
        if (this.f17959E0 || this.f17961F0) {
            z10 = true;
        } else {
            z10 = false;
        }
        B b10 = this.f17953B0;
        if (!this.f18016v || this.f17993j0 == null || ((!(z12 = this.f17958E) && !z10 && !this.f18000n.f18116h) || (z12 && !this.f17998m.i()))) {
            z11 = false;
        } else {
            z11 = true;
        }
        b10.f18051k = z11;
        B b11 = this.f17953B0;
        if (!b11.f18051k || !z10 || this.f17958E || !V0()) {
            z13 = false;
        }
        b11.f18052l = z13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.S()
            android.widget.EdgeEffect r1 = r6.f17985f0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.d(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.T()
            android.widget.EdgeEffect r1 = r6.f17989h0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.U()
            android.widget.EdgeEffect r9 = r6.f17987g0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.d(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.R()
            android.widget.EdgeEffect r9 = r6.f17991i0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.d(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.C1680b0.f0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y0(float, float, float, float):void");
    }

    private boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f18006q.size();
        int i10 = 0;
        while (i10 < size) {
            t tVar = (t) this.f18006q.get(i10);
            if (!tVar.b(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f18008r = tVar;
                return true;
            }
        }
        return false;
    }

    private void a0(int[] iArr) {
        int g10 = this.f17984f.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            F m02 = m0(this.f17984f.f(i12));
            if (!m02.K()) {
                int n10 = m02.n();
                if (n10 < i10) {
                    i10 = n10;
                }
                if (n10 > i11) {
                    i11 = n10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    private void a1() {
        F f10;
        View findViewById;
        if (this.f18021x0 && this.f17998m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f17946d1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f17984f.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f17984f.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                if (this.f17953B0.f18054n == -1 || !this.f17998m.i()) {
                    f10 = null;
                } else {
                    f10 = e0(this.f17953B0.f18054n);
                }
                if (f10 != null && !this.f17984f.n(f10.f18066a) && f10.f18066a.hasFocusable()) {
                    view = f10.f18066a;
                } else if (this.f17984f.g() > 0) {
                    view = c0();
                }
                if (view != null) {
                    int i10 = this.f17953B0.f18055o;
                    if (!(((long) i10) == -1 || (findViewById = view.findViewById(i10)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    static RecyclerView b0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView b02 = b0(viewGroup.getChildAt(i10));
            if (b02 != null) {
                return b02;
            }
        }
        return null;
    }

    private void b1() {
        boolean z10;
        EdgeEffect edgeEffect = this.f17985f0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f17985f0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f17987g0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f17987g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17989h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f17989h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17991i0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f17991i0.isFinished();
        }
        if (z10) {
            C1680b0.f0(this);
        }
    }

    private View c0() {
        F d02;
        B b10 = this.f17953B0;
        int i10 = b10.f18053m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b11 = b10.b();
        int i11 = i10;
        while (i11 < b11) {
            F d03 = d0(i11);
            if (d03 == null) {
                break;
            } else if (d03.f18066a.hasFocusable()) {
                return d03.f18066a;
            } else {
                i11++;
            }
        }
        int min = Math.min(b11, i10);
        while (true) {
            min--;
            if (min < 0 || (d02 = d0(min)) == null) {
                return null;
            }
            if (d02.f18066a.hasFocusable()) {
                return d02.f18066a;
            }
        }
    }

    private int c1(int i10, float f10) {
        float height = f10 / ((float) getHeight());
        float width = ((float) i10) / ((float) getWidth());
        EdgeEffect edgeEffect = this.f17985f0;
        float f11 = 0.0f;
        if (edgeEffect == null || d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17989h0;
            if (!(edgeEffect2 == null || d.b(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.f17989h0.onRelease();
                } else {
                    float d10 = d.d(this.f17989h0, width, height);
                    if (d.b(this.f17989h0) == 0.0f) {
                        this.f17989h0.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f17985f0.onRelease();
            } else {
                float f12 = -d.d(this.f17985f0, -width, 1.0f - height);
                if (d.b(this.f17985f0) == 0.0f) {
                    this.f17985f0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * ((float) getWidth()));
    }

    private int d1(int i10, float f10) {
        float width = f10 / ((float) getWidth());
        float height = ((float) i10) / ((float) getHeight());
        EdgeEffect edgeEffect = this.f17987g0;
        float f11 = 0.0f;
        if (edgeEffect == null || d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17991i0;
            if (!(edgeEffect2 == null || d.b(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.f17991i0.onRelease();
                } else {
                    float d10 = d.d(this.f17991i0, height, 1.0f - width);
                    if (d.b(this.f17991i0) == 0.0f) {
                        this.f17991i0.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f17987g0.onRelease();
            } else {
                float f12 = -d.d(this.f17987g0, -height, width);
                if (d.b(this.f17987g0) == 0.0f) {
                    this.f17987g0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * ((float) getHeight()));
    }

    private androidx.core.view.E getScrollingChildHelper() {
        if (this.f17969K0 == null) {
            this.f17969K0 = new androidx.core.view.E(this);
        }
        return this.f17969K0;
    }

    private void i(F f10) {
        boolean z10;
        View view = f10.f18066a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17981c.O(l0(view));
        if (f10.y()) {
            this.f17984f.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f17984f.b(view, true);
        } else {
            this.f17984f.k(view);
        }
    }

    private void k1(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f17992j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f18135c) {
                Rect rect = qVar.f18134b;
                Rect rect2 = this.f17992j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f17992j);
            offsetRectIntoDescendantCoords(view, this.f17992j);
        }
        p pVar = this.f18000n;
        Rect rect3 = this.f17992j;
        boolean z11 = !this.f18016v;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        pVar.s1(this, view, rect3, z11, z10);
    }

    private void l1() {
        B b10 = this.f17953B0;
        b10.f18054n = -1;
        b10.f18053m = -1;
        b10.f18055o = -1;
    }

    static F m0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f18133a;
    }

    private void m1() {
        VelocityTracker velocityTracker = this.f17999m0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        F1(0);
        b1();
    }

    static void n0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f18134b;
        rect.set((view.getLeft() - rect2.left) - qVar.leftMargin, (view.getTop() - rect2.top) - qVar.topMargin, view.getRight() + rect2.right + qVar.rightMargin, view.getBottom() + rect2.bottom + qVar.bottomMargin);
    }

    private void n1() {
        View view;
        long j10;
        int i10;
        F f10 = null;
        if (!this.f18021x0 || !hasFocus() || this.f17998m == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            f10 = Y(view);
        }
        if (f10 == null) {
            l1();
            return;
        }
        B b10 = this.f17953B0;
        if (this.f17998m.i()) {
            j10 = f10.l();
        } else {
            j10 = -1;
        }
        b10.f18054n = j10;
        B b11 = this.f17953B0;
        if (this.f17958E) {
            i10 = -1;
        } else if (f10.w()) {
            i10 = f10.f18069d;
        } else {
            i10 = f10.j();
        }
        b11.f18053m = i10;
        this.f17953B0.f18055o = o0(f10.f18066a);
    }

    private int o0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void p(F f10, F f11, m.b bVar, m.b bVar2, boolean z10, boolean z11) {
        f10.H(false);
        if (z10) {
            i(f10);
        }
        if (f10 != f11) {
            if (z11) {
                i(f11);
            }
            f10.f18073h = f11;
            i(f10);
            this.f17981c.O(f10);
            f11.H(false);
            f11.f18074i = f10;
        }
        if (this.f17993j0.b(f10, f11, bVar, bVar2)) {
            U0();
        }
    }

    private String p0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private float r0(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f17979a * 0.015f)));
        float f10 = f17940X0;
        return (float) (((double) (this.f17979a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private void s0(long j10, F f10, F f11) {
        int g10 = this.f17984f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            F m02 = m0(this.f17984f.f(i10));
            if (m02 != f10 && i0(m02) == j10) {
                h hVar = this.f17998m;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m02 + " \n View Holder 2:" + f10 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m02 + " \n View Holder 2:" + f10 + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f11 + " cannot be found but it is necessary for " + f10 + V());
    }

    private void s1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f17998m;
        if (hVar2 != null) {
            hVar2.y(this.f17980b);
            this.f17998m.r(this);
        }
        if (!z10 || z11) {
            e1();
        }
        this.f17983e.w();
        h hVar3 = this.f17998m;
        this.f17998m = hVar;
        if (hVar != null) {
            hVar.w(this.f17980b);
            hVar.n(this);
        }
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.E0(hVar3, this.f17998m);
        }
        this.f17981c.y(hVar3, this.f17998m, z10);
        this.f17953B0.f18047g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f17937U0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f17938V0 = z10;
    }

    private void t() {
        m1();
        setScrollState(0);
    }

    static void u(F f10) {
        WeakReference weakReference = f10.f18067b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != f10.f18066a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            f10.f18067b = null;
        }
    }

    private boolean u0() {
        int g10 = this.f17984f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            F m02 = m0(this.f17984f.f(i10));
            if (m02 != null && !m02.K() && m02.z()) {
                return true;
            }
        }
        return false;
    }

    private boolean u1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        if (r0(-i10) < d.b(edgeEffect) * ((float) i11)) {
            return true;
        }
        return false;
    }

    private void w0() {
        if (C1680b0.z(this) == 0) {
            C1680b0.A0(this, 8);
        }
    }

    private void x0() {
        this.f17984f = new b(new C1832e());
    }

    private int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && d.b(edgeEffect) != 0.0f) {
            int round = Math.round((((float) (-i11)) / 4.0f) * d.d(edgeEffect, (((float) (-i10)) * 4.0f) / ((float) i11), 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || edgeEffect2 == null || d.b(edgeEffect2) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) i11;
            int round2 = Math.round((f10 / 4.0f) * d.d(edgeEffect2, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
    }

    /* access modifiers changed from: package-private */
    public void A() {
        if (!this.f18016v || this.f17958E) {
            u1.o.a("RV FullInvalidate");
            H();
            u1.o.b();
        } else if (this.f17983e.p()) {
            if (this.f17983e.o(4) && !this.f17983e.o(11)) {
                u1.o.a("RV PartialInvalidate");
                B1();
                O0();
                this.f17983e.u();
                if (!this.f18020x) {
                    if (u0()) {
                        H();
                    } else {
                        this.f17983e.i();
                    }
                }
                E1(true);
                P0();
                u1.o.b();
            } else if (this.f17983e.p()) {
                u1.o.a("RV FullInvalidate");
                H();
                u1.o.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A0() {
        AccessibilityManager accessibilityManager = this.f17954C;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    public void A1(int i10) {
        if (!this.f18022y) {
            p pVar = this.f18000n;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                pVar.I1(this, this.f17953B0, i10);
            }
        }
    }

    public boolean B0() {
        if (this.f17962G > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void B1() {
        int i10 = this.f18018w + 1;
        this.f18018w = i10;
        if (i10 == 1 && !this.f18022y) {
            this.f18020x = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10, int i11) {
        setMeasuredDimension(p.n(i10, getPaddingLeft() + getPaddingRight(), C1680b0.C(this)), p.n(i11, getPaddingTop() + getPaddingBottom(), C1680b0.B(this)));
    }

    public boolean C1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void D0(int i10) {
        if (this.f18000n != null) {
            setScrollState(2);
            this.f18000n.x1(i10);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void E(View view) {
        F m02 = m0(view);
        M0(view);
        h hVar = this.f17998m;
        if (!(hVar == null || m02 == null)) {
            hVar.t(m02);
        }
        List list = this.f17956D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f17956D.get(size)).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E0() {
        int j10 = this.f17984f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((q) this.f17984f.i(i10).getLayoutParams()).f18135c = true;
        }
        this.f17981c.s();
    }

    /* access modifiers changed from: package-private */
    public void E1(boolean z10) {
        if (this.f18018w < 1) {
            if (!f17937U0) {
                this.f18018w = 1;
            } else {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
        }
        if (!z10 && !this.f18022y) {
            this.f18020x = false;
        }
        if (this.f18018w == 1) {
            if (z10 && this.f18020x && !this.f18022y && this.f18000n != null && this.f17998m != null) {
                H();
            }
            if (!this.f18022y) {
                this.f18020x = false;
            }
        }
        this.f18018w--;
    }

    /* access modifiers changed from: package-private */
    public void F(View view) {
        F m02 = m0(view);
        N0(view);
        h hVar = this.f17998m;
        if (!(hVar == null || m02 == null)) {
            hVar.u(m02);
        }
        List list = this.f17956D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f17956D.get(size)).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        int j10 = this.f17984f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F m02 = m0(this.f17984f.i(i10));
            if (m02 != null && !m02.K()) {
                m02.b(6);
            }
        }
        E0();
        this.f17981c.t();
    }

    public void F1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void G1() {
        setScrollState(0);
        H1();
    }

    /* access modifiers changed from: package-private */
    public void H() {
        boolean z10;
        if (this.f17998m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f18000n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f17953B0.f18050j = false;
            if (!this.f17975Q0 || (this.f17976R0 == getWidth() && this.f17977S0 == getHeight())) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f17976R0 = 0;
            this.f17977S0 = 0;
            this.f17975Q0 = false;
            if (this.f17953B0.f18045e == 1) {
                I();
                this.f18000n.z1(this);
                J();
            } else if (this.f17983e.q() || z10 || this.f18000n.o0() != getWidth() || this.f18000n.W() != getHeight()) {
                this.f18000n.z1(this);
                J();
            } else {
                this.f18000n.z1(this);
            }
            K();
        }
    }

    public void H0(int i10) {
        int g10 = this.f17984f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f17984f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void I0(int i10) {
        int g10 = this.f17984f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f17984f.f(i11).offsetTopAndBottom(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f17984f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f17984f.i(i14);
            F m02 = m0(i15);
            if (m02 != null && !m02.K() && (i12 = m02.f18068c) >= i10 && i12 < i13) {
                m02.b(2);
                m02.a(obj);
                ((q) i15.getLayoutParams()).f18135c = true;
            }
        }
        this.f17981c.R(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void J0(int i10, int i11) {
        int j10 = this.f17984f.j();
        for (int i12 = 0; i12 < j10; i12++) {
            F m02 = m0(this.f17984f.i(i12));
            if (m02 != null && !m02.K() && m02.f18068c >= i10) {
                if (f17938V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + m02 + " now at position " + (m02.f18068c + i11));
                }
                m02.B(i11, false);
                this.f17953B0.f18047g = true;
            }
        }
        this.f17981c.v(i10, i11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void K0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f17984f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            F m02 = m0(this.f17984f.i(i16));
            if (m02 != null && (i15 = m02.f18068c) >= i13 && i15 <= i12) {
                if (f17938V0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + m02);
                }
                if (m02.f18068c == i10) {
                    m02.B(i11 - i10, false);
                } else {
                    m02.B(i14, false);
                }
                this.f17953B0.f18047g = true;
            }
        }
        this.f17981c.w(i10, i11);
        requestLayout();
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    /* access modifiers changed from: package-private */
    public void L0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f17984f.j();
        for (int i13 = 0; i13 < j10; i13++) {
            F m02 = m0(this.f17984f.i(i13));
            if (m02 != null && !m02.K()) {
                int i14 = m02.f18068c;
                if (i14 >= i12) {
                    if (f17938V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + m02 + " now at position " + (m02.f18068c - i11));
                    }
                    m02.B(-i11, z10);
                    this.f17953B0.f18047g = true;
                } else if (i14 >= i10) {
                    if (f17938V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + m02 + " now REMOVED");
                    }
                    m02.i(i10 - 1, -i11, z10);
                    this.f17953B0.f18047g = true;
                }
            }
        }
        this.f17981c.x(i10, i11, z10);
        requestLayout();
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void M0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void N(int i10) {
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.e1(i10);
        }
        S0(i10);
        u uVar = this.f17955C0;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List list = this.f17957D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f17957D0.get(size)).a(this, i10);
            }
        }
    }

    public void N0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void O(int i10, int i11) {
        this.f17964H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        T0(i10, i11);
        u uVar = this.f17955C0;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List list = this.f17957D0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f17957D0.get(size)).b(this, i10, i11);
            }
        }
        this.f17964H--;
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        this.f17962G++;
    }

    /* access modifiers changed from: package-private */
    public void P() {
        int i10;
        for (int size = this.f17973O0.size() - 1; size >= 0; size--) {
            F f10 = (F) this.f17973O0.get(size);
            if (f10.f18066a.getParent() == this && !f10.K() && (i10 = f10.f18082q) != -1) {
                C1680b0.y0(f10.f18066a, i10);
                f10.f18082q = -1;
            }
        }
        this.f17973O0.clear();
    }

    /* access modifiers changed from: package-private */
    public void P0() {
        Q0(true);
    }

    /* access modifiers changed from: package-private */
    public void Q0(boolean z10) {
        int i10 = this.f17962G - 1;
        this.f17962G = i10;
        if (i10 >= 1) {
            return;
        }
        if (!f17937U0 || i10 >= 0) {
            this.f17962G = 0;
            if (z10) {
                G();
                P();
                return;
            }
            return;
        }
        throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (this.f17991i0 == null) {
            EdgeEffect a10 = this.f17966I.a(this, 3);
            this.f17991i0 = a10;
            if (this.f17988h) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S() {
        if (this.f17985f0 == null) {
            EdgeEffect a10 = this.f17966I.a(this, 0);
            this.f17985f0 = a10;
            if (this.f17988h) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void S0(int i10) {
    }

    /* access modifiers changed from: package-private */
    public void T() {
        if (this.f17989h0 == null) {
            EdgeEffect a10 = this.f17966I.a(this, 2);
            this.f17989h0 = a10;
            if (this.f17988h) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void T0(int i10, int i11) {
    }

    /* access modifiers changed from: package-private */
    public void U() {
        if (this.f17987g0 == null) {
            EdgeEffect a10 = this.f17966I.a(this, 1);
            this.f17987g0 = a10;
            if (this.f17988h) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        if (!this.f17965H0 && this.f18010s) {
            C1680b0.g0(this, this.f17974P0);
            this.f17965H0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public String V() {
        return MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + super.toString() + ", adapter:" + this.f17998m + ", layout:" + this.f18000n + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void W(B b10) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f18023y0.f18060c;
            b10.f18056p = overScroller.getFinalX() - overScroller.getCurrX();
            b10.f18057q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b10.f18056p = 0;
        b10.f18057q = 0;
    }

    public View X(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void X0(boolean z10) {
        this.f17960F = z10 | this.f17960F;
        this.f17958E = true;
        F0();
    }

    public F Y(View view) {
        View X10 = X(view);
        if (X10 == null) {
            return null;
        }
        return l0(X10);
    }

    /* access modifiers changed from: package-private */
    public void Z0(F f10, m.b bVar) {
        f10.G(0, 8192);
        if (this.f17953B0.f18049i && f10.z() && !f10.w() && !f10.K()) {
            this.f17986g.c(i0(f10), f10);
        }
        this.f17986g.e(f10, bVar);
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f18000n;
        if (pVar == null || !pVar.F0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.f17985f0.isFinished()) {
                this.f17985f0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.f17989h0.isFinished()) {
                this.f17989h0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.f17987g0.isFinished()) {
                this.f17987g0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.f17991i0.isFinished()) {
                this.f17991i0.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            C1680b0.f0(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof q) || !this.f18000n.m((q) layoutParams)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        p pVar = this.f18000n;
        if (pVar != null && pVar.k()) {
            return this.f18000n.q(this.f17953B0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        p pVar = this.f18000n;
        if (pVar != null && pVar.k()) {
            return this.f18000n.r(this.f17953B0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        p pVar = this.f18000n;
        if (pVar != null && pVar.k()) {
            return this.f18000n.s(this.f17953B0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        p pVar = this.f18000n;
        if (pVar != null && pVar.l()) {
            return this.f18000n.t(this.f17953B0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        p pVar = this.f18000n;
        if (pVar != null && pVar.l()) {
            return this.f18000n.u(this.f17953B0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        p pVar = this.f18000n;
        if (pVar != null && pVar.l()) {
            return this.f18000n.v(this.f17953B0);
        }
        return 0;
    }

    public F d0(int i10) {
        F f10 = null;
        if (this.f17958E) {
            return null;
        }
        int j10 = this.f17984f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            F m02 = m0(this.f17984f.i(i11));
            if (m02 != null && !m02.w() && h0(m02) == i10) {
                if (!this.f17984f.n(m02.f18066a)) {
                    return m02;
                }
                f10 = m02;
            }
        }
        return f10;
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        int size = this.f18004p.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ((o) this.f18004p.get(i12)).onDrawOver(canvas, this, this.f17953B0);
        }
        EdgeEffect edgeEffect = this.f17985f0;
        boolean z14 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            if (this.f17988h) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i11), 0.0f);
            EdgeEffect edgeEffect2 = this.f17985f0;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z10 = false;
            } else {
                z10 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f17987g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f17988h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f17987g0;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z12 = false;
            } else {
                z12 = true;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f17989h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f17988h) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i10, (float) (-width));
            EdgeEffect edgeEffect6 = this.f17989h0;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z11 = false;
            } else {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f17991i0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f17988h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f17991i0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f17993j0 == null || this.f18004p.size() <= 0 || !this.f17993j0.p()) {
            z14 = z10;
        }
        if (z14) {
            C1680b0.f0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public F e0(long j10) {
        h hVar = this.f17998m;
        F f10 = null;
        if (hVar != null && hVar.i()) {
            int j11 = this.f17984f.j();
            for (int i10 = 0; i10 < j11; i10++) {
                F m02 = m0(this.f17984f.i(i10));
                if (m02 != null && !m02.w() && m02.l() == j10) {
                    if (!this.f17984f.n(m02.f18066a)) {
                        return m02;
                    }
                    f10 = m02;
                }
            }
        }
        return f10;
    }

    /* access modifiers changed from: package-private */
    public void e1() {
        m mVar = this.f17993j0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.k1(this.f17981c);
            this.f18000n.l1(this.f17981c);
        }
        this.f17981c.c();
    }

    /* access modifiers changed from: package-private */
    public F f0(int i10, boolean z10) {
        int j10 = this.f17984f.j();
        F f10 = null;
        for (int i11 = 0; i11 < j10; i11++) {
            F m02 = m0(this.f17984f.i(i11));
            if (m02 != null && !m02.w()) {
                if (z10) {
                    if (m02.f18068c != i10) {
                        continue;
                    }
                } else if (m02.n() != i10) {
                    continue;
                }
                if (!this.f17984f.n(m02.f18066a)) {
                    return m02;
                }
                f10 = m02;
            }
        }
        return f10;
    }

    /* access modifiers changed from: package-private */
    public boolean f1(View view) {
        B1();
        boolean r10 = this.f17984f.r(view);
        if (r10) {
            F m02 = m0(view);
            this.f17981c.O(m02);
            this.f17981c.H(m02);
            if (f17938V0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        E1(!r10);
        return r10;
    }

    public View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        View Q02 = this.f18000n.Q0(view, i10);
        if (Q02 != null) {
            return Q02;
        }
        boolean z14 = true;
        if (this.f17998m == null || this.f18000n == null || B0() || this.f18022y) {
            z10 = false;
        } else {
            z10 = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z10 || !(i10 == 2 || i10 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i10);
            if (findNextFocus != null || !z10) {
                view2 = findNextFocus;
            } else {
                A();
                if (X(view) == null) {
                    return null;
                }
                B1();
                view2 = this.f18000n.J0(view, i10, this.f17981c, this.f17953B0);
                E1(false);
            }
        } else {
            if (this.f18000n.l()) {
                if (i10 == 2) {
                    i12 = 130;
                } else {
                    i12 = 33;
                }
                if (instance.findNextFocus(this, view, i12) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (f17945c1) {
                    i10 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.f18000n.k()) {
                if (this.f18000n.Z() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 ^ z13) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                if (instance.findNextFocus(this, view, i11) != null) {
                    z14 = false;
                }
                if (f17945c1) {
                    i10 = i11;
                }
                z11 = z14;
            }
            if (z11) {
                A();
                if (X(view) == null) {
                    return null;
                }
                B1();
                this.f18000n.J0(view, i10, this.f17981c, this.f17953B0);
                E1(false);
            }
            view2 = instance.findNextFocus(this, view, i10);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (C0(view, view2, i10)) {
                return view2;
            }
            return super.focusSearch(view, i10);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        } else {
            k1(view2, (View) null);
            return view;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g0(int r8, int r9) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r7.f18000n
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r8 = "RecyclerView"
            java.lang.String r9 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r8, r9)
            return r1
        L_0x000d:
            boolean r2 = r7.f18022y
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.k()
            androidx.recyclerview.widget.RecyclerView$p r2 = r7.f18000n
            boolean r2 = r2.l()
            if (r0 == 0) goto L_0x0026
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.f18013t0
            if (r3 >= r4) goto L_0x0027
        L_0x0026:
            r8 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x0031
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.f18013t0
            if (r3 >= r4) goto L_0x0032
        L_0x0031:
            r9 = r1
        L_0x0032:
            if (r8 != 0) goto L_0x0037
            if (r9 != 0) goto L_0x0037
            return r1
        L_0x0037:
            r3 = 0
            if (r8 == 0) goto L_0x007a
            android.widget.EdgeEffect r4 = r7.f17985f0
            if (r4 == 0) goto L_0x005c
            float r4 = androidx.core.widget.d.b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x005c
            android.widget.EdgeEffect r4 = r7.f17985f0
            int r5 = -r8
            int r6 = r7.getWidth()
            boolean r4 = r7.u1(r4, r5, r6)
            if (r4 == 0) goto L_0x0059
            android.widget.EdgeEffect r8 = r7.f17985f0
            r8.onAbsorb(r5)
        L_0x0058:
            r8 = r1
        L_0x0059:
            r4 = r8
            r8 = r1
            goto L_0x007b
        L_0x005c:
            android.widget.EdgeEffect r4 = r7.f17989h0
            if (r4 == 0) goto L_0x007a
            float r4 = androidx.core.widget.d.b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x007a
            android.widget.EdgeEffect r4 = r7.f17989h0
            int r5 = r7.getWidth()
            boolean r4 = r7.u1(r4, r8, r5)
            if (r4 == 0) goto L_0x0059
            android.widget.EdgeEffect r4 = r7.f17989h0
            r4.onAbsorb(r8)
            goto L_0x0058
        L_0x007a:
            r4 = r1
        L_0x007b:
            if (r9 == 0) goto L_0x00bc
            android.widget.EdgeEffect r5 = r7.f17987g0
            if (r5 == 0) goto L_0x009e
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x009e
            android.widget.EdgeEffect r3 = r7.f17987g0
            int r5 = -r9
            int r6 = r7.getHeight()
            boolean r3 = r7.u1(r3, r5, r6)
            if (r3 == 0) goto L_0x009c
            android.widget.EdgeEffect r9 = r7.f17987g0
            r9.onAbsorb(r5)
        L_0x009b:
            r9 = r1
        L_0x009c:
            r3 = r1
            goto L_0x00be
        L_0x009e:
            android.widget.EdgeEffect r5 = r7.f17991i0
            if (r5 == 0) goto L_0x00bc
            float r5 = androidx.core.widget.d.b(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00bc
            android.widget.EdgeEffect r3 = r7.f17991i0
            int r5 = r7.getHeight()
            boolean r3 = r7.u1(r3, r9, r5)
            if (r3 == 0) goto L_0x009c
            android.widget.EdgeEffect r3 = r7.f17991i0
            r3.onAbsorb(r9)
            goto L_0x009b
        L_0x00bc:
            r3 = r9
            r9 = r1
        L_0x00be:
            if (r4 != 0) goto L_0x00c2
            if (r9 == 0) goto L_0x00dd
        L_0x00c2:
            int r5 = r7.f18015u0
            int r6 = -r5
            int r4 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r6, r4)
            int r5 = r7.f18015u0
            int r6 = -r5
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.RecyclerView$E r5 = r7.f18023y0
            r5.b(r4, r9)
        L_0x00dd:
            r5 = 1
            if (r8 != 0) goto L_0x00e8
            if (r3 != 0) goto L_0x00e8
            if (r4 != 0) goto L_0x00e6
            if (r9 == 0) goto L_0x00e7
        L_0x00e6:
            r1 = r5
        L_0x00e7:
            return r1
        L_0x00e8:
            float r9 = (float) r8
            float r4 = (float) r3
            boolean r6 = r7.dispatchNestedPreFling(r9, r4)
            if (r6 != 0) goto L_0x012b
            if (r0 != 0) goto L_0x00f7
            if (r2 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = r1
            goto L_0x00f8
        L_0x00f7:
            r6 = r5
        L_0x00f8:
            r7.dispatchNestedFling(r9, r4, r6)
            androidx.recyclerview.widget.RecyclerView$s r9 = r7.f18011s0
            if (r9 == 0) goto L_0x0106
            boolean r9 = r9.a(r8, r3)
            if (r9 == 0) goto L_0x0106
            return r5
        L_0x0106:
            if (r6 == 0) goto L_0x012b
            if (r2 == 0) goto L_0x010c
            r0 = r0 | 2
        L_0x010c:
            r7.C1(r0, r5)
            int r9 = r7.f18015u0
            int r0 = -r9
            int r8 = java.lang.Math.min(r8, r9)
            int r8 = java.lang.Math.max(r0, r8)
            int r9 = r7.f18015u0
            int r0 = -r9
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.max(r0, r9)
            androidx.recyclerview.widget.RecyclerView$E r0 = r7.f18023y0
            r0.b(r8, r9)
            return r5
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, int):boolean");
    }

    public void g1(o oVar) {
        boolean z10;
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f18004p.remove(oVar);
        if (this.f18004p.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        E0();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f18000n;
        if (pVar != null) {
            return pVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f18000n;
        if (pVar != null) {
            return pVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f17998m;
    }

    public int getBaseline() {
        p pVar = this.f18000n;
        if (pVar != null) {
            return pVar.G();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f17988h;
    }

    public k getCompatAccessibilityDelegate() {
        return this.f17967I0;
    }

    public l getEdgeEffectFactory() {
        return this.f17966I;
    }

    public m getItemAnimator() {
        return this.f17993j0;
    }

    public int getItemDecorationCount() {
        return this.f18004p.size();
    }

    public p getLayoutManager() {
        return this.f18000n;
    }

    public int getMaxFlingVelocity() {
        return this.f18015u0;
    }

    public int getMinFlingVelocity() {
        return this.f18013t0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f17944b1) {
            return System.nanoTime();
        }
        return 0;
    }

    public s getOnFlingListener() {
        return this.f18011s0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f18021x0;
    }

    public v getRecycledViewPool() {
        return this.f17981c.i();
    }

    public int getScrollState() {
        return this.f17995k0;
    }

    /* access modifiers changed from: package-private */
    public int h0(F f10) {
        if (f10.q(524) || !f10.t()) {
            return -1;
        }
        return this.f17983e.e(f10.f18068c);
    }

    public void h1(t tVar) {
        this.f18006q.remove(tVar);
        if (this.f18008r == tVar) {
            this.f18008r = null;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    /* access modifiers changed from: package-private */
    public long i0(F f10) {
        if (this.f17998m.i()) {
            return f10.l();
        }
        return (long) f10.f18068c;
    }

    public void i1(u uVar) {
        List list = this.f17957D0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public boolean isAttachedToWindow() {
        return this.f18010s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f18022y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(o oVar) {
        k(oVar, -1);
    }

    public int j0(View view) {
        F m02 = m0(view);
        if (m02 != null) {
            return m02.j();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        F f10;
        int g10 = this.f17984f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f11 = this.f17984f.f(i10);
            F l02 = l0(f11);
            if (!(l02 == null || (f10 = l02.f18074i) == null)) {
                View view = f10.f18066a;
                int left = f11.getLeft();
                int top = f11.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void k(o oVar, int i10) {
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f18004p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f18004p.add(oVar);
        } else {
            this.f18004p.add(i10, oVar);
        }
        E0();
        requestLayout();
    }

    public int k0(View view) {
        F m02 = m0(view);
        if (m02 != null) {
            return m02.n();
        }
        return -1;
    }

    public void l(r rVar) {
        if (this.f17956D == null) {
            this.f17956D = new ArrayList();
        }
        this.f17956D.add(rVar);
    }

    public F l0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void m(t tVar) {
        this.f18006q.add(tVar);
    }

    public void n(u uVar) {
        if (this.f17957D0 == null) {
            this.f17957D0 = new ArrayList();
        }
        this.f17957D0.add(uVar);
    }

    /* access modifiers changed from: package-private */
    public void o(F f10, m.b bVar, m.b bVar2) {
        f10.H(false);
        if (this.f17993j0.a(f10, bVar, bVar2)) {
            U0();
        }
    }

    /* access modifiers changed from: package-private */
    public void o1() {
        int j10 = this.f17984f.j();
        int i10 = 0;
        while (i10 < j10) {
            F m02 = m0(this.f17984f.i(i10));
            if (!f17937U0 || m02.f18068c != -1 || m02.w()) {
                if (!m02.K()) {
                    m02.F();
                }
                i10++;
            } else {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r1 >= 30.0f) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f17962G = r0
            r1 = 1
            r5.f18010s = r1
            boolean r2 = r5.f18016v
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f18016v = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.f17981c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f18000n
            if (r1 == 0) goto L_0x0023
            r1.z(r5)
        L_0x0023:
            r5.f17965H0 = r0
            boolean r0 = f17944b1
            if (r0 == 0) goto L_0x0066
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f18314e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f18025z0 = r1
            if (r1 != 0) goto L_0x0061
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f18025z0 = r1
            android.view.Display r1 = androidx.core.view.C1680b0.u(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0055:
            androidx.recyclerview.widget.e r2 = r5.f18025z0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f18318c = r3
            r0.set(r2)
        L_0x0061:
            androidx.recyclerview.widget.e r0 = r5.f18025z0
            r0.a(r5)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        m mVar = this.f17993j0;
        if (mVar != null) {
            mVar.k();
        }
        G1();
        this.f18010s = false;
        p pVar = this.f18000n;
        if (pVar != null) {
            pVar.A(this, this.f17981c);
        }
        this.f17973O0.clear();
        removeCallbacks(this.f17974P0);
        this.f17986g.j();
        this.f17981c.A();
        E1.a.c(this);
        if (f17944b1 && (eVar = this.f18025z0) != null) {
            eVar.j(this);
            this.f18025z0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f18004p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f18004p.get(i10)).onDraw(canvas, this, this.f17953B0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        if (this.f18000n != null && !this.f18022y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f18000n.l()) {
                    f11 = -motionEvent.getAxisValue(9);
                } else {
                    f11 = 0.0f;
                }
                if (this.f18000n.k()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (!(f11 == 0.0f && f10 == 0.0f)) {
                        G0((int) (f10 * this.f18017v0), (int) (f11 * this.f18019w0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f18000n.l()) {
                        f11 = -axisValue;
                    } else if (this.f18000n.k()) {
                        f10 = axisValue;
                        f11 = 0.0f;
                        G0((int) (f10 * this.f18017v0), (int) (f11 * this.f18019w0), motionEvent, 1);
                    }
                }
                f11 = 0.0f;
                f10 = 0.0f;
                G0((int) (f10 * this.f18017v0), (int) (f11 * this.f18019w0), motionEvent, 1);
            }
            f10 = 0.0f;
            G0((int) (f10 * this.f18017v0), (int) (f11 * this.f18019w0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f18022y) {
            return false;
        }
        this.f18008r = null;
        if (Z(motionEvent)) {
            t();
            return true;
        }
        p pVar = this.f18000n;
        if (pVar == null) {
            return false;
        }
        boolean k10 = pVar.k();
        boolean l10 = this.f18000n.l();
        if (this.f17999m0 == null) {
            this.f17999m0 = VelocityTracker.obtain();
        }
        this.f17999m0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f18024z) {
                this.f18024z = false;
            }
            this.f17997l0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f18005p0 = x10;
            this.f18001n0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f18007q0 = y10;
            this.f18003o0 = y10;
            if (D1(motionEvent) || this.f17995k0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                F1(1);
            }
            int[] iArr = this.f17971M0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l10) {
                k10 |= true;
            }
            C1(k10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f17999m0.clear();
            F1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f17997l0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f17997l0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f17995k0 != 1) {
                int i10 = x11 - this.f18001n0;
                int i11 = y11 - this.f18003o0;
                if (!k10 || Math.abs(i10) <= this.f18009r0) {
                    z10 = false;
                } else {
                    this.f18005p0 = x11;
                    z10 = true;
                }
                if (l10 && Math.abs(i11) > this.f18009r0) {
                    this.f18007q0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f17997l0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f18005p0 = x12;
            this.f18001n0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f18007q0 = y12;
            this.f18003o0 = y12;
        } else if (actionMasked == 6) {
            R0(motionEvent);
        }
        if (this.f17995k0 == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u1.o.a("RV OnLayout");
        H();
        u1.o.b();
        this.f18016v = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        p pVar = this.f18000n;
        if (pVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.s0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f18000n.Z0(this.f17981c, this.f17953B0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f17975Q0 = z10;
            if (!z10 && this.f17998m != null) {
                if (this.f17953B0.f18045e == 1) {
                    I();
                }
                this.f18000n.A1(i10, i11);
                this.f17953B0.f18050j = true;
                J();
                this.f18000n.D1(i10, i11);
                if (this.f18000n.G1()) {
                    this.f18000n.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f17953B0.f18050j = true;
                    J();
                    this.f18000n.D1(i10, i11);
                }
                this.f17976R0 = getMeasuredWidth();
                this.f17977S0 = getMeasuredHeight();
            }
        } else if (this.f18012t) {
            this.f18000n.Z0(this.f17981c, this.f17953B0, i10, i11);
        } else {
            if (this.f17952B) {
                B1();
                O0();
                W0();
                P0();
                B b10 = this.f17953B0;
                if (b10.f18052l) {
                    b10.f18048h = true;
                } else {
                    this.f17983e.j();
                    this.f17953B0.f18048h = false;
                }
                this.f17952B = false;
                E1(false);
            } else if (this.f17953B0.f18052l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.f17998m;
            if (hVar != null) {
                this.f17953B0.f18046f = hVar.e();
            } else {
                this.f17953B0.f18046f = 0;
            }
            B1();
            this.f18000n.Z0(this.f17981c, this.f17953B0, i10, i11);
            E1(false);
            this.f17953B0.f18048h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (B0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f17982d = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f17982d;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            p pVar = this.f18000n;
            if (pVar != null) {
                zVar.f18153c = pVar.d1();
            } else {
                zVar.f18153c = null;
            }
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            z0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f18022y
            r8 = 0
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r6.f18024z
            if (r0 == 0) goto L_0x000f
            goto L_0x01ef
        L_0x000f:
            boolean r0 = r17.Q(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.t()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f18000n
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.k()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f18000n
            boolean r11 = r0.l()
            android.view.VelocityTracker r0 = r6.f17999m0
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f17999m0 = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f17971M0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f17971M0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01c5
            if (r0 == r9) goto L_0x0184
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01e6
        L_0x0066:
            r17.R0(r18)
            goto L_0x01e6
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f17997l0 = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f18005p0 = r0
            r6.f18001n0 = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f18007q0 = r0
            r6.f18003o0 = r0
            goto L_0x01e6
        L_0x0087:
            r17.t()
            goto L_0x01e6
        L_0x008c:
            int r0 = r6.f17997l0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f17997l0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f18005p0
            int r0 = r0 - r13
            int r1 = r6.f18007q0
            int r1 = r1 - r14
            int r2 = r6.f17995k0
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f18009r0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f18009r0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = r9
            goto L_0x00e0
        L_0x00df:
            r2 = r8
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f18009r0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f18009r0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = r9
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            int r2 = r6.f17995k0
            if (r2 != r9) goto L_0x01e6
            int[] r2 = r6.f17972N0
            r2[r8] = r8
            r2[r9] = r8
            float r2 = r18.getY()
            int r2 = r6.c1(r0, r2)
            int r15 = r0 - r2
            float r0 = r18.getX()
            int r0 = r6.d1(r1, r0)
            int r16 = r1 - r0
            if (r10 == 0) goto L_0x011d
            r1 = r15
            goto L_0x011e
        L_0x011d:
            r1 = r8
        L_0x011e:
            if (r11 == 0) goto L_0x0123
            r2 = r16
            goto L_0x0124
        L_0x0123:
            r2 = r8
        L_0x0124:
            int[] r3 = r6.f17972N0
            int[] r4 = r6.f17970L0
            r5 = 0
            r0 = r17
            boolean r0 = r0.L(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0153
            int[] r0 = r6.f17972N0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f17971M0
            r1 = r0[r8]
            int[] r2 = r6.f17970L0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0153:
            r0 = r16
            int[] r1 = r6.f17970L0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f18005p0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f18007q0 = r14
            if (r10 == 0) goto L_0x0165
            r1 = r15
            goto L_0x0166
        L_0x0165:
            r1 = r8
        L_0x0166:
            if (r11 == 0) goto L_0x016a
            r2 = r0
            goto L_0x016b
        L_0x016a:
            r2 = r8
        L_0x016b:
            boolean r1 = r6.p1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0178
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0178:
            androidx.recyclerview.widget.e r1 = r6.f18025z0
            if (r1 == 0) goto L_0x01e6
            if (r15 != 0) goto L_0x0180
            if (r0 == 0) goto L_0x01e6
        L_0x0180:
            r1.f(r6, r15, r0)
            goto L_0x01e6
        L_0x0184:
            android.view.VelocityTracker r0 = r6.f17999m0
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f17999m0
            int r1 = r6.f18015u0
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a0
            android.view.VelocityTracker r1 = r6.f17999m0
            int r2 = r6.f17997l0
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a1
        L_0x01a0:
            r1 = r0
        L_0x01a1:
            if (r11 == 0) goto L_0x01ad
            android.view.VelocityTracker r2 = r6.f17999m0
            int r3 = r6.f17997l0
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01ae
        L_0x01ad:
            r2 = r0
        L_0x01ae:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01b6
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01be
        L_0x01b6:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.g0(r0, r1)
            if (r0 != 0) goto L_0x01c1
        L_0x01be:
            r6.setScrollState(r8)
        L_0x01c1:
            r17.m1()
            goto L_0x01eb
        L_0x01c5:
            int r0 = r7.getPointerId(r8)
            r6.f17997l0 = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f18005p0 = r0
            r6.f18001n0 = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f18007q0 = r0
            r6.f18003o0 = r0
            if (r11 == 0) goto L_0x01e3
            r10 = r10 | 2
        L_0x01e3:
            r6.C1(r10, r8)
        L_0x01e6:
            android.view.VelocityTracker r0 = r6.f17999m0
            r0.addMovement(r12)
        L_0x01eb:
            r12.recycle()
            return r9
        L_0x01ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean p1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17 = i10;
        int i18 = i11;
        MotionEvent motionEvent2 = motionEvent;
        A();
        if (this.f17998m != null) {
            int[] iArr = this.f17972N0;
            iArr[0] = 0;
            iArr[1] = 0;
            q1(i17, i18, iArr);
            int[] iArr2 = this.f17972N0;
            int i19 = iArr2[0];
            int i20 = iArr2[1];
            i16 = i20;
            i15 = i19;
            i14 = i17 - i19;
            i13 = i18 - i20;
        } else {
            i16 = 0;
            i15 = 0;
            i14 = 0;
            i13 = 0;
        }
        if (!this.f18004p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f17972N0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i15, i16, i14, i13, this.f17970L0, i12, iArr3);
        int[] iArr4 = this.f17972N0;
        int i21 = iArr4[0];
        int i22 = i14 - i21;
        int i23 = iArr4[1];
        int i24 = i13 - i23;
        if (i21 == 0 && i23 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i25 = this.f18005p0;
        int[] iArr5 = this.f17970L0;
        int i26 = iArr5[0];
        this.f18005p0 = i25 - i26;
        int i27 = this.f18007q0;
        int i28 = iArr5[1];
        this.f18007q0 = i27 - i28;
        int[] iArr6 = this.f17971M0;
        iArr6[0] = iArr6[0] + i26;
        iArr6[1] = iArr6[1] + i28;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !androidx.core.view.C.a(motionEvent2, 8194)) {
                Y0(motionEvent.getX(), (float) i22, motionEvent.getY(), (float) i24);
            }
            w(i10, i11);
        }
        if (!(i15 == 0 && i16 == 0)) {
            O(i15, i16);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z10 && i15 == 0 && i16 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(F f10, m.b bVar, m.b bVar2) {
        i(f10);
        f10.H(false);
        if (this.f17993j0.c(f10, bVar, bVar2)) {
            U0();
        }
    }

    /* access modifiers changed from: package-private */
    public Rect q0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f18135c) {
            return qVar.f18134b;
        }
        if (this.f17953B0.e() && (qVar.b() || qVar.d())) {
            return qVar.f18134b;
        }
        Rect rect = qVar.f18134b;
        rect.set(0, 0, 0, 0);
        int size = this.f18004p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17992j.set(0, 0, 0, 0);
            ((o) this.f18004p.get(i10)).getItemOffsets(this.f17992j, view, this, this.f17953B0);
            int i11 = rect.left;
            Rect rect2 = this.f17992j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f18135c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public void q1(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        B1();
        O0();
        u1.o.a("RV Scroll");
        W(this.f17953B0);
        if (i10 != 0) {
            i12 = this.f18000n.w1(i10, this.f17981c, this.f17953B0);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f18000n.y1(i11, this.f17981c, this.f17953B0);
        } else {
            i13 = 0;
        }
        u1.o.b();
        j1();
        P0();
        E1(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    /* access modifiers changed from: package-private */
    public void r(String str) {
        if (B0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
            }
            throw new IllegalStateException(str);
        } else if (this.f17964H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    public void r1(int i10) {
        if (!this.f18022y) {
            G1();
            p pVar = this.f18000n;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            pVar.x1(i10);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z10) {
        F m02 = m0(view);
        if (m02 != null) {
            if (m02.y()) {
                m02.f();
            } else if (!m02.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m02 + V());
            }
        } else if (f17937U0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f18000n.b1(this, this.f17953B0, view, view2) && view2 != null) {
            k1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f18000n.r1(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f18006q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f18006q.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.f18018w != 0 || this.f18022y) {
            this.f18020x = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s(F f10) {
        m mVar = this.f17993j0;
        if (mVar == null || mVar.g(f10, f10.p())) {
            return true;
        }
        return false;
    }

    public void scrollBy(int i10, int i11) {
        p pVar = this.f18000n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f18022y) {
            boolean k10 = pVar.k();
            boolean l10 = this.f18000n.l();
            if (k10 || l10) {
                if (!k10) {
                    i10 = 0;
                }
                if (!l10) {
                    i11 = 0;
                }
                p1(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!v1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(k kVar) {
        this.f17967I0 = kVar;
        C1680b0.o0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        s1(hVar, false, true);
        X0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f17988h) {
            z0();
        }
        this.f17988h = z10;
        super.setClipToPadding(z10);
        if (this.f18016v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        x1.g.f(lVar);
        this.f17966I = lVar;
        z0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f18012t = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f17993j0;
        if (mVar2 != null) {
            mVar2.k();
            this.f17993j0.v((m.a) null);
        }
        this.f17993j0 = mVar;
        if (mVar != null) {
            mVar.v(this.f17963G0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f17981c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar != this.f18000n) {
            G1();
            if (this.f18000n != null) {
                m mVar = this.f17993j0;
                if (mVar != null) {
                    mVar.k();
                }
                this.f18000n.k1(this.f17981c);
                this.f18000n.l1(this.f17981c);
                this.f17981c.c();
                if (this.f18010s) {
                    this.f18000n.A(this, this.f17981c);
                }
                this.f18000n.E1((RecyclerView) null);
                this.f18000n = null;
            } else {
                this.f17981c.c();
            }
            this.f17984f.o();
            this.f18000n = pVar;
            if (pVar != null) {
                if (pVar.f18110b == null) {
                    pVar.E1(this);
                    if (this.f18010s) {
                        this.f18000n.z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f18110b.V());
                }
            }
            this.f17981c.P();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.f18011s0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f17955C0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f18021x0 = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.f17981c.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        if (i10 != this.f17995k0) {
            if (f17938V0) {
                Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.f17995k0, new Exception());
            }
            this.f17995k0 = i10;
            if (i10 != 2) {
                H1();
            }
            N(i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f18009r0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f18009r0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d10) {
        this.f17981c.K(d10);
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.f18022y) {
            r("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f18022y = false;
                if (!(!this.f18020x || this.f18000n == null || this.f17998m == null)) {
                    requestLayout();
                }
                this.f18020x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f18022y = true;
            this.f18024z = true;
            G1();
        }
    }

    public boolean t0() {
        if (!this.f18016v || this.f17958E || this.f17983e.p()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t1(F f10, int i10) {
        if (B0()) {
            f10.f18082q = i10;
            this.f17973O0.add(f10);
            return false;
        }
        C1680b0.y0(f10.f18066a, i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        int j10 = this.f17984f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F m02 = m0(this.f17984f.i(i10));
            if (!m02.K()) {
                m02.c();
            }
        }
        this.f17981c.d();
    }

    /* access modifiers changed from: package-private */
    public void v0() {
        this.f17983e = new a(new C1833f());
    }

    /* access modifiers changed from: package-private */
    public boolean v1(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (!B0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i10 = C2932b.a(accessibilityEvent);
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = i10;
        }
        this.f17950A |= i11;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void w(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f17985f0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f17985f0.onRelease();
            z10 = this.f17985f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f17989h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f17989h0.onRelease();
            z10 |= this.f17989h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17987g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f17987g0.onRelease();
            z10 |= this.f17987g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17991i0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f17991i0.onRelease();
            z10 |= this.f17991i0.isFinished();
        }
        if (z10) {
            C1680b0.f0(this);
        }
    }

    public void w1(int i10, int i11) {
        x1(i10, i11, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public int x(int i10) {
        return y(i10, this.f17985f0, this.f17989h0, getWidth());
    }

    public void x1(int i10, int i11, Interpolator interpolator) {
        y1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public void y0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C2662b.f26357a), resources.getDimensionPixelSize(C2662b.f26359c), resources.getDimensionPixelOffset(C2662b.f26358b));
    }

    public void y1(int i10, int i11, Interpolator interpolator, int i12) {
        z1(i10, i11, interpolator, i12, false);
    }

    /* access modifiers changed from: package-private */
    public int z(int i10) {
        return y(i10, this.f17987g0, this.f17991i0, getHeight());
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        this.f17991i0 = null;
        this.f17987g0 = null;
        this.f17989h0 = null;
        this.f17985f0 = null;
    }

    /* access modifiers changed from: package-private */
    public void z1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f18000n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f18022y) {
            int i13 = 0;
            if (!pVar.k()) {
                i10 = 0;
            }
            if (!this.f18000n.l()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i12 == Integer.MIN_VALUE || i12 > 0) {
                    if (z10) {
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        if (i11 != 0) {
                            i13 |= 2;
                        }
                        C1(i13, 1);
                    }
                    this.f18023y0.e(i10, i11, i12, interpolator);
                    return;
                }
                scrollBy(i10, i11);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2661a.f26356a);
    }

    public static class z extends F1.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f18153c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            /* renamed from: c */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18153c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void b(z zVar) {
            this.f18153c = zVar.f18153c;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f18153c, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.f17980b = new y();
        this.f17981c = new w();
        this.f17986g = new p();
        this.f17990i = new C1828a();
        this.f17992j = new Rect();
        this.f17994k = new Rect();
        this.f17996l = new RectF();
        this.f18002o = new ArrayList();
        this.f18004p = new ArrayList();
        this.f18006q = new ArrayList();
        this.f18018w = 0;
        this.f17958E = false;
        this.f17960F = false;
        this.f17962G = 0;
        this.f17964H = 0;
        this.f17966I = f17949g1;
        this.f17993j0 = new c();
        this.f17995k0 = 0;
        this.f17997l0 = -1;
        this.f18017v0 = Float.MIN_VALUE;
        this.f18019w0 = Float.MIN_VALUE;
        this.f18021x0 = true;
        this.f18023y0 = new E();
        this.f17951A0 = f17944b1 ? new e.b() : null;
        this.f17953B0 = new B();
        this.f17959E0 = false;
        this.f17961F0 = false;
        this.f17963G0 = new n();
        this.f17965H0 = false;
        this.f17968J0 = new int[2];
        this.f17970L0 = new int[2];
        this.f17971M0 = new int[2];
        this.f17972N0 = new int[2];
        this.f17973O0 = new ArrayList();
        this.f17974P0 = new C1829b();
        this.f17976R0 = 0;
        this.f17977S0 = 0;
        this.f17978T0 = new C1831d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f18009r0 = viewConfiguration.getScaledTouchSlop();
        this.f18017v0 = C1686e0.f(viewConfiguration, context2);
        this.f18019w0 = C1686e0.j(viewConfiguration, context2);
        this.f18013t0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f18015u0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17979a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f17993j0.v(this.f17963G0);
        v0();
        x0();
        w0();
        if (C1680b0.y(this) == 0) {
            C1680b0.y0(this, 1);
        }
        this.f17954C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k(this));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C2663c.f26360a, i11, 0);
        C1680b0.m0(this, context, C2663c.f26360a, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(C2663c.f26369j);
        if (obtainStyledAttributes.getInt(C2663c.f26363d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f17988h = obtainStyledAttributes.getBoolean(C2663c.f26362c, true);
        boolean z10 = obtainStyledAttributes.getBoolean(C2663c.f26364e, false);
        this.f18014u = z10;
        if (z10) {
            y0((StateListDrawable) obtainStyledAttributes.getDrawable(C2663c.f26367h), obtainStyledAttributes.getDrawable(C2663c.f26368i), (StateListDrawable) obtainStyledAttributes.getDrawable(C2663c.f26365f), obtainStyledAttributes.getDrawable(C2663c.f26366g));
        }
        obtainStyledAttributes.recycle();
        B(context, string, attributeSet, i10, 0);
        int[] iArr = f17939W0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        C1680b0.m0(this, context, iArr, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        E1.a.h(this, true);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        F f18133a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f18134b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f18135c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f18136d = false;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.f18133a.n();
        }

        public boolean b() {
            return this.f18133a.z();
        }

        public boolean c() {
            return this.f18133a.w();
        }

        public boolean d() {
            return this.f18133a.u();
        }

        public q(int i10, int i11) {
            super(i10, i11);
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public q(q qVar) {
            super(qVar);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f18000n;
        if (pVar != null) {
            return pVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    public static abstract class p {

        /* renamed from: a  reason: collision with root package name */
        b f18109a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f18110b;

        /* renamed from: c  reason: collision with root package name */
        private final o.b f18111c;

        /* renamed from: d  reason: collision with root package name */
        private final o.b f18112d;

        /* renamed from: e  reason: collision with root package name */
        o f18113e;

        /* renamed from: f  reason: collision with root package name */
        o f18114f;

        /* renamed from: g  reason: collision with root package name */
        A f18115g;

        /* renamed from: h  reason: collision with root package name */
        boolean f18116h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f18117i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f18118j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f18119k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f18120l = true;

        /* renamed from: m  reason: collision with root package name */
        int f18121m;

        /* renamed from: n  reason: collision with root package name */
        boolean f18122n;

        /* renamed from: o  reason: collision with root package name */
        private int f18123o;

        /* renamed from: p  reason: collision with root package name */
        private int f18124p;

        /* renamed from: q  reason: collision with root package name */
        private int f18125q;

        /* renamed from: r  reason: collision with root package name */
        private int f18126r;

        class a implements o.b {
            a() {
            }

            public int a(View view) {
                return p.this.Q(view) - ((q) view.getLayoutParams()).leftMargin;
            }

            public int b() {
                return p.this.e0();
            }

            public int c() {
                return p.this.o0() - p.this.f0();
            }

            public int d(View view) {
                return p.this.T(view) + ((q) view.getLayoutParams()).rightMargin;
            }

            public View getChildAt(int i10) {
                return p.this.I(i10);
            }
        }

        class b implements o.b {
            b() {
            }

            public int a(View view) {
                return p.this.U(view) - ((q) view.getLayoutParams()).topMargin;
            }

            public int b() {
                return p.this.g0();
            }

            public int c() {
                return p.this.W() - p.this.d0();
            }

            public int d(View view) {
                return p.this.O(view) + ((q) view.getLayoutParams()).bottomMargin;
            }

            public View getChildAt(int i10) {
                return p.this.I(i10);
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f18129a;

            /* renamed from: b  reason: collision with root package name */
            public int f18130b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f18131c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f18132d;
        }

        public p() {
            a aVar = new a();
            this.f18111c = aVar;
            b bVar = new b();
            this.f18112d = bVar;
            this.f18113e = new o(aVar);
            this.f18114f = new o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r5 == 1073741824) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001d
                if (r7 < 0) goto L_0x0012
            L_0x0010:
                r5 = r3
                goto L_0x0030
            L_0x0012:
                if (r7 != r1) goto L_0x001a
                if (r5 == r2) goto L_0x0022
                if (r5 == 0) goto L_0x001a
                if (r5 == r3) goto L_0x0022
            L_0x001a:
                r5 = r6
                r7 = r5
                goto L_0x0030
            L_0x001d:
                if (r7 < 0) goto L_0x0020
                goto L_0x0010
            L_0x0020:
                if (r7 != r1) goto L_0x0024
            L_0x0022:
                r7 = r4
                goto L_0x0030
            L_0x0024:
                if (r7 != r0) goto L_0x001a
                if (r5 == r2) goto L_0x002e
                if (r5 != r3) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r7 = r4
                r5 = r6
                goto L_0x0030
            L_0x002e:
                r7 = r4
                r5 = r2
            L_0x0030:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.K(int, int, int, int, boolean):int");
        }

        private int[] L(View view, Rect rect) {
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W10 = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - e02;
            int min = Math.min(0, i10);
            int i11 = top - g02;
            int min2 = Math.min(0, i11);
            int i12 = width - o02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - W10);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            return new int[]{max, min2};
        }

        private void f(View view, int i10, boolean z10) {
            F m02 = RecyclerView.m0(view);
            if (z10 || m02.w()) {
                this.f18110b.f17986g.b(m02);
            } else {
                this.f18110b.f17986g.p(m02);
            }
            q qVar = (q) view.getLayoutParams();
            if (m02.M() || m02.x()) {
                if (m02.x()) {
                    m02.L();
                } else {
                    m02.e();
                }
                this.f18109a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f18110b) {
                int m10 = this.f18109a.m(view);
                if (i10 == -1) {
                    i10 = this.f18109a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f18110b.indexOfChild(view) + this.f18110b.V());
                } else if (m10 != i10) {
                    this.f18110b.f18000n.B0(m10, i10);
                }
            } else {
                this.f18109a.a(view, i10, false);
                qVar.f18135c = true;
                A a10 = this.f18115g;
                if (a10 != null && a10.h()) {
                    this.f18115g.k(view);
                }
            }
            if (qVar.f18136d) {
                if (RecyclerView.f17938V0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + qVar.f18133a);
                }
                m02.f18066a.invalidate();
                qVar.f18136d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2663c.f26360a, i10, i11);
            dVar.f18129a = obtainStyledAttributes.getInt(C2663c.f26361b, 1);
            dVar.f18130b = obtainStyledAttributes.getInt(C2663c.f26371l, 1);
            dVar.f18131c = obtainStyledAttributes.getBoolean(C2663c.f26370k, false);
            dVar.f18132d = obtainStyledAttributes.getBoolean(C2663c.f26372m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i11, i12));
            }
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }

        private boolean t0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W10 = W() - d0();
            Rect rect = this.f18110b.f17992j;
            P(focusedChild, rect);
            if (rect.left - i10 >= o02 || rect.right - i10 <= e02 || rect.top - i11 >= W10 || rect.bottom - i11 <= g02) {
                return false;
            }
            return true;
        }

        private void v1(w wVar, int i10, View view) {
            F m02 = RecyclerView.m0(view);
            if (m02.K()) {
                if (RecyclerView.f17938V0) {
                    Log.d("RecyclerView", "ignoring view " + m02);
                }
            } else if (!m02.u() || m02.w() || this.f18110b.f17998m.i()) {
                x(i10);
                wVar.I(view);
                this.f18110b.f17986g.k(m02);
            } else {
                q1(i10);
                wVar.H(m02);
            }
        }

        private static boolean w0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i10) {
                    return true;
                }
                return false;
            } else if (size >= i10) {
                return true;
            } else {
                return false;
            }
        }

        private void y(int i10, View view) {
            this.f18109a.d(i10);
        }

        /* access modifiers changed from: package-private */
        public void A(RecyclerView recyclerView, w wVar) {
            this.f18117i = false;
            I0(recyclerView, wVar);
        }

        public void A0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect q02 = this.f18110b.q0(view);
            int i12 = i10 + q02.left + q02.right;
            int i13 = i11 + q02.top + q02.bottom;
            int K10 = K(o0(), p0(), e0() + f0() + qVar.leftMargin + qVar.rightMargin + i12, qVar.width, k());
            int K11 = K(W(), X(), g0() + d0() + qVar.topMargin + qVar.bottomMargin + i13, qVar.height, l());
            if (F1(view, K10, K11, qVar)) {
                view.measure(K10, K11);
            }
        }

        /* access modifiers changed from: package-private */
        public void A1(int i10, int i11) {
            this.f18125q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f18123o = mode;
            if (mode == 0 && !RecyclerView.f17942Z0) {
                this.f18125q = 0;
            }
            this.f18126r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f18124p = mode2;
            if (mode2 == 0 && !RecyclerView.f17942Z0) {
                this.f18126r = 0;
            }
        }

        public View B(View view) {
            View X10;
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView == null || (X10 = recyclerView.X(view)) == null || this.f18109a.n(X10)) {
                return null;
            }
            return X10;
        }

        public void B0(int i10, int i11) {
            View I10 = I(i10);
            if (I10 != null) {
                x(i10);
                h(I10, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f18110b.toString());
        }

        public void B1(int i10, int i11) {
            this.f18110b.setMeasuredDimension(i10, i11);
        }

        public View C(int i10) {
            int J10 = J();
            for (int i11 = 0; i11 < J10; i11++) {
                View I10 = I(i11);
                F m02 = RecyclerView.m0(I10);
                if (m02 != null && m02.n() == i10 && !m02.K() && (this.f18110b.f17953B0.e() || !m02.w())) {
                    return I10;
                }
            }
            return null;
        }

        public void C0(int i10) {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                recyclerView.H0(i10);
            }
        }

        public void C1(Rect rect, int i10, int i11) {
            B1(n(i10, rect.width() + e0() + f0(), c0()), n(i11, rect.height() + g0() + d0(), b0()));
        }

        public abstract q D();

        public void D0(int i10) {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                recyclerView.I0(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void D1(int i10, int i11) {
            int J10 = J();
            if (J10 == 0) {
                this.f18110b.C(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < J10; i16++) {
                View I10 = I(i16);
                Rect rect = this.f18110b.f17992j;
                P(I10, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f18110b.f17992j.set(i15, i13, i12, i14);
            C1(this.f18110b.f17992j, i10, i11);
        }

        public q E(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void E0(h hVar, h hVar2) {
        }

        /* access modifiers changed from: package-private */
        public void E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f18110b = null;
                this.f18109a = null;
                this.f18125q = 0;
                this.f18126r = 0;
            } else {
                this.f18110b = recyclerView;
                this.f18109a = recyclerView.f17984f;
                this.f18125q = recyclerView.getWidth();
                this.f18126r = recyclerView.getHeight();
            }
            this.f18123o = 1073741824;
            this.f18124p = 1073741824;
        }

        public q F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean F1(View view, int i10, int i11, q qVar) {
            if (view.isLayoutRequested() || !this.f18119k || !w0(view.getWidth(), i10, qVar.width) || !w0(view.getHeight(), i11, qVar.height)) {
                return true;
            }
            return false;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((q) view.getLayoutParams()).f18134b.bottom;
        }

        public void H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean H1(View view, int i10, int i11, q qVar) {
            if (!this.f18119k || !w0(view.getMeasuredWidth(), i10, qVar.width) || !w0(view.getMeasuredHeight(), i11, qVar.height)) {
                return true;
            }
            return false;
        }

        public View I(int i10) {
            b bVar = this.f18109a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, w wVar) {
            H0(recyclerView);
        }

        public abstract void I1(RecyclerView recyclerView, B b10, int i10);

        public int J() {
            b bVar = this.f18109a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View J0(View view, int i10, w wVar, B b10);

        public void J1(A a10) {
            A a11 = this.f18115g;
            if (!(a11 == null || a10 == a11 || !a11.h())) {
                this.f18115g.r();
            }
            this.f18115g = a10;
            a10.q(this.f18110b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f18110b;
            L0(recyclerView.f17981c, recyclerView.f17953B0, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        public void K1() {
            A a10 = this.f18115g;
            if (a10 != null) {
                a10.r();
            }
        }

        public void L0(w wVar, B b10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f18110b.canScrollVertically(-1) && !this.f18110b.canScrollHorizontally(-1) && !this.f18110b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                h hVar = this.f18110b.f17998m;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.e());
                }
            }
        }

        public abstract boolean L1();

        public boolean M() {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView == null || !recyclerView.f17988h) {
                return false;
            }
            return true;
        }

        public void M0(w wVar, B b10, C2930A a10) {
            if (this.f18110b.canScrollVertically(-1) || this.f18110b.canScrollHorizontally(-1)) {
                a10.a(8192);
                a10.V0(true);
            }
            if (this.f18110b.canScrollVertically(1) || this.f18110b.canScrollHorizontally(1)) {
                a10.a(4096);
                a10.V0(true);
            }
            a10.v0(C2930A.e.b(k0(wVar, b10), N(wVar, b10), v0(wVar, b10), l0(wVar, b10)));
        }

        public int N(w wVar, B b10) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        public void N0(C2930A a10) {
            RecyclerView recyclerView = this.f18110b;
            M0(recyclerView.f17981c, recyclerView.f17953B0, a10);
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        /* access modifiers changed from: package-private */
        public void O0(View view, C2930A a10) {
            F m02 = RecyclerView.m0(view);
            if (m02 != null && !m02.w() && !this.f18109a.n(m02.f18066a)) {
                RecyclerView recyclerView = this.f18110b;
                P0(recyclerView.f17981c, recyclerView.f17953B0, view, a10);
            }
        }

        public void P(View view, Rect rect) {
            RecyclerView.n0(view, rect);
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i10) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((q) view.getLayoutParams()).f18134b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).f18134b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f18109a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int W() {
            return this.f18126r;
        }

        public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            V0(recyclerView, i10, i11);
        }

        public int X() {
            return this.f18124p;
        }

        public abstract void X0(w wVar, B b10);

        public int Y() {
            h hVar;
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                hVar = recyclerView.getAdapter();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                return hVar.e();
            }
            return 0;
        }

        public void Y0(B b10) {
        }

        public int Z() {
            return C1680b0.A(this.f18110b);
        }

        public void Z0(w wVar, B b10, int i10, int i11) {
            this.f18110b.C(i10, i11);
        }

        public int a0(View view) {
            return ((q) view.getLayoutParams()).f18134b.left;
        }

        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            if (x0() || recyclerView.B0()) {
                return true;
            }
            return false;
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return C1680b0.B(this.f18110b);
        }

        public boolean b1(RecyclerView recyclerView, B b10, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i10) {
            f(view, i10, true);
        }

        public int c0() {
            return C1680b0.C(this.f18110b);
        }

        public abstract void c1(Parcelable parcelable);

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable d1();

        public void e(View view, int i10) {
            f(view, i10, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i10) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void f1(A a10) {
            if (this.f18115g == a10) {
                this.f18115g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean g1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f18110b;
            return h1(recyclerView.f17981c, recyclerView.f17953B0, i10, bundle);
        }

        public void h(View view, int i10) {
            i(view, i10, (q) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean h1(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, int r11, android.os.Bundle r12) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r9 = r8.f18110b
                r10 = 0
                if (r9 != 0) goto L_0x0006
                return r10
            L_0x0006:
                int r9 = r8.W()
                int r12 = r8.o0()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView r1 = r8.f18110b
                android.graphics.Matrix r1 = r1.getMatrix()
                boolean r1 = r1.isIdentity()
                if (r1 == 0) goto L_0x002f
                androidx.recyclerview.widget.RecyclerView r1 = r8.f18110b
                boolean r1 = r1.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L_0x002f
                int r9 = r0.height()
                int r12 = r0.width()
            L_0x002f:
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                if (r11 == r0) goto L_0x006a
                r0 = 8192(0x2000, float:1.14794E-41)
                if (r11 == r0) goto L_0x003b
                r3 = r10
                r4 = r3
                goto L_0x0092
            L_0x003b:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f18110b
                r0 = -1
                boolean r11 = r11.canScrollVertically(r0)
                if (r11 == 0) goto L_0x0050
                int r11 = r8.g0()
                int r9 = r9 - r11
                int r11 = r8.d0()
                int r9 = r9 - r11
                int r9 = -r9
                goto L_0x0051
            L_0x0050:
                r9 = r10
            L_0x0051:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f18110b
                boolean r11 = r11.canScrollHorizontally(r0)
                if (r11 == 0) goto L_0x0067
                int r11 = r8.e0()
                int r12 = r12 - r11
                int r11 = r8.f0()
                int r12 = r12 - r11
                int r11 = -r12
            L_0x0064:
                r4 = r9
                r3 = r11
                goto L_0x0092
            L_0x0067:
                r4 = r9
                r3 = r10
                goto L_0x0092
            L_0x006a:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f18110b
                boolean r11 = r11.canScrollVertically(r1)
                if (r11 == 0) goto L_0x007d
                int r11 = r8.g0()
                int r9 = r9 - r11
                int r11 = r8.d0()
                int r9 = r9 - r11
                goto L_0x007e
            L_0x007d:
                r9 = r10
            L_0x007e:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f18110b
                boolean r11 = r11.canScrollHorizontally(r1)
                if (r11 == 0) goto L_0x0067
                int r11 = r8.e0()
                int r12 = r12 - r11
                int r11 = r8.f0()
                int r11 = r12 - r11
                goto L_0x0064
            L_0x0092:
                if (r4 != 0) goto L_0x0097
                if (r3 != 0) goto L_0x0097
                return r10
            L_0x0097:
                androidx.recyclerview.widget.RecyclerView r2 = r8.f18110b
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = 1
                r5 = 0
                r2.z1(r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.h1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, int, android.os.Bundle):boolean");
        }

        public void i(View view, int i10, q qVar) {
            F m02 = RecyclerView.m0(view);
            if (m02.w()) {
                this.f18110b.f17986g.b(m02);
            } else {
                this.f18110b.f17986g.p(m02);
            }
            this.f18109a.c(view, i10, qVar, m02.w());
        }

        /* access modifiers changed from: package-private */
        public boolean i1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f18110b;
            return j1(recyclerView.f17981c, recyclerView.f17953B0, view, i10, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.q0(view));
            }
        }

        public int j0(View view) {
            return ((q) view.getLayoutParams()).f18134b.right;
        }

        public boolean j1(w wVar, B b10, View view, int i10, Bundle bundle) {
            return false;
        }

        public abstract boolean k();

        public int k0(w wVar, B b10) {
            return -1;
        }

        public void k1(w wVar) {
            for (int J10 = J() - 1; J10 >= 0; J10--) {
                if (!RecyclerView.m0(I(J10)).K()) {
                    n1(J10, wVar);
                }
            }
        }

        public abstract boolean l();

        public int l0(w wVar, B b10) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void l1(w wVar) {
            int j10 = wVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = wVar.n(i10);
                F m02 = RecyclerView.m0(n10);
                if (!m02.K()) {
                    m02.H(false);
                    if (m02.y()) {
                        this.f18110b.removeDetachedView(n10, false);
                    }
                    m mVar = this.f18110b.f17993j0;
                    if (mVar != null) {
                        mVar.j(m02);
                    }
                    m02.H(true);
                    wVar.D(n10);
                }
            }
            wVar.e();
            if (j10 > 0) {
                this.f18110b.invalidate();
            }
        }

        public boolean m(q qVar) {
            return qVar != null;
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).f18134b.top;
        }

        public void m1(View view, w wVar) {
            p1(view);
            wVar.G(view);
        }

        public void n0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f18134b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f18110b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f18110b.f17996l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i10, w wVar) {
            View I10 = I(i10);
            q1(i10);
            wVar.G(I10);
        }

        public abstract void o(int i10, int i11, B b10, c cVar);

        public int o0() {
            return this.f18125q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i10, c cVar) {
        }

        public int p0() {
            return this.f18123o;
        }

        public void p1(View view) {
            this.f18109a.p(view);
        }

        public abstract int q(B b10);

        /* access modifiers changed from: package-private */
        public boolean q0() {
            int J10 = J();
            for (int i10 = 0; i10 < J10; i10++) {
                ViewGroup.LayoutParams layoutParams = I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i10) {
            if (I(i10) != null) {
                this.f18109a.q(i10);
            }
        }

        public abstract int r(B b10);

        public boolean r0() {
            return this.f18117i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return s1(recyclerView, view, rect, z10, false);
        }

        public abstract int s(B b10);

        public abstract boolean s0();

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] L10 = L(view, rect);
            int i10 = L10[0];
            int i11 = L10[1];
            if ((z11 && !t0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.w1(i10, i11);
            }
            return true;
        }

        public abstract int t(B b10);

        public void t1() {
            RecyclerView recyclerView = this.f18110b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int u(B b10);

        public final boolean u0() {
            return this.f18120l;
        }

        public void u1() {
            this.f18116h = true;
        }

        public abstract int v(B b10);

        public boolean v0(w wVar, B b10) {
            return false;
        }

        public void w(w wVar) {
            for (int J10 = J() - 1; J10 >= 0; J10--) {
                v1(wVar, J10, I(J10));
            }
        }

        public abstract int w1(int i10, w wVar, B b10);

        public void x(int i10) {
            y(i10, I(i10));
        }

        public boolean x0() {
            A a10 = this.f18115g;
            if (a10 == null || !a10.h()) {
                return false;
            }
            return true;
        }

        public abstract void x1(int i10);

        public boolean y0(View view, boolean z10, boolean z11) {
            boolean z12;
            if (!this.f18113e.b(view, 24579) || !this.f18114f.b(view, 24579)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z10) {
                return z12;
            }
            return !z12;
        }

        public abstract int y1(int i10, w wVar, B b10);

        /* access modifiers changed from: package-private */
        public void z(RecyclerView recyclerView) {
            this.f18117i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f18134b;
            view.layout(i10 + rect.left + qVar.leftMargin, i11 + rect.top + qVar.topMargin, (i12 - rect.right) - qVar.rightMargin, (i13 - rect.bottom) - qVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void P0(w wVar, B b10, View view, C2930A a10) {
        }
    }
}
