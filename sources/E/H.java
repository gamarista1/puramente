package E;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.J0;
import Y.M0;
import Y.Y0;
import h0.C2018b;
import h0.C2022f;
import h0.C2023g;
import h0.C2025i;
import h0.C2026j;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.O;
import yf.C6787a;
import yf.p;
import yf.q;

public abstract class H {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f1572a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f1573b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(G g10, q qVar) {
            super(2);
            this.f1572a = g10;
            this.f1573b = qVar;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
                }
                this.f1572a.i(C2022f.a(mVar, 0));
                this.f1573b.invoke(this.f1572a, mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f1574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1575b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, int i10) {
            super(2);
            this.f1574a = qVar;
            this.f1575b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            H.a(this.f1574a, mVar, M0.a(this.f1575b | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2023g f1576a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2023g gVar) {
            super(0);
            this.f1576a = gVar;
        }

        /* renamed from: a */
        public final G invoke() {
            return new G(this.f1576a, O.i());
        }
    }

    public static final void a(q qVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(674185128);
        if ((i10 & 6) == 0) {
            if (h10.C(qVar)) {
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
                C1506p.Q(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            C2023g gVar = (C2023g) h10.m(C2025i.d());
            Object[] objArr = {gVar};
            C2026j a10 = G.f1557d.a(gVar);
            boolean C10 = h10.C(gVar);
            Object A10 = h10.A();
            if (C10 || A10 == C1500m.f10026a.a()) {
                A10 = new c(gVar);
                h10.r(A10);
            }
            G g10 = (G) C2018b.e(objArr, a10, (String) null, (C6787a) A10, h10, 0, 4);
            C1521x.a(C2025i.d().d(g10), g0.c.e(1863926504, true, new a(g10, qVar), h10, 54), h10, J0.f9784i | 48);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(qVar, i10));
        }
    }
}
