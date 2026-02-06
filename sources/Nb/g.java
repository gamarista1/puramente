package Nb;

import Lb.l;
import Ob.d;
import Ob.i;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final i f52073b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final i f52074c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final d f52075d = new d(Boolean.TRUE);

    /* renamed from: e  reason: collision with root package name */
    private static final d f52076e = new d(Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    private final d f52077a;

    class a implements i {
        a() {
        }

        /* renamed from: b */
        public boolean a(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    class b implements i {
        b() {
        }

        /* renamed from: b */
        public boolean a(Boolean bool) {
            return bool.booleanValue();
        }
    }

    class c implements d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.c f52078a;

        c(d.c cVar) {
            this.f52078a = cVar;
        }

        /* renamed from: b */
        public Object a(l lVar, Boolean bool, Object obj) {
            if (!bool.booleanValue()) {
                return this.f52078a.a(lVar, (Object) null, obj);
            }
            return obj;
        }
    }

    public g() {
        this.f52077a = d.b();
    }

    public g a(Tb.b bVar) {
        d r10 = this.f52077a.r(bVar);
        if (r10 == null) {
            r10 = new d((Boolean) this.f52077a.getValue());
        } else if (r10.getValue() == null && this.f52077a.getValue() != null) {
            r10 = r10.C(l.D(), (Boolean) this.f52077a.getValue());
        }
        return new g(r10);
    }

    public Object b(Object obj, d.c cVar) {
        return this.f52077a.k(obj, new c(cVar));
    }

    public g c(l lVar) {
        if (this.f52077a.A(lVar, f52073b) != null) {
            return this;
        }
        return new g(this.f52077a.D(lVar, f52076e));
    }

    public g d(l lVar) {
        if (this.f52077a.A(lVar, f52073b) != null) {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        } else if (this.f52077a.A(lVar, f52074c) != null) {
            return this;
        } else {
            return new g(this.f52077a.D(lVar, f52075d));
        }
    }

    public boolean e() {
        return this.f52077a.a(f52074c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.f52077a.equals(((g) obj).f52077a)) {
            return true;
        }
        return false;
    }

    public boolean f(l lVar) {
        Boolean bool = (Boolean) this.f52077a.v(lVar);
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean g(l lVar) {
        Boolean bool = (Boolean) this.f52077a.v(lVar);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f52077a.hashCode();
    }

    public String toString() {
        return "{PruneForest:" + this.f52077a.toString() + "}";
    }

    private g(d dVar) {
        this.f52077a = dVar;
    }
}
