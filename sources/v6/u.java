package V6;

import T5.l;
import X5.a;

public class u implements x {

    /* renamed from: a  reason: collision with root package name */
    private final x f34728a;

    /* renamed from: b  reason: collision with root package name */
    private final z f34729b;

    public u(x xVar, z zVar) {
        this.f34728a = xVar;
        this.f34729b = zVar;
    }

    public a b(Object obj, a aVar) {
        this.f34729b.c(obj);
        return this.f34728a.b(obj, aVar);
    }

    public void c(Object obj) {
        this.f34728a.c(obj);
    }

    public boolean d(l lVar) {
        return this.f34728a.d(lVar);
    }

    public int g(l lVar) {
        return this.f34728a.g(lVar);
    }

    public a get(Object obj) {
        a aVar = this.f34728a.get(obj);
        if (aVar == null) {
            this.f34729b.b(obj);
        } else {
            this.f34729b.a(obj);
        }
        return aVar;
    }
}
