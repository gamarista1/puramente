package Mb;

import Lb.l;
import Mb.d;
import Ob.d;
import Tb.b;

public class a extends d {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f52032d;

    /* renamed from: e  reason: collision with root package name */
    private final d f52033e;

    public a(l lVar, d dVar, boolean z10) {
        super(d.a.AckUserWrite, e.f52043d, lVar);
        this.f52033e = dVar;
        this.f52032d = z10;
    }

    public d d(b bVar) {
        if (!this.f52037c.isEmpty()) {
            Ob.l.g(this.f52037c.E().equals(bVar), "operationForChild called for unrelated child.");
            return new a(this.f52037c.N(), this.f52033e, this.f52032d);
        } else if (this.f52033e.getValue() != null) {
            Ob.l.g(this.f52033e.t().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new a(l.D(), this.f52033e.E(new l(bVar)), this.f52032d);
        }
    }

    public Ob.d e() {
        return this.f52033e;
    }

    public boolean f() {
        return this.f52032d;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", new Object[]{a(), Boolean.valueOf(this.f52032d), this.f52033e});
    }
}
