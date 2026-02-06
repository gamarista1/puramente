package Bg;

import Dg.C5357s;
import Dg.M;
import Eg.n;
import Of.H;
import Of.h0;
import ig.l;
import ig.m;
import ig.o;
import ig.p;
import java.util.ArrayList;
import java.util.Collection;
import kg.C6434a;
import kg.C6437d;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.b;
import ng.c;
import yg.C6812k;

/* renamed from: Bg.u  reason: case insensitive filesystem */
public abstract class C5334u extends r {

    /* renamed from: h  reason: collision with root package name */
    private final C6434a f62580h;

    /* renamed from: i  reason: collision with root package name */
    private final C5357s f62581i;

    /* renamed from: j  reason: collision with root package name */
    private final C6437d f62582j;

    /* renamed from: k  reason: collision with root package name */
    private final M f62583k;

    /* renamed from: l  reason: collision with root package name */
    private m f62584l;

    /* renamed from: m  reason: collision with root package name */
    private C6812k f62585m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5334u(c cVar, n nVar, H h10, m mVar, C6434a aVar, C5357s sVar) {
        super(cVar, nVar, h10);
        C6496s.h(cVar, "fqName");
        C6496s.h(nVar, "storageManager");
        C6496s.h(h10, "module");
        C6496s.h(mVar, "proto");
        C6496s.h(aVar, "metadataVersion");
        this.f62580h = aVar;
        this.f62581i = sVar;
        p O10 = mVar.O();
        C6496s.g(O10, "getStrings(...)");
        o N10 = mVar.N();
        C6496s.g(N10, "getQualifiedNames(...)");
        C6437d dVar = new C6437d(O10, N10);
        this.f62582j = dVar;
        this.f62583k = new M(mVar, dVar, aVar, new C5332s(this));
        this.f62584l = mVar;
    }

    /* access modifiers changed from: private */
    public static final h0 O0(C5334u uVar, b bVar) {
        C6496s.h(bVar, "it");
        C5357s sVar = uVar.f62581i;
        if (sVar != null) {
            return sVar;
        }
        h0 h0Var = h0.f64497a;
        C6496s.g(h0Var, "NO_SOURCE");
        return h0Var;
    }

    /* access modifiers changed from: private */
    public static final Collection Q0(C5334u uVar) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (Object next : uVar.H0().b()) {
            b bVar = (b) next;
            if (!bVar.j() && !C5326l.f62536c.a().contains(bVar)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (b h10 : arrayList) {
            arrayList2.add(h10.h());
        }
        return arrayList2;
    }

    public void L0(C5328n nVar) {
        C6496s.h(nVar, "components");
        m mVar = this.f62584l;
        if (mVar != null) {
            this.f62584l = null;
            l M10 = mVar.M();
            C6496s.g(M10, "getPackage(...)");
            C6437d dVar = this.f62582j;
            C6434a aVar = this.f62580h;
            C5357s sVar = this.f62581i;
            this.f62585m = new M(this, M10, dVar, aVar, sVar, nVar, "scope of " + this, new C5333t(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
    }

    /* renamed from: P0 */
    public M H0() {
        return this.f62583k;
    }

    public C6812k o() {
        C6812k kVar = this.f62585m;
        if (kVar != null) {
            return kVar;
        }
        C6496s.v("_memberScope");
        return null;
    }
}
