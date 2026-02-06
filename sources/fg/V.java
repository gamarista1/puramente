package Fg;

import Fg.C5388o0;
import Gg.g;
import Hg.h;
import Hg.l;
import Of.C5487e;
import Of.C5490h;
import Of.l0;
import Of.m0;
import Rf.A;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import tg.q;
import vg.C6755e;
import yf.C6798l;
import yg.C6812k;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public static final V f62981a = new V();

    /* renamed from: b  reason: collision with root package name */
    private static final C6798l f62982b = a.f62983a;

    static final class a implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62983a = new a();

        a() {
        }

        /* renamed from: a */
        public final Void invoke(g gVar) {
            C6496s.h(gVar, "<unused var>");
            return null;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C5366d0 f62984a;

        /* renamed from: b  reason: collision with root package name */
        private final v0 f62985b;

        public b(C5366d0 d0Var, v0 v0Var) {
            this.f62984a = d0Var;
            this.f62985b = v0Var;
        }

        public final C5366d0 a() {
            return this.f62984a;
        }

        public final v0 b() {
            return this.f62985b;
        }
    }

    private V() {
    }

    public static final C5366d0 c(l0 l0Var, List list) {
        C6496s.h(l0Var, "<this>");
        C6496s.h(list, "arguments");
        return new C5384m0(C5388o0.a.f63038a, false).h(C5386n0.f63031e.a((C5386n0) null, l0Var, list), r0.f63046b.j());
    }

    private final C6812k d(v0 v0Var, List list, g gVar) {
        C5490h o10 = v0Var.o();
        if (o10 instanceof m0) {
            return ((m0) o10).p().o();
        }
        if (o10 instanceof C5487e) {
            if (gVar == null) {
                gVar = C6755e.r(C6755e.s(o10));
            }
            if (list.isEmpty()) {
                return A.b((C5487e) o10, gVar);
            }
            return A.a((C5487e) o10, w0.f63074c.b(v0Var, list), gVar);
        } else if (o10 instanceof l0) {
            return l.a(h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((l0) o10).getName().toString());
        } else {
            if (v0Var instanceof Q) {
                return ((Q) v0Var).e();
            }
            throw new IllegalStateException("Unsupported classifier: " + o10 + " for constructor: " + v0Var);
        }
    }

    public static final M0 e(C5366d0 d0Var, C5366d0 d0Var2) {
        C6496s.h(d0Var, "lowerBound");
        C6496s.h(d0Var2, "upperBound");
        if (C6496s.c(d0Var, d0Var2)) {
            return d0Var;
        }
        return new J(d0Var, d0Var2);
    }

    public static final C5366d0 f(r0 r0Var, q qVar, boolean z10) {
        C6496s.h(r0Var, "attributes");
        C6496s.h(qVar, "constructor");
        return m(r0Var, qVar, C6565s.n(), z10, l.a(h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    private final b g(v0 v0Var, g gVar, List list) {
        C5490h f10;
        C5490h o10 = v0Var.o();
        if (o10 == null || (f10 = gVar.f(o10)) == null) {
            return null;
        }
        if (f10 instanceof l0) {
            return new b(c((l0) f10, list), (v0) null);
        }
        v0 n10 = f10.l().n(gVar);
        C6496s.g(n10, "refine(...)");
        return new b((C5366d0) null, n10);
    }

    public static final C5366d0 h(r0 r0Var, C5487e eVar, List list) {
        C6496s.h(r0Var, "attributes");
        C6496s.h(eVar, "descriptor");
        C6496s.h(list, "arguments");
        v0 l10 = eVar.l();
        C6496s.g(l10, "getTypeConstructor(...)");
        return k(r0Var, l10, list, false, (g) null, 16, (Object) null);
    }

    public static final C5366d0 i(r0 r0Var, v0 v0Var, List list, boolean z10) {
        C6496s.h(r0Var, "attributes");
        C6496s.h(v0Var, "constructor");
        C6496s.h(list, "arguments");
        return k(r0Var, v0Var, list, z10, (g) null, 16, (Object) null);
    }

    public static final C5366d0 j(r0 r0Var, v0 v0Var, List list, boolean z10, g gVar) {
        C6496s.h(r0Var, "attributes");
        C6496s.h(v0Var, "constructor");
        C6496s.h(list, "arguments");
        if (!r0Var.isEmpty() || !list.isEmpty() || z10 || v0Var.o() == null) {
            return n(r0Var, v0Var, list, z10, f62981a.d(v0Var, list, gVar), new T(v0Var, list, r0Var, z10));
        }
        C5490h o10 = v0Var.o();
        C6496s.e(o10);
        C5366d0 p10 = o10.p();
        C6496s.g(p10, "getDefaultType(...)");
        return p10;
    }

    public static /* synthetic */ C5366d0 k(r0 r0Var, v0 v0Var, List list, boolean z10, g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return j(r0Var, v0Var, list, z10, gVar);
    }

    /* access modifiers changed from: private */
    public static final C5366d0 l(v0 v0Var, List list, r0 r0Var, boolean z10, g gVar) {
        C6496s.h(gVar, "refiner");
        b g10 = f62981a.g(v0Var, gVar, list);
        if (g10 == null) {
            return null;
        }
        C5366d0 a10 = g10.a();
        if (a10 != null) {
            return a10;
        }
        v0 b10 = g10.b();
        C6496s.e(b10);
        return j(r0Var, b10, list, z10, gVar);
    }

    public static final C5366d0 m(r0 r0Var, v0 v0Var, List list, boolean z10, C6812k kVar) {
        C6496s.h(r0Var, "attributes");
        C6496s.h(v0Var, "constructor");
        C6496s.h(list, "arguments");
        C6496s.h(kVar, "memberScope");
        v0 v0Var2 = v0Var;
        List list2 = list;
        C5368e0 e0Var = new C5368e0(v0Var2, list2, z10, kVar, new U(v0Var2, list2, r0Var, z10, kVar));
        if (r0Var.isEmpty()) {
            return e0Var;
        }
        return new C5370f0(e0Var, r0Var);
    }

    public static final C5366d0 n(r0 r0Var, v0 v0Var, List list, boolean z10, C6812k kVar, C6798l lVar) {
        C6496s.h(r0Var, "attributes");
        C6496s.h(v0Var, "constructor");
        C6496s.h(list, "arguments");
        C6496s.h(kVar, "memberScope");
        C6496s.h(lVar, "refinedTypeFactory");
        C5368e0 e0Var = new C5368e0(v0Var, list, z10, kVar, lVar);
        if (r0Var.isEmpty()) {
            return e0Var;
        }
        return new C5370f0(e0Var, r0Var);
    }

    /* access modifiers changed from: private */
    public static final C5366d0 o(v0 v0Var, List list, r0 r0Var, boolean z10, C6812k kVar, g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        b g10 = f62981a.g(v0Var, gVar, list);
        if (g10 == null) {
            return null;
        }
        C5366d0 a10 = g10.a();
        if (a10 != null) {
            return a10;
        }
        v0 b10 = g10.b();
        C6496s.e(b10);
        return m(r0Var, b10, list, z10, kVar);
    }
}
