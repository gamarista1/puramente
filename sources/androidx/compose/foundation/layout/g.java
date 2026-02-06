package androidx.compose.foundation.layout;

import C.C1096n;
import Ef.m;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import c1.b;
import c1.c;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

final class g extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C1096n f12850n;

    /* renamed from: o  reason: collision with root package name */
    private float f12851o;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12852a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10) {
            super(1);
            this.f12852a = u10;
        }

        public final void a(U.a aVar) {
            U.a.l(aVar, this.f12852a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public g(C1096n nVar, float f10) {
        this.f12850n = nVar;
        this.f12851o = f10;
    }

    public final void l2(C1096n nVar) {
        this.f12850n = nVar;
    }

    public final void m2(float f10) {
        this.f12851o = f10;
    }

    public G o(H h10, E e10, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!b.h(j10) || this.f12850n == C1096n.Vertical) {
            i11 = b.n(j10);
            i10 = b.l(j10);
        } else {
            i11 = m.l(Math.round(((float) b.l(j10)) * this.f12851o), b.n(j10), b.l(j10));
            i10 = i11;
        }
        if (!b.g(j10) || this.f12850n == C1096n.Horizontal) {
            int m10 = b.m(j10);
            i12 = b.k(j10);
            i13 = m10;
        } else {
            i13 = m.l(Math.round(((float) b.k(j10)) * this.f12851o), b.m(j10), b.k(j10));
            i12 = i13;
        }
        U v02 = e10.v0(c.a(i11, i10, i13, i12));
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02), 4, (Object) null);
    }
}
