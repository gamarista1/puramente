package Kg;

import Fg.B0;
import Fg.C5366d0;
import Fg.C5380k0;
import Fg.C5397y;
import Fg.D0;
import Fg.F0;
import Fg.I;
import Fg.J0;
import Fg.L0;
import Fg.M0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Fg.s0;
import Fg.v0;
import Gg.e;
import Lf.i;
import Of.C5490h;
import Of.C5491i;
import Of.l0;
import Of.m0;
import Pf.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;
import yf.C6798l;

public abstract class d {
    public static final S A(S s10) {
        C6496s.h(s10, "<this>");
        S n10 = J0.n(s10);
        C6496s.g(n10, "makeNotNullable(...)");
        return n10;
    }

    public static final S B(S s10) {
        C6496s.h(s10, "<this>");
        S o10 = J0.o(s10);
        C6496s.g(o10, "makeNullable(...)");
        return o10;
    }

    public static final S C(S s10, h hVar) {
        C6496s.h(s10, "<this>");
        C6496s.h(hVar, "newAnnotations");
        if (!s10.getAnnotations().isEmpty() || !hVar.isEmpty()) {
            return s10.Q0().T0(s0.a(s10.M0(), hVar));
        }
        return s10;
    }

    public static final S D(S s10) {
        C5366d0 d0Var;
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof I) {
            I i10 = (I) Q02;
            C5366d0 V02 = i10.V0();
            if (!V02.N0().getParameters().isEmpty() && V02.N0().o() != null) {
                List parameters = V02.N0().getParameters();
                C6496s.g(parameters, "getParameters(...)");
                Iterable<m0> iterable = parameters;
                ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                for (m0 k0Var : iterable) {
                    arrayList.add(new C5380k0(k0Var));
                }
                V02 = F0.f(V02, arrayList, (r0) null, 2, (Object) null);
            }
            C5366d0 W02 = i10.W0();
            if (!W02.N0().getParameters().isEmpty() && W02.N0().o() != null) {
                List parameters2 = W02.N0().getParameters();
                C6496s.g(parameters2, "getParameters(...)");
                Iterable<m0> iterable2 = parameters2;
                ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
                for (m0 k0Var2 : iterable2) {
                    arrayList2.add(new C5380k0(k0Var2));
                }
                W02 = F0.f(W02, arrayList2, (r0) null, 2, (Object) null);
            }
            d0Var = V.e(V02, W02);
        } else if (Q02 instanceof C5366d0) {
            C5366d0 d0Var2 = (C5366d0) Q02;
            boolean isEmpty = d0Var2.N0().getParameters().isEmpty();
            d0Var = d0Var2;
            if (!isEmpty) {
                C5490h o10 = d0Var2.N0().o();
                d0Var = d0Var2;
                if (o10 != null) {
                    List parameters3 = d0Var2.N0().getParameters();
                    C6496s.g(parameters3, "getParameters(...)");
                    Iterable<m0> iterable3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(C6565s.y(iterable3, 10));
                    for (m0 k0Var3 : iterable3) {
                        arrayList3.add(new C5380k0(k0Var3));
                    }
                    d0Var = F0.f(d0Var2, arrayList3, (r0) null, 2, (Object) null);
                }
            }
        } else {
            throw new C6535s();
        }
        return L0.b(d0Var, Q02);
    }

    public static final boolean E(S s10) {
        C6496s.h(s10, "<this>");
        return e(s10, c.f63859a);
    }

    /* access modifiers changed from: private */
    public static final boolean F(M0 m02) {
        C6496s.h(m02, "it");
        C5490h o10 = m02.N0().o();
        if (o10 == null) {
            return false;
        }
        if ((o10 instanceof l0) || (o10 instanceof m0)) {
            return true;
        }
        return false;
    }

    public static final B0 d(S s10) {
        C6496s.h(s10, "<this>");
        return new D0(s10);
    }

    public static final boolean e(S s10, C6798l lVar) {
        C6496s.h(s10, "<this>");
        C6496s.h(lVar, "predicate");
        return J0.c(s10, lVar);
    }

    private static final boolean f(S s10, v0 v0Var, Set set) {
        C5491i iVar;
        List list;
        m0 m0Var;
        boolean z10;
        if (C6496s.c(s10.N0(), v0Var)) {
            return true;
        }
        C5490h o10 = s10.N0().o();
        if (o10 instanceof C5491i) {
            iVar = (C5491i) o10;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            list = iVar.q();
        } else {
            list = null;
        }
        Iterable<mf.I> m12 = C6565s.m1(s10.L0());
        if (!(m12 instanceof Collection) || !((Collection) m12).isEmpty()) {
            for (mf.I i10 : m12) {
                int a10 = i10.a();
                B0 b02 = (B0) i10.b();
                if (list != null) {
                    m0Var = (m0) C6565s.r0(list, a10);
                } else {
                    m0Var = null;
                }
                if ((m0Var == null || set == null || !set.contains(m0Var)) && !b02.a()) {
                    S type = b02.getType();
                    C6496s.g(type, "getType(...)");
                    z10 = f(type, v0Var, set);
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(S s10) {
        C6496s.h(s10, "<this>");
        return e(s10, b.f63858a);
    }

    /* access modifiers changed from: private */
    public static final boolean h(M0 m02) {
        C6496s.h(m02, "it");
        C5490h o10 = m02.N0().o();
        if (o10 != null) {
            return x(o10);
        }
        return false;
    }

    public static final boolean i(S s10) {
        C6496s.h(s10, "<this>");
        return J0.c(s10, a.f63857a);
    }

    /* access modifiers changed from: private */
    public static final Boolean j(M0 m02) {
        return Boolean.valueOf(J0.m(m02));
    }

    public static final B0 k(S s10, N0 n02, m0 m0Var) {
        N0 n03;
        C6496s.h(s10, "type");
        C6496s.h(n02, "projectionKind");
        if (m0Var != null) {
            n03 = m0Var.n();
        } else {
            n03 = null;
        }
        if (n03 == n02) {
            n02 = N0.INVARIANT;
        }
        return new D0(n02, s10);
    }

    public static final Set l(S s10, Set set) {
        C6496s.h(s10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(s10, s10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(S s10, S s11, Set set, Set set2) {
        C5491i iVar;
        List list;
        m0 m0Var;
        C5490h o10 = s10.N0().o();
        if (!(o10 instanceof m0)) {
            C5490h o11 = s10.N0().o();
            if (o11 instanceof C5491i) {
                iVar = (C5491i) o11;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                list = iVar.q();
            } else {
                list = null;
            }
            int i10 = 0;
            for (B0 b02 : s10.L0()) {
                int i11 = i10 + 1;
                if (list != null) {
                    m0Var = (m0) C6565s.r0(list, i10);
                } else {
                    m0Var = null;
                }
                if ((m0Var == null || set2 == null || !set2.contains(m0Var)) && !b02.a() && !C6565s.e0(set, b02.getType().N0().o()) && !C6496s.c(b02.getType().N0(), s11.N0())) {
                    S type = b02.getType();
                    C6496s.g(type, "getType(...)");
                    m(type, s11, set, set2);
                }
                i10 = i11;
            }
        } else if (!C6496s.c(s10.N0(), s11.N0())) {
            set.add(o10);
        } else {
            for (S s12 : ((m0) o10).getUpperBounds()) {
                C6496s.e(s12);
                m(s12, s11, set, set2);
            }
        }
    }

    public static final i n(S s10) {
        C6496s.h(s10, "<this>");
        i m10 = s10.N0().m();
        C6496s.g(m10, "getBuiltIns(...)");
        return m10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: Fg.S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: Of.e} */
    /* JADX WARNING: type inference failed for: r4v3, types: [Of.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Fg.S o(Of.m0 r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.util.List r0 = r6.getUpperBounds()
            java.lang.String r1 = "getUpperBounds(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r0.isEmpty()
            java.util.List r0 = r6.getUpperBounds()
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            r4 = r2
            Fg.S r4 = (Fg.S) r4
            Fg.v0 r4 = r4.N0()
            Of.h r4 = r4.o()
            boolean r5 = r4 instanceof Of.C5487e
            if (r5 == 0) goto L_0x003d
            r3 = r4
            Of.e r3 = (Of.C5487e) r3
        L_0x003d:
            if (r3 != 0) goto L_0x0040
            goto L_0x0020
        L_0x0040:
            Of.f r4 = r3.h()
            Of.f r5 = Of.C5488f.INTERFACE
            if (r4 == r5) goto L_0x0020
            Of.f r3 = r3.h()
            Of.f r4 = Of.C5488f.ANNOTATION_CLASS
            if (r3 == r4) goto L_0x0020
            r3 = r2
        L_0x0051:
            Fg.S r3 = (Fg.S) r3
            if (r3 != 0) goto L_0x0068
            java.util.List r6 = r6.getUpperBounds()
            kotlin.jvm.internal.C6496s.g(r6, r1)
            java.lang.Object r6 = mf.C6565s.o0(r6)
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.C6496s.g(r6, r0)
            r3 = r6
            Fg.S r3 = (Fg.S) r3
        L_0x0068:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Kg.d.o(Of.m0):Fg.S");
    }

    public static final boolean p(m0 m0Var) {
        C6496s.h(m0Var, "typeParameter");
        return r(m0Var, (v0) null, (Set) null, 6, (Object) null);
    }

    public static final boolean q(m0 m0Var, v0 v0Var, Set set) {
        C6496s.h(m0Var, "typeParameter");
        List upperBounds = m0Var.getUpperBounds();
        C6496s.g(upperBounds, "getUpperBounds(...)");
        Iterable<S> iterable = upperBounds;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (S s10 : iterable) {
            C6496s.e(s10);
            if (f(s10, m0Var.p().N0(), set) && (v0Var == null || C6496s.c(s10.N0(), v0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(m0 m0Var, v0 v0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(m0Var, v0Var, set);
    }

    public static final boolean s(S s10) {
        C6496s.h(s10, "<this>");
        return i.f0(s10);
    }

    public static final boolean t(S s10) {
        C6496s.h(s10, "<this>");
        return i.n0(s10);
    }

    public static final boolean u(S s10) {
        C6496s.h(s10, "<this>");
        if (!(s10 instanceof C5397y)) {
            return false;
        }
        ((C5397y) s10).Z0();
        return false;
    }

    public static final boolean v(S s10) {
        C6496s.h(s10, "<this>");
        if (!(s10 instanceof C5397y)) {
            return false;
        }
        ((C5397y) s10).Z0();
        return false;
    }

    public static final boolean w(S s10, S s11) {
        C6496s.h(s10, "<this>");
        C6496s.h(s11, "superType");
        return e.f63178a.c(s10, s11);
    }

    public static final boolean x(C5490h hVar) {
        C6496s.h(hVar, "<this>");
        if (!(hVar instanceof m0) || !(((m0) hVar).b() instanceof l0)) {
            return false;
        }
        return true;
    }

    public static final boolean y(S s10) {
        C6496s.h(s10, "<this>");
        return J0.m(s10);
    }

    public static final boolean z(S s10) {
        C6496s.h(s10, "type");
        if (!(s10 instanceof Hg.i) || !((Hg.i) s10).X0().c()) {
            return false;
        }
        return true;
    }
}
