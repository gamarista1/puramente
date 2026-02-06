package F4;

import G4.c;
import I4.a;
import java.util.ArrayList;
import java.util.List;
import u4.C4071k;
import x4.C4163i;

abstract class u {

    /* renamed from: a  reason: collision with root package name */
    static c.a f30732a = c.a.a("k");

    static List a(c cVar, C4071k kVar, float f10, N n10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (cVar.M() == c.b.STRING) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.f();
        while (cVar.q()) {
            if (cVar.T(f30732a) != 0) {
                cVar.V();
            } else if (cVar.M() == c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.M() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, kVar, f10, n10, false, z10));
                } else {
                    while (cVar.q()) {
                        arrayList.add(t.c(cVar, kVar, f10, n10, true, z10));
                    }
                }
                cVar.n();
            } else {
                arrayList.add(t.c(cVar, kVar, f10, n10, false, z10));
            }
        }
        cVar.o();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i10;
        Object obj;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            a aVar = (a) list.get(i11);
            i11++;
            a aVar2 = (a) list.get(i11);
            aVar.f31745h = Float.valueOf(aVar2.f31744g);
            if (aVar.f31740c == null && (obj = aVar2.f31739b) != null) {
                aVar.f31740c = obj;
                if (aVar instanceof C4163i) {
                    ((C4163i) aVar).j();
                }
            }
        }
        a aVar3 = (a) list.get(i10);
        if ((aVar3.f31739b == null || aVar3.f31740c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
