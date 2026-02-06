package Rf;

import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Of.C5497o;
import Of.N;
import Of.T;
import Of.V;
import Pf.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.c;
import yg.C6803b;
import yg.C6810i;
import yg.C6812k;

/* renamed from: Rf.x  reason: case insensitive filesystem */
public class C5534x extends C5524m implements V {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ l[] f64950h;

    /* renamed from: c  reason: collision with root package name */
    private final F f64951c;

    /* renamed from: d  reason: collision with root package name */
    private final c f64952d;

    /* renamed from: e  reason: collision with root package name */
    private final i f64953e;

    /* renamed from: f  reason: collision with root package name */
    private final i f64954f;

    /* renamed from: g  reason: collision with root package name */
    private final C6812k f64955g;

    static {
        Class<C5534x> cls = C5534x.class;
        f64950h = new l[]{O.i(new F(O.b(cls), "fragments", "getFragments()Ljava/util/List;")), O.i(new F(O.b(cls), "empty", "getEmpty()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5534x(F f10, c cVar, n nVar) {
        super(h.f64602L.b(), cVar.h());
        C6496s.h(f10, "module");
        C6496s.h(cVar, "fqName");
        C6496s.h(nVar, "storageManager");
        this.f64951c = f10;
        this.f64952d = cVar;
        this.f64953e = nVar.g(new C5531u(this));
        this.f64954f = nVar.g(new C5532v(this));
        this.f64955g = new C6810i(nVar, new C5533w(this));
    }

    /* access modifiers changed from: private */
    public static final boolean L0(C5534x xVar) {
        return T.b(xVar.B0().M0(), xVar.f());
    }

    /* access modifiers changed from: private */
    public static final List M0(C5534x xVar) {
        return T.c(xVar.B0().M0(), xVar.f());
    }

    /* access modifiers changed from: private */
    public static final C6812k Q0(C5534x xVar) {
        if (xVar.isEmpty()) {
            return C6812k.b.f73949b;
        }
        Iterable<N> j02 = xVar.j0();
        ArrayList arrayList = new ArrayList(C6565s.y(j02, 10));
        for (N o10 : j02) {
            arrayList.add(o10.o());
        }
        List L02 = C6565s.L0(arrayList, new P(xVar.B0(), xVar.f()));
        C6803b.a aVar = C6803b.f73902d;
        return aVar.a("package view scope for " + xVar.f() + " in " + xVar.B0().getName(), L02);
    }

    /* renamed from: N0 */
    public V b() {
        if (f().d()) {
            return null;
        }
        F P02 = B0();
        c e10 = f().e();
        C6496s.g(e10, "parent(...)");
        return P02.l0(e10);
    }

    /* access modifiers changed from: protected */
    public final boolean O0() {
        return ((Boolean) m.a(this.f64954f, this, f64950h[1])).booleanValue();
    }

    /* renamed from: P0 */
    public F B0() {
        return this.f64951c;
    }

    public Object U(C5497o oVar, Object obj) {
        C6496s.h(oVar, "visitor");
        return oVar.m(this, obj);
    }

    public boolean equals(Object obj) {
        V v10;
        if (obj instanceof V) {
            v10 = (V) obj;
        } else {
            v10 = null;
        }
        if (v10 != null && C6496s.c(f(), v10.f()) && C6496s.c(B0(), v10.B0())) {
            return true;
        }
        return false;
    }

    public c f() {
        return this.f64952d;
    }

    public int hashCode() {
        return (B0().hashCode() * 31) + f().hashCode();
    }

    public boolean isEmpty() {
        return O0();
    }

    public List j0() {
        return (List) m.a(this.f64953e, this, f64950h[0]);
    }

    public C6812k o() {
        return this.f64955g;
    }
}
