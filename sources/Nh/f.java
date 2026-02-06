package nh;

import Ff.d;
import gh.C5978b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.O;
import nh.C6620a;
import yf.C6798l;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f72428a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f72429b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f72430c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f72431d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f72432e = new HashMap();

    public static /* synthetic */ void j(f fVar, d dVar, d dVar2, C5978b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.i(dVar, dVar2, bVar, z10);
    }

    public static /* synthetic */ void l(f fVar, d dVar, C6620a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.k(dVar, aVar, z10);
    }

    public void a(d dVar, C5978b bVar) {
        C6496s.h(dVar, "kClass");
        C6496s.h(bVar, "serializer");
        l(this, dVar, new C6620a.C1043a(bVar), false, 4, (Object) null);
    }

    public void b(d dVar, C6798l lVar) {
        C6496s.h(dVar, "kClass");
        C6496s.h(lVar, "provider");
        l(this, dVar, new C6620a.b(lVar), false, 4, (Object) null);
    }

    public void c(d dVar, d dVar2, C5978b bVar) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(dVar2, "actualClass");
        C6496s.h(bVar, "actualSerializer");
        j(this, dVar, dVar2, bVar, false, 8, (Object) null);
    }

    public void d(d dVar, C6798l lVar) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(lVar, "defaultSerializerProvider");
        h(dVar, lVar, false);
    }

    public void e(d dVar, C6798l lVar) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(lVar, "defaultDeserializerProvider");
        g(dVar, lVar, false);
    }

    public final C6624e f() {
        return new C6622c(this.f72428a, this.f72429b, this.f72430c, this.f72431d, this.f72432e);
    }

    public final void g(d dVar, C6798l lVar, boolean z10) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(lVar, "defaultDeserializerProvider");
        C6798l lVar2 = (C6798l) this.f72432e.get(dVar);
        if (lVar2 == null || C6496s.c(lVar2, lVar) || z10) {
            this.f72432e.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + dVar + " is already registered: " + lVar2);
    }

    public final void h(d dVar, C6798l lVar, boolean z10) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(lVar, "defaultSerializerProvider");
        C6798l lVar2 = (C6798l) this.f72430c.get(dVar);
        if (lVar2 == null || C6496s.c(lVar2, lVar) || z10) {
            this.f72430c.put(dVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + dVar + " is already registered: " + lVar2);
    }

    public final void i(d dVar, d dVar2, C5978b bVar, boolean z10) {
        Object obj;
        C6496s.h(dVar, "baseClass");
        C6496s.h(dVar2, "concreteClass");
        C6496s.h(bVar, "concreteSerializer");
        String i10 = bVar.getDescriptor().i();
        Map map = this.f72429b;
        Object obj2 = map.get(dVar);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(dVar, obj2);
        }
        Map map2 = (Map) obj2;
        C5978b bVar2 = (C5978b) map2.get(dVar2);
        Map map3 = this.f72431d;
        Object obj3 = map3.get(dVar);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(dVar, obj3);
        }
        Map map4 = (Map) obj3;
        if (z10) {
            if (bVar2 != null) {
                map4.remove(bVar2.getDescriptor().i());
            }
            map2.put(dVar2, bVar);
            map4.put(i10, bVar);
            return;
        }
        if (bVar2 != null) {
            if (C6496s.c(bVar2, bVar)) {
                map4.remove(bVar2.getDescriptor().i());
            } else {
                throw new C6623d(dVar, dVar2);
            }
        }
        C5978b bVar3 = (C5978b) map4.get(i10);
        if (bVar3 != null) {
            Object obj4 = this.f72429b.get(dVar);
            C6496s.e(obj4);
            Iterator it = O.C((Map) obj4).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Map.Entry) obj).getValue() == bVar3) {
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + dVar + "' have the same serial name '" + i10 + "': '" + dVar2 + "' and '" + ((Map.Entry) obj) + '\'');
        }
        map2.put(dVar2, bVar);
        map4.put(i10, bVar);
    }

    public final void k(d dVar, C6620a aVar, boolean z10) {
        C6620a aVar2;
        C6496s.h(dVar, "forClass");
        C6496s.h(aVar, "provider");
        if (z10 || (aVar2 = (C6620a) this.f72428a.get(dVar)) == null || C6496s.c(aVar2, aVar)) {
            this.f72428a.put(dVar, aVar);
            return;
        }
        throw new C6623d("Contextual serializer or serializer provider for " + dVar + " already registered in this module");
    }
}
