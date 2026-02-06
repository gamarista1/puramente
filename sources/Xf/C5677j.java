package Xf;

import Lf.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import ng.b;
import ng.c;
import ng.d;
import ng.f;

/* renamed from: Xf.j  reason: case insensitive filesystem */
public final class C5677j {

    /* renamed from: a  reason: collision with root package name */
    public static final C5677j f66379a = new C5677j();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f66380b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f66381c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set f66382d;

    /* renamed from: e  reason: collision with root package name */
    private static final Set f66383e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set f66384f;

    static {
        d dVar = o.a.f64031s;
        Pair a10 = C6502A.a(C5678k.d(dVar, "name"), o.f63940m);
        Pair a11 = C6502A.a(C5678k.d(dVar, "ordinal"), f.i("ordinal"));
        Pair a12 = C6502A.a(C5678k.c(o.a.f63992X, "size"), f.i("size"));
        c cVar = o.a.f63998b0;
        Map l10 = O.l(a10, a11, a12, C6502A.a(C5678k.c(cVar, "size"), f.i("size")), C6502A.a(C5678k.d(o.a.f64007g, "length"), f.i("length")), C6502A.a(C5678k.c(cVar, "keys"), f.i("keySet")), C6502A.a(C5678k.c(cVar, "values"), f.i("values")), C6502A.a(C5678k.c(cVar, "entries"), f.i("entrySet")));
        f66380b = l10;
        Iterable<Map.Entry> entrySet = l10.entrySet();
        ArrayList<Pair> arrayList = new ArrayList<>(C6565s.y(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            f fVar = (f) pair.d();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((f) pair.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C6565s.f0((Iterable) entry2.getValue()));
        }
        f66381c = linkedHashMap2;
        Map map = f66380b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            Nf.c cVar2 = Nf.c.f64255a;
            d j10 = ((c) entry3.getKey()).e().j();
            C6496s.g(j10, "toUnsafe(...)");
            b n10 = cVar2.n(j10);
            C6496s.e(n10);
            linkedHashSet.add(n10.a().c((f) entry3.getValue()));
        }
        f66382d = linkedHashSet;
        Set keySet = f66380b.keySet();
        f66383e = keySet;
        Iterable<c> iterable = keySet;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
        for (c g10 : iterable) {
            arrayList2.add(g10.g());
        }
        f66384f = C6565s.j1(arrayList2);
    }

    private C5677j() {
    }

    public final Map a() {
        return f66380b;
    }

    public final List b(f fVar) {
        C6496s.h(fVar, "name1");
        List list = (List) f66381c.get(fVar);
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public final Set c() {
        return f66383e;
    }

    public final Set d() {
        return f66384f;
    }
}
