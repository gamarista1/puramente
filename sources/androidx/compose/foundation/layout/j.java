package androidx.compose.foundation.layout;

import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import c1.c;
import c1.n;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

abstract class j extends i.c implements B {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10) {
            super(1);
            this.f12857a = u10;
        }

        public final void a(U.a aVar) {
            U.a.n(aVar, this.f12857a, n.f19226b.a(), 0.0f, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        return nVar.s(i10);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        return nVar.e0(i10);
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        return nVar.t0(i10);
    }

    public abstract long l2(H h10, E e10, long j10);

    public abstract boolean m2();

    public final G o(H h10, E e10, long j10) {
        long l22 = l2(h10, e10, j10);
        if (m2()) {
            l22 = c.g(j10, l22);
        }
        U v02 = e10.v0(l22);
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02), 4, (Object) null);
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        return nVar.s0(i10);
    }
}
