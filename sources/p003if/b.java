package p003if;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: if.b  reason: invalid package */
public abstract class b {
    public static List a(List list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static Map b(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static Map c(Map map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }
}
