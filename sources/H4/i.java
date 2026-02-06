package H4;

import android.view.Choreographer;
import u4.C4065e;
import u4.C4071k;

public class i extends c implements Choreographer.FrameCallback {

    /* renamed from: d  reason: collision with root package name */
    private float f31668d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31669e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f31670f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f31671g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f31672h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    private int f31673i = 0;

    /* renamed from: j  reason: collision with root package name */
    private float f31674j = -2.14748365E9f;

    /* renamed from: k  reason: collision with root package name */
    private float f31675k = 2.14748365E9f;

    /* renamed from: l  reason: collision with root package name */
    private C4071k f31676l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f31677m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f31678n = false;

    private void I() {
        if (this.f31676l != null) {
            float f10 = this.f31672h;
            if (f10 < this.f31674j || f10 > this.f31675k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f31674j), Float.valueOf(this.f31675k), Float.valueOf(this.f31672h)}));
            }
        }
    }

    private float o() {
        C4071k kVar = this.f31676l;
        if (kVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kVar.i()) / Math.abs(this.f31668d);
    }

    private boolean s() {
        if (r() < 0.0f) {
            return true;
        }
        return false;
    }

    public void A() {
        G(-r());
    }

    public void B(C4071k kVar) {
        boolean z10;
        if (this.f31676l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31676l = kVar;
        if (z10) {
            E(Math.max(this.f31674j, kVar.p()), Math.min(this.f31675k, kVar.f()));
        } else {
            E((float) ((int) kVar.p()), (float) ((int) kVar.f()));
        }
        float f10 = this.f31672h;
        this.f31672h = 0.0f;
        this.f31671g = 0.0f;
        C((float) ((int) f10));
        i();
    }

    public void C(float f10) {
        if (this.f31671g != f10) {
            float b10 = k.b(f10, q(), p());
            this.f31671g = b10;
            if (this.f31678n) {
                b10 = (float) Math.floor((double) b10);
            }
            this.f31672h = b10;
            this.f31670f = 0;
            i();
        }
    }

    public void D(float f10) {
        E(this.f31674j, f10);
    }

    public void E(float f10, float f11) {
        float f12;
        float f13;
        if (f10 <= f11) {
            C4071k kVar = this.f31676l;
            if (kVar == null) {
                f12 = -3.4028235E38f;
            } else {
                f12 = kVar.p();
            }
            C4071k kVar2 = this.f31676l;
            if (kVar2 == null) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = kVar2.f();
            }
            float b10 = k.b(f10, f12, f13);
            float b11 = k.b(f11, f12, f13);
            if (b10 != this.f31674j || b11 != this.f31675k) {
                this.f31674j = b10;
                this.f31675k = b11;
                C((float) ((int) k.b(this.f31672h, b10, b11)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f10), Float.valueOf(f11)}));
    }

    public void F(int i10) {
        E((float) i10, (float) ((int) this.f31675k));
    }

    public void G(float f10) {
        this.f31668d = f10;
    }

    public void H(boolean z10) {
        this.f31678n = z10;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        super.a();
        c(s());
    }

    public void cancel() {
        a();
        x();
    }

    public void doFrame(long j10) {
        float f10;
        float f11;
        w();
        if (this.f31676l != null && isRunning()) {
            if (C4065e.h()) {
                C4065e.b("LottieValueAnimator#doFrame");
            }
            long j11 = this.f31670f;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float o10 = ((float) j12) / o();
            float f12 = this.f31671g;
            if (s()) {
                o10 = -o10;
            }
            float f13 = f12 + o10;
            boolean d10 = k.d(f13, q(), p());
            float f14 = this.f31671g;
            float b10 = k.b(f13, q(), p());
            this.f31671g = b10;
            if (this.f31678n) {
                b10 = (float) Math.floor((double) b10);
            }
            this.f31672h = b10;
            this.f31670f = j10;
            if (!this.f31678n || this.f31671g != f14) {
                i();
            }
            if (!d10) {
                if (getRepeatCount() == -1 || this.f31673i < getRepeatCount()) {
                    e();
                    this.f31673i++;
                    if (getRepeatMode() == 2) {
                        this.f31669e = !this.f31669e;
                        A();
                    } else {
                        if (s()) {
                            f10 = p();
                        } else {
                            f10 = q();
                        }
                        this.f31671g = f10;
                        this.f31672h = f10;
                    }
                    this.f31670f = j10;
                } else {
                    if (this.f31668d < 0.0f) {
                        f11 = q();
                    } else {
                        f11 = p();
                    }
                    this.f31671g = f11;
                    this.f31672h = f11;
                    x();
                    c(s());
                }
            }
            I();
            if (C4065e.h()) {
                C4065e.c("LottieValueAnimator#doFrame");
            }
        }
    }

    public float getAnimatedFraction() {
        float q10;
        float p10;
        float q11;
        if (this.f31676l == null) {
            return 0.0f;
        }
        if (s()) {
            q10 = p() - this.f31672h;
            p10 = p();
            q11 = q();
        } else {
            q10 = this.f31672h - q();
            p10 = p();
            q11 = q();
        }
        return q10 / (p10 - q11);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(l());
    }

    public long getDuration() {
        C4071k kVar = this.f31676l;
        if (kVar == null) {
            return 0;
        }
        return (long) kVar.d();
    }

    public boolean isRunning() {
        return this.f31677m;
    }

    public void j() {
        this.f31676l = null;
        this.f31674j = -2.14748365E9f;
        this.f31675k = 2.14748365E9f;
    }

    public void k() {
        x();
        c(s());
    }

    public float l() {
        C4071k kVar = this.f31676l;
        if (kVar == null) {
            return 0.0f;
        }
        return (this.f31672h - kVar.p()) / (this.f31676l.f() - this.f31676l.p());
    }

    public float m() {
        return this.f31672h;
    }

    public float p() {
        C4071k kVar = this.f31676l;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f31675k;
        if (f10 == 2.14748365E9f) {
            return kVar.f();
        }
        return f10;
    }

    public float q() {
        C4071k kVar = this.f31676l;
        if (kVar == null) {
            return 0.0f;
        }
        float f10 = this.f31674j;
        if (f10 == -2.14748365E9f) {
            return kVar.p();
        }
        return f10;
    }

    public float r() {
        return this.f31668d;
    }

    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f31669e) {
            this.f31669e = false;
            A();
        }
    }

    public void t() {
        x();
        d();
    }

    public void u() {
        float f10;
        this.f31677m = true;
        h(s());
        if (s()) {
            f10 = p();
        } else {
            f10 = q();
        }
        C((float) ((int) f10));
        this.f31670f = 0;
        this.f31673i = 0;
        w();
    }

    /* access modifiers changed from: protected */
    public void w() {
        if (isRunning()) {
            y(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        y(true);
    }

    /* access modifiers changed from: protected */
    public void y(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f31677m = false;
        }
    }

    public void z() {
        this.f31677m = true;
        w();
        this.f31670f = 0;
        if (s() && m() == q()) {
            C(p());
        } else if (!s() && m() == p()) {
            C(q());
        }
        g();
    }
}
