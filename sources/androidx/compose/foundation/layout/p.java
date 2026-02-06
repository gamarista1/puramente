package androidx.compose.foundation.layout;

import C.N;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import c1.c;
import c1.h;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

final class p extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private N f12884n;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ H f12886b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f12887c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, H h10, p pVar) {
            super(1);
            this.f12885a = u10;
            this.f12886b = h10;
            this.f12887c = pVar;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f12885a, this.f12886b.E0(this.f12887c.l2().c(this.f12886b.getLayoutDirection())), this.f12886b.E0(this.f12887c.l2().d()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public p(N n10) {
        this.f12884n = n10;
    }

    public final N l2() {
        return this.f12884n;
    }

    public final void m2(N n10) {
        this.f12884n = n10;
    }

    public G o(H h10, E e10, long j10) {
        float f10 = (float) 0;
        if (h.i(this.f12884n.c(h10.getLayoutDirection()), h.j(f10)) < 0 || h.i(this.f12884n.d(), h.j(f10)) < 0 || h.i(this.f12884n.b(h10.getLayoutDirection()), h.j(f10)) < 0 || h.i(this.f12884n.a(), h.j(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int E02 = h10.E0(this.f12884n.c(h10.getLayoutDirection())) + h10.E0(this.f12884n.b(h10.getLayoutDirection()));
        int E03 = h10.E0(this.f12884n.d()) + h10.E0(this.f12884n.a());
        U v02 = e10.v0(c.n(j10, -E02, -E03));
        return H.N(h10, c.i(j10, v02.X0() + E02), c.h(j10, v02.R0() + E03), (Map) null, new a(v02, h10, this), 4, (Object) null);
    }
}
