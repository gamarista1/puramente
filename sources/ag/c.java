package ag;

import Of.C5489g;
import Of.C5495m;
import Pf.h;
import Xf.E;
import eg.z;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import lf.C6534r;

public abstract class c {
    private static final k c(k kVar, C5495m mVar, z zVar, int i10, Lazy lazy) {
        p pVar;
        d a10 = kVar.a();
        if (zVar != null) {
            pVar = new m(kVar, mVar, zVar, i10);
        } else {
            pVar = kVar.f();
        }
        return new k(a10, pVar, lazy);
    }

    public static final k d(k kVar, p pVar) {
        C6496s.h(kVar, "<this>");
        C6496s.h(pVar, "typeParameterResolver");
        return new k(kVar.a(), pVar, kVar.c());
    }

    public static final k e(k kVar, C5489g gVar, z zVar, int i10) {
        C6496s.h(kVar, "<this>");
        C6496s.h(gVar, "containingDeclaration");
        return c(kVar, gVar, zVar, i10, C6531o.a(C6534r.NONE, new C5729a(kVar, gVar)));
    }

    public static /* synthetic */ k f(k kVar, C5489g gVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(kVar, gVar, zVar, i10);
    }

    /* access modifiers changed from: private */
    public static final E g(k kVar, C5489g gVar) {
        return j(kVar, gVar.getAnnotations());
    }

    public static final k h(k kVar, C5495m mVar, z zVar, int i10) {
        C6496s.h(kVar, "<this>");
        C6496s.h(mVar, "containingDeclaration");
        C6496s.h(zVar, "typeParameterOwner");
        return c(kVar, mVar, zVar, i10, kVar.c());
    }

    public static /* synthetic */ k i(k kVar, C5495m mVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(kVar, mVar, zVar, i10);
    }

    public static final E j(k kVar, h hVar) {
        C6496s.h(kVar, "<this>");
        C6496s.h(hVar, "additionalAnnotations");
        return kVar.a().a().d(kVar.b(), hVar);
    }

    public static final k k(k kVar, h hVar) {
        C6496s.h(kVar, "<this>");
        C6496s.h(hVar, "additionalAnnotations");
        if (hVar.isEmpty()) {
            return kVar;
        }
        return new k(kVar.a(), kVar.f(), C6531o.a(C6534r.NONE, new b(kVar, hVar)));
    }

    /* access modifiers changed from: private */
    public static final E l(k kVar, h hVar) {
        return j(kVar, hVar);
    }

    public static final k m(k kVar, d dVar) {
        C6496s.h(kVar, "<this>");
        C6496s.h(dVar, "components");
        return new k(dVar, kVar.f(), kVar.c());
    }
}
