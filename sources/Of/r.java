package Of;

import kotlin.jvm.internal.C6496s;

public abstract class r extends C5502u {

    /* renamed from: a  reason: collision with root package name */
    private final x0 f64504a;

    public r(x0 x0Var) {
        C6496s.h(x0Var, "delegate");
        this.f64504a = x0Var;
    }

    public x0 b() {
        return this.f64504a;
    }

    public String c() {
        return b().b();
    }

    public C5502u f() {
        C5502u j10 = C5501t.j(b().d());
        C6496s.g(j10, "toDescriptorVisibility(...)");
        return j10;
    }
}
