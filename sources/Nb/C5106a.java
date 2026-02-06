package nb;

/* renamed from: nb.a  reason: case insensitive filesystem */
final class C5106a extends l {

    /* renamed from: a  reason: collision with root package name */
    static final C5106a f61071a = new C5106a();
    private static final long serialVersionUID = 0;

    private C5106a() {
    }

    static l e() {
        return f61071a;
    }

    private Object readResolve() {
        return f61071a;
    }

    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
