package bg;

import Eg.i;
import Eg.j;
import Eg.m;
import Ff.l;
import Fg.C5366d0;
import Fg.I0;
import Fg.N0;
import Fg.S;
import Fg.W;
import Nf.d;
import Of.C5487e;
import Of.C5506y;
import Of.H;
import Of.m0;
import Of.t0;
import Pf.e;
import Xf.I;
import Yf.a;
import Zf.g;
import ag.k;
import cg.C5799b;
import dg.C5815a;
import eg.C5824a;
import eg.C5825b;
import eg.C5826c;
import eg.C5828e;
import eg.C5830g;
import eg.C5831h;
import eg.C5836m;
import eg.o;
import eg.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6502A;
import mf.C6565s;
import ng.b;
import ng.c;
import ng.f;
import qg.n;
import tg.C6735a;
import tg.s;
import tg.u;
import vg.C6755e;

/* renamed from: bg.j  reason: case insensitive filesystem */
public final class C5769j implements g {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ l[] f67213i;

    /* renamed from: a  reason: collision with root package name */
    private final k f67214a;

    /* renamed from: b  reason: collision with root package name */
    private final C5824a f67215b;

    /* renamed from: c  reason: collision with root package name */
    private final j f67216c;

    /* renamed from: d  reason: collision with root package name */
    private final i f67217d;

    /* renamed from: e  reason: collision with root package name */
    private final C5815a f67218e;

    /* renamed from: f  reason: collision with root package name */
    private final i f67219f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f67220g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f67221h;

    static {
        Class<C5769j> cls = C5769j.class;
        f67213i = new l[]{O.i(new F(O.b(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), O.i(new F(O.b(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), O.i(new F(O.b(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C5769j(k kVar, C5824a aVar, boolean z10) {
        C6496s.h(kVar, "c");
        C6496s.h(aVar, "javaAnnotation");
        this.f67214a = kVar;
        this.f67215b = aVar;
        this.f67216c = kVar.e().d(new C5766g(this));
        this.f67217d = kVar.e().g(new C5767h(this));
        this.f67218e = kVar.a().t().a(aVar);
        this.f67219f = kVar.e().g(new C5768i(this));
        this.f67220g = aVar.e();
        this.f67221h = aVar.H() || z10;
    }

    /* access modifiers changed from: private */
    public static final Map g(C5769j jVar) {
        Pair pair;
        ArrayList arrayList = new ArrayList();
        for (C5825b bVar : jVar.f67215b.c()) {
            f name = bVar.getName();
            if (name == null) {
                name = I.f66264c;
            }
            tg.g n10 = jVar.n(bVar);
            if (n10 != null) {
                pair = C6502A.a(name, n10);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return mf.O.w(arrayList);
    }

    private final C5487e h(c cVar) {
        return C5506y.d(this.f67214a.d(), b.f72283d.c(cVar), this.f67214a.a().b().f().r());
    }

    /* access modifiers changed from: private */
    public static final c j(C5769j jVar) {
        b d10 = jVar.f67215b.d();
        if (d10 != null) {
            return d10.a();
        }
        return null;
    }

    private final tg.g n(C5825b bVar) {
        if (bVar instanceof o) {
            return tg.i.f(tg.i.f73558a, ((o) bVar).getValue(), (H) null, 2, (Object) null);
        }
        if (bVar instanceof C5836m) {
            C5836m mVar = (C5836m) bVar;
            return q(mVar.d(), mVar.e());
        } else if (bVar instanceof C5828e) {
            C5828e eVar = (C5828e) bVar;
            f name = eVar.getName();
            if (name == null) {
                name = I.f66264c;
            }
            C6496s.e(name);
            return p(name, eVar.c());
        } else if (bVar instanceof C5826c) {
            return o(((C5826c) bVar).a());
        } else {
            if (bVar instanceof C5831h) {
                return r(((C5831h) bVar).b());
            }
            return null;
        }
    }

    private final tg.g o(C5824a aVar) {
        return new C6735a(new C5769j(this.f67214a, aVar, false, 4, (DefaultConstructorMarker) null));
    }

    private final tg.g p(f fVar, List list) {
        S s10;
        if (W.a(getType())) {
            return null;
        }
        C5487e l10 = C6755e.l(this);
        C6496s.e(l10);
        t0 b10 = a.b(fVar, l10);
        if (b10 == null || (s10 = b10.getType()) == null) {
            s10 = this.f67214a.a().m().m().l(N0.INVARIANT, Hg.l.d(Hg.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            C6496s.g(s10, "getArrayType(...)");
        }
        Iterable<C5825b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C5825b n10 : iterable) {
            Object n11 = n(n10);
            if (n11 == null) {
                n11 = new u();
            }
            arrayList.add(n11);
        }
        return tg.i.f73558a.b(arrayList, s10);
    }

    private final tg.g q(b bVar, f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new tg.k(bVar, fVar);
    }

    private final tg.g r(x xVar) {
        return s.f73576b.a(this.f67214a.g().p(xVar, C5799b.b(I0.COMMON, false, false, (m0) null, 7, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C5366d0 s(C5769j jVar) {
        c f10 = jVar.f();
        if (f10 == null) {
            return Hg.l.d(Hg.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, jVar.f67215b.toString());
        }
        C5487e f11 = d.f(d.f64275a, f10, jVar.f67214a.d().m(), (Integer) null, 4, (Object) null);
        if (f11 == null) {
            C5830g a10 = jVar.f67215b.a();
            if (a10 != null) {
                f11 = jVar.f67214a.a().n().a(a10);
            } else {
                f11 = null;
            }
            if (f11 == null) {
                f11 = jVar.h(f10);
            }
        }
        return f11.p();
    }

    public Map a() {
        return (Map) m.a(this.f67219f, this, f67213i[2]);
    }

    public boolean e() {
        return this.f67220g;
    }

    public c f() {
        return (c) m.b(this.f67216c, this, f67213i[0]);
    }

    /* renamed from: k */
    public C5815a i() {
        return this.f67218e;
    }

    /* renamed from: l */
    public C5366d0 getType() {
        return (C5366d0) m.a(this.f67217d, this, f67213i[1]);
    }

    public final boolean m() {
        return this.f67221h;
    }

    public String toString() {
        return n.Q(n.f72699h, this, (e) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5769j(k kVar, C5824a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, aVar, (i10 & 4) != 0 ? false : z10);
    }
}
