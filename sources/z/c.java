package Z;

import Y.C0;
import Y.C1477d;
import Y.C1483f;
import Y.C1485f1;
import Y.C1506p;
import Y.S0;
import Z.d;
import Z.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import yf.C6787a;
import yf.p;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final g f10333a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final g f10334b = new g();

    public final void a() {
        this.f10334b.m();
        this.f10333a.m();
    }

    public final void b(C6787a aVar, int i10, C1477d dVar) {
        boolean z10;
        boolean z11;
        g gVar;
        g gVar2;
        g gVar3 = this.f10333a;
        d.n nVar = d.n.f10358c;
        gVar3.y(nVar);
        g a10 = g.c.a(gVar3);
        g.c.d(a10, d.t.a(0), aVar);
        g.c.c(a10, d.q.a(0), i10);
        int i11 = 1;
        g.c.d(a10, d.t.a(1), dVar);
        if (gVar3.f10377g == gVar3.n(nVar.b()) && gVar3.f10378h == gVar3.n(nVar.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            int b10 = nVar.b();
            int i12 = 0;
            int i13 = 0;
            while (i13 < b10) {
                if (((i11 << i13) & gVar3.f10377g) != 0) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.e(d.q.a(i13)));
                    i12++;
                }
                i13++;
                i11 = 1;
            }
            String sb3 = sb2.toString();
            C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder();
            int d10 = nVar.d();
            int i14 = 0;
            int i15 = 0;
            while (i15 < d10) {
                if (((1 << i15) & gVar3.f10378h) != 0) {
                    if (i12 > 0) {
                        sb4.append(", ");
                    }
                    gVar2 = gVar3;
                    sb4.append(nVar.f(d.t.a(i15)));
                    i14++;
                } else {
                    gVar2 = gVar3;
                }
                i15++;
                gVar3 = gVar2;
            }
            String sb5 = sb4.toString();
            C6496s.g(sb5, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i12 + " int arguments (" + sb3 + ") and " + i14 + " object arguments (" + sb5 + ").");
        }
        g gVar4 = this.f10334b;
        d.u uVar = d.u.f10363c;
        gVar4.y(uVar);
        g a11 = g.c.a(gVar4);
        g.c.c(a11, d.q.a(0), i10);
        g.c.d(a11, d.t.a(0), dVar);
        if (gVar4.f10377g == gVar4.n(uVar.b()) && gVar4.f10378h == gVar4.n(uVar.d())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            StringBuilder sb6 = new StringBuilder();
            int b11 = uVar.b();
            int i16 = 0;
            for (int i17 = 0; i17 < b11; i17++) {
                if (((1 << i17) & gVar4.f10377g) != 0) {
                    if (i16 > 0) {
                        sb6.append(", ");
                    }
                    sb6.append(uVar.e(d.q.a(i17)));
                    i16++;
                }
            }
            String sb7 = sb6.toString();
            C6496s.g(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder();
            int d11 = uVar.d();
            int i18 = 0;
            int i19 = 0;
            while (i19 < d11) {
                if (((1 << i19) & gVar4.f10378h) != 0) {
                    if (i16 > 0) {
                        sb8.append(", ");
                    }
                    gVar = gVar4;
                    sb8.append(uVar.f(d.t.a(i19)));
                    i18++;
                } else {
                    gVar = gVar4;
                }
                i19++;
                gVar4 = gVar;
            }
            String sb9 = sb8.toString();
            C6496s.g(sb9, "StringBuilder().apply(builderAction).toString()");
            C0.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i16 + " int arguments (" + sb7 + ") and " + i18 + " object arguments (" + sb9 + ").");
        }
    }

    public final void c() {
        if (!this.f10334b.u()) {
            C1506p.r("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f10334b.w(this.f10333a);
    }

    public final void d(C1483f fVar, C1485f1 f1Var, S0 s02) {
        if (!this.f10334b.t()) {
            C1506p.r("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f10333a.r(fVar, f1Var, s02);
    }

    public final boolean e() {
        return this.f10333a.t();
    }

    public final void f(Object obj, p pVar) {
        boolean z10;
        g gVar = this.f10333a;
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
}
