package Rb;

import Lb.l;
import Qb.c;
import Rb.d;
import Tb.h;
import Tb.i;
import Tb.m;
import Tb.n;

public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final h f52324a;

    public b(h hVar) {
        this.f52324a = hVar;
    }

    public i b(i iVar, Tb.b bVar, n nVar, l lVar, d.a aVar, a aVar2) {
        Ob.l.g(iVar.n(this.f52324a), "The index must match the filter");
        n k10 = iVar.k();
        n k02 = k10.k0(bVar);
        if (k02.U(lVar).equals(nVar.U(lVar)) && k02.isEmpty() == nVar.isEmpty()) {
            return iVar;
        }
        if (aVar2 != null) {
            if (nVar.isEmpty()) {
                if (k10.w(bVar)) {
                    aVar2.b(c.h(bVar, k02));
                } else {
                    Ob.l.g(k10.e0(), "A child remove without an old child only makes sense on a leaf node");
                }
            } else if (k02.isEmpty()) {
                aVar2.b(c.c(bVar, nVar));
            } else {
                aVar2.b(c.e(bVar, nVar, k02));
            }
        }
        if (!k10.e0() || !nVar.isEmpty()) {
            return iVar.r(bVar, nVar);
        }
        return iVar;
    }

    public i c(i iVar, i iVar2, a aVar) {
        Ob.l.g(iVar2.n(this.f52324a), "Can't use IndexedNode that doesn't have filter's index");
        if (aVar != null) {
            for (m mVar : iVar.k()) {
                if (!iVar2.k().w(mVar.c())) {
                    aVar.b(c.h(mVar.c(), mVar.d()));
                }
            }
            if (!iVar2.k().e0()) {
                for (m mVar2 : iVar2.k()) {
                    if (iVar.k().w(mVar2.c())) {
                        n k02 = iVar.k().k0(mVar2.c());
                        if (!k02.equals(mVar2.d())) {
                            aVar.b(c.e(mVar2.c(), mVar2.d(), k02));
                        }
                    } else {
                        aVar.b(c.c(mVar2.c(), mVar2.d()));
                    }
                }
            }
        }
        return iVar2;
    }

    public boolean d() {
        return false;
    }

    public i e(i iVar, n nVar) {
        if (iVar.k().isEmpty()) {
            return iVar;
        }
        return iVar.t(nVar);
    }

    public h getIndex() {
        return this.f52324a;
    }

    public d a() {
        return this;
    }
}
