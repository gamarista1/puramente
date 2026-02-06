package Tb;

import Lb.l;

public final class p extends h {

    /* renamed from: a  reason: collision with root package name */
    private final l f52553a;

    public p(l lVar) {
        if (lVar.size() != 1 || !lVar.E().p()) {
            this.f52553a = lVar;
            return;
        }
        throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
    }

    public String c() {
        return this.f52553a.P();
    }

    public boolean e(n nVar) {
        return !nVar.U(this.f52553a).isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass() || !this.f52553a.equals(((p) obj).f52553a)) {
            return false;
        }
        return true;
    }

    public m f(b bVar, n nVar) {
        return new m(bVar, g.A().Y(this.f52553a, nVar));
    }

    public m g() {
        return new m(b.i(), g.A().Y(this.f52553a, n.f52549M));
    }

    public int hashCode() {
        return this.f52553a.hashCode();
    }

    /* renamed from: i */
    public int compare(m mVar, m mVar2) {
        int compareTo = mVar.d().U(this.f52553a).compareTo(mVar2.d().U(this.f52553a));
        if (compareTo == 0) {
            return mVar.c().compareTo(mVar2.c());
        }
        return compareTo;
    }
}
