package Dg;

import Bg.C5328n;
import Bg.C5330p;
import Bg.C5336w;
import Bg.K;
import Bg.L;
import Bg.N;
import Bg.P;
import Bg.X;
import Ef.m;
import Eg.i;
import Eg.j;
import Fg.C5361b;
import Fg.C5366d0;
import Fg.S;
import Fg.v0;
import Of.A;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.C5495m;
import Of.C5502u;
import Of.C5503v;
import Of.E;
import Of.M;
import Of.Z;
import Of.f0;
import Of.g0;
import Of.h0;
import Of.k0;
import Of.q0;
import Of.r0;
import Of.t0;
import Pf.h;
import Rf.C5512a;
import Rf.C5520i;
import Rf.C5528q;
import Rf.C5529s;
import ig.c;
import ig.g;
import ig.k;
import ig.n;
import ig.q;
import ig.t;
import ig.w;
import ig.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.C6434a;
import kg.C6435b;
import kg.C6436c;
import kg.h;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.O;
import mf.Y;
import rg.C6683a;
import rg.C6690h;
import rg.C6695m;
import rg.C6697o;
import vg.C6755e;
import yf.C6798l;
import yg.C6805d;
import yg.C6812k;
import yg.C6813l;
import yg.C6815n;
import yg.C6818q;
import zg.C6835b;
import zg.C6840g;

/* renamed from: Dg.m  reason: case insensitive filesystem */
public final class C5352m extends C5512a implements C5495m {

    /* renamed from: f  reason: collision with root package name */
    private final ig.c f62724f;

    /* renamed from: g  reason: collision with root package name */
    private final C6434a f62725g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f62726h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final ng.b f62727i;

    /* renamed from: j  reason: collision with root package name */
    private final E f62728j;

    /* renamed from: k  reason: collision with root package name */
    private final C5502u f62729k;

    /* renamed from: l  reason: collision with root package name */
    private final C5488f f62730l;

    /* renamed from: m  reason: collision with root package name */
    private final C5330p f62731m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f62732n;

    /* renamed from: o  reason: collision with root package name */
    private final C6813l f62733o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final b f62734p;

    /* renamed from: q  reason: collision with root package name */
    private final f0 f62735q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final c f62736r;

    /* renamed from: s  reason: collision with root package name */
    private final C5495m f62737s;

    /* renamed from: t  reason: collision with root package name */
    private final j f62738t;

    /* renamed from: u  reason: collision with root package name */
    private final i f62739u;

    /* renamed from: v  reason: collision with root package name */
    private final j f62740v;

    /* renamed from: w  reason: collision with root package name */
    private final i f62741w;

    /* renamed from: x  reason: collision with root package name */
    private final j f62742x;

    /* renamed from: y  reason: collision with root package name */
    private final N.a f62743y;

    /* renamed from: z  reason: collision with root package name */
    private final h f62744z;

    /* renamed from: Dg.m$b */
    private final class b extends C5361b {

        /* renamed from: d  reason: collision with root package name */
        private final i f62750d;

        public b() {
            super(C5352m.this.d1().h());
            this.f62750d = C5352m.this.d1().h().g(new C5353n(C5352m.this));
        }

        /* access modifiers changed from: private */
        public static final List L(C5352m mVar) {
            return q0.g(mVar);
        }

        /* renamed from: K */
        public C5352m o() {
            return C5352m.this;
        }

        public List getParameters() {
            return (List) this.f62750d.invoke();
        }

