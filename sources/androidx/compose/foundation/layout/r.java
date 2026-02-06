package androidx.compose.foundation.layout;

import Ef.m;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import c1.b;
import c1.c;
import c1.d;
import c1.h;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

final class r extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f12914n;

    /* renamed from: o  reason: collision with root package name */
    private float f12915o;

    /* renamed from: p  reason: collision with root package name */
    private float f12916p;

    /* renamed from: q  reason: collision with root package name */
    private float f12917q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12918r;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12919a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10) {
            super(1);
            this.f12919a = u10;
        }

        public final void a(U.a aVar) {
            U.a.l(aVar, this.f12919a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ r(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    private final long l2(d dVar) {
        int i10;
        int i11;
        int i12;
        int d10;
        float f10 = this.f12916p;
        h.a aVar = h.f19213b;
        int i13 = 0;
        if (!h.m(f10, aVar.c())) {
            i10 = m.d(dVar.E0(this.f12916p), 0);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (!h.m(this.f12917q, aVar.c())) {
            i11 = m.d(dVar.E0(this.f12917q), 0);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (h.m(this.f12914n, aVar.c()) || (i12 = m.d(m.h(dVar.E0(this.f12914n), i10), 0)) == Integer.MAX_VALUE) {
            i12 = 0;
        }
        if (!h.m(this.f12915o, aVar.c()) && (d10 = m.d(m.h(dVar.E0(this.f12915o), i11), 0)) != Integer.MAX_VALUE) {
            i13 = d10;
        }
        return c.a(i12, i10, i13, i11);
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        long l22 = l2(oVar);
        if (b.i(l22)) {
            return b.k(l22);
        }
        return c.h(l22, nVar.s(i10));
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        long l22 = l2(oVar);
        if (b.i(l22)) {
            return b.k(l22);
        }
        return c.h(l22, nVar.e0(i10));
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        long l22 = l2(oVar);
        if (b.j(l22)) {
            return b.l(l22);
        }
        return c.i(l22, nVar.t0(i10));
    }

    public final void m2(boolean z10) {
        this.f12918r = z10;
    }

    public final void n2(float f10) {
        this.f12917q = f10;
    }

    public G o(H h10, E e10, long j10) {
        long j11;
        int i10;
        int i11;
        int i12;
        int i13;
        long l22 = l2(h10);
        if (this.f12918r) {
            j11 = c.g(j10, l22);
        } else {
            float f10 = this.f12914n;
            h.a aVar = h.f19213b;
            if (!h.m(f10, aVar.c())) {
                i10 = b.n(l22);
            } else {
                i10 = m.h(b.n(j10), b.l(l22));
            }
            if (!h.m(this.f12916p, aVar.c())) {
                i11 = b.l(l22);
            } else {
                i11 = m.d(b.l(j10), b.n(l22));
            }
            if (!h.m(this.f12915o, aVar.c())) {
                i12 = b.m(l22);
            } else {
                i12 = m.h(b.m(j10), b.k(l22));
            }
            if (!h.m(this.f12917q, aVar.c())) {
                i13 = b.k(l22);
            } else {
                i13 = m.d(b.k(j10), b.m(l22));
            }
            j11 = c.a(i10, i11, i12, i13);
        }
        U v02 = e10.v0(j11);
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02), 4, (Object) null);
    }

    public final void o2(float f10) {
        this.f12916p = f10;
    }

    public final void p2(float f10) {
        this.f12915o = f10;
    }

    public final void q2(float f10) {
        this.f12914n = f10;
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        long l22 = l2(oVar);
        if (b.j(l22)) {
            return b.l(l22);
        }
        return c.i(l22, nVar.s0(i10));
    }

    private r(float f10, float f11, float f12, float f13, boolean z10) {
        this.f12914n = f10;
        this.f12915o = f11;
        this.f12916p = f12;
        this.f12917q = f13;
        this.f12918r = z10;
    }
}
