package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import x1.g;

public class b extends Drawable implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    private static final Interpolator f18393g = new LinearInterpolator();

    /* renamed from: h  reason: collision with root package name */
    private static final Interpolator f18394h = new V1.b();

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f18395i = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    private final c f18396a;

    /* renamed from: b  reason: collision with root package name */
    private float f18397b;

    /* renamed from: c  reason: collision with root package name */
    private Resources f18398c;

    /* renamed from: d  reason: collision with root package name */
    private Animator f18399d;

    /* renamed from: e  reason: collision with root package name */
    float f18400e;

    /* renamed from: f  reason: collision with root package name */
    boolean f18401f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18402a;

        a(c cVar) {
            this.f18402a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f18402a);
            b.this.b(floatValue, this.f18402a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    class C0317b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18404a;

        C0317b(c cVar) {
            this.f18404a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f18404a, true);
            this.f18404a.A();
            this.f18404a.l();
            b bVar = b.this;
            if (bVar.f18401f) {
                bVar.f18401f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f18404a.x(false);
                return;
            }
            bVar.f18400e += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.f18400e = 0.0f;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f18406a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f18407b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f18408c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f18409d;

        /* renamed from: e  reason: collision with root package name */
        float f18410e;

        /* renamed from: f  reason: collision with root package name */
        float f18411f;

        /* renamed from: g  reason: collision with root package name */
        float f18412g;

        /* renamed from: h  reason: collision with root package name */
        float f18413h;

        /* renamed from: i  reason: collision with root package name */
        int[] f18414i;

        /* renamed from: j  reason: collision with root package name */
        int f18415j;

        /* renamed from: k  reason: collision with root package name */
        float f18416k;

        /* renamed from: l  reason: collision with root package name */
        float f18417l;

        /* renamed from: m  reason: collision with root package name */
        float f18418m;

        /* renamed from: n  reason: collision with root package name */
        boolean f18419n;

        /* renamed from: o  reason: collision with root package name */
        Path f18420o;

        /* renamed from: p  reason: collision with root package name */
        float f18421p;

        /* renamed from: q  reason: collision with root package name */
        float f18422q;

        /* renamed from: r  reason: collision with root package name */
        int f18423r;

        /* renamed from: s  reason: collision with root package name */
        int f18424s;

        /* renamed from: t  reason: collision with root package name */
        int f18425t;

        /* renamed from: u  reason: collision with root package name */
        int f18426u;

        c() {
            Paint paint = new Paint();
            this.f18407b = paint;
            Paint paint2 = new Paint();
            this.f18408c = paint2;
            Paint paint3 = new Paint();
            this.f18409d = paint3;
            this.f18410e = 0.0f;
            this.f18411f = 0.0f;
            this.f18412g = 0.0f;
            this.f18413h = 5.0f;
            this.f18421p = 1.0f;
            this.f18425t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void A() {
            this.f18416k = this.f18410e;
            this.f18417l = this.f18411f;
            this.f18418m = this.f18412g;
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f18406a;
            float f10 = this.f18422q;
            float f11 = (this.f18413h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f18423r) * this.f18421p) / 2.0f, this.f18413h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f11, ((float) rect.centerY()) - f11, ((float) rect.centerX()) + f11, ((float) rect.centerY()) + f11);
            float f12 = this.f18410e;
            float f13 = this.f18412g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f18411f + f13) * 360.0f) - f14;
            this.f18407b.setColor(this.f18426u);
            this.f18407b.setAlpha(this.f18425t);
            float f16 = this.f18413h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f18409d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f18407b);
            b(canvas, f14, f15, rectF);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f18419n) {
                Path path = this.f18420o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f18420o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f18420o.moveTo(0.0f, 0.0f);
                this.f18420o.lineTo(((float) this.f18423r) * this.f18421p, 0.0f);
                Path path3 = this.f18420o;
                float f12 = this.f18421p;
                path3.lineTo((((float) this.f18423r) * f12) / 2.0f, ((float) this.f18424s) * f12);
                this.f18420o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f18423r) * this.f18421p) / 2.0f), rectF.centerY() + (this.f18413h / 2.0f));
                this.f18420o.close();
                this.f18408c.setColor(this.f18426u);
                this.f18408c.setAlpha(this.f18425t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f18420o, this.f18408c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f18425t;
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f18411f;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f18414i[f()];
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return (this.f18415j + 1) % this.f18414i.length;
        }

        /* access modifiers changed from: package-private */
        public float g() {
            return this.f18410e;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f18414i[this.f18415j];
        }

        /* access modifiers changed from: package-private */
        public float i() {
            return this.f18417l;
        }

        /* access modifiers changed from: package-private */
        public float j() {
            return this.f18418m;
        }

        /* access modifiers changed from: package-private */
        public float k() {
            return this.f18416k;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            t(f());
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f18416k = 0.0f;
            this.f18417l = 0.0f;
            this.f18418m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        /* access modifiers changed from: package-private */
        public void n(int i10) {
            this.f18425t = i10;
        }

        /* access modifiers changed from: package-private */
        public void o(float f10, float f11) {
            this.f18423r = (int) f10;
            this.f18424s = (int) f11;
        }

        /* access modifiers changed from: package-private */
        public void p(float f10) {
            if (f10 != this.f18421p) {
                this.f18421p = f10;
            }
        }

        /* access modifiers changed from: package-private */
        public void q(float f10) {
            this.f18422q = f10;
        }

        /* access modifiers changed from: package-private */
        public void r(int i10) {
            this.f18426u = i10;
        }

        /* access modifiers changed from: package-private */
        public void s(ColorFilter colorFilter) {
            this.f18407b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void t(int i10) {
            this.f18415j = i10;
            this.f18426u = this.f18414i[i10];
        }

        /* access modifiers changed from: package-private */
        public void u(int[] iArr) {
            this.f18414i = iArr;
            t(0);
        }

        /* access modifiers changed from: package-private */
        public void v(float f10) {
            this.f18411f = f10;
        }

        /* access modifiers changed from: package-private */
        public void w(float f10) {
            this.f18412g = f10;
        }

        /* access modifiers changed from: package-private */
        public void x(boolean z10) {
            if (this.f18419n != z10) {
                this.f18419n = z10;
            }
        }

        /* access modifiers changed from: package-private */
        public void y(float f10) {
            this.f18410e = f10;
        }

        /* access modifiers changed from: package-private */
        public void z(float f10) {
            this.f18413h = f10;
            this.f18407b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f18398c = ((Context) g.f(context)).getResources();
        c cVar = new c();
        this.f18396a = cVar;
        cVar.u(f18395i);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor((double) (cVar.j() / 0.8f)) + 1.0d)) - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) (((float) (((i11 >> 24) & 255) - i12)) * f10))) << 24) | ((i13 + ((int) (((float) (((i11 >> 16) & 255) - i13)) * f10))) << 16) | ((i14 + ((int) (((float) (((i11 >> 8) & 255) - i14)) * f10))) << 8) | (i15 + ((int) (f10 * ((float) ((i11 & 255) - i15)))));
    }

    private void h(float f10) {
        this.f18397b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f18396a;
        float f14 = this.f18398c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f18396a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f18393g);
        ofFloat.addListener(new C0317b(cVar));
        this.f18399d = ofFloat;
    }

    /* access modifiers changed from: package-private */
    public void b(float f10, c cVar, boolean z10) {
        float f11;
        float f12;
        if (this.f18401f) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                f11 = cVar.k();
                f12 = (f18394h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + f11;
            } else {
                float k10 = cVar.k() + 0.79f;
                float f13 = k10;
                f11 = k10 - (((1.0f - f18394h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = f13;
            }
            cVar.y(f11);
            cVar.v(f12);
            cVar.w(j10 + (0.20999998f * f10));
            h((f10 + this.f18400e) * 216.0f);
        }
    }

    public void d(boolean z10) {
        this.f18396a.x(z10);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f18397b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f18396a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f18396a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f18396a.u(iArr);
        this.f18396a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f18396a.w(f10);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f18396a.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f18399d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f18396a.y(f10);
        this.f18396a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f18396a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    public void setAlpha(int i10) {
        this.f18396a.n(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18396a.s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f18399d.cancel();
        this.f18396a.A();
        if (this.f18396a.d() != this.f18396a.g()) {
            this.f18401f = true;
            this.f18399d.setDuration(666);
            this.f18399d.start();
            return;
        }
        this.f18396a.t(0);
        this.f18396a.m();
        this.f18399d.setDuration(1332);
        this.f18399d.start();
    }

    public void stop() {
        this.f18399d.cancel();
        h(0.0f);
        this.f18396a.x(false);
        this.f18396a.t(0);
        this.f18396a.m();
        invalidateSelf();
    }
}
