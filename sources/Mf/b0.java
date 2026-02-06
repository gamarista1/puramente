package mf;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

abstract class b0 extends a0 {
    public static Set l(Set set, Iterable iterable) {
        C6496s.h(set, "<this>");
        C6496s.h(iterable, "elements");
        Collection F10 = C6572z.F(iterable);
        if (F10.isEmpty()) {
            return C6565s.j1(set);
        }
        if (F10 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!F10.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(F10);
        return linkedHashSet2;
    }

    public static Set m(Set set, Object obj) {
        C6496s.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(O.e(set.size()));
        boolean z10 = false;
        for (Object next : set) {
            boolean z11 = true;
            if (!z10 && C6496s.c(next, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static Set n(Set set, Iterable iterable) {
        int i10;
        C6496s.h(set, "<this>");
        C6496s.h(iterable, "elements");
        Integer z10 = C6568v.z(iterable);
        if (z10 != null) {
            i10 = set.size() + z10.intValue();
        } else {
            i10 = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(O.e(i10));
        linkedHashSet.addAll(set);
        C6565s.D(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set o(Set set, Object obj) {
        C6496s.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(O.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
