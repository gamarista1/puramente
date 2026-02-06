package Lb;

import Qb.a;
import Tb.b;
import Tb.h;
import Tb.m;
import Tb.n;
import java.util.Collections;
import java.util.List;

public class H {

    /* renamed from: a  reason: collision with root package name */
    private final l f51710a;

    /* renamed from: b  reason: collision with root package name */
    private final G f51711b;

    public H(l lVar, G g10) {
        this.f51710a = lVar;
        this.f51711b = g10;
    }

    public n a(b bVar, a aVar) {
        return this.f51711b.c(this.f51710a, bVar, aVar);
    }

    public n b(n nVar) {
        return c(nVar, Collections.emptyList());
    }

    public n c(n nVar, List list) {
        return d(nVar, list, false);
    }

    public n d(n nVar, List list, boolean z10) {
        return this.f51711b.d(this.f51710a, nVar, list, z10);
    }

    public n e(n nVar) {
        return this.f51711b.e(this.f51710a, nVar);
    }

    public n f(l lVar, n nVar, n nVar2) {
        return this.f51711b.f(this.f51710a, lVar, nVar, nVar2);
    }

    public m g(n nVar, m mVar, boolean z10, h hVar) {
        return this.f51711b.g(this.f51710a, nVar, mVar, z10, hVar);
    }

    public H h(b bVar) {
        return new H(this.f51710a.x(bVar), this.f51711b);
    }

    public n i(l lVar) {
        return this.f51711b.n(this.f51710a.t(lVar));
    }
}
