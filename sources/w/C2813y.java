package w;

import Ef.m;

/* renamed from: w.y  reason: case insensitive filesystem */
public final class C2813y implements C2788d {

    /* renamed from: a  reason: collision with root package name */
    private final w0 f27641a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f27642b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f27643c;

    /* renamed from: d  reason: collision with root package name */
    private final C2805q f27644d;

    /* renamed from: e  reason: collision with root package name */
    private final C2805q f27645e;

    /* renamed from: f  reason: collision with root package name */
    private final C2805q f27646f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f27647g;

    /* renamed from: h  reason: collision with root package name */
    private final long f27648h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f27649i;

    public C2813y(w0 w0Var, r0 r0Var, Object obj, C2805q qVar) {
        this.f27641a = w0Var;
        this.f27642b = r0Var;
        this.f27643c = obj;
        C2805q qVar2 = (C2805q) e().a().invoke(obj);
        this.f27644d = qVar2;
        this.f27645e = C2806r.e(qVar);
        this.f27647g = e().b().invoke(w0Var.b(qVar2, qVar));
        this.f27648h = w0Var.c(qVar2, qVar);
        C2805q e10 = C2806r.e(w0Var.e(d(), qVar2, qVar));
        this.f27646f = e10;
        int b10 = e10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar3 = this.f27646f;
            qVar3.e(i10, m.k(qVar3.a(i10), -this.f27641a.a(), this.f27641a.a()));
        }
    }

    public boolean a() {
        return this.f27649i;
    }

    public C2805q b(long j10) {
        if (!c(j10)) {
            return this.f27641a.e(j10, this.f27644d, this.f27645e);
        }
        return this.f27646f;
    }

    public long d() {
        return this.f27648h;
    }

    public r0 e() {
        return this.f27642b;
    }

    public Object f(long j10) {
        if (!c(j10)) {
            return e().b().invoke(this.f27641a.d(j10, this.f27644d, this.f27645e));
        }
        return g();
    }

    public Object g() {
        return this.f27647g;
    }

    public C2813y(C2814z zVar, r0 r0Var, Object obj, C2805q qVar) {
        this(zVar.a(r0Var), r0Var, obj, qVar);
    }
}
