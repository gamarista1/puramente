package Lb;

import Tb.c;
import Tb.n;
import java.util.HashMap;
import java.util.Map;

class v {

    /* renamed from: a  reason: collision with root package name */
    private n f51891a = null;

    /* renamed from: b  reason: collision with root package name */
    private Map f51892b = null;

    class a extends c.C0806c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51893a;

        a(l lVar) {
            this.f51893a = lVar;
        }

        public void b(Tb.b bVar, n nVar) {
            v.this.d(this.f51893a.x(bVar), nVar);
        }
    }

    class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f51896b;

        b(l lVar, d dVar) {
            this.f51895a = lVar;
            this.f51896b = dVar;
        }

        public void a(Tb.b bVar, v vVar) {
            vVar.b(this.f51895a.x(bVar), this.f51896b);
        }
    }

    public interface c {
        void a(Tb.b bVar, v vVar);
    }

    public interface d {
        void a(l lVar, n nVar);
    }

    public void a(c cVar) {
        Map map = this.f51892b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                cVar.a((Tb.b) entry.getKey(), (v) entry.getValue());
            }
        }
    }

    public void b(l lVar, d dVar) {
        n nVar = this.f51891a;
        if (nVar != null) {
            dVar.a(lVar, nVar);
        } else {
            a(new b(lVar, dVar));
        }
    }

    public boolean c(l lVar) {
        if (lVar.isEmpty()) {
            this.f51891a = null;
            this.f51892b = null;
            return true;
        }
        n nVar = this.f51891a;
        if (nVar != null) {
            if (nVar.e0()) {
                return false;
            }
            this.f51891a = null;
            ((Tb.c) this.f51891a).m(new a(lVar));
            return c(lVar);
        } else if (this.f51892b == null) {
            return true;
        } else {
            Tb.b E10 = lVar.E();
            l N10 = lVar.N();
            if (this.f51892b.containsKey(E10) && ((v) this.f51892b.get(E10)).c(N10)) {
                this.f51892b.remove(E10);
            }
            if (!this.f51892b.isEmpty()) {
                return false;
            }
            this.f51892b = null;
            return true;
        }
    }

    public void d(l lVar, n nVar) {
        if (lVar.isEmpty()) {
            this.f51891a = nVar;
            this.f51892b = null;
            return;
        }
        n nVar2 = this.f51891a;
        if (nVar2 != null) {
            this.f51891a = nVar2.Y(lVar, nVar);
            return;
        }
        if (this.f51892b == null) {
            this.f51892b = new HashMap();
        }
        Tb.b E10 = lVar.E();
        if (!this.f51892b.containsKey(E10)) {
            this.f51892b.put(E10, new v());
        }
        ((v) this.f51892b.get(E10)).d(lVar.N(), nVar);
    }
}
