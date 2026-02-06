package Nb;

import Lb.C4368b;
import Lb.C4373g;
import Lb.l;
import Qb.a;
import Qb.i;
import Sb.c;
import Tb.g;
import Tb.n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final f f52066a;

    /* renamed from: b  reason: collision with root package name */
    private final i f52067b;

    /* renamed from: c  reason: collision with root package name */
    private final c f52068c;

    /* renamed from: d  reason: collision with root package name */
    private final a f52069d;

    /* renamed from: e  reason: collision with root package name */
    private long f52070e;

    public b(C4373g gVar, f fVar, a aVar) {
        this(gVar, fVar, aVar, new Ob.b());
    }

    private void p() {
        long j10 = this.f52070e + 1;
        this.f52070e = j10;
        if (this.f52069d.d(j10)) {
            if (this.f52068c.f()) {
                this.f52068c.b("Reached prune check threshold.", new Object[0]);
            }
            this.f52070e = 0;
            long r10 = this.f52066a.r();
            if (this.f52068c.f()) {
                this.f52068c.b("Cache size: " + r10, new Object[0]);
            }
            boolean z10 = true;
            while (z10 && this.f52069d.a(r10, this.f52067b.f())) {
                g p10 = this.f52067b.p(this.f52069d);
                if (p10.e()) {
                    this.f52066a.v(l.D(), p10);
                } else {
                    z10 = false;
                }
                r10 = this.f52066a.r();
                if (this.f52068c.f()) {
                    this.f52068c.b("Cache size after prune: " + r10, new Object[0]);
                }
            }
        }
    }

    public List a() {
        return this.f52066a.a();
    }

    public void b(long j10) {
        this.f52066a.b(j10);
    }

    public void c(l lVar, n nVar, long j10) {
        this.f52066a.c(lVar, nVar, j10);
    }

    public void d(l lVar, C4368b bVar, long j10) {
        this.f52066a.d(lVar, bVar, j10);
    }

    public void e(i iVar, n nVar) {
        if (iVar.g()) {
            this.f52066a.s(iVar.e(), nVar);
        } else {
            this.f52066a.m(iVar.e(), nVar);
        }
        i(iVar);
        p();
    }

    public Object f(Callable callable) {
        this.f52066a.g();
        try {
            Object call = callable.call();
            this.f52066a.j();
            this.f52066a.k();
            return call;
        } catch (Throwable th2) {
            this.f52066a.k();
            throw th2;
        }
    }

    public void g(l lVar, n nVar) {
        if (!this.f52067b.l(lVar)) {
            this.f52066a.s(lVar, nVar);
            this.f52067b.g(lVar);
        }
    }

    public void h(l lVar, C4368b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            g(lVar.t((l) entry.getKey()), (n) entry.getValue());
        }
    }

    public void i(i iVar) {
        if (iVar.g()) {
            this.f52067b.t(iVar.e());
        } else {
            this.f52067b.w(iVar);
        }
    }

    public void j(i iVar) {
        this.f52067b.x(iVar);
    }

    public a k(i iVar) {
        boolean z10;
        Set<Tb.b> set;
        if (this.f52067b.n(iVar)) {
            h i10 = this.f52067b.i(iVar);
            if (iVar.g() || i10 == null || !i10.f52083d) {
                set = null;
            } else {
                set = this.f52066a.t(i10.f52080a);
            }
            z10 = true;
        } else {
            set = this.f52067b.j(iVar.e());
            z10 = false;
        }
        n y10 = this.f52066a.y(iVar.e());
        if (set == null) {
            return new a(Tb.i.d(y10, iVar.c()), z10, false);
        }
        n A10 = g.A();
        for (Tb.b bVar : set) {
            A10 = A10.b0(bVar, y10.k0(bVar));
        }
        return new a(Tb.i.d(A10, iVar.c()), z10, true);
    }

    public void l(i iVar, Set set) {
        boolean z10 = true;
        Ob.l.g(!iVar.g(), "We should only track keys for filtered queries.");
        h i10 = this.f52067b.i(iVar);
        if (i10 == null || !i10.f52084e) {
            z10 = false;
        }
        Ob.l.g(z10, "We only expect tracked keys for currently-active queries.");
        this.f52066a.u(i10.f52080a, set);
    }

    public void m(i iVar) {
        this.f52067b.u(iVar);
    }

    public void n(i iVar, Set set, Set set2) {
        boolean z10 = true;
        Ob.l.g(!iVar.g(), "We should only track keys for filtered queries.");
        h i10 = this.f52067b.i(iVar);
        if (i10 == null || !i10.f52084e) {
            z10 = false;
        }
        Ob.l.g(z10, "We only expect tracked keys for currently-active queries.");
        this.f52066a.x(i10.f52080a, set, set2);
    }

    public void o(l lVar, C4368b bVar) {
        this.f52066a.o(lVar, bVar);
        p();
    }

    public b(C4373g gVar, f fVar, a aVar, Ob.a aVar2) {
        this.f52070e = 0;
        this.f52066a = fVar;
        c q10 = gVar.q("Persistence");
        this.f52068c = q10;
        this.f52067b = new i(fVar, q10, aVar2);
        this.f52069d = aVar;
    }
}
