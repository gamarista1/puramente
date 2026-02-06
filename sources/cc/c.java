package Cc;

import Eb.C4282c;
import Eb.C4283d;
import Eb.q;
import java.util.Iterator;
import java.util.Set;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f50392a;

    /* renamed from: b  reason: collision with root package name */
    private final d f50393b;

    c(Set set, d dVar) {
        this.f50392a = e(set);
        this.f50393b = dVar;
    }

    public static C4282c c() {
        return C4282c.e(i.class).b(q.o(f.class)).f(new b()).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i d(C4283d dVar) {
        return new c(dVar.b(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public String a() {
        if (this.f50393b.b().isEmpty()) {
            return this.f50392a;
        }
        return this.f50392a + ' ' + e(this.f50393b.b());
    }
}
