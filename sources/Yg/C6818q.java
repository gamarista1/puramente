package yg;

import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.Z;
import Of.g0;
import Pg.k;
import Wf.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.f;
import rg.C6690h;
import yf.C6798l;

/* renamed from: yg.q  reason: case insensitive filesystem */
public final class C6818q extends C6813l {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ l[] f73952f;

    /* renamed from: b  reason: collision with root package name */
    private final C5487e f73953b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73954c;

    /* renamed from: d  reason: collision with root package name */
    private final i f73955d;

    /* renamed from: e  reason: collision with root package name */
    private final i f73956e;

    static {
        Class<C6818q> cls = C6818q.class;
        f73952f = new l[]{O.i(new F(O.b(cls), "functions", "getFunctions()Ljava/util/List;")), O.i(new F(O.b(cls), DiagnosticsEntry.PROPERTIES_KEY, "getProperties()Ljava/util/List;"))};
    }

    public C6818q(n nVar, C5487e eVar, boolean z10) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(eVar, "containingClass");
        this.f73953b = eVar;
        this.f73954c = z10;
        eVar.h();
        C5488f fVar = C5488f.CLASS;
        this.f73955d = nVar.g(new C6816o(this));
        this.f73956e = nVar.g(new C6817p(this));
    }

    /* access modifiers changed from: private */
    public static final List j(C6818q qVar) {
        return C6565s.q(C6690h.g(qVar.f73953b), C6690h.h(qVar.f73953b));
    }

    private final List n() {
        return (List) m.a(this.f73955d, this, f73952f[0]);
    }

    private final List o() {
        return (List) m.a(this.f73956e, this, f73952f[1]);
    }

    /* access modifiers changed from: private */
    public static final List p(C6818q qVar) {
        if (qVar.f73954c) {
            return C6565s.r(C6690h.f(qVar.f73953b));
        }
        return C6565s.n();
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        k kVar = new k();
        for (Object next : o()) {
            if (C6496s.c(((Z) next).getName(), fVar)) {
                kVar.add(next);
            }
        }
        return kVar;
    }

    public /* bridge */ /* synthetic */ C5490h e(f fVar, b bVar) {
        return (C5490h) k(fVar, bVar);
    }

    public Void k(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return null;
    }

    /* renamed from: l */
    public List f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        return C6565s.K0(n(), o());
    }

    /* renamed from: m */
    public k c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        k kVar = new k();
        for (Object next : n()) {
            if (C6496s.c(((g0) next).getName(), fVar)) {
                kVar.add(next);
            }
        }
        return kVar;
    }
}
