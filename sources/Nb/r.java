package nb;

final class r extends l {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Object f61100a;

    r(Object obj) {
        this.f61100a = obj;
    }

    public Object b() {
        return this.f61100a;
    }

    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f61100a.equals(((r) obj).f61100a);
        }
        return false;
    }

    public int hashCode() {
        return this.f61100a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f61100a + ")";
    }
}
