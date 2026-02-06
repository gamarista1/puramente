package Lb;

import Ob.i;
import Ob.l;
import Tb.g;
import Tb.h;
import Tb.m;
import Tb.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class G {

    /* renamed from: d  reason: collision with root package name */
    private static final i f51702d = new b();

    /* renamed from: a  reason: collision with root package name */
    private C4368b f51703a = C4368b.n();

    /* renamed from: b  reason: collision with root package name */
    private List f51704b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Long f51705c = -1L;

    class a implements i {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51706b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f51707c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f51708d;

        a(boolean z10, List list, l lVar) {
            this.f51706b = z10;
            this.f51707c = list;
            this.f51708d = lVar;
        }

        /* renamed from: b */
        public boolean a(C c10) {
            if ((c10.f() || this.f51706b) && !this.f51707c.contains(Long.valueOf(c10.d())) && (c10.c().A(this.f51708d) || this.f51708d.A(c10.c()))) {
                return true;
            }
            return false;
        }
    }

    class b implements i {
        b() {
        }

        /* renamed from: b */
        public boolean a(C c10) {
            return c10.f();
        }
    }

    private static C4368b j(List list, i iVar, l lVar) {
        C4368b n10 = C4368b.n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C c10 = (C) it.next();
            if (iVar.a(c10)) {
                l c11 = c10.c();
                if (c10.e()) {
                    if (lVar.A(c11)) {
                        n10 = n10.a(l.I(lVar, c11), c10.b());
                    } else if (c11.A(lVar)) {
                        n10 = n10.a(l.D(), c10.b().U(l.I(c11, lVar)));
                    }
                } else if (lVar.A(c11)) {
                    n10 = n10.d(l.I(lVar, c11), c10.a());
                } else if (c11.A(lVar)) {
                    l I10 = l.I(c11, lVar);
                    if (I10.isEmpty()) {
                        n10 = n10.d(l.D(), c10.a());
                    } else {
                        n x10 = c10.a().x(I10);
                        if (x10 != null) {
                            n10 = n10.a(l.D(), x10);
                        }
                    }
                }
            }
        }
        return n10;
    }

    private boolean k(C c10, l lVar) {
        if (c10.e()) {
            return c10.c().A(lVar);
        }
        Iterator it = c10.a().iterator();
        while (it.hasNext()) {
            if (c10.c().t((l) ((Map.Entry) it.next()).getKey()).A(lVar)) {
                return true;
            }
        }
        return false;
    }

    private void m() {
        this.f51703a = j(this.f51704b, f51702d, l.D());
        if (this.f51704b.size() > 0) {
            List list = this.f51704b;
            this.f51705c = Long.valueOf(((C) list.get(list.size() - 1)).d());
            return;
        }
        this.f51705c = -1L;
    }

    public void a(l lVar, C4368b bVar, Long l10) {
        boolean z10;
        if (l10.longValue() > this.f51705c.longValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.f(z10);
        this.f51704b.add(new C(l10.longValue(), lVar, bVar));
        this.f51703a = this.f51703a.d(lVar, bVar);
        this.f51705c = l10;
    }

    public void b(l lVar, n nVar, Long l10, boolean z10) {
        boolean z11;
        if (l10.longValue() > this.f51705c.longValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        l.f(z11);
        this.f51704b.add(new C(l10.longValue(), lVar, nVar, z10));
        if (z10) {
            this.f51703a = this.f51703a.a(lVar, nVar);
        }
        this.f51705c = l10;
    }

    public n c(l lVar, Tb.b bVar, Qb.a aVar) {
        l x10 = lVar.x(bVar);
        n x11 = this.f51703a.x(x10);
        if (x11 != null) {
            return x11;
        }
        if (aVar.c(bVar)) {
            return this.f51703a.k(x10).g(aVar.b().k0(bVar));
        }
        return null;
    }

    public n d(l lVar, n nVar, List list, boolean z10) {
        if (!list.isEmpty() || z10) {
            C4368b k10 = this.f51703a.k(lVar);
            if (!z10 && k10.isEmpty()) {
                return nVar;
            }
            if (!z10 && nVar == null && !k10.A(l.D())) {
                return null;
            }
            C4368b j10 = j(this.f51704b, new a(z10, list, lVar), lVar);
            if (nVar == null) {
                nVar = g.A();
            }
            return j10.g(nVar);
        }
        n x10 = this.f51703a.x(lVar);
        if (x10 != null) {
            return x10;
        }
        C4368b k11 = this.f51703a.k(lVar);
        if (k11.isEmpty()) {
            return nVar;
        }
        if (nVar == null && !k11.A(l.D())) {
            return null;
        }
        if (nVar == null) {
            nVar = g.A();
        }
        return k11.g(nVar);
    }

    public n e(l lVar, n nVar) {
        n A10 = g.A();
        n<m> x10 = this.f51703a.x(lVar);
        if (x10 != null) {
            if (!x10.e0()) {
                for (m mVar : x10) {
                    A10 = A10.b0(mVar.c(), mVar.d());
                }
            }
            return A10;
        }
        C4368b k10 = this.f51703a.k(lVar);
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            m mVar2 = (m) it.next();
            A10 = A10.b0(mVar2.c(), k10.k(new l(mVar2.c())).g(mVar2.d()));
        }
        for (m mVar3 : k10.v()) {
            A10 = A10.b0(mVar3.c(), mVar3.d());
        }
        return A10;
    }

    public n f(l lVar, l lVar2, n nVar, n nVar2) {
        boolean z10;
        if (nVar == null && nVar2 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.g(z10, "Either existingEventSnap or existingServerSnap must exist");
        l t10 = lVar.t(lVar2);
        if (this.f51703a.A(t10)) {
            return null;
        }
        C4368b k10 = this.f51703a.k(t10);
        if (k10.isEmpty()) {
            return nVar2.U(lVar2);
        }
        return k10.g(nVar2.U(lVar2));
    }

    public m g(l lVar, n nVar, m mVar, boolean z10, h hVar) {
        C4368b k10 = this.f51703a.k(lVar);
        n<m> x10 = k10.x(l.D());
        m mVar2 = null;
        if (x10 == null) {
            if (nVar != null) {
                x10 = k10.g(nVar);
            }
            return mVar2;
        }
        for (m mVar3 : x10) {
            if (hVar.a(mVar3, mVar, z10) > 0 && (mVar2 == null || hVar.a(mVar3, mVar2, z10) < 0)) {
                mVar2 = mVar3;
            }
        }
        return mVar2;
    }

    public H h(l lVar) {
        return new H(lVar, this);
    }

    public C i(long j10) {
        for (C c10 : this.f51704b) {
            if (c10.d() == j10) {
                return c10;
            }
        }
        return null;
    }

    public boolean l(long j10) {
        C c10;
        boolean z10;
        Iterator it = this.f51704b.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                c10 = null;
                break;
            }
            c10 = (C) it.next();
            if (c10.d() == j10) {
                break;
            }
            i10++;
        }
        if (c10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.g(z10, "removeWrite called with nonexistent writeId");
        this.f51704b.remove(c10);
        boolean f10 = c10.f();
        int size = this.f51704b.size() - 1;
        boolean z11 = false;
        while (f10 && size >= 0) {
            C c11 = (C) this.f51704b.get(size);
            if (c11.f()) {
                if (size >= i10 && k(c11, c10.c())) {
                    f10 = false;
                } else if (c10.c().A(c11.c())) {
                    z11 = true;
                }
            }
            size--;
        }
        if (!f10) {
            return false;
        }
        if (z11) {
            m();
            return true;
        }
        if (c10.e()) {
            this.f51703a = this.f51703a.C(c10.c());
        } else {
            Iterator it2 = c10.a().iterator();
            while (it2.hasNext()) {
                this.f51703a = this.f51703a.C(c10.c().t((l) ((Map.Entry) it2.next()).getKey()));
            }
        }
        return true;
    }

    public n n(l lVar) {
        return this.f51703a.x(lVar);
    }
}
