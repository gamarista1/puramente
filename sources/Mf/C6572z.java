package mf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import yf.C6798l;

/* renamed from: mf.z  reason: case insensitive filesystem */
abstract class C6572z extends C6571y {
    public static boolean D(Collection collection, Iterable iterable) {
        C6496s.h(collection, "<this>");
        C6496s.h(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean E(Collection collection, Object[] objArr) {
        C6496s.h(collection, "<this>");
        C6496s.h(objArr, "elements");
        return collection.addAll(C6559l.e(objArr));
    }

    public static final Collection F(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = C6565s.e1(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean G(Iterable iterable, C6798l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final boolean H(List list, C6798l lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return G(V.b(list), lVar, z10);
        }
        int p10 = C6565s.p(list);
        if (p10 >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) lVar.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == p10) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int p11 = C6565s.p(list);
        if (i10 > p11) {
            return true;
        }
        while (true) {
            list.remove(p11);
            if (p11 == i10) {
                return true;
            }
            p11--;
        }
    }

    public static boolean I(Iterable iterable, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(lVar, "predicate");
        return G(iterable, lVar, true);
    }

    public static final boolean J(Collection collection, Iterable iterable) {
        C6496s.h(collection, "<this>");
        C6496s.h(iterable, "elements");
        return collection.removeAll(F(iterable));
    }

    public static boolean K(List list, C6798l lVar) {
        C6496s.h(list, "<this>");
        C6496s.h(lVar, "predicate");
        return H(list, lVar, true);
    }

    public static Object L(List list) {
        C6496s.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object M(List list) {
        C6496s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object N(List list) {
        C6496s.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C6565s.p(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object O(List list) {
        C6496s.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C6565s.p(list));
    }

    public static boolean P(Iterable iterable, C6798l lVar) {
        C6496s.h(iterable, "<this>");
        C6496s.h(lVar, "predicate");
        return G(iterable, lVar, false);
    }

    public static final boolean Q(Collection collection, Iterable iterable) {
        C6496s.h(collection, "<this>");
        C6496s.h(iterable, "elements");
        return collection.retainAll(F(iterable));
    }
}