        public boolean p() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection r() {
            String str;
            ng.c a10;
            M.b bVar;
            Iterable<q> o10 = kg.f.o(C5352m.this.e1(), C5352m.this.d1().j());
            C5352m mVar = C5352m.this;
            ArrayList arrayList = new ArrayList(C6565s.y(o10, 10));
            for (q u10 : o10) {
                arrayList.add(mVar.d1().i().u(u10));
            }
            Iterable<S> K02 = C6565s.K0(arrayList, C5352m.this.d1().c().c().b(C5352m.this));
            ArrayList<M.b> arrayList2 = new ArrayList<>();
            for (S N02 : K02) {
                C5490h o11 = N02.N0().o();
                if (o11 instanceof M.b) {
                    bVar = (M.b) o11;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                C5336w j10 = C5352m.this.d1().c().j();
                C5352m mVar2 = C5352m.this;
                ArrayList arrayList3 = new ArrayList(C6565s.y(arrayList2, 10));
                for (M.b bVar2 : arrayList2) {
                    ng.b n10 = C6755e.n(bVar2);
                    if (n10 == null || (a10 = n10.a()) == null || (str = a10.b()) == null) {
                        str = bVar2.getName().b();
                        C6496s.g(str, "asString(...)");
                    }
                    arrayList3.add(str);
                }
                j10.b(mVar2, arrayList3);
            }
            return C6565s.e1(K02);
        }

        public String toString() {
            String fVar = C5352m.this.getName().toString();
            C6496s.g(fVar, "toString(...)");
            return fVar;
        }

        /* access modifiers changed from: protected */
        public k0 v() {
            return k0.a.f64500a;
        }
    }

    /* renamed from: Dg.m$c */
    private final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Map f62752a;

        /* renamed from: b  reason: collision with root package name */
        private final Eg.h f62753b;

        /* renamed from: c  reason: collision with root package name */
        private final i f62754c;

        public c() {
            List D02 = C5352m.this.e1().D0();
            C6496s.g(D02, "getEnumEntryList(...)");
            Iterable iterable = D02;
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(L.b(C5352m.this.d1().g(), ((g) next).F()), next);
            }
            this.f62752a = linkedHashMap;
            this.f62753b = C5352m.this.d1().h().c(new C5354o(this, C5352m.this));
            this.f62754c = C5352m.this.d1().h().g(new C5355p(this));
        }

        private final Set e() {
            HashSet hashSet = new HashSet();
            for (S o10 : C5352m.this.l().l()) {
                for (C5495m mVar : C6815n.a.a(o10.o(), (C6805d) null, (C6798l) null, 3, (Object) null)) {
                    if ((mVar instanceof g0) || (mVar instanceof Z)) {
                        hashSet.add(((C5484b) mVar).getName());
                    }
                }
            }
            List<ig.i> I02 = C5352m.this.e1().I0();
            C6496s.g(I02, "getFunctionList(...)");
            C5352m mVar2 = C5352m.this;
            for (ig.i d02 : I02) {
                hashSet.add(L.b(mVar2.d1().g(), d02.d0()));
            }
            List<n> W02 = C5352m.this.e1().W0();
            C6496s.g(W02, "getPropertyList(...)");
            C5352m mVar3 = C5352m.this;
            for (n c02 : W02) {
                hashSet.add(L.b(mVar3.d1().g(), c02.c0()));
            }
            return Y.n(hashSet, hashSet);
        }

        /* access modifiers changed from: private */
        public static final C5487e f(c cVar, C5352m mVar, ng.f fVar) {
            C6496s.h(fVar, "name");
            g gVar = (g) cVar.f62752a.get(fVar);
            if (gVar == null) {
                return null;
            }
            return C5528q.L0(mVar.d1().h(), mVar, fVar, cVar.f62754c, new C5340a(mVar.d1().h(), new C5356q(mVar, gVar)), h0.f64497a);
        }

        /* access modifiers changed from: private */
        public static final List g(C5352m mVar, g gVar) {
            return C6565s.e1(mVar.d1().c().d().l(mVar.i1(), gVar));
        }

