package Fg;

import Ef.m;
import Eg.f;
import Eg.g;
import Fg.w0;
import Hg.i;
import Hg.k;
import Hg.l;
import Kg.d;
import Of.C5487e;
import Of.C5490h;
import Of.m0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6531o;
import lf.C6535s;
import mf.C6565s;
import mf.O;
import mf.Y;

public final class A0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f62909f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final F f62910a;

    /* renamed from: b  reason: collision with root package name */
    private final x0 f62911b;

    /* renamed from: c  reason: collision with root package name */
    private final f f62912c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f62913d;

    /* renamed from: e  reason: collision with root package name */
    private final g f62914e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S a(S s10, G0 g02, Set set, boolean z10) {
            M0 m02;
            boolean z11;
            S type;
            boolean z12;
            S type2;
            boolean z13;
            S type3;
            G0 g03 = g02;
            Set set2 = set;
            C6496s.h(s10, "<this>");
            C6496s.h(g03, "substitutor");
            M0 Q02 = s10.Q0();
            if (Q02 instanceof I) {
                I i10 = (I) Q02;
                C5366d0 V02 = i10.V0();
                if (!V02.N0().getParameters().isEmpty() && V02.N0().o() != null) {
                    List parameters = V02.N0().getParameters();
                    C6496s.g(parameters, "getParameters(...)");
                    Iterable<m0> iterable = parameters;
                    ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                    for (m0 m0Var : iterable) {
                        B0 b02 = (B0) C6565s.r0(s10.L0(), m0Var.getIndex());
                        if (!z10 || b02 == null || (type3 = b02.getType()) == null || d.i(type3)) {
                            if (set2 == null || !set2.contains(m0Var)) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (b02 != null && !z13) {
                                E0 j10 = g02.j();
                                S type4 = b02.getType();
                                C6496s.g(type4, "getType(...)");
                                if (j10.e(type4) != null) {
                                }
                            }
                            b02 = new C5380k0(m0Var);
                        }
                        arrayList.add(b02);
                    }
                    V02 = F0.f(V02, arrayList, (r0) null, 2, (Object) null);
                }
                C5366d0 W02 = i10.W0();
                if (!W02.N0().getParameters().isEmpty() && W02.N0().o() != null) {
                    List parameters2 = W02.N0().getParameters();
                    C6496s.g(parameters2, "getParameters(...)");
                    Iterable<m0> iterable2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
                    for (m0 m0Var2 : iterable2) {
                        B0 b03 = (B0) C6565s.r0(s10.L0(), m0Var2.getIndex());
                        if (!z10 || b03 == null || (type2 = b03.getType()) == null || d.i(type2)) {
                            if (set2 == null || !set2.contains(m0Var2)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (b03 != null && !z12) {
                                E0 j11 = g02.j();
                                S type5 = b03.getType();
                                C6496s.g(type5, "getType(...)");
                                if (j11.e(type5) != null) {
                                }
                            }
                            b03 = new C5380k0(m0Var2);
                        }
                        arrayList2.add(b03);
                    }
                    W02 = F0.f(W02, arrayList2, (r0) null, 2, (Object) null);
                }
                m02 = V.e(V02, W02);
            } else if (Q02 instanceof C5366d0) {
                C5366d0 d0Var = (C5366d0) Q02;
                if (d0Var.N0().getParameters().isEmpty() || d0Var.N0().o() == null) {
                    m02 = d0Var;
                } else {
                    List parameters3 = d0Var.N0().getParameters();
                    C6496s.g(parameters3, "getParameters(...)");
                    Iterable<m0> iterable3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(C6565s.y(iterable3, 10));
                    for (m0 m0Var3 : iterable3) {
                        B0 b04 = (B0) C6565s.r0(s10.L0(), m0Var3.getIndex());
                        if (!z10 || b04 == null || (type = b04.getType()) == null || d.i(type)) {
                            if (set2 == null || !set2.contains(m0Var3)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (b04 != null && !z11) {
                                E0 j12 = g02.j();
                                S type6 = b04.getType();
                                C6496s.g(type6, "getType(...)");
                                if (j12.e(type6) != null) {
                                }
                            }
                            b04 = new C5380k0(m0Var3);
                        }
                        arrayList3.add(b04);
                    }
                    m02 = F0.f(d0Var, arrayList3, (r0) null, 2, (Object) null);
                }
            } else {
                throw new C6535s();
            }
            S n10 = g03.n(L0.b(m02, Q02), N0.OUT_VARIANCE);
            C6496s.g(n10, "safeSubstitute(...)");
            return n10;
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final m0 f62915a;

        /* renamed from: b  reason: collision with root package name */
        private final G f62916b;

        public b(m0 m0Var, G g10) {
            C6496s.h(m0Var, "typeParameter");
            C6496s.h(g10, ReactProgressBarViewManager.PROP_ATTR);
            this.f62915a = m0Var;
            this.f62916b = g10;
        }

        public final G a() {
            return this.f62916b;
        }

        public final m0 b() {
            return this.f62915a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!C6496s.c(bVar.f62915a, this.f62915a) || !C6496s.c(bVar.f62916b, this.f62916b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f62915a.hashCode();
            return hashCode + (hashCode * 31) + this.f62916b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f62915a + ", typeAttr=" + this.f62916b + ')';
        }
    }

    public A0(F f10, x0 x0Var) {
        C6496s.h(f10, "projectionComputer");
        C6496s.h(x0Var, "options");
        this.f62910a = f10;
        this.f62911b = x0Var;
        f fVar = new f("Type parameter upper bound erasure results");
        this.f62912c = fVar;
        this.f62913d = C6531o.b(new y0(this));
        g h10 = fVar.h(new z0(this));
        C6496s.g(h10, "createMemoizedFunction(...)");
        this.f62914e = h10;
    }

    /* access modifiers changed from: private */
    public static final i c(A0 a02) {
        return l.d(k.CANNOT_COMPUTE_ERASED_BOUND, a02.toString());
    }

    private final S d(G g10) {
        S D10;
        C5366d0 a10 = g10.a();
        if (a10 == null || (D10 = d.D(a10)) == null) {
            return h();
        }
        return D10;
    }

    /* access modifiers changed from: private */
    public static final S f(A0 a02, b bVar) {
        return a02.g(bVar.b(), bVar.a());
    }

    private final S g(m0 m0Var, G g10) {
        B0 b02;
        Set c10 = g10.c();
        if (c10 != null && c10.contains(m0Var.a())) {
            return d(g10);
        }
        C5366d0 p10 = m0Var.p();
        C6496s.g(p10, "getDefaultType(...)");
        Iterable<m0> l10 = d.l(p10, c10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(l10, 10)), 16));
        for (m0 m0Var2 : l10) {
            if (c10 == null || !c10.contains(m0Var2)) {
                b02 = this.f62910a.a(m0Var2, g10, this, e(m0Var2, g10.d(m0Var)));
            } else {
                b02 = J0.t(m0Var2, g10);
                C6496s.g(b02, "makeStarProjection(...)");
            }
            Pair a10 = C6502A.a(m0Var2.l(), b02);
            linkedHashMap.put(a10.c(), a10.d());
        }
        G0 g11 = G0.g(w0.a.e(w0.f63074c, linkedHashMap, false, 2, (Object) null));
        C6496s.g(g11, "create(...)");
        List upperBounds = m0Var.getUpperBounds();
        C6496s.g(upperBounds, "getUpperBounds(...)");
        Set i10 = i(g11, upperBounds, g10);
        if (i10.isEmpty()) {
            return d(g10);
        }
        if (this.f62911b.a()) {
            Iterable<S> e12 = C6565s.e1(i10);
            ArrayList arrayList = new ArrayList(C6565s.y(e12, 10));
            for (S Q02 : e12) {
                arrayList.add(Q02.Q0());
            }
            return Gg.d.a(arrayList);
        } else if (i10.size() == 1) {
            return (S) C6565s.O0(i10);
        } else {
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
    }

    private final i h() {
        return (i) this.f62913d.getValue();
    }

    private final Set i(G0 g02, List list, G g10) {
        Set b10 = Y.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s10 = (S) it.next();
            C5490h o10 = s10.N0().o();
            if (o10 instanceof C5487e) {
                b10.add(f62909f.a(s10, g02, g10.c(), this.f62911b.b()));
            } else if (o10 instanceof m0) {
                Set c10 = g10.c();
                if (c10 == null || !c10.contains(o10)) {
                    List upperBounds = ((m0) o10).getUpperBounds();
                    C6496s.g(upperBounds, "getUpperBounds(...)");
                    b10.addAll(i(g02, upperBounds, g10));
                } else {
                    b10.add(d(g10));
                }
            }
            if (!this.f62911b.a()) {
                break;
            }
        }
        return Y.a(b10);
    }

    public final S e(m0 m0Var, G g10) {
        C6496s.h(m0Var, "typeParameter");
        C6496s.h(g10, ReactProgressBarViewManager.PROP_ATTR);
        Object invoke = this.f62914e.invoke(new b(m0Var, g10));
        C6496s.g(invoke, "invoke(...)");
        return (S) invoke;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(F f10, x0 x0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? new x0(false, false) : x0Var);
    }
}
