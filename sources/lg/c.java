package Lg;

import Fg.B0;
import Fg.C5366d0;
import Fg.D0;
import Fg.F0;
import Fg.G0;
import Fg.J0;
import Fg.L;
import Fg.L0;
import Fg.M0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.v0;
import Fg.w0;
import Kg.d;
import Lf.i;
import Of.m0;
import Pf.h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;
import sg.C6718b;
import sg.C6721e;
import vg.C6755e;

public abstract class c {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f64075a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Fg.N0[] r0 = Fg.N0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fg.N0 r1 = Fg.N0.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Fg.N0 r1 = Fg.N0.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Fg.N0 r1 = Fg.N0.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f64075a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Lg.c.a.<clinit>():void");
        }
    }

    public static final class b extends w0 {
        b() {
        }

        public B0 k(v0 v0Var) {
            C6718b bVar;
            C6496s.h(v0Var, SubscriberAttributeKt.JSON_NAME_KEY);
            if (v0Var instanceof C6718b) {
                bVar = (C6718b) v0Var;
            } else {
                bVar = null;
            }
            if (bVar == null) {
                return null;
            }
            if (bVar.a().a()) {
                return new D0(N0.OUT_VARIANCE, bVar.a().getType());
            }
            return bVar.a();
        }
    }

    public static final a b(S s10) {
        Object obj;
        C6496s.h(s10, "type");
        if (L.b(s10)) {
            a b10 = b(L.c(s10));
            a b11 = b(L.d(s10));
            return new a(L0.b(V.e(L.c((S) b10.c()), L.d((S) b11.c())), s10), L0.b(V.e(L.c((S) b10.d()), L.d((S) b11.d())), s10));
        }
        v0 N02 = s10.N0();
        if (C6721e.f(s10)) {
            C6496s.f(N02, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            B0 a10 = ((C6718b) N02).a();
            S type = a10.getType();
            C6496s.g(type, "getType(...)");
            S c10 = c(type, s10);
            int i10 = a.f64075a[a10.b().ordinal()];
            if (i10 == 2) {
                return new a(c10, d.n(s10).I());
            }
            if (i10 == 3) {
                C5366d0 H10 = d.n(s10).H();
                C6496s.g(H10, "getNothingType(...)");
                return new a(c(H10, s10), c10);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + a10);
        } else if (s10.L0().isEmpty() || s10.L0().size() != N02.getParameters().size()) {
            return new a(s10, s10);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List parameters = N02.getParameters();
            C6496s.g(parameters, "getParameters(...)");
            for (Pair pair : C6565s.n1(s10.L0(), parameters)) {
                B0 b02 = (B0) pair.a();
                m0 m0Var = (m0) pair.b();
                C6496s.e(m0Var);
                d i11 = i(b02, m0Var);
                if (b02.a()) {
                    arrayList.add(i11);
                    arrayList2.add(i11);
                } else {
                    a f10 = f(i11);
                    arrayList.add((d) f10.a());
                    arrayList2.add((d) f10.b());
                }
            }
            boolean z10 = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((d) it.next()).d()) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                obj = d.n(s10).H();
                C6496s.g(obj, "getNothingType(...)");
            } else {
                obj = g(s10, arrayList);
            }
            return new a(obj, g(s10, arrayList2));
        }
    }

    private static final S c(S s10, S s11) {
        S q10 = J0.q(s10, s11.O0());
        C6496s.g(q10, "makeNullableIfNeeded(...)");
        return q10;
    }

    public static final B0 d(B0 b02, boolean z10) {
        if (b02 == null) {
            return null;
        }
        if (b02.a()) {
            return b02;
        }
        S type = b02.getType();
        C6496s.g(type, "getType(...)");
        if (!J0.c(type, b.f64074a)) {
            return b02;
        }
        N0 b10 = b02.b();
        C6496s.g(b10, "getProjectionKind(...)");
        if (b10 == N0.OUT_VARIANCE) {
            return new D0(b10, (S) b(type).d());
        }
        if (z10) {
            return new D0(b10, (S) b(type).c());
        }
        return h(b02);
    }

    /* access modifiers changed from: private */
    public static final Boolean e(M0 m02) {
        C6496s.e(m02);
        return Boolean.valueOf(C6721e.f(m02));
    }

    private static final a f(d dVar) {
        a b10 = b(dVar.a());
        a b11 = b(dVar.b());
        return new a(new d(dVar.c(), (S) b10.b(), (S) b11.a()), new d(dVar.c(), (S) b10.a(), (S) b11.b()));
    }

    private static final S g(S s10, List list) {
        s10.L0().size();
        list.size();
        Iterable<d> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (d j10 : iterable) {
            arrayList.add(j(j10));
        }
        return F0.e(s10, arrayList, (h) null, (List) null, 6, (Object) null);
    }

    private static final B0 h(B0 b02) {
        G0 g10 = G0.g(new b());
        C6496s.g(g10, "create(...)");
        return g10.t(b02);
    }

    private static final d i(B0 b02, m0 m0Var) {
        int i10 = a.f64075a[G0.c(m0Var.n(), b02).ordinal()];
        if (i10 == 1) {
            S type = b02.getType();
            C6496s.g(type, "getType(...)");
            S type2 = b02.getType();
            C6496s.g(type2, "getType(...)");
            return new d(m0Var, type, type2);
        } else if (i10 == 2) {
            S type3 = b02.getType();
            C6496s.g(type3, "getType(...)");
            C5366d0 I10 = C6755e.m(m0Var).I();
            C6496s.g(I10, "getNullableAnyType(...)");
            return new d(m0Var, type3, I10);
        } else if (i10 == 3) {
            C5366d0 H10 = C6755e.m(m0Var).H();
            C6496s.g(H10, "getNothingType(...)");
            S type4 = b02.getType();
            C6496s.g(type4, "getType(...)");
            return new d(m0Var, H10, type4);
        } else {
            throw new C6535s();
        }
    }

    private static final B0 j(d dVar) {
        N0 n02;
        dVar.d();
        if (C6496s.c(dVar.a(), dVar.b()) || dVar.c().n() == (n02 = N0.IN_VARIANCE)) {
            return new D0(dVar.a());
        }
        if (i.n0(dVar.a()) && dVar.c().n() != n02) {
            return new D0(k(dVar, N0.OUT_VARIANCE), dVar.b());
        }
        if (i.p0(dVar.b())) {
            return new D0(k(dVar, n02), dVar.a());
        }
        return new D0(k(dVar, N0.OUT_VARIANCE), dVar.b());
    }

    private static final N0 k(d dVar, N0 n02) {
        if (n02 == dVar.c().n()) {
            return N0.INVARIANT;
        }
        return n02;
    }
}
