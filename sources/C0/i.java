package c0;

public final class i extends C1887a {

    /* renamed from: c  reason: collision with root package name */
    private final Object f19198c;

    public i(Object obj, int i10) {
        super(i10, 1);
        this.f19198c = obj;
    }

    public Object next() {
        a();
        g(c() + 1);
        return this.f19198c;
    }

    public Object previous() {
        b();
        g(c() - 1);
        return this.f19198c;
    }
}
