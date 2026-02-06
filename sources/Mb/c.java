package Mb;

import Lb.C4368b;
import Lb.l;
import Mb.d;
import Tb.b;

public class c extends d {

    /* renamed from: d  reason: collision with root package name */
    private final C4368b f52034d;

    public c(e eVar, l lVar, C4368b bVar) {
        super(d.a.Merge, eVar, lVar);
        this.f52034d = bVar;
    }

    public d d(b bVar) {
        if (this.f52037c.isEmpty()) {
            C4368b k10 = this.f52034d.k(new l(bVar));
            if (k10.isEmpty()) {
                return null;
            }
            if (k10.D() != null) {
                return new f(this.f52036b, l.D(), k10.D());
            }
            return new c(this.f52036b, l.D(), k10);
        } else if (this.f52037c.E().equals(bVar)) {
            return new c(this.f52036b, this.f52037c.N(), this.f52034d);
        } else {
            return null;
        }
    }

    public C4368b e() {
        return this.f52034d;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", new Object[]{a(), b(), this.f52034d});
    }
}
