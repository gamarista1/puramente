package If;

import Bg.K;
import Dg.C5352m;
import Eg.n;
import Ff.f;
import Ff.l;
import Fg.C5366d0;
import Fg.S;
import If.C5432d0;
import If.a1;
import Lf.e;
import Lf.i;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.C5494l;
import Of.C5495m;
import Of.C5506y;
import Of.E;
import Of.H;
import Of.Z;
import Of.h0;
import Of.m0;
import Rf.C5522k;
import Rf.C5527p;
import Sg.p;
import Tf.k;
import Uf.C5553f;
import hg.C5996a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import lg.C6536a;
import mf.C6559l;
import mf.C6565s;
import mf.Y;
import pg.C6647i;
import rg.C6691i;
import vg.C6755e;
import xf.C6781a;
import yf.C6798l;
import yg.C6805d;
import yg.C6807f;
import yg.C6812k;
import yg.C6815n;

public final class X extends C5432d0 implements Ff.d, Y, X0 {

    /* renamed from: d  reason: collision with root package name */
    private final Class f63618d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f63619e = C6531o.a(C6534r.PUBLICATION, new B(this));

    public final class a extends C5432d0.b {

        /* renamed from: w  reason: collision with root package name */
        static final /* synthetic */ l[] f63620w;

        /* renamed from: d  reason: collision with root package name */
        private final a1.a f63621d;

        /* renamed from: e  reason: collision with root package name */
        private final a1.a f63622e = a1.c(new N(this));

        /* renamed from: f  reason: collision with root package name */
        private final a1.a f63623f;

        /* renamed from: g  reason: collision with root package name */
        private final a1.a f63624g;

        /* renamed from: h  reason: collision with root package name */
        private final a1.a f63625h;

        /* renamed from: i  reason: collision with root package name */
        private final a1.a f63626i;

        /* renamed from: j  reason: collision with root package name */
        private final Lazy f63627j;

        /* renamed from: k  reason: collision with root package name */
        private final a1.a f63628k;

        /* renamed from: l  reason: collision with root package name */
        private final a1.a f63629l;

        /* renamed from: m  reason: collision with root package name */
        private final a1.a f63630m;

        /* renamed from: n  reason: collision with root package name */
        private final a1.a f63631n;

        /* renamed from: o  reason: collision with root package name */
        private final a1.a f63632o;

        /* renamed from: p  reason: collision with root package name */
        private final a1.a f63633p;

        /* renamed from: q  reason: collision with root package name */
        private final a1.a f63634q;

        /* renamed from: r  reason: collision with root package name */
        private final a1.a f63635r;

        /* renamed from: s  reason: collision with root package name */
        private final a1.a f63636s;

        /* renamed from: t  reason: collision with root package name */
        private final a1.a f63637t;

        /* renamed from: u  reason: collision with root package name */
        private final a1.a f63638u;

