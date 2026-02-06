package Qb;

import Lb.l;
import Tb.b;
import Tb.i;
import Tb.n;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final i f52244a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52245b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52246c;

    public a(i iVar, boolean z10, boolean z11) {
        this.f52244a = iVar;
        this.f52245b = z10;
        this.f52246c = z11;
    }

    public i a() {
        return this.f52244a;
    }

    public n b() {
        return this.f52244a.k();
    }

    public boolean c(b bVar) {
        if ((!f() || this.f52246c) && !this.f52244a.k().w(bVar)) {
            return false;
        }
        return true;
    }

    public boolean d(l lVar) {
        if (!lVar.isEmpty()) {
            return c(lVar.E());
        }
        if (!f() || this.f52246c) {
            return false;
        }
        return true;
    }

    public boolean e() {
        return this.f52246c;
    }

    public boolean f() {
        return this.f52245b;
    }
}
