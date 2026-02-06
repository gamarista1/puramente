package i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

final class C {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public boolean f22170A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public boolean f22171B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f22172C = true;

    /* renamed from: a  reason: collision with root package name */
    private final C2099j f22173a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final View f22174b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f22175c;

    /* renamed from: d  reason: collision with root package name */
    private final ViewGroup f22176d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f22177e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f22178f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f22179g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f22180h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f22181i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final View f22182j;

    /* renamed from: k  reason: collision with root package name */
    private final View f22183k;

    /* renamed from: l  reason: collision with root package name */
    private final AnimatorSet f22184l;

    /* renamed from: m  reason: collision with root package name */
    private final AnimatorSet f22185m;

    /* renamed from: n  reason: collision with root package name */
    private final AnimatorSet f22186n;

    /* renamed from: o  reason: collision with root package name */
    private final AnimatorSet f22187o;

    /* renamed from: p  reason: collision with root package name */
    private final AnimatorSet f22188p;

    /* renamed from: q  reason: collision with root package name */
    private final ValueAnimator f22189q;

    /* renamed from: r  reason: collision with root package name */
    private final ValueAnimator f22190r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f22191s = new C2105p(this);

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f22192t = new C2110v(this);

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f22193u = new C2111w(this);

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f22194v = new C2112x(this);

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f22195w = new C2113y(this);

    /* renamed from: x  reason: collision with root package name */
    private final View.OnLayoutChangeListener f22196x = new C2114z(this);

