package Dg;

import Of.C5484b;
import Of.C5487e;
import Of.C5494l;
import Of.C5495m;
import Of.C5507z;
import Of.h0;
import Rf.C5520i;
import ig.d;
import kg.C6436c;
import kg.g;
import kg.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;

/* renamed from: Dg.c  reason: case insensitive filesystem */
public final class C5342c extends C5520i implements C5341b {

    /* renamed from: F  reason: collision with root package name */
    private final d f62710F;

    /* renamed from: G  reason: collision with root package name */
    private final C6436c f62711G;

    /* renamed from: H  reason: collision with root package name */
    private final g f62712H;

    /* renamed from: I  reason: collision with root package name */
    private final h f62713I;

    /* renamed from: X  reason: collision with root package name */
    private final C5357s f62714X;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5342c(C5487e eVar, C5494l lVar, Pf.h hVar, boolean z10, C5484b.a aVar, d dVar, C6436c cVar, g gVar, h hVar2, C5357s sVar, h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, lVar, hVar, z10, aVar, dVar, cVar, gVar, hVar2, sVar, (i10 & 1024) != 0 ? null : h0Var);
    }

    public boolean D() {
        return false;
    }

    public g F() {
        return this.f62712H;
    }

    public C6436c K() {
        return this.f62711G;
    }

    public C5357s L() {
        return this.f62714X;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public C5342c o1(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, Pf.h hVar, h0 h0Var) {
        C6496s.h(mVar, "newOwner");
        C5484b.a aVar2 = aVar;
        C6496s.h(aVar2, "kind");
        Pf.h hVar2 = hVar;
        C6496s.h(hVar2, "annotations");
        h0 h0Var2 = h0Var;
        C6496s.h(h0Var2, "source");
        C5342c cVar = new C5342c((C5487e) mVar, (C5494l) zVar, hVar2, this.f64860E, aVar2, g0(), K(), F(), u1(), L(), h0Var2);
        cVar.Y0(Q0());
        return cVar;
    }

    /* renamed from: t1 */
    public d g0() {
        return this.f62710F;
    }

    public h u1() {
        return this.f62713I;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5342c(C5487e eVar, C5494l lVar, Pf.h hVar, boolean z10, C5484b.a aVar, d dVar, C6436c cVar, g gVar, h hVar2, C5357s sVar, h0 h0Var) {
        super(eVar, lVar, hVar, z10, aVar, h0Var == null ? h0.f64497a : h0Var);
        d dVar2 = dVar;
        C6436c cVar2 = cVar;
        g gVar2 = gVar;
        h hVar3 = hVar2;
        C5487e eVar2 = eVar;
        C6496s.h(eVar, "containingDeclaration");
        Pf.h hVar4 = hVar;
        C6496s.h(hVar, "annotations");
        C6496s.h(aVar, "kind");
        C6496s.h(dVar2, "proto");
        C6496s.h(cVar2, "nameResolver");
        C6496s.h(gVar2, "typeTable");
        C6496s.h(hVar3, "versionRequirementTable");
        this.f62710F = dVar2;
        this.f62711G = cVar2;
        this.f62712H = gVar2;
        this.f62713I = hVar3;
        this.f62714X = sVar;
    }
}
