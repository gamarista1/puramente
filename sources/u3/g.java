package U3;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final f f6437a = new f();

    public f a() {
        return this.f6437a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f6437a.p();
    }

    public boolean f(Exception exc) {
        return this.f6437a.q(exc);
    }

    public boolean g(Object obj) {
        return this.f6437a.r(obj);
    }
}
