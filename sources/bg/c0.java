package bg;

import Fg.C5366d0;
import Fg.I0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Of.C5495m;
import Of.h0;
import Rf.C5513b;
import ag.g;
import ag.k;
import cg.C5799b;
import eg.C5833j;
import eg.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class c0 extends C5513b {

    /* renamed from: k  reason: collision with root package name */
    private final k f67202k;

    /* renamed from: l  reason: collision with root package name */
    private final y f67203l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(k kVar, y yVar, int i10, C5495m mVar) {
        super(kVar.e(), mVar, new g(kVar, yVar, false, 4, (DefaultConstructorMarker) null), yVar.getName(), N0.INVARIANT, false, i10, h0.f64497a, kVar.a().v());
        C6496s.h(kVar, "c");
        C6496s.h(yVar, "javaTypeParameter");
        C6496s.h(mVar, "containingDeclaration");
        this.f67202k = kVar;
        this.f67203l = yVar;
    }

    private final List M0() {
        Collection upperBounds = this.f67203l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C5366d0 i10 = this.f67202k.d().m().i();
            C6496s.g(i10, "getAnyType(...)");
            C5366d0 I10 = this.f67202k.d().m().I();
            C6496s.g(I10, "getNullableAnyType(...)");
            return C6565s.e(V.e(i10, I10));
        }
        Iterable<C5833j> iterable = upperBounds;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C5833j p10 : iterable) {
            arrayList.add(this.f67202k.g().p(p10, C5799b.b(I0.COMMON, false, false, this, 3, (Object) null)));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public List H0(List list) {
        C6496s.h(list, "bounds");
        return this.f67202k.a().r().r(this, list, this.f67202k);
    }

    /* access modifiers changed from: protected */
    public void K0(S s10) {
        C6496s.h(s10, "type");
    }

    /* access modifiers changed from: protected */
    public List L0() {
        return M0();
    }
}
