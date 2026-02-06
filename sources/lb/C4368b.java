package Lb;

import Ob.d;
import Ob.l;
import Tb.b;
import Tb.m;
import Tb.n;
import Tb.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Lb.b  reason: case insensitive filesystem */
public final class C4368b implements Iterable {

    /* renamed from: b  reason: collision with root package name */
    private static final C4368b f51718b = new C4368b(new d((Object) null));

    /* renamed from: a  reason: collision with root package name */
    private final d f51719a;

    /* renamed from: Lb.b$a */
    class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51720a;

        a(l lVar) {
            this.f51720a = lVar;
        }

        /* renamed from: b */
        public C4368b a(l lVar, n nVar, C4368b bVar) {
            return bVar.a(this.f51720a.t(lVar), nVar);
        }
    }

    /* renamed from: Lb.b$b  reason: collision with other inner class name */
    class C0793b implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f51722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51723b;

        C0793b(Map map, boolean z10) {
            this.f51722a = map;
            this.f51723b = z10;
        }

        /* renamed from: b */
        public Void a(l lVar, n nVar, Void voidR) {
            this.f51722a.put(lVar.P(), nVar.K(this.f51723b));
            return null;
        }
    }

    private C4368b(d dVar) {
        this.f51719a = dVar;
    }

    private n h(l lVar, d dVar, n nVar) {
        boolean z10;
        if (dVar.getValue() != null) {
            return nVar.Y(lVar, (n) dVar.getValue());
        }
        Iterator it = dVar.t().iterator();
        n nVar2 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            d dVar2 = (d) entry.getValue();
            b bVar = (b) entry.getKey();
            if (bVar.p()) {
                if (dVar2.getValue() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l.g(z10, "Priority writes must always be leaf nodes");
                nVar2 = (n) dVar2.getValue();
            } else {
                nVar = h(lVar.x(bVar), dVar2, nVar);
            }
        }
        if (nVar.U(lVar).isEmpty() || nVar2 == null) {
            return nVar;
        }
        return nVar.Y(lVar.x(b.l()), nVar2);
    }

    public static C4368b n() {
        return f51718b;
    }

    public static C4368b r(Map map) {
        d b10 = d.b();
        for (Map.Entry entry : map.entrySet()) {
            b10 = b10.D((l) entry.getKey(), new d((n) entry.getValue()));
        }
        return new C4368b(b10);
    }

    public static C4368b t(Map map) {
        d b10 = d.b();
        for (Map.Entry entry : map.entrySet()) {
            b10 = b10.D(new l((String) entry.getKey()), new d(o.a(entry.getValue())));
        }
        return new C4368b(b10);
    }

    public boolean A(l lVar) {
        if (x(lVar) != null) {
            return true;
        }
        return false;
    }

    public C4368b C(l lVar) {
        if (lVar.isEmpty()) {
            return f51718b;
        }
        return new C4368b(this.f51719a.D(lVar, d.b()));
    }

    public n D() {
        return (n) this.f51719a.getValue();
    }

    public C4368b a(l lVar, n nVar) {
        if (lVar.isEmpty()) {
            return new C4368b(new d(nVar));
        }
        l g10 = this.f51719a.g(lVar);
        if (g10 != null) {
            l I10 = l.I(g10, lVar);
            n nVar2 = (n) this.f51719a.n(g10);
            b C10 = I10.C();
            if (C10 != null && C10.p() && nVar2.U(I10.H()).isEmpty()) {
                return this;
            }
            return new C4368b(this.f51719a.C(g10, nVar2.Y(I10, nVar)));
        }
        return new C4368b(this.f51719a.D(lVar, new d(nVar)));
    }

    public C4368b b(b bVar, n nVar) {
        return a(new l(bVar), nVar);
    }

    public C4368b d(l lVar, C4368b bVar) {
        return (C4368b) bVar.f51719a.k(this, new a(lVar));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C4368b.class) {
            return false;
        }
        return ((C4368b) obj).z(true).equals(z(true));
    }

    public n g(n nVar) {
        return h(l.D(), this.f51719a, nVar);
    }

    public int hashCode() {
        return z(true).hashCode();
    }

    public boolean isEmpty() {
        return this.f51719a.isEmpty();
    }

    public Iterator iterator() {
        return this.f51719a.iterator();
    }

    public C4368b k(l lVar) {
        if (lVar.isEmpty()) {
            return this;
        }
        n x10 = x(lVar);
        if (x10 != null) {
            return new C4368b(new d(x10));
        }
        return new C4368b(this.f51719a.E(lVar));
    }

    public Map m() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f51719a.t().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put((b) entry.getKey(), new C4368b((d) entry.getValue()));
        }
        return hashMap;
    }

    public String toString() {
        return "CompoundWrite{" + z(true).toString() + "}";
    }

    public List v() {
        ArrayList arrayList = new ArrayList();
        if (this.f51719a.getValue() != null) {
            for (m mVar : (n) this.f51719a.getValue()) {
                arrayList.add(new m(mVar.c(), mVar.d()));
            }
        } else {
            Iterator it = this.f51719a.t().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                d dVar = (d) entry.getValue();
                if (dVar.getValue() != null) {
                    arrayList.add(new m((b) entry.getKey(), (n) dVar.getValue()));
                }
            }
        }
        return arrayList;
    }

    public n x(l lVar) {
        l g10 = this.f51719a.g(lVar);
        if (g10 != null) {
            return ((n) this.f51719a.n(g10)).U(l.I(g10, lVar));
        }
        return null;
    }

    public Map z(boolean z10) {
        HashMap hashMap = new HashMap();
        this.f51719a.m(new C0793b(hashMap, z10));
        return hashMap;
    }
}
