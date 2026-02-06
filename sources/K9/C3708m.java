package k9;

import ja.C3645a;
import ja.C3648d;
import ja.E;
import ja.u;

/* renamed from: k9.m  reason: case insensitive filesystem */
final class C3708m implements u {

    /* renamed from: a  reason: collision with root package name */
    private final E f45625a;

    /* renamed from: b  reason: collision with root package name */
    private final a f45626b;

    /* renamed from: c  reason: collision with root package name */
    private a1 f45627c;

    /* renamed from: d  reason: collision with root package name */
    private u f45628d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45629e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45630f;

    /* renamed from: k9.m$a */
    public interface a {
        void o(S0 s02);
    }

    public C3708m(a aVar, C3648d dVar) {
        this.f45626b = aVar;
        this.f45625a = new E(dVar);
    }

    private boolean e(boolean z10) {
        a1 a1Var = this.f45627c;
        if (a1Var == null || a1Var.b() || (!this.f45627c.d() && (z10 || this.f45627c.h()))) {
            return true;
        }
        return false;
    }

    private void j(boolean z10) {
        if (e(z10)) {
            this.f45629e = true;
            if (this.f45630f) {
                this.f45625a.b();
                return;
            }
            return;
        }
        u uVar = (u) C3645a.e(this.f45628d);
        long u10 = uVar.u();
        if (this.f45629e) {
            if (u10 < this.f45625a.u()) {
                this.f45625a.d();
                return;
            }
            this.f45629e = false;
            if (this.f45630f) {
                this.f45625a.b();
            }
        }
        this.f45625a.a(u10);
        S0 c10 = uVar.c();
        if (!c10.equals(this.f45625a.c())) {
            this.f45625a.f(c10);
            this.f45626b.o(c10);
        }
    }

    public void a(a1 a1Var) {
        if (a1Var == this.f45627c) {
            this.f45628d = null;
            this.f45627c = null;
            this.f45629e = true;
        }
    }

    public void b(a1 a1Var) {
        u uVar;
        u A10 = a1Var.A();
        if (A10 != null && A10 != (uVar = this.f45628d)) {
            if (uVar == null) {
                this.f45628d = A10;
                this.f45627c = a1Var;
                A10.f(this.f45625a.c());
                return;
            }
            throw r.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public S0 c() {
        u uVar = this.f45628d;
        if (uVar != null) {
            return uVar.c();
        }
        return this.f45625a.c();
    }

    public void d(long j10) {
        this.f45625a.a(j10);
    }

    public void f(S0 s02) {
        u uVar = this.f45628d;
        if (uVar != null) {
            uVar.f(s02);
            s02 = this.f45628d.c();
        }
        this.f45625a.f(s02);
    }

    public void g() {
        this.f45630f = true;
        this.f45625a.b();
    }

    public void h() {
        this.f45630f = false;
        this.f45625a.d();
    }

    public long i(boolean z10) {
        j(z10);
        return u();
    }

    public long u() {
        if (this.f45629e) {
            return this.f45625a.u();
        }
        return ((u) C3645a.e(this.f45628d)).u();
    }
}
