package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.C1680b0;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;

public abstract class c extends ViewGroup implements G, F, D {

    /* renamed from: l0  reason: collision with root package name */
    private static final String f18427l0 = "c";

    /* renamed from: m0  reason: collision with root package name */
    private static final int[] f18428m0 = {16842766};

    /* renamed from: A  reason: collision with root package name */
    int f18429A;

    /* renamed from: B  reason: collision with root package name */
    int f18430B;

    /* renamed from: C  reason: collision with root package name */
    b f18431C;

    /* renamed from: D  reason: collision with root package name */
    private Animation f18432D;

    /* renamed from: E  reason: collision with root package name */
    private Animation f18433E;

    /* renamed from: F  reason: collision with root package name */
    private Animation f18434F;

    /* renamed from: G  reason: collision with root package name */
    private Animation f18435G;

    /* renamed from: H  reason: collision with root package name */
    private Animation f18436H;

    /* renamed from: I  reason: collision with root package name */
    boolean f18437I;

    /* renamed from: a  reason: collision with root package name */
    private View f18438a;

    /* renamed from: b  reason: collision with root package name */
    j f18439b;

    /* renamed from: c  reason: collision with root package name */
    boolean f18440c;

    /* renamed from: d  reason: collision with root package name */
    private int f18441d;

    /* renamed from: e  reason: collision with root package name */
    private float f18442e;

    /* renamed from: f  reason: collision with root package name */
    private float f18443f;

    /* renamed from: f0  reason: collision with root package name */
    private int f18444f0;

    /* renamed from: g  reason: collision with root package name */
    private final H f18445g;

    /* renamed from: g0  reason: collision with root package name */
    boolean f18446g0;

    /* renamed from: h  reason: collision with root package name */
    private final E f18447h;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f18448h0;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f18449i;

    /* renamed from: i0  reason: collision with root package name */
    private Animation.AnimationListener f18450i0;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f18451j;

    /* renamed from: j0  reason: collision with root package name */
    private final Animation f18452j0;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f18453k;

    /* renamed from: k0  reason: collision with root package name */
    private final Animation f18454k0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f18455l;

    /* renamed from: m  reason: collision with root package name */
    private int f18456m;

    /* renamed from: n  reason: collision with root package name */
    int f18457n;

    /* renamed from: o  reason: collision with root package name */
    private float f18458o;

    /* renamed from: p  reason: collision with root package name */
    private float f18459p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18460q;

    /* renamed from: r  reason: collision with root package name */
    private int f18461r;

    /* renamed from: s  reason: collision with root package name */
    boolean f18462s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f18463t;

    /* renamed from: u  reason: collision with root package name */
    private final DecelerateInterpolator f18464u;

    /* renamed from: v  reason: collision with root package name */
    a f18465v;

    /* renamed from: w  reason: collision with root package name */
    private int f18466w;

    /* renamed from: x  reason: collision with root package name */
    protected int f18467x;

    /* renamed from: y  reason: collision with root package name */
    float f18468y;

    /* renamed from: z  reason: collision with root package name */
    protected int f18469z;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (cVar.f18440c) {
                cVar.f18431C.setAlpha(255);
                c.this.f18431C.start();
                c cVar2 = c.this;
                if (cVar2.f18437I && (jVar = cVar2.f18439b) != null) {
                    jVar.a();
                }
                c cVar3 = c.this;
                cVar3.f18457n = cVar3.f18465v.getTop();
                return;
            }
            cVar.r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(f10);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$c  reason: collision with other inner class name */
    class C0318c extends Animation {
        C0318c() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f18473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f18474b;

        d(int i10, int i11) {
            this.f18473a = i10;
            this.f18474b = i11;
        }

