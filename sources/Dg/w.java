package Dg;

import Bg.C5330p;
import Bg.L;
import Eg.g;
import Eg.h;
import Eg.i;
import Eg.j;
import Eg.m;
import Ff.l;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.Z;
import Of.g0;
import Of.l0;
import ig.n;
import ig.r;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6514M;
import mf.C6565s;
import mf.Y;
import ng.f;
import pg.C6639a;
import pg.p;
import rg.C6694l;
import yf.C6787a;
import yf.C6798l;
import yg.C6805d;
import yg.C6813l;

public abstract class w extends C6813l {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ l[] f62768f;

    /* renamed from: b  reason: collision with root package name */
    private final C5330p f62769b;

    /* renamed from: c  reason: collision with root package name */
    private final a f62770c;

    /* renamed from: d  reason: collision with root package name */
    private final i f62771d;

    /* renamed from: e  reason: collision with root package name */
    private final j f62772e;

    private interface a {
        Set a();

        Collection b(f fVar, Wf.b bVar);

        Collection c(f fVar, Wf.b bVar);

        Set d();

        Set e();

        l0 f(f fVar);

        void g(Collection collection, C6805d dVar, C6798l lVar, Wf.b bVar);
    }

    private final class b implements a {

        /* renamed from: o  reason: collision with root package name */
        static final /* synthetic */ l[] f62773o;

        /* renamed from: a  reason: collision with root package name */
        private final List f62774a;

        /* renamed from: b  reason: collision with root package name */
        private final List f62775b;

        /* renamed from: c  reason: collision with root package name */
        private final List f62776c;

        /* renamed from: d  reason: collision with root package name */
        private final i f62777d;

        /* renamed from: e  reason: collision with root package name */
        private final i f62778e;

        /* renamed from: f  reason: collision with root package name */
        private final i f62779f;

        /* renamed from: g  reason: collision with root package name */
        private final i f62780g;

        /* renamed from: h  reason: collision with root package name */
        private final i f62781h;

        /* renamed from: i  reason: collision with root package name */
        private final i f62782i;

        /* renamed from: j  reason: collision with root package name */
        private final i f62783j;

        /* renamed from: k  reason: collision with root package name */
        private final i f62784k;

        /* renamed from: l  reason: collision with root package name */
        private final i f62785l;

        /* renamed from: m  reason: collision with root package name */
        private final i f62786m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ w f62787n;

