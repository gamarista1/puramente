package gg;

import Fg.S;
import Lf.o;
import Nf.c;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5494l;
import Of.C5495m;
import Of.C5507z;
import Of.c0;
import Of.g0;
import Of.t0;
import Xf.C5676i;
import Xf.T;
import gg.C5969s;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.b;
import ng.d;
import rg.C6691i;
import vg.C6755e;
import wg.C6768d;
import wg.C6769e;
import yf.q;

/* renamed from: gg.C  reason: case insensitive filesystem */
public abstract class C5943C {
    private static final void a(StringBuilder sb2, S s10) {
        sb2.append(g(s10));
    }

    public static final String b(C5507z zVar, boolean z10, boolean z11) {
        String str;
        C6496s.h(zVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (zVar instanceof C5494l) {
                str = "<init>";
            } else {
                str = zVar.getName().b();
                C6496s.g(str, "asString(...)");
            }
            sb2.append(str);
        }
        sb2.append("(");
        c0 P10 = zVar.P();
        if (P10 != null) {
            S type = P10.getType();
            C6496s.g(type, "getType(...)");
            a(sb2, type);
        }
        for (t0 type2 : zVar.k()) {
            S type3 = type2.getType();
            C6496s.g(type3, "getType(...)");
            a(sb2, type3);
        }
        sb2.append(")");
        if (z10) {
            if (C5960j.c(zVar)) {
                sb2.append("V");
            } else {
                S returnType = zVar.getReturnType();
                C6496s.e(returnType);
                a(sb2, returnType);
            }
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String c(C5507z zVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(zVar, z10, z11);
    }

    public static final String d(C5483a aVar) {
        C5487e eVar;
        g0 g0Var;
        C6496s.h(aVar, "<this>");
        C5946F f10 = C5946F.f67716a;
        if (C6691i.E(aVar)) {
            return null;
        }
        C5495m b10 = aVar.b();
        if (b10 instanceof C5487e) {
            eVar = (C5487e) b10;
        } else {
            eVar = null;
        }
        if (eVar == null || eVar.getName().j()) {
            return null;
        }
        C5483a a10 = aVar.a();
        if (a10 instanceof g0) {
            g0Var = (g0) a10;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            return null;
        }
        return C5942B.a(f10, eVar, c(g0Var, false, false, 3, (Object) null));
    }

    public static final boolean e(C5483a aVar) {
        C5969s.d dVar;
        C5507z l10;
        C6496s.h(aVar, "f");
        if (!(aVar instanceof C5507z)) {
            return false;
        }
        C5507z zVar = (C5507z) aVar;
        if (!C6496s.c(zVar.getName().b(), "remove") || zVar.k().size() != 1 || T.n((C5484b) aVar)) {
            return false;
        }
        List k10 = zVar.a().k();
        C6496s.g(k10, "getValueParameters(...)");
        S type = ((t0) C6565s.P0(k10)).getType();
        C6496s.g(type, "getType(...)");
        C5969s g10 = g(type);
        C6769e eVar = null;
        if (g10 instanceof C5969s.d) {
            dVar = (C5969s.d) g10;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            eVar = dVar.i();
        }
        if (eVar != C6769e.INT || (l10 = C5676i.l(zVar)) == null) {
            return false;
        }
        List k11 = l10.a().k();
        C6496s.g(k11, "getValueParameters(...)");
        S type2 = ((t0) C6565s.P0(k11)).getType();
        C6496s.g(type2, "getType(...)");
        C5969s g11 = g(type2);
        C5495m b10 = l10.b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        if (!C6496s.c(C6755e.p(b10), o.a.f64006f0.j()) || !(g11 instanceof C5969s.c) || !C6496s.c(((C5969s.c) g11).i(), "java/lang/Object")) {
            return false;
        }
        return true;
    }

    public static final String f(C5487e eVar) {
        C6496s.h(eVar, "<this>");
        c cVar = c.f64255a;
        d j10 = C6755e.o(eVar).j();
        C6496s.g(j10, "toUnsafe(...)");
        b n10 = cVar.n(j10);
        if (n10 == null) {
            return C5960j.b(eVar, (C5947G) null, 2, (Object) null);
        }
        String h10 = C6768d.h(n10);
        C6496s.g(h10, "internalNameByClassId(...)");
        return h10;
    }

    public static final C5969s g(S s10) {
        C6496s.h(s10, "<this>");
        return (C5969s) C5960j.e(s10, C5971u.f67823a, C5949I.f67722o, C5948H.f67717a, (C5967q) null, (q) null, 32, (Object) null);
    }
}
