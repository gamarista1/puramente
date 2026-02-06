package Of;

import Fg.C5366d0;
import Fg.S;
import Kg.d;
import Mg.t;
import Wf.b;
import kotlin.jvm.internal.C6496s;
import ng.c;
import ng.f;
import rg.C6693k;
import yg.C6812k;

/* renamed from: Of.s  reason: case insensitive filesystem */
public abstract class C5500s {
    public static final C5490h a(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        C5495m b10 = mVar.b();
        if (b10 == null || (mVar instanceof N)) {
            return null;
        }
        if (!b(b10)) {
            return a(b10);
        }
        if (b10 instanceof C5490h) {
            return (C5490h) b10;
        }
        return null;
    }

    public static final boolean b(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        return mVar.b() instanceof N;
    }

    public static final boolean c(C5507z zVar) {
        C5487e eVar;
        C5366d0 p10;
        S D10;
        S returnType;
        C6496s.h(zVar, "<this>");
        C5495m b10 = zVar.b();
        C5487e eVar2 = null;
        if (b10 instanceof C5487e) {
            eVar = (C5487e) b10;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return false;
        }
        if (C6693k.g(eVar)) {
            eVar2 = eVar;
        }
        if (eVar2 == null || (p10 = eVar2.p()) == null || (D10 = d.D(p10)) == null || (returnType = zVar.getReturnType()) == null || !C6496s.c(zVar.getName(), t.f64209e)) {
            return false;
        }
        if ((!d.s(returnType) && !d.t(returnType)) || zVar.k().size() != 1) {
            return false;
        }
        S type = ((t0) zVar.k().get(0)).getType();
        C6496s.g(type, "getType(...)");
        if (!C6496s.c(d.D(type), D10) || !zVar.x0().isEmpty() || zVar.P() != null) {
            return false;
        }
        return true;
    }

    public static final C5487e d(H h10, c cVar, b bVar) {
        C5487e eVar;
        C5496n nVar;
        C6812k V10;
        C6496s.h(h10, "<this>");
        C6496s.h(cVar, "fqName");
        C6496s.h(bVar, "lookupLocation");
        if (cVar.d()) {
            return null;
        }
        c e10 = cVar.e();
        C6496s.g(e10, "parent(...)");
        C6812k o10 = h10.l0(e10).o();
        f g10 = cVar.g();
        C6496s.g(g10, "shortName(...)");
        C5490h e11 = o10.e(g10, bVar);
        if (e11 instanceof C5487e) {
            eVar = (C5487e) e11;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        c e12 = cVar.e();
        C6496s.g(e12, "parent(...)");
        C5487e d10 = d(h10, e12, bVar);
        if (d10 == null || (V10 = d10.V()) == null) {
            nVar = null;
        } else {
            f g11 = cVar.g();
            C6496s.g(g11, "shortName(...)");
            nVar = V10.e(g11, bVar);
        }
        if (nVar instanceof C5487e) {
            return (C5487e) nVar;
        }
        return null;
    }
}
