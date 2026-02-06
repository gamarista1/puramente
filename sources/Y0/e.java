package Y0;

import Q0.A;
import Q0.C1325h;
import Q0.C1335s;
import Q0.T;
import Q0.y;
import V0.h;
import b1.l;
import c1.d;
import java.util.List;
import java.util.Locale;
import w1.p;

public abstract class e {
    public static final C1335s a(String str, T t10, List list, List list2, d dVar, h.b bVar) {
        return new d(str, t10, list, list2, bVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final boolean c(T t10) {
        C1325h hVar;
        boolean z10;
        y a10;
        A w10 = t10.w();
        if (w10 == null || (a10 = w10.a()) == null) {
            hVar = null;
        } else {
            hVar = C1325h.d(a10.b());
        }
        int c10 = C1325h.f5340b.c();
        if (hVar == null) {
            z10 = false;
        } else {
            z10 = C1325h.g(hVar.j(), c10);
        }
        return !z10;
    }

    public static final int d(int i10, X0.e eVar) {
        boolean z10;
        Locale locale;
        l.a aVar = l.f19124b;
        if (l.j(i10, aVar.b())) {
            return 2;
        }
        if (!l.j(i10, aVar.c())) {
            if (l.j(i10, aVar.d())) {
                return 0;
            }
            if (l.j(i10, aVar.e())) {
                return 1;
            }
            if (l.j(i10, aVar.a())) {
                z10 = true;
            } else {
                z10 = l.j(i10, aVar.f());
            }
            if (z10) {
                if (eVar == null || (locale = eVar.g(0).a()) == null) {
                    locale = Locale.getDefault();
                }
                int a10 = p.a(locale);
                if (a10 == 0 || a10 != 1) {
                    return 2;
                }
            } else {
                throw new IllegalStateException("Invalid TextDirection.");
            }
        }
        return 3;
    }
}
