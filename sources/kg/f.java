package kg;

import ig.c;
import ig.i;
import ig.n;
import ig.q;
import ig.r;
import ig.s;
import ig.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class f {
    public static final q a(q qVar, g gVar) {
        C6496s.h(qVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (qVar.k0()) {
            return qVar.R();
        }
        if (qVar.l0()) {
            return gVar.a(qVar.S());
        }
        return null;
    }

    public static final List b(c cVar, g gVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(gVar, "typeTable");
        List y02 = cVar.y0();
        if (y02.isEmpty()) {
            y02 = null;
        }
        if (y02 == null) {
            List x02 = cVar.x0();
            C6496s.g(x02, "getContextReceiverTypeIdList(...)");
            Iterable<Integer> iterable = x02;
            y02 = new ArrayList(C6565s.y(iterable, 10));
            for (Integer num : iterable) {
                C6496s.e(num);
                y02.add(gVar.a(num.intValue()));
            }
        }
        return y02;
    }

    public static final List c(i iVar, g gVar) {
        C6496s.h(iVar, "<this>");
        C6496s.h(gVar, "typeTable");
        List Y10 = iVar.Y();
        if (Y10.isEmpty()) {
            Y10 = null;
        }
        if (Y10 == null) {
            List X10 = iVar.X();
            C6496s.g(X10, "getContextReceiverTypeIdList(...)");
            Iterable<Integer> iterable = X10;
            Y10 = new ArrayList(C6565s.y(iterable, 10));
            for (Integer num : iterable) {
                C6496s.e(num);
                Y10.add(gVar.a(num.intValue()));
            }
        }
        return Y10;
    }

    public static final List d(n nVar, g gVar) {
        C6496s.h(nVar, "<this>");
        C6496s.h(gVar, "typeTable");
        List X10 = nVar.X();
        if (X10.isEmpty()) {
            X10 = null;
        }
        if (X10 == null) {
            List W10 = nVar.W();
            C6496s.g(W10, "getContextReceiverTypeIdList(...)");
            Iterable<Integer> iterable = W10;
            X10 = new ArrayList(C6565s.y(iterable, 10));
            for (Integer num : iterable) {
                C6496s.e(num);
                X10.add(gVar.a(num.intValue()));
            }
        }
        return X10;
    }

    public static final q e(r rVar, g gVar) {
        C6496s.h(rVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (rVar.d0()) {
            q T10 = rVar.T();
            C6496s.g(T10, "getExpandedType(...)");
            return T10;
        } else if (rVar.e0()) {
            return gVar.a(rVar.U());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
        }
    }

    public static final q f(q qVar, g gVar) {
        C6496s.h(qVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (qVar.p0()) {
            return qVar.b0();
        }
        if (qVar.q0()) {
            return gVar.a(qVar.c0());
        }
        return null;
    }

    public static final boolean g(i iVar) {
        C6496s.h(iVar, "<this>");
        if (iVar.w0() || iVar.x0()) {
            return true;
        }
        return false;
    }

    public static final boolean h(n nVar) {
        C6496s.h(nVar, "<this>");
        if (nVar.t0() || nVar.u0()) {
            return true;
        }
        return false;
    }

    public static final q i(c cVar, g gVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (cVar.p1()) {
            return cVar.K0();
        }
        if (cVar.q1()) {
            return gVar.a(cVar.L0());
        }
        return null;
    }

    public static final q j(q qVar, g gVar) {
        C6496s.h(qVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (qVar.s0()) {
            return qVar.e0();
        }
        if (qVar.t0()) {
            return gVar.a(qVar.f0());
        }
        return null;
    }

    public static final q k(i iVar, g gVar) {
        C6496s.h(iVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (iVar.w0()) {
            return iVar.f0();
        }
        if (iVar.x0()) {
            return gVar.a(iVar.g0());
        }
        return null;
    }

    public static final q l(n nVar, g gVar) {
        C6496s.h(nVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (nVar.t0()) {
            return nVar.e0();
        }
        if (nVar.u0()) {
            return gVar.a(nVar.f0());
        }
        return null;
    }

    public static final q m(i iVar, g gVar) {
        C6496s.h(iVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (iVar.y0()) {
            q i02 = iVar.i0();
            C6496s.g(i02, "getReturnType(...)");
            return i02;
        } else if (iVar.z0()) {
            return gVar.a(iVar.j0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function");
        }
    }

    public static final q n(n nVar, g gVar) {
        C6496s.h(nVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (nVar.v0()) {
            q g02 = nVar.g0();
            C6496s.g(g02, "getReturnType(...)");
            return g02;
        } else if (nVar.w0()) {
            return gVar.a(nVar.i0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property");
        }
    }

    public static final List o(c cVar, g gVar) {
        C6496s.h(cVar, "<this>");
        C6496s.h(gVar, "typeTable");
        List b12 = cVar.b1();
        if (b12.isEmpty()) {
            b12 = null;
        }
        if (b12 == null) {
            List a12 = cVar.a1();
            C6496s.g(a12, "getSupertypeIdList(...)");
            Iterable<Integer> iterable = a12;
            b12 = new ArrayList(C6565s.y(iterable, 10));
            for (Integer num : iterable) {
                C6496s.e(num);
                b12.add(gVar.a(num.intValue()));
            }
        }
        return b12;
    }

    public static final q p(q.b bVar, g gVar) {
        C6496s.h(bVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (bVar.B()) {
            return bVar.y();
        }
        if (bVar.C()) {
            return gVar.a(bVar.z());
        }
        return null;
    }

    public static final q q(u uVar, g gVar) {
        C6496s.h(uVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (uVar.S()) {
            q M10 = uVar.M();
            C6496s.g(M10, "getType(...)");
            return M10;
        } else if (uVar.T()) {
            return gVar.a(uVar.N());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
        }
    }

    public static final q r(r rVar, g gVar) {
        C6496s.h(rVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (rVar.i0()) {
            q a02 = rVar.a0();
            C6496s.g(a02, "getUnderlyingType(...)");
            return a02;
        } else if (rVar.j0()) {
            return gVar.a(rVar.b0());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
        }
    }

    public static final List s(s sVar, g gVar) {
        C6496s.h(sVar, "<this>");
        C6496s.h(gVar, "typeTable");
        List S10 = sVar.S();
        if (S10.isEmpty()) {
            S10 = null;
        }
        if (S10 == null) {
            List R10 = sVar.R();
            C6496s.g(R10, "getUpperBoundIdList(...)");
            Iterable<Integer> iterable = R10;
            S10 = new ArrayList(C6565s.y(iterable, 10));
            for (Integer num : iterable) {
                C6496s.e(num);
                S10.add(gVar.a(num.intValue()));
            }
        }
        return S10;
    }

    public static final q t(u uVar, g gVar) {
        C6496s.h(uVar, "<this>");
        C6496s.h(gVar, "typeTable");
        if (uVar.U()) {
            return uVar.O();
        }
        if (uVar.V()) {
            return gVar.a(uVar.P());
        }
        return null;
    }
}
