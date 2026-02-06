package J0;

import a0.C1538b;
import java.util.List;
import yf.C6787a;

public final class X {

    /* renamed from: c  reason: collision with root package name */
    public static final int f3745c = C1538b.f10554d;

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f3746a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f3747b;

    public X(C1538b bVar, C6787a aVar) {
        this.f3746a = bVar;
        this.f3747b = aVar;
    }

    public final void a(int i10, Object obj) {
        this.f3746a.a(i10, obj);
        this.f3747b.invoke();
    }

    public final List b() {
        return this.f3746a.h();
    }

    public final void c() {
        this.f3746a.i();
        this.f3747b.invoke();
    }

    public final Object d(int i10) {
        return this.f3746a.p()[i10];
    }

    public final int e() {
        return this.f3746a.q();
    }

    public final C1538b f() {
        return this.f3746a;
    }

    public final Object g(int i10) {
        Object y10 = this.f3746a.y(i10);
        this.f3747b.invoke();
        return y10;
    }
}
