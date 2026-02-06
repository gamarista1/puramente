package b8;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final d f36296a = new d();

    public final d a() {
        return this.f36296a;
    }

    public final void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean e() {
        return this.f36296a.x();
    }

    public final boolean f(Exception exc) {
        return this.f36296a.y(exc);
    }

    public final boolean g(Object obj) {
        return this.f36296a.z(obj);
    }
}
