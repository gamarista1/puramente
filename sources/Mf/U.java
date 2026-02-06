package mf;

import Rg.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;

abstract class U extends T {
    public static h C(Map map) {
        C6496s.h(map, "<this>");
        return C6565s.b0(map.entrySet());
    }

    public static List D(Map map) {
        C6496s.h(map, "<this>");
        if (map.size() == 0) {
            return C6565s.n();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C6565s.n();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C6565s.e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
