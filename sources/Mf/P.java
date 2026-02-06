package mf;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;

abstract class P {
    public static final Object a(Map map, Object obj) {
        C6496s.h(map, "<this>");
        if (map instanceof N) {
            return ((N) map).h(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
