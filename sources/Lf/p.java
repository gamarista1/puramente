package Lf;

import Eg.n;
import Fg.B0;
import Fg.C5366d0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Fg.v0;
import Gg.g;
import Hg.l;
import Kg.d;
import Of.C5488f;
import Of.C5501t;
import Of.E;
import Of.h0;
import Pf.h;
import Rf.C5527p;
import Rf.G;
import Rf.U;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final G f64047a;

    static {
        C5527p pVar = new C5527p(l.f63471a.i(), o.f63946s);
        C5488f fVar = C5488f.INTERFACE;
        f g10 = o.f63949v.g();
        h0 h0Var = h0.f64497a;
        n nVar = Eg.f.f62842e;
        G g11 = new G(pVar, fVar, false, false, g10, h0Var, nVar);
        g11.M0(E.ABSTRACT);
        g11.O0(C5501t.f64509e);
        g11.N0(C6565s.e(U.R0(g11, h.f64602L.b(), false, N0.IN_VARIANCE, f.i("T"), 0, nVar)));
        g11.K0();
        f64047a = g11;
    }

    public static final C5366d0 a(S s10) {
        C6496s.h(s10, "suspendFunType");
        h.r(s10);
        i n10 = d.n(s10);
        h annotations = s10.getAnnotations();
        S k10 = h.k(s10);
        List e10 = h.e(s10);
        Iterable<B0> m10 = h.m(s10);
        ArrayList arrayList = new ArrayList(C6565s.y(m10, 10));
        for (B0 type : m10) {
            arrayList.add(type.getType());
        }
        r0 j10 = r0.f63046b.j();
        v0 l10 = f64047a.l();
        C6496s.g(l10, "getTypeConstructor(...)");
        List L02 = C6565s.L0(arrayList, V.k(j10, l10, C6565s.e(d.d(h.l(s10))), false, (g) null, 16, (Object) null));
        C5366d0 I10 = d.n(s10).I();
        C6496s.g(I10, "getNullableAnyType(...)");
        return h.c(n10, annotations, k10, e10, L02, (List) null, I10, false, 128, (Object) null).U0(s10.O0());
    }
}
