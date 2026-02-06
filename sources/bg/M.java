package Bg;

import Of.h0;
import ig.c;
import ig.m;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C6434a;
import kg.C6436c;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import ng.b;
import yf.C6798l;

public final class M implements C5324j {

    /* renamed from: a  reason: collision with root package name */
    private final C6436c f62471a;

    /* renamed from: b  reason: collision with root package name */
    private final C6434a f62472b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f62473c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f62474d;

    public M(m mVar, C6436c cVar, C6434a aVar, C6798l lVar) {
        C6496s.h(mVar, "proto");
        C6496s.h(cVar, "nameResolver");
        C6496s.h(aVar, "metadataVersion");
        C6496s.h(lVar, "classSource");
        this.f62471a = cVar;
        this.f62472b = aVar;
        this.f62473c = lVar;
        List J10 = mVar.J();
        C6496s.g(J10, "getClass_List(...)");
        Iterable iterable = J10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ef.m.d(O.e(C6565s.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(L.a(this.f62471a, ((c) next).F0()), next);
        }
        this.f62474d = linkedHashMap;
    }

    public C5323i a(b bVar) {
        C6496s.h(bVar, "classId");
        c cVar = (c) this.f62474d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new C5323i(this.f62471a, cVar, this.f62472b, (h0) this.f62473c.invoke(bVar));
    }

    public final Collection b() {
        return this.f62474d.keySet();
    }
}
