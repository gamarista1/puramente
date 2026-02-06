package Rb;

import Ob.l;
import Rb.d;
import Tb.b;
import Tb.g;
import Tb.h;
import Tb.i;
import Tb.m;
import Tb.n;
import Tb.r;
import java.util.Iterator;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final e f52325a;

    /* renamed from: b  reason: collision with root package name */
    private final h f52326b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52327c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f52328d;

    public c(Qb.h hVar) {
        this.f52325a = new e(hVar);
        this.f52326b = hVar.d();
        this.f52327c = hVar.i();
        this.f52328d = !hVar.r();
    }

    private i f(i iVar, b bVar, n nVar, d.a aVar, a aVar2) {
        boolean z10;
        m mVar;
        int i10 = 1;
        if (iVar.k().getChildCount() == this.f52327c) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.f(z10);
        m mVar2 = new m(bVar, nVar);
        if (this.f52328d) {
            mVar = iVar.g();
        } else {
            mVar = iVar.h();
        }
        boolean j10 = this.f52325a.j(mVar2);
        if (iVar.k().w(bVar)) {
            n k02 = iVar.k().k0(bVar);
            m b10 = aVar.b(this.f52326b, mVar, this.f52328d);
            while (b10 != null && (b10.c().equals(bVar) || iVar.k().w(b10.c()))) {
                b10 = aVar.b(this.f52326b, b10, this.f52328d);
            }
            if (b10 != null) {
                i10 = this.f52326b.a(b10, mVar2, this.f52328d);
            }
            if (!j10 || nVar.isEmpty() || i10 < 0) {
                if (aVar2 != null) {
                    aVar2.b(Qb.c.h(bVar, k02));
                }
                i r10 = iVar.r(bVar, g.A());
                if (b10 == null || !this.f52325a.j(b10)) {
                    return r10;
                }
                if (aVar2 != null) {
                    aVar2.b(Qb.c.c(b10.c(), b10.d()));
                }
                return r10.r(b10.c(), b10.d());
            }
            if (aVar2 != null) {
                aVar2.b(Qb.c.e(bVar, nVar, k02));
            }
            return iVar.r(bVar, nVar);
        } else if (nVar.isEmpty() || !j10 || this.f52326b.a(mVar, mVar2, this.f52328d) < 0) {
            return iVar;
        } else {
            if (aVar2 != null) {
                aVar2.b(Qb.c.h(mVar.c(), mVar.d()));
                aVar2.b(Qb.c.c(bVar, nVar));
            }
            return iVar.r(bVar, nVar).r(mVar.c(), g.A());
        }
    }

    public d a() {
        return this.f52325a.a();
    }

    public i b(i iVar, b bVar, n nVar, Lb.l lVar, d.a aVar, a aVar2) {
        if (!this.f52325a.j(new m(bVar, nVar))) {
            nVar = g.A();
        }
        n nVar2 = nVar;
        if (iVar.k().k0(bVar).equals(nVar2)) {
            return iVar;
        }
        if (iVar.k().getChildCount() < this.f52327c) {
            return this.f52325a.a().b(iVar, bVar, nVar2, lVar, aVar, aVar2);
        }
        return f(iVar, bVar, nVar2, aVar, aVar2);
    }

    public i c(i iVar, i iVar2, a aVar) {
        i iVar3;
        Iterator it;
        int i10;
        m mVar;
        m mVar2;
        if (iVar2.k().e0() || iVar2.k().isEmpty()) {
            iVar3 = i.d(g.A(), this.f52326b);
        } else {
            iVar3 = iVar2.t(r.a());
            if (this.f52328d) {
                it = iVar2.m0();
                mVar2 = this.f52325a.f();
                mVar = this.f52325a.h();
                i10 = -1;
            } else {
                it = iVar2.iterator();
                mVar2 = this.f52325a.h();
                mVar = this.f52325a.f();
                i10 = 1;
            }
            boolean z10 = false;
            int i11 = 0;
            while (it.hasNext()) {
                m mVar3 = (m) it.next();
                if (!z10 && this.f52326b.compare(mVar2, mVar3) * i10 <= 0) {
                    z10 = true;
                }
                if (!z10 || i11 >= this.f52327c || this.f52326b.compare(mVar3, mVar) * i10 > 0) {
                    iVar3 = iVar3.r(mVar3.c(), g.A());
                } else {
                    i11++;
                }
            }
        }
        return this.f52325a.a().c(iVar, iVar3, aVar);
    }

    public boolean d() {
        return true;
    }

    public h getIndex() {
        return this.f52326b;
    }

    public i e(i iVar, n nVar) {
        return iVar;
    }
}
