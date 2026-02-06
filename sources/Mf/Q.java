package mf;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import nf.C6612d;

abstract class Q extends P {
    public static Map b(Map map) {
        C6496s.h(map, "builder");
        return ((C6612d) map).q();
    }

    public static Map c() {
        return new C6612d();
    }

    public static Map d(int i10) {
        return new C6612d(i10);
    }

    public static int e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return a.e.API_PRIORITY_OTHER;
    }

    public static Map f(Pair pair) {
        C6496s.h(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.c(), pair.d());
        C6496s.g(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map g(Map map) {
        C6496s.h(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C6496s.g(singletonMap, "with(...)");
        return singletonMap;
    }

    public static SortedMap h(Map map, Comparator comparator) {
        C6496s.h(map, "<this>");
        C6496s.h(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
