package Lb;

import Gb.b;
import Gb.j;
import Qb.c;
import Qb.d;
import Qb.e;
import Qb.i;

public class E extends C4375i {

    /* renamed from: d  reason: collision with root package name */
    private final n f51696d;

    /* renamed from: e  reason: collision with root package name */
    private final j f51697e;

    /* renamed from: f  reason: collision with root package name */
    private final i f51698f;

    public E(n nVar, j jVar, i iVar) {
        this.f51696d = nVar;
        this.f51697e = jVar;
        this.f51698f = iVar;
    }

    public C4375i a(i iVar) {
        return new E(this.f51696d, this.f51697e, iVar);
    }

    public d b(c cVar, i iVar) {
        return new d(e.a.VALUE, this, com.google.firebase.database.e.a(com.google.firebase.database.e.c(this.f51696d, iVar.e()), cVar.k()), (String) null);
    }

    public void c(b bVar) {
        this.f51697e.a(bVar);
    }

    public void d(d dVar) {
        if (!h()) {
            this.f51697e.b(dVar.e());
        }
    }

    public i e() {
        return this.f51698f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof E) {
            E e10 = (E) obj;
            if (!e10.f51697e.equals(this.f51697e) || !e10.f51696d.equals(this.f51696d) || !e10.f51698f.equals(this.f51698f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean f(C4375i iVar) {
        if (!(iVar instanceof E) || !((E) iVar).f51697e.equals(this.f51697e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f51697e.hashCode() * 31) + this.f51696d.hashCode()) * 31) + this.f51698f.hashCode();
    }

    public boolean i(e.a aVar) {
        if (aVar == e.a.VALUE) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
