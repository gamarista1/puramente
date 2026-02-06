package Fg;

import Jg.g;
import Jg.i;
import Jg.j;
import Jg.l;
import Jg.o;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fg.d  reason: case insensitive filesystem */
public final class C5365d {

    /* renamed from: a  reason: collision with root package name */
    public static final C5365d f62994a = new C5365d();

    private C5365d() {
    }

    private final boolean a(o oVar, j jVar, j jVar2) {
        boolean z10;
        boolean z11;
        if (oVar.t0(jVar) == oVar.t0(jVar2) && oVar.i(jVar) == oVar.i(jVar2)) {
            if (oVar.E(jVar) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (oVar.E(jVar2) == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11 && oVar.F(oVar.b(jVar), oVar.b(jVar2))) {
                if (oVar.f0(jVar, jVar2)) {
                    return true;
                }
                int t02 = oVar.t0(jVar);
                for (int i10 = 0; i10 < t02; i10++) {
                    l M10 = oVar.M(jVar, i10);
                    l M11 = oVar.M(jVar2, i10);
                    if (oVar.j(M10) != oVar.j(M11)) {
                        return false;
                    }
                    if (!oVar.j(M10) && (oVar.D0(M10) != oVar.D0(M11) || !c(oVar, oVar.E0(M10), oVar.E0(M11)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(o oVar, i iVar, i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        j f10 = oVar.f(iVar);
        j f11 = oVar.f(iVar2);
        if (f10 != null && f11 != null) {
            return a(oVar, f10, f11);
        }
        g o10 = oVar.o(iVar);
        g o11 = oVar.o(iVar2);
        if (o10 == null || o11 == null) {
            return false;
        }
        if (!a(oVar, oVar.c(o10), oVar.c(o11)) || !a(oVar, oVar.e(o10), oVar.e(o11))) {
            return false;
        }
        return true;
    }

    public final boolean b(o oVar, i iVar, i iVar2) {
        C6496s.h(oVar, "context");
        C6496s.h(iVar, "a");
        C6496s.h(iVar2, "b");
        return c(oVar, iVar, iVar2);
    }
}
