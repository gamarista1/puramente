package Ob;

import Tb.a;
import Tb.c;
import Tb.f;
import Tb.k;
import Tb.l;
import Tb.m;
import Tb.n;
import Tb.t;
import java.util.Iterator;

public abstract class e {
    private static long a(k kVar) {
        long j10 = 8;
        if (!(kVar instanceof f) && !(kVar instanceof l)) {
            if (kVar instanceof a) {
                j10 = 4;
            } else if (kVar instanceof t) {
                j10 = ((long) ((String) kVar.getValue()).length()) + 2;
            } else {
                throw new IllegalArgumentException("Unknown leaf node type: " + kVar.getClass());
            }
        }
        if (kVar.q().isEmpty()) {
            return j10;
        }
        return j10 + 24 + a((k) kVar.q());
    }

    public static long b(n nVar) {
        if (nVar.isEmpty()) {
            return 4;
        }
        if (nVar.e0()) {
            return a((k) nVar);
        }
        l.g(nVar instanceof c, "Unexpected node type: " + nVar.getClass());
        Iterator it = nVar.iterator();
        long j10 = 1;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            j10 = j10 + ((long) mVar.c().b().length()) + 4 + b(mVar.d());
        }
        if (!nVar.q().isEmpty()) {
            return j10 + 12 + a((k) nVar.q());
        }
        return j10;
    }

    public static int c(n nVar) {
        int i10 = 0;
        if (nVar.isEmpty()) {
            return 0;
        }
        if (nVar.e0()) {
            return 1;
        }
        l.g(nVar instanceof c, "Unexpected node type: " + nVar.getClass());
        Iterator it = nVar.iterator();
        while (it.hasNext()) {
            i10 += c(((m) it.next()).d());
        }
        return i10;
    }
}
