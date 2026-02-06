package Gg;

import Fg.B0;
import Fg.C5366d0;
import Fg.G0;
import Fg.M0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.w0;
import Gg.f;
import Jg.b;
import Kg.d;
import Of.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class o {
    private static final List a(M0 m02, b bVar) {
        M0 m03;
        if (m02.L0().size() != m02.N0().getParameters().size()) {
            return null;
        }
        List L02 = m02.L0();
        Iterable<B0> iterable = L02;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (B0 b10 : iterable) {
                if (b10.b() != N0.INVARIANT) {
                    List parameters = m02.N0().getParameters();
                    C6496s.g(parameters, "getParameters(...)");
                    Iterable<Pair> n12 = C6565s.n1(iterable, parameters);
                    ArrayList arrayList = new ArrayList(C6565s.y(n12, 10));
                    for (Pair pair : n12) {
                        B0 b02 = (B0) pair.a();
                        m0 m0Var = (m0) pair.b();
                        if (b02.b() != N0.INVARIANT) {
                            if (b02.a() || b02.b() != N0.IN_VARIANCE) {
                                m03 = null;
                            } else {
                                m03 = b02.getType().Q0();
                            }
                            C6496s.e(m0Var);
                            b02 = d.d(new i(bVar, m03, b02, m0Var));
                        }
                        arrayList.add(b02);
                    }
                    G0 c10 = w0.f63074c.b(m02.N0(), arrayList).c();
                    int size = L02.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        B0 b03 = (B0) L02.get(i10);
                        B0 b04 = (B0) arrayList.get(i10);
                        if (b03.b() != N0.INVARIANT) {
                            List<S> upperBounds = ((m0) m02.N0().getParameters().get(i10)).getUpperBounds();
                            C6496s.g(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            for (S n10 : upperBounds) {
                                arrayList2.add(f.a.f63179a.a(c10.n(n10, N0.INVARIANT).Q0()));
                            }
                            if (!b03.a() && b03.b() == N0.OUT_VARIANCE) {
                                arrayList2.add(f.a.f63179a.a(b03.getType().Q0()));
                            }
                            S type = b04.getType();
                            C6496s.f(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).N0().j(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final C5366d0 b(C5366d0 d0Var, b bVar) {
        C6496s.h(d0Var, "type");
        C6496s.h(bVar, "status");
        List a10 = a(d0Var, bVar);
        if (a10 != null) {
            return c(d0Var, a10);
        }
        return null;
    }

    private static final C5366d0 c(M0 m02, List list) {
        return V.k(m02.M0(), m02.N0(), list, m02.O0(), (g) null, 16, (Object) null);
    }
}
