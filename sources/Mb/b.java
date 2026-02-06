package Mb;

import Lb.l;
import Mb.d;

public class b extends d {
    public b(e eVar, l lVar) {
        super(d.a.ListenComplete, eVar, lVar);
        Ob.l.g(!eVar.d(), "Can't have a listen complete from a user source");
    }

    public d d(Tb.b bVar) {
        if (this.f52037c.isEmpty()) {
            return new b(this.f52036b, l.D());
        }
        return new b(this.f52036b, this.f52037c.N());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", new Object[]{a(), b()});
    }
}
