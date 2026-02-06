package Gg;

import Fg.B0;
import Fg.C5360a0;
import Fg.C5364c0;
import Fg.C5366d0;
import Fg.C5372g0;
import Fg.C5397y;
import Fg.G0;
import Fg.H0;
import Fg.I;
import Fg.J0;
import Fg.M0;
import Fg.N0;
import Fg.Q;
import Fg.S;
import Fg.V;
import Fg.W;
import Fg.u0;
import Fg.v0;
import Fg.w0;
import Jg.e;
import Jg.f;
import Jg.g;
import Jg.i;
import Jg.j;
import Jg.k;
import Jg.l;
import Jg.m;
import Jg.n;
import Jg.p;
import Jg.q;
import Jg.s;
import Kg.d;
import Lf.o;
import Of.A;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.F;
import Of.l0;
import Of.m0;
import Of.r0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import ng.c;
import rg.C6693k;
import sg.C6717a;
import vg.C6755e;

public interface b extends H0, q {

    public static final class a {

        /* renamed from: Gg.b$a$a  reason: collision with other inner class name */
        public static final class C0936a extends u0.c.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f63176a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ G0 f63177b;

            C0936a(b bVar, G0 g02) {
                this.f63176a = bVar;
                this.f63177b = g02;
            }

            public j a(u0 u0Var, i iVar) {
                C6496s.h(u0Var, "state");
                C6496s.h(iVar, "type");
                b bVar = this.f63176a;
                G0 g02 = this.f63177b;
                j v02 = bVar.v0(iVar);
                C6496s.f(v02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                S n10 = g02.n((S) v02, N0.INVARIANT);
                C6496s.g(n10, "safeSubstitute(...)");
                j f10 = bVar.f(n10);
                C6496s.e(f10);
                return f10;
            }
        }

