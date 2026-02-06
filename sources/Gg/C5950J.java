package gg;

import Fg.H0;
import Jg.i;
import Jg.m;
import Lf.l;
import Nf.c;
import fg.C5919l0;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import ng.b;
import ng.d;
import wg.C6768d;
import wg.C6769e;

/* renamed from: gg.J  reason: case insensitive filesystem */
public abstract class C5950J {
    public static final Object a(C5970t tVar, Object obj, boolean z10) {
        C6496s.h(tVar, "<this>");
        C6496s.h(obj, "possiblyPrimitiveType");
        if (z10) {
            return tVar.c(obj);
        }
        return obj;
    }

    public static final Object b(H0 h02, i iVar, C5970t tVar, C5949I i10) {
        b bVar;
        boolean z10;
        C6496s.h(h02, "<this>");
        C6496s.h(iVar, "type");
        C6496s.h(tVar, "typeFactory");
        C6496s.h(i10, "mode");
        m J10 = h02.J(iVar);
        if (!h02.r0(J10)) {
            return null;
        }
        l l10 = h02.l(J10);
        if (l10 != null) {
            Object b10 = tVar.b(l10);
            if (h02.w(iVar) || C5919l0.c(h02, iVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            return a(tVar, b10, z10);
        }
        l Z10 = h02.Z(J10);
        if (Z10 != null) {
            return tVar.a('[' + C6769e.b(Z10).e());
        }
        if (h02.v(J10)) {
            d G10 = h02.G(J10);
            if (G10 != null) {
                bVar = c.f64255a.n(G10);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                if (!i10.a()) {
                    Iterable<c.a> i11 = c.f64255a.i();
                    if (!(i11 instanceof Collection) || !((Collection) i11).isEmpty()) {
                        for (c.a d10 : i11) {
                            if (C6496s.c(d10.d(), bVar)) {
                                return null;
                            }
                        }
                    }
                }
                String h10 = C6768d.h(bVar);
                C6496s.g(h10, "internalNameByClassId(...)");
                return tVar.e(h10);
            }
        }
        return null;
    }
}
