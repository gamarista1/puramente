package Lf;

import Lf.o;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import mf.C6565s;
import ng.b;
import ng.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f63868a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Set f63869b;

    static {
        Iterable<l> iterable = l.f63891f;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (l c10 : iterable) {
            arrayList.add(o.c(c10));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f72283d;
        for (c c11 : C6565s.L0(C6565s.L0(C6565s.L0(arrayList, o.a.f64009h.l()), o.a.f64013j.l()), o.a.f64031s.l())) {
            linkedHashSet.add(aVar.c(c11));
        }
        f63869b = linkedHashSet;
    }

    private d() {
    }

    public final Set a() {
        return f63869b;
    }

    public final Set b() {
        return f63869b;
    }
}