        static {
            Class<a> cls = a.class;
            f63620w = new l[]{O.i(new F(O.b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "annotations", "getAnnotations()Ljava/util/List;")), O.i(new F(O.b(cls), "simpleName", "getSimpleName()Ljava/lang/String;")), O.i(new F(O.b(cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), O.i(new F(O.b(cls), "constructors", "getConstructors()Ljava/util/Collection;")), O.i(new F(O.b(cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), O.i(new F(O.b(cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), O.i(new F(O.b(cls), "supertypes", "getSupertypes()Ljava/util/List;")), O.i(new F(O.b(cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), O.i(new F(O.b(cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), O.i(new F(O.b(cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public a() {
            super();
            this.f63621d = a1.c(new C(X.this));
            this.f63623f = a1.c(new O(X.this, this));
            this.f63624g = a1.c(new P(X.this));
            this.f63625h = a1.c(new Q(X.this));
            this.f63626i = a1.c(new S(this));
            this.f63627j = C6531o.a(C6534r.PUBLICATION, new T(this, X.this));
            this.f63628k = a1.c(new U(this, X.this));
            this.f63629l = a1.c(new V(this, X.this));
            this.f63630m = a1.c(new W(this));
            this.f63631n = a1.c(new D(X.this));
            this.f63632o = a1.c(new E(X.this));
            this.f63633p = a1.c(new F(X.this));
            this.f63634q = a1.c(new G(X.this));
            this.f63635r = a1.c(new H(this));
            this.f63636s = a1.c(new I(this));
            this.f63637t = a1.c(new J(this));
            this.f63638u = a1.c(new K(this));
        }

        /* access modifiers changed from: private */
        public static final List A(a aVar) {
            return j1.e(aVar.N());
        }

        private final String B(Class cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C6496s.e(simpleName);
                return p.S0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C6496s.e(simpleName);
                return p.S0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
            }
            C6496s.e(simpleName);
            return p.R0(simpleName, '$', (String) null, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final List C(X x10) {
            Iterable<C5494l> I10 = x10.I();
            ArrayList arrayList = new ArrayList(C6565s.y(I10, 10));
            for (C5494l i0Var : I10) {
                arrayList.add(new C5442i0(x10, i0Var));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final List D(a aVar) {
            return C6565s.K0(aVar.L(), aVar.M());
        }

        /* access modifiers changed from: private */
        public static final Collection E(X x10) {
            return x10.L(x10.c0(), C5432d0.d.DECLARED);
        }

        /* access modifiers changed from: private */
        public static final Collection F(X x10) {
            return x10.L(x10.d0(), C5432d0.d.DECLARED);
        }

        /* access modifiers changed from: private */
        public static final C5487e G(X x10) {
            C5487e eVar;
            ng.b U10 = x10.Z();
            k b10 = ((a) x10.a0().getValue()).b();
            H b11 = b10.b();
            if (!U10.i() || !x10.f().isAnnotationPresent(Metadata.class)) {
                eVar = C5506y.b(b11, U10);
            } else {
                eVar = b10.a().b(U10);
            }
            if (eVar == null) {
                return x10.X(U10, b10);
            }
            return eVar;
        }

        private final Collection M() {
            Object b10 = this.f63632o.b(this, f63620w[10]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        private final Collection O() {
            Object b10 = this.f63633p.b(this, f63620w[11]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        private final Collection P() {
            Object b10 = this.f63634q.b(this, f63620w[12]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        /* access modifiers changed from: private */
        public static final Collection T(X x10) {
            return x10.L(x10.c0(), C5432d0.d.INHERITED);
        }

        /* access modifiers changed from: private */
        public static final Collection U(X x10) {
            return x10.L(x10.d0(), C5432d0.d.INHERITED);
        }

        /* access modifiers changed from: private */
        public static final List V(a aVar) {
            C5487e eVar;
            Class cls;
            X x10;
            ArrayList<C5495m> arrayList = new ArrayList<>();
            for (Object next : C6815n.a.a(aVar.N().V(), (C6805d) null, (C6798l) null, 3, (Object) null)) {
                if (!C6691i.B((C5495m) next)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C5495m mVar : arrayList) {
                if (mVar instanceof C5487e) {
                    eVar = (C5487e) mVar;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    cls = j1.q(eVar);
                } else {
                    cls = null;
                }
                if (cls != null) {
                    x10 = new X(cls);
                } else {
                    x10 = null;
                }
                if (x10 != null) {
                    arrayList2.add(x10);
                }
            }
            return arrayList2;
        }

        /* access modifiers changed from: private */
        public static final Object W(a aVar, X x10) {
            Field field;
            C5487e N10 = aVar.N();
            if (N10.h() != C5488f.OBJECT) {
                return null;
            }
            if (!N10.b0() || e.a(Lf.d.f63868a, N10)) {
                field = x10.f().getDeclaredField("INSTANCE");
            } else {
                field = x10.f().getEnclosingClass().getDeclaredField(N10.getName().b());
            }
            Object obj = field.get((Object) null);
            C6496s.f(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
            return obj;
        }

        /* access modifiers changed from: private */
        public static final String X(X x10) {
            if (x10.f().isAnonymousClass()) {
                return null;
            }
            ng.b U10 = x10.Z();
            if (U10.i()) {
                return null;
            }
            return U10.a().b();
        }

        /* access modifiers changed from: private */
        public static final List Y(a aVar) {
            X x10;
            Collection<C5487e> y10 = aVar.N().y();
            C6496s.g(y10, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (C5487e eVar : y10) {
                C6496s.f(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class q10 = j1.q(eVar);
                if (q10 != null) {
                    x10 = new X(q10);
                } else {
                    x10 = null;
                }
                if (x10 != null) {
                    arrayList.add(x10);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final String Z(X x10, a aVar) {
            if (x10.f().isAnonymousClass()) {
                return null;
            }
            ng.b U10 = x10.Z();
            if (U10.i()) {
                return aVar.B(x10.f());
            }
            String b10 = U10.h().b();
            C6496s.g(b10, "asString(...)");
            return b10;
        }

        /* access modifiers changed from: private */
        public static final List a0(a aVar, X x10) {
            Collection<S> l10 = aVar.N().l().l();
            C6496s.g(l10, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(l10.size());
            for (S s10 : l10) {
                C6496s.e(s10);
                arrayList.add(new U0(s10, new L(s10, aVar, x10)));
            }
            if (!i.u0(aVar.N())) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C5488f h10 = C6691i.e(((U0) it.next()).A()).h();
                        C6496s.g(h10, "getKind(...)");
                        if (h10 != C5488f.INTERFACE && h10 != C5488f.ANNOTATION_CLASS) {
                            break;
                        }
                    }
                }
                C5366d0 i10 = C6755e.m(aVar.N()).i();
                C6496s.g(i10, "getAnyType(...)");
                arrayList.add(new U0(i10, M.f63582a));
            }
            return Pg.a.c(arrayList);
        }

        /* access modifiers changed from: private */
        public static final Type b0(S s10, a aVar, X x10) {
            C5490h o10 = s10.N0().o();
            if (o10 instanceof C5487e) {
                Class q10 = j1.q((C5487e) o10);
                if (q10 == null) {
                    throw new Y0("Unsupported superclass of " + aVar + ": " + o10);
                } else if (C6496s.c(x10.f().getSuperclass(), q10)) {
                    Type genericSuperclass = x10.f().getGenericSuperclass();
                    C6496s.e(genericSuperclass);
                    return genericSuperclass;
                } else {
                    Class[] interfaces = x10.f().getInterfaces();
                    C6496s.g(interfaces, "getInterfaces(...)");
                    int q02 = C6559l.q0(interfaces, q10);
                    if (q02 >= 0) {
                        Type type = x10.f().getGenericInterfaces()[q02];
                        C6496s.e(type);
                        return type;
                    }
                    throw new Y0("No superclass of " + aVar + " in Java reflection for " + o10);
                }
            } else {
                throw new Y0("Supertype not a class: " + o10);
            }
        }

        /* access modifiers changed from: private */
        public static final Type c0() {
            return Object.class;
        }

        /* access modifiers changed from: private */
        public static final List d0(a aVar, X x10) {
            List q10 = aVar.N().q();
            C6496s.g(q10, "getDeclaredTypeParameters(...)");
            Iterable<m0> iterable = q10;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (m0 m0Var : iterable) {
                C6496s.e(m0Var);
                arrayList.add(new W0(x10, m0Var));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final List x(a aVar) {
            return C6565s.K0(aVar.H(), aVar.I());
        }

        /* access modifiers changed from: private */
        public static final List y(a aVar) {
            return C6565s.K0(aVar.L(), aVar.O());
        }

        /* access modifiers changed from: private */
        public static final List z(a aVar) {
            return C6565s.K0(aVar.M(), aVar.P());
        }

        public final Collection H() {
            Object b10 = this.f63635r.b(this, f63620w[13]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection I() {
            Object b10 = this.f63636s.b(this, f63620w[14]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final List J() {
            Object b10 = this.f63622e.b(this, f63620w[1]);
            C6496s.g(b10, "getValue(...)");
            return (List) b10;
        }

        public final Collection K() {
            Object b10 = this.f63625h.b(this, f63620w[4]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection L() {
            Object b10 = this.f63631n.b(this, f63620w[9]);
            C6496s.g(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final C5487e N() {
            Object b10 = this.f63621d.b(this, f63620w[0]);
            C6496s.g(b10, "getValue(...)");
            return (C5487e) b10;
        }

        public final String Q() {
            return (String) this.f63624g.b(this, f63620w[3]);
        }

        public final String R() {
            return (String) this.f63623f.b(this, f63620w[2]);
        }

        public final List S() {
            Object b10 = this.f63629l.b(this, f63620w[7]);
            C6496s.g(b10, "getValue(...)");
            return (List) b10;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63640a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                hg.a$a[] r0 = hg.C5996a.C1007a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hg.a$a r1 = hg.C5996a.C1007a.FILE_FACADE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                hg.a$a r1 = hg.C5996a.C1007a.MULTIFILE_CLASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                hg.a$a r1 = hg.C5996a.C1007a.MULTIFILE_CLASS_PART     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                hg.a$a r1 = hg.C5996a.C1007a.SYNTHETIC_CLASS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                hg.a$a r1 = hg.C5996a.C1007a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                hg.a$a r1 = hg.C5996a.C1007a.CLASS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f63640a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: If.X.b.<clinit>():void");
        }
    }

    public static final class c extends C6807f {
        c(C5522k kVar, n nVar) {
            super(nVar, kVar);
        }

        /* access modifiers changed from: protected */
        public List j() {
            return C6565s.n();
        }
    }

    /* synthetic */ class d extends C6493o implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63641a = new d();

        d() {
            super(2);
        }

        public final String getName() {
            return "loadProperty";
        }

        public final f getOwner() {
            return O.b(K.class);
        }

        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        /* renamed from: i */
        public final Z invoke(K k10, ig.n nVar) {
            C6496s.h(k10, "p0");
            C6496s.h(nVar, "p1");
            return k10.u(nVar);
        }
    }

    public X(Class cls) {
        C6496s.h(cls, "jClass");
        this.f63618d = cls;
    }

    private final C5487e W(ng.b bVar, k kVar) {
        C5522k kVar2 = new C5522k(new C5527p(kVar.b(), bVar.f()), bVar.h(), E.FINAL, C5488f.CLASS, C6565s.e(kVar.b().m().h().p()), h0.f64497a, false, kVar.a().u());
        kVar2.K0(new c(kVar2, kVar.a().u()), Y.e(), (C5486d) null);
        return kVar2;
    }

    /* access modifiers changed from: private */
    public final C5487e X(ng.b bVar, k kVar) {
        C5996a.C1007a aVar;
        int i10;
        C5996a e10;
        if (f().isSynthetic()) {
            return W(bVar, kVar);
        }
        Tf.f a10 = Tf.f.f65155c.a(f());
        if (a10 == null || (e10 = a10.e()) == null) {
            aVar = null;
        } else {
            aVar = e10.c();
        }
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = b.f63640a[aVar.ordinal()];
        }
        switch (i10) {
            case -1:
            case 6:
                throw new Y0("Unresolved class: " + f() + " (kind = " + aVar + ')');
            case 1:
            case 2:
            case 3:
            case 4:
                return W(bVar, kVar);
            case 5:
                throw new Y0("Unknown class: " + f() + " (kind = " + aVar + ')');
            default:
                throw new C6535s();
        }
    }

    /* access modifiers changed from: private */
    public static final a Y(X x10) {
        return new a();
    }

    /* access modifiers changed from: private */
    public final ng.b Z() {
        return f1.f63674a.c(f());
    }

    public Collection I() {
        C5487e b02 = getDescriptor();
        if (b02.h() == C5488f.INTERFACE || b02.h() == C5488f.OBJECT) {
            return C6565s.n();
        }
        Collection j10 = b02.j();
        C6496s.g(j10, "getConstructors(...)");
        return j10;
    }

    public Collection J(ng.f fVar) {
        C6496s.h(fVar, "name");
        C6812k c02 = c0();
        Wf.d dVar = Wf.d.FROM_REFLECTION;
        return C6565s.K0(c02.c(fVar, dVar), d0().c(fVar, dVar));
    }

    public Z K(int i10) {
        C5352m mVar;
        Class<?> declaringClass;
        if (!C6496s.c(f().getSimpleName(), "DefaultImpls") || (declaringClass = f().getDeclaringClass()) == null || !declaringClass.isInterface()) {
            C5487e b02 = getDescriptor();
            if (b02 instanceof C5352m) {
                mVar = (C5352m) b02;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                return null;
            }
            ig.c e12 = mVar.e1();
            C6647i.f fVar = C6536a.f71864j;
            C6496s.g(fVar, "classLocalVariable");
            ig.n nVar = (ig.n) kg.e.b(e12, fVar, i10);
            if (nVar != null) {
                return (Z) j1.h(f(), nVar, mVar.d1().g(), mVar.d1().j(), mVar.g1(), d.f63641a);
            }
            return null;
        }
        Ff.d e10 = C6781a.e(declaringClass);
        C6496s.f(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        return ((X) e10).K(i10);
    }

    public Collection N(ng.f fVar) {
        C6496s.h(fVar, "name");
        C6812k c02 = c0();
        Wf.d dVar = Wf.d.FROM_REFLECTION;
        return C6565s.K0(c02.b(fVar, dVar), d0().b(fVar, dVar));
    }

    public final Lazy a0() {
        return this.f63619e;
    }

    /* renamed from: b0 */
    public C5487e getDescriptor() {
        return ((a) this.f63619e.getValue()).N();
    }

    public final C6812k c0() {
        return getDescriptor().p().o();
    }

    public final C6812k d0() {
        C6812k n02 = getDescriptor().n0();
        C6496s.g(n02, "getStaticScope(...)");
        return n02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X) || !C6496s.c(C6781a.c(this), C6781a.c((Ff.d) obj))) {
            return false;
        }
        return true;
    }

    public Class f() {
        return this.f63618d;
    }

    public List getAnnotations() {
        return ((a) this.f63619e.getValue()).J();
    }

    public int hashCode() {
        return C6781a.c(this).hashCode();
    }

    public Collection j() {
        return ((a) this.f63619e.getValue()).K();
    }

    public List l() {
        return ((a) this.f63619e.getValue()).S();
    }

    public boolean t() {
        return getDescriptor().t();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        ng.b Z10 = Z();
        ng.c f10 = Z10.f();
        if (f10.d()) {
            str = "";
        } else {
            str = f10.b() + '.';
        }
        String b10 = Z10.g().b();
        C6496s.g(b10, "asString(...)");
        sb2.append(str + p.C(b10, '.', '$', false, 4, (Object) null));
        return sb2.toString();
    }

    public boolean u(Object obj) {
        Integer g10 = C5553f.g(f());
        if (g10 != null) {
            return V.m(obj, g10.intValue());
        }
        Class k10 = C5553f.k(f());
        if (k10 == null) {
            k10 = f();
        }
        return k10.isInstance(obj);
    }

    public String v() {
        return ((a) this.f63619e.getValue()).Q();
    }

    public String w() {
        return ((a) this.f63619e.getValue()).R();
    }
}
