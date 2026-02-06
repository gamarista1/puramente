package Tb;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    private static final m f52545c = new m(b.j(), g.A());

    /* renamed from: d  reason: collision with root package name */
    private static final m f52546d = new m(b.i(), n.f52549M);

    /* renamed from: a  reason: collision with root package name */
    private final b f52547a;

    /* renamed from: b  reason: collision with root package name */
    private final n f52548b;

    public m(b bVar, n nVar) {
        this.f52547a = bVar;
        this.f52548b = nVar;
    }

    public static m a() {
        return f52546d;
    }

    public static m b() {
        return f52545c;
    }

    public b c() {
        return this.f52547a;
    }

    public n d() {
        return this.f52548b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f52547a.equals(mVar.f52547a) && this.f52548b.equals(mVar.f52548b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f52547a.hashCode() * 31) + this.f52548b.hashCode();
    }

    public String toString() {
        return "NamedNode{name=" + this.f52547a + ", node=" + this.f52548b + '}';
    }
}
