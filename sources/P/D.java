package P;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class D {

    static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4758a = new a();

        /* renamed from: P.D$a$a  reason: collision with other inner class name */
        static final class C0118a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f4759a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0118a(List list) {
                super(1);
                this.f4759a = list;
            }

            public final void a(U.a aVar) {
                List list = this.f4759a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    U.a.h(aVar, (U) list.get(i10), 0, 0, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        a() {
        }

        public final G j(H h10, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer num = 0;
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((E) list.get(i10)).v0(j10));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i11 = 0; i11 < size2; i11++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((U) arrayList.get(i11)).X0()));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((U) arrayList.get(i12)).R0()));
            }
            return H.N(h10, intValue, num.intValue(), (Map) null, new C0118a(arrayList), 4, (Object) null);
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f4761b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f4762c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f4763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, p pVar, int i10, int i11) {
            super(2);
            this.f4760a = iVar;
            this.f4761b = pVar;
            this.f4762c = i10;
            this.f4763d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            D.a(this.f4760a, this.f4761b, mVar, M0.a(this.f4762c | 1), this.f4763d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(i iVar, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C1500m h10 = mVar.h(-2105228848);
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
                C1506p.Q(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f4758a;
            int i16 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, iVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            int i17 = ((i16 << 6) & 896) | 6;
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
            F1.b(a12, aVar, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar2.d());
            pVar.invoke(h10, Integer.valueOf((i17 >> 6) & 14));
            h10.u();
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
