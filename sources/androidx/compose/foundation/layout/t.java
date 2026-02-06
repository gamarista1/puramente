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
import c1.n;
import c1.r;
import c1.s;
import com.google.android.gms.common.api.a;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

final class t extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C1096n f12923n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12924o;

    /* renamed from: p  reason: collision with root package name */
    private p f12925p;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f12926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U f12928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12929d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ H f12930e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, int i10, U u10, int i11, H h10) {
            super(1);
            this.f12926a = tVar;
            this.f12927b = i10;
            this.f12928c = u10;
            this.f12929d = i11;
            this.f12930e = h10;
        }

        public final void a(U.a aVar) {
            U.a aVar2 = aVar;
            U.a.j(aVar2, this.f12928c, ((n) this.f12926a.l2().invoke(r.b(s.a(this.f12927b - this.f12928c.X0(), this.f12929d - this.f12928c.R0())), this.f12930e.getLayoutDirection())).p(), 0.0f, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public t(C1096n nVar, boolean z10, p pVar) {
        this.f12923n = nVar;
        this.f12924o = z10;
        this.f12925p = pVar;
    }

    public final p l2() {
        return this.f12925p;
    }

    public final void m2(p pVar) {
        this.f12925p = pVar;
    }

    public final void n2(C1096n nVar) {
        this.f12923n = nVar;
    }

    public G o(H h10, E e10, long j10) {
        int i10;
        int i11;
        C1096n nVar = this.f12923n;
        C1096n nVar2 = C1096n.Vertical;
        int i12 = 0;
        if (nVar != nVar2) {
            i10 = 0;
        } else {
            i10 = b.n(j10);
        }
        C1096n nVar3 = this.f12923n;
        C1096n nVar4 = C1096n.Horizontal;
        if (nVar3 == nVar4) {
            i12 = b.m(j10);
        }
        C1096n nVar5 = this.f12923n;
        int i13 = a.e.API_PRIORITY_OTHER;
        if (nVar5 == nVar2 || !this.f12924o) {
            i11 = b.l(j10);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (this.f12923n == nVar4 || !this.f12924o) {
            i13 = b.k(j10);
        }
        U v02 = e10.v0(c.a(i10, i11, i12, i13));
        int l10 = m.l(v02.X0(), b.n(j10), b.l(j10));
        int l11 = m.l(v02.R0(), b.m(j10), b.k(j10));
        return H.N(h10, l10, l11, (Map) null, new a(this, l10, v02, l11, h10), 4, (Object) null);
    }

    public final void o2(boolean z10) {
        this.f12924o = z10;
    }
}