        public static boolean A(b bVar, i iVar, c cVar) {
            C6496s.h(iVar, "$receiver");
            C6496s.h(cVar, "fqName");
            if (iVar instanceof S) {
                return ((S) iVar).getAnnotations().n0(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static boolean B(b bVar, n nVar, m mVar) {
            boolean z10;
            C6496s.h(nVar, "$receiver");
            if (nVar instanceof m0) {
                if (mVar == null) {
                    z10 = true;
                } else {
                    z10 = mVar instanceof v0;
                }
                m0 m0Var = (m0) nVar;
                if (z10) {
                    return d.r(m0Var, (v0) mVar, (Set) null, 4, (Object) null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + m0Var + ", " + O.b(m0Var.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + O.b(nVar.getClass())).toString());
        }

        public static boolean C(b bVar, j jVar, j jVar2) {
            C6496s.h(jVar, "a");
            C6496s.h(jVar2, "b");
            if (!(jVar instanceof C5366d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
            } else if (!(jVar2 instanceof C5366d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar2 + ", " + O.b(jVar2.getClass())).toString());
            } else if (((C5366d0) jVar).L0() == ((C5366d0) jVar2).L0()) {
                return true;
            } else {
                return false;
            }
        }

        public static i D(b bVar, Collection collection) {
            C6496s.h(collection, "types");
            return d.a(collection);
        }

        public static boolean E(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return Lf.i.w0((v0) mVar, o.a.f63997b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean F(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return ((v0) mVar).o() instanceof C5487e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean G(b bVar, m mVar) {
            C5487e eVar;
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                if (o10 instanceof C5487e) {
                    eVar = (C5487e) o10;
                } else {
                    eVar = null;
                }
                if (eVar == null || !F.a(eVar) || eVar.h() == C5488f.ENUM_ENTRY || eVar.h() == C5488f.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean H(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return ((v0) mVar).p();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean I(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return W.a((S) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static boolean J(b bVar, m mVar) {
            C5487e eVar;
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                r0 r0Var = null;
                if (o10 instanceof C5487e) {
                    eVar = (C5487e) o10;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    r0Var = eVar.W();
                }
                return r0Var instanceof A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean K(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return mVar instanceof tg.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean L(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return mVar instanceof Q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean M(b bVar) {
            return false;
        }

        public static boolean N(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                return ((C5366d0) jVar).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static boolean O(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            return iVar instanceof C5360a0;
        }

        public static boolean P(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return Lf.i.w0((v0) mVar, o.a.f63999c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static boolean Q(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return J0.l((S) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static boolean R(b bVar, Jg.d dVar) {
            C6496s.h(dVar, "$receiver");
            return dVar instanceof C6717a;
        }

        public static boolean S(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof S) {
                return Lf.i.s0((S) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static boolean T(b bVar, Jg.d dVar) {
            C6496s.h(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + O.b(dVar.getClass())).toString());
        }

        public static boolean U(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return iVar instanceof C5364c0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static boolean V(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                if (!W.a((S) jVar)) {
                    C5366d0 d0Var = (C5366d0) jVar;
                    if ((d0Var.N0().o() instanceof l0) || (d0Var.N0().o() == null && !(jVar instanceof C6717a) && !(jVar instanceof i) && !(jVar instanceof C5397y) && !(d0Var.N0() instanceof tg.q) && !W(bVar, jVar))) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        private static boolean W(b bVar, j jVar) {
            if (!(jVar instanceof C5372g0) || !bVar.g(((C5372g0) jVar).H0())) {
                return false;
            }
            return true;
        }

        public static boolean X(b bVar, l lVar) {
            C6496s.h(lVar, "$receiver");
            if (lVar instanceof B0) {
                return ((B0) lVar).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + O.b(lVar.getClass())).toString());
        }

        public static boolean Y(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                return d.u((S) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static boolean Z(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                return d.v((S) jVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static boolean a(b bVar, m mVar, m mVar2) {
            C6496s.h(mVar, "c1");
            C6496s.h(mVar2, "c2");
            if (!(mVar instanceof v0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
            } else if (mVar2 instanceof v0) {
                return C6496s.c(mVar, mVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar2 + ", " + O.b(mVar2.getClass())).toString());
            }
        }

        public static boolean a0(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (!(iVar instanceof M0)) {
                return false;
            }
            ((M0) iVar).N0();
            return false;
        }

        public static int b(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return ((S) iVar).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static boolean b0(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                if (o10 == null || !Lf.i.B0(o10)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static k c(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                return (k) jVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static j c0(b bVar, g gVar) {
            C6496s.h(gVar, "$receiver");
            if (gVar instanceof I) {
                return ((I) gVar).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + O.b(gVar.getClass())).toString());
        }

        public static Jg.d d(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (!(jVar instanceof C5366d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
            } else if (jVar instanceof C5372g0) {
                return bVar.a(((C5372g0) jVar).H0());
            } else {
                if (jVar instanceof i) {
                    return (i) jVar;
                }
                return null;
            }
        }

        public static i d0(b bVar, Jg.d dVar) {
            C6496s.h(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + O.b(dVar.getClass())).toString());
        }

        public static e e(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (!(jVar instanceof C5366d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
            } else if (jVar instanceof C5397y) {
                return (C5397y) jVar;
            } else {
                return null;
            }
        }

        public static i e0(b bVar, i iVar, boolean z10) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof M0) {
                return c.b((M0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static f f(b bVar, g gVar) {
            C6496s.h(gVar, "$receiver");
            if (gVar instanceof I) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + O.b(gVar.getClass())).toString());
        }

        public static u0 f0(b bVar, boolean z10, boolean z11) {
            return C5399a.b(z10, z11, bVar, (f) null, (g) null, 24, (Object) null);
        }

        public static g g(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                M0 Q02 = ((S) iVar).Q0();
                if (Q02 instanceof I) {
                    return (I) Q02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static j g0(b bVar, e eVar) {
            C6496s.h(eVar, "$receiver");
            if (eVar instanceof C5397y) {
                return ((C5397y) eVar).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + O.b(eVar.getClass())).toString());
        }

        public static j h(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                M0 Q02 = ((S) iVar).Q0();
                if (Q02 instanceof C5366d0) {
                    return (C5366d0) Q02;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static int h0(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                return ((v0) mVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static l i(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return d.d((S) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static Collection i0(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            m b10 = bVar.b(jVar);
            if (b10 instanceof tg.q) {
                return ((tg.q) b10).f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static j j(b bVar, j jVar, Jg.b bVar2) {
            C6496s.h(jVar, "type");
            C6496s.h(bVar2, "status");
            if (jVar instanceof C5366d0) {
                return o.b((C5366d0) jVar, bVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static l j0(b bVar, Jg.c cVar) {
            C6496s.h(cVar, "$receiver");
            if (cVar instanceof n) {
                return ((n) cVar).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + O.b(cVar.getClass())).toString());
        }

        public static Jg.b k(b bVar, Jg.d dVar) {
            C6496s.h(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + O.b(dVar.getClass())).toString());
        }

        public static u0.c k0(b bVar, j jVar) {
            C6496s.h(jVar, "type");
            if (jVar instanceof C5366d0) {
                return new C0936a(bVar, w0.f63074c.a((S) jVar).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static i l(b bVar, j jVar, j jVar2) {
            C6496s.h(jVar, "lowerBound");
            C6496s.h(jVar2, "upperBound");
            if (!(jVar instanceof C5366d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + O.b(bVar.getClass())).toString());
            } else if (jVar2 instanceof C5366d0) {
                return V.e((C5366d0) jVar, (C5366d0) jVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + O.b(bVar.getClass())).toString());
            }
        }

        public static Collection l0(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                Collection l10 = ((v0) mVar).l();
                C6496s.g(l10, "getSupertypes(...)");
                return l10;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static l m(b bVar, i iVar, int i10) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return (l) ((S) iVar).L0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static Jg.c m0(b bVar, Jg.d dVar) {
            C6496s.h(dVar, "$receiver");
            if (dVar instanceof i) {
                return ((i) dVar).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + O.b(dVar.getClass())).toString());
        }

        public static List n(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return ((S) iVar).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static m n0(b bVar, j jVar) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                return ((C5366d0) jVar).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static ng.d o(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C6755e.p((C5487e) o10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static j o0(b bVar, g gVar) {
            C6496s.h(gVar, "$receiver");
            if (gVar instanceof I) {
                return ((I) gVar).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + O.b(gVar.getClass())).toString());
        }

        public static n p(b bVar, m mVar, int i10) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                Object obj = ((v0) mVar).getParameters().get(i10);
                C6496s.g(obj, "get(...)");
                return (n) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static i p0(b bVar, i iVar, boolean z10) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof j) {
                return bVar.d((j) iVar, z10);
            }
            if (iVar instanceof g) {
                g gVar = (g) iVar;
                return bVar.Q(bVar.d(bVar.c(gVar), z10), bVar.d(bVar.e(gVar), z10));
            }
            throw new IllegalStateException("sealed");
        }

        public static List q(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                List parameters = ((v0) mVar).getParameters();
                C6496s.g(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static j q0(b bVar, j jVar, boolean z10) {
            C6496s.h(jVar, "$receiver");
            if (jVar instanceof C5366d0) {
                return ((C5366d0) jVar).U0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + O.b(jVar.getClass())).toString());
        }

        public static Lf.l r(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Lf.i.P((C5487e) o10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static Lf.l s(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Lf.i.S((C5487e) o10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static i t(b bVar, n nVar) {
            C6496s.h(nVar, "$receiver");
            if (nVar instanceof m0) {
                return d.o((m0) nVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + O.b(nVar.getClass())).toString());
        }

        public static i u(b bVar, l lVar) {
            C6496s.h(lVar, "$receiver");
            if (lVar instanceof B0) {
                return ((B0) lVar).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + O.b(lVar.getClass())).toString());
        }

        public static n v(b bVar, m mVar) {
            C6496s.h(mVar, "$receiver");
            if (mVar instanceof v0) {
                C5490h o10 = ((v0) mVar).o();
                if (o10 instanceof m0) {
                    return (m0) o10;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + O.b(mVar.getClass())).toString());
        }

        public static i w(b bVar, i iVar) {
            C6496s.h(iVar, "$receiver");
            if (iVar instanceof S) {
                return C6693k.k((S) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + O.b(iVar.getClass())).toString());
        }

        public static List x(b bVar, n nVar) {
            C6496s.h(nVar, "$receiver");
            if (nVar instanceof m0) {
                List upperBounds = ((m0) nVar).getUpperBounds();
                C6496s.g(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + O.b(nVar.getClass())).toString());
        }

        public static s y(b bVar, l lVar) {
            C6496s.h(lVar, "$receiver");
            if (lVar instanceof B0) {
                N0 b10 = ((B0) lVar).b();
                C6496s.g(b10, "getProjectionKind(...)");
                return p.a(b10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + O.b(lVar.getClass())).toString());
        }

        public static s z(b bVar, n nVar) {
            C6496s.h(nVar, "$receiver");
            if (nVar instanceof m0) {
                N0 n10 = ((m0) nVar).n();
                C6496s.g(n10, "getVariance(...)");
                return p.a(n10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + O.b(nVar.getClass())).toString());
        }
    }

    i Q(j jVar, j jVar2);

    Jg.d a(j jVar);

    m b(j jVar);

    j c(g gVar);

    j d(j jVar, boolean z10);

    j e(g gVar);

    j f(i iVar);

    boolean g(j jVar);
}
