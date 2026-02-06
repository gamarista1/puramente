package kg;

import ig.q;
import ig.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List f71574a;

    public g(t tVar) {
        C6496s.h(tVar, "typeTable");
        List A10 = tVar.A();
        if (tVar.B()) {
            int x10 = tVar.x();
            List A11 = tVar.A();
            C6496s.g(A11, "getTypeList(...)");
            Iterable iterable = A11;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            int i10 = 0;
            for (Object next : iterable) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                q qVar = (q) next;
                if (i10 >= x10) {
                    qVar = qVar.g().J(true).f();
                }
                arrayList.add(qVar);
                i10 = i11;
            }
            A10 = arrayList;
        }
        C6496s.g(A10, "run(...)");
        this.f71574a = A10;
    }

    public final q a(int i10) {
        return (q) this.f71574a.get(i10);
    }
}
