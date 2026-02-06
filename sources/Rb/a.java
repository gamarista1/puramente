package Rb;

import Ob.l;
import Qb.c;
import Qb.e;
import Tb.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f52323a = new HashMap();

    public List a() {
        return new ArrayList(this.f52323a.values());
    }

    public void b(c cVar) {
        boolean z10;
        e.a j10 = cVar.j();
        b i10 = cVar.i();
        e.a aVar = e.a.CHILD_ADDED;
        if (j10 == aVar || j10 == e.a.CHILD_CHANGED || j10 == e.a.CHILD_REMOVED) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.g(z10, "Only child changes supported for tracking");
        l.f(true ^ cVar.i().p());
        if (this.f52323a.containsKey(i10)) {
            c cVar2 = (c) this.f52323a.get(i10);
            e.a j11 = cVar2.j();
            if (j10 == aVar && j11 == e.a.CHILD_REMOVED) {
                this.f52323a.put(cVar.i(), c.d(i10, cVar.k(), cVar2.k()));
                return;
            }
            e.a aVar2 = e.a.CHILD_REMOVED;
            if (j10 == aVar2 && j11 == aVar) {
                this.f52323a.remove(i10);
            } else if (j10 == aVar2 && j11 == e.a.CHILD_CHANGED) {
                this.f52323a.put(i10, c.g(i10, cVar2.l()));
            } else {
                e.a aVar3 = e.a.CHILD_CHANGED;
                if (j10 == aVar3 && j11 == aVar) {
                    this.f52323a.put(i10, c.b(i10, cVar.k()));
                } else if (j10 == aVar3 && j11 == aVar3) {
                    this.f52323a.put(i10, c.d(i10, cVar.k(), cVar2.l()));
                } else {
                    throw new IllegalStateException("Illegal combination of changes: " + cVar + " occurred after " + cVar2);
                }
            }
        } else {
            this.f52323a.put(cVar.i(), cVar);
        }
    }
}
