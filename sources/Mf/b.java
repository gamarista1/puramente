package Mf;

import Ef.i;
import Eg.n;
import Fg.C5361b;
import Fg.D0;
import Fg.N0;
import Fg.V;
import Fg.r0;
import Fg.v0;
import Gg.g;
import Lf.o;
import Mf.f;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5501t;
import Of.C5502u;
import Of.C5506y;
import Of.E;
import Of.H;
import Of.N;
import Of.h0;
import Of.k0;
import Of.m0;
import Pf.h;
import Rf.C5512a;
import Rf.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.L;
import ng.c;
import yg.C6812k;

public final class b extends C5512a {

    /* renamed from: n  reason: collision with root package name */
    public static final a f64098n = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final ng.b f64099o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final ng.b f64100p;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final n f64101f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final N f64102g;

    /* renamed from: h  reason: collision with root package name */
    private final f f64103h;

    /* renamed from: i  reason: collision with root package name */
    private final int f64104i;

    /* renamed from: j  reason: collision with root package name */
    private final C0942b f64105j = new C0942b();

    /* renamed from: k  reason: collision with root package name */
    private final d f64106k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final List f64107l;

    /* renamed from: m  reason: collision with root package name */
    private final c f64108m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Mf.b$b  reason: collision with other inner class name */
    private final class C0942b extends C5361b {
        public C0942b() {
            super(b.this.f64101f);
        }

        /* renamed from: J */
        public b o() {
            return b.this;
        }

        public List getParameters() {
            return b.this.f64107l;
        }

        public boolean p() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection r() {
            List list;
            f U02 = b.this.U0();
            f.a aVar = f.a.f64123e;
            if (C6496s.c(U02, aVar)) {
                list = C6565s.e(b.f64099o);
            } else if (C6496s.c(U02, f.b.f64124e)) {
                list = C6565s.q(b.f64100p, new ng.b(o.f63920A, aVar.c(b.this.Q0())));
            } else {
                f.d dVar = f.d.f64126e;
                if (C6496s.c(U02, dVar)) {
                    list = C6565s.e(b.f64099o);
                } else if (C6496s.c(U02, f.c.f64125e)) {
                    list = C6565s.q(b.f64100p, new ng.b(o.f63946s, dVar.c(b.this.Q0())));
                } else {
                    Qg.a.b((String) null, 1, (Object) null);
                    throw null;
                }
            }
            H b10 = b.this.f64102g.b();
            Iterable<ng.b> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (ng.b bVar : iterable) {
                C5487e b11 = C5506y.b(b10, bVar);
                if (b11 != null) {
                    Iterable<m0> W02 = C6565s.W0(getParameters(), b11.l().getParameters().size());
                    ArrayList arrayList2 = new ArrayList(C6565s.y(W02, 10));
                    for (m0 p10 : W02) {
                        arrayList2.add(new D0(p10.p()));
                    }
                    arrayList.add(V.h(r0.f63046b.j(), b11, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            return C6565s.e1(arrayList);
        }

        public String toString() {
            return o().toString();
        }

        /* access modifiers changed from: protected */
        public k0 v() {
            return k0.a.f64500a;
        }
    }

    static {
        c cVar = o.f63920A;
        ng.f i10 = ng.f.i("Function");
        C6496s.g(i10, "identifier(...)");
        f64099o = new ng.b(cVar, i10);
        c cVar2 = o.f63951x;
        ng.f i11 = ng.f.i("KFunction");
        C6496s.g(i11, "identifier(...)");
        f64100p = new ng.b(cVar2, i11);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(n nVar, N n10, f fVar, int i10) {
        super(nVar, fVar.c(i10));
        C6496s.h(nVar, "storageManager");
        C6496s.h(n10, "containingDeclaration");
        C6496s.h(fVar, "functionTypeKind");
        this.f64101f = nVar;
        this.f64102g = n10;
        this.f64103h = fVar;
        this.f64104i = i10;
        this.f64106k = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        i iVar = new i(1, i10);
        ArrayList arrayList2 = new ArrayList(C6565s.y(iVar, 10));
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            int a10 = ((L) it).a();
            N0 n02 = N0.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(a10);
            K0(arrayList, this, n02, sb2.toString());
            arrayList2.add(C6514M.f71813a);
        }
        K0(arrayList, this, N0.OUT_VARIANCE, "R");
        this.f64107l = C6565s.e1(arrayList);
        this.f64108m = c.f64110a.a(this.f64103h);
    }

    private static final void K0(ArrayList arrayList, b bVar, N0 n02, String str) {
        arrayList.add(U.R0(bVar, h.f64602L.b(), false, n02, ng.f.i(str), arrayList.size(), bVar.f64101f));
    }

    public boolean A() {
        return false;
    }

    public /* bridge */ /* synthetic */ C5486d E() {
        return (C5486d) Y0();
    }

    public boolean I0() {
        return false;
    }

    public final int Q0() {
        return this.f64104i;
    }

    public Void R0() {
        return null;
    }

    /* renamed from: S0 */
    public List j() {
        return C6565s.n();
    }

    /* renamed from: T0 */
    public N b() {
        return this.f64102g;
    }

    public final f U0() {
        return this.f64103h;
    }

    /* renamed from: V0 */
    public List y() {
        return C6565s.n();
    }

    public Of.r0 W() {
        return null;
    }

    /* renamed from: W0 */
    public C6812k.b n0() {
        return C6812k.b.f73949b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public d m0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return this.f64106k;
    }

    public Void Y0() {
        return null;
    }

    public boolean Z() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean f0() {
        return false;
    }

    public h getAnnotations() {
        return h.f64602L.b();
    }

    public C5502u getVisibility() {
        C5502u uVar = C5501t.f64509e;
        C6496s.g(uVar, "PUBLIC");
        return uVar;
    }

    public C5488f h() {
        return C5488f.INTERFACE;
    }

    public h0 i() {
        h0 h0Var = h0.f64497a;
        C6496s.g(h0Var, "NO_SOURCE");
        return h0Var;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean k0() {
        return false;
    }

    public v0 l() {
        return this.f64105j;
    }

    public /* bridge */ /* synthetic */ C5487e o0() {
        return (C5487e) R0();
    }

    public List q() {
        return this.f64107l;
    }

    public E r() {
        return E.ABSTRACT;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        String b10 = getName().b();
        C6496s.g(b10, "asString(...)");
        return b10;
    }
}
