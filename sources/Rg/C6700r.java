package rg;

import Of.C5483a;
import Pg.l;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

/* renamed from: rg.r  reason: case insensitive filesystem */
public abstract class C6700r {
    public static final Collection b(Collection collection, C6798l lVar) {
        C6496s.h(collection, "<this>");
        C6496s.h(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        l a10 = l.f64708c.a();
        while (!linkedList.isEmpty()) {
            Object o02 = C6565s.o0(linkedList);
            l a11 = l.f64708c.a();
            Collection q10 = C6697o.q(o02, linkedList, lVar, new C6699q(a11));
            C6496s.g(q10, "extractMembersOverridableInBothWays(...)");
            if (q10.size() != 1 || !a11.isEmpty()) {
                Object L10 = C6697o.L(q10, lVar);
                C5483a aVar = (C5483a) lVar.invoke(L10);
                for (Object next : q10) {
                    C6496s.e(next);
                    if (!C6697o.B(aVar, (C5483a) lVar.invoke(next))) {
                        a11.add(next);
                    }
                }
                if (!a11.isEmpty()) {
                    a10.addAll(a11);
                }
                a10.add(L10);
            } else {
                Object O02 = C6565s.O0(q10);
                C6496s.g(O02, "single(...)");
                a10.add(O02);
            }
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public static final C6514M c(l lVar, Object obj) {
        C6496s.e(obj);
        lVar.add(obj);
        return C6514M.f71813a;
    }
}
