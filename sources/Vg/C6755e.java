package vg;

import Fg.S;
import Gg.g;
import Lf.i;
import Of.A;
import Of.C5484b;
import Of.C5487e;
import Of.C5490h;
import Of.C5491i;
import Of.C5495m;
import Of.H;
import Of.I;
import Of.Y;
import Of.Z;
import Of.t0;
import Pg.b;
import Rg.h;
import Rg.k;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.c;
import ng.d;
import ng.f;
import rg.C6691i;
import yf.C6798l;
import yg.C6812k;

/* renamed from: vg.e  reason: case insensitive filesystem */
public abstract class C6755e {

    /* renamed from: a  reason: collision with root package name */
    private static final f f73679a;

    /* renamed from: vg.e$a */
    /* synthetic */ class a extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73680a = new a();

        a() {
            super(1);
        }

        public final String getName() {
            return "declaresDefaultValue";
        }

        public final Ff.f getOwner() {
            return O.b(t0.class);
        }

        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        /* renamed from: i */
        public final Boolean invoke(t0 t0Var) {
            C6496s.h(t0Var, "p0");
            return Boolean.valueOf(t0Var.A0());
        }
    }

    /* renamed from: vg.e$b */
    public static final class b extends b.C0948b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f73681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f73682b;

        b(N n10, C6798l lVar) {
            this.f73681a = n10;
            this.f73682b = lVar;
        }

        /* renamed from: d */
        public void b(C5484b bVar) {
            C6496s.h(bVar, "current");
            if (this.f73681a.f71759a == null && ((Boolean) this.f73682b.invoke(bVar)).booleanValue()) {
                this.f73681a.f71759a = bVar;
            }
        }

        /* renamed from: e */
        public boolean c(C5484b bVar) {
            C6496s.h(bVar, "current");
            if (this.f73681a.f71759a == null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public C5484b a() {
            return (C5484b) this.f73681a.f71759a;
        }
    }

    static {
        f i10 = f.i("value");
        C6496s.g(i10, "identifier(...)");
        f73679a = i10;
    }

    /* access modifiers changed from: private */
    public static final h A(boolean z10, C5484b bVar) {
        C6496s.e(bVar);
        return z(bVar, z10);
    }

    public static final C5487e B(H h10, c cVar, Wf.b bVar) {
        C6496s.h(h10, "<this>");
        C6496s.h(cVar, "topLevelClassFqName");
        C6496s.h(bVar, "location");
        cVar.d();
        c e10 = cVar.e();
        C6496s.g(e10, "parent(...)");
        C6812k o10 = h10.l0(e10).o();
        f g10 = cVar.g();
        C6496s.g(g10, "shortName(...)");
        C5490h e11 = o10.e(g10, bVar);
        if (e11 instanceof C5487e) {
            return (C5487e) e11;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C5495m a(C5495m mVar) {
        C6496s.h(mVar, "it");
        return mVar.b();
    }

    public static final boolean f(t0 t0Var) {
        C6496s.h(t0Var, "<this>");
        Boolean e10 = Pg.b.e(C6565s.e(t0Var), C6751a.f73675a, a.f73680a);
        C6496s.g(e10, "ifAny(...)");
        return e10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Iterable g(t0 t0Var) {
        Iterable<t0> e10 = t0Var.e();
        ArrayList arrayList = new ArrayList(C6565s.y(e10, 10));
        for (t0 a10 : e10) {
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    public static final C5484b h(C5484b bVar, boolean z10, C6798l lVar) {
        C6496s.h(bVar, "<this>");
        C6496s.h(lVar, "predicate");
        return (C5484b) Pg.b.b(C6565s.e(bVar), new C6753c(z10), new b(new N(), lVar));
    }

    public static /* synthetic */ C5484b i(C5484b bVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(bVar, z10, lVar);
    }

    /* access modifiers changed from: private */
    public static final Iterable j(boolean z10, C5484b bVar) {
        Iterable n10;
        if (z10) {
            if (bVar != null) {
                bVar = bVar.a();
            } else {
                bVar = null;
            }
        }
        if (bVar == null || (n10 = bVar.e()) == null) {
            n10 = C6565s.n();
        }
        return n10;
    }

    public static final c k(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        d p10 = p(mVar);
        if (!p10.f()) {
            p10 = null;
        }
        if (p10 != null) {
            return p10.l();
        }
        return null;
    }

    public static final C5487e l(Pf.c cVar) {
        C6496s.h(cVar, "<this>");
        C5490h o10 = cVar.getType().N0().o();
        if (o10 instanceof C5487e) {
            return (C5487e) o10;
        }
        return null;
    }

    public static final i m(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        return s(mVar).m();
    }

    public static final ng.b n(C5490h hVar) {
        C5495m b10;
        ng.b n10;
        if (hVar == null || (b10 = hVar.b()) == null) {
            return null;
        }
        if (b10 instanceof Of.N) {
            c f10 = ((Of.N) b10).f();
            f name = hVar.getName();
            C6496s.g(name, "getName(...)");
            return new ng.b(f10, name);
        } else if (!(b10 instanceof C5491i) || (n10 = n((C5490h) b10)) == null) {
            return null;
        } else {
            f name2 = hVar.getName();
            C6496s.g(name2, "getName(...)");
            return n10.d(name2);
        }
    }

    public static final c o(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        c n10 = C6691i.n(mVar);
        C6496s.g(n10, "getFqNameSafe(...)");
        return n10;
    }

    public static final d p(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        d m10 = C6691i.m(mVar);
        C6496s.g(m10, "getFqName(...)");
        return m10;
    }

    public static final A q(C5487e eVar) {
        Object obj;
        if (eVar != null) {
            obj = eVar.W();
        } else {
            obj = null;
        }
        if (obj instanceof A) {
            return (A) obj;
        }
        return null;
    }

    public static final g r(H h10) {
        C6496s.h(h10, "<this>");
        android.support.v4.media.session.c.a(h10.C0(Gg.h.a()));
        return g.a.f63180a;
    }

    public static final H s(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        H g10 = C6691i.g(mVar);
        C6496s.g(g10, "getContainingModule(...)");
        return g10;
    }

    public static final I t(C5487e eVar) {
        Object obj;
        if (eVar != null) {
            obj = eVar.W();
        } else {
            obj = null;
        }
        if (obj instanceof I) {
            return (I) obj;
        }
        return null;
    }

    public static final h u(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        return k.n(v(mVar), 1);
    }

    public static final h v(C5495m mVar) {
        C6496s.h(mVar, "<this>");
        return k.h(mVar, C6752b.f73676a);
    }

    public static final C5484b w(C5484b bVar) {
        C6496s.h(bVar, "<this>");
        if (!(bVar instanceof Y)) {
            return bVar;
        }
        Z X10 = ((Y) bVar).X();
        C6496s.g(X10, "getCorrespondingProperty(...)");
        return X10;
    }

    public static final C5487e x(C5487e eVar) {
        C6496s.h(eVar, "<this>");
        for (S s10 : eVar.p().N0().l()) {
            if (!i.b0(s10)) {
                C5490h o10 = s10.N0().o();
                if (C6691i.w(o10)) {
                    C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (C5487e) o10;
                }
            }
        }
        return null;
    }

    public static final boolean y(H h10) {
        C6496s.h(h10, "<this>");
        android.support.v4.media.session.c.a(h10.C0(Gg.h.a()));
        return false;
    }

    public static final h z(C5484b bVar, boolean z10) {
        C6496s.h(bVar, "<this>");
        if (z10) {
            bVar = bVar.a();
        }
        h j10 = k.j(bVar);
        Collection e10 = bVar.e();
        C6496s.g(e10, "getOverriddenDescriptors(...)");
        return k.A(j10, k.s(C6565s.b0(e10), new C6754d(z10)));
    }
}
