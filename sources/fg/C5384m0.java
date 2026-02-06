package Fg;

import Fg.C5388o0;
import Hg.k;
import Hg.l;
import Kg.d;
import Of.C5490h;
import Of.l0;
import Of.m0;
import Pf.c;
import Pf.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yg.C6812k;

/* renamed from: Fg.m0  reason: case insensitive filesystem */
public final class C5384m0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f63026c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final C5384m0 f63027d = new C5384m0(C5388o0.a.f63038a, false);

    /* renamed from: a  reason: collision with root package name */
    private final C5388o0 f63028a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f63029b;

    /* renamed from: Fg.m0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(int i10, l0 l0Var) {
            if (i10 > 100) {
                throw new AssertionError("Too deep recursion while expanding type alias " + l0Var.getName());
            }
        }

        private a() {
        }
    }

    public C5384m0(C5388o0 o0Var, boolean z10) {
        C6496s.h(o0Var, "reportStrategy");
        this.f63028a = o0Var;
        this.f63029b = z10;
    }

    private final void a(h hVar, h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((c) it.next()).f());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (hashSet.contains(cVar.f())) {
                this.f63028a.c(cVar);
            }
        }
    }

    private final void b(S s10, S s11) {
        G0 f10 = G0.f(s11);
        C6496s.g(f10, "create(...)");
        int i10 = 0;
        for (Object next : s11.L0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            B0 b02 = (B0) next;
            if (!b02.a()) {
                S type = b02.getType();
                C6496s.g(type, "getType(...)");
                if (!d.g(type)) {
                    B0 b03 = (B0) s10.L0().get(i10);
                    m0 m0Var = (m0) s10.N0().getParameters().get(i10);
                    if (this.f63029b) {
                        C5388o0 o0Var = this.f63028a;
                        S type2 = b03.getType();
                        C6496s.g(type2, "getType(...)");
                        S type3 = b02.getType();
                        C6496s.g(type3, "getType(...)");
                        C6496s.e(m0Var);
                        o0Var.b(f10, type2, type3, m0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final C5366d0 c(C5366d0 d0Var, r0 r0Var) {
        if (W.a(d0Var)) {
            return d0Var;
        }
        return F0.f(d0Var, (List) null, g(d0Var, r0Var), 1, (Object) null);
    }

    private final C5366d0 d(C5366d0 d0Var, S s10) {
        C5366d0 r10 = J0.r(d0Var, s10.O0());
        C6496s.g(r10, "makeNullableIfNeeded(...)");
        return r10;
    }

    private final C5366d0 e(C5366d0 d0Var, S s10) {
        return c(d(d0Var, s10), s10.M0());
    }

    private final C5366d0 f(C5386n0 n0Var, r0 r0Var, boolean z10) {
        v0 l10 = n0Var.b().l();
        C6496s.g(l10, "getTypeConstructor(...)");
        return V.m(r0Var, l10, n0Var.a(), z10, C6812k.b.f73949b);
    }

    private final r0 g(S s10, r0 r0Var) {
        if (W.a(s10)) {
            return s10.M0();
        }
        return r0Var.r(s10.M0());
    }

    private final B0 i(B0 b02, C5386n0 n0Var, int i10) {
        M0 Q02 = b02.getType().Q0();
        if (E.a(Q02)) {
            return b02;
        }
        C5366d0 a10 = F0.a(Q02);
        if (W.a(a10) || !d.E(a10)) {
            return b02;
        }
        v0 N02 = a10.N0();
        C5490h o10 = N02.o();
        N02.getParameters().size();
        a10.L0().size();
        if (o10 instanceof m0) {
            return b02;
        }
        if (o10 instanceof l0) {
            l0 l0Var = (l0) o10;
            if (n0Var.d(l0Var)) {
                this.f63028a.d(l0Var);
                return new D0(N0.INVARIANT, l.d(k.RECURSIVE_TYPE_ALIAS, l0Var.getName().toString()));
            }
            Iterable L02 = a10.L0();
            ArrayList arrayList = new ArrayList(C6565s.y(L02, 10));
            int i11 = 0;
            for (Object next : L02) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C6565s.x();
                }
                arrayList.add(k((B0) next, n0Var, (m0) N02.getParameters().get(i11), i10 + 1));
                i11 = i12;
            }
            C5366d0 j10 = j(C5386n0.f63031e.a(n0Var, l0Var, arrayList), a10.M0(), a10.O0(), i10 + 1, false);
            C5366d0 l10 = l(a10, n0Var, i10);
            if (!E.a(j10)) {
                j10 = C5374h0.j(j10, l10);
            }
            return new D0(b02.b(), j10);
        }
        C5366d0 l11 = l(a10, n0Var, i10);
        b(a10, l11);
        return new D0(b02.b(), l11);
    }

    private final C5366d0 j(C5386n0 n0Var, r0 r0Var, boolean z10, int i10, boolean z11) {
        B0 k10 = k(new D0(N0.INVARIANT, n0Var.b().u0()), n0Var, (m0) null, i10);
        S type = k10.getType();
        C6496s.g(type, "getType(...)");
        C5366d0 a10 = F0.a(type);
        if (W.a(a10)) {
            return a10;
        }
        k10.b();
        a(a10.getAnnotations(), C5392t.a(r0Var));
        C5366d0 r10 = J0.r(c(a10, r0Var), z10);
        C6496s.g(r10, "let(...)");
        if (z11) {
            return C5374h0.j(r10, f(n0Var, r0Var, z10));
        }
        return r10;
    }

    private final B0 k(B0 b02, C5386n0 n0Var, m0 m0Var, int i10) {
        N0 n02;
        N0 n03;
        N0 n04;
        f63026c.b(i10, n0Var.b());
        if (b02.a()) {
            C6496s.e(m0Var);
            B0 s10 = J0.s(m0Var);
            C6496s.g(s10, "makeStarProjection(...)");
            return s10;
        }
        S type = b02.getType();
        C6496s.g(type, "getType(...)");
        B0 c10 = n0Var.c(type.N0());
        if (c10 == null) {
            return i(b02, n0Var, i10);
        }
        if (c10.a()) {
            C6496s.e(m0Var);
            B0 s11 = J0.s(m0Var);
            C6496s.g(s11, "makeStarProjection(...)");
            return s11;
        }
        M0 Q02 = c10.getType().Q0();
        N0 b10 = c10.b();
        C6496s.g(b10, "getProjectionKind(...)");
        N0 b11 = b02.b();
        C6496s.g(b11, "getProjectionKind(...)");
        if (!(b11 == b10 || b11 == (n04 = N0.INVARIANT))) {
            if (b10 == n04) {
                b10 = b11;
            } else {
                this.f63028a.a(n0Var.b(), m0Var, Q02);
            }
        }
        if (m0Var == null || (n02 = m0Var.n()) == null) {
            n02 = N0.INVARIANT;
        }
        if (!(n02 == b10 || n02 == (n03 = N0.INVARIANT))) {
            if (b10 == n03) {
                b10 = n03;
            } else {
                this.f63028a.a(n0Var.b(), m0Var, Q02);
            }
        }
        a(type.getAnnotations(), Q02.getAnnotations());
        return new D0(b10, e(F0.a(Q02), type));
    }

    private final C5366d0 l(C5366d0 d0Var, C5386n0 n0Var, int i10) {
        v0 N02 = d0Var.N0();
        Iterable L02 = d0Var.L0();
        ArrayList arrayList = new ArrayList(C6565s.y(L02, 10));
        int i11 = 0;
        for (Object next : L02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            B0 b02 = (B0) next;
            B0 k10 = k(b02, n0Var, (m0) N02.getParameters().get(i11), i10 + 1);
            if (!k10.a()) {
                k10 = new D0(k10.b(), J0.q(k10.getType(), b02.getType().O0()));
            }
            arrayList.add(k10);
            i11 = i12;
        }
        return F0.f(d0Var, arrayList, (r0) null, 2, (Object) null);
    }

    public final C5366d0 h(C5386n0 n0Var, r0 r0Var) {
        C6496s.h(n0Var, "typeAliasExpansion");
        C6496s.h(r0Var, "attributes");
        return j(n0Var, r0Var, false, 0, true);
    }
}
