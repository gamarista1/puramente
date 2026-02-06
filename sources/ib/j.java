package Ib;

import Ib.h;
import java.util.Comparator;

public abstract class j implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f51147a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f51148b;

    /* renamed from: c  reason: collision with root package name */
    private h f51149c;

    /* renamed from: d  reason: collision with root package name */
    private final h f51150d;

    j(Object obj, Object obj2, h hVar, h hVar2) {
        this.f51147a = obj;
        this.f51148b = obj2;
        this.f51149c = hVar == null ? g.a() : hVar;
        this.f51150d = hVar2 == null ? g.a() : hVar2;
    }

    private j a() {
        h hVar = this.f51149c;
        h p10 = hVar.p((Object) null, (Object) null, i(hVar), (h) null, (h) null);
        h hVar2 = this.f51150d;
        return p((Object) null, (Object) null, i(this), p10, hVar2.p((Object) null, (Object) null, i(hVar2), (h) null, (h) null));
    }

    private j e() {
        j jVar;
        if (!this.f51150d.q() || this.f51149c.q()) {
            jVar = this;
        } else {
            jVar = k();
        }
        if (jVar.f51149c.q() && ((j) jVar.f51149c).f51149c.q()) {
            jVar = jVar.l();
        }
        if (!jVar.f51149c.q() || !jVar.f51150d.q()) {
            return jVar;
        }
        return jVar.a();
    }

    private j g() {
        j a10 = a();
        if (a10.o().b().q()) {
            return a10.d((Object) null, (Object) null, (h) null, ((j) a10.o()).l()).k().a();
        }
        return a10;
    }

    private j h() {
        j a10 = a();
        if (a10.b().b().q()) {
            return a10.l().a();
        }
        return a10;
    }

    private static h.a i(h hVar) {
        if (hVar.q()) {
            return h.a.BLACK;
        }
        return h.a.RED;
    }

    private h j() {
        j jVar;
        if (this.f51149c.isEmpty()) {
            return g.a();
        }
        if (b().q() || b().b().q()) {
            jVar = this;
        } else {
            jVar = g();
        }
        return jVar.d((Object) null, (Object) null, ((j) jVar.f51149c).j(), (h) null).e();
    }

    private j k() {
        return (j) this.f51150d.p((Object) null, (Object) null, f(), p((Object) null, (Object) null, h.a.RED, (h) null, ((j) this.f51150d).f51149c), (h) null);
    }

    private j l() {
        return (j) this.f51149c.p((Object) null, (Object) null, f(), (h) null, p((Object) null, (Object) null, h.a.RED, ((j) this.f51149c).f51150d, (h) null));
    }

    public h b() {
        return this.f51149c;
    }

    /* renamed from: c */
    public j p(Object obj, Object obj2, h.a aVar, h hVar, h hVar2) {
        if (obj == null) {
            obj = this.f51147a;
        }
        if (obj2 == null) {
            obj2 = this.f51148b;
        }
        if (hVar == null) {
            hVar = this.f51149c;
        }
        if (hVar2 == null) {
            hVar2 = this.f51150d;
        }
        if (aVar == h.a.RED) {
            return new i(obj, obj2, hVar, hVar2);
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public abstract j d(Object obj, Object obj2, h hVar, h hVar2);

    /* access modifiers changed from: protected */
    public abstract h.a f();

    public Object getKey() {
        return this.f51147a;
    }

    public Object getValue() {
        return this.f51148b;
    }

    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void m(h hVar) {
        this.f51149c = hVar;
    }

    public h o() {
        return this.f51150d;
    }

    public h r(Object obj, Object obj2, Comparator comparator) {
        j jVar;
        int compare = comparator.compare(obj, this.f51147a);
        if (compare < 0) {
            jVar = d((Object) null, (Object) null, this.f51149c.r(obj, obj2, comparator), (h) null);
        } else if (compare == 0) {
            jVar = d(obj, obj2, (h) null, (h) null);
        } else {
            jVar = d((Object) null, (Object) null, (h) null, this.f51150d.r(obj, obj2, comparator));
        }
        return jVar.e();
    }

    public h s(Object obj, Comparator comparator) {
        j jVar;
        j jVar2;
        j jVar3;
        if (comparator.compare(obj, this.f51147a) < 0) {
            if (this.f51149c.isEmpty() || this.f51149c.q() || ((j) this.f51149c).f51149c.q()) {
                jVar3 = this;
            } else {
                jVar3 = g();
            }
            jVar = jVar3.d((Object) null, (Object) null, jVar3.f51149c.s(obj, comparator), (h) null);
        } else {
            if (this.f51149c.q()) {
                jVar2 = l();
            } else {
                jVar2 = this;
            }
            if (!jVar2.f51150d.isEmpty() && !jVar2.f51150d.q() && !((j) jVar2.f51150d).f51149c.q()) {
                jVar2 = jVar2.h();
            }
            if (comparator.compare(obj, jVar2.f51147a) == 0) {
                if (jVar2.f51150d.isEmpty()) {
                    return g.a();
                }
                h u10 = jVar2.f51150d.u();
                jVar2 = jVar2.d(u10.getKey(), u10.getValue(), (h) null, ((j) jVar2.f51150d).j());
            }
            jVar = jVar2.d((Object) null, (Object) null, (h) null, jVar2.f51150d.s(obj, comparator));
        }
        return jVar.e();
    }

    public void t(h.b bVar) {
        this.f51149c.t(bVar);
        bVar.a(this.f51147a, this.f51148b);
        this.f51150d.t(bVar);
    }

    public h u() {
        if (this.f51149c.isEmpty()) {
            return this;
        }
        return this.f51149c.u();
    }

    public h v() {
        if (this.f51150d.isEmpty()) {
            return this;
        }
        return this.f51150d.v();
    }
}
