package r0;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: r0.T  reason: case insensitive filesystem */
public final class C2467T implements Q1 {

    /* renamed from: a  reason: collision with root package name */
    private Paint f25459a;

    /* renamed from: b  reason: collision with root package name */
    private int f25460b;

    /* renamed from: c  reason: collision with root package name */
    private Shader f25461c;

    /* renamed from: d  reason: collision with root package name */
    private C2547y0 f25462d;

    public C2467T(Paint paint) {
        this.f25459a = paint;
        this.f25460b = C2490f0.f25500a.B();
    }

    public float a() {
        return C2468U.c(this.f25459a);
    }

    public C2547y0 b() {
        return this.f25462d;
    }

    public void c(float f10) {
        C2468U.k(this.f25459a, f10);
    }

    public long d() {
        return C2468U.d(this.f25459a);
    }

    public int e() {
        return this.f25460b;
    }

    public void f(C2547y0 y0Var) {
        this.f25462d = y0Var;
        C2468U.n(this.f25459a, y0Var);
    }

    public void g(int i10) {
        C2468U.r(this.f25459a, i10);
    }

    public void h(int i10) {
        if (!C2490f0.E(this.f25460b, i10)) {
            this.f25460b = i10;
            C2468U.l(this.f25459a, i10);
        }
    }

    public void i(int i10) {
        C2468U.o(this.f25459a, i10);
    }

    public void j(T1 t12) {
        C2468U.p(this.f25459a, t12);
    }

    public int k() {
        return C2468U.f(this.f25459a);
    }

    public void l(int i10) {
        C2468U.s(this.f25459a, i10);
    }

    public void m(long j10) {
        C2468U.m(this.f25459a, j10);
    }

    public T1 n() {
        return null;
    }

    public int o() {
        return C2468U.g(this.f25459a);
    }

    public float p() {
        return C2468U.h(this.f25459a);
    }

    public Paint q() {
        return this.f25459a;
    }

    public void r(Shader shader) {
        this.f25461c = shader;
        C2468U.q(this.f25459a, shader);
    }

    public Shader s() {
        return this.f25461c;
    }

    public void t(float f10) {
        C2468U.t(this.f25459a, f10);
    }

    public int u() {
        return C2468U.e(this.f25459a);
    }

    public void v(int i10) {
        C2468U.v(this.f25459a, i10);
    }

    public void w(float f10) {
        C2468U.u(this.f25459a, f10);
    }

    public float x() {
        return C2468U.i(this.f25459a);
    }

    public C2467T() {
        this(C2468U.j());
    }
}
