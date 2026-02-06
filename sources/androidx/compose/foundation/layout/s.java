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
import c1.h;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

final class s extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f12920n;

    /* renamed from: o  reason: collision with root package name */
    private float f12921o;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12922a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10) {
            super(1);
            this.f12922a = u10;
        }

        public final void a(U.a aVar) {
            U.a.l(aVar, this.f12922a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ s(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        int i11;
        int s10 = nVar.s(i10);
        if (!h.m(this.f12921o, h.f19213b.c())) {
            i11 = oVar.E0(this.f12921o);
        } else {
            i11 = 0;
        }
        return m.d(s10, i11);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        int i11;
        int e02 = nVar.e0(i10);
        if (!h.m(this.f12921o, h.f19213b.c())) {
            i11 = oVar.E0(this.f12921o);
        } else {
            i11 = 0;
        }
        return m.d(e02, i11);
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        int i11;
        int t02 = nVar.t0(i10);
        if (!h.m(this.f12920n, h.f19213b.c())) {
            i11 = oVar.E0(this.f12920n);
        } else {
            i11 = 0;
        }
        return m.d(t02, i11);
    }

    public final void l2(float f10) {
        this.f12921o = f10;
    }

    public final void m2(float f10) {
        this.f12920n = f10;
    }

    public G o(H h10, E e10, long j10) {
        int i10;
        int i11;
        float f10 = this.f12920n;
        h.a aVar = h.f19213b;
        if (h.m(f10, aVar.c()) || b.n(j10) != 0) {
            i10 = b.n(j10);
        } else {
            i10 = m.d(m.h(h10.E0(this.f12920n), b.l(j10)), 0);
        }
        int l10 = b.l(j10);
        if (h.m(this.f12921o, aVar.c()) || b.m(j10) != 0) {
            i11 = b.m(j10);
        } else {
            i11 = m.d(m.h(h10.E0(this.f12921o), b.k(j10)), 0);
        }
        U v02 = e10.v0(c.a(i10, l10, i11, b.k(j10)));
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02), 4, (Object) null);
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        int i11;
        int s02 = nVar.s0(i10);
        if (!h.m(this.f12920n, h.f19213b.c())) {
            i11 = oVar.E0(this.f12920n);
        } else {
            i11 = 0;
        }
        return m.d(s02, i11);
    }

    private s(float f10, float f11) {
        this.f12920n = f10;
        this.f12921o = f11;
    }
}
