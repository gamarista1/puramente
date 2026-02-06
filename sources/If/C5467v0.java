package If;

import Bg.K;
import Ff.l;
import If.C5432d0;
import If.a1;
import Of.Z;
import Sg.p;
import Tf.f;
import Uf.C5553f;
import Wf.d;
import hg.C5996a;
import ig.n;
import ig.t;
import java.util.Collection;
import kg.e;
import kg.g;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6531o;
import lf.C6534r;
import lf.z;
import lg.C6536a;
import mf.C6565s;
import mg.C6577e;
import mg.C6578f;
import mg.C6581i;
import pg.C6647i;
import yg.C6812k;

/* renamed from: If.v0  reason: case insensitive filesystem */
public final class C5467v0 extends C5432d0 {

    /* renamed from: d  reason: collision with root package name */
    private final Class f63745d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f63746e = C6531o.a(C6534r.PUBLICATION, new C5456p0(this));

    /* renamed from: If.v0$a */
    private final class a extends C5432d0.b {

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ l[] f63747j;

        /* renamed from: d  reason: collision with root package name */
        private final a1.a f63748d;

        /* renamed from: e  reason: collision with root package name */
        private final a1.a f63749e = a1.c(new C5459r0(this));

        /* renamed from: f  reason: collision with root package name */
        private final Lazy f63750f;

        /* renamed from: g  reason: collision with root package name */
        private final Lazy f63751g;

        /* renamed from: h  reason: collision with root package name */
        private final a1.a f63752h;

        static {
            Class<a> cls = a.class;
            f63747j = new l[]{O.i(new F(O.b(cls), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), O.i(new F(O.b(cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), O.i(new F(O.b(cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public a() {
            super();
            this.f63748d = a1.c(new C5458q0(C5467v0.this));
            C6534r rVar = C6534r.PUBLICATION;
            this.f63750f = C6531o.a(rVar, new C5461s0(this, C5467v0.this));
            this.f63751g = C6531o.a(rVar, new C5463t0(this));
            this.f63752h = a1.c(new C5465u0(C5467v0.this, this));
        }

        private final f i() {
            return (f) this.f63748d.b(this, f63747j[0]);
        }

        /* access modifiers changed from: private */
        public static final f m(C5467v0 v0Var) {
            return f.f65155c.a(v0Var.f());
        }

        /* access modifiers changed from: private */
        public static final Collection n(C5467v0 v0Var, a aVar) {
            return v0Var.L(aVar.l(), C5432d0.d.DECLARED);
        }

        /* access modifiers changed from: private */
        public static final z o(a aVar) {
            C5996a e10;
            f i10 = aVar.i();
            if (i10 == null || (e10 = i10.e()) == null) {
                return null;
            }
            String[] a10 = e10.a();
            String[] g10 = e10.g();
            if (a10 == null || g10 == null) {
                return null;
            }
            Pair m10 = C6581i.m(a10, g10);
            return new z((C6578f) m10.a(), (ig.l) m10.b(), e10.d());
        }

        /* access modifiers changed from: private */
        public static final Class p(a aVar, C5467v0 v0Var) {
            String str;
            C5996a e10;
            f i10 = aVar.i();
            if (i10 == null || (e10 = i10.e()) == null) {
                str = null;
            } else {
                str = e10.e();
            }
            if (str == null || str.length() <= 0) {
                return null;
            }
            return v0Var.f().getClassLoader().loadClass(p.C(str, '/', '.', false, 4, (Object) null));
        }

        /* access modifiers changed from: private */
        public static final C6812k q(a aVar) {
            f i10 = aVar.i();
            if (i10 != null) {
                return aVar.b().c().a(i10);
            }
            return C6812k.b.f73949b;
        }

        public final z j() {
            return (z) this.f63751g.getValue();
        }

        public final Class k() {
            return (Class) this.f63750f.getValue();
        }

        public final C6812k l() {
            Object b10 = this.f63749e.b(this, f63747j[1]);
            C6496s.g(b10, "getValue(...)");
            return (C6812k) b10;
        }
    }

    /* renamed from: If.v0$b */
    /* synthetic */ class b extends C6493o implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f63754a = new b();

        b() {
            super(2);
        }

        public final String getName() {
            return "loadProperty";
        }

        public final Ff.f getOwner() {
            return O.b(K.class);
        }

        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        /* renamed from: i */
        public final Z invoke(K k10, n nVar) {
            C6496s.h(k10, "p0");
            C6496s.h(nVar, "p1");
            return k10.u(nVar);
        }
    }

    public C5467v0(Class cls) {
        C6496s.h(cls, "jClass");
        this.f63745d = cls;
    }

    /* access modifiers changed from: private */
    public static final a U(C5467v0 v0Var) {
        return new a();
    }

    private final C6812k V() {
        return ((a) this.f63746e.getValue()).l();
    }

    public Collection I() {
        return C6565s.n();
    }

    public Collection J(ng.f fVar) {
        C6496s.h(fVar, "name");
        return V().c(fVar, d.FROM_REFLECTION);
    }

    public Z K(int i10) {
        z j10 = ((a) this.f63746e.getValue()).j();
        if (j10 == null) {
            return null;
        }
        C6578f fVar = (C6578f) j10.a();
        ig.l lVar = (ig.l) j10.b();
        C6577e eVar = (C6577e) j10.c();
        C6647i.f fVar2 = C6536a.f71868n;
        C6496s.g(fVar2, "packageLocalVariable");
        n nVar = (n) e.b(lVar, fVar2, i10);
        if (nVar == null) {
            return null;
        }
        Class f10 = f();
        t V10 = lVar.V();
        C6496s.g(V10, "getTypeTable(...)");
        return (Z) j1.h(f10, nVar, fVar, new g(V10), eVar, b.f63754a);
    }

    /* access modifiers changed from: protected */
    public Class M() {
        Class k10 = ((a) this.f63746e.getValue()).k();
        if (k10 == null) {
            return f();
        }
        return k10;
    }

    public Collection N(ng.f fVar) {
        C6496s.h(fVar, "name");
        return V().b(fVar, d.FROM_REFLECTION);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5467v0) || !C6496s.c(f(), ((C5467v0) obj).f())) {
            return false;
        }
        return true;
    }

    public Class f() {
        return this.f63745d;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return "file class " + C5553f.e(f()).a();
    }
}
