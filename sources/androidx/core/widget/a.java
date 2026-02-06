package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C1680b0;

public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    private static final int f16197r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    final C0288a f16198a = new C0288a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f16199b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    final View f16200c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f16201d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f16202e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    private float[] f16203f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g  reason: collision with root package name */
    private int f16204g;

    /* renamed from: h  reason: collision with root package name */
    private int f16205h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f16206i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f16207j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f16208k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    private boolean f16209l;

    /* renamed from: m  reason: collision with root package name */
    boolean f16210m;

    /* renamed from: n  reason: collision with root package name */
    boolean f16211n;

    /* renamed from: o  reason: collision with root package name */
    boolean f16212o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16213p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f16214q;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0288a {

        /* renamed from: a  reason: collision with root package name */
        private int f16215a;

        /* renamed from: b  reason: collision with root package name */
        private int f16216b;

        /* renamed from: c  reason: collision with root package name */
        private float f16217c;

        /* renamed from: d  reason: collision with root package name */
        private float f16218d;

        /* renamed from: e  reason: collision with root package name */
        private long f16219e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f16220f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f16221g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f16222h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f16223i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f16224j;

        /* renamed from: k  reason: collision with root package name */
        private int f16225k;

        C0288a() {
        }

        private float e(long j10) {
            long j11 = this.f16219e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f16223i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f16215a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f16224j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f16225k), 0.0f, 1.0f));
        }

        private float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f16220f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f16220f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f16220f)) * g10;
                this.f16221g = (int) (this.f16217c * f10);
                this.f16222h = (int) (f10 * this.f16218d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f16221g;
        }

        public int c() {
            return this.f16222h;
        }

        public int d() {
            float f10 = this.f16217c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f16218d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            if (this.f16223i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f16223i + ((long) this.f16225k)) {
                return false;
            }
            return true;
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f16225k = a.f((int) (currentAnimationTimeMillis - this.f16219e), 0, this.f16216b);
            this.f16224j = e(currentAnimationTimeMillis);
            this.f16223i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f16216b = i10;
        }

        public void k(int i10) {
            this.f16215a = i10;
        }

        public void l(float f10, float f11) {
            this.f16217c = f10;
            this.f16218d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f16219e = currentAnimationTimeMillis;
            this.f16223i = -1;
            this.f16220f = currentAnimationTimeMillis;
            this.f16224j = 0.5f;
            this.f16221g = 0;
            this.f16222h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f16212o) {
                if (aVar.f16210m) {
                    aVar.f16210m = false;
                    aVar.f16198a.m();
                }
                C0288a aVar2 = a.this.f16198a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f16212o = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f16211n) {
                    aVar3.f16211n = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                C1680b0.g0(a.this.f16200c, this);
            }
        }
    }

    public a(View view) {
        this.f16200c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        o(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f16197r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f16202e[i10], f11, this.f16203f[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f16206i[i10];
        float f14 = this.f16207j[i10];
        float f15 = this.f16208k[i10];
        float f16 = f13 * f12;
        if (i11 > 0) {
            return e(h10 * f16, f14, f15);
        }
        return -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f16204g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (!this.f16212o || i10 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f16199b.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f16199b.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f16210m) {
            this.f16212o = false;
        } else {
            this.f16198a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f16201d == null) {
            this.f16201d = new b();
        }
        this.f16212o = true;
        this.f16210m = true;
        if (this.f16209l || (i10 = this.f16205h) <= 0) {
            this.f16201d.run();
        } else {
            C1680b0.h0(this.f16200c, this.f16201d, (long) i10);
        }
        this.f16209l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f16200c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f16205h = i10;
        return this;
    }

    public a l(int i10) {
        this.f16204g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f16213p && !z10) {
            i();
        }
        this.f16213p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f16203f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f16208k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f16213p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f16211n = r2
            r5.f16209l = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f16200c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f16200c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f16198a
            r7.l(r0, r6)
            boolean r6 = r5.f16212o
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f16214q
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f16212o
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f16207j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f16198a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f16198a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f16202e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f16206i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0288a aVar = this.f16198a;
        int f10 = aVar.f();
        int d10 = aVar.d();
        if ((f10 == 0 || !b(f10)) && (d10 == 0 || !a(d10))) {
            return false;
        }
        return true;
    }
}
