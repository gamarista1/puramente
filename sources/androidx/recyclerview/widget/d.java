package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C1680b0;
import androidx.recyclerview.widget.RecyclerView;

class d extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f18278D = {16842919};

    /* renamed from: E  reason: collision with root package name */
    private static final int[] f18279E = new int[0];

    /* renamed from: A  reason: collision with root package name */
    int f18280A;

    /* renamed from: B  reason: collision with root package name */
    private final Runnable f18281B;

    /* renamed from: C  reason: collision with root package name */
    private final RecyclerView.u f18282C;

    /* renamed from: a  reason: collision with root package name */
    private final int f18283a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18284b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f18285c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f18286d;

    /* renamed from: e  reason: collision with root package name */
    private final int f18287e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18288f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f18289g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f18290h;

    /* renamed from: i  reason: collision with root package name */
    private final int f18291i;

    /* renamed from: j  reason: collision with root package name */
    private final int f18292j;

    /* renamed from: k  reason: collision with root package name */
    int f18293k;

    /* renamed from: l  reason: collision with root package name */
    int f18294l;

    /* renamed from: m  reason: collision with root package name */
    float f18295m;

    /* renamed from: n  reason: collision with root package name */
    int f18296n;

    /* renamed from: o  reason: collision with root package name */
    int f18297o;

    /* renamed from: p  reason: collision with root package name */
    float f18298p;

    /* renamed from: q  reason: collision with root package name */
    private int f18299q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f18300r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f18301s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f18302t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f18303u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f18304v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f18305w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f18306x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f18307y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f18308z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.k(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f18311a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f18311a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f18311a) {
                this.f18311a = false;
            } else if (((Float) d.this.f18308z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f18280A = 0;
                dVar.s(0);
            } else {
                d dVar2 = d.this;
                dVar2.f18280A = 2;
                dVar2.p();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    private class C0315d implements ValueAnimator.AnimatorUpdateListener {
        C0315d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f18285c.setAlpha(floatValue);
            d.this.f18286d.setAlpha(floatValue);
            d.this.p();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f18308z = ofFloat;
        this.f18280A = 0;
        this.f18281B = new a();
        this.f18282C = new b();
        this.f18285c = stateListDrawable;
        this.f18286d = drawable;
        this.f18289g = stateListDrawable2;
        this.f18290h = drawable2;
        this.f18287e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f18288f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f18291i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f18292j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f18283a = i11;
        this.f18284b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0315d());
        d(recyclerView);
    }

    private void e() {
        this.f18301s.removeCallbacks(this.f18281B);
    }

    private void f() {
        this.f18301s.g1(this);
        this.f18301s.h1(this);
        this.f18301s.i1(this.f18282C);
        e();
    }

    private void g(Canvas canvas) {
        int i10 = this.f18300r;
        int i11 = this.f18291i;
        int i12 = i10 - i11;
        int i13 = this.f18297o;
        int i14 = this.f18296n;
        int i15 = i13 - (i14 / 2);
        this.f18289g.setBounds(0, 0, i14, i11);
        this.f18290h.setBounds(0, 0, this.f18299q, this.f18292j);
        canvas.translate(0.0f, (float) i12);
        this.f18290h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f18289g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    private void h(Canvas canvas) {
        int i10 = this.f18299q;
        int i11 = this.f18287e;
        int i12 = i10 - i11;
        int i13 = this.f18294l;
        int i14 = this.f18293k;
        int i15 = i13 - (i14 / 2);
        this.f18285c.setBounds(0, 0, i11, i14);
        this.f18286d.setBounds(0, 0, this.f18288f, this.f18300r);
        if (m()) {
            this.f18286d.draw(canvas);
            canvas.translate((float) this.f18287e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f18285c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f18287e), (float) (-i15));
            return;
        }
        canvas.translate((float) i12, 0.0f);
        this.f18286d.draw(canvas);
        canvas.translate(0.0f, (float) i15);
        this.f18285c.draw(canvas);
        canvas.translate((float) (-i12), (float) (-i15));
    }

    private int[] i() {
        int[] iArr = this.f18307y;
        int i10 = this.f18284b;
        iArr[0] = i10;
        iArr[1] = this.f18299q - i10;
        return iArr;
    }

    private int[] j() {
        int[] iArr = this.f18306x;
        int i10 = this.f18284b;
        iArr[0] = i10;
        iArr[1] = this.f18300r - i10;
        return iArr;
    }

    private void l(float f10) {
        int[] i10 = i();
        float max = Math.max((float) i10[0], Math.min((float) i10[1], f10));
        if (Math.abs(((float) this.f18297o) - max) >= 2.0f) {
            int r10 = r(this.f18298p, max, i10, this.f18301s.computeHorizontalScrollRange(), this.f18301s.computeHorizontalScrollOffset(), this.f18299q);
            if (r10 != 0) {
                this.f18301s.scrollBy(r10, 0);
            }
            this.f18298p = max;
        }
    }

    private boolean m() {
        if (C1680b0.A(this.f18301s) == 1) {
            return true;
        }
        return false;
    }

    private void q(int i10) {
        e();
        this.f18301s.postDelayed(this.f18281B, (long) i10);
    }

    private int r(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void t() {
        this.f18301s.j(this);
        this.f18301s.m(this);
        this.f18301s.n(this.f18282C);
    }

    private void w(float f10) {
        int[] j10 = j();
        float max = Math.max((float) j10[0], Math.min((float) j10[1], f10));
        if (Math.abs(((float) this.f18294l) - max) >= 2.0f) {
            int r10 = r(this.f18295m, max, j10, this.f18301s.computeVerticalScrollRange(), this.f18301s.computeVerticalScrollOffset(), this.f18300r);
            if (r10 != 0) {
                this.f18301s.scrollBy(0, r10);
            }
            this.f18295m = max;
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f18304v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean o10 = o(motionEvent.getX(), motionEvent.getY());
                boolean n10 = n(motionEvent.getX(), motionEvent.getY());
                if (o10 || n10) {
                    if (n10) {
                        this.f18305w = 1;
                        this.f18298p = (float) ((int) motionEvent.getX());
                    } else if (o10) {
                        this.f18305w = 2;
                        this.f18295m = (float) ((int) motionEvent.getY());
                    }
                    s(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f18304v == 2) {
                this.f18295m = 0.0f;
                this.f18298p = 0.0f;
                s(1);
                this.f18305w = 0;
            } else if (motionEvent.getAction() == 2 && this.f18304v == 2) {
                u();
                if (this.f18305w == 1) {
                    l(motionEvent.getX());
                }
                if (this.f18305w == 2) {
                    w(motionEvent.getY());
                }
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f18304v;
        if (i10 == 1) {
            boolean o10 = o(motionEvent.getX(), motionEvent.getY());
            boolean n10 = n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!o10 && !n10) {
                return false;
            }
            if (n10) {
                this.f18305w = 1;
                this.f18298p = (float) ((int) motionEvent.getX());
            } else if (o10) {
                this.f18305w = 2;
                this.f18295m = (float) ((int) motionEvent.getY());
            }
            s(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    public void c(boolean z10) {
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f18301s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                f();
            }
            this.f18301s = recyclerView;
            if (recyclerView != null) {
                t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(int i10) {
        int i11 = this.f18280A;
        if (i11 == 1) {
            this.f18308z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f18280A = 3;
        ValueAnimator valueAnimator = this.f18308z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f18308z.setDuration((long) i10);
        this.f18308z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean n(float f10, float f11) {
        if (f11 >= ((float) (this.f18300r - this.f18291i))) {
            int i10 = this.f18297o;
            int i11 = this.f18296n;
            if (f10 < ((float) (i10 - (i11 / 2))) || f10 > ((float) (i10 + (i11 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean o(float f10, float f11) {
        if (!m() ? f10 >= ((float) (this.f18299q - this.f18287e)) : f10 <= ((float) this.f18287e)) {
            int i10 = this.f18294l;
            int i11 = this.f18293k;
            if (f11 < ((float) (i10 - (i11 / 2))) || f11 > ((float) (i10 + (i11 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
        if (this.f18299q != this.f18301s.getWidth() || this.f18300r != this.f18301s.getHeight()) {
            this.f18299q = this.f18301s.getWidth();
            this.f18300r = this.f18301s.getHeight();
            s(0);
        } else if (this.f18280A != 0) {
            if (this.f18302t) {
                h(canvas);
            }
            if (this.f18303u) {
                g(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f18301s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        if (i10 == 2 && this.f18304v != 2) {
            this.f18285c.setState(f18278D);
            e();
        }
        if (i10 == 0) {
            p();
        } else {
            u();
        }
        if (this.f18304v == 2 && i10 != 2) {
            this.f18285c.setState(f18279E);
            q(1200);
        } else if (i10 == 1) {
            q(1500);
        }
        this.f18304v = i10;
    }

    public void u() {
        int i10 = this.f18280A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f18308z.cancel();
            } else {
                return;
            }
        }
        this.f18280A = 1;
        ValueAnimator valueAnimator = this.f18308z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f18308z.setDuration(500);
        this.f18308z.setStartDelay(0);
        this.f18308z.start();
    }

    /* access modifiers changed from: package-private */
    public void v(int i10, int i11) {
        boolean z10;
        boolean z11;
        int computeVerticalScrollRange = this.f18301s.computeVerticalScrollRange();
        int i12 = this.f18300r;
        if (computeVerticalScrollRange - i12 <= 0 || i12 < this.f18283a) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f18302t = z10;
        int computeHorizontalScrollRange = this.f18301s.computeHorizontalScrollRange();
        int i13 = this.f18299q;
        if (computeHorizontalScrollRange - i13 <= 0 || i13 < this.f18283a) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f18303u = z11;
        boolean z12 = this.f18302t;
        if (z12 || z11) {
            if (z12) {
                float f10 = (float) i12;
                this.f18294l = (int) ((f10 * (((float) i11) + (f10 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f18293k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (this.f18303u) {
                float f11 = (float) i13;
                this.f18297o = (int) ((f11 * (((float) i10) + (f11 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f18296n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = this.f18304v;
            if (i14 == 0 || i14 == 1) {
                s(1);
            }
        } else if (this.f18304v != 0) {
            s(0);
        }
    }
}
