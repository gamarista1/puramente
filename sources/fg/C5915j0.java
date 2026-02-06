package fg;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.O;

/* renamed from: fg.j0  reason: case insensitive filesystem */
public final class C5915j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f67670a;

    public C5915j0(Map map) {
        C6496s.h(map, "map");
        this.f67670a = map;
    }

    public final C5915j0 a() {
        Map map = this.f67670a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C5910h.c((C5910h) entry.getValue(), (C5916k) null, (C5912i) null, false, true, 7, (Object) null));
        }
        return new C5915j0(linkedHashMap);
    }

    public final Map b() {
        return this.f67670a;
    }
}
