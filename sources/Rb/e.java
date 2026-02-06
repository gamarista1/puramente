package Rb;

import Lb.l;
import Rb.d;
import Tb.b;
import Tb.g;
import Tb.h;
import Tb.i;
import Tb.m;
import Tb.n;
import Tb.r;
import java.util.Iterator;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f52329a;

    /* renamed from: b  reason: collision with root package name */
    private final h f52330b;

    /* renamed from: c  reason: collision with root package name */
    private final m f52331c;

    /* renamed from: d  reason: collision with root package name */
    private final m f52332d;

    public e(Qb.h hVar) {
        this.f52329a = new b(hVar.d());
        this.f52330b = hVar.d();
        this.f52331c = i(hVar);
        this.f52332d = g(hVar);
    }

    private static m g(Qb.h hVar) {
        if (!hVar.m()) {
            return hVar.d().g();
        }
        return hVar.d().f(hVar.e(), hVar.f());
    }

    private static m i(Qb.h hVar) {
        if (!hVar.o()) {
            return hVar.d().h();
        }
        return hVar.d().f(hVar.g(), hVar.h());
    }

    public d a() {
        return this.f52329a;
    }

    public i b(i iVar, b bVar, n nVar, l lVar, d.a aVar, a aVar2) {
        if (!j(new m(bVar, nVar))) {
            nVar = g.A();
        }
        return this.f52329a.b(iVar, bVar, nVar, lVar, aVar, aVar2);
    }

    public i c(i iVar, i iVar2, a aVar) {
        i iVar3;
        if (iVar2.k().e0()) {
            iVar3 = i.d(g.A(), this.f52330b);
        } else {
            i t10 = iVar2.t(r.a());
            Iterator it = iVar2.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (!j(mVar)) {
                    t10 = t10.r(mVar.c(), g.A());
                }
            }
            iVar3 = t10;
        }
        return this.f52329a.c(iVar, iVar3, aVar);
    }

    public boolean d() {
        return true;
    }

    public m f() {
        return this.f52332d;
    }

    public h getIndex() {
        return this.f52330b;
    }

    public m h() {
        return this.f52331c;
    }

    public boolean j(m mVar) {
        if (this.f52330b.compare(h(), mVar) > 0 || this.f52330b.compare(mVar, f()) > 0) {
            return false;
        }
        return true;
    }

    public i e(i iVar, n nVar) {
        return iVar;
    }
}
