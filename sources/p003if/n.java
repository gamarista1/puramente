package p003if;

import We.C5615a;
import We.P;

/* renamed from: if.n  reason: invalid package */
public abstract class n {
    public static C5615a a(C5615a aVar, Boolean bool, Double d10, Double d11) {
        if (aVar == null) {
            aVar = new C5615a(P.c());
        }
        if (aVar.b() == null) {
            Double c10 = aVar.c();
            if (c10 != null) {
                d10 = c10;
            }
            aVar.f(k.a(d11, d10, bool));
        }
        if (aVar.d() && aVar.e()) {
            aVar.a();
        }
        return aVar;
    }
}
