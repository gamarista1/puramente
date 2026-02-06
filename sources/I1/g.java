package I1;

import J1.a;
import J1.b;
import Ug.K;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6787a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f2700a = new g();

    private g() {
    }

    public final f a(k kVar, b bVar, List list, K k10, C6787a aVar) {
        C6496s.h(kVar, "serializer");
        C6496s.h(list, "migrations");
        C6496s.h(k10, "scope");
        C6496s.h(aVar, "produceFile");
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new a();
        }
        return new m(aVar, kVar, C6565s.e(e.f2683a.b(list)), bVar2, k10);
    }
}
