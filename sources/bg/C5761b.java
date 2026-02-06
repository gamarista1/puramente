package bg;

import Ef.m;
import Rg.h;
import Rg.k;
import eg.C5830g;
import eg.C5837n;
import eg.p;
import eg.r;
import eg.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import ng.f;
import yf.C6798l;

/* renamed from: bg.b  reason: case insensitive filesystem */
public class C5761b implements C5762c {

    /* renamed from: a  reason: collision with root package name */
    private final C5830g f67195a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f67196b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f67197c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f67198d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f67199e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f67200f;

    public C5761b(C5830g gVar, C6798l lVar) {
        C6496s.h(gVar, "jClass");
        C6496s.h(lVar, "memberFilter");
        this.f67195a = gVar;
        this.f67196b = lVar;
        C5760a aVar = new C5760a(this);
        this.f67197c = aVar;
        h o10 = k.o(C6565s.b0(gVar.C()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : o10) {
            f name = ((r) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f67198d = linkedHashMap;
        h o11 = k.o(C6565s.b0(this.f67195a.y()), this.f67196b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : o11) {
            linkedHashMap2.put(((C5837n) next2).getName(), next2);
        }
        this.f67199e = linkedHashMap2;
        C6798l lVar2 = this.f67196b;
        ArrayList arrayList = new ArrayList();
        for (Object next3 : this.f67195a.n()) {
            if (((Boolean) lVar2.invoke(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m.d(O.e(C6565s.y(arrayList, 10)), 16));
        for (Object next4 : arrayList) {
            linkedHashMap3.put(((w) next4).getName(), next4);
        }
        this.f67200f = linkedHashMap3;
    }

    /* access modifiers changed from: private */
    public static final boolean h(C5761b bVar, r rVar) {
        C6496s.h(rVar, "m");
        if (!((Boolean) bVar.f67196b.invoke(rVar)).booleanValue() || p.c(rVar)) {
            return false;
        }
        return true;
    }

    public Set a() {
        h<r> o10 = k.o(C6565s.b0(this.f67195a.C()), this.f67197c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r name : o10) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public Set b() {
        return this.f67200f.keySet();
    }

    public Set c() {
        h<C5837n> o10 = k.o(C6565s.b0(this.f67195a.y()), this.f67196b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5837n name : o10) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public C5837n d(f fVar) {
        C6496s.h(fVar, "name");
        return (C5837n) this.f67199e.get(fVar);
    }

    public Collection e(f fVar) {
        C6496s.h(fVar, "name");
        List list = (List) this.f67198d.get(fVar);
        if (list == null) {
            list = C6565s.n();
        }
        return list;
    }

    public w f(f fVar) {
        C6496s.h(fVar, "name");
        return (w) this.f67200f.get(fVar);
    }
}
