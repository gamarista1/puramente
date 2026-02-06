package Rf;

import Of.C5495m;
import Of.C5497o;
import Of.N;
import Of.h0;
import Pf.h;
import kotlin.jvm.internal.C6496s;
import ng.c;

public abstract class H extends C5525n implements N {

    /* renamed from: e  reason: collision with root package name */
    private final c f64749e;

    /* renamed from: f  reason: collision with root package name */
    private final String f64750f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H(Of.H h10, c cVar) {
        super(h10, h.f64602L.b(), cVar.h(), h0.f64497a);
        C6496s.h(h10, "module");
        C6496s.h(cVar, "fqName");
        this.f64749e = cVar;
        this.f64750f = "package " + cVar + " of " + h10;
    }

    public Object U(C5497o oVar, Object obj) {
        C6496s.h(oVar, "visitor");
        return oVar.h(this, obj);
    }

    public final c f() {
        return this.f64749e;
    }

    public h0 i() {
        h0 h0Var = h0.f64497a;
        C6496s.g(h0Var, "NO_SOURCE");
        return h0Var;
    }

    public String toString() {
        return this.f64750f;
    }

    public Of.H b() {
        C5495m b10 = super.b();
        C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (Of.H) b10;
    }
}
