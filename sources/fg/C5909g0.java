package fg;

import Fg.J0;
import Fg.L0;
import Fg.S;
import Gg.s;
import Jg.i;
import Jg.n;
import Jg.q;
import Of.C5487e;
import Of.t0;
import Pf.a;
import Pf.c;
import Pf.h;
import Xf.C5670c;
import Xf.C5671d;
import Xf.E;
import Xf.w;
import Zf.g;
import ag.k;
import bg.C5769j;
import bg.c0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.d;
import rg.C6691i;

/* renamed from: fg.g0  reason: case insensitive filesystem */
final class C5909g0 extends C5902d {

    /* renamed from: a  reason: collision with root package name */
    private final a f67649a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f67650b;

    /* renamed from: c  reason: collision with root package name */
    private final k f67651c;

    /* renamed from: d  reason: collision with root package name */
    private final C5670c f67652d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f67653e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5909g0(a aVar, boolean z10, k kVar, C5670c cVar, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, z10, kVar, cVar, (i10 & 16) != 0 ? false : z11);
    }

    public boolean B(i iVar) {
        C6496s.h(iVar, "<this>");
        return Lf.i.d0((S) iVar);
    }

    public boolean C() {
        return this.f67650b;
    }

    public boolean D(i iVar, i iVar2) {
        C6496s.h(iVar, "<this>");
        C6496s.h(iVar2, "other");
        return this.f67651c.a().k().b((S) iVar, (S) iVar2);
    }

    public boolean E(n nVar) {
        C6496s.h(nVar, "<this>");
        return nVar instanceof c0;
    }

    public boolean F(i iVar) {
        C6496s.h(iVar, "<this>");
        return ((S) iVar).Q0() instanceof C5914j;
    }

    /* renamed from: J */
    public boolean l(c cVar, i iVar) {
        C6496s.h(cVar, "<this>");
        if ((!(cVar instanceof g) || !((g) cVar).e()) && ((!(cVar instanceof C5769j) || u() || (!((C5769j) cVar).m() && q() != C5670c.TYPE_PARAMETER_BOUNDS)) && (iVar == null || !Lf.i.q0((S) iVar) || !m().p(cVar) || this.f67651c.a().q().d()))) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public C5671d m() {
        return this.f67651c.a().a();
    }

    /* renamed from: L */
    public S v(i iVar) {
        C6496s.h(iVar, "<this>");
        return L0.a((S) iVar);
    }

    /* renamed from: M */
    public q A() {
        return s.f63205a;
    }

    public Iterable n(i iVar) {
        C6496s.h(iVar, "<this>");
        return ((S) iVar).getAnnotations();
    }

    public Iterable p() {
        h annotations;
        a aVar = this.f67649a;
        if (aVar == null || (annotations = aVar.getAnnotations()) == null) {
            return C6565s.n();
        }
        return annotations;
    }

    public C5670c q() {
        return this.f67652d;
    }

    public E r() {
        return this.f67651c.b();
    }

    public boolean s() {
        a aVar = this.f67649a;
        if (!(aVar instanceof t0) || ((t0) aVar).v0() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public C5918l t(C5918l lVar, w wVar) {
        C5918l b10;
        if (lVar != null && (b10 = C5918l.b(lVar, C5916k.NOT_NULL, false, 2, (Object) null)) != null) {
            return b10;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    public boolean u() {
        return this.f67651c.a().q().c();
    }

    public d x(i iVar) {
        C6496s.h(iVar, "<this>");
        C5487e f10 = J0.f((S) iVar);
        if (f10 != null) {
            return C6691i.m(f10);
        }
        return null;
    }

    public boolean z() {
        return this.f67653e;
    }

    public C5909g0(a aVar, boolean z10, k kVar, C5670c cVar, boolean z11) {
        C6496s.h(kVar, "containerContext");
        C6496s.h(cVar, "containerApplicabilityType");
        this.f67649a = aVar;
        this.f67650b = z10;
        this.f67651c = kVar;
        this.f67652d = cVar;
        this.f67653e = z11;
    }
}
