package Fg;

import Gg.e;
import Gg.g;
import Kg.d;
import Of.m0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import qg.n;
import qg.w;

public final class J extends I implements C5395w {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62942e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static boolean f62943f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62944d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(C5366d0 d0Var, C5366d0 d0Var2) {
        super(d0Var, d0Var2);
        C6496s.h(d0Var, "lowerBound");
        C6496s.h(d0Var2, "upperBound");
    }

    private final void Z0() {
        if (f62943f && !this.f62944d) {
            this.f62944d = true;
            L.b(V0());
            L.b(W0());
            C6496s.c(V0(), W0());
            e.f63178a.c(V0(), W0());
        }
    }

    public boolean F0() {
        if (!(V0().N0().o() instanceof m0) || !C6496s.c(V0().N0(), W0().N0())) {
            return false;
        }
        return true;
    }

    public M0 R0(boolean z10) {
        return V.e(V0().U0(z10), W0().U0(z10));
    }

    public M0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return V.e(V0().V0(r0Var), W0().V0(r0Var));
    }

    public C5366d0 U0() {
        Z0();
        return V0();
    }

    public String X0(n nVar, w wVar) {
        C6496s.h(nVar, "renderer");
        C6496s.h(wVar, "options");
        if (!wVar.i()) {
            return nVar.R(nVar.U(V0()), nVar.U(W0()), d.n(this));
        }
        return '(' + nVar.U(V0()) + ".." + nVar.U(W0()) + ')';
    }

    /* renamed from: Y0 */
    public I S0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        S h10 = gVar.h(V0());
        C6496s.f(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S h11 = gVar.h(W0());
        C6496s.f(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new J((C5366d0) h10, (C5366d0) h11);
    }

    public S m0(S s10) {
        M0 m02;
        C6496s.h(s10, "replacement");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof I) {
            m02 = Q02;
        } else if (Q02 instanceof C5366d0) {
            C5366d0 d0Var = (C5366d0) Q02;
            m02 = V.e(d0Var, d0Var.U0(true));
        } else {
            throw new C6535s();
        }
        return L0.b(m02, Q02);
    }

    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }
}
