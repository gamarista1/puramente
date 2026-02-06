package fg;

import Jg.i;
import Jg.l;
import Jg.m;
import Jg.n;
import Jg.o;
import Jg.s;
import Nf.c;
import Xf.C5669b;
import Xf.C5670c;
import Xf.E;
import Xf.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.d;
import yf.C6798l;

/* renamed from: fg.d  reason: case insensitive filesystem */
public abstract class C5902d {

    /* renamed from: fg.d$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final i f67628a;

        /* renamed from: b  reason: collision with root package name */
        private final E f67629b;

        /* renamed from: c  reason: collision with root package name */
        private final n f67630c;

        public a(i iVar, E e10, n nVar) {
            this.f67628a = iVar;
            this.f67629b = e10;
            this.f67630c = nVar;
        }

        public final E a() {
            return this.f67629b;
        }

        public final i b() {
            return this.f67628a;
        }

        public final n c() {
            return this.f67630c;
        }
    }

    private final C5918l G(C5918l lVar, C5918l lVar2) {
        if (lVar == null) {
            return lVar2;
        }
        if (lVar2 == null) {
            return lVar;
        }
        if (lVar.d() && !lVar2.d()) {
            return lVar2;
        }
        if (!lVar.d() && lVar2.d()) {
            return lVar;
        }
        if (lVar.c().compareTo(lVar2.c()) >= 0 && lVar.c().compareTo(lVar2.c()) > 0) {
            return lVar;
        }
        return lVar2;
    }

    private final List H(i iVar) {
        return j(new a(iVar, f(iVar, r()), (n) null), new C5900c(this, A()));
    }

    /* access modifiers changed from: private */
    public static final Iterable I(C5902d dVar, o oVar, a aVar) {
        i b10;
        m J10;
        List G02;
        a aVar2;
        i b11;
        C6496s.h(aVar, "it");
        if ((dVar.z() && (b11 = aVar.b()) != null && oVar.m0(b11)) || (b10 = aVar.b()) == null || (J10 = oVar.J(b10)) == null || (G02 = oVar.G0(J10)) == null) {
            return null;
        }
        Iterable iterable = G02;
        Iterable R10 = oVar.R(aVar.b());
        Iterator it = iterable.iterator();
        Iterator it2 = R10.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C6565s.y(iterable, 10), C6565s.y(R10, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            l lVar = (l) it2.next();
            n nVar = (n) next;
            if (oVar.j(lVar)) {
                aVar2 = new a((i) null, aVar.a(), nVar);
            } else {
                i E02 = oVar.E0(lVar);
                aVar2 = new a(E02, dVar.f(E02, aVar.a()), nVar);
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C5910h e(C5915j0 j0Var, C5910h[] hVarArr, int i10) {
        Map b10;
        C5910h hVar;
        if (j0Var != null && (b10 = j0Var.b()) != null && (hVar = (C5910h) b10.get(Integer.valueOf(i10))) != null) {
            return hVar;
        }
        if (i10 < 0 || i10 >= hVarArr.length) {
            return C5910h.f67654e.a();
        }
        return hVarArr[i10];
    }

    private final E f(i iVar, E e10) {
        return m().d(e10, n(iVar));
    }

    private final C5910h g(i iVar) {
        C5916k kVar;
        boolean z10;
        C5916k y10 = y(iVar);
        C5912i iVar2 = null;
        if (y10 == null) {
            i v10 = v(iVar);
            if (v10 != null) {
                kVar = y(v10);
            } else {
                kVar = null;
            }
        } else {
            kVar = y10;
        }
        o A10 = A();
        c cVar = c.f64255a;
        if (cVar.l(x(A10.v0(iVar)))) {
            iVar2 = C5912i.READ_ONLY;
        } else if (cVar.k(x(A10.k(iVar)))) {
            iVar2 = C5912i.MUTABLE;
        }
        boolean z11 = true;
        if (A().S(iVar) || F(iVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (kVar == y10) {
            z11 = false;
        }
        return new C5910h(kVar, iVar2, z10, z11);
    }

    private final C5910h h(a aVar) {
        boolean z10;
        Iterable iterable;
        n nVar;
        boolean z11;
        C5670c cVar;
        w wVar;
        C5918l lVar;
        C5916k kVar;
        boolean z12;
        C5918l lVar2;
        i b10;
        m J10;
        s sVar;
        C5916k kVar2 = null;
        if (aVar.b() == null) {
            o A10 = A();
            n c10 = aVar.c();
            if (c10 != null) {
                sVar = A10.P(c10);
            } else {
                sVar = null;
            }
            if (sVar == s.IN) {
                return C5910h.f67654e.a();
            }
        }
        boolean z13 = false;
        if (aVar.c() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        i b11 = aVar.b();
        if (b11 == null || (iterable = n(b11)) == null) {
            iterable = C6565s.n();
        }
        o A11 = A();
        i b12 = aVar.b();
        if (b12 == null || (J10 = A11.J(b12)) == null) {
            nVar = null;
        } else {
            nVar = A11.B(J10);
        }
        if (q() == C5670c.TYPE_PARAMETER_BOUNDS) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            if (z11 || !u() || (b10 = aVar.b()) == null || !B(b10)) {
                iterable = C6565s.I0(p(), iterable);
            } else {
                Iterable p10 = p();
                ArrayList arrayList = new ArrayList();
                for (Object next : p10) {
                    if (!m().p(next)) {
                        arrayList.add(next);
                    }
                }
                iterable = C6565s.K0(arrayList, iterable);
            }
        }
        C5912i g10 = m().g(iterable);
        C5918l h10 = m().h(iterable, new C5896a(this, aVar));
        if (h10 != null) {
            C5916k c11 = h10.c();
            if (h10.c() == C5916k.NOT_NULL && nVar != null) {
                z13 = true;
            }
            return new C5910h(c11, g10, z13, h10.d());
        }
        if (z10 || z11) {
            cVar = q();
        } else {
            cVar = C5670c.TYPE_USE;
        }
        E a10 = aVar.a();
        if (a10 != null) {
            wVar = a10.a(cVar);
        } else {
            wVar = null;
        }
        if (nVar != null) {
            lVar = o(nVar);
        } else {
            lVar = null;
        }
        C5918l t10 = t(lVar, wVar);
        if (lVar != null) {
            kVar = lVar.c();
        } else {
            kVar = null;
        }
        if (kVar == C5916k.NOT_NULL || !(nVar == null || wVar == null || !wVar.c())) {
            z12 = true;
        } else {
            z12 = false;
        }
        n c12 = aVar.c();
        if (c12 == null || (lVar2 = o(c12)) == null) {
            lVar2 = null;
        } else if (lVar2.c() == C5916k.NULLABLE) {
            lVar2 = C5918l.b(lVar2, C5916k.FORCE_FLEXIBILITY, false, 2, (Object) null);
        }
        C5918l G10 = G(lVar2, t10);
        if (G10 != null) {
            kVar2 = G10.c();
        }
        if (G10 != null && G10.d()) {
            z13 = true;
        }
        return new C5910h(kVar2, g10, z12, z13);
    }

    /* access modifiers changed from: private */
    public static final boolean i(C5902d dVar, a aVar, Object obj) {
        C6496s.h(obj, "$this$extractNullability");
        return dVar.l(obj, aVar.b());
    }

    private final List j(Object obj, C6798l lVar) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, lVar);
        return arrayList;
    }

    private final void k(Object obj, List list, C6798l lVar) {
        list.add(obj);
        Iterable<Object> iterable = (Iterable) lVar.invoke(obj);
        if (iterable != null) {
            for (Object k10 : iterable) {
                k(k10, list, lVar);
            }
        }
    }

    private final C5918l o(n nVar) {
        List list;
        C5916k kVar;
        boolean z10;
        o A10 = A();
        if (!E(nVar)) {
            return null;
        }
        List A11 = A10.A(nVar);
        Iterable<i> iterable = A11;
        boolean z11 = iterable instanceof Collection;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!A10.a0((i) it.next())) {
                    if (!z11 || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (y((i) it2.next()) != null) {
                                    list = A11;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z11 || !((Collection) iterable).isEmpty()) {
                        for (i v10 : iterable) {
                            if (v(v10) != null) {
                                list = new ArrayList();
                                for (i v11 : iterable) {
                                    i v12 = v(v11);
                                    if (v12 != null) {
                                        list.add(v12);
                                    }
                                }
                                Iterable iterable2 = list;
                                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                    Iterator it3 = iterable2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!A10.w((i) it3.next())) {
                                                kVar = C5916k.NOT_NULL;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                kVar = C5916k.NULLABLE;
                                if (list != A11) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                return new C5918l(kVar, z10);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final C5916k y(i iVar) {
        o A10 = A();
        if (A10.i(A10.v0(iVar))) {
            return C5916k.NULLABLE;
        }
        if (!A10.i(A10.k(iVar))) {
            return C5916k.NOT_NULL;
        }
        return null;
    }

    public abstract o A();

    public abstract boolean B(i iVar);

    public abstract boolean C();

    public abstract boolean D(i iVar, i iVar2);

    public abstract boolean E(n nVar);

    public abstract boolean F(i iVar);

    public final C6798l d(i iVar, Iterable iterable, C5915j0 j0Var, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        C5910h hVar;
        i b10;
        C6496s.h(iVar, "<this>");
        C6496s.h(iterable, "overrides");
        List H10 = H(iVar);
        ArrayList<List> arrayList = new ArrayList<>(C6565s.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(H((i) it.next()));
        }
        if (w()) {
            i10 = 1;
        } else {
            if (C() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!D(iVar, (i) it2.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i10 = H10.size();
        }
        C5910h[] hVarArr = new C5910h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            C5910h h10 = h((a) H10.get(i11));
            ArrayList arrayList2 = new ArrayList();
            for (List r02 : arrayList) {
                a aVar = (a) C6565s.r0(r02, i11);
                if (aVar == null || (b10 = aVar.b()) == null) {
                    hVar = null;
                } else {
                    hVar = g(b10);
                }
                if (hVar != null) {
                    arrayList2.add(hVar);
                }
            }
            if (i11 != 0 || !C()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (i11 != 0 || !s()) {
                z12 = false;
            } else {
                z12 = true;
            }
            hVarArr[i11] = C5919l0.a(h10, arrayList2, z11, z12, z10);
        }
        return new C5898b(j0Var, hVarArr);
    }

    public abstract boolean l(Object obj, i iVar);

    public abstract C5669b m();

    public abstract Iterable n(i iVar);

    public abstract Iterable p();

    public abstract C5670c q();

    public abstract E r();

    public abstract boolean s();

    /* access modifiers changed from: protected */
    public abstract C5918l t(C5918l lVar, w wVar);

    public abstract boolean u();

    public abstract i v(i iVar);

    public boolean w() {
        return false;
    }

    public abstract d x(i iVar);

    public abstract boolean z();
}
