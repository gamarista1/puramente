package rg;

import Fg.C5366d0;
import Fg.G0;
import Fg.N0;
import Fg.S;
import Gg.s;
import Of.A;
import Of.C5483a;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.I;
import Of.Z;
import Of.a0;
import Of.r0;
import Of.u0;
import kotlin.jvm.internal.C6496s;
import ng.b;
import ng.c;
import ng.f;
import vg.C6755e;

/* renamed from: rg.k  reason: case insensitive filesystem */
public abstract class C6693k {

    /* renamed from: a  reason: collision with root package name */
    private static final c f73029a;

    /* renamed from: b  reason: collision with root package name */
    private static final b f73030b;

    static {
        c cVar = new c("kotlin.jvm.JvmInline");
        f73029a = cVar;
        f73030b = b.f72283d.c(cVar);
    }

    public static final boolean a(C5483a aVar) {
        C6496s.h(aVar, "<this>");
        if (aVar instanceof a0) {
            Z X10 = ((a0) aVar).X();
            C6496s.g(X10, "getCorrespondingProperty(...)");
            if (f(X10)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        if (!(mVar instanceof C5487e) || !(((C5487e) mVar).W() instanceof A)) {
            return false;
        }
        return true;
    }

    public static final boolean c(S s10) {
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 != null) {
            return b(o10);
        }
        return false;
    }

    public static final boolean d(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        if (!(mVar instanceof C5487e) || !(((C5487e) mVar).W() instanceof I)) {
            return false;
        }
        return true;
    }

    public static final boolean e(u0 u0Var) {
        C5487e eVar;
        A q10;
        C6496s.h(u0Var, "<this>");
        if (u0Var.P() == null) {
            C5495m b10 = u0Var.b();
            f fVar = null;
            if (b10 instanceof C5487e) {
                eVar = (C5487e) b10;
            } else {
                eVar = null;
            }
            if (!(eVar == null || (q10 = C6755e.q(eVar)) == null)) {
                fVar = q10.c();
            }
            if (C6496s.c(fVar, u0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(u0 u0Var) {
        C5487e eVar;
        r0 W10;
        C6496s.h(u0Var, "<this>");
        if (u0Var.P() == null) {
            C5495m b10 = u0Var.b();
            if (b10 instanceof C5487e) {
                eVar = (C5487e) b10;
            } else {
                eVar = null;
            }
            if (!(eVar == null || (W10 = eVar.W()) == null)) {
                f name = u0Var.getName();
                C6496s.g(name, "getName(...)");
                if (W10.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        if (b(mVar) || d(mVar)) {
            return true;
        }
        return false;
    }

    public static final boolean h(S s10) {
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 != null) {
            return g(o10);
        }
        return false;
    }

    public static final boolean i(S s10) {
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 == null || !d(o10) || s.f63205a.w(s10)) {
            return false;
        }
        return true;
    }

    public static final S j(S s10) {
        C6496s.h(s10, "<this>");
        S k10 = k(s10);
        if (k10 != null) {
            return G0.f(s10).p(k10, N0.INVARIANT);
        }
        return null;
    }

    public static final S k(S s10) {
        C5487e eVar;
        A q10;
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 instanceof C5487e) {
            eVar = (C5487e) o10;
        } else {
            eVar = null;
        }
        if (eVar == null || (q10 = C6755e.q(eVar)) == null) {
            return null;
        }
        return (C5366d0) q10.d();
    }
}
