package Lf;

import Fg.B0;
import Fg.C5366d0;
import Fg.S;
import Fg.V;
import Fg.s0;
import Kg.d;
import Lf.o;
import Mf.f;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Pf.c;
import Pf.l;
import Pg.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import ng.f;
import tg.g;
import tg.n;
import tg.x;
import vg.C6755e;

public abstract class h {
    public static final int a(S s10) {
        C6496s.h(s10, "<this>");
        c i10 = s10.getAnnotations().i(o.a.f63960D);
        if (i10 == null) {
            return 0;
        }
        g gVar = (g) O.j(i10.a(), o.f63944q);
        C6496s.f(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((n) gVar).b()).intValue();
    }

    public static final C5366d0 b(i iVar, Pf.h hVar, S s10, List list, List list2, List list3, S s11, boolean z10) {
        int i10;
        C6496s.h(iVar, "builtIns");
        C6496s.h(hVar, "annotations");
        C6496s.h(list, "contextReceiverTypes");
        C6496s.h(list2, "parameterTypes");
        C6496s.h(s11, "returnType");
        List g10 = g(s10, list, list2, list3, s11, iVar);
        int size = list2.size() + list.size();
        if (s10 == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        C5487e f10 = f(iVar, size + i10, z10);
        if (s10 != null) {
            hVar = u(hVar, iVar);
        }
        if (!list.isEmpty()) {
            hVar = t(hVar, iVar, list.size());
        }
        return V.h(s0.b(hVar), f10, g10);
    }

    public static /* synthetic */ C5366d0 c(i iVar, Pf.h hVar, S s10, List list, List list2, List list3, S s11, boolean z10, int i10, Object obj) {
        boolean z11;
        if ((i10 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return b(iVar, hVar, s10, list, list2, list3, s11, z11);
    }

    public static final f d(S s10) {
        x xVar;
        String str;
        C6496s.h(s10, "<this>");
        c i10 = s10.getAnnotations().i(o.a.f63962E);
        if (i10 == null) {
            return null;
        }
        Object Q02 = C6565s.Q0(i10.a().values());
        if (Q02 instanceof x) {
            xVar = (x) Q02;
        } else {
            xVar = null;
        }
        if (!(xVar == null || (str = (String) xVar.b()) == null)) {
            if (!f.l(str)) {
                str = null;
            }
            if (str != null) {
                return f.i(str);
            }
        }
        return null;
    }

    public static final List e(S s10) {
        C6496s.h(s10, "<this>");
        p(s10);
        int a10 = a(s10);
        if (a10 == 0) {
            return C6565s.n();
        }
        Iterable<B0> subList = s10.L0().subList(0, a10);
        ArrayList arrayList = new ArrayList(C6565s.y(subList, 10));
        for (B0 type : subList) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    public static final C5487e f(i iVar, int i10, boolean z10) {
        C5487e eVar;
        C6496s.h(iVar, "builtIns");
        if (z10) {
            eVar = iVar.X(i10);
        } else {
            eVar = iVar.C(i10);
        }
        C6496s.e(eVar);
        return eVar;
    }

    public static final List g(S s10, List list, List list2, List list3, S s11, i iVar) {
        int i10;
        B0 b02;
        f fVar;
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        C6496s.h(list4, "contextReceiverTypes");
        C6496s.h(list5, "parameterTypes");
        C6496s.h(s11, "returnType");
        C6496s.h(iVar, "builtIns");
        int size = list2.size() + list.size();
        int i11 = 0;
        if (s10 != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList(size + i10 + 1);
        Iterable<S> iterable = list4;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
        for (S d10 : iterable) {
            arrayList2.add(d.d(d10));
        }
        arrayList.addAll(arrayList2);
        if (s10 != null) {
            b02 = d.d(s10);
        } else {
            b02 = null;
        }
        a.a(arrayList, b02);
        for (Object next : list5) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            S s12 = (S) next;
            if (list6 == null || (fVar = (f) list6.get(i11)) == null || fVar.j()) {
                fVar = null;
            }
            if (fVar != null) {
                ng.c cVar = o.a.f63962E;
                f fVar2 = o.f63940m;
                String b10 = fVar.b();
                C6496s.g(b10, "asString(...)");
                s12 = d.C(s12, Pf.h.f64602L.a(C6565s.J0(s12.getAnnotations(), new l(iVar, cVar, O.f(C6502A.a(fVar2, new x(b10))), false, 8, (DefaultConstructorMarker) null))));
            }
            arrayList.add(d.d(s12));
            i11 = i12;
        }
        arrayList.add(d.d(s11));
        return arrayList;
    }

    public static final Mf.f h(S s10) {
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 != null) {
            return i(o10);
        }
        return null;
    }

    public static final Mf.f i(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        if ((mVar instanceof C5487e) && i.B0(mVar)) {
            return j(C6755e.p(mVar));
        }
        return null;
    }

    private static final Mf.f j(ng.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        Mf.g a10 = Mf.g.f64127c.a();
        ng.c e10 = dVar.l().e();
        C6496s.g(e10, "parent(...)");
        String b10 = dVar.i().b();
        C6496s.g(b10, "asString(...)");
        return a10.b(e10, b10);
    }

    public static final S k(S s10) {
        C6496s.h(s10, "<this>");
        p(s10);
        if (!s(s10)) {
            return null;
        }
        return ((B0) s10.L0().get(a(s10))).getType();
    }

    public static final S l(S s10) {
        C6496s.h(s10, "<this>");
        p(s10);
        S type = ((B0) C6565s.z0(s10.L0())).getType();
        C6496s.g(type, "getType(...)");
        return type;
    }

    public static final List m(S s10) {
        C6496s.h(s10, "<this>");
        p(s10);
        List L02 = s10.L0();
        return L02.subList(a(s10) + (n(s10) ? 1 : 0), L02.size() - 1);
    }

    public static final boolean n(S s10) {
        C6496s.h(s10, "<this>");
        if (!p(s10) || !s(s10)) {
            return false;
        }
        return true;
    }

    public static final boolean o(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        Mf.f i10 = i(mVar);
        if (C6496s.c(i10, f.a.f64123e) || C6496s.c(i10, f.d.f64126e)) {
            return true;
        }
        return false;
    }

    public static final boolean p(S s10) {
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 == null || !o(o10)) {
            return false;
        }
        return true;
    }

    public static final boolean q(S s10) {
        C6496s.h(s10, "<this>");
        return C6496s.c(h(s10), f.a.f64123e);
    }

    public static final boolean r(S s10) {
        C6496s.h(s10, "<this>");
        return C6496s.c(h(s10), f.d.f64126e);
    }

    private static final boolean s(S s10) {
        if (s10.getAnnotations().i(o.a.f63958C) != null) {
            return true;
        }
        return false;
    }

    public static final Pf.h t(Pf.h hVar, i iVar, int i10) {
        C6496s.h(hVar, "<this>");
        C6496s.h(iVar, "builtIns");
        ng.c cVar = o.a.f63960D;
        if (hVar.n0(cVar)) {
            return hVar;
        }
        return Pf.h.f64602L.a(C6565s.J0(hVar, new l(iVar, cVar, O.f(C6502A.a(o.f63944q, new n(i10))), false, 8, (DefaultConstructorMarker) null)));
    }

    public static final Pf.h u(Pf.h hVar, i iVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(iVar, "builtIns");
        ng.c cVar = o.a.f63958C;
        if (hVar.n0(cVar)) {
            return hVar;
        }
        return Pf.h.f64602L.a(C6565s.J0(hVar, new l(iVar, cVar, O.i(), false, 8, (DefaultConstructorMarker) null)));
    }
}
