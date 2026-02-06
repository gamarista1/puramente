package Xf;

import Of.C5484b;
import Of.C5507z;
import Xf.U;
import gg.C5943C;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import vg.C6755e;

/* renamed from: Xf.i  reason: case insensitive filesystem */
public final class C5676i extends U {

    /* renamed from: o  reason: collision with root package name */
    public static final C5676i f66378o = new C5676i();

    private C5676i() {
    }

    private final boolean k(C5484b bVar) {
        return C6565s.e0(U.f66327a.e(), C5943C.d(bVar));
    }

    public static final C5507z l(C5507z zVar) {
        C6496s.h(zVar, "functionDescriptor");
        C5676i iVar = f66378o;
        f name = zVar.getName();
        C6496s.g(name, "getName(...)");
        if (!iVar.n(name)) {
            return null;
        }
        return (C5507z) C6755e.i(zVar, false, C5674g.f66376a, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean m(C5484b bVar) {
        C6496s.h(bVar, "it");
        return f66378o.k(bVar);
    }

    public static final U.b o(C5484b bVar) {
        C5484b i10;
        String d10;
        C6496s.h(bVar, "<this>");
        U.a aVar = U.f66327a;
        if (!aVar.d().contains(bVar.getName()) || (i10 = C6755e.i(bVar, false, C5675h.f66377a, 1, (Object) null)) == null || (d10 = C5943C.d(i10)) == null) {
            return null;
        }
        return aVar.l(d10);
    }

    /* access modifiers changed from: private */
    public static final boolean p(C5484b bVar) {
        C6496s.h(bVar, "it");
        if (!(bVar instanceof C5507z) || !f66378o.k(bVar)) {
            return false;
        }
        return true;
    }

    public final boolean n(f fVar) {
        C6496s.h(fVar, "<this>");
        return U.f66327a.d().contains(fVar);
    }
}
