package Rf;

import Eg.j;
import Eg.n;
import Ff.l;
import Fg.C5366d0;
import Fg.C5374h0;
import Fg.G0;
import Fg.L;
import Fg.N0;
import Fg.S;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5495m;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.c0;
import Of.h0;
import Of.l0;
import Pf.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.f;
import rg.C6690h;
import zg.C6839f;
import zg.C6840g;

public final class T extends C5529s implements Q {

    /* renamed from: I  reason: collision with root package name */
    public static final a f64806I = new a((DefaultConstructorMarker) null);

    /* renamed from: X  reason: collision with root package name */
    static final /* synthetic */ l[] f64807X = {O.i(new F(O.b(T.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: E  reason: collision with root package name */
    private final n f64808E;

    /* renamed from: F  reason: collision with root package name */
    private final l0 f64809F;

    /* renamed from: G  reason: collision with root package name */
    private final j f64810G;

    /* renamed from: H  reason: collision with root package name */
    private C5486d f64811H;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final G0 c(l0 l0Var) {
            if (l0Var.u() == null) {
                return null;
            }
            return G0.f(l0Var.H());
        }

        public final Q b(n nVar, l0 l0Var, C5486d dVar) {
            C5486d c10;
            List list;
            l0 l0Var2 = l0Var;
            C5486d dVar2 = dVar;
            C6496s.h(nVar, "storageManager");
            C6496s.h(l0Var2, "typeAliasDescriptor");
            C6496s.h(dVar2, "constructor");
            G0 c11 = c(l0Var2);
            c0 c0Var = null;
            if (c11 == null || (c10 = dVar2.c(c11)) == null) {
                return null;
            }
            h annotations = dVar.getAnnotations();
            C5484b.a h10 = dVar.h();
            C6496s.g(h10, "getKind(...)");
            h0 i10 = l0Var.i();
            C6496s.g(i10, "getSource(...)");
            T t10 = new T(nVar, l0Var, c10, (Q) null, annotations, h10, i10, (DefaultConstructorMarker) null);
            List O02 = C5529s.O0(t10, dVar.k(), c11);
            if (O02 == null) {
                return null;
            }
            C5366d0 c12 = L.c(c10.getReturnType().Q0());
            C5366d0 p10 = l0Var.p();
            C6496s.g(p10, "getDefaultType(...)");
            C5366d0 j10 = C5374h0.j(c12, p10);
            c0 M10 = dVar.M();
            if (M10 != null) {
                c0Var = C6690h.i(t10, c11.n(M10.getType(), N0.INVARIANT), h.f64602L.b());
            }
            c0 c0Var2 = c0Var;
            C5487e u10 = l0Var.u();
            if (u10 != null) {
                List x02 = dVar.x0();
                C6496s.g(x02, "getContextReceiverParameters(...)");
                Iterable iterable = x02;
                list = new ArrayList(C6565s.y(iterable, 10));
                int i11 = 0;
                for (Object next : iterable) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C6565s.x();
                    }
                    c0 c0Var3 = (c0) next;
                    S n10 = c11.n(c0Var3.getType(), N0.INVARIANT);
                    C6840g value = c0Var3.getValue();
                    C6496s.f(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    list.add(C6690h.c(u10, n10, ((C6839f) value).a(), h.f64602L.b(), i11));
                    i11 = i12;
                }
            } else {
                list = C6565s.n();
            }
            t10.R0(c0Var2, (c0) null, list, l0Var.q(), O02, j10, E.FINAL, l0Var.getVisibility());
            return t10;
        }

        private a() {
        }
    }

    public /* synthetic */ T(n nVar, l0 l0Var, C5486d dVar, Q q10, h hVar, C5484b.a aVar, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, l0Var, dVar, q10, hVar, aVar, h0Var);
    }

    /* access modifiers changed from: private */
    public static final T r1(T t10, C5486d dVar) {
        n nVar = t10.f64808E;
        l0 p12 = t10.p1();
        h annotations = dVar.getAnnotations();
        C5484b.a h10 = dVar.h();
        C6496s.g(h10, "getKind(...)");
        h0 i10 = t10.p1().i();
        C6496s.g(i10, "getSource(...)");
        T t11 = new T(nVar, p12, dVar, t10, annotations, h10, i10);
        G0 a10 = f64806I.c(t10.p1());
        c0 c0Var = null;
        if (a10 == null) {
            return null;
        }
        c0 M10 = dVar.M();
        if (M10 != null) {
            c0Var = M10.c(a10);
        }
        c0 c0Var2 = c0Var;
        List x02 = dVar.x0();
        C6496s.g(x02, "getContextReceiverParameters(...)");
        Iterable<c0> iterable = x02;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (c0 c10 : iterable) {
            arrayList.add(c10.c(a10));
        }
        t11.R0((c0) null, c0Var2, arrayList, t10.p1().q(), t10.k(), t10.getReturnType(), E.FINAL, t10.p1().getVisibility());
        return t11;
    }

    public C5486d S() {
        return this.f64811H;
    }

    public boolean d0() {
        return S().d0();
    }

    public C5487e e0() {
        C5487e e02 = S().e0();
        C6496s.g(e02, "getConstructedClass(...)");
        return e02;
    }

    public S getReturnType() {
        S returnType = super.getReturnType();
        C6496s.e(returnType);
        return returnType;
    }

    /* renamed from: l1 */
    public Q p0(C5495m mVar, E e10, C5502u uVar, C5484b.a aVar, boolean z10) {
        C6496s.h(mVar, "newOwner");
        C6496s.h(e10, "modality");
        C6496s.h(uVar, "visibility");
        C6496s.h(aVar, "kind");
        C5507z f10 = v().v(mVar).r(e10).k(uVar).n(aVar).w(z10).f();
        C6496s.f(f10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) f10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public T L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var) {
        C6496s.h(mVar, "newOwner");
        C6496s.h(aVar, "kind");
        C6496s.h(hVar, "annotations");
        C6496s.h(h0Var, "source");
        C5484b.a aVar2 = C5484b.a.DECLARATION;
        if (aVar != aVar2) {
            C5484b.a aVar3 = C5484b.a.SYNTHESIZED;
        }
        return new T(this.f64808E, p1(), S(), this, hVar, aVar2, h0Var);
    }

    /* renamed from: n1 */
    public l0 b() {
        return p1();
    }

    /* renamed from: o1 */
    public Q a() {
        C5507z a10 = super.a();
        C6496s.f(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) a10;
    }

    public l0 p1() {
        return this.f64809F;
    }

    /* renamed from: q1 */
    public Q c(G0 g02) {
        C6496s.h(g02, "substitutor");
        C5507z c10 = super.c(g02);
        C6496s.f(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        T t10 = (T) c10;
        G0 f10 = G0.f(t10.getReturnType());
        C6496s.g(f10, "create(...)");
        C5486d c11 = S().a().c(f10);
        if (c11 == null) {
            return null;
        }
        t10.f64811H = c11;
        return t10;
    }

    private T(n nVar, l0 l0Var, C5486d dVar, Q q10, h hVar, C5484b.a aVar, h0 h0Var) {
        super(l0Var, q10, hVar, ng.h.f72312j, aVar, h0Var);
        this.f64808E = nVar;
        this.f64809F = l0Var;
        V0(p1().Z());
        this.f64810G = nVar.d(new S(this, dVar));
        this.f64811H = dVar;
    }
}