        /* access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection d() {
            ArrayList arrayList = new ArrayList();
            for (ng.f i10 : this.f62752a.keySet()) {
                C5487e i11 = i(i10);
                if (i11 != null) {
                    arrayList.add(i11);
                }
            }
            return arrayList;
        }

        public final C5487e i(ng.f fVar) {
            C6496s.h(fVar, "name");
            return (C5487e) this.f62753b.invoke(fVar);
        }
    }

    /* renamed from: Dg.m$d */
    /* synthetic */ class d extends C6493o implements C6798l {
        d(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "simpleType";
        }

        public final Ff.f getOwner() {
            return kotlin.jvm.internal.O.b(C6496s.a.class);
        }

        public final String getSignature() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        /* renamed from: i */
        public final C5366d0 invoke(q qVar) {
            C6496s.h(qVar, "p0");
            return X.q((X) this.receiver, qVar, false, 2, (Object) null);
        }
    }

    /* renamed from: Dg.m$e */
    /* synthetic */ class e extends C6493o implements C6798l {
        e(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "getValueClassPropertyType";
        }

        public final Ff.f getOwner() {
            return kotlin.jvm.internal.O.b(C5352m.class);
        }

        public final String getSignature() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }

        /* renamed from: i */
        public final C5366d0 invoke(ng.f fVar) {
            C6496s.h(fVar, "p0");
            return ((C5352m) this.receiver).j1(fVar);
        }
    }

    /* renamed from: Dg.m$f */
    /* synthetic */ class f extends C6493o implements C6798l {
        f(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "<init>";
        }

        public final Ff.f getOwner() {
            return kotlin.jvm.internal.O.b(a.class);
        }

        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        /* renamed from: i */
        public final a invoke(Gg.g gVar) {
            C6496s.h(gVar, "p0");
            return new a((C5352m) this.receiver, gVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5352m(C5330p pVar, ig.c cVar, C6436c cVar2, C6434a aVar, h0 h0Var) {
        super(pVar.h(), L.a(cVar2, cVar.F0()).h());
        C6813l lVar;
        c cVar3;
        C5352m mVar;
        h hVar;
        boolean z10;
        C6496s.h(pVar, "outerContext");
        C6496s.h(cVar, "classProto");
        C6496s.h(cVar2, "nameResolver");
        C6496s.h(aVar, "metadataVersion");
        C6496s.h(h0Var, "sourceElement");
        this.f62724f = cVar;
        this.f62725g = aVar;
        this.f62726h = h0Var;
        this.f62727i = L.a(cVar2, cVar.F0());
        Bg.O o10 = Bg.O.f62485a;
        this.f62728j = o10.b((k) C6435b.f71546e.d(cVar.E0()));
        this.f62729k = P.a(o10, (x) C6435b.f71545d.d(cVar.E0()));
        C5488f a10 = o10.a((c.C1017c) C6435b.f71547f.d(cVar.E0()));
        this.f62730l = a10;
        List h12 = cVar.h1();
        C6496s.g(h12, "getTypeParameterList(...)");
        t i12 = cVar.i1();
        C6496s.g(i12, "getTypeTable(...)");
        kg.g gVar = new kg.g(i12);
        h.a aVar2 = kg.h.f71575b;
        w k12 = cVar.k1();
        C6496s.g(k12, "getVersionRequirementTable(...)");
        C5330p a11 = pVar.a(this, h12, cVar2, gVar, aVar2.a(k12), aVar);
        this.f62731m = a11;
        Boolean f10 = C6435b.f71554m.d(cVar.E0());
        C6496s.g(f10, "get(...)");
        boolean booleanValue = f10.booleanValue();
        this.f62732n = booleanValue;
        C5488f fVar = C5488f.ENUM_CLASS;
        if (a10 == fVar) {
            if (booleanValue || C6496s.c(a11.c().i().a(), Boolean.TRUE)) {
                z10 = true;
            } else {
                z10 = false;
            }
            lVar = new C6818q(a11.h(), this, z10);
        } else {
            lVar = C6812k.b.f73949b;
        }
        this.f62733o = lVar;
        this.f62734p = new b();
        this.f62735q = f0.f64491e.a(this, a11.h(), a11.c().n().d(), new f(this));
        N.a aVar3 = null;
        if (a10 == fVar) {
            cVar3 = new c();
        } else {
            cVar3 = null;
        }
        this.f62736r = cVar3;
        C5495m e10 = pVar.e();
        this.f62737s = e10;
        this.f62738t = a11.h().d(new C5343d(this));
        this.f62739u = a11.h().g(new C5344e(this));
        this.f62740v = a11.h().d(new C5345f(this));
        this.f62741w = a11.h().g(new C5346g(this));
        this.f62742x = a11.h().d(new C5347h(this));
        C6436c g10 = a11.g();
        kg.g j10 = a11.j();
        if (e10 instanceof C5352m) {
            mVar = (C5352m) e10;
        } else {
            mVar = null;
        }
        this.f62743y = new N.a(cVar, g10, j10, h0Var, mVar != null ? mVar.f62743y : aVar3);
        if (!C6435b.f71544c.d(cVar.E0()).booleanValue()) {
            hVar = Pf.h.f64602L.b();
        } else {
            hVar = new T(a11.h(), new C5348i(this));
        }
        this.f62744z = hVar;
    }

    /* access modifiers changed from: private */
    public static final List U0(C5352m mVar) {
        return C6565s.e1(mVar.f62731m.c().d().c(mVar.f62743y));
    }

    /* access modifiers changed from: private */
    public static final C5487e V0(C5352m mVar) {
        return mVar.W0();
    }

    private final C5487e W0() {
        if (!this.f62724f.l1()) {
            return null;
        }
        C5490h e10 = f1().e(L.b(this.f62731m.g(), this.f62724f.r0()), Wf.d.FROM_DESERIALIZATION);
        if (e10 instanceof C5487e) {
            return (C5487e) e10;
        }
        return null;
    }

    private final Collection X0() {
        return C6565s.K0(C6565s.K0(Z0(), C6565s.r(E())), this.f62731m.c().c().e(this));
    }

    private final C5486d Y0() {
        Object obj;
        if (this.f62730l.b()) {
            C5520i l10 = C6690h.l(this, h0.f64497a);
            l10.g1(p());
            return l10;
        }
        List u02 = this.f62724f.u0();
        C6496s.g(u02, "getConstructorList(...)");
        Iterator it = u02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!C6435b.f71555n.d(((ig.d) obj).J()).booleanValue()) {
                break;
            }
        }
        ig.d dVar = (ig.d) obj;
        if (dVar != null) {
            return this.f62731m.f().r(dVar, true);
        }
        return null;
    }

    private final List Z0() {
        List u02 = this.f62724f.u0();
        C6496s.g(u02, "getConstructorList(...)");
        ArrayList<ig.d> arrayList = new ArrayList<>();
        for (Object next : u02) {
            Boolean f10 = C6435b.f71555n.d(((ig.d) next).J());
            C6496s.g(f10, "get(...)");
            if (f10.booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (ig.d dVar : arrayList) {
            K f11 = this.f62731m.f();
            C6496s.e(dVar);
            arrayList2.add(f11.r(dVar, false));
        }
        return arrayList2;
    }

    private final Collection a1() {
        if (this.f62728j != E.SEALED) {
            return C6565s.n();
        }
        List<Integer> X02 = this.f62724f.X0();
        C6496s.e(X02);
        if (X02.isEmpty()) {
            return C6683a.f73010a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : X02) {
            C5328n c10 = this.f62731m.c();
            C6436c g10 = this.f62731m.g();
            C6496s.e(num);
            C5487e b10 = c10.b(L.a(g10, num.intValue()));
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    private final r0 b1() {
        if (!isInline() && !t()) {
            return null;
        }
        r0 a10 = Bg.Z.a(this.f62724f, this.f62731m.g(), this.f62731m.j(), new d(this.f62731m.i()), new e(this));
        if (a10 != null) {
            return a10;
        }
        if (this.f62725g.c(1, 5, 1)) {
            return null;
        }
        C5486d E10 = E();
        if (E10 != null) {
            List k10 = E10.k();
            C6496s.g(k10, "getValueParameters(...)");
            ng.f name = ((t0) C6565s.o0(k10)).getName();
            C6496s.g(name, "getName(...)");
            C5366d0 j12 = j1(name);
            if (j12 != null) {
                return new A(name, j12);
            }
            throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
        }
        throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
    }

    /* access modifiers changed from: private */
    public static final Collection c1(C5352m mVar) {
        return mVar.X0();
    }

    private final a f1() {
        return (a) this.f62735q.c(this.f62731m.c().n().d());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: Of.Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: Of.Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: Of.Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: Of.Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: Of.Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: Of.Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: Of.Z} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r1 == false) goto L_0x0028;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Fg.C5366d0 j1(ng.f r6) {
        /*
            r5 = this;
            Dg.m$a r0 = r5.f1()
            Wf.d r1 = Wf.d.FROM_DESERIALIZATION
            java.util.Collection r6 = r0.b(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0013:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r6.next()
            r4 = r3
            Of.Z r4 = (Of.Z) r4
            Of.c0 r4 = r4.P()
            if (r4 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x002a
        L_0x0028:
            r2 = r0
            goto L_0x0030
        L_0x002a:
            r1 = 1
            r2 = r3
            goto L_0x0013
        L_0x002d:
            if (r1 != 0) goto L_0x0030
            goto L_0x0028
        L_0x0030:
            Of.Z r2 = (Of.Z) r2
            if (r2 == 0) goto L_0x0038
            Fg.S r0 = r2.getType()
        L_0x0038:
            Fg.d0 r0 = (Fg.C5366d0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Dg.C5352m.j1(ng.f):Fg.d0");
    }

    /* access modifiers changed from: private */
    public static final C5486d l1(C5352m mVar) {
        return mVar.Y0();
    }

    /* access modifiers changed from: private */
    public static final Collection m1(C5352m mVar) {
        return mVar.a1();
    }

    /* access modifiers changed from: private */
    public static final r0 n1(C5352m mVar) {
        return mVar.b1();
    }

    public boolean A() {
        Boolean f10 = C6435b.f71548g.d(this.f62724f.E0());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }

    public C5486d E() {
        return (C5486d) this.f62738t.invoke();
    }

    public boolean I0() {
        Boolean f10 = C6435b.f71549h.d(this.f62724f.E0());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }

    public r0 W() {
        return (r0) this.f62742x.invoke();
    }

    public boolean Z() {
        return false;
    }

    public List a0() {
        Iterable<q> b10 = kg.f.b(this.f62724f, this.f62731m.j());
        ArrayList arrayList = new ArrayList(C6565s.y(b10, 10));
        for (q u10 : b10) {
            arrayList.add(new Rf.N(J0(), new C6835b(this, this.f62731m.i().u(u10), (ng.f) null, (C6840g) null), Pf.h.f64602L.b()));
        }
        return arrayList;
    }

    public C5495m b() {
        return this.f62737s;
    }

    public boolean b0() {
        if (C6435b.f71547f.d(this.f62724f.E0()) == c.C1017c.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    public final C5330p d1() {
        return this.f62731m;
    }

    public final ig.c e1() {
        return this.f62724f;
    }

    public boolean f0() {
        Boolean f10 = C6435b.f71553l.d(this.f62724f.E0());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }

    public final C6434a g1() {
        return this.f62725g;
    }

    public Pf.h getAnnotations() {
        return this.f62744z;
    }

    public C5502u getVisibility() {
        return this.f62729k;
    }

    public C5488f h() {
        return this.f62730l;
    }

    /* renamed from: h1 */
    public C6813l n0() {
        return this.f62733o;
    }

    public h0 i() {
        return this.f62726h;
    }

    public final N.a i1() {
        return this.f62743y;
    }

    public boolean isExternal() {
        Boolean f10 = C6435b.f71550i.d(this.f62724f.E0());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }

    public boolean isInline() {
        if (!C6435b.f71552k.d(this.f62724f.E0()).booleanValue() || !this.f62725g.e(1, 4, 1)) {
            return false;
        }
        return true;
    }

    public Collection j() {
        return (Collection) this.f62739u.invoke();
    }

    public boolean k0() {
        Boolean f10 = C6435b.f71551j.d(this.f62724f.E0());
        C6496s.g(f10, "get(...)");
        return f10.booleanValue();
    }

    public final boolean k1(ng.f fVar) {
        C6496s.h(fVar, "name");
        return f1().t().contains(fVar);
    }

    public v0 l() {
        return this.f62734p;
    }

    /* access modifiers changed from: protected */
    public C6812k m0(Gg.g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return this.f62735q.c(gVar);
    }

    public C5487e o0() {
        return (C5487e) this.f62740v.invoke();
    }

    public List q() {
        return this.f62731m.i().m();
    }

    public E r() {
        return this.f62728j;
    }

    public boolean t() {
        if (!C6435b.f71552k.d(this.f62724f.E0()).booleanValue() || !this.f62725g.c(1, 4, 2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        if (k0()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    public Collection y() {
        return (Collection) this.f62741w.invoke();
    }

    /* renamed from: Dg.m$a */
    private final class a extends w {

        /* renamed from: g  reason: collision with root package name */
        private final Gg.g f62745g;

        /* renamed from: h  reason: collision with root package name */
        private final i f62746h;

        /* renamed from: i  reason: collision with root package name */
        private final i f62747i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5352m f62748j;

        /* renamed from: Dg.m$a$a  reason: collision with other inner class name */
        public static final class C0928a extends C6695m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f62749a;

            C0928a(List list) {
                this.f62749a = list;
            }

            public void a(C5484b bVar) {
                C6496s.h(bVar, "fakeOverride");
                C6697o.K(bVar, (C6798l) null);
                this.f62749a.add(bVar);
            }

            /* access modifiers changed from: protected */
            public void e(C5484b bVar, C5484b bVar2) {
                C6496s.h(bVar, "fromSuper");
                C6496s.h(bVar2, "fromCurrent");
                if (bVar2 instanceof C5529s) {
                    ((C5529s) bVar2).U0(C5503v.f64522a, bVar);
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(Dg.C5352m r8, Gg.g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.C6496s.h(r9, r0)
                r7.f62748j = r8
                Bg.p r2 = r8.d1()
                ig.c r0 = r8.e1()
                java.util.List r3 = r0.I0()
                java.lang.String r0 = "getFunctionList(...)"
                kotlin.jvm.internal.C6496s.g(r3, r0)
                ig.c r0 = r8.e1()
                java.util.List r4 = r0.W0()
                java.lang.String r0 = "getPropertyList(...)"
                kotlin.jvm.internal.C6496s.g(r4, r0)
                ig.c r0 = r8.e1()
                java.util.List r5 = r0.e1()
                java.lang.String r0 = "getTypeAliasList(...)"
                kotlin.jvm.internal.C6496s.g(r5, r0)
                ig.c r0 = r8.e1()
                java.util.List r0 = r0.T0()
                java.lang.String r1 = "getNestedClassNameList(...)"
                kotlin.jvm.internal.C6496s.g(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                Bg.p r8 = r8.d1()
                kg.c r8 = r8.g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = mf.C6565s.y(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x0058:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0070
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                ng.f r6 = Bg.L.b(r8, r6)
                r1.add(r6)
                goto L_0x0058
            L_0x0070:
                Dg.j r6 = new Dg.j
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f62745g = r9
                Bg.p r8 = r7.s()
                Eg.n r8 = r8.h()
                Dg.k r9 = new Dg.k
                r9.<init>(r7)
                Eg.i r8 = r8.g(r9)
                r7.f62746h = r8
                Bg.p r8 = r7.s()
                Eg.n r8 = r8.h()
                Dg.l r9 = new Dg.l
                r9.<init>(r7)
                Eg.i r8 = r8.g(r9)
                r7.f62747i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Dg.C5352m.a.<init>(Dg.m, Gg.g):void");
        }

        /* access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(C6805d.f73920o, C6812k.f73946a.c(), Wf.d.WHEN_GET_ALL_DESCRIPTORS);
        }

        private final void G(ng.f fVar, Collection collection, List list) {
            ng.f fVar2 = fVar;
            Collection collection2 = collection;
            s().c().n().a().v(fVar2, collection2, new ArrayList(list), H(), new C0928a(list));
        }

        private final C5352m H() {
            return this.f62748j;
        }

        /* access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f62745g.g(aVar.H());
        }

        /* access modifiers changed from: protected */
        public boolean A(g0 g0Var) {
            C6496s.h(g0Var, "function");
            return s().c().t().a(this.f62748j, g0Var);
        }

        public void I(ng.f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            Vf.a.a(s().c().p(), bVar, H(), fVar);
        }

        public Collection b(ng.f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            I(fVar, bVar);
            return super.b(fVar, bVar);
        }

        public Collection c(ng.f fVar, Wf.b bVar) {
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            I(fVar, bVar);
            return super.c(fVar, bVar);
        }

        public C5490h e(ng.f fVar, Wf.b bVar) {
            C5487e i10;
            C6496s.h(fVar, "name");
            C6496s.h(bVar, "location");
            I(fVar, bVar);
            c L02 = H().f62736r;
            if (L02 == null || (i10 = L02.i(fVar)) == null) {
                return super.e(fVar, bVar);
            }
            return i10;
        }

        public Collection f(C6805d dVar, C6798l lVar) {
            C6496s.h(dVar, "kindFilter");
            C6496s.h(lVar, "nameFilter");
            return (Collection) this.f62746h.invoke();
        }

        /* access modifiers changed from: protected */
        public void j(Collection collection, C6798l lVar) {
            Collection collection2;
            C6496s.h(collection, "result");
            C6496s.h(lVar, "nameFilter");
            c L02 = H().f62736r;
            if (L02 != null) {
                collection2 = L02.d();
            } else {
                collection2 = null;
            }
            if (collection2 == null) {
                collection2 = C6565s.n();
            }
            collection.addAll(collection2);
        }

        /* access modifiers changed from: protected */
        public void n(ng.f fVar, List list) {
            C6496s.h(fVar, "name");
            C6496s.h(list, "functions");
            ArrayList arrayList = new ArrayList();
            for (S o10 : (Collection) this.f62747i.invoke()) {
                arrayList.addAll(o10.o().c(fVar, Wf.d.FOR_ALREADY_TRACKED));
            }
            list.addAll(s().c().c().c(fVar, this.f62748j));
            G(fVar, arrayList, list);
        }

        /* access modifiers changed from: protected */
        public void o(ng.f fVar, List list) {
            C6496s.h(fVar, "name");
            C6496s.h(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (S o10 : (Collection) this.f62747i.invoke()) {
                arrayList.addAll(o10.o().b(fVar, Wf.d.FOR_ALREADY_TRACKED));
            }
            G(fVar, arrayList, list);
        }

        /* access modifiers changed from: protected */
        public ng.b p(ng.f fVar) {
            C6496s.h(fVar, "name");
            return this.f62748j.f62727i.d(fVar);
        }

        /* access modifiers changed from: protected */
        public Set v() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (S o10 : H().f62734p.l()) {
                Iterable g10 = o10.o().g();
                if (g10 == null) {
                    return null;
                }
                C6565s.D(linkedHashSet, g10);
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        public Set w() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (S o10 : H().f62734p.l()) {
                C6565s.D(linkedHashSet, o10.o().a());
            }
            linkedHashSet.addAll(s().c().c().d(this.f62748j));
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        public Set x() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (S o10 : H().f62734p.l()) {
                C6565s.D(linkedHashSet, o10.o().d());
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }
    }
}
