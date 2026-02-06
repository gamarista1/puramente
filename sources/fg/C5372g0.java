package Fg;

import Gg.g;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fg.g0  reason: case insensitive filesystem */
public final class C5372g0 extends A implements K0 {

    /* renamed from: b  reason: collision with root package name */
    private final C5366d0 f63013b;

    /* renamed from: c  reason: collision with root package name */
    private final S f63014c;

    public C5372g0(C5366d0 d0Var, S s10) {
        C6496s.h(d0Var, "delegate");
        C6496s.h(s10, "enhancement");
        this.f63013b = d0Var;
        this.f63014c = s10;
    }

    /* renamed from: U0 */
    public C5366d0 R0(boolean z10) {
        M0 d10 = L0.d(H0().U0(z10), i0().Q0().R0(z10));
        C6496s.f(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C5366d0) d10;
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        M0 d10 = L0.d(H0().V0(r0Var), i0());
        C6496s.f(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C5366d0) d10;
    }

    /* access modifiers changed from: protected */
    public C5366d0 W0() {
        return this.f63013b;
    }

    /* renamed from: Z0 */
    public C5366d0 H0() {
        return W0();
    }

    /* renamed from: a1 */
    public C5372g0 X0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        S h10 = gVar.h(W0());
        C6496s.f(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5372g0((C5366d0) h10, gVar.h(i0()));
    }

    /* renamed from: b1 */
    public C5372g0 Y0(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        return new C5372g0(d0Var, i0());
    }

    public S i0() {
        return this.f63014c;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + i0() + ")] " + H0();
    }
}
