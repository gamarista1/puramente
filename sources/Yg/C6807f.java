package yg;

import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Fg.S;
import Of.C5484b;
import Of.C5487e;
import Of.C5507z;
import Of.Z;
import Of.g0;
import Pg.k;
import Wf.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.f;
import rg.C6695m;
import rg.C6697o;
import yf.C6798l;
import yg.C6815n;

/* renamed from: yg.f  reason: case insensitive filesystem */
public abstract class C6807f extends C6813l {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ l[] f73937d = {O.i(new F(O.b(C6807f.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    private final C5487e f73938b;

    /* renamed from: c  reason: collision with root package name */
    private final i f73939c;

    /* renamed from: yg.f$a */
    public static final class a extends C6695m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f73940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6807f f73941b;

        a(ArrayList arrayList, C6807f fVar) {
            this.f73940a = arrayList;
            this.f73941b = fVar;
        }

        public void a(C5484b bVar) {
            C6496s.h(bVar, "fakeOverride");
            C6697o.K(bVar, (C6798l) null);
            this.f73940a.add(bVar);
        }

        /* access modifiers changed from: protected */
        public void e(C5484b bVar, C5484b bVar2) {
            C6496s.h(bVar, "fromSuper");
            C6496s.h(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f73941b.m() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public C6807f(n nVar, C5487e eVar) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(eVar, "containingClass");
        this.f73938b = eVar;
        this.f73939c = nVar.g(new C6806e(this));
    }

    /* access modifiers changed from: private */
    public static final List i(C6807f fVar) {
        List j10 = fVar.j();
        return C6565s.K0(j10, fVar.k(j10));
    }

    private final List k(List list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<S> l10 = this.f73938b.l().l();
        C6496s.g(l10, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        for (S o10 : l10) {
            C6565s.D(arrayList2, C6815n.a.a(o10.o(), (C6805d) null, (C6798l) null, 3, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof C5484b) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            f name = ((C5484b) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C6496s.g(key, "component1(...)");
            f fVar = (f) key;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((C5484b) next3) instanceof C5507z);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                C6697o oVar = C6697o.f73033f;
                Collection collection2 = (List) entry2.getValue();
                if (booleanValue) {
                    collection = new ArrayList();
                    for (Object next4 : list) {
                        if (C6496s.c(((C5507z) next4).getName(), fVar)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C6565s.n();
                }
                oVar.v(fVar, collection2, collection, this.f73938b, new a(arrayList, this));
            }
        }
        return Pg.a.c(arrayList);
    }

    private final List l() {
        return (List) m.a(this.f73939c, this, f73937d[0]);
    }

    public Collection b(f fVar, b bVar) {
        List list;
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        Collection l10 = l();
        if (l10.isEmpty()) {
            list = C6565s.n();
        } else {
            k kVar = new k();
            for (Object next : l10) {
                if ((next instanceof Z) && C6496s.c(((Z) next).getName(), fVar)) {
                    kVar.add(next);
                }
            }
            list = kVar;
        }
        return list;
    }

    public Collection c(f fVar, b bVar) {
        List list;
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        Collection l10 = l();
        if (l10.isEmpty()) {
            list = C6565s.n();
        } else {
            k kVar = new k();
            for (Object next : l10) {
                if ((next instanceof g0) && C6496s.c(((g0) next).getName(), fVar)) {
                    kVar.add(next);
                }
            }
            list = kVar;
        }
        return list;
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        if (!dVar.a(C6805d.f73921p.m())) {
            return C6565s.n();
        }
        return l();
    }

    /* access modifiers changed from: protected */
    public abstract List j();

    /* access modifiers changed from: protected */
    public final C5487e m() {
        return this.f73938b;
    }
}
