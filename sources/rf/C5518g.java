package Rf;

import Eg.i;
import Eg.n;
import Ff.l;
import Fg.C5366d0;
import Fg.J0;
import Fg.M0;
import Fg.W;
import Fg.v0;
import Gg.g;
import Of.C5486d;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.C5497o;
import Of.C5498p;
import Of.C5502u;
import Of.h0;
import Of.l0;
import Of.m0;
import Pf.h;
import Rf.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.f;
import vg.C6755e;
import yg.C6812k;

/* renamed from: Rf.g  reason: case insensitive filesystem */
public abstract class C5518g extends C5525n implements l0 {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ l[] f64839j = {O.i(new F(O.b(C5518g.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* renamed from: e  reason: collision with root package name */
    private final n f64840e;

    /* renamed from: f  reason: collision with root package name */
    private final C5502u f64841f;

    /* renamed from: g  reason: collision with root package name */
    private final i f64842g;

    /* renamed from: h  reason: collision with root package name */
    private List f64843h;

    /* renamed from: i  reason: collision with root package name */
    private final a f64844i = new a(this);

    /* renamed from: Rf.g$a */
    public static final class a implements v0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5518g f64845a;

        a(C5518g gVar) {
            this.f64845a = gVar;
        }

        /* renamed from: b */
        public l0 o() {
            return this.f64845a;
        }

        public List getParameters() {
            return this.f64845a.R0();
        }

        public Collection l() {
            Collection l10 = o().u0().N0().l();
            C6496s.g(l10, "getSupertypes(...)");
            return l10;
        }

        public Lf.i m() {
            return C6755e.m(o());
        }

        public v0 n(g gVar) {
            C6496s.h(gVar, "kotlinTypeRefiner");
            return this;
        }

        public boolean p() {
            return true;
        }

        public String toString() {
            return "[typealias " + o().getName().b() + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5518g(n nVar, C5495m mVar, h hVar, f fVar, h0 h0Var, C5502u uVar) {
        super(mVar, hVar, fVar, h0Var);
        C6496s.h(nVar, "storageManager");
        C6496s.h(mVar, "containingDeclaration");
        C6496s.h(hVar, "annotations");
        C6496s.h(fVar, "name");
        C6496s.h(h0Var, "sourceElement");
        C6496s.h(uVar, "visibilityImpl");
        this.f64840e = nVar;
        this.f64841f = uVar;
        this.f64842g = nVar.g(new C5515d(this));
    }

    /* access modifiers changed from: private */
    public static final C5366d0 N0(C5518g gVar, g gVar2) {
        C5490h f10 = gVar2.f(gVar);
        if (f10 != null) {
            return f10.p();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final Collection O0(C5518g gVar) {
        return gVar.Q0();
    }

    /* access modifiers changed from: private */
    public static final Boolean T0(C5518g gVar, M0 m02) {
        boolean z10;
        C6496s.e(m02);
        if (!W.a(m02)) {
            C5490h o10 = m02.N0().o();
            if ((o10 instanceof m0) && !C6496s.c(((m0) o10).b(), gVar)) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    public boolean A() {
        return J0.c(u0(), new C5516e(this));
    }

    /* access modifiers changed from: protected */
    public final C5366d0 M0() {
        C6812k kVar;
        C5487e u10 = u();
        if (u10 == null || (kVar = u10.Y()) == null) {
            kVar = C6812k.b.f73949b;
        }
        C5366d0 v10 = J0.v(this, kVar, new C5517f(this));
        C6496s.g(v10, "makeUnsubstitutedType(...)");
        return v10;
    }

    /* access modifiers changed from: protected */
    public final n N() {
        return this.f64840e;
    }

    /* renamed from: P0 */
    public l0 a() {
        C5498p F02 = super.a();
        C6496s.f(F02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (l0) F02;
    }

    public final Collection Q0() {
        C5487e u10 = u();
        if (u10 == null) {
            return C6565s.n();
        }
        Collection<C5486d> j10 = u10.j();
        C6496s.g(j10, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (C5486d dVar : j10) {
            T.a aVar = T.f64806I;
            n nVar = this.f64840e;
            C6496s.e(dVar);
            Q b10 = aVar.b(nVar, this, dVar);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public abstract List R0();

    public final void S0(List list) {
        C6496s.h(list, "declaredTypeParameters");
        this.f64843h = list;
    }

    public Object U(C5497o oVar, Object obj) {
        C6496s.h(oVar, "visitor");
        return oVar.i(this, obj);
    }

    public boolean Z() {
        return false;
    }

    public C5502u getVisibility() {
        return this.f64841f;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean k0() {
        return false;
    }

    public v0 l() {
        return this.f64844i;
    }

    public List q() {
        List list = this.f64843h;
        if (list != null) {
            return list;
        }
        C6496s.v("declaredTypeParametersImpl");
        return null;
    }

    public String toString() {
        return "typealias " + getName().b();
    }
}
