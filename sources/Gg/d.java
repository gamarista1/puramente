package Gg;

import Fg.C5366d0;
import Fg.E;
import Fg.I;
import Fg.L;
import Fg.M0;
import Fg.V;
import Fg.W;
import Hg.k;
import Hg.l;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;

public abstract class d {
    public static final M0 a(Collection collection) {
        C5366d0 d0Var;
        C6496s.h(collection, "types");
        int size = collection.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        } else if (size == 1) {
            return (M0) C6565s.O0(collection);
        } else {
            Iterable<M0> iterable = collection;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            boolean z10 = false;
            boolean z11 = false;
            for (M0 m02 : iterable) {
                if (z10 || W.a(m02)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (m02 instanceof C5366d0) {
                    d0Var = (C5366d0) m02;
                } else if (!(m02 instanceof I)) {
                    throw new C6535s();
                } else if (E.a(m02)) {
                    return m02;
                } else {
                    d0Var = ((I) m02).V0();
                    z11 = true;
                }
                arrayList.add(d0Var);
            }
            if (z10) {
                return l.d(k.INTERSECTION_OF_ERROR_TYPES, collection.toString());
            }
            if (!z11) {
                return z.f63210a.d(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
            for (M0 d10 : iterable) {
                arrayList2.add(L.d(d10));
            }
            z zVar = z.f63210a;
            return V.e(zVar.d(arrayList), zVar.d(arrayList2));
        }
    }
}
