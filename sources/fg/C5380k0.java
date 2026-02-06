package Fg;

import Gg.g;
import Of.m0;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;

/* renamed from: Fg.k0  reason: case insensitive filesystem */
public final class C5380k0 extends C0 {

    /* renamed from: a  reason: collision with root package name */
    private final m0 f63021a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f63022b = C6531o.a(C6534r.PUBLICATION, new C5378j0(this));

    public C5380k0(m0 m0Var) {
        C6496s.h(m0Var, "typeParameter");
        this.f63021a = m0Var;
    }

    /* access modifiers changed from: private */
    public static final S c(C5380k0 k0Var) {
        return C5382l0.b(k0Var.f63021a);
    }

    private final S e() {
        return (S) this.f63022b.getValue();
    }

    public boolean a() {
        return true;
    }

    public N0 b() {
        return N0.OUT_VARIANCE;
    }

    public S getType() {
        return e();
    }

    public B0 n(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return this;
    }
}
