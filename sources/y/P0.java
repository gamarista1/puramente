package Y;

import java.util.List;
import java.util.Map;
import mf.C6565s;

public abstract class P0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9891a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f9892b = new Object();

    public static final Object a(Map map, Object obj) {
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object L10 = C6565s.L(list);
        if (!list.isEmpty()) {
            return L10;
        }
        map.remove(obj);
        return L10;
    }
}
