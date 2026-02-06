package Tb;

public class u extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final u f52560a = new u();

    private u() {
    }

    public static u j() {
        return f52560a;
    }

    public String c() {
        return ".value";
    }

    public boolean e(n nVar) {
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof u;
    }

    public m f(b bVar, n nVar) {
        return new m(bVar, nVar);
    }

    public m g() {
        return new m(b.i(), n.f52549M);
    }

    public int hashCode() {
        return 4;
    }

    /* renamed from: i */
    public int compare(m mVar, m mVar2) {
        int compareTo = mVar.d().compareTo(mVar2.d());
        if (compareTo == 0) {
            return mVar.c().compareTo(mVar2.c());
        }
        return compareTo;
    }

    public String toString() {
        return "ValueIndex";
    }
}
