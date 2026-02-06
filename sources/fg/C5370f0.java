package Fg;

import kotlin.jvm.internal.C6496s;

/* renamed from: Fg.f0  reason: case insensitive filesystem */
final class C5370f0 extends B {

    /* renamed from: c  reason: collision with root package name */
    private final r0 f63008c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5370f0(C5366d0 d0Var, r0 r0Var) {
        super(d0Var);
        C6496s.h(d0Var, "delegate");
        C6496s.h(r0Var, "attributes");
        this.f63008c = r0Var;
    }

    public r0 M0() {
        return this.f63008c;
    }

    /* renamed from: Z0 */
    public C5370f0 Y0(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        return new C5370f0(d0Var, M0());
    }
}
