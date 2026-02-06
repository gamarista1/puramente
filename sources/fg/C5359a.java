package Fg;

import Gg.g;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fg.a  reason: case insensitive filesystem */
public final class C5359a extends A {

    /* renamed from: b  reason: collision with root package name */
    private final C5366d0 f62991b;

    /* renamed from: c  reason: collision with root package name */
    private final C5366d0 f62992c;

    public C5359a(C5366d0 d0Var, C5366d0 d0Var2) {
        C6496s.h(d0Var, "delegate");
        C6496s.h(d0Var2, "abbreviation");
        this.f62991b = d0Var;
        this.f62992c = d0Var2;
    }

    public final C5366d0 H() {
        return W0();
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return new C5359a(W0().V0(r0Var), this.f62992c);
    }

    /* access modifiers changed from: protected */
    public C5366d0 W0() {
        return this.f62991b;
    }

    public final C5366d0 Z0() {
        return this.f62992c;
    }

    /* renamed from: a1 */
    public C5359a U0(boolean z10) {
        return new C5359a(W0().U0(z10), this.f62992c.U0(z10));
    }

    /* renamed from: b1 */
    public C5359a X0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        S h10 = gVar.h(W0());
        C6496s.f(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S h11 = gVar.h(this.f62992c);
        C6496s.f(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C5359a((C5366d0) h10, (C5366d0) h11);
    }

    /* renamed from: c1 */
    public C5359a Y0(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        return new C5359a(d0Var, this.f62992c);
    }
}
