package F4;

import A4.d;
import C4.q;
import G4.c;
import java.util.ArrayList;
import u4.C4071k;

/* renamed from: F4.m  reason: case insensitive filesystem */
abstract class C3010m {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30716a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30717b = c.a.a("shapes");

    static d a(c cVar, C4071k kVar) {
        ArrayList arrayList = new ArrayList();
        cVar.f();
        double d10 = 0.0d;
        String str = null;
        String str2 = null;
        char c10 = 0;
        double d11 = 0.0d;
        while (cVar.q()) {
            int T10 = cVar.T(f30716a);
            if (T10 == 0) {
                c10 = cVar.F().charAt(0);
            } else if (T10 == 1) {
                d11 = cVar.v();
            } else if (T10 == 2) {
                d10 = cVar.v();
            } else if (T10 == 3) {
                str = cVar.F();
            } else if (T10 == 4) {
                str2 = cVar.F();
            } else if (T10 != 5) {
                cVar.U();
                cVar.V();
            } else {
                cVar.f();
                while (cVar.q()) {
                    if (cVar.T(f30717b) != 0) {
                        cVar.U();
                        cVar.V();
                    } else {
                        cVar.b();
                        while (cVar.q()) {
                            arrayList.add((q) C3005h.a(cVar, kVar));
                        }
                        cVar.n();
                    }
                }
                cVar.o();
            }
        }
        cVar.o();
        return new d(arrayList, c10, d11, d10, str, str2);
    }
}
