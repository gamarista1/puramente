package Nf;

import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Lf.o;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5495m;
import Of.E;
import Of.H;
import Of.h0;
import Qf.b;
import Rf.C5522k;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;
import mf.Y;
import ng.b;
import ng.c;
import ng.d;
import ng.f;
import yf.C6798l;

public final class g implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f64279d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ l[] f64280e = {O.i(new F(O.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: f  reason: collision with root package name */
    private static final c f64281f = o.f63920A;

    /* renamed from: g  reason: collision with root package name */
    private static final f f64282g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final ng.b f64283h;

    /* renamed from: a  reason: collision with root package name */
    private final H f64284a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f64285b;

    /* renamed from: c  reason: collision with root package name */
    private final i f64286c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ng.b a() {
            return g.f64283h;
        }

        private a() {
        }
    }

    static {
        d dVar = o.a.f64001d;
        f i10 = dVar.i();
        C6496s.g(i10, "shortName(...)");
        f64282g = i10;
        b.a aVar = ng.b.f72283d;
        c l10 = dVar.l();
        C6496s.g(l10, "toSafe(...)");
        f64283h = aVar.c(l10);
    }

    public g(n nVar, H h10, C6798l lVar) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(h10, "moduleDescriptor");
        C6496s.h(lVar, "computeContainingDeclaration");
        this.f64284a = h10;
        this.f64285b = lVar;
        this.f64286c = nVar.g(new e(this, nVar));
    }

    /* access modifiers changed from: private */
    public static final Lf.c d(H h10) {
        C6496s.h(h10, "module");
        ArrayList arrayList = new ArrayList();
        for (Object next : h10.l0(f64281f).j0()) {
            if (next instanceof Lf.c) {
                arrayList.add(next);
            }
        }
        return (Lf.c) C6565s.o0(arrayList);
    }

    /* access modifiers changed from: private */
    public static final C5522k h(g gVar, n nVar) {
        C5522k kVar = new C5522k((C5495m) gVar.f64285b.invoke(gVar.f64284a), f64282g, E.ABSTRACT, C5488f.INTERFACE, C6565s.e(gVar.f64284a.m().i()), h0.f64497a, false, nVar);
        kVar.K0(new a(nVar, kVar), Y.e(), (C5486d) null);
        return kVar;
    }

    private final C5522k i() {
        return (C5522k) m.a(this.f64286c, this, f64280e[0]);
    }

    public C5487e a(ng.b bVar) {
        C6496s.h(bVar, "classId");
        if (C6496s.c(bVar, f64283h)) {
            return i();
        }
        return null;
    }

    public Collection b(c cVar) {
        C6496s.h(cVar, "packageFqName");
        if (C6496s.c(cVar, f64281f)) {
            return Y.d(i());
        }
        return Y.e();
    }

    public boolean c(c cVar, f fVar) {
        C6496s.h(cVar, "packageFqName");
        C6496s.h(fVar, "name");
        if (!C6496s.c(fVar, f64282g) || !C6496s.c(cVar, f64281f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, H h10, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h10, (i10 & 4) != 0 ? f.f64278a : lVar);
    }
}
