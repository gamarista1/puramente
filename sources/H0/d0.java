package H0;

import J0.C1241g;
import J0.G;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.r;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.p;

public abstract class d0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f2576a = new a();

    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f2577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f2578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f2579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, p pVar, int i10, int i11) {
            super(2);
            this.f2577a = iVar;
            this.f2578b = pVar;
            this.f2579c = i10;
            this.f2580d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            d0.b(this.f2577a, this.f2578b, mVar, M0.a(this.f2579c | 1), this.f2580d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f2581a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e0 e0Var) {
            super(0);
            this.f2581a = e0Var;
        }

        public final void invoke() {
            this.f2581a.d();
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f2582a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f2583b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f2584c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2585d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2586e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e0 e0Var, i iVar, p pVar, int i10, int i11) {
            super(2);
            this.f2582a = e0Var;
            this.f2583b = iVar;
            this.f2584c = pVar;
            this.f2585d = i10;
            this.f2586e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            d0.a(this.f2582a, this.f2583b, this.f2584c, mVar, M0.a(this.f2585d | 1), this.f2586e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(e0 e0Var, i iVar, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.C(e0Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.S(iVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (h10.C(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146 || !h10.i()) {
            if (i16 != 0) {
                iVar = i.f23074a;
            }
            if (C1506p.H()) {
                C1506p.Q(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int a10 = C1494j.a(h10, 0);
            r d10 = C1494j.d(h10, 0);
            i e10 = h.e(h10, iVar);
            C1523y p10 = h10.p();
            C6787a a11 = G.f3544Z.a();
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
            F1.b(a12, e0Var, e0Var.g());
            F1.b(a12, d10, e0Var.e());
            F1.b(a12, pVar, e0Var.f());
            C1241g.a aVar = C1241g.f3853J;
            F1.b(a12, p10, aVar.e());
            F1.b(a12, e10, aVar.d());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            h10.u();
            if (!h10.i()) {
                h10.T(-26580342);
                boolean C10 = h10.C(e0Var);
                Object A10 = h10.A();
                if (C10 || A10 == C1500m.f10026a.a()) {
                    A10 = new c(e0Var);
                    h10.r(A10);
                }
                P.h((C6787a) A10, h10, 0);
                h10.M();
            } else {
                h10.T(-26502501);
                h10.M();
            }
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        i iVar2 = iVar;
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(e0Var, iVar2, pVar, i10, i11));
        }
    }

    public static final void b(i iVar, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-1298353104);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.C(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18 || !h10.i()) {
            if (i15 != 0) {
                iVar = i.f23074a;
            }
            if (C1506p.H()) {
                C1506p.Q(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            Object A10 = h10.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = new e0();
                h10.r(A10);
            }
            a((e0) A10, iVar, pVar, h10, (i12 << 3) & 1008, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(iVar, pVar, i10, i11));
        }
    }
}
