package Tb;

public class q extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final q f52554a = new q();

    private q() {
    }

    public static q j() {
        return f52554a;
    }

    public String c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    public boolean e(n nVar) {
        return !nVar.q().isEmpty();
    }

    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    public m f(b bVar, n nVar) {
        return new m(bVar, new t("[PRIORITY-POST]", nVar));
    }

    public m g() {
        return f(b.i(), n.f52549M);
    }

    public int hashCode() {
        return 3155577;
    }

    /* renamed from: i */
    public int compare(m mVar, m mVar2) {
        return o.c(mVar.c(), mVar.d().q(), mVar2.c(), mVar2.d().q());
    }

    public String toString() {
        return "PriorityIndex";
    }
}
