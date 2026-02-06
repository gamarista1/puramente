package Xf;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import ng.b;
import ng.c;
import ng.i;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f66390a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f66391b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f66392c;

    static {
        r rVar = new r();
        f66390a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f66391b = linkedHashMap;
        i iVar = i.f72359a;
        rVar.c(iVar.l(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.n(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.m(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = b.f72283d;
        rVar.c(aVar.c(new c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C6502A.a(((b) entry.getKey()).a(), ((b) entry.getValue()).a()));
        }
        f66392c = O.w(arrayList);
    }

    private r() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String cVar : strArr) {
            arrayList.add(b.f72283d.c(new c(cVar)));
        }
        return arrayList;
    }

    private final void c(b bVar, List list) {
        Map map = f66391b;
        for (Object next : list) {
            b bVar2 = (b) next;
            map.put(next, bVar);
        }
    }

    public final c b(c cVar) {
        C6496s.h(cVar, "classFqName");
        return (c) f66392c.get(cVar);
    }
}
