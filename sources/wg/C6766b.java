package wg;

import Fg.S;
import Kg.d;
import Lf.o;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.C5501t;
import Of.m0;
import Of.t0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import rg.C6691i;
import rg.C6693k;
import vg.C6755e;

/* renamed from: wg.b  reason: case insensitive filesystem */
public abstract class C6766b {
    private static final boolean a(C5487e eVar) {
        return C6496s.c(C6755e.o(eVar), o.f63950w);
    }

    private static final boolean b(S s10, boolean z10) {
        m0 m0Var;
        C5490h o10 = s10.N0().o();
        if (o10 instanceof m0) {
            m0Var = (m0) o10;
        } else {
            m0Var = null;
        }
        if (m0Var == null) {
            return false;
        }
        if ((z10 || !C6693k.d(m0Var)) && e(d.o(m0Var))) {
            return true;
        }
        return false;
    }

    public static final boolean c(S s10) {
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 == null) {
            return false;
        }
        if ((!C6693k.b(o10) || !d(o10)) && !C6693k.i(s10)) {
            return false;
        }
        return true;
    }

    public static final boolean d(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        if (!C6693k.g(mVar) || a((C5487e) mVar)) {
            return false;
        }
        return true;
    }

    private static final boolean e(S s10) {
        if (c(s10) || b(s10, true)) {
            return true;
        }
        return false;
    }

    public static final boolean f(C5484b bVar) {
        C5486d dVar;
        C6496s.h(bVar, "descriptor");
        if (bVar instanceof C5486d) {
            dVar = (C5486d) bVar;
        } else {
            dVar = null;
        }
        if (dVar == null || C5501t.g(dVar.getVisibility())) {
            return false;
        }
        C5487e e02 = dVar.e0();
        C6496s.g(e02, "getConstructedClass(...)");
        if (C6693k.g(e02) || C6691i.G(dVar.e0())) {
            return false;
        }
        List k10 = dVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        Iterable<t0> iterable = k10;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (t0 type : iterable) {
            S type2 = type.getType();
            C6496s.g(type2, "getType(...)");
            if (e(type2)) {
                return true;
            }
        }
        return false;
    }
}
