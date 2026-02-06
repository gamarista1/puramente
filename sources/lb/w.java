package Lb;

import Gb.b;
import Mb.d;
import Nb.e;
import Ob.l;
import Qb.a;
import Qb.c;
import Qb.e;
import Qb.h;
import Qb.i;
import Qb.j;
import Qb.k;
import Tb.g;
import Tb.m;
import Tb.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map f51898a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final e f51899b;

    public w(e eVar) {
        this.f51899b = eVar;
    }

    private List c(j jVar, d dVar, H h10, n nVar) {
        j.a b10 = jVar.b(dVar, h10, nVar);
        if (!jVar.h().g()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (c cVar : b10.f52293b) {
                e.a j10 = cVar.j();
                if (j10 == e.a.CHILD_ADDED) {
                    hashSet2.add(cVar.i());
                } else if (j10 == e.a.CHILD_REMOVED) {
                    hashSet.add(cVar.i());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f51899b.n(jVar.h(), hashSet2, hashSet);
            }
        }
        return b10.f52292a;
    }

    public List a(C4375i iVar, H h10, a aVar) {
        i e10 = iVar.e();
        j g10 = g(e10, h10, aVar);
        if (!e10.g()) {
            HashSet hashSet = new HashSet();
            for (m c10 : g10.f()) {
                hashSet.add(c10.c());
            }
            this.f51899b.l(e10, hashSet);
        }
        if (!this.f51898a.containsKey(e10.d())) {
            this.f51898a.put(e10.d(), g10);
        }
        this.f51898a.put(e10.d(), g10);
        g10.a(iVar);
        return g10.g(iVar);
    }

    public List b(d dVar, H h10, n nVar) {
        boolean z10;
        h b10 = dVar.b().b();
        if (b10 != null) {
            j jVar = (j) this.f51898a.get(b10);
            if (jVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.f(z10);
            return c(jVar, dVar, h10, nVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : this.f51898a.entrySet()) {
            arrayList.addAll(c((j) value.getValue(), dVar, h10, nVar));
        }
        return arrayList;
    }

    public n d(l lVar) {
        for (j e10 : this.f51898a.values()) {
            n e11 = e10.e(lVar);
            if (e11 != null) {
                return e11;
            }
        }
        return null;
    }

    public j e() {
        for (Map.Entry value : this.f51898a.entrySet()) {
            j jVar = (j) value.getValue();
            if (jVar.h().g()) {
                return jVar;
            }
        }
        return null;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : this.f51898a.entrySet()) {
            j jVar = (j) value.getValue();
            if (!jVar.h().g()) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public j g(i iVar, H h10, a aVar) {
        n nVar;
        boolean z10;
        n nVar2;
        j jVar = (j) this.f51898a.get(iVar.d());
        if (jVar != null) {
            return jVar;
        }
        if (aVar.f()) {
            nVar = aVar.b();
        } else {
            nVar = null;
        }
        n b10 = h10.b(nVar);
        if (b10 != null) {
            z10 = true;
        } else {
            if (aVar.b() != null) {
                nVar2 = aVar.b();
            } else {
                nVar2 = g.A();
            }
            b10 = h10.e(nVar2);
            z10 = false;
        }
        return new j(iVar, new k(new a(Tb.i.d(b10, iVar.c()), z10, false), aVar));
    }

    public boolean h() {
        if (e() != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return this.f51898a.isEmpty();
    }

    public Ob.g j(i iVar, C4375i iVar2, b bVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean h10 = h();
        if (iVar.f()) {
            Iterator it = this.f51898a.entrySet().iterator();
            while (it.hasNext()) {
                j jVar = (j) ((Map.Entry) it.next()).getValue();
                arrayList2.addAll(jVar.k(iVar2, bVar));
                if (jVar.j()) {
                    it.remove();
                    if (!jVar.h().g()) {
                        arrayList.add(jVar.h());
                    }
                }
            }
        } else {
            j jVar2 = (j) this.f51898a.get(iVar.d());
            if (jVar2 != null) {
                arrayList2.addAll(jVar2.k(iVar2, bVar));
                if (jVar2.j()) {
                    this.f51898a.remove(iVar.d());
                    if (!jVar2.h().g()) {
                        arrayList.add(jVar2.h());
                    }
                }
            }
        }
        if (h10 && !h()) {
            arrayList.add(i.a(iVar.e()));
        }
        return new Ob.g(arrayList, arrayList2);
    }

    public boolean k(i iVar) {
        if (l(iVar) != null) {
            return true;
        }
        return false;
    }

    public j l(i iVar) {
        if (iVar.g()) {
            return e();
        }
        return (j) this.f51898a.get(iVar.d());
    }
}
