package Og;

import Pg.k;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C6496s;
import yg.C6812k;

public abstract class a {
    public static final Collection a(Collection collection, Collection collection2) {
        C6496s.h(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final k b(Iterable iterable) {
        C6496s.h(iterable, "scopes");
        k kVar = new k();
        for (Object next : iterable) {
            C6812k kVar2 = (C6812k) next;
            if (!(kVar2 == null || kVar2 == C6812k.b.f73949b)) {
                kVar.add(next);
            }
        }
        return kVar;
    }
}
