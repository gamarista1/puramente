package wg;

import Of.C5487e;
import Of.C5496n;
import Wf.d;
import ag.j;
import bg.C5738D;
import eg.C5823D;
import eg.C5830g;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;
import yg.C6812k;

/* renamed from: wg.c  reason: case insensitive filesystem */
public final class C6767c {

    /* renamed from: a  reason: collision with root package name */
    private final j f73747a;

    /* renamed from: b  reason: collision with root package name */
    private final Yf.j f73748b;

    public C6767c(j jVar, Yf.j jVar2) {
        C6496s.h(jVar, "packageFragmentProvider");
        C6496s.h(jVar2, "javaResolverCache");
        this.f73747a = jVar;
        this.f73748b = jVar2;
    }

    public final j a() {
        return this.f73747a;
    }

    public final C5487e b(C5830g gVar) {
        C6812k kVar;
        C5496n nVar;
        C6496s.h(gVar, "javaClass");
        c f10 = gVar.f();
        if (f10 != null && gVar.M() == C5823D.SOURCE) {
            return this.f73748b.d(f10);
        }
        C5830g h10 = gVar.h();
        if (h10 != null) {
            C5487e b10 = b(h10);
            if (b10 != null) {
                kVar = b10.V();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar.e(gVar.getName(), d.FROM_JAVA_LOADER);
            } else {
                nVar = null;
            }
            if (nVar instanceof C5487e) {
                return (C5487e) nVar;
            }
            return null;
        } else if (f10 == null) {
            return null;
        } else {
            j jVar = this.f73747a;
            c e10 = f10.e();
            C6496s.g(e10, "parent(...)");
            C5738D d10 = (C5738D) C6565s.q0(jVar.a(e10));
            if (d10 != null) {
                return d10.N0(gVar);
            }
            return null;
        }
    }
}
