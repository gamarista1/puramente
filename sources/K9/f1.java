package k9;

import N9.C3070t;
import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import ga.A;
import ia.C3607e;
import ja.C3651g;
import k9.T0;

public class f1 extends C3692e implements T0 {

    /* renamed from: b  reason: collision with root package name */
    private final C3685a0 f45557b;

    /* renamed from: c  reason: collision with root package name */
    private final C3651g f45558c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C3678B f45559a;

        public a(Context context) {
            this.f45559a = new C3678B(context);
        }

        public f1 a() {
            return this.f45559a.g();
        }

        public a b(C3607e eVar) {
            this.f45559a.n(eVar);
            return this;
        }

        public a c(Looper looper) {
            this.f45559a.o(looper);
            return this;
        }

        public a d(A a10) {
            this.f45559a.p(a10);
            return this;
        }
    }

    f1(C3678B b10) {
        C3651g gVar = new C3651g();
        this.f45558c = gVar;
        try {
            this.f45557b = new C3685a0(b10, this);
            gVar.e();
        } catch (Throwable th2) {
            this.f45558c.e();
            throw th2;
        }
    }

    private void j() {
        this.f45558c.b();
    }

    public int B() {
        j();
        return this.f45557b.B();
    }

    public long C() {
        j();
        return this.f45557b.O0();
    }

    public boolean D() {
        j();
        return this.f45557b.D();
    }

    /* renamed from: F */
    public r i() {
        j();
        return this.f45557b.i();
    }

    public void G(C3070t tVar) {
        j();
        this.f45557b.z1(tVar);
    }

    public void H() {
        j();
        this.f45557b.A1();
    }

    public void I(boolean z10) {
        j();
        this.f45557b.K1(z10);
    }

    public void J(S0 s02) {
        j();
        this.f45557b.L1(s02);
    }

    public void K(int i10) {
        j();
        this.f45557b.M1(i10);
    }

    public void L(Surface surface) {
        j();
        this.f45557b.P1(surface);
    }

    public void M(float f10) {
        j();
        this.f45557b.Q1(f10);
    }

    public void f(T0.d dVar) {
        j();
        this.f45557b.A0(dVar);
    }

    public boolean g() {
        j();
        return this.f45557b.g();
    }

    public long getCurrentPosition() {
        j();
        return this.f45557b.getCurrentPosition();
    }

    public long h() {
        j();
        return this.f45557b.h();
    }

    public int k() {
        j();
        return this.f45557b.k();
    }

    public int l() {
        j();
        return this.f45557b.J0();
    }

    public s1 m() {
        j();
        return this.f45557b.m();
    }

    public int n() {
        j();
        return this.f45557b.n();
    }

    public int p() {
        j();
        return this.f45557b.p();
    }

    public int r() {
        j();
        return this.f45557b.r();
    }

    public n1 s() {
        j();
        return this.f45557b.s();
    }

    public void t(int i10, long j10) {
        j();
        this.f45557b.t(i10, j10);
    }

    public boolean u() {
        j();
        return this.f45557b.u();
    }

    public int v() {
        j();
        return this.f45557b.v();
    }

    public int x() {
        j();
        return this.f45557b.x();
    }

    public long y() {
        j();
        return this.f45557b.K0();
    }

    public long z() {
        j();
        return this.f45557b.z();
    }
}
