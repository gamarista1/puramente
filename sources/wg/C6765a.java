package wg;

import Of.C5487e;
import Rf.K;
import ag.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;

/* renamed from: wg.a  reason: case insensitive filesystem */
public final class C6765a implements C6770f {

    /* renamed from: b  reason: collision with root package name */
    private final List f73746b;

    public C6765a(List list) {
        C6496s.h(list, "inner");
        this.f73746b = list;
    }

    public void a(C5487e eVar, List list, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(list, "result");
        C6496s.h(kVar, "c");
        for (C6770f a10 : this.f73746b) {
            a10.a(eVar, list, kVar);
        }
    }

    public List b(C5487e eVar, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(kVar, "c");
        ArrayList arrayList = new ArrayList();
        for (C6770f b10 : this.f73746b) {
            C6565s.D(arrayList, b10.b(eVar, kVar));
        }
        return arrayList;
    }

    public void c(C5487e eVar, f fVar, List list, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(fVar, "name");
        C6496s.h(list, "result");
        C6496s.h(kVar, "c");
        for (C6770f c10 : this.f73746b) {
            c10.c(eVar, fVar, list, kVar);
        }
    }

    public List d(C5487e eVar, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(kVar, "c");
        ArrayList arrayList = new ArrayList();
        for (C6770f d10 : this.f73746b) {
            C6565s.D(arrayList, d10.d(eVar, kVar));
        }
        return arrayList;
    }

    public K e(C5487e eVar, K k10, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(k10, "propertyDescriptor");
        C6496s.h(kVar, "c");
        for (C6770f e10 : this.f73746b) {
            k10 = e10.e(eVar, k10, kVar);
        }
        return k10;
    }

    public void f(C5487e eVar, f fVar, Collection collection, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(fVar, "name");
        C6496s.h(collection, "result");
        C6496s.h(kVar, "c");
        for (C6770f f10 : this.f73746b) {
            f10.f(eVar, fVar, collection, kVar);
        }
    }

    public List g(C5487e eVar, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(kVar, "c");
        ArrayList arrayList = new ArrayList();
        for (C6770f g10 : this.f73746b) {
            C6565s.D(arrayList, g10.g(eVar, kVar));
        }
        return arrayList;
    }

    public void h(C5487e eVar, f fVar, Collection collection, k kVar) {
        C6496s.h(eVar, "thisDescriptor");
        C6496s.h(fVar, "name");
        C6496s.h(collection, "result");
        C6496s.h(kVar, "c");
        for (C6770f h10 : this.f73746b) {
            h10.h(eVar, fVar, collection, kVar);
        }
    }
}
