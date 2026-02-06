package Nb;

import Lb.l;
import Ob.d;
import Qb.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class i {

    /* renamed from: f  reason: collision with root package name */
    private static final Ob.i f52085f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final Ob.i f52086g = new b();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Ob.i f52087h = new c();

    /* renamed from: i  reason: collision with root package name */
    private static final Ob.i f52088i = new d();

    /* renamed from: a  reason: collision with root package name */
    private Ob.d f52089a;

    /* renamed from: b  reason: collision with root package name */
    private final f f52090b;

    /* renamed from: c  reason: collision with root package name */
    private final Sb.c f52091c;

    /* renamed from: d  reason: collision with root package name */
    private final Ob.a f52092d;

    /* renamed from: e  reason: collision with root package name */
    private long f52093e = 0;

    class a implements Ob.i {
        a() {
        }

        /* renamed from: b */
        public boolean a(Map map) {
            h hVar = (h) map.get(h.f52272i);
            if (hVar == null || !hVar.f52083d) {
                return false;
            }
            return true;
        }
    }

    class b implements Ob.i {
        b() {
        }

        /* renamed from: b */
        public boolean a(Map map) {
            h hVar = (h) map.get(h.f52272i);
            if (hVar == null || !hVar.f52084e) {
                return false;
            }
            return true;
        }
    }

    class c implements Ob.i {
        c() {
        }

        /* renamed from: b */
        public boolean a(h hVar) {
            return !hVar.f52084e;
        }
    }

    class d implements Ob.i {
        d() {
        }

        /* renamed from: b */
        public boolean a(h hVar) {
            return !i.f52087h.a(hVar);
        }
    }

    class e implements d.c {
        e() {
        }

        /* renamed from: b */
        public Void a(l lVar, Map map, Void voidR) {
            for (Map.Entry value : map.entrySet()) {
                h hVar = (h) value.getValue();
                if (!hVar.f52083d) {
                    i.this.s(hVar.b());
                }
            }
            return null;
        }
    }

    class f implements Comparator {
        f() {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            return Ob.l.b(hVar.f52082c, hVar2.f52082c);
        }
    }

    public i(f fVar, Sb.c cVar, Ob.a aVar) {
        this.f52090b = fVar;
        this.f52091c = cVar;
        this.f52092d = aVar;
        this.f52089a = new Ob.d((Object) null);
        r();
        for (h hVar : fVar.w()) {
            this.f52093e = Math.max(hVar.f52080a + 1, this.f52093e);
            d(hVar);
        }
    }

    private static void c(Qb.i iVar) {
        boolean z10;
        if (!iVar.g() || iVar.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.g(z10, "Can't have tracked non-default query that loads all data");
    }

    private void d(h hVar) {
        boolean z10;
        c(hVar.f52081b);
        Map map = (Map) this.f52089a.n(hVar.f52081b.e());
        if (map == null) {
            map = new HashMap();
            this.f52089a = this.f52089a.C(hVar.f52081b.e(), map);
        }
        h hVar2 = (h) map.get(hVar.f52081b.d());
        if (hVar2 == null || hVar2.f52080a == hVar.f52080a) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.f(z10);
        map.put(hVar.f52081b.d(), hVar);
    }

    private static long e(a aVar, long j10) {
        return j10 - Math.min((long) Math.floor((double) (((float) j10) * (1.0f - aVar.b()))), aVar.c());
    }

    private Set h(l lVar) {
        HashSet hashSet = new HashSet();
        Map map = (Map) this.f52089a.n(lVar);
        if (map != null) {
            for (h hVar : map.values()) {
                if (!hVar.f52081b.g()) {
                    hashSet.add(Long.valueOf(hVar.f52080a));
                }
            }
        }
        return hashSet;
    }

    private List k(Ob.i iVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f52089a.iterator();
        while (it.hasNext()) {
            for (h hVar : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                if (iVar.a(hVar)) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    private boolean m(l lVar) {
        if (this.f52089a.d(lVar, f52085f) != null) {
            return true;
        }
        return false;
    }

    private static Qb.i o(Qb.i iVar) {
        if (iVar.g()) {
            return Qb.i.a(iVar.e());
        }
        return iVar;
    }

    private void r() {
        try {
            this.f52090b.g();
            this.f52090b.p(this.f52092d.a());
            this.f52090b.j();
        } finally {
            this.f52090b.k();
        }
    }

    /* access modifiers changed from: private */
    public void s(h hVar) {
        d(hVar);
        this.f52090b.q(hVar);
    }

    private void v(Qb.i iVar, boolean z10) {
        h hVar;
        Qb.i o10 = o(iVar);
        h i10 = i(o10);
        long a10 = this.f52092d.a();
        if (i10 != null) {
            hVar = i10.c(a10).a(z10);
        } else {
            Ob.l.g(z10, "If we're setting the query to inactive, we should already be tracking it!");
            long j10 = this.f52093e;
            this.f52093e = 1 + j10;
            hVar = new h(j10, o10, a10, false, z10);
        }
        s(hVar);
    }

    public long f() {
        return (long) k(f52087h).size();
    }

    public void g(l lVar) {
        h hVar;
        if (!m(lVar)) {
            Qb.i a10 = Qb.i.a(lVar);
            h i10 = i(a10);
            if (i10 == null) {
                long j10 = this.f52093e;
                this.f52093e = 1 + j10;
                hVar = new h(j10, a10, this.f52092d.a(), true, false);
            } else {
                Ob.l.g(!i10.f52083d, "This should have been handled above!");
                hVar = i10.b();
            }
            s(hVar);
        }
    }

    public h i(Qb.i iVar) {
        Qb.i o10 = o(iVar);
        Map map = (Map) this.f52089a.n(o10.e());
        if (map != null) {
            return (h) map.get(o10.d());
        }
        return null;
    }

    public Set j(l lVar) {
        Ob.l.g(!n(Qb.i.a(lVar)), "Path is fully complete.");
        HashSet hashSet = new HashSet();
        Set h10 = h(lVar);
        if (!h10.isEmpty()) {
            hashSet.addAll(this.f52090b.n(h10));
        }
        Iterator it = this.f52089a.E(lVar).t().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tb.b bVar = (Tb.b) entry.getKey();
            Ob.d dVar = (Ob.d) entry.getValue();
            if (dVar.getValue() != null && f52085f.a((Map) dVar.getValue())) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public boolean l(l lVar) {
        if (this.f52089a.A(lVar, f52086g) != null) {
            return true;
        }
        return false;
    }

    public boolean n(Qb.i iVar) {
        if (m(iVar.e())) {
            return true;
        }
        if (iVar.g()) {
            return false;
        }
        Map map = (Map) this.f52089a.n(iVar.e());
        if (map == null || !map.containsKey(iVar.d()) || !((h) map.get(iVar.d())).f52083d) {
            return false;
        }
        return true;
    }

    public g p(a aVar) {
        List k10 = k(f52087h);
        long e10 = e(aVar, (long) k10.size());
        g gVar = new g();
        if (this.f52091c.f()) {
            this.f52091c.b("Pruning old queries.  Prunable: " + k10.size() + " Count to prune: " + e10, new Object[0]);
        }
        Collections.sort(k10, new f());
        for (int i10 = 0; ((long) i10) < e10; i10++) {
            h hVar = (h) k10.get(i10);
            gVar = gVar.d(hVar.f52081b.e());
            q(hVar.f52081b);
        }
        for (int i11 = (int) e10; i11 < k10.size(); i11++) {
            gVar = gVar.c(((h) k10.get(i11)).f52081b.e());
        }
        List<h> k11 = k(f52088i);
        if (this.f52091c.f()) {
            this.f52091c.b("Unprunable queries: " + k11.size(), new Object[0]);
        }
        for (h hVar2 : k11) {
            gVar = gVar.c(hVar2.f52081b.e());
        }
        return gVar;
    }

    public void q(Qb.i iVar) {
        boolean z10;
        Qb.i o10 = o(iVar);
        h i10 = i(o10);
        if (i10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.g(z10, "Query must exist to be removed.");
        this.f52090b.l(i10.f52080a);
        Map map = (Map) this.f52089a.n(o10.e());
        map.remove(o10.d());
        if (map.isEmpty()) {
            this.f52089a = this.f52089a.z(o10.e());
        }
    }

    public void t(l lVar) {
        this.f52089a.E(lVar).m(new e());
    }

    public void u(Qb.i iVar) {
        v(iVar, true);
    }

    public void w(Qb.i iVar) {
        h i10 = i(o(iVar));
        if (i10 != null && !i10.f52083d) {
            s(i10.b());
        }
    }

    public void x(Qb.i iVar) {
        v(iVar, false);
    }
}