        public void applyTransformation(float f10, Transformation transformation) {
            b bVar = c.this.f18431C;
            int i10 = this.f18473a;
            bVar.setAlpha((int) (((float) i10) + (((float) (this.f18474b - i10)) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (!cVar.f18462s) {
                cVar.y((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            c cVar = c.this;
            if (!cVar.f18446g0) {
                i10 = cVar.f18429A - Math.abs(cVar.f18469z);
            } else {
                i10 = cVar.f18429A;
            }
            c cVar2 = c.this;
            int i11 = cVar2.f18467x;
            c.this.setTargetOffsetTopAndBottom((i11 + ((int) (((float) (i10 - i11)) * f10))) - cVar2.f18465v.getTop());
            c.this.f18431C.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c.this.p(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            float f11 = cVar.f18468y;
            cVar.setAnimationProgress(f11 + ((-f11) * f10));
            c.this.p(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public c(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f18465v.setVisibility(0);
        this.f18431C.setAlpha(255);
        b bVar = new b();
        this.f18432D = bVar;
        bVar.setDuration((long) this.f18456m);
        if (animationListener != null) {
            this.f18465v.b(animationListener);
        }
        this.f18465v.clearAnimation();
        this.f18465v.startAnimation(this.f18432D);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f18467x = i10;
        this.f18452j0.reset();
        this.f18452j0.setDuration(200);
        this.f18452j0.setInterpolator(this.f18464u);
        if (animationListener != null) {
            this.f18465v.b(animationListener);
        }
        this.f18465v.clearAnimation();
        this.f18465v.startAnimation(this.f18452j0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f18462s) {
            z(i10, animationListener);
            return;
        }
        this.f18467x = i10;
        this.f18454k0.reset();
        this.f18454k0.setDuration(200);
        this.f18454k0.setInterpolator(this.f18464u);
        if (animationListener != null) {
            this.f18465v.b(animationListener);
        }
        this.f18465v.clearAnimation();
        this.f18465v.startAnimation(this.f18454k0);
    }

    private void d() {
        this.f18465v = new a(getContext());
        b bVar = new b(getContext());
        this.f18431C = bVar;
        bVar.l(1);
        this.f18465v.setImageDrawable(this.f18431C);
        this.f18465v.setVisibility(8);
        addView(this.f18465v);
    }

    private void f() {
        if (this.f18438a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f18465v)) {
                    this.f18438a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        e eVar;
        if (f10 > this.f18442e) {
            t(true, true);
            return;
        }
        this.f18440c = false;
        this.f18431C.j(0.0f, 0.0f);
        if (!this.f18462s) {
            eVar = new e();
        } else {
            eVar = null;
        }
        b(this.f18457n, eVar);
        this.f18431C.d(false);
    }

    private boolean h(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    private void l(float f10) {
        this.f18431C.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f18442e));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f18442e;
        int i10 = this.f18430B;
        if (i10 <= 0) {
            if (this.f18446g0) {
                i10 = this.f18429A - this.f18469z;
            } else {
                i10 = this.f18429A;
            }
        }
        float f11 = (float) i10;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f18469z + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f18465v.getVisibility() != 0) {
            this.f18465v.setVisibility(0);
        }
        if (!this.f18462s) {
            this.f18465v.setScaleX(1.0f);
            this.f18465v.setScaleY(1.0f);
        }
        if (this.f18462s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f18442e));
        }
        if (f10 < this.f18442e) {
            if (this.f18431C.getAlpha() > 76 && !h(this.f18434F)) {
                x();
            }
        } else if (this.f18431C.getAlpha() < 255 && !h(this.f18435G)) {
            w();
        }
        this.f18431C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f18431C.e(Math.min(1.0f, max));
        this.f18431C.g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f18457n);
    }

    private void q(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f18461r) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f18461r = motionEvent.getPointerId(i10);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f18465v.getBackground().setAlpha(i10);
        this.f18431C.setAlpha(i10);
    }

    private void t(boolean z10, boolean z11) {
        if (this.f18440c != z10) {
            this.f18437I = z11;
            f();
            this.f18440c = z10;
            if (z10) {
                a(this.f18457n, this.f18450i0);
            } else {
                y(this.f18450i0);
            }
        }
    }

    private Animation u(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300);
        this.f18465v.b((Animation.AnimationListener) null);
        this.f18465v.clearAnimation();
        this.f18465v.startAnimation(dVar);
        return dVar;
    }

    private void v(float f10) {
        float f11 = this.f18459p;
        int i10 = this.f18441d;
        if (f10 - f11 > ((float) i10) && !this.f18460q) {
            this.f18458o = f11 + ((float) i10);
            this.f18460q = true;
            this.f18431C.setAlpha(76);
        }
    }

    private void w() {
        this.f18435G = u(this.f18431C.getAlpha(), 255);
    }

    private void x() {
        this.f18434F = u(this.f18431C.getAlpha(), 76);
    }

    private void z(int i10, Animation.AnimationListener animationListener) {
        this.f18467x = i10;
        this.f18468y = this.f18465v.getScaleX();
        h hVar = new h();
        this.f18436H = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f18465v.b(animationListener);
        }
        this.f18465v.clearAnimation();
        this.f18465v.startAnimation(this.f18436H);
    }

    public boolean c() {
        View view = this.f18438a;
        if (view instanceof ListView) {
            return androidx.core.widget.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f18447h.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f18447h.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f18447h.c(i10, i11, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f18447h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f18447h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f18466w;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        if (i11 >= i12) {
            return i11 + 1;
        }
        return i11;
    }

    public int getNestedScrollAxes() {
        return this.f18445g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f18444f0;
    }

    public int getProgressViewEndOffset() {
        return this.f18429A;
    }

    public int getProgressViewStartOffset() {
        return this.f18469z;
    }

    public boolean hasNestedScrollingParent() {
        return this.f18447h.j();
    }

    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.f18447h.l();
    }

    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        if (i14 == 0) {
            int i16 = iArr[1];
            e(i10, i11, i12, i13, this.f18451j, i14, iArr);
            int i17 = i13 - (iArr[1] - i16);
            if (i17 == 0) {
                i15 = i13 + this.f18451j[1];
            } else {
                i15 = i17;
            }
            if (i15 < 0 && !c()) {
                float abs = this.f18443f + ((float) Math.abs(i15));
                this.f18443f = abs;
                l(abs);
                iArr[1] = iArr[1] + i17;
            }
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f18453k);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18463t && actionMasked == 0) {
            this.f18463t = false;
        }
        if (!isEnabled() || this.f18463t || c() || this.f18440c || this.f18455l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f18461r;
                    if (i10 == -1) {
                        Log.e(f18427l0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f18460q = false;
            this.f18461r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f18469z - this.f18465v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f18461r = pointerId;
            this.f18460q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f18459p = motionEvent.getY(findPointerIndex2);
        }
        return this.f18460q;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f18438a == null) {
                f();
            }
            View view = this.f18438a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f18465v.getMeasuredWidth();
                int measuredHeight2 = this.f18465v.getMeasuredHeight();
                int i14 = measuredWidth / 2;
                int i15 = measuredWidth2 / 2;
                int i16 = this.f18457n;
                this.f18465v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f18438a == null) {
            f();
        }
        View view = this.f18438a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f18465v.measure(View.MeasureSpec.makeMeasureSpec(this.f18444f0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18444f0, 1073741824));
            this.f18466w = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.f18465v) {
                    this.f18466w = i12;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f18443f;
            if (f10 > 0.0f) {
                float f11 = (float) i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f18443f = 0.0f;
                } else {
                    this.f18443f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f18443f);
            }
        }
        if (this.f18446g0 && i11 > 0 && this.f18443f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f18465v.setVisibility(8);
        }
        int[] iArr2 = this.f18449i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f18453k);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f18445g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f18443f = 0.0f;
        this.f18455l = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f18480a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f18440c);
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!isEnabled() || this.f18463t || this.f18440c || (i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    public void onStopNestedScroll(View view) {
        this.f18445g.d(view);
        this.f18455l = false;
        float f10 = this.f18443f;
        if (f10 > 0.0f) {
            g(f10);
            this.f18443f = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18463t && actionMasked == 0) {
            this.f18463t = false;
        }
        if (!isEnabled() || this.f18463t || c() || this.f18440c || this.f18455l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f18461r = motionEvent.getPointerId(0);
            this.f18460q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f18461r);
            if (findPointerIndex < 0) {
                Log.e(f18427l0, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f18460q) {
                this.f18460q = false;
                g((motionEvent.getY(findPointerIndex) - this.f18458o) * 0.5f);
            }
            this.f18461r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f18461r);
            if (findPointerIndex2 < 0) {
                Log.e(f18427l0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            v(y10);
            if (this.f18460q) {
                float f10 = (y10 - this.f18458o) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                l(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f18427l0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f18461r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p(float f10) {
        int i10 = this.f18467x;
        setTargetOffsetTopAndBottom((i10 + ((int) (((float) (this.f18469z - i10)) * f10))) - this.f18465v.getTop());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f18465v.clearAnimation();
        this.f18431C.stop();
        this.f18465v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f18462s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f18469z - this.f18457n);
        }
        this.f18457n = this.f18465v.getTop();
    }

    public void s(boolean z10, int i10, int i11) {
        this.f18462s = z10;
        this.f18469z = i10;
        this.f18429A = i11;
        this.f18446g0 = true;
        r();
        this.f18440c = false;
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f10) {
        this.f18465v.setScaleX(f10);
        this.f18465v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f18431C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.c.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f18442e = (float) i10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            r();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f18448h0 = z10;
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.f18447h.m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f18439b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f18465v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.c.getColor(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (!z10 || this.f18440c == z10) {
            t(z10, false);
            return;
        }
        this.f18440c = z10;
        if (!this.f18446g0) {
            i10 = this.f18429A + this.f18469z;
        } else {
            i10 = this.f18429A;
        }
        setTargetOffsetTopAndBottom(i10 - this.f18457n);
        this.f18437I = false;
        A(this.f18450i0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f18444f0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f18444f0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f18465v.setImageDrawable((Drawable) null);
            this.f18431C.l(i10);
            this.f18465v.setImageDrawable(this.f18431C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f18430B = i10;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i10) {
        this.f18465v.bringToFront();
        C1680b0.Z(this.f18465v, i10);
        this.f18457n = this.f18465v.getTop();
    }

    public boolean startNestedScroll(int i10) {
        return this.f18447h.o(i10);
    }

    public void stopNestedScroll() {
        this.f18447h.q();
    }

    /* access modifiers changed from: package-private */
    public void y(Animation.AnimationListener animationListener) {
        C0318c cVar = new C0318c();
        this.f18433E = cVar;
        cVar.setDuration(150);
        this.f18465v.b(animationListener);
        this.f18465v.clearAnimation();
        this.f18465v.startAnimation(this.f18433E);
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final boolean f18480a;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f18480a = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f18480a ? (byte) 1 : 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f18480a = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18440c = false;
        this.f18442e = -1.0f;
        this.f18449i = new int[2];
        this.f18451j = new int[2];
        this.f18453k = new int[2];
        this.f18461r = -1;
        this.f18466w = -1;
        this.f18450i0 = new a();
        this.f18452j0 = new f();
        this.f18454k0 = new g();
        this.f18441d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f18456m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f18464u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f18444f0 = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f18429A = i10;
        this.f18442e = (float) i10;
        this.f18445g = new H(this);
        this.f18447h = new E(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f18444f0;
        this.f18457n = i11;
        this.f18469z = i11;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18428m0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
