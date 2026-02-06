package Fg;

import Eg.i;
import Eg.n;
import Gg.g;
import Gg.h;
import Hg.l;
import Of.C5490h;
import Of.k0;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;

/* renamed from: Fg.p  reason: case insensitive filesystem */
public abstract class C5389p extends C5394v {

    /* renamed from: b  reason: collision with root package name */
    private final i f63039b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63040c;

    /* renamed from: Fg.p$a */
    private final class a implements v0 {

        /* renamed from: a  reason: collision with root package name */
        private final g f63041a;

        /* renamed from: b  reason: collision with root package name */
        private final Lazy f63042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5389p f63043c;

        public a(C5389p pVar, g gVar) {
            C6496s.h(gVar, "kotlinTypeRefiner");
            this.f63043c = pVar;
            this.f63041a = gVar;
            this.f63042b = C6531o.a(C6534r.PUBLICATION, new C5387o(this, pVar));
        }

        private final List c() {
            return (List) this.f63042b.getValue();
        }

        /* access modifiers changed from: private */
        public static final List e(a aVar, C5389p pVar) {
            return h.b(aVar.f63041a, pVar.l());
        }

        /* renamed from: d */
        public List l() {
            return c();
        }

        public boolean equals(Object obj) {
            return this.f63043c.equals(obj);
        }

        public List getParameters() {
            List parameters = this.f63043c.getParameters();
            C6496s.g(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f63043c.hashCode();
        }

        public Lf.i m() {
            Lf.i m10 = this.f63043c.m();
            C6496s.g(m10, "getBuiltIns(...)");
            return m10;
        }

        public v0 n(g gVar) {
            C6496s.h(gVar, "kotlinTypeRefiner");
            return this.f63043c.n(gVar);
        }

        public C5490h o() {
            return this.f63043c.o();
        }

        public boolean p() {
            return this.f63043c.p();
        }

        public String toString() {
            return this.f63043c.toString();
        }
    }

    /* renamed from: Fg.p$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Collection f63044a;

        /* renamed from: b  reason: collision with root package name */
        private List f63045b = C6565s.e(l.f63471a.l());

        public b(Collection collection) {
            C6496s.h(collection, "allSupertypes");
            this.f63044a = collection;
        }

        public final Collection a() {
            return this.f63044a;
        }

        public final List b() {
            return this.f63045b;
        }

        public final void c(List list) {
            C6496s.h(list, "<set-?>");
            this.f63045b = list;
        }
    }

    public C5389p(n nVar) {
        C6496s.h(nVar, "storageManager");
        this.f63039b = nVar.i(new C5373h(this), C5375i.f63016a, new C5377j(this));
    }

    /* access modifiers changed from: private */
    public static final b A(C5389p pVar) {
        return new b(pVar.r());
    }

    /* access modifiers changed from: private */
    public static final b B(boolean z10) {
        return new b(C6565s.e(l.f63471a.l()));
    }

    /* access modifiers changed from: private */
    public static final C6514M C(C5389p pVar, b bVar) {
        List list;
        C6496s.h(bVar, "supertypes");
        Collection a10 = pVar.v().a(pVar, bVar.a(), new C5379k(pVar), new C5381l(pVar));
        List list2 = null;
        if (a10.isEmpty()) {
            S s10 = pVar.s();
            if (s10 != null) {
                list = C6565s.e(s10);
            } else {
                list = null;
            }
            if (list == null) {
                list = C6565s.n();
            }
            a10 = list;
        }
        if (pVar.u()) {
            pVar.v().a(pVar, a10, new C5383m(pVar), new C5385n(pVar));
        }
        if (a10 instanceof List) {
            list2 = (List) a10;
        }
        if (list2 == null) {
            list2 = C6565s.e1(a10);
        }
        bVar.c(pVar.x(list2));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final Iterable D(C5389p pVar, v0 v0Var) {
        C6496s.h(v0Var, "it");
        return pVar.q(v0Var, false);
    }

    /* access modifiers changed from: private */
    public static final C6514M E(C5389p pVar, S s10) {
        C6496s.h(s10, "it");
        pVar.z(s10);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final Iterable F(C5389p pVar, v0 v0Var) {
        C6496s.h(v0Var, "it");
        return pVar.q(v0Var, true);
    }

    /* access modifiers changed from: private */
    public static final C6514M G(C5389p pVar, S s10) {
        C6496s.h(s10, "it");
        pVar.y(s10);
        return C6514M.f71813a;
    }

    private final Collection q(v0 v0Var, boolean z10) {
        C5389p pVar;
        List K02;
        if (v0Var instanceof C5389p) {
            pVar = (C5389p) v0Var;
        } else {
            pVar = null;
        }
        if (pVar != null && (K02 = C6565s.K0(((b) pVar.f63039b.invoke()).a(), pVar.t(z10))) != null) {
            return K02;
        }
        Collection l10 = v0Var.l();
        C6496s.g(l10, "getSupertypes(...)");
        return l10;
    }

    public v0 n(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return new a(this, gVar);
    }

    /* access modifiers changed from: protected */
    public abstract Collection r();

    /* access modifiers changed from: protected */
    public abstract S s();

    /* access modifiers changed from: protected */
    public Collection t(boolean z10) {
        return C6565s.n();
    }

    /* access modifiers changed from: protected */
    public boolean u() {
        return this.f63040c;
    }

    /* access modifiers changed from: protected */
    public abstract k0 v();

    /* renamed from: w */
    public List l() {
        return ((b) this.f63039b.invoke()).b();
    }

    /* access modifiers changed from: protected */
    public List x(List list) {
        C6496s.h(list, "supertypes");
        return list;
    }

    /* access modifiers changed from: protected */
    public void y(S s10) {
        C6496s.h(s10, "type");
    }

    /* access modifiers changed from: protected */
    public void z(S s10) {
        C6496s.h(s10, "type");
    }
}