    /* renamed from: y  reason: collision with root package name */
    private final List f22197y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private int f22198z = 0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (C.this.f22174b != null) {
                C.this.f22174b.setVisibility(4);
            }
            if (C.this.f22175c != null) {
                C.this.f22175c.setVisibility(4);
            }
            if (C.this.f22177e != null) {
                C.this.f22177e.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if ((C.this.f22182j instanceof C2094e) && !C.this.f22170A) {
                ((C2094e) C.this.f22182j).h(250);
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationStart(Animator animator) {
            int i10 = 0;
            if (C.this.f22174b != null) {
                C.this.f22174b.setVisibility(0);
            }
            if (C.this.f22175c != null) {
                C.this.f22175c.setVisibility(0);
            }
            if (C.this.f22177e != null) {
                ViewGroup r10 = C.this.f22177e;
                if (!C.this.f22170A) {
                    i10 = 4;
                }
                r10.setVisibility(i10);
            }
            if ((C.this.f22182j instanceof C2094e) && !C.this.f22170A) {
                ((C2094e) C.this.f22182j).u(250);
            }
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2099j f22201a;

        c(C2099j jVar) {
            this.f22201a = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            C.this.Z(1);
            if (C.this.f22171B) {
                this.f22201a.post(C.this.f22191s);
                boolean unused = C.this.f22171B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            C.this.Z(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2099j f22203a;

        d(C2099j jVar) {
            this.f22203a = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            C.this.Z(2);
            if (C.this.f22171B) {
                this.f22203a.post(C.this.f22191s);
                boolean unused = C.this.f22171B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            C.this.Z(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2099j f22205a;

        e(C2099j jVar) {
            this.f22205a = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            C.this.Z(2);
            if (C.this.f22171B) {
                this.f22205a.post(C.this.f22191s);
                boolean unused = C.this.f22171B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            C.this.Z(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        public void onAnimationEnd(Animator animator) {
            C.this.Z(0);
        }

        public void onAnimationStart(Animator animator) {
            C.this.Z(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        public void onAnimationEnd(Animator animator) {
            C.this.Z(0);
        }

        public void onAnimationStart(Animator animator) {
            C.this.Z(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        public void onAnimationEnd(Animator animator) {
            if (C.this.f22178f != null) {
                C.this.f22178f.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C.this.f22180h != null) {
                C.this.f22180h.setVisibility(0);
                C.this.f22180h.setTranslationX((float) C.this.f22180h.getWidth());
                C.this.f22180h.scrollTo(C.this.f22180h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        public void onAnimationEnd(Animator animator) {
            if (C.this.f22180h != null) {
                C.this.f22180h.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C.this.f22178f != null) {
                C.this.f22178f.setVisibility(0);
            }
        }
    }

    public C(C2099j jVar) {
        this.f22173a = jVar;
        this.f22174b = jVar.findViewById(V.f22309l);
        this.f22175c = (ViewGroup) jVar.findViewById(V.f22304g);
        this.f22177e = (ViewGroup) jVar.findViewById(V.f22320w);
        ViewGroup viewGroup = (ViewGroup) jVar.findViewById(V.f22302e);
        this.f22176d = viewGroup;
        this.f22181i = (ViewGroup) jVar.findViewById(V.f22296S);
        View findViewById = jVar.findViewById(V.f22284G);
        this.f22182j = findViewById;
        this.f22178f = (ViewGroup) jVar.findViewById(V.f22301d);
        this.f22179g = (ViewGroup) jVar.findViewById(V.f22312o);
        this.f22180h = (ViewGroup) jVar.findViewById(V.f22313p);
        View findViewById2 = jVar.findViewById(V.f22278A);
        this.f22183k = findViewById2;
        View findViewById3 = jVar.findViewById(V.f22323z);
        if (!(findViewById2 == null || findViewById3 == null)) {
            findViewById2.setOnClickListener(new C2089A(this));
            findViewById3.setOnClickListener(new C2089A(this));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new B(this));
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new C2106q(this));
        ofFloat2.addListener(new b());
        Resources resources = jVar.getResources();
        float dimension = resources.getDimension(S.f22255b) - resources.getDimension(S.f22256c);
        float dimension2 = resources.getDimension(S.f22255b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22184l = animatorSet;
        animatorSet.setDuration(250);
        animatorSet.addListener(new c(jVar));
        animatorSet.play(ofFloat).with(N(0.0f, dimension, findViewById)).with(N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22185m = animatorSet2;
        animatorSet2.setDuration(250);
        animatorSet2.addListener(new d(jVar));
        animatorSet2.play(N(dimension, dimension2, findViewById)).with(N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f22186n = animatorSet3;
        animatorSet3.setDuration(250);
        animatorSet3.addListener(new e(jVar));
        animatorSet3.play(ofFloat).with(N(0.0f, dimension2, findViewById)).with(N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f22187o = animatorSet4;
        animatorSet4.setDuration(250);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(N(dimension, 0.0f, findViewById)).with(N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f22188p = animatorSet5;
        animatorSet5.setDuration(250);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(N(dimension2, 0.0f, findViewById)).with(N(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f22189q = ofFloat3;
        ofFloat3.setDuration(250);
        ofFloat3.addUpdateListener(new C2108t(this));
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f22190r = ofFloat4;
        ofFloat4.setDuration(250);
        ofFloat4.addUpdateListener(new C2109u(this));
        ofFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: private */
    public void D() {
        this.f22186n.start();
    }

    /* access modifiers changed from: private */
    public void E() {
        Z(2);
    }

    /* access modifiers changed from: private */
    public void G() {
        this.f22184l.start();
        U(this.f22193u, 2000);
    }

    /* access modifiers changed from: private */
    public void H() {
        this.f22185m.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f22174b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f22175c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f22177e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f22174b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f22175c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f22177e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator N(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{f10, f11});
    }

    /* access modifiers changed from: private */
    public void R(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        boolean e02 = e0();
        if (this.f22170A != e02) {
            this.f22170A = e02;
            view.post(new r(this));
        }
        if (i12 - i10 != i16 - i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f22170A && z10) {
            view.post(new C2107s(this));
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        int i10;
        if (this.f22178f != null && this.f22179g != null) {
            int width = (this.f22173a.getWidth() - this.f22173a.getPaddingLeft()) - this.f22173a.getPaddingRight();
            while (true) {
                if (this.f22179g.getChildCount() <= 1) {
                    break;
                }
                int childCount = this.f22179g.getChildCount() - 2;
                View childAt = this.f22179g.getChildAt(childCount);
                this.f22179g.removeViewAt(childCount);
                this.f22178f.addView(childAt, 0);
            }
            View view = this.f22183k;
            if (view != null) {
                view.setVisibility(8);
            }
            int B10 = B(this.f22181i);
            int childCount2 = this.f22178f.getChildCount() - 1;
            for (int i11 = 0; i11 < childCount2; i11++) {
                B10 += B(this.f22178f.getChildAt(i11));
            }
            if (B10 > width) {
                View view2 = this.f22183k;
                if (view2 != null) {
                    view2.setVisibility(0);
                    B10 += B(this.f22183k);
                }
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = this.f22178f.getChildAt(i12);
                    B10 -= B(childAt2);
                    arrayList.add(childAt2);
                    if (B10 <= width) {
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f22178f.removeViews(0, arrayList.size());
                    for (i10 = 0; i10 < arrayList.size(); i10++) {
                        this.f22179g.addView((View) arrayList.get(i10), this.f22179g.getChildCount() - 1);
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.f22180h;
            if (viewGroup != null && viewGroup.getVisibility() == 0 && !this.f22190r.isStarted()) {
                this.f22189q.cancel();
                this.f22190r.start();
            }
        }
    }

    /* access modifiers changed from: private */
    public void T(View view) {
        W();
        if (view.getId() == V.f22278A) {
            this.f22189q.start();
        } else if (view.getId() == V.f22323z) {
            this.f22190r.start();
        }
    }

    private void U(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f22173a.postDelayed(runnable, j10);
        }
    }

    /* access modifiers changed from: private */
    public void Z(int i10) {
        int i11 = this.f22198z;
        this.f22198z = i10;
        if (i10 == 2) {
            this.f22173a.setVisibility(8);
        } else if (i11 == 2) {
            this.f22173a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f22173a.f0();
        }
    }

    private boolean a0(View view) {
        int id2 = view.getId();
        if (id2 == V.f22302e || id2 == V.f22283F || id2 == V.f22322y || id2 == V.f22287J || id2 == V.f22288K || id2 == V.f22314q || id2 == V.f22315r) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void c0() {
        if (!this.f22172C) {
            Z(0);
            W();
            return;
        }
        int i10 = this.f22198z;
        if (i10 == 1) {
            this.f22187o.start();
        } else if (i10 == 2) {
            this.f22188p.start();
        } else if (i10 == 3) {
            this.f22171B = true;
        } else if (i10 == 4) {
            return;
        }
        W();
    }

    /* access modifiers changed from: private */
    public void d0() {
        int i10;
        int i11;
        ViewGroup viewGroup = this.f22177e;
        if (viewGroup != null) {
            if (this.f22170A) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            viewGroup.setVisibility(i11);
        }
        if (this.f22182j != null) {
            int dimensionPixelSize = this.f22173a.getResources().getDimensionPixelSize(S.f22257d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22182j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f22170A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f22182j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f22182j;
            if (view instanceof C2094e) {
                C2094e eVar = (C2094e) view;
                if (this.f22170A) {
                    eVar.i(true);
                } else {
                    int i12 = this.f22198z;
                    if (i12 == 1) {
                        eVar.i(false);
                    } else if (i12 != 3) {
                        eVar.t();
                    }
                }
            }
        }
        for (View view2 : this.f22197y) {
            if (!this.f22170A || !a0(view2)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
    }

    private boolean e0() {
        int i10;
        int i11;
        int width = (this.f22173a.getWidth() - this.f22173a.getPaddingLeft()) - this.f22173a.getPaddingRight();
        int height = (this.f22173a.getHeight() - this.f22173a.getPaddingBottom()) - this.f22173a.getPaddingTop();
        int B10 = B(this.f22175c);
        ViewGroup viewGroup = this.f22175c;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingLeft() + this.f22175c.getPaddingRight();
        } else {
            i10 = 0;
        }
        int i12 = B10 - i10;
        int z10 = z(this.f22175c);
        ViewGroup viewGroup2 = this.f22175c;
        if (viewGroup2 != null) {
            i11 = viewGroup2.getPaddingTop() + this.f22175c.getPaddingBottom();
        } else {
            i11 = 0;
        }
        int max = Math.max(i12, B(this.f22181i) + B(this.f22183k));
        int z11 = (z10 - i11) + (z(this.f22176d) * 2);
        if (width <= max || height <= z11) {
            return true;
        }
        return false;
    }

    private void y(float f10) {
        ViewGroup viewGroup = this.f22180h;
        if (viewGroup != null) {
            this.f22180h.setTranslationX((float) ((int) (((float) viewGroup.getWidth()) * (1.0f - f10))));
        }
        ViewGroup viewGroup2 = this.f22181i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f22178f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        if (view == null || !this.f22197y.contains(view)) {
            return false;
        }
        return true;
    }

    public void C() {
        int i10 = this.f22198z;
        if (i10 != 3 && i10 != 2) {
            V();
            if (!this.f22172C) {
                E();
            } else if (this.f22198z == 1) {
                H();
            } else {
                D();
            }
        }
    }

    public void F() {
        int i10 = this.f22198z;
        if (i10 != 3 && i10 != 2) {
            V();
            E();
        }
    }

    public boolean I() {
        if (this.f22198z != 0 || !this.f22173a.e0()) {
            return false;
        }
        return true;
    }

    public void O() {
        this.f22173a.addOnLayoutChangeListener(this.f22196x);
    }

    public void P() {
        this.f22173a.removeOnLayoutChangeListener(this.f22196x);
    }

    public void Q(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f22174b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void V() {
        this.f22173a.removeCallbacks(this.f22195w);
        this.f22173a.removeCallbacks(this.f22192t);
        this.f22173a.removeCallbacks(this.f22194v);
        this.f22173a.removeCallbacks(this.f22193u);
    }

    public void W() {
        if (this.f22198z != 3) {
            V();
            int showTimeoutMs = this.f22173a.getShowTimeoutMs();
            if (showTimeoutMs <= 0) {
                return;
            }
            if (!this.f22172C) {
                U(this.f22195w, (long) showTimeoutMs);
            } else if (this.f22198z == 1) {
                U(this.f22193u, 2000);
            } else {
                U(this.f22194v, (long) showTimeoutMs);
            }
        }
    }

    public void X(boolean z10) {
        this.f22172C = z10;
    }

    public void Y(View view, boolean z10) {
        if (view != null) {
            if (!z10) {
                view.setVisibility(8);
                this.f22197y.remove(view);
                return;
            }
            if (!this.f22170A || !a0(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            this.f22197y.add(view);
        }
    }

    public void b0() {
        if (!this.f22173a.e0()) {
            this.f22173a.setVisibility(0);
            this.f22173a.o0();
            this.f22173a.k0();
        }
        c0();
    }
}
