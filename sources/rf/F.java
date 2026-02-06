package Rf;

import Eg.g;
import Eg.n;
import Lf.i;
import Of.C;
import Of.C5495m;
import Of.C5497o;
import Of.G;
import Of.H;
import Of.O;
import Of.V;
import Pf.h;
import Rf.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6559l;
import mf.C6565s;
import mf.Y;
import ng.c;
import ng.f;
import og.C6628a;
import yf.C6798l;

public final class F extends C5524m implements H {

    /* renamed from: c  reason: collision with root package name */
    private final n f64731c;

    /* renamed from: d  reason: collision with root package name */
    private final i f64732d;

    /* renamed from: e  reason: collision with root package name */
    private final f f64733e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f64734f;

    /* renamed from: g  reason: collision with root package name */
    private final I f64735g;

    /* renamed from: h  reason: collision with root package name */
    private B f64736h;

    /* renamed from: i  reason: collision with root package name */
    private O f64737i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f64738j;

    /* renamed from: k  reason: collision with root package name */
    private final g f64739k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f64740l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public F(f fVar, n nVar, i iVar, C6628a aVar) {
        this(fVar, nVar, iVar, aVar, (Map) null, (f) null, 48, (DefaultConstructorMarker) null);
        C6496s.h(fVar, "moduleName");
        C6496s.h(nVar, "storageManager");
        C6496s.h(iVar, "builtIns");
    }

    private final String L0() {
        String fVar = getName().toString();
        C6496s.g(fVar, "toString(...)");
        return fVar;
    }

    private final C5523l N0() {
        return (C5523l) this.f64740l.getValue();
    }

    private final boolean P0() {
        if (this.f64737i != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final C5523l R0(F f10) {
        B b10 = f10.f64736h;
        if (b10 != null) {
            List a10 = b10.a();
            f10.K0();
            a10.contains(f10);
            Iterable<F> iterable = a10;
            for (F P02 : iterable) {
                P02.P0();
            }
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (F f11 : iterable) {
                O o10 = f11.f64737i;
                C6496s.e(o10);
                arrayList.add(o10);
            }
            return new C5523l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
        }
        throw new AssertionError("Dependencies of module " + f10.L0() + " were not set before querying module content");
    }

    /* access modifiers changed from: private */
    public static final V S0(F f10, c cVar) {
        C6496s.h(cVar, "fqName");
        return f10.f64735g.a(f10, cVar, f10.f64731c);
    }

    public Object C0(G g10) {
        C6496s.h(g10, "capability");
        Object obj = this.f64734f.get(g10);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public boolean J(H h10) {
        C6496s.h(h10, "targetModule");
        if (C6496s.c(this, h10)) {
            return true;
        }
        B b10 = this.f64736h;
        C6496s.e(b10);
        if (!C6565s.e0(b10.c(), h10) && !z0().contains(h10) && !h10.z0().contains(this)) {
            return false;
        }
        return true;
    }

    public void K0() {
        if (!Q0()) {
            C.a(this);
        }
    }

    public final O M0() {
        K0();
        return N0();
    }

    public final void O0(O o10) {
        C6496s.h(o10, "providerForModuleContent");
        P0();
        this.f64737i = o10;
    }

    public boolean Q0() {
        return this.f64738j;
    }

    public final void T0(B b10) {
        C6496s.h(b10, "dependencies");
        this.f64736h = b10;
    }

    public Object U(C5497o oVar, Object obj) {
        return H.a.a(this, oVar, obj);
    }

    public final void U0(List list) {
        C6496s.h(list, "descriptors");
        V0(list, Y.e());
    }

    public final void V0(List list, Set set) {
        C6496s.h(list, "descriptors");
        C6496s.h(set, "friends");
        T0(new C(list, set, C6565s.n(), Y.e()));
    }

    public final void W0(F... fArr) {
        C6496s.h(fArr, "descriptors");
        U0(C6559l.n1(fArr));
    }

    public C5495m b() {
        return H.a.b(this);
    }

    public V l0(c cVar) {
        C6496s.h(cVar, "fqName");
        K0();
        return (V) this.f64739k.invoke(cVar);
    }

    public i m() {
        return this.f64732d;
    }

    public Collection s(c cVar, C6798l lVar) {
        C6496s.h(cVar, "fqName");
        C6496s.h(lVar, "nameFilter");
        K0();
        return M0().s(cVar, lVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!Q0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        O o10 = this.f64737i;
        if (o10 != null) {
            str = o10.getClass().getSimpleName();
        } else {
            str = null;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public List z0() {
        B b10 = this.f64736h;
        if (b10 != null) {
            return b10.b();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(f fVar, n nVar, i iVar, C6628a aVar, Map map, f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, iVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? mf.O.i() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F(f fVar, n nVar, i iVar, C6628a aVar, Map map, f fVar2) {
        super(h.f64602L.b(), fVar);
        C6496s.h(fVar, "moduleName");
        C6496s.h(nVar, "storageManager");
        C6496s.h(iVar, "builtIns");
        C6496s.h(map, "capabilities");
        this.f64731c = nVar;
        this.f64732d = iVar;
        this.f64733e = fVar2;
        if (fVar.j()) {
            this.f64734f = map;
            I i10 = (I) C0(I.f64751a.a());
            this.f64735g = i10 == null ? I.b.f64754b : i10;
            this.f64738j = true;
            this.f64739k = nVar.h(new D(this));
            this.f64740l = C6531o.b(new E(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }
}
