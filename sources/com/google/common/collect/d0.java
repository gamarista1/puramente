package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import nb.o;

abstract class d0 {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return O.d();
        }
        return comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        o.j(comparator);
        o.j(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof c0)) {
            return false;
        } else {
            comparator2 = ((c0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
