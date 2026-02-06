package Eg;

class l {

    /* renamed from: a  reason: collision with root package name */
    private final Object f62869a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread f62870b = Thread.currentThread();

    l(Object obj) {
        this.f62869a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f62869a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        if (this.f62870b == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
