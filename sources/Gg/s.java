package Gg;

import Fg.u0;
import Gg.b;
import Jg.a;
import Jg.e;
import Jg.f;
import Jg.g;
import Jg.i;
import Jg.j;
import Jg.k;
import Jg.l;
import Jg.m;
import Jg.n;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import ng.c;
import ng.d;

public final class s implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final s f63205a = new s();

    private s() {
    }

    public List A(n nVar) {
        return b.a.x(this, nVar);
    }

    public int A0(m mVar) {
        return b.a.h0(this, mVar);
    }

    public n B(m mVar) {
        return b.a.v(this, mVar);
    }

    public boolean B0(i iVar, c cVar) {
        return b.a.A(this, iVar, cVar);
    }

    public boolean C(m mVar) {
        return b.a.E(this, mVar);
    }

    public boolean C0(m mVar) {
        return b.a.P(this, mVar);
    }

    public i D(Collection collection) {
        return b.a.D(this, collection);
    }

    public Jg.s D0(l lVar) {
        return b.a.y(this, lVar);
    }

    public e E(j jVar) {
        return b.a.e(this, jVar);
    }

    public i E0(l lVar) {
        return b.a.u(this, lVar);
    }

    public boolean F(m mVar, m mVar2) {
        return b.a.a(this, mVar, mVar2);
    }

    public boolean F0(i iVar) {
        C6496s.h(iVar, "<this>");
        if (i(v0(iVar)) != i(k(iVar))) {
            return true;
        }
        return false;
    }

    public d G(m mVar) {
        return b.a.o(this, mVar);
    }

    public List G0(m mVar) {
        return b.a.q(this, mVar);
    }

    public u0.c H(j jVar) {
        return b.a.k0(this, jVar);
    }

    public f H0(g gVar) {
        b.a.f(this, gVar);
        return null;
    }

    public boolean I() {
        return b.a.M(this);
    }

    public u0 I0(boolean z10, boolean z11) {
        return b.a.f0(this, z10, z11);
    }

    public m J(i iVar) {
        C6496s.h(iVar, "<this>");
        j f10 = f(iVar);
        if (f10 == null) {
            f10 = v0(iVar);
        }
        return b(f10);
    }

    public boolean K(i iVar) {
        Jg.d dVar;
        C6496s.h(iVar, "<this>");
        j f10 = f(iVar);
        if (f10 != null) {
            dVar = a(f10);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return true;
        }
        return false;
    }

    public boolean L(i iVar) {
        C6496s.h(iVar, "<this>");
        g o10 = o(iVar);
        if (o10 == null) {
            return false;
        }
        H0(o10);
        return false;
    }

    public l M(i iVar, int i10) {
        return b.a.m(this, iVar, i10);
    }

    public int N(k kVar) {
        C6496s.h(kVar, "<this>");
        if (kVar instanceof j) {
            return t0((i) kVar);
        }
        if (kVar instanceof a) {
            return ((a) kVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + O.b(kVar.getClass())).toString());
    }

    public i O(n nVar) {
        return b.a.t(this, nVar);
    }

    public Jg.s P(n nVar) {
        return b.a.z(this, nVar);
    }

    public i Q(j jVar, j jVar2) {
        return b.a.l(this, jVar, jVar2);
    }

    public List R(i iVar) {
        return b.a.n(this, iVar);
    }

    public boolean S(i iVar) {
        e eVar;
        C6496s.h(iVar, "<this>");
        j f10 = f(iVar);
        if (f10 != null) {
            eVar = E(f10);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return true;
        }
        return false;
    }

    public boolean T(m mVar) {
        return b.a.K(this, mVar);
    }

    public j U(e eVar) {
        return b.a.g0(this, eVar);
    }

    public l V(j jVar, int i10) {
        C6496s.h(jVar, "<this>");
        if (i10 < 0 || i10 >= t0(jVar)) {
            return null;
        }
        return M(jVar, i10);
    }

    public l W(i iVar) {
        return b.a.i(this, iVar);
    }

    public List X(j jVar, m mVar) {
        C6496s.h(jVar, "<this>");
        C6496s.h(mVar, "constructor");
        return null;
    }

    public boolean Y(n nVar, m mVar) {
        return b.a.B(this, nVar, mVar);
    }

    public Lf.l Z(m mVar) {
        return b.a.r(this, mVar);
    }

    public Jg.d a(j jVar) {
        return b.a.d(this, jVar);
    }

    public boolean a0(i iVar) {
        return b.a.I(this, iVar);
    }

    public m b(j jVar) {
        return b.a.n0(this, jVar);
    }

    public i b0(i iVar) {
        return b.a.w(this, iVar);
    }

    public j c(g gVar) {
        return b.a.c0(this, gVar);
    }

    public boolean c0(Jg.d dVar) {
        return b.a.R(this, dVar);
    }

    public j d(j jVar, boolean z10) {
        return b.a.q0(this, jVar, z10);
    }

    public i d0(i iVar, boolean z10) {
        return b.a.e0(this, iVar, z10);
    }

    public j e(g gVar) {
        return b.a.o0(this, gVar);
    }

    public boolean e0(i iVar) {
        C6496s.h(iVar, "<this>");
        return !C6496s.c(b(v0(iVar)), b(k(iVar)));
    }

    public j f(i iVar) {
        return b.a.h(this, iVar);
    }

    public boolean f0(j jVar, j jVar2) {
        return b.a.C(this, jVar, jVar2);
    }

    public boolean g(j jVar) {
        return b.a.V(this, jVar);
    }

    public boolean g0(i iVar) {
        C6496s.h(iVar, "<this>");
        if (!(iVar instanceof j) || !i((j) iVar)) {
            return false;
        }
        return true;
    }

    public boolean h(i iVar) {
        return b.a.a0(this, iVar);
    }

    public Jg.b h0(Jg.d dVar) {
        return b.a.k(this, dVar);
    }

    public boolean i(j jVar) {
        return b.a.N(this, jVar);
    }

    public i i0(Jg.d dVar) {
        return b.a.d0(this, dVar);
    }

    public boolean j(l lVar) {
        return b.a.X(this, lVar);
    }

    public boolean j0(m mVar) {
        return b.a.J(this, mVar);
    }

    public j k(i iVar) {
        j e10;
        C6496s.h(iVar, "<this>");
        g o10 = o(iVar);
        if (o10 != null && (e10 = e(o10)) != null) {
            return e10;
        }
        j f10 = f(iVar);
        C6496s.e(f10);
        return f10;
    }

    public boolean k0(j jVar) {
        C6496s.h(jVar, "<this>");
        return r0(b(jVar));
    }

    public Lf.l l(m mVar) {
        return b.a.s(this, mVar);
    }

    public boolean l0(j jVar) {
        return b.a.S(this, jVar);
    }

    public i m(i iVar) {
        C6496s.h(iVar, "<this>");
        return d0(iVar, false);
    }

    public boolean m0(i iVar) {
        return b.a.U(this, iVar);
    }

    public boolean n(j jVar) {
        C6496s.h(jVar, "<this>");
        return T(b(jVar));
    }

    public l n0(Jg.c cVar) {
        return b.a.j0(this, cVar);
    }

    public g o(i iVar) {
        return b.a.g(this, iVar);
    }

    public boolean o0(m mVar) {
        return b.a.G(this, mVar);
    }

    public boolean p(Jg.d dVar) {
        return b.a.T(this, dVar);
    }

    public boolean p0(m mVar) {
        return b.a.L(this, mVar);
    }

    public n q(m mVar, int i10) {
        return b.a.p(this, mVar, i10);
    }

    public boolean q0(m mVar) {
        return b.a.H(this, mVar);
    }

    public Collection r(j jVar) {
        return b.a.i0(this, jVar);
    }

    public boolean r0(m mVar) {
        return b.a.F(this, mVar);
    }

    public Jg.c s(Jg.d dVar) {
        return b.a.m0(this, dVar);
    }

    public j s0(j jVar, Jg.b bVar) {
        return b.a.j(this, jVar, bVar);
    }

    public boolean t(j jVar) {
        return b.a.Y(this, jVar);
    }

    public int t0(i iVar) {
        return b.a.b(this, iVar);
    }

    public i u(i iVar, boolean z10) {
        return b.a.p0(this, iVar, z10);
    }

    public j u0(j jVar) {
        j U10;
        C6496s.h(jVar, "<this>");
        e E10 = E(jVar);
        if (E10 == null || (U10 = U(E10)) == null) {
            return jVar;
        }
        return U10;
    }

    public boolean v(m mVar) {
        return b.a.b0(this, mVar);
    }

    public j v0(i iVar) {
        j c10;
        C6496s.h(iVar, "<this>");
        g o10 = o(iVar);
        if (o10 != null && (c10 = c(o10)) != null) {
            return c10;
        }
        j f10 = f(iVar);
        C6496s.e(f10);
        return f10;
    }

    public boolean w(i iVar) {
        return b.a.Q(this, iVar);
    }

    public Collection w0(m mVar) {
        return b.a.l0(this, mVar);
    }

    public i x(i iVar) {
        j d10;
        C6496s.h(iVar, "<this>");
        j f10 = f(iVar);
        if (f10 == null || (d10 = d(f10, true)) == null) {
            return iVar;
        }
        return d10;
    }

    public k x0(j jVar) {
        return b.a.c(this, jVar);
    }

    public l y(k kVar, int i10) {
        C6496s.h(kVar, "<this>");
        if (kVar instanceof j) {
            return M((i) kVar, i10);
        }
        if (kVar instanceof a) {
            Object obj = ((a) kVar).get(i10);
            C6496s.g(obj, "get(...)");
            return (l) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + O.b(kVar.getClass())).toString());
    }

    public boolean y0(i iVar) {
        C6496s.h(iVar, "<this>");
        if (!C0(J(iVar)) || w(iVar)) {
            return false;
        }
        return true;
    }

    public boolean z(j jVar) {
        return b.a.Z(this, jVar);
    }

    public boolean z0(i iVar) {
        return b.a.O(this, iVar);
    }
}
