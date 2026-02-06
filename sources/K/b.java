package K;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import c1.c;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

public final class b extends a implements B {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f3977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3978b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3979c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, int i10, int i11) {
            super(1);
            this.f3977a = u10;
            this.f3978b = i10;
            this.f3979c = i11;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f3977a, -this.f3978b, -this.f3979c, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public b(C6787a aVar) {
        super(aVar);
    }

    public G o(H h10, E e10, long j10) {
        int E02 = h10.E0(androidx.compose.foundation.text.handwriting.a.b());
        int E03 = h10.E0(androidx.compose.foundation.text.handwriting.a.a());
        int i10 = E03 * 2;
        int i11 = E02 * 2;
        U v02 = e10.v0(c.n(j10, i10, i11));
        return H.N(h10, v02.X0() - i10, v02.R0() - i11, (Map) null, new a(v02, E03, E02), 4, (Object) null);
    }

    public boolean z1() {
        return true;
    }
}
