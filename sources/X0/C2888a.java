package x0;

import G0.a;
import c1.d;
import c1.r;
import c1.s;
import c1.t;
import r0.C2490f0;
import r0.C2520p0;
import r0.C2526r0;
import r0.C2544x0;
import r0.C2547y0;
import r0.H1;
import r0.I1;
import r0.J1;
import s0.C2581c;
import t0.C2600a;
import t0.C2605f;
import t0.C2606g;
import yf.C6798l;

/* renamed from: x0.a  reason: case insensitive filesystem */
public final class C2888a {

    /* renamed from: a  reason: collision with root package name */
    private H1 f28008a;

    /* renamed from: b  reason: collision with root package name */
    private C2520p0 f28009b;

    /* renamed from: c  reason: collision with root package name */
    private d f28010c;

    /* renamed from: d  reason: collision with root package name */
    private t f28011d = t.Ltr;

    /* renamed from: e  reason: collision with root package name */
    private long f28012e = r.f19235b.a();

    /* renamed from: f  reason: collision with root package name */
    private int f28013f = I1.f25425b.b();

    /* renamed from: g  reason: collision with root package name */
    private final C2600a f28014g = new C2600a();

    private final void a(C2605f fVar) {
        C2605f.c0(fVar, C2544x0.f25560b.a(), 0, 0, 0.0f, (C2606g) null, (C2547y0) null, C2490f0.f25500a.a(), 62, (Object) null);
    }

    public final void b(int i10, long j10, d dVar, t tVar, C6798l lVar) {
        int i11 = i10;
        d dVar2 = dVar;
        t tVar2 = tVar;
        this.f28010c = dVar2;
        this.f28011d = tVar2;
        H1 h12 = this.f28008a;
        C2520p0 p0Var = this.f28009b;
        if (h12 == null || p0Var == null || r.g(j10) > h12.e() || r.f(j10) > h12.d() || !I1.i(this.f28013f, i10)) {
            h12 = J1.b(r.g(j10), r.f(j10), i10, false, (C2581c) null, 24, (Object) null);
            p0Var = C2526r0.a(h12);
            this.f28008a = h12;
            this.f28009b = p0Var;
            this.f28013f = i11;
        }
        this.f28012e = j10;
        C2600a aVar = this.f28014g;
        long d10 = s.d(j10);
        C2600a.C0435a D10 = aVar.D();
        d a10 = D10.a();
        t b10 = D10.b();
        C2520p0 c10 = D10.c();
        long d11 = D10.d();
        C2600a.C0435a D11 = aVar.D();
        D11.j(dVar2);
        D11.k(tVar2);
        D11.i(p0Var);
        D11.l(d10);
        p0Var.q();
        a(aVar);
        lVar.invoke(aVar);
        p0Var.h();
        C2600a.C0435a D12 = aVar.D();
        D12.j(a10);
        D12.k(b10);
        D12.i(c10);
        D12.l(d11);
        h12.a();
    }

    public final void c(C2605f fVar, float f10, C2547y0 y0Var) {
        boolean z10;
        H1 h12 = this.f28008a;
        if (h12 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        C2605f.S(fVar, h12, 0, this.f28012e, 0, 0, f10, (C2606g) null, y0Var, 0, 0, 858, (Object) null);
    }

    public final H1 d() {
        return this.f28008a;
    }
}
