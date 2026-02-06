package Fg;

import Gg.g;
import kotlin.jvm.internal.C6496s;
import qg.n;
import qg.w;

public final class K extends I implements K0 {

    /* renamed from: d  reason: collision with root package name */
    private final I f62950d;

    /* renamed from: e  reason: collision with root package name */
    private final S f62951e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K(I i10, S s10) {
        super(i10.V0(), i10.W0());
        C6496s.h(i10, "origin");
        C6496s.h(s10, "enhancement");
        this.f62950d = i10;
        this.f62951e = s10;
    }

    public M0 R0(boolean z10) {
        return L0.d(H0().R0(z10), i0().Q0().R0(z10));
    }

    public M0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return L0.d(H0().T0(r0Var), i0());
    }

    public C5366d0 U0() {
        return H0().U0();
    }

    public String X0(n nVar, w wVar) {
        C6496s.h(nVar, "renderer");
        C6496s.h(wVar, "options");
        if (wVar.d()) {
            return nVar.U(i0());
        }
        return H0().X0(nVar, wVar);
    }

    /* renamed from: Y0 */
    public I H0() {
        return this.f62950d;
    }

    /* renamed from: Z0 */
    public K S0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        S h10 = gVar.h(H0());
        C6496s.f(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new K((I) h10, gVar.h(i0()));
    }

    public S i0() {
        return this.f62951e;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + i0() + ")] " + H0();
    }
}
