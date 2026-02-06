package Qb;

import Tb.i;
import Tb.n;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final a f52294a;

    /* renamed from: b  reason: collision with root package name */
    private final a f52295b;

    public k(a aVar, a aVar2) {
        this.f52294a = aVar;
        this.f52295b = aVar2;
    }

    public n a() {
        if (this.f52294a.f()) {
            return this.f52294a.b();
        }
        return null;
    }

    public n b() {
        if (this.f52295b.f()) {
            return this.f52295b.b();
        }
        return null;
    }

    public a c() {
        return this.f52294a;
    }

    public a d() {
        return this.f52295b;
    }

    public k e(i iVar, boolean z10, boolean z11) {
        return new k(new a(iVar, z10, z11), this.f52295b);
    }

    public k f(i iVar, boolean z10, boolean z11) {
        return new k(this.f52294a, new a(iVar, z10, z11));
    }
}
