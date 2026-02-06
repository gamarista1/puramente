package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import nb.o;
import nb.p;

public abstract class B {
    public static boolean a(Iterable iterable, p pVar) {
        return C.b(iterable.iterator(), pVar);
    }

    private static Collection b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return E.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return C.m(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return C.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return f(list);
        }
        throw new NoSuchElementException();
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(E.a(iterable));
            }
        }
        return C.l(iterable.iterator(), obj);
    }

    private static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return C.n(iterable.iterator());
    }

    public static boolean h(Iterable iterable, p pVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C.r(iterable.iterator(), pVar);
        }
        return i((List) iterable, (p) o.j(pVar));
    }

    private static boolean i(List list, p pVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!pVar.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (UnsupportedOperationException unused) {
                        j(list, pVar, i11, i10);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        j(list, pVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        if (i10 != i11) {
            return true;
        }
        return false;
    }

    private static void j(List list, p pVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (pVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}
