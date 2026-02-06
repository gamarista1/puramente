package Tb;

import Ob.l;

public class j extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final j f52535a = new j();

    private j() {
    }

    public static j j() {
        return f52535a;
    }

    public String c() {
        return ".key";
    }

    public boolean e(n nVar) {
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    public m f(b bVar, n nVar) {
        l.f(nVar instanceof t);
        return new m(b.e((String) nVar.getValue()), g.A());
    }

    public m g() {
        return m.a();
    }

    public int hashCode() {
        return 37;
    }

    /* renamed from: i */
    public int compare(m mVar, m mVar2) {
        return mVar.c().compareTo(mVar2.c());
    }

    public String toString() {
        return "KeyIndex";
    }
}
