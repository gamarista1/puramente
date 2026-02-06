package Dg;

import Of.C5484b;
import Of.C5495m;
import Of.C5507z;
import Of.g0;
import Of.h0;
import Rf.C5529s;
import ig.i;
import kg.C6436c;
import kg.g;
import kg.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.f;

public final class O extends Rf.O implements C5341b {

    /* renamed from: E  reason: collision with root package name */
    private final i f62690E;

    /* renamed from: F  reason: collision with root package name */
    private final C6436c f62691F;

    /* renamed from: G  reason: collision with root package name */
    private final g f62692G;

    /* renamed from: H  reason: collision with root package name */
    private final h f62693H;

    /* renamed from: I  reason: collision with root package name */
    private final C5357s f62694I;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(C5495m mVar, g0 g0Var, Pf.h hVar, f fVar, C5484b.a aVar, i iVar, C6436c cVar, g gVar, h hVar2, C5357s sVar, h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, g0Var, hVar, fVar, aVar, iVar, cVar, gVar, hVar2, sVar, (i10 & 1024) != 0 ? null : h0Var);
    }

    public g F() {
        return this.f62692G;
    }

    public C6436c K() {
        return this.f62691F;
    }

    public C5357s L() {
        return this.f62694I;
    }

    /* access modifiers changed from: protected */
    public C5529s L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, Pf.h hVar, h0 h0Var) {
        f fVar2;
        C5495m mVar2 = mVar;
        C6496s.h(mVar, "newOwner");
        C6496s.h(aVar, "kind");
        C6496s.h(hVar, "annotations");
        C6496s.h(h0Var, "source");
        g0 g0Var = (g0) zVar;
        if (fVar == null) {
            f name = getName();
            C6496s.g(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        O o10 = new O(mVar, g0Var, hVar, fVar2, aVar, g0(), K(), F(), q1(), L(), h0Var);
        o10.Y0(Q0());
        return o10;
    }

    /* renamed from: p1 */
    public i g0() {
        return this.f62690E;
    }

    public h q1() {
        return this.f62693H;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(C5495m mVar, g0 g0Var, Pf.h hVar, f fVar, C5484b.a aVar, i iVar, C6436c cVar, g gVar, h hVar2, C5357s sVar, h0 h0Var) {
        super(mVar, g0Var, hVar, fVar, aVar, h0Var == null ? h0.f64497a : h0Var);
        i iVar2 = iVar;
        C6436c cVar2 = cVar;
        g gVar2 = gVar;
        h hVar3 = hVar2;
        C5495m mVar2 = mVar;
        C6496s.h(mVar, "containingDeclaration");
        Pf.h hVar4 = hVar;
        C6496s.h(hVar, "annotations");
        C6496s.h(fVar, "name");
        C6496s.h(aVar, "kind");
        C6496s.h(iVar2, "proto");
        C6496s.h(cVar2, "nameResolver");
        C6496s.h(gVar2, "typeTable");
        C6496s.h(hVar3, "versionRequirementTable");
        this.f62690E = iVar2;
        this.f62691F = cVar2;
        this.f62692G = gVar2;
        this.f62693H = hVar3;
        this.f62694I = sVar;
    }
}
