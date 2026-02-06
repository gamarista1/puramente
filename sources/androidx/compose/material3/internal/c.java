package androidx.compose.material3.internal;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import W.C1431f;
import W.h;
import c1.b;
import c1.r;
import c1.s;
import java.util.Map;
import k0.i;
import kotlin.Pair;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;
import z.q;

final class c extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C1431f f13241n;

    /* renamed from: o  reason: collision with root package name */
    private p f13242o;

    /* renamed from: p  reason: collision with root package name */
    private q f13243p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13244q;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f13245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f13246b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U f13247c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(H h10, c cVar, U u10) {
            super(1);
            this.f13245a = h10;
            this.f13246b = cVar;
            this.f13247c = u10;
        }

        public final void a(U.a aVar) {
            float f10;
            float f11;
            if (this.f13245a.r0()) {
                f10 = this.f13246b.m2().o().e(this.f13246b.m2().x());
            } else {
                f10 = this.f13246b.m2().A();
            }
            if (this.f13246b.l2() == q.Horizontal) {
                f11 = f10;
            } else {
                f11 = 0.0f;
            }
            if (this.f13246b.l2() != q.Vertical) {
                f10 = 0.0f;
            }
            U.a.h(aVar, this.f13247c, Af.a.d(f11), Af.a.d(f10), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public c(C1431f fVar, p pVar, q qVar) {
        this.f13241n = fVar;
        this.f13242o = pVar;
        this.f13243p = qVar;
    }

    public void W1() {
        this.f13244q = false;
    }

    public final q l2() {
        return this.f13243p;
    }

    public final C1431f m2() {
        return this.f13241n;
    }

    public final void n2(p pVar) {
        this.f13242o = pVar;
    }

    public G o(H h10, E e10, long j10) {
        boolean z10;
        U v02 = e10.v0(j10);
        if (!h10.r0() || !this.f13244q) {
            Pair pair = (Pair) this.f13242o.invoke(r.b(s.a(v02.X0(), v02.R0())), b.a(j10));
            this.f13241n.I((h) pair.c(), pair.d());
        }
        if (h10.r0() || this.f13244q) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13244q = z10;
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(h10, this, v02), 4, (Object) null);
    }

    public final void o2(q qVar) {
        this.f13243p = qVar;
    }

    public final void p2(C1431f fVar) {
        this.f13241n = fVar;
    }
}
