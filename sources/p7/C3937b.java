package p7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;

/* renamed from: p7.b  reason: case insensitive filesystem */
public final class C3937b {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f47579a = new ConcurrentHashMap();

    public final List a(String str) {
        C6496s.h(str, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f47579a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            arrayList.add((C3936a) value.getValue());
        }
        return arrayList;
    }

    public final void b(String str, List list) {
        C6496s.h(str, "appId");
        C6496s.h(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3936a aVar = (C3936a) it.next();
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.f47579a.put(str, concurrentHashMap);
    }
}
