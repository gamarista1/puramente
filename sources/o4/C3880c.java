package o4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mf.C6565s;
import mf.O;

/* renamed from: o4.c  reason: case insensitive filesystem */
public abstract class C3880c {
    public static final List a(List list) {
        int size = list.size();
        if (size == 0) {
            return C6565s.n();
        }
        if (size != 1) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return Collections.singletonList(C6565s.o0(list));
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return O.i();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) C6565s.n0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
