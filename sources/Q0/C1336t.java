package Q0;

import V0.h;
import Y0.e;
import c1.d;
import java.util.List;
import mf.C6565s;

/* renamed from: Q0.t  reason: case insensitive filesystem */
public abstract class C1336t {
    public static final C1335s a(String str, T t10, List list, List list2, d dVar, h.b bVar) {
        return e.a(str, t10, list, list2, dVar, bVar);
    }

    public static /* synthetic */ C1335s b(String str, T t10, List list, List list2, d dVar, h.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = C6565s.n();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = C6565s.n();
        }
        return a(str, t10, list3, list2, dVar, bVar);
    }
}
