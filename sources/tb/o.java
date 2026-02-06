package Tb;

import Gb.c;
import Ib.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class o {
    public static n a(Object obj) {
        return b(obj, r.a());
    }

    public static n b(Object obj, n nVar) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    nVar = r.d(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return g.A();
            }
            if (obj instanceof String) {
                return new t((String) obj, nVar);
            }
            if (obj instanceof Long) {
                return new l((Long) obj, nVar);
            }
            if (obj instanceof Integer) {
                return new l(Long.valueOf((long) ((Integer) obj).intValue()), nVar);
            }
            if (obj instanceof Double) {
                return new f((Double) obj, nVar);
            }
            if (obj instanceof Boolean) {
                return new a((Boolean) obj, nVar);
            }
            if (!(obj instanceof Map)) {
                if (!(obj instanceof List)) {
                    throw new c("Failed to parse node with class " + obj.getClass().toString());
                }
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new e(map2, nVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        n a10 = a(map2.get(str));
                        if (!a10.isEmpty()) {
                            hashMap.put(b.e(str), a10);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String str2 = "" + i10;
                    n a11 = a(list.get(i10));
                    if (!a11.isEmpty()) {
                        hashMap.put(b.e(str2), a11);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return g.A();
            }
            return new c(c.a.d(hashMap, c.f52508d), nVar);
        } catch (ClassCastException e10) {
            throw new Gb.c("Failed to parse node", e10);
        }
    }

    public static int c(b bVar, n nVar, b bVar2, n nVar2) {
        int compareTo = nVar.compareTo(nVar2);
        if (compareTo != 0) {
            return compareTo;
        }
        return bVar.compareTo(bVar2);
    }
}
