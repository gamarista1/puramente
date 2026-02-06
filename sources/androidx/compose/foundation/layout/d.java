package androidx.compose.foundation.layout;

import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import c1.s;
import c1.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k0.c;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap f12825a = d(true);

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f12826b = d(false);

    /* renamed from: c  reason: collision with root package name */
    private static final F f12827c = new e(c.f23044a.o(), false);

    /* renamed from: d  reason: collision with root package name */
    private static final F f12828d = b.f12831a;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12830b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, int i10) {
            super(2);
            this.f12829a = iVar;
            this.f12830b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            d.a(this.f12829a, mVar, M0.a(this.f12830b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(i iVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(-211209833);
        if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            F f10 = f12828d;
            int a10 = C1494j.a(h10, 0);
            i e10 = h.e(h10, iVar);
            C1523y p10 = h10.p();
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, f10, aVar.c());
            F1.b(a12, p10, aVar.e());
            F1.b(a12, e10, aVar.d());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(iVar, i10));
        }
    }

    private static final HashMap d(boolean z10) {
        HashMap hashMap = new HashMap(9);
        c.a aVar = c.f23044a;
        e(hashMap, z10, aVar.o());
        e(hashMap, z10, aVar.m());
        e(hashMap, z10, aVar.n());
        e(hashMap, z10, aVar.h());
        e(hashMap, z10, aVar.e());
        e(hashMap, z10, aVar.f());
        e(hashMap, z10, aVar.d());
        e(hashMap, z10, aVar.b());
        e(hashMap, z10, aVar.c());
        return hashMap;
    }

    private static final void e(HashMap hashMap, boolean z10, c cVar) {
        hashMap.put(cVar, new e(cVar, z10));
    }

    private static final c f(E e10) {
        Object a10 = e10.a();
        if (a10 instanceof c) {
            return (c) a10;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean g(E e10) {
        c f10 = f(e10);
        if (f10 != null) {
            return f10.m2();
        }
        return false;
    }

    public static final F h(c cVar, boolean z10) {
        HashMap hashMap;
        if (z10) {
            hashMap = f12825a;
        } else {
            hashMap = f12826b;
        }
        F f10 = (F) hashMap.get(cVar);
        if (f10 == null) {
            return new e(cVar, z10);
        }
        return f10;
    }

    /* access modifiers changed from: private */
    public static final void i(U.a aVar, U u10, E e10, t tVar, int i10, int i11, c cVar) {
        c cVar2;
        c l22;
        c f10 = f(e10);
        if (f10 == null || (l22 = f10.l2()) == null) {
            cVar2 = cVar;
        } else {
            cVar2 = l22;
        }
        U.a.j(aVar, u10, cVar2.a(s.a(u10.X0(), u10.R0()), s.a(i10, i11), tVar), 0.0f, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: H0.F} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final H0.F j(k0.c r5, boolean r6, Y.C1500m r7, int r8) {
        /*
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)"
            r2 = 56522820(0x35e7844, float:6.5377995E-37)
            Y.C1506p.Q(r2, r8, r0, r1)
        L_0x000f:
            k0.c$a r0 = k0.c.f23044a
            k0.c r0 = r0.o()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r5, r0)
            if (r0 == 0) goto L_0x0029
            if (r6 != 0) goto L_0x0029
            r5 = -1710139705(0xffffffff9a1156c7, float:-3.0055395E-23)
            r7.T(r5)
            r7.M()
            H0.F r5 = f12827c
            goto L_0x0076
        L_0x0029:
            r0 = -1710100211(0xffffffff9a11f10d, float:-3.0180016E-23)
            r7.T(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x003e
            boolean r0 = r7.S(r5)
            if (r0 != 0) goto L_0x0042
        L_0x003e:
            r0 = r8 & 6
            if (r0 != r3) goto L_0x0044
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x0053
            boolean r3 = r7.b(r6)
            if (r3 != 0) goto L_0x0057
        L_0x0053:
            r8 = r8 & 48
            if (r8 != r4) goto L_0x0058
        L_0x0057:
            r1 = r2
        L_0x0058:
            r8 = r0 | r1
            java.lang.Object r0 = r7.A()
            if (r8 != 0) goto L_0x0068
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x0070
        L_0x0068:
            androidx.compose.foundation.layout.e r0 = new androidx.compose.foundation.layout.e
            r0.<init>(r5, r6)
            r7.r(r0)
        L_0x0070:
            r5 = r0
            androidx.compose.foundation.layout.e r5 = (androidx.compose.foundation.layout.e) r5
            r7.M()
        L_0x0076:
            boolean r6 = Y.C1506p.H()
            if (r6 == 0) goto L_0x007f
            Y.C1506p.P()
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.d.j(k0.c, boolean, Y.m, int):H0.F");
    }

    static final class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12831a = new b();

        b() {
        }

        public final G j(H h10, List list, long j10) {
            return H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, a.f12832a, 4, (Object) null);
        }

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12832a = new a();

            a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }

            public final void a(U.a aVar) {
            }
        }
    }
}
