package Xf;

import Fg.C5366d0;
import Gg.w;
import Lf.i;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5495m;
import Of.Y;
import Of.Z;
import Of.g0;
import Zf.c;
import kotlin.jvm.internal.C6496s;
import ng.f;
import rg.C6691i;
import vg.C6755e;

public abstract class T {
    public static final boolean d(C5484b bVar) {
        C6496s.h(bVar, "<this>");
        if (g(bVar) != null) {
            return true;
        }
        return false;
    }

    public static final String e(C5484b bVar) {
        C5484b w10;
        f j10;
        C6496s.h(bVar, "callableMemberDescriptor");
        C5484b f10 = f(bVar);
        if (f10 == null || (w10 = C6755e.w(f10)) == null) {
            return null;
        }
        if (w10 instanceof Z) {
            return C5680m.f66386a.b(w10);
        }
        if (!(w10 instanceof g0) || (j10 = C5673f.f66375o.j((g0) w10)) == null) {
            return null;
        }
        return j10.b();
    }

    private static final C5484b f(C5484b bVar) {
        if (i.g0(bVar)) {
            return g(bVar);
        }
        return null;
    }

    public static final C5484b g(C5484b bVar) {
        C6496s.h(bVar, "<this>");
        if (!U.f66327a.g().contains(bVar.getName()) && !C5677j.f66379a.d().contains(C6755e.w(bVar).getName())) {
            return null;
        }
        if ((bVar instanceof Z) || (bVar instanceof Y)) {
            return C6755e.i(bVar, false, P.f66324a, 1, (Object) null);
        }
        if (bVar instanceof g0) {
            return C6755e.i(bVar, false, Q.f66325a, 1, (Object) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean h(C5484b bVar) {
        C6496s.h(bVar, "it");
        return C5680m.f66386a.d(C6755e.w(bVar));
    }

    /* access modifiers changed from: private */
    public static final boolean i(C5484b bVar) {
        C6496s.h(bVar, "it");
        return C5673f.f66375o.k((g0) bVar);
    }

    public static final C5484b j(C5484b bVar) {
        C6496s.h(bVar, "<this>");
        C5484b g10 = g(bVar);
        if (g10 != null) {
            return g10;
        }
        C5676i iVar = C5676i.f66378o;
        f name = bVar.getName();
        C6496s.g(name, "getName(...)");
        if (!iVar.n(name)) {
            return null;
        }
        return C6755e.i(bVar, false, S.f66326a, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean k(C5484b bVar) {
        C6496s.h(bVar, "it");
        if (!i.g0(bVar) || C5676i.o(bVar) == null) {
            return false;
        }
        return true;
    }

    public static final boolean l(C5487e eVar, C5483a aVar) {
        C6496s.h(eVar, "<this>");
        C6496s.h(aVar, "specialCallableDescriptor");
        C5495m b10 = aVar.b();
        C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C5366d0 p10 = ((C5487e) b10).p();
        C6496s.g(p10, "getDefaultType(...)");
        for (C5487e s10 = C6691i.s(eVar); s10 != null; s10 = C6691i.s(s10)) {
            if (!(s10 instanceof c) && w.b(s10.p(), p10) != null) {
                return !i.g0(s10);
            }
        }
        return false;
    }

    public static final boolean m(C5484b bVar) {
        C6496s.h(bVar, "<this>");
        return C6755e.w(bVar).b() instanceof c;
    }

    public static final boolean n(C5484b bVar) {
        C6496s.h(bVar, "<this>");
        if (m(bVar) || i.g0(bVar)) {
            return true;
        }
        return false;
    }
}