        static {
            Class<b> cls = b.class;
            f62773o = new l[]{O.i(new F(O.b(cls), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), O.i(new F(O.b(cls), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), O.i(new F(O.b(cls), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), O.i(new F(O.b(cls), "allFunctions", "getAllFunctions()Ljava/util/List;")), O.i(new F(O.b(cls), "allProperties", "getAllProperties()Ljava/util/List;")), O.i(new F(O.b(cls), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), O.i(new F(O.b(cls), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), O.i(new F(O.b(cls), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), O.i(new F(O.b(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), O.i(new F(O.b(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public b(w wVar, List list, List list2, List list3) {
            C6496s.h(list, "functionList");
            C6496s.h(list2, "propertyList");
            C6496s.h(list3, "typeAliasList");
            this.f62787n = wVar;
            this.f62774a = list;
            this.f62775b = list2;
            this.f62776c = !wVar.s().c().g().d() ? C6565s.n() : list3;
            this.f62777d = wVar.s().h().g(new x(this));
            this.f62778e = wVar.s().h().g(new y(this));
            this.f62779f = wVar.s().h().g(new z(this));
            this.f62780g = wVar.s().h().g(new A(this));
            this.f62781h = wVar.s().h().g(new B(this));
            this.f62782i = wVar.s().h().g(new C(this));
            this.f62783j = wVar.s().h().g(new D(this));
            this.f62784k = wVar.s().h().g(new E(this));
            this.f62785l = wVar.s().h().g(new F(this, wVar));
            this.f62786m = wVar.s().h().g(new G(this, wVar));
        }

        private final List A() {
            w wVar = this.f62787n;
            ArrayList arrayList = new ArrayList();
            for (p pVar : this.f62776c) {
                l0 z10 = wVar.s().f().z((r) pVar);
                if (z10 != null) {
                    arrayList.add(z10);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* access modifiers changed from: private */
        public static final Set D(b bVar, w wVar) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f62787n;
            for (p pVar : bVar.f62774a) {
                linkedHashSet.add(L.b(wVar2.s().g(), ((ig.i) pVar).d0()));
            }
            return Y.n(linkedHashSet, wVar.w());
        }

        /* access modifiers changed from: private */
        public static final Map E(b bVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : bVar.F()) {
                f name = ((g0) next).getName();
                C6496s.g(name, "getName(...)");
                Object obj = linkedHashMap.get(name);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(name, obj);
                }
                ((List) obj).add(next);
            }
            return linkedHashMap;
        }

        private final List F() {
            return (List) m.a(this.f62780g, this, f62773o[3]);
        }

        private final List G() {
            return (List) m.a(this.f62781h, this, f62773o[4]);
        }

        private final List H() {
            return (List) m.a(this.f62779f, this, f62773o[2]);
        }

        private final List I() {
            return (List) m.a(this.f62777d, this, f62773o[0]);
        }

        private final List J() {
            return (List) m.a(this.f62778e, this, f62773o[1]);
        }

        private final Map K() {
            return (Map) m.a(this.f62783j, this, f62773o[6]);
        }

        private final Map L() {
            return (Map) m.a(this.f62784k, this, f62773o[7]);
        }

        private final Map M() {
            return (Map) m.a(this.f62782i, this, f62773o[5]);
        }

        /* access modifiers changed from: private */
        public static final Map N(b bVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : bVar.G()) {
                f name = ((Z) next).getName();
                C6496s.g(name, "getName(...)");
                Object obj = linkedHashMap.get(name);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(name, obj);
                }
                ((List) obj).add(next);
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final Map O(b bVar) {
            Iterable H10 = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(Ef.m.d(mf.O.e(C6565s.y(H10, 10)), 16));
            for (Object next : H10) {
                f name = ((l0) next).getName();
                C6496s.g(name, "getName(...)");
                linkedHashMap.put(name, next);
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final Set P(b bVar, w wVar) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f62787n;
            for (p pVar : bVar.f62775b) {
                linkedHashSet.add(L.b(wVar2.s().g(), ((n) pVar).c0()));
            }
            return Y.n(linkedHashSet, wVar.x());
        }

        /* access modifiers changed from: private */
        public static final List r(b bVar) {
            return C6565s.K0(bVar.I(), bVar.u());
        }

        /* access modifiers changed from: private */
        public static final List s(b bVar) {
            return C6565s.K0(bVar.J(), bVar.v());
        }

        /* access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List u() {
            ArrayList arrayList = new ArrayList();
            for (f x10 : this.f62787n.w()) {
                C6565s.D(arrayList, x(x10));
            }
            return arrayList;
        }

        private final List v() {
            ArrayList arrayList = new ArrayList();
            for (f y10 : this.f62787n.x()) {
                C6565s.D(arrayList, y(y10));
            }
            return arrayList;
        }

        private final List w() {
            List<p> list = this.f62774a;
            w wVar = this.f62787n;
            ArrayList arrayList = new ArrayList();
            for (p pVar : list) {
                g0 s10 = wVar.s().f().s((ig.i) pVar);
                if (!wVar.A(s10)) {
                    s10 = null;
                }
                if (s10 != null) {
                    arrayList.add(s10);
                }
            }
            return arrayList;
        }

        private final List x(f fVar) {
            List I10 = I();
            w wVar = this.f62787n;
            ArrayList arrayList = new ArrayList();
            for (Object next : I10) {
                if (C6496s.c(((C5495m) next).getName(), fVar)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List y(f fVar) {
            List J10 = J();
            w wVar = this.f62787n;
            ArrayList arrayList = new ArrayList();
            for (Object next : J10) {
                if (C6496s.c(((C5495m) next).getName(), fVar)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List z() {
            w wVar = this.f62787n;
            ArrayList arrayList = new ArrayList();
            for (p pVar : this.f62775b) {
                Z u10 = wVar.s().f().u((n) pVar);
                if (u10 != null) {
                    arrayList.add(u10);
                }
            }
            return arrayList;
        }

        public Set a() {
            return (Set) m.a(this.f62785l, this, f62773o[8]);
        }

        public Collection b(f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            if (!d().contains(fVar)) {
                return C6565s.n();
            }
            Collection collection = (Collection) L().get(fVar);
            if (collection == null) {
                return C6565s.n();
            }
            return collection;
        }

        public Collection c(f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            if (!a().contains(fVar)) {
                return C6565s.n();
            }
            Collection collection = (Collection) K().get(fVar);
            if (collection == null) {
                return C6565s.n();
            }
            return collection;
        }

        public Set d() {
            return (Set) m.a(this.f62786m, this, f62773o[9]);
        }

        public Set e() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = this.f62787n;
            for (p pVar : this.f62776c) {
                linkedHashSet.add(L.b(wVar.s().g(), ((r) pVar).W()));
            }
            return linkedHashSet;
        }

        public l0 f(f fVar) {
            C6496s.h(fVar, "name");
            return (l0) M().get(fVar);
        }

        public void g(Collection collection, C6805d dVar, C6798l lVar, Wf.b bVar) {
            C6496s.h(collection, "result");
            C6496s.h(dVar, "kindFilter");
            C6496s.h(lVar, "nameFilter");
            C6496s.h(bVar, "location");
            if (dVar.a(C6805d.f73908c.i())) {
                for (Object next : G()) {
                    f name = ((Z) next).getName();
                    C6496s.g(name, "getName(...)");
                    if (((Boolean) lVar.invoke(name)).booleanValue()) {
                        collection.add(next);
                    }
                }
            }
            if (dVar.a(C6805d.f73908c.d())) {
                for (Object next2 : F()) {
                    f name2 = ((g0) next2).getName();
                    C6496s.g(name2, "getName(...)");
                    if (((Boolean) lVar.invoke(name2)).booleanValue()) {
                        collection.add(next2);
                    }
                }
            }
        }
    }

    private final class c implements a {

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ l[] f62788j;

        /* renamed from: a  reason: collision with root package name */
        private final Map f62789a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f62790b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f62791c;

        /* renamed from: d  reason: collision with root package name */
        private final g f62792d;

        /* renamed from: e  reason: collision with root package name */
        private final g f62793e;

        /* renamed from: f  reason: collision with root package name */
        private final h f62794f;

        /* renamed from: g  reason: collision with root package name */
        private final i f62795g;

        /* renamed from: h  reason: collision with root package name */
        private final i f62796h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ w f62797i;

        public static final class a implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ pg.r f62798a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f62799b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ w f62800c;

            public a(pg.r rVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f62798a = rVar;
                this.f62799b = byteArrayInputStream;
                this.f62800c = wVar;
            }

            /* renamed from: a */
            public final p invoke() {
                return (p) this.f62798a.a(this.f62799b, this.f62800c.s().c().k());
            }
        }

        static {
            Class<c> cls = c.class;
            f62788j = new l[]{O.i(new F(O.b(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), O.i(new F(O.b(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public c(w wVar, List list, List list2, List list3) {
            Map map;
            C6496s.h(list, "functionList");
            C6496s.h(list2, "propertyList");
            C6496s.h(list3, "typeAliasList");
            this.f62797i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : list) {
                f b10 = L.b(wVar.s().g(), ((ig.i) ((p) next)).d0());
                Object obj = linkedHashMap.get(b10);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(b10, obj);
                }
                ((List) obj).add(next);
            }
            this.f62789a = r(linkedHashMap);
            w wVar2 = this.f62797i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next2 : list2) {
                f b11 = L.b(wVar2.s().g(), ((n) ((p) next2)).c0());
                Object obj2 = linkedHashMap2.get(b11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(b11, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.f62790b = r(linkedHashMap2);
            if (this.f62797i.s().c().g().d()) {
                w wVar3 = this.f62797i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object next3 : list3) {
                    f b12 = L.b(wVar3.s().g(), ((r) ((p) next3)).W());
                    Object obj3 = linkedHashMap3.get(b12);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap3.put(b12, obj3);
                    }
                    ((List) obj3).add(next3);
                }
                map = r(linkedHashMap3);
            } else {
                map = mf.O.i();
            }
            this.f62791c = map;
            this.f62792d = this.f62797i.s().h().h(new H(this));
            this.f62793e = this.f62797i.s().h().h(new I(this));
            this.f62794f = this.f62797i.s().h().c(new J(this));
            this.f62795g = this.f62797i.s().h().g(new K(this, this.f62797i));
            this.f62796h = this.f62797i.s().h().g(new L(this, this.f62797i));
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.Collection m(ng.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f62789a
                pg.r r1 = ig.i.f68126w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C6496s.g(r1, r2)
                Dg.w r2 = r5.f62797i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002c
                Dg.w r3 = r5.f62797i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                Dg.w$c$a r0 = new Dg.w$c$a
                r0.<init>(r1, r4, r3)
                Rg.h r0 = Rg.k.i(r0)
                java.util.List r0 = Rg.k.G(r0)
                if (r0 == 0) goto L_0x002c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L_0x0032
            L_0x002c:
                java.util.List r0 = mf.C6565s.n()
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x0032:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L_0x0042:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x006b
                java.lang.Object r1 = r0.next()
                ig.i r1 = (ig.i) r1
                Bg.p r4 = r2.s()
                Bg.K r4 = r4.f()
                kotlin.jvm.internal.C6496s.e(r1)
                Of.g0 r1 = r4.s(r1)
                boolean r4 = r2.A(r1)
                if (r4 == 0) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r1 = 0
            L_0x0065:
                if (r1 == 0) goto L_0x0042
                r3.add(r1)
                goto L_0x0042
            L_0x006b:
                r2.n(r6, r3)
                java.util.List r6 = Pg.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Dg.w.c.m(ng.f):java.util.Collection");
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.Collection n(ng.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f62790b
                pg.r r1 = ig.n.f68208w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C6496s.g(r1, r2)
                Dg.w r2 = r5.f62797i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002c
                Dg.w r3 = r5.f62797i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                Dg.w$c$a r0 = new Dg.w$c$a
                r0.<init>(r1, r4, r3)
                Rg.h r0 = Rg.k.i(r0)
                java.util.List r0 = Rg.k.G(r0)
                if (r0 == 0) goto L_0x002c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L_0x0032
            L_0x002c:
                java.util.List r0 = mf.C6565s.n()
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x0032:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L_0x0042:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0063
                java.lang.Object r1 = r0.next()
                ig.n r1 = (ig.n) r1
                Bg.p r4 = r2.s()
                Bg.K r4 = r4.f()
                kotlin.jvm.internal.C6496s.e(r1)
                Of.Z r1 = r4.u(r1)
                if (r1 == 0) goto L_0x0042
                r3.add(r1)
                goto L_0x0042
            L_0x0063:
                r2.o(r6, r3)
                java.util.List r6 = Pg.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Dg.w.c.n(ng.f):java.util.Collection");
        }

        private final l0 o(f fVar) {
            r o02;
            byte[] bArr = (byte[]) this.f62791c.get(fVar);
            if (bArr == null || (o02 = r.o0(new ByteArrayInputStream(bArr), this.f62797i.s().c().k())) == null) {
                return null;
            }
            return this.f62797i.s().f().z(o02);
        }

        /* access modifiers changed from: private */
        public static final Set p(c cVar, w wVar) {
            return Y.n(cVar.f62789a.keySet(), wVar.w());
        }

        /* access modifiers changed from: private */
        public static final Collection q(c cVar, f fVar) {
            C6496s.h(fVar, "it");
            return cVar.m(fVar);
        }

        private final Map r(Map map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mf.O.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<C6639a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                for (C6639a i10 : iterable) {
                    i10.i(byteArrayOutputStream);
                    arrayList.add(C6514M.f71813a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* access modifiers changed from: private */
        public static final Collection s(c cVar, f fVar) {
            C6496s.h(fVar, "it");
            return cVar.n(fVar);
        }

        /* access modifiers changed from: private */
        public static final l0 t(c cVar, f fVar) {
            C6496s.h(fVar, "it");
            return cVar.o(fVar);
        }

        /* access modifiers changed from: private */
        public static final Set u(c cVar, w wVar) {
            return Y.n(cVar.f62790b.keySet(), wVar.x());
        }

        public Set a() {
            return (Set) m.a(this.f62795g, this, f62788j[0]);
        }

        public Collection b(f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            if (!d().contains(fVar)) {
                return C6565s.n();
            }
            return (Collection) this.f62793e.invoke(fVar);
        }

        public Collection c(f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            if (!a().contains(fVar)) {
                return C6565s.n();
            }
            return (Collection) this.f62792d.invoke(fVar);
        }

        public Set d() {
            return (Set) m.a(this.f62796h, this, f62788j[1]);
        }

        public Set e() {
            return this.f62791c.keySet();
        }

        public l0 f(f fVar) {
            C6496s.h(fVar, "name");
            return (l0) this.f62794f.invoke(fVar);
        }

        public void g(Collection collection, C6805d dVar, C6798l lVar, Wf.b bVar) {
            C6496s.h(collection, "result");
            C6496s.h(dVar, "kindFilter");
            C6496s.h(lVar, "nameFilter");
            C6496s.h(bVar, "location");
            if (dVar.a(C6805d.f73908c.i())) {
                ArrayList arrayList = new ArrayList();
                for (f fVar : d()) {
                    if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(b(fVar, bVar));
                    }
                }
                C6694l lVar2 = C6694l.f73031a;
                C6496s.g(lVar2, "INSTANCE");
                C6565s.C(arrayList, lVar2);
                collection.addAll(arrayList);
            }
            if (dVar.a(C6805d.f73908c.d())) {
                ArrayList arrayList2 = new ArrayList();
                for (f fVar2 : a()) {
                    if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(c(fVar2, bVar));
                    }
                }
                C6694l lVar3 = C6694l.f73031a;
                C6496s.g(lVar3, "INSTANCE");
                C6565s.C(arrayList2, lVar3);
                collection.addAll(arrayList2);
            }
        }
    }

    static {
        Class<w> cls = w.class;
        f62768f = new l[]{O.i(new F(O.b(cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), O.i(new F(O.b(cls), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    protected w(C5330p pVar, List list, List list2, List list3, C6787a aVar) {
        C6496s.h(pVar, "c");
        C6496s.h(list, "functionList");
        C6496s.h(list2, "propertyList");
        C6496s.h(list3, "typeAliasList");
        C6496s.h(aVar, "classNames");
        this.f62769b = pVar;
        this.f62770c = q(list, list2, list3);
        this.f62771d = pVar.h().g(new u(aVar));
        this.f62772e = pVar.h().d(new v(this));
    }

    /* access modifiers changed from: private */
    public static final Set k(C6787a aVar) {
        return C6565s.j1((Iterable) aVar.invoke());
    }

    /* access modifiers changed from: private */
    public static final Set l(w wVar) {
        Set v10 = wVar.v();
        if (v10 == null) {
            return null;
        }
        return Y.n(Y.n(wVar.t(), wVar.f62770c.e()), v10);
    }

    private final a q(List list, List list2, List list3) {
        if (this.f62769b.c().g().a()) {
            return new b(this, list, list2, list3);
        }
        return new c(this, list, list2, list3);
    }

    private final C5487e r(f fVar) {
        return this.f62769b.c().b(p(fVar));
    }

    private final Set u() {
        return (Set) m.b(this.f62772e, this, f62768f[1]);
    }

    private final l0 y(f fVar) {
        return this.f62770c.f(fVar);
    }

    /* access modifiers changed from: protected */
    public boolean A(g0 g0Var) {
        C6496s.h(g0Var, "function");
        return true;
    }

    public Set a() {
        return this.f62770c.a();
    }

    public Collection b(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return this.f62770c.b(fVar, bVar);
    }

    public Collection c(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return this.f62770c.c(fVar, bVar);
    }

    public Set d() {
        return this.f62770c.d();
    }

    public C5490h e(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        if (z(fVar)) {
            return r(fVar);
        }
        if (this.f62770c.e().contains(fVar)) {
            return y(fVar);
        }
        return null;
    }

    public Set g() {
        return u();
    }

    /* access modifiers changed from: protected */
    public abstract void j(Collection collection, C6798l lVar);

    /* access modifiers changed from: protected */
    public final Collection m(C6805d dVar, C6798l lVar, Wf.b bVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        C6496s.h(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        C6805d.a aVar = C6805d.f73908c;
        if (dVar.a(aVar.g())) {
            j(arrayList, lVar);
        }
        this.f62770c.g(arrayList, dVar, lVar, bVar);
        if (dVar.a(aVar.c())) {
            for (f fVar : t()) {
                if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                    Pg.a.a(arrayList, r(fVar));
                }
            }
        }
        if (dVar.a(C6805d.f73908c.h())) {
            for (f fVar2 : this.f62770c.e()) {
                if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                    Pg.a.a(arrayList, this.f62770c.f(fVar2));
                }
            }
        }
        return Pg.a.c(arrayList);
    }

    /* access modifiers changed from: protected */
    public void n(f fVar, List list) {
        C6496s.h(fVar, "name");
        C6496s.h(list, "functions");
    }

    /* access modifiers changed from: protected */
    public void o(f fVar, List list) {
        C6496s.h(fVar, "name");
        C6496s.h(list, "descriptors");
    }

    /* access modifiers changed from: protected */
    public abstract ng.b p(f fVar);

    /* access modifiers changed from: protected */
    public final C5330p s() {
        return this.f62769b;
    }

    public final Set t() {
        return (Set) m.a(this.f62771d, this, f62768f[0]);
    }

    /* access modifiers changed from: protected */
    public abstract Set v();

    /* access modifiers changed from: protected */
    public abstract Set w();

    /* access modifiers changed from: protected */
    public abstract Set x();

    /* access modifiers changed from: protected */
    public boolean z(f fVar) {
        C6496s.h(fVar, "name");
        return t().contains(fVar);
    }
}
