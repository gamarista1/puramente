package Z;

import Y.C0;
import Y.C1476c1;
import Y.C1477d;
import Y.C1483f;
import Y.C1485f1;
import Y.C1496k;
import Y.C1499l0;
import Y.C1501m0;
import Y.C1508q;
import Y.S0;
import Y.T0;
import Y.r;
import Z.d;
import Z.g;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private final g f10318a = new g();

    public final void A() {
        this.f10318a.x(d.A.f10337c);
    }

    public final void B(int i10) {
        boolean z10;
        g gVar = this.f10318a;
        d.B b10 = d.B.f10338c;
        gVar.y(b10);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f10377g == gVar.n(b10.b()) && gVar.f10378h == gVar.n(b10.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b11 = b10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b11; i12++) {
                if (((1 << i12) & gVar.f10377g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(b10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = b10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f10378h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(b10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + b10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void C(Object obj, C1477d dVar, int i10) {
        boolean z10;
        g gVar = this.f10318a;
        d.C c10 = d.C.f10339c;
        gVar.y(c10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), obj);
        g.c.d(a10, d.t.a(1), dVar);
        g.c.c(a10, d.q.a(0), i10);
        if (gVar.f10377g == gVar.n(c10.b()) && gVar.f10378h == gVar.n(c10.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = c10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f10377g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = c10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f10378h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(c10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + c10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void D(Object obj) {
        boolean z10;
        g gVar = this.f10318a;
        d.D d10 = d.D.f10340c;
        gVar.y(d10);
        g.c.d(g.c.a(gVar), d.t.a(0), obj);
        if (gVar.f10377g == gVar.n(d10.b()) && gVar.f10378h == gVar.n(d10.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = d10.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(d10.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d11 = d10.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d11; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(d10.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + d10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void E(Object obj, p pVar) {
        boolean z10;
        g gVar = this.f10318a;
        d.E e10 = d.E.f10341c;
        gVar.y(e10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), obj);
        int a11 = d.t.a(1);
        C6496s.f(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(a10, a11, (p) V.f(pVar, 2));
        if (gVar.f10377g == gVar.n(e10.b()) && gVar.f10378h == gVar.n(e10.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = e10.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(e10.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = e10.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(e10.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + e10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void F(Object obj, int i10) {
        boolean z10;
        g gVar = this.f10318a;
        d.F f10 = d.F.f10342c;
        gVar.y(f10);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), obj);
        g.c.c(a10, d.q.a(0), i10);
        if (gVar.f10377g == gVar.n(f10.b()) && gVar.f10378h == gVar.n(f10.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = f10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f10377g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(f10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = f10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f10378h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(f10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + f10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void G(int i10) {
        boolean z10;
        g gVar = this.f10318a;
        d.G g10 = d.G.f10343c;
        gVar.y(g10);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f10377g == gVar.n(g10.b()) && gVar.f10378h == gVar.n(g10.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = g10.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f10377g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(g10.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = g10.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f10378h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(g10.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + g10 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void H(Object obj) {
        if (obj instanceof C1496k) {
            this.f10318a.x(d.H.f10344c);
        }
    }

    public final void a() {
        this.f10318a.m();
    }

    public final void b(C1483f fVar, C1485f1 f1Var, S0 s02) {
        this.f10318a.r(fVar, f1Var, s02);
    }

    public final boolean c() {
        return this.f10318a.t();
    }

    public final boolean d() {
        return this.f10318a.u();
    }

    public final void e(int i10) {
        boolean z10;
        g gVar = this.f10318a;
        d.C1527a aVar = d.C1527a.f10345c;
        gVar.y(aVar);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f10377g == gVar.n(aVar.b()) && gVar.f10378h == gVar.n(aVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = aVar.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f10377g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(aVar.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = aVar.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f10378h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(aVar.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + aVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void f(C1477d dVar, Object obj) {
        boolean z10;
        g gVar = this.f10318a;
        d.C1528b bVar = d.C1528b.f10346c;
        gVar.y(bVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), obj);
        if (gVar.f10377g == gVar.n(bVar.b()) && gVar.f10378h == gVar.n(bVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = bVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(bVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = bVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(bVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + bVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void g(List list, g0.d dVar) {
        boolean z10;
        if (!list.isEmpty()) {
            g gVar = this.f10318a;
            d.C0191d dVar2 = d.C0191d.f10348c;
            gVar.y(dVar2);
            g a10 = g.c.a(gVar);
            g.c.d(a10, d.t.a(1), list);
            g.c.d(a10, d.t.a(0), dVar);
            if (gVar.f10377g == gVar.n(dVar2.b()) && gVar.f10378h == gVar.n(dVar2.d())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                int b10 = dVar2.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b10; i11++) {
                    if (((1 << i11) & gVar.f10377g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(dVar2.e(d.q.a(i11)));
                        i10++;
                    }
                }
                String sb3 = sb2.toString();
                C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder();
                int d10 = dVar2.d();
                int i12 = 0;
                for (int i13 = 0; i13 < d10; i13++) {
                    if (((1 << i13) & gVar.f10378h) != 0) {
                        if (i10 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(dVar2.f(d.t.a(i13)));
                        i12++;
                    }
                }
                String sb5 = sb4.toString();
                C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
                C0.b("Error while pushing " + dVar2 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
            }
        }
    }

    public final void h(C1499l0 l0Var, r rVar, C1501m0 m0Var, C1501m0 m0Var2) {
        boolean z10;
        g gVar = this.f10318a;
        d.C1530e eVar = d.C1530e.f10349c;
        gVar.y(eVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), l0Var);
        g.c.d(a10, d.t.a(1), rVar);
        g.c.d(a10, d.t.a(3), m0Var2);
        g.c.d(a10, d.t.a(2), m0Var);
        if (gVar.f10377g == gVar.n(eVar.b()) && gVar.f10378h == gVar.n(eVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = eVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(eVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = eVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(eVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + eVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void i() {
        this.f10318a.x(d.C1531f.f10350c);
    }

    public final void j(g0.d dVar, C1477d dVar2) {
        boolean z10;
        g gVar = this.f10318a;
        d.C1532g gVar2 = d.C1532g.f10351c;
        gVar.y(gVar2);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), dVar2);
        if (gVar.f10377g == gVar.n(gVar2.b()) && gVar.f10378h == gVar.n(gVar2.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = gVar2.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(gVar2.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = gVar2.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(gVar2.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + gVar2 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void k(Object[] objArr) {
        boolean z10;
        boolean z11;
        if (objArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            g gVar = this.f10318a;
            d.C1533h hVar = d.C1533h.f10352c;
            gVar.y(hVar);
            g.c.d(g.c.a(gVar), d.t.a(0), objArr);
            if (gVar.f10377g == gVar.n(hVar.b()) && gVar.f10378h == gVar.n(hVar.d())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                StringBuilder sb2 = new StringBuilder();
                int b10 = hVar.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b10; i11++) {
                    if (((1 << i11) & gVar.f10377g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(hVar.e(d.q.a(i11)));
                        i10++;
                    }
                }
                String sb3 = sb2.toString();
                C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder();
                int d10 = hVar.d();
                int i12 = 0;
                for (int i13 = 0; i13 < d10; i13++) {
                    if (((1 << i13) & gVar.f10378h) != 0) {
                        if (i10 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(hVar.f(d.t.a(i13)));
                        i12++;
                    }
                }
                String sb5 = sb4.toString();
                C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
                C0.b("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
            }
        }
    }

    public final void l(C6798l lVar, C1508q qVar) {
        boolean z10;
        g gVar = this.f10318a;
        d.i iVar = d.i.f10353c;
        gVar.y(iVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), lVar);
        g.c.d(a10, d.t.a(1), qVar);
        if (gVar.f10377g == gVar.n(iVar.b()) && gVar.f10378h == gVar.n(iVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = iVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(iVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = iVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(iVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + iVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void m() {
        this.f10318a.x(d.j.f10354c);
    }

    public final void n() {
        this.f10318a.x(d.k.f10355c);
    }

    public final void o(C1477d dVar) {
        boolean z10;
        g gVar = this.f10318a;
        d.l lVar = d.l.f10356c;
        gVar.y(lVar);
        g.c.d(g.c.a(gVar), d.t.a(0), dVar);
        if (gVar.f10377g == gVar.n(lVar.b()) && gVar.f10378h == gVar.n(lVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = lVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(lVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = lVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(lVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + lVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void p() {
        this.f10318a.x(d.m.f10357c);
    }

    public final void q(a aVar, g0.d dVar) {
        boolean z10;
        if (aVar.d()) {
            g gVar = this.f10318a;
            d.C1529c cVar = d.C1529c.f10347c;
            gVar.y(cVar);
            g a10 = g.c.a(gVar);
            g.c.d(a10, d.t.a(0), aVar);
            g.c.d(a10, d.t.a(1), dVar);
            if (gVar.f10377g == gVar.n(cVar.b()) && gVar.f10378h == gVar.n(cVar.d())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                int b10 = cVar.b();
                int i10 = 0;
                for (int i11 = 0; i11 < b10; i11++) {
                    if (((1 << i11) & gVar.f10377g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(cVar.e(d.q.a(i11)));
                        i10++;
                    }
                }
                String sb3 = sb2.toString();
                C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder();
                int d10 = cVar.d();
                int i12 = 0;
                for (int i13 = 0; i13 < d10; i13++) {
                    if (((1 << i13) & gVar.f10378h) != 0) {
                        if (i10 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(cVar.f(d.t.a(i13)));
                        i12++;
                    }
                }
                String sb5 = sb4.toString();
                C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
                C0.b("Error while pushing " + cVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
            }
        }
    }

    public final void r(C1477d dVar, C1476c1 c1Var) {
        boolean z10;
        g gVar = this.f10318a;
        d.o oVar = d.o.f10359c;
        gVar.y(oVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), c1Var);
        if (gVar.f10377g == gVar.n(oVar.b()) && gVar.f10378h == gVar.n(oVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = oVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(oVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = oVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(oVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void s(C1477d dVar, C1476c1 c1Var, c cVar) {
        boolean z10;
        g gVar = this.f10318a;
        d.p pVar = d.p.f10360c;
        gVar.y(pVar);
        g a10 = g.c.a(gVar);
        g.c.d(a10, d.t.a(0), dVar);
        g.c.d(a10, d.t.a(1), c1Var);
        g.c.d(a10, d.t.a(2), cVar);
        if (gVar.f10377g == gVar.n(pVar.b()) && gVar.f10378h == gVar.n(pVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = pVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(pVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = pVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(pVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void t(int i10) {
        boolean z10;
        g gVar = this.f10318a;
        d.r rVar = d.r.f10361c;
        gVar.y(rVar);
        g.c.c(g.c.a(gVar), d.q.a(0), i10);
        if (gVar.f10377g == gVar.n(rVar.b()) && gVar.f10378h == gVar.n(rVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = rVar.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b10; i12++) {
                if (((1 << i12) & gVar.f10377g) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(rVar.e(d.q.a(i12)));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = rVar.d();
            int i13 = 0;
            for (int i14 = 0; i14 < d10; i14++) {
                if (((1 << i14) & gVar.f10378h) != 0) {
                    if (i11 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(rVar.f(d.t.a(i14)));
                    i13++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + sb3 + ") and " + i13 + " object arguments (" + sb5 + ").");
        }
    }

    public final void u(int i10, int i11, int i12) {
        boolean z10;
        g gVar = this.f10318a;
        d.s sVar = d.s.f10362c;
        gVar.y(sVar);
        g a10 = g.c.a(gVar);
        g.c.c(a10, d.q.a(1), i10);
        g.c.c(a10, d.q.a(0), i11);
        g.c.c(a10, d.q.a(2), i12);
        if (gVar.f10377g == gVar.n(sVar.b()) && gVar.f10378h == gVar.n(sVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = sVar.b();
            int i13 = 0;
            for (int i14 = 0; i14 < b10; i14++) {
                if (((1 << i14) & gVar.f10377g) != 0) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(sVar.e(d.q.a(i14)));
                    i13++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = sVar.d();
            int i15 = 0;
            for (int i16 = 0; i16 < d10; i16++) {
                if (((1 << i16) & gVar.f10378h) != 0) {
                    if (i13 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(sVar.f(d.t.a(i16)));
                    i15++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i13 + " int arguments (" + sb3 + ") and " + i15 + " object arguments (" + sb5 + ").");
        }
    }

    public final void v(T0 t02) {
        boolean z10;
        g gVar = this.f10318a;
        d.v vVar = d.v.f10364c;
        gVar.y(vVar);
        g.c.d(g.c.a(gVar), d.t.a(0), t02);
        if (gVar.f10377g == gVar.n(vVar.b()) && gVar.f10378h == gVar.n(vVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = vVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(vVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = vVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(vVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }

    public final void w() {
        this.f10318a.x(d.w.f10365c);
    }

    public final void x(int i10, int i11) {
        boolean z10;
        g gVar = this.f10318a;
        d.x xVar = d.x.f10366c;
        gVar.y(xVar);
        g a10 = g.c.a(gVar);
        g.c.c(a10, d.q.a(0), i10);
        g.c.c(a10, d.q.a(1), i11);
        if (gVar.f10377g == gVar.n(xVar.b()) && gVar.f10378h == gVar.n(xVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = xVar.b();
            int i12 = 0;
            for (int i13 = 0; i13 < b10; i13++) {
                if (((1 << i13) & gVar.f10377g) != 0) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(xVar.e(d.q.a(i13)));
                    i12++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = xVar.d();
            int i14 = 0;
            for (int i15 = 0; i15 < d10; i15++) {
                if (((1 << i15) & gVar.f10378h) != 0) {
                    if (i12 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(xVar.f(d.t.a(i15)));
                    i14++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + xVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + sb3 + ") and " + i14 + " object arguments (" + sb5 + ").");
        }
    }

    public final void y() {
        this.f10318a.x(d.y.f10367c);
    }

    public final void z(C6787a aVar) {
        boolean z10;
        g gVar = this.f10318a;
        d.z zVar = d.z.f10368c;
        gVar.y(zVar);
        g.c.d(g.c.a(gVar), d.t.a(0), aVar);
        if (gVar.f10377g == gVar.n(zVar.b()) && gVar.f10378h == gVar.n(zVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = zVar.b();
            int i10 = 0;
            for (int i11 = 0; i11 < b10; i11++) {
                if (((1 << i11) & gVar.f10377g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(zVar.e(d.q.a(i11)));
                    i10++;
                }
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = zVar.d();
            int i12 = 0;
            for (int i13 = 0; i13 < d10; i13++) {
                if (((1 << i13) & gVar.f10378h) != 0) {
                    if (i10 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(zVar.f(d.t.a(i13)));
                    i12++;
                }
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + zVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + sb3 + ") and " + i12 + " object arguments (" + sb5 + ").");
        }
    }
}
