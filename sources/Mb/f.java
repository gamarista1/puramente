package Mb;

import Lb.l;
import Mb.d;
import Tb.b;
import Tb.n;

public class f extends d {

    /* renamed from: d  reason: collision with root package name */
    private final n f52051d;

    public f(e eVar, l lVar, n nVar) {
        super(d.a.Overwrite, eVar, lVar);
        this.f52051d = nVar;
    }

    public d d(b bVar) {
        if (this.f52037c.isEmpty()) {
            return new f(this.f52036b, l.D(), this.f52051d.k0(bVar));
        }
        return new f(this.f52036b, this.f52037c.N(), this.f52051d);
    }

    public n e() {
        return this.f52051d;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", new Object[]{a(), b(), this.f52051d});
    }
}
