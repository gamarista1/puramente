package mf;

import Rg.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;

abstract class S extends Q {
    public static final Map A(Pair[] pairArr, Map map) {
        C6496s.h(pairArr, "<this>");
        C6496s.h(map, "destination");
        t(map, pairArr);
        return map;
    }

    public static Map B(Map map) {
        C6496s.h(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map i() {
        C6546F f10 = C6546F.f72030a;
        C6496s.f(f10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return f10;
    }

    public static Object j(Map map, Object obj) {
        C6496s.h(map, "<this>");
        return P.a(map, obj);
    }

    public static HashMap k(Pair... pairArr) {
        C6496s.h(pairArr, "pairs");
        HashMap hashMap = new HashMap(O.e(pairArr.length));
        t(hashMap, pairArr);
        return hashMap;
    }

    public static Map l(Pair... pairArr) {
        C6496s.h(pairArr, "pairs");
        if (pairArr.length > 0) {
            return A(pairArr, new LinkedHashMap(O.e(pairArr.length)));
        }
        return O.i();
    }

    public static Map m(Map map, Iterable iterable) {
        C6496s.h(map, "<this>");
        C6496s.h(iterable, "keys");
        Map B10 = O.B(map);
        C6572z.J(B10.keySet(), iterable);
        return o(B10);
    }

    public static Map n(Pair... pairArr) {
        C6496s.h(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(pairArr.length));
        t(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map o(Map map) {
        C6496s.h(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return O.i();
        }
        if (size != 1) {
            return map;
        }
        return Q.g(map);
    }

    public static Map p(Map map, Map map2) {
        C6496s.h(map, "<this>");
        C6496s.h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map q(Map map, Pair pair) {
        C6496s.h(map, "<this>");
        C6496s.h(pair, "pair");
        if (map.isEmpty()) {
            return O.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final void r(Map map, h hVar) {
        C6496s.h(map, "<this>");
        C6496s.h(hVar, "pairs");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.a(), pair.b());
        }
    }

    public static void s(Map map, Iterable iterable) {
        C6496s.h(map, "<this>");
        C6496s.h(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.a(), pair.b());
        }
    }

    public static final void t(Map map, Pair[] pairArr) {
        C6496s.h(map, "<this>");
        C6496s.h(pairArr, "pairs");
        for (Pair pair : pairArr) {
            map.put(pair.a(), pair.b());
        }
    }

    public static Map u(h hVar) {
        C6496s.h(hVar, "<this>");
        return o(v(hVar, new LinkedHashMap()));
    }

    public static final Map v(h hVar, Map map) {
        C6496s.h(hVar, "<this>");
        C6496s.h(map, "destination");
        r(map, hVar);
        return map;
    }

    public static Map w(Iterable iterable) {
        Object next;
        C6496s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o(x(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return O.i();
        }
        if (size != 1) {
            return x(iterable, new LinkedHashMap(O.e(collection.size())));
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return O.f((Pair) next);
    }

    public static final Map x(Iterable iterable, Map map) {
        C6496s.h(iterable, "<this>");
        C6496s.h(map, "destination");
        O.s(map, iterable);
        return map;
    }

    public static Map y(Map map) {
        C6496s.h(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return O.i();
        }
        if (size != 1) {
            return O.B(map);
        }
        return Q.g(map);
    }

    public static Map z(Pair[] pairArr) {
        C6496s.h(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            return O.i();
        }
        if (length != 1) {
            return A(pairArr, new LinkedHashMap(O.e(pairArr.length)));
        }
        return O.f(pairArr[0]);
    }
}
