package retrofit2;

import java.util.Objects;
import rh.B;
import rh.C;
import rh.E;

public final class F<T> {

    /* renamed from: a  reason: collision with root package name */
    private final E f72846a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f72847b;

    /* renamed from: c  reason: collision with root package name */
    private final rh.F f72848c;

    private F(E e10, Object obj, rh.F f10) {
        this.f72846a = e10;
        this.f72847b = obj;
        this.f72848c = f10;
    }

    public static F c(rh.F f10, E e10) {
        Objects.requireNonNull(f10, "body == null");
        Objects.requireNonNull(e10, "rawResponse == null");
        if (!e10.m0()) {
            return new F(e10, (Object) null, f10);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static F g(Object obj) {
        return h(obj, new E.a().g(200).m("OK").p(B.HTTP_1_1).r(new C.a().l("http://localhost/").b()).c());
    }

    public static F h(Object obj, E e10) {
        Objects.requireNonNull(e10, "rawResponse == null");
        if (e10.m0()) {
            return new F(e10, obj, (rh.F) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f72847b;
    }

    public int b() {
        return this.f72846a.o();
    }

    public rh.F d() {
        return this.f72848c;
    }

    public boolean e() {
        return this.f72846a.m0();
    }

    public String f() {
        return this.f72846a.M();
    }

    public String toString() {
        return this.f72846a.toString();
    }
}
